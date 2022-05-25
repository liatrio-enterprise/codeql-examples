from flask import Flask, redirect, url_for, request, make_response, escape

app = Flask(__name__)

@app.route('/students/<id>', methods=['GET'])
def student_id(id):
   student_id = request.args.get('id', '')
   return make_response("Student id: " + escape(student_id))

# if __name__ == '__main__':
#    app.run(debug = True)
