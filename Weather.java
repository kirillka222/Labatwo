public class Weather extends Application {
    @Override
    public void printInfo() {
        System.out.println("Метод класса Погода");
    }
    public Weather() {
        super();
        System.out.println(super.getTitle());
    }
    public Weather(String name) {
        super(name); 
    }
    public Weather(String name, String razmer) {
        super(name, razmer);
    }
    public Weather(String name, String razmer, double ratingValue) {
        super(name, razmer, ratingValue);
    }
    @Override
    public void sound() {
        System.out.println("Звук дождя...");
    }
}
