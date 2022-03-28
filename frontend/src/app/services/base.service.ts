import { Inject, Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { lastValueFrom } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class BaseService {
  protected _baseUrl!: string;

  constructor(private httpClient: HttpClient, @Inject(String) endPointApiController: string) {
    this._baseUrl = `http://localhost:8084/${endPointApiController}`;
  }

  protected post<T>(urlEndPoint: string, bodyRequest: any): Promise<T> {
    let query = this.httpClient.post<T>(`${this._baseUrl}/${urlEndPoint}`, bodyRequest);
    return lastValueFrom(query);
  }

  protected get<T>(urlEndPoint: string): Promise<T> {
    console.log(`${this._baseUrl}/${urlEndPoint}`);
    let query = this.httpClient.get<T>(`${this._baseUrl}/${urlEndPoint}`);
    return lastValueFrom(query);
  }
}
