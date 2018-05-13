const a: number = 100;
interface Test {
    a: number
}
let obj = {
    a
}
function rasie(x: Test) {
    x.a += 2;
}
rasie(obj);
console.log(obj);