package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    RadioService service = new RadioService();

    @Test
    void shouldSetStationNumberNormally() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 3);
        assertEquals(3, service.getStationsNumber());
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
    void shouldSetStationWithNumberInLimit() {
        service.setStation(5);
        assertEquals(5, service.getStation());
    }

    @Test
    void shouldSetStationWithNumberOverLimit() {
        service.setStation(11);
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSetStationWithNumberUnderLimit() {
        service.setStation(-1);
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSetStationWithNumberPositiveScenario() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 6);
        service.setStation(3);
        assertEquals(3, service.getStation());
    }

    @Test
    void shouldSetStationWithDefaultNumberNegativeScenario1() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 8);
        service.setStation(9);
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSetStationWithDefaultNumberNegativeScenario2() {
        RadioService service = new RadioService((short) 10);
        service.setStationsNumber((short) 7);
        service.setStation(-1);
        assertEquals(0, service.getStation());
    }

    @Test
    void shouldSetToNextStationNormally() {
            RadioService service = new RadioService("NextStation", 4);
            service.nextStation();
            assertEquals(5, service.getStation());
        }

    @Test
     void shouldSwitchStationToFirstWhenMax() {
        RadioService service = new RadioService("WhenNearMaxLimit", 10);
        service.nextStation();
        assertEquals(0, service.getStation());
    }


    @Test
    void shouldSwitchStationToLastWhenFirst() {
        RadioService service = new RadioService("WhenNearMinLimit", 1);
        service.prevStation();
        service.prevStation();
        assertEquals(10, service.getStation());
    }

    @Test
    void shouldDecreaseVolumeNormally() {
        RadioService service = new RadioService(55);
        service.decreaseVolume();
        assertEquals(54, service.getVolume());
    }

    @Test
    void shouldIncreaseVolumeWhenNearMax() {
        RadioService service = new RadioService(99);
        service.increaseVolume();
        service.increaseVolume();
        assertEquals(100, service.getVolume());
    }

    @Test
    void shouldDecreaseVolumeWhenNearMin() {
        RadioService service = new RadioService(0);
        service.decreaseVolume();
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
