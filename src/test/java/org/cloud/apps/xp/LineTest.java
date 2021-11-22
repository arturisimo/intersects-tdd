package org.cloud.apps.xp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LineTest {
	
	
	@Test
	public void givenTwoLinesWhenIntersectsThenTrue(){
		Coordinate c1 = new Coordinate(-1.7, 5555.0);
		Coordinate c2 = new Coordinate(0.0, 0.0);
		assertThat(new Line(c1,2).intersects(new Line(c2, 3)), is(true));
	}
	
	
}
