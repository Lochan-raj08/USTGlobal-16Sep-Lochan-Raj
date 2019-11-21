package com.ustglobal.studentapp.qspiders;

//import com.ustglobal.studentapp.jspiders.Angular;
//import com.ustglobal.studentapp.jspiders.React;

import com.ustglobal.studentapp.jspiders.*;

public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQTP();
		
		selenium se = new selenium();
		se.techSelenium();
		
//		com.ustglobal.studentapp.jspiders.Angular a = new com.ustglobal.studentapp.jspiders.Angular();
//		a.techAngular();
//		
//		com.ustglobal.studentapp.jspiders.Angular b = new com.ustglobal.studentapp.jspiders.Angular();
//		fully qualified class name
		
		
		Angular a = new Angular();
		a.techAngular();
		
		React r = new React();
		r.teachReact();
	}
	
	

}
