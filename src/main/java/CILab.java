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
    String string = getString();

    if (string == null || string.isEmpty()) {
        return true; // Empty string or null is considered valid.
    }

    boolean isFirstCapital = Character.isUpperCase(string.charAt(0));
    boolean isAllCapital = true;
    boolean isAllLowerCase = true;

    for (int i = 1; i < string.length(); i++) {
        char currentChar = string.charAt(i);

        if (Character.isUpperCase(currentChar)) {
            isAllLowerCase = false;
        } else {
            isAllCapital = false;
        }
    }

    return isFirstCapital && (isAllCapital || isAllLowerCase);
}


}

