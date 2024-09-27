public class vkontakte extends social_network{
    public vkontakte() {
        super();
        System.out.println(super.getTitle());
    }
    public vkontakte(String name) {
        super(name);
    }
    public vkontakte(String name, String razmer) {
        super(name, razmer);
    }
    public vkontakte(String name, String razmer, double ratingValue) {
        super(name, razmer, ratingValue);
    }
}
