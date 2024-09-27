public class main {
    public static void main(String[] args) {
        Game a; 
        Weather b;
        social_network c;
        vkontakte d;

        a = new Game("Minecraft", " 384 MB ", 5); 
        b = new Weather("Погода Москвы", " 76 MB ", 4.5);
        c = new social_network("Telegram  ", " 156 MB ", 4.1);
        d = new vkontakte("VK ", " 124 MB ", 4.2);
        System.out.print(a.getTitle());
        System.out.print(a.getMemory());
        System.out.println(a.getRating());
        System.out.println(a.getCounter());
        a.printInfo();
        a.sound();
        System.out.print(b.getTitle());
        System.out.print(b.getMemory());
        System.out.println(b.getRating());
        b.printInfo();
        b.sound();
        System.out.print(c.getTitle());
        System.out.print(c.getMemory());
        System.out.println(c.getRating());
        c.printInfo();
        c.sound();  

        System.out.print(d.getTitle());
        System.out.print(d.getMemory()); 
        System.out.println(d.getRating());
    }

}
