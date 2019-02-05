package com.qainfotech.testng;

import java.util.ArrayList;
import java.util.Iterator;

public class ConsecutiveString {

	
	
	ArrayList<String> nameResult = new ArrayList<String>();		
	public ArrayList<String> getConsecutiveString(ArrayList<String> name)
	{		
		Iterator<String> it = name.iterator();
		while(it.hasNext())	{  			
			String nameIndex = (String) it.next();
			char firstChar = nameIndex.charAt(0);									
			for(int j = 1; j < nameIndex.length(); j++)			
			{				
				if(firstChar == nameIndex.charAt(j))				
				{											
					nameResult.add(nameIndex);					
					break;
					}								
				firstChar = nameIndex.charAt(j);						
				}					
			}  		
		return nameResult;	
		}
	}
