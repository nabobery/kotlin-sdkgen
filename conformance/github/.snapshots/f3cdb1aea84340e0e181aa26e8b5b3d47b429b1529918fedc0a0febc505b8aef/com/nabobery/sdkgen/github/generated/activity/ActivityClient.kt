package com.nabobery.sdkgen.github.generated.activity

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.Feed
import com.nabobery.sdkgen.github.generated.InlineDirectionParameterX3053723f
import com.nabobery.sdkgen.github.generated.InlineNotificationsPutRequestJsonX2f65c918
import com.nabobery.sdkgen.github.generated.InlineNotificationsPutResponse202JsonXa88389e9
import com.nabobery.sdkgen.github.generated.InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004
import com.nabobery.sdkgen.github.generated.InlineReposNotificationsPutRequestJsonXd4535e9b
import com.nabobery.sdkgen.github.generated.InlineReposNotificationsPutResponse202JsonXf31aa216
import com.nabobery.sdkgen.github.generated.InlineReposStargazersGetResponse200JsonX232efc77
import com.nabobery.sdkgen.github.generated.InlineReposSubscriptionPutRequestJsonX1f5cf85f
import com.nabobery.sdkgen.github.generated.InlineSortStarredParameterX5e5fb92b
import com.nabobery.sdkgen.github.generated.InlineUsersStarredGetResponse200JsonX5b3296a9
import com.nabobery.sdkgen.github.generated.MinimalRepository
import com.nabobery.sdkgen.github.generated.Repository
import com.nabobery.sdkgen.github.generated.RepositorySubscription
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.SimpleUser
import com.nabobery.sdkgen.github.generated.StarredRepository
import com.nabobery.sdkgen.github.generated.Thread
import com.nabobery.sdkgen.github.generated.ThreadSubscription
import com.nabobery.sdkgen.github.generated.ValidationError
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable

