package ru.netology.radio;

public class Radio {

    private int numberStation;

    public int getNumberStation() {
        return numberStation;
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

    //////////// VOLUME  ////////////////
//    private int currentVolume;
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int newCurrentVolume) {
//
//        if (newCurrentVolume < 0) {
//            return;
//        }
//        if (newCurrentVolume > 100) {
//            return;
//        }
//        currentVolume = newCurrentVolume;
//    }
//
//
//    public void increaseVolume() {
//
//        if (currentVolume < 100) {
//            currentVolume = currentVolume + 1;
//        }
//    }
//
//    public void decreaseVolume() {
//        if (currentVolume > 0) {
//            currentVolume = currentVolume - 1;
//        }
//    }
//
//    public void increaseVolumeAboveMax() {
//        int target = currentVolume + 1;
//        setCurrentVolume(target);
//    }
//
//    public void decreaseVolumeBelowMini() {
//        int target = currentVolume - 1;
//        setCurrentVolume(target);
//    }

}
