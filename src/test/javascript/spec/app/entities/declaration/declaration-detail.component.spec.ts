import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { PortailCssIpresTestModule } from '../../../test.module';
import { DeclarationDetailComponent } from 'app/entities/declaration/declaration-detail.component';
import { Declaration } from 'app/shared/model/declaration.model';

describe('Component Tests', () => {
  describe('Declaration Management Detail Component', () => {
    let comp: DeclarationDetailComponent;
    let fixture: ComponentFixture<DeclarationDetailComponent>;
    const route = ({ data: of({ declaration: new Declaration(123) }) } as any) as ActivatedRoute;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [DeclarationDetailComponent],
        providers: [{ provide: ActivatedRoute, useValue: route }]
      })
        .overrideTemplate(DeclarationDetailComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(DeclarationDetailComponent);
      comp = fixture.componentInstance;
    });

    describe('OnInit', () => {
      it('Should load declaration on init', () => {
        // WHEN
        comp.ngOnInit();

        // THEN
        expect(comp.declaration).toEqual(jasmine.objectContaining({ id: 123 }));
      });
    });
  });
});
