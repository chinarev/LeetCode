package PalindromeNumber;

public class IsPalindrome {
    public boolean checkPalindrome(int x){
        int reverX = 0;
        if (x % 10 != 0 && x > 0) {
            while (x > reverX) {
                reverX = reverX * 10 + x % 10;
                x = x / 10;
            }
        }
        if (x == reverX || reverX / 10 == x) return true;

        return false;
    }


}
