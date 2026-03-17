public class Mentor extends FRCTeamMember {

    private int menteeCount;

    public Mentor() {
        super();
        this.menteeCount = 0;
    }

    public Mentor(String name, String subteam, double hours, int menteeCount) {
        super(name, subteam, hours);
        this.menteeCount = menteeCount;
    }

    public int getMenteeCount() {
        return menteeCount;
    }

    public void setMenteeCount(int menteeCount) {
        this.menteeCount = menteeCount;
    }

    public void addMentee() {
        this.menteeCount++;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mentee Count: " + menteeCount;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Mentee Count: " + menteeCount);
        System.out.println();
    }
}

