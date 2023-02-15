package creation.abstractfactory;

public class AirForceAttackFactory extends MoveAttackFactory {
    @Override
    public Move createMove() {
        return new AirForceMove();
    }

    @Override
    public Attack createAttack() {
        return new AirForceAttack();
    }
}
