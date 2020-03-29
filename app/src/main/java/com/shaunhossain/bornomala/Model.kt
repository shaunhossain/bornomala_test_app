package com.shaunhossain.bornomala

class Model {
    var bornoImage: Int
    var relatedImage: Int
    var description: String = ""

    constructor(bornoImage: Int, relatedImage: Int, description: String) {
        this.bornoImage = bornoImage
        this.relatedImage = relatedImage
        this.description = description
    }
}