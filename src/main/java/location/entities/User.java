package location.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author xdfg
 *
 */
@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int user_id;

	@Column(name="name")
	private String name;

	@Column(name="surname")
	private String surname;

	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;

	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;

	@Column(name="phone")
	private String phone;

	@Column(name="role_user")
	private String roles;

	@Column(name="user_name")
	private String userName;

	@Column(name="is_active")
	private Integer isActive;
	
	@Column(name="registration_date")
	private String registrationDate;


	@Column(name="firebase_token")
	private String firebaseToken;
	
	@Column(name="blood_type")
	private String bloodType;
	
	@Column(name="disease")
	private String disease;
	
	@Column(name="alergies")
	private String alergies;
	
	@Column(name="medicines")
	private String medicines;
	
	@Column(name="counter_contacts")
	private int counterContacts;
	
	@Column(name="counter_incidents")
	private int counterIncidents;
	
	@Column(name="counter_directions")
	private int counterDirections;
	
	@Column(name="photo")
	private String photo;

	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="periphery")
	private String periphery;
	
	
	@Column(name="department")
	private String department;
	
	@Column(name="municipality")
	private String municipality;
	
	@Column(name="lat")
	private Double lat;
	
	@Column(name="lon")
	private Double lon;
	
	
	
	@Column(name="age")
	private String age;
	
	@Column(name="gender")
	private String gender;
	
	
	@Column(name="clinic")
	private String clinic;
	
	@Column(name="cluster_municipality")
	private String clusterMunicipality;
	
	

	public User() {
		super();
	}
	

	
	
	


	public String getClusterMunicipality() {
		return clusterMunicipality;
	}







	public void setClusterMunicipality(String clusterMunicipality) {
		this.clusterMunicipality = clusterMunicipality;
	}







	public String getAge() {
		return age;
	}




	public void setAge(String age) {
		this.age = age;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getAlergies() {
		return alergies;
	}

	public void setAlergies(String alergies) {
		this.alergies = alergies;
	}

	public String getMedicines() {
		return medicines;
	}

	public void setMedicines(String medicines) {
		this.medicines = medicines;
	}

	public String getFirebaseToken() {
		return firebaseToken;
	}

	public void setFirebaseToken(String firebaseToken) {
		this.firebaseToken = firebaseToken;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	//ok


	public User(int user_id, String name, String surname, String email, String password, String city, String phone,
			String roles, String userName, Integer isActive, String registrationDate, String firebaseToken,
			String bloodType, String disease, String alergies, String medicines, int counterContacts,int counterIncidents, int counterDirections,String country,String photo,String phoneNumber,String periphery,String age,String gender,String municipality,String department,String clinic ) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.city = city;
		this.phone = phone;
		this.roles = roles;
		this.userName = userName;
		this.isActive = isActive;
		this.registrationDate = registrationDate;
		this.firebaseToken = firebaseToken;
		this.bloodType = bloodType;
		this.disease = disease;
		this.alergies = alergies;
		this.medicines = medicines;
		this.counterContacts=counterContacts;
		this.counterIncidents=counterIncidents;
		this.counterDirections=counterDirections;
		this.country=country;
		this.photo=photo;
		this.phoneNumber=phoneNumber;
		this.periphery=periphery;
		this.age=age;
		this.gender=gender;
		this.municipality=municipality;
		this.department=department;
		this.clinic=clinic;
	}
	
	
	

	public String getClinic() {
		return clinic;
	}







	public void setClinic(String clinic) {
		this.clinic = clinic;
	}







	public int getCounterContacts() {
		return counterContacts;
	}


	public void setCounterContacts(int counterContacts) {
		this.counterContacts = counterContacts;
	}


	public int getCounterIncidents() {
		return counterIncidents;
	}


	public void setCounterIncidents(int counterIncidents) {
		this.counterIncidents = counterIncidents;
	}


	public int getCounterDirections() {
		return counterDirections;
	}


	public void setCounterDirections(int counterDirections) {
		this.counterDirections = counterDirections;
	}


	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
//ok

	public String getPeriphery() {
		return periphery;
	}



	public void setPeriphery(String periphery) {
		this.periphery = periphery;
	}



	



	public String getDepartment() {
		return department;
	}




	public void setDepartment(String department) {
		this.department = department;
	}




	public String getMunicipality() {
		return municipality;
	}




	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}




	public Double getLat() {
		return lat;
	}




	public void setLat(Double lat) {
		this.lat = lat;
	}




	public Double getLon() {
		return lon;
	}




	public void setLon(Double lon) {
		this.lon = lon;
	}




	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", password=" + password + ", city=" + city + ", country=" + country + ", phone=" + phone + ", roles="
				+ roles + ", userName=" + userName + ", isActive=" + isActive + ", registrationDate=" + registrationDate
				+ ", firebaseToken=" + firebaseToken + ", bloodType=" + bloodType + ", disease=" + disease
				+ ", alergies=" + alergies + ", medicines=" + medicines + ", counterContacts=" + counterContacts
				+ ", counterIncidents=" + counterIncidents + ", counterDirections=" + counterDirections + ", photo="
				+ photo + ", phoneNumber=" + phoneNumber + ", periphery=" + periphery + "]";
	}



	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}
	

	
	

	
		
}





