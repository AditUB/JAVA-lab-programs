public class String_operations {
    public static void main(String[] args) {
        String str = "Java Developer";
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("per"));
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.indexOf(' ', 2));
        System.out.println(str.substring(5));
        System.out.println(str.substring(1, 5));
    }

}