package app;

public class Organization {
    private String name;
    private boolean profitMaking;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setProfitMaking(boolean p) {
        profitMaking = p;
    }

    public boolean getProfitMaking() {
        return profitMaking;
    }

    public String display() {
        return "\nOrganization name:\t" + getName() + "\n" + displayProfitMaking(getProfitMaking())
                + displayTaxPayable(getProfitMaking()) + "\n---------------\n";
    }

    public String displayProfitMaking(boolean profitMaking) {
        if (profitMaking == true) {
            return new String("A profit making organization\n");
        } else {
            return new String("A chairtable organization\n");
        }
    }

    public String displayTaxPayable(boolean profitMaking) {
        if (profitMaking == true) {
            return new String("Tax rate payable: 10%\n");
        } else {
            return new String("Tax rate payable: 2%\n");
        }
    }
}