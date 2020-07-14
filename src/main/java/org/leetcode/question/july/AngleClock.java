package org.leetcode.question.july;

//Angle Between Hands of a Clock
public class AngleClock {

	public double angleClock(int hour, int minutes) {
		double minAngle = minutes / 60.0 * 360;
		double hourAngle =  (360/12) * (minutes / 60.0 + hour);
		return Math.min(Math.abs(minAngle-hourAngle), 360-Math.abs(minAngle-hourAngle));
	}

}
