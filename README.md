# Una-mas-por-favor

Repositorio:

https://github.com/PabloRoher/Una-mas-por-favor.git

# Ejercicios repaso
# 1. Dado el siguiente fragmento de código C:
a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?
La función Bisec() es utilizada para encontrar una aproximacion a la raiz de N, se divide el intervalo correspondiente a la mitad y se repite el proceso hasta que se alcanza una precisión suficiente definida por la variable PREC.
Si cambiamos el valor de N por otro numero positivo la funcion tendria la misma funcionalidad, pero si por el contrario se cambia por un numero negativo la funcion no tendria raices reales, asi que la funcion bisec no encontraria una raiz en ese intervalo.
Si cambiamos la funcion de f(x) mientras esta tenga al menos 1 raiz en el intervalo [min,max] la funcion bisec podra hallarla.
b) Implemente un algoritmo iterativo equivalente.
# 2. Dado el siguiente algoritmo recursivo:
a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función
recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?
La funcion factoriza en numero pasado como x con valores primos que sean mayores o iguales a 2, por lo que un mejor nombre para la funcion seria factorizar().
b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda
equivalentes.
# 3. Construya una función que convierta un número decimal en una cadena que represente el
valor del número en hexadecimal (base 16). A continuación, generalice la función para
convertir un número decimal en un número en base B (con B<10). Resuélvalo mediante 
expresiones lambda.
Recordatorio: El cambio de base se realiza mediante divisiones sucesivas por 16
en las cuales los restos determinan los dígitos hexadecimales del número según
la siguiente correspondencia:
Resto 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Dígito 0 1 2 3 4 5 6 7 8 9 A B C D E F

# 4. Implemente, tanto de forma recursiva como de forma iterativa, una función que nos diga
si una cadena de caracteres es simétrica (un palíndromo). Por ejemplo,
“DABALEARROZALAZORRAELABAD” es un palíndromo.
# 5. Implemente, tanto de forma recursiva como de forma iterativa y con expresiones lambda,
una función que nos devuelva el máximo común divisor de dos números enteros
utilizando el algoritmo de Euclides.
ALGORITMO DE EUCLIDES
Dados dos números enteros positivos m y n, tal que m > n,
para encontrar su máximo común divisor
(es decir, el mayor entero positivo que divide a ambos):
- Dividir m por n para obtener el resto r (0 ≤ r < n)
- Si r = 0, el MCD es n.
- Si no, el máximo común divisor es MCD(n,r).
