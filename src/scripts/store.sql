/*Base de datos: */
drop database if exists store;
create database if not exists store;
use store;

/*Tabla de usuarios: */
create table if not exists usuarios (
    nombre varchar(30) not null primary key,
    usuario varchar(30) not null unique,
    clave varchar(20) not null,
    nivel varchar(20) not null,
    estado varchar(10) not null
)
engine = InnoDB default charset = utf8;

/*Tabla de proveedores: */
create table if not exists proveedores (
    id_proveedor smallint(3) not null auto_increment primary key,
    nombre varchar(30) not null,
    rfc varchar(5) not null unique,
    calle varchar(30) not null,
    numero smallint(5) not null,
    colonia varchar(30) not null,
    ciudad varchar(30) not null, 
    estado varchar(30) not null,
    nombre_contacto varchar(30) not null unique,
    telefono varchar(15) not null,
    email varchar(30) not null 
)
engine = InnoDB default charset = utf8;

/*Tabla de productos: */
create table if not exists productos (
    id_producto smallint(3) not null auto_increment primary key,
    producto varchar(30) not null,
    descripcion varchar(70) not null,
    precio_compra smallint(3) not null,
    precio_venta smallint(3) not null,
    existencias smallint(3) not null 	
)
engine = InnoDB default charset = utf8;

/*Tabla de clientes: */
create table if not exists clientes (
    id_cliente smallint(3) not null auto_increment primary key,
    nombre varchar(30) not null,
    ap_paterno varchar(30) not null,
    ap_materno varchar(30) not null,
    telefono varchar(15) not null,
    email varchar(30) not null, 
    rfc varchar(5) not null unique,
    calle varchar(30) not null,
    numero smallint(5) not null,
    colonia varchar(30) not null,
    ciudad varchar(30) not null,
    estado varchar(30) not null		
)
engine = InnoDB default charset = utf8;

/*Tabla de detalle de ventas: */
create table if not exists detalle_ventas (
    id_detalleVenta smallint(3) not null auto_increment primary key,
    id_venta smallint(3) not null,
    producto varchar(30) not null references productos(producto),
    cantidad smallint(3) not null,
    precio_venta smallint(3) not null references productos(precio_venta),
    total_producto smallint(3) not null
)
engine = InnoDB default charset = utf8;

/*Tabla de ventas: */
create table if not exists ventas (
    id_venta smallint(3) not null auto_increment primary key references detalleVentas,
    nombre varchar(30) not null references clientes(nombre),
    fecha varchar(30) not null,   
    total_venta smallint(3) not null	
)
engine = InnoDB default charset = utf8;

/*Tabla de detalle de compras: */
create table if not exists detalle_compras (
    id_detalleCompra smallint(3) not null auto_increment primary key,
    id_compra smallint(3) not null,
    producto varchar(30) not null references productos(producto),
    cantidad smallint(3) not null,
    precio_compra smallint(3) not null references productos(precio_compra),
    total_producto smallint(3) not null
)
engine = InnoDB default charset = utf8;

/*Tabla de compras: */
create table if not exists compras (
    id_compra smallint(3) not null auto_increment primary key references detalleCompras,
    nombre varchar(30) not null references proveedores(nombre),
    fecha varchar(30) not null,
    total_compra smallint(3) not null 	
)
engine = InnoDB default charset = utf8;

/*Registro de usuarios: */
insert into usuarios(nombre, usuario, clave, nivel, estado) values('Rubi', 'rubi1522', 'rubi1522', 'Administrador', 'Activo'),
('Sergio', 'MrButter22', 'Alessandra2000', 'Administrador', 'Activo'), ('Alessandra', 'dead_alex12', 'EssO&R456', 'Cliente', 'Activo'),
('Oswaldo', 'BearyOsi4', 'OSI00123', 'Cliente', 'Inactivo'), ('Sarah', 'sarah101', 'CornPops', 'Proveedor', 'Inactivo');

