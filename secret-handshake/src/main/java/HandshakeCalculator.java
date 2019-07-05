import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> secretHanshake = new ArrayList<Signal>();
        for (int i = 0; i < 4; i++) {
            if ((number & (1 << i)) != 0) {
                secretHanshake.add(Signal.values()[i]);
            }
        }
        if ((number & (1 << 4)) != 0) {
            Collections.reverse(secretHanshake);
        }
        return secretHanshake;
    }
}
