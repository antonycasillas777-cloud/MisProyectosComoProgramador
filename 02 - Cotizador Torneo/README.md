# Cotizador de torneo

## 1. Análisis
El programa se muestra por consola. Se solicitan los datos del equipo y de su capitán, se calcula el costo de la inscripción y se verifica si el equipo cumple las reglas para inscribirse al torneo. Al final se imprime un ticket con la cotización.

## 2. Idea (entrada - proceso - salida)

### ENTRADA
| Tipo | Variable |
|------|----------|
| String | nombreEquipo |
| String | nombreCapitan |
| String | apellidoCapitan |
| int | edadCapitan |
| String | juegoParticipando |
| int | cantidadJugadores |
| double | saldoEquipo |
| boolean | tieneMembresia |
| boolean | tieneCupon |
| boolean | estaSuspendido |

### CONSTANTES
| Constante | Valor |
|-----------|-------|
| PRECIO_POR_JUGADOR | 8.50 |
| CARGO_FIJO_INSCRPCION | 2.0 |
| TITULO_IMPRESION | "===== COTIZADOR DE TORNEO =====" |

### PROCESO

**Cálculos**
- `subtotal = cantidadJugadores * PRECIO_POR_JUGADOR`
- `total = subtotal + CARGO_FIJO_INSCRPCION`
- `saldoDespuesPagar = saldoEquipo - total`
- `tienePareja = cantidadJugadores / 2` (cantidad de parejas)
- `noPareja = cantidadJugadores % 2` (jugadores sin pareja)

**Tratamiento de textos** (con `strip()`)
- `nombreEquipo`: sin espacios al inicio y al final, en mayúsculas.
- `nombreCapitan` y `apellidoCapitan`: sin espacios al inicio y al final.
- `juegoParticipando`: sin espacios al inicio y al final, en mayúsculas.
- **Nombre completo del capitán:** `nombreCapitan + " " + apellidoCapitan`.

**Generación de códigos**
- **Número aleatorio:** `random.nextInt(100, 1000)` (entre 100 y 999).
- **Alias del capitán:** primeras 2 letras del nombre + apellido, todo en minúsculas.
- **Código de cotización:** primera letra del nombre (mayúscula) + última letra del apellido (mayúscula) + número aleatorio.

**Reglas de inscripción**
| Regla | Condición |
|-------|-----------|
| enRangoJugadores | `cantidadJugadores >= 2 && cantidadJugadores <= 5` |
| rangoEdadCapitan | `edadCapitan >= 18` |
| cumpleSaldo | `saldoEquipo >= total` |
| noSuspecion | `estaSuspendido == false` |
| participaSorteo | `tieneMembresia \|\| tieneCupon` |
| puedeIncribirse | `cumpleSaldo && noSuspecion && edadCapitan >= 18 && cantidadJugadores entre 2 y 5` |

### SALIDA
- Título
- Código de cotización
- Equipo
- Capitán
- Alias del capitán
- Videojuego
- Jugadores
- Subtotal
- Cargo fijo
- Total
- Saldo después del pago
- Parejas
- Jugadores sin pareja
- ¿Cantidad permitida?
- ¿Capitán mayor de edad?
- ¿Saldo suficiente?
- ¿Acceso al sorteo?
- ¿Puede inscribirse?

Ejemplo de salida en consola:

```
===== COTIZADOR DE TORNEO =====
Codigo de cotizacion: JZ482
Equipo: LOS PRO
Capitan: JUAN PEREZ
Alias del capitan: juperez
VideoJuego: VALORANT
Jugagores: 4

Subtotal: $34.00
Cargo fijo: $2.00
Total: $36.00
Saldo despues del pago: $14.00
Parejas: 2
Jugadores sin pareja: 0

CantidadPermitida? : true
Capitan mayor de edad? : true
Saldo suficiente? : true
Acceso al sorteo? : true
Puede incribirse? : true
```

## 3. Codificación
Realizado con exito :3
