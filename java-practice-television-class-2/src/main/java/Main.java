public class Main {
    public static void main(String[] args) {
        //declare variables
        String myString = new String("Hello");
        Television myTV = new Television();

        //kitchen Television instance
        Television kitchenTV = new Television();

        kitchenTV.setChannel(15);
        kitchenTV.setChannel("Cooking Channel");

        System.out.println("Volume myTV: " + myTV.volume);
        myTV.volume = 10;
        System.out.println("Volume myTV: " + myTV.volume);

        System.out.println("Channel myTV " + myTV.);getChannel());
    }
}
