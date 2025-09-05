
1. **¿Cuál es la diferencia entre `git merge` y `git rebase`?**
   El `merge` une dos ramas creando un commit nuevo que conserva el historial de ambas. En cambio, `rebase` reescribe el historial aplicando los commits de una rama sobre otra como si fueran nuevos, lo que hace que el historial quede más lineal.

2. **Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer `merge`?**
   Va a haber un conflicto. Git no sabe cuál cambio conservar, así que nos toca resolverlo manualmente eligiendo qué versión dejar.

3. **¿Cómo puedes ver gráficamente el historial de `merges` y ramas en consola?**
   Podemos usar `git log --oneline --graph --all --decorate`. Te muestra todo el historial con ramas y merges de forma visual.

4. **Explica la diferencia entre un `commit` y un `push`**
   Un `commit` guarda los cambios localmente en nuestro repo. El `push` envía esos commits al repositorio remoto (como GitHub).

5. **¿Para qué sirve `git stash` y `git pop`?**
   `git stash` guarda cambios que aún no has commiteado para que puedas cambiar de rama sin perderlos. `git pop` los recupera después.

6. **¿Qué diferencia hay entre `HashMap` y `Hashtable`?**
   `HashMap` **no es sincronizado**, o sea que no es seguro en entornos con múltiples hilos, pero es más rápido. `Hashtable` **sí es sincronizado**, pero es más lento. Hoy en día se prefiere usar `HashMap` con sincronización externa si se necesita.

7. **¿Qué ventajas tiene `Collectors.toMap()` frente a un bucle tradicional para llenar un mapa?**
   Es más conciso, legible y funcional. Con streams puedes transformar y recolectar datos en una sola línea sin escribir tanto código repetitivo.

8. **Si usas `List` con objetos y luego aplicas `stream().map()` ¿qué tipo de operación estás haciendo?**
   Una operación de **transformación**. Estás tomando cada elemento de la lista y transformándolo en otro valor u objeto.

9. **¿Qué hace el método `stream().filter()` y qué retorna?**
   Filtra elementos de un stream según una condición. Retorna un **nuevo stream** con los elementos que cumplen esa condición.

10. **Describe el paso a paso de cómo crear una rama desde `develop` si es una funcionalidad nueva.**
    Primero me aseguro de estar en `develop`:

```bash
git checkout develop  
git pull  
```

Luego creo la rama:

```bash
git checkout -b feature/nombre-de-la-funcionalidad  
```

Y ya desde ahí empiezo a trabajar.

11. **¿Cuál es la diferencia entre crear una rama con `git branch` y con `git checkout -b`?**
    `git branch` solo crea la rama, pero no te cambia a ella. `git checkout -b` la crea **y te cambia** a esa rama en el mismo paso.

12. **¿Por qué es recomendable crear ramas `feature/` para nuevas funcionalidades en lugar de trabajar en `main` directamente?**
    Porque así mantenemos el `main` limpio y estable. Si algo falla en la nueva funcionalidad, no afecta el código principal. Además, facilita el trabajo en equipo porque cada quien trabaja en su rama.

Pruebas de trabajo:

![alt text](image.png)
![alt text](image-1.png)
