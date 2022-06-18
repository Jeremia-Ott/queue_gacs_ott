package at.fhj.msd;

/**
 * @author bence
 */
public interface IQueue<T> {
    /**
     * add object to queue
     *
     * @param obj
     * @return true if works, otherwise false
     */
    public abstract boolean offer(T obj);

    /**
     * returns and deletes first element; null if no element in there
     *
     * @return T
     */
    public abstract T poll();

    /**
     * like poll but if no elment exists NoSuchElementException is throwin instead of null return value
     *
     * @return T
     */
    public abstract T remove();

    /**
     * gives first element but does not delete, null if nothing there
     *
     * @return T
     */
    public abstract T peek();

    /**
     * like peek but NoSuchElementException instead of null
     *
     * @return T
     */
    public abstract T element();
}