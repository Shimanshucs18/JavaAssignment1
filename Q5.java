package Source;

//public class Q5 {
//}

//Q5 Create a class named Employee with fields firstname,lastname,age and designation.
//        The class should:
//
//        have all types of constructors to initialize the object
//        class should also have setter methods to update a particular field
//        Override its toString method to display a meaningful message using all these fields.


public class Q5 {
    String Fn;
    String Ln;
    int age;
    String designation;

    Q5() {

    }

    Q5(String fn, String ln, int age, String desi) {
        super();
        this.Fn = fn;
        this.Ln = ln;
        this.age = age;
        this.designation = desi;

    }

    void setFn(String fn) {
        this.Fn = fn;
    }

    void setLn(String ln) {
        this.Ln = ln;
    }

    void setage(int age) {
        this.age = age;
    }

    void setDesignation(String desi) {
        this.designation = desi;
    }

    String getFname() {
        return Fn;
    }

    String getLn() {
        return Ln;
    }

    int getage() {
        return age;
    }

    String geetDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return this.Fn + " " + this.Ln + " " + this.age + " " + this.designation;

    }

    public static void main(String[] args) {
        Q5 q5 = new Q5();
        q5.setFn("Shimanshu");
        q5.setLn("Sharma");
        q5.setage(22);
        q5.setDesignation("Software Engineer");
        System.out.println(q5.toString());
        q5.setFn("Jeff");
        q5.setLn("Bezos");
        q5.setage(23);
        q5.setDesignation("Software Engineer");
        System.out.println(q5.toString());


    }
}