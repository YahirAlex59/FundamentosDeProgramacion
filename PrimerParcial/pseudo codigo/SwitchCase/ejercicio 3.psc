Algoritmo areas
		Definir opcion Como Entero
		Definir lado, base, altura, radio, area Como real
		
		Escribir "MEN� DE �REAS"
		Escribir "1. Cuadrado"
		Escribir "2. Rect�ngulo"
		Escribir "3. Tri�ngulo"
		Escribir "4. C�rculo"
		Escribir "Elija una opci�n: "
		Leer opcion
		
		Segun opcion Hacer
			1:
				Escribir "Ingrese el lado del cuadrado: "
				Leer lado
				area = lado * lado
				Escribir "El �rea del cuadrado es: ", area
			2:
				Escribir "Ingrese la base del rect�ngulo: "
				Leer base
				Escribir "Ingrese la altura del rect�ngulo: "
				Leer altura
				area = base * altura
				Escribir "El �rea del rect�ngulo es: ", area
			3:
				Escribir "Ingrese la base del tri�ngulo: "
				Leer base
				Escribir "Ingrese la altura del tri�ngulo: "
				Leer altura
				area = (base * altura) / 2
				Escribir "El �rea del tri�ngulo es: ", area
			4:
				Escribir "Ingrese el radio del c�rculo: "
				Leer radio
				area = PI * radio * radio
				Escribir "El �rea del c�rculo es: ", area
			De Otro Modo:
				Escribir "Opci�n inv�lida"
		FinSegun
FinAlgoritmo
