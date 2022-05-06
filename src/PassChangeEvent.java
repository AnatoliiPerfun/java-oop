public class PassChangeEvent extends AbstractEvent {

    public PassChangeEvent(String id) {
        super(id);
    }
    @Override
    public void process() {
        System.out.println("a" + id + "b" + "c");
    }
}
