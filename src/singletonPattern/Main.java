package singletonPattern;



public class Main {
    public static void main(String[] args) {
        //Her we are making the first instance of the Singleton Class:
        SingleTon inst1 = SingleTon.getInstance();
        System.out.println(inst1.sum(1,3));
        System.out.println(inst1.sum(1,10,2));
        //But we can't make more than one instance of it:
        SingleTon inst2 = SingleTon.getInstance(); // this line will print a error in the consol.
        System.out.println(inst2.sum(2,6)); // this line throws a NullPointerException.(it is expected)


    }
}
