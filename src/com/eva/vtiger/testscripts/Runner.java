package com.eva.vtiger.testscripts;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrationTestScripts regts=new RegistrationTestScripts();
		regts.validRegistration();
		
		LeadsTestScripts leadsts=new LeadsTestScripts();
		leadsts.verifyCreateLead();
	}

}
