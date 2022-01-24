package ru.netology.radio;


public class RadioService {
    private int currentStation;
    private int stationsQuantity = 10;
    private int minStationsQuantity = 0;
    private int maxStationsQuantity = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public RadioService() {
    }

    public RadioService(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
        this.maxStationsQuantity = this.stationsQuantity - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStationsQuantity) return;
        if (currentStation > maxStationsQuantity) return;
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStationsQuantity)
            this.currentStation = minStationsQuantity;
        else this.currentStation++;
    }

    public void prevStation() {
        if (currentStation == minStationsQuantity)
            this.currentStation = maxStationsQuantity;
        else this.currentStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume){
            if (currentVolume < minVolume) return;
            if (currentVolume > maxVolume) return;
            this.currentVolume = currentVolume;
        }

        public int increaseVolume () {
            if (currentVolume < maxVolume)
                this.currentVolume++;
            return maxVolume;
        }

        public void decreaseVolume () {
            if (currentVolume > minVolume)
                this.currentVolume--;
        }
    }