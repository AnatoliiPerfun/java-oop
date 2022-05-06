import java.sql.Timestamp;

public class PassChangeEvent implements Event {
    private final Long createTimestamp;
    private final String id;

    public PassChangeEvent(String id) {
        this.id = id;
        this.createTimestamp = new Timestamp(System.
                currentTimeMillis()).getTime();
    }
    @Override
    public Long getTimeStamp() {
        return this.createTimestamp;
    }
    @Override
    public void process() {
        System.out.println("a" + id + "b" + "c");
    }
}
