# Memoria Sprint Número 2 | Sprint Review


## 1. Usabilidad y accesibilidad: características, pautas y estándares.

### 1.1 Usabilidad
---
La norma ISO 9241-11 define la usabilidad como un producto que puede ser usado por unos usuarios concretos para conseguir unos objetivos concretos con eficacia, eficiencia y satisfacción dentro de un contexto [1].

Aplicado a LazyTrip, esto significa:
- **Eficacia:** un usuario introduce destino, fechas y presupuesto y obtiene el itinerario sin equivocarse.
- **Eficiencia:** lo consigue en pocos pasos, siguiendo la regla de los 3 clics.
- **Satisfacción:** tiene la sensación de que la aplicación le ha ahorrado trabajo.

#### 1.1.1 Características de una interfaz usable

Según Jakob Nielsen, una interfaz es usable cuando cumple cinco características básicas [2]:

**Facilidad de aprendizaje.** El usuario debe entender cómo funciona la aplicación desde la primera vez que la usa, sin necesidad de un manual. En LazyTrip lo conseguimos en tres pasos: primero se introduce el presupuesto, después se elige el alojamiento y, por último, se genera el itinerario. Así el usuario siempre sabe en qué punto del proceso está.

**Eficiencia.** Una vez que el usuario ha aprendido a usar la aplicación, debe poder realizar las tareas de forma rápida. Por eso en LazyTrip aplicamos la regla de los 3 clics definida en el Sprint 1, de forma que el itinerario se genere con un máximo de tres clics.

**Memorabilidad.** Si el usuario deja de usar la aplicación durante un tiempo, al volver debe recordar cómo funciona sin tener que aprender de nuevo. Para ello, LazyTrip mantiene la misma barra de navegación, los mismos iconos y la misma distribución en todas las pantallas.

**Prevención y gestión de errores.** La aplicación debe evitar que el usuario cometa errores y, si los comete, ayudarle a corregirlos. Por ello, LazyTrip evita fechas mal escritas o imposibles y muestra un aviso claro cuando el presupuesto introducido no es suficiente para el viaje.

**Satisfacción.** El uso de la aplicación debe resultar agradable para el usuario. LazyTrip tiene una interfaz minimalista y moderna con la librería FlatLaf, lo que hace que la información sea fácil de leer y visualmente atractiva.

#### 1.1.2 Pautas de usabilidad: principios de Jakob Nielsen

Para el diseño de LazyTrip seguimos los 10 principios de usabilidad de Jakob Nielsen [3]:

- **Visibilidad del estado del sistema:** evitar pantallas en blanco durante la generación de itinerarios mediante *skeleton screens* (feedback).
- **Relación entre el sistema y el mundo real:** lenguaje cotidiano del usuario.
- **Control y libertad del usuario:** opciones para deshacer o cambiar de pantalla con total libertad en el flujo 1. Presupuesto, 2. Alojamiento, 3. Generar itinerario.
- **Consistencia y estándares:** establecer convenciones lógicas.
- **Prevención de errores:** proporcionar asistencia a los usuarios para que encuentren lo que están buscando. Ejemplo: buscador.
- **Reconocer antes que recordar:** el destino, las fechas y el presupuesto se mantienen visibles en la cabecera del viaje.
- **Flexibilidad y eficiencia de uso:** atajos de teclado para usuarios avanzados sin complicar al principiante.
- **Diseño estético y minimalista:** solo se muestra lo necesario en cada pantalla.
- **Ayudar a reconocer, diagnosticar y recuperarse de errores:** mensajes cortos que dicen qué ha pasado y cómo solucionarlo.
- **Ayuda y documentación:** *tooltips* en los botones y un pequeño tutorial la primera vez que se abre la aplicación.



### 1.2 Accesibilidad
---
La accesibilidad es el conjunto de prácticas, técnicas y principios que permiten que una aplicación sea usable por cualquier persona, sin importar sus capacidades [4]. Es decir, la accesibilidad busca que la aplicación la pueda usar cualquier persona.

