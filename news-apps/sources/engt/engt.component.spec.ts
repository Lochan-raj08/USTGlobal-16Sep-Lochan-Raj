import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EngtComponent } from './engt.component';

describe('EngtComponent', () => {
  let component: EngtComponent;
  let fixture: ComponentFixture<EngtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EngtComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EngtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
