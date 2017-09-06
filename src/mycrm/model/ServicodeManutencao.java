package mycrm.model;

public class ServicodeManutencao {
		private String produto;
		private String cliente;
		private String data;
		private String hora;
		private String status;
		
		public ServicodeManutencao(String produto, String cliente, String data, String hora, String status) {
			super();
			this.produto = produto;
			this.cliente = cliente;
			this.data = data;
			this.hora = hora;
			this.status = status;
		}
		
		
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public String getCliente() {
			return cliente;
		}
		public void setCliente(String cliente) {
			this.cliente = cliente;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getHora() {
			return hora;
		}
		public void setHora(String hora) {
			this.hora = hora;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
		
		
}
