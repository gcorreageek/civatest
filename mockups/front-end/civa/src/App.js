import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import DatePicker from 'react-datepicker';
import moment from 'moment';
import 'moment/locale/es';
import 'react-datepicker/dist/react-datepicker.css';

class App extends Component {

  constructor(props) {
    super(props);
    this.state = {
      item: '',
      fecha: moment(),
      combo: '',
      arreglo: [],
      prioridades:['Alta','Media','Baja'],
    }
    this.agrega = this.agrega.bind(this);
    this.cambioItem = this.cambioItem.bind(this);
    this.cambioFecha = this.cambioFecha.bind(this);
    this.cambioCombo = this.cambioCombo.bind(this);
  }
  agrega = (event) =>{
    // arreglo.push(...arreglo,{item,})
    console.log(this.state.item);
    console.log(this.state.combo);
    console.log(  moment(this.state.fecha).format('DD/MM/YYYY') );

    this.setState({
      arreglo: [...this.state.arreglo, {
        'item': this.state.item,
        'fecha': moment(this.state.fecha).format('DD/MM/YYYY'),
        'combo': this.state.combo
      }]
    }); 
  }
  cambioItem = (e) =>{
    this.setState({ item: e.target.value });
  }
  cambioFecha = (dateee) =>{
    this.setState({ fecha: dateee });
  }
  cambioCombo = (e) =>{
    console.log(e);
    console.log(e.target.value);
    this.setState({ combo: e.target.value });
  }
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <div  className='container'>
          <h2>To do list</h2> 
          <form>
            <div className='row'> 
              <div className="form-group col">
                <label  >Item</label>
                <input type="email" className="form-control"  value={this.state.item}  onChange={this.cambioItem} />
              </div> 
              <div className="form-group col">
                <label >Date</label>
                {/* <input type="email" className="form-control"  value={this.state.fecha} onChange={this.cambioFecha}  /> */}
                <DatePicker
                            selected={this.state.fecha}
                            className='datepicker-field form-control'
                            dateFormat='DD/MM/YYYY'
                            locale='es'
                            onChange={this.cambioFecha}
                          />
              </div>
              <div className="form-group col">
                <label  >Item</label>
                <select value={this.state.combo}  onChange={this.cambioCombo}  >
                  {
                    this.state.prioridades.map((prioridades, i) =>
                      <option key={i} value={prioridades} >{prioridades}</option>
                    )
                  }
                </select>
                
              </div> 
              <div className="form-group col">
                <input type='button' onClick={this.agrega}  value='ingresar'  />
              </div> 
            </div> 
          </form>
        </div>
        <div>
          {
            this.state.arreglo.map((row,i)=>
            <div key={i}>{row.item}<br/>{row.fecha}<br/>{row.combo}</div>
          )
          }
        </div>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
      </div>
    );
  }
}

export default App;
