# Repos Remotos
Creamos el repositorio en la web de github

Añade todo lo que tenemos que el repositorio libro al repositorio remoto y comprueba que los cambios están subidos correctamente.

```bash
git remote add origin git@github.com:michaelBedDev/libro-git.git
git branch -M master
git push -u origin master
```

Colabora en el repositorio remoto de otro compañero. Clona su repositorio. Añade el fichero autores.txt que contenga tu nombre y tu correo electrónico. Haz un commit y sube los cambios al repositorio remoto de tu compañero.

```bash
git clone git@github.com:Letizialf/libro-git.git
echo "michaelBedDev micama2000@gmail.com" > autores.txt
git add autores.txt
git commit -m "Añadido autores.txt desde remoto"
git push
```

Cuando un compañero/a haya realizado el paso anterior en tu repositorio remoto, sincroníza tu repositorio en local. El resultado debe ser que en local debes tener ese fichero autores.txt.

```bash
git pull
```

Modifica ese fichero, cambiando el nombre de tu compañero/a por el tuyo y añadiendo la fecha y la hora donde lo realizas. Sube los cambios al repositorio remoto

```bash
nano autores.txt
git add autores.txt
git commit -m "modificado el mas mejor"
git push
```

Al mismo tiempo, avisa a tu compañero/a para que, en su repositorio local, vuelva a modificar el fichero autores.txt añdiendo tu nombre en un línea nueva, la fecha y la hora así como el lugar donde se realiza el ejercicio. Una vez modificado, debe subir los cambios a remoto.

--El resultado de autores.txt en mi repositorio es 
Letizia lo que me da la gana
02/02/2024

Para comprobarlo he hecho 
```bash
git pull
```
