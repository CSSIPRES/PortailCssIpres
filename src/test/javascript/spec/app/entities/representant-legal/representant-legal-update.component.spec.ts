import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { of } from 'rxjs';

import { PortailCssIpresTestModule } from '../../../test.module';
import { RepresentantLegalUpdateComponent } from 'app/entities/representant-legal/representant-legal-update.component';
import { RepresentantLegalService } from 'app/entities/representant-legal/representant-legal.service';
import { RepresentantLegal } from 'app/shared/model/representant-legal.model';

describe('Component Tests', () => {
  describe('RepresentantLegal Management Update Component', () => {
    let comp: RepresentantLegalUpdateComponent;
    let fixture: ComponentFixture<RepresentantLegalUpdateComponent>;
    let service: RepresentantLegalService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [RepresentantLegalUpdateComponent],
        providers: [FormBuilder]
      })
        .overrideTemplate(RepresentantLegalUpdateComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(RepresentantLegalUpdateComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(RepresentantLegalService);
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', fakeAsync(() => {
        // GIVEN
        const entity = new RepresentantLegal(123);
        spyOn(service, 'update').and.returnValue(of(new HttpResponse({ body: entity })));
        comp.updateForm(entity);
        // WHEN
        comp.save();
        tick(); // simulate async

        // THEN
        expect(service.update).toHaveBeenCalledWith(entity);
        expect(comp.isSaving).toEqual(false);
      }));

      it('Should call create service on save for new entity', fakeAsync(() => {
        // GIVEN
        const entity = new RepresentantLegal();
        spyOn(service, 'create').and.returnValue(of(new HttpResponse({ body: entity })));
        comp.updateForm(entity);
        // WHEN
        comp.save();
        tick(); // simulate async

        // THEN
        expect(service.create).toHaveBeenCalledWith(entity);
        expect(comp.isSaving).toEqual(false);
      }));
    });
  });
});
