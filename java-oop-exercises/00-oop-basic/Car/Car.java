package Car;

class Car{
    String brand;
    String model;
    int year;
    String color;
    double speed;

    void accelerate (double value){
        speed += value;
    }

    void brake(double value){
        speed -= value;
        if (speed < 0){
            System.out.println("ERRO!! Não é possível ter velocidade negativa, então foi ajustada para 0.");
            speed = 0;
        }
    }

    void showInfo(){
        System.out.printf("%s %s %d %s \n", brand, model, year, color);
        System.out.println("Speed: " + speed);
    }
}
