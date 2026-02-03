package Year2026.JanStudy.InheritanceWorking.Exersize;

public class A {

    int ivar = 7;

    void m1() {
        System.out.println("A is m1, ");
    }

    void m2() {
        System.out.println("A is m2, ");
    }

    void m3() {
        System.out.println("A is m3, ");
    }
}

class B extends A {

    void m1() {
        System.out.println("B is m1, ");
    }

}

class C extends B {
    void m3() {
        System.out.println("C is m3, " + (ivar + 6));


    }


}
