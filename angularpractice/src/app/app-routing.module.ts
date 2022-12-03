import { NgModule } from '@angular/core';
import { ExtraOptions, RouterModule, Routes } from '@angular/router';
import { PracticeComponent } from './practice/practice.component';

const routes: Routes = [
  { path: 'pathfinder', 
    loadChildren: () => import('./pathfinder/pathfinder.module')
                          .then(m => m.PathfinderModule)
  },
  {
    path: 'practice',
    loadChildren: () => import('./practice/practice.module')
                          .then(m=>m.PracticeModule)
  },
  {path: '', redirectTo: 'pathfinder', pathMatch:"full"},
  {path: '*', redirectTo: 'pathfinder'},
];

const config: ExtraOptions = {
  useHash: false,
};

@NgModule({
  imports: [RouterModule.forRoot(routes, config)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
