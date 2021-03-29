package id.ac.polbeng.depandi.simplecleanarchitecture.data

import id.ac.polbeng.depandi.simplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}