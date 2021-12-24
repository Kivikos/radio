package ru.netology.radio;

public class RadioService {
    private int currentVolume;
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) return;
        if (currentStation > 9) return;
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == 9 ) this.currentStation = 0;
        else this.currentStation++;
    }

    public void prevStation() {
        if (currentStation == 0) this.currentStation = 9;
        else this.currentStation--;
/*        if (currentStation <= 9) this.currentStation--;
        if (currentStation < 0) this.currentStation = 9;*/
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) return;
        if (currentVolume > 10) return;
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) this.currentVolume++;
    }

    public void decreaseVolume() {
        if(currentVolume > 0) this.currentVolume--;
    }
}
