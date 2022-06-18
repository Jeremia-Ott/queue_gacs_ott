package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue<Drink> {

  private List<Drink> elements = new ArrayList<Drink>();
  private int maxSize = 5;

  public DrinkQueue(int maxsize) {
    maxSize = maxsize;
  }

  /**
   * Add new Drink to DrinkQueue
   *
   * @param obj
   * @return boolean
   */
  @Override
  public boolean offer(Drink obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * returns and deletes first element of elements or null if no element in queue
   *
   * @return Drink
   */
  @Override
  public Drink poll() {
    Drink element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }
  /**
   * returns and deletes first element of queue or throws NoSuchElementException
   *
   * @throws NoSuchElementException
   * @return Drink
   */
  @Override
  public Drink remove() {
    Drink element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public Drink peek() {
    Drink element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public Drink element() {
    Drink element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}