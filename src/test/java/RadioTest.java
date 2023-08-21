import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNextStation1() {
        Radio radio = new Radio ();

        radio.setCurrentStation(6);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation2() {
        Radio radio = new Radio ();

        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation3() {
        Radio radio = new Radio ();

        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation4() {
        Radio radio = new Radio ();

        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation5() {
        Radio radio = new Radio ();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation1() {
        Radio radio = new Radio ();

        radio.setCurrentStation(6);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation2() {
        Radio radio = new Radio ();

        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation3() {
        Radio radio = new Radio ();

        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation4() {
        Radio radio = new Radio ();

        radio.setCurrentStation(8);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation5() {
        Radio radio = new Radio ();

        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationSetter1() {
        Radio radio = new Radio ();

        radio.setCurrentStation(7);

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSetter2() {
        Radio radio = new Radio ();

        radio.setCurrentStation(-12);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSetter3() {
        Radio radio = new Radio ();

        radio.setCurrentStation(12);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSetter4() {
        Radio radio = new Radio ();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSetter5() {
        Radio radio = new Radio ();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSetter6() {
        Radio radio = new Radio ();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSetter7() {
        Radio radio = new Radio ();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSetter8() {
        Radio radio = new Radio ();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testStationSetter9() {
        Radio radio = new Radio ();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(12);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 13;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume2() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume3() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume4() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume5() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume1() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(12);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 11;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume2() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume3() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume4() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 98;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume5() {
        Radio radio = new Radio ();

        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeSetter1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-12);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeSetter2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(112);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(24);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(-12);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}