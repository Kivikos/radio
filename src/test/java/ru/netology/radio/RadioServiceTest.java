package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    RadioService service = new RadioService();

    @Test
    void shouldUseConstructor() {
        RadioService service = new RadioService((short) 5);
        assertEquals(5, service.getStationsNumber());
    }

    @Test
    void shouldSetStationNumberNormally() {
        RadioService service = new RadioService((short) 3);
        assertEquals(3, service.getStationsNumber());
    }

    @Test
    void shouldSetStationNumberNotNormally1() {
        RadioService service = new RadioService((short) 11);
        assertEquals(0, service.getStationsNumber());
    }

    @Test
    void shouldSetStationNumberNotNormally2() {
        RadioService service = new RadioService((short) -5);
        assertEquals(0, service.getStationsNumber());
    }

    @Test
    void shouldSetStationWithNumberInLimit() {
        RadioService service = new RadioService((short) 7);
        service.setCurrentStation(5);
        assertEquals(5, service.getCurrentStation());
    }

    @Test
    void shouldSetStationWithNumberOverLimit() {
        RadioService service = new RadioService((short) 7);
        service.setCurrentStation(8);
        assertEquals(0, service.getCurrentStation());
    }

    @Test
    void shouldSetStationWithNumberUnderLimit() {
        RadioService service = new RadioService((short) 7);
        service.setCurrentStation(-1);
        assertEquals(0, service.getCurrentStation());
    }

    @Test
    void shouldSetStationWithNumberPositiveScenario() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 6);
        service.setCurrentStation(3);
        assertEquals(3, service.getCurrentStation());
    }

    @Test
    void shouldSetStationWithDefaultNumberNegativeScenario1() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 8);
        service.setCurrentStation(9);
        assertEquals(0, service.getCurrentStation());
    }

    @Test
    void shouldSetStationWithDefaultNumberNegativeScenario2() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 7);
        service.setCurrentStation(-1);
        assertEquals(0, service.getCurrentStation());
    }

    @Test
    void shouldSetToNextStationNormally() {
        RadioService service = new RadioService((short) 7);
        service.setCurrentStation(4);
        service.nextStation();
        assertEquals(5, service.getCurrentStation());
    }

    @Test
    void shouldSwitchStationToFirstWhenMax() {
        RadioService service = new RadioService((short) 10);
        service.nextStation();
        assertEquals(0, service.getCurrentStation());
    }


    @Test
    void shouldSwitchStationToLastWhenFirst() {
        RadioService service = new RadioService((short) 5);
        service.setCurrentStation(3);
        service.prevStation();
        service.prevStation();
        assertEquals(1, service.getCurrentStation());
    }

    @Test
    void shouldSwitchStationToLastWhenMin() {
        RadioService service = new RadioService((short) 7);
        service.setCurrentStation(0);
        service.prevStation();
        assertEquals(7, service.getCurrentStation());
    }

    @Test
    void shouldSetVolumeNormally() {
        service.setCurrentVolume(55);
        assertEquals(55, service.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeNotNormally1() {
        service.setCurrentVolume(101);
        assertEquals(0, service.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeNotNormally2() {
        service.setCurrentVolume(-101);
        assertEquals(0, service.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        service.setCurrentVolume(5);
        service.increaseVolume();
        int actual = service.getCurrentVolume();
        assertEquals(6, actual);
    }

    @Test
    public void shouldIncreaseVolumeOverLimit() {
        service.setCurrentVolume(100);
        service.increaseVolume();
        int actual = service.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        service.setCurrentVolume(99);
        service.decreaseVolume();
        int actual = service.getCurrentVolume();
        assertEquals(98, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderLimit() {
        service.setCurrentVolume(0);
        service.decreaseVolume();
        int actual = service.getCurrentVolume();
        assertEquals(0, actual);
    }
}