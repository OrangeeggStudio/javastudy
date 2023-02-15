package creation.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MoveAttackFactory moveAttackFactory1 = new NavyAttackFactory();
        MoveAttackFactory moveAttackFactory2 = new AirForceAttackFactory();
        MoveAttackFactory moveAttackFactory3 = new HybridAttackFactory();

        moveAttackFactory1.createMove().move();
        moveAttackFactory1.createAttack().attack();

        System.out.println();

        moveAttackFactory2.createMove().move();
        moveAttackFactory2.createAttack().attack();

        System.out.println();

        moveAttackFactory3.createMove().move();
        moveAttackFactory3.createAttack().attack();
    }
}
