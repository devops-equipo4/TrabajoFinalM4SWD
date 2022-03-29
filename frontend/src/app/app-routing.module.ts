import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ConoceTu10xcComponent } from './components/conoce-tu10xc/conoce-tu10xc.component';

const routes: Routes = [
  { path: '', component: HomeComponent, data: { title: 'Inicio' } },
  { path: 'conocetu10xc', component: ConoceTu10xcComponent, data: { title: 'Conoce tu 10%' } },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
