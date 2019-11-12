package app;

public class UseOrganization {
  public static void main(String[] args) throws Exception {

    Organization myOrganization = new Organization();
    myOrganization.setName("Lovely Charity");
    myOrganization.setProfitMaking(false);

    Organization evilOrganization = new Organization();
    evilOrganization.setName("Evil Empire");
    evilOrganization.setProfitMaking(true);

    System.out.print(myOrganization.display());
    System.out.print(evilOrganization.display());
  }
}