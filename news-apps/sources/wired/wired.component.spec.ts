import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WiredComponent } from './wired.component';

describe('WiredComponent', () => {
  let component: WiredComponent;
  let fixture: ComponentFixture<WiredComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WiredComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WiredComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
