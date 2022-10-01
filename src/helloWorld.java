import java.io.IOException;
import java.io.OutputStreamWriter;

public class hello{
    public static void main(String[] args) throws IOException{
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        streamWriter.write("Hello World");
        streamWriter.flush();
    }
}
