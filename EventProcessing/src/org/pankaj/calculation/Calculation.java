package org.pankaj.calculation;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.pankaj.DAO.DatabaseConnection;
import org.pankaj.POJO.*;

public class Calculation {

	public void calculate(List list) throws ClassNotFoundException, SQLException
	{
		DatabaseConnection dc=new DatabaseConnection();
		for(Object obj:list)
		{
			if(obj instanceof Gsm)
			{
			Gsm gsm=(Gsm)obj;
			EventRate er=dc.getEventRate("gsm");
			float unitConsumed =Float.parseFloat(gsm.getCallDuration())/ Float.parseFloat(er.getUnitAmount());
			float totalCharge=unitConsumed*Float.parseFloat(er.getUnitRate());
			String tc=String.format("%.4f", totalCharge);
			String uc=String.format("%.4f", unitConsumed);
			RatedEvent ratedEvent=new RatedEvent(gsm.getEventType(), gsm.getCaller(), gsm.getEventStratTime(),uc , tc);
			dc.setRatedEvent(ratedEvent);
			
			}
			else if(obj instanceof Gprs)
			{
				Gprs gprs=(Gprs)obj;
				EventRate er=dc.getEventRate("gprs");
				float unitConsumed =Float.parseFloat(gprs.getDataConsumed())/ Float.parseFloat(er.getUnitAmount());
				float totalCharge=unitConsumed*Float.parseFloat(er.getUnitRate());
				String tc=String.format("%.4f", totalCharge);
				String uc=String.format("%.4f", unitConsumed);
				RatedEvent ratedEvent=new RatedEvent(gprs.getEventType(), gprs.getTargetSource(), gprs.getEventStartTime(),uc , tc);
				dc.setRatedEvent(ratedEvent);
			}
			else if(obj instanceof Sms)
			{
				Sms sms=(Sms)obj;
				EventRate er=dc.getEventRate("sms");
				float unitConsumed =Float.parseFloat(sms.getNumberOfChars())/ Float.parseFloat(er.getUnitAmount());
				float totalCharge=unitConsumed*Float.parseFloat(er.getUnitRate());
				String tc=String.format("%.4f", totalCharge);
				String uc=String.format("%.4f", unitConsumed);
				RatedEvent ratedEvent=new RatedEvent(sms.getSms(), sms.getReciever(),sms.getEventStartTime(),uc , tc);
				dc.setRatedEvent(ratedEvent);
			}
		}
			
	}
}
