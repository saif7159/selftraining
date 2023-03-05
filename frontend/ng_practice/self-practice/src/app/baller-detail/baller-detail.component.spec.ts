import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BallerDetailComponent } from './baller-detail.component';

describe('BallerDetailComponent', () => {
  let component: BallerDetailComponent;
  let fixture: ComponentFixture<BallerDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BallerDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BallerDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
