FROM ruby:bullseye

COPY . .

RUN bundle install && \
  rails db:migrate && \
  rails runner db/seeds.rb

EXPOSE 3000/tcp

ENTRYPOINT [ "rails", "server", "-b", "0.0.0.0" ]
