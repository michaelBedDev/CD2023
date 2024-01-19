# Ejercicio Git

Instalamos los programas para convertir el .md a PDF

```bash
sudo apt install pandoc textlive-xetex
```

Después configuramos la extensión de VSCode Pandoc con el comando --pdf-engine=xelatex en la opción PDF Opt String

## Repositorio Git local
Inicializamos el repositorio con 

```bash
git init ud02Git.git
``` 

Creamos los archivos miguel.txt y aficiones.txt y los añadimos
```bash
git add .
```

Para hacer commit escribimos el comando

```bash
git commit -m "Creación de los archivos .txt"
```

Creamos una carpeta con dos archivos para ser ignorada y hacemos un commit de los cambios que realizamos en el fichero aficiones. Para ello solo hacemos seguimiento de los archivos trackeados. Incluimos la carpeta al archivo creado por nosotros .gitignore

```bash
git commit -a
```

Escribimos 
```bash 
git log
``` 
 y copiamos los 10 primeros dígitos del commit. A continuación:

 ```bash
 git checkout d6a256cc17
 ```



## Ejercicio 2

Creamos el repositorio nuevo en la carpeta pagina_web
 ```bash
 git init .
 ls -la
 ```
 Comprobamos el estado del repositorio con
 ```bash
 git status
 ```
 No hay nada para confirmar ni ningún commit


 Creamos el fichero index.html, hacemos git add y git commit.
 
 Con git status comprobamos que se ha realizado un commit, además de que el árbol de trbajo está limpio.

 Modificamos el fichero con las 3 ciudades a visitar
 y 
 ```bash
 git commit -a
 git log
 ```

 Y enseñamos el historial de commits. 
 
 Creamos una carpeta por cada ciudad y creamos el index html dentro de cada una con la info

 ```bash
 mkdir Oslo Venecia Rio
 touch ./Oslo/index.html
 ```

 ```bash
 git add .
 git commit -m "Añadida información de las ciudades a visitar"
 git log
 ```
