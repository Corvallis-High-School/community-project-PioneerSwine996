class Main {

  public static void main(String[] args) {
    FRCTeamMember m1 = new FRCTeamMember("Aidan", "Programming", 42.5);
    FRCTeamMember m2 = new FRCTeamMember("Oskar", "Electrical", 30.0);

    m1.print();
    m2.print();

    System.out.println("m1 Name: " + m1.getName());
    System.out.println("m2 Subteam: " + m2.getSubteam());

    m2.setSubteam("Fabrication");
    System.out.println("m2 New Subteam: " + m2.getSubteam());

    m1.addHours(3.5);
    System.out.println("m1 New Hours: " + m1.getHours());

    System.out.println(m1.toString());
    System.out.println(m2.toString());
  }
}