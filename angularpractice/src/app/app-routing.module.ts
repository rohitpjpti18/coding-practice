import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PathfinderComponent } from './pathfinder/pathfinder.component';

const routes: Routes = [
  { path: 'pathfinder', component: PathfinderComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
