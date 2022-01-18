package ru.netology.radio;

public class RadioService {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private short stationsNumber;
    private int currentVolume = 20;
    private int minVolume = 0;
    private int maxVolume = 100;

    public RadioService() {
    }

    public RadioService(short stationsNumber) {
        setStationsNumber(stationsNumber);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public short getStationsNumber() {
        return stationsNumber;
    }

    public void setStationsNumber(short stationsNumber) {
        if (stationsNumber > maxStation) {
            return;
        }
        if (stationsNumber < minStation) {
            return;
        }
        this.stationsNumber = stationsNumber;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationsNumber) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) return;
        if (currentVolume > maxVolume) return;
        this.currentVolume = currentVolume;
    }


    public void nextStation() {
        if (currentStation == stationsNumber) {
            setCurrentStation(0);
            return;
        }
        setCurrentStation(++currentStation);
    }

    public void prevStation() {
        if (currentStation == minStation) {
            setCurrentStation(stationsNumber);
            return;
        }
        setCurrentStation(--currentStation);
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        setCurrentVolume(++currentVolume);
    }

    public void decreaseVolume() {
        if (currentVolume == minStation) {
            return;
        }
        setCurrentVolume(--currentVolume);
    }
}