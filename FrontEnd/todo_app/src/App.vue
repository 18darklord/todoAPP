<template>
	<div >
		<headerComponent/>
		<mainPageComponent/>
	</div>
</template>
<script>
	import mainPageComponent from './components/MainPage/mainPageComponentFile'
	import headerComponent from './components/GlobalComponents/headerComponentFile'
	export default {
	name: 'App',
	components: {
	mainPageComponent,
	headerComponent
	}
	}
</script>
<style>
</style>
