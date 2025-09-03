import { ApplicationConfig, importProvidersFrom, provideExperimentalZonelessChangeDetection, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

//import { routes } from './app.routes';
// import { provideBrowserGlobalErrorListeners } from '@angular/core';
// import { provideRouter } from '@angular/router';
import { routes } from './app.routes';
import { provideStore } from '@ngrx/store';
import { counterReducer } from './counterapp1/counter.reducer';
import { HttpClientModule } from '@angular/common/http';
// import { counterReducer } from './client/client.store';


export const appConfig: ApplicationConfig = {
  // providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes)]

  providers: [
    // provideBrowserGlobalErrorListeners(),
    // provideExperimentalZonelessChangeDetection(),
    provideExperimentalZonelessChangeDetection(),
    provideRouter(routes),
     provideStore({ counter: counterReducer }),
     importProvidersFrom(HttpClientModule)


  ]

};
