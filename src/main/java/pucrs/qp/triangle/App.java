package pucrs.qp.triangle;

import javax.management.InvalidAttributeValueException;

/**
 * @author marco.mangan@pucrs.br
 */
public class App {
  public static int identificaTriangulo(int a, int b, int c) throws InvalidAttributeValueException {
    if (a <= 0 || b <= 0 || c <= 0) {
      throw new InvalidAttributeValueException("Todos os valores devem ser inteiros e maior de zero.");
    } else {
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
  }

  public static void main(String[] args) {
    try {
      System.out.println("Triângulos!");
      System.out.println(identificaTriangulo(2, 3, 4));
    } catch (InvalidAttributeValueException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
