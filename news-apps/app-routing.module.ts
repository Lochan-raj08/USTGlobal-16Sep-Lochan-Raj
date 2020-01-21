import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
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
import { NewsComponent } from './news/news.component';
import { SearchNewsComponent } from './search-news/search-news.component';


const routes: Routes = [
  {path : 'header', component : HeaderComponent},
  {path : 'countries', component : CountriesComponent},
  {path : 'india', component : IndiaComponent},
  {path : 'usa', component : UsaComponent},
  {path : 'germany', component : GermanyComponent},
  {path : 'russia', component : RussiaComponent},
  {path : 'categories', component : CategoriesComponent},
  {path : 'business', component : BusinessComponent},
  {path : 'entertainment', component : EntertainmentComponent},
  {path : 'general', component : GeneralComponent},
  {path : 'health', component : HealthComponent},
  {path : 'science', component : ScienceComponent},
  {path : 'sports', component : SportsComponent},
  {path : 'technology', component : TechnologyComponent},
  {path : 'sources', component : SourcesComponent},
  {path : 'bbc', component : BbcComponent},
  {path : 'toi', component : ToiComponent},
  {path : 'fn', component : FnComponent},
  {path : 'espn', component : EspnComponent},
  {path : 'th', component : ThComponent},
  {path : 'engt', component : EngtComponent},
  {path : 'ign', component : IgnComponent},
  {path : 'wired', component : WiredComponent},
  {path : 'news', component : NewsComponent},
  {path : 'search-news', component : SearchNewsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
