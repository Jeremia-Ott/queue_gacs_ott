package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * Class represents a queue of Strings
 */
public class StringQueue implements IQueue<String> {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  public StringQueue(int maxsize) {
    maxSize = maxsize;
  } //maxsize is lowercase error 1

  /**
   * add String to queue
   *
   * @param obj is the String that gets added
   * @return true if works, otherwise false
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * returns and deletes first String
   *
   * @return first element, null if no element is there
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) { // needs to be executed when size is gt 0, and not if size is 0 error2
      elements.remove(0);
    }

    return element;
  }

  /**
   * returns and deletes first String
   *
   * @throws NullPointerException if there is no String in queue
   * @return first String in queue
   */
  @Override
  public String remove() {
    String element = poll();
    //element = ""; is error3, shouldn't be overridden
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * gives first String but does not delete
   *
   * @return first String, null if nothing is there
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * gives first String but does not delete
   *
   * @throws NoSuchElementException if nothing is there
   * @return first String
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}// removed "s" error4