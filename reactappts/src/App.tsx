import React from 'react';
import './App.css';
import Example from './components/Example';
import ExampleWithManyStates from './components/ExampleWithManyStates';
import HooksPractice from './components/HooksPractice';

function App() {
  return (
    <div className="App">
      <HooksPractice />
      <Example />
      <ExampleWithManyStates />
    </div>
  );
}

export default App;
