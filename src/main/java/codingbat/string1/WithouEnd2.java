package codingbat.string1;

public class WithoutEnd2 {
    public String withoutEnd2(String str) {
        if (str.length() > 1){
            return str.substring(1, str.length()-1);
        } return "";
    }
}
