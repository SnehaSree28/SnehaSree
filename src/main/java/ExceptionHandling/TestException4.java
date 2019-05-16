package ExceptionHandling;

import java.io.IOException;

/**
 * Created by lovel on 24-Jan-19.
 */
public class TestException4 {
    public void start() throws IOException {
    }

    public void foo() throws NullPointerException{

    }
}

class TestException5 extends TestException4{
@Override
    public void start() {
    }

    public void foo() throws RuntimeException{

    }
}
