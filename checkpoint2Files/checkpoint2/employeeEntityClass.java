package checkpoint2Files.checkpoint2;

class employeeEntityClass implements employeeEntity{

    @Override
    public int addRecord(int ID, String fName, String lName, String pos, String loc){
        //add it to the database after chacking for repeated entries
        return(0);
    }

    @Override
    public int editRecord(int ID){
        return(0);
    }
    @Override
    public int search(int ID){
        return(0);
    }
    @Override
    public int search(String fName, String lName){
        return(0);
    }
}