class Data {
    int x;
}

class ReferenceParamEx {

    public static void main(String[] args){

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x ="+d.x); //10

        change(d);//1000
        System.out.println("After change(d)"); // After change(d)
        System.out.println("main() : x ="+ d.x); // 1000
    }

    static void change(Data d) {
        d.x = 1000;
        System.out.println("change() : x ="+ d.x);
    }
}