Algoritmo ACTIVIDAD6
Definir personas Como Entero
Definir dia Como Cadena
Definir membresia Como Logico
Definir total Como Real
    
    Escribir "Número de personas: "
    Leer personas
    Escribir "Día de la semana: "
    Leer dia
    Escribir "¿Tienes membresía? (Verdadero/Falso): "
    Leer membresia
    
    total = 0
    
    Si dia = "miercoles" Entonces
        total = personas * 30
    Sino
        Si dia = "jueves" Entonces
            Definir parejas, individuales Como Entero
            parejas = Trunc(personas / 2)
            individuales = personas MOD 2
            total = parejas * 75 + individuales * 50
        Sino
            total = personas * 50
        FinSi
    FinSi
    
    Si membresia = Verdadero Entonces
        total = total * 0.10
    FinSi
    Escribir "El precio total es: $", total
FinAlgoritmo