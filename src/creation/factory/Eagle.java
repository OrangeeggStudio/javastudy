package creation.factory;

public class Eagle implements Animal{
    @Override
    public void move() {
        System.out.println("날개를 이용해 날아갑니다.");
    }

    @Override
    public void eat() {
        System.out.println("부리를 이용해 쪼아먹습니다.");
    }
}
