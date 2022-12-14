
public class C1H extends C1 {

	private int motor_eletrico;

	public C1H() {
		super();
		this.motor_eletrico = 0;
	}

	public C1H(String a_marca, String o_modelo, int a_cilindrada, int a_potencia, float a_fiabilidade,float o_pa, estadoMotor o_estado, tipoPneu os_pneus, int o_motorE) {
		super(a_marca,o_modelo,a_cilindrada,a_potencia,a_fiabilidade,o_pa,o_estado,os_pneus);
		this.motor_eletrico = o_motorE;
	}

	//CONSTRUTOR DEFAULT -> A VIABILIDADE DOS C1H É 0.95, SEMPRE
	public C1H(String a_marca, String o_modelo, int a_cilindrada, int a_potencia,float o_pa, int o_motorE)
	{
	 super(a_marca,o_modelo,a_cilindrada,a_potencia,o_pa);
	 this.setFiabilidade(0.95f);
	 this.motor_eletrico = o_motorE;
	}

	public int getMotorEletrico() {
		return this.motor_eletrico;
	}

	public void setMotorEletrico(int motorE) {
		this.motor_eletrico = motorE;
	}

	public C1H(C1H p) {
		super(p.getMarca(),p.getModelo(),p.getCilindrada(),p.getPotencia(),p.getFiabilidade(),p.getPa(),p.getEstado(),p.getPneus());
		this.motor_eletrico = p.getMotorEletrico();
	}

	public C1H clone() {
		return new C1H(this);
	}

	public String toString()
	{
		String s =  super.toString();
		return(s + "Motor Eletrico: " + this.getMotorEletrico() + "\n" );
	}


	public boolean equals(Object o) {
		if(this == o) 
			return true;
		if(o == null || o.getClass() != this.getClass())
			return false;
		 C1H c = (C1H) o;
		 return (c.getMotorEletrico() == this.getMotorEletrico() && super.equals(o));
	 }

}