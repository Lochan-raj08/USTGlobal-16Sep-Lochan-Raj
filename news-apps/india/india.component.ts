import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-india',
  templateUrl: './india.component.html',
  styleUrls: ['./india.component.css']
})
export class IndiaComponent implements OnInit {
  news;
  constructor(private http: HttpClient) {
    this.getNews();
  }

  ngOnInit() {
  }
  getNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=google-news-in&apiKey=a3127d2ec6d6424f854b0d52c32089a9').subscribe(data => {
      this.news = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully!');
    });
  }
}
