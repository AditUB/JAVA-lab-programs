public class String_palindrome {
    public static void main(String[] args) {
        String str1 = "ABCBA";
        String str2 = "ABCD";
        String str3 = "";
        int i, n1 = str1.length(), n2 = str2.length();
        for (i = n1 - 1; i >= 0; i--)
            str3 = str3 + str1.charAt(i);

        System.out.println("Original String:" + str1);
        System.out.println("Reverse String:" + str3);
        if (str1.equals(str3))
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");
    }

}