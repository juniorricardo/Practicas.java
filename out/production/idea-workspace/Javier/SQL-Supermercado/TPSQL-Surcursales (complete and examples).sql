-- Trabajo Práctico: Bases de Datos (MySQL Workbench)

-- Contexto: Imaginemos que nos toca administrar la base datos de una cadena de supermercados de la ciudad de buenos aires

-- 1. Crear las siguientes tablas, con sus respectivas columnas, asignando un tipo de dato adecuado para cada una de ellas: 

-- a) Sucursales - Código de sucursal (clave primaria), Barrio, Dirección

-- b) Ventas - Número de ticket (clave primaria), Código de sucursal (clave externa), Fecha, Monto total, Medio de pago

-- Completar la tabla de Sucursales con 10 registros, y la tabla de Ventas con 25 registros. Para completar la fecha, tener en cuenta solamente los últimos tres meses.

CREATE DATABASE SMBD;

-- Create a new table called 'Sucursales' in schema 'SMDB'
-- Create the table in the specified schema
CREATE TABLE Sucursales
(
    IdSucursal INT NOT NULL AUTO_INCREMENT, 
    Barrio VARCHAR(20), 
    Direccion VARCHAR (20), 
    PRIMARY KEY(IdSucursal) 
);

-- Create a new table called 'Ventas' in schema 'SMDB'
-- Create the table in the specified schema
CREATE TABLE Ventas
(
    IdTicket INT NOT NULL AUTO_INCREMENT, 
    IdSucursal INT NOT NULL, 
    Fecha DATE NOT NULL, 
    MontoTotal FLOAT NOT NULL, 
    MedioPago VARCHAR(20), 
    PRIMARY KEY(IdTicket), 
    FOREIGN KEY(IdSucursal) REFERENCES Sucursales(IdSucursal) 
);

-- Insert rows into table 'Sucursales'
INSERT INTO Sucursales
( Barrio, Direccion )
VALUES
( 'Tolosa', 'Calle 15 894' ),
( 'Independencia', 'Calle 145 674' ),
( 'Caseros', '3 de Febrero  3456' ),
( 'Chacarita', 'Fraga 1165' ),
( 'Caseros', 'El Salvador 6875' ),
( 'Ermitaño', '15 de Agosto 7520 ' ),
( 'Independencia', 'España 432' ),
( 'Ermitaño', 'Avellaneda 2000' ),
( 'Independencia', 'Calle 55 3250' ),
( 'Banfield', 'Los Heras 810' );

-- Insert rows into table 'Ventas'
INSERT INTO Ventas
( IdSucursal, Fecha, MontoTotal,  MedioPago )
VALUES
( 5, '2019-09-05', 589.8 , 'Credito'),
( 8, '2019-09-10', 1320.5 , 'Efectivo'),
( 4, '2019-09-12', 542.3 , 'Credito'),
( 1, '2019-09-20', 875.2 , 'Debito'),
( 2, '2019-09-20', 733.5, 'Efectivo'),
( 5, '2019-09-20', 738.5 , 'Debito'),
( 5, '2019-09-21', 735.3 , 'Credito'),
( 7, '2019-09-28', 375.9 , 'Credito'),
( 1, '2019-09-29', 1459.9 , 'Debito'),
( 8, '2019-10-05', 7186.9 , 'Efectivo'),
( 4, '2019-10-06', 1675.2 , 'Debito'),
( 3, '2019-10-06', 2741.9 , 'Efectivo'),
( 5, '2019-10-06', 713.2 , 'Debito'),
( 4, '2019-10-06', 196.8 , 'Credito'),
( 1, '2019-10-07', 7152.4 , 'Credito'),
( 3, '2019-10-07', 6482.9 , 'Credito'),
( 2, '2019-10-08', 3812.3 , 'Credito'),
( 4, '2019-11-09', 843.9 , 'Debito'),
( 5, '2019-11-09', 205.1 , 'Debito'),
( 5, '2019-11-09', 5861.3 , 'Efectivo'),
( 5, '2019-11-10', 846.3 , 'Credito'),
( 3, '2019-11-10', 6200.8 , 'Efectivo'),
( 8, '2019-11-10', 2120.9 , 'Credito'),
( 7, '2019-11-10', 608.4 , 'Credito'),
( 9, '2019-11-10', 7506.9 , 'Efectivo');


-- 2. Redacte una consulta que seleccione las sucursales de un barrio determinado.
SELECT * FROM Sucursales
WHERE Barrio = 'Independencia';

-- 3. Redacte una consulta que seleccione todas las ventas del mes de octubre
SELECT * FROM Ventas
WHERE fecha BETWEEN '20191001' AND '20191031';

-- 4. Redacte una consulta que seleccione todas las ventas que sean mayores a la venta promedio, ordenadas de forma descendente.
SELECT * FROM Ventas
WHERE Ventas.MontoTotal > ( SELECT AVG(MontoTotal)
                            FROM Ventas );

-- 5. Redacte una consulta que muestre las ventas de las sucursales de un barrio determinado, correspondientes al mes de octubre
SELECT * FROM Ventas AS v
    INNER JOIN Sucursales as s
    ON v.IdSucursal = s.IdSucursal
WHERE (fecha BETWEEN '20191001' AND '20191031')
    AND (s.barrio = 'Caseros');

-- 6. Redacte una consulta que cuente cuantas sucursales tuvieron ingresos mayores a un monto determinado durante el mes de Septiembre.
SELECT COUNT(IdSucursal) AS Cantidad FROM Ventas
WHERE Ventas.MontoTotal > 700
AND Ventas.Fecha BETWEEN '20190901' AND '20190930';

-- 7. Redacte una consulta que obtenga los ingresos de todas las sucursales durante la primera quincena de noviembre, y las ordene de menor a mayor
SELECT v.IdSucursal, s.Barrio, SUM(v.MontoTotal) AS Total
FROM Ventas AS v 
    INNER JOIN Sucursales AS s
    ON v.IdSucursal = s.IdSucursal
WHERE v.Fecha BETWEEN '20190901' AND '20190915'
    GROUP BY IdSucursal;
    ORDER BY Total ASC;
