import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { PortailCssIpresTestModule } from '../../../test.module';
import { RepresentantLegalDetailComponent } from 'app/entities/representant-legal/representant-legal-detail.component';
import { RepresentantLegal } from 'app/shared/model/representant-legal.model';

describe('Component Tests', () => {
  describe('RepresentantLegal Management Detail Component', () => {
    let comp: RepresentantLegalDetailComponent;
    let fixture: ComponentFixture<RepresentantLegalDetailComponent>;
    const route = ({ data: of({ representantLegal: new RepresentantLegal(123) }) } as any) as ActivatedRoute;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [RepresentantLegalDetailComponent],
        providers: [{ provide: ActivatedRoute, useValue: route }]
      })
        .overrideTemplate(RepresentantLegalDetailComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(RepresentantLegalDetailComponent);
      comp = fixture.componentInstance;
    });

    describe('OnInit', () => {
      it('Should load representantLegal on init', () => {
        // WHEN
        comp.ngOnInit();

        // THEN
        expect(comp.representantLegal).toEqual(jasmine.objectContaining({ id: 123 }));
      });
    });
  });
});
