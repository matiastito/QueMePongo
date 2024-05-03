package ar.edu.utn.frba.dds.qmp.suguerencia;

import ar.edu.utn.frba.dds.qmp.Prenda;

public class Suguerencia {
  private Prenda calzado;
  private Prenda parteInferior;
  private Prenda parteSuperior;

  public Suguerencia(Prenda calzado, Prenda parteInferior, Prenda parteSuperior) {
    this.calzado = calzado;
    this.parteInferior = parteInferior;
    this.parteSuperior = parteSuperior;
  }
}
