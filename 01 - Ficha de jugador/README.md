# Ficha de jugador

## 1. Análisis
El programa se muestra por consola. Se enviarán a consola los datos requeridos para generar la ficha del jugador.

## 2. Idea (entrada - proceso - salida)

### ENTRADA
| Tipo | Variable |
|------|----------|
| String | nombreJugador |
| String | apellidoJugador |
| String | videoJuegoFav |
| int | edad |
| double | horasJugadas |
| boolean | tieneSuscripcion |

### PROCESO
- **nombreJugador y apellidoJugador:** eliminar espacios al inicio y al final con `trim()`.
- **Nombre completo:** `nombreJugador + " " + apellidoJugador`, mostrado en mayúsculas con `toUpperCase()`.
- **Alias:** `nombreJugador (normalizado, minúsculas) + apellidoJugador (normalizado, minúsculas) + número aleatorio entre 100 y 999`.
  - Número aleatorio: `(int)(Math.random() * 900) + 100`
- **videoJuegoFav:** mostrar en mayúsculas con `toUpperCase()`.
- **horasJugadas:** mostrar con un decimal usando `printf("%.1f")`.
- **Suscripción:** mostrar "Sí" o "No" con operador ternario: `tieneSuscripcion ? "Sí" : "No"`.
- **Constante:** `final String TITULO = "===== JAVA PLAY =====";`

### SALIDA
- Constante (título)
- Jugador
- Alias
- Edad
- Video juego fav
- Horas jugadas
- Suscripción?

Ejemplo de salida en consola:

```
===== JAVA PLAY =====
Jugador: JUAN PEREZ
Alias: juanperez482
Edad: 20
Video juego fav: MINECRAFT
Horas jugadas: 12.5
Suscripción?: Sí
```

## 3. Codificación
Codigo realizado correctamente :3
```
