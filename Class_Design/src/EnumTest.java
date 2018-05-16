
enum Fruits {
	
	maca(1, "Vermelha"),
	pera(2, "Verde"),
	banana(3,"Amarela");
	
	private final Integer value;
	private final String cor;
	
	private Fruits(Integer value, String cor){
		this.value=value;
		this.cor=cor;
	}
	
	public Integer getValue() {
		return value;
	}
	public String getCor() {
		return cor;
	}
	
}
public class EnumTest{
	public static void main(String[] args) {
		System.out.println(Fruits.banana + " "+ Fruits.banana.getCor() + " " + Fruits.banana.getValue());
		System.out.println(ObjectsSolids.CHAIR);
		System.out.println(AnotherEnum.CHAIR +" " +AnotherEnum.CHAIR.getValor());
		for (AnotherEnum x:AnotherEnum.values()){
			System.out.print(" valor: "+x.name());
		}
		System.out.println(AnotherEnum.CHAIR.getValor()==1);
	}
}

enum ObjectsSolids{
	CHAIR, TABLE, PIANO;
}
enum AnotherEnum{
	CHAIR(1), TABLE(2), PIANO(3);
	private final int valor;

	private AnotherEnum(int valor) {
		this.valor = valor;
	}
	public int getValor() {
		return valor;
	}
}

