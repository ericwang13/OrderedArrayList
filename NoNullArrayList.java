import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

    public NoNullArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public NoNullArrayList() {
        this(10);
    }

    @Override
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        }
        return super.add(element);
    }

    @Override
    public void add(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            super.add(index, element);
        }
    }

    @Override
    public T set(int index, T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        } else {
            return super.set(index, element);
        }
    }
}