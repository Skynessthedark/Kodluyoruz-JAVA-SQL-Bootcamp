package soru1;

public interface Calculator<T extends Number> {
    T sum(T x, T y);
    T subtract(T x, T y);
    T multiply(T x, T y);
    T divide(T x, T y);
}
