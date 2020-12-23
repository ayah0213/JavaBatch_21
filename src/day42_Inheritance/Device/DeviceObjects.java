package day42_Inheritance.Device;

public class DeviceObjects {
    public static void main(String[] args) {


        TV tv = new TV("Samsung","s307X",425.25);
        System.out.println(tv);
        tv.channelDown();
        tv.channelUp();
        tv.turnOn();
        tv.turnOff();

        Phone phone = new Phone("Iphone","Pro11",1000.20);
        phone.text(347556363);
        phone.call(325458);
        phone.turnOn();
        phone.turnOff();
        System.out.println(phone);

        Computer computer = new Computer("HP","X3TouchScreen",860.25);
        computer.updatedWindowsCore();
        computer.releaseYaar();
        computer.toString();
        System.out.println(computer);
    }
}
