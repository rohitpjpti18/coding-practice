import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PathFinderRoutingModule } from './pathfinder-routing.module';
import { PathfinderComponent } from './pathfinder.component';
import { BoardComponent } from './board/board.component';
import { NavbarComponent } from './navbar/navbar.component';

import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatMenuModule } from '@angular/material/menu';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';



@NgModule({
  declarations: [
    PathfinderComponent,
    BoardComponent,
    NavbarComponent
  ],
  imports: [
    CommonModule,
    MatSlideToggleModule,
    MatToolbarModule,
    MatButtonModule,
    MatFormFieldModule,
    MatSelectModule,
    MatMenuModule,
    PathFinderRoutingModule
  ]
})
export class PathfinderModule { }
