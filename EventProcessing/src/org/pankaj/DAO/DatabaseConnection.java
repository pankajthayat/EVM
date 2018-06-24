package org.pankaj.DAO;

import java.sql.*;

import org.pankaj.POJO.*;

public class DatabaseConnection {

	public Statement getStatement() throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank","root", "pankaj");
	Statement statement=con.createStatement();
	return statement;
	}
	
	public EventRate getEventRate(String eventType) throws ClassNotFoundException, SQLException
	{
        Statement statement=getStatement();
		//statement.executeQuery("");
		ResultSet result=statement.executeQuery("select * from event_rate");
		EventRate eventRate=null;
		while(result.next())
		{
			if(eventType.equalsIgnoreCase(result.getString(1)))
			eventRate=new EventRate(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5));
		}
		return eventRate;
	}
	
	public void setRatedEvent(RatedEvent ratedEvent) throws ClassNotFoundException, SQLException
	{
	Statement statement=getStatement();	
	String a1=ratedEvent.getEventType();String a2=ratedEvent.getTargetResources(); String a3=ratedEvent.getEventStartTime(); String a4=ratedEvent.getEventUnitConsumed();String a5=ratedEvent.getTotalCharge();
	String s="insert into rated_event values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"');";
	System.out.println(s);
	statement.executeUpdate("insert into rated_event values('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"');");
	System.out.println("rated event");
	}
	
	public void setRejectedEvent(RejectedEvent rejectedEvent) throws ClassNotFoundException, SQLException
	{
		Statement statement=getStatement();	
		String s="insert into rated_event values ('"+rejectedEvent.getEventType()+"','"+rejectedEvent.getTargetResources()+"','"+rejectedEvent.getEventStartTime()+"','"+rejectedEvent.getEventUnitConsumed()+"','"+rejectedEvent.getRejectionReason()+"');";
		System.out.println(s);
		statement.executeQuery("insert into rated_event values ('"+rejectedEvent.getEventType()+"','"+rejectedEvent.getTargetResources()+"','"+rejectedEvent.getEventStartTime()+"','"+rejectedEvent.getEventUnitConsumed()+"','"+rejectedEvent.getRejectionReason()+"');");
	}
	
}
