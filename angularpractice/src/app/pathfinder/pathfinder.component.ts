import { Component } from '@angular/core';

@Component({
  selector: 'app-pathfinder',
  templateUrl: './pathfinder.component.html',
  styleUrls: ['./pathfinder.component.css']
})
export class PathfinderComponent {
  algorithms: string[]

  constructor() {
    this.algorithms = ['Breadth First Search', 'Depth First Search', 'Dikjstra\'s Algorithm', 'A-Star Algorithm'];
  }
}