#### 1.2.1 Principios de accesibilidad (WCAG)

Las WCAG se basan en cuatro principios [4][5]:

- **Perceptible:** contraste adecuado entre el texto y el fondo para mejorar la legibilidad.
- **Operable:** navegación clara y predecible.
- **Comprensible:** los textos deben ser claros y sencillos.
- **Robusto:** código limpio y soportado por tecnologías estables para garantizar la compatibilidad a largo plazo con los dispositivos.

#### 1.2.2 Pautas de accesibilidad aplicadas en LazyTrip

A partir de estos cuatro principios [4][5], en LazyTrip aplicaremos las siguientes pautas:

**Pautas visuales (Perceptible):**
- Contraste mínimo de 4.5:1 para texto normal y 3:1 para texto grande [6].
- Fuente sans-serif legible, con un tamaño mínimo de 14 px.

**Pautas de interacción (Operable):**
- Sin límites de tiempo que obliguen al usuario a actuar rápido.

**Pautas de contenido (Comprensible):**
- Un botón nunca cambia de pantalla sin que el usuario lo espere.
- Lectura fácil: frases cortas y vocabulario cotidiano.

**Pautas técnicas (Robusto):**
- Probar la aplicación con un lector de pantalla mediante Java Access Bridge [7].



### 1.3 Estándares y normativa de referencia
---
Nos basamos en los siguientes estándares y normas:

**WCAG 2.2 (W3C) [6].** Son las pautas internacionales de accesibilidad digital y establecen tres niveles de cumplimiento: A, AA y AAA. Nuestro objetivo es alcanzar el nivel AA, que es el que exige la normativa europea. Aunque están pensadas para la web, también se aplican a aplicaciones de escritorio y móviles.

**ISO 9241-11:2018 [8].** Define qué es la usabilidad y nos sirve de base para medir la eficacia, la eficiencia y la satisfacción de la aplicación.

**ISO 9241-210:2019 [9].** Establece el diseño centrado en el usuario, que justifica nuestro proceso de trabajo: encuestas, prototipo, pruebas con usuarios y rediseño.

**UNE-EN 301 549 [10].** Es la norma europea de accesibilidad para productos TIC e indica cómo aplicar los criterios de las WCAG al software de escritorio y a las apps móviles.

**Acta Europea de Accesibilidad (Directiva (UE) 2019/882) y Ley 11/2023 [11][12].** Obligan desde el 28 de junio de 2025 a que ciertos servicios digitales sean accesibles, como el comercio electrónico o el transporte de viajeros. Si LazyTrip llegara a vender reservas le afectaría, por eso la diseñamos accesible desde el principio.

#### 1.3.1 Legislación

Real Decreto 1112/2018 [13] y el Reglamento de Accesibilidad Europea [11].


## 2. Medidas de usabilidad y accesibilidad; herramientas de auditoría.

### 2.1 Medidas de usabilidad
---
Siguiendo la norma ISO 9241-11 [8], medimos la usabilidad de LazyTrip a través de la eficacia, la eficiencia y la satisfacción.

**Eficacia.** Mide si los usuarios consiguen completar las tareas. Para ello calcularemos la tasa de éxito, es decir, el porcentaje de usuarios que completan una tarea sin ayuda, con el objetivo de que al menos el 90 % lo consiga. También contaremos los errores cometidos en cada tarea, como pulsar un botón equivocado o introducir un dato inválido, y buscamos que no haya más de un error por tarea.

**Eficiencia.** Mide el esfuerzo que necesita el usuario para alcanzar su objetivo. Contaremos el número de clics desde la pantalla de inicio hasta obtener el itinerario, que no debe superar los tres clics. Además, cronometraremos el tiempo que tarda el usuario en crear un viaje, con el objetivo de que sea inferior a dos minutos.

