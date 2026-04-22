package unit5;

/**
 * A class demonstrating Unit 5 concepts: writing classes, constructors,
 * getters/setters, static variables, and toString override.
 *
 * <p>You need to implement:</p>
 * <ul>
 *   <li>Private instance variables: name (String) and age (int)</li>
 *   <li>A private static variable: count (int)</li>
 *   <li>Three constructors (default, parameterized, overloaded)</li>
 *   <li>Getter and setter methods for name and age</li>
 *   <li>A static getter for count</li>
 *   <li>A toString() override</li>
 * </ul>
 */
public class Unit5 {

    public static void main(String[] args) {
        // Test your class here by creating objects and calling methods
        // Example: test the parameterized constructor (after implementing it)
        // Unit5 obj = new Unit5("Alice", 25);
        // System.out.println("getName() = " + obj.getName());  // Expected: Alice
        // System.out.println("getAge() = " + obj.getAge());    // Expected: 25
        // System.out.println("toString() = " + obj);           // Expected: Unit5{name='Alice', age=25}
        System.out.println("Implement the class below, then uncomment the test code above.");
    }

    // TODO: Declare private instance variables:
    //   - name (String)
    //   - age (int)
    private String name;
    private int age;

    // TODO: Declare a private static variable:
    //   - count (int) — tracks how many Unit5 objects have been created
    private static int count;

    /**
     * Default constructor. Sets name to "Unknown" and age to 0.
     * Must increment the static count variable.
     *
     * <p>Hint: Initialize name = "Unknown" and age = 0, then do count++</p>
     */
    // TODO: Implement default constructor
    public Unit5() {
        name = "Unknown";
        age = 0;
        count++;
    }

    /**
     * Parameterized constructor. Sets name and age to the given values.
     * Must increment the static count variable.
     *
     * <p>Example: new Unit5("John Doe", 25)</p>
     *
     * @param name the name to set
     * @param age the age to set
     */
    // TODO: Implement parameterized constructor
    public Unit5(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    /**
     * Overloaded constructor. Takes only a name, sets age to 0.
     * Must increment the static count variable.
     *
     * <p>Example: new Unit5("Only Name")</p>
     *
     * @param name the name to set
     */
    // TODO: Implement overloaded constructor (name only)
    public Unit5(String name) {
        this.name = name;
        this.age = 0;
        count++;
    }

    /**
     * Returns the name of this Unit5 object.
     *
     * @return the name
     */
    // TODO: Implement getName()
    public String getName() {
        return name;
    }

    /**
     * Sets the name of this Unit5 object.
     *
     * @param name the new name
     */
    // TODO: Implement setName()
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of this Unit5 object.
     *
     * @return the age
     */
    // TODO: Implement getAge()
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of this Unit5 object.
     *
     * @param age the new age
     */
    // TODO: Implement setAge()
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the total number of Unit5 objects created.
     * This is a static method because count belongs to the class, not an instance.
     *
     * @return the count of objects created
     */
    // TODO: Implement static getCount()
    public static int getCount() {
        return count;
    }

    /**
     * Reurns a string representation of this Unit5 object.
     * Format: Unit5{name='[name]', age=[age]}
     *
     * @return formatted string representation
     */
    // TODO: Override toString()
    @Override
    public String toString() {
        return "Unit5{name='" + name + "', age=" + age + "}";
    }
}