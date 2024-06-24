package duck.behaviour;


/**
 * MuteDuck class implements QuackBehaviour interface
 * This class is used to represent the ducks that cannot quack
 * @author Vignesh
 */
public class MuteDuck implements QuackBehaviour{
    
    @Override
    public void quack() {
        System.out.println("<< Silence >>  I'm Wooden Duck I can't quack");
    }
}
