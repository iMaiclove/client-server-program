package serverProject;
import java.io.*;
import java.net.*;
import java.util.InputMismatchException;
public class TCPServer {
		public static void main(String argv[]) {
	        String nameAndBouns,outputToClient;
	        double calculatedBouns=0;
	        String  c= "no employ with that name";
	        
	        employee emp [];
	        emp = new employee[5];
	        employee emp1 = new employee(13,0.12,"fares");
	        employee emp2 = new employee(10,0.10,"ali");
	        emp[0]=emp1;
	        emp[1]=emp2;
	        
	        try {
	        ServerSocket welcomeSocket = new ServerSocket (6789);
	        while(true) {
	        Socket connectionSocket = welcomeSocket.accept();
	        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
	        DataOutputStream outToClient = new DataOutputStream( connectionSocket.getOutputStream());
	        nameAndBouns = inFromClient.readLine();	
	        
	        String part [] = nameAndBouns.split(",");
	        String name = part[0].strip();
	        double amount = Double.parseDouble(part[1].strip());
	        
	        if(emp1.getName().equalsIgnoreCase(name)) {
	        	    calculatedBouns = (((1.0)*amount) * ((1.0)*emp1.getBounsRate()));
	        	    emp1.addSale();
	        		outputToClient= calculatedBouns +"\n";
	        		outToClient.writeBytes("THE BOUNS IS: " +outputToClient+'\n');
	        		}
	        if(emp2.getName().equalsIgnoreCase(name)) {
	        	    calculatedBouns = (((1.0)*amount) *((1.0)*emp2.getBounsRate()));
	        		outputToClient= calculatedBouns +"\n";
	        		emp2.addSale();
	        		outToClient.writeBytes("THE BOUNS IS: " +outputToClient+'\n');
	        		}
	        outputToClient= c+"\n";

        	outToClient.writeBytes(outputToClient+'\n');
	        }
	                }catch (InputMismatchException e) {
	                System.out.println("the input was wrong");
	                }
	        catch (IOException e) {
	                    e.printStackTrace();
	                }
	    }
    }