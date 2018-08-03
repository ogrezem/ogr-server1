package main.kotlin.com.ogr.shapes

open class Triangle(color: Color, vararg sidesLength: Double) : Shape(3, color, *sidesLength)