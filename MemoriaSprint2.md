# Diseño y Jerarquía de Botones en UX/UI

## Grupo de botones
Cuando diseñamos un grupo de botones, es crucial que exista una jerarquía clara y visible entre ellos, de forma que se distingan bien las funciones de cada botón que se vaya a implementar en la aplicación. 

Esta jerarquía permite que el usuario identifique de forma inmediata cuál es la acción principal, cuál es secundaria, y cuáles son opciones adicionales. Para lograrlo, utiliza contrastes en el color, el tamaño, y el peso visual de cada botón.

Por ejemplo, el botón que lleva a la acción primaria debería ser más prominente, ya sea por su color más vibrante, un tamaño mayor, o una tipografía en negrita, mientras que los botones secundarios pueden ser de un color más tenue o con un borde más ligero. [1]

Diferenciar entre los botones ayudará a los usuarios a usar la aplicación de forma más clara.

## Evitar el peligro
Uno de los principios fundamentales en el diseño de UX/UI es proteger al usuario de errores que puedan tener consecuencias negativas, esto puede lograrse con una buena distribución semántica y dejando claras las funciones que tendrá cada botón. 

Por eso, el botón que resulte más atractivo a la vista, ya sea por su color, su tamaño, o su ubicación, debe llevar a una acción segura. Imagina un botón que esté en un tono llamativo y en una posición central: este botón debe realizar una acción como «Guardar» o «Continuar», no algo irreversible como «Eliminar» o «Resetear». [1]

Este enfoque protege a los usuarios de no llevar a cabo acciones de grave peligro dentro de la aplicación por errores o malas indicaciones de los desarrolladores.

## Mostrar el peligro
El color rojo es universalmente asociado con peligro, alerta o prohibición. El rojo se utiliza en aplicaciones para generar sensación de urgencia o alerta. [2] En nuestro caso, no implementaremos acciones de tal gravedad, ya que priorizamos que la interfaz sea amigable.

En diseño de interfaces, este color puede ser una herramienta de gran utilidad para advertir a los usuarios sobre acciones que podrían tener consecuencias importantes o irreversibles, como borrar datos, cerrar una cuenta o cancelar una suscripción. 

Usar el rojo para estos botones no solo hace que resalten visualmente, sino que también activa una alerta psicológica en el usuario, llevándolo a reconsiderar su decisión antes de proceder. Sin embargo, es fundamental no abusar del uso del rojo para evitar confusiones o desensibilización; debe reservarse únicamente para aquellas acciones que realmente requieren atención y consideración adicionales. [1]

## Formas homogéneas
La consistencia visual es uno de los pilares del buen diseño de interfaces. Los botones de tu sitio web o aplicación deben tener una forma y estilo uniformes para que el usuario los reconozca y los asocie fácilmente. 

Si un botón es redondeado, todos los botones deben ser redondeados; si tienen bordes rectos, lo mismo aplica. Esta coherencia no solo refuerza la identidad visual de tu producto, sino que también facilita la navegación al usuario, creando una experiencia más fluida y sin distracciones. [1] 

Los cambios de forma o estilo solo deben aplicarse si tienen una razón funcional clara, como diferenciar un botón de acción primaria de uno secundario, pero siempre dentro de un marco de diseño coherente.

---

# Desarrollo de las pantallas de nuestra aplicación y Componentes

Nuestra aplicación **LazyTrip** va a estar dividida en diferentes pantallas con diferentes componentes. Antes de identificar métodos, clases o atributos, vamos a explicar cada ventana y sus componentes, ya que nos ayudará a realizar el diagrama UML posteriormente.

---

## PANTALLA 1: Inicio / Bienvenida

En la primera pantalla encontramos un título centrado en la zona superior, acompañado por una pequeña barra de navegación que se sitúa justo por encima de él y que contiene el logo de nuestra aplicación junto a un botón que, al ser pulsado, despliega una pequeña ventana emergente para el inicio de sesión. Por debajo de este menú de cabecera, la pantalla se organiza en dos grandes contenedores. El primero de ellos está destinado a la creación de un nuevo viaje y permanece accesible para cualquier usuario, mientras que el segundo contenedor sirve para gestionar los viajes guardados y queda reservado únicamente para aquellos usuarios que hayan iniciado sesión en la plataforma.

