import com.github.javafaker.Faker;

public class RandomDataUtility
{
	static Faker faker;
	
	static String fName;
    static String lName;
    static String email;
    static String phoneNumber;
    static String address;
   

    
    public static String getFName(){
        faker=new Faker();
        String fName = faker.name().firstName();
        return fName;
    }
    public static String getLastName() {
    	faker=new Faker();
    	String lName=faker.name().lastName();
		return lName;
    	
    }

    
    public static String getEmail(){
 	   faker = new Faker();
       return faker.internet().emailAddress();
 }
   
    public static String getPhoneNumber(){
        faker=new Faker();
      String phoneNumber = faker.phoneNumber().phoneNumber();
      
        return phoneNumber;
    }
    
    public static String getAddress()
    {
    	  faker=new Faker();
    	  address=faker.address().fullAddress();
		return address;
    }

    public static void main(String args[])
    {
    	
    	//pull request
    	String name=RandomDataUtility.getFName();
    	System.out.println(name);
    	String lname=RandomDataUtility.getFName();
    	System.out.println(lname);
    	String k=RandomDataUtility.getEmail();
    	System.out.println(k);
    	
    	String address=RandomDataUtility.getAddress();
    	System.out.println(address);
    	String phoneNumber=RandomDataUtility.getPhoneNumber();
    	System.out.println(phoneNumber);
    }
    
  
}