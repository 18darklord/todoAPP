< template >
	 < !--{
	    "id"
	    : 1,
	    " name"
	    : " demo",
	    " description"
	    : " first",
	    " items"
	    : [{
	            " id"
	            : 3,
	            " name"
	            : " demo",
	            " description"
	            : " thirdItem",
	            " parentId"
	            : 1
	        }, {
	            " id"
	            : 4,
	            " name"
	            : " demo",
	            " description"
	            : " thirdItem",
	            " parentId"
	            : 1
	        }
	    ]
	},
		-- >
		< div class=" listContainer" >
			< div class=" listHeader" >
				< div class=" listName" > { {
					listObjectProp.name
					}
					}
				</ div >
				< div class=" widgets" > x </ div >
			</ div >
			< div class=" listBody" >
				< div >
					< draggable class=" dragArea list-group"
						: list=" listObjectProp.items"
						: clone=" clone"
						: group=" { name: 'people' , pull: pullFunction }"
						@ start=" start" >
						< div class=" list-group-item"
							v - for=" element in listObjectProp.items"
							: key=" element.id" >
							< itemComponent: itemObjectProp=" element" /  >
								< button @ click=" evventHandler(element)" > trigger </ button >
							</ div >
						</ draggable >
					</ div >
				</ div >
			</ div >
		</ template >
		< script >
 import draggable from " vuedraggable";
 import itemComponent from '../Item/itemComponentFile.vue';
 //import { bus } from '../../main';
 let idGlobal = 8;
 export default {
     name: 'listComponent',
     props: {
         listObjectProp: Object
     },
     order: 4,
     components: {
         draggable
     },
     data() {
         return {
             controlOnStart: true
         };
     },
     methods: {
         clone({
             name,
             description,
             parentId,
             id
         }) {
             console.log(name, idGlobal);
             return {
                 name,
                 description,
                 parentId,
                 id
             };
         },
         pullFunction() {
             return this.controlOnStart ? " clone" : true;
         },
         start({
             originalEvent
         }) {
             this.controlOnStart = originalEvent.ctrlKey;
         },
         eventHnadler: function (element) {
             //bus.$emit('eventNotice', element);
         },
     }
 };
 <  / script >
 < !--Add " scoped" attribute to limit CSS to this component only-- >
 < style scoped >
.listContainer {
    height: 200px;
    width: 20 % ;
    border: 4px;
    overflow: scroll;
    border - style: solid;
    border - radius: 10px;
}
.listHeader {
    border: 2px;
    border - style: solid;
    height: 20px;
    /*border-radius: 10px;*/
}
.listName {
    text - align: left;
}
.widgets {
    cursor: pointer;
    position: absolute;
    /*top: 50%;
    right: 0%;
    padding: 12px 16px;*/
    transform: translate(0 % , -50 % );
}
<  / style >
