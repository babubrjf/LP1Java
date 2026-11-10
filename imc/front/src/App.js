import 'bootswatch/dist/zephyr/bootstrap.min.css';
import './App.css';
import Navbar from './components/Navbar';
import CalculadoraImc from './views/CalculadoraImc';

function App() {
  return (
    <>
      <Navbar />
      <main className="container app-content">
        <CalculadoraImc />
      </main>
    </>
  );
}

export default App;
