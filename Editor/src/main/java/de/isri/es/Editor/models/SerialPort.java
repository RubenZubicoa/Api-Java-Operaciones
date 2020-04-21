package de.isri.es.Editor.models;

public class SerialPort {

		private int idEquipo;
		private String serialPort;
		private int BaudRate;
		private int dataBits;
		private String parity;
		private String stopBits;
		
		private Equipo equipo;

		public SerialPort() {
			super();
		}

		public SerialPort(int idEquipo, String serialPort, int baudRate, int dataBits, String parity, String stopBits,
				Equipo equipo) {
			super();
			this.idEquipo = idEquipo;
			this.serialPort = serialPort;
			BaudRate = baudRate;
			this.dataBits = dataBits;
			this.parity = parity;
			this.stopBits = stopBits;
			this.equipo = equipo;
		}

		public int getIdEquipo() {
			return idEquipo;
		}

		public void setIdEquipo(int idEquipo) {
			this.idEquipo = idEquipo;
		}

		public String getSerialPort() {
			return serialPort;
		}

		public void setSerialPort(String serialPort) {
			this.serialPort = serialPort;
		}

		public int getBaudRate() {
			return BaudRate;
		}

		public void setBaudRate(int baudRate) {
			BaudRate = baudRate;
		}

		public int getDataBits() {
			return dataBits;
		}

		public void setDataBits(int dataBits) {
			this.dataBits = dataBits;
		}

		public String getParity() {
			return parity;
		}

		public void setParity(String parity) {
			this.parity = parity;
		}

		public String getStopBits() {
			return stopBits;
		}

		public void setStopBits(String stopBits) {
			this.stopBits = stopBits;
		}

		public Equipo getEquipo() {
			return equipo;
		}

		public void setEquipo(Equipo equipo) {
			this.equipo = equipo;
		}
		
		
		
	
	
}
