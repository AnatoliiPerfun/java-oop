public class Main {
    public static void main(String[] args)  {

        PassChangeEvent eventOne = new PassChangeEvent(("123456"));
        PassChangeEvent eventTwo = new PassChangeEvent(("7890"));

        Event[] events = {eventOne, eventTwo};
        for (Event e : events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }


       /* DigitsReader digitsReader = new DigitsReader ("message.txt");
        System.out.println(digitsReader.readFile());
        System.out.println(digitsReader.getPath());

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
        System.out.println(contactThree); */
    }
}
