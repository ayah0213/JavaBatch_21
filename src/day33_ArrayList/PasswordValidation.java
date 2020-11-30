package day33_ArrayList;

public class PasswordValidation {
    public static void main(String[] args) {


        String password = "paSsword#7";

        boolean atLeast8Chars = password.length() >= 8;
        boolean hasUpperCAse = false;
        boolean hasLowerCase = false;
        boolean hasDigits = false;
        boolean hasSpecialChar = false;



        for (int i = 0; i <=password.length()-1 ; i++) {
            char each =password.charAt(i);
            if (Character.isUpperCase(each)){
                hasUpperCAse=true;
            }else if (Character.isLowerCase(each)){
                hasLowerCase=true;
            }else if (Character.isDigit(each)){
                hasDigits=true;
            }else {
                hasSpecialChar=true;
            }
        }
        boolean isValid = atLeast8Chars && hasUpperCAse && hasLowerCase && hasDigits && hasSpecialChar;
        System.out.println(isValid);


        // solution with for each loop
        /*
          String password = "Password#7";
        String upperCaseLetter = "";
        String lowerCAseleters = "";
        String digits = "";
        String specialCharactres = "";

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) { // verify if the character is upper case?
                upperCaseLetter += each;
            } else if (Character.isLowerCase(each)) { // verify is character is lower case
                lowerCAseleters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                specialCharactres += each;
            }
        }

        System.out.println("upperCaseLetter = " + upperCaseLetter);
        System.out.println("lowerCAseleters = " + lowerCAseleters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharactres = " + specialCharactres);

        boolean isValid = password.length()>=8 && upperCaseLetter.length()>0 && lowerCAseleters.length() > 0 && digits.length() >0 && specialCharactres.length() >0;

        System.out.println(isValid);
    }
         */
    }
}