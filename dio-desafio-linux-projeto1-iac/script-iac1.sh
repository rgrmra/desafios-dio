#!/bin/bash


echo "INÍCIO DO SCRIPT:"
echo "CRIANDO DIRETÓRIOS..."

mkdir /publico
mkdir /adm
mkdir /ven
mkdir /sec

echo "CRIANDO GRUPOS DE USUÁRIOS..."

groupadd GRP_ADM
groupadd GRP_VEN
groupadd GRP_SEC

echo "CRIANDO USUÁRIOS..."

useradd carlo -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_ADM
useradd maria -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_ADM
useradd joaos -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_ADM

useradd debora -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_VEN
useradd sebastiana -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_VEN
useradd roberto -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_VEN

useradd josefina -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_SEC
useradd amanda -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_SEC
useradd rogerio -m -s /bin/bash -p $(openssl passwd -5 Senha123) -G GRP_SEC

echo "DEFININDO PERMISSÕES DOS DIRETÓRIOSs..."

chown root:GRP_ADM /adm
chown root:GRP_VEN /ven
chown root:GRP_SEC /sec

echo "ATRIBUINDO PERMISSÕES AS PASTAS CRIADAS..."
chmod 770 /adm
chmod 770 /ven
chmod 770 /sec
chmod 777 /publico

echo "FINALIZADO!"