**Satisfacción.** Mide si el uso de la aplicación resulta agradable. Para evaluarla utilizaremos un cuestionario para conocer su nivel de satisfacción.

### 2.2 Medidas de accesibilidad que cumple LazyTrip
---
Tras revisar los mockups de LazyTrip según los criterios de conformidad de las WCAG 2.2 [6][14], hemos comprobado que la aplicación ya cumple las siguientes medidas de accesibilidad:

**Títulos descriptivos (2.4.2 y 2.4.6 – Nivel A y AA).** Cada pantalla tiene un título que explica claramente para qué sirve, como "¿Qué quieres hacer hoy?", "Elige cualquier destino", "Presupuesto y estilo" o "Alojamiento en Lisboa".

**Etiquetas e instrucciones (3.3.2 – Nivel A).** Todos los campos indican qué dato hay que introducir: correo electrónico, contraseña, llegada, salida y viajeros. Además, el campo de destino incluye un texto de ayuda: "Puedes elegir cualquier ciudad del mundo o elegir una sugerencia".

**Navegación coherente (3.2.3 – Nivel AA).** Los elementos que se repiten aparecen siempre en la misma posición: el botón "Cancelar" a la izquierda, "Continuar" a la derecha y el enlace "Volver al inicio" en la parte superior de cada paso.

**Identificación coherente (3.2.4 – Nivel AA).** Los botones que realizan la misma acción tienen siempre el mismo nombre, como "Continuar" y "Cancelar" en todos los pasos.

**Ubicación del usuario (2.4.8 – Nivel AAA).** El usuario sabe en todo momento en qué parte del proceso se encuentra gracias a los indicadores "Paso 1 de 3", "Paso 2 de 3" y "Paso 3 de 3". Este criterio pertenece al nivel máximo de las WCAG, por lo que supera el nivel AA que nos hemos marcado como objetivo.

**Sin límites de tiempo (2.2.1 – Nivel A).** Ninguna pantalla obliga al usuario a realizar una acción en un tiempo determinado, de modo que cada persona puede ir a su ritmo.

**Sin destellos (2.3.1 – Nivel A).** La aplicación no contiene animaciones ni elementos que parpadeen, que podrían provocar crisis en personas con epilepsia fotosensible.

**Instrucciones que no dependen de la forma o la posición (1.3.3 – Nivel A).** Las indicaciones se dan siempre mediante texto, como "Elige cualquier destino" o "Iniciar sesión", y nunca con expresiones como "pulsa el botón de la derecha".

**Información no transmitida solo con color (1.4.1 – Nivel A), cumplido en parte.** Las etiquetas de los alojamientos ("Mejor equilibrio", "Mejor ubicación" y "Más comodidad") son texto, la valoración aparece con número ("★ 9.1") y el presupuesto restante se muestra en cifras. Sin embargo, los botones de tipo de viaje y las pestañas todavía no indican de forma clara cuál está seleccionado.

**Contraste del texto (1.4.3 – Nivel AA).** Los elementos principales tienen un contraste adecuado, como el botón "Iniciar sesión", el importe del presupuesto, el título del destino, los nombres de los hoteles o el recuadro de presupuesto diario.

## 3. Seguimiento, modificación y documentación de los esquemas.

## 4. Diseño y Jerarquía de Botones en UX/UI

### 4.1 Grupo de botones
Cuando diseñamos un grupo de botones, es crucial que exista una jerarquía clara y visible entre ellos, de forma que se distingan bien las funciones de cada botón que se vaya a implementar en la aplicación. 

Esta jerarquía permite que el usuario identifique de forma inmediata cuál es la acción principal, cuál es secundaria, y cuáles son opciones adicionales. Para lograrlo, utiliza contrastes en el color, el tamaño, y el peso visual de cada botón.

Por ejemplo, el botón que lleva a la acción primaria debería ser más prominente, ya sea por su color más vibrante, un tamaño mayor, o una tipografía en negrita, mientras que los botones secundarios pueden ser de un color más tenue o con un borde más ligero. [1]