### Contenedores
* **Barra de navegación (Header):** Aloja el logotipo oficial y el acceso al área personal o de inicio de sesión.
* **Contenedor "Nuevo viaje":** Sirve como punto de entrada público para comenzar la configuración de un itinerario desde cero.
* **Contenedor "Mis viajes":** Actúa como espacio personal restringido para consultar la lista de viajes guardados por el usuario registrado.

### Botones
* **Botón "Iniciar sesión" (en cabecera):** Despliega la ventana flotante (modal) para introducir correo y contraseña.
* **Botón "Empezar" (en contenedor de Nuevo viaje):** Redirige directamente a la Pantalla 2 para iniciar el proceso de selección de destino y fechas.
* **Botón "Mis viajes" (en contenedor de Mis viajes):** Abre el formulario de autenticación si no se ha iniciado sesión o da acceso directo a la Pantalla 6 si ya se está autenticado. El propio contenedor actúa como botón para la próxima pantalla.

---

## PANTALLA 2: Elegir Destino y Fechas

Al hacer clic en el contenedor de nuevo viaje pasamos a la segunda pantalla, la cual mantiene estática en la parte superior la misma barra de navegación con el menú y los botones que nos acompañará a lo largo de toda la aplicación. En el centro de la interfaz se ubica un contenedor principal que dispone de una caja de texto para escribir la ciudad que queremos visitar, seguida de varios campos dedicados a introducir la fecha de llegada y la fecha de salida con sus respectivas horas. Asimismo, incluye un menú desplegable que permite seleccionar el número de integrantes del grupo en un rango que va desde 1 viajero hasta 10 viajeros. Finalmente, la pantalla incorpora en su parte inferior un botón para continuar y avanzar a la siguiente página, así como un botón para volver atrás y regresar al inicio.

### Contenedores
* **Barra de navegación (Header):** Mantiene la identidad visual y el acceso a la sesión estáticos en la zona superior.
* **Contenedor del formulario:** Agrupa y organiza todos los campos de entrada de datos (destino, fechas, horas y viajeros).

### Botones
* **Botones de sugerencias rápidas (Chips/Pills):** Permiten seleccionar ciudades populares (como Lisboa, París o Roma) con un solo clic para rellenar automáticamente el campo de destino.
* **Botón "Continuar":** Valida que los campos requeridos estén completos y avanza a la Pantalla 3.
* **Botón "Atrás / Cancelar":** Cancela la introducción de datos y regresa a la Pantalla 1.

---

## PANTALLA 3: Presupuesto y Estilo de Viaje

En la tercera pantalla se conserva el menú estático superior y se presenta un contenedor central diseñado para configurar el presupuesto y las preferencias de la estancia. El presupuesto se ajusta mediante una línea o barra deslizante interactiva, de modo que cuanto más a la derecha se sitúe el puntero, mayor será el presupuesto asignado por persona. Justo encima de esta barra se encuentra un visor que muestra la cifra en euros y que se va actualizando en tiempo real hacia arriba o hacia abajo según desplacemos el control hacia la derecha o hacia la izquierda. Además de esta barra, el contenedor cuenta con cuatro etiquetas interactivas que funcionan como botones para seleccionar el tipo de viaje deseado entre las opciones de cultura y turismo, fiesta, relax o gastronómico, concluyendo la pantalla con los botones correspondientes para continuar a la siguiente vista o volver a la anterior.

### Contenedores
* **Barra de navegación (Header):** Elemento estático superior de control general.
* **Contenedor central de configuración:** Aloja la barra de presupuesto, el visor del importe numérico y el selector temático.
* **Visor de presupuesto:** Recuadro destacado que muestra la cifra numérica actualizada en euros.

### Botones
* **Barra deslizante (JSlider):** Funciona como un control interactivo que cambia el límite monetario al arrastrar el marcador.
* **Botones de categoría/estilo ("Cultura", "Relax", "Gastronomía", "Fiesta"):** Permiten seleccionar la preferencia temática del viaje para filtrar posteriormente las sugerencias de la API.
* **Botón "Generar mi viaje / Continuar":** Procesa las preferencias elegidas y navega hacia la Pantalla 4.
* **Botón "Atrás":** Permite regresar a la Pantalla 2 para modificar las fechas o el destino.

