##
# Install Chocolatey - https://chocolatey.org
##

Set-ExecutionPolicy Bypass; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))


##
# Install Maven
##

choco install -y maven


##
# Install Java Development Kit 8
##

choco install -y jdk8