internal object ActivityCodecs {
  private val activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/check-repo-is-starred-by-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative2Codec)

  private val activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/check-repo-is-starred-by-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative3Codec)

  private val activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/check-repo-is-starred-by-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative4Codec)

  internal val activityCheckRepoIsStarredByAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val activityCheckRepoIsStarredByAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val activityDeleteRepoSubscriptionRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityDeleteRepoSubscriptionResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val activityDeleteThreadSubscriptionResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/delete-thread-subscription.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityDeleteThreadSubscriptionResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityDeleteThreadSubscriptionResponseCodecAlternative2Codec)

  private val activityDeleteThreadSubscriptionResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/delete-thread-subscription.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityDeleteThreadSubscriptionResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityDeleteThreadSubscriptionResponseCodecAlternative3Codec)

  internal val activityDeleteThreadSubscriptionRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityDeleteThreadSubscriptionResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val ACTIVITYGETFEEDS_RESPONSE_CODEC_ID: String = "activity/get-feeds.response"

  private val activityGetFeedsResponseCodec: MediaTypeCodec<Feed> =
      KotlinxSerializationCodec(ACTIVITYGETFEEDS_RESPONSE_CODEC_ID, Feed.Serializer, SdkJson)

  private val activityGetFeedsResponseCodecAlternative0Codec: MediaTypeCodec<Feed> =
      KotlinxSerializationCodec("activity/get-feeds.response.alternative0", Feed.Serializer, SdkJson)

  internal val activityGetFeedsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Feed> =
      MediaTypeCodecRegistry.of(activityGetFeedsResponseCodecAlternative0Codec)

  internal val activityGetFeedsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityGetFeedsResponseCodecRegistry: MediaTypeCodecRegistry<Feed> =
      MediaTypeCodecRegistry.of(activityGetFeedsResponseCodec)

  internal const val ACTIVITYGETREPOSUBSCRIPTION_RESPONSE_CODEC_ID: String =
      "activity/get-repo-subscription.response"

  private val activityGetRepoSubscriptionResponseCodec: MediaTypeCodec<RepositorySubscription> =
      KotlinxSerializationCodec(ACTIVITYGETREPOSUBSCRIPTION_RESPONSE_CODEC_ID, RepositorySubscription.Serializer, SdkJson)

  private val activityGetRepoSubscriptionResponseCodecAlternative0Codec:
      MediaTypeCodec<RepositorySubscription> =
      KotlinxSerializationCodec("activity/get-repo-subscription.response.alternative0", RepositorySubscription.Serializer, SdkJson)

  internal val activityGetRepoSubscriptionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RepositorySubscription> =
      MediaTypeCodecRegistry.of(activityGetRepoSubscriptionResponseCodecAlternative0Codec)

  private val activityGetRepoSubscriptionResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("activity/get-repo-subscription.response.alternative1", BasicError.Serializer, SdkJson)

  internal val activityGetRepoSubscriptionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityGetRepoSubscriptionResponseCodecAlternative1Codec)

  internal val activityGetRepoSubscriptionRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityGetRepoSubscriptionResponseCodecRegistry:
      MediaTypeCodecRegistry<RepositorySubscription> =
      MediaTypeCodecRegistry.of(activityGetRepoSubscriptionResponseCodec)

  internal const val ACTIVITYGETTHREAD_RESPONSE_CODEC_ID: String = "activity/get-thread.response"

  private val activityGetThreadResponseCodec: MediaTypeCodec<Thread> =
      KotlinxSerializationCodec(ACTIVITYGETTHREAD_RESPONSE_CODEC_ID, Thread.Serializer, SdkJson)

  private val activityGetThreadResponseCodecAlternative0Codec: MediaTypeCodec<Thread> =
      KotlinxSerializationCodec("activity/get-thread.response.alternative0", Thread.Serializer, SdkJson)

  internal val activityGetThreadResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Thread> =
      MediaTypeCodecRegistry.of(activityGetThreadResponseCodecAlternative0Codec)

  private val activityGetThreadResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/get-thread.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityGetThreadResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityGetThreadResponseCodecAlternative2Codec)

  private val activityGetThreadResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/get-thread.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityGetThreadResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityGetThreadResponseCodecAlternative3Codec)

  internal val activityGetThreadRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityGetThreadResponseCodecRegistry: MediaTypeCodecRegistry<Thread> =
      MediaTypeCodecRegistry.of(activityGetThreadResponseCodec)

  internal const val ACTIVITYGETTHREADSUBSCRIPTIONFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "activity/get-thread-subscription-for-authenticated-user.response"

  private val activityGetThreadSubscriptionForAuthenticatedUserResponseCodec:
      MediaTypeCodec<ThreadSubscription> =
      KotlinxSerializationCodec(ACTIVITYGETTHREADSUBSCRIPTIONFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ThreadSubscription.Serializer, SdkJson)

  private val activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<ThreadSubscription> =
      KotlinxSerializationCodec("activity/get-thread-subscription-for-authenticated-user.response.alternative0", ThreadSubscription.Serializer, SdkJson)

  internal val activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ThreadSubscription> =
      MediaTypeCodecRegistry.of(activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative0Codec)

  private val activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/get-thread-subscription-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative2Codec)

  private val activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/get-thread-subscription-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative3Codec)

  internal val activityGetThreadSubscriptionForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val activityGetThreadSubscriptionForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<ThreadSubscription> =
      MediaTypeCodecRegistry.of(activityGetThreadSubscriptionForAuthenticatedUserResponseCodec)

  internal const val ACTIVITYLISTNOTIFICATIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "activity/list-notifications-for-authenticated-user.response"

  private val activityListNotificationsForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<Thread>> =
      KotlinxSerializationCodec(ACTIVITYLISTNOTIFICATIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(Thread.Serializer), SdkJson)

  private val activityListNotificationsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Thread>> =
      KotlinxSerializationCodec("activity/list-notifications-for-authenticated-user.response.alternative0", ListSerializer(Thread.Serializer), SdkJson)

  internal val activityListNotificationsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Thread>> =
      MediaTypeCodecRegistry.of(activityListNotificationsForAuthenticatedUserResponseCodecAlternative0Codec)

  private val activityListNotificationsForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/list-notifications-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityListNotificationsForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityListNotificationsForAuthenticatedUserResponseCodecAlternative2Codec)

  private val activityListNotificationsForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/list-notifications-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityListNotificationsForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityListNotificationsForAuthenticatedUserResponseCodecAlternative3Codec)

  private val activityListNotificationsForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("activity/list-notifications-for-authenticated-user.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val activityListNotificationsForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(activityListNotificationsForAuthenticatedUserResponseCodecAlternative4Codec)

  internal val activityListNotificationsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val activityListNotificationsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Thread>> =
      MediaTypeCodecRegistry.of(activityListNotificationsForAuthenticatedUserResponseCodec)

  internal const val ACTIVITYLISTREPONOTIFICATIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "activity/list-repo-notifications-for-authenticated-user.response"

  private val activityListRepoNotificationsForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<Thread>> =
      KotlinxSerializationCodec(ACTIVITYLISTREPONOTIFICATIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(Thread.Serializer), SdkJson)

  private val activityListRepoNotificationsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Thread>> =
      KotlinxSerializationCodec("activity/list-repo-notifications-for-authenticated-user.response.alternative0", ListSerializer(Thread.Serializer), SdkJson)

  internal val activityListRepoNotificationsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Thread>> =
      MediaTypeCodecRegistry.of(activityListRepoNotificationsForAuthenticatedUserResponseCodecAlternative0Codec)

  internal val activityListRepoNotificationsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val activityListRepoNotificationsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Thread>> =
      MediaTypeCodecRegistry.of(activityListRepoNotificationsForAuthenticatedUserResponseCodec)

  private val activityListReposStarredByAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Repository>> =
      KotlinxSerializationCodec("activity/list-repos-starred-by-authenticated-user.response.alternative0", ListSerializer(Repository.Serializer), SdkJson)

  internal val activityListReposStarredByAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Repository>> =
      MediaTypeCodecRegistry.of(activityListReposStarredByAuthenticatedUserResponseCodecAlternative0Codec)

  private val activityListReposStarredByAuthenticatedUserResponseCodecAlternative1Codec:
      MediaTypeCodec<List<StarredRepository>> =
      KotlinxSerializationCodec("activity/list-repos-starred-by-authenticated-user.response.alternative1", ListSerializer(StarredRepository.Serializer), SdkJson)

  internal val activityListReposStarredByAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<List<StarredRepository>> =
      MediaTypeCodecRegistry.of(activityListReposStarredByAuthenticatedUserResponseCodecAlternative1Codec)

  private val activityListReposStarredByAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/list-repos-starred-by-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityListReposStarredByAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityListReposStarredByAuthenticatedUserResponseCodecAlternative3Codec)

  private val activityListReposStarredByAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/list-repos-starred-by-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val activityListReposStarredByAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityListReposStarredByAuthenticatedUserResponseCodecAlternative4Codec)

  internal val activityListReposStarredByAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val ACTIVITYLISTREPOSSTARREDBYUSER_RESPONSE_CODEC_ID: String =
      "activity/list-repos-starred-by-user.response"

  private val activityListReposStarredByUserResponseCodec:
      MediaTypeCodec<InlineUsersStarredGetResponse200JsonX5b3296a9> =
      KotlinxSerializationCodec(ACTIVITYLISTREPOSSTARREDBYUSER_RESPONSE_CODEC_ID, InlineUsersStarredGetResponse200JsonX5b3296a9.Serializer, SdkJson)

  private val activityListReposStarredByUserResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUsersStarredGetResponse200JsonX5b3296a9> =
      KotlinxSerializationCodec("activity/list-repos-starred-by-user.response.alternative0", InlineUsersStarredGetResponse200JsonX5b3296a9.Serializer, SdkJson)

  internal val activityListReposStarredByUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUsersStarredGetResponse200JsonX5b3296a9> =
      MediaTypeCodecRegistry.of(activityListReposStarredByUserResponseCodecAlternative0Codec)

  internal val activityListReposStarredByUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityListReposStarredByUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersStarredGetResponse200JsonX5b3296a9> =
      MediaTypeCodecRegistry.of(activityListReposStarredByUserResponseCodec)

  internal const val ACTIVITYLISTREPOSWATCHEDBYUSER_RESPONSE_CODEC_ID: String =
      "activity/list-repos-watched-by-user.response"

  private val activityListReposWatchedByUserResponseCodec: MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec(ACTIVITYLISTREPOSWATCHEDBYUSER_RESPONSE_CODEC_ID, ListSerializer(MinimalRepository.Serializer), SdkJson)

  private val activityListReposWatchedByUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec("activity/list-repos-watched-by-user.response.alternative0", ListSerializer(MinimalRepository.Serializer), SdkJson)

  internal val activityListReposWatchedByUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(activityListReposWatchedByUserResponseCodecAlternative0Codec)

  internal val activityListReposWatchedByUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityListReposWatchedByUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(activityListReposWatchedByUserResponseCodec)

  internal const val ACTIVITYLISTSTARGAZERSFORREPO_RESPONSE_CODEC_ID: String =
      "activity/list-stargazers-for-repo.response"

  private val activityListStargazersForRepoResponseCodec:
      MediaTypeCodec<InlineReposStargazersGetResponse200JsonX232efc77> =
      KotlinxSerializationCodec(ACTIVITYLISTSTARGAZERSFORREPO_RESPONSE_CODEC_ID, InlineReposStargazersGetResponse200JsonX232efc77.Serializer, SdkJson)

  private val activityListStargazersForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposStargazersGetResponse200JsonX232efc77> =
      KotlinxSerializationCodec("activity/list-stargazers-for-repo.response.alternative0", InlineReposStargazersGetResponse200JsonX232efc77.Serializer, SdkJson)

  internal val activityListStargazersForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposStargazersGetResponse200JsonX232efc77> =
      MediaTypeCodecRegistry.of(activityListStargazersForRepoResponseCodecAlternative0Codec)

  private val activityListStargazersForRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("activity/list-stargazers-for-repo.response.alternative1", ValidationError.Serializer, SdkJson)

  internal val activityListStargazersForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(activityListStargazersForRepoResponseCodecAlternative1Codec)

  internal val activityListStargazersForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityListStargazersForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposStargazersGetResponse200JsonX232efc77> =
      MediaTypeCodecRegistry.of(activityListStargazersForRepoResponseCodec)

  internal const val ACTIVITYLISTWATCHEDREPOSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "activity/list-watched-repos-for-authenticated-user.response"

  private val activityListWatchedReposForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec(ACTIVITYLISTWATCHEDREPOSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(MinimalRepository.Serializer), SdkJson)

  private val activityListWatchedReposForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec("activity/list-watched-repos-for-authenticated-user.response.alternative0", ListSerializer(MinimalRepository.Serializer), SdkJson)

  internal val activityListWatchedReposForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(activityListWatchedReposForAuthenticatedUserResponseCodecAlternative0Codec)

  private val activityListWatchedReposForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/list-watched-repos-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityListWatchedReposForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityListWatchedReposForAuthenticatedUserResponseCodecAlternative2Codec)

  private val activityListWatchedReposForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/list-watched-repos-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityListWatchedReposForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityListWatchedReposForAuthenticatedUserResponseCodecAlternative3Codec)

  internal val activityListWatchedReposForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val activityListWatchedReposForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(activityListWatchedReposForAuthenticatedUserResponseCodec)

  internal const val ACTIVITYLISTWATCHERSFORREPO_RESPONSE_CODEC_ID: String =
      "activity/list-watchers-for-repo.response"

  private val activityListWatchersForRepoResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(ACTIVITYLISTWATCHERSFORREPO_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val activityListWatchersForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("activity/list-watchers-for-repo.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  internal val activityListWatchersForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(activityListWatchersForRepoResponseCodecAlternative0Codec)

  internal val activityListWatchersForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityListWatchersForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(activityListWatchersForRepoResponseCodec)

  internal const val ACTIVITYMARKNOTIFICATIONSASREAD_REQUEST_CODEC_ID: String =
      "activity/mark-notifications-as-read.request"

  private val activityMarkNotificationsAsReadRequestCodec:
      MediaTypeCodec<InlineNotificationsPutRequestJsonX2f65c918?> =
      KotlinxSerializationCodec(ACTIVITYMARKNOTIFICATIONSASREAD_REQUEST_CODEC_ID, InlineNotificationsPutRequestJsonX2f65c918.Serializer.nullable, SdkJson)

  private val activityMarkNotificationsAsReadResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineNotificationsPutResponse202JsonXa88389e9> =
      KotlinxSerializationCodec("activity/mark-notifications-as-read.response.alternative0", InlineNotificationsPutResponse202JsonXa88389e9.Serializer, SdkJson)

  internal val activityMarkNotificationsAsReadResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineNotificationsPutResponse202JsonXa88389e9> =
      MediaTypeCodecRegistry.of(activityMarkNotificationsAsReadResponseCodecAlternative0Codec)

  private val activityMarkNotificationsAsReadResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/mark-notifications-as-read.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityMarkNotificationsAsReadResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityMarkNotificationsAsReadResponseCodecAlternative3Codec)

  private val activityMarkNotificationsAsReadResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/mark-notifications-as-read.response.alternative4", BasicError.Serializer, SdkJson)

  internal val activityMarkNotificationsAsReadResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityMarkNotificationsAsReadResponseCodecAlternative4Codec)

  internal val activityMarkNotificationsAsReadRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineNotificationsPutRequestJsonX2f65c918?> =
      MediaTypeCodecRegistry.of(activityMarkNotificationsAsReadRequestCodec)

  internal const val ACTIVITYMARKREPONOTIFICATIONSASREAD_REQUEST_CODEC_ID: String =
      "activity/mark-repo-notifications-as-read.request"

  private val activityMarkRepoNotificationsAsReadRequestCodec:
      MediaTypeCodec<InlineReposNotificationsPutRequestJsonXd4535e9b?> =
      KotlinxSerializationCodec(ACTIVITYMARKREPONOTIFICATIONSASREAD_REQUEST_CODEC_ID, InlineReposNotificationsPutRequestJsonXd4535e9b.Serializer.nullable, SdkJson)

  private val activityMarkRepoNotificationsAsReadResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposNotificationsPutResponse202JsonXf31aa216> =
      KotlinxSerializationCodec("activity/mark-repo-notifications-as-read.response.alternative0", InlineReposNotificationsPutResponse202JsonXf31aa216.Serializer, SdkJson)

  internal val activityMarkRepoNotificationsAsReadResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposNotificationsPutResponse202JsonXf31aa216> =
      MediaTypeCodecRegistry.of(activityMarkRepoNotificationsAsReadResponseCodecAlternative0Codec)

  internal val activityMarkRepoNotificationsAsReadRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposNotificationsPutRequestJsonXd4535e9b?> =
      MediaTypeCodecRegistry.of(activityMarkRepoNotificationsAsReadRequestCodec)

  internal val activityMarkThreadAsDoneRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityMarkThreadAsDoneResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val activityMarkThreadAsReadResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/mark-thread-as-read.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityMarkThreadAsReadResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityMarkThreadAsReadResponseCodecAlternative2Codec)

  internal val activityMarkThreadAsReadRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val activityMarkThreadAsReadResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val ACTIVITYSETREPOSUBSCRIPTION_REQUEST_CODEC_ID: String =
      "activity/set-repo-subscription.request"

  private val activitySetRepoSubscriptionRequestCodec:
      MediaTypeCodec<InlineReposSubscriptionPutRequestJsonX1f5cf85f?> =
      KotlinxSerializationCodec(ACTIVITYSETREPOSUBSCRIPTION_REQUEST_CODEC_ID, InlineReposSubscriptionPutRequestJsonX1f5cf85f.Serializer.nullable, SdkJson)

  internal const val ACTIVITYSETREPOSUBSCRIPTION_RESPONSE_CODEC_ID: String =
      "activity/set-repo-subscription.response"

  private val activitySetRepoSubscriptionResponseCodec: MediaTypeCodec<RepositorySubscription> =
      KotlinxSerializationCodec(ACTIVITYSETREPOSUBSCRIPTION_RESPONSE_CODEC_ID, RepositorySubscription.Serializer, SdkJson)

  private val activitySetRepoSubscriptionResponseCodecAlternative0Codec:
      MediaTypeCodec<RepositorySubscription> =
      KotlinxSerializationCodec("activity/set-repo-subscription.response.alternative0", RepositorySubscription.Serializer, SdkJson)

  internal val activitySetRepoSubscriptionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RepositorySubscription> =
      MediaTypeCodecRegistry.of(activitySetRepoSubscriptionResponseCodecAlternative0Codec)

  internal val activitySetRepoSubscriptionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposSubscriptionPutRequestJsonX1f5cf85f?> =
      MediaTypeCodecRegistry.of(activitySetRepoSubscriptionRequestCodec)

  internal val activitySetRepoSubscriptionResponseCodecRegistry:
      MediaTypeCodecRegistry<RepositorySubscription> =
      MediaTypeCodecRegistry.of(activitySetRepoSubscriptionResponseCodec)

  internal const val ACTIVITYSETTHREADSUBSCRIPTION_REQUEST_CODEC_ID: String =
      "activity/set-thread-subscription.request"

  private val activitySetThreadSubscriptionRequestCodec:
      MediaTypeCodec<InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004?> =
      KotlinxSerializationCodec(ACTIVITYSETTHREADSUBSCRIPTION_REQUEST_CODEC_ID, InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004.Serializer.nullable, SdkJson)

  internal const val ACTIVITYSETTHREADSUBSCRIPTION_RESPONSE_CODEC_ID: String =
      "activity/set-thread-subscription.response"

  private val activitySetThreadSubscriptionResponseCodec: MediaTypeCodec<ThreadSubscription> =
      KotlinxSerializationCodec(ACTIVITYSETTHREADSUBSCRIPTION_RESPONSE_CODEC_ID, ThreadSubscription.Serializer, SdkJson)

  private val activitySetThreadSubscriptionResponseCodecAlternative0Codec:
      MediaTypeCodec<ThreadSubscription> =
      KotlinxSerializationCodec("activity/set-thread-subscription.response.alternative0", ThreadSubscription.Serializer, SdkJson)

  internal val activitySetThreadSubscriptionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ThreadSubscription> =
      MediaTypeCodecRegistry.of(activitySetThreadSubscriptionResponseCodecAlternative0Codec)

  private val activitySetThreadSubscriptionResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/set-thread-subscription.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activitySetThreadSubscriptionResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activitySetThreadSubscriptionResponseCodecAlternative2Codec)

  private val activitySetThreadSubscriptionResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/set-thread-subscription.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activitySetThreadSubscriptionResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activitySetThreadSubscriptionResponseCodecAlternative3Codec)

  internal val activitySetThreadSubscriptionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004?> =
      MediaTypeCodecRegistry.of(activitySetThreadSubscriptionRequestCodec)

  internal val activitySetThreadSubscriptionResponseCodecRegistry:
      MediaTypeCodecRegistry<ThreadSubscription> =
      MediaTypeCodecRegistry.of(activitySetThreadSubscriptionResponseCodec)

  private val activityStarRepoForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/star-repo-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityStarRepoForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityStarRepoForAuthenticatedUserResponseCodecAlternative2Codec)

  private val activityStarRepoForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/star-repo-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityStarRepoForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityStarRepoForAuthenticatedUserResponseCodecAlternative3Codec)

  private val activityStarRepoForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/star-repo-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val activityStarRepoForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityStarRepoForAuthenticatedUserResponseCodecAlternative4Codec)

  internal val activityStarRepoForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val activityStarRepoForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val activityUnstarRepoForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/unstar-repo-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val activityUnstarRepoForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityUnstarRepoForAuthenticatedUserResponseCodecAlternative2Codec)

  private val activityUnstarRepoForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/unstar-repo-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val activityUnstarRepoForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityUnstarRepoForAuthenticatedUserResponseCodecAlternative3Codec)

  private val activityUnstarRepoForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("activity/unstar-repo-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val activityUnstarRepoForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(activityUnstarRepoForAuthenticatedUserResponseCodecAlternative4Codec)

  internal val activityUnstarRepoForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val activityUnstarRepoForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'activity' group of GitHub v3 REST API.
 */
public class ActivityClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ActivityClient.authentication)

  /**
   * Whether the authenticated user has starred the repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws ActivityCheckRepoIsStarredByAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded ActivityCheckRepoIsStarredByAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityCheckRepoIsStarredByAuthenticatedUser(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, ActivityCheckRepoIsStarredByAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(activityCheckRepoIsStarredByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ActivityCodecs.activityCheckRepoIsStarredByAuthenticatedUserRequestCodecRegistry,
    responseDecoder = ActivityCheckRepoIsStarredByAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http304NoContent -> response.unit
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http304NoContent -> ActivityCheckRepoIsStarredByAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http401Json -> ActivityCheckRepoIsStarredByAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http403Json -> ActivityCheckRepoIsStarredByAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http404Json -> ActivityCheckRepoIsStarredByAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Whether the authenticated user has starred the repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun activityCheckRepoIsStarredByAuthenticatedUserWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityCheckRepoIsStarredByAuthenticatedUserResponse> = executor.executeWithResponse<Unit, ActivityCheckRepoIsStarredByAuthenticatedUserResponse>(SdkExecutionRequest(activityCheckRepoIsStarredByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ActivityCodecs.activityCheckRepoIsStarredByAuthenticatedUserRequestCodecRegistry, ActivityCheckRepoIsStarredByAuthenticatedUserResponseDecoder, options)

  /**
   * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive
   * notifications from a repository, [set the repository's subscription
   * manually](https://docs.github.com/rest/activity/watching#set-a-repository-subscription).
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityDeleteRepoSubscription(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(activityDeleteRepoSubscriptionMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ActivityCodecs.activityDeleteRepoSubscriptionRequestCodecRegistry, options)

  /**
   * This endpoint should only be used to stop watching a repository. To control whether or not you wish to receive
   * notifications from a repository, [set the repository's subscription
   * manually](https://docs.github.com/rest/activity/watching#set-a-repository-subscription).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun activityDeleteRepoSubscriptionWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityDeleteRepoSubscriptionResponse> = executor.executeWithResponse<Unit, ActivityDeleteRepoSubscriptionResponse>(SdkExecutionRequest(activityDeleteRepoSubscriptionMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ActivityCodecs.activityDeleteRepoSubscriptionRequestCodecRegistry, ActivityDeleteRepoSubscriptionResponseDecoder, options)

  /**
   * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you
   * are watching the repository of the thread, you will still receive notifications. To ignore future notifications for
   * a repository you are watching, use the [Set a thread
   * subscription](https://docs.github.com/rest/activity/notifications#set-a-thread-subscription) endpoint and set
   * `ignore` to `true`.
   *
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   * @return No response body.
   * @throws ActivityDeleteThreadSubscriptionApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ActivityDeleteThreadSubscriptionError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityDeleteThreadSubscription(threadId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, ActivityDeleteThreadSubscriptionResponse, Unit>(
    request = SdkExecutionRequest(activityDeleteThreadSubscriptionMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
    }),
    requestCodecs = ActivityCodecs.activityDeleteThreadSubscriptionRequestCodecRegistry,
    responseDecoder = ActivityDeleteThreadSubscriptionResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityDeleteThreadSubscriptionResponse.SuccessNoContent -> response.unit
        is ActivityDeleteThreadSubscriptionResponse.Http304NoContent -> response.unit
        is ActivityDeleteThreadSubscriptionResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityDeleteThreadSubscriptionResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityDeleteThreadSubscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityDeleteThreadSubscriptionResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is ActivityDeleteThreadSubscriptionResponse.Http304NoContent -> ActivityDeleteThreadSubscriptionApiException(response, statusCode, headers)
        is ActivityDeleteThreadSubscriptionResponse.Http401Json -> ActivityDeleteThreadSubscriptionApiException(response, statusCode, headers)
        is ActivityDeleteThreadSubscriptionResponse.Http403Json -> ActivityDeleteThreadSubscriptionApiException(response, statusCode, headers)
        is ActivityDeleteThreadSubscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Mutes all future notifications for a conversation until you comment on the thread or get an **@mention**. If you
   * are watching the repository of the thread, you will still receive notifications. To ignore future notifications for
   * a repository you are watching, use the [Set a thread
   * subscription](https://docs.github.com/rest/activity/notifications#set-a-thread-subscription) endpoint and set
   * `ignore` to `true`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   */
  public suspend fun activityDeleteThreadSubscriptionWithResponse(threadId: Int, options: CallOptions = CallOptions()): SdkResponseResult<ActivityDeleteThreadSubscriptionResponse> = executor.executeWithResponse<Unit, ActivityDeleteThreadSubscriptionResponse>(SdkExecutionRequest(activityDeleteThreadSubscriptionMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
  }), ActivityCodecs.activityDeleteThreadSubscriptionRequestCodecRegistry, ActivityDeleteThreadSubscriptionResponseDecoder, options)

  /**
   * Lists the feeds available to the authenticated user. The response provides a URL for each feed. You can then get a
   * specific feed by sending a request to one of the feed URLs.
   *
   * *   **Timeline**: The GitHub global public timeline
   * *   **User**: The public timeline for any user, using `uri_template`. For more information, see
   * "[Hypermedia](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#hypermedia)."
   * *   **Current user public**: The public timeline for the authenticated user
   * *   **Current user**: The private timeline for the authenticated user
   * *   **Current user actor**: The private timeline for activity created by the authenticated user
   * *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member
   * of.
   * *   **Security advisories**: A collection of public announcements that provide information about security-related
   * vulnerabilities in software on GitHub.
   *
   * By default, timeline resources are returned in JSON. You can specify the `application/atom+xml` type in the
   * `Accept` header to return timeline resources in Atom format. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * > [!NOTE]
   * > Private feeds are only returned when [authenticating via Basic
   * Auth](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authentication) since
   * current feed URIs use the older, non revocable auth tokens.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityGetFeeds(options: CallOptions = CallOptions()): Feed = executor.execute<Unit, Feed>(SdkExecutionRequest(activityGetFeedsMetadata, baseUri, Unit, emptyList(), emptyList()), listOf(ActivityCodecs.ACTIVITYGETFEEDS_RESPONSE_CODEC_ID), ActivityCodecs.activityGetFeedsRequestCodecRegistry, ActivityCodecs.activityGetFeedsResponseCodecRegistry, options)

  /**
   * Lists the feeds available to the authenticated user. The response provides a URL for each feed. You can then get a
   * specific feed by sending a request to one of the feed URLs.
   *
   * *   **Timeline**: The GitHub global public timeline
   * *   **User**: The public timeline for any user, using `uri_template`. For more information, see
   * "[Hypermedia](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#hypermedia)."
   * *   **Current user public**: The public timeline for the authenticated user
   * *   **Current user**: The private timeline for the authenticated user
   * *   **Current user actor**: The private timeline for activity created by the authenticated user
   * *   **Current user organizations**: The private timeline for the organizations the authenticated user is a member
   * of.
   * *   **Security advisories**: A collection of public announcements that provide information about security-related
   * vulnerabilities in software on GitHub.
   *
   * By default, timeline resources are returned in JSON. You can specify the `application/atom+xml` type in the
   * `Accept` header to return timeline resources in Atom format. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * > [!NOTE]
   * > Private feeds are only returned when [authenticating via Basic
   * Auth](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authentication) since
   * current feed URIs use the older, non revocable auth tokens.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun activityGetFeedsWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<ActivityGetFeedsResponse> = executor.executeWithResponse<Unit, ActivityGetFeedsResponse>(SdkExecutionRequest(activityGetFeedsMetadata, baseUri, Unit, emptyList(), emptyList()), ActivityCodecs.activityGetFeedsRequestCodecRegistry, ActivityGetFeedsResponseDecoder, options)

  /**
   * Gets information about whether the authenticated user is subscribed to the repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ActivityGetRepoSubscriptionApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ActivityGetRepoSubscriptionError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityGetRepoSubscription(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): RepositorySubscription = executor.executeWithTypedErrors<Unit, ActivityGetRepoSubscriptionResponse, RepositorySubscription>(
    request = SdkExecutionRequest(activityGetRepoSubscriptionMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ActivityCodecs.activityGetRepoSubscriptionRequestCodecRegistry,
    responseDecoder = ActivityGetRepoSubscriptionResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityGetRepoSubscriptionResponse.SuccessJson -> response.json
        is ActivityGetRepoSubscriptionResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityGetRepoSubscriptionResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ActivityGetRepoSubscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityGetRepoSubscriptionResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ActivityGetRepoSubscriptionResponse.Http403Json -> ActivityGetRepoSubscriptionApiException(response, statusCode, headers)
        is ActivityGetRepoSubscriptionResponse.Http404NoContent -> ActivityGetRepoSubscriptionApiException(response, statusCode, headers)
        is ActivityGetRepoSubscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets information about whether the authenticated user is subscribed to the repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun activityGetRepoSubscriptionWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityGetRepoSubscriptionResponse> = executor.executeWithResponse<Unit, ActivityGetRepoSubscriptionResponse>(SdkExecutionRequest(activityGetRepoSubscriptionMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ActivityCodecs.activityGetRepoSubscriptionRequestCodecRegistry, ActivityGetRepoSubscriptionResponseDecoder, options)

  /**
   * Gets information about a notification thread.
   *
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ActivityGetThreadApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ActivityGetThreadError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityGetThread(threadId: Int, options: CallOptions = CallOptions()): Thread = executor.executeWithTypedErrors<Unit, ActivityGetThreadResponse, Thread>(
    request = SdkExecutionRequest(activityGetThreadMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
    }),
    requestCodecs = ActivityCodecs.activityGetThreadRequestCodecRegistry,
    responseDecoder = ActivityGetThreadResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityGetThreadResponse.SuccessJson -> response.json
        is ActivityGetThreadResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ActivityGetThreadResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityGetThreadResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityGetThreadResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityGetThreadResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ActivityGetThreadResponse.Http304NoContent -> ActivityGetThreadApiException(response, statusCode, headers)
        is ActivityGetThreadResponse.Http401Json -> ActivityGetThreadApiException(response, statusCode, headers)
        is ActivityGetThreadResponse.Http403Json -> ActivityGetThreadApiException(response, statusCode, headers)
        is ActivityGetThreadResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets information about a notification thread.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   */
  public suspend fun activityGetThreadWithResponse(threadId: Int, options: CallOptions = CallOptions()): SdkResponseResult<ActivityGetThreadResponse> = executor.executeWithResponse<Unit, ActivityGetThreadResponse>(SdkExecutionRequest(activityGetThreadMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
  }), ActivityCodecs.activityGetThreadRequestCodecRegistry, ActivityGetThreadResponseDecoder, options)

  /**
   * This checks to see if the current user is subscribed to a thread. You can also [get a repository
   * subscription](https://docs.github.com/rest/activity/watching#get-a-repository-subscription).
   *
   * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've
   * replied to the thread, were **@mentioned**, or manually subscribe to a thread.
   *
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ActivityGetThreadSubscriptionForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * ActivityGetThreadSubscriptionForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityGetThreadSubscriptionForAuthenticatedUser(threadId: Int, options: CallOptions = CallOptions()): ThreadSubscription = executor.executeWithTypedErrors<Unit, ActivityGetThreadSubscriptionForAuthenticatedUserResponse, ThreadSubscription>(
    request = SdkExecutionRequest(activityGetThreadSubscriptionForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
    }),
    requestCodecs = ActivityCodecs.activityGetThreadSubscriptionForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = ActivityGetThreadSubscriptionForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.SuccessJson -> response.json
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http304NoContent -> ActivityGetThreadSubscriptionForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http401Json -> ActivityGetThreadSubscriptionForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http403Json -> ActivityGetThreadSubscriptionForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * This checks to see if the current user is subscribed to a thread. You can also [get a repository
   * subscription](https://docs.github.com/rest/activity/watching#get-a-repository-subscription).
   *
   * Note that subscriptions are only generated if a user is participating in a conversation--for example, they've
   * replied to the thread, were **@mentioned**, or manually subscribe to a thread.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   */
  public suspend fun activityGetThreadSubscriptionForAuthenticatedUserWithResponse(threadId: Int, options: CallOptions = CallOptions()): SdkResponseResult<ActivityGetThreadSubscriptionForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, ActivityGetThreadSubscriptionForAuthenticatedUserResponse>(SdkExecutionRequest(activityGetThreadSubscriptionForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
  }), ActivityCodecs.activityGetThreadSubscriptionForAuthenticatedUserRequestCodecRegistry, ActivityGetThreadSubscriptionForAuthenticatedUserResponseDecoder, options)

  /**
   * List all notifications for the current user, sorted by most recently updated.
   *
   * @param all If `true`, show notifications marked as read.
   * @param before Only show notifications updated before the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param participating If `true`, only shows notifications in which the user is directly participating or mentioned.
   * @param perPage The number of results per page (max 50). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ActivityListNotificationsForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded ActivityListNotificationsForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityListNotificationsForAuthenticatedUser(
    all: Boolean? = null,
    before: String? = null,
    page: Int? = null,
    participating: Boolean? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): List<Thread> = executor.executeWithTypedErrors<Unit, ActivityListNotificationsForAuthenticatedUserResponse, List<Thread>>(
    request = SdkExecutionRequest(activityListNotificationsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "all", values = all?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "participating", values = participating?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ActivityCodecs.activityListNotificationsForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = ActivityListNotificationsForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityListNotificationsForAuthenticatedUserResponse.SuccessJson -> response.json
        is ActivityListNotificationsForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ActivityListNotificationsForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityListNotificationsForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityListNotificationsForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityListNotificationsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityListNotificationsForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ActivityListNotificationsForAuthenticatedUserResponse.Http304NoContent -> ActivityListNotificationsForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityListNotificationsForAuthenticatedUserResponse.Http401Json -> ActivityListNotificationsForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityListNotificationsForAuthenticatedUserResponse.Http403Json -> ActivityListNotificationsForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityListNotificationsForAuthenticatedUserResponse.Http422Json -> ActivityListNotificationsForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityListNotificationsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all notifications for the current user, sorted by most recently updated.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param all If `true`, show notifications marked as read.
   * @param before Only show notifications updated before the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param participating If `true`, only shows notifications in which the user is directly participating or mentioned.
   * @param perPage The number of results per page (max 50). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   */
  public suspend fun activityListNotificationsForAuthenticatedUserWithResponse(
    all: Boolean? = null,
    before: String? = null,
    page: Int? = null,
    participating: Boolean? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityListNotificationsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, ActivityListNotificationsForAuthenticatedUserResponse>(SdkExecutionRequest(activityListNotificationsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "all", values = all?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "participating", values = participating?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), ActivityCodecs.activityListNotificationsForAuthenticatedUserRequestCodecRegistry, ActivityListNotificationsForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all notifications for the current user in the specified repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param all If `true`, show notifications marked as read.
   * @param before Only show notifications updated before the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param participating If `true`, only shows notifications in which the user is directly participating or mentioned.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityListRepoNotificationsForAuthenticatedUser(
    owner: String,
    repo: String,
    all: Boolean? = null,
    before: String? = null,
    page: Int? = null,
    participating: Boolean? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): List<Thread> = executor.execute<Unit, List<Thread>>(SdkExecutionRequest(activityListRepoNotificationsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "all", values = all?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "participating", values = participating?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ActivityCodecs.ACTIVITYLISTREPONOTIFICATIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID), ActivityCodecs.activityListRepoNotificationsForAuthenticatedUserRequestCodecRegistry, ActivityCodecs.activityListRepoNotificationsForAuthenticatedUserResponseCodecRegistry, options)

  /**
   * Lists all notifications for the current user in the specified repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param all If `true`, show notifications marked as read.
   * @param before Only show notifications updated before the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param participating If `true`, only shows notifications in which the user is directly participating or mentioned.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   */
  public suspend fun activityListRepoNotificationsForAuthenticatedUserWithResponse(
    owner: String,
    repo: String,
    all: Boolean? = null,
    before: String? = null,
    page: Int? = null,
    participating: Boolean? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityListRepoNotificationsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, ActivityListRepoNotificationsForAuthenticatedUserResponse>(SdkExecutionRequest(activityListRepoNotificationsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "all", values = all?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "participating", values = participating?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), ActivityCodecs.activityListRepoNotificationsForAuthenticatedUserRequestCodecRegistry, ActivityListRepoNotificationsForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists repositories the authenticated user has starred.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.star+json`**: Includes a timestamp of when the star was created.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by. `created` means when the repository was starred. `updated` means
   * when the repository was last pushed to.
   * @param options Execution options.
   */
  public suspend fun activityListReposStarredByAuthenticatedUserWithResponse(
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineSortStarredParameterX5e5fb92b? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityListReposStarredByAuthenticatedUserResponse> = executor.executeWithResponse<Unit, ActivityListReposStarredByAuthenticatedUserResponse>(SdkExecutionRequest(activityListReposStarredByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), ActivityCodecs.activityListReposStarredByAuthenticatedUserRequestCodecRegistry, ActivityListReposStarredByAuthenticatedUserResponseDecoder, options)

  /**
   * Lists repositories a user has starred.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.star+json`**: Includes a timestamp of when the star was created.
   *
   * @param username The handle for the GitHub user account.
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by. `created` means when the repository was starred. `updated` means
   * when the repository was last pushed to.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityListReposStarredByUser(
    username: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineSortStarredParameterX5e5fb92b? = null,
    options: CallOptions = CallOptions(),
  ): InlineUsersStarredGetResponse200JsonX5b3296a9 = executor.execute<Unit, InlineUsersStarredGetResponse200JsonX5b3296a9>(SdkExecutionRequest(activityListReposStarredByUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ActivityCodecs.ACTIVITYLISTREPOSSTARREDBYUSER_RESPONSE_CODEC_ID), ActivityCodecs.activityListReposStarredByUserRequestCodecRegistry, ActivityCodecs.activityListReposStarredByUserResponseCodecRegistry, options)

  /**
   * Lists repositories a user has starred.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.star+json`**: Includes a timestamp of when the star was created.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by. `created` means when the repository was starred. `updated` means
   * when the repository was last pushed to.
   * @param options Execution options.
   */
  public suspend fun activityListReposStarredByUserWithResponse(
    username: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineSortStarredParameterX5e5fb92b? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityListReposStarredByUserResponse> = executor.executeWithResponse<Unit, ActivityListReposStarredByUserResponse>(SdkExecutionRequest(activityListReposStarredByUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), ActivityCodecs.activityListReposStarredByUserRequestCodecRegistry, ActivityListReposStarredByUserResponseDecoder, options)

  /**
   * Lists repositories a user is watching.
   *
   * @param username The handle for the GitHub user account.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityListReposWatchedByUser(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<MinimalRepository> = executor.execute<Unit, List<MinimalRepository>>(SdkExecutionRequest(activityListReposWatchedByUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ActivityCodecs.ACTIVITYLISTREPOSWATCHEDBYUSER_RESPONSE_CODEC_ID), ActivityCodecs.activityListReposWatchedByUserRequestCodecRegistry, ActivityCodecs.activityListReposWatchedByUserResponseCodecRegistry, options)

  /**
   * Lists repositories a user is watching.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun activityListReposWatchedByUserWithResponse(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityListReposWatchedByUserResponse> = executor.executeWithResponse<Unit, ActivityListReposWatchedByUserResponse>(SdkExecutionRequest(activityListReposWatchedByUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ActivityCodecs.activityListReposWatchedByUserRequestCodecRegistry, ActivityListReposWatchedByUserResponseDecoder, options)

  /**
   * Lists the people that have starred the repository.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.star+json`**: Includes a timestamp of when the star was created.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ActivityListStargazersForRepoApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ActivityListStargazersForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityListStargazersForRepo(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposStargazersGetResponse200JsonX232efc77 = executor.executeWithTypedErrors<Unit, ActivityListStargazersForRepoResponse, InlineReposStargazersGetResponse200JsonX232efc77>(
    request = SdkExecutionRequest(activityListStargazersForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ActivityCodecs.activityListStargazersForRepoRequestCodecRegistry,
    responseDecoder = ActivityListStargazersForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityListStargazersForRepoResponse.SuccessJson -> response.json
        is ActivityListStargazersForRepoResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityListStargazersForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityListStargazersForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ActivityListStargazersForRepoResponse.Http422Json -> ActivityListStargazersForRepoApiException(response, statusCode, headers)
        is ActivityListStargazersForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the people that have starred the repository.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.star+json`**: Includes a timestamp of when the star was created.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun activityListStargazersForRepoWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityListStargazersForRepoResponse> = executor.executeWithResponse<Unit, ActivityListStargazersForRepoResponse>(SdkExecutionRequest(activityListStargazersForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ActivityCodecs.activityListStargazersForRepoRequestCodecRegistry, ActivityListStargazersForRepoResponseDecoder, options)

  /**
   * Lists repositories the authenticated user is watching.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ActivityListWatchedReposForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded ActivityListWatchedReposForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityListWatchedReposForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<MinimalRepository> = executor.executeWithTypedErrors<Unit, ActivityListWatchedReposForAuthenticatedUserResponse, List<MinimalRepository>>(
    request = SdkExecutionRequest(activityListWatchedReposForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ActivityCodecs.activityListWatchedReposForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = ActivityListWatchedReposForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityListWatchedReposForAuthenticatedUserResponse.SuccessJson -> response.json
        is ActivityListWatchedReposForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ActivityListWatchedReposForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityListWatchedReposForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityListWatchedReposForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityListWatchedReposForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ActivityListWatchedReposForAuthenticatedUserResponse.Http304NoContent -> ActivityListWatchedReposForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityListWatchedReposForAuthenticatedUserResponse.Http401Json -> ActivityListWatchedReposForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityListWatchedReposForAuthenticatedUserResponse.Http403Json -> ActivityListWatchedReposForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityListWatchedReposForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists repositories the authenticated user is watching.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun activityListWatchedReposForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityListWatchedReposForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, ActivityListWatchedReposForAuthenticatedUserResponse>(SdkExecutionRequest(activityListWatchedReposForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ActivityCodecs.activityListWatchedReposForAuthenticatedUserRequestCodecRegistry, ActivityListWatchedReposForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the people watching the specified repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityListWatchersForRepo(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.execute<Unit, List<SimpleUser>>(SdkExecutionRequest(activityListWatchersForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ActivityCodecs.ACTIVITYLISTWATCHERSFORREPO_RESPONSE_CODEC_ID), ActivityCodecs.activityListWatchersForRepoRequestCodecRegistry, ActivityCodecs.activityListWatchersForRepoResponseCodecRegistry, options)

  /**
   * Lists the people watching the specified repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun activityListWatchersForRepoWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityListWatchersForRepoResponse> = executor.executeWithResponse<Unit, ActivityListWatchersForRepoResponse>(SdkExecutionRequest(activityListWatchersForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ActivityCodecs.activityListWatchersForRepoRequestCodecRegistry, ActivityListWatchersForRepoResponseDecoder, options)

  /**
   * Marks all notifications as "read" for the current user. If the number of notifications is too large to complete in
   * one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to mark
   * notifications as "read." To check whether any "unread" notifications remain, you can use the [List notifications
   * for the authenticated
   * user](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user) endpoint
   * and pass the query parameter `all=false`.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun activityMarkNotificationsAsReadWithResponse(request: InlineNotificationsPutRequestJsonX2f65c918? = null, options: CallOptions = CallOptions()): SdkResponseResult<ActivityMarkNotificationsAsReadResponse> = executor.executeWithResponse<InlineNotificationsPutRequestJsonX2f65c918?, ActivityMarkNotificationsAsReadResponse>(SdkExecutionRequest(activityMarkNotificationsAsReadMetadata, baseUri, request, listOf(ActivityCodecs.ACTIVITYMARKNOTIFICATIONSASREAD_REQUEST_CODEC_ID), emptyList()), ActivityCodecs.activityMarkNotificationsAsReadRequestCodecRegistry, ActivityMarkNotificationsAsReadResponseDecoder, options)

  /**
   * Marks all notifications in a repository as "read" for the current user. If the number of notifications is too large
   * to complete in one request, you will receive a `202 Accepted` status and GitHub will run an asynchronous process to
   * mark notifications as "read." To check whether any "unread" notifications remain, you can use the [List repository
   * notifications for the authenticated
   * user](https://docs.github.com/rest/activity/notifications#list-repository-notifications-for-the-authenticated-user)
   * endpoint and pass the query parameter `all=false`.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun activityMarkRepoNotificationsAsReadWithResponse(
    request: InlineReposNotificationsPutRequestJsonXd4535e9b? = null,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityMarkRepoNotificationsAsReadResponse> = executor.executeWithResponse<InlineReposNotificationsPutRequestJsonXd4535e9b?, ActivityMarkRepoNotificationsAsReadResponse>(SdkExecutionRequest(activityMarkRepoNotificationsAsReadMetadata, baseUri, request, listOf(ActivityCodecs.ACTIVITYMARKREPONOTIFICATIONSASREAD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ActivityCodecs.activityMarkRepoNotificationsAsReadRequestCodecRegistry, ActivityMarkRepoNotificationsAsReadResponseDecoder, options)

  /**
   * Marks a thread as "done." Marking a thread as "done" is equivalent to marking a notification in your notification
   * inbox on GitHub as done: https://github.com/notifications.
   *
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityMarkThreadAsDone(threadId: Int, options: CallOptions = CallOptions()): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(activityMarkThreadAsDoneMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
  }), ActivityCodecs.activityMarkThreadAsDoneRequestCodecRegistry, options)

  /**
   * Marks a thread as "done." Marking a thread as "done" is equivalent to marking a notification in your notification
   * inbox on GitHub as done: https://github.com/notifications.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   */
  public suspend fun activityMarkThreadAsDoneWithResponse(threadId: Int, options: CallOptions = CallOptions()): SdkResponseResult<ActivityMarkThreadAsDoneResponse> = executor.executeWithResponse<Unit, ActivityMarkThreadAsDoneResponse>(SdkExecutionRequest(activityMarkThreadAsDoneMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
  }), ActivityCodecs.activityMarkThreadAsDoneRequestCodecRegistry, ActivityMarkThreadAsDoneResponseDecoder, options)

  /**
   * Marks a thread as "read." Marking a thread as "read" is equivalent to clicking a notification in your notification
   * inbox on GitHub: https://github.com/notifications.
   *
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   * @return No response body.
   * @throws ActivityMarkThreadAsReadApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ActivityMarkThreadAsReadError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityMarkThreadAsRead(threadId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, ActivityMarkThreadAsReadResponse, Unit>(
    request = SdkExecutionRequest(activityMarkThreadAsReadMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
    }),
    requestCodecs = ActivityCodecs.activityMarkThreadAsReadRequestCodecRegistry,
    responseDecoder = ActivityMarkThreadAsReadResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityMarkThreadAsReadResponse.SuccessNoContent -> response.unit
        is ActivityMarkThreadAsReadResponse.Http304NoContent -> response.unit
        is ActivityMarkThreadAsReadResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityMarkThreadAsReadResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityMarkThreadAsReadResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is ActivityMarkThreadAsReadResponse.Http304NoContent -> ActivityMarkThreadAsReadApiException(response, statusCode, headers)
        is ActivityMarkThreadAsReadResponse.Http403Json -> ActivityMarkThreadAsReadApiException(response, statusCode, headers)
        is ActivityMarkThreadAsReadResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Marks a thread as "read." Marking a thread as "read" is equivalent to clicking a notification in your notification
   * inbox on GitHub: https://github.com/notifications.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   */
  public suspend fun activityMarkThreadAsReadWithResponse(threadId: Int, options: CallOptions = CallOptions()): SdkResponseResult<ActivityMarkThreadAsReadResponse> = executor.executeWithResponse<Unit, ActivityMarkThreadAsReadResponse>(SdkExecutionRequest(activityMarkThreadAsReadMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
  }), ActivityCodecs.activityMarkThreadAsReadRequestCodecRegistry, ActivityMarkThreadAsReadResponseDecoder, options)

  /**
   * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made
   * within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the
   * repository's subscription](https://docs.github.com/rest/activity/watching#delete-a-repository-subscription)
   * completely.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activitySetRepoSubscription(
    request: InlineReposSubscriptionPutRequestJsonX1f5cf85f? = null,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): RepositorySubscription = executor.execute<InlineReposSubscriptionPutRequestJsonX1f5cf85f?, RepositorySubscription>(SdkExecutionRequest(activitySetRepoSubscriptionMetadata, baseUri, request, listOf(ActivityCodecs.ACTIVITYSETREPOSUBSCRIPTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(ActivityCodecs.ACTIVITYSETREPOSUBSCRIPTION_RESPONSE_CODEC_ID), ActivityCodecs.activitySetRepoSubscriptionRequestCodecRegistry, ActivityCodecs.activitySetRepoSubscriptionResponseCodecRegistry, options)

  /**
   * If you would like to watch a repository, set `subscribed` to `true`. If you would like to ignore notifications made
   * within a repository, set `ignored` to `true`. If you would like to stop watching a repository, [delete the
   * repository's subscription](https://docs.github.com/rest/activity/watching#delete-a-repository-subscription)
   * completely.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun activitySetRepoSubscriptionWithResponse(
    request: InlineReposSubscriptionPutRequestJsonX1f5cf85f? = null,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivitySetRepoSubscriptionResponse> = executor.executeWithResponse<InlineReposSubscriptionPutRequestJsonX1f5cf85f?, ActivitySetRepoSubscriptionResponse>(SdkExecutionRequest(activitySetRepoSubscriptionMetadata, baseUri, request, listOf(ActivityCodecs.ACTIVITYSETREPOSUBSCRIPTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ActivityCodecs.activitySetRepoSubscriptionRequestCodecRegistry, ActivitySetRepoSubscriptionResponseDecoder, options)

  /**
   * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore
   * future notifications for threads until you comment on the thread or get an **@mention**.
   *
   * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to
   * subscribed to threads that you have previously ignored.
   *
   * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the
   * [Delete a thread subscription](https://docs.github.com/rest/activity/notifications#delete-a-thread-subscription)
   * endpoint.
   *
   * @param request Request body sent to the operation.
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ActivitySetThreadSubscriptionApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ActivitySetThreadSubscriptionError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activitySetThreadSubscription(
    request: InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004? = null,
    threadId: Int,
    options: CallOptions = CallOptions(),
  ): ThreadSubscription = executor.executeWithTypedErrors<InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004?, ActivitySetThreadSubscriptionResponse, ThreadSubscription>(
    request = SdkExecutionRequest(activitySetThreadSubscriptionMetadata, baseUri, request, listOf(ActivityCodecs.ACTIVITYSETTHREADSUBSCRIPTION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
    }),
    requestCodecs = ActivityCodecs.activitySetThreadSubscriptionRequestCodecRegistry,
    responseDecoder = ActivitySetThreadSubscriptionResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivitySetThreadSubscriptionResponse.SuccessJson -> response.json
        is ActivitySetThreadSubscriptionResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ActivitySetThreadSubscriptionResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivitySetThreadSubscriptionResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivitySetThreadSubscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivitySetThreadSubscriptionResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ActivitySetThreadSubscriptionResponse.Http304NoContent -> ActivitySetThreadSubscriptionApiException(response, statusCode, headers)
        is ActivitySetThreadSubscriptionResponse.Http401Json -> ActivitySetThreadSubscriptionApiException(response, statusCode, headers)
        is ActivitySetThreadSubscriptionResponse.Http403Json -> ActivitySetThreadSubscriptionApiException(response, statusCode, headers)
        is ActivitySetThreadSubscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * If you are watching a repository, you receive notifications for all threads by default. Use this endpoint to ignore
   * future notifications for threads until you comment on the thread or get an **@mention**.
   *
   * You can also use this endpoint to subscribe to threads that you are currently not receiving notifications for or to
   * subscribed to threads that you have previously ignored.
   *
   * Unsubscribing from a conversation in a repository that you are not watching is functionally equivalent to the
   * [Delete a thread subscription](https://docs.github.com/rest/activity/notifications#delete-a-thread-subscription)
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param threadId The unique identifier of the notification thread. This corresponds to the value returned in the
   * `id` field when you retrieve notifications (for example with the [`GET /notifications`
   * operation](https://docs.github.com/rest/activity/notifications#list-notifications-for-the-authenticated-user)).
   * @param options Execution options.
   */
  public suspend fun activitySetThreadSubscriptionWithResponse(
    request: InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004? = null,
    threadId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivitySetThreadSubscriptionResponse> = executor.executeWithResponse<InlineNotificationsThreadsSubscriptionPutRequestJsonX1d3c7004?, ActivitySetThreadSubscriptionResponse>(SdkExecutionRequest(activitySetThreadSubscriptionMetadata, baseUri, request, listOf(ActivityCodecs.ACTIVITYSETTHREADSUBSCRIPTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "thread_id", values = listOf(threadId.toString())))
  }), ActivityCodecs.activitySetThreadSubscriptionRequestCodecRegistry, ActivitySetThreadSubscriptionResponseDecoder, options)

  /**
   * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see
   * "[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws ActivityStarRepoForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded ActivityStarRepoForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityStarRepoForAuthenticatedUser(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, ActivityStarRepoForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(activityStarRepoForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ActivityCodecs.activityStarRepoForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = ActivityStarRepoForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityStarRepoForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is ActivityStarRepoForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is ActivityStarRepoForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityStarRepoForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityStarRepoForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityStarRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityStarRepoForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is ActivityStarRepoForAuthenticatedUserResponse.Http304NoContent -> ActivityStarRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityStarRepoForAuthenticatedUserResponse.Http401Json -> ActivityStarRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityStarRepoForAuthenticatedUserResponse.Http403Json -> ActivityStarRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityStarRepoForAuthenticatedUserResponse.Http404Json -> ActivityStarRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityStarRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see
   * "[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun activityStarRepoForAuthenticatedUserWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityStarRepoForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, ActivityStarRepoForAuthenticatedUserResponse>(SdkExecutionRequest(activityStarRepoForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ActivityCodecs.activityStarRepoForAuthenticatedUserRequestCodecRegistry, ActivityStarRepoForAuthenticatedUserResponseDecoder, options)

  /**
   * Unstar a repository that the authenticated user has previously starred.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws ActivityUnstarRepoForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded ActivityUnstarRepoForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun activityUnstarRepoForAuthenticatedUser(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, ActivityUnstarRepoForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(activityUnstarRepoForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ActivityCodecs.activityUnstarRepoForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = ActivityUnstarRepoForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ActivityUnstarRepoForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is ActivityUnstarRepoForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is ActivityUnstarRepoForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityUnstarRepoForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityUnstarRepoForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ActivityUnstarRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ActivityUnstarRepoForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is ActivityUnstarRepoForAuthenticatedUserResponse.Http304NoContent -> ActivityUnstarRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityUnstarRepoForAuthenticatedUserResponse.Http401Json -> ActivityUnstarRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityUnstarRepoForAuthenticatedUserResponse.Http403Json -> ActivityUnstarRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityUnstarRepoForAuthenticatedUserResponse.Http404Json -> ActivityUnstarRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is ActivityUnstarRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Unstar a repository that the authenticated user has previously starred.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun activityUnstarRepoForAuthenticatedUserWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ActivityUnstarRepoForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, ActivityUnstarRepoForAuthenticatedUserResponse>(SdkExecutionRequest(activityUnstarRepoForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ActivityCodecs.activityUnstarRepoForAuthenticatedUserRequestCodecRegistry, ActivityUnstarRepoForAuthenticatedUserResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `activity/check-repo-is-starred-by-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface ActivityCheckRepoIsStarredByAuthenticatedUserError

  /**
   * Typed response alternatives for `activity/check-repo-is-starred-by-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface ActivityCheckRepoIsStarredByAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityCheckRepoIsStarredByAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityCheckRepoIsStarredByAuthenticatedUserResponse,
        ActivityCheckRepoIsStarredByAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityCheckRepoIsStarredByAuthenticatedUserResponse,
        ActivityCheckRepoIsStarredByAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityCheckRepoIsStarredByAuthenticatedUserResponse,
        ActivityCheckRepoIsStarredByAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityCheckRepoIsStarredByAuthenticatedUserResponse,
        ActivityCheckRepoIsStarredByAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityCheckRepoIsStarredByAuthenticatedUserResponse
  }

  /**
   * Raised by `activity/check-repo-is-starred-by-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class ActivityCheckRepoIsStarredByAuthenticatedUserApiException(
    public val error: ActivityCheckRepoIsStarredByAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/check-repo-is-starred-by-authenticated-user")

  private object ActivityCheckRepoIsStarredByAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityCheckRepoIsStarredByAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityCheckRepoIsStarredByAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityCheckRepoIsStarredByAuthenticatedUserResponse> = when {
      alternative.id == "activity/check-repo-is-starred-by-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityCheckRepoIsStarredByAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/check-repo-is-starred-by-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/check-repo-is-starred-by-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http401Json(
          json = ActivityCodecs.activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("activity/check-repo-is-starred-by-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/check-repo-is-starred-by-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http403Json(
          json = ActivityCodecs.activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("activity/check-repo-is-starred-by-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/check-repo-is-starred-by-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Http404Json(
          json = ActivityCodecs.activityCheckRepoIsStarredByAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("activity/check-repo-is-starred-by-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityCheckRepoIsStarredByAuthenticatedUserResponse = ActivityCheckRepoIsStarredByAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/delete-repo-subscription`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ActivityDeleteRepoSubscriptionResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityDeleteRepoSubscriptionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityDeleteRepoSubscriptionResponse
  }

  private object ActivityDeleteRepoSubscriptionResponseDecoder : SdkResponseAlternativeDecoder<ActivityDeleteRepoSubscriptionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityDeleteRepoSubscriptionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityDeleteRepoSubscriptionResponse> = when {
      alternative.id == "activity/delete-repo-subscription.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityDeleteRepoSubscriptionResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityDeleteRepoSubscriptionResponse = ActivityDeleteRepoSubscriptionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/delete-thread-subscription` may expose through its typed
   * API exception.
   */
  public sealed interface ActivityDeleteThreadSubscriptionError

  /**
   * Typed response alternatives for `activity/delete-thread-subscription`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ActivityDeleteThreadSubscriptionResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityDeleteThreadSubscriptionResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityDeleteThreadSubscriptionResponse,
        ActivityDeleteThreadSubscriptionError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityDeleteThreadSubscriptionResponse,
        ActivityDeleteThreadSubscriptionError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityDeleteThreadSubscriptionResponse,
        ActivityDeleteThreadSubscriptionError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityDeleteThreadSubscriptionResponse
  }

  /**
   * Raised by `activity/delete-thread-subscription` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class ActivityDeleteThreadSubscriptionApiException(
    public val error: ActivityDeleteThreadSubscriptionError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/delete-thread-subscription")

  private object ActivityDeleteThreadSubscriptionResponseDecoder : SdkResponseAlternativeDecoder<ActivityDeleteThreadSubscriptionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityDeleteThreadSubscriptionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityDeleteThreadSubscriptionResponse> = when {
      alternative.id == "activity/delete-thread-subscription.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityDeleteThreadSubscriptionResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/delete-thread-subscription.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityDeleteThreadSubscriptionResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/delete-thread-subscription.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityDeleteThreadSubscriptionResponse.Http401Json(
          json = ActivityCodecs.activityDeleteThreadSubscriptionResponseCodecAlternative2Registry.select(listOf("activity/delete-thread-subscription.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/delete-thread-subscription.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityDeleteThreadSubscriptionResponse.Http403Json(
          json = ActivityCodecs.activityDeleteThreadSubscriptionResponseCodecAlternative3Registry.select(listOf("activity/delete-thread-subscription.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityDeleteThreadSubscriptionResponse = ActivityDeleteThreadSubscriptionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/get-feeds`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ActivityGetFeedsResponse {
    public class SuccessJson(
      public val json: Feed,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetFeedsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetFeedsResponse
  }

  private object ActivityGetFeedsResponseDecoder : SdkResponseAlternativeDecoder<ActivityGetFeedsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityGetFeedsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityGetFeedsResponse> = when {
      alternative.id == "activity/get-feeds.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityGetFeedsResponse.SuccessJson(
          json = ActivityCodecs.activityGetFeedsResponseCodecAlternative0Registry.select(listOf("activity/get-feeds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityGetFeedsResponse = ActivityGetFeedsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/get-repo-subscription` may expose through its typed API
   * exception.
   */
  public sealed interface ActivityGetRepoSubscriptionError

  /**
   * Typed response alternatives for `activity/get-repo-subscription`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ActivityGetRepoSubscriptionResponse {
    public class SuccessJson(
      public val json: RepositorySubscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetRepoSubscriptionResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetRepoSubscriptionResponse,
        ActivityGetRepoSubscriptionError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetRepoSubscriptionResponse,
        ActivityGetRepoSubscriptionError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetRepoSubscriptionResponse
  }

  /**
   * Raised by `activity/get-repo-subscription` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ActivityGetRepoSubscriptionApiException(
    public val error: ActivityGetRepoSubscriptionError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/get-repo-subscription")

  private object ActivityGetRepoSubscriptionResponseDecoder : SdkResponseAlternativeDecoder<ActivityGetRepoSubscriptionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityGetRepoSubscriptionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityGetRepoSubscriptionResponse> = when {
      alternative.id == "activity/get-repo-subscription.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityGetRepoSubscriptionResponse.SuccessJson(
          json = ActivityCodecs.activityGetRepoSubscriptionResponseCodecAlternative0Registry.select(listOf("activity/get-repo-subscription.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/get-repo-subscription.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityGetRepoSubscriptionResponse.Http403Json(
          json = ActivityCodecs.activityGetRepoSubscriptionResponseCodecAlternative1Registry.select(listOf("activity/get-repo-subscription.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/get-repo-subscription.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityGetRepoSubscriptionResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityGetRepoSubscriptionResponse = ActivityGetRepoSubscriptionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/get-thread` may expose through its typed API exception.
   */
  public sealed interface ActivityGetThreadError

  /**
   * Typed response alternatives for `activity/get-thread`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ActivityGetThreadResponse {
    public class SuccessJson(
      public val json: Thread,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadResponse,
        ActivityGetThreadError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadResponse,
        ActivityGetThreadError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadResponse,
        ActivityGetThreadError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadResponse
  }

  /**
   * Raised by `activity/get-thread` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ActivityGetThreadApiException(
    public val error: ActivityGetThreadError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/get-thread")

  private object ActivityGetThreadResponseDecoder : SdkResponseAlternativeDecoder<ActivityGetThreadResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityGetThreadResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityGetThreadResponse> = when {
      alternative.id == "activity/get-thread.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityGetThreadResponse.SuccessJson(
          json = ActivityCodecs.activityGetThreadResponseCodecAlternative0Registry.select(listOf("activity/get-thread.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/get-thread.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityGetThreadResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/get-thread.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityGetThreadResponse.Http401Json(
          json = ActivityCodecs.activityGetThreadResponseCodecAlternative2Registry.select(listOf("activity/get-thread.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/get-thread.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityGetThreadResponse.Http403Json(
          json = ActivityCodecs.activityGetThreadResponseCodecAlternative3Registry.select(listOf("activity/get-thread.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityGetThreadResponse = ActivityGetThreadResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/get-thread-subscription-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface ActivityGetThreadSubscriptionForAuthenticatedUserError

  /**
   * Typed response alternatives for `activity/get-thread-subscription-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface ActivityGetThreadSubscriptionForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: ThreadSubscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadSubscriptionForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadSubscriptionForAuthenticatedUserResponse,
        ActivityGetThreadSubscriptionForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadSubscriptionForAuthenticatedUserResponse,
        ActivityGetThreadSubscriptionForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadSubscriptionForAuthenticatedUserResponse,
        ActivityGetThreadSubscriptionForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityGetThreadSubscriptionForAuthenticatedUserResponse
  }

  /**
   * Raised by `activity/get-thread-subscription-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class ActivityGetThreadSubscriptionForAuthenticatedUserApiException(
    public val error: ActivityGetThreadSubscriptionForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/get-thread-subscription-for-authenticated-user")

  private object ActivityGetThreadSubscriptionForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityGetThreadSubscriptionForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityGetThreadSubscriptionForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityGetThreadSubscriptionForAuthenticatedUserResponse> = when {
      alternative.id == "activity/get-thread-subscription-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityGetThreadSubscriptionForAuthenticatedUserResponse.SuccessJson(
          json = ActivityCodecs.activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("activity/get-thread-subscription-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/get-thread-subscription-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/get-thread-subscription-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http401Json(
          json = ActivityCodecs.activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("activity/get-thread-subscription-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/get-thread-subscription-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Http403Json(
          json = ActivityCodecs.activityGetThreadSubscriptionForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("activity/get-thread-subscription-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityGetThreadSubscriptionForAuthenticatedUserResponse = ActivityGetThreadSubscriptionForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/list-notifications-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface ActivityListNotificationsForAuthenticatedUserError

  /**
   * Typed response alternatives for `activity/list-notifications-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface ActivityListNotificationsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Thread>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListNotificationsForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListNotificationsForAuthenticatedUserResponse,
        ActivityListNotificationsForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListNotificationsForAuthenticatedUserResponse,
        ActivityListNotificationsForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListNotificationsForAuthenticatedUserResponse,
        ActivityListNotificationsForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListNotificationsForAuthenticatedUserResponse,
        ActivityListNotificationsForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListNotificationsForAuthenticatedUserResponse
  }

  /**
   * Raised by `activity/list-notifications-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class ActivityListNotificationsForAuthenticatedUserApiException(
    public val error: ActivityListNotificationsForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/list-notifications-for-authenticated-user")

  private object ActivityListNotificationsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityListNotificationsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityListNotificationsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityListNotificationsForAuthenticatedUserResponse> = when {
      alternative.id == "activity/list-notifications-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityListNotificationsForAuthenticatedUserResponse.SuccessJson(
          json = ActivityCodecs.activityListNotificationsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("activity/list-notifications-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-notifications-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityListNotificationsForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-notifications-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityListNotificationsForAuthenticatedUserResponse.Http401Json(
          json = ActivityCodecs.activityListNotificationsForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("activity/list-notifications-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-notifications-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityListNotificationsForAuthenticatedUserResponse.Http403Json(
          json = ActivityCodecs.activityListNotificationsForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("activity/list-notifications-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-notifications-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ActivityListNotificationsForAuthenticatedUserResponse.Http422Json(
          json = ActivityCodecs.activityListNotificationsForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("activity/list-notifications-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityListNotificationsForAuthenticatedUserResponse = ActivityListNotificationsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/list-repo-notifications-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface ActivityListRepoNotificationsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Thread>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListRepoNotificationsForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListRepoNotificationsForAuthenticatedUserResponse
  }

  private object ActivityListRepoNotificationsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityListRepoNotificationsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityListRepoNotificationsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityListRepoNotificationsForAuthenticatedUserResponse> = when {
      alternative.id == "activity/list-repo-notifications-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityListRepoNotificationsForAuthenticatedUserResponse.SuccessJson(
          json = ActivityCodecs.activityListRepoNotificationsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("activity/list-repo-notifications-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityListRepoNotificationsForAuthenticatedUserResponse = ActivityListRepoNotificationsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/list-repos-starred-by-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface ActivityListReposStarredByAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Repository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposStarredByAuthenticatedUserResponse

    public class SuccessVndGithubV3StarJson(
      public val json: List<StarredRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposStarredByAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposStarredByAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposStarredByAuthenticatedUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposStarredByAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposStarredByAuthenticatedUserResponse
  }

  private object ActivityListReposStarredByAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityListReposStarredByAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityListReposStarredByAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityListReposStarredByAuthenticatedUserResponse> = when {
      alternative.id == "activity/list-repos-starred-by-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityListReposStarredByAuthenticatedUserResponse.SuccessJson(
          json = ActivityCodecs.activityListReposStarredByAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("activity/list-repos-starred-by-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-repos-starred-by-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityListReposStarredByAuthenticatedUserResponse.SuccessVndGithubV3StarJson(
          json = ActivityCodecs.activityListReposStarredByAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("activity/list-repos-starred-by-authenticated-user.response.alternative1"), mediaType ?: "application/vnd.github.v3.star+json").decode(body, mediaType ?: "application/vnd.github.v3.star+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-repos-starred-by-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityListReposStarredByAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-repos-starred-by-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityListReposStarredByAuthenticatedUserResponse.Http401Json(
          json = ActivityCodecs.activityListReposStarredByAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("activity/list-repos-starred-by-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-repos-starred-by-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ActivityListReposStarredByAuthenticatedUserResponse.Http403Json(
          json = ActivityCodecs.activityListReposStarredByAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("activity/list-repos-starred-by-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityListReposStarredByAuthenticatedUserResponse = ActivityListReposStarredByAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/list-repos-starred-by-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ActivityListReposStarredByUserResponse {
    public class SuccessJson(
      public val json: InlineUsersStarredGetResponse200JsonX5b3296a9,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposStarredByUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposStarredByUserResponse
  }

  private object ActivityListReposStarredByUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityListReposStarredByUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityListReposStarredByUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityListReposStarredByUserResponse> = when {
      alternative.id == "activity/list-repos-starred-by-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityListReposStarredByUserResponse.SuccessJson(
          json = ActivityCodecs.activityListReposStarredByUserResponseCodecAlternative0Registry.select(listOf("activity/list-repos-starred-by-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityListReposStarredByUserResponse = ActivityListReposStarredByUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/list-repos-watched-by-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ActivityListReposWatchedByUserResponse {
    public class SuccessJson(
      public val json: List<MinimalRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposWatchedByUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListReposWatchedByUserResponse
  }

  private object ActivityListReposWatchedByUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityListReposWatchedByUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityListReposWatchedByUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityListReposWatchedByUserResponse> = when {
      alternative.id == "activity/list-repos-watched-by-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityListReposWatchedByUserResponse.SuccessJson(
          json = ActivityCodecs.activityListReposWatchedByUserResponseCodecAlternative0Registry.select(listOf("activity/list-repos-watched-by-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityListReposWatchedByUserResponse = ActivityListReposWatchedByUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/list-stargazers-for-repo` may expose through its typed API
   * exception.
   */
  public sealed interface ActivityListStargazersForRepoError

  /**
   * Typed response alternatives for `activity/list-stargazers-for-repo`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ActivityListStargazersForRepoResponse {
    public class SuccessJson(
      public val json: InlineReposStargazersGetResponse200JsonX232efc77,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListStargazersForRepoResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListStargazersForRepoResponse,
        ActivityListStargazersForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListStargazersForRepoResponse
  }

  /**
   * Raised by `activity/list-stargazers-for-repo` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class ActivityListStargazersForRepoApiException(
    public val error: ActivityListStargazersForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/list-stargazers-for-repo")

  private object ActivityListStargazersForRepoResponseDecoder : SdkResponseAlternativeDecoder<ActivityListStargazersForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityListStargazersForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityListStargazersForRepoResponse> = when {
      alternative.id == "activity/list-stargazers-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityListStargazersForRepoResponse.SuccessJson(
          json = ActivityCodecs.activityListStargazersForRepoResponseCodecAlternative0Registry.select(listOf("activity/list-stargazers-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-stargazers-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityListStargazersForRepoResponse.Http422Json(
          json = ActivityCodecs.activityListStargazersForRepoResponseCodecAlternative1Registry.select(listOf("activity/list-stargazers-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityListStargazersForRepoResponse = ActivityListStargazersForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/list-watched-repos-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface ActivityListWatchedReposForAuthenticatedUserError

  /**
   * Typed response alternatives for `activity/list-watched-repos-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface ActivityListWatchedReposForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<MinimalRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListWatchedReposForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListWatchedReposForAuthenticatedUserResponse,
        ActivityListWatchedReposForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListWatchedReposForAuthenticatedUserResponse,
        ActivityListWatchedReposForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListWatchedReposForAuthenticatedUserResponse,
        ActivityListWatchedReposForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListWatchedReposForAuthenticatedUserResponse
  }

  /**
   * Raised by `activity/list-watched-repos-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class ActivityListWatchedReposForAuthenticatedUserApiException(
    public val error: ActivityListWatchedReposForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/list-watched-repos-for-authenticated-user")

  private object ActivityListWatchedReposForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityListWatchedReposForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityListWatchedReposForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityListWatchedReposForAuthenticatedUserResponse> = when {
      alternative.id == "activity/list-watched-repos-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityListWatchedReposForAuthenticatedUserResponse.SuccessJson(
          json = ActivityCodecs.activityListWatchedReposForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("activity/list-watched-repos-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-watched-repos-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityListWatchedReposForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-watched-repos-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityListWatchedReposForAuthenticatedUserResponse.Http401Json(
          json = ActivityCodecs.activityListWatchedReposForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("activity/list-watched-repos-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/list-watched-repos-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityListWatchedReposForAuthenticatedUserResponse.Http403Json(
          json = ActivityCodecs.activityListWatchedReposForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("activity/list-watched-repos-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityListWatchedReposForAuthenticatedUserResponse = ActivityListWatchedReposForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/list-watchers-for-repo`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ActivityListWatchersForRepoResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListWatchersForRepoResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityListWatchersForRepoResponse
  }

  private object ActivityListWatchersForRepoResponseDecoder : SdkResponseAlternativeDecoder<ActivityListWatchersForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityListWatchersForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityListWatchersForRepoResponse> = when {
      alternative.id == "activity/list-watchers-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityListWatchersForRepoResponse.SuccessJson(
          json = ActivityCodecs.activityListWatchersForRepoResponseCodecAlternative0Registry.select(listOf("activity/list-watchers-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityListWatchersForRepoResponse = ActivityListWatchersForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/mark-notifications-as-read`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ActivityMarkNotificationsAsReadResponse {
    public class SuccessJson(
      public val json: InlineNotificationsPutResponse202JsonXa88389e9,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkNotificationsAsReadResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkNotificationsAsReadResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkNotificationsAsReadResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkNotificationsAsReadResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkNotificationsAsReadResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkNotificationsAsReadResponse
  }

  private object ActivityMarkNotificationsAsReadResponseDecoder : SdkResponseAlternativeDecoder<ActivityMarkNotificationsAsReadResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityMarkNotificationsAsReadResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityMarkNotificationsAsReadResponse> = when {
      alternative.id == "activity/mark-notifications-as-read.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityMarkNotificationsAsReadResponse.SuccessJson(
          json = ActivityCodecs.activityMarkNotificationsAsReadResponseCodecAlternative0Registry.select(listOf("activity/mark-notifications-as-read.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/mark-notifications-as-read.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityMarkNotificationsAsReadResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/mark-notifications-as-read.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityMarkNotificationsAsReadResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/mark-notifications-as-read.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityMarkNotificationsAsReadResponse.Http401Json(
          json = ActivityCodecs.activityMarkNotificationsAsReadResponseCodecAlternative3Registry.select(listOf("activity/mark-notifications-as-read.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/mark-notifications-as-read.response.alternative4" -> SdkResponseDecodeResult(
        value = ActivityMarkNotificationsAsReadResponse.Http403Json(
          json = ActivityCodecs.activityMarkNotificationsAsReadResponseCodecAlternative4Registry.select(listOf("activity/mark-notifications-as-read.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityMarkNotificationsAsReadResponse = ActivityMarkNotificationsAsReadResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/mark-repo-notifications-as-read`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface ActivityMarkRepoNotificationsAsReadResponse {
    public class SuccessJson(
      public val json: InlineReposNotificationsPutResponse202JsonXf31aa216,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkRepoNotificationsAsReadResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkRepoNotificationsAsReadResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkRepoNotificationsAsReadResponse
  }

  private object ActivityMarkRepoNotificationsAsReadResponseDecoder : SdkResponseAlternativeDecoder<ActivityMarkRepoNotificationsAsReadResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityMarkRepoNotificationsAsReadResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityMarkRepoNotificationsAsReadResponse> = when {
      alternative.id == "activity/mark-repo-notifications-as-read.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityMarkRepoNotificationsAsReadResponse.SuccessJson(
          json = ActivityCodecs.activityMarkRepoNotificationsAsReadResponseCodecAlternative0Registry.select(listOf("activity/mark-repo-notifications-as-read.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/mark-repo-notifications-as-read.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityMarkRepoNotificationsAsReadResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityMarkRepoNotificationsAsReadResponse = ActivityMarkRepoNotificationsAsReadResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/mark-thread-as-done`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ActivityMarkThreadAsDoneResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkThreadAsDoneResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkThreadAsDoneResponse
  }

  private object ActivityMarkThreadAsDoneResponseDecoder : SdkResponseAlternativeDecoder<ActivityMarkThreadAsDoneResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityMarkThreadAsDoneResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityMarkThreadAsDoneResponse> = when {
      alternative.id == "activity/mark-thread-as-done.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityMarkThreadAsDoneResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityMarkThreadAsDoneResponse = ActivityMarkThreadAsDoneResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/mark-thread-as-read` may expose through its typed API
   * exception.
   */
  public sealed interface ActivityMarkThreadAsReadError

  /**
   * Typed response alternatives for `activity/mark-thread-as-read`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ActivityMarkThreadAsReadResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkThreadAsReadResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkThreadAsReadResponse,
        ActivityMarkThreadAsReadError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkThreadAsReadResponse,
        ActivityMarkThreadAsReadError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityMarkThreadAsReadResponse
  }

  /**
   * Raised by `activity/mark-thread-as-read` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ActivityMarkThreadAsReadApiException(
    public val error: ActivityMarkThreadAsReadError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/mark-thread-as-read")

  private object ActivityMarkThreadAsReadResponseDecoder : SdkResponseAlternativeDecoder<ActivityMarkThreadAsReadResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityMarkThreadAsReadResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityMarkThreadAsReadResponse> = when {
      alternative.id == "activity/mark-thread-as-read.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityMarkThreadAsReadResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/mark-thread-as-read.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityMarkThreadAsReadResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/mark-thread-as-read.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityMarkThreadAsReadResponse.Http403Json(
          json = ActivityCodecs.activityMarkThreadAsReadResponseCodecAlternative2Registry.select(listOf("activity/mark-thread-as-read.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityMarkThreadAsReadResponse = ActivityMarkThreadAsReadResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `activity/set-repo-subscription`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ActivitySetRepoSubscriptionResponse {
    public class SuccessJson(
      public val json: RepositorySubscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivitySetRepoSubscriptionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivitySetRepoSubscriptionResponse
  }

  private object ActivitySetRepoSubscriptionResponseDecoder : SdkResponseAlternativeDecoder<ActivitySetRepoSubscriptionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivitySetRepoSubscriptionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivitySetRepoSubscriptionResponse> = when {
      alternative.id == "activity/set-repo-subscription.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivitySetRepoSubscriptionResponse.SuccessJson(
          json = ActivityCodecs.activitySetRepoSubscriptionResponseCodecAlternative0Registry.select(listOf("activity/set-repo-subscription.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivitySetRepoSubscriptionResponse = ActivitySetRepoSubscriptionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/set-thread-subscription` may expose through its typed API
   * exception.
   */
  public sealed interface ActivitySetThreadSubscriptionError

  /**
   * Typed response alternatives for `activity/set-thread-subscription`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ActivitySetThreadSubscriptionResponse {
    public class SuccessJson(
      public val json: ThreadSubscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivitySetThreadSubscriptionResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivitySetThreadSubscriptionResponse,
        ActivitySetThreadSubscriptionError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivitySetThreadSubscriptionResponse,
        ActivitySetThreadSubscriptionError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivitySetThreadSubscriptionResponse,
        ActivitySetThreadSubscriptionError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivitySetThreadSubscriptionResponse
  }

  /**
   * Raised by `activity/set-thread-subscription` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class ActivitySetThreadSubscriptionApiException(
    public val error: ActivitySetThreadSubscriptionError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/set-thread-subscription")

  private object ActivitySetThreadSubscriptionResponseDecoder : SdkResponseAlternativeDecoder<ActivitySetThreadSubscriptionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivitySetThreadSubscriptionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivitySetThreadSubscriptionResponse> = when {
      alternative.id == "activity/set-thread-subscription.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivitySetThreadSubscriptionResponse.SuccessJson(
          json = ActivityCodecs.activitySetThreadSubscriptionResponseCodecAlternative0Registry.select(listOf("activity/set-thread-subscription.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/set-thread-subscription.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivitySetThreadSubscriptionResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/set-thread-subscription.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivitySetThreadSubscriptionResponse.Http401Json(
          json = ActivityCodecs.activitySetThreadSubscriptionResponseCodecAlternative2Registry.select(listOf("activity/set-thread-subscription.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/set-thread-subscription.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivitySetThreadSubscriptionResponse.Http403Json(
          json = ActivityCodecs.activitySetThreadSubscriptionResponseCodecAlternative3Registry.select(listOf("activity/set-thread-subscription.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivitySetThreadSubscriptionResponse = ActivitySetThreadSubscriptionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/star-repo-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface ActivityStarRepoForAuthenticatedUserError

  /**
   * Typed response alternatives for `activity/star-repo-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface ActivityStarRepoForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityStarRepoForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityStarRepoForAuthenticatedUserResponse,
        ActivityStarRepoForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityStarRepoForAuthenticatedUserResponse,
        ActivityStarRepoForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityStarRepoForAuthenticatedUserResponse,
        ActivityStarRepoForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityStarRepoForAuthenticatedUserResponse,
        ActivityStarRepoForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityStarRepoForAuthenticatedUserResponse
  }

  /**
   * Raised by `activity/star-repo-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class ActivityStarRepoForAuthenticatedUserApiException(
    public val error: ActivityStarRepoForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/star-repo-for-authenticated-user")

  private object ActivityStarRepoForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityStarRepoForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityStarRepoForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityStarRepoForAuthenticatedUserResponse> = when {
      alternative.id == "activity/star-repo-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityStarRepoForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/star-repo-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityStarRepoForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/star-repo-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityStarRepoForAuthenticatedUserResponse.Http401Json(
          json = ActivityCodecs.activityStarRepoForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("activity/star-repo-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/star-repo-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityStarRepoForAuthenticatedUserResponse.Http403Json(
          json = ActivityCodecs.activityStarRepoForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("activity/star-repo-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/star-repo-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ActivityStarRepoForAuthenticatedUserResponse.Http404Json(
          json = ActivityCodecs.activityStarRepoForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("activity/star-repo-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityStarRepoForAuthenticatedUserResponse = ActivityStarRepoForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `activity/unstar-repo-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface ActivityUnstarRepoForAuthenticatedUserError

  /**
   * Typed response alternatives for `activity/unstar-repo-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface ActivityUnstarRepoForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityUnstarRepoForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityUnstarRepoForAuthenticatedUserResponse,
        ActivityUnstarRepoForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityUnstarRepoForAuthenticatedUserResponse,
        ActivityUnstarRepoForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityUnstarRepoForAuthenticatedUserResponse,
        ActivityUnstarRepoForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityUnstarRepoForAuthenticatedUserResponse,
        ActivityUnstarRepoForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ActivityUnstarRepoForAuthenticatedUserResponse
  }

  /**
   * Raised by `activity/unstar-repo-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class ActivityUnstarRepoForAuthenticatedUserApiException(
    public val error: ActivityUnstarRepoForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "activity/unstar-repo-for-authenticated-user")

  private object ActivityUnstarRepoForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<ActivityUnstarRepoForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ActivityUnstarRepoForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ActivityUnstarRepoForAuthenticatedUserResponse> = when {
      alternative.id == "activity/unstar-repo-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ActivityUnstarRepoForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/unstar-repo-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ActivityUnstarRepoForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/unstar-repo-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ActivityUnstarRepoForAuthenticatedUserResponse.Http401Json(
          json = ActivityCodecs.activityUnstarRepoForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("activity/unstar-repo-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/unstar-repo-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ActivityUnstarRepoForAuthenticatedUserResponse.Http403Json(
          json = ActivityCodecs.activityUnstarRepoForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("activity/unstar-repo-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "activity/unstar-repo-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ActivityUnstarRepoForAuthenticatedUserResponse.Http404Json(
          json = ActivityCodecs.activityUnstarRepoForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("activity/unstar-repo-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): ActivityUnstarRepoForAuthenticatedUserResponse = ActivityUnstarRepoForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val activityCheckRepoIsStarredByAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/check-repo-is-starred-by-authenticated-user",
          method = "GET",
          path = "/user/starred/{owner}/{repo}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/check-repo-is-starred-by-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/check-repo-is-starred-by-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/check-repo-is-starred-by-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/check-repo-is-starred-by-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/check-repo-is-starred-by-authenticated-user.response.alternative4",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityDeleteRepoSubscriptionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/delete-repo-subscription",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/subscription",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/delete-repo-subscription.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityDeleteThreadSubscriptionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/delete-thread-subscription",
          method = "DELETE",
          path = "/notifications/threads/{thread_id}/subscription",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/delete-thread-subscription.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/delete-thread-subscription.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/delete-thread-subscription.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/delete-thread-subscription.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityGetFeedsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/get-feeds",
          method = "GET",
          path = "/feeds",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Feed",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-feeds.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityGetRepoSubscriptionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/get-repo-subscription",
          method = "GET",
          path = "/repos/{owner}/{repo}/subscription",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RepositorySubscription",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-repo-subscription.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-repo-subscription.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-repo-subscription.response.alternative2",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityGetThreadMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/get-thread",
          method = "GET",
          path = "/notifications/threads/{thread_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Thread",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-thread.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-thread.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-thread.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-thread.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityGetThreadSubscriptionForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/get-thread-subscription-for-authenticated-user",
          method = "GET",
          path = "/notifications/threads/{thread_id}/subscription",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ThreadSubscription",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-thread-subscription-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-thread-subscription-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-thread-subscription-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/get-thread-subscription-for-authenticated-user.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityListNotificationsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/list-notifications-for-authenticated-user",
          method = "GET",
          path = "/notifications",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-notifications-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-notifications-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-notifications-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-notifications-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-notifications-for-authenticated-user.response.alternative4",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityListRepoNotificationsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/list-repo-notifications-for-authenticated-user",
          method = "GET",
          path = "/repos/{owner}/{repo}/notifications",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-repo-notifications-for-authenticated-user.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityListReposStarredByAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/list-repos-starred-by-authenticated-user",
          method = "GET",
          path = "/user/starred",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json", "application/vnd.github.v3.star+json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-repos-starred-by-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/vnd.github.v3.star+json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-repos-starred-by-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-repos-starred-by-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-repos-starred-by-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-repos-starred-by-authenticated-user.response.alternative4",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityListReposStarredByUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/list-repos-starred-by-user",
          method = "GET",
          path = "/users/{username}/starred",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUsersStarredGetResponse200JsonX5b3296a9",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-repos-starred-by-user.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityListReposWatchedByUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/list-repos-watched-by-user",
          method = "GET",
          path = "/users/{username}/subscriptions",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-repos-watched-by-user.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityListStargazersForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/list-stargazers-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/stargazers",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposStargazersGetResponse200JsonX232efc77",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-stargazers-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-stargazers-for-repo.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityListWatchedReposForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/list-watched-repos-for-authenticated-user",
          method = "GET",
          path = "/user/subscriptions",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-watched-repos-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-watched-repos-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-watched-repos-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-watched-repos-for-authenticated-user.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityListWatchersForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/list-watchers-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/subscribers",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/list-watchers-for-repo.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityMarkNotificationsAsReadMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/mark-notifications-as-read",
          method = "PUT",
          path = "/notifications",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202, 205),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineNotificationsPutResponse202JsonXa88389e9",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-notifications-as-read.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 205),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-notifications-as-read.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-notifications-as-read.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-notifications-as-read.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-notifications-as-read.response.alternative4",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityMarkRepoNotificationsAsReadMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/mark-repo-notifications-as-read",
          method = "PUT",
          path = "/repos/{owner}/{repo}/notifications",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202, 205),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposNotificationsPutResponse202JsonXf31aa216",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-repo-notifications-as-read.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 205),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-repo-notifications-as-read.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityMarkThreadAsDoneMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/mark-thread-as-done",
          method = "DELETE",
          path = "/notifications/threads/{thread_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-thread-as-done.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityMarkThreadAsReadMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/mark-thread-as-read",
          method = "PATCH",
          path = "/notifications/threads/{thread_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(205),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 205),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-thread-as-read.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-thread-as-read.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/mark-thread-as-read.response.alternative2",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activitySetRepoSubscriptionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/set-repo-subscription",
          method = "PUT",
          path = "/repos/{owner}/{repo}/subscription",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RepositorySubscription",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/set-repo-subscription.response.alternative0",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activitySetThreadSubscriptionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/set-thread-subscription",
          method = "PUT",
          path = "/notifications/threads/{thread_id}/subscription",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ThreadSubscription",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/set-thread-subscription.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/set-thread-subscription.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/set-thread-subscription.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/set-thread-subscription.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityStarRepoForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/star-repo-for-authenticated-user",
          method = "PUT",
          path = "/user/starred/{owner}/{repo}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/star-repo-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/star-repo-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/star-repo-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/star-repo-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/star-repo-for-authenticated-user.response.alternative4",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val activityUnstarRepoForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "activity/unstar-repo-for-authenticated-user",
          method = "DELETE",
          path = "/user/starred/{owner}/{repo}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/unstar-repo-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/unstar-repo-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/unstar-repo-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/unstar-repo-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "activity/unstar-repo-for-authenticated-user.response.alternative4",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
