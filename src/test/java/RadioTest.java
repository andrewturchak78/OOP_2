import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldNextStation() {
        Radio calc = new Radio();
        calc.setCurrentRadio(7);
        calc.next();
        int expected = 8;
        int actual = calc.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNextStation2() {
        Radio calc = new Radio();
        calc.setCurrentRadio(9);
        calc.next();
        int expected = 0;
        int actual = calc.getCurrentRadio();

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void shouldPrevStation() {
        Radio calc = new Radio();
        calc.setCurrentRadio(4);
        calc.prev();
        int expected = 3;
        int actual = calc.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldPrevStation2() {
        Radio calc = new Radio();
        calc.setCurrentRadio(0);
        calc.prev();
        int expected = 9;
        int actual = calc.getCurrentRadio();

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void shouldPrevStation3() {
        Radio calc = new Radio();
        calc.setCurrentRadio(14);
        calc.prev();
        int expected = 9;
        int actual = calc.getCurrentRadio();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldPrevStation4() {
        Radio calc = new Radio();
        calc.setCurrentRadio(19);
        calc.prev();
        int expected = 9;
        int actual = calc.getCurrentRadio();

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void shouldIncreaseVolume() {
        Radio calc = new Radio();
        calc.setCurrentVolume(101);
        calc.increaseVolume();
        int expected = 100;
        int actual = calc.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume2() {
        Radio calc = new Radio();
        calc.setCurrentVolume(10);
        calc.increaseVolume();
        int expected = 11;
        int actual = calc.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolume() {
        Radio calc = new Radio();
        calc.setCurrentVolume(10);
        calc.decreaseVolume();
        int expected = 9;
        int actual = calc.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio calc = new Radio();
        calc.setCurrentVolume(0);
        calc.decreaseVolume();
        int expected = 1;
        int actual = calc.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldDecreaseVolume3() {
        Radio calc = new Radio();
        calc.setCurrentVolume(15);
        calc.decreaseVolume();
        int expected = 14;
        int actual = calc.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldDecreaseVolume4() {
        Radio calc = new Radio();
        calc.setCurrentVolume(102);
        calc.decreaseVolume();
        int expected = 100;
        int actual = calc.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void radioTest() {
        Radio calc = new Radio(30);
        Assertions.assertEquals(30, calc.getNumberOfStations());
    }
}
