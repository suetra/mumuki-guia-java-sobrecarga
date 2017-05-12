@Test
public void saludarAManuel() {
  Assert.assertEquals("Hola Manuel", SaludoPersonalizado.saludar("Manuel"));
}

@Test
public void saludarAManuelBelgrano() {
  Assert.assertEquals("Hola Belgrano, Manuel", SaludoPersonalizado.saludar("Manuel", "Belgrano"));
}

@Test
public void saludarASanMartin() {
  Assert.assertEquals("Hola Perez, Pablo", SaludoPersonalizado.saludar("Pablo", "Perez"));
}