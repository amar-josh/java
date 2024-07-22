import java.util.Scanner;
public class Palindrome {
    public boolean isPalindrome(String word){
        int wordLength = word.length();
        for(int i = 0; i < wordLength/2 ; i++){
            if(word.charAt(i) != word.charAt(wordLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the word%n");
        String word = sc.nextLine();
        sc.close();
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(word);
        if(result){
            System.out.println("Word is palindrome");
        }else{
            System.out.println("Word is not palindrome");
        }
    }
}

