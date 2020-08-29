// Angular
import { Injectable } from '@angular/core';
// RxJS
import { Subject, Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class MenuConfigService {
	url='http://localhost:8080/sections';
	// Public properties
	onConfigUpdated$: Subject<any>;
	// Private properties
	private menuConfig: any;

	/**
	 * Service Constructor
	 */
	constructor(private http:HttpClient) {
		// register on config changed event and set default config
		this.onConfigUpdated$ = new Subject();
	}
	getallSections(){
		return this.http.get<any>(this.url);
	  }
	/**
	 * Returns the menuConfig
	 */
	getMenus() {
		return this.menuConfig;
	}

	/**
	 * Load config
	 *
	 * @param config: any
	 */
	loadConfigs(config: any) {
		this.menuConfig = config;
		this.onConfigUpdated$.next(this.menuConfig);
	}
}
