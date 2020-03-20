import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { of } from 'rxjs';
import { JhiEventManager } from 'ng-jhipster';

import { PortailCssIpresTestModule } from '../../../test.module';
import { MockEventManager } from '../../../helpers/mock-event-manager.service';
import { MockActiveModal } from '../../../helpers/mock-active-modal.service';
import { RepresentantLegalDeleteDialogComponent } from 'app/entities/representant-legal/representant-legal-delete-dialog.component';
import { RepresentantLegalService } from 'app/entities/representant-legal/representant-legal.service';

describe('Component Tests', () => {
  describe('RepresentantLegal Management Delete Component', () => {
    let comp: RepresentantLegalDeleteDialogComponent;
    let fixture: ComponentFixture<RepresentantLegalDeleteDialogComponent>;
    let service: RepresentantLegalService;
    let mockEventManager: MockEventManager;
    let mockActiveModal: MockActiveModal;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [RepresentantLegalDeleteDialogComponent]
      })
        .overrideTemplate(RepresentantLegalDeleteDialogComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(RepresentantLegalDeleteDialogComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(RepresentantLegalService);
      mockEventManager = TestBed.get(JhiEventManager);
      mockActiveModal = TestBed.get(NgbActiveModal);
    });

    describe('confirmDelete', () => {
      it('Should call delete service on confirmDelete', inject(
        [],
        fakeAsync(() => {
          // GIVEN
          spyOn(service, 'delete').and.returnValue(of({}));

          // WHEN
          comp.confirmDelete(123);
          tick();

          // THEN
          expect(service.delete).toHaveBeenCalledWith(123);
          expect(mockActiveModal.closeSpy).toHaveBeenCalled();
          expect(mockEventManager.broadcastSpy).toHaveBeenCalled();
        })
      ));

      it('Should not call delete service on clear', () => {
        // GIVEN
        spyOn(service, 'delete');

        // WHEN
        comp.cancel();

        // THEN
        expect(service.delete).not.toHaveBeenCalled();
        expect(mockActiveModal.dismissSpy).toHaveBeenCalled();
      });
    });
  });
});
