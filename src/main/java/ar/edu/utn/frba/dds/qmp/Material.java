package ar.edu.utn.frba.dds.qmp;

import java.util.Collection;

import static ar.edu.utn.frba.dds.qmp.Trama.LISA;

public class Material {

    private final Trama trama;
    private final Collection<TipoPrenda> prendasCompatibles;

    Material(Collection<TipoPrenda> prendasCompatibles) {
        this.trama = LISA;
        this.prendasCompatibles = prendasCompatibles;
    }

    Material(Trama trama, Collection<TipoPrenda> prendasCompatibles) {
        this.trama = trama;
        this.prendasCompatibles = prendasCompatibles;
    }

    public boolean puedeUsarseEn(TipoPrenda tipoPrenda) {
        return prendasCompatibles.contains(tipoPrenda);
    }
}
