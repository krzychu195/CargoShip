import java.util.UUID;

public class CrewMember {
    private UUID _id;
    private String _name;
    private int _age;

    public CrewMember(){
        _id =  UUID.randomUUID();
    }

    public CrewMember(String name, int age){
        super();
        _id =  UUID.randomUUID();
        _name=name;
        _age=age;
    }
    public UUID getId(){
        return _id;
    }

    @Override
    public String toString() {
        String toReturn = "";
        toReturn += "Crew member: " + _name + " age: " + _age + " id: " + _id;
        return toReturn;
    }
}
