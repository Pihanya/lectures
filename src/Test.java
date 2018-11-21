import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Message message = new SimpleMessage();
        message.setTextMessage("Hello, Misha");

        MessageWithDateImpl messageWithDate = new MessageWithDateImpl();
        messageWithDate.setDate("14.11.18");
        messageWithDate.setTextMessage("Hello, Vasya");

        ArrayList array = new ArrayList();
        array.add(0 , message);
        array.add(1, messageWithDate);

        for (int i = 0; i < 2; i++) {
            System.out.println(array.get(i));
        }

    }
}
