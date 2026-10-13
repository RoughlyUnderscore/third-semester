import tasks.Task11;
import tasks.Task12;
import tasks.Task13;
import tasks.Task14;

/**
 * Java 25
 */
void main() { // no need to specify static
  new Task11().task();
  IO.println(new Task12().task(2.5, 5));
  new Task13().task(1 / Math.E / Math.PI);
  new Task14().task(2.5, 3.6);
}