class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    // greet() {
    //     console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
    // }
    calling() {
        console.log(`Name is ${this.name} and age is ${this.age}`);
    }
}

const person1 = new Person("Alice", 30);
const person2 = new Person("Bob", 25);
person1.calling();
person2.calling();

// Wendell V Rosete