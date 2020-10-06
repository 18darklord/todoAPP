<template>
	<div class="header">
		<div class="addList" @click="addList">+</div>
		HELLO
		<br />
		<br />
		<br />
	</div>
</template>

<script>
import { bus } from "../../main";

export default {
	name: "headerComponent",

	data() {
		return {};
	},
	methods: {
		addList: function() {
			bus.$emit("addNewListEvent", true);
			this.$emit("addNewListEvent");
		}
	}
};
</script>

<style scoped>
.header {
	width: 100%;
	height: 15%;
	position: relative;
	background-color: sandybrown;
	text-decoration-color: silver;
}
.addList {
	float: right;
	color: blue;
	cursor: pointer;
}
</style>
