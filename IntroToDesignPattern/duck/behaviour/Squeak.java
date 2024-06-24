package duck.behaviour;

/**
 * Squeak class implements QuackBehaviour interface
 * This class is used to represent the ducks that can squeak
 * @author Vignesh
 */
public class Squeak implements QuackBehaviour{
    
    @Override
    public void quack() {
        System.out.println("Squeak Squeak rubber duckie squeak");
    }
}
