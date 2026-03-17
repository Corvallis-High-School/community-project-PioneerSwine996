public class FRCTeamMember
{
    protected String name;
    protected String subteam;
    protected double hours;

    public FRCTeamMember() {
        this.name = "Unknown";
        this.subteam = "Unassigned";
        this.hours = 0.0;
    }

    public FRCTeamMember(String n, String s, double h) {
        name = n;
        subteam = s;
        hours = h;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Subteam: " + subteam);
        System.out.println("Hours Logged: " + hours);
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public String getSubteam() {
        return subteam;
    }

    public double getHours() {
        return hours;
    }
    
    public void setName(String newName) {
        name = newName;
    }

    public void setSubteam(String newSubteam) {
        subteam = newSubteam;
    }
    
    public void setHours(double newHours) {
        hours = newHours;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Subteam: " + subteam +
               ", Hours: " + hours;
    }

    public void addHours(double moreHours) {
        hours += moreHours;
    }
}