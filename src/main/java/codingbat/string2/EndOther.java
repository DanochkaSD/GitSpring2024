package codingbat.string2;

public class EndOther {
    public boolean endOther(String a, String b) {
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();
        if(str1.endsWith(str2) || str2.endsWith(str1)){
            return true;
        } return false;
    }
}
