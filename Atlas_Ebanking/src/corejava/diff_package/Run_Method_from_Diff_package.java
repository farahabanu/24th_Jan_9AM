package corejava.diff_package;

import corejava.StaticMethods.TouchActions;
import corejava.regularmethods.RobotActions;

public class Run_Method_from_Diff_package 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> diff package classes to access
		 * 			we need import other package referrals
		 * 			to current class.
		 * 
		 * 		import packagename.classname;
		 * 		import packagename.*;
		 * 
		 * Create object to run methods under class
		 * 
		 * 		Classname obj=new Classname();
		 * 	    obj.methodname();
		 */
		RobotActions obj=new RobotActions();
		obj.run();
		obj.walk();
		obj.jump();
		
		
		//Calling static methods
		TouchActions.singletap();
		TouchActions.doubletap();

	}

}
