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
        Video head = new Video(this.duration, this.keyword);
        if (head.next == null) {
            return head;
        }
        else {
            Video temp = head;
            temp.next.next = null;
            temp.next = null;
            return head;
        }
    }
}
