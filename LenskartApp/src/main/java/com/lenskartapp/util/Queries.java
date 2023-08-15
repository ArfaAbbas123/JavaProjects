package com.lenskartapp.util;

public class Queries {
	public static final String CREATEQUERY=
			"create table lens(lensBrand varchar(20),category varchar(20),"
			+ "lensId integer primary key,price double)";
	
	public static final String UPDATEQUERY=
			"update lens set price=? where lensId=?";
	public static final String DELETEQUERY=
			"delete from lens where lensId=?";
	
	public static final String INSERTQUERY=
			"insert into lens(lensBrand,category,lensId,price) values(?,?,?,?)";
	
	public static final String QUERY=
			"select * from lens";
	
	public static final String QUERYBYID=
			"select * from lens where lensId=?";
	
	public static final String QUERYBYLENSBRAND=
			"select * from lens where lensBrand like ?";
			
	public static final String QUERYBYCATEGORY=
			"select * from lens where category like ?";
	
	
	public static final String QUERYBYLENSBRANDANDCATEGORY=
			"select * from lens where lensBrand like %?% and category like ?";

	
	public static final String QUERYBYLENSBRANDANDPRICE=
			"select * from lens where lensBrand like %?% and price like ?";

}
