public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the YouTube Application!");
        Video queue1 = new Video(5, "(1)Black Panther");
        queue1 = queue1.enqueue(2, "(2)Cracking the Coding Interview");
        queue1 = queue1.enqueue(10, "(3)How To: prepare wigs");
        queue1 = queue1.enqueue(1, "(4)10 Best Daily Hacks ");
        queue1 = queue1.enqueue(7, "(5)NBA Playoffs");
        System.out.println("\nQueue 1 size: " + queue1.size());
        System.out.println("Queue 1 value(s) results: " + queue1);

        //given video
        queue1 = queue1.enqueue(15, "(6)What Happened to Malaysia Airlines Flight 370 ").priority();
        System.out.println("\n*Enqueued*");
        System.out.println("*Priority*");
        //output queue1 with given video at front
        System.out.println("\nQueue 1 value(s) results:\n" + queue1);

        Video queue2 = new Video(1, "(1) MOE MOE");
        queue2 = queue2.enqueue(2, " (2) Cookie Interview");
        System.out.println("Queue 2 value(s) results: " + queue2);
        queue2 = queue2.dequeue();
        System.out.println("\n*Dequeued*");
        System.out.println("\nQueue 2 size: " + queue2.size());
        System.out.println("Queue 2 is now: " + queue2);
        queue2 = queue2.enqueue(3, "(3) Cooking With Pam");
        queue2 = queue2.enqueue(3, "(4) Cave Men: 101");
        queue2 = queue2.enqueue(45, "(5) DON QUIXOTE");
        queue2 = queue2.enqueue(3, "(6) Barack Obama");
        System.out.println("\n*Enqueued*");
        System.out.println("\nQueue 2 size: " + queue2.size());
        System.out.println("Queue 2 value(s) results: " + queue2);
        queue2 = queue2.dequeue();
        System.out.println("\n*Dequeued*");
        System.out.println("\nQueue 2 size: " + queue2.size());
        System.out.println("Queue 2 is now: " + queue2);

    }
}
