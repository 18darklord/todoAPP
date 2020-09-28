<template>
    <div class="listContainer">
        <div class="listHeader">
            <div class="listName">{{ listObjectProp.name }}</div>
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
        }
    }
};
</script>
<style>
.listContainer {
    height: 200px;
    width: 200px;
    border: 4px;
    overflow: scroll;
    border-style: solid;
    border-radius: 10px;
    padding: 8px;
}
</style>
