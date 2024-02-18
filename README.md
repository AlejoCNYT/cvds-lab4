<<<<<<< HEAD
## Laboratorio 4 HANGMAN
 
## Presentado por: 
Daniel Alejandro Acero Varela - Julián David Triana Roa
 
## Desarrollo Dirigido por Pruebas + DIP + DI + Contenedores Livianos
## Para este taller se va a trabajar sobre el juego del ahorcado.
 
El sistema actual de puntuación del juego comienza en 100 puntos y va descontando 10 puntos cada vez que se propone una letra incorrecta.
 
Algunos usuarios han propuesto diferentes esquemas para realizar la puntuación, los cuales se describen a continuación:
 
OriginalScore:
 
Es el esquema actual, se inicia con 100 puntos.
No se bonifican las letras correctas.
Se penaliza con 10 puntos con cada letra incorrecta.
El puntaje minimo es 0.
BonusScore:
 
El juego inicia en 0 puntos.
Se bonifica con 10 puntos cada letra correcta.
Se penaliza con 5 puntos cada letra incorrecta.
El puntaje mínimo es 0
PowerBonusScore:
 
El juego inicia en 0 puntos.
La é
letra correcta se bonifica con 
.
Se penaliza con 8 puntos cada letra incorrecta.
El puntaje mínimo es 0
Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
Lo anterior, se traduce en el siguiente modelo, donde se aplica el principio de inversión de dependencias:
 
<img width="566" alt="image" src="https://github.com/AlejoCNYT/cvds/assets/74771189/ec569b41-0f16-44cc-8a3d-00c7dc530e08">
 
## Parte I
1. Clone el proyecto (no lo descargue!).
 
2. A partir del código existente, implemente sólo los cascarones del modelo antes indicado.
 
3. Haga la especificación de los métodos calculateScore (de las tres variantes de GameScore), a partir de las especificaciones generales dadas anteriormente. Recuerde tener en cuenta: @pre, @pos, @param, @throws.
 
4. Haga commit de lo realizado hasta ahora. Desde la terminal:
```
git add .			
git commit -m "especificación métodos"
```
5. Actualice el archivo pom.xml e incluya las dependencias para la ultima versión de JUnit y la versión del compilador de Java a la versión 8.
 
6. Teniendo en cuenta dichas especificaciones, en la clase donde se implementarán las pruebas (GameScoreTest), en los comentarios iniciales, especifique las clases de equivalencia para las tres variantes de GameScore, e identifique condiciones de frontera.
 
7. Para cada clase de equivalencia y condición de frontera, implemente una prueba utilizando JUnit.
 
8. Haga commit de lo realizado hasta ahora. Desde la terminal:
```
git add .			
git commit -m "implementación pruebas"
```
 
9. Realice la implementación de los 'cascarones' realizados anteriormente. Asegúrese que todas las pruebas unitarias creadas en los puntos anteriores se ejecutan satisfactoriamente.
 
10. Al finalizar haga un nuevo commit:
```
git add .			
git commit -m "implementación del modelo"
```
11. Para sincronizar el avance en el respositorio y NO PERDER el trabajo, use el comando de GIT para enviar los cambios:
```
git push <URL Repositorio>	
```
## Parte II
=======
# cvds-lab4
>>>>>>> 6ef355c04f9b0f7f67835deb344ebbbc1b91dcff
