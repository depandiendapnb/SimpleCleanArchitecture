package id.ac.polbeng.depandi.simplecleanarchitecture.data

import id.ac.polbeng.depandi.simplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}