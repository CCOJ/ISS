//Written by maten009 and nguy2886
public class ShippingSim{

    static PQ agenda = new PQ();

    //Port(x, y, name, genRate)
    static Port[] portList = {
            new Port(0,0,"Minneapolis",50),
            new Port(0,10,"Saint Paul",50),
            new Port(0,-6000,"Antarctica",10),
            new Port(4000,4000,"Japan",100),
            new Port(6000,5000,"Korea",50),
            new Port(5000,6000,"China",1000),
            new Port(0,1000000,"Moon",0),
            new Port(1000,3000,"Panama",50),
            new Port(2000,2000,"Hawaii",50),
            new Port(3000,3000,"Pirate Town",100)
    };

    //Vessel(name, capacity, speed, cost)
    static Vessel[] vesselList = {
            new Vessel("Canoe", 1000, 10, 1),
            new Vessel("Yacht", 2000, 60, 2000),
            new Vessel("Galleon", 15000, 15, 100),
            new Vessel("Barge", 1000000, 10, 1000),
            new Vessel("Freighter", 2000000, 5, 1000),
            new Vessel("Airplane", 50000, 850, 10000),
            new Vessel("Carrier Pigeon Team", 1000, 10, 0),
            new Vessel("Rocket", 10000, 2000, 100000)
    };

    public static void main(String[] args){
        while (agenda.getCurrentTime() <= 10000){
            agenda.remove().run();
        }
    }
}
