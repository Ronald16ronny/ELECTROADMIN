create database BD_Electro_Admin;

use BD_Electro_Admin;

-- crear tabla usuarios
create table tb_usuario(
idUsuario int (11) auto_increment primary key,
nombre varchar (30) not null,
apellido varchar (30) not null,
usuario varchar (15) not null,
password varchar (15) not null,
telefono varchar (15) not null,
estado int (1) not null
);

-- crear tabla cliente
create table tb_cliente(
idCliente int (11) auto_increment primary key,
nombre varchar (30) not null,
apellido varchar (30) not null,
cedula varchar (15) not null,
telefono varchar (15) not null,
direccion varchar (100) not null,
estado int (1) not null
);

-- crear tabla categoria
create table tb_categoria(
idCategoria int (11) auto_increment primary key,
descripcion varchar (200) not null,
estado int (1) not null
);

-- crear tabla producto
create table tb_producto(
idProducto int (11) auto_increment primary key,
nombre varchar (100) not null,
cantidad int (11) not null,
precio double (10,2) not null,
descripcion varchar (200) not null,
porcentajeIgv int (2) not null,
idCategoria int (11) not null,
estado int (1) not null
);

-- crear tabla cabecera de venta
create table tb_cabecera_venta(
idCabeceraVenta int (11) auto_increment primary key,
idCliente varchar (11) not null,
valorPagar double (10,2) not null,
fechaVenta date not null,
estado int (1) not null
);

-- crear tabla detalle de venta
create table tb_detalle_venta(
idDetalleVenta int (11) auto_increment primary key,
idCabeceraVenta int (11) not null,
idProducto int (11) not null,
cantidad int (11) not null,
precioUnitario double (10,2) not null,
subtotal double (10,2) not null,
descuento double (10,2) not null,
igv double (10,2) not null,
totalPagar double (10,2) not null,
estado int (1) not null
);

show tables;
select * from tb_usuario;