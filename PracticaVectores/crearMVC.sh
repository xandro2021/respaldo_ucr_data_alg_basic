#!/bin/bash

# Definir la ruta base
BASE_DIR="src/com/practicavectores"

# Crear las carpetas necesarias
mkdir -p "$BASE_DIR/init"
mkdir -p "$BASE_DIR/mvc/models"
mkdir -p "$BASE_DIR/mvc/views"
mkdir -p "$BASE_DIR/mvc/controllers"

# Mensaje de éxito
echo "Estructura de carpetas creada correctamente en $BASE_DIR"
