package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @Test
    public void shouldSetCurrentStation() {
        RadioService service = new RadioService(15);
        service.setCurrentStation(7);
        int expected = 7;
        int actual = service.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationWhenOutOfLimit() {
        RadioService service = new RadioService(20);
        service.setCurrentStation(21);
        int expected = 0;
        int actual = service.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationWhenUnderLimit() {
        RadioService service = new RadioService(20);
        service.setCurrentStation(-1);
        int expected = 0;
        int actual = service.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        RadioService service = new RadioService(20);
        service.setCurrentStation(6);
        service.nextStation();
        int expected = 7;
        int actual = service.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationWhenInMaxLimit() {
        RadioService service = new RadioService(20);
        service.setCurrentStation(19);
        service.nextStation();
        int expected = 0;
        int actual = service.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStation() {
        RadioService service = new RadioService(20);
        service.setCurrentStation(5);
        service.prevStation();
        int expected = 4;
        int actual = service.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStationWhenInMinLimit() {
        RadioService service = new RadioService(20);
        service.setCurrentStation(0);
        service.prevStation();
        int expected = 19;
        int actual = service.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        RadioService service = new RadioService();
        service.setCurrentVolume(55);
        int expected = 55;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeOverLimit() {
        RadioService service = new RadioService();
        service.setCurrentVolume(101);
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeUnderLimit() {
        RadioService service = new RadioService();
        service.setCurrentVolume(-1);
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUp() {
        RadioService service = new RadioService();
        service.setCurrentVolume(50);
        service.increaseVolume();
        int expected = 51;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUpWhenInMaxLimit() {
        RadioService service = new RadioService();
        service.setCurrentVolume(100);
        service.increaseVolume();
        int expected = 100;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDown() {
        RadioService service = new RadioService();
        service.setCurrentVolume(76);
        service.decreaseVolume();
        int expected = 75;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDownWhenInMinLimit() {
        RadioService service = new RadioService();
        service.setCurrentVolume(0);
        service.decreaseVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
