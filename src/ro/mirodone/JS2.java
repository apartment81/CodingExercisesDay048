package ro.mirodone;

public class JS2 {

    public int josephusSurvivor(final int n, final int k) {
        int remaining = 0;
        for (int i = 2; i <= n; i++) {
            remaining = (remaining + k) % i;
        }

        return remaining + 1;
    }

}
