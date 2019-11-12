package app;

public class UseOrganization {
  public static void main(String[] args) throws Exception {

    Organization myOrganization = new Organization();
    myOrganization.setName("Lovely Charity");
    myOrganization.profitMaking = false;

    Organization evilOrganization = new Organization();
    evilOrganization.setName("Evil Empire");
    evilOrganization.profitMaking = true;

    System.out.print(myOrganization.display());
    System.out.print(evilOrganization.display());
  }
}