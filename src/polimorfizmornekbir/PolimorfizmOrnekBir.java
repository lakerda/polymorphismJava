package polimorfizmornekbir;
class Asker{
    public void selamVer(){
        System.out.println("asker selam verdi");
    }
}
class er extends Asker{
    public void selamVer(){
            System.out.println("er selam verdi");
    }
}
class Yuzbasi extends Asker{
    public void selamVer(){
            System.out.println("Y.basi selam verdi");
    }
}
public class PolimorfizmOrnekBir {
    public static void hazirOl(Asker a){
            a.selamVer(); // dikkatttttttttttttttttttttttttttttttt
    }
    public static void main(String[] args) {
        Asker a = new Asker();
        er e = new er();
        Yuzbasi y = new Yuzbasi();       
        hazirOl(a);
        hazirOl(e);
        hazirOl(y);
        hazirOl(a);
    }    
}
