let a: number = 100;
interface Test {
    a: number
}
let obj = {
    a: 123
}
function rasie(x: Test): void {
    x.a = 2;
};
rasie(obj);
console.log(obj);