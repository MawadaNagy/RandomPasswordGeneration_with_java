
package randompasswordgenerator;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author Mawada Nagi
 */
public class RandomPasswordGenerator {

    public static void main(String[] args) {
        
        while(true){
            Scanner sc = new Scanner(System.in);
        
            String upperchar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowerchar = "abcdefghijklmnopqrstuwxyz";
            String digits = "0123456789";
            String specialchar = "~!@#$%^&*()_+{}[]|:;<>,.?/";

            System.out.println("\tPassword Generator.");
            System.out.print("Enter the length of the password: ");
            int length = sc.nextInt();

            System.out.print("Include Uppercase? (yes/no): ");
            boolean includeUppercase = sc.next().equalsIgnoreCase("yes");

            System.out.print("Include Lowercase? (yes/no): ");
            boolean includeLowercase = sc.next().equalsIgnoreCase("yes");

            System.out.print("Include Digits? (yes/no): ");
            boolean includeDigits = sc.next().equalsIgnoreCase("yes");

            System.out.print("Include Special Characters? (yes/no): ");
            boolean includespecialchar = sc.next().equalsIgnoreCase("yes");

            StringBuilder validchar = new StringBuilder();

            if(includeUppercase){
                validchar.append(upperchar);
            }
            if(includeLowercase){
                validchar.append(lowerchar);
            }
            if(includeDigits){
                validchar.append(digits);
            }
            if(includespecialchar){
                validchar.append(specialchar);
            }

            if(validchar.length() == 0){
                System.out.println("You must select at least one character type. ");
                System.exit(1);
            }

            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();

            for(int i = 0; i<length; i++){
                int randomIndex = random.nextInt(validchar.length());
                char randomChar = validchar.charAt(randomIndex);
                password.append(randomChar);
            }

            System.out.println("\n\tPassword Generated Succesfully! \nThe Generated Password is " + password.toString());
            
        }
        
        
    }
    
}
