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

    public void setCurrentStation (int currentStation) {
        if (currentStation < 0) return;
        if (currentStation > 9) return;
        this.currentStation = currentStation;
    }

    public void setToNextStation () {
        if (currentStation >= -1) this.currentStation++;
        if (currentStation > 9) this.currentStation = 0;
    }

    public void setToPrevStation () {
        if (currentStation <= 9) this.currentStation--;
        if (currentStation < 0) this.currentStation = 0;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 & currentVolume <= 10) this.currentVolume = currentVolume;
        else return;
    }
}
