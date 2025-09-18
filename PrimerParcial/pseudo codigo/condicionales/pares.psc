Algoritmo sin_titulo
//Con los números enteros a, b y c. Esto forma tres pares, que llamaremos ab, bc y ac. 
//Considera la suma de los números de cada par. Si cualquier par suma exactamente 10, el 
//resultado es 10. De lo contrario, si la suma de ab es exactamente 10 mayor que la suma de 
	//bc o ac, el resultado es 5. De lo contrario, el resultado es 0.
	definir a,b,c,ab,bc,ac Como Entero
	imprimir"ingresa los valores de a"
	Leer a
	imprimir"ingresa los valores de b"
	leer b
	imprimir "ingresa los valores de c"
	leer c
	
	si a + b = 10 o b + c = 10 o c + a = 10 Entonces
		resultado <- 10
		sino 
			Si a + b = b + c + 10 O a + b = a + c + 10 Entonces
			resultado <- 5
			sino 
			resultado <- 0
		Finsi
	FinSi
	Imprimir "resultado ",resultado
FinAlgoritmo
