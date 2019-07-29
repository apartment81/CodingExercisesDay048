package ro.mirodone;

public class Main {

    public static void main(String[] args) {
	// test code

        JosephusSurvivor js = new JosephusSurvivor();

        System.out.println(js.josephusSurvivor(7, 3));
        System.out.println(js.josephusSurvivor(7, 2));
        System.out.println(js.josephusSurvivor(41, 2));

        JS2 js2 = new JS2();

        System.out.println(js2.josephusSurvivor(41, 2));

    }
}
