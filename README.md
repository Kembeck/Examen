# Examen
Retroalimentación Examen Parcial 1 
# Cambios realizados al código

- En la clase `Pizza` faltaban declarar las variables `tipoSalsa`, `tipoBase` y `toppings`.

- Los parámetros `Toppings[0]` y `Toppings[1]` estaban mal escritos, ya que esa sintaxis no es válida en Java.

- Había varios métodos `anadirIngrediente` innecesarios y uno tenía dos parámetros con el mismo nombre.

- Se dejó un solo método `anadirIngrediente` para recibir todos los toppings mediante un arreglo.

- En `Orden`, los toppings estaban definidos automáticamente como jamón y pepperoni, por lo que el usuario no podía elegirlos.

- Se modificó `Orden` para que el usuario pueda elegir cuántos toppings quiere y cuáles desea agregar.

- Se agregó validación para evitar opciones incorrectas al seleccionar los toppings.

- Se modificó la selección de salsa para que el usuario pueda escogerla mediante opciones.

- Se agregaron algunos getters en `Pizza` para poder obtener la información guardada.

- La clase `Cocina` prácticamente no necesitó cambios.

- El `enum Toppings` ya estaba correcto y no fue necesario modificarlo.