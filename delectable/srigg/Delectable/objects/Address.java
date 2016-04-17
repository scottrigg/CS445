package srigg.Delectable.objects;

public class Address {

	private String street, city, state, zip;
	
	public Address()
	{
		street="111 Street st, Apt 1A";
		city="City";
		state="State";
		zip="10000";
	}
	
	public Address(String strt, String cty, String stte, String zp)
	{
		street = strt;
		city=cty;
		state=stte;
		zip =zp;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public void setStreet(String strt)
	{
		street=strt;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String cty)
	{
		city=cty;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setState(String stte)
	{
		state=stte;
	}
	
	public String getZip()
	{
		return zip;
	}
	
	public void setZip(String zp)
	{
		zip=zp;
	}

	public boolean addressMatch(Address a) {
		// TODO Auto-generated method stub
		if(city.matches(a.getCity())&&street.matches(a.getStreet())&&zip.matches(a.getZip())&&state.matches(a.getState()))
			return true;
		return false;
	}
	
	public String toString()
	{
		return street + ", " + city + " " + state + ", " + zip;
	}
	
}
