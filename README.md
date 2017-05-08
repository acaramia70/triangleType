# triangleType
Determine the type of a triangle. It takes the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene
# Implementation choices
Triangle class contains sides length and type, that is an enum. It contains also methods for determine triangle type, and for checking sides length value correctness (greater than 0 and compliance with triangle inequality theorem).
Sides length is BigDecimal for managing double value in the right way.
