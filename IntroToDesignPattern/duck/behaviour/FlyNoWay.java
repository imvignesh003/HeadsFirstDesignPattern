package duck.behaviour;

/**
 * FlyNoWay class implements FlyBehaviour interface
 * This class is used to represent the ducks that cannot fly
 * @author Vignesh
 */
public class FlyNoWay implements FlyBehaviour{
        
        @Override
        public void fly() {
            System.out.println("I can't fly");
        }
}
