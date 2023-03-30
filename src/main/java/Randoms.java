import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    final int min;
    final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();

    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {
            return random.nextInt(max - min) + min + 1;
        }
    }
}
