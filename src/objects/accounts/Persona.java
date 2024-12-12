package objects.accounts;

public class Persona {

	private String name;
	private String surname;
	private String idString;
	private String idType;
	private String[] dayOfBirth;
	private String[] adress;
	private String phoneNumber;
	private String email;
	private String civilStatus;

	public Persona(String name, String surname, String idString, String idType, String[] dayOfBirth, String[] adress, String phoneNumber, String email, String civilStatus) {
		this.name = name;
		this.surname = surname;
		this.idString = idString;
		this.idType = idType;
		this.dayOfBirth = dayOfBirth;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.civilStatus = civilStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdString() {
		return idString;
	}

	public void setIdString(String idString) {
		this.idString = idString;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String[] getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(String[] dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
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

	public String getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	@Override
	//Doc: Save format: name - surname - idString - idType - BithYear - BirthMonth - BirthDay - Adress - phoneNumber - email - marital
	//Doc: Address format: Region - Provincia - Distrito - Calle
	public String toString() {
		return getName() + "\n" + getSurname() + "\n" + getIdString() + "\n" + getIdType() + "\n" + getDayOfBirth()[0] + "\n" + getDayOfBirth()[1] + "\n" + getDayOfBirth()[2] + "\n" + getAdress()[0] + "\n" + getAdress()[1] + "\n" + getAdress()[2] + "\n" + getAdress()[3] + "\n" + getPhoneNumber() + "\n" + getEmail() + "\n" + getCivilStatus();
	}
}
