package section17.polite_worker;

public class Worker {

    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public synchronized  void work(SharedResources sharedResources, Worker otherWorker){

        while (active){
            if(sharedResources.getOwner()!=this){
                try{
                    wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }
            if (otherWorker.isActive()){
                System.out.println(getName() + " : give the resource to the worker " + otherWorker.getName());
                sharedResources.setOwner(otherWorker);
                continue;
            }
            System.out.println(getName()+" : working on the common resources");
            active=false;
        }

    }
}
