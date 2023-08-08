public class Demo1 {
    public static void main(String[] args) {
        String s = "    ";
        System.out.println(s.strip());

        String hello = "Hello";
        System.out.println(hello.startsWith("He")); // true
        System.out.println(hello.endsWith("llo"));  
        System.out.println(hello.substring(0, 2));  // 0 - 1

    }
}
