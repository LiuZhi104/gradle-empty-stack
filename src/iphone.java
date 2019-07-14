public class iphone extends  mobile {
    public iphone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call() {
        System.out.println("iphone call");
    }
}
