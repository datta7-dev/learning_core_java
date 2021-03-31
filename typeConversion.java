public class typeConversion {
    public static void main(String[] args) {
        /*
         * In type casting, a data type is converted into another data type by a
         * programmer using casting operator. Whereas in type conversion, a data type is
         * converted into another data type by a compiler.
         */

        String str = "10";
        int num = Integer.parseInt(str);// string to int
        System.out.println(num);

        String str1 = String.valueOf(num);// int to string
        System.out.println(str1 + 7);
        System.out.println(Integer.toString(num));// also used to convert int to string

        long l = Long.parseLong(str1);
        System.out.println(l);

        // Float.parseFloat(str1);//string to float;
        // Double.parseDouble(str1);//string to double;

        // char to string;
        char c = 'd';
        String str2 = Character.toString(c);
        System.out.println(str2);

        // int to long;
        int i = 100;
        long l1 = i;
        System.out.println(l1);

        // long to int
        int i1 = (int) l1;
        System.out.println(i1);

    }
}
