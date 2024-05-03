package ar.edu.utn.frba.dds.qmp.suguerencia;

import ar.edu.utn.frba.dds.qmp.Prenda;
import java.util.Collection;

public class MotorDeSuguerencias {
  Collection<FiltroSugurencia> filtros;
  Collection<Prenda> prendas;

  public MotorDeSuguerencias(Collection<FiltroSugurencia> filtros, Collection<Prenda> prendas) {
    this.filtros = filtros;
    this.prendas = prendas;
  }
}
