package checkpoint2Files.checkpoint2;

interface droneEntity extends entity {
    public int addRecord(String SerialNum, float weightCap, String status, float dist, float maxSpeed, String Model);
    public int editRecord(String SerialNum);
    public int search(String SerialNum);
    
}
