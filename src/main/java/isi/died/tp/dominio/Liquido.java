package isi.died.tp.dominio;


public class Liquido extends Insumo{

    public Double densidad;

    public Liquido(){};

    public Liquido(String descrip, Double costoActual, Double peso, Boolean refrigeracion, UnidadDeMedida unidad, Double densidad){

        super(descrip, costoActual, peso, refrigeracion, unidad);

        this.densidad = densidad;

    };


    public double calcularPeso(){
        return stock.getCantidad()*(unidadMedida.factor())*densidad;
    }

    public double calcularPeso(double vol){
        return stock.getCantidad()*(unidadMedida.factor())*vol*0.0001;
    }


}
