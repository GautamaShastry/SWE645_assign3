package com.student.survey.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First Name is required")
    @Column(nullable = false)
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Column(nullable = false)
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(nullable = false)
    private String email;

    @NotBlank(message = "Street address is required")
    @Column(nullable = false)
    private String streetAddress;

    @NotBlank(message = "City is required")
    @Column(nullable = false)
    private String city;

    @NotBlank(message = "State is required")
    @Column(nullable = false)
    private String state;

    @NotBlank(message = "Zip code is required")
    @Column(nullable = false)
    private String zipCode;

    @NotBlank(message = "Telephone number is required")
    @Column(nullable = false)
    private String telephoneNumber;

    @NotNull(message = "Survey date is required")
    @Column(nullable = false)
    private LocalDate surveyDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private LikedMost likedMost;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private InterestSource interestSource;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Recommendation recommendation;

    public enum LikedMost {
        STUDENTS, LOCATION, CAMPUS, ATMOSPHERE, DORM_ROOMS, SPORTS
    }

    public enum InterestSource {
        FRIENDS, TELEVISION, INTERNET, OTHER
    }

    public enum Recommendation {
        VERY_LIKELY, LIKELY, UNLIKELY
    }

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getTelephoneNumber() { return telephoneNumber; }
    public void setTelephoneNumber(String telephoneNumber) { this.telephoneNumber = telephoneNumber; }

    public LocalDate getSurveyDate() { return surveyDate; }
    public void setSurveyDate(LocalDate surveyDate) { this.surveyDate = surveyDate; }

    public LikedMost getLikedMost() { return likedMost; }
    public void setLikedMost(LikedMost likedMost) { this.likedMost = likedMost; }

    public InterestSource getInterestSource() { return interestSource; }
    public void setInterestSource(InterestSource interestSource) { this.interestSource = interestSource; }

    public Recommendation getRecommendation() { return recommendation; }
    public void setRecommendation(Recommendation recommendation) { this.recommendation = recommendation; }

}
