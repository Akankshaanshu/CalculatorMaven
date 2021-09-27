package com.devops.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import com.devops.traing.jenkins.JenkinsCalculator;

public class jenkinscalctest {

	@Test
	
		public void addTest() {
			JenkinsCalculator mycalc=new JenkinsCalculator();
			assertEquals(10,mycalc.addnumbers(5, 5));
		}
		public void subTest() {
			JenkinsCalculator mycalc=new JenkinsCalculator();
			assertEquals(5,mycalc.addnumbers(10, 5));
		}
	}


