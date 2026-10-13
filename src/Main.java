import algorithms.Algorithm11;
import algorithms.Algorithm12;
import algorithms.Algorithm13;
import tasks.*;

/**
 * Java 25
 */
void main() { // no need to specify static
  new Task11().task();
  IO.println(new Task12().task(2.5, 5));
  new Task13().task(1 / Math.E / Math.PI);
  new Task14().task(2.5, 3.6);

  new Task21().task(new int[] { 2, 4, 6, 8, 10, 12 });
  IO.println(new Task22().task(new int[] { 2, 4, 6, 8, 10, 12, 12 }));
  new Task23();
  IO.println(Arrays.deepToString(new Task24().task(4, 8)));

  new Algorithm11().test(); // shouldn't throw
  new Algorithm12().test(); // shouldn't throw
  new Algorithm13().test(); // shouldn't throw
}