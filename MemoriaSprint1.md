<p align="center">
  <img src="/assets/logoLazyTrip.png" alt="Logo LazyTrip" width="220"/>
</p>

# Memoria Técnica y Documentación del Sprint 1 
# 1. Introducción
Este documento recoge la memoria y la gestión de nuestro proyecto para el Sprint 1 de la asignatura Desarrollo de
Interfaces. El objetivo de esta fase es mostrar el diseño de interfaces gráficas de nuestra aplicación, metodologías,
uso de arquitecturas profesionales como MVC y el desglose de nuestras tareas.

## 2. Descripción del Proyecto
### 2.1 Identificación del Público Objetivo
Tras una investigación sobre presupuestos de jóvenes realizado en 33 jóvenes Españoles
hemos llegado a la situación de:
Sobre el 81,85% de los jóvenes españoles de entre 18 y 24 años viajan solamente 1 o 2 veces al año y sobre un 12,1% no viaja ni una sola vez, reconociendo que la falta de presupuesto es lo que más les impide viajar, por ello nuestra aplicación busca que se proporcionen los sitios más ajustados al bolsillo de cada uno.
[Ver Resultados de la Encuesta de Viajes (Google Forms)](https://docs.google.com/forms/d/1md7psvZ9x08voK7zRiic7U_xJHFKZ1plC8UFBwDeojA/viewanalytics)

![IMAGEN DE RESPALDO](/assets/Datosencuesta1.png)


Los mayores dolores de cabeza en este jóven público es además del presupuesto ajustado, la falta de tiempo, por ello la aplicación se encarga de armar itinerarios acorde al estilo de cada uno, desde días de descanso(actividades relajantes) hasta días de adrenalina o disfrute(parques de atracciones, bares, actividades), ahorrando tiempo y dinero
Nuestro público objetivo está formado principalmente por jóvenes de entre 18 y 35 años, especialmente estudiantes, mochileros y viajeros con un presupuesto ajustado.

Son personas que buscan conocer nuevos lugares y vivir experiencias, pero que tienen que controlar bastante el gasto del viaje. Por este motivo, suelen comparar precios de transporte, alojamiento y actividades antes de tomar una decisión.

Dentro de este público podemos encontrar diferentes perfiles:

- **Estudiantes:** tienen un presupuesto más limitado y suelen aprovechar fines de semana, puentes y vacaciones para viajar.

- **Mochileros**: buscan conocer varios lugares gastando lo mínimo posible y suelen ser más flexibles con el alojamiento y el transporte.
  
- **Jóvenes trabajadores:** pueden disponer de algo más de presupuesto, pero normalmente tienen menos tiempo disponible para viajar.
  
- **Viajeros con presupuesto ajustado**: buscan ofertas y alternativas económicas para poder realizar el viaje sin gastar demasiado.

También necesitan aprovechar al máximo el tiempo disponible. Al disponer muchas veces de pocos días para realizar una escapada, resulta útil tener organizado qué visitar, dónde comer y qué actividades realizar.

### 2.2 Objetivos Principales de la Interfaz
El objetivo principal de nuestra interfaz es que cumpla con la regla de **"3 clicks"**.
la regla de los 3 clics es el número máximo de clics que debería de hacer un usuario de nuestra aplicación para conseguir la información más critica. por ello la mejor opción seria el 1 presupuesto 2 alojamiento 3 generar itinerario.[1][2]

Nuesta interfaz además, debe cumplir el principio de simplicidad visual que consiste en que solo aparezcan en pantalla los elementos necesarios funciones claras y bien definidas para evitar abrumar al usuario.

#### 2.2.1 Requisitos para hacer una buena interfaz:
- Botones y Opciones de un único sentido: Hacer que cada botón, texto o icono tenga una función clarísima y que el usuario sepa para qué sirve nada más verlo. Botones y Opciones de un único sentido: Hacer que cada botón, texto o icono tenga una función clarísima y que el usuario sepa para qué sirve nada más verlo.[1][2][3]

- Mostrar solo lo necesario en cada momento: Enseñar únicamente las opciones que el usuario necesita en la pantalla en la que está, no las de todo el proceso a la vez.

- Ordenar la información: Usar tarjetas, listas o tablas con buen espacio entre ellas para que lo más importante se vea de un solo vistazo.

- Hacer las cosas fáciles al usuario: Cambiar los campos donde hay que escribir a mano por botones para marcar, listas o funciones automáticas

#### 2.2.2 Posible opción de carga de itinerarios:
una carga rápida de itinerarios, básicamente, lo que nos dice es que la app no debe dejar al usuario esperando con una pantalla en blanco, sino mostrar pantallas esqueleto (skeleton screens) mientras los datos se descargan por detrás.

Para LazyTrip lo aplicaremos guardando el texto y la agenda del día en la memoria caché del dispositivo, para que abra al instante tanto en móvil como en escritorio y cargue lo pesado como los mapas en segundo plano.

#### 2.2.3 ¿Como será la visualización de gastos por dia?:
Hablando de la Visualización clara de gastos por día, consiste en mostrar el dinero gastado de forma muy visual usando etiquetas de colores según la categoría (transporte, comida, alojamiento) e iconos sencillos para no recargar la interfaz.

Para LazyTrip la mejor opción es poner en la cabecera de cada día el total gastado junto a una barra de presupuesto, y que cada actividad lleve su costo en una etiqueta pequeña. Así el usuario ve los gastos del día de un solo vistazo sin pantallas complicadas.

## 2.3 Benchmarking
Se ha realizado un análisis comparativo de las principales aplicaciones de planificación de viajes disponibles en el mercado para identificar fortalezas y oportunidades de mejora:

| Plataforma | Itinerarios automáticos | Ajuste a presupuesto | Alojamiento económico | Diario multimedia | Ahorro de tiempo |
|---|---|---|---|---|---|
| **LazyTrip** | Sí, según presupuesto e intereses | Sí, límite global por persona | Sí, mediante algoritmo de selección | Sí, fotos organizadas por día | Alto, automatizado |
| **Booking.com** | No | Parcial, por noche | Sí, catálogo hotelero | No | Bajo, proceso manual |
| **TripAdvisor** | No, armado manual | No | Sí, comparador de tarifas | No | Bajo, proceso manual |
| **Airbnb** | No | Parcial, por noche | Sí, particulares | No | Bajo, proceso manual |
| **Google Trips** | No, solo agrupa reservas | No | Sí, buscador centralizado | No | Medio, vía correo |

Ambas plataformas destacan en el sector del turismo digital, pero abordan la experiencia de usuario desde perspectivas completamente distintas: Booking.com prioriza la conversión transaccional puntual, mientras que TripAdvisor se enfoca en la exploración y la gestión integral de viajes.

En cambio Lazytrip Combina la generación automática de itinerarios organizados por días y horas con la gestión en tiempo real del presupuesto, todo presentado bajo una interfaz minimalista y fácil de usar

## 2.4 Product Backlog
En la metodología Scrum simplemente el product backlog es una lista de tareas dinamicas donde se escriben todas las cosas, funcionalidades y opciones que queremos que una aplicación tenga a lo largo de su vida.[4][5]

 para que toda persona que forma parte de un equpo lo entienda esas ideas que hacemos en el product backlog las escribimos en forma de historia de usuario HU.

las historias de usuario son frases sencillas que explica cada función desde como la persona ve la aplicación. por ejemplo:
**"Como [tipo de usuario], quiero [hacer una acción] para [conseguir un beneficio]."**

Para organizar el desarrollo de la aplicación, se han definido y priorizado las principales historias de usuario según su importancia y el valor que aportan al proyecto:

| Prioridad | Historia de Usuario | Valor / Justificación |
|---|---|---|
| **Alta** | Definición de presupuesto total por viaje | Sin esto no hay propuesta de valor diferenciadora. |
| **Alta** | Crear itinerario base por días y horas | Función primaria de la aplicación. |
| **Alta** | Asignar coste estimado a cada actividad | Une el itinerario con el control de presupuesto. |
| **Media** | Alertas de desvío presupuestario | Añade la inteligencia "ajustable" a la app. |
| **Media** | Filtro de lugares por precio | Facilita el llenado del itinerario con presupuesto real. |
| **Baja** | Planificación colaborativa | Mejora la experiencia, pero no frena la funcionalidad individual. |

## 2.5 Sprint Backlog (Sprint 1)
El Sprint Backlog agrupa el conjunto de tareas e Historias de Usuario seleccionadas durante las fechas propuestas del sprint.

### 1. Selección Basada en el Sprint Goal y Capacidad

El objetivo principal de este Sprint 1 (Sprint Goal) es maquetar las vistas principales de la aplicación respetando la **regla de los 3 clics**, estructurar el proyecto bajo el patrón de arquitectura **MVC** y preparar la documentación técnica para la entrega del RA1.

###  1.1 Desglose De Tareas

| ID | Tarea / Entregable | Estado |
|---|---|---|
| **#1** | Identificación del Público Objetivo | Terminado |
| **#2** | Investigación y Organización de las Tareas del Sprint 1 Sprint Backlog | Terminado |
| **#3** | Descripción de las clases, propiedades, métodos | Terminado |
| **#4** | Asociación de acciones a eventos y edición del código generado | Terminado |
| **#5** | Componente: características y campo de aplicación | Terminado |
| **#6** | Patrón de arquitectura de la aplicación gráfica | Terminado |
| **#7** | Objetivos Principales de la Interfaz | Terminado |
| **#8** | Definición y Estructuración del Product Backlog | Terminado |
| **#9** | Benchmarking Análisis de Competencia | Terminado |
| **#10** | Descripción de las librerías de componentes nativas y multiplataforma | Terminado |
| **#11** | Maquetación de la memoria del Sprint 1 | Terminado |
| **#12** | Presentación del Sprint Review | Terminado |
| **#13** | prototipo e interfaz | Terminado |

#### 1.2 Selección Basada en el Sprint Goal y Capacidad
- El equipo define un objetivo claro para la iteración (Sprint Goal) y extrae las historias prioritarias del Product Backlog. 
- La selección se limita considerando la capacidad real del equipo y la velocidad alcanzada en iteraciones anteriores.
- Garantiza que el compromiso de entrega sea realista y no sobrecargue al equipo en ese periodo de tiempo.

#### 1.3 Descomposición de Historias en Tareas Manejables

- Las historias de usuario elegidas se dividen en tareas técnicas muy concretas y de pequeño tamaño.[3][5]

- Cada tarea individual debe diseñarse para completarse idealmente en pocas horas o en un máximo de un día.

- Esta fragmentación facilita el flujo continuo de trabajo y hace evidente cualquier estancamiento o bloqueo.

## 3. Descripción del Alcance Técnico
### 3.1 Patrón de Arquitectura de la Aplicación Gráfica

### 3.2 Descripción de Librerías de Componentes
Todavía no estamos seguros de utilizar estas librerías, a priori las librerías y componentes son los siguientes: 

#### Librerías de Componentes Nativas [7][8]
AWT, Abstract Window Toolkit : Es la librería gráfica original de Java. Cuando creamos un botón o un panel en AWT, Java le pide al propio sistema operativo que dibuje ese control. Esto hace que la aplicación se integre visualmente con el sistema, pero limita mucho el diseño, ya que solo permite usar los componentes más básicos que existan en todos los sistemas operativos por igual.

#### Librerías de Componentes y Multiplataforma
Swing y NetBeans Matisse. Es el estándar de Java para la creación de interfaces de escritorio. Permite aplicar estilo Look and Feel para cambiar toda la apariencia de la aplicación sin tocar el código de la lógica. Se integra de manera nativa con editores visuales como NetBeans Matisse, lo que nos facilita arrastrar componentes, ubicarlos en pantalla y conectarlos fácilmente con los eventos del sistema. Además, es ideal para crear componentes personalizados y reutilizables en la aplicación.[7][8]
Tambien se podrian usar otros como javaFX o FlatLaf

#### Elección Técnica Justificada para LazyTrip
Para elegir los requerimientos del proyecto LazyTrip necesita una interfaz fluida para web, escritorio y dispositivo móvil.
Elegimos la tecnología de Swing con el editor visual NetBeans Matisse junto con la librería de estilos AWT o FlatLaf. Esta combinación nos permite trabajar de forma ágil creando pantallas mediante edición visual, desarrollar nuestros propios componentes reutilizables como las tarjetas para cada día de viaje o las opciones de alojamiento y garantizar un acabado visual moderno, limpio en cualquier ordenador o dispositivo donde se ejecute la aplicación.

### 3.3 Componentes: Características y Campo de Aplicación
Para garantizar el desarrollo de LazyTrip, hemos establecido que diseño se fundamenta en un ecosistema tecnológico escalable.

#### 3.3.1 Componentes Técnicos y Características
**A. Frontend** 

Framework Multiplataforma (Flutter): Permite lanzar la app en iOS y Android compartiendo hasta un 80% de código. Es ideal para aplicaciones para principiantes y estudiaremos esta tecnología durante el curso. 

Motor de Renderizado de Itinerarios: Componentes visuales interactivos (como Flutter ReorderableListView) para reordenar días y actividades de forma fluida e intuitiva. 

**B. Backend y Datos**

Base de datos SQL: Ideal para itinerarios, donde la estructura de un día de viaje es flexible y contiene subcolecciones de actividades y costos, contenido con el que estamos familiarizados.

Sincronización en tiempo real: Crucial para la planificación colaborativa, es decir, si se pretende organizar un itinerario entre más de una persona (si dos usuarios editan el presupuesto del viaje al mismo tiempo).

**C. API e Integraciones Clave**
API de Divisas y Monedas (p. ej., Open Exchange Rates o Fixer.io): Permite convertir gastos locales a la moneda base del viajero en tiempo real.
API de Mapas y Lugares (Google Places API): Para autocompletar nombres de hoteles, restaurantes y atracciones, así como obtener estimaciones previas de precio o nivel de coste.

#### 3.3.2 Campo de Aplicación
El mayor impacto de esta aplicación no está en el turismo de lujo (donde el dinero no es restricción), sino en sectores donde la optimización financiera determina la duración o viabilidad del viaje:

**1.	Turismo Joven:**
  ○	Por qué: Viajan con presupuestos ajustados durante semanas o meses. Podría ser conveniente implementar un seguimiento de gastos
  
**2.	Grupos de Amigos y Despedidas de Soltero/a:**
  ○	Por qué: Gestionar gastos grupales suele generar fricción. La combinación de itinerario + división de presupuesto transparente evita conflictos.
  
**3.	Nómadas Digitales y Viajeros de Larga Estancia:**
  ○	Por qué: Combinan trabajo con turismo y necesitan equilibrar costes de estancia con presupuesto de ocio semanal.
  
**4.	Agencias de Viajes Independientes o Guías Locales:**
  ○	Por qué: Pueden usar la plataforma como herramienta para ofrecer a sus clientes itinerarios a medida optimizados según el presupuesto que el cliente declare.



### 3.4 Asociación de Acciones a Eventos y Edición del Código Generado

En este punto, al no tener código generado para nuestra interfaz ni aplicación, hemos decidido llevar a cabo una investigación para poder tener más facilidad para decidir en un futuro. Entre ellas, hemos decidido lo siguiente:

**1. Gestión de Usuarios y Preferencias de Viaje**

Administra el acceso seguro y almacena el perfil del viajero, su presupuesto estimado y su ritmo ideal.

Permite personalizar categorías de interés para adaptar la planificación a los gustos de cada usuario.

Mantiene las configuraciones sincronizadas en cualquier dispositivo para una experiencia uniforme.

**2. Motor de Generación y Optimización de Itinerarios**

Organiza automáticamente las visitas analizando distancias, horarios de apertura y tiempos de traslado.

Permite reordenar, agregar o eliminar paradas con flexibilidad según surjan cambios en el día.

Genera rutas eficientes que maximizan el tiempo disponible durante toda la estadía.

**3. Centralización de Reservas y Control de Gastos**

Reúne pasajes, hospedajes y entradas en una vista cronológica para una consulta rápida.

Registra los gastos reales, los compara con el presupuesto y convierte distintas divisas.

Ofrece un balance claro clasificado por transporte, alojamiento, comida y entrenamiento.

**4. Recomendaciones Inteligentes y Adaptación Dinámica [FUTURO]**

Integrará un asistente de IA para sugerir actividades personalizadas según el comportamiento del usuario.

Reajustará la agenda automáticamente ante imprevistos como mal clima, tráfico o cancelaciones.

Enviará alertas preventivas con recordatorios y rutas alternativas antes de cada parada.

**5. Colaboración Grupal y Acceso Sin Conexión [FUTURO]**

Permitirá la planificación compartida entre varios viajeros con votaciones y división de costos.

Integrará sincronización directa con el calendario nativo y aplicaciones de mapas.

Garantizará la consulta de mapas y documentos guardados aun sin conexión a internet.


### 3.5 Descripción de Clases, Propiedades y Métodos
  Tras una investigación sobre como programariamos nuestra aplicación, llegamos a la conclusión que lo más óptimo seria crear:

**Clase Usuario**

Representa a las personas que utilizan la aplicación y permite gestionar sus datos personales y sus viajes.

Propiedades: idUsuario, nombre, correoElectronico, contraseña y listaViajes.
Métodos: registrarse(), iniciarSesion(), cerrarSesion(), modificarPerfil() y consultarViajes().

**Clase Viaje**

Representa un viaje creado por un usuario, almacenando su información principal y permitiendo gestionar su planificación.

Propiedades: idViaje, destino, fechaInicio, fechaFin, presupuesto, participantes e itinerario.
Métodos: crearViaje(), modificarViaje(), eliminarViaje(), añadirParticipante() y calcularDuracion().

**Clase Itinerario**

Se encarga de organizar las actividades y lugares que se visitarán durante el viaje, distribuyéndolos por días.

Propiedades: idItinerario, listaActividades, fecha y ordenActividades.
Métodos: generarItinerario(), añadirActividad(), eliminarActividad() y reorganizarActividades().

**Clase Actividad**

Representa cada actividad, visita o experiencia que forma parte del itinerario.

Propiedades: idActividad, nombre, descripcion, ubicacion, fecha, hora y costeEstimado.
Métodos: modificarActividad(), consultarDetalles() y calcularCoste().

**Clase Presupuesto**

Permite controlar el dinero disponible para el viaje y realizar un seguimiento de los gastos.

Propiedades: presupuestoTotal, gastos, dineroDisponible y categoriaGastos.
Métodos: añadirGasto(), eliminarGasto(), calcularGastoTotal() y consultarDineroDisponible().

**Clase Gasto**

Almacena cada gasto realizado o previsto durante el viaje.

Propiedades: idGasto, concepto, cantidad, categoria y fecha.
Métodos: registrarGasto(), modificarGasto() y eliminarGasto().

**Clase Grupo**

Permite gestionar a los participantes de un viaje y facilitar su organización conjunta.

Propiedades: idGrupo, nombreGrupo, listaUsuarios y viajeAsociado.
Métodos: añadirUsuario(), eliminarUsuario(), consultarParticipantes() y compartirItinerario().

## 4. Referencias IEE
[1] LiMaGe Marketing, “Diseño web: la regla de los 3 clics,” LiMaGe Marketing. [En línea]. Disponible en: https://limagemarketing.es/diseno-web-regla-de-los-3-clics/. [Accedido: 1-oct-2026].

[2] Hocoos, “¿Qué es la regla de los tres clics?,” Hocoos. [En línea]. Disponible en: https://hocoos.com/es/respuestas/what-is-the-three-click-rule/. [Accedido: 1-oct-2026].

[3] App Design Book, “Patrones de interacción en móviles,” App Design Book. [En línea]. Disponible en: https://www.appdesignbook.com/es/contenidos/patrones-interaccion-moviles. [Accedido: 1-oct-2026].

[4] Scrum.org, “What is a Product Backlog?,” Scrum.org. [En línea]. Disponible en: https://www.scrum.org/resources/what-is-a-product-backlog. [Accedido: 1-oct-2026].

[5] Atlassian, “Historias de usuario: ejemplos y plantilla,” Atlassian Agile Coach. [En línea]. Disponible en: https://www.atlassian.com/es/agile/project-management/user-stories. [Accedido: 1-oct-2026].

[6] Mountain Goat Software, “User Stories,” Mountain Goat Software. [En línea]. Disponible en: https://www.mountaingoatsoftware.com/agile/user-stories. [Accedido: 1-oct-2026].

[7] OpenJFX, “JavaFX,” OpenJFX. [En línea]. Disponible en: https://openjfx.io/. [Accedido: 1-oct-2026].

[8] OpenJFX, “Getting Started with JavaFX,” OpenJFX Documentation. [En línea]. Disponible en: https://openjfx.io/openjfx-docs/. [Accedido: 1-oct-2026].
