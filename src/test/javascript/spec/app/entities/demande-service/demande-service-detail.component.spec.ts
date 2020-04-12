import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { PortailCssIpresTestModule } from '../../../test.module';
import { DemandeServiceDetailComponent } from 'app/entities/demande-service/demande-service-detail.component';
import { DemandeService } from 'app/shared/model/demande-service.model';

describe('Component Tests', () => {
  describe('DemandeService Management Detail Component', () => {
    let comp: DemandeServiceDetailComponent;
    let fixture: ComponentFixture<DemandeServiceDetailComponent>;
    const route = ({ data: of({ demandeService: new DemandeService(123) }) } as any) as ActivatedRoute;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [DemandeServiceDetailComponent],
        providers: [{ provide: ActivatedRoute, useValue: route }]
      })
        .overrideTemplate(DemandeServiceDetailComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(DemandeServiceDetailComponent);
      comp = fixture.componentInstance;
    });

    describe('OnInit', () => {
      it('Should load demandeService on init', () => {
        // WHEN
        comp.ngOnInit();

        // THEN
        expect(comp.demandeService).toEqual(jasmine.objectContaining({ id: 123 }));
      });
    });
  });
});
