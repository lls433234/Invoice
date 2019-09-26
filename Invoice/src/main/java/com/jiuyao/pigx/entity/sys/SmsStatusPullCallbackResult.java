package com.jiuyao.pigx.entity.sys;

import java.util.ArrayList;

public class SmsStatusPullCallbackResult {
	 public class Callback{
		public String user_receive_time;
		 public String nationcode;
		 public String mobile;
		 public String report_status;
		 public String errmsg;
		 public String description;
		 public String sid;
		public String toString(){
			return String.format("\t"
					+"user_receive_time:%s\t"
					+"nationcode:%s\t"
					+"mobile:%s\t"
					+"errmsg:%s\t"
					+"report_status:%s\t"
					+"description:%s\t"
					+"sid:%s\t",
					user_receive_time, 
					nationcode,
					mobile,
					report_status,
					errmsg,
					description,
					sid
					
		 );
		}
	}
	
	public int result;
	public String errmsg;
	public int count;
	public ArrayList<Callback> callbacks;
	
	
	public String toString() {
			return String.format("SmsStatusPullCallbackResult:\n"
					+"result:%d\n"
					+"errmsg:%s\n"
					+"count:%d\n"
					+"callbacks:%s\n",
					result, 
					errmsg,
					count,
					callbacks.toString()
		 );
	}
}

