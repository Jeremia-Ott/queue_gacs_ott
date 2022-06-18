package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue implements IQueue<SimpleDrink> {

  private List<SimpleDrink> elements = new ArrayList<SimpleDrink>();
  private int maxSize = 5;

  public DrinkQueue(int maxsize) {
    maxSize = maxsize;
  }

  @Override
  public boolean offer(SimpleDrink obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  @Override
  public SimpleDrink poll() {
    SimpleDrink element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }

  @Override
  public SimpleDrink remove() {
    SimpleDrink element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public SimpleDrink peek() {
    SimpleDrink element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public SimpleDrink element() {
    SimpleDrink element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}