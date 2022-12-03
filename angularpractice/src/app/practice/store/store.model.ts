import {Article} from './models/article.model';

export interface AppState {
    readonly article: Array<Article>;
}