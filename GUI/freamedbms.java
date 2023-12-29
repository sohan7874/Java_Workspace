package module3frame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class freamedbms {
	JFrame frame ;
	String id8;
	//-----------------------update mate ---------------------------------
	JPanel  panelupdate;
	JTextField idu;
	JTextField nameu;
	JRadioButton Maleu,Femaleu;
	JTextArea Addressu;
	JTextArea Contactu;
	JLabel id1u,name1u,radio1u,address1u,Contact1u;
 JButton   submit;
	
	
	

	//----------------------------------------------------------------------
	
	//--------------------------------------left side part in frame -------------------------- 
	//JFrame frame ;
	JTextField id;
	JTextField name;
	JRadioButton Male,Female;
	JTextArea Address;
	JTextArea Contact;
	JButton Exit ,Register,UPDATE,View,Reset;
	JLabel id1,name1,radio1,address1,Contact1;
	//------------------------------------------------------------------
	
	
	
	//----------------------------------------DATABASE CONNECT--------------------------
	String host="jdbc:mysql://localhost:3306/";
	String dbname="frame2";
	String url=host+dbname;
	//---------------------------------------------------------------------------
	
	
	
//---------------------------------------------panel right side ----------------------------	

	JPanel panal;
	JTable table1;
	JScrollPane sp1;
	JLabel l1,l2,l3,l4,l5;
	DefaultTableModel model;
	//------------------------------------------------------------------
	
	
	
	
	
	
	
    public freamedbms() {
	
    	
	frame = new JFrame();
	//---------------------------------------------JPANEL WORK ---------------------------------
	String column[] = {"ID","NAME","GENDER","ADDRESS","CONTACT"};
	
	model = new DefaultTableModel(column,0);
	panal= new JPanel();
	
    panal.setBounds(280, 130, 427, 402);
	
	table1 = new JTable(model);
	table1.setBounds(400 ,115, 380, 290);
    
    
	//sp1=new JScrollPane(table1);
	sp1 = new JScrollPane(table1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//	sp1.setBounds(300, 150, 430, 405);
	sp1.setVisible(true);
 //   panal.add(new ScrollPane());

	
	//frame.add(table1);
	frame.add(panal);
	frame.add(sp1);
	panal.add(table1);
  	table1.setVisible(false);
	panal.setVisible(false);
	//sp1.setVisible(false);
	//------------------------------------------------------END-----------------------------------------
	
	
	
	
	
	
	
//	--------- ---------------------------------------- REGISTER FORM WORK------------------------------------------------------
	id = new JTextField() ; 
	id.setBounds(126, 46, 86, 20);
	id1= new JLabel("ID");
	id1.setBounds(10, 46, 62, 22);
	
	
	name = new JTextField();
	name.setBounds(126, 86, 86, 20);
	name1= new JLabel("NAME");
	name1.setBounds(10, 86, 62, 22);
	
	
	radio1 = new JLabel("GENDER");
    radio1.setBounds(10, 118, 62, 22);
	Male = new JRadioButton("MALE");
    Male.setBounds(98, 117, 74, 23);
    Female= new JRadioButton("FEMALE");
    Female.setBounds(195, 117, 74, 23);
    
     
    
    Address = new JTextArea() ;
    Address.setBounds(126, 158, 134, 22);
    address1= new JLabel("ADDRESS");
    address1.setBounds(10, 158, 62, 22);
    
    
    Contact = new JTextArea();
    Contact.setBounds(126, 206, 134, 22);
    Contact1=new JLabel("CONTACT");
    Contact1.setBounds(10, 206, 62, 22);

    
  //-------------------------EXIT BUTTON-----------------------------------------------------------
	Exit= new JButton("EXIT");
	Exit.setBounds(45, 249, 70, 22);
	
	Exit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
            if (e.getSource()==Exit) {
				
            frame.dispose()  ;
			}			
		}
	});
	//------------------------------------------------------------------
	
	//-------------------------REGISTER BUTTON-------------------------------------------------------------------------------
	
	Register = new JButton("REGISTER") ;
	Register.setBounds(165, 249, 70, 22);
	
	Register.addActionListener( new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
        
        
    	String gender;
        if(Male.isSelected()) {
        	 gender="MALE";
        	
        	
        }
        else {
        	gender= "female";
        }

	String Id= id.getText().toString();
    String Name= name.getText().toString();
    String address  = Address.getText().toString();
    String contect = Contact. getText().toString();
    String Gender =  gender;
        
		
        try {		
        	Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			String Query = "insert into frametable (ID,NAME,ADDRESS,GENDER,CONTACT) values('"+Id+"','"+Name+"','"+address+"','"+Gender+"','"+contect+"')";
			
			Statement stmt= con.createStatement();
			int stutus= stmt.executeUpdate(Query);
			
			if(stutus>0)
			{  
				frame.setVisible(false);
			}
			else
			{
				System.out.println("Error");
				frame.dispose();			
				}
		
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
		
		}
	});
	//-----------------------------------------------------------------------------------------------------------------------------

	
	
	//---------------------UPDATE BUTTON--------------------------------------------------------------------------------------------
	String columns[] = {"ID","NAME","GENDER","ADDRESS","CONTACT"};
	model = new DefaultTableModel(column,0);

	   idu = new JTextField();
		idu.setBounds(127, 62, 86, 20);

		 nameu = new JTextField();
		nameu.setBounds(127, 93, 86, 20);

		 Maleu = new JRadioButton("MALE");
			Maleu.setBounds(47, 123, 109, 23);

		 Femaleu = new JRadioButton("FEMALE");
			Femaleu.setBounds(165, 123, 109, 23);

		 Addressu = new JTextArea();
			Addressu.setBounds(127, 199, 86, 20);

		Contactu = new JTextArea();
	      Contactu.setBounds(127, 153, 86, 20);

		
		
		 id1u = new JLabel("ID");
			id1u.setBounds(47, 65, 46, 14);

		 name1u = new JLabel("NAME");
		name1u.setBounds(47, 96, 46, 14);

		 radio1u = new JLabel("RADIO");
			radio1u.setBounds(47, 156, 46, 14);

		 address1u = new JLabel("ADDRESS");
			address1u.setBounds(47, 202, 46, 14);

		 Contact1u = new JLabel("CONTECT");
		Contact1u.setBounds(47, 156, 46, 14);


	    submit = new JButton("submit");
	    submit.setBounds(102, 287, 89, 23);
	   
	   
	   
	   
	   
	   
	   
		  panelupdate = new JPanel();
		   panelupdate.setBounds(316, 127, 382, 411);
		   panelupdate.setLayout(null);
		   panelupdate.setVisible(false);
	   panelupdate.add(Addressu);
	   panelupdate.add(Contact1u);
	   panelupdate.add(id1u);;
	   panelupdate.add(Femaleu);
	   panelupdate.add(radio1);
	   panelupdate.add(Maleu);
	   panelupdate.add(address1u);
	   panelupdate.add(idu);
	   panelupdate.add(name1u);
	   panelupdate.add(nameu);
	   panelupdate.add(submit);
	panelupdate.add(Contactu);
	   panelupdate.add(Contact1);

		  frame.add(panelupdate);
	   
	
	UPDATE= new JButton("UPDATE"); 
   UPDATE.setBounds(87, 299, 70, 22);
   UPDATE.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
