FROM ruby:bullseye

COPY . .

RUN bundle install && \
  rails db:migrate && \
  rails runner ./seed-db.rb

EXPOSE 3000/tcp

ENTRYPOINT [ "rails", "server", "-b", "0.0.0.0" ]
