/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_pratice;

/**
 *
 * @author User
 */
public class EMPLOYEES {
    int EMPLOYEE_ID;
    String FIRST_NAME;
    String LAST_NAME;
    String EMAIL;
    int PHONE_NUMBER;
   int JOB_ID;
    int SALARY;

    public EMPLOYEES() {
    }
    

    public EMPLOYEES(int EMPLOYEE_ID, String FIRST_NAME, String LAST_NAME, String EMAIL, int PHONE_NUMBER, int JOB_ID, int SALARY) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.EMAIL = EMAIL;
        this.PHONE_NUMBER = PHONE_NUMBER;
        this.JOB_ID = JOB_ID;
        this.SALARY = SALARY;
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public int getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public int getJOB_ID() {
        return JOB_ID;
    }

    public int getSALARY() {
        return SALARY;
    }

    public void setEMPLOYEE_ID(int EMPLOYEE_ID) {
        this.EMPLOYEE_ID = EMPLOYEE_ID;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public void setPHONE_NUMBER(int PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public void setJOB_ID(int JOB_ID) {
        this.JOB_ID = JOB_ID;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }

    
    
    
}
