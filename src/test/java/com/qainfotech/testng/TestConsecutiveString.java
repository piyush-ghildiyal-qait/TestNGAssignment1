package com.qainfotech.testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestConsecutiveString {
  @Test
  public void testConsecutiveString()	{	
		
		ConsecutiveString obj = new ConsecutiveString();				

	           ArrayList<String> actualConsecutiveLetter = new ArrayList<String>();		
	            ArrayList<String> expectedConsecutiveLetter = new ArrayList<String>();			

	actualConsecutiveLetter.add("Hello");	
//	actualConsecutiveLetter.add("Winner");
	actualConsecutiveLetter.add("Apple");		
//	actualConsecutiveLetter.add("Qainfotech");				
			

	expectedConsecutiveLetter.add("Hello");		
//	expectedConsecutiveLetter.add("Winner");		

	expectedConsecutiveLetter.add("Apple");				

	ArrayList<String> actualConsecutiveLetterResult = obj.getConsecutiveString(actualConsecutiveLetter);		

	AssertJUnit.assertEquals(expectedConsecutiveLetter,actualConsecutiveLetterResult);					
	}
}
