FROM gradle:jdk17 AS build

# 作業ディレクトリ
WORKDIR /app

# プロジェクトファイルのコピー
COPY . .

# プロジェクトのビルド
RUN ./gradlew bootJar

# 実行環境のためのイメージ
FROM openjdk:17-jdk-slim

# ビルドしたファイルを配置
COPY --from=build /app/build/libs/*.jar /var/www/html/app.jar

ENTRYPOINT [ "java", "-jar", "/var/www/html/app.jar" ]

# ポート公開
EXPOSE 8080