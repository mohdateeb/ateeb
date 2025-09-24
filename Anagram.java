 3. Anagram check for two strings
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s+", "");
        str2 = str2.toLowerCase().replaceAll("\\s+", "");
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prime Number
        System.out.print("Enter a number to check Prime: ");
        int num = sc.nextInt();
        if (isPrime(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is NOT a Prime Number");

        sc.nextLine(); // consume newline

        // Palindrome
        System.out.print("\nEnter a string to check Palindrome: ");
        String text = sc.nextLine();
        if (isPalindrome(text))
            System.out.println("\"" + text + "\" is a Palindrome");
        else
            System.out.println("\"" + text + "\" is NOT a Palindrome");

        // Anagram
        System.out.print("\nEnter first string for Anagram check: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string for Anagram check: ");
        String str2 = sc.nextLine();
        if (isAnagram(str1, str2))
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are Anagrams");
        else
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are NOT Anagrams");

        sc.close();
    }
}#
