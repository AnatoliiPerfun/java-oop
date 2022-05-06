public class Main {
    public static void main(String[] args) {
        ModArrayList<Integer> mList = new ModArrayList<>();
        mList.add(0);
        mList.add(10);
        mList.add(20);
        mList.add(30);

        System.out.println(mList.getUsingMod(1));
        System.out.println(mList.getUsingMod(-2));
        System.out.println(mList.getUsingMod(40));

        Contact contactOne = new Contact("Sam", new PhoneNumber("32459230958"));
        Contact contactTwo = new Contact("Dean", "deanw@supernatural.com");
        Contact contactThree = new Contact("Sarah", new PhoneNumber(380, "32459230958"));

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
    }
}
