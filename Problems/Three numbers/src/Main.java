public class Main {

    public static void main(String[] args) {

        //System.out.println(1);
        //System.out.println(2);
        //System.out.println(3);
        //System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        //System.out.println(8);

        char ch = 'e';
        ch -= 'a';
        ch++;
        ch += 'b';
        System.out.println(ch);

        String str = "a simple string";

        str = str.replace("a", "A SIMPLE").substring(2, 8);
        System.out.println(str);
    }
}