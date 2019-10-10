import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  constructor(private service : TaskserviceService,private router: Router) { }
addData(form: NgForm){
  this.service.sendData(form.value).subscribe(data=>{
    console.log(data);
    form.reset();
    this.router.navigateByUrl("/show-all");
  })
}
  
ngOnInit() {
  }

}