Diferenciar entre los botones ayudará a los usuarios a usar la aplicación de forma más clara.

### 4.2 Evitar el peligro
Uno de los principios fundamentales en el diseño de UX/UI es proteger al usuario de errores que puedan tener consecuencias negativas, esto puede lograrse con una buena distribución semántica y dejando claras las funciones que tendrá cada botón. 

Por eso, el botón que resulte más atractivo a la vista, ya sea por su color, su tamaño, o su ubicación, debe llevar a una acción segura. Imagina un botón que esté en un tono llamativo y en una posición central: este botón debe realizar una acción como «Guardar» o «Continuar», no algo irreversible como «Eliminar» o «Resetear». [1]

Este enfoque protege a los usuarios de no llevar a cabo acciones de grave peligro dentro de la aplicación por errores o malas indicaciones de los desarrolladores.

### 4.3 Mostrar el peligro
El color rojo es universalmente asociado con peligro, alerta o prohibición. El rojo se utiliza en aplicaciones para generar sensación de urgencia o alerta. [2] En nuestro caso, no implementaremos acciones de tal gravedad, ya que priorizamos que la interfaz sea amigable.

En diseño de interfaces, este color puede ser una herramienta de gran utilidad para advertir a los usuarios sobre acciones que podrían tener consecuencias importantes o irreversibles, como borrar datos, cerrar una cuenta o cancelar una suscripción. 

Usar el rojo para estos botones no solo hace que resalten visualmente, sino que también activa una alerta psicológica en el usuario, llevándolo a reconsiderar su decisión antes de proceder. Sin embargo, es fundamental no abusar del uso del rojo para evitar confusiones o desensibilización; debe reservarse únicamente para aquellas acciones que realmente requieren atención y consideración adicionales. [1]

### 4.4 Formas homogéneas
La consistencia visual es uno de los pilares del buen diseño de interfaces. Los botones de tu sitio web o aplicación deben tener una forma y estilo uniformes para que el usuario los reconozca y los asocie fácilmente. 

Si un botón es redondeado, todos los botones deben ser redondeados; si tienen bordes rectos, lo mismo aplica. Esta coherencia no solo refuerza la identidad visual de tu producto, sino que también facilita la navegación al usuario, creando una experiencia más fluida y sin distracciones. [1] 

Los cambios de forma o estilo solo deben aplicarse si tienen una razón funcional clara, como diferenciar un botón de acción primaria de uno secundario, pero siempre dentro de un marco de diseño coherente.

---

## 5. DISEÑO UI Y MAQUETACIÓN GRÁFICA

### 5.1 Colores
- **Fondo Principal / Base:** Tono azul clarísimo muy suave (mantiene una apariencia limpia e higiénica para el fondo de pantalla y con buen contraste con los demás colores).
- **Fondo de Contenedores / Tarjetas:** Blanco puro para generar contraste, delimitación y legibilidad sobre la base.
- **Azul Primario (Acciones Principales y Acentuación):** Azul eléctrico/intenso empleado en botones de llamado a la acción (*Iniciar sesión*, *Comprobar en Booking*) y bloques destacados.
- **Azul Secundario (Destacados y Tarjetas de Resumen):** Azul marino/petróleo oscuro utilizado en tarjetas de selección lateral, títulos principales y botones de acción secundaria (*+ Añadir*, botones de paso).
- **Verde Agua / Turquesa:** Utilizado para resaltar badges de recomendación (*Mejor equilibrio*, *Mejor ubicación*), valores monetarios clave y botones de confirmación principal (*Elegir y crear itinerario*).
- **Gris Neutro y Suave:** Empleado en bordes de inputs, etiquetas secundarias, marcadores de rango, campos de formulario y líneas divisorias. [3]

