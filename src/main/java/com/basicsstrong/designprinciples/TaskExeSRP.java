package com.basicsstrong.designprinciples;

//SRP > Single Responsiility Principle -  A class should have one, only one reason to change

class TaskScheduling{

    public String compute(){
        return "computing data based on user input";
    }
    public String save(){
        return "save the object to database";
    }
    public String sendNotification(){
        return "send the notification to the user";
    }

}

class SchedulingApplication{
   TaskScheduling taskScheduling;

    public SchedulingApplication(TaskScheduling taskScheduling) {

        this.taskScheduling = taskScheduling;
    }

    public void schedule()
    {
        System.out.println(taskScheduling.compute());
        System.out.println(taskScheduling.save());
        System.out.println(taskScheduling.sendNotification());
    }
}

class SchedulingApplicationSRP{
    Compute compute;
    Save save;
    SendNotification sendNotification;

    public SchedulingApplicationSRP(Compute compute, Save save, SendNotification sendNotification) {
        this.compute = compute;
        this.save = save;
        this.sendNotification = sendNotification;
    }

    public void schedule()
    {
        System.out.println(compute.compute());
        System.out.println(save.save());
        System.out.println(sendNotification.sendNotification());
    }
}


class Compute{
    public String compute(){
        return "computing data based on user input";
    }
}
class Save{
    public String save(){
        return "save the object to database";
    }
}
class SendNotification{
    public String sendNotification(){
        return "send the notification to the user";
    }
}

public class TaskExeSRP {
    public static void main( String[] args ){
        SchedulingApplication schedulingApplication = new SchedulingApplication(new TaskScheduling());

        schedulingApplication.schedule();

        SchedulingApplicationSRP schedulingApplicationSRP = new SchedulingApplicationSRP(new Compute(), new Save(), new SendNotification());

        schedulingApplicationSRP.schedule();
    }
}
