package lv.javaguru.lesson5.tv;

public class TvDemo {

    public static void main(String[] args) {
        Tv television1 = new Tv("JVC");
        Tv television2 = new Tv("Sony");
        Tv television3 = new Tv("Samsung");
        Tv television4 = new Tv("Samsung");

        System.out.println(television1);

        System.out.println(television3.equals(television4));

        television3.turnOn();
        System.out.println(television3.equals(television4));

        television4.turnOn();
        System.out.println(television3.equals(television4));

        System.out.println(television2.getCurrentChannel());
        television2.nextChannel();
        System.out.println(television2.getCurrentChannel());
        television2.turnOn();

        for (int i = 0; i < 22 ; i++) {
            television2.nextChannel();
            System.out.println(television2.getCurrentChannel());
        }

        for (int i = 0; i < 16 ; i++) {
            television2.previousChannel();
            System.out.println(television2.getCurrentChannel());
        }

        television2.volumeUp();

        for (int i = 0; i< 4; i++) {
            television2.volumeDown();
        }

        System.out.println(television2.getVolumeLevel());

        for (int i = 0; i< 7; i++) {
            television2.volumeDown();
        }

        for (int i = 0; i< 5; i++) {
            television2.volumeUp();
        }

        System.out.println(television2);




    }
}
