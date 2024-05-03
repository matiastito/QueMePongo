package ar.edu.utn.frba.dds.qmp;

public class PrendaBorrador {

  private TipoPrenda tipoPrenda;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;

  PrendaBorrador(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  PrendaBorrador deColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
    return this;
  }

  PrendaBorrador deColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
    return this;
  }

  PrendaBorrador deMaterial(Material material) {
    if (!material.puedeUsarseEn(tipoPrenda))
      throw new RuntimeException("No se puede construir con ese material.");
    this.material = material;
    return this;
  }
}
