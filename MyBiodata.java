package printbiodata;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *This is written using FileOutputStream
 * @author Fauzan
 */
public class MyBiodata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        File path = new File("C:/Users/Fauzan/Desktop/Nur Fauzan Ikmi.txt");

        try (FileOutputStream fop = new FileOutputStream(path)) {

                // if file doesn't exists, then create it
                if (!path.exists()) {
                        path.createNewFile();
                }

                System.out.print("Name : ");
                String name = input.nextLine();
                System.out.print("Matrix No : ");
                String matrix = input.nextLine();
                System.out.print("Gender : ");
                String gender = input.nextLine();
                System.out.print("Age : ");
                String age = input.nextLine();
                System.out.print("E-mails : ");
                String email = input.nextLine();
                System.out.print("Mobile Phone : ");
                String phone = input.nextLine();
                
                // get the content in bytes
                byte[] nameInBytes = name.getBytes();
                byte[] matrixInBytes = matrix.getBytes();
                byte[] genderInBytes = gender.getBytes();
                byte[] ageInBytes = age.getBytes();
                byte[] emailInBytes = email.getBytes();
                byte[] phoneInBytes = phone.getBytes();
                
                fop.write("Name\t:".getBytes());
                fop.write(nameInBytes);
                fop.write(System.getProperty("line.separator").getBytes());
                fop.write("Matrix No\t:".getBytes());
                fop.write(matrixInBytes);
                fop.write(System.getProperty("line.separator").getBytes());
                fop.write("Gender\t:".getBytes());
                fop.write(genderInBytes);
                fop.write(System.getProperty("line.separator").getBytes());
                fop.write("Age\t:".getBytes());
                fop.write(ageInBytes);
                fop.write(System.getProperty("line.separator").getBytes());
                fop.write("Emails\t:".getBytes());
                fop.write(emailInBytes);
                fop.write(System.getProperty("line.separator").getBytes());
                fop.write("Mobile Phone\t:".getBytes());
                fop.write(phoneInBytes);
                
                fop.flush();
                fop.close();

                System.out.println("Done");

        } catch (IOException e) {
                e.printStackTrace();
        }       
    }
}
