import java.util.* ;
import java.io.* ;

public class Demo  {
    public static void main (String[] args) throws Exception {

        try (RandomAccessFile file = new RandomAccessFile("counter.dat", "rw");) {

            if (file.length() == 0)
                file.writeInt(1);

            else {

                int cnt = file.readInt();
                file.seek(0);

                file.writeInt(++cnt);
            }
        }
    }
}
