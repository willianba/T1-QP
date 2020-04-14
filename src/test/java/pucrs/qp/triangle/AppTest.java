package pucrs.qp.triangle;

import static org.junit.Assert.assertEquals;

import javax.management.InvalidAttributeValueException;

import org.junit.Test;

public class AppTest {
  @Test
  public void testEscaleno() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(2, 3, 4);
    int expected = Tipos.ESCALENO.value();
    assertEquals(expected, actual);
  }

  @Test
  public void testEquilatero() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(5, 5, 5);
    int expected = Tipos.EQUILATERO.value();
    assertEquals(expected, actual);
  }

  @Test
  public void testIsosceles() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(6, 6, 7);
    int expected = Tipos.ISOSCELES.value();
    assertEquals(expected, actual);
  }

  @Test
  public void primeiroVarianteDeTres() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(6, 7, 6);
    int expected = Tipos.ISOSCELES.value();
    assertEquals(expected, actual);
  }

  @Test
  public void segundoVarianteDeTres() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(7, 6, 6);
    int expected = Tipos.ISOSCELES.value();
    assertEquals(expected, actual);
  }

  @Test(expected = InvalidAttributeValueException.class)
  public void valorZero() throws InvalidAttributeValueException {
    App.identificaTriangulo(8, 0, 9);
  }

  @Test(expected = InvalidAttributeValueException.class)
  public void valorNegativo() throws InvalidAttributeValueException {
    App.identificaTriangulo(2, 3, -4);
  }

  @Test
  public void valoresNaoTriangulares() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(1, 2, 3);
    int expected = Tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

  @Test
  public void primeiroVarianteDeSete() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(1, 3, 2);
    int expected = Tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

  @Test
  public void segundoVarianteDeSete() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(3, 1, 2);
    int expected = Tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

  @Test
  public void linhaLonga() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(1, 2, 8);
    int expected = Tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

  @Test
  public void varianteDeNove() throws InvalidAttributeValueException {
    int actual = App.identificaTriangulo(8, 1, 2);
    int expected = Tipos.INVALIDO.value();
    assertEquals(expected, actual);
  }

  @Test(expected = InvalidAttributeValueException.class)
  public void todosZero() throws InvalidAttributeValueException {
    App.identificaTriangulo(0, 0, 0);
  }

  @Test(expected = InvalidAttributeValueException.class)
  public void testInvalido() throws InvalidAttributeValueException {
    App.identificaTriangulo(6, 6, -7);
  }
}
