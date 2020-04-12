import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';
import { JhiDataUtils } from 'ng-jhipster';

import { PortailCssIpresTestModule } from '../../../test.module';
import { DocumentUrlDetailComponent } from 'app/entities/document-url/document-url-detail.component';
import { DocumentUrl } from 'app/shared/model/document-url.model';

describe('Component Tests', () => {
  describe('DocumentUrl Management Detail Component', () => {
    let comp: DocumentUrlDetailComponent;
    let fixture: ComponentFixture<DocumentUrlDetailComponent>;
    let dataUtils: JhiDataUtils;
    const route = ({ data: of({ documentUrl: new DocumentUrl(123) }) } as any) as ActivatedRoute;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [DocumentUrlDetailComponent],
        providers: [{ provide: ActivatedRoute, useValue: route }]
      })
        .overrideTemplate(DocumentUrlDetailComponent, '')
        .compileComponents();
      fixture = TestBed.createComponent(DocumentUrlDetailComponent);
      comp = fixture.componentInstance;
      dataUtils = fixture.debugElement.injector.get(JhiDataUtils);
    });

    describe('OnInit', () => {
      it('Should load documentUrl on init', () => {
        // WHEN
        comp.ngOnInit();

        // THEN
        expect(comp.documentUrl).toEqual(jasmine.objectContaining({ id: 123 }));
      });
    });

    describe('byteSize', () => {
      it('Should call byteSize from JhiDataUtils', () => {
        // GIVEN
        spyOn(dataUtils, 'byteSize');
        const fakeBase64 = 'fake base64';

        // WHEN
        comp.byteSize(fakeBase64);

        // THEN
        expect(dataUtils.byteSize).toBeCalledWith(fakeBase64);
      });
    });

    describe('openFile', () => {
      it('Should call openFile from JhiDataUtils', () => {
        // GIVEN
        spyOn(dataUtils, 'openFile');
        const fakeContentType = 'fake content type';
        const fakeBase64 = 'fake base64';

        // WHEN
        comp.openFile(fakeContentType, fakeBase64);

        // THEN
        expect(dataUtils.openFile).toBeCalledWith(fakeContentType, fakeBase64);
      });
    });
  });
});
