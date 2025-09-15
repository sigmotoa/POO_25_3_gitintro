## Proyecto de ejemplo para aprender un poquito de git y github

- Pide el nombre
- Pide año de nacimiento
- Debe devolver si es mayor de edad

  Para compilar y ejecutar:

  ```bash
  javac Edad.java
  java Edad
```




https://via.placeholder.com/468x300?text=App+Screenshot+Here
![image]([https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngwing.com%2Fes%2Fsearch%3Fq%3Dpato%2Blucas&psig=AOvVaw3Wsuy4YwpfY6ZuGuLT3z3k&ust=1758059793854000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCICWy6Lh248DFQAAAAAdAAAAABAL)](https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/9f680379-63e4-4673-99bf-2ddf98a142b3/dcvc0ye-972f5e4c-79e3-4311-a697-bc63e5e80ef2.png/v1/fit/w_414,h_485/_3d_model_download__daffy_duck_by_jcthornton_dcvc0ye-414w.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MjA0OCIsInBhdGgiOiJcL2ZcLzlmNjgwMzc5LTYzZTQtNDY3My05OWJmLTJkZGY5OGExNDJiM1wvZGN2YzB5ZS05NzJmNWU0Yy03OWUzLTQzMTEtYTY5Ny1iYzYzZTVlODBlZjIucG5nIiwid2lkdGgiOiI8PTE3NDgifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.INENHgh2OnBPLTyvymX_9x2LuA2Wi2Ty4rCdqwCrkqk)

graph LR
    A[Interfaz Gráfica] --> B{Gestión de Usuarios}
    A --> C{Gestión de Credenciales}
    A --> D{Parámetros de Extracción}
    D --> E[Playwright]
    E --> F{Extracción de Tweets}
    F --> G[Base de Datos]
    G --> A



flowchart TD
    A["Iniciar proyecto con Git"] --> B["Agregar archivos"]
    B --> C["Hacer commit de cambios"]
    C --> D["Crear repo en GitHub"]
    D --> E["Conectar repositorios"]
    E --> F["Subir cambios con git push"]
    F --> G["Compartir código con el mundo"]
    style A fill:#b2dfdb,stroke:#000
    style G fill:#c5e1a5


graph TD
    A[Inicio] --> B{Rango de fechas indicado?}
    B -- SI --> C[Validar el formato de fechas]
    B -- NO --> D[Error: Por favor Ingresar fechas validas]
    C -- Valido --> E[Validar fechas final mayor a fecha inicial]
    C -- Invalido --> F[Error: Por favor ingresar fechas validas]
    E -- SI --> G[Obtener cuentas activas de la Base de datos]
    E -- NO --> H[Error: Fecha inicial debe ser previa a la fecha final.]
    G --> I[Inicializa TwitterBot la extracción]
    I --> J[Se extraen datos según el requerimiento]
    J --> K[Mensaje: Data Extraida.]
    D --> A
    F --> A
    H --> A
    K --> L[Fin]




### by: @sigmotoa
