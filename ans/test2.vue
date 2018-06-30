<template>
<div class="wb">
    <div class="title">
    <h1>{{ msg }}</h1>
    <h2>wb</h2>
    </div>
    <div class="search">
    <!--<input  class="input" type="search" placeholder="搜索" v-model='values'/>
    <button @click="searchdata">go</button>-->
    <input type="search" placeholder="搜索" v-model='search' />
<body>
    <div class="main">
        
            <table border="1px" width="600px" align="center">           
                    <tr>
                        <td>id</td>
                        <td>name</td>
                        <td>price</td>
                        <td>category</td>
                    </tr>
                    <tr v-for="item in searchdata" v-bind:key="item.id">
                        <td>{{ item.id  }}</td>
                        <td>{{ item.name  }}</td>
                        <td>{{ item.price  }}</td>
                        <td>{{ item.category  }}</td>
                        
                    </tr>             
            </table>
            
       </div>

</body>

    </div>
    <h3>
    <router-link to="/HelloWorld">Go back</router-link></h3>
    </div>
</template>

<script src="https://unpkg.com/vue/dist/vue.js"></script>
<script src="https://unpkg.com/vue-router/dist/vue-router.js"></script>
<script src="vue.js"></script>


<script>
export default {
  name: 'test2',
  data () {
    return {
      msg: 'Welcome pageone',
      values:'',
      products: [{
                id:1,
                name: '苹果',
                price: '25',
                category: "水果",
                choose:false
            }, {
                id:2,
                name: '香蕉',
                price: '15',
                category: "水果",
                choose:false
            }, {
                id:3,
                name: '雪梨',
                price: '65',
                category: "水果",
                choose:false
            }, {
                id:4,
                name: '宝马',
                price: '2500',
                category: "汽车",
                choose:false
            }, {
                id:5,
                name: '奔驰',
                price: '10025',
                category: "汽车",
                choose:false
            }, {
                id:6,
                name: '柑橘',
                price: '15',
                category: "水果",
                choose:false
            }, {
                id:7,
                name: '奥迪',
                price: '25',
                category: "汽车",
                choose:false
            }, {
                id:8,
                name: '火龙果',
                price: '25',
                category: "工具",
                choose:false
            }],
        search:''
    }
  },
  
  computed: {
            searchdata: function() {
                var search = this.search;
                if (search) {
                    return this.products.filter(function(product) {
                        return Object.keys(product).some(function(key) {
                            return String(product[key]).toLowerCase().indexOf(search) > -1
                        })
                    })
                }
                //return this.products.choose = true;
                return this.products;
            }
  },

  /*methods:{
      search:function(){
          for(var i=0;i<this.products.length;i++){
              if(this.products[i].name.indexOf(this.values)!= -1||this.products[i].price.indexOf(this.values)!= -1||this.products[i].category.indexOf(this.values)!= -1)
              //showp.push(this.products[i])
              this.products[i].choose = true
          }
      }
  },*/
  
}

</script>