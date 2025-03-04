from flask import Flask, jsonify, request , Response
app = Flask(__name__)
print(__name__)

__name__ == "__main__"

books = [
    {
        'name': 'Green Eggs and Ham',
        'price': 7.99,
        'isbn': 978039400165
    },
    {
        'name': 'The Cat In The Hat',
        'price': 6.99,
        'isbn': 9960270112
    }
]

#GET /books/ISBN_Number


#GET /books
@app.route('/books')
def get_books():
    return jsonify({'books': books})


#POST /books
#{
#	'name': 'F',
#	'price': 6.99,
#	'isbn': 0123456
#}

def validBookObject(bookObject):
    if ("name" in bookObject and "price" in bookObject and "isbn" in bookObject):
        return True
    else:
        return False


@app.route('/books', methods=['POST'])
def add_book():
    request_data = request.get_json()
    if(validBookObject(request_data)):
        new_book = {
            "name": request_data['name'],
            "price": request_data ['price'],
            "isbn" : request_data ['isbn']
        }
        books.insert(0, new_book)
        response = Response("", 201, mimetype='application/json')
        response.headers['Location']= "/books/"+str(new_book['isbn'])
        return response
    else:
        return "False"

@app.route('/books/<int:isbn>')
def get_book_by_isbn(isbn):
    return_value = {}
    for book in books:
        if book["isbn"] == isbn:
            return_value = {
                'name': book["name"],
                'price': book["price"]
            }
    return jsonify(return_value)

app.run(port=5000)
# pip install flask
#go inside .venv/Scripts/ and issue activate.bat
# python test2.py
# get method
# http://localhost:5000/books
#
# post method
# http://localhost:5000/books
#
# {
#     "isbn": "0123456",
#     "name": "F",
#     "price": 6.99
# }


