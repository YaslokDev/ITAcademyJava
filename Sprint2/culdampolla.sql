CREATE DATABASE `culampolla`;

USE `culampolla`;

-- Crea la tabla para los proveedores
CREATE TABLE `proveedores` (
  `id_proveedor` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL,
  `calle` varchar(100) NOT NULL,
  `numero` int(5) NOT NULL,
  `piso` varchar(10),
  `puerta` varchar(10),
  `ciudad` varchar(100) NOT NULL,
  `codigo_postal` int(5) NOT NULL,
  `pais` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `fax` varchar(20),
  `nif` varchar(9) NOT NULL
);

-- Crea la tabla para las marcas
CREATE TABLE `marcas` (
  `id_marca` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL
);

-- Crea la tabla para las ulleres
CREATE TABLE `ulleres` (
  `id_uller` int(11) AUTO_INCREMENT PRIMARY KEY,
  `id_proveedor` int(11) NOT NULL,
  `id_marca` int(11) NOT NULL,
  `graduacion` float(4,2) NOT NULL,
  `tipo_muntura` enum('flotant', 'pasta', 'metalica') NOT NULL,
  `color_muntura` varchar(20) NOT NULL,
  `color_vidre` varchar(20) NOT NULL,
  `preu` float(8,2) NOT NULL,
  FOREIGN KEY (`id_proveedor`) REFERENCES `proveedores`(`id_proveedor`),
  FOREIGN KEY (`id_marca`) REFERENCES `marcas`(`id_marca`)
);

-- Crea la tabla para los clientes
CREATE TABLE `clientes` (
  `id_cliente` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL,
  `calle` varchar(100) NOT NULL,
  `numero` int(5) NOT NULL,
  `piso` varchar(10),
  `puerta` varchar(10),
  `ciudad` varchar(100) NOT NULL,
  `codigo_postal` int(5) NOT NULL,
  `pais` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `fecha_registro` date NOT NULL,
  `recomendado_por` int(11),
  FOREIGN KEY (`recomendado_por`) REFERENCES `clientes`(`id_cliente`)
);

-- Crea la tabla para los empleados
CREATE TABLE `empleados` (
  `id_empleado` int(11) AUTO_INCREMENT PRIMARY KEY,
  `nombre` varchar(100) NOT NULL,
  `calle` varchar(100) NOT NULL,
  `numero` int(5) NOT NULL,
  `piso` varchar(10),
  `puerta` varchar(10),
  `ciudad` varchar(100) NOT NULL,
  `codigo_postal` int(5) NOT NULL,
  `pais` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL
  );
  
-- Crea la tabla para las ventas de ulleres
CREATE TABLE ventas (
`id_venta` int(11) AUTO_INCREMENT PRIMARY KEY,
`id_cliente` int(11) NOT NULL,
`id_uller` int(11) NOT NULL,
`id_empleado` int(11) NOT NULL,
`fecha_venta` date NOT NULL,
`precio_venta` float(8,2) NOT NULL,
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
FOREIGN KEY (id_uller) REFERENCES ulleres(id_uller),
FOREIGN KEY (id_empleado) REFERENCES empleados(id_empleado)
);

-- Crea la tabla para las devoluciones de ulleres
CREATE TABLE devoluciones (
`id_devolucion` int(11) AUTO_INCREMENT PRIMARY KEY,
`id_cliente` int(11) NOT NULL,
`id_uller` int(11) NOT NULL,
`id_empleado` int(11) NOT NULL,
`fecha_devolucion` date NOT NULL,
`precio_devolucion` float(8,2) NOT NULL,
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
FOREIGN KEY (id_uller) REFERENCES ulleres(id_uller),
FOREIGN KEY (id_empleado) REFERENCES empleados(id_empleado)
);

-- Crea la tabla para los pedidos a proveedores
CREATE TABLE pedidos (
`id_pedido` int(11) AUTO_INCREMENT PRIMARY KEY,
`id_proveedor` int(11) NOT NULL,
`id_uller` int(11) NOT NULL,
`fecha_pedido` date NOT NULL,
`cantidad` int(11) NOT NULL,
`precio_compra` float(8,2) NOT NULL,
FOREIGN KEY (id_proveedor) REFERENCES proveedores(id_proveedor),
FOREIGN KEY (id_uller) REFERENCES ulleres(id_uller)
);