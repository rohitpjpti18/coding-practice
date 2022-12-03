import { NgModule } from '@angular/core';


import { StoreModule } from '@ngrx/store';
import { ArticleReducer } from './store/reducer/article.reducer';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { PracticeComponent } from './practice.component';
import { PracticeRoutingModule } from './practice-routing.module';



@NgModule({
  declarations: [
    PracticeComponent
  ],
  imports: [
    CommonModule,
    PracticeRoutingModule,
    FormsModule,
    StoreModule.forRoot({
      article: ArticleReducer,
    }),
  ]
})
export class PracticeModule { }
