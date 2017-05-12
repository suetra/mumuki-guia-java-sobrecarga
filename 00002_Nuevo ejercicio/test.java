Detector detector = new Detector();

@Test
public void detectarUnEntero() {
  Assert.assertEquals("Entero", detector.detectarTipo(2));
}

@Test
public void detectarUnFlotante() {
  Assert.assertEquals("Flotante", detector.detectarTipo(2.0));
}