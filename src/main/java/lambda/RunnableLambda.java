package lambda;

public class RunnableLambda {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1");
            }
        };

        new Thread(runnable).start();


        Runnable runnableLambda = () -> System.out.println("Runnable 2");

        new Thread(runnableLambda).start();

        new Thread(() -> System.out.println("Runnable 3")).start();
    }
}
