package Test.uitl;

public class Test_util {


    // method on util class to check if the inputted String contains Upper case, lower case and at least 8 chars
    public static boolean validPassword(String input) {
        return input.length() > 8 &&
                !(input.toUpperCase().equals(input)) &&
                !(input.toLowerCase().equals(input));
    }

}
