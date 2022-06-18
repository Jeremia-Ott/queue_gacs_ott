package at.fhj.msd;

// fastly written (not really nice) comments but good enough to understand
public interface IQueue<T> {
  /* 
  add object to queue, return true if works, otherwise false
  */
  public abstract boolean offer(T obj);

  /*
  returns and deletes first element; null if no element in there
   */
  public abstract T poll();

  /*
  like poll but if no elment exists NoSuchElementException is throwin instead of null return value
   */
  public abstract T remove();

  /*
  gives first element but does not delete, null if nothing there
   */
  public abstract T peek();

  /*
  like peek but NoSuchElementException instead of null
   */
  public abstract T element();
}