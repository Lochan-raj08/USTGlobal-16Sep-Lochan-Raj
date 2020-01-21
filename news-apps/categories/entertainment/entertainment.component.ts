import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-entertainment',
  templateUrl: './entertainment.component.html',
  styleUrls: ['./entertainment.component.css']
})
export class EntertainmentComponent implements OnInit {
  news;
  constructor(private http: HttpClient) {
    this.getNews();
  }

  ngOnInit() {
  }
  getNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?category=entertainment&apiKey=a3127d2ec6d6424f854b0d52c32089a9').subscribe(data => {
      this.news = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully!');
    });
  }
}
