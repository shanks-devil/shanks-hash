package org.shanks.hash.service;

import java.time.LocalTime;
import java.util.List;

import org.junit.Test;
import org.shanks.hash.handler.Handler;
import org.shanks.hash.handler.HomeworkHandler;
import org.shanks.hash.handler.JobHandler;
import org.shanks.hash.handler.WeekendHandler;
import org.shanks.hash.model.Node;

import com.google.common.collect.Lists;

public class ConsistencyTimeTest {

	@Test
	public void test() {
		Node n1 = new Node(1,30, new JobHandler());
		Node n145 = new Node(1,45, new JobHandler());
		Node n2 = new Node(2,30, new HomeworkHandler());
		Node n14 = new Node(14,30, new HomeworkHandler());
		Node n18 = new Node(18,30, new HomeworkHandler());
		Node n1840 = new Node(18,40, new WeekendHandler());
		Node n20 = new Node(20,00, new JobHandler());
		Node n21 = new Node(21,00, new WeekendHandler());
		Node n22 = new Node(22,00, new WeekendHandler());
		Node n2115 = new Node(21,15, new JobHandler());
		List<Node> items = Lists.newArrayList(n1,n2,n14,n18,n1840,n20,n21,n145,n22,n2115);
		
		ConsistencyTime consistencyTime = new ConsistencyTime(items);
		Handler handler = consistencyTime.getTime(LocalTime.of(21, 10));
		if (handler != null) {
			System.out.println(handler.getClass());
			handler.doSomething();
		}
	}
	
}
