package ar.edu.utn.frba.dds.qmp;

import static ar.edu.utn.frba.dds.qmp.Categoria.PRENDA_INFERIOR;
import static ar.edu.utn.frba.dds.qmp.Categoria.PRENDA_SUPERIOR;

public enum TipoPrenda {
    CAMISA(PRENDA_SUPERIOR), REMERA(PRENDA_INFERIOR);

    private final Categoria categoria;

    TipoPrenda(Categoria categoria) {
        this.categoria = categoria;
    }
}

