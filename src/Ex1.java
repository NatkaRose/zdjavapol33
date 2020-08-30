public class Ex1 {
    public static void printMultiplayTableForN(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
        }
        System.out.println("------");
    }

    public static void main(String[] args) {
        Ex1.printMultiplayTableForN(2);
        Ex1.printMultiplayTableForN(7);
        Ex1.printMultiplayTableForN(11);
        Ex1.printMultiplayTableForN(24);
        Ex1.printMultiplayTableForN(33);

    }
}

