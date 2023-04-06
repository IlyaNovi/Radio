package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(5);

        int expected = 5;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationAboveZero() {
        Radio radio = new Radio();
        radio.setNumberStation(-2);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overMaxNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(11);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(5);

        radio.increaseNumberStation();
        int expected = 6;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberStationOn9Level() {
        Radio radio = new Radio();
        radio.setNumberStation(9);

        radio.increaseNumberStation();
        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(6);

        radio.decreaseNumberStation();
        int expected = 5;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberStationLessMin() {
        Radio radio = new Radio();
        radio.setNumberStation(0);

        radio.decreaseNumberStation();
        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    //// VOLUME
    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Volume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        int expected = 55;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseAverageVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(89);

        radio.increaseVolume();
        int expected = 90;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOn99Level() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverMaxLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOnZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseAverageVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);

        radio.decreaseVolume();
        int expected = 29;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowMini() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolumeBelowMini();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolumeAboveMax();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);

        int expected = 20;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

