package com.thespianartist.cielitoquerido.utils;

public class MetersAndKilometers {
	
	private Float value;
	private String  aux[];
	String result;
	
	public MetersAndKilometers(Float valueEntry){
		this.value = valueEntry;
	}
	
	public String getFormat(){
		
		String valueToString;
		
		valueToString = this.value.toString();
	
		
		if(valueToString.contains(".")){
		
		 aux = valueToString.split("\\.");
		
			if(aux[0].length() > 3){	
				
				String	meters = aux[0].substring(aux[0].length()-3);
				String 	kilometers = aux[0].substring(0, aux[0].length()-3);
				result = "A "+kilometers+" Kilometros y "+meters+" Metros";
				
			}else{
				String	meters = aux[0].toString();
				result = "A "+meters+" Metros";
			}
		
		}else{
				if(valueToString.length()  > 3){	
				String	meters = valueToString.substring(valueToString.length()-3);
				String 	kilometers = valueToString.substring(0,valueToString.length()-3);
				result = "A "+kilometers+" Kilometros y "+meters+" Metros";
				
			}else{
				String	meters = valueToString.toString();
				result = "A "+meters+" Metros";
			}
			
		}
	
		
		return result;
	}

}
