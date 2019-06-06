package isi.died.tp.dominio;

public class Liquido extends Insumo implements Comparable<Insumo> {

    public Double densidad;

    public Liquido(){};

    public Liquido(int idInsumo, String descrip, Double costoActual, Double stockActual,
                   Double pesoEnKg, Boolean refrigeracion, UnidadDeMedida unidad,Double densidad){

        super(idInsumo,descrip,costoActual,stockActual,
                pesoEnKg,refrigeracion,unidad);

        this.densidad = densidad;

    };


    public double calcularPeso(){
        return stock*(unidadMedida.factor())*densidad;
    }

    public double calcularPeso(double vol){
        return stock*(unidadMedida.factor())*vol*0.0001;
    }

    @Override
    public int compareTo(Insumo L2) {
        return (int) (this.stock- ((Liquido) L2).stock);

    }
}
