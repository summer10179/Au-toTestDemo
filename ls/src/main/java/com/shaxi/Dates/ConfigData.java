package com.shaxi.Dates;

import com.qa.base.GetPSDSESSION;
import org.testng.annotations.Test;

public class ConfigData {
       public  static String  host="http://172.19.188.179:8070/";
//       设置静态常量数据
       public static String  host1="http://172.19.201.40:9080/shxjc-server/";
       public static String Cookies="PSDSESSION=eacc7bcb-9625-4910-a7c2-fca1deea9ebc; EUNOMIASESSIONID=66e55db2-10b8-4c88-bc22-96b3f9c5e5a8";
       public static String Cookies1="JSESSIONID=21970B22B7C9E13025874515BCF5CCD8; PSDSESSION=b03bb0c7-3568-47b9-9dd8-5d329e6f4e42";
@Test
public void gerCookie(){
       GetPSDSESSION getPSDSESSION1=new GetPSDSESSION();
       String str=getPSDSESSION1.getPSDSESSION();
       System.out.println(str);
}
}
