import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { of } from 'rxjs';

import { PortailCssIpresTestModule } from '../../../test.module';
import { EmployeurUpdateComponent } from 'app/entities/employeur/employeur-update.component';
import { EmployeurService } from 'app/entities/employeur/employeur.service';
import { Employeur } from 'app/shared/model/employeur.model';

describe('Component Tests', () => {
  describe('Employeur Management Update Component', () => {
    let comp: EmployeurUpdateComponent;
    let fixture: ComponentFixture<EmployeurUpdateComponent>;
    let service: EmployeurService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [EmployeurUpdateComponent],
        providers: [FormBuilder]
      })
        .overrideTemplate(EmployeurUpdateComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(EmployeurUpdateComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(EmployeurService);
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', fakeAsync(() => {
        // GIVEN
        const entity = new Employeur(123);
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
        const entity = new Employeur();
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
