package Testing;
public class MainClass {
    DatabaseDAO database;
    NetworkDAO network;
    
    //Setters and getters
    
    public boolean save(String filename)
    {
	 	   database.save(filename);
	 	   System.out.println("Saved in database in Main clas");
	 	   
	 	   network.save(filename);
	 	   System.out.println("Saved in network in Main class");
	 	   
	 	   return true;
       }
}