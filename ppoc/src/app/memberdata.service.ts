import { Injectable } from '@angular/core';
import {Headers,Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';

import { Member } from './member';
@Injectable()
export class MemberdataService {

  private membersUrl='member';
  private headers = new Headers({'Content-Type': 'application/json'});

  constructor(private http:Http) { }

  getMembers():Promise<Member[]>{
    return this.http.get(this.membersUrl)
      .toPromise()
      .then(response => response.json() as Member[])
      .catch(this.handleError);
  }

  create(member: Member): Promise<Member>{
    return this.http
      .post("postMember",JSON.stringify(member),{headers:this.headers})
      .toPromise()
      .then(res=>res.json() as Member)
      .catch(this.handleError);
  }

  edit(member: Member): Promise<void>{
    const url=`${this.membersUrl}/${member.id}`;
    return this.http
      .post(url,JSON.stringify(member), {headers:this.headers})
      .toPromise()
      .then(()=>null)
      .catch(this.handleError);
  }
  
  delete(id: number): Promise<void>{
    const url = `${this.membersUrl}/${id}`;
    return this.http.delete(url,{headers:this.headers})
      .toPromise()
      .then(()=>null)
      .catch(this.handleError);
  }
  

  private handleError(error: any): Promise<any> {
    console.error('Error', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }

}
