package com.example.mildr.advocate_on_time;

/**
 * Created by mildr on 12-2-2017.
 */

public class Users {

    private int id;
    private String UserName;
    private String Password;
    private String ConfirmPassword;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Gender;
    private String Kantoor;
    private String Adres;
    private String Phone;

    public Users(){


        }
        public void setId(int id)
        {
            this.id = id;
        }
        public int getID()
        {
            return id;
        }
        public void setUserName(String userName)
        {
            this.UserName = userName;
        }
        public String getUserName()
        {
            return this.UserName;
        }
        public void setPassword(String password)
        {
            this.Password = password;
        }
        public String getPassword( )
        {
            return this.Password;
        }
        public void setConfirmPassword(String confirmPassword)
        {
            this.ConfirmPassword = confirmPassword;
        }
        public String getConfirmPassword()
        {
            return this.ConfirmPassword;
        }
        public void setFirstName(String firstName)
        {
            this.FirstName = firstName;
        }
        public String getFirstName()
        {
            return this.FirstName;
        }
        public void setLastName(String lastName)
        {
            this.LastName =lastName;
        }
        public String getLastName()
        {
            return this.LastName;
        }
        public void setEmail(String email)
        {
            this.Email = email;
        }
        public String getEmail()
        {
            return this.Email;
        }
        public void setGender(String gender)
        {
            this.Gender = gender;
        }
        public String getGender()
        {
            return this.Gender;
        }
        public void setKantoor(String kantoor)
        {
            this.Kantoor = kantoor;
        }
        public String getKantoor()
        {
            return this.Kantoor;
        }
        public void setAdres(String adres)
        {
            this.Adres = adres;
        }
        public String getAdres()
        {
            return this.Adres;
        }
        public void setPhone(String phone)
        {
            this.Phone = phone;
        }
        public String getPhone()
        {
            return this.Phone;
        }

        }

