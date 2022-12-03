import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { PathfinderComponent } from "./pathfinder.component";

export const pathfinderRoutes: Routes = [{
    path: '',
    component: PathfinderComponent
}];


@NgModule({
    imports: [RouterModule.forChild(pathfinderRoutes)],
    exports: [RouterModule]
})
export class PathFinderRoutingModule { }