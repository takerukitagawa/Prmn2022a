package lecture05;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {
    public static void main(String[] args) {
        List<Insect> insectlist;
        insectlist = new ArrayList<>();

        Insect insect = new Insect();
        Butterfly butterfly = new Butterfly();
        Locust locust = new Locust();
        SwallowtailButterfly swallowtailButterfly = new SwallowtailButterfly();

        insectlist.add(insect);
        insectlist.add(butterfly);
        insectlist.add(locust);
        insectlist.add(swallowtailButterfly);

        for(Insect insect1 : insectlist){
            insect1.move();
        }
    }
}
