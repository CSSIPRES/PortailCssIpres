import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IRepresentantLegal } from 'app/shared/model/representant-legal.model';

@Component({
  selector: 'jhi-representant-legal-detail',
  templateUrl: './representant-legal-detail.component.html'
})
export class RepresentantLegalDetailComponent implements OnInit {
  representantLegal: IRepresentantLegal | null = null;

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ representantLegal }) => (this.representantLegal = representantLegal));
  }

  previousState(): void {
    window.history.back();
  }
}
