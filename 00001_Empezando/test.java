@Test
public void saludarAManuel() {
  Assert.assertEquals(SaludoPersonalizado.saludar("Manuel"), "Hola Manuel");
}

@Test
public void saludarAManuelBelgrano() {
  Assert.assertEquals(SaludoPersonalizado.("Manuel", "Belgrano"), "Hola Belgrano, Manuel");
}

@Test
public void saludarASanMartin() {
  Assert.assertEquals(SaludoPersonalizado.("Pablo", "Perez"), "Hola Perez, Pablo");
}