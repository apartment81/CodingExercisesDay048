package ro.mirodone;

public class JosephusSurvivor {

    public  int josephusSurvivor(final int n, final int k) {

        if (n == 1)
            return 1;
        else
    /* The position returned by josephus(n - 1, k)
    is adjusted because the recursive call
    josephus(n - 1, k) considers the original
    position k%n + 1 as position 1 */
            return (josephusSurvivor(n - 1, k) + k - 1) % n + 1;


    }


}
