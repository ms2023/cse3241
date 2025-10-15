package checkpoint2Files.checkpoint2;

interface employeeEntity extends entity {
    public int addRecord(int ID, String fName, String lName, String pos, String loc);
    public int editRecord(int ID);
    public int search(int ID);
    public int search(String fName, String lName);
}
