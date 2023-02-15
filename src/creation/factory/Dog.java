package creation.factory;

public class Dog implements Animal{
    @Override
    public void move() {
        System.out.println("네 발로 움직입니다.");
    }

    @Override
    public void eat() {
        System.out.println("치아를 이용해 먹습니다.");
    }
}
