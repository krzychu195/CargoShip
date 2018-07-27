public class Officer extends CrewMember{
    private String _rank;
    public Officer(){
        super();
    }

    public Officer(String name, int age, String rank) {
        super(name, age);
        _rank=rank;
    }

    @Override
    public String toString() {
        String toReturn = super.toString();
        toReturn += "position: Officer rank: " + _rank;
        return toReturn;
    }
}
