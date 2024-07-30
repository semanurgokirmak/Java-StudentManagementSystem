
package StudentManagementSystem;
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        StudentManagementSystem sms= new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrenci Listele");
            System.out.println("3. Öğrenci Güncelle");
            System.out.println("4. Öğrenci Sil");
            System.out.println("5. Çıkış yap");
            System.out.print("Seçiniz:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            boolean isExit=false;
            
            switch (choice){
                case 1:
               System.out.print("Öğrenci Adı");
               String name = scanner.nextLine();
               System.out.print("Öğrenci Mail:");
               String email = scanner.nextLine();
               sms.addStudent(name,email);
               break;
               
                case 2:
               sms.ListStudents();
               break;
               
                case 3:
                    System.out.print("Güncellenecek Öğrenci ID :");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Yeni Ad : ");
                    String newName = scanner.nextLine();
                    System.out.println("Yeni Email :");
                    String newMail = scanner.nextLine();
                    sms.updateStudent(updateId, newName, newMail);
                    break;
                    
                case 4:
                    System.out.println("Silinecek Öğrenci ID :");
                    int deleteId = scanner.nextInt();
                    sms.deleteStudent(deleteId);
                    
                    break;
                    
                case 5:
                    System.out.println("Çıkış Yapılıyor...");
                    isExit = true;
                    break;
                default:
                    System.out.println("Geçersiz Seçim Yaptınız");
                    
               
            } 
            if(isExit){
            break;
            
        }
        }
    }
    
}