/*Registro de proveedores: */
insert into proveedores(nombre, rfc, calle, numero, colonia, ciudad, estado, nombre_contacto, telefono, email)
values('Rubi', '8KG62', 'Nogales', 210, 'Estrella', 'Tulancingo', 'Hidalgo', 'rubi1522', '7751171638', 'alex15@hotmail.com'),
('Sergio', 'S6B42', 'Independencia', 414, 'Minera', 'Tulancingo', 'Hidalgo', 'MrButter22', '7751420556', 'sergio21@hotmail.com'),
('Alessandra', 'N69XV', 'Nogales', 210, 'Estrella', 'Tulancingo', 'Hidalgo', 'dead_alex12', '7751171638', 'alex15@hotmail.com'),
('Oswaldo', '55MT3', 'Independencia', 414, 'Minera', 'Tulancingo', 'Hidalgo', 'BearyOsi4', '7751420556', 'sergio21@hotmail.com'),
('Sarah', 'L1B7A', 'Reforma', 624, 'Juarez', 'Pachuca', 'Hidalgo', 'sarah101', '7752359417', 'sarah36@hotmail.com');

/*Registro de productos: */
insert into productos(producto, descripcion, precio_compra, precio_venta, existencias)
values('Chocolate', 'Cacao en polvo para bebidas', 11, 22, 55), ('Cereal', 'Hojuelas de maíz azucaradas', 16, 33, 32),	
('Galletas', 'Galletas de mesa surtidas', 18, 35, 28), ('Pasta', 'Pasta de trigo para sopa', 3, 8, 50),
('Atún', 'Atún de aleta azul en aceite', 5, 11, 44); 

/*Registro de clientes: */
insert into clientes(nombre, ap_paterno, ap_materno, telefono, email, rfc, calle, numero, colonia, ciudad, estado)
values('Rubi', 'Vargas', 'Cruz', '7751171638', 'alex15@hotmail.com', '8KG62', 'Nogales', 210, 'Estrella', 'Tulancingo', 'Hidalgo'),
('Sergio', 'Garcia', 'Cordero', '7751420556', 'sergio21@hotmail.com', 'S6B42', 'Independencia', 414, 'Minera', 'Tulancingo', 'Hidalgo'),
('Alessandra', 'Vargas', 'Cruz', '7751171638', 'alex15@hotmail.com', 'N69XV', 'Nogales', 210, 'Estrella', 'Tulancingo', 'Hidalgo'),
('Oswaldo', 'Garcia', 'Cordero', '7751420556', 'sergio21@hotmail.com', '55MT3', 'Independencia', 414, 'Minera', 'Tulancingo', 'Hidalgo'),
('Sarah', 'Garcia', 'Vargas', '7752359417', 'sarah36@hotmail.com', 'L1B7A', 'Reforma', 624, 'Juarez', 'Pachuca', 'Hidalgo');
		
/*Registro de detalle de ventas: */
insert into detalle_ventas(id_venta, producto, cantidad, precio_venta, total_producto) values(1, 'Pasta', 2, 8, 16),
(2, 'Cereal', 1, 33, 33), (2, 'Atún', 2, 11, 22), (3, 'Chocolate', 4, 22, 88), (4, 'Galletas', 2, 35, 70),
(4, 'Pasta', 3, 8, 24), (5, 'Chocolate', 1, 22, 22), (6, 'Cereal', 3, 33, 99);

/*Registro de ventas: */
insert into ventas(nombre, fecha, total_venta) values('Sergio', 'November 24, 2016', 16), ('Sergio', 'November 25, 2016', 55),
('Rubi', 'November 26, 2016', 88), ('Oswaldo', 'November 27, 2016', 94), ('Alessandra', 'November 28, 2016', 22),
('Sarah', 'November 29, 2016', 99);

/*Registro de detalle de compras: */
insert into detalle_compras(id_compra, producto, cantidad, precio_compra, total_producto) values(1, 'Pasta', 2, 3, 6),
(2, 'Cereal', 1, 16, 16), (2, 'Atún', 2, 5, 10), (3, 'Chocolate', 4, 11, 44), (4, 'Galletas', 2, 18, 36),
(4, 'Pasta', 3, 3, 9), (5, 'Chocolate', 1, 11, 11), (6, 'Cereal', 3, 16, 48);

