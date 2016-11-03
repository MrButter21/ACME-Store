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
    fecha varchar(15) not null,
    id_cliente smallint(5) not null references clientes(id_cliente),
    subtotal float(6) not null,
    iva tinyint(4) not null,
    total float(6) not null 	
);

create table if not exists compras (
    id_compra smallint(5) not null auto_increment primary key,
    fecha varchar(15) not null,
    id_proveedor smallint(5) not null references proveedores(id_proveedor),
    subtotal float(6) not null,
    iva tinyint(4) not null,
    total float(6) not null 	
);

create table if not exists detalleVentas (
    id_det_venta smallint(5) not null auto_increment primary key,
    id_venta smallint(5) not null references ventas(id_venta),
    id_producto smallint(5) not null references productos(id_producto),
    cantidad int(10) not null,
    total_productos float(6) not null,
    precio float(6) not null 	
);

create table if not exists detalleCompras (
    id_det_compra smallint(5) not null auto_increment primary key,
    id_compra smallint(5) not null references compras(id_compra),
    id_producto smallint(5) not null references productos(id_producto),
    cantidad int(10) not null,
    total_productos float(6) not null,
    precio float(6) not null 	
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