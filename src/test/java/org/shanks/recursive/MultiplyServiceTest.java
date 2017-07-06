package org.shanks.recursive;

import org.junit.Assert;
import org.junit.Test;
import org.shanks.recursive.service.MultiplyService;

public class MultiplyServiceTest {

	@Test
	public void table99() {
		MultiplyService.table99();
	}
	
	@Test
	public void new99() {
		MultiplyService.new99();
	}
	
	@Test
	public void m() {
		MultiplyService.m();
	}
	
	@Test
	public void mnew99() {
		MultiplyService.mnew99();
	}
	
	@Test
	public void factorial() {
		int rs = MultiplyService.factorial(6);
		System.out.println(rs);
		Assert.assertEquals(6 * 5 * 4 * 3 * 2 * 1, rs);
	}
}
