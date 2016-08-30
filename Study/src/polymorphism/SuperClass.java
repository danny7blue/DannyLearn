/**
 * 
 */
package polymorphism;

/**
 * @author Danny
 *
 */
public class SuperClass {
	public String show(ChildC obj) {
        return ("SuperClass and ChildC");
    }

    public String show(SuperClass obj) {
        return ("SuperClass and SuperClass");
    } 
}
