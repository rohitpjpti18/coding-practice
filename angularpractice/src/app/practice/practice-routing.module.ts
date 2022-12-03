import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { PracticeComponent } from "./practice.component";

export const practiceRoutes: Routes = [
    {
        path: '',
        component: PracticeComponent
    }
]


@NgModule({
    imports: [RouterModule.forChild(practiceRoutes)],
    exports: [RouterModule]
})
export class PracticeRoutingModule { }