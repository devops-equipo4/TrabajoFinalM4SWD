import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConoceTu10xcComponent } from './conoce-tu10xc.component';

describe('ConoceTu10xcComponent', () => {
  let component: ConoceTu10xcComponent;
  let fixture: ComponentFixture<ConoceTu10xcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConoceTu10xcComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConoceTu10xcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
