package ru.netology.radio;

public class Radio {
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int currentNumberStation = minNumberStation;
    private int currentVolume;

    public Radio() {
        currentNumberStation = maxNumberStation;
    }

    public Radio(int size) {
        maxNumberStation = minNumberStation + size;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNumberStation(int newNumberStation) {
        if (newNumberStation < minNumberStation) {
            return;
        }
        if (newNumberStation > maxNumberStation) {
            return;
        }
        currentNumberStation = newNumberStation;
    }

    public void increaseNumberStation() {
        if (currentNumberStation == maxNumberStation) {
            currentNumberStation = minNumberStation;
        } else {
            currentNumberStation++;
        }
    }

    public void decreaseNumberStation() {
        if (currentNumberStation == minNumberStation) {
            currentNumberStation = maxNumberStation;
        } else {
            currentNumberStation = currentNumberStation - 1;
        }

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
