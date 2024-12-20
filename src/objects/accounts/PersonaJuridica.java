package objects.accounts;

public class PersonaJuridica {

    private String companyName;
    private String ruc;
    private String[] adress;
    private String phoneNumber;
    private String email;
    private Persona representative;
    private String incorporationDoc;

    public PersonaJuridica(String companyName, String ruc, String[] adress, String phoneNumber, String email, Persona representative, String incorporationDoc) {
        this.companyName = companyName;
        this.ruc = ruc;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.representative = representative;
        this.incorporationDoc = incorporationDoc;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String[] getAdress() {
        return adress;
    }

    public void setAdress(String[] adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona getRepresentative() {
        return representative;
    }

    public void setRepresentative(Persona representative) {
        this.representative = representative;
    }

    public String getIncorporationDoc() {
        return incorporationDoc;
    }

    public void setIncorporationDoc(String incorporationDoc) {
        this.incorporationDoc = incorporationDoc;
    }

    //Doc: Save format: name - ruc - adress - phoneNumber - email -  inc. doc.
    //Doc: Address format: Region - Provincia - Distrito - Calle
    @Override
    public String toString() {
        return getCompanyName() + "\n" + getRuc() + "\n" + getAdress()[0] + "\n" + getAdress()[1] + "\n" + getAdress()[2] + "\n" + getAdress()[3] + "\n" + getPhoneNumber() + "\n" + getEmail() + "\n" + getIncorporationDoc() + "\n" + getRepresentative().toString();
    }
}
