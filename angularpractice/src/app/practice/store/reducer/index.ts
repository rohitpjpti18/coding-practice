import { ActionReducerMap } from "@ngrx/store";
import { AppState } from "../store.model";
import { ArticleReducer } from "./article.reducer";

export const rootReducer = {};


export const reducers: ActionReducerMap<AppState, any> = {
    article: ArticleReducer
};