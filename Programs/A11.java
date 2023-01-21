public class First_occurence_of_a_character {

    public static void main(String[] args) {
        String s = "aswiwsc";
        int i;

        // first character that occurs more than once. eg in " adfdgghha" a repeats from
        // 1st position
        for (i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i), i + 1) != -1) {
                System.out.println(s.charAt(i));
                break;
            }
        }
        if (i == s.length()) {
            System.out.println("no repetation");
        }

        // character that repeats the earliest. eg in " adfdgghha" d repeats at 4th
        // position
        for (i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != i) {
                System.out.println(s.charAt(i));
                break;
            }
        }
        if (i == s.length()) {
            System.out.println("no repetation");
        }

        // list of repeated characters
        int chars[] = new int[256];
        for (i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i), i + 1) != -1) {
                chars[s.charAt(i)]++;
            }
        }
        for (i = 'a'; i <= 'z'; i++) {
            if (chars[i] > 0)
                System.out.println((char) i);
        }
    }
}