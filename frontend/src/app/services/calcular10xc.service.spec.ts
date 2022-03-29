import { TestBed } from '@angular/core/testing';

import { Calcular10xcService } from './calcular10xc.service';

describe('Calcular10xcService', () => {
  let service: Calcular10xcService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Calcular10xcService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
