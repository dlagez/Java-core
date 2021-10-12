package IO.base;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class demo6_serializable {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {
            output.writeInt(12345);
            output.writeUTF("Hello");
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }
}
