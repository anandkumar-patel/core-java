package anand.generics.upper.bound;

import anand.generics.data.GrandParent;

public class G03ClassUpperBound<T extends GrandParent> {
    private T data;

    public G03ClassUpperBound(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

}