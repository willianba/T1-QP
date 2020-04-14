package pucrs.qp.triangle;

/**
 * @author marco.mangan@pucrs.br
 */
public enum Tipos {
  EQUILATERO(1), ESCALENO(2), ISOSCELES(3), INVALIDO(4);
  private final int value;

  Tipos(int v) {
    this.value = v;
  }

  public int value() {
    return value;
  }
}
