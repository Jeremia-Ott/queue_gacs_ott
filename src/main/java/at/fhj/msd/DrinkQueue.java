package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class represents a queue of drinks
 */
public class DrinkQueue implements IQueue<Drink> {

  private List<Drink> elements = new ArrayList<Drink>();
  private int maxSize = 5;

  public DrinkQueue(int maxsize) {
    maxSize = maxsize;
  }

  @Override
  public boolean offer(Drink obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  @Override
  public Drink poll() {
    Drink element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }

  @Override
  public Drink remove() {
    Drink element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * gives first Drink but does not delete
   *
   * @return first Drink, null if nothing is there
   */
  @Override
  public Drink peek() {
    Drink element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * gives first Drink but does not delete
   *
   * @throws NoSuchElementException if nothing is there
   * @return first Drink
   */
  @Override
  public Drink element() {
    Drink element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}