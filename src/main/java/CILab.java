public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        // Check if all characters are uppercase
        if (myString.equals(myString.toUpperCase())) {
            return true;
        }

        // Check if all characters are lowercase
        if (myString.equals(myString.toLowerCase())) {
            return true;
        }

        // Check if only the first character is uppercase
        if (Character.isUpperCase(myString.charAt(0)) && myString.substring(1).equals(myString.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }
}
