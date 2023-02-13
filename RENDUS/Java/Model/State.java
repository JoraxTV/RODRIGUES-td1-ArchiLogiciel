
import java.util.*;

/**
 * 
 */
public abstract class State {

    /**
     * 
     */
    protected Socket etat;

    /**
     * Default constructor
     */
    public State() {
    }

    /**
     * 
     */
    public void listen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void read() {
        // TODO implement here
    }

    /**
     * 
     */
    public void close() {
        // TODO implement here
    }

    /**
     * 
     */
    public void connect() {
        // TODO implement here
    }

    /**
     * 
     */
    public void accept() {
        // TODO implement here
    }

    /**
     * @return
     */
    public State nextState() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void config() {
        // TODO implement here
    }

    /**
     * 
     */
    public void reset() {
        // TODO implement here
    }

}