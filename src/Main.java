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

        Video queue2 = new Video(1, "MOE MOE");
        queue2 = queue2.enqueue(2, "Cookie Interview");
        queue2 = queue2.enqueue(3, "Cookie Monster");

        System.out.println("Queue 2 value(s) results: " + queue2);
        System.out.println("\nQueue 2 size: " + queue2.size());

        queue2 = queue2.dequeue();
        System.out.println("\nQueue 2 size: " + queue2.size());
        System.out.println("queue is now: " + queue2);



    }
}
