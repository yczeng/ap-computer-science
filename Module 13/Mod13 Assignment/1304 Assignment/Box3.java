/**
 * A Box
 * 
 * @Catherine Zeng 
 * @2-8-14
 */
public class Box3 extends Rectangle3
{
	// instance variables 
	public int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return "Box - " + getLength() + " X " + getWidth() + " X " + height;
	}
	
	public boolean equals( Object b ) 
    { 
    if ( ! (b instanceof Cube3) ) 
      return false; 

    Cube3 t = (Cube3)b; 
    return t.getLength() == getLength() && t.getWidth() == getWidth() && t.getHeight()==getHeight(); 
    } 

}
