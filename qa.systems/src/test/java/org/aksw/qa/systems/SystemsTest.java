package org.aksw.qa.systems;

import java.util.ArrayList;
import java.util.HashSet;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

public class SystemsTest {
	Logger log = LoggerFactory.getLogger(SystemsTest.class);

	@Test
	public void testAllSystems() {
		String question = "What is the capital of Germany?";
		ArrayList<ASystem> systems = Lists.newArrayList(new HAWK(), new QAKIS(), new SINA(), new START(), new YODA());
		for (ASystem system : systems) {
			HashSet<String> answer = system.search(question);
			log.debug("Answers: "+ answer.size());
			Assert.assertNotNull(answer);
		}
	}
}