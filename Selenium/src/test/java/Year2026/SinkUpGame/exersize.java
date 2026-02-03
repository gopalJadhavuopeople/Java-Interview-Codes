package Year2026.SinkUpGame;

public class exersize {

    public static void main(String[] args) {
        exersize ot = new exersize();
        ot.go();

    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;
            if (i > 4) {
                System.out.println(++value + " ");
            }
            if(value>14){
                System.out.println("i = " +i);
            }

        }
    }
}

