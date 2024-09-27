public abstract class Application{ 
    private String title;
    private String memory;
    private double rating;
    private static int counter = 0;
    public Application() { 
        title = "NoName";
        memory = "0";
        rating = 0;
        System.out.println("Созданно приложение");
    }
    public Application(String name) { 
        title = name;
        counter++;
    }
    public Application(String name, String razmer) {
        title = name;
        memory = razmer;
        counter++;
    }
    public Application(String name, String razmer, double ratingValue) {
        title = name;
        memory = razmer;
        rating = ratingValue;
        counter++;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setMemory(String newMemory) {
        memory = newMemory;
    }
    public String getMemory() {
        return memory;
    }
    public void setRating(double newRating) {
        rating = newRating;
    }
    public double getRating() {
        return rating;
    }

    public abstract void sound();
    public int getCounter() {
        return counter;
    }
    public void printInfo() {
        System.out.println("Метод класса Application");
    }
}
