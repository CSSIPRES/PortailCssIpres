import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { PortailCssIpresTestModule } from '../../../test.module';
import { EmployeurDetailComponent } from 'app/entities/employeur/employeur-detail.component';
import { Employeur } from 'app/shared/model/employeur.model';

describe('Component Tests', () => {
  describe('Employeur Management Detail Component', () => {
    let comp: EmployeurDetailComponent;
    let fixture: ComponentFixture<EmployeurDetailComponent>;
    const route = ({ data: of({ employeur: new Employeur(123) }) } as any) as ActivatedRoute;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [EmployeurDetailComponent],
        providers: [{ provide: ActivatedRoute, useValue: route }]
      })
        .overrideTemplate(EmployeurDetailComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(EmployeurDetailComponent);
      comp = fixture.componentInstance;
    });

    describe('OnInit', () => {
      it('Should load employeur on init', () => {
        // WHEN
        comp.ngOnInit();

        // THEN
        expect(comp.employeur).toEqual(jasmine.objectContaining({ id: 123 }));
      });
    });
  });
});
