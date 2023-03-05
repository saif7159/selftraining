import { TestBed } from '@angular/core/testing';

import { BallerServiceService } from './baller-service.service';

describe('BallerServiceService', () => {
  let service: BallerServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BallerServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
