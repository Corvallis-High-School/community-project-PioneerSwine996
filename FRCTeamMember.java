public class FRCTeamMember
{
    private String name;
    private String subteam;
    private double hours;
    private final int teamNumber = 955;

    public FRCTeamMember(String n, String s, double h) {
        name = n;
        subteam = s;
        hours = h;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Subteam: " + subteam);
        System.out.println("Hours Logged: " + hours);
        System.out.println("Team Number: " + teamNumber);
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

    public int getTeamNumber() {
        return teamNumber;
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

    public String toString() {
        return "Name: " + name + ", Subteam: " + subteam +
               ", Hours: " + hours + ", Team Number: " + teamNumber;
    }

    public void addHours(double moreHours) {
        hours += moreHours;
    }
}