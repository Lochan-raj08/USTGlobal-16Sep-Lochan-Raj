import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  entertainmentNews;
  topNews;
  sportsNews;
  constructor(private http: HttpClient) {
    this.getEntertainmentNews();
    this.getTopNews();
    this.getSportsNews();
  }

  ngOnInit() {
  }
  getEntertainmentNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=a3127d2ec6d6424f854b0d52c32089a9').subscribe(data => {
      this.entertainmentNews = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('entertainment news got successfully!');
    });
  }
  getTopNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=a3127d2ec6d6424f854b0d52c32089a9').subscribe(data => {
      this.topNews = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('top news got successfully!');
    });
  }
  getSportsNews() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=a3127d2ec6d6424f854b0d52c32089a9').subscribe(data => {
      this.sportsNews = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('sports news got successfully!');
    });
  }
}
