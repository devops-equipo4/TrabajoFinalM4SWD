import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IDxcResponse } from '../interfaces/IDxcResponse';
import { BaseService } from './base.service';

@Injectable({ providedIn: 'root' })
export class Calcular10xcService extends BaseService {

  constructor(hc: HttpClient) {
    super(hc, "rest/msdxc");
  }

  getConoceTu10xc(sueldo: number, ahorro: number): Promise<IDxcResponse> {
    return this.get(`dxc?sueldo=${sueldo}&ahorro=${ahorro}`);
  }
}
