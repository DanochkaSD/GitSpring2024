package codingbat.string1;

public class MiddleThree {
    public String middleThree(String str) {
        int middleIndex = str.length() / 2 -1;
        return str.substring(middleIndex, middleIndex +3);
    }
}
