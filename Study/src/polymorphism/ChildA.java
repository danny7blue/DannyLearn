/**
 * 
 */
package polymorphism;

/**
 * @author Danny
 *
 */
public class ChildA extends SuperClass {
	public String show(ChildA obj){
        return ("ChildA and ChildA");
    }
    
    public String show(SuperClass obj){
        return ("ChildA and SuperClass");
    } 
}
