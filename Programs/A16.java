public class Constant_Pool_and_Non_Constant_Pool {

    public static void main(String[] args) {
        String str1 = new String("watermelon");
        String str2 = "watermelon";
        String str3 = "water";
        String str4 = "melon";
        String str5 = "water" + "melon";
        String str6 = str3 + "melon";
        System.out.println(str1 == str2);
        System.out.println(str2 == str5);
        System.out.println(str2 == str6);
        System.out.println(str1 + str1.hashCode());
        System.out.println(str2 + str2.hashCode());
        System.out.println(str3 + str3.hashCode());
        System.out.println(str4 + str4.hashCode());
        System.out.println(str5 + str5.hashCode());
        System.out.println(str6 + str6.hashCode());
        /*
         * when you create an object of string class it makes the object in String pool
         * string pool has 2 different parts:Constant, non-constant pool
         * In Constant pool, there can be no Duplicate objects, ie ,no 2 objects can
         * have same string data
         * duplicate strings here only refer to the same object
         * In Non-constant pool there can be duplicate objects
         * when you create a string obj using 'new' keyword, it create it in
         * non-constant pool
         * when you create a string by assigning a string value
         * directly,(str2="watermelon") it is made in the constant pool
         * so str2 and str5 both are in constant pool and references to the same
         * object"watermelon"
         * str6 however is in nonconstant pool since creating a string using an object
         * reference causes it to be in non constant pool,
         * hence it has a different hash value
         * in strA==strB, it compares hash value of object not data inside it
         */

    }

}