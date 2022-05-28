package model;

public class Employee {
    private int id;
    private String barcode;
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private String contact;
    private boolean status;
    private int positionId;

    public  Employee(String barcode,String lastName,String firtName,String middleName,String dateOfBirth,String address,String contact,boolean status,int positionId){

        this.barcode=barcode;
        this.lastName=lastName;
        this.firstName=firtName;
        this.middleName=middleName;
        this.dateOfBirth=dateOfBirth;
        this.address=address;
        this.contact=contact;
        this.status=status;
        this.positionId=positionId;
    }

    public  Employee(int id,String barcode,String lastName,String firtName,String middleName,String dateOfBirth,String address,String contact,boolean status,int positionId){
        this.id=id;
        this.barcode=barcode;
        this.lastName=lastName;
        this.firstName=firtName;
        this.middleName=middleName;
        this.dateOfBirth=dateOfBirth;
        this.address=address;
        this.contact=contact;
        this.status=status;
        this.positionId=positionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }
    @Override
    public  String toString(){
        String text="";
        text+=id+","+barcode+","+lastName+","+firstName+","+middleName+","+dateOfBirth+","+address+","+contact+","+status+","+positionId;
        return  text;
    }

    @Override
    public  boolean equals(Object object){
        Employee employee=(Employee) object;
        return  employee.status==((Employee) object).status;
    }
}
