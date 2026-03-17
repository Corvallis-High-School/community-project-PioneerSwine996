import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
    ArrayList<FRCTeamMember> members = new ArrayList<>();

    members.add(new FRCTeamMember("Aidan", "Programming", 42.5));
    members.add(new FRCTeamMember("Oskar", "Electrical", 30.0));
    members.add(new Mentor("Alex", "Programming", 12.5, 3));
    members.add(new Student("Jamie", "Mechanical", 8.0, 3.8));

    System.out.println("--- All Members (using ArrayList) ---");
    printMembers(members);

    System.out.println("--- Search Results for name 'Jamie' ---");
    findAndPrint(members, "Jamie");

    System.out.println("--- Search Results for subteam 'Programming' ---");
    findAndPrintBySubteam(members, "Programming");

    System.out.println("--- Modify a Student and Mentor from list ---");
    for (FRCTeamMember m : members) {
      if (m.getName().equalsIgnoreCase("Jamie") && m instanceof Student) {
        Student s = (Student) m;
        s.study(2.0);
        System.out.println("After study: " + s.toString());
      }
      if (m.getName().equalsIgnoreCase("Alex") && m instanceof Mentor) {
        Mentor mt = (Mentor) m;
        mt.addMentee();
        System.out.println("After addMentee: " + mt.toString());
      }
    }
  }

  public static void printMembers(ArrayList<FRCTeamMember> list) {
    for (FRCTeamMember member : list) {
      member.print();
    }
  }

  public static void findAndPrint(ArrayList<FRCTeamMember> list, String name) {
    boolean found = false;
    for (FRCTeamMember member : list) {
      if (member.getName().equalsIgnoreCase(name)) {
        System.out.println(member.toString());
        found = true;
      }
    }
    if (!found) {
      System.out.println("No member found with name: " + name);
    }
  }

  public static void findAndPrintBySubteam(ArrayList<FRCTeamMember> list, String subteam) {
    boolean found = false;
    for (FRCTeamMember member : list) {
      if (member.getSubteam().equalsIgnoreCase(subteam)) {
        System.out.println(member.toString());
        found = true;
      }
    }
    if (!found) {
      System.out.println("No members found in subteam: " + subteam);
    }
  }
}