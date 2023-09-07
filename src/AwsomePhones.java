import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class AwsomePhones  {

	public static void main(String[] args) throws FileNotFoundException {
	
		
		
		ImageIcon icon=new ImageIcon("iPhone13.jpg");
		JOptionPane.showMessageDialog(null, "Welcome to MYSTORE", 
				   "ASP 2.0", JOptionPane. INFORMATION_MESSAGE, icon);
		
		
		String name=JOptionPane.showInputDialog(null, "Whats your name?",
				"Phone- Name",
				JOptionPane.QUESTION_MESSAGE);
		String[] firstname=name.split(" ");
		JOptionPane.showMessageDialog(null, name);
		
	int option=JOptionPane.showOptionDialog(null, "Hello, "+firstname[0]+"!"+
			"\nDo you want a Contract?", "Phone- Contract", 
			JOptionPane.YES_NO_OPTION, 
			JOptionPane.QUESTION_MESSAGE, null, null, 0);
	
	
	
	ArrayList<String> phonesTitles = new ArrayList<String>();
	
	
	File f=new File("data//PhoneTitles.txt");
	Scanner in=new Scanner(f);
	int size;
	while (in.hasNextLine()) {
		phonesTitles.add(in.nextLine());
			
	}
	size= phonesTitles.size();
	String[] modelNames= new String[size];
	double[] pricesCont= new double[size];
	double[] pricesWithoutCont= new double[size];
	
	String[] parts;
	String[] models = new String[size];
	String[] models2= new String[size];
	for (int i=0; i<size; i++)
	{
		parts= phonesTitles.get(i).split("\\$");
		modelNames[i]=parts[0].trim();
		pricesCont[i]=
				Double.parseDouble(parts[1].trim());
		pricesWithoutCont[i]= 
				Double.parseDouble(parts[2].trim());
		
		System.out.println(modelNames[i]+ " | "+ " $" +pricesCont[i] +
				"$" + pricesWithoutCont[i]);
		
		models[i]=modelNames[i]+ " - "+ " $" +
		pricesCont[i];// +
	//	" $" + pricesWithoutCont[i]+ "(no contract)";
		
	}
	
	if (option==1)
	{
		for (int i=0; i<size; i++)
		{
			parts= phonesTitles.get(i).split("\\$");
			modelNames[i]=parts[0].trim();
			pricesCont[i]=
					Double.parseDouble(parts[1].trim());
			pricesWithoutCont[i]= 
					Double.parseDouble(parts[2].trim());
			
			System.out.println(modelNames[i]+ " | "+ " $" +pricesCont[i] +
					"$" + pricesWithoutCont[i]);
			
			models2[i]=modelNames[i]+ " - "//+ " $" +
			//pricesCont[i] 
					+
			" $" + pricesWithoutCont[i]+ "(no contract)";
			
			
			
		}
	}
	
	
	
	ImageIcon phonepic= new ImageIcon("iPhone13.jpg");
	String Choice= (String) JOptionPane.showInputDialog(null,
			"Pick a Phone", "Phone- Option",
			JOptionPane.QUESTION_MESSAGE, phonepic,
			models, 
			modelNames); 
	System.out.println(Choice); 
	
	
	
	
	
	
	
	
	
	String[] areaCodes= {"404", "478", "678", "706"};
	
	File fi=new File("data\\AreaCodes.txt");
	Scanner input=new Scanner(fi);
	int i=0;
	do {
		areaCodes[i++]= input.nextLine();}
		while (in.hasNextLine()) ;
	
	
	/*int acode=JOptionPane.showOptionDialog(null, "Choose an Area Code",
			"Phone- Choose Area Code",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.INFORMATION_MESSAGE, null, areaCodes, 1);
	System.out.println(acode);
	*/
	Random rr= new Random();
	System.out.println(rr.nextInt()%10000000);
	String selection= (String)JOptionPane.showInputDialog(null,
			"Choose An Area Code",
			"Phone- AreaCode",
			JOptionPane.INFORMATION_MESSAGE, null, areaCodes, 0);
	String phonenumber= selection+rr.nextInt()%10000000;
	
	
	
	JOptionPane.showConfirmDialog(null, "Name: "+name+"\nContract: "
	+option+"\nPhone: "+Choice+"\nPhone Number: "
			+phonenumber, "Phone- Invoice", option);
	
	
	
	
	

	}

}
