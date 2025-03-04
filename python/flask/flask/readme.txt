install in command prompt
pip install flask

before install pip
C:\test\python\flask1>c:\software\python-3.12.0-embed-amd64\python.exe ..\get-pip.py

The scripts pip.exe, pip3.12.exe and pip3.exe are installed in c:\software\python-3.12.0-embed-amd64\Scripts

incomplete
===
in intellij idea  add the plugin python community edition
then in setting and project module add python interpreter.
install package flask
it will create .venv  directory. go inside .venv\Scripts run activate.bat

create file test1.py
add the code

from flask import Flask
app = Flask(__name__)
@app.route("/")
def hello_world():
    return "Hello, World!"
app.run(port=8000)

rt click run test
or alt+f12 it will open terminal
run python test1.py


