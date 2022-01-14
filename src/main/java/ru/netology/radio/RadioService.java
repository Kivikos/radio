package ru.netology.radio;

public class RadioService {
    private String name = "Mayfun";
    private int station;
    private short stationsNumber = 10;
    private int volume = 20;

    public RadioService() {

    }

    public RadioService(int volume) {
        if (volume > 100) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getStation() {
        return station;
    }

    public short getStationsNumber() {
        return stationsNumber;
    }

    public RadioService(short stationsNumber) {
        setStationsNumber(stationsNumber);
    }

    public RadioService(String name, int station) {
        this.name = name;
        setStation(station);
    }

    public void setStationsNumber(short stationsNumber) {
        if (stationsNumber > 10) {
            return;
        }
        if (stationsNumber < 1) {
            return;
        }
        this.stationsNumber = stationsNumber;
    }

    public void setStation(int station) {
        if (station > stationsNumber) {
            return;
        }
        if (station < 0) {
            return;
        }
        this.station = station;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public void nextStation() {
        if (station == stationsNumber) {
            setStation(0);
            return;
        }
        setStation(station++);
    }

    public void prevStation() {
        if (station == 0) {
            setStation(stationsNumber);
            return;
        }
        setStation(station--);
    }

    public void increaseVolume() {
        if (volume == 100) {
            return;
        }
        setVolume(volume++);
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;
        }
        setVolume(volume--);
    }
}