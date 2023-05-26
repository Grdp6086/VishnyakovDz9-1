package ru.netology;

public class Radio {
    public int radioStation;

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            return;
        }
        radioStation = newRadioStation;
    }

    public void next() { // метод переключения следующей станции
        if (radioStation < 9) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void prev() { // метод переключения на предыдущую станцию
        if (radioStation > 0) {
            radioStation--;
        } else {
            radioStation = 9;
        }

    }

    public int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() { // метод увеличения громкости на 1
        if (volume < 100) {
            volume++;
        } else {
            volume = 100;
        }
    }

    public void reduceVolume() { // метод уменьшения громкости на 1
        if (volume > 0) {
            volume--;
        } else {
            volume = 0;
        }
    }


}
