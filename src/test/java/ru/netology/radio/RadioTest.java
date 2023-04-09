package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void defaultRadioStation() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNumberStation() {
        Radio radio = new Radio(10);
        radio.setNumberStation(5);

        Assertions.assertEquals(5, radio.getCurrentNumberStation());
    }

    @Test
    public void shouldSetNumberStationBelowZero() {
        Radio radio = new Radio(10);
        radio.setNumberStation(-2);

        Assertions.assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void shouldSetNumberStationAboveMax() {
        Radio radio = new Radio(10);
        radio.setNumberStation(12);

        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void increaseOverMaxNumberStation() {
        Radio radio = new Radio(11);
        radio.setNumberStation(11);

        radio.increaseNumberStation();
        Assertions.assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    public void increaseNumberStation() {
        Radio radio = new Radio(10);
        radio.setNumberStation(5);

        radio.increaseNumberStation();
        Assertions.assertEquals(6, radio.getCurrentNumberStation());
    }

    @Test
    public void decreaseNumberStation() {
        Radio radio = new Radio(9);
        radio.setNumberStation(6);

        radio.decreaseNumberStation();
        Assertions.assertEquals(5, radio.getCurrentNumberStation());
    }

    //
    @Test
    public void decreaseNumberStationLessMin() {
        Radio radio = new Radio(12);
        radio.setNumberStation(0);

        radio.decreaseNumberStation();
        Assertions.assertEquals(12, radio.getMaxNumberStation());
    }


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

        int expected = 0;
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

