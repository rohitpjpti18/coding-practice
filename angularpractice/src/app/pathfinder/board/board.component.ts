import { Component } from '@angular/core';

@Component({
  selector: 'app-board',
  templateUrl: './board.component.html',
  styleUrls: ['./board.component.css']
})
export class BoardComponent {
  heightTemp: number;
  widthTemp: number;
  row: number;
  column: number;

  constructor() {
    this.heightTemp = window.innerHeight/24;
    this.widthTemp = window.innerWidth/24;
    if(this.heightTemp%2 == 0) this.heightTemp--;
    if(this.widthTemp%2 == 0) this.widthTemp--;

    this.row = Math.floor(this.heightTemp);
    this.column = Math.floor(this.widthTemp);
    console.log(this.row);
    console.log(this.column);
  }

  ngOnInit(): void {
    
  }

  ngAfterContentInit() {
    let tb = document.getElementById("board"); 

    this.widthTemp = window.innerWidth/24;
    if(this.heightTemp%2 == 0) this.heightTemp--;
    if(this.widthTemp%2 == 0) this.widthTemp--;

    this.row = Math.floor(this.heightTemp) - 10;
    this.column = Math.floor(this.widthTemp);
    console.log(this.row);
    console.log(this.column);
  }
  
}
