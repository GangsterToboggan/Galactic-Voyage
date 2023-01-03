package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.galactic.math.Vec2;

public class Vec2Test {
	@Test
	public void equality() {
		assertEquals(Vec2.Unit(), Vec2.Unit());
		assertEquals(Vec2.Unit(), Vec2.Zero().add(Vec2.Unit()));
		assertEquals(Vec2.Unit(), Vec2.Zero().add(new Vec2(1, 1)));
	}

	@Test
	public void magnitude() {
		Vec2 threefourfive = new Vec2(3.0, 4.0);
		Vec2 threefourfiveneg = new Vec2(3.0, -4.0);
		assertTrue(threefourfive.magnitudeDub() > 4.9 && threefourfive.magnitudeDub() < 5.1);
		assertTrue(threefourfiveneg.magnitudeDub() > 4.9 && threefourfiveneg.magnitudeDub() < 5.1);
	}

	@Test
	public void dot() {
		Vec2 a = new Vec2(3.0, 4.0);
		Vec2 b = new Vec2(1.0, 2.0);
		assertTrue(a.dotDub(b) > 10.9 && a.dotDub(b) < 11.1);

	}

}
