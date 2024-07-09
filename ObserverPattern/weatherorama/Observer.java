package weatherorama;
/**
 * An Obsever Interface to Generalize the Observer classes in Observer design pattern
 * @author Vignesh G
 */
public interface Observer {
    /**
     * This menthod is called when the values have been updated to make changes in the observer classes
     */
    public void update();    
}
