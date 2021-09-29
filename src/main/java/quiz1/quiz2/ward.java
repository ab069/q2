package quiz1;

public class ward {
	private:
String name;
int cap;
String gendertype;int currentpatient;
public:
	ward(String n,int c,String g){
	name=n;
	cap=c;
	gendertype=g;
}

int ShowPatient(){
	return currentpatient;
}
int bedsAvailable() {
	return cap-currentpatient;
}
boolean Addpatient() {
	
}
}
