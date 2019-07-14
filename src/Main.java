public class Main {

    public static void main(String[] args) {
        mobile mobile=new mobile("ss","red","sw");
        iphone iphone=new iphone("iphone7","white","apple");
        android android=new android("华为nova","black","华为");
        person person=new person("小明");
        iphoneRobot iphoneRobot=new iphoneRobot(iphone);
        iphone.call();
        mobile.call();
        android.call();
        person.setMobile(iphone);
        //person.setMobile(android);
        System.out.println(mobile.toString());
        String s=iphoneRobot.useIphoneRobotOfIphone();
        System.out.println(s);
        person.usecall();
    }
}
