public class Seamen extends CrewMember {
    private String _jobDescription;

    public Seamen() {
        super();
    }

    public Seamen(String name, int age, String jobDescription) {
        super(name, age);
        this._jobDescription=jobDescription;
    }

    @Override
    public String toString() {
        String toReturn = super.toString();
        toReturn += "position: Seamend jobDescription: " + _jobDescription;
        return toReturn;
    }
}