if (e.getSource()==UPDATE )
{
	panelupdate.setVisible(true);


	 try {
		 id8=id.getText().toString();
		 Class.forName("com.mysql.jdbc.Driver");
		Connection cons = DriverManager.getConnection(url,"root","");

		String queryfatch="SELECT * FROM frametable Where ID='"+id8+"'";
      Statement sta = cons.createStatement();

      ResultSet set = sta.executeQuery(queryfatch);

      model.setRowCount(0);
      

      if (set.next())
    	  
      {
    	  String id1 = set.getString(1);
    		String name1 = set.getString(2);
    		String address = set.getString(4);
    		String Contect= set.getString(5);	
    		
    		 idu.setText(id1);
    		 nameu.setText(name1);
    	     Addressu.setText(address);
    		 Contactu.setText(Contect);	
    		
      
      
      }
		
		
	}
	 catch (Exception e1) {
		// TODO Auto-generated catch block
			System.out.println(e);

	}
	 
	 

}
}});
   submit.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con11 = DriverManager.getConnection(url,"root","");
	
	
	String Id = id.getText().toString();
	String Name = name.getText().toString();
	String address = Address.getText().toString();
	String contect = Contact. getText().toString();
	String q1 = "update frametable set ID='"+Id+"',NAME='"+Name+"',ADDRESS='"+address+"',CONTACT='"+contect+"'where id = '"+id8+"'";
	Statement stmt2 = con11.createStatement();
	int data = stmt2.executeUpdate(q1);
	
	if(data>0)
	{
		panelupdate.setVisible(false);
	}
	else
	{
		System.out.println("Error");
	}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		
		
		
		
		
		
	}
});
  
   
   
   
   
   
   
  //----------------------------------------------------------------------------------------------------------------------------------
    
    //---------------------------VIEW BUTTON-------------------------------------------------------------------------------------------
    View = new JButton("View");
	View.setBounds(31, 355, 70, 22);
	View.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
        
			String columna[] = {"ID","NAME","GENDER","ADDRESS","CONTACT"};
			model = new DefaultTableModel(columna,0);

			if (e.getSource()==View) {
	
                table1.setVisible(true);
               
            	panal.setVisible(true);
       //     	sp1 .setVisible(true);

			 try {
				 
				 System.out.print("z");

				 
				 Class.forName("com.mysql.jdbc.Driver");
				Connection cons = DriverManager.getConnection(url,"root","");

				String queryfatch="SELECT * FROM frametable";
               Statement sta = cons.createStatement();
System.out.print("a");
               ResultSet rs = sta.executeQuery(queryfatch);

               model.setRowCount(0);
               

               while (rs.next()) {

            	   
               String idm = rs.getString(1);
               String NAMEz= rs.getString(2);

			String ADDRESSz = rs.getString(4);
			String CONTACTz = rs.getString(5);

               
			String data []= {idm,NAMEz,ADDRESSz,CONTACTz};
			model=(DefaultTableModel) table1.getModel();
			model.addRow(data);
 	    		
               
               }
				
				
			}
			 catch (Exception e1) {
				// TODO Auto-generated catch block
					System.out.println(e);

			}
		
		}
else {
	System.out.print("error");
}
}
		

	});
	
	
	
	
	
	
	//--------------------------------------------------------------------------------------------------------------
	
	//-----------------------RESET BUTTON--------------------------------------------------------------
    Reset= new JButton("RESET");
    Reset.setBounds(156, 355, 70, 22);
    Reset.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getSource()==Reset) {
				id.setText("");
				name.setText("");
	           Male.setSelected(false);	
	           Female.setSelected(false);
	           Address.setText("");
	           Contact.setText("");
				}
				
			}
		
	});
	     
   //---------------------------------------------------------------------------------------------------
     frame.add(Address);
     frame.add(Contact);
     frame.add(Contact1);
     frame.add(UPDATE);
     frame.add(Exit);
     frame.add(Female);
     frame.add(Male);
     frame.add(Register);
     frame.add(Reset);
     frame.add(View);
     frame.add(address1);
     frame.add(id);
     frame.add(id1);
     frame.add(name);
     frame.add(name1);
     frame.add(radio1); 
     
     
     
     
     
     
     frame.setSize(750, 750);
     frame.setLayout(null);
     frame.setVisible(true);
   
    
    
    
    
    
}
public static void main(String[] args) {
	new freamedbms();
	
	  
}
}
