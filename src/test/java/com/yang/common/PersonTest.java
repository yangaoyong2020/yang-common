package com.yang.common;

import java.util.Date;

import org.junit.Test;

import com.aoao.common.utils.StringUtil;

public class PersonTest {

	@Test
	public void test() {
		for(int i=0;i<10000;i++){
			Person person = new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1, 120));
			person.setAbout(StringUtil.randomChineseString(140));
			person.setCreated(new Date());
			System.out.println(person);
		}
	}

}