---

## PANTALLA 4: Selección de Alojamiento

La cuarta pantalla muestra en su parte superior el título de alojamientos acompañado por el nombre de la ciudad elegida para el viaje. A partir de ahí, la interfaz se distribuye en dos contenedores bien diferenciados. El contenedor de la izquierda alberga una lista vertical que se va cargando a medida que el usuario se desplaza hacia abajo, mostrando las distintas opciones de hospedaje junto a sus precios orientativos. Por su parte, el contenedor de la derecha es de menor tamaño y se actualiza en función del alojamiento que seleccionemos en la lista izquierda, ofreciendo un botón con el enlace hacia la plataforma externa para realizar la reserva y, justo debajo, el botón de continuar para avanzar a la siguiente etapa. En la zona superior de este panel derecho se ubica también un botón para cambiar el destino y las fechas, el cual redirige de nuevo a la segunda pantalla en caso de querer modificar la búsqueda.

### Contenedores
* **Contenedor izquierdo (Catálogo de hoteles):** Aloja la lista desplegable vertical con las fichas de los alojamientos disponibles.
* **Contenedor derecho (Panel de selección actual):** Muestra el resumen matemático del presupuesto gastado/restante y la opción seleccionada.

### Botones
* **Botón "Consultar precio y disponibilidad" (en cada tarjeta):** Abre el enlace externo hacia la plataforma de reserva (ej. Booking).
* **Botón "Cambiar destino o fechas":** Reorienta al usuario de vuelta a la Pantalla 2 para corregir los parámetros iniciales.
* **Botón "Elegir y crear itinerario / Continuar":** Confirma la elección del hotel, la guarda en la sesión y pasa a la Pantalla 5.

---

## PANTALLA 5: Elaboración del Itinerario

En la quinta pantalla encontramos en la parte superior un contenedor con el nombre del destino y, justo debajo, un mapa interactivo que ubica los puntos de interés a medida que se van agregando al plan. En la zona inferior se despliega un catálogo de actividades distribuidas en filas de tres en tres, las cuales se ordenan mostrando en primer lugar aquellas que Google clasifica como más cercanas al estilo de viaje seleccionado anteriormente. Cada actividad dispone de un botón de añadir que la traslada directamente al contenedor ubicado en el centro de la pantalla, donde se genera el itinerario ordenado cronológicamente de la hora más temprana a la más tardía. Encima de este itinerario central se sitúa una serie de pequeños botones horizontales generados según el número de días que dure el viaje, permitiendo que al pulsar sobre el botón del día 2 o del día 3 la pantalla se refresque para mostrar y editar la planificación de esa jornada específica. Para finalizar, la pantalla cuenta con un botón para aceptar y guardar el viaje en el perfil del usuario registrado, junto con otro botón destinado a descargar el itinerario en formato PDF por si no se dispone de cuenta o se prefiere guardar en local.

### Contenedores
* **Contenedor del mapa:** Visualiza la ruta geográfica y los puntos numerados de la jornada.
* **Contenedor central del itinerario:** Lista cronológica que organiza las paradas y actividades por hora.
* **Contenedor inferior (Sugerencias):** Rejilla de opciones de restauración y turismo proporcionadas por la API.

### Botones
* **Botones de selección de día ("DÍA 1", "DÍA 2", etc.):** Filtran y refrescan el contenido del mapa y de la lista para mostrar solo las actividades de la jornada seleccionada.
* **Botones "Añadir" (en tarjetas de actividad):** Incorporan la ubicación correspondiente al itinerario central.
* **Botón "Guardar en Perfil":** Almacena el viaje de forma definitiva en la base de datos vinculada al usuario.
* **Botón "Descargar PDF":** Ejecuta el motor de informes (JasperReports) para exportar el plan de viaje en un documento imprimible.

---

## PANTALLA 6: Mis Viajes

