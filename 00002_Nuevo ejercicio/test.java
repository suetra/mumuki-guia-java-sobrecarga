Detector detector = new Detector();

@Test
public void detectarUnEntero() {
  Assert.assertEquals("Entero", detector.detectarTipo((int) 2));
}

@Test
public void detectarUnFlotante() {
  Assert.assertEquals("Flotante", detector.detectarTipo((float) 2.0));
}