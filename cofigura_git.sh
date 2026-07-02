#!/bin/bash
# Configuração inicial do Git/GitHub

# 1. Definir credenciais globais (Troque pelos seus dados!)
echo "Configurando suas credenciais globais no Git..."
git config --global user.name "EbonyWizard4"
git config --global user.email "antonio.jhone@hotmail.com"

# 2. Configurar a branch padrão para 'main' (Evita conflitos com o GitHub)
git config --global init.defaultBranch main

# 3. Configurar o Git para LEMBRAR do seu Token (Escolha a linha do seu sistema operacional)
echo "Configurando o gerenciador de credenciais..."
# Se for WINDOWS, descomente a linha abaixo (tire o #):
# git config --global credential.helper wincred

# Se for MAC, descomente a linha abaixo (tire o #):
# git config --global credential.helper osxkeychain

# Se for LINUX, descomente a linha abaixo (tire o #):
git config --global credential.helper store

# 4. Configurar editor de texto padrão (VS Code)
#git config --global core.editor "code --wait"


echo "Configuração concluída com sucesso!"
git config --list

