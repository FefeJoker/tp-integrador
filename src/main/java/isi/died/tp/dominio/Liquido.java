package isi.died.tp.dominio;


public class Liquido extends Insumo{

    public Double densidad;

    public Liquido(){};

    public Liquido(int idInsumo, String descrip, Double costoActual, Double stockActual,
                   Double peso, Boolean refrigeracion, UnidadDeMedida unidad,Double densidad){

        super(idInsumo,descrip,costoActual,stockActual,
                peso,refrigeracion,unidad);

        this.densidad = densidad;

    };


    public double calcularPeso(){
        return stock*(unidadMedida.factor())*densidad;
    }

    public double calcularPeso(double vol){
        return stock*(unidadMedida.factor())*vol*0.0001;
    }


}
