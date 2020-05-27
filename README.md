### Consideraciones
* A la clase `Prenda` le agregue un atributo **temperaturaMaxima** y un metodo para comprobar si la prenda es apta a cierta temperatura.
* Para las sugerencias de atuendos, hay un metodo en `Usuario` que genera una sugerencia a partir de su guardarropas y el clima.
* El clima lo tiene una `Ciudad`. Esta lo actualiza a traves de un proveedor. No se hasta que punto es prolijo tener el proveedor en la clase `Ciudad`, pero no encontre mejor lugar para tenerlo. Quizas por ahora tampoco hacia falta este lugar?
* Para poder manejar eventualmente distintos proveedores de clima, use el patron Adapter. Actualmente hay una interfaz `ClimaProvider` para poder tratar distintos proveedores de manera polimorfica. Asi, hay un adapter `ClimaProviderAccuWeather` que implementa esta interfaz y se encarga de hablar con la API de AccuWeather. En un futuro agregar otro proveedor de clima implicaria simplemente crear otra clase adapter como esta, que interactue con la API correspondiente.
* El ultimo requisito dice que *"Como stakeholder de QuéMePongo, quiero poder asegurar la calidad de mi aplicación sin incurrir en costos innecesarios"*. Yo interpreto que lo que quieren es evitar mandar reuquests innecesarias para no pagar $0.05 cada vez que se use el clima ~~y asi evitar fundirse~~. Entonces se me ocurre tener en una especie de cache las respuestas de una request mientras estas sigan siendo validas. Lo que hice fue que al pedirle el clima a la ciudad, esta solo lo pide al proveedor si es realmente necesario (o sea, si paso mas de 1 hora del ultimo clima guardado). Quizas tener esto en `Ciudad` no esta del todo bien, podria ser una caracteristica de cada proveedor mas bien. De hecho, si fuese asi, se pued eliminar la clase `Ciudad` porque solo haria de pasamanos.
* Ademas, durante el desarrollo y testing se podria tener un mock para el proveedor de clima, en vez de llamar a la API todo el tiempo. De esta forma nos ahorramos el costo extra que esto generaría.
