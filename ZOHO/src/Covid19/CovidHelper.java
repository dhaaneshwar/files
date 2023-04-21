package Covid19;
import java.util.*;
class CovidHelper{
	 public static void main(String[] args){
	 System.out.println("\n\nWelcome to Covid Helper :)");
	 
	 // sample inputs
	 
	 //zone
	 System.out.println("Creating zones...");
	 ArrayList<Zone> zoneList = new ArrayList<Zone>();
	 for(int i=1; i<=5; i++){
	 zoneList.add(new Zone());
	 }
//	 for(int i=0; i<5; i++){
//	 System.out.println(zoneList.get(i));
//	 }
	 
	 for(Zone z:zoneList) {
		 System.out.println(z);
	 }
	 System.out.println("Zones created...");
	 
	 //streets
	 System.out.println("Creating streets inside zones...");
	 ArrayList<Street> streetList = new ArrayList<Street>();
	 char s_name ='A';
	 for(int i=0; i<5; i++){
		 for(int j=0; j<2; j++){
			 streetList.add(new Street(i, s_name +""+s_name));
			 s_name++;
		 }
	 }
	 
	 for(Street s: streetList){
	 System.out.println(s);
	 } 
	 
	 System.out.println("Creating hospitals inside zones...");
	 ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();
	 char h_name ='a';
	 boolean temp = true;
	 int x=1;
	 for(Zone z: zoneList){
		 hospitalList.add(new Hospital(h_name + ""+h_name,temp, x++ ));
		 h_name++;
		 temp = !temp;
	 }
	 for(Hospital h: hospitalList){
	 System.out.println(h);
	 }
	 System.out.println("Hospitals Created...");
	 
	 
	 // users
	 
	 System.out.println("Creating users inside streets in zones...");
	 
	 ArrayList<User> userList= new ArrayList<User>();
	 char u_name = 'a';
	 String _u_email ="person@gmail.com";
	 char u_email = 'a';
	 
	 for(Street s: streetList){
		 for(int i=0; i<2; i++){
			 	userList.add(new User(u_email+""+_u_email, u_name +""+u_name, s.zoneId, s.streetId));
			 	u_name++;
			 	u_email++;
		 }
	 }
	  for(User u: userList){
		  System.out.println(u);
	 }
	 System.out.println("Users created");
	 
	 // Test data
	 System.out.println("Creating test data");
	 
	 ArrayList<TestData> testDataList= new ArrayList<TestData>();
	 int startHospitalId = 1;
	 boolean home = true;
	 
	 for(int i=1; i<=userList.size(); i+=2){
		 testDataList.add(new TestData(userList.get(i).userEmail, startHospitalId++,home));
		 home = !home;
		 if(startHospitalId> hospitalList.size()){
			 startHospitalId = 1;
		 }
	 }
	 
	 for(TestData td: testDataList){
	 System.out.println(td);
	 }
	 
	 System.out.println("Test data created..."); 
	 }
	}
