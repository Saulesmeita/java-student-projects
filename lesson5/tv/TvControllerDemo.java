package lv.javaguru.lesson5.tv;

public class TvControllerDemo {

    public static void main(String[] args) {

        Tv television1 = new Tv("JVC");
        Tv television2 = new Tv("Sony");
        Tv television3 = new Tv("Samsung");

        TvController myController = new TvController();
        myController.setConnectedTv(television1);

        myController.turnTvOn();
        System.out.println(myController.getConnectedTv());

        for (int i = 0; i < 30; i++) {
            myController.nextTvChannel();
            myController.printChannel();
        }

        for (int i = 0; i < 5; i++) {
            myController.previousTvChannel();
            myController.printChannel();
        }

        for (int i = 0; i < 11; i++) {
            myController.tvVolumeDown();
            myController.printVolume();
        }

        for(int i = 0; i < 4; i++) {
            myController.tvVolumeUp();
            myController.printVolume();
        }

        System.out.println(myController.getConnectedTv());

        myController.setConnectedTv(television2);
        System.out.println(myController.getConnectedTv());

        myController.nextTvChannel();
        myController.tvVolumeDown();

        System.out.println(myController.getConnectedTv());


        myController.turnTvOn();
        myController.nextTvChannel();
        myController.tvVolumeDown();

        System.out.println(myController.getConnectedTv());

        myController.setConnectedTv(television3);

        myController.turnTvOn();
        myController.nextTvChannel();
        myController.tvVolumeDown();

        System.out.println(myController.getConnectedTv());
    }
}
