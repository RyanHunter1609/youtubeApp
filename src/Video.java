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
        return "duration (minutes): " + duration +
                "\tkeyword: " + keyword + "\n" + next;
    }

    public Video enqueue (Integer duration, String keyword){
        Video head = new Video(duration, keyword) ;
        head.next = this;
        return  head;
    }

    public Integer size(){
        if (this.next == null){
            return 0;
        }
        else{
            return 1 + this.next.size();
        }
    }

    public Video dequeue(Integer duration, String keyword){

        return null;
    }
}
