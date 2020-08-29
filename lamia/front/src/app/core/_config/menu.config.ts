 export class MenuConfig {
	public defaults: any = {
		aside: {
			self: {},
			items: [
			//	{
				//	title: 'Dashboard',
			//		root: true,
			//		icon: 'flaticon2-architecture-and-city',
			//		page: '/dashboard',
			//		translate: 'MENU.DASHBOARD',
				//	bullet: 'dot',
			//	},
			
				{section:'Mortgage'},
				{
					title: 'Mortgage',
					root: true,
					bullet: 'dot',
					icon: 'flaticon2-user-outline-symbol',
					submenu: [
						{
							title: 'prefile',
							page: '/mortgage/prefile'
						}
						
					]
		},
				{section:'User'},
				{
					title: 'User Management',
					root: true,
					bullet: 'dot',
					icon: 'flaticon2-user-outline-symbol',
					submenu: [
						{
							title: 'Users',
							page: '/user-management/users'
						},
						{
							title: 'Roles',
							page: '/user-management/roles'
						}
					]
		},   
					]
				
			},
					};

	public get configs(): any {
		return this.defaults;
	}
}
 