FROM openjdk:8u322-oraclelinux8

LABEL Author="Ismail Ahmedov <i.a.ismailov@gmail.com>"

RUN useradd -u1000 -m scc

USER scc
WORKDIR /home/scc

ENV STUBRUNNER_VERSION 3.1.1

COPY --chown=scc:scc ./target/stub-runner-${STUBRUNNER_VERSION}.jar stub-runner.jar

COPY --chown=scc:scc run.sh .

RUN chmod 0775 run.sh && chmod 0764 stub-runner.jar

RUN java -Dthin.dryrun=true -jar stub-runner.jar

ENTRYPOINT ["./run.sh"]