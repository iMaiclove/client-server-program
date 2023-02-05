package clientProject;

import java.io.*;
import java.net.*;

public class TCPClient {

    public static void main(String[] args) {
    	String nameAndBouns,inputFromServer;
		try {
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocket = new Socket("localhost" , 6789);
		DataOutputStream outToServer = new DataOutputStream( clientSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		
		System.out.println("WELCOM TO BOUNS CALCULATOR");
		System.out.println("ENTER YOUR NAME AND AMOUNT OF SALE LIKE THIS - name,price -:");
		
		nameAndBouns = inFromUser.readLine();
		outToServer.writeBytes(nameAndBouns + '\n');
		inputFromServer = inFromServer.readLine();
		System.out.println(inputFromServer+" SR" );
		clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
        	   
           }

    
