package br.com.methods;
class MyObj {
    Integer value = new Integer(0);

     void add(Integer i){ 
        i+= 10;
    }

    void add(MyObj i){
        i.value++;
    }

    void imprime(MyObj myObj){
        System.out.println("value: " + myObj.value);
    }

    public static void main(String[] args) {
        MyObj myObj = new MyObj();
        myObj.imprime(myObj);
        myObj.add(myObj);
        myObj.imprime(myObj);
        myObj.add(myObj.value); // nao muda
        myObj.imprime(myObj);
    }
}