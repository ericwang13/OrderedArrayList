public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

    public OrderedArrayList(int initalCapacity) {
        super(initalCapacity);
    }

    public OrderedArrayList() {
        this(10);
    }

    @Override
    public boolean add(T element) {
        for (int i = 0; i < size(); i++) {
            if (element.compareTo(get(i)) < 0) {
                super.add(i, element);
                return true;
            }
        }
        return super.add(element);
    }

    @Override
    public void add(int index, T element) {
        add(element);
    }

    @Override
    public T set(int index, T element) {
        T ret = get(index);
        remove(index);
        add(element);
        return ret;
    }
}