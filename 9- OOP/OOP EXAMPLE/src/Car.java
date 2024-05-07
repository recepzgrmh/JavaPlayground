public class Car {

    private String model;

    
    public Car(){
        model = "Boş";
        color = "Yok";
        speed = 0;
    }

    public Car(String model, String color, int speed) {
        this.model = model;
     

    }

    private void setSpeed(int speed) {
        if (this.speed < 0 || this.speed > 800) {
            this.speed = 0;
        }
    }

    private int getSpeed() {
        return speed;
    } 

    public void accalerate(int value){
        speed += value;
        System.out.println(model + " is accelerating. Current speed: " + speed);
    }

    public void brake(int value){
        speed = speed-value < 0 ? 0 : speed - value;
        System.out.println(model + " is accelerating. Current speed: " + speed);
    }

}

      

       