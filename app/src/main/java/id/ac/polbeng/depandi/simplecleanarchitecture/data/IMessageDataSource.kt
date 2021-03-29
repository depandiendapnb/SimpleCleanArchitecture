package id.ac.polbeng.depandi.simplecleanarchitecture.data

import id.ac.polbeng.depandi.simplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}