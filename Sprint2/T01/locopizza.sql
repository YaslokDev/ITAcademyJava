CREATE DATABASE `locopizza`;

USE `locopizza`;

-- Crea la tabla para las provincias
CREATE TABLE `provincias` (
  `id_provincia` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL
);

-- Crea la tabla para las localidades
CREATE TABLE `localidades` (
  `id_localidad` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL,
  `id_provincia` int(11) NOT NULL,
  FOREIGN KEY (`id_provincia`) REFERENCES `provincias`(`id_provincia`)
);

-- Crea la tabla para los clientes
CREATE TABLE `clientes` (
  `id_cliente` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `codigo_postal` int(5) NOT NULL,
  `id_localidad` int(11) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  FOREIGN KEY (`id_localidad`) REFERENCES `localidades`(`id_localidad`)
);

-- Crea la tabla para las pizzas
CREATE TABLE `pizzas` (
  `id_pizza` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text,
  `imagen` varchar(200),
  `precio` float(8,2) NOT NULL
);

-- Crea la tabla para las categorias de pizzas
CREATE TABLE `categorias` (
  `id_categoria` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL
);

-- Crea la tabla para relacionar pizzas y categorias
CREATE TABLE `pizzas_categorias` (
  `id_pizza` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  PRIMARY KEY (`id_pizza`, `id_categoria`),
  FOREIGN KEY (`id_pizza`) REFERENCES `pizzas`(`id_pizza`),
  FOREIGN KEY (`id_categoria`) REFERENCES `categorias`(`id_categoria`)
);

-- Crea la tabla para las tiendas
CREATE TABLE `tiendas` (
  `id_tienda` int(11) AUTO_INCREMENT PRIMARY KEY,
  `direccion` varchar(100) NOT NULL,
  `codigo_postal` int(5) NOT NULL,
  `id_localidad` int(11) NOT NULL,
  `id_provincia` int(11) NOT NULL,
  FOREIGN KEY (`id_localidad`) REFERENCES `localidades`(`id_localidad`),
  FOREIGN KEY (`id_provincia`) REFERENCES `provincias`(`id_provincia`)
);

-- Crea la tabla para los empleados
CREATE TABLE `empleados` (
  `id_empleado` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `nif` varchar(9) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `id_tienda` int(11) NOT NULL,
  `tipo` enum('cocinero', 'repartidor') NOT NULL,
FOREIGN KEY (id_tienda) REFERENCES tiendas(id_tienda)
);

-- Crea la tabla para las comandas
CREATE TABLE comandas (
`id_comanda` int(11) AUTO_INCREMENT PRIMARY KEY,
`id_cliente` int(11) NOT NULL,
`tipo` enum('reparto_domicilio', 'recogida_tienda') NOT NULL,
`fecha_hora` datetime NOT NULL,
`precio_total` float(8,2) NOT NULL,
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

-- Crea la tabla para las comandas y los productos
CREATE TABLE comanda_productos (
`id_comanda` int(11) NOT NULL,
`id_pizza` int(11) NOT NULL,
`cantidad` int(11) NOT NULL,
PRIMARY KEY (id_comanda, id_pizza),
FOREIGN KEY (id_comanda) REFERENCES comandas(id_comanda),
FOREIGN KEY (id_pizza) REFERENCES pizzas(id_pizza)
);

-- Crea la tabla para las comandas de reparto a domicilio
CREATE TABLE comanda_reparto (
`id_comanda` int(11) NOT NULL,
`id_empleado` int(11) NOT NULL,
`fecha_hora_reparto` datetime NOT NULL,
PRIMARY KEY (id_comanda),
FOREIGN KEY (id_comanda) REFERENCES comandas(id_comanda),
FOREIGN KEY (id_empleado) REFERENCES empleados(id_empleado)
);