import { Action, createAction, props } from "@ngrx/store";
import { Article } from "../models/article.model";

export enum ArticleActionType {
    ADD_ITEM = '[ARTICLE] Add ARTICLE',
};

/*
export const AddArticleAction = createAction(
    ArticleActionType.ADD_ITEM,
    props<{payload: Article}>()
);
*/


export class AddArticleAction implements Action {
    readonly type = ArticleActionType.ADD_ITEM;
    constructor(public payload: Article) {}
}

export type ArticleAction = AddArticleAction;
