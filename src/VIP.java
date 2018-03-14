
public class VIP extends Ingresso{

	float valor_adicional;
	//float valor;
	
	public float valorDoIngressoVIP(){
		return super.getValor() + valor_adicional;
	}
}
