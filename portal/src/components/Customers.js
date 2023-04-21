import React, {Component} from 'react';

export default class Customers extends Component{
    constructor(props){
        super(props);
        this.state ={
            customers: [],
        };
    }
    render(){
        return (
        <div>
            Hello from react spring portal
        </div>
        )
    }
}