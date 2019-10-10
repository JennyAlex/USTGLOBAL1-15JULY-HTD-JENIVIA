import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskserviceService {
  constructor(private http : HttpClient) {}


  taskInfo: any[]=[];

  sendData(data){
    return this.http.post('http://localhost:8085/task/add',data);

  }
  getData(){
    return this.http.get('http://localhost:8085/task/get-all').subscribe(resData =>{
      this.taskInfo= resData.tasks;
      console.log(this.taskInfo);
    },err=>{
      console.log(err);
    

    }
    )
}
updateData(data){
  return this.http.put('http://localhost:8085/task/update',data);
}
deleteData(data){
  return this.http.delete(`http://localhost:8085/task/remove/${data}`);
}

}