package day11.task2;

public class Warrior extends Hero implements PhysAttack{


    public Warrior() {
        physDef = 0.8;
        physAtt = 30;
        magicDef = 0;
    }

    @Override
    public String toString() {
        return "Герой - воин, здоровья:" + health;
    }


}
