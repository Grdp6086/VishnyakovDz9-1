package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    Radio radioTest = new Radio(15); // ввод колличества радиостанций
    Radio radioTestVolume = new Radio();
    Radio radio = new Radio();

    @ParameterizedTest // выбор станций по умолчанию
    @CsvFileSource(files = "src/test/resources/RadioStationSetNormal.csv")
    public void shouldSetRadioStationNormal(int number, int expected) {

        radio.setRadioStation(number);

        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest // ввод номера станции вручную
    @CsvFileSource(files = "src/test/resources/RadioStation.csv")
    public void ShouldSetStation(int number, int expected) {


        radioTest.setRadioStation(number);

        int actual = radioTest.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @ParameterizedTest // переключение станций на 1 вверх
    @CsvFileSource(files = "src/test/resources/ButtonNextRadioStation.csv")
    public void ShouldIncreaseRadioStation(int number, int expected) {

        radioTest.setRadioStation(number);
        radioTest.next();

        int actual = radioTest.getRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest // переключение станций на 1 вниз
    @CsvFileSource(files = "src/test/resources/ButtonPrevRadioStation.csv")
    public void ShouldSwitchPrevRadioStation(int number, int expected) {

        radioTest.setRadioStation(number);
        radioTest.prev();

        int actual = radioTest.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // ввод громкости вручную
    @CsvFileSource(files = "src/test/resources/RadioVolume.csv")
    public void shouldSetVolume(int number, int expected) {

        radioTestVolume.setVolume(number);

        int actual = radioTestVolume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest // увелечение громкости на 1
    @CsvFileSource(files = "src/test/resources/IncreaseVolume.csv")
    public void shouldIncreaseVolume(int number, int expected) {

        radioTestVolume.setVolume(number);
        radioTestVolume.increaseVolume();

        int actual = radioTestVolume.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest // уменьшение громкости на 1
    @CsvFileSource(files = "src/test/resources/ReduceVolume.csv")
    public void shouldReduceVolume(int number, int expected) {

        radioTestVolume.setVolume(number);
        radioTestVolume.reduceVolume();

        int actual = radioTestVolume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
