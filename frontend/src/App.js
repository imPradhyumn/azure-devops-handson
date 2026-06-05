import logo from "./logo.svg";
import "./App.css";
import { useEffect, useState } from "react";

function App() {
  const [toDos, setTodos] = useState([]);

  useEffect(() => {
    fetch("http://localhost:9090/todo/get-all")
      .then((res) => {
        res.json().then((json) => setTodos(json));
      })
      .catch((err) => {});
  }, []);

  if (toDos.length === 0) return <div className="App">No data</div>;

  return (
    <div className="App">
      {toDos.map((todo) => {
        return (
          <div key={todo.id}>
            <span>{todo.id}</span>
            <span>{todo.name}</span>
          </div>
        );
      })}
    </div>
  );
}

export default App;
