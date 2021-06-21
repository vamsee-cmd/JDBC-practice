/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Vamshi
 */
class user {
    private int sno;
    private String name,htno,gpa,gender;
    public user(int sno,String name,String htno,String gpa,String gender){
        this.sno=sno;
        this.name=name;
        this.htno=htno;
        this.gpa=gpa;
    }
    public int getsno(){
        return sno;
    }
    public String getname(){
        return name;
    }
        public String gethtno(){
        return htno;
    }
         public String getgpa(){
        return gpa;
    }
             public String getgender(){
        return gender;
    }
}
