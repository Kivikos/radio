package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    RadioService service = new RadioService();

    @Test
    void shouldSetStationNumberNormally() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 1);
        assertEquals(1, service.getStationsNumber());
    }

    @Test
    void shouldSetStationNumberNotNormally1() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 11);
        assertEquals(10, service.getStationsNumber());
    }

    @Test
    void shouldSetStationNumberNotNormally2() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 0);
        assertEquals(10, service.getStationsNumber());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityPositive() {
        service.setStation(5);
        assertEquals(5, service.getStation());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityNegative() {
        service.setStation(11);
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityNegative2() {
        service.setStation(-1);
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityPositive() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 6);
        service.setStation(3);
        assertEquals(3, service.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityNegative() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 6);
        service.setStation(11);
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityNegative2() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 6);
        service.setStation(-1);
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSwitchStationToMinLimit() {
        RadioService service = new RadioService("WhenMaxLimit", 10);
        service.nextStation();
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSwitchStationToMaxLimit() {
        RadioService service = new RadioService("WhenMinLimit", 0);
        service.prevStation();
        assertEquals(10, service.getStation());
    }

    @Test
    void shouldIncreaseVolumeWhenMax() {
        RadioService service = new RadioService(100);
        service.increaseVolume();
        assertEquals(100, service.getVolume());
    }

    @Test
    void shouldDecreaseVolumeWhenMin() {
        RadioService service = new RadioService(0);
        service.decreaseVolume();
        assertEquals(0, service.getVolume());
    }

    @Test
    void shouldSetVolumeWhenOverMaxLimit() {
        RadioService service = new RadioService(101);
        assertEquals(20, service.getVolume());
    }

    @Test
    void shouldSetVolumeWhenUnderMinLimit() {
        RadioService service = new RadioService(-1);
        assertEquals(20, service.getVolume());
    }
}
