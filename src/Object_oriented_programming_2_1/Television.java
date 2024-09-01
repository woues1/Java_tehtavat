package Object_oriented_programming_2_1;

public class Television {
    private int channel;
    private boolean state;

    public boolean isOn() {
        return state;
    }

    public int setChannel(int channel) {
        if (channel <= 10) {
            this.channel = channel;
            return channel;
        }
        this.channel = 1;
        return channel;

    }

    public void pressOnOff(){
        if (!state) {
            state = true;
        } else {
            state = false;
        }
    }

    public int getChannel() {
        return channel;
    }


}
