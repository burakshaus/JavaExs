package MyInteger;

import org.jetbrains.annotations.NotNull;

public interface MyIntegerInterface {
    // TODO
    int getValue();

    boolean isEven();
    boolean isOdd();
    boolean isPrime();

    boolean isEven(int value);
    boolean isOdd(int value);
    boolean isPrime(int value);

    boolean isEven(@NotNull MyInteger instance);
    boolean isOdd(@NotNull MyInteger instance);
    boolean isPrime(@NotNull MyInteger instance);

    boolean equals(int value);
    boolean equals(@NotNull MyInteger value);


}
