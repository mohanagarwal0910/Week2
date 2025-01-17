package Level2;

public class PalindromeChecker {
    String text;
    PalindromeChecker(String text){
        this.text=text;
    }
    public boolean isPalindrome(){
        StringBuilder sb=new StringBuilder();
        sb.append(text);
        if(text.equals(sb.reverse().toString()))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String text="mam";
        PalindromeChecker palindromeChecker=new PalindromeChecker(text);
        if(palindromeChecker.isPalindrome())
            System.out.println("true");
        else
            System.out.println("false");
    }
}
