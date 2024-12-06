package objects;

import java.util.Calendar;
import java.util.GregorianCalendar;


public final class Movimientos {
        private final String numeroOperacion;
        private final GregorianCalendar fechaOperacion;
        private int tipoOperacion;
        private double montoOperacion;
        private Cuenta cuenta; 
        private static int totalOperaciones = 0;

        public Movimientos(int tipoOperacion, double montoOperacion) {
            numeroOperacion = generarNumeroOperacion();
            fechaOperacion = new GregorianCalendar();
            this.tipoOperacion = tipoOperacion;
            this.montoOperacion = montoOperacion;
        }
        
        public String generarNumeroOperacion(){
         totalOperaciones++;
         return String.format("0p%06d", totalOperaciones);
        }

        public String getNumeroOperacion() {
            return numeroOperacion;
        }

        public GregorianCalendar getFechaOperacion() {
            return fechaOperacion;
        }

        public void setTipoOperacion(int tipoOperacion) {
            this.tipoOperacion = tipoOperacion;
        }

        public int getTipoOperacion() {
            return tipoOperacion;
        }

        public void setMontoOperacion(double montoOperacion) {
            this.montoOperacion = montoOperacion;
        }
        
        public double getMontoOperacion() {
            return montoOperacion;
        }
        @Override
        public String toString() {
            String tipo = "";
            switch(tipoOperacion) {
                case 1 -> tipo = "Deposito";
                case 2 -> tipo = "Retiro";
                case 3 -> tipo = "Transferencia";
                case 4 -> tipo = "ITF";
                case 5 -> tipo = "Interes mensual";
            }
            return "\n\tNumero de operacion: " + getNumeroOperacion() +
                   "\n\tFecha: " + getFechaOperacionCorta() + 
                   "\n\tTipo: " + tipo + "\n\tMonto: " + getMontoOperacion();
        }
        
        public String getFechaOperacionCorta() {
            int dia, mes, anio;
            dia = cuenta.getCreationDate().get(Calendar.DAY_OF_MONTH);
            mes = cuenta.getCreationDate().get(Calendar.MONTH)+1;
            anio = cuenta.getCreationDate().get(Calendar.YEAR);
            return (dia<=9?"0"+dia:dia) + "/" + (mes<=9?"0"+mes:mes) + "/" + anio;
        }
}
