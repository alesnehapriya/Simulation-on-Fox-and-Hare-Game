package controller;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class game {
	
	@FXML
	Button btnStart,foxBorn,migrate,next,end;

	@FXML
	Text season;
	String sam, season_text="SPRING";

	int[] rabbit = new int[52];
	int[] fox = new int[12];
	
	@FXML
	PieChart pieChart;
	
	ObservableList<PieChart.Data> data_temp;
	
	@FXML 
	Text R1,	R2,	R3,	R4,	R5,	R6,	R7,	R8,	R9,	R10,	R11,	R12,	R13,
	R14,	R15,	R16,	R17,	R18,	R19,	R20,	R21,	R22,	R23,
	R24,	R25,	R26,	R27,	R28,R29,	R30,	R31,	R32,	R33,	R34,
	R35,	R36,	R37,	R38,	R39,	R40,	R41,	R42,	R43,	R44,	R45,	R46,
	R47,	R48,	R49,	R50,	R51,	R52;
	
	@FXML
	Text F1,	F2,	F3,	F4,	F5,	F6,	F7,	F8,	F9,	F10,	F11,	F12;
	
	int k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12;
	int hunt;
	int totalborn;
	
	@FXML
	Button hunt1;
	
	int m5=0;

	
	ArrayList<Text> rabbitAry= new ArrayList<Text>();
	ArrayList<Text> foxAry = new ArrayList<Text>();

	
	@FXML
	public void startGame(){
		sam = season.getText();
		
		
		rabbitAry.add(R1);
		rabbitAry.add(R2);
		rabbitAry.add(R3);
		rabbitAry.add(R4);
		rabbitAry.add(R5);
		rabbitAry.add(R6);
		rabbitAry.add(R7);
		rabbitAry.add(R8);
		rabbitAry.add(R9);
		rabbitAry.add(R10);
		rabbitAry.add(R11);
		rabbitAry.add(R12);
		rabbitAry.add(R13);
		rabbitAry.add(R14);
		rabbitAry.add(R15);
		rabbitAry.add(R16);
		rabbitAry.add(R17);
		rabbitAry.add(R18);
		rabbitAry.add(R19);
		rabbitAry.add(R20);
		rabbitAry.add(R21);
		rabbitAry.add(R22);
		rabbitAry.add(R23);
		rabbitAry.add(R24);
		rabbitAry.add(R25);
		rabbitAry.add(R26);
		rabbitAry.add(R27);
		rabbitAry.add(R28);
		rabbitAry.add(R29);
		rabbitAry.add(R30);
		rabbitAry.add(R31);
		rabbitAry.add(R32);
		rabbitAry.add(R33);
		rabbitAry.add(R34);
		rabbitAry.add(R35);
		rabbitAry.add(R36);
		rabbitAry.add(R37);
		rabbitAry.add(R38);
		rabbitAry.add(R39);
		rabbitAry.add(R40);
		rabbitAry.add(R41);
		rabbitAry.add(R42);
		rabbitAry.add(R43);
		rabbitAry.add(R44);
		rabbitAry.add(R45);
		rabbitAry.add(R46);
		rabbitAry.add(R47);
		rabbitAry.add(R48);
		rabbitAry.add(R49);
		rabbitAry.add(R50);
		rabbitAry.add(R51);
		rabbitAry.add(R52);
			if((sam.equals("SPRING") || sam.equals("SUMMER")|| sam.equals("FALL"))){
				System.out.println(Integer.parseInt(R1.getText()));
				System.out.println(sam);
				
				
			
				for(int i=0;i<rabbit.length;i++){
					rabbit[i]=Integer.parseInt(rabbitAry.get(i).getText());
					System.out.println(rabbit[i]);
				}
				int l=0;
				for(int i=0;i<rabbit.length;i++){
					l=l+ rabbit[i]+rabbit[i++];
				}
				System.out.println("Rabbits at the start of "+sam+" season:"+l);
				
				for(int i=0;i<rabbit.length;i++){
					if(rabbit[i] <1000){
						rabbit[i]= rabbit[i]*4;
						//rabbitAry.set(i,new Text(Integer.toString(rabbit[i])));
						
					}else if(rabbit[i]>2000){
						rabbit[i]= rabbit[i]*2;
					//	rabbitAry.set(i,new Text(Integer.toString(rabbit[i])));
					}
					else{
						rabbit[i]= rabbit[i]*3;
					//	rabbitAry.set(i,new Text(Integer.toString(rabbit[i])));
								
					}
				}
				

				for(int i=0;i<rabbit.length;i++){
					m5=m5+ rabbit[i]+rabbit[i++];
				}
				System.out.println("Rabbits after born "+sam+" season:"+m5);
				

				int j=0;
				for(Text s: rabbitAry){
					try{
					s.setText(Integer.toString(rabbit[j]));
					j++;}
					catch(Exception e){
						
					}
				}
				
				
				
						
			}
			if(sam.equals("WINTER")){
				for(int i=0;i<rabbit.length;i++){
					rabbit[i]=rabbit[i]/2;
				}
				int j=0;
				for(Text s: rabbitAry){
					try{
					s.setText(Integer.toString(rabbit[j]));
					j++;}
					catch(Exception e){
						
					}
				}
				int m=0;
				for(int i=0;i<rabbit.length;i++){
					m=m+ rabbit[i]+rabbit[i++];
				}
				System.out.println("Rabbits die "+sam+" season:"+m/2);
				
			}
			

		
	}
	
	@FXML
	public void huntAction(){
		foxAry.add(F1);
		foxAry.add(F2);
		foxAry.add(F3);
		foxAry.add(F4);
		foxAry.add(F5);
		foxAry.add(F6);
		foxAry.add(F7);
		foxAry.add(F8);
		foxAry.add(F9);
		foxAry.add(F10);
		foxAry.add(F11);
		foxAry.add(F12);

		
		for(int i=0;i<fox.length;i++){
			fox[i]=Integer.parseInt(foxAry.get(i).getText());
			System.out.println(fox[i]);
			
		}
		int m6=0;
		for(int i=0;i<fox.length;i++){
			m6=m6+ fox[i]+fox[i++];
		}
		System.out.println("Rabbits after born "+sam+" season:"+m6);
		
		data_temp = FXCollections.observableArrayList();
		
		data_temp.addAll(
				
				new PieChart.Data("rabbit",m5),new PieChart.Data("fox",m6));
		pieChart.getData().addAll(data_temp);
		
		hunt= (int) ((rabbit[5]+rabbit[6])/(fox[0]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[5]= rabbit[5]-((hunt*fox[0])/2);
			rabbit[6]= rabbit[6]- ((hunt*fox[0])/2);
			
			R6.setText(Integer.toString(rabbit[5]));
			R7.setText(Integer.toString(rabbit[6]));
		}
		if(hunt<10){
		 fox[0]= fox[0]-fox[0]*(10-hunt)/10;
		 fox[1]= fox[1]-fox[1]*(10-hunt)/10;
		 fox[2]= fox[2]-fox[2]*(10-hunt)/10;
		 fox[3]= fox[3]-fox[3]*(10-hunt)/10;
		 fox[4]= fox[4]-fox[4]*(10-hunt)/10;
		 fox[5]= fox[5]-fox[5]*(10-hunt)/10;
		 fox[6]= fox[6]-fox[6]*(10-hunt)/10;
		 fox[7]= fox[7]-fox[7]*(10-hunt)/10;
		 fox[7]= fox[7]-fox[7]*(10-hunt)/10;
		 fox[8]= fox[8]-fox[8]*(10-hunt)/10;
		 fox[9]= fox[9]-fox[9]*(10-hunt)/10;
		 fox[10]= fox[10]-fox[10]*(10-hunt)/10;
		 fox[11]= fox[11]-fox[11]*(10-hunt)/10;
		}
		
		

		
if(hunt>16){
			k1= (int) (fox[0]*2.5);
		}
else if(hunt <12){
			k1= fox[0];
}else{
	k1= (int) (fox[0]*1.5);
}
		
		
		hunt= (int) ((rabbit[8]+rabbit[9])/(fox[1]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[9]= rabbit[9]- ((hunt*fox[1])/2);
			rabbit[8]= rabbit[8]- ((hunt*fox[1])/2);
			


			
			R9.setText(Integer.toString(rabbit[8]));
			R10.setText(Integer.toString(rabbit[9]));
			
		}


		if(hunt>16){
			k2= (int) (fox[1]*2.5);
		}
else if(hunt <12){
			k2= fox[1];
}else{
	k2= (int) (fox[1]*1.5);
}
		
		hunt= (int) ((rabbit[10]+rabbit[9])/(fox[2]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[10]= rabbit[10]-((hunt*fox[2])/2);
			rabbit[9]= rabbit[9]- ((hunt*fox[2])/2);


			R10.setText(Integer.toString(rabbit[9]));
			R11.setText(Integer.toString(rabbit[10]));
		}

		
		if(hunt>16){
			k3= (int) (fox[2]*2.5);
		}
else if(hunt <12){
			k3= fox[2];
}else{
	k3= (int) (fox[2]*1.5);
}
		
		hunt= (int) ((rabbit[18]+rabbit[17])/(fox[3]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[18]= rabbit[18]-((hunt*fox[3])/2);
			rabbit[17]= rabbit[17]- ((hunt*fox[3])/2);

				
			R19.setText(Integer.toString(rabbit[18]));
			R18.setText(Integer.toString(rabbit[17]));
		}

		
		if(hunt>16){
			k4= (int) (fox[3]*2.5);
		}
else if(hunt <12){
			k4= fox[3];
}else{
	k4= (int) (fox[3]*1.5);
}
		
		//F5
		hunt= (int) ((rabbit[14]+rabbit[13])/(fox[4]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[14]= rabbit[14]-((hunt*fox[4])/2);
			rabbit[13]= rabbit[13]- ((hunt*fox[4])/2);

				
			R15.setText(Integer.toString(rabbit[14]));
			R14.setText(Integer.toString(rabbit[13]));
			
		}

		if(hunt>16){
			k5= (int) (fox[4]*2.5);
		}
else if(hunt <12){
			k5= fox[4];
}else{
	k5= (int) (fox[4]*1.5);
}
		
		//F6
		hunt= (int) ((rabbit[22]+rabbit[21])/(fox[5]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[22]= rabbit[22]-((hunt*fox[5])/2);
			rabbit[21]= rabbit[21]- ((hunt*fox[5])/2);

				
			R23.setText(Integer.toString(rabbit[22]));
			R22.setText(Integer.toString(rabbit[21]));
		}

		
		if(hunt>16){
			k6= (int) (fox[5]*2.5);
		}
else if(hunt <12){
			k6= fox[5];
}else{
	k6= (int) (fox[5]*1.5);
}
		
		//F7
		hunt= (int) ((rabbit[24]+rabbit[23])/(fox[6]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[24]= rabbit[24]-((hunt*fox[6])/2);
			rabbit[23]= rabbit[23]- ((hunt*fox[6])/2);

				
			R25.setText(Integer.toString(rabbit[24]));
			R24.setText(Integer.toString(rabbit[23]));
		}

		
		if(hunt>16){
			k7= (int) (fox[6]*2.5);
		}
else if(hunt <12){
			k7= fox[6];
}else{
	k7= (int) (fox[6]*1.5);
}
		
		//F8
		hunt= (int) ((rabbit[29])/(fox[7]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[29]= rabbit[29]-((hunt*fox[7]));
			
			R30.setText(Integer.toString(rabbit[29]));
			
		}

		if(hunt>16){
			k8= (int) (fox[7]*2.5);
		}
else if(hunt <12){
			k8= fox[7];
}else{
	k8= (int) (fox[7]*1.5);
}

		//F9
		hunt= (int) ((rabbit[29]+rabbit[28])/(fox[8]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[29]= rabbit[29]-((hunt*fox[8])/2);
			rabbit[28]= rabbit[28]- ((hunt*fox[8])/2);

				
			R30.setText(Integer.toString(rabbit[29]));
			R29.setText(Integer.toString(rabbit[28]));
		}

		
		if(hunt>16){
			k9= (int) (fox[8]*2.5);
		}
else if(hunt <12){
			k9= fox[8];
}else{
	k9= (int) (fox[8]*1.5);
}
		
		//F10
		hunt= (int) ((rabbit[27]+rabbit[26])/(fox[9]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[27]= rabbit[7]-((hunt*fox[9])/2);
			rabbit[26]= rabbit[26]- ((hunt*fox[9])/2);

				
			R28.setText(Integer.toString(rabbit[27]));
			R27.setText(Integer.toString(rabbit[26]));
		}

		
		if(hunt>16){
			k10= (int) (fox[9]*2.5);
		}
else if(hunt <12){
			k10= fox[9];
}else{
	k10= (int) (fox[9]*1.5);
}
		
		//F11
		hunt= (int) ((rabbit[36])/(fox[10]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[36]= rabbit[36]-((hunt*fox[10]));

			R37.setText(Integer.toString(rabbit[36]));
			
		}

		if(hunt>16){
			k11= (int) (fox[10]*2.5);
		}
else if(hunt <12){
			k11= fox[10];
}else{
	k11= (int) (fox[10]*1.5);
}

		//F12
		hunt= (int) ((rabbit[39]+rabbit[40])/(fox[11]*0.4));
		if(hunt>18){
			hunt =18;
			rabbit[41]= rabbit[41]-((hunt*fox[11])/2);
			rabbit[40]= rabbit[40]- ((hunt*fox[11])/2);

				
			R42.setText(Integer.toString(rabbit[41]));
			R41.setText(Integer.toString(rabbit[40]));
		}

		
		if(hunt>16){
			k12= (int) (fox[11]*2.5);
		}
else if(hunt <12){
			k12= fox[11];
}else{
	k12= (int) (fox[11]*1.5);
}
		
		
		int m=0;
		for(int i=0;i<rabbit.length;i++){
			m=m+ rabbit[i]+rabbit[i++];
		}
		System.out.println("Rabbits after hunt by fox "+sam+" season:"+m);
		
	
		int j=0;
		for(Text s: foxAry){
			s.setText(Integer.toString(fox[j]));
			j++;
		}
		
	}
	
	@FXML public void actionfoxBorn(){
		totalborn = k1+k2+k3+k4+k5+k5+k7+k8+k9+k10+k11+k12;
		if(sam.equals("SPRING") || sam.equals("SUMMER")){
		
		System.out.println("Fox born after hunting "+totalborn);
		
		fox[0]= fox[0]+k1;
		fox[1]= fox[1]+k2;
		fox[2]= fox[2]+k3;
		fox[3]= fox[3]+k4;
		fox[4]= fox[4]+k5;
		fox[5]= fox[5]+k6;
		fox[6]= fox[6]+k7;
		fox[7]= fox[7]+k8;
		fox[8]= fox[8]+k9;
		fox[9]= fox[9]+k10;
		fox[10]= fox[10]+k11;
		fox[11]= fox[11]+k12;
		
		int j=0;
		for(Text s: foxAry){
			s.setText(Integer.toString(fox[j]));
			j++;
		}
		int m=0;
		for(int i=0;i<fox.length;i++){
			m=m+ fox[i]+fox[i++];
		}
		System.out.println("Fox at the end of the "+sam+" season" +m);
		}
		if(sam.equals("FALL")){
			if(hunt<10 ){
				for(int i=0;i<fox.length;i++){
					totalborn = totalborn/2;
					fox[i]= fox[i]+totalborn;
				}
				int j=0;
				for(Text s: foxAry){
					s.setText(Integer.toString(fox[j]));
					j++;
				}
			}
		}
		if(sam.equals("WINTER")){
			
			int m=0;
			for(int i=0;i<fox.length;i++){
				m=m+ fox[i]+fox[i++];
			}
			int m1=m;
		for(int i=0;i<fox.length;i++){
			if(hunt<12){

				
		fox[i]=(int) (fox[i]*0.8);
		}
			else
				fox[i]= (int)(fox[i]*0.9);
		}	
		
		int m2=0;
		for(int i=0;i<rabbit.length;i++){
			m2=m2+ rabbit[i]+rabbit[i++];
		}
		System.out.println("Fox die "+sam+" season:"+ (m2-m1));
		
			
		}
		int j=0;
		for(Text s: foxAry){
			s.setText(Integer.toString(fox[j]));
			j++;
		}
	
	}
	int k=0;
	@FXML 
	public void migrateOnAction(){
		for(int i=0;i<rabbit.length;i++){
			try{
			if(rabbit[i] > rabbit[i+1]){
				k= k+(rabbit[i]-rabbit[i+1]);
				rabbit[i++]= rabbit[i+1]+(rabbit[i]-rabbit[i+1]); 
				rabbit[i]= rabbit[i]-(rabbit[i]-rabbit[i+1]);
				
			}
			else if(rabbit[i] < rabbit[i+1])
			{
				k=k+(rabbit[i]-rabbit[i+1]);
				rabbit[i]= rabbit[i]+(rabbit[i+1]-rabbit[i]);
				rabbit[i+1]= rabbit[i+1]-(rabbit[i]-rabbit[i+1]);
				
			}
			}
			catch(Exception e){
				
			}
		}
		System.out.println("Rabbits Migrated: "+k);
		for(int i=0;i<rabbit.length;i++){
			System.out.println(rabbit[i]);
		}
		int j=0;
		for(Text s: rabbitAry){
			s.setText(Integer.toString(rabbit[j]));
			j++;
		}
		
		int m6=0;
		for(int i=0;i<fox.length;i++){
			m6=m6+ fox[i]+fox[i++];
		}
		

		for(int i=0;i<rabbit.length;i++){
			m5=m5+ rabbit[i]+rabbit[i++];
		}
		System.out.println("Rabbits after born "+sam+" season:"+m5);

data_temp = FXCollections.observableArrayList();
		
		data_temp.addAll(
				
				new PieChart.Data("rabbit",m5),new PieChart.Data("fox",m6));
		pieChart.getData().addAll(data_temp);
		
	}
	
	@FXML
	public void nextOnAction(){
		if(sam.equals("SPRING"))
		season.setText("SUMMER");
		if(sam.equals("SUMMER"))
			season.setText("FALL");
		if(sam.equals("FALL"))
			season.setText("WINTER");
		if(sam.equals("WINTER"))
			season.setText("SPRING");
	}
	
	
		
	
	
}
