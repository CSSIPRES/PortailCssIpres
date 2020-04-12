import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IDemandeService } from 'app/shared/model/demande-service.model';

@Component({
  selector: 'jhi-demande-service-detail',
  templateUrl: './demande-service-detail.component.html'
})
export class DemandeServiceDetailComponent implements OnInit {
  demandeService: IDemandeService | null = null;

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ demandeService }) => (this.demandeService = demandeService));
  }

  previousState(): void {
    window.history.back();
  }
}
