public class Robot implements RobotPlan{

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setRobotHead(String head) {
        robotHead=head;
    }

    public String getRobotHead(){
        return robotHead;
    }


    @Override
    public void setRobotTorso(String Torso) {
        robotTorso=Torso;
    }

    public String getRobotTorso(){
        return robotTorso;
    }

    @Override
    public void setRobotArms(String arms) {
        robotArms=arms;
    }

    public String getRobotArms(){
        return robotArms;
    }

    @Override
    public void setRobotLegs(String legs) {
        robotLegs=legs;
    }

    public String getRobotLegs(){
        return robotLegs;
    }
}
