

/*
 *Example of Tv we can have another examples like Ac
 * AC(Has diffent parameters instead of volume it will have the temperature)
 */

class Receiver {
    private boolean isOn;
    private int volume = 10;
    private final static int maxVolume = 100;

    public void turnOn() {
        this.isOn = true;
        System.out.println("Tv is on now");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Tv is off now");
    }

    public void increaseVolume() {
        if (this.volume < Receiver.maxVolume) {
            this.volume += 1;
            Math.min(this.volume, Receiver.maxVolume);
        }

        System.out.println(String.format("Volume increased by 1 and now it is %d", this.volume));
    }

    public void decreaseVolume() {
        if (this.volume > 0) {
            this.volume -= 1;
        }
        System.out.println(String.format("Volume decreased by 1 and now it is %d", this.volume));
    }
}

abstract class Command {


    abstract void execute(Receiver reciever);

    abstract void undo(Receiver reciever);

}

class TurnOnCommand extends Command {


    @Override
    public void execute(Receiver reciever) {
        reciever.turnOn();
    }

    @Override
    void undo(Receiver reciever) {
        reciever.turnOff();
    }
}

class TurnOffCommand extends Command {

    @Override
    public void execute(Receiver reciever) {
        reciever.turnOff();
    }

    @Override
    void undo(Receiver reciever) {
        reciever.turnOn();
    }
}

class IncreaseVolume extends Command {


    @Override
    public void execute(Receiver reciever) {
        reciever.increaseVolume();
    }

    @Override
    void undo(Receiver reciever) {
        reciever.decreaseVolume();
    }
}

class DecreaseVolume extends Command {

    @Override
    public void execute(Receiver reciever) {
        reciever.decreaseVolume();
    }

    @Override
    void undo(Receiver reciever) {
        reciever.increaseVolume();
    }
}

class Remote {
    public Receiver reciever;

    public Remote(Receiver reciever) {
        this.reciever = reciever;
    }

    public void pressKey(Command command) {
        command.execute(this.reciever);
    }
}


public class CommandDesignPattern {

    public static void main(String[] args) {
        Receiver reciever = new Receiver();
        Remote remote = new Remote(reciever);
        remote.pressKey(new TurnOnCommand());
        remote.pressKey(new TurnOffCommand());
        remote.pressKey(new DecreaseVolume());

    }
}
