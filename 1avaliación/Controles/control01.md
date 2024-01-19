## Control01 Java

Compilamos y ejecutamos desde el teminal el archivo StringExample.java
Está en el directorio /home/vagrant/Descargas

Comando history para recordar los comandos de compilación
cd y ls Descargas/StringExample.java

``` bash 
cd Descargas 
ls
StringExample.java
```
Compilamos
```bash 
javac StringExample.java
```

Ejecutamos
```bash
java StringExample.java
```

Y nos da el siguiente resultado:

s1: Computer Science
s2: Computer Science 307
s3: cience 
s4: is fun
s5: Computer Science 307is fun
s6: 8total
s7: total 35
s8:  35total

## Python

creamos el archivo raiz.py
con el código:

``` python
# Python Program to calculate the square root

# Note: change this value for a different result
num = 8

# To take the input from the user
#num = float(input('Enter a number: '))

num_sqrt = num ** 0.5
print('The square root of %0.3f is %0.3f'%(num ,num_sqrt))
```

Para ello ejecutamos nano y guardamos ahí el archivo

Lo abrimos con:
``` bash
nano raiz.py
```

y modificamos el código a:
``` python
# Python Program to calculate the square root

# Note: change this value for a different result
num = float(input('Enter a number: '))

num_sqrt = num ** 0.5
print('The square root of %0.3f is %0.3f'%(num ,num_sqrt))
```

ejecutamos con el comando 

``` bash
python3 raiz.py
```

y obtenemos como resultado:

Enter a number: 5
The square root of 5.000 is 2.236
