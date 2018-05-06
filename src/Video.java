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

    public Video dequeue() {
        if (this == null) {
            return this;
        }
        else {
            //(1) move to the node before the last node
            Video temp = this;
            //(2) delete that last node by setting it to null
            temp = this.next;
            //(3) return the head of the list
            return temp;
        }
    }

    //insert given video to the front of the list
    public Video priority() {
        Video head = new Video(this.duration, this.keyword);
        if (head.next == null) {
            return head;
        } else {
            Video temp = head;
            temp.next = this;
            return head;
        }
    }
}
