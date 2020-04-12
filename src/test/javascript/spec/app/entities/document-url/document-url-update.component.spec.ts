import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { FormBuilder } from '@angular/forms';
import { of } from 'rxjs';

import { PortailCssIpresTestModule } from '../../../test.module';
import { DocumentUrlUpdateComponent } from 'app/entities/document-url/document-url-update.component';
import { DocumentUrlService } from 'app/entities/document-url/document-url.service';
import { DocumentUrl } from 'app/shared/model/document-url.model';

describe('Component Tests', () => {
  describe('DocumentUrl Management Update Component', () => {
    let comp: DocumentUrlUpdateComponent;
    let fixture: ComponentFixture<DocumentUrlUpdateComponent>;
    let service: DocumentUrlService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [DocumentUrlUpdateComponent],
        providers: [FormBuilder]
      })
        .overrideTemplate(DocumentUrlUpdateComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(DocumentUrlUpdateComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(DocumentUrlService);
    });

    describe('save', () => {
      it('Should call update service on save for existing entity', fakeAsync(() => {
        // GIVEN
        const entity = new DocumentUrl(123);
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
        const entity = new DocumentUrl();
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
