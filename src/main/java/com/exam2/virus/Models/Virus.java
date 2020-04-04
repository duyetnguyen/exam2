package com.exam2.virus.Models;

import javax.persistence.*;

@Entity
@Table(name = "virus")

public class Virus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;
    @Column(name = "symptoms")
    public String symptoms;
    @Column(name = "incubation")
    public double incubation;
    @Column(name = "mortalityrate")
    public double mortalityrate;

    public Virus()
    {

    }

    public Virus(String name, String description, String symptoms, double incubation, double mortalityrate)
    {
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.incubation = incubation;
        this.mortalityrate = mortalityrate;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getSymptoms()
    {
        return symptoms;
    }
    public void setSymptoms(String symptoms)
    {
        this.symptoms = symptoms;
    }

    public double getIncubation()
    {
        return incubation;
    }
    public void setIncubation(double incubation)
    {
        this.incubation = incubation;
    }

    public double getMortalityrate()
    {
        return mortalityrate;
    }
    public void setMortalityrate(double mortalityrate)
    {
        this.mortalityrate = mortalityrate;
    }


}
