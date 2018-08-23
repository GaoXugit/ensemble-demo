/* Copyright 2013-2015 www.snakerflow.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dcits.ensemble.test;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试辅助基类，提供execute的递归方法及SnakerEngine实例
 * 
 * @author Tim
 * @since 1.0
 */
public class TestBase extends TestCase {

	private ApplicationContext context = new ClassPathXmlApplicationContext(
			"classpath*:META-INF/spring/*.xml");

	protected ApplicationContext getConetxt() {
		return context;
	}
}
