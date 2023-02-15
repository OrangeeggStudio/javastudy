package creation.abstractfactory;

public class HybridAttackFactory extends MoveAttackFactory {
    @Override
    public Move createMove() {
        return new AirForceMove();
    }

    @Override
    public Attack createAttack() {
        return new NavyAttack();
    }
}
