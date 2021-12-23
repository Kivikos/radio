package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @Test
    public void  test() {
        RadioService service = new RadioService();

        service.setCurrentStation(1);

        int expected = 1;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStation () {
        RadioService service = new RadioService();

        service.setCurrentStation(9);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToPrevStation () {
        RadioService service = new RadioService();

        service.setCurrentStation(0);
        service.prevStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {
        RadioService service = new RadioService();

        service.setCurrentVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioService service = new RadioService();

        service.setCurrentVolume(12);
        service.increaseVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioService service = new RadioService();

        service.setCurrentVolume(10);
        service.decreaseVolume();

        int expected = 9;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

}