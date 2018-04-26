public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the YouTube Application!");
        Video queue1 = new Video(5, "Black Panther");
        queue1 = queue1.enqueue(2, "Cracking the Coding Interview");
        queue1 = queue1.enqueue(10, "How To: prepare wigs");
        queue1 = queue1.enqueue(15, "What Happened to Malaysia Airlines Flight 370 ");
        queue1 = queue1.enqueue(1, "10 Best Daily Hacks ");
        queue1 = queue1.enqueue(7, "NBA Playoffs");

        System.out.println("Queue 1 value(s) results: " + queue1);
        System.out.println("\nQueue 1 size: " + queue1.size());
        System.out.println("queue is now: " + queue1);

        Video queue2 = new Video(1, "1 MOE MOE");
        queue2 = queue2.enqueue(2, " 2 Cookie Interview");
        System.out.println("\n(STEP 1) Queue 2 size: " + queue2.size());
        System.out.println(" (1) queue is now: " + queue2);

        queue2 = queue2.dequeue();
        System.out.println("\n(STEP2) Queue 2 size: " + queue2.size());
        System.out.println("(2) queue is now: " + queue2);



        queue2 = queue2.enqueue(3, "3 Cookie Monster");
        queue2 = queue2.enqueue(3, "4  Monster");


        System.out.println("Queue 2 value(s) results: " + queue2);
        System.out.println("\n(aDDED 3RD VALUE) Queue 2 size: " + queue2.size());

        queue2 = queue2.dequeue();
        System.out.println("\n (3)  Queue 2 size: " + queue2.size());
        System.out.println("(3) queue is now: " + queue2);



    }
}
