public class InherLesson extends SubClasser {
    
}

final class FinClasser{

}

class SubClasser{

}

abstract class AbsClasser{ 
    
}

abstract class Hero{
    int HP;
    int MP;

    public Hero(int HP, int MP){
        this.HP = HP;
        this.MP = MP;
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
 }

abstract class Range extends Stats{
    int Range;
}

class Ranger extends Hero{

}
