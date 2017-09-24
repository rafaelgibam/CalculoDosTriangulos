package calculodostriangulos;

public class CalculaTriangulo {
	private String tflado1;
	private String tflado2;
	private String tflado3;
	
	void setLado1(String tf1) {
		tflado1 = tf1;
	}

	public String getLado1(){
		return tflado1;
	}
	
	void setLado2(String tf2) {
		tflado2 = tf2;
	}
	
	public String getLado2() {
		return tflado2;
	}
	
	void setLado3(String tf3) {
		tflado3 = tf3;
	}
	
	public String getLado3() {
		return tflado3;
	}
	
	public String getTipo() {
		String r = "";
		
			if(getLado1().equals(getLado2()) && getLado2().equals(getLado3()) && getLado1().equals(getLado3())) {
				r = "Triângulo Equilátero";
			}else if(!getLado1().equals(getLado2()) && !getLado2().equals(getLado3()) && !getLado1().equals(getLado3())){
				r = "Triângulo Escaleno";
			}else {
				r = "Triângulo Isóceles";
			}
		return r;
	}
	
}
