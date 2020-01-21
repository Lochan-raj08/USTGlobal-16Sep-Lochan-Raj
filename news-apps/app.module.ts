import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { SuiModule } from 'ng2-semantic-ui';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CountriesComponent } from './countries/countries.component';
import { IndiaComponent } from './india/india.component';
import { UsaComponent } from './usa/usa.component';
import { GermanyComponent } from './germany/germany.component';
import { RussiaComponent } from './russia/russia.component';
import { CategoriesComponent } from './categories/categories.component';
import { BusinessComponent } from './categories/business/business.component';
import { EntertainmentComponent } from './categories/entertainment/entertainment.component';
import { GeneralComponent } from './categories/general/general.component';
import { HealthComponent } from './categories/health/health.component';
import { ScienceComponent } from './categories/science/science.component';
import { SportsComponent } from './categories/sports/sports.component';
import { TechnologyComponent } from './categories/technology/technology.component';
import { SourcesComponent } from './sources/sources.component';
import { BbcComponent } from './sources/bbc/bbc.component';
import { ToiComponent } from './sources/toi/toi.component';
import { FnComponent } from './sources/fn/fn.component';
import { EspnComponent } from './sources/espn/espn.component';
import { ThComponent } from './sources/th/th.component';
import { EngtComponent } from './sources/engt/engt.component';
import { IgnComponent } from './sources/ign/ign.component';
import { WiredComponent } from './sources/wired/wired.component';
import { SearchNewsComponent } from './search-news/search-news.component';
import { NewsComponent } from './news/news.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CountriesComponent,
    IndiaComponent,
    UsaComponent,
    GermanyComponent,
    RussiaComponent,
    CategoriesComponent,
    BusinessComponent,
    EntertainmentComponent,
    GeneralComponent,
    HealthComponent,
    ScienceComponent,
    SportsComponent,
    TechnologyComponent,
    SourcesComponent,
    BbcComponent,
    ToiComponent,
    FnComponent,
    EspnComponent,
    ThComponent,
    EngtComponent,
    IgnComponent,
    WiredComponent,
    SearchNewsComponent,
    NewsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SuiModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