/*Registro de compras: */
insert into compras(nombre, fecha, total_compra) values('Sergio', 'November 24, 2016', 6), ('Sergio', 'November 25, 2016', 26),
('Rubi', 'November 26, 2016', 44), ('Oswaldo', 'November 27, 2016', 45), ('Alessandra', 'November 28, 2016', 11),
('Sarah', 'November 29, 2016', 48);

/*Vista de todas las ventas: */
create view ventas_generales as select detalle_ventas.id_detalleVenta, ventas.id_venta, ventas.fecha, clientes.nombre, clientes.rfc,
productos.producto, productos.precio_venta, detalle_ventas.cantidad, detalle_ventas.total_producto from store.ventas, store.clientes,
store.productos, store.detalle_ventas where clientes.nombre = ventas.nombre and detalle_ventas.id_venta = ventas.id_venta and
productos.producto = detalle_ventas.producto order by detalle_ventas.id_detalleVenta;

/*Vista de ventas por cliente: */
create view ventas_clientes as select ventas_generales.nombre, ventas_generales.rfc, sum(ventas_generales.total_producto) from
store.ventas_generales where ventas_generales.id_venta = ventas_generales.id_venta group by ventas_generales.nombre;

/*Vista de ventas por producto: */
create view ventas_productos as select ventas_generales.producto, ventas_generales.precio_venta, sum(ventas_generales.cantidad),
sum(ventas_generales.total_producto) from store.ventas_generales where ventas_generales.producto = ventas_generales.producto
group by ventas_generales.producto;

/*Ventas de un cliente en particular : */
select ventas_generales.fecha, ventas_generales.nombre, ventas_generales.rfc, ventas_generales.producto,
ventas_generales.precio_venta, ventas_generales.cantidad, ventas_generales.total_producto from store.ventas_generales
where ventas_generales.nombre like 'Sergio%' order by ventas_generales.id_detalleVenta;

/*Ventas de un producto en particular: */    		
select ventas_generales.fecha, ventas_generales.nombre, ventas_generales.rfc, ventas_generales.producto,
ventas_generales.precio_venta, ventas_generales.cantidad, ventas_generales.total_producto from store.ventas_generales
where ventas_generales.producto like 'Cereal%' order by ventas_generales.id_detalleVenta;

/*Vista de todas las compras: */
create view compras_generales as select detalle_compras.id_detalleCompra, compras.id_compra, compras.fecha, proveedores.nombre,
proveedores.rfc, productos.producto, productos.precio_compra, detalle_compras.cantidad, detalle_compras.total_producto from
store.compras, store.proveedores, store.productos, store.detalle_compras where proveedores.nombre = compras.nombre and
detalle_compras.id_compra = compras.id_compra and productos.producto = detalle_compras.producto order by
detalle_compras.id_detalleCompra;

/*Vista de compras por proveedor: */
create view compras_clientes as select compras_generales.nombre, compras_generales.rfc, sum(compras_generales.total_producto)
from store.compras_generales where compras_generales.id_compra = compras_generales.id_compra group by compras_generales.nombre;

/*Vista de compras por producto: */
create view compras_productos as select compras_generales.producto, compras_generales.precio_compra,
sum(compras_generales.cantidad), sum(compras_generales.total_producto) from store.compras_generales where
compras_generales.producto = compras_generales.producto group by compras_generales.producto;

/*Compras de un proveedor en particular : */
select compras_generales.fecha, compras_generales.nombre, compras_generales.rfc, compras_generales.producto,
compras_generales.precio_compra, compras_generales.cantidad, compras_generales.total_producto from store.compras_generales
where compras_generales.nombre like 'Sergio%' order by compras_generales.id_detalleCompra;

/*Compras de un producto en particular: */    		
select compras_generales.fecha, compras_generales.nombre, compras_generales.rfc, compras_generales.producto,
compras_generales.precio_compra, compras_generales.cantidad, compras_generales.total_producto from store.compras_generales
where compras_generales.producto like 'Cereal%' order by compras_generales.id_detalleCompra;