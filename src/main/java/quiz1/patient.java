package quiz1;

public class patient {
	private:
String name;
String gender;
public:
	patient(String n,String g){
	name=n;
	gender=g;
}
printPatient(){
	System.out.println("patient details\n"
+"name"+name+"\n");
}
}
