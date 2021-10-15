package com.devops.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import com.devops.traing.jenkins.JenkinsCalculator;

public class jenkinsCalTest {

	@Test
	public void addtest() {
		JenkinsCalculator mycalc=new JenkinsCalculator();
		assertEquals(10,mycalc.addnumbers(5, 5));
	}
	@Test
	public void subtracttest() {
		JenkinsCalculator mycalc=new JenkinsCalculator();
		assertEquals(5,mycalc.subnumbers(10, 5));
	}
}
