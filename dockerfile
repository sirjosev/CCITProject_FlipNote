FROM openjdk
WORKDIR /app
COPY . /app
RUN FlipList.java
CMD ["java","FlipList"]