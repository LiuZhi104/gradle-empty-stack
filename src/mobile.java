public class mobile {
    private  String name;
    private String color;
    private  String brand;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }



    public String getBrand() {
        return brand;
    }



    public mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void call(){
        System.out.println("mobile call");
    }

    @Override
    public String toString() {
        return "mobile{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
