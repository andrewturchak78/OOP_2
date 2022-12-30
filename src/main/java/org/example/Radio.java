package org.example;

public class Radio {
    int currentRadio;

    public int getCurrentRadio() {
        return currentRadio;
    }

    int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if ((currentVolume + 1) > 10) {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
        if ((currentVolume - 1) < 1) {
            currentVolume = 1;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
    }

    public void next() {
        if (currentRadio < 9) {
            currentRadio = currentRadio + 1;
        }
        if ((currentRadio + 1) > 9) {
            currentRadio = 0;
        }
    }

    public void prev() {
        if (currentRadio <= 9) {
            currentRadio = currentRadio - 1;
        }
        if ((currentRadio - 1) < 0) {
            currentRadio = 9;
        }
        if (currentRadio > 9) {
            currentRadio = 9;
        }
    }

    public void setChosenRadio(int newChosenRadio) {
        if (newChosenRadio <= 9) {
            currentRadio = newChosenRadio;
        } else {
            currentRadio = 9;
        }
    }
}