A la pantalla de gestión de viajes se accede desde el botón situado junto a la opción de crear viaje en la pantalla principal, siempre que el usuario se haya registrado o haya iniciado sesión previamente. Una vez dentro, la interfaz genera un contenedor independiente por cada itinerario guardado, mostrando el nombre del destino correspondiente y un botón que permite abrir la pantalla con sus detalles, además de incluir un botón general para volver a la ventana anterior. Si el usuario cuenta con varios viajes planificados, sus respectivos contenedores irán apareciendo uno debajo del otro en forma de lista organizada.

### Contenedores
* **Contenedor de lista general:** Aloja verticalmente todas las tarjetas de viajes guardados en el perfil.

### Botones
* **Botón "Abrir viaje completo":** Carga los datos guardados de ese viaje y redirige a la Pantalla 7.
* **Botón "+ Nuevo viaje":** Permite iniciar la creación de un nuevo itinerario volviendo a la Pantalla 2.
* **Botón "Volver / Atrás":** Regresa a la Pantalla 1 (Inicio).

---

## PANTALLA 7: Resumen e Información del Viaje

Esta pantalla ofrece un resumen general del viaje seleccionado y sitúa debajo del título superior un menú de navegación que contiene el acceso a la galería y un botón para volver atrás. El cuerpo de la interfaz se organiza en tres contenedores horizontales: el primero a la izquierda muestra las fechas globales de la estancia, el contenedor central recoge la información del alojamiento reservado y el contenedor de la derecha presenta el desglose del presupuesto total. Si dentro del menú superior se presiona el botón de fotos, la aplicación nos dirige inmediatamente a la octava pantalla.

### Contenedores
* **Contenedor izquierdo (Fechas):** Muestra el rango de días de inicio y fin del viaje.
* **Contenedor central (Alojamiento):** Muestra los datos y confirmación del hotel reservado.
* **Contenedor derecho (Presupuesto):** Muestra el resumen del dinero estimado por persona.

### Botones
* **Botones de pestañas del menú ("Resumen", "Fotos"):** Alternan entre las distintas vistas del viaje guardado.
* **Botón "Fotos":** Redirige específicamente a la Pantalla 8 para gestionar la galería.
* **Botón "Atrás":** Regresa a la Pantalla 6 (Mis viajes).

---

## PANTALLA 8: Galería y Subida de Fotos

La última pantalla permite subir y organizar fotografías directamente desde la galería del dispositivo según el día del viaje en el que fueron tomadas. Al igual que ocurría en la ventana del itinerario, la interfaz dispone de una botonera numerada en función de los días de duración del viaje, de manera que al seleccionar un día concreto solo se visualizarán los recuerdos asociados a esa fecha. Si el usuario añade imágenes en el día 1 y posteriormente pulsa el botón del día 2, las fotografías del primer día se ocultarán temporalmente hasta que se vuelva a hacer clic sobre el botón del día 1. La pantalla concluye con el correspondiente botón para regresar a la vista anterior.

### Contenedores
* **Contenedor de galería activa:** Muestra la cuadrícula de fotografías almacenadas para el día seleccionado.
* **Contenedor de subida / carga:** Área para arrastrar o seleccionar nuevos archivos de imagen desde el dispositivo.

### Botones
* **Botones de selección de día ("DÍA 1", "DÍA 2", etc.):** Filtran las imágenes mostradas en pantalla alternando la visibilidad según la jornada elegida.
* **Botón "Añadir / Subir foto":** Abre el explorador de archivos del sistema operativo para seleccionar imágenes.
* **Botón "Atrás":** Regresa a la Pantalla 7 (Resumen e información del viaje).

---

## ¿Qué haría un usuario en nuestra aplicación?

1. **Abrir la aplicación y pulsar "Empezar"** en la pantalla de bienvenida para iniciar un nuevo viaje (o iniciar sesión si prefiere identificarse de primeras).
2. **Elegir el destino, las fechas y la cantidad de viajeros**, escribiendo la ciudad en el buscador inteligente o haciendo clic en una ciudad sugerida.
3. **Ajustar el presupuesto y el estilo de viaje**, moviendo la barra deslizante para fijar el gasto por persona y seleccionando su preferencia (Cultura, Relax, Gastronomía o Fiesta).
4. **Elegir su alojamiento**, explorando la lista de hoteles reales disponibles y confirmando el que mejor se ajuste a su presupuesto restante.
5. **Armar el itinerario diario**, añadiendo las actividades recomendadas que le gusten para que se ordenen automáticamente por hora en su plan y se marquen en el mapa.
6. **Guardar el viaje**, pulsando en "Guardar en Perfil" si tiene cuenta activa o en "Descargar PDF" para guardarlo en su equipo.
7. **Consultar sus viajes**, entrando más adelante al apartado "Mis viajes" para revisar el resumen de sus escapadas planificadas.
8. **Subir sus fotos**, accediendo a la galería para subir las imágenes de su viaje organizadas por el día en que fueron tomadas.

