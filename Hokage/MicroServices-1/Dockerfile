FROM ubuntu
LABEL maintainer="theshubhamgour"
RUN apt-get update -y && apt-get upgrade -y && \
    apt-get install -y openjdk-17-jdk openjdk-17-jre && \
    apt-get install -y tomcat9 && \
    apt-get install -y maven && \ 
    apt-get install -y git && \
    apt-get install -y vim 

WORKDIR /app
RUN git clone https://github.com/VIP-Upadhyay/dummy.git
CMD ["Done"]
