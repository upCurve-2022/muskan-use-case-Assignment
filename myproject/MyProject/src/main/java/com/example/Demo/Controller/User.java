package com.example.Demo.Controller;

import javax.persistence.*;
@Entity
@Table
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column(name = "first_name")
        private String firstname;
        @Column(name = "last_name")
        private String lastname;
        @Column(name = "gender")
        private String gender;
        @Column(name = "date_of_birth")
        private String dob;
        @Column(name = "age")
        private String age;
        @Column(name = "email_id")
        private String email;
        @Column(name = "password")
        private String password;
        @Column(name = "mobile_no")
        private String mobile_no;
        @Column(name = "address")
        private String address;


    public User() {
    }

    public User(String firstname, String lastname, String gender, String dob, String age, String email, String password, String mobile_no, String address) {
            super();
            this.firstname = firstname;
            this.lastname = lastname;
            this.gender = gender;
            this.dob = dob;
            this.age = age;
            this.email = email;
            this.password = password;
            this.mobile_no = mobile_no;
            this.address = address;
        }

    public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getMobile_no() {
            return mobile_no;
        }

        public void setMobile_no(String mobile_no) {
            this.mobile_no = mobile_no;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }



    }

