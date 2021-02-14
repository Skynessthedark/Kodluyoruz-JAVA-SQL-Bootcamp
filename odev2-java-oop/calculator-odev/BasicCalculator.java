package soru1;

import java.util.function.DoubleUnaryOperator;

public class BasicCalculator<T extends Number> implements Calculator<T>{

    public T sum(T x, T y){
        if(x instanceof Integer) return (T) new Integer(x.intValue() + y.intValue());
        else if(x instanceof Double) return (T) new Double(x.doubleValue() + y.doubleValue());
        else throw new IllegalArgumentException("Type "+x.getClass()+" is not supported by this operation.");
    }
    public T subtract(T x, T y){
        if(x instanceof Integer) return (T) new Integer(x.intValue() - y.intValue());
        else if(x instanceof Double) return (T) new Double(x.doubleValue() - y.doubleValue());
        else throw new IllegalArgumentException("Type "+x.getClass()+" is not supported by this operation.");
    }
    public T multiply(T x, T y){
        if(x instanceof Integer) return (T) new Integer(x.intValue() * y.intValue());
        else if(x instanceof Double) return (T) new Double(x.doubleValue() * y.doubleValue());
        else throw new IllegalArgumentException("Type "+x.getClass()+" is not supported by this operation.");
    }
    public T divide(T x, T y){
        if(x instanceof Integer) return (T) new Integer(x.intValue() / y.intValue());
        else if(x instanceof Double) return (T) new Double(x.doubleValue() / y.doubleValue());
        else throw new IllegalArgumentException("Type "+x.getClass()+" is not supported by this operation.");
    }
}