### 5.2 Fuentes
- **Tipografía / Familia:** Sans-Serif de trazo limpio, legible y moderno. [4]
- **Jerarquía Tipográfica:**
  - **Títulos de Sección / Pregunta:** Sans-Serif con peso de fuente *Bold* o *Extra Bold*, tamaño grande y color azul oscuro.
  - **Etiquetas Superiores (Overlines / Categories):** Texto en mayúsculas sostenidas, de menor tamaño, en tono turquesa/verde agua o gris neutro.
  - **Cuerpo de Texto / Descripciones:** Peso regular, tamaño medio, color gris oscuro o neutro para garantizar alta legibilidad.
  - **Placeholders e Inputs:** Mayúsculas para el *label* del campo y texto estándar o atenuado en el interior de las cajas de entrada.

### 5.3 Iconos y Elementos Gráficos
---
- **Logotipo / Identidad Visual:** Icono ilustrado circular en la esquina superior izquierda con motivos de viaje (globo terráqueo, brújula, avión o hamaca).
- **Símbolos e Indicadores:**
  - **Flechas de Flujo:** Indicadores simples de dirección textual (como `-->`, `-->`, `<-`) en botones y enlaces de retroceso.
  - **Iconos de Valoración / Estrellas:** Puntuaciones visuales acompañadas del número de valoración (ej. `★ 9.1`, `★ 4.9`) en esquinas superiores de tarjetas.
  - **Indicadores de Lista:** Círculos delimitadores en la cronología o itinerario para marcar horas y eventos.
  - **Iconos de Enlace Exterior:** Símbolo discreto de flecha hacia arriba a la derecha (ej. *Google Maps ↗*).

### 5.4 Distribución (Layout)
- **Encabezado (Header):** Fijo o limpio en la parte superior, con el logotipo posicionado a la izquierda y el estado/perfil de usuario (*Hola, Usuario*) alineado a la derecha.
- **Estructura Modular / Cajas (Cards):** Los contenidos principales y formularios se organizan dentro de contenedores o tarjetas blancas bien definidas sobre el fondo claro.
- **Disposición en Cuadrícula (Grid) y Columnas:**
  - **Cuadrículas de Opciones / Tarjetas:** Distribución horizontal balanceada en 2 o 3 columnas para seleccionar opciones, tipos de viaje o tarjetas de recomendaciones.
  - **Columna Lateral (Sidebar):** En pantallas con resultados, disposición de 2 columnas donde la columna izquierda muestra los resultados y la derecha un resumen fijo de la selección.
- **Alineación y Espaciado:** Centrado de contenido principal en pantallas de wizards/pasos con un espacio visual holgado (*padding*) alrededor de los elementos para transmitir una experiencia limpia y libre de saturación.

---

## 6. Desarrollo de las pantallas de nuestra aplicación y Componentes y Flatlaf

## 6.1 FlatLaf
---
FlatLaf es una biblioteca de apariencia visual para aplicaciones de java desarrolladas con Swing. Otorga a la interfaz grafica un diseño plano moderno, limpio e inspiratorio en los entornos visuales actuales(macOS, Windows 11).

La principal diferencia es que Swing es el framework original de Java para crear interfaces gráficas, mientras que FlatLaf es una biblioteca externa que moderniza el aspecto visual (Look and Feel) de Swing.

Aqui una tabla con las diferencias claves.

| Característica | Swing (Por defecto) | FlatLaf (Flat Look and Feel) |
| ----- | ----- | ----- |
| **Naturaleza** | Framework base e integrado en el JDK. | Biblioteca externa (código abierto). |
| **Diseño** | Antiguo, basado en los estilos de los años 2000 (Metal, Nimbus). | Moderno, limpio, plano y minimalista (estilo IntelliJ IDEA). |
| **Soporte HiDPI** | Limitado o inconsistente en pantallas 4K/modernas. | **Excelente soporte nativo para pantallas de alta resolución**. |
| **Modo Oscuro** | No incluye temas oscuros modernos por defecto. | Incluye variantes **Dark** (Oscuro) y **Light** (Claro) listas para usar. |
| **Personalización** | Compleja y requiere reescribir muchos componentes. | Muy sencilla mediante archivos de propiedades y temas personalizados. |

