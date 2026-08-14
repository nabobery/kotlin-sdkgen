package io.github.nabobery.sdkgen.generated.stripe.financialconnections

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
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.FinancialConnectionsAccount
import io.github.nabobery.sdkgen.generated.stripe.FinancialConnectionsSession
import io.github.nabobery.sdkgen.generated.stripe.FinancialConnectionsTransaction
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsDisconnectPostRequestFormXb1f91171
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsGetParameterX92df6887
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsGetResponse200JsonX05219cda
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonX23ddc376
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsSubscribePostRequestFormX6fca75e5
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed
import io.github.nabobery.sdkgen.generated.stripe.InlineV1FinancialConnectionsTransactionsGetResponse200JsonX6b537f34
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object FinancialConnectionsCodecs {
  internal const val GETFINANCIALCONNECTIONSACCOUNTS_REQUEST_CODEC_ID: String =
      "GetFinancialConnectionsAccounts.request"

  private val getFinancialConnectionsAccountsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetFinancialConnectionsAccountsFormCodec

  private val getFinancialConnectionsAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1FinancialConnectionsAccountsGetResponse200JsonX05219cda> =
      KotlinxSerializationCodec("GetFinancialConnectionsAccounts.response.alternative0", InlineV1FinancialConnectionsAccountsGetResponse200JsonX05219cda.Serializer, SdkJson)

  internal val getFinancialConnectionsAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1FinancialConnectionsAccountsGetResponse200JsonX05219cda> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsResponseCodecAlternative0Codec)

  private val getFinancialConnectionsAccountsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFinancialConnectionsAccounts.response.alternative1", Error.Serializer, SdkJson)

  internal val getFinancialConnectionsAccountsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsResponseCodecAlternative1Codec)

  internal val getFinancialConnectionsAccountsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsRequestCodec)

  internal const val GETFINANCIALCONNECTIONSACCOUNTSACCOUNT_REQUEST_CODEC_ID: String =
      "GetFinancialConnectionsAccountsAccount.request"

  private val getFinancialConnectionsAccountsAccountRequestCodec: MediaTypeCodec<JsonObject?> =
      GetFinancialConnectionsAccountsAccountFormCodec

  private val getFinancialConnectionsAccountsAccountResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsAccount> =
      KotlinxSerializationCodec("GetFinancialConnectionsAccountsAccount.response.alternative0", FinancialConnectionsAccount.Serializer, SdkJson)

  internal val getFinancialConnectionsAccountsAccountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsAccount> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsAccountResponseCodecAlternative0Codec)

  private val getFinancialConnectionsAccountsAccountResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFinancialConnectionsAccountsAccount.response.alternative1", Error.Serializer, SdkJson)

  internal val getFinancialConnectionsAccountsAccountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsAccountResponseCodecAlternative1Codec)

  internal val getFinancialConnectionsAccountsAccountRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsAccountRequestCodec)

  internal const val GETFINANCIALCONNECTIONSACCOUNTSACCOUNTOWNERS_REQUEST_CODEC_ID: String =
      "GetFinancialConnectionsAccountsAccountOwners.request"

  private val getFinancialConnectionsAccountsAccountOwnersRequestCodec: MediaTypeCodec<JsonObject?>
      = GetFinancialConnectionsAccountsAccountOwnersFormCodec

  private val getFinancialConnectionsAccountsAccountOwnersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonX23ddc376> =
      KotlinxSerializationCodec("GetFinancialConnectionsAccountsAccountOwners.response.alternative0", InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonX23ddc376.Serializer, SdkJson)

  internal val getFinancialConnectionsAccountsAccountOwnersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonX23ddc376>
      =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsAccountOwnersResponseCodecAlternative0Codec)

  private val getFinancialConnectionsAccountsAccountOwnersResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFinancialConnectionsAccountsAccountOwners.response.alternative1", Error.Serializer, SdkJson)

  internal val getFinancialConnectionsAccountsAccountOwnersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsAccountOwnersResponseCodecAlternative1Codec)

  internal val getFinancialConnectionsAccountsAccountOwnersRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsAccountsAccountOwnersRequestCodec)

  internal const val GETFINANCIALCONNECTIONSSESSIONSSESSION_REQUEST_CODEC_ID: String =
      "GetFinancialConnectionsSessionsSession.request"

  private val getFinancialConnectionsSessionsSessionRequestCodec: MediaTypeCodec<JsonObject?> =
      GetFinancialConnectionsSessionsSessionFormCodec

  private val getFinancialConnectionsSessionsSessionResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsSession> =
      KotlinxSerializationCodec("GetFinancialConnectionsSessionsSession.response.alternative0", FinancialConnectionsSession.Serializer, SdkJson)

  internal val getFinancialConnectionsSessionsSessionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsSession> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsSessionsSessionResponseCodecAlternative0Codec)

  private val getFinancialConnectionsSessionsSessionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFinancialConnectionsSessionsSession.response.alternative1", Error.Serializer, SdkJson)

  internal val getFinancialConnectionsSessionsSessionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsSessionsSessionResponseCodecAlternative1Codec)

  internal val getFinancialConnectionsSessionsSessionRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsSessionsSessionRequestCodec)

  internal const val GETFINANCIALCONNECTIONSTRANSACTIONS_REQUEST_CODEC_ID: String =
      "GetFinancialConnectionsTransactions.request"

  private val getFinancialConnectionsTransactionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetFinancialConnectionsTransactionsFormCodec

  private val getFinancialConnectionsTransactionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1FinancialConnectionsTransactionsGetResponse200JsonX6b537f34> =
      KotlinxSerializationCodec("GetFinancialConnectionsTransactions.response.alternative0", InlineV1FinancialConnectionsTransactionsGetResponse200JsonX6b537f34.Serializer, SdkJson)

  internal val getFinancialConnectionsTransactionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1FinancialConnectionsTransactionsGetResponse200JsonX6b537f34> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsTransactionsResponseCodecAlternative0Codec)

  private val getFinancialConnectionsTransactionsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFinancialConnectionsTransactions.response.alternative1", Error.Serializer, SdkJson)

  internal val getFinancialConnectionsTransactionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsTransactionsResponseCodecAlternative1Codec)

  internal val getFinancialConnectionsTransactionsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsTransactionsRequestCodec)

  internal const val GETFINANCIALCONNECTIONSTRANSACTIONSTRANSACTION_REQUEST_CODEC_ID: String =
      "GetFinancialConnectionsTransactionsTransaction.request"

  private val getFinancialConnectionsTransactionsTransactionRequestCodec:
      MediaTypeCodec<JsonObject?> = GetFinancialConnectionsTransactionsTransactionFormCodec

  private val getFinancialConnectionsTransactionsTransactionResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsTransaction> =
      KotlinxSerializationCodec("GetFinancialConnectionsTransactionsTransaction.response.alternative0", FinancialConnectionsTransaction.Serializer, SdkJson)

  internal val getFinancialConnectionsTransactionsTransactionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsTransaction> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsTransactionsTransactionResponseCodecAlternative0Codec)

  private val getFinancialConnectionsTransactionsTransactionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetFinancialConnectionsTransactionsTransaction.response.alternative1", Error.Serializer, SdkJson)

  internal val getFinancialConnectionsTransactionsTransactionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsTransactionsTransactionResponseCodecAlternative1Codec)

  internal val getFinancialConnectionsTransactionsTransactionRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getFinancialConnectionsTransactionsTransactionRequestCodec)

  internal const val POSTFINANCIALCONNECTIONSACCOUNTSACCOUNTDISCONNECT_REQUEST_CODEC_ID: String =
      "PostFinancialConnectionsAccountsAccountDisconnect.request"

  private val postFinancialConnectionsAccountsAccountDisconnectRequestCodec:
      MediaTypeCodec<InlineV1FinancialConnectionsAccountsDisconnectPostRequestFormXb1f91171?> =
      PostFinancialConnectionsAccountsAccountDisconnectFormCodec

  private val postFinancialConnectionsAccountsAccountDisconnectResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsAccount> =
      KotlinxSerializationCodec("PostFinancialConnectionsAccountsAccountDisconnect.response.alternative0", FinancialConnectionsAccount.Serializer, SdkJson)

  internal val postFinancialConnectionsAccountsAccountDisconnectResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsAccount> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountDisconnectResponseCodecAlternative0Codec)

  private val postFinancialConnectionsAccountsAccountDisconnectResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostFinancialConnectionsAccountsAccountDisconnect.response.alternative1", Error.Serializer, SdkJson)

  internal val postFinancialConnectionsAccountsAccountDisconnectResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountDisconnectResponseCodecAlternative1Codec)

  internal val postFinancialConnectionsAccountsAccountDisconnectRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1FinancialConnectionsAccountsDisconnectPostRequestFormXb1f91171?>
      = MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountDisconnectRequestCodec)

  internal const val POSTFINANCIALCONNECTIONSACCOUNTSACCOUNTREFRESH_REQUEST_CODEC_ID: String =
      "PostFinancialConnectionsAccountsAccountRefresh.request"

  private val postFinancialConnectionsAccountsAccountRefreshRequestCodec:
      MediaTypeCodec<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e> =
      PostFinancialConnectionsAccountsAccountRefreshFormCodec

  private val postFinancialConnectionsAccountsAccountRefreshResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsAccount> =
      KotlinxSerializationCodec("PostFinancialConnectionsAccountsAccountRefresh.response.alternative0", FinancialConnectionsAccount.Serializer, SdkJson)

  internal val postFinancialConnectionsAccountsAccountRefreshResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsAccount> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountRefreshResponseCodecAlternative0Codec)

  private val postFinancialConnectionsAccountsAccountRefreshResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostFinancialConnectionsAccountsAccountRefresh.response.alternative1", Error.Serializer, SdkJson)

  internal val postFinancialConnectionsAccountsAccountRefreshResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountRefreshResponseCodecAlternative1Codec)

  internal val postFinancialConnectionsAccountsAccountRefreshRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountRefreshRequestCodec)

  internal const val POSTFINANCIALCONNECTIONSACCOUNTSACCOUNTSUBSCRIBE_REQUEST_CODEC_ID: String =
      "PostFinancialConnectionsAccountsAccountSubscribe.request"

  private val postFinancialConnectionsAccountsAccountSubscribeRequestCodec:
      MediaTypeCodec<InlineV1FinancialConnectionsAccountsSubscribePostRequestFormX6fca75e5> =
      PostFinancialConnectionsAccountsAccountSubscribeFormCodec

  private val postFinancialConnectionsAccountsAccountSubscribeResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsAccount> =
      KotlinxSerializationCodec("PostFinancialConnectionsAccountsAccountSubscribe.response.alternative0", FinancialConnectionsAccount.Serializer, SdkJson)

  internal val postFinancialConnectionsAccountsAccountSubscribeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsAccount> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountSubscribeResponseCodecAlternative0Codec)

  private val postFinancialConnectionsAccountsAccountSubscribeResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostFinancialConnectionsAccountsAccountSubscribe.response.alternative1", Error.Serializer, SdkJson)

  internal val postFinancialConnectionsAccountsAccountSubscribeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountSubscribeResponseCodecAlternative1Codec)

  internal val postFinancialConnectionsAccountsAccountSubscribeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1FinancialConnectionsAccountsSubscribePostRequestFormX6fca75e5>
      = MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountSubscribeRequestCodec)

  internal const val POSTFINANCIALCONNECTIONSACCOUNTSACCOUNTUNSUBSCRIBE_REQUEST_CODEC_ID: String =
      "PostFinancialConnectionsAccountsAccountUnsubscribe.request"

  private val postFinancialConnectionsAccountsAccountUnsubscribeRequestCodec:
      MediaTypeCodec<InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83> =
      PostFinancialConnectionsAccountsAccountUnsubscribeFormCodec

  private val postFinancialConnectionsAccountsAccountUnsubscribeResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsAccount> =
      KotlinxSerializationCodec("PostFinancialConnectionsAccountsAccountUnsubscribe.response.alternative0", FinancialConnectionsAccount.Serializer, SdkJson)

  internal val postFinancialConnectionsAccountsAccountUnsubscribeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsAccount> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountUnsubscribeResponseCodecAlternative0Codec)

  private val postFinancialConnectionsAccountsAccountUnsubscribeResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostFinancialConnectionsAccountsAccountUnsubscribe.response.alternative1", Error.Serializer, SdkJson)

  internal val postFinancialConnectionsAccountsAccountUnsubscribeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountUnsubscribeResponseCodecAlternative1Codec)

  internal val postFinancialConnectionsAccountsAccountUnsubscribeRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83>
      = MediaTypeCodecRegistry.of(postFinancialConnectionsAccountsAccountUnsubscribeRequestCodec)

  internal const val POSTFINANCIALCONNECTIONSSESSIONS_REQUEST_CODEC_ID: String =
      "PostFinancialConnectionsSessions.request"

  private val postFinancialConnectionsSessionsRequestCodec:
      MediaTypeCodec<InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23> =
      PostFinancialConnectionsSessionsFormCodec

  private val postFinancialConnectionsSessionsResponseCodecAlternative0Codec:
      MediaTypeCodec<FinancialConnectionsSession> =
      KotlinxSerializationCodec("PostFinancialConnectionsSessions.response.alternative0", FinancialConnectionsSession.Serializer, SdkJson)

  internal val postFinancialConnectionsSessionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FinancialConnectionsSession> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsSessionsResponseCodecAlternative0Codec)

  private val postFinancialConnectionsSessionsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostFinancialConnectionsSessions.response.alternative1", Error.Serializer, SdkJson)

  internal val postFinancialConnectionsSessionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsSessionsResponseCodecAlternative1Codec)

  internal val postFinancialConnectionsSessionsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23> =
      MediaTypeCodecRegistry.of(postFinancialConnectionsSessionsRequestCodec)

  internal object GetFinancialConnectionsAccountsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFinancialConnectionsAccounts.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetFinancialConnectionsAccountsAccountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFinancialConnectionsAccountsAccount.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetFinancialConnectionsAccountsAccountOwnersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFinancialConnectionsAccountsAccountOwners.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetFinancialConnectionsSessionsSessionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFinancialConnectionsSessionsSession.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetFinancialConnectionsTransactionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFinancialConnectionsTransactions.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object GetFinancialConnectionsTransactionsTransactionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetFinancialConnectionsTransactionsTransaction.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostFinancialConnectionsAccountsAccountDisconnectFormCodec : MediaTypeCodec<InlineV1FinancialConnectionsAccountsDisconnectPostRequestFormXb1f91171?> {
    override val id: String = "PostFinancialConnectionsAccountsAccountDisconnect.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1FinancialConnectionsAccountsDisconnectPostRequestFormXb1f91171?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1FinancialConnectionsAccountsDisconnectPostRequestFormXb1f91171? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostFinancialConnectionsAccountsAccountRefreshFormCodec : MediaTypeCodec<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e> {
    override val id: String = "PostFinancialConnectionsAccountsAccountRefresh.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      if (request.features.isEmpty()) {
        form.add("features", "")
      } else {
        request.features.forEachIndexed { formIndex0, formElement0 ->
          form.add("features" + "[" + formIndex0 + "]", formElement0.value)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostFinancialConnectionsAccountsAccountSubscribeFormCodec : MediaTypeCodec<InlineV1FinancialConnectionsAccountsSubscribePostRequestFormX6fca75e5> {
    override val id: String = "PostFinancialConnectionsAccountsAccountSubscribe.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1FinancialConnectionsAccountsSubscribePostRequestFormX6fca75e5, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      if (request.features.isEmpty()) {
        form.add("features", "")
      } else {
        request.features.forEachIndexed { formIndex0, formElement0 ->
          form.add("features" + "[" + formIndex0 + "]", formElement0.value)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1FinancialConnectionsAccountsSubscribePostRequestFormX6fca75e5 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostFinancialConnectionsAccountsAccountUnsubscribeFormCodec : MediaTypeCodec<InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83> {
    override val id: String = "PostFinancialConnectionsAccountsAccountUnsubscribe.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      if (request.features.isEmpty()) {
        form.add("features", "")
      } else {
        request.features.forEachIndexed { formIndex0, formElement0 ->
          form.add("features" + "[" + formIndex0 + "]", formElement0.value)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostFinancialConnectionsSessionsFormCodec : MediaTypeCodec<InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23> {
    override val id: String = "PostFinancialConnectionsSessions.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.accountHolder.account?.let { formValue1 ->
        form.add("account_holder" + "[account]", formValue1)
      }
      request.accountHolder.customer?.let { formValue1 ->
        form.add("account_holder" + "[customer]", formValue1)
      }
      request.accountHolder.customerAccount?.let { formValue1 ->
        form.add("account_holder" + "[customer_account]", formValue1)
      }
      form.add("account_holder" + "[type]", request.accountHolder.type.value)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.filters?.let { formValue0 ->
        formValue0.accountSubcategories?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("filters" + "[account_subcategories]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("filters" + "[account_subcategories]" + "[" + formIndex3 + "]", formElement3.value)
            }
          }
        }
        formValue0.countries?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("filters" + "[countries]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("filters" + "[countries]" + "[" + formIndex3 + "]", formElement3)
            }
          }
        }
      }
      if (request.permissions.isEmpty()) {
        form.add("permissions", "")
      } else {
        request.permissions.forEachIndexed { formIndex0, formElement0 ->
          form.add("permissions" + "[" + formIndex0 + "]", formElement0.value)
        }
      }
      request.prefetch?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("prefetch", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("prefetch" + "[" + formIndex1 + "]", formElement1.value)
          }
        }
      }
      request.returnUrl?.let { formValue0 ->
        form.add("return_url", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'financial_connections' group of Stripe API.
 */
public class FinancialConnectionsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@FinancialConnectionsClient.authentication)

  /**
   * <p>Returns a list of Financial Connections <code>Account</code> objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param accountHolder If present, only return accounts that belong to the specified account holder.
   * `account_holder[customer]` and `account_holder[account]` are mutually exclusive.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param session If present, only return accounts that were collected as part of the given session.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getFinancialConnectionsAccountsWithResponse(
    request: JsonObject? = null,
    accountHolder: InlineV1FinancialConnectionsAccountsGetParameterX92df6887? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    session: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFinancialConnectionsAccountsResponse> = executor.executeWithResponse<JsonObject?, GetFinancialConnectionsAccountsResponse>(SdkExecutionRequest(getFinancialConnectionsAccountsMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.GETFINANCIALCONNECTIONSACCOUNTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "account_holder[account]", values = accountHolder?.account?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "account_holder[customer]", values = accountHolder?.customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "account_holder[customer_account]", values = accountHolder?.customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "session", values = session?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), FinancialConnectionsCodecs.getFinancialConnectionsAccountsRequestCodecRegistry, GetFinancialConnectionsAccountsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an Financial Connections <code>Account</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getFinancialConnectionsAccountsAccountWithResponse(
    request: JsonObject? = null,
    account: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFinancialConnectionsAccountsAccountResponse> = executor.executeWithResponse<JsonObject?, GetFinancialConnectionsAccountsAccountResponse>(SdkExecutionRequest(getFinancialConnectionsAccountsAccountMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.GETFINANCIALCONNECTIONSACCOUNTSACCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), FinancialConnectionsCodecs.getFinancialConnectionsAccountsAccountRequestCodecRegistry, GetFinancialConnectionsAccountsAccountResponseDecoder, options)

  /**
   * <p>Lists all owners for a given <code>Account</code></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param ownership The ID of the ownership object to fetch owners from.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getFinancialConnectionsAccountsAccountOwnersWithResponse(
    request: JsonObject? = null,
    account: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    ownership: String,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFinancialConnectionsAccountsAccountOwnersResponse> = executor.executeWithResponse<JsonObject?, GetFinancialConnectionsAccountsAccountOwnersResponse>(SdkExecutionRequest(getFinancialConnectionsAccountsAccountOwnersMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.GETFINANCIALCONNECTIONSACCOUNTSACCOUNTOWNERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ownership", values = listOf(ownership.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), FinancialConnectionsCodecs.getFinancialConnectionsAccountsAccountOwnersRequestCodecRegistry, GetFinancialConnectionsAccountsAccountOwnersResponseDecoder, options)

  /**
   * <p>Retrieves the details of a Financial Connections <code>Session</code></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getFinancialConnectionsSessionsSessionWithResponse(
    request: JsonObject? = null,
    session: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFinancialConnectionsSessionsSessionResponse> = executor.executeWithResponse<JsonObject?, GetFinancialConnectionsSessionsSessionResponse>(SdkExecutionRequest(getFinancialConnectionsSessionsSessionMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.GETFINANCIALCONNECTIONSSESSIONSSESSION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), FinancialConnectionsCodecs.getFinancialConnectionsSessionsSessionRequestCodecRegistry, GetFinancialConnectionsSessionsSessionResponseDecoder, options)

  /**
   * <p>Returns a list of Financial Connections <code>Transaction</code> objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account The ID of the Financial Connections Account whose transactions will be retrieved.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param transactedAt A filter on the list based on the object `transacted_at` field. The value can be a string with
   * an integer Unix timestamp, or it can be a dictionary with the following options:
   * @param transactionRefresh A filter on the list based on the object `transaction_refresh` field. The value can be a
   * dictionary with the following options:
   * @param options Execution options.
   */
  public suspend fun getFinancialConnectionsTransactionsWithResponse(
    request: JsonObject? = null,
    account: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    transactedAt: InlineV1FinancialConnectionsTransactionsGetParameterX2ce9f0ef? = null,
    transactionRefresh: InlineV1FinancialConnectionsTransactionsGetParameterXc57500ed? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFinancialConnectionsTransactionsResponse> = executor.executeWithResponse<JsonObject?, GetFinancialConnectionsTransactionsResponse>(SdkExecutionRequest(getFinancialConnectionsTransactionsMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.GETFINANCIALCONNECTIONSTRANSACTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "transacted_at", values = transactedAt?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "transaction_refresh[after]", values = transactionRefresh?.after?.let { listOf(it.toString()) }.orEmpty()))
  }), FinancialConnectionsCodecs.getFinancialConnectionsTransactionsRequestCodecRegistry, GetFinancialConnectionsTransactionsResponseDecoder, options)

  /**
   * <p>Retrieves the details of a Financial Connections <code>Transaction</code></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param transaction Wire parameter `transaction`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getFinancialConnectionsTransactionsTransactionWithResponse(
    request: JsonObject? = null,
    transaction: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetFinancialConnectionsTransactionsTransactionResponse> = executor.executeWithResponse<JsonObject?, GetFinancialConnectionsTransactionsTransactionResponse>(SdkExecutionRequest(getFinancialConnectionsTransactionsTransactionMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.GETFINANCIALCONNECTIONSTRANSACTIONSTRANSACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), FinancialConnectionsCodecs.getFinancialConnectionsTransactionsTransactionRequestCodecRegistry, GetFinancialConnectionsTransactionsTransactionResponseDecoder, options)

  /**
   * <p>Disables your access to a Financial Connections <code>Account</code>. You will no longer be able to access data
   * associated with the account (e.g. balances, transactions).</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postFinancialConnectionsAccountsAccountDisconnectWithResponse(
    request: InlineV1FinancialConnectionsAccountsDisconnectPostRequestFormXb1f91171? = null,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostFinancialConnectionsAccountsAccountDisconnectResponse> = executor.executeWithResponse<InlineV1FinancialConnectionsAccountsDisconnectPostRequestFormXb1f91171?, PostFinancialConnectionsAccountsAccountDisconnectResponse>(SdkExecutionRequest(postFinancialConnectionsAccountsAccountDisconnectMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.POSTFINANCIALCONNECTIONSACCOUNTSACCOUNTDISCONNECT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountDisconnectRequestCodecRegistry, PostFinancialConnectionsAccountsAccountDisconnectResponseDecoder, options)

  /**
   * <p>Refreshes the data associated with a Financial Connections <code>Account</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postFinancialConnectionsAccountsAccountRefreshWithResponse(
    request: InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostFinancialConnectionsAccountsAccountRefreshResponse> = executor.executeWithResponse<InlineV1FinancialConnectionsAccountsRefreshPostRequestFormX04970f4e, PostFinancialConnectionsAccountsAccountRefreshResponse>(SdkExecutionRequest(postFinancialConnectionsAccountsAccountRefreshMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.POSTFINANCIALCONNECTIONSACCOUNTSACCOUNTREFRESH_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountRefreshRequestCodecRegistry, PostFinancialConnectionsAccountsAccountRefreshResponseDecoder, options)

  /**
   * <p>Subscribes to periodic refreshes of data associated with a Financial Connections <code>Account</code>. When the
   * account status is active, data is typically refreshed once a day.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postFinancialConnectionsAccountsAccountSubscribeWithResponse(
    request: InlineV1FinancialConnectionsAccountsSubscribePostRequestFormX6fca75e5,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostFinancialConnectionsAccountsAccountSubscribeResponse> = executor.executeWithResponse<InlineV1FinancialConnectionsAccountsSubscribePostRequestFormX6fca75e5, PostFinancialConnectionsAccountsAccountSubscribeResponse>(SdkExecutionRequest(postFinancialConnectionsAccountsAccountSubscribeMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.POSTFINANCIALCONNECTIONSACCOUNTSACCOUNTSUBSCRIBE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountSubscribeRequestCodecRegistry, PostFinancialConnectionsAccountsAccountSubscribeResponseDecoder, options)

  /**
   * <p>Unsubscribes from periodic refreshes of data associated with a Financial Connections <code>Account</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postFinancialConnectionsAccountsAccountUnsubscribeWithResponse(
    request: InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostFinancialConnectionsAccountsAccountUnsubscribeResponse> = executor.executeWithResponse<InlineV1FinancialConnectionsAccountsUnsubscribePostRequestFormXaf4dab83, PostFinancialConnectionsAccountsAccountUnsubscribeResponse>(SdkExecutionRequest(postFinancialConnectionsAccountsAccountUnsubscribeMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.POSTFINANCIALCONNECTIONSACCOUNTSACCOUNTUNSUBSCRIBE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountUnsubscribeRequestCodecRegistry, PostFinancialConnectionsAccountsAccountUnsubscribeResponseDecoder, options)

  /**
   * <p>To launch the Financial Connections authorization flow, create a <code>Session</code>. The session’s
   * <code>client_secret</code> can be used to launch the flow using Stripe.js.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postFinancialConnectionsSessionsWithResponse(request: InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23, options: CallOptions = CallOptions()): SdkResponseResult<PostFinancialConnectionsSessionsResponse> = executor.executeWithResponse<InlineV1FinancialConnectionsSessionsPostRequestFormX39981d23, PostFinancialConnectionsSessionsResponse>(SdkExecutionRequest(postFinancialConnectionsSessionsMetadata, baseUri, request, listOf(FinancialConnectionsCodecs.POSTFINANCIALCONNECTIONSSESSIONS_REQUEST_CODEC_ID), emptyList()), FinancialConnectionsCodecs.postFinancialConnectionsSessionsRequestCodecRegistry, PostFinancialConnectionsSessionsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetFinancialConnectionsAccounts`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetFinancialConnectionsAccountsResponse {
    public class SuccessJson(
      public val json: InlineV1FinancialConnectionsAccountsGetResponse200JsonX05219cda,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsResponse
  }

  private object GetFinancialConnectionsAccountsResponseDecoder : SdkResponseAlternativeDecoder<GetFinancialConnectionsAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFinancialConnectionsAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFinancialConnectionsAccountsResponse> = when {
      alternative.id == "GetFinancialConnectionsAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsAccountsResponse.SuccessJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsAccountsResponseCodecAlternative0Registry.select(listOf("GetFinancialConnectionsAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFinancialConnectionsAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsAccountsResponse.DefaultJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsAccountsResponseCodecAlternative1Registry.select(listOf("GetFinancialConnectionsAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFinancialConnectionsAccountsResponse = GetFinancialConnectionsAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetFinancialConnectionsAccountsAccount`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetFinancialConnectionsAccountsAccountResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsAccountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsAccountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsAccountResponse
  }

  private object GetFinancialConnectionsAccountsAccountResponseDecoder : SdkResponseAlternativeDecoder<GetFinancialConnectionsAccountsAccountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFinancialConnectionsAccountsAccountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFinancialConnectionsAccountsAccountResponse> = when {
      alternative.id == "GetFinancialConnectionsAccountsAccount.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsAccountsAccountResponse.SuccessJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsAccountsAccountResponseCodecAlternative0Registry.select(listOf("GetFinancialConnectionsAccountsAccount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFinancialConnectionsAccountsAccount.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsAccountsAccountResponse.DefaultJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsAccountsAccountResponseCodecAlternative1Registry.select(listOf("GetFinancialConnectionsAccountsAccount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFinancialConnectionsAccountsAccountResponse = GetFinancialConnectionsAccountsAccountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetFinancialConnectionsAccountsAccountOwners`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetFinancialConnectionsAccountsAccountOwnersResponse {
    public class SuccessJson(
      public val json: InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonX23ddc376,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsAccountOwnersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsAccountOwnersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsAccountsAccountOwnersResponse
  }

  private object GetFinancialConnectionsAccountsAccountOwnersResponseDecoder : SdkResponseAlternativeDecoder<GetFinancialConnectionsAccountsAccountOwnersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFinancialConnectionsAccountsAccountOwnersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFinancialConnectionsAccountsAccountOwnersResponse> = when {
      alternative.id == "GetFinancialConnectionsAccountsAccountOwners.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsAccountsAccountOwnersResponse.SuccessJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsAccountsAccountOwnersResponseCodecAlternative0Registry.select(listOf("GetFinancialConnectionsAccountsAccountOwners.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFinancialConnectionsAccountsAccountOwners.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsAccountsAccountOwnersResponse.DefaultJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsAccountsAccountOwnersResponseCodecAlternative1Registry.select(listOf("GetFinancialConnectionsAccountsAccountOwners.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFinancialConnectionsAccountsAccountOwnersResponse = GetFinancialConnectionsAccountsAccountOwnersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetFinancialConnectionsSessionsSession`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetFinancialConnectionsSessionsSessionResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsSessionsSessionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsSessionsSessionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsSessionsSessionResponse
  }

  private object GetFinancialConnectionsSessionsSessionResponseDecoder : SdkResponseAlternativeDecoder<GetFinancialConnectionsSessionsSessionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFinancialConnectionsSessionsSessionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFinancialConnectionsSessionsSessionResponse> = when {
      alternative.id == "GetFinancialConnectionsSessionsSession.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsSessionsSessionResponse.SuccessJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsSessionsSessionResponseCodecAlternative0Registry.select(listOf("GetFinancialConnectionsSessionsSession.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFinancialConnectionsSessionsSession.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsSessionsSessionResponse.DefaultJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsSessionsSessionResponseCodecAlternative1Registry.select(listOf("GetFinancialConnectionsSessionsSession.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFinancialConnectionsSessionsSessionResponse = GetFinancialConnectionsSessionsSessionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetFinancialConnectionsTransactions`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetFinancialConnectionsTransactionsResponse {
    public class SuccessJson(
      public val json: InlineV1FinancialConnectionsTransactionsGetResponse200JsonX6b537f34,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsTransactionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsTransactionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsTransactionsResponse
  }

  private object GetFinancialConnectionsTransactionsResponseDecoder : SdkResponseAlternativeDecoder<GetFinancialConnectionsTransactionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFinancialConnectionsTransactionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFinancialConnectionsTransactionsResponse> = when {
      alternative.id == "GetFinancialConnectionsTransactions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsTransactionsResponse.SuccessJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsTransactionsResponseCodecAlternative0Registry.select(listOf("GetFinancialConnectionsTransactions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFinancialConnectionsTransactions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsTransactionsResponse.DefaultJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsTransactionsResponseCodecAlternative1Registry.select(listOf("GetFinancialConnectionsTransactions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFinancialConnectionsTransactionsResponse = GetFinancialConnectionsTransactionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetFinancialConnectionsTransactionsTransaction`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetFinancialConnectionsTransactionsTransactionResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsTransactionsTransactionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsTransactionsTransactionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetFinancialConnectionsTransactionsTransactionResponse
  }

  private object GetFinancialConnectionsTransactionsTransactionResponseDecoder : SdkResponseAlternativeDecoder<GetFinancialConnectionsTransactionsTransactionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetFinancialConnectionsTransactionsTransactionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetFinancialConnectionsTransactionsTransactionResponse> = when {
      alternative.id == "GetFinancialConnectionsTransactionsTransaction.response.alternative0" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsTransactionsTransactionResponse.SuccessJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsTransactionsTransactionResponseCodecAlternative0Registry.select(listOf("GetFinancialConnectionsTransactionsTransaction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetFinancialConnectionsTransactionsTransaction.response.alternative1" -> SdkResponseDecodeResult(
        value = GetFinancialConnectionsTransactionsTransactionResponse.DefaultJson(
          json = FinancialConnectionsCodecs.getFinancialConnectionsTransactionsTransactionResponseCodecAlternative1Registry.select(listOf("GetFinancialConnectionsTransactionsTransaction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetFinancialConnectionsTransactionsTransactionResponse = GetFinancialConnectionsTransactionsTransactionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostFinancialConnectionsAccountsAccountDisconnect`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostFinancialConnectionsAccountsAccountDisconnectResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountDisconnectResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountDisconnectResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountDisconnectResponse
  }

  private object PostFinancialConnectionsAccountsAccountDisconnectResponseDecoder : SdkResponseAlternativeDecoder<PostFinancialConnectionsAccountsAccountDisconnectResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostFinancialConnectionsAccountsAccountDisconnectResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostFinancialConnectionsAccountsAccountDisconnectResponse> = when {
      alternative.id == "PostFinancialConnectionsAccountsAccountDisconnect.response.alternative0" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsAccountsAccountDisconnectResponse.SuccessJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountDisconnectResponseCodecAlternative0Registry.select(listOf("PostFinancialConnectionsAccountsAccountDisconnect.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostFinancialConnectionsAccountsAccountDisconnect.response.alternative1" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsAccountsAccountDisconnectResponse.DefaultJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountDisconnectResponseCodecAlternative1Registry.select(listOf("PostFinancialConnectionsAccountsAccountDisconnect.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostFinancialConnectionsAccountsAccountDisconnectResponse = PostFinancialConnectionsAccountsAccountDisconnectResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostFinancialConnectionsAccountsAccountRefresh`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostFinancialConnectionsAccountsAccountRefreshResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountRefreshResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountRefreshResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountRefreshResponse
  }

  private object PostFinancialConnectionsAccountsAccountRefreshResponseDecoder : SdkResponseAlternativeDecoder<PostFinancialConnectionsAccountsAccountRefreshResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostFinancialConnectionsAccountsAccountRefreshResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostFinancialConnectionsAccountsAccountRefreshResponse> = when {
      alternative.id == "PostFinancialConnectionsAccountsAccountRefresh.response.alternative0" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsAccountsAccountRefreshResponse.SuccessJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountRefreshResponseCodecAlternative0Registry.select(listOf("PostFinancialConnectionsAccountsAccountRefresh.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostFinancialConnectionsAccountsAccountRefresh.response.alternative1" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsAccountsAccountRefreshResponse.DefaultJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountRefreshResponseCodecAlternative1Registry.select(listOf("PostFinancialConnectionsAccountsAccountRefresh.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostFinancialConnectionsAccountsAccountRefreshResponse = PostFinancialConnectionsAccountsAccountRefreshResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostFinancialConnectionsAccountsAccountSubscribe`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostFinancialConnectionsAccountsAccountSubscribeResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountSubscribeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountSubscribeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountSubscribeResponse
  }

  private object PostFinancialConnectionsAccountsAccountSubscribeResponseDecoder : SdkResponseAlternativeDecoder<PostFinancialConnectionsAccountsAccountSubscribeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostFinancialConnectionsAccountsAccountSubscribeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostFinancialConnectionsAccountsAccountSubscribeResponse> = when {
      alternative.id == "PostFinancialConnectionsAccountsAccountSubscribe.response.alternative0" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsAccountsAccountSubscribeResponse.SuccessJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountSubscribeResponseCodecAlternative0Registry.select(listOf("PostFinancialConnectionsAccountsAccountSubscribe.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostFinancialConnectionsAccountsAccountSubscribe.response.alternative1" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsAccountsAccountSubscribeResponse.DefaultJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountSubscribeResponseCodecAlternative1Registry.select(listOf("PostFinancialConnectionsAccountsAccountSubscribe.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostFinancialConnectionsAccountsAccountSubscribeResponse = PostFinancialConnectionsAccountsAccountSubscribeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostFinancialConnectionsAccountsAccountUnsubscribe`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostFinancialConnectionsAccountsAccountUnsubscribeResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountUnsubscribeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountUnsubscribeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsAccountsAccountUnsubscribeResponse
  }

  private object PostFinancialConnectionsAccountsAccountUnsubscribeResponseDecoder : SdkResponseAlternativeDecoder<PostFinancialConnectionsAccountsAccountUnsubscribeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostFinancialConnectionsAccountsAccountUnsubscribeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostFinancialConnectionsAccountsAccountUnsubscribeResponse> = when {
      alternative.id == "PostFinancialConnectionsAccountsAccountUnsubscribe.response.alternative0" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsAccountsAccountUnsubscribeResponse.SuccessJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountUnsubscribeResponseCodecAlternative0Registry.select(listOf("PostFinancialConnectionsAccountsAccountUnsubscribe.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostFinancialConnectionsAccountsAccountUnsubscribe.response.alternative1" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsAccountsAccountUnsubscribeResponse.DefaultJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsAccountsAccountUnsubscribeResponseCodecAlternative1Registry.select(listOf("PostFinancialConnectionsAccountsAccountUnsubscribe.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostFinancialConnectionsAccountsAccountUnsubscribeResponse = PostFinancialConnectionsAccountsAccountUnsubscribeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostFinancialConnectionsSessions`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostFinancialConnectionsSessionsResponse {
    public class SuccessJson(
      public val json: FinancialConnectionsSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsSessionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsSessionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostFinancialConnectionsSessionsResponse
  }

  private object PostFinancialConnectionsSessionsResponseDecoder : SdkResponseAlternativeDecoder<PostFinancialConnectionsSessionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostFinancialConnectionsSessionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostFinancialConnectionsSessionsResponse> = when {
      alternative.id == "PostFinancialConnectionsSessions.response.alternative0" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsSessionsResponse.SuccessJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsSessionsResponseCodecAlternative0Registry.select(listOf("PostFinancialConnectionsSessions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostFinancialConnectionsSessions.response.alternative1" -> SdkResponseDecodeResult(
        value = PostFinancialConnectionsSessionsResponse.DefaultJson(
          json = FinancialConnectionsCodecs.postFinancialConnectionsSessionsResponseCodecAlternative1Registry.select(listOf("PostFinancialConnectionsSessions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostFinancialConnectionsSessionsResponse = PostFinancialConnectionsSessionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getFinancialConnectionsAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFinancialConnectionsAccounts",
          method = "GET",
          path = "/v1/financial_connections/accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1FinancialConnectionsAccountsGetResponse200JsonX05219cda",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsAccounts.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val getFinancialConnectionsAccountsAccountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFinancialConnectionsAccountsAccount",
          method = "GET",
          path = "/v1/financial_connections/accounts/{account}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsAccountsAccount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsAccountsAccount.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val getFinancialConnectionsAccountsAccountOwnersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFinancialConnectionsAccountsAccountOwners",
          method = "GET",
          path = "/v1/financial_connections/accounts/{account}/owners",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1FinancialConnectionsAccountsOwnersGetResponse200JsonX23ddc376",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsAccountsAccountOwners.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsAccountsAccountOwners.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val getFinancialConnectionsSessionsSessionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFinancialConnectionsSessionsSession",
          method = "GET",
          path = "/v1/financial_connections/sessions/{session}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsSession",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsSessionsSession.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsSessionsSession.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val getFinancialConnectionsTransactionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFinancialConnectionsTransactions",
          method = "GET",
          path = "/v1/financial_connections/transactions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1FinancialConnectionsTransactionsGetResponse200JsonX6b537f34",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsTransactions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsTransactions.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val getFinancialConnectionsTransactionsTransactionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetFinancialConnectionsTransactionsTransaction",
          method = "GET",
          path = "/v1/financial_connections/transactions/{transaction}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsTransactionsTransaction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetFinancialConnectionsTransactionsTransaction.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val postFinancialConnectionsAccountsAccountDisconnectMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostFinancialConnectionsAccountsAccountDisconnect",
          method = "POST",
          path = "/v1/financial_connections/accounts/{account}/disconnect",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsAccountsAccountDisconnect.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsAccountsAccountDisconnect.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val postFinancialConnectionsAccountsAccountRefreshMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostFinancialConnectionsAccountsAccountRefresh",
          method = "POST",
          path = "/v1/financial_connections/accounts/{account}/refresh",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsAccountsAccountRefresh.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsAccountsAccountRefresh.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val postFinancialConnectionsAccountsAccountSubscribeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostFinancialConnectionsAccountsAccountSubscribe",
          method = "POST",
          path = "/v1/financial_connections/accounts/{account}/subscribe",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsAccountsAccountSubscribe.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsAccountsAccountSubscribe.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val postFinancialConnectionsAccountsAccountUnsubscribeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostFinancialConnectionsAccountsAccountUnsubscribe",
          method = "POST",
          path = "/v1/financial_connections/accounts/{account}/unsubscribe",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsAccountsAccountUnsubscribe.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsAccountsAccountUnsubscribe.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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

    internal val postFinancialConnectionsSessionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostFinancialConnectionsSessions",
          method = "POST",
          path = "/v1/financial_connections/sessions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FinancialConnectionsSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsSessions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostFinancialConnectionsSessions.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
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
  }
}
