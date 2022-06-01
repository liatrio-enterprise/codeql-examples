FROM ruby:bullseye

COPY . .

RUN bundle install && \
  rails runner ./seed-db.rb

EXPOSE 3000

ENTRYPOINT [ "rails", "server" ]
