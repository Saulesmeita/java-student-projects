package lv.javaguru.lesson3;

import lv.javaguru.lesson3.FilisDomesticus;

public class CatDemo {
    public static void main(String[] args) {

        FilisDomesticus cat1 = new FilisDomesticus("Rudy", 3, true, "grey", 3.5);
        cat1.setLazy(true);
        FilisDomesticus cat2 = new FilisDomesticus("Blacky", 1, false, "black and white", 0.99);
        cat2.setLazy(false);

        cat1.weightMyCat();
        cat1.jump(150);
        cat1.jump(200);
        cat1.jump(120);
        cat1.sum(5, 8);
        cat1.sub (88, 76);

        cat2.weightMyCat();
        cat2.jump(70);
        cat2.sub(134, 85);

    }
}
