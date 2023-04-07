package ru.netology.radio;

public class Radio {
    private int numberStation;
    private int currentVolume;

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseNumberStation() {
        if (numberStation == 9) {
            numberStation = 0;
        } else {
            numberStation++;
        }
    }

    public void decreaseNumberStation() {
        if (numberStation == 0) {
            numberStation = 9;
        } else {
            numberStation = numberStation - 1;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