Para implementar FlatLaf en Swing simplemente hay que importar la biblioteca.

FlatLaf cuenta con características avanzadas que la convierten en la biblioteca líder para modernizar Java Swing.
Pero finalmente tras investigar, no usaremos FlatLaf ya que tenemos problemas al importar la librería. Usaremos solo y exclusivamente Swing.

## 6.2 Desarrollo de las pantallas de nuestra aplicación y Componentes
Nuestra aplicación **LazyTrip** va a estar dividida en diferentes pantallas con diferentes componentes. Antes de identificar métodos, clases o atributos, vamos a explicar cada ventana y sus componentes, ya que nos ayudará a realizar el diagrama UML posteriormente.

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

## 6.3 ¿Qué haría un usuario en nuestra aplicación?

1. **Abrir la aplicación y pulsar "Empezar"** en la pantalla de bienvenida para iniciar un nuevo viaje (o iniciar sesión si prefiere identificarse de primeras).
2. **Elegir el destino, las fechas y la cantidad de viajeros**, escribiendo la ciudad en el buscador inteligente o haciendo clic en una ciudad sugerida.
3. **Ajustar el presupuesto y el estilo de viaje**, moviendo la barra deslizante para fijar el gasto por persona y seleccionando su preferencia (Cultura, Relax, Gastronomía o Fiesta).
4. **Elegir su alojamiento**, explorando la lista de hoteles reales disponibles y confirmando el que mejor se ajuste a su presupuesto restante.
5. **Armar el itinerario diario**, añadiendo las actividades recomendadas que le gusten para que se ordenen automáticamente por hora en su plan y se marquen en el mapa.
6. **Guardar el viaje**, pulsando en "Guardar en Perfil" si tiene cuenta activa o en "Descargar PDF" para guardarlo en su equipo.
7. **Consultar sus viajes**, entrando más adelante al apartado "Mis viajes" para revisar el resumen de sus escapadas planificadas.
8. **Subir sus fotos**, accediendo a la galería para subir las imágenes de su viaje organizadas por el día en que fueron tomadas.

---

## 6.4 Diseño de métodos, atributos y clases de nuestra aplicación

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

## 7. Pautas de la secuencia de control de la aplicación.

La secuencia de control determina lo que el usuario puede hacer en cada momento y cómo la aplicación responde a sus interacciones en base a las pantallas y componentes del punto 6.

### 7.1 Inicio y Acceso
* El usuario puede pulsar en el contenedor de "Nuevo viaje" para empezar a diseñar su itinerario al instante.
* El usuario puede pulsar en "Mis viajes", pero si no ha iniciado sesión, la aplicación le mostrará una ventana emergente para identificarse antes de dejarle entrar.
* Puede pulsar el botón de *Login* de la barra superior fija para identificarse sin importar en qué pantalla se encuentre.

### 7.2 Configuración del Viaje
* El usuario puede escribir la ciudad de destino, elegir las fechas de llegada y salida con sus respectivas horas, y seleccionar la cantidad de viajeros.
* Moviendo la barra deslizante a la izquierda o derecha puede cambiar su presupuesto por persona en tiempo real.
* Puede pulsar sobre los botones de etiquetas para indicar qué tipo de experiencia busca (Cultura, Relax, etc.).
* Puede pulsar "Continuar" para avanzar o "Atrás" para volver y corregir cualquier dato sin perder lo escrito.

### 7.3 Selección de Alojamiento
*  El usuario puede deslizarse por la lista de alojamientos de la izquierda para ver las opciones disponibles.
* Al pulsar sobre un hotel, puede ver sus datos en el panel derecho y pulsar el botón con el enlace externo para abrir la web de Booking en su navegador.
*  Si decide modificar las fechas o el destino, puede pulsar el botón "Cambiar destino y fechas" para volver directamente a la Pantalla 2.

