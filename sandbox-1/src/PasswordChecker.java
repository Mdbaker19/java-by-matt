public class PasswordChecker {

    public static boolean isGoodPassword(String password) {
        if(containsUpperCase(password)) {
            return password.length() > 8;
        }
        return false;
    }

    private static boolean containsUpperCase(String password) {
        return !(password.toLowerCase().equals(password));
    }

}
