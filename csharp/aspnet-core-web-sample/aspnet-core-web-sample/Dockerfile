#See https://aka.ms/containerfastmode to understand how Visual Studio uses this Dockerfile to build your images for faster debugging.

FROM mcr.microsoft.com/dotnet/aspnet:6.0 AS base
WORKDIR /app
EXPOSE 80
EXPOSE 443

FROM mcr.microsoft.com/dotnet/sdk:6.0 AS build
WORKDIR /src
COPY ["aspnet-core-web-sample/aspnet-core-web-sample.csproj", "aspnet-core-web-sample/"]
RUN dotnet restore "aspnet-core-web-sample/aspnet-core-web-sample.csproj"
COPY . .
WORKDIR "/src/aspnet-core-web-sample"
RUN dotnet build "aspnet-core-web-sample.csproj" -c Release -o /app/build

FROM build AS publish
RUN dotnet publish "aspnet-core-web-sample.csproj" -c Release -o /app/publish

FROM base AS final
WORKDIR /app
COPY --from=publish /app/publish .
ENTRYPOINT ["dotnet", "aspnet-core-web-sample.dll"]