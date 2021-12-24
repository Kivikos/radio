package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @Test
    public void shouldSetStation() {
        RadioService service = new RadioService();

        service.setCurrentStation(8);

        int expected = 8;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOverLimit() {
        RadioService service = new RadioService();

        service.setCurrentStation(10);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUnderLimit() {
        RadioService service = new RadioService();

        service.setCurrentStation(-1);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStation() {
        RadioService service = new RadioService();

        service.setCurrentStation(1);
        service.nextStation();

        int expected = 2;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToNextStationWhenCurrentStation9() {
        RadioService service = new RadioService();

        service.setCurrentStation(9);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToPrevStation() {
        RadioService service = new RadioService();

        service.setCurrentStation(4);
        service.prevStation();

        int expected = 3;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToPrevStationWhenCurrentStation0() {
        RadioService service = new RadioService();

        service.setCurrentStation(0);
        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        RadioService service = new RadioService();

        service.setCurrentVolume(7);

        int expected = 7;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOverLimit() {
        RadioService service = new RadioService();

        service.setCurrentVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUnderLimit() {
        RadioService service = new RadioService();

        service.setCurrentVolume(-5);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioService service = new RadioService();

        service.setCurrentVolume(5);
        service.increaseVolume();

        int expected = 6;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOver10() {
        RadioService service = new RadioService();

        service.setCurrentVolume(10);
        service.increaseVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioService service = new RadioService();

        service.setCurrentVolume(5);
        service.decreaseVolume();

        int expected = 4;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnder0() {
        RadioService service = new RadioService();

        service.setCurrentVolume(0);
        service.decreaseVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }
}