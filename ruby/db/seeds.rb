# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the bin/rails db:seed command (or created alongside the database with db:setup).
#
# Examples:
#
#   movies = Movie.create([{ name: "Star Wars" }, { name: "Lord of the Rings" }])
#   Character.create(name: "Luke", movie: movies.first)
Classroom.create(name: "Math 101")
Classroom.create(name: "English 201")
Classroom.create(name: "Art 402")
Classroom.create(name: "PE 020")
Classroom.create(name: "History 104")
Classroom.create(name: "Biology 302")
Student.create(name: "George Sample", classroom_id: 1)
Student.create(name: "Mark Example", classroom_id: 2)
Student.create(name: "Jennifer Person", classroom_id: 3)
Student.create(name: "Stacy Human", classroom_id: 4)
Student.create(name: "Brian Sample", classroom_id: 5)
Student.create(name: "Gena Example", classroom_id: 6)
Student.create(name: "Adam Person", classroom_id: 1)
Student.create(name: "Eve Human", classroom_id: 2)
Student.create(name: "Bonnie Sample", classroom_id: 3)
Student.create(name: "Clyde Example", classroom_id: 4)
Student.create(name: "Everett Person", classroom_id: 5)
Student.create(name: "Francis Human", classroom_id: 6)
Student.create(name: "Heather Sample", classroom_id: 1)
Student.create(name: "John Example", classroom_id: 2)
Student.create(name: "Jane Person", classroom_id: 3)
