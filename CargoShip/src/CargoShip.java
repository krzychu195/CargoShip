import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CargoShip {
    private String _name;
    private final int _maxCapacity;
    private int _currentCrewMembersNumber;
    private List<CrewMember> crew = new ArrayList<>();

    CargoShip(String name, int maxCapacity){
        _name=name;
        _maxCapacity=maxCapacity;
    }

    public void addCrewMember(CrewMember crewMember){
        if(_currentCrewMembersNumber<_maxCapacity){
            crew.add(crewMember);
            _currentCrewMembersNumber++;
        }
        else
            throw new ArrayIndexOutOfBoundsException("Reached maximum size of Crew");
    }

    public void removeMember(CrewMember crewMember){
        if(_currentCrewMembersNumber!=0) {
            crew.remove(crewMember);
            _currentCrewMembersNumber--;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Can't reach negative index value. No crew members");
        }
    }

    public void Empty(){
        crew.clear();
    }

    public CrewMember getCrewMember(UUID id){
        for(CrewMember member : crew){
            if(member.getId()==id)
                return member;
        }
        throw new ArrayIndexOutOfBoundsException("Crew member not found");
    }

    public int getCapacity(){
        return _maxCapacity;
    }

    public int getEmptySlots(){
        return _maxCapacity-_currentCrewMembersNumber;
    }
    public int getTakenSlots(){
        return _currentCrewMembersNumber;
    }

    @Override
    public String toString() {
        String toReturn="";
        for (CrewMember member : crew){
            toReturn += member.toString() + "\n";
        }
        return toReturn;
    }
}
