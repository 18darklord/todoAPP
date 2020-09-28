<template>
	<div>
		<div v-for="listObj in lists" :key="listObj.id">
			<listComponent :listObjectProp="listObj"/>
		</div>
		<button @click="finalFunc"> Done</button>
	</div>
</template>
<script>
	import listComponent from '../List/listComponentFile.vue';
	import {
	    bus
	}
	from '../../main';
	export default {
	    name: 'mainPageComponent',
	    components: {
	        listComponent
	    },
	    data() {
	        return {
	            lists: [{
	                    "id": 1,
	                    "name": "first list",
	                    "description": "first",
	                    "items": [{
	                            "id": 3,
	                            "name": "1st 1",
	                            "description": "thirdItem",
	                            "parentId": 1
	                        }, {
	                            "id": 4,
	                            "name": "1st 2",
	                            "description": "thirdItem",
	                            "parentId": 1
	                        }
	                    ]
	                }, {
	                    "id": 2,
	                    "name": "second list",
	                    "description": "second list",
	                    "items": [{
	                            "id": 1,
	                            "name": "2nd 1",
	                            "description": "firstItem",
	                            "parentId": 2
	                        }
	                    ]
	                }
	            ]
	        }
	    },
	    methods: {
	        finalFunc: function () {
	            console.log(this.lists);
	        },
	    }
	}
</script>
<style>
</style>
