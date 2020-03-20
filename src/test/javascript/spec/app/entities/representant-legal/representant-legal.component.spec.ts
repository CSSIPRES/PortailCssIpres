import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';
import { ActivatedRoute, Data } from '@angular/router';

import { PortailCssIpresTestModule } from '../../../test.module';
import { RepresentantLegalComponent } from 'app/entities/representant-legal/representant-legal.component';
import { RepresentantLegalService } from 'app/entities/representant-legal/representant-legal.service';
import { RepresentantLegal } from 'app/shared/model/representant-legal.model';

describe('Component Tests', () => {
  describe('RepresentantLegal Management Component', () => {
    let comp: RepresentantLegalComponent;
    let fixture: ComponentFixture<RepresentantLegalComponent>;
    let service: RepresentantLegalService;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [PortailCssIpresTestModule],
        declarations: [RepresentantLegalComponent],
        providers: [
          {
            provide: ActivatedRoute,
            useValue: {
              data: {
                subscribe: (fn: (value: Data) => void) =>
                  fn({
                    pagingParams: {
                      predicate: 'id',
                      reverse: false,
                      page: 0
                    }
                  })
              }
            }
          }
        ]
      })
        .overrideTemplate(RepresentantLegalComponent, '')
        .compileComponents();

      fixture = TestBed.createComponent(RepresentantLegalComponent);
      comp = fixture.componentInstance;
      service = fixture.debugElement.injector.get(RepresentantLegalService);
    });

    it('Should call load all on init', () => {
      // GIVEN
      const headers = new HttpHeaders().append('link', 'link;link');
      spyOn(service, 'query').and.returnValue(
        of(
          new HttpResponse({
            body: [new RepresentantLegal(123)],
            headers
          })
        )
      );

      // WHEN
      comp.ngOnInit();

      // THEN
      expect(service.query).toHaveBeenCalled();
      expect(comp.representantLegals && comp.representantLegals[0]).toEqual(jasmine.objectContaining({ id: 123 }));
    });

    it('should load a page', () => {
      // GIVEN
      const headers = new HttpHeaders().append('link', 'link;link');
      spyOn(service, 'query').and.returnValue(
        of(
          new HttpResponse({
            body: [new RepresentantLegal(123)],
            headers
          })
        )
      );

      // WHEN
      comp.loadPage(1);

      // THEN
      expect(service.query).toHaveBeenCalled();
      expect(comp.representantLegals && comp.representantLegals[0]).toEqual(jasmine.objectContaining({ id: 123 }));
    });

    it('should calculate the sort attribute for an id', () => {
      // WHEN
      comp.ngOnInit();
      const result = comp.sort();

      // THEN
      expect(result).toEqual(['id,desc']);
    });

    it('should calculate the sort attribute for a non-id attribute', () => {
      // INIT
      comp.ngOnInit();

      // GIVEN
      comp.predicate = 'name';

      // WHEN
      const result = comp.sort();

      // THEN
      expect(result).toEqual(['name,desc', 'id']);
    });
  });
});
