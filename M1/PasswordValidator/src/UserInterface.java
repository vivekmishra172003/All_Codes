import java.util.Scanner;

class Password {
    private String password;
    
    public Password(String password) {
        this.password = password;
    }
    
    public boolean isValidLength() {
        return password.length() >= 6 && password.length() <= 12;
    }
    
    public boolean hasValidSpecialChars() {
        int specialCount = 0;
        for (char c : password.toCharArray()) {
            if (c == '@' || c == '$' || c == '*' || c == '#') {
                specialCount++;
            }
        }
        return specialCount >= 1;
    }
    
    public boolean hasUpperCase() {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean hasLowerCase() {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isValid() {
        return isValidLength() && hasValidSpecialChars() && 
               hasUpperCase() && hasLowerCase();
    }
    
    public void analyzePassword() {
        if (!isValid()) {
            System.out.println(password + " is an invalid password");
            return;
        }
        
        int lowerCount = 0, upperCount = 0, specialCount = 0, digitCount = 0;
        
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) lowerCount++;
            else if (Character.isUpperCase(c)) upperCount++;
            else if (Character.isDigit(c)) digitCount++;
            else if (c == '@' || c == '$' || c == '*' || c == '#') specialCount++;
        }
        
        System.out.printf("The generated password %s is valid and has %d lowercase alphabet %d uppercase alphabet " +
                         "%d special character %d digit\n", 
                         password, lowerCount, upperCount, specialCount, digitCount);
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generate your password");
        String passwordInput = sc.nextLine();
        
        Password password = new Password(passwordInput);
        password.analyzePassword();
        
        sc.close();
    }
}