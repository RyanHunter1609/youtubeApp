import java.util.ArrayList;
import java.util.Queue;

public class Video {
    private Integer duration;
    private String keyword;
    private Video next;

    public Video(Integer duration, String keyword) {
        this.duration = duration;
        this.keyword = keyword;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Video getNext() {
        return next;
    }

    public void setNext(Video next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "\nDuration (minutes): " + duration +
                "\tKeyword: " + keyword + "\n" + next;
    }

    public Video enqueue(Integer duration, String keyword) {
        Video head = new Video(duration, keyword);
        head.next = this;
        return head;
    }

    public Integer size() {
        if (this.next == null) {
            return 1;
        } else {
            return 1 + this.next.size();
        }
    }

    // Your code is removing the last/back video so not working like a queue
    // TODO: Fix dequeue() using my provided algorithm
    public Video dequeue() {
        if (this == null) {
            return this;
        } else if (this.next == null) {
            return null;
        }
// else {
//
//
//            // loop until temp.next.next is null
//            while(this.next != null) {
//                Video temp = this;
//                temp.next.next = null;
//                temp.next = null;
//            }
        else {

            Video temp = this;
            Video val;

            while (this.next.next == null) {
                val = temp;
                temp = null;
                temp = this.next;

            }
        }
        return this;
    }

    // TODO: Fix priority(video, minutes) using provided algorithm
    // This method should put [video] at front of list if same length as [minutes]
    // otherwise put [video] at back of list
    public Video priority(Video video, int minutes) {
        // THE CORRECT ALGORITHM
        // IF the [video] is exactly [minutes] in length, then append [video] by doing
        if (video.duration == minutes) {
            Video temp = this;
            //     loop until temp.next is null
            while (temp.next == null) {
                //     once temp.next is null
                temp.next = video;
            }
            return this;
        }
        // ELSE the [video] is not exactly [minutes] in length, then prepend [video]
        else {
            // and then return temp;
            return temp;
        }
    }

    // TODO: Fix videoMatch() so it also checks the user's keywords
    public ArrayList<String> videoMatch(ArrayList<String> userKeywords, int userMinutes) {
        ArrayList<String> answer = new ArrayList<>();

        Video video = this;

        while (video != null) {
            if (video.duration <= userMinutes) {
                answer.add(video.keyword);
            }
            video = video.next;
        }

        return answer;
    }
}
