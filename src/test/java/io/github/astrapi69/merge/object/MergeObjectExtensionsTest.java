/**
 * The MIT License
 *
 * Copyright (C) 2017 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.merge.object;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Test;

import io.github.astrapi69.test.object.Employee;
import io.github.astrapi69.test.object.Person;
import io.github.astrapi69.test.object.enumtype.Gender;

/**
 * The unit test class for the class {@link MergeObjectExtensions}.
 */
public class MergeObjectExtensionsTest
{

	/**
	 * Test method for {@link MergeObjectExtensions#merge(Object, Object)}.
	 *
	 * @throws InvocationTargetException
	 *             the invocation target exception
	 * @throws IllegalAccessException
	 *             the illegal access exception
	 * @throws NoSuchFieldException
	 *             is thrown if no such field exists.
	 * @throws SecurityException
	 *             is thrown if a security manager says no.
	 */
	@Test
	public void testMerge() throws InvocationTargetException, IllegalAccessException,
		NoSuchFieldException, SecurityException
	{

		final Person person = Person.builder().gender(Gender.FEMALE).name("Anna").married(true)
			.about("About what...").nickname("beast").build();

		final Employee with = Employee.builder().person(person).id("23").build();

		Employee mergeInObject = Employee.builder().build();
		MergeObjectExtensions.merge(mergeInObject, with);

		assertTrue(mergeInObject.getId().equals("23"));
		assertTrue(mergeInObject.getPerson().equals(person));

		mergeInObject = Employee.builder().id("22").person(Person.builder().build()).build();
		MergeObjectExtensions.merge(mergeInObject, with);

		assertTrue(mergeInObject.getId().equals("23"));
		assertTrue(mergeInObject.getPerson().equals(person));

	}

	/**
	 * Test method for
	 * {@link MergeObjectExtensions#mergePropertyWithReflection(Object, Object, String)}
	 */
	@Test
	public void testMergePropertyWithReflection()
	{
		final Person person = Person.builder().gender(Gender.FEMALE).name("Anna").married(true)
			.about("About what...").nickname("beast").build();

		final Employee withObject = Employee.builder().person(person).id("23").build();

		Employee mergeInObject = Employee.builder().build();

		boolean condition = MergeObjectExtensions.mergePropertyWithReflection(mergeInObject,
			withObject, "id");

		assertTrue(condition);
		assertTrue(mergeInObject.getId().equals("23"));

	}

	/**
	 * Test method for
	 * {@link MergeObjectExtensions#mergePropertyWithReflection(Object, Object, String)}
	 */
	@Test
	public void testMergePropertyWithReflectionCaseException()
	{
		final Person person = Person.builder().gender(Gender.FEMALE).name("Anna").married(true)
			.about("About what...").nickname("beast").build();

		final Employee withObject = Employee.builder().person(person).id("23").build();

		Employee mergeInObject = Employee.builder().build();

		boolean condition = MergeObjectExtensions.mergePropertyWithReflection(mergeInObject,
			withObject, "foo");

		assertFalse(condition,
			"NoSuchFieldException should be thrown and catched and return false");
	}

}

