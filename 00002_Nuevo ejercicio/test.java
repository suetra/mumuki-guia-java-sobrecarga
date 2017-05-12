Detector detector = new Detector();

@Test
public void saludarAManuel() {
  Assert.assertEquals("Entero", detector.detectarTipo(2));
}

@Test
public void saludarAManuel() {
  Assert.assertEquals("Flotante", detector.detectarTipo(2.0));
}