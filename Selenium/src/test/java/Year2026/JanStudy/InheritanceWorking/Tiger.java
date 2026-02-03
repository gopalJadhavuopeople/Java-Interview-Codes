package Year2026.JanStudy.InheritanceWorking;

public class Tiger extends Animal{


    public void eat() {
        System.out.println("Tiger is eating");

    }


    public static void walk() {
        System.out.println("Tiger is walking");
    }

    public void noise(){
        System.out.println("Tiger is roaring");
    }

    public static void main(String[] args) {
        Animal tg = new Tiger();
        tg.eat();
        tg.name = "boom";
        System.out.println(tg.name);
        tg.noise();

    }
}
