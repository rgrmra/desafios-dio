#!/bin/bash

echo "ATUALIZANDO O SERVIDOR"
apt-get update -y
apt-get upgrade -y

echo "INSTALANDO PACOTES NECESSÁRIOS"
apt-get install apache2 -y
apt-get install unzip -y

echo "BAIXANDO ARQUIVOS APLICAÇÃO"
cd /tmp
wget https://github.com/denilsonbonatti/linux-site-dio/archive/refs/heads/main.zip
unzip main.zip

echo "COPIANDO ARQUIVOS DA APLICAÇÃO"
cd linux-site-dio-main
cp -R * /var/www/html

echo "FINALIZADO!"
