package ru.netology;

public class Radio {
    private int radioStation;
    private int maxRadioStation = 9; // мах радиостанция
    private int minRadioStation = 0; // мин радиостанция
    private int sizeRadioStation = 10; // колличество радиостанций
    private int volume;
    private int minVolume = 0; // мин громкость
    private int maxVolume = 100; // макс громкость

    public Radio(int sizeRadioStation) {
        this.sizeRadioStation = sizeRadioStation;
        this.maxRadioStation = sizeRadioStation - 1;
    }

    public Radio() {
    }


    public int getRadioStation() {
        return radioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < minRadioStation) {
            return;
        }
        if (newRadioStation > maxRadioStation) {
            return;
        }
        radioStation = newRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void next() { // метод переключения следующей станции
        if (radioStation < maxRadioStation) {
            radioStation++;
        } else {
            radioStation = minRadioStation;
        }
    }

    public void prev() { // метод переключения на предыдущую станцию
        if (radioStation > minRadioStation) {
            radioStation--;
        } else {
            radioStation = maxRadioStation;
        }

    }

    public void increaseVolume() { // метод увеличения громкости на 1
        if (volume < maxVolume) {
            volume++;
        } else {
            volume = maxVolume;
        }
    }

    public void reduceVolume() { // метод уменьшения громкости на 1
        if (volume > minVolume) {
            volume--;
        } else {
            volume = minVolume;
        }
    }
}
