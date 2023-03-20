# Juego Geolocalizacion
Esta actividad, es un juego basado en la busqueda del tesoro en Android, utilizando GoogleMaps. El objetivo de este juego es ir encontrando las distintas localizaciones ocultas en la ciudad de Vigo, teniendo como punto de partida el CFP Daniel Castelao.
Cuando el jugador se acerca a las distintas marcas en el mapa. irán apareciendo en nuestro dispositivo.

## Requisitos
- Entorno de Android Studio 
- API Key de Google Maps  
- Dispositivo Android o Emulador 

## Instalación 
1. Lo primero que necesitas hacer es clonar el repositorio o descargar el código fuente del proyecto. Una vez hecho esto, en la carpeta raíz de nuestro peroyecto crea un archivo google_maps_api.xml dentro de la carpeta res/values/.
Este archivo debe contener tu API Key de Google Maps:

```
<string name="google_maps_key" templateMergeStrategy="preserve" translatable="false">TU_API_KEY_AQUÍ</string>
```
2. Después abre el proyecto en Android Studio y espera a que se descarguen las dependencias de la aplicación.
3. Conecta tu dispositivo Android al ordenador o inicia un emulador en el Android Studio
4. Ejecuta la aplicación desde Android Studio.  

## Instrucciones del juego
1. Abre la aplicación en tu dispositivo Android o en el emulador de Android Studio.
2. Necesitas esperar a que la aplicación detecte tu ubicación actual.  
3. Explora el mapa para encontrar las distintas pistas y localizaciones
4. Cuando te acerques a una pista, aparecerá una marca en el mapa que nos indica la ubicaci

## Capturas de funcionamiento del juego
![WhatsApp Video 2023-03-20 at 08 56 25](https://user-images.githubusercontent.com/113973157/226279785-63421831-0cd0-4580-97f8-a9aa8615f44c.gif)

## Herramientas utilizadas para hacer este juego
- Kotlin: Este ha sido el lenguaje de programación utilizado para desarrollar la aplicación.  
- Google Maps API: API de Google Maps utilizada para mostrar el mapa y las marcas en el mismo.  
- Android Studio: Entorno de desarrollo integrado utilizado para desarrollar la aplicación.
- Dispositivo Android con Oreo.

