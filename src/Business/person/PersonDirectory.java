/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.person;

import java.util.ArrayList;

/**
 *
 * @author anuja
 */
public class PersonDirectory {
    
      private ArrayList<Volunteer> volunteerList;
      private ArrayList<Patients> patientsList;
      private ArrayList<Person> personList;
    
      public PersonDirectory()
      {
            volunteerList = new ArrayList<>();
            patientsList = new ArrayList<>();
            personList = new ArrayList<>();
      }
      
      public Volunteer addVolunteer()
    {
        Volunteer volunteer = new Volunteer();
        volunteerList.add(volunteer);
        return volunteer;
    }
    
    public void removeVolunteer(Volunteer volunteer)
    {
      volunteerList.remove(volunteer);
    }
    
    public Patients addPatients()
    {
        Patients patients = new Patients();
        patientsList.add(patients);
        return patients;
    }
    
    public void removePatients(Patients patient)
    {
        patientsList.remove(patient);
    }
    

    public ArrayList<Patients> getPatientsList() {
        return patientsList;
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }


      public Person addPerson()
    {
        Person person = new Person();
       personList.add(person);
        return person;
    }
    
    public void removePerson(Person person)
    {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}

