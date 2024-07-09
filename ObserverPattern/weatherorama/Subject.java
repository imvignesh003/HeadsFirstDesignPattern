package weatherorama;
/**
 * A Subject interface to implement Observer pattern
 * @author Vignesh G
 */
public interface Subject{
    /**
     * To register a Class as an Observer
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * to remove a class form the observer List
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * To notify all the observers about the event
     */
    public void notifyObservers();
}