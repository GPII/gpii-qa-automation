##
# Install Chocolatey - https://chocolatey.org
##

Set-ExecutionPolicy Bypass; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))

##
# Install Screen Resolution
##

choco install -y change-screen-resolution

##
# Install Maven
##

choco install -y maven


##
# Install Java Development Kit 8
##

choco install -y jdk8

##
# Set the default browser Google Chrome
##

choco install -y SetDefaultBrowser
SetDefaultBrowser HKLM "Google Chrome"



