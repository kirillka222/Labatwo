public class Game extends Application{
    @Override
    public void printInfo() {
        System.out.println("Метод класса игры");
    }
    public Game() {
        super();
        System.out.println(super.getTitle());
    }
    public Game(String name) {
        super(name);
    }
    public Game(String name, String razmer) {
        super(name, razmer);
    }
    public Game(String name, String razmer, double ratingValue) {
        super(name, razmer, ratingValue);
    }
    @Override
    public void sound() {
        System.out.println("Играет музыка...");
    }
}

