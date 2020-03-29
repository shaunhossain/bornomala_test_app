package com.shaunhossain.bornomala

class Model {
    var bornoImage: String = ""
    var relatedImage: String= ""
    var description: String = ""

    constructor(bornoImage: String, relatedImage: String, description: String) {
        this.bornoImage = bornoImage
        this.relatedImage = relatedImage
        this.description = description
    }
}