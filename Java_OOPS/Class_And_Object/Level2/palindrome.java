package Java_OOPS.Level2;

// Palindrome.java
class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", ""); // ignore spaces
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "Madam";
        String word2 = "Hello";

        System.out.println(word1 + " is palindrome? " + isPalindrome(word1));
        System.out.println(word2 + " is palindrome? " + isPalindrome(word2));
    }
}
