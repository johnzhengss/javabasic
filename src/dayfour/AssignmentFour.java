package dayfour;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssignmentFour {

    @Test
    public void lineTest(){
        Line line = new Line(1,1,2,2);
        Line pLine = new Line(1,0,2,1);
        Line npLine = new Line(1,0,2,0);

        assertEquals(1, line.getSlope(),0.0001);
        assertEquals(1.4142,line.getDistance(),0.0001);
        assertTrue(line.parallelTo(pLine));
        assertFalse(line.parallelTo(npLine));
    }

    @Test(expected = ArithmeticException.class)
    public void testException(){
        Line noneLine = new Line(1,1,1,2);
        noneLine.getSlope();
    }

}


class Line{
    private double x0, y0, x1, y1;
    // construct a line object
    public Line (double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
    // calculate the slope of the line
    public double getSlope( ){
        if (x1 == x0){
            throw new ArithmeticException();
        }

        return (y1 - y0)/(x1 - x0);
    }

    public double getDistance(){
        return Math.sqrt((x1 - x0) * (x1-x0) + (y1 - y0) * (y1 - y0));
    }

    public boolean parallelTo(Line l){
        if(Math.abs(getSlope() - l.getSlope()) < 0.0001){
            return true;
        }else {
            return false;
        }
    }
}

