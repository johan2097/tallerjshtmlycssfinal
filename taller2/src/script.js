// using concepts both self-invoking function (swapThemes)
// and "closure", the program only set fruits, flag and i
// variables up once, then, when the function is invoked again
// this will return an anonymous function (lines 10 to 17)
// that can access to variables setted up above, due to its scope
const swapThemes = (function() {
    let fruits = document.getElementsByClassName('fruits');
    let flag = false;
    let i = 0;
    return () => {
        for(let e of fruits) {
            flag = !flag;
            swapColor(e, flag);
            i++;
        }
        flag = !flag;
    };
})();

const setSwapButton = () => {
    let myButton = document.getElementById('change');
    myButton.addEventListener('click', function() {
        swapThemes();
    });
};

const swapColor = (e, flag)  => {
    flag ? e.style.backgroundColor='#8cd398' : e.style.backgroundColor='#e7df93';
};

// setting up the webpage
const setPage = () => {
    setSwapButton();
    swapThemes();
};

window.onload = setPage;
