package lv.javaguru.lesson5.tv;

import java.util.Objects;

public class Tv {

    private String manufacturer;
    private boolean isOn = false;
    private int currentChannel;
    private int volumeLevel;

    private final int MAX_VOLUME = 10;
    private final int MIN_VOlume = 0;
    private final int MAX_CHANNEL = 20;
    private final int MIN_CHANNEL = 1;

    public Tv(String manufacturer) {
        this.manufacturer = manufacturer;
        this.currentChannel = MIN_CHANNEL;
        this.volumeLevel = MAX_VOLUME;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void turnOn() {
        if (!this.isOn()) {
            this.isOn = true;
        }
    }

    public void turnOff() {
        if (this.isOn()) {
            this.isOn = false;
        }
    }

    public void nextChannel() {
        if (isOn) {
            if (currentChannel < MAX_CHANNEL) {
                currentChannel++;
            } else {
                currentChannel = MIN_CHANNEL;
            }
        }
    }

    public void previousChannel() {
        if (isOn) {
            if (currentChannel > MIN_CHANNEL) {
                currentChannel--;
            } else {
                currentChannel = MAX_CHANNEL;
            }
        }
    }

    public void volumeUp() {
        if (isOn) {
            if (volumeLevel < MAX_VOLUME) {
                volumeLevel++;
            } else {
                System.out.println("Volume level is already on its maximum.");
            }
        }
    }

    public void volumeDown() {
        if (isOn) {
            if (volumeLevel > MIN_VOlume) {
                volumeLevel--;
            } else {
                System.out.println("Volume level is already at its minimum");
            }
        }
    }

    @Override
    public boolean equals(Object otherTV) {
        if (this == otherTV) return true;
        if (otherTV == null || getClass() != otherTV.getClass()) return false;
        Tv other = (Tv) otherTV;
        if (Objects.equals(this.getManufacturer(), other.getManufacturer())
                && Objects.equals(this.getCurrentChannel(), other.getCurrentChannel())
                && Objects.equals(this.getVolumeLevel(), other.getVolumeLevel())
                && Objects.equals(this.isOn(), other.isOn())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("TV {Manufacturer = '%s', Current Channel ='%d', Volume ='%d', Is On ='%b'}",
                this.getManufacturer(), this.getCurrentChannel(), this.getVolumeLevel(), this.isOn());

    }

}
