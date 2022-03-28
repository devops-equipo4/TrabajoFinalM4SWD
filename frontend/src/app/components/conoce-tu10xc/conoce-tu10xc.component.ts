import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { IDxcResponse } from '../../interfaces/IDxcResponse';
import { Calcular10xcService } from '../../services/calcular10xc.service';

@Component({
  selector: 'app-conoce-tu10xc',
  templateUrl: './conoce-tu10xc.component.html',
  styleUrls: ['./conoce-tu10xc.component.scss']
})
export class ConoceTu10xcComponent implements OnInit {
  public IsExecuted: boolean = false;
  public ResultResponse?: IDxcResponse;

  constructor(private serv: Calcular10xcService) { }

  public frmGroup: FormGroup = new FormGroup({
    sueldo: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]\d*$/)]),
    ahorro: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]\d*$/)])
  });


  ngOnInit(): void {

  }

  async onSubmit() {
    if (this.frmGroup.valid) {
      this.frmGroup.disable();

      let result: IDxcResponse = await this.serv.getConoceTu10xc(this.frmGroup.controls.sueldo.value, this.frmGroup.controls.ahorro.value);
      if (result) {
        this.IsExecuted = true;
        this.ResultResponse = result;
      } else
        alert("Error con los datos");
    }
  }

  volver_OnClick() {
    this.IsExecuted = false;
    this.frmGroup.enable();
    this.frmGroup.reset();
  }
}
