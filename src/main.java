public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java App in ECS!");
        while (true) {
            try {
                Thread.sleep(5000);
                System.out.println("Running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
