# Nexo Norte

Proyecto de Formularios y diseño Responsive.

## Estructura

- `html/`: páginas del sitio (`index.html`, `registro.html`, `acerca.html` y secciones en construcción).
- `css/`: hoja de estilos responsive.
- `javascript/`: menú móvil y campo condicional de género.
- `images/`: logotipo SVG.

## Inicio local

Abre `html/index.html` en un navegador. Para probarlo con servidor local, ejecuta desde esta carpeta:

```bash
python -m http.server 8000
```

Después visita `http://localhost:8000/html/`.

El formulario de `registro.html` envía los datos por `POST` a `http://idawis-uaz.ddns.net:9001/formulario`.
