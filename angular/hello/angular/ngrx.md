# Learn NGRX

This repository contains a list of resources to learn NgRx. It includes tutorials, articles, videos, books, and other resources to help you learn NgRx from scratch.

## Table of Contents

- [Introduction](#learn-ngrx)
- [Official Documentation](#official-documentation)
- [Tutorials](#tutorials)
- [Articles](#articles)
- [Books](#books)
- [Courses](#courses)
- [Community](#community)
- [Contributing](#contributing)
- [License](#license)

## Introduction

NgRx is a state management library for Angular applications. It is inspired by Redux, a predictable state container for JavaScript applications. NgRx provides a set of tools to manage the state of your Angular application. It helps you to write clean, maintainable, and scalable code by managing the state of your application in a predictable way.

NgRx consists of the following packages:

- `@ngrx/store`: A state management library for Angular applications.
- `@ngrx/effects`: A side effect model for managing side effects in Angular applications.
- `@ngrx/router-store`: A router state management library for Angular applications.
- `@ngrx/entity`: A library to manage collections of entities.
- `@ngrx/component-store`: A state management library for Angular components.
- `@ngrx/signals`: A library for managing reactive signals in Angular applications.
- `@ngrx/operators`: A set of utility functions for working with NgRx.

NgRx follows the Redux pattern, which consists of the following concepts:

- **Store**: A single source of truth that holds the state of your application.

- **Actions**: Plain objects that represent what happened in your application.

- **Reducers**: Pure functions that specify how the state changes in response to actions.

- **Selectors**: Functions that extract specific pieces of state from the store.

- **Effects**: Side effects that are triggered in response to actions.

- **Entities**: Collections of entities that are stored in the state.

- **Router Store**: A state management library for the Angular router.

- **Component Store**: A state management library for Angular components.

- **Signals**: Reactive signals that represent events in your application.

- **Operators**: Utility functions for working with NgRx.

NgRx is widely used in Angular applications to manage the state of the application.

## Why Use NgRx?

NgRx provides a predictable state management solution for Angular applications. It helps you to write clean, maintainable, and scalable code by managing the state of your application in a predictable way. Here are some reasons to use NgRx:

- **Predictable State Management**: NgRx provides a predictable way to manage the state of your application. It follows the Redux pattern, which makes it easier to debug, test, and maintain your code.

- **Single Source of Truth**: NgRx uses a single source of truth to hold the state of your application. This makes it easier to manage the state and keep it in sync with the UI.

- **Immutable State**: NgRx uses immutable data structures to represent the state of your application. This prevents accidental mutations and makes it easier to track changes in the state.

- **Debugging and Testing**: NgRx provides tools to debug and test your application. You can use the Redux DevTools to inspect the state of your application and track the actions that are dispatched.

- **Scalability**: NgRx is designed to scale with your application. You can use NgRx to manage the state of large applications with complex data flows.

- **Reusability**: NgRx provides tools to create reusable components and services. You can use selectors, effects, and reducers to encapsulate the logic of your application and reuse it across different parts of your application.

- **Performance**: NgRx is optimized for performance. It uses memoization and lazy loading to improve the performance of your application.

- **Community Support**: NgRx has a large community of developers who contribute to the project and provide support to other developers.

Overall, NgRx is a powerful state management library for Angular applications. It provides a set of tools to manage the state of your application in a predictable way, which makes it easier to debug, test, and maintain your code.

By using NgRx, you can manage the state of your Angular application in a predictable way, which makes it easier to debug, test, and maintain your code.

## Installation

To install NgRx in your Angular application, you need to install the following packages:

```bash
npm install @ngrx/store @ngrx/effects @ngrx/entity @ngrx/router-store @ngrx/schematics @ngrx/component-store @ngrx/signals @ngrx/operators
```

## `@ngrx/store`

`@ngrx/store` is a state management library for Angular applications. It provides a single source of truth to hold the state of your application. You can use `@ngrx/store` to manage the state of your application in a predictable way.

To use `@ngrx/store` in your Angular application, you need to follow these steps:

1. Define the state of your application using interfaces and classes.

2. Create actions to represent what happened in your application.

3. Create reducers to specify how the state changes in response to actions.

4. Create selectors to extract specific pieces of state from the store.

5. Register the reducers and selectors in the NgRx store.

6. Dispatch actions to update the state of your application.

7. Subscribe to the state changes in your components.

Here is an example of how to use `@ngrx/store` in an Angular application:

```typescript
// Define the state of your application
export interface AppState {
  counter: number;
}

// Create actions to represent what happened in your application
export enum CounterActionTypes {
  Increment = '[Counter] Increment',
  Decrement = '[Counter] Decrement',
}

export class Increment implements Action {
  readonly type = CounterActionTypes.Increment;
}

export class Decrement implements Action {
  readonly type = CounterActionTypes.Decrement;
}

export type CounterActions = Increment | Decrement;

// Create reducers to specify how the state changes in response to actions
export function counterReducer(state: AppState, action: CounterActions): AppState {
  switch (action.type) {
    case CounterActionTypes.Increment:
      return { ...state, counter: state.counter + 1 };
    case CounterActionTypes.Decrement:
      return { ...state, counter: state.counter - 1 };
    default:
      return state;
  }
}

// Create selectors to extract specific pieces of state from the store
export const selectCounter = (state: AppState) => state.counter;

// Register the reducers and selectors in the NgRx store
@NgModule({
  imports: [
    StoreModule.forRoot({ counter: counterReducer }),
  ],
})
export class AppModule {}

// Dispatch actions to update the state of your application
@Component({
  selector: 'app-counter',
  template: `
    <button (click)="increment()">Increment</button>
    <button (click)="decrement()">Decrement</button>
    <p>Counter: {{ counter$ | async }}</p>
  `,
})
export class CounterComponent {
  counter$ = this.store.pipe(select(selectCounter));

  constructor(private store: Store<AppState>) {}

  increment() {
    this.store.dispatch(new Increment());
  }

  decrement() {
    this.store.dispatch(new Decrement());
  }
}
```

## `@ngrx/effects`

`@ngrx/effects` is a side effect model for managing side effects in Angular applications. It provides a way to manage side effects in a predictable way. You can use `@ngrx/effects` to manage side effects such as HTTP requests, timers, and other asynchronous operations.

To use `@ngrx/effects` in your Angular application, you need to follow these steps:

1. Create effects to manage side effects in your application.

2. Register the effects in the NgRx store.

3. Dispatch actions to trigger the effects.

Here is an example of how to use `@ngrx/effects` in an Angular application:

```typescript
@Injectable()
export class CounterEffects {
  @Effect()
  increment$ = this.actions$.pipe(
    ofType(CounterActionTypes.Increment),
    map(() => new Increment())
  );

  constructor(private actions$: Actions) {}
}

@NgModule({
  imports: [
    EffectsModule.forRoot([CounterEffects]),
  ],
})
export class AppModule {}
```

## `@ngrx/entity`

`@ngrx/entity` is a library to manage collections of entities in Angular applications. It provides a way to manage collections of entities in a predictable way. You can use `@ngrx/entity` to manage collections of entities such as users, products, and other data.

To use `@ngrx/entity` in your Angular application, you need to follow these steps:

1. Define the entity state of your application using interfaces and classes.

2. Create actions to represent what happened in your application.

3. Create reducers to specify how the entity state changes in response to actions.

4. Create selectors to extract specific pieces of entity state from the store.

5. Register the entity reducers and selectors in the NgRx store.

6. Dispatch actions to update the entity state of your application.

7. Subscribe to the entity state changes in your components.

Here is an example of how to use `@ngrx/entity` in an Angular application:

```typescript
// Define the entity state of your application
export interface UserState extends EntityState<User> {}

// Create actions to represent what happened in your application
export enum UserActionTypes {
    LoadUsers = '[User] Load Users',
    AddUser = '[User] Add User',
    Update = '[User] Update User',
    Delete = '[User] Delete User',
}

export class LoadUsers implements Action {
    readonly type = UserActionTypes.LoadUsers;
}

export class AddUser implements Action {
    readonly type = UserActionTypes.AddUser;
    constructor(public payload: User) {}
}

export class UpdateUser implements Action {
    readonly type = UserActionTypes.UpdateUser;
    constructor(public payload: User) {}
}

export class DeleteUser implements Action {
    readonly type = UserActionTypes.DeleteUser;
    constructor(public payload: number) {}
}

export type UserActions = LoadUsers | AddUser | UpdateUser | DeleteUser;

// Create reducers to specify how the entity state changes in response to actions
export const userReducer = createReducer(
    initialUserState,
    on(UserActions.LoadUsers, (state, action) => adapter.addAll(action.users, state)),
    on(UserActions.AddUser, (state, action) => adapter.addOne(action.user, state)),
    on(UserActions.UpdateUser, (state, action) => adapter.updateOne(action.user, state)),
    on(UserActions.DeleteUser, (state, action) => adapter.removeOne(action.id, state)),
);

// Create selectors to extract specific pieces of entity state from the store
export const selectUserState = createFeatureSelector<UserState>('users');
export const { selectAll: selectAllUsers } = adapter.getSelectors(selectUserState);

// Register the entity reducers and selectors in the NgRx store
@NgModule({
    imports: [
        StoreModule.forFeature('users', userReducer),
    ],
})
export class AppModule {}

// Dispatch actions to update the entity state of your application
@Component({
    selector: 'app-users',
    template: `
        <ul>
            <li *ngFor="let user of users$ | async">{{ user.name }}</li>
        </ul>
    `,
})
export class UsersComponent {
    users$ = this.store.pipe(select(selectAllUsers));

    constructor(private store: Store<UserState>) {
        this.store.dispatch(new LoadUsers());
    }
}
```

## `@ngrx/router-store`

`@ngrx/router-store` is a router state management library for Angular applications. It provides a way to manage the router state in a predictable way. You can use `@ngrx/router-store` to manage the router state of your application.

To use `@ngrx/router-store` in your Angular application, you need to follow these steps:

1. Define the router state of your application using interfaces and classes.

2. Create actions to represent what happened in your application.

3. Create reducers to specify how the router state changes in response to actions.

4. Create selectors to extract specific pieces of router state from the store.

5. Register the router reducers and selectors in the NgRx store.

6. Dispatch actions to update the router state of your application.

7. Subscribe to the router state changes in your components.

Here is an example of how to use `@ngrx/router-store` in an Angular application:

```typescript
// Define the router state of your application
export interface RouterStateUrl {
  url: string;
  queryParams: Params;
  params: Params;
}

export interface RouterState {
  state: RouterStateUrl;
  navigationId: number;
}

// Create actions to represent what happened in your application
export enum RouterActionTypes {
  Navigation = '[Router] Navigation',
}

export class Navigation implements Action {
  readonly type = RouterActionTypes.Navigation;
  constructor(public payload: { path: string, queryParams: Params, params: Params }) {}
}

export type RouterActions = Navigation;

// Create reducers to specify how the router state changes in response to actions
export function routerReducer(state: RouterState, action: RouterActions): RouterState {
  switch (action.type) {
    case RouterActionTypes.Navigation:
      return { state: action.payload, navigationId: state.navigationId + 1 };
    default:
      return state;
  }
}

// Create selectors to extract specific pieces of router state from the store
export const selectRouter = createFeatureSelector<RouterReducerState>('router');
export const selectRouterState = createSelector(selectRouter, (state: RouterReducerState) => state.state);
export const selectRouterParams = createSelector(selectRouterState, (state: RouterStateUrl) => state.params);
export const selectRouterQueryParams = createSelector(selectRouterState, (state: RouterStateUrl) => state.queryParams);

// Register the router reducers and selectors in the NgRx store
@NgModule({
  imports: [
    StoreModule.forFeature('router', routerReducer),
    StoreRouterConnectingModule.forRoot(),
  ],
})
export class AppModule {}

// Dispatch actions to update the router state of your application
@Component({
  selector: 'app-root',
    template: `
        <a [routerLink]="['/']">Home</a>
        <a [routerLink]="['/about']">About</a>
        <router-outlet></router-outlet>
    `,
})
export class AppComponent {
  constructor(private store: Store<RouterState>) {}

  ngOnInit() {
    this.store.dispatch(new Navigation({ path: '/', queryParams: {}, params: {} }));
  }
}
```

## `@ngrx/component-store`

`@ngrx/component-store` is a state management library for Angular components. It provides a way to manage the state of Angular components in a predictable way. You can use `@ngrx/component-store` to manage the state of Angular components.

To use `@ngrx/component-store` in your Angular application, you need to follow these steps:

1. Define the component state of your application using interfaces and classes.

2. Create selectors to extract specific pieces of component state from the store.

3. Create methods to update the component state.

4. Register the component store in the NgRx store.

5. Subscribe to the component state changes in your components.

Here is an example of how to use `@ngrx/component-store` in an Angular application:

```typescript
// Define the component state of your application
export interface CounterState {
  counter: number;
}

// Create selectors to extract specific pieces of component state from the store
export const selectCounter = createSelector(
  (state: CounterState) => state,
  (state: CounterState) => state.counter
);

// Create methods to update the component state
@Injectable()
export class CounterStore extends ComponentStore<CounterState> {
  constructor() {
    super({ counter: 0 });
  }

  readonly counter$ = this.select(selectCounter);

  readonly increment = this.effect((state$: Observable<CounterState>) =>
    state$.pipe(
      tap(({ counter }) => this.setState({ counter: counter + 1 }))
    )
  );

  readonly decrement = this.effect((state$: Observable<CounterState>) =>
    state$.pipe(
      tap(({ counter }) => this.setState({ counter: counter - 1 }))
    )
  );
}

// Register the component store in the NgRx store
@NgModule({
  providers: [CounterStore],
})
export class AppModule {}

// Subscribe to the component state changes in your components
@Component({
  selector: 'app-counter',
  template: `
    <button (click)="increment()">Increment</button>
    <button (click)="decrement()">Decrement</button>
    <p>Counter: {{ counter$ | async }}</p>
  `,
})
export class CounterComponent {
  counter$ = this.store.select(selectCounter);

  constructor(private store: CounterStore) {}

  increment() {
    this.store.increment();
  }

  decrement() {
    this.store.decrement();
  }
}
```

## `@ngrx/signals`

`@ngrx/signals` is a library for managing reactive signals in Angular applications. It provides a way to manage reactive signals in a predictable way. You can use `@ngrx/signals` to manage reactive signals in your application.

To use `@ngrx/signals` in your Angular application, you need to follow these steps:

1. Define the signal state of your application using interfaces and classes.

2. Create signals to represent events in your application.

3. Create reducers to specify how the signal state changes in response to signals.

4. Create selectors to extract specific pieces of signal state from the store.

5. Register the signal reducers and selectors in the NgRx store.

6. Dispatch signals to update the signal state of your application.

7. Subscribe to the signal state changes in your components.

Here is an example of how to use `@ngrx/signals` in an Angular application:

```typescript
// Define the signal state of your application
export interface SignalState {
  signal: string;
}

// Create signals to represent events in your application
export enum SignalActionTypes {
  Signal = '[Signal] Signal',
}

export class Signal implements Action {
  readonly type = SignalActionTypes.Signal;
  constructor(public payload: string) {}
}

export type SignalActions = Signal;

// Create reducers to specify how the signal state changes in response to signals
export function signalReducer(state: SignalState, action: SignalActions): SignalState {
  switch (action.type) {
    case SignalActionTypes.Signal:
      return { ...state, signal: action.payload };
    default:
      return state;
  }
}

// Create selectors to extract specific pieces of signal state from the store
export const selectSignal = (state: SignalState) => state.signal;

// Register the signal reducers and selectors in the NgRx store
@NgModule({
  imports: [
    StoreModule.forRoot({ signal: signalReducer }),
  ],
})
export class AppModule {}

// Dispatch signals to update the signal state of your application
@Component({
  selector: 'app-signal',
  template: `
    <button (click)="signal('Hello')">Signal</button>
    <p>Signal: {{ signal$ | async }}</p>
  `,
})
export class SignalComponent {
  signal$ = this.store.pipe(select(selectSignal));

  constructor(private store: Store<SignalState>) {}

  signal(value: string) {
    this.store.dispatch(new Signal(value));
  }
}
```

## `@ngrx/operators`

`@ngrx/operators` is a set of utility functions for working with NgRx. It provides a way to work with NgRx in a more efficient way. You can use `@ngrx/operators` to work with NgRx in your application.

To use `@ngrx/operators` in your Angular application, you need to follow these steps:

1. Import the utility functions from `@ngrx/operators`.

2. Use the utility functions to work with NgRx in your application.

Here is an example of how to use `@ngrx/operators` in an Angular application:

```typescript
import { map, tap } from '@ngrx/operators';

@Injectable()
export class CounterEffects {
  @Effect()
  increment$ = this.actions$.pipe(
    ofType(CounterActionTypes.Increment),
    map(() => new Increment())
  );

  @Effect()
  decrement$ = this.actions$.pipe(
    ofType(CounterActionTypes.Decrement),
    tap(() => console.log('Decrement'))
  );

  constructor(private actions$: Actions) {}
}
```

## Usage

To use NgRx in your Angular application, you need to follow these steps:

1. Define the state of your application using interfaces and classes.

2. Create actions to represent what happened in your application.

3. Create reducers to specify how the state changes in response to actions.

4. Create selectors to extract specific pieces of state from the store.

5. Create effects to manage side effects in your application.

6. Register the reducers, effects, and selectors in the NgRx store.

7. Dispatch actions to update the state of your application.

8. Subscribe to the state changes in your components.

Here is an example of how to use NgRx in an Angular application:

```typescript
// Define the state of your application
export interface AppState {
  counter: number;
}

// Create actions to represent what happened in your application
export enum CounterActionTypes {
  Increment = '[Counter] Increment',
  Decrement = '[Counter] Decrement',
}

export class Increment implements Action {
  readonly type = CounterActionTypes.Increment;
}

export class Decrement implements Action {
  readonly type = CounterActionTypes.Decrement;
}

export type CounterActions = Increment | Decrement;

// Create reducers to specify how the state changes in response to actions
export function counterReducer(state: AppState, action: CounterActions): AppState {
  switch (action.type) {
    case CounterActionTypes.Increment:
      return { ...state, counter: state.counter + 1 };
    case CounterActionTypes.Decrement:
      return { ...state, counter: state.counter - 1 };
    default:
      return state;
  }
}

// Create selectors to extract specific pieces of state from the store
export const selectCounter = (state: AppState) => state.counter;

// Create effects to manage side effects in your application
@Injectable()
export class CounterEffects {
  @Effect()
  increment$ = this.actions$.pipe(
    ofType(CounterActionTypes.Increment),
    map(() => new Increment())
  );

  constructor(private actions$: Actions) {}
}

// Register the reducers, effects, and selectors in the NgRx store
@NgModule({
  imports: [
    StoreModule.forRoot({ counter: counterReducer }),
    EffectsModule.forRoot([CounterEffects]),
  ],
})
export class AppModule {}

// Dispatch actions to update the state of your application
@Component({
  selector: 'app-counter',
  template: `
    <button (click)="increment()">Increment</button>
    <button (click)="decrement()">Decrement</button>
    <p>Counter: {{ counter$ | async }}</p>
  `,
})
export class CounterComponent {
  counter$ = this.store.pipe(select(selectCounter));

  constructor(private store: Store<AppState>) {}

  increment() {
    this.store.dispatch(new Increment());
  }

  decrement() {
    this.store.dispatch(new Decrement());
  }
}
```

## Official Documentation

- [NgRx](https://ngrx.io/): Official website of NgRx.

## Tutorials

- [NgRx: A Clean and Clear Introduction](https://blog.angular-university.io/angular-ngrx-store-and-effects-crash-course/): A clean and clear introduction to NgRx by Angular University.

## Articles

- [NgRx: An Introduction](https://blog.angular-university.io/angular-ngrx-store-and-effects-crash-course/): An introduction to NgRx by Angular University.
- [NgRx: A Comprehensive Guide](https://blog.nrwl.io/ngrx-patterns-and-techniques-f46126e2b1e5): A comprehensive guide to NgRx by Nrwl.

## Books

- [NgRx: A Practical Guide](https://www.amazon.com/NgRx-Practical-Guide-Enterprise-Angular/dp/1484236506): A practical guide to NgRx by O'Reilly.

## Courses

- [NgRx: A Comprehensive Course](https://www.udemy.com/course/ngrx-course/): A comprehensive course on NgRx by Udemy.
- [NgRx: A Step-by-Step Tutorial](https://www.udemy.com/course/ngrx-course/): A step-by-step tutorial to NgRx by Udemy.

## Community

- [NgRx: A Community Forum](https://community.ngrx.io/): A community forum for NgRx developers.
- [NgRx: A Slack Channel](https://ngrx.slack.com/): A Slack channel for NgRx developers.

## Contributing

Contributions are welcome! Please read the [contribution guidelines](CONTRIBUTING.md) first.

## License

This repository is licensed under the [MIT license](LICENSE).
