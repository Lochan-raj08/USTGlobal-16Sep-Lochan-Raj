import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-russia',
  templateUrl: './russia.component.html',
  styleUrls: ['./russia.component.css']
})
export class RussiaComponent implements OnInit {
  news;
  constructor(private http: HttpClient) {
    this.getNews();
  }

  ngOnInit() {
  }
  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=ru&apiKey=a3127d2ec6d6424f854b0d52c32089a9').subscribe(data => {
      this.news = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully!');
    });
  }
}
