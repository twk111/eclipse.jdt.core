/*******************************************************************************
 * Copyright (c) 2017 Till Brychcy and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This is an implementation of an early-draft specification developed under the Java
 * Community Process (JCP) and is made available for testing and evaluation purposes
 * only. The code is not compatible with any specification of the JCP.
 *
 * Contributors:
 *     Till Brychcy - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.core.tests.compiler.regression;

import junit.framework.Test;

public class UnnamedModuleTest extends AbstractRegressionTest9 {

static {
//	TESTS_NAMES = new String[] { "testBugXXX" };
//	TESTS_NUMBERS = new int[] { 40, 41, 43, 45, 63, 64 };
//	TESTS_RANGE = new int[] { 11, -1 };
}
public UnnamedModuleTest(String name) {
	super(name);
}
public static Test suite() {
	return buildMinimalComplianceTestSuite(testClass(), F_9);
}

public static Class<UnnamedModuleTest> testClass() {
	return UnnamedModuleTest.class;
}

public void testBug522327() {
	runConformTest(
		new String[] {
			"nonmodular/ProblemWithThrowable.java",
			"package nonmodular;\n" +
			"\n" +
			"import java.io.IOException;\n" +
			"import java.sql.SQLException;\n" +
			"\n" +
			"public class ProblemWithThrowable {\n" +
			"    public void saveProperties() throws IOException {\n" +
			"    }\n" +
			"}\n" +
			"",
		}
	);
}
}
