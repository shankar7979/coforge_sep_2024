// function addition(a,b){
//     return a+b
// }

    addition=function(a,b){
        return a+b
    }
    ar=[1,2,32,4,5,]
    ar1=ar.map(function(a){
        return a*a
    })
    console.log(ar);
    console.log(ar1);

    ar2=ar.filter(function(a){
        return (a%2==0)
    })
    console.log(ar2);

    var res=ar.reduce(function(a,b){
        return a+b;
    })
    console.log(res);

    ar3= ar.sort(function(a,b){
       // return a-b; // sorting in ascending order
     return b-a;  // sorting in descending order
    })

   console.log('sorted array'+ar3)


    
