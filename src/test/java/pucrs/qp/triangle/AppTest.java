package pucrs.qp.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
  @Test
  public void testEscaleno() {
    int actual = App.identificaTriangulo(2, 3, 4);
    int expected = Tipos.ESCALENO.value();
    assertEquals(expected, actual);
  }

  @Test
  public void testEquilatero() {
    int actual = App.identificaTriangulo(5, 5, 5);
    int expected = Tipos.EQUILATERO.value();
    assertEquals(expected, actual);
  }

  @Test
  public void testIsosceles() {
    int actual = App.identificaTriangulo(6, 6, 7);
    int expected = Tipos.ISOSCELES.value();
    assertEquals(expected, actual);
  }

  @Test
  public void testInvalido() {
    int actual = App.identificaTriangulo(6, 6, -7);
    int expected = Tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }
}
