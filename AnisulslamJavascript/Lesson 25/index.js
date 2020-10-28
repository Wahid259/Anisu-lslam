// student datail

// var name = "Wahid Bin Mahbub";
// var age = "27";
// var cgpa = "3.00";
// var lang = ["Bangali", "Hindi", "English"];

//document.write(age);

//How to create am object
//How to print the value of an object
//adding a constructor
//Adding function inside a constructor


function Student(name , age, cgpa, lang)
{
    this.name = name;
    this.age = age;
    this.cgpa = cgpa;
    this.lang = lang;

    this.display = function()
    {
        document.write(this.name);
        document.write(this.age);
        document.write(this.cgpa);
        document.write(this.lang);
    }
}

var student1 = new Student("Wahid Bin Mahbub", 27, 3.00, ["Bangali", "Hindi", "English"]);

var student2 = new Student("Umme Kulsum Komey", 24, 3.92, ["Bangali", "Urdu", "English"]);

var student3 = new Student("Sakib Bin Rafi", 27, 3.00, ["Bangali", "Hindi", "English"]);

student1.display();

// document.write(student1.name);
// document.write(student1.age);
// document.write(student1.cgpa);
// document.write(student1.lang);

// var student2 = {
//     name: "Umme kulsum Komey",
//     age: 27,
//     cgpa: 3.92,
//     lang: ["Bangali", "Urdu", "English"],
// }

// var student3 = {
//     name: "Goru chagol",
//     age: 27,
//     cgpa: 3.02,
//     lang: ["Bangali", "Spanish", "English"],
