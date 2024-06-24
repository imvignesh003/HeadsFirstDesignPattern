package duck.behaviour;

/**
 * Quack class implements QuackBehaviour interface
 * This class is used to represent the ducks that can quack
 * @author Vignesh
 */
public class Quack implements QuackBehaviour{
         
        @Override
        public void quack() {
            System.out.println("Quack Quack");
        }
}
