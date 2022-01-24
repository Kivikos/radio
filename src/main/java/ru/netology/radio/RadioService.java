package ru.netology.radio;


public class RadioService {
    private int currentStation;
    private int stationsQuantity = 10;
    private int currentVolume;

    public RadioService() {
    }

    public RadioService(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) return;
        if (currentStation > stationsQuantity - 1) return;
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == stationsQuantity - 1)
            this.currentStation = 0;
        else this.currentStation++;
    }

    public void prevStation() {
        if (currentStation == 0)
            this.currentStation = stationsQuantity - 1;
        else this.currentStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume){
            if (currentVolume < 0) return;
            if (currentVolume > 100) return;
            this.currentVolume = currentVolume;
        }

        public void increaseVolume () {
            if (currentVolume < 100)
                this.currentVolume++;
        }

        public void decreaseVolume () {
            if (currentVolume > 0)
                this.currentVolume--;
        }
    }