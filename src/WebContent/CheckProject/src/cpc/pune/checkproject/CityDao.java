package cpc.pune.checkproject;

import java.util.ArrayList;

public class CityDao {

	public void getCityInfo(CheckForm checkForm) {

		String arr[ ]=checkForm.getcList();
		ArrayList<City> cityList=new ArrayList<City>();
		
		City c=null;
		
		for(int i=0; i<arr.length; i++)
		{
	     c=new City();
	     
	     if(arr[i].equals("Pune"))
	     {
	       c.setCid("C1");
	       c.setCname("Pune");
	       c.setPopulation("1000000");
	     }
	     else if(arr[i].equals("Mumbai"))
	     {
	       c.setCid("C2");
	       c.setCname("Mumbai");
	       c.setPopulation("2000000");
	     }
	     else if(arr[i].equals("Kolkata"))
	     {
	       c.setCid("C3");
	       c.setCname("Kolkata");
	       c.setPopulation("3000000");
	     }
	     
	     cityList.add(c);
		}
		
		checkForm.setCityList(cityList);
	}

}
