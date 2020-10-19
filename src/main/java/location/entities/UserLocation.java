package location.entities;

public class UserLocation {
String lat;
String lon;
int user_id;
public String getLatString() {
	return lat;
}
public void setLatString(String latString) {
	this.lat = latString;
}
public String getLonString() {
	return lon;
}
public void setLonString(String lonString) {
	this.lon = lonString;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}

}
