var a = 100;
var obj = {
    a: a
};
function rasie(x) {
    x.a += 2;
}
rasie(obj);
console.log(obj);
