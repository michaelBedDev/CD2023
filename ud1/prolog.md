# Probar Prolog
Así entramos de forma interactiva:

```bash
docker run -it swipl
docker pull wipl
```

En caso de error:
```bash
sudo usermod -aG docker $USER
```

Ctrl + D para salir


Entramos desde la consola:

```bash
docker run -it swipl bash
```

Actualizamos repositorios:

```bash
apt update 
```

Instalamos nano dentro del contenedor:

```bash
apt install nano
```
Ejecutamos nano para editar el código fuente de un programa

```bash
nano programaprolog.pl
```

Guardamos el código de prolog dentro del archivo.pl que acabamos de crear.

```prolog
mujer(marge).
mujer(lisa).
mujer(maggie).
mujer(selma).

progenitor(abraham, homer).
progenitor(homer, bart).
progenitor(marge, bart).
progenitor(homer, lisa).
progenitor(marge, lisa).

abuelo(X, Y):- progenitor(X, Z), progenitor(Z, Y), hombre(X).
tia(X,Y):- hermana(X,Z), progenitor(Z,Y).
```

Para entrar dentro del intérprete de prolog:

```bash
swipl
```
Consultamos la lógica del archivo guardado. Devolverá true en este caso

```bash
consult('programaprolog.pl').
```

Podemos añadir también el código al final del archivo guardado, añadiendo más información:

```prolog
hermano(X,Y):- progenitor(Z,X), progenitor(Z,Y),
				progenitor(W,X), progenitor(W,Y), hombre(X),
				X \== Y.
hermana(X,Y):- progenitor(Z,X), progenitor(Z,Y),
				progenitor(W,X), progenitor(W,Y), mujer(X),
				X \== Y.
```

Podemos probar finalmente la lógica de prolog con algunos returns como:

```prolog
hermano(bart, lisa).
hombre(bart).
abuelo(abraham, bart).
```

Si hemos escrito bien el programa devolverá true.