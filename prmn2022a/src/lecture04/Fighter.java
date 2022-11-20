package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter fighter){
        fighter.hitPoint = fighter.hitPoint - this.power;
        System.out.println(this.name + "は" + fighter.name + "に" + this.power + "ダメージを与えた。");
        System.out.println(fighter.name + "の残り hitPoint : " + fighter.hitPoint);
    }

    public boolean isAlive(){
        return this.hitPoint > 0;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }
}
