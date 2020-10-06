<template>
    <div class="listContainer">
        <div class="listHeader">
            <div class="listName">
                {{ listObjectProp.name }}
                <div class="cross" @click="deleteList(listObjectProp)">x</div>
            </div>
            
        </div>
        <div class="listBody">
            <div>
                <draggable
                    class=" dragArea list-group"
                    :list="listObjectProp.items"
                    :clone="clone"
                    :group="{ name: 'people', pull: pullFunction }"
                    @start="start"
                >
                    <div
                        class=" list-group-item"
                        v-for="element in listObjectProp.items"
                        :key="element.id"
                    >
                        <itemComponent @deleteItemEvent="deleteItem($event)" :itemObjectProp="element"></itemComponent>
                    </div>
                </draggable>
            </div>
        </div>
    </div>
</template>
<script>
import draggable from "vuedraggable";
import itemComponent from "../Item/itemComponentFile";
//import { bus } from '../../main';
let idGlobal = 8;
export default {
    name: "listComponent",
    props: {
        listObjectProp: Object
    },
    //order: 4,
    components: {
        draggable,
        itemComponent
    },
    data() {
        return {
            controlOnStart: true
        };
    },
    methods: {
        clone({ name, description, parentId, id }) {
            console.log(name, idGlobal, itemComponent, draggable);
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
        start({ originalEvent }) {
            this.controlOnStart = originalEvent.ctrlKey;
        },
        eventHnadler: function(element) {
            //bus.$emit('eventNotice', element);
            console.log(element);
        },
        deleteItem: function(event){
            var obj={
                listInfo : this.listObjectProp,
                itemInfo : event
            }
            console.log("this log is from listComponent || delete item havinng name and id",event.name,"&",event.id);
            this.$emit('deleteItemEvente',obj);
        },
        deleteList:function(listObject){
            console.log("delete list having name and id",listObject.name," and ",listObject.id)

        }
    }
};
</script>
<style>
.listContainer {
    height: 200px;
    width: 207px;
    border-style: solid;
    border: 4px;
    overflow: scroll;
    /*position: absolute;*/
    border-color: darkgrey;
    border-radius: 5px;
    /*background-color: white;*/
    padding: 8;
    float: left;
}
.listBody{
}
.listHeader {
    border: 2px;
    border-style: solid;
    border-radius: 2px;
    height: 20px;
    text-align: left;
    background-color: saddlebrown;
    /*border-radius: 10px;*/
}
.listName {
    /*text-align: left;*/
}
.cross{
    float: right;
    cursor: pointer;
    color:  maroon;

}
.cross.hover{
    color: red;
}
</style>
