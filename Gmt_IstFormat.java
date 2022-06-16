package com.Class.org;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Gmt_IstFormat {
	public static void main(String[]args) {

		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		SimpleDateFormat Date_Format=new SimpleDateFormat("dd/MM/yyy  hh:mm:ss a");
		Date date=new Date();
		String Current_Date_Time=Date_Format.format(date);
		System.out.println(Current_Date_Time);
		/*Calendar Time =Calendar.getInstance();
		System.out.println(Time.getTime());
		System.out.println(Time.getTimeZone());*/
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		SimpleDateFormat Date_Format1=new SimpleDateFormat("dd/MM/yyy  hh:mm:ss a");
		Date date1=new Date();
		String Current_Date_Time1=Date_Format1.format(date1);
		System.out.println(Current_Date_Time1);
		System.out.println();
	}
	}
