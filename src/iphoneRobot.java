public class iphoneRobot {
    private  iphone iphone;

    public iphoneRobot(iphone iphone) {
        this.iphone = iphone;
    }
    public String useIphoneRobotOfIphone(){
        return this.iphone.getName();
    }
}
