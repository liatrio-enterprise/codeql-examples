from flask import Flask
from flask_restful import Api, Resource

import traceback

app = Flask(__name__)

api = Api(app)

class HelloWorld(Resource):
  
  def get(self):
    try:
      data={"data":"Hello World"}
      if (data == {"data":"Hello World"}):
        raise Exception("Sample Secure Info Leak")
      return data
    except Exception as e:
      return traceback.format_exc()

api.add_resource(HelloWorld,'/hello')

if __name__=='__main__':
  app.run(debug=False)
