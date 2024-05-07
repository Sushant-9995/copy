package sushant;
import java.io.*;
import java.net.*;
import java.util.*;
public class InetDemo1 {

	public static void main(String[] args) {
		try {
InetAddress ip=InetAddress.getByName("www.google.com");
			
			System.out.println("Host Name: "+ip.getHostName());
			System.out.println("IP Address: "+ip.getHostAddress());
			
	}
		catch(Exception e) {
			System.out.println(e);
		}

}
}






package sushant;
import java.io.*;
import java.net.*;
import java.util.*;


public class InetDemo2 {

	public static void main(String[] args) {
		try {
		 InetAddress ip=InetAddress.getLocalHost();
		 System.out.println("Host Name :"+ip.getHostName());
		 System.out.println("Host Address :"+ip.getHostAddress());
		 
	}
		catch(Exception e) {
			System.out.println(e);
		}
}
}