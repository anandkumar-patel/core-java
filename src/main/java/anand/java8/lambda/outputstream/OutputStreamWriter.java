package anand.java8.lambda.outputstream;

import java.io.IOException;
import java.io.OutputStream;

@FunctionalInterface
public interface OutputStreamWriter {
    void writeTo(OutputStream outputStream) throws IOException;
}
