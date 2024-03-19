public class Performance {
    private String performanceID;
    private String performanceName;
    private String performanceLeadName;
    private char performanceGroup;

    public Performance(String performanceID, String performanceName, String performanceLeadName, char performanceGroup){
        this.performanceID = performanceID;
        this.performanceName = performanceName;
        this.performanceLeadName = performanceLeadName;
        this.performanceGroup = performanceGroup;
    }

    public void setperformanceID(String performanceID){
        this.performanceID = performanceID;
    }

    public String getperformanceID(){
        return performanceID;
    }

    public void setperformanceName(String performanceName){
        this.performanceName = performanceName;
    }

    public String getperformanceName(){
        return performanceName;
    }

    public void setperformanceLeadName(String performanceLeadName){
        this.performanceLeadName = performanceLeadName;
    }

    public String getperformanceLeadName(){
        return performanceLeadName;
    }

    public void setperformanceGroup(char performanceGroup){
        this.performanceGroup = performanceGroup;
    }

    public int getperformanceGroup(){
        return performanceGroup;
    }

    public String toString() {
        return "Performance{performanceID='" + performanceID + "', PerformanceName='" + performanceName + "', PerformanceLeadName='" + performanceLeadName + "', performanceGroup='" + performanceGroup + "'}";
    }

}
