public class Television {
    //declare variables/properties/...
    private int channel;
    public int volume;
    private String channelDesc;
    private boolean internetReady;

    //declare methods - getter/setter
    public int getChannel(){
        return this.channel;
    }

    public void setChannel(int channel){
        //validation
        if(channel <= 0) {
            this.channel = 0;
        }
        else if(channel > 100) {
            this.channel = 100;
        }
        else {
            this.channelOnTheTV = channel;
        }
    }


}
