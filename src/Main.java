import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the YouTube Application!");
        Video queue1 = new Video(5, "(1)Black Panther");
        queue1 = queue1.enqueue(2, "(2)Cracking the Coding Interview");
        queue1 = queue1.enqueue(10, "(3)How To: prepare wigs");
        queue1 = queue1.enqueue(1, "(4)10 Best Daily Hacks ");
        queue1 = queue1.enqueue(7, "(5)NBA Playoffs");
        System.out.println("\nQueue 1 size: " + queue1.size());
        System.out.println("Queue 1 value(s) results: " + queue1);

        ArrayList<String> keywords = new ArrayList<>(Arrays.asList("Book", "How"));
        int minutes = 3;
        ArrayList<String> searchResult = queue1.videoMatch(keywords, minutes);
        System.out.println("\n\nWhich videos were <= " + minutes + " minutes long?\n\t" + searchResult);

        queue1.priority(new Video(minutes, "HackerRank"), minutes);
        System.out.println("HackerRank should be at the front, not the back, of the queue.");

        queue1.priority(new Video(minutes + 5, "Code Academy"), minutes);
        System.out.println("Code Academy should be at the back, not the front, of the queue.");

        queue1.priority(new Video(minutes, "Leet Code"), minutes);
        System.out.println("Leet Code should be at the front, not the back, of the queue.");


        // This method should put [video] at front of list if same length as [minutes]
        // otherwise put [video] at back of list
//        //given video
//        queue1 = queue1.enqueue(15, "(6)What Happened to Malaysia Airlines Flight 370 ").priority();
//
//        System.out.println("\n*Enqueued*");
//        System.out.println("*Priority*");
//        //output queue1 with given video at front
//        System.out.println("\nQueue 1 value(s) results:\n" + queue1);
//
//        Video queue2 = new Video(1, "(1) MOE MOE");
//        queue2 = queue2.enqueue(2, " (2) Cookie Interview");
//        System.out.println("Queue 2 value(s) results: " + queue2);
//        queue2 = queue2.dequeue();
//        System.out.println("\n*Dequeued*");
//        System.out.println("\nQueue 2 size: " + queue2.size());
//        System.out.println("Queue 2 is now: " + queue2);
//        queue2 = queue2.enqueue(3, "(3) Cooking With Pam");
//        queue2 = queue2.enqueue(3, "(4) Cave Men: 101");
//        queue2 = queue2.enqueue(45, "(5) DON QUIXOTE");
//        queue2 = queue2.enqueue(3, "(6) Barack Obama");
//        System.out.println("\n*Enqueued*");
//        System.out.println("\nQueue 2 size: " + queue2.size());
//        System.out.println("Queue 2 value(s) results: " + queue2);
//        queue2 = queue2.dequeue();
//        System.out.println("\n*Dequeued*");
//        System.out.println("\nQueue 2 size: " + queue2.size());
//        System.out.println("Queue 2 is now: " + queue2);
//
//        System.out.println("To Find Video, Type Key Words >>> ");
//        String keyword = scanner.nextLine();
//
//        System.out.println("Enter Duration (minutes) >>> ");
//        Integer minutes = scanner.nextInt();
//
//        Video matchingVideo = videoMatch(keyword, minutes, queue1, queue2);
//        System.out.println("Found... \n" + matchingVideo);
////        System.out.println("Perform a function (Type yes or no) > ");
////        String choice1 = scanner.next();
////        if (choice1.equalsIgnoreCase("yes")){
////            System.out.println("Enter Video (ex. Time(min), Title)");
////            Video choice2 = scanner.next();
////            if ()
////
////
////        } else{}
////        System.out.println("Type the corresponding letters {Enqueue(EQ), Dequeue(DQ), Priority(P)} >");
////        Video userPick  = userVideoSelection();
//    }
//
//    private static Video videoMatch(String keyword, Integer minutes, Video queue1, Video queue2) {
//        //does the keyword match any videos.
//        //does min match any videos
//
////        if (queue1.getKeyword().equalsIgnoreCase(keyword) || queue1.getDuration() <= minutes) {
////            return queue1.priority();
////
////        }
//        if (queue2.getKeyword().equalsIgnoreCase(keyword) || queue2.getDuration() <= minutes) {
//            return queue2.priority();
//        } else {
//            System.out.println("Video not Found");
//            return null;
//        }
//
//
    }
}
