import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-th',
  templateUrl: './th.component.html',
  styleUrls: ['./th.component.css']
})
export class ThComponent implements OnInit {
  news;
  constructor(private http: HttpClient) {
    this.getnews();
  }

  ngOnInit() {
  }
  getnews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=the-hindu&apiKey=a3127d2ec6d6424f854b0d52c32089a9').subscribe(data => {
      this.news = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully!');
    });
  }
}
