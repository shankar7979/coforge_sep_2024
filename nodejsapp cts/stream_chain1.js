var fs=require('fs')
var zlib=require('zlib')

//compression
fs.createReadStream('hello.txt').pipe(zlib.createGzip()).pipe(fs.createWriteStream('hello1.txt.gz'));
console.log('compression completed');

// decompression

fs.createReadStream('hello1.txt.gz').pipe(zlib.createGzip()).pipe(fs.createWriteStream('hello_decompressed.txt','utf-8'));
console.log('decompression completed');



