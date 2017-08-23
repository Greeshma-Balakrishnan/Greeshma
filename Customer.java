import java.util.Set;

public class Customer {

	int customerId;
	String name,city,phone,email;
	
	
	public Customer(int cid,String n,String c,String p,String em){
		customerId = cid;
		name = n;
		city = c;
		phone = p;
		email = em;
	}
	

	public Customer(){
		
	}
	
	public String getCity() {
		return city;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		Customer c = (Customer)obj;
		
		if(customerId!=c.customerId)
			return false;
		

		if(name!=null&&c.name!=null&&!name.equals(c.name))
			return false;
		if((name==null||c.name==null)&&(name!=null||c.name!=null))
			return false;
		
		if(city!=null&&c.city!=null&&!city.equals(c.city))
			return false;
		if((city==null||c.city==null)&&(city!=null||c.city!=null))
			return false;
		
		if(phone!=null&&c.phone!=null&&!phone.equals(c.phone))
			return false;
		if((phone==null||c.phone==null)&&(phone!=null||c.phone!=null))
			return false;
			


		if(email!=null&&c.email!=null&&!email.equals(c.email))
			return false;
		if((email==null||c.email==null)&&(email!=null||c.email!=null))
			return false;
		
		return true;

		
	};

}
