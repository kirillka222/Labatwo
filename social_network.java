public class social_network extends Application{
    @Override
    public void printInfo() {
        System.out.println("Метод класса соц. сети");
    }
    public social_network() {
        super();
        System.out.println(super.getTitle());
    }
    public social_network(String name) {
        super(name);
    }
    public social_network(String name, String razmer) {
        super(name, razmer);
    }
    public social_network(String name, String razmer, double ratingValue) {
        super(name, razmer, ratingValue);
    }
    @Override
    public void sound() {
        System.out.println("Запуск соцсети...");
    }
}
