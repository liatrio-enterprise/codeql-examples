from flask import Flask, redirect, url_for, request
app = Flask(__name__)

@app.route('/students/<id>', methods=['GET'])
def student_id(id):
   return f'student with id: ${id}'

if __name__ == '__main__':
   app.run(debug = True)
