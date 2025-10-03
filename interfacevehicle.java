interface interfacevehicle {
    void engine();
    void iam();
}
class car implements interfacevehicle{
    public void engine(){
        System.out.println("i am a car engine ");
    }
    public void iam(){
        System.out.println("i am a car");
    }
}
class bike implements interfacevehicle{
    public void engine(){
        System.out.println("i am a bike engine ");
    }
    public void iam(){
        System.out.println("i am a bike");
    }
}
class Main {
    public static void main ( String args[]){
        interfacevehicle iv=new bike();
        interfacevehicle ivv= new car();
        iv.engine();
        iv.iam();
        ivv.engine();
        ivv.iam();
    }
}