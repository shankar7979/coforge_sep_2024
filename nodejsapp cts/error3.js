try {
    console.log('this is try block')
    throw new Error('Error from try')
} catch (error) {
    console.log('this  is catch block ' + error.message);
}
finally {
    console.log('finally block')
}
