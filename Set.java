import java.util.ArrayList;

public class Set<E> {
    public ArrayList<E> elements = new ArrayList<>();

    public Set<E> add(E value) {
        if (this.elements.contains(value)) return this;

        this.elements.add(value);
        return this;
    }

    public Set<E> union(Set<E> set) {
        Set<E> newSet = new Set<>();

        for (E element : this.elements) {
            newSet.add(element);
        }

        for (E element : set.elements) {
            newSet.add(element);
        }

        return newSet;
    }

    public Set<E> intersect(Set<E> set) {
        Set<E> newSet = new Set<>();

        for (E element : this.elements) {
            if (set.elements.contains(element)) {
                newSet.add(element);
            }
        }

        return newSet;
    }

    public int cardinality() {
        return this.elements.size();
    }

    public String toString() {
        String output = "{";

        for (int i = 0; i < this.cardinality(); i++) {
            output += this.elements.get(i).toString();

            if (i != (this.cardinality() - 1)) {
                output += ", ";
            }
        }

        return output + "}";
    }
}
