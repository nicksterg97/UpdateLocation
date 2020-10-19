package location.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ambulance")
public class Ambulance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ambulance_id")
	private int ambulance_id;

	@Column(name = "user_name")
	private String userName; //gia username tha valoyme ton arithmo tou asthenoforou

	@Column(name = "password")
	private String password;
	
	@Column(name = "license_plate")
	private String licensePlate;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "imei")
	private String imei;
	

	@Column(name = "is_active")
	private Integer isActive;

	@Column(name = "registration_date")
	private String registrationDate;

	@Column(name = "lat")
	private double lat;

	@Column(name = "lon")
	private double lon;
	

	public Ambulance() {
		super();
	}

	
	

	public String getImei() {
		return imei;
	}




	public void setImei(String imei) {
		this.imei = imei;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public int getAmbulance_id() {
		return ambulance_id;
	}


	public void setAmbulance_id(int ambulance_id) {
		this.ambulance_id = ambulance_id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLicensePlate() {
		return licensePlate;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}


	


	public Integer getIsActive() {
		return isActive;
	}


	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}


	public String getRegistrationDate() {
		return registrationDate;
	}


	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}


	public double getLat() {
		return lat;
	}


	public void setLat(double lat) {
		this.lat = lat;
	}


	public double getLon() {
		return lon;
	}


	public void setLon(double lon) {
		this.lon = lon;
	}

	@Override
	public String toString() {
		return "Ambulance [ambulance_id=" + ambulance_id + ", userName=" + userName + ", password=" + password
				+ ", licensePlate=" + licensePlate + ", city=" + city + ", imei=" + imei + ", isActive=" + isActive
				+ ", registrationDate=" + registrationDate + ", lat=" + lat + ", lon=" + lon + "]";
	}	 

}
