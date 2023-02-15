package creation.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Member member = new Member.Builder("abcd", "홍길동")
                .setAge(20)
                .build();

        System.out.println(member);
    }
}
