class Tv{

    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }

    void channelUp(){
        ++channel;
    }

    void channelDown(){
        --channel;
    }
}


class TvTest2 {

    public static void main(String[] args){
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        t2 = t1;
        System.out.println("t1 channel : "+t1.channel);
        System.out.println("t2 channel : "+ t2.channel);

        t1.channel = 7;
        System.out.println("t2 channel change 7");

        System.out.println("t1 channel : "+t1.channel);
        System.out.println("t2 channel : "+ t2.channel);


    }
}