import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'TrabajoFinalM4FrontEnd';
  links = [
    { name: "Inicio", url: "" },
    { name: "Conoce tu 10%", url: "conocetu10xc" }
  ]
}
