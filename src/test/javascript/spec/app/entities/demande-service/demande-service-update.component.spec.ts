import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { of } from 'rxjs';

import { PortailCssIpresTestModule } from '../../../test.module';
import { DemandeServiceUpdateComponent } from 'app/entities/demande-service/demande-service-update.component';
import { DemandeServiceService } from 'app/entities/demande-service/demande-service.service';
import { DemandeService } from 'app/shared/model/demande-service.model';

describe('Component Tests', () => {
  describe('DemandeService Management Update Component', () => {
    let comp: DemandeServiceUpdateComponent;
    let fixture: ComponentFixture<DemandeServiceUpdateComponent>;
    let service: DemandeServiceService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [DemandeServiceUpdateComponent],
        providers: [FormBuilder]
      })
        .overrideTemplate(DemandeServiceUpdateComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(DemandeServiceUpdateComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(DemandeServiceService);
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', fakeAsync(() => {
        // GIVEN
        const entity = new DemandeService(123);
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
        const entity = new DemandeService();
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
