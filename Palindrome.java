2. String Palindrome check
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", ""); // ignore case & spaces
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }