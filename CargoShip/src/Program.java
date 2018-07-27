import java.io.IOException;

public class Program {
    public static void main(String[] args){
        CargoShip cargoShip = new CargoShip("BlackPearl", 3);
        CrewMember WillTurner = new Seamen("Will Turner", 16, "Cargo");
        cargoShip.addCrewMember(new Officer("Jack Sparrow", 12, "Captain"));
        cargoShip.addCrewMember(WillTurner);

        System.out.println(cargoShip);

        cargoShip.removeMember(WillTurner);

        System.out.println(cargoShip);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
