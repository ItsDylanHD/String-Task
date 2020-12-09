package inheritance;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M2000350
 */
public class Person {
    private int age;
    private String firstname;
    private String lastname;
    private String mobile;
    private String haircolour;
    private double height;
    private String gender;


 
    public Person(int age, String firstname, String lastname, String mobile, String haircolour, double height, String gender) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobile = mobile;
        this.haircolour = haircolour;
        this.height = height;
        this.gender = gender;
        
      
        
    }

    @Override
    public String toString() {
        return "Person\n{" + "age=" + age + ", \nfirstname=" + firstname + ", \nlastname=" + lastname + ", \nmobile=" + mobile + ", \nhaircolour=" + haircolour + ", \nheight=" + height + ", \ngender=" + gender + '}';
    }
}