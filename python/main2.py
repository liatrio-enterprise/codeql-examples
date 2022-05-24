from getpass import getpass
from mysql.connector import connect, Error

try:
    with connect(
        host="db",
        user="root",
        password="root",
    ) as connection:
        age = raw_input('Enter age: ') 
        create_db_query = "SELECT * FROM Student WHERE student_age = '%i';" % age"
        with connection.cursor() as cursor:
            cursor.execute(create_db_query)
except Error as e:
    print(e)
