import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  template: `<h1>{{ helloWorld }}</h1>`,
})
export class AppComponent {
  helloWorld = 'Hello world';
}