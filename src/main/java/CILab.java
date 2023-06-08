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
    if (myString == null) {
        return false;  // or throw an exception, depending on your requirements
    }

    // Check if all letters are uppercase
    if (myString.equals(myString.toUpperCase())) {
        return true;
    }

    // Check if all letters are lowercase
    if (myString.equals(myString.toLowerCase())) {
        return true;
    }

    // Check if only the first letter is uppercase
    char firstLetter = myString.charAt(0);
    String restOfTheString = myString.substring(1);
    if (Character.isUpperCase(firstLetter) && restOfTheString.equals(restOfTheString.toLowerCase())) {
        return true;
    }

    return false;
}

}