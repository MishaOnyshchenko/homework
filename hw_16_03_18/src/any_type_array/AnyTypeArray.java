package any_type_array;

public class AnyTypeArray <T>{
    private T [] array;

    public AnyTypeArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index){
        return array[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnyTypeArray<?> that = (AnyTypeArray<?>) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "AnyTypeArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
