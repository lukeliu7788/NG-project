import { TestBed, inject } from '@angular/core/testing';

import { MemberdataService } from './memberdata.service';

describe('MemberdataService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [MemberdataService]
    });
  });

  it('should be created', inject([MemberdataService], (service: MemberdataService) => {
    expect(service).toBeTruthy();
  }));
});
