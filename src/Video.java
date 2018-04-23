import java.util.Queue;

public class Video {
    private Integer duration;
    private String keyword;
    private Video next;

    public Video(Integer duration, String keyword) {
        this.duration = duration;
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "duration (minutes): " + duration +
                "\tkeyword: " + keyword + "\t" + next;
    }

    public Video enqueue (Integer duration, String keyword){
        Video head = new Video(duration, keyword) ;
        head.next = this;
        return  head;
    }
}
