Algoritmo OperacionesBasicas
    Definir num1, num2 Como Entero
    Definir operacion Como Cadena
    
    Escribir "Ingrese el primer n�mero: "
    Leer num1
    Escribir "Ingrese el segundo n�mero: "
    Leer num2
    Escribir "Ingrese el operador (+, -, *, /): "
    Leer operacion
    
    Segun operacion Hacer
		"+":
			Escribir "Resultado: ", num1 + num2
		"-":
			Escribir "Resultado: ", num1 - num2
		"*":
			Escribir "Resultado: ", num1 * num2
		"/":
			Si num2 <> 0 Entonces
                Escribir "Resultado: ", num1 / num2
            Sino
                Escribir "Error: divisi�n por cero"
            FinSi
			De Otro Modo:
            Escribir "Operador inv�lido"
    FinSegun
FinAlgoritmo



