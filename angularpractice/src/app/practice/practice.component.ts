import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { AddArticleAction } from './store/actions/articles.actions';
import { Article } from './store/models/article.model';
import { AppState } from './store/store.model';

@Component({
  selector: 'app-practice',
  templateUrl: './practice.component.html',
  styleUrls: ['./practice.component.css']
})
export class PracticeComponent{
  articles$: Observable<Array<Article>> | undefined;

  constructor(private store: Store<AppState>) {}

  ngOnInit(): void {
      this.articles$ = this.store.select('article');
  }

  addArticle(form: NgForm) {
    this.store.dispatch(
      new AddArticleAction(form.value)
    );
    form.reset();
  }
}
