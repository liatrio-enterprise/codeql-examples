FROM node:14

WORKDIR /app
COPY *.json .
RUN npm install
COPY src/ .
CMD node app.js
