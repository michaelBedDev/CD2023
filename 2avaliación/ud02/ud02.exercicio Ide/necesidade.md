## Instalar IDE
### Necesidad de descargar un entorno de desarrollo para crear un programa con un lenguaje de mi elección, en este caso python

Tras haber analizado opciones, decidí elegir pycharm

Instalamos el programa desde el terminal en su versión classic con el comando: 

```bash
sudo snap install pycharm-community --classic
```

Y lo ejecutamos con el comando :

```bash
pycharm-community
```

escribimos un sencillo programa de convertir euros a libras

```python
#Calculadora euros a libras

print("introduce los euros a convertir")
euros = float(input())
print(f"{euros} euros son {round(euros * 0.86,2)} libras")
```

y lo ejecutamos con el comando desde el terminal

```bash
python3 programa.py
```

.
