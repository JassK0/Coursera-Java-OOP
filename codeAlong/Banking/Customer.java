package codeAlong.Banking;
/**
 * Represents a customer of the bank.
 */
public class Customer {
//Instance Variables

//Name of customer.
String name;

//Address of customer.
String address;

//Constructor
/**
 * Creates a customer with the given name
 * @param name of customer
 */
public Customer(String name){
    // Sets instance variable name to given name.
    this.name = name;
}
// Methods

/**
 * Sets the adress of the customer to the given address.
 * @param address
 */
public void setAddress(String address){
    this.address = address;
}

/**
 * Gets the name of the customer.
 * @param name
 */
public String getName(){
    return this.name;
}

/**
 * Gets the address of the customer.
 * @param name
 */
public String getAddress(){
    return this.address;
}



}
