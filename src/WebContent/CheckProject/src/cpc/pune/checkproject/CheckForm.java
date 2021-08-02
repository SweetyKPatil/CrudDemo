package cpc.pune.checkproject;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

public class CheckForm extends ActionForm {
 private String[ ] cList;
 private ArrayList<City> cityList;
 
public String[] getcList() {
	return cList;
}
public void setcList(String[] cList) {
	this.cList = cList;
}
public ArrayList<City> getCityList() {
	return cityList;
}
public void setCityList(ArrayList<City> cityList) {
	this.cityList = cityList;
}
 
 
 
}
