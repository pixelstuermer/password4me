[![Build Status](https://travis-ci.org/pixelstuermer/password4me.svg?branch=master)](https://travis-ci.org/pixelstuermer/password4me)
[![codebeat badge](https://codebeat.co/badges/c1a0fa77-f298-4c43-b8b7-35b2009fc70d)](https://codebeat.co/projects/github-com-pixelstuermer-password4me-master)
[![codecov](https://codecov.io/gh/pixelstuermer/password4me/branch/master/graph/badge.svg)](https://codecov.io/gh/pixelstuermer/password4me)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![GitHub release](https://img.shields.io/github/release/pixelstuermer/password4me.svg)]()
[![heroku](https://img.shields.io/badge/heroku-deployed-7565C7.svg)](https://pixelstuermer-password4me.herokuapp.com/swagger-ui.html)

# password4me
Generates random passwords according to user input parameters

## SwaggerUI
The SwaggerUI for detailled API description can be found here:

    {base-url}/swagger-ui.html

## Parameters
Using the parameterized API endpoints, the following parameters can be passed:

    smallChars (boolean)
    capsChars (boolean)
    numberChars (boolean)
    specialChars (boolean)
    length (int)

## Configuration
The following config variables can be passed when launching the application, for example like this:

    admin.password=p455w0rd