package br.com.variables;

// Variables Finals cannot be assigned but you can chance his variables and use his functions to chance te value


class Holder{
   private static final StringBuilder VARIAVEL_FINAL = new StringBuilder("Variavel final");
int value = 1;
   Holder link;
   
   public Holder(int val){ this.value = val; }
   public static void main(String[] args){
	final Holder a = new Holder(5);
	Holder b = new Holder(10);
	VARIAVEL_FINAL.append(" teste");
	System.out.println(VARIAVEL_FINAL);
	a.value = 15;
	a.link = b;
	b.link = setIt(a, b);
	System.out.println(a.link.value+" "+b.link.value);
   }
   
   public static Holder setIt(final Holder x, final Holder y){
       x.link = y.link;
       return x;
   }
   
}