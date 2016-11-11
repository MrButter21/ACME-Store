drop database if exists store;
create database if not exists store;
use store;

create table if not exists usuarios (
    nombre varchar(30) not null primary key,
    usuario varchar(30) not null,
    clave varchar(20) not null,
    nivel varchar(20) not null,
    estado varchar(10) not null
);

create table if not exists proveedores (
    id_proveedor smallint(5) not null auto_increment primary key,
    nombre varchar(50) not null,
    rfc varchar(20) not null,
    calle varchar(30) not null,
    numero smallint(5) not null,
    colonia varchar(30) not null,
    ciudad varchar(30) not null, 
    estado varchar(30) not null,
    nombre_contacto varchar(50) not null,
    telefono varchar(15) not null,
    email varchar(30) not null 
);

create table if not exists productos (
    id_producto smallint(5) not null auto_increment primary key,
    producto varchar(50) not null,
    descripcion varchar(90) not null,
    precio_compra float(6) not null,
    precio_venta float(6) not null,
    existencias smallint(5) not null 	
);

create table if not exists clientes (
    id_cliente smallint(5) not null auto_increment primary key,
    nombre varchar(50) not null,
    ap_paterno varchar(30) not null,
    ap_materno varchar(30) not null,
    telefono varchar(15) not null,
    email varchar(30) not null, 
    rfc varchar(20) not null,
    calle varchar(30) not null,
    numero smallint(5) not null,
    colonia varchar(30) not null,
    ciudad varchar(30) not null,
    estado varchar(30) not null		
);

create table if not exists ventas (
    id_venta smallint(5) not null auto_increment primary key,
    id_cliente smallint(5) not null references clientes(id_cliente),
    nombre varchar(50) not null references clientes(nombre),
    id_producto smallint(5) not null references productos(id_producto),
    producto varchar(50) not null references productos(producto),
    precio_venta float(6) not null references productos(precio_venta),
    cantidad int(10) not null,
    iva tinyint(4) not null,
    subtotal float(6) not null,   
    total float(6) not null 	
);

create table if not exists compras (
    id_compra smallint(5) not null auto_increment primary key,
    id_proveedor smallint(5) not null references proveedores(id_proveedor),
    nombre varchar(50) not null references proveedores(nombre),
    id_producto smallint(5) not null references productos(id_producto),
    producto varchar(50) not null references productos(producto),
    precio_compra float(6) not null references productos(precio_compra),
    cantidad int(10) not null,
    iva tinyint(4) not null,
    subtotal float(6) not null,
    total float(6) not null 	
);

insert into usuarios(nombre, usuario, clave, nivel, estado)
values('Sergio', 'MrButter21', 'Alessandra2000', 'Administrador', 'Activo');
insert into usuarios(nombre, usuario, clave, nivel, estado)
values('Alessandra', 'dead_alex12', 'EssO&R456', 'Cliente', 'Activo');
insert into usuarios(nombre, usuario, clave, nivel, estado)
values('Cornelio', 'CornieES', 'CornPops', 'Proveedor', 'Activo');

insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Rubi', 'Vargas', 'Cruz', '7751171638', 'alex15@hotmail.com', '2394574103', 'Nogales', '210', 'Estrella', 'Tulancingo', 'Hidalgo');
insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Sergio', 'Garcia', 'Cordero', '7751420556', 'sergio21@hotmail.com', '2394574104', 'Independencia', '414', 'Minera', 'Tulancingo', 'Hidalgo');
insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Sarah', 'Garcia', 'Vargas', '7752359417', 'sarah36@hotmail.com', '2394574105', 'Reforma', '624', 'Juarez', 'Pachuca', 'Hidalgo');

insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Cornelio', '5612304787', 'Revolucion', '310', 'Alamos', 'Xalapa', 'Veracruz', 'Cornie', '5524791334', 'cornie_es@live.com');
insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Abdulio', '5612304788', 'Alameda', '202', 'Insurgentes', 'Puebla', 'Puebla', 'Abe_Dul', '5544791336', 'abe_dul@live.com');
insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Sindulfa', '5612304789', 'Perforistas', '111', 'San Juan', 'Apizaco', 'Tlaxcala', 'Dulsinea', '5564791338', 'fanfare@live.com');

insert into productos(producto, descripcion, precio_compra, precio_venta, existencias)
values('Aceite', 'Aceite vegetal de maiz', '10.50', '26.00', '55');
insert into productos(producto, descripcion, precio_compra, precio_venta, existencias)
values('Salsa', 'Salsa de tomate con especias', '8.00', '21.50', '32');	
insert into productos(producto, descripcion, precio_compra, precio_venta, existencias)
values('Galletas', 'Galletas surtidas de chocolate', '12.50', '36.50', '30');

insert into compras(id_proveedor, nombre, id_producto, producto, precio_compra, cantidad, iva, subtotal, total)
values('1', 'Cornelio', '3', 'Galletas', '12.50', '1', '15', '14.75', '14.75');
insert into compras(id_proveedor, nombre, id_producto, producto, precio_compra, cantidad, iva, subtotal, total)
values('2', 'Abdulio', '2', 'Salsa', '8.00', '2', '15', '9.20', '18.40');
insert into compras(id_proveedor, nombre, id_producto, producto, precio_compra, cantidad, iva, subtotal, total)
values('3', 'Sindulfa', '1', 'Aceite', '10.50', '3', '15', '12.75', '38.25');

insert into ventas(id_cliente, nombre, id_producto, producto, precio_venta, cantidad, iva, subtotal, total)
values('1', 'Rubi', '3', 'Galletas', '36.50', '1', '15', '41.75', '41.75');
insert into ventas(id_cliente, nombre, id_producto, producto, precio_venta, cantidad, iva, subtotal, total)
values('2', 'Sergio', '2', 'Salsa', '21.50', '2', '15', '24.75', '49.50');
insert into ventas(id_cliente, nombre, id_producto, producto, precio_venta, cantidad, iva, subtotal, total)
values('3', 'Sarah', '1', 'Aceite', '26.00', '3', '15', '29.90', '89.70');   		