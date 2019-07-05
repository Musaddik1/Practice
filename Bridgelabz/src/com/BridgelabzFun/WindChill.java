
package com.BridgelabzFun;

/*
 * 
*/public class WindChill {
	
	public static void main(String[] args) {
		
		double temprature=Double.parseDouble(args[0]);
		double velocity=Double.parseDouble(args[1]);
		double windchill;
		if(temprature<=50&&(velocity>=3&&velocity<=120))
		{
			windchill=35.74+0.6215*temprature+(0.4275*temprature-35.75)*(Math.pow(velocity, 0.16));
			
		}
	}

}
