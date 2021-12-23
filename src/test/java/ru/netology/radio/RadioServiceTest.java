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
        service.setToNextStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToPrevStation () {
        RadioService service = new RadioService();

        service.setCurrentStation(0);
        service.setToPrevStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }
}