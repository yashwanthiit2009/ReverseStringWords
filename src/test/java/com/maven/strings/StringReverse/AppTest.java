package com.maven.strings.StringReverse;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
   
	@Test
	public void checkIfReverse() {

		App obj = new App();
		Assert.assertEquals("[ world,  java,  is,  this,  Hello]", App.revWords("Hello this is java world"));
		//
	}

   }
