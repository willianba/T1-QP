package pucrs.qp.triangle;

/**
 * @author marco.mangan@pucrs.br
 */
public class App {
  public static int identificaTriangulo(int a, int b, int c) {
    if ((a < b + c) && (b < a + c) && (c < b + a)) {
      if ((a == b) && (b == c))
        return Tipos.EQUILATERO.value();
      else if ((a != b) && (a != c) && (b != c))
        return Tipos.ESCALENO.value();
      else
        return Tipos.ISOSCELES.value();
    }
    return Tipos.INVALIDO.value();
  }

  public static void main(String[] args) {
    System.out.println("Triângulos!");
    System.out.println(identificaTriangulo(2, 3, 4));
  }
}
