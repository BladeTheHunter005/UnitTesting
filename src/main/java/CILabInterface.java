public interface CILabInterface {

    @Override
    public String getString() {
        return myString;
    }

    @Overide
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCaptialUse() {
        if (myString == null) {
            return false;
        }
        int capitalCount = 0;
        for (char c : myString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }
        if (capitalcount == 0 || captialCount == myString.length() ||
                (capitalCount == 1 && Character.isUpperCase(myString.charAt(0))) {
            return true;
        }else{
            return false;
        }
    }
}

git