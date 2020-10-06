<template>
	<div class="mainPageContainer">
		<div v-for="listObj in lists" :key="listObj.id">
			<listComponent
				@deleteItemEvente="deleteItemt($event)"
				:listObjectProp="listObj"
			/>
		</div>
		<!-- <button @click="finalFunc">Done</button> -->
	</div>
</template>
<script>
import listComponent from "../List/listComponentFile";
import { bus } from "../../main";

export default {
	name: "mainPageComponent",
	components: {
		listComponent
	},
	data() {
		return {
			lists: [
				{
					id: 1,
					name: "bbwjekdgekj",
					description: "list of furniture",
					items: [
						{
							id: 3,
							name: "chair",
							description: "chair to sit",
							parentId: 1
						},
						{
							id: 4,
							name: "bed",
							description: "bed to sleep",
							parentId: 1
						},
						{
							id: 5,
							name: "mattress",
							description: "bed mattress",
							parentId: 1
						}
					]
				},
				{
					id: 1,
					name: "Furniture",
					description: "list of furniture",
					items: [
						{
							id: 3,
							name: "chair",
							description: "chair to sit",
							parentId: 1
						},
						{
							id: 4,
							name: "bed",
							description: "bed to sleep",
							parentId: 1
						},
						{
							id: 5,
							name: "mattress",
							description: "bed mattress",
							parentId: 1
						}
					]
				},
				{
					id: 1,
					name: "Furniture",
					description: "list of furniture",
					items: [
						{
							id: 3,
							name: "chair",
							description: "chair to sit",
							parentId: 1
						},
						{
							id: 4,
							name: "bed",
							description: "bed to sleep",
							parentId: 1
						},
						{
							id: 5,
							name: "mattress",
							description: "bed mattress",
							parentId: 1
						}
					]
				},
				{
					id: 1,
					name: "Furniture",
					description: "list of furniture",
					items: [
						{
							id: 3,
							name: "chair",
							description: "chair to sit",
							parentId: 1
						},
						{
							id: 4,
							name: "bed",
							description: "bed to sleep",
							parentId: 1
						},
						{
							id: 5,
							name: "mattress",
							description: "bed mattress",
							parentId: 1
						}
					]
				},
				{
					id: 1,
					name: "Furniture",
					description: "list of furniture",
					items: [
						{
							id: 3,
							name: "chair",
							description: "chair to sit",
							parentId: 1
						},
						{
							id: 4,
							name: "bed",
							description: "bed to sleep",
							parentId: 1
						},
						{
							id: 5,
							name: "mattress",
							description: "bed mattress",
							parentId: 1
						}
					]
				},
				{
					id: 1,
					name: "Furniture",
					description: "list of furniture",
					items: [
						{
							id: 3,
							name: "chair",
							description: "chair to sit",
							parentId: 1
						},
						{
							id: 4,
							name: "bed",
							description: "bed to sleep",
							parentId: 1
						},
						{
							id: 5,
							name: "mattress",
							description: "bed mattress",
							parentId: 1
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				},
				{
					id: 2,
					name: "vegitable",
					description: "list of vegitable",
					items: [
						{
							id: 1,
							name: "tomato",
							description: "veg",
							parentId: 2
						}
					]
				}
			]
			//end
		};
	},
	methods: {
		finalFunc: function() {
			console.log(this.lists);
		},
		deleteItemt: function(eventData) {
			console.log("from main page comp", eventData);
			for (var listObj in this.lists) {
				if (this.lists[listObj].id == eventData.listInfo.id) {
					console.log("list found");
					for (var j in this.lists[listObj].items) {
						if (this.lists[listObj].items[j].id == eventData.itemInfo.id) {
							console.log("Item found", this.lists[listObj].items[j]);
							this.lists[listObj].items.splice(j, 1);
							break;
						}
					}
					break;
				}
			}
		},
		temp: function() {
			
		}
	},
	mounted(){
		bus.$on("addNewListEvent", function(data) {
				console.log("put list from mainpage coponent", data);
			});
	},
	
};
</script>
<style scoped>
.mainPageContainer {
	/*display: inline-flex;*/
	overflow-y: scroll;
	overflow-x: none;
	/*over*/
	position: fixed;
	background-color: khaki;
	width: 99%;
	height: 85%;
}
</style>
