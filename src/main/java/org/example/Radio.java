package org.example;

public class Radio {
    private int currentRadio;
    private int currentVolume;
    private int numberOfStations;
    private int minRadio = 0;
    private int maxRadio = 9;
    private int minVolume = 1;
    private int maxVolume = 100;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        minRadio = 0;
        maxRadio = numberOfStations - 1;
    }

    public Radio() {
        numberOfStations = 10;
    }


    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > maxRadio) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }


    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void increaseVolume() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if ((currentVolume + 1) > maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        }
        if ((currentVolume - 1) < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void next() {
        if (currentRadio < maxRadio) {
            currentRadio = currentRadio + 1;
        }
        if ((currentRadio + 1) > maxRadio) {
            currentRadio = minRadio;
        }
    }

    public void prev() {
        if ((currentRadio - 1) < minRadio) {
            currentRadio = maxRadio;
        } else {
            currentRadio = currentRadio - 1;
        }
    }
}
