import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrefileComponent } from './prefile.component';

describe('PrefileComponent', () => {
  let component: PrefileComponent;
  let fixture: ComponentFixture<PrefileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrefileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrefileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
