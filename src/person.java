public class person {
    private  String name;
    private mobile mobile;

    public person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(mobile mobile) {
        this.mobile = mobile;
    }

    public  void usecall(){
        this.mobile.call();
    }

}
