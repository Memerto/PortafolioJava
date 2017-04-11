-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-04-2017 a las 03:46:31
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `comedor`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargo`
--

CREATE TABLE IF NOT EXISTS `cargo` (
  `id_cargo` int(11) NOT NULL,
  `cargo_persona` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_cargo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cargo`
--

INSERT INTO `cargo` (`id_cargo`, `cargo_persona`) VALUES
(0, 'Seleccione'),
(1, 'Administrador'),
(2, 'Especial'),
(3, 'Funcionario'),
(4, 'Cajero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE IF NOT EXISTS `persona` (
  `rut_persona` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `clave_persona` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `nombre_persona` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `apellido_persona` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `cargo_persona` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`rut_persona`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`rut_persona`, `clave_persona`, `nombre_persona`, `apellido_persona`, `cargo_persona`) VALUES
('1234', '1234', 'Jose Miguel', 'Muñoz', 'Administrador'),
('3456', '3456', 'Juan', 'Perez', 'Cajero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vales`
--

CREATE TABLE IF NOT EXISTS `vales` (
  `id_vale` int(11) NOT NULL,
  `tipo_vale` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_vale`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `vales`
--

INSERT INTO `vales` (`id_vale`, `tipo_vale`) VALUES
(0, 'Seleccione'),
(1, 'Desayuno'),
(2, 'Almuerzo'),
(3, 'Once'),
(4, 'Cena 1'),
(5, 'Cena 2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `id_venta` int(11) NOT NULL,
  `rut_persona` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `id_vale` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `tipo_vale` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `total` int(100) NOT NULL,
  `fecha_hora` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id_venta`, `rut_persona`, `id_vale`, `tipo_vale`, `total`, `fecha_hora`) VALUES
(1, '1234', '111', 'Almuerzo', 2800, '2016-12-03 17:22:23');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
