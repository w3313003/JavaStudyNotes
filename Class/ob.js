var a = 100;
var obj = {
    a: 123
};
function rasie(x) {
    x.a = 2;
}
;
rasie(obj);
console.log(obj);
