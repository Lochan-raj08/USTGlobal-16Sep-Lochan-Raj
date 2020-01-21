import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IgnComponent } from './ign.component';

describe('IgnComponent', () => {
  let component: IgnComponent;
  let fixture: ComponentFixture<IgnComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IgnComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IgnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
