import logo from './logo.svg';
import './App.css';
import {useRoutes} from "react-router-dom";
import {TossPay} from "./component/toss/TossPay";
import {Success} from "./component/Success";

const  App = () => {
  const routes = useRoutes([
    {path: process.env.PUBLIC_URL + "/toss", element: <TossPay />},
    {path: process.env.PUBLIC_URL + "/success", element: <Success />}
  ])

  return routes;
}

export default App;
