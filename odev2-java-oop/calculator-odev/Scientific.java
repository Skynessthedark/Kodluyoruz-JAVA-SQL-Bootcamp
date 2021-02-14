package soru1;

import java.lang.*;

public interface Scientific<T extends Number> extends Calculator<T>{

    T cube(T x);
    T square(T x);
}
