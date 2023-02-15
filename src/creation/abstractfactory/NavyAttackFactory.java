package creation.abstractfactory;

import javax.naming.NameAlreadyBoundException;

public class NavyAttackFactory extends MoveAttackFactory {
    @Override
    public Move createMove() {
        return new NavyMove();
    }

    @Override
    public Attack createAttack() {
        return new NavyAttack();
    }
}
