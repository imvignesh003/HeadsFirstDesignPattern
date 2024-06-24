package duck;

import duck.behaviour.FlyBehaviour;

/**
 * RubberDuck class is used to represent the Rubber Duck
 * This class extends AbstractDuck class
 * @author Vignesh G
 */
public class RubberDuck extends AbstractDuck{
    
    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }

    @Override
    public void setFlyBehavior(FlyBehaviour fb) {
        System.out.println("Rubber Duck cannot fly");
        super.setFlyBehavior(fb);
    }

}
