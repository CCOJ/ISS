/**
 * Created by sam on 4/6/17.
 */
public class ShippingSim{

    static PQ agenda = new PQ();

    static Port[] portList = {
            new Port(0,0,"Minneapolis",5),
            new Port(0,10,"Saint Paul",5),
            new Port(0,-6000,"Antarctica",1),
            new Port(4000,4000,"Japan",10),
            new Port(6000,5000,"Korea",5),
            new Port(5000,6000,"China",100),
            new Port(0,1000000,"Moon",0),
            new Port(1000,3000,"Panama",5),
            new Port(2000,2000,"Hawaii",5),
            new Port(3000,3000,"Pirate Town",10)
    };

    public static void main(String[] args){
        while (agenda.getCurrentTime() <= 10000){
            agenda.remove().run();
        }
    }
}
