
public class CamaroteSuperior extends VIP{

	float valor_adicional;
	
	public float valorDoIngresso(){
		return super.valorDoIngressoVIP() + valor_adicional;
	}
}
