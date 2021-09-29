package quiz1;

public class hospital {
	String name;
	String location;
	double rating;
	String contact;
	double priceperbed;
	int numofwards;
	ArrayList<ward> wards;
	public:
		hospital(){
		wards=new ArrayList<ward>();
		numofwards=10;
	}
	hospital(String n,String l){
		wards=new ArrayList<ward>();
		numofwards=10;
	}
	void print(){
		System.out.println("hospital details\n"
	+"Name"+name+"\n"
				+"location"+location+"\n"
				+"rating"+rating+"\n"
				+"Contact"+contact+"\n"
				+"priceperbed"+priceperbed+"\n"
				+"numofwards"+numofwards+"\n");
	}

}