### 7.4 Organización del Itinerario y Días
* El usuario puede pulsar los botones numerados según los días de viaje para organizar el plan o las fotos de ese día concreto.
* Al pulsar "Añadir" en las sugerencias, las actividades se colocan automáticamente en la agenda ordenadas por hora y se marcan en el mapa.
* Al terminar, si está registrado puede pulsar "Guardar en perfil" para conservarlo en su cuenta; si no tiene cuenta, puede pulsar "Guardar en PDF" para descargarlo localmente.

### 7.5 Consulta y Recuerdos
* En "Mis viajes", el usuario puede ver la lista de sus itinerarios creados y pulsar en uno para abrir su resumen completo.
* En la galería, puede pulsar el botón de subir foto para abrir el explorador de archivos de su ordenador, seleccionar imágenes y dejarlas guardadas asociadas a cada día del viaje.

## 8. Cronogramas de Ejecución (Sprint backlog)

### 8.1 Fases y tareas del Sprint 
| Fase / Etapa | ID Tarea | Tarea | Duración Estimada | A Entregar: |
| :--- | :---: | :--- | :---: | :--- |
| **1. Análisis** | **T1.1** | Usabilidad y accesibilidad: características, pautas y estándares | 2 días | Documento de requisitos de accesibilidad y contraste|
| | **T1.2** | Medidas de usabilidad y accesibilidad; herramientas de auditoría | 2 días | Informe de métricas y herramientas de auditoría |
| **2. Diseño y Prototipado** | **T2.1** | Seguimiento, modificación y documentación de esquemas y maquetas | 5 días | Prototipos de Java Swing |
| | **T2.2** | Pautas de diseño estructural: menús, ventanas, cuadros de diálogo, atajos de teclado | 3 días | Guía de diseño estructural y mapa de atajos de teclado |
| | **T2.3** | Pautas de aspecto: colores, fuentes, iconos, distribución | 1 día | Manual de estilo visual y guía de aspecto de la app |
| **3. Desarrollo y Lógica** | **T3.1** | Pautas para el desarrollo de componentes visuales interactivos | 4 días | Diseño de componentes UI y tabla de eventos y persistencia |
| | **T3.2** | Pautas de la secuencia de control de la aplicación[cite: 1] | 1 día | Flujo de control |
| **4. Pruebas y Auditoría** | **T4.1** | Ejecución de pruebas y auditorías de accesibilidad | 2 días | Informe de pruebas de usabilidad y accesibilidad |
| **5. Documentación** | **T5.1** | Ajustes finales y consolidación de la documentación | 1 día | Memoria técnica final y repositorio actualizado |

## 8.2 Diagrama de Gantt



### 9.Referencias

* **[1]** Mitto, «Guía de botones UX UI,» *Mitto Agency*, 30 de julio de 2024. [En línea]. Disponible en: https://mitto.agency/guia-de-botones-ux-ui/. [Accedido: 21-oct-2026].
* **[2]** Yapiko.com. Consultado: el 28 de octubre de 2026. [En línea]. Disponible en: https://yapiko.com/es/blog/psicologia-del-color-en-el-diseno-de-interfaces-moviles/. [Accedido: 28-oct-2026].
* **[3]** E. E. de Empresa, “La psicología del color y sus aplicaciones”, Escuela Europea de Empresa. Consultado: el 29 de octubre de 2026. [En línea]. Disponible en: https://escuelaeuropeadeempresa.eu/la-psicologia-del-color-y-sus-aplicaciones/
* **[4]** O. Velarde, “La guía definitiva de la psicología de la tipografía”, Visme Blog. Consultado: el 29 de octubre de 2026. [En línea]. Disponible en: https://visme.co/blog/es/psicologia-de-la-tipografia/