---

## Diseño de métodos, atributos y clases de nuestra aplicación

| Tipo de Componente | Nombre de componentes | Propiedades | Evento | Comportamiento | Persistencia |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **1. Botones de Avance y Salida** | Botones Empezar, Continuar, Atrás, Volver | Botón con texto y color | Hace clic | Revisa los datos y cambia a la siguiente pantalla | Memoria (RAM): Guarda lo que has escrito mientras usas la app. |
| **2. Inicio de Sesión** | Botón Iniciar sesión y Mis viajes | Botón o tarjeta con texto de estado | Hace clic | Si ya entraste muestra tus viajes; si no, abre la ventana para identificarte | En memoria (RAM): Revisa si estás dentro de tu cuenta. |
| **3. Buscador de Ciudad** | Caja para escribir el destino | Cuadro de texto vacío con ayuda | Escribe letras | Muestra sugerencias de ciudades mientras tecleas | En memoria (RAM): Guarda la ciudad y sus coordenadas. |
| **4. Sugerencias Rápidas (Chips)** | Botones de ciudades (Lisboa, París) | Botones pequeños con forma de píldora | Hace clic | Copia la ciudad pulsada directamente en el buscador | En memoria (RAM): Actualiza el destino elegido. |
| **5. Fechas y Pasajeros** | Calendarios, horas y selector de viajeros (1-10) | Desplegables y cajas de fecha | Elige una fecha o número | Comprueba que la fecha de vuelta sea posterior a la de ida | En memoria (RAM): Guarda las fechas y número de personas. |
| **6. Barra de Presupuesto** | Barra deslizante de dinero (€) | Barra horizontal con número arriba | Mueve el tirador | Actualiza el precio en euros en tiempo real según mueves el control | En memoria (RAM): Guarda el dinero límite marcado. |
| **7. Filtros y Días** | Botones de estilo (Cultura, Relax) y días (DÍA 1, DÍA 2) | Grupo de botones conmutables | Pulsa para activar uno | Enciende el botón elegido y filtra la pantalla con esa opción | En memoria (RAM): Guarda el estilo o día seleccionado. |
| **8. Tarjetas de Información** | Fichas de hoteles, actividades y viajes guardados | Cuadros con foto, precio, estrellas y botón | Hace clic en la tarjeta | Añade la actividad al plan o abre los detalles | En memoria / Base de datos: Lee o añade datos al plan. |
| **9. Enlace Web Externa** | Botón Consultar precio y disponibilidad | Botón tipo enlace | Hace clic | Abre tu navegador de internet en la página de Booking | No guarda nada: Solo te lleva a una web externa. |
| **10. Guardar y Exportar** | Botones Guardar en Perfil y Descargar PDF | Botón con icono de guardado | Hace clic | Guarda el viaje en tu cuenta o descarga el documento PDF | Permanente: Guarda los datos para siempre en la base de datos o en un archivo. |
| **11. Subir Fotografías** | Botón Subir foto | Botón que abre carpetas | Elige una foto de su PC | Abre el explorador de archivos del PC y sube la foto a la app | Permanente: Guarda la foto o su enlace en la base de datos. |

### Referencias

* **[1]** Mitto, «Guía de botones UX UI,» *Mitto Agency*, 30 de julio de 2024. [En línea]. Disponible en: https://mitto.agency/guia-de-botones-ux-ui/. [Accedido: 21-oct-2026].
* **[2]** Yapiko.com. Consultado: el 28 de octubre de 2026. [En línea]. Disponible en: https://yapiko.com/es/blog/psicologia-del-color-en-el-diseno-de-interfaces-moviles/. [Accedido: 28-oct-2026].
