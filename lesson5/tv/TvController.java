package lv.javaguru.lesson5.tv;

public class TvController {

    private Tv connectedTv;

    public void setConnectedTv(Tv connectedTv) {
        this.connectedTv = connectedTv;
    }

    public Tv getConnectedTv() {
        return connectedTv;
    }

    public void turnTvOn() {
        connectedTv.turnOn();
    }

    public void turnTvOff() {
        connectedTv.turnOff();
    }

    public void nextTvChannel() {
        connectedTv.nextChannel();
    }

    public void previousTvChannel() {
        connectedTv.previousChannel();
    }

    public void tvVolumeUp() {
        connectedTv.volumeUp();
    }

    public void tvVolumeDown() {
        connectedTv.volumeDown();
    }

    public int currentTvChannel() {
        return connectedTv.getCurrentChannel();
    }

    public int currentTvVolume() {
        return connectedTv.getVolumeLevel();
    }

    public boolean connectedTvIsOn() {
        return connectedTv.isOn();
    }

    public String connectedTvBrand() {
        return connectedTv.getManufacturer();
    }

    public void printChannel() {
        System.out.println("Current Channel = " + currentTvChannel());
    }

    public void printVolume() {
        System.out.println("Current Volume = " + currentTvVolume());
    }
}
