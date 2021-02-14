package soru1;
import java.lang.*;

public class AdvancedCalculator<T extends Number> extends BasicCalculator<T> implements Scientific<T>{

    public T square(T x){
        if(x instanceof Integer) return (T) new Integer(x.intValue() * x.intValue());
        else if(x instanceof Double) return (T) new Double(x.doubleValue() * x.doubleValue());
        else throw new IllegalArgumentException("Type "+x.getClass()+" is not supported by this operation.");
    }
    public T cube(T x){
        if(x instanceof Integer) return (T) new Integer(x.intValue() * x.intValue() * x.intValue());
        else if(x instanceof Double) return (T) new Double(x.doubleValue() * x.doubleValue() * x.doubleValue());
        else throw new IllegalArgumentException("Type "+x.getClass()+" is not supported by this operation.");
    }
}
