import { Action, ActionReducer, createReducer, on } from "@ngrx/store";
import { AddArticleAction, ArticleAction, ArticleActionType } from "../actions/articles.actions";
import { Article } from "../models/article.model";


const intialState: Array<Article> = [
    {
        id: '1',
        name: 'Angular State Management Test',
        author: 'Rohit Prajapati',
        publisher: 'darklord.inc'
    },
]

export function ArticleReducer(
    state: Array<Article> = intialState,
    action: Action
) {
    switch (action.type) {
        case ArticleActionType.ADD_ITEM:
            return [...state, (action as ArticleAction).payload];
        default:
            return state;
    }
}


/* 
const initialState: Array<Article> = [
    {
        id: '1',
        name: 'Angular State Management with NgRx',
        author: 'Chameera Dulanga',
        publisher: 'SyncFusion'
    },
]

const reducer = createReducer(
    initialState,
    on(AddArticleAction, (state, action) => {
        return [...state, action.payload]
    })
);

export const ArticleReducer = (state: Array<Article> | undefined, action: Action) {
    return reducer(state, action);
}
*/