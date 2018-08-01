package main.kotlin.com.ogr

open class Triangle(color: Color, vararg sidesLength: Double) : Shape(3, color, *sidesLength)