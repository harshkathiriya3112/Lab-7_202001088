package tests;

import java.util.Vector;

public class Main_function {
	//P1
	public int linearSearch(int v, int[] a) {
	    int i = 0;
	    while (i < a.length) {
	        if (a[i] == v) {
	            return i;
	        }
	        i++;
	    }
	    return -1;
	}
	
	//P2
	public int countItem(int v, int[] a) {
	    int count = 0;
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] == v) {
	            count++;
	        }
	    }
	    return count;
	}
	
	//P3
	public int binarySearch(int v, int[] a) {
	    int lo, mid, hi;
	    lo = 0;
	    hi = a.length - 1;
	    while (lo <= hi) {
	        mid = (lo + hi) / 2;
	        if (v == a[mid]) {
	            return mid;
	        } else if (v < a[mid]) {
	            hi = mid - 1;
	        } else {
	            lo = mid + 1;
	        }
	    }
	    return -1;
	}
	
	//P4
	public static final int EQUILATERAL = 0;
	public static final int ISOSCELES = 1;
	public static final int SCALENE = 2;
	public static final int INVALID = 3;

	public int triangle(int a, int b, int c) {
	    if (a >= b + c || b >= a + c || c >= a + b) {
	        return INVALID;
	    }
	    if (a == b && b == c) {
	        return EQUILATERAL;
	    }
	    if (a == b || a == c || b == c) {
	        return ISOSCELES;
	    }
	    return SCALENE;
	}
	
	//P5
	public  boolean prefix(String s1, String s2) {
	    if (s1.length() > s2.length()) {
	        return false;
	    }
	    for (int i = 0; i < s1.length(); i++) {
	        if (s1.charAt(i) != s2.charAt(i)) {
	            return false;
	        }
	    }
	    return true;
	}

	//P6
	public static final int EQUILATERAL1 = 0;
	public static final int ISOSCELES1 = 1;
	public static final int SCALENE1 = 2;
	public static final int INVALID1 = 3;
	public static final int RIGHT_ANGLE1 = 4;

	public int triangle1(double a, double b, double c) {
		if(a*a + b*b == c*c) return RIGHT_ANGLE1;
	    if (a >= b + c || b >= a + c || c >= a + b) {
	        return INVALID;
	    }
	    if (a == b && b == c) {
	        return EQUILATERAL;
	    }
	    if (a == b || a == c || b == c) {
	        return ISOSCELES;
	    }
	    return SCALENE;
	}
	
	
	
	//Section B
	public class Point {
	    public double x;
	    public double y;

	    public Point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }
	}
	
	public Point doGraham(Point[] p) {
	    int i, j, min, M;
	    Point t;
	    min = 0;
	    for (i = 1; i < p.length; i++) {
	        if (p[i].y < p[min].y) {
	            min = i;
	        }
	    }

	    for (i = 0; i < p.length; i++) {
	        if ((p[i].y == p[min].y) && (p[i].x > p[min].x)) {
	            min = i;
	        }
	    }
	    return p[min];
	}


}
