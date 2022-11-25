import React, { useState } from "react"

const ExampleWithManyStates = () => {
    // Declare multiple state variables
    const [age, setAge] = useState(42);
    const [fruit, setFruit] = useState('banana');
    const [todos, setTodos] = useState([{text: 'Learn hooks'}]);

    return (
        <div>
            <p>current age {age} </p>
            <button onClick={() => setAge(age + 1)}>
                Click me
            </button>

            <p>current fruit {fruit} </p>
            <button onClick={() => fruit === 'banana' ? setFruit('apple'): setFruit('banana')}>
                Click me
            </button>

            <p>current todos {todos.map((item) => ' ' + item.text)} </p>
            <button onClick={() => setTodos([...todos, {text: 'newthing'}])}>
                Click me
            </button>
        </div>
    )
}

export default ExampleWithManyStates;