//package Source;

//public class Q1 {
//}



public class Q1 {
    private static String fn="Shimanshu";
    private static String ln="Sharma";
    private static int age=21;
    static {
        System.out.println("My First Name is "+fn);
    }
    static void getln(){
        System.out.println("My Last name is "+ln);
    }
    public static void main(String[] args) {
        Q1.getln();
        System.out.println("My age is "+age);
    }
}