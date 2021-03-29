package id.ac.polbeng.depandi.simplecleanarchitecture.di

import id.ac.polbeng.depandi.simplecleanarchitecture.data.IMessageDataSource
import id.ac.polbeng.depandi.simplecleanarchitecture.data.MessageDataSource
import id.ac.polbeng.depandi.simplecleanarchitecture.data.MessageRepository
import id.ac.polbeng.depandi.simplecleanarchitecture.domain.IMessageRepository
import id.ac.polbeng.depandi.simplecleanarchitecture.domain.MessageInteractor
import id.ac.polbeng.depandi.simplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
