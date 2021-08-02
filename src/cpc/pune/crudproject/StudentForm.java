package cpc.pune.crudproject;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

public class StudentForm extends ActionForm {
 private ArrayList<Student> studList;

public ArrayList<Student> getStudList() {
	return studList;
}

public void setStudList(ArrayList<Student> studList) {
	this.studList = studList;
}
 
 
}
