public class InherLesson {
    public static void main(String[] args) {
        Ranger ranger = new Ranger(100, 200, 150, 50, 50, 100);
        ranger.displayStats();
        ranger.attack();
        ranger.specialSkill();
    }
}

abstract class Hero{
    int HP;
    int MP;

    public Hero(int HP, int MP){
        this.HP = HP;
        this.MP = MP;
     }
    
     public void displayStats(){
        System.out.println("HP: " + HP + ", MP: " + MP);
     }
 }

 abstract class Stats extends Hero{
    int Str;
    int Intel;
    int Dex;

    public Stats(int HP, int MP, int Str, int Intel, int Dex){
        super(HP, MP);
        this.Str = Str;
        this.Intel = Intel;
        this.Dex = Dex;

    }
    @Override
    public void displayStats(){
        super.displayStats();
        System.out.println("Str: " + Str + " Intelligence: " + Intel + " Dex: " + Dex );
     }
 }

abstract class Range extends Stats{
    int Range;

    public Range(int Range, int HP, int MP, int Str, int Intel, int Dex){
        super(HP, MP, Str, Intel, Dex);
        this.Range = Range;
    }
}

class Ranger extends Range{
    public Ranger(int Range, int HP, int MP, int Str, int Intel, int Dex) {
        super(Range, HP, MP, Str, Intel, Dex);
    }

    void attack(){
        System.out.println("Ranger attacks with a ranged attack!");
    }

    public void specialSkill() {
        System.out.println("Ranger uses a special skill!");
    }
}



