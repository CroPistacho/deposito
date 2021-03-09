package cuentas;

/**
 * @version 1.0
 * @author mart
 * @since 09/03/2021
 */
public class CCuenta {

    /**
     * Atributos
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Contructor vacío
     */
    public CCuenta() {
    }

    /**
     * @param nom es el nombre del dueño de la cuenta
     * @param cue es el numero de cuenta
     * @param sal es el saldo de la cuenta
     * @param tipo es el tipo de cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
    }

    /**
     * @return nombre del dueño (String)
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre del dueño
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El numero de cuenta es de tipo String porque es de la forma
     * 1000-2365-85-123456789 y tiene -
     *
     * @return numero de cuenta (String)
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta es el numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo de la cuenta (Double)
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipo de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres de la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * @return saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Este metodo lo que hace es comprobar si se puede sumar dinero al saldo
     * y para ello comprueba que la cantidad es mayor a 0. De ser menor que 0
     * lanzaría una Excepcion con un mensaje por consola.
     * 
     * @param cantidad es el dinero a ingresar
     * @throws Exception si cantidad es menor que 0
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Resta la la cantidad pasada como parametro a la cuenta.
     * Si la cantidad es negativa o el saldo es negativo lanzaa una excepcion.
     * 
     * @param cantidad es el dinero a ingresar
     * @throws Exception si cantidad es menor o igual a 0 o si no hay saldo en la cuenta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
