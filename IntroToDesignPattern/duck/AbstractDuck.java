package duck;

import duck.behaviour.FlyBehaviour;
import duck.behaviour.QuackBehaviour;

/**
 * @author Vignesh G
 */
public abstract class AbstractDuck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public AbstractDuck() {
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void display() {
        System.out.println("I'm a duck!");
    }

    public void setQuackBehavior(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehavior(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}