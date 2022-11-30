FROM node:18.12.1 as node
WORKDIR /app
COPY . .
RUN npm install 
RUN npm run build --prod

FROM nginx:alpine
COPY ./conf/default.conf /etc/nginx/conf.d/default.conf
RUN rm -rf /usr/share/nginx/html/*
COPY --from=node /app/dist/angularpractice /usr/share/ngnix/html

EXPOSE 80