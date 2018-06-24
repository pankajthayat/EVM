package org.pankaj.threads;

import java.util.*;
import java.io.IOException;
import java.sql.SQLException;

import org.pankaj.calculation.Calculation;
import org.pankaj.fileHandle.ReadFolder;

public class MyThread implements Runnable {
@Override
public void run() {
	List list=null;
	ReadFolder rf=new ReadFolder();
	try 
	{
	list =rf.readfiles();
	} 
	catch (Exception e) {
		System.out.println(e);  e.printStackTrace();
	} 
	
Calculation cal=new Calculation();
try {
	cal.calculate(list);
} catch (ClassNotFoundException | SQLException e) {

	e.printStackTrace();
}
	
	
}


}
