/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LeSang97
 */
public class Contact {
    String yourname;
    String youremail;
    String subject;
    String yourmessage;

    public Contact(String yourname, String youremail, String subject, String yourmessage) {
        this.yourname = yourname;
        this.youremail = youremail;
        this.subject = subject;
        this.yourmessage = yourmessage;
    }

    
    public String getYourname() {
        return yourname;
    }

    public void setYourname(String yourname) {
        this.yourname = yourname;
    }

    public String getYouremail() {
        return youremail;
    }

    public void setYouremail(String youremail) {
        this.youremail = youremail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getYourmessage() {
        return yourmessage;
    }

    public void setYourmessage(String yourmessage) {
        this.yourmessage = yourmessage;
    }
    
    
}
