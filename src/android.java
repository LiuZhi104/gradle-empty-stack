public class android extends mobile{
    public android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call() {
        System.out.println("android call");
    }
}
