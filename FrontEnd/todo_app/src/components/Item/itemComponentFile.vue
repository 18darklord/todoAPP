<template>
	<!--
{
		"id": 3,
		"name": "demo",
		"description": "thirdItem",
		"parentId": 1
	}
-->
	<div class="itemContainer">
		<div class="itemBody">
			{{ itemObjectProp.name }}
			
			<div @click="eventHandler" class="cross">x</div>
			<div></div>
		</div>
	</div>
</template>
<script>
export default {
	name: "itemComponent",
	props: {
		itemObjectProp: Object
	},
	data() {
		return {};
	},
	methods: {
		eventHandler: function() {
			this.$emit("deleteItemEvent", this.itemObjectProp);
		}
	}
};
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.itemContainer {
	height: 30px;
	width: 170px;
	border: 2px;
	border-style: dotted;
	border-radius: 5px;
	padding: 5px;
}
.itemHeader {
	border: 2px;
	border-style: solid;
	height: 20px;
	/*border-radius: 10px;*/
}
.itemName {
	text-align: left;
}
.widgets {
	cursor: pointer;
	position: absolute;
	/*top: 50%;
	right: 0%;
	padding: 12px 16px;*/
	transform: translate(0%, -50%);
}
.cross{
	float: right;
	color: maroon;
}
</style>
