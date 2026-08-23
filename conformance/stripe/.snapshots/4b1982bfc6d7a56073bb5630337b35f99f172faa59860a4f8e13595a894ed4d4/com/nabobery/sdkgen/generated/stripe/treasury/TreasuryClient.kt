package com.nabobery.sdkgen.generated.stripe.treasury

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryCreditReversalsGetParameterX874277c2
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryCreditReversalsGetResponse200JsonX4cbf142d
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryDebitReversalsGetParameterX0e44ceda
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryDebitReversalsGetParameterX84bd6647
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryDebitReversalsGetResponse200JsonXa5dd1c17
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryDebitReversalsPostRequestFormX38af54e6
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsGetParameterXebac99ba
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsGetResponse200JsonXdd9dd9cc
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryInboundTransfersCancelPostRequestFormX83200b6b
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryInboundTransfersGetParameterX74be2205
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryInboundTransfersGetResponse200JsonX15316233
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPaymentsCancelPostRequestFormXdfc90153
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPaymentsGetResponse200JsonXc65b19e1
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTransfersCancelPostRequestFormX6408d71e
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTransfersGetResponse200JsonXb5c8977f
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTransfersPostRequestFormX91512707
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedCreditsGetParameterX658e403e
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedCreditsGetParameterX66380fdb
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedCreditsGetResponse200JsonX654d8f88
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedDebitsGetResponse200JsonX99ded6cc
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryTransactionEntriesGetParameterXced22640
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryTransactionEntriesGetParameterXe212d009
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b
import com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryTransactionEntriesGetResponse200JsonXdc4dd827
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.TreasuryCreditReversal
import com.nabobery.sdkgen.generated.stripe.TreasuryDebitReversal
import com.nabobery.sdkgen.generated.stripe.TreasuryFinancialAccount
import com.nabobery.sdkgen.generated.stripe.TreasuryFinancialAccountFeatures
import com.nabobery.sdkgen.generated.stripe.TreasuryInboundTransfer
import com.nabobery.sdkgen.generated.stripe.TreasuryOutboundPayment
import com.nabobery.sdkgen.generated.stripe.TreasuryOutboundTransfer
import com.nabobery.sdkgen.generated.stripe.TreasuryReceivedCredit
import com.nabobery.sdkgen.generated.stripe.TreasuryReceivedDebit
import com.nabobery.sdkgen.generated.stripe.TreasuryTransaction
import com.nabobery.sdkgen.generated.stripe.TreasuryTransactionEntry
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object TreasuryCodecs {
  internal const val GETTREASURYCREDITREVERSALS_REQUEST_CODEC_ID: String =
      "GetTreasuryCreditReversals.request"

  private val getTreasuryCreditReversalsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryCreditReversalsFormCodec

  private val getTreasuryCreditReversalsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryCreditReversalsGetResponse200JsonX4cbf142d> =
      KotlinxSerializationCodec("GetTreasuryCreditReversals.response.alternative0", InlineV1TreasuryCreditReversalsGetResponse200JsonX4cbf142d.Serializer, SdkJson)

  internal val getTreasuryCreditReversalsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryCreditReversalsGetResponse200JsonX4cbf142d> =
      MediaTypeCodecRegistry.of(getTreasuryCreditReversalsResponseCodecAlternative0Codec)

  private val getTreasuryCreditReversalsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryCreditReversals.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryCreditReversalsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryCreditReversalsResponseCodecAlternative1Codec)

  internal val getTreasuryCreditReversalsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryCreditReversalsRequestCodec)

  internal const val GETTREASURYCREDITREVERSALSCREDITREVERSAL_REQUEST_CODEC_ID: String =
      "GetTreasuryCreditReversalsCreditReversal.request"

  private val getTreasuryCreditReversalsCreditReversalRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryCreditReversalsCreditReversalFormCodec

  private val getTreasuryCreditReversalsCreditReversalResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryCreditReversal> =
      KotlinxSerializationCodec("GetTreasuryCreditReversalsCreditReversal.response.alternative0", TreasuryCreditReversal.Serializer, SdkJson)

  internal val getTreasuryCreditReversalsCreditReversalResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryCreditReversal> =
      MediaTypeCodecRegistry.of(getTreasuryCreditReversalsCreditReversalResponseCodecAlternative0Codec)

  private val getTreasuryCreditReversalsCreditReversalResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryCreditReversalsCreditReversal.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryCreditReversalsCreditReversalResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryCreditReversalsCreditReversalResponseCodecAlternative1Codec)

  internal val getTreasuryCreditReversalsCreditReversalRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryCreditReversalsCreditReversalRequestCodec)

  internal const val GETTREASURYDEBITREVERSALS_REQUEST_CODEC_ID: String =
      "GetTreasuryDebitReversals.request"

  private val getTreasuryDebitReversalsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryDebitReversalsFormCodec

  private val getTreasuryDebitReversalsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryDebitReversalsGetResponse200JsonXa5dd1c17> =
      KotlinxSerializationCodec("GetTreasuryDebitReversals.response.alternative0", InlineV1TreasuryDebitReversalsGetResponse200JsonXa5dd1c17.Serializer, SdkJson)

  internal val getTreasuryDebitReversalsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryDebitReversalsGetResponse200JsonXa5dd1c17> =
      MediaTypeCodecRegistry.of(getTreasuryDebitReversalsResponseCodecAlternative0Codec)

  private val getTreasuryDebitReversalsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryDebitReversals.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryDebitReversalsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryDebitReversalsResponseCodecAlternative1Codec)

  internal val getTreasuryDebitReversalsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryDebitReversalsRequestCodec)

  internal const val GETTREASURYDEBITREVERSALSDEBITREVERSAL_REQUEST_CODEC_ID: String =
      "GetTreasuryDebitReversalsDebitReversal.request"

  private val getTreasuryDebitReversalsDebitReversalRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryDebitReversalsDebitReversalFormCodec

  private val getTreasuryDebitReversalsDebitReversalResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryDebitReversal> =
      KotlinxSerializationCodec("GetTreasuryDebitReversalsDebitReversal.response.alternative0", TreasuryDebitReversal.Serializer, SdkJson)

  internal val getTreasuryDebitReversalsDebitReversalResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryDebitReversal> =
      MediaTypeCodecRegistry.of(getTreasuryDebitReversalsDebitReversalResponseCodecAlternative0Codec)

  private val getTreasuryDebitReversalsDebitReversalResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryDebitReversalsDebitReversal.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryDebitReversalsDebitReversalResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryDebitReversalsDebitReversalResponseCodecAlternative1Codec)

  internal val getTreasuryDebitReversalsDebitReversalRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryDebitReversalsDebitReversalRequestCodec)

  internal const val GETTREASURYFINANCIALACCOUNTS_REQUEST_CODEC_ID: String =
      "GetTreasuryFinancialAccounts.request"

  private val getTreasuryFinancialAccountsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryFinancialAccountsFormCodec

  private val getTreasuryFinancialAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryFinancialAccountsGetResponse200JsonXdd9dd9cc> =
      KotlinxSerializationCodec("GetTreasuryFinancialAccounts.response.alternative0", InlineV1TreasuryFinancialAccountsGetResponse200JsonXdd9dd9cc.Serializer, SdkJson)

  internal val getTreasuryFinancialAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryFinancialAccountsGetResponse200JsonXdd9dd9cc> =
      MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsResponseCodecAlternative0Codec)

  private val getTreasuryFinancialAccountsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryFinancialAccounts.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryFinancialAccountsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsResponseCodecAlternative1Codec)

  internal val getTreasuryFinancialAccountsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsRequestCodec)

  internal const val GETTREASURYFINANCIALACCOUNTSFINANCIALACCOUNT_REQUEST_CODEC_ID: String =
      "GetTreasuryFinancialAccountsFinancialAccount.request"

  private val getTreasuryFinancialAccountsFinancialAccountRequestCodec: MediaTypeCodec<JsonObject?>
      = GetTreasuryFinancialAccountsFinancialAccountFormCodec

  private val getTreasuryFinancialAccountsFinancialAccountResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryFinancialAccount> =
      KotlinxSerializationCodec("GetTreasuryFinancialAccountsFinancialAccount.response.alternative0", TreasuryFinancialAccount.Serializer, SdkJson)

  internal val getTreasuryFinancialAccountsFinancialAccountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryFinancialAccount> =
      MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsFinancialAccountResponseCodecAlternative0Codec)

  private val getTreasuryFinancialAccountsFinancialAccountResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryFinancialAccountsFinancialAccount.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryFinancialAccountsFinancialAccountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsFinancialAccountResponseCodecAlternative1Codec)

  internal val getTreasuryFinancialAccountsFinancialAccountRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsFinancialAccountRequestCodec)

  internal const val GETTREASURYFINANCIALACCOUNTSFINANCIALACCOUNTFEATURES_REQUEST_CODEC_ID: String =
      "GetTreasuryFinancialAccountsFinancialAccountFeatures.request"

  private val getTreasuryFinancialAccountsFinancialAccountFeaturesRequestCodec:
      MediaTypeCodec<JsonObject?> = GetTreasuryFinancialAccountsFinancialAccountFeaturesFormCodec

  private val getTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryFinancialAccountFeatures> =
      KotlinxSerializationCodec("GetTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative0", TreasuryFinancialAccountFeatures.Serializer, SdkJson)

  internal val getTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryFinancialAccountFeatures> =
      MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative0Codec)

  private val getTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative1Codec)

  internal val getTreasuryFinancialAccountsFinancialAccountFeaturesRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryFinancialAccountsFinancialAccountFeaturesRequestCodec)

  internal const val GETTREASURYINBOUNDTRANSFERS_REQUEST_CODEC_ID: String =
      "GetTreasuryInboundTransfers.request"

  private val getTreasuryInboundTransfersRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryInboundTransfersFormCodec

  private val getTreasuryInboundTransfersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryInboundTransfersGetResponse200JsonX15316233> =
      KotlinxSerializationCodec("GetTreasuryInboundTransfers.response.alternative0", InlineV1TreasuryInboundTransfersGetResponse200JsonX15316233.Serializer, SdkJson)

  internal val getTreasuryInboundTransfersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryInboundTransfersGetResponse200JsonX15316233> =
      MediaTypeCodecRegistry.of(getTreasuryInboundTransfersResponseCodecAlternative0Codec)

  private val getTreasuryInboundTransfersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryInboundTransfers.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryInboundTransfersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryInboundTransfersResponseCodecAlternative1Codec)

  internal val getTreasuryInboundTransfersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getTreasuryInboundTransfersRequestCodec)

  internal const val GETTREASURYINBOUNDTRANSFERSID_REQUEST_CODEC_ID: String =
      "GetTreasuryInboundTransfersId.request"

  private val getTreasuryInboundTransfersIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryInboundTransfersIdFormCodec

  private val getTreasuryInboundTransfersIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryInboundTransfer> =
      KotlinxSerializationCodec("GetTreasuryInboundTransfersId.response.alternative0", TreasuryInboundTransfer.Serializer, SdkJson)

  internal val getTreasuryInboundTransfersIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryInboundTransfer> =
      MediaTypeCodecRegistry.of(getTreasuryInboundTransfersIdResponseCodecAlternative0Codec)

  private val getTreasuryInboundTransfersIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryInboundTransfersId.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryInboundTransfersIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryInboundTransfersIdResponseCodecAlternative1Codec)

  internal val getTreasuryInboundTransfersIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryInboundTransfersIdRequestCodec)

  internal const val GETTREASURYOUTBOUNDPAYMENTS_REQUEST_CODEC_ID: String =
      "GetTreasuryOutboundPayments.request"

  private val getTreasuryOutboundPaymentsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryOutboundPaymentsFormCodec

  private val getTreasuryOutboundPaymentsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryOutboundPaymentsGetResponse200JsonXc65b19e1> =
      KotlinxSerializationCodec("GetTreasuryOutboundPayments.response.alternative0", InlineV1TreasuryOutboundPaymentsGetResponse200JsonXc65b19e1.Serializer, SdkJson)

  internal val getTreasuryOutboundPaymentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryOutboundPaymentsGetResponse200JsonXc65b19e1> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundPaymentsResponseCodecAlternative0Codec)

  private val getTreasuryOutboundPaymentsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryOutboundPayments.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryOutboundPaymentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundPaymentsResponseCodecAlternative1Codec)

  internal val getTreasuryOutboundPaymentsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getTreasuryOutboundPaymentsRequestCodec)

  internal const val GETTREASURYOUTBOUNDPAYMENTSID_REQUEST_CODEC_ID: String =
      "GetTreasuryOutboundPaymentsId.request"

  private val getTreasuryOutboundPaymentsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryOutboundPaymentsIdFormCodec

  private val getTreasuryOutboundPaymentsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundPayment> =
      KotlinxSerializationCodec("GetTreasuryOutboundPaymentsId.response.alternative0", TreasuryOutboundPayment.Serializer, SdkJson)

  internal val getTreasuryOutboundPaymentsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundPayment> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundPaymentsIdResponseCodecAlternative0Codec)

  private val getTreasuryOutboundPaymentsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryOutboundPaymentsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryOutboundPaymentsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundPaymentsIdResponseCodecAlternative1Codec)

  internal val getTreasuryOutboundPaymentsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundPaymentsIdRequestCodec)

  internal const val GETTREASURYOUTBOUNDTRANSFERS_REQUEST_CODEC_ID: String =
      "GetTreasuryOutboundTransfers.request"

  private val getTreasuryOutboundTransfersRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryOutboundTransfersFormCodec

  private val getTreasuryOutboundTransfersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryOutboundTransfersGetResponse200JsonXb5c8977f> =
      KotlinxSerializationCodec("GetTreasuryOutboundTransfers.response.alternative0", InlineV1TreasuryOutboundTransfersGetResponse200JsonXb5c8977f.Serializer, SdkJson)

  internal val getTreasuryOutboundTransfersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryOutboundTransfersGetResponse200JsonXb5c8977f> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundTransfersResponseCodecAlternative0Codec)

  private val getTreasuryOutboundTransfersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryOutboundTransfers.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryOutboundTransfersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundTransfersResponseCodecAlternative1Codec)

  internal val getTreasuryOutboundTransfersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getTreasuryOutboundTransfersRequestCodec)

  internal const val GETTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFER_REQUEST_CODEC_ID: String =
      "GetTreasuryOutboundTransfersOutboundTransfer.request"

  private val getTreasuryOutboundTransfersOutboundTransferRequestCodec: MediaTypeCodec<JsonObject?>
      = GetTreasuryOutboundTransfersOutboundTransferFormCodec

  private val getTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundTransfer> =
      KotlinxSerializationCodec("GetTreasuryOutboundTransfersOutboundTransfer.response.alternative0", TreasuryOutboundTransfer.Serializer, SdkJson)

  internal val getTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundTransfer> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative0Codec)

  private val getTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryOutboundTransfersOutboundTransfer.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative1Codec)

  internal val getTreasuryOutboundTransfersOutboundTransferRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryOutboundTransfersOutboundTransferRequestCodec)

  internal const val GETTREASURYRECEIVEDCREDITS_REQUEST_CODEC_ID: String =
      "GetTreasuryReceivedCredits.request"

  private val getTreasuryReceivedCreditsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryReceivedCreditsFormCodec

  private val getTreasuryReceivedCreditsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryReceivedCreditsGetResponse200JsonX654d8f88> =
      KotlinxSerializationCodec("GetTreasuryReceivedCredits.response.alternative0", InlineV1TreasuryReceivedCreditsGetResponse200JsonX654d8f88.Serializer, SdkJson)

  internal val getTreasuryReceivedCreditsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryReceivedCreditsGetResponse200JsonX654d8f88> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedCreditsResponseCodecAlternative0Codec)

  private val getTreasuryReceivedCreditsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryReceivedCredits.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryReceivedCreditsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedCreditsResponseCodecAlternative1Codec)

  internal val getTreasuryReceivedCreditsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedCreditsRequestCodec)

  internal const val GETTREASURYRECEIVEDCREDITSID_REQUEST_CODEC_ID: String =
      "GetTreasuryReceivedCreditsId.request"

  private val getTreasuryReceivedCreditsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryReceivedCreditsIdFormCodec

  private val getTreasuryReceivedCreditsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryReceivedCredit> =
      KotlinxSerializationCodec("GetTreasuryReceivedCreditsId.response.alternative0", TreasuryReceivedCredit.Serializer, SdkJson)

  internal val getTreasuryReceivedCreditsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryReceivedCredit> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedCreditsIdResponseCodecAlternative0Codec)

  private val getTreasuryReceivedCreditsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryReceivedCreditsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryReceivedCreditsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedCreditsIdResponseCodecAlternative1Codec)

  internal val getTreasuryReceivedCreditsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getTreasuryReceivedCreditsIdRequestCodec)

  internal const val GETTREASURYRECEIVEDDEBITS_REQUEST_CODEC_ID: String =
      "GetTreasuryReceivedDebits.request"

  private val getTreasuryReceivedDebitsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryReceivedDebitsFormCodec

  private val getTreasuryReceivedDebitsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryReceivedDebitsGetResponse200JsonX99ded6cc> =
      KotlinxSerializationCodec("GetTreasuryReceivedDebits.response.alternative0", InlineV1TreasuryReceivedDebitsGetResponse200JsonX99ded6cc.Serializer, SdkJson)

  internal val getTreasuryReceivedDebitsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryReceivedDebitsGetResponse200JsonX99ded6cc> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedDebitsResponseCodecAlternative0Codec)

  private val getTreasuryReceivedDebitsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryReceivedDebits.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryReceivedDebitsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedDebitsResponseCodecAlternative1Codec)

  internal val getTreasuryReceivedDebitsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedDebitsRequestCodec)

  internal const val GETTREASURYRECEIVEDDEBITSID_REQUEST_CODEC_ID: String =
      "GetTreasuryReceivedDebitsId.request"

  private val getTreasuryReceivedDebitsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryReceivedDebitsIdFormCodec

  private val getTreasuryReceivedDebitsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryReceivedDebit> =
      KotlinxSerializationCodec("GetTreasuryReceivedDebitsId.response.alternative0", TreasuryReceivedDebit.Serializer, SdkJson)

  internal val getTreasuryReceivedDebitsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryReceivedDebit> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedDebitsIdResponseCodecAlternative0Codec)

  private val getTreasuryReceivedDebitsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryReceivedDebitsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryReceivedDebitsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryReceivedDebitsIdResponseCodecAlternative1Codec)

  internal val getTreasuryReceivedDebitsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getTreasuryReceivedDebitsIdRequestCodec)

  internal const val GETTREASURYTRANSACTIONENTRIES_REQUEST_CODEC_ID: String =
      "GetTreasuryTransactionEntries.request"

  private val getTreasuryTransactionEntriesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryTransactionEntriesFormCodec

  private val getTreasuryTransactionEntriesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TreasuryTransactionEntriesGetResponse200JsonXdc4dd827> =
      KotlinxSerializationCodec("GetTreasuryTransactionEntries.response.alternative0", InlineV1TreasuryTransactionEntriesGetResponse200JsonXdc4dd827.Serializer, SdkJson)

  internal val getTreasuryTransactionEntriesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TreasuryTransactionEntriesGetResponse200JsonXdc4dd827> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionEntriesResponseCodecAlternative0Codec)

  private val getTreasuryTransactionEntriesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryTransactionEntries.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryTransactionEntriesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionEntriesResponseCodecAlternative1Codec)

  internal val getTreasuryTransactionEntriesRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionEntriesRequestCodec)

  internal const val GETTREASURYTRANSACTIONENTRIESID_REQUEST_CODEC_ID: String =
      "GetTreasuryTransactionEntriesId.request"

  private val getTreasuryTransactionEntriesIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryTransactionEntriesIdFormCodec

  private val getTreasuryTransactionEntriesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryTransactionEntry> =
      KotlinxSerializationCodec("GetTreasuryTransactionEntriesId.response.alternative0", TreasuryTransactionEntry.Serializer, SdkJson)

  internal val getTreasuryTransactionEntriesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryTransactionEntry> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionEntriesIdResponseCodecAlternative0Codec)

  private val getTreasuryTransactionEntriesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryTransactionEntriesId.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryTransactionEntriesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionEntriesIdResponseCodecAlternative1Codec)

  internal val getTreasuryTransactionEntriesIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionEntriesIdRequestCodec)

  internal const val GETTREASURYTRANSACTIONSID_REQUEST_CODEC_ID: String =
      "GetTreasuryTransactionsId.request"

  private val getTreasuryTransactionsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTreasuryTransactionsIdFormCodec

  private val getTreasuryTransactionsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryTransaction> =
      KotlinxSerializationCodec("GetTreasuryTransactionsId.response.alternative0", TreasuryTransaction.Serializer, SdkJson)

  internal val getTreasuryTransactionsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryTransaction> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionsIdResponseCodecAlternative0Codec)

  private val getTreasuryTransactionsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTreasuryTransactionsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getTreasuryTransactionsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionsIdResponseCodecAlternative1Codec)

  internal val getTreasuryTransactionsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTreasuryTransactionsIdRequestCodec)

  internal const val POSTTREASURYCREDITREVERSALS_REQUEST_CODEC_ID: String =
      "PostTreasuryCreditReversals.request"

  private val postTreasuryCreditReversalsRequestCodec:
      MediaTypeCodec<InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff> =
      PostTreasuryCreditReversalsFormCodec

  private val postTreasuryCreditReversalsResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryCreditReversal> =
      KotlinxSerializationCodec("PostTreasuryCreditReversals.response.alternative0", TreasuryCreditReversal.Serializer, SdkJson)

  internal val postTreasuryCreditReversalsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryCreditReversal> =
      MediaTypeCodecRegistry.of(postTreasuryCreditReversalsResponseCodecAlternative0Codec)

  private val postTreasuryCreditReversalsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryCreditReversals.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryCreditReversalsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryCreditReversalsResponseCodecAlternative1Codec)

  internal val postTreasuryCreditReversalsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff> =
      MediaTypeCodecRegistry.of(postTreasuryCreditReversalsRequestCodec)

  internal const val POSTTREASURYDEBITREVERSALS_REQUEST_CODEC_ID: String =
      "PostTreasuryDebitReversals.request"

  private val postTreasuryDebitReversalsRequestCodec:
      MediaTypeCodec<InlineV1TreasuryDebitReversalsPostRequestFormX38af54e6> =
      PostTreasuryDebitReversalsFormCodec

  private val postTreasuryDebitReversalsResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryDebitReversal> =
      KotlinxSerializationCodec("PostTreasuryDebitReversals.response.alternative0", TreasuryDebitReversal.Serializer, SdkJson)

  internal val postTreasuryDebitReversalsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryDebitReversal> =
      MediaTypeCodecRegistry.of(postTreasuryDebitReversalsResponseCodecAlternative0Codec)

  private val postTreasuryDebitReversalsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryDebitReversals.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryDebitReversalsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryDebitReversalsResponseCodecAlternative1Codec)

  internal val postTreasuryDebitReversalsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryDebitReversalsPostRequestFormX38af54e6> =
      MediaTypeCodecRegistry.of(postTreasuryDebitReversalsRequestCodec)

  internal const val POSTTREASURYFINANCIALACCOUNTSFINANCIALACCOUNTCLOSE_REQUEST_CODEC_ID: String =
      "PostTreasuryFinancialAccountsFinancialAccountClose.request"

  private val postTreasuryFinancialAccountsFinancialAccountCloseRequestCodec:
      MediaTypeCodec<InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0?> =
      PostTreasuryFinancialAccountsFinancialAccountCloseFormCodec

  private val postTreasuryFinancialAccountsFinancialAccountCloseResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryFinancialAccount> =
      KotlinxSerializationCodec("PostTreasuryFinancialAccountsFinancialAccountClose.response.alternative0", TreasuryFinancialAccount.Serializer, SdkJson)

  internal val postTreasuryFinancialAccountsFinancialAccountCloseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryFinancialAccount> =
      MediaTypeCodecRegistry.of(postTreasuryFinancialAccountsFinancialAccountCloseResponseCodecAlternative0Codec)

  private val postTreasuryFinancialAccountsFinancialAccountCloseResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryFinancialAccountsFinancialAccountClose.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryFinancialAccountsFinancialAccountCloseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryFinancialAccountsFinancialAccountCloseResponseCodecAlternative1Codec)

  internal val postTreasuryFinancialAccountsFinancialAccountCloseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0?> =
      MediaTypeCodecRegistry.of(postTreasuryFinancialAccountsFinancialAccountCloseRequestCodec)

  internal const val POSTTREASURYFINANCIALACCOUNTSFINANCIALACCOUNTFEATURES_REQUEST_CODEC_ID: String
      = "PostTreasuryFinancialAccountsFinancialAccountFeatures.request"

  private val postTreasuryFinancialAccountsFinancialAccountFeaturesRequestCodec:
      MediaTypeCodec<InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2?> =
      PostTreasuryFinancialAccountsFinancialAccountFeaturesFormCodec

  private val postTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryFinancialAccountFeatures> =
      KotlinxSerializationCodec("PostTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative0", TreasuryFinancialAccountFeatures.Serializer, SdkJson)

  internal val postTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryFinancialAccountFeatures> =
      MediaTypeCodecRegistry.of(postTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative0Codec)

  private val postTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative1Codec)

  internal val postTreasuryFinancialAccountsFinancialAccountFeaturesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2?> =
      MediaTypeCodecRegistry.of(postTreasuryFinancialAccountsFinancialAccountFeaturesRequestCodec)

  internal const val POSTTREASURYINBOUNDTRANSFERS_REQUEST_CODEC_ID: String =
      "PostTreasuryInboundTransfers.request"

  private val postTreasuryInboundTransfersRequestCodec:
      MediaTypeCodec<InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a> =
      PostTreasuryInboundTransfersFormCodec

  private val postTreasuryInboundTransfersResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryInboundTransfer> =
      KotlinxSerializationCodec("PostTreasuryInboundTransfers.response.alternative0", TreasuryInboundTransfer.Serializer, SdkJson)

  internal val postTreasuryInboundTransfersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryInboundTransfer> =
      MediaTypeCodecRegistry.of(postTreasuryInboundTransfersResponseCodecAlternative0Codec)

  private val postTreasuryInboundTransfersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryInboundTransfers.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryInboundTransfersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryInboundTransfersResponseCodecAlternative1Codec)

  internal val postTreasuryInboundTransfersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a> =
      MediaTypeCodecRegistry.of(postTreasuryInboundTransfersRequestCodec)

  internal const val POSTTREASURYINBOUNDTRANSFERSINBOUNDTRANSFERCANCEL_REQUEST_CODEC_ID: String =
      "PostTreasuryInboundTransfersInboundTransferCancel.request"

  private val postTreasuryInboundTransfersInboundTransferCancelRequestCodec:
      MediaTypeCodec<InlineV1TreasuryInboundTransfersCancelPostRequestFormX83200b6b?> =
      PostTreasuryInboundTransfersInboundTransferCancelFormCodec

  private val postTreasuryInboundTransfersInboundTransferCancelResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryInboundTransfer> =
      KotlinxSerializationCodec("PostTreasuryInboundTransfersInboundTransferCancel.response.alternative0", TreasuryInboundTransfer.Serializer, SdkJson)

  internal val postTreasuryInboundTransfersInboundTransferCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryInboundTransfer> =
      MediaTypeCodecRegistry.of(postTreasuryInboundTransfersInboundTransferCancelResponseCodecAlternative0Codec)

  private val postTreasuryInboundTransfersInboundTransferCancelResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryInboundTransfersInboundTransferCancel.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryInboundTransfersInboundTransferCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryInboundTransfersInboundTransferCancelResponseCodecAlternative1Codec)

  internal val postTreasuryInboundTransfersInboundTransferCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryInboundTransfersCancelPostRequestFormX83200b6b?> =
      MediaTypeCodecRegistry.of(postTreasuryInboundTransfersInboundTransferCancelRequestCodec)

  internal const val POSTTREASURYOUTBOUNDPAYMENTSIDCANCEL_REQUEST_CODEC_ID: String =
      "PostTreasuryOutboundPaymentsIdCancel.request"

  private val postTreasuryOutboundPaymentsIdCancelRequestCodec:
      MediaTypeCodec<InlineV1TreasuryOutboundPaymentsCancelPostRequestFormXdfc90153?> =
      PostTreasuryOutboundPaymentsIdCancelFormCodec

  private val postTreasuryOutboundPaymentsIdCancelResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundPayment> =
      KotlinxSerializationCodec("PostTreasuryOutboundPaymentsIdCancel.response.alternative0", TreasuryOutboundPayment.Serializer, SdkJson)

  internal val postTreasuryOutboundPaymentsIdCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundPayment> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundPaymentsIdCancelResponseCodecAlternative0Codec)

  private val postTreasuryOutboundPaymentsIdCancelResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryOutboundPaymentsIdCancel.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryOutboundPaymentsIdCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundPaymentsIdCancelResponseCodecAlternative1Codec)

  internal val postTreasuryOutboundPaymentsIdCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryOutboundPaymentsCancelPostRequestFormXdfc90153?> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundPaymentsIdCancelRequestCodec)

  internal const val POSTTREASURYOUTBOUNDTRANSFERS_REQUEST_CODEC_ID: String =
      "PostTreasuryOutboundTransfers.request"

  private val postTreasuryOutboundTransfersRequestCodec:
      MediaTypeCodec<InlineV1TreasuryOutboundTransfersPostRequestFormX91512707> =
      PostTreasuryOutboundTransfersFormCodec

  private val postTreasuryOutboundTransfersResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundTransfer> =
      KotlinxSerializationCodec("PostTreasuryOutboundTransfers.response.alternative0", TreasuryOutboundTransfer.Serializer, SdkJson)

  internal val postTreasuryOutboundTransfersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundTransfer> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundTransfersResponseCodecAlternative0Codec)

  private val postTreasuryOutboundTransfersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryOutboundTransfers.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryOutboundTransfersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundTransfersResponseCodecAlternative1Codec)

  internal val postTreasuryOutboundTransfersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryOutboundTransfersPostRequestFormX91512707> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundTransfersRequestCodec)

  internal const val POSTTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFERCANCEL_REQUEST_CODEC_ID: String =
      "PostTreasuryOutboundTransfersOutboundTransferCancel.request"

  private val postTreasuryOutboundTransfersOutboundTransferCancelRequestCodec:
      MediaTypeCodec<InlineV1TreasuryOutboundTransfersCancelPostRequestFormX6408d71e?> =
      PostTreasuryOutboundTransfersOutboundTransferCancelFormCodec

  private val postTreasuryOutboundTransfersOutboundTransferCancelResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundTransfer> =
      KotlinxSerializationCodec("PostTreasuryOutboundTransfersOutboundTransferCancel.response.alternative0", TreasuryOutboundTransfer.Serializer, SdkJson)

  internal val postTreasuryOutboundTransfersOutboundTransferCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundTransfer> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundTransfersOutboundTransferCancelResponseCodecAlternative0Codec)

  private val postTreasuryOutboundTransfersOutboundTransferCancelResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTreasuryOutboundTransfersOutboundTransferCancel.response.alternative1", Error.Serializer, SdkJson)

  internal val postTreasuryOutboundTransfersOutboundTransferCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundTransfersOutboundTransferCancelResponseCodecAlternative1Codec)

  internal val postTreasuryOutboundTransfersOutboundTransferCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TreasuryOutboundTransfersCancelPostRequestFormX6408d71e?> =
      MediaTypeCodecRegistry.of(postTreasuryOutboundTransfersOutboundTransferCancelRequestCodec)

  internal object GetTreasuryCreditReversalsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryCreditReversals.request"

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

  internal object GetTreasuryCreditReversalsCreditReversalFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryCreditReversalsCreditReversal.request"

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

  internal object GetTreasuryDebitReversalsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryDebitReversals.request"

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

  internal object GetTreasuryDebitReversalsDebitReversalFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryDebitReversalsDebitReversal.request"

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

  internal object GetTreasuryFinancialAccountsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryFinancialAccounts.request"

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

  internal object GetTreasuryFinancialAccountsFinancialAccountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryFinancialAccountsFinancialAccount.request"

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

  internal object GetTreasuryFinancialAccountsFinancialAccountFeaturesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryFinancialAccountsFinancialAccountFeatures.request"

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

  internal object GetTreasuryInboundTransfersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryInboundTransfers.request"

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

  internal object GetTreasuryInboundTransfersIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryInboundTransfersId.request"

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

  internal object GetTreasuryOutboundPaymentsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryOutboundPayments.request"

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

  internal object GetTreasuryOutboundPaymentsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryOutboundPaymentsId.request"

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

  internal object GetTreasuryOutboundTransfersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryOutboundTransfers.request"

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

  internal object GetTreasuryOutboundTransfersOutboundTransferFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryOutboundTransfersOutboundTransfer.request"

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

  internal object GetTreasuryReceivedCreditsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryReceivedCredits.request"

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

  internal object GetTreasuryReceivedCreditsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryReceivedCreditsId.request"

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

  internal object GetTreasuryReceivedDebitsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryReceivedDebits.request"

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

  internal object GetTreasuryReceivedDebitsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryReceivedDebitsId.request"

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

  internal object GetTreasuryTransactionEntriesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryTransactionEntries.request"

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

  internal object GetTreasuryTransactionEntriesIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryTransactionEntriesId.request"

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

  internal object GetTreasuryTransactionsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTreasuryTransactionsId.request"

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

  internal object PostTreasuryCreditReversalsFormCodec : MediaTypeCodec<InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff> {
    override val id: String = "PostTreasuryCreditReversals.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("received_credit", request.receivedCredit)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTreasuryDebitReversalsFormCodec : MediaTypeCodec<InlineV1TreasuryDebitReversalsPostRequestFormX38af54e6> {
    override val id: String = "PostTreasuryDebitReversals.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryDebitReversalsPostRequestFormX38af54e6, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("received_debit", request.receivedDebit)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryDebitReversalsPostRequestFormX38af54e6 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTreasuryFinancialAccountsFinancialAccountCloseFormCodec : MediaTypeCodec<InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0?> {
    override val id: String = "PostTreasuryFinancialAccountsFinancialAccountClose.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0?, mediaType: String): SdkRequestBody {
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
      request.forwardingSettings?.let { formValue0 ->
        formValue0.financialAccount?.let { formValue2 ->
          form.add("forwarding_settings" + "[financial_account]", formValue2)
        }
        formValue0.paymentMethod?.let { formValue2 ->
          form.add("forwarding_settings" + "[payment_method]", formValue2)
        }
        form.add("forwarding_settings" + "[type]", formValue0.type.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTreasuryFinancialAccountsFinancialAccountFeaturesFormCodec : MediaTypeCodec<InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2?> {
    override val id: String = "PostTreasuryFinancialAccountsFinancialAccountFeatures.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.cardIssuing?.let { formValue0 ->
        form.add("card_issuing" + "[requested]", formValue0.requested.toString())
      }
      request.depositInsurance?.let { formValue0 ->
        form.add("deposit_insurance" + "[requested]", formValue0.requested.toString())
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.financialAddresses?.let { formValue0 ->
        formValue0.aba?.let { formValue2 ->
          form.add("financial_addresses" + "[aba]" + "[requested]", formValue2.requested.toString())
        }
      }
      request.inboundTransfers?.let { formValue0 ->
        formValue0.ach?.let { formValue2 ->
          form.add("inbound_transfers" + "[ach]" + "[requested]", formValue2.requested.toString())
        }
      }
      request.intraStripeFlows?.let { formValue0 ->
        form.add("intra_stripe_flows" + "[requested]", formValue0.requested.toString())
      }
      request.outboundPayments?.let { formValue0 ->
        formValue0.ach?.let { formValue2 ->
          form.add("outbound_payments" + "[ach]" + "[requested]", formValue2.requested.toString())
        }
        formValue0.usDomesticWire?.let { formValue2 ->
          form.add("outbound_payments" + "[us_domestic_wire]" + "[requested]", formValue2.requested.toString())
        }
      }
      request.outboundTransfers?.let { formValue0 ->
        formValue0.ach?.let { formValue2 ->
          form.add("outbound_transfers" + "[ach]" + "[requested]", formValue2.requested.toString())
        }
        formValue0.usDomesticWire?.let { formValue2 ->
          form.add("outbound_transfers" + "[us_domestic_wire]" + "[requested]", formValue2.requested.toString())
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTreasuryInboundTransfersFormCodec : MediaTypeCodec<InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a> {
    override val id: String = "PostTreasuryInboundTransfers.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount", request.amount.toString())
      form.add("currency", request.currency)
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("financial_account", request.financialAccount)
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("origin_payment_method", request.originPaymentMethod)
      request.statementDescriptor?.let { formValue0 ->
        form.add("statement_descriptor", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTreasuryInboundTransfersInboundTransferCancelFormCodec : MediaTypeCodec<InlineV1TreasuryInboundTransfersCancelPostRequestFormX83200b6b?> {
    override val id: String = "PostTreasuryInboundTransfersInboundTransferCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryInboundTransfersCancelPostRequestFormX83200b6b?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryInboundTransfersCancelPostRequestFormX83200b6b? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTreasuryOutboundPaymentsIdCancelFormCodec : MediaTypeCodec<InlineV1TreasuryOutboundPaymentsCancelPostRequestFormXdfc90153?> {
    override val id: String = "PostTreasuryOutboundPaymentsIdCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryOutboundPaymentsCancelPostRequestFormXdfc90153?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryOutboundPaymentsCancelPostRequestFormXdfc90153? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTreasuryOutboundTransfersFormCodec : MediaTypeCodec<InlineV1TreasuryOutboundTransfersPostRequestFormX91512707> {
    override val id: String = "PostTreasuryOutboundTransfers.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryOutboundTransfersPostRequestFormX91512707, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount", request.amount.toString())
      form.add("currency", request.currency)
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
      }
      request.destinationPaymentMethod?.let { formValue0 ->
        form.add("destination_payment_method", formValue0)
      }
      request.destinationPaymentMethodData?.let { formValue0 ->
        formValue0.financialAccount?.let { formValue2 ->
          form.add("destination_payment_method_data" + "[financial_account]", formValue2)
        }
        form.add("destination_payment_method_data" + "[type]", formValue0.type.value)
      }
      request.destinationPaymentMethodOptions?.let { formValue0 ->
        formValue0.usBankAccount?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.inlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b != null -> {
              requireNotNull(formValue2.inlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf1X9071ce4b).network?.let { formValue5 ->
                form.add("destination_payment_method_options" + "[us_bank_account]" + "[network]", formValue5.value)
              }
            }
            formValue2.inlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493 != null -> {
              form.add("destination_payment_method_options" + "[us_bank_account]", requireNotNull(formValue2.inlineV1TreasuryOutboundTrc70dPostRequestFormAnyOf2Xacadd493).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("financial_account", request.financialAccount)
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.statementDescriptor?.let { formValue0 ->
        form.add("statement_descriptor", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryOutboundTransfersPostRequestFormX91512707 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTreasuryOutboundTransfersOutboundTransferCancelFormCodec : MediaTypeCodec<InlineV1TreasuryOutboundTransfersCancelPostRequestFormX6408d71e?> {
    override val id: String = "PostTreasuryOutboundTransfersOutboundTransferCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TreasuryOutboundTransfersCancelPostRequestFormX6408d71e?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TreasuryOutboundTransfersCancelPostRequestFormX6408d71e? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'treasury' group of Stripe API.
 */
public class TreasuryClient(
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
      SdkExecutor(transport, authentication = this@TreasuryClient.authentication)

  /**
   * <p>Returns a list of CreditReversals.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param financialAccount Returns objects associated with this FinancialAccount.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param receivedCredit Only return CreditReversals for the ReceivedCredit ID.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return CreditReversals for a given status.
   * @param options Execution options.
   */
  public suspend fun getTreasuryCreditReversalsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    financialAccount: String,
    limit: Int? = null,
    receivedCredit: String? = null,
    startingAfter: String? = null,
    status: InlineV1TreasuryCreditReversalsGetParameterX874277c2? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryCreditReversalsResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryCreditReversalsResponse>(SdkExecutionRequest(getTreasuryCreditReversalsMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYCREDITREVERSALS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "financial_account", values = listOf(financialAccount.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "received_credit", values = receivedCredit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryCreditReversalsRequestCodecRegistry, GetTreasuryCreditReversalsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing CreditReversal by passing the unique CreditReversal ID from either the
   * CreditReversal creation request or CreditReversal list</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param creditReversal Wire parameter `credit_reversal`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryCreditReversalsCreditReversalWithResponse(
    request: JsonObject? = null,
    creditReversal: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryCreditReversalsCreditReversalResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryCreditReversalsCreditReversalResponse>(SdkExecutionRequest(getTreasuryCreditReversalsCreditReversalMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYCREDITREVERSALSCREDITREVERSAL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "credit_reversal", values = listOf(creditReversal.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryCreditReversalsCreditReversalRequestCodecRegistry, GetTreasuryCreditReversalsCreditReversalResponseDecoder, options)

  /**
   * <p>Returns a list of DebitReversals.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param financialAccount Returns objects associated with this FinancialAccount.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param receivedDebit Only return DebitReversals for the ReceivedDebit ID.
   * @param resolution Only return DebitReversals for a given resolution.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return DebitReversals for a given status.
   * @param options Execution options.
   */
  public suspend fun getTreasuryDebitReversalsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    financialAccount: String,
    limit: Int? = null,
    receivedDebit: String? = null,
    resolution: InlineV1TreasuryDebitReversalsGetParameterX0e44ceda? = null,
    startingAfter: String? = null,
    status: InlineV1TreasuryDebitReversalsGetParameterX84bd6647? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryDebitReversalsResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryDebitReversalsResponse>(SdkExecutionRequest(getTreasuryDebitReversalsMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYDEBITREVERSALS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "financial_account", values = listOf(financialAccount.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "received_debit", values = receivedDebit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "resolution", values = resolution?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryDebitReversalsRequestCodecRegistry, GetTreasuryDebitReversalsResponseDecoder, options)

  /**
   * <p>Retrieves a DebitReversal object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param debitReversal Wire parameter `debit_reversal`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryDebitReversalsDebitReversalWithResponse(
    request: JsonObject? = null,
    debitReversal: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryDebitReversalsDebitReversalResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryDebitReversalsDebitReversalResponse>(SdkExecutionRequest(getTreasuryDebitReversalsDebitReversalMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYDEBITREVERSALSDEBITREVERSAL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "debit_reversal", values = listOf(debitReversal.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryDebitReversalsDebitReversalRequestCodecRegistry, GetTreasuryDebitReversalsDebitReversalResponseDecoder, options)

  /**
   * <p>Returns a list of FinancialAccounts.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return FinancialAccounts that were created during the given date interval.
   * @param endingBefore An object ID cursor for use in pagination.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit ranging from 1 to 100 (defaults to 10).
   * @param startingAfter An object ID cursor for use in pagination.
   * @param status Only return FinancialAccounts that have the given status: `open` or `closed`
   * @param options Execution options.
   */
  public suspend fun getTreasuryFinancialAccountsWithResponse(
    request: JsonObject? = null,
    created: InlineV1TreasuryFinancialAccountsGetParameterXebac99ba? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryFinancialAccountsResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryFinancialAccountsResponse>(SdkExecutionRequest(getTreasuryFinancialAccountsMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYFINANCIALACCOUNTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryFinancialAccountsRequestCodecRegistry, GetTreasuryFinancialAccountsResponseDecoder, options)

  /**
   * <p>Retrieves the details of a FinancialAccount.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param financialAccount Wire parameter `financial_account`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryFinancialAccountsFinancialAccountWithResponse(
    request: JsonObject? = null,
    financialAccount: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryFinancialAccountsFinancialAccountResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryFinancialAccountsFinancialAccountResponse>(SdkExecutionRequest(getTreasuryFinancialAccountsFinancialAccountMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYFINANCIALACCOUNTSFINANCIALACCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "financial_account", values = listOf(financialAccount.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryFinancialAccountsFinancialAccountRequestCodecRegistry, GetTreasuryFinancialAccountsFinancialAccountResponseDecoder, options)

  /**
   * <p>Retrieves Features information associated with the FinancialAccount.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param financialAccount Wire parameter `financial_account`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryFinancialAccountsFinancialAccountFeaturesWithResponse(
    request: JsonObject? = null,
    financialAccount: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse>(SdkExecutionRequest(getTreasuryFinancialAccountsFinancialAccountFeaturesMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYFINANCIALACCOUNTSFINANCIALACCOUNTFEATURES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "financial_account", values = listOf(financialAccount.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryFinancialAccountsFinancialAccountFeaturesRequestCodecRegistry, GetTreasuryFinancialAccountsFinancialAccountFeaturesResponseDecoder, options)

  /**
   * <p>Returns a list of InboundTransfers sent from the specified FinancialAccount.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param financialAccount Returns objects associated with this FinancialAccount.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return InboundTransfers that have the given status: `processing`, `succeeded`, `failed` or
   * `canceled`.
   * @param options Execution options.
   */
  public suspend fun getTreasuryInboundTransfersWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    financialAccount: String,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1TreasuryInboundTransfersGetParameterX74be2205? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryInboundTransfersResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryInboundTransfersResponse>(SdkExecutionRequest(getTreasuryInboundTransfersMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYINBOUNDTRANSFERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "financial_account", values = listOf(financialAccount.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryInboundTransfersRequestCodecRegistry, GetTreasuryInboundTransfersResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing InboundTransfer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryInboundTransfersIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryInboundTransfersIdResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryInboundTransfersIdResponse>(SdkExecutionRequest(getTreasuryInboundTransfersIdMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYINBOUNDTRANSFERSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryInboundTransfersIdRequestCodecRegistry, GetTreasuryInboundTransfersIdResponseDecoder, options)

  /**
   * <p>Returns a list of OutboundPayments sent from the specified FinancialAccount.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return OutboundPayments that were created during the given date interval.
   * @param customer Only return OutboundPayments sent to this customer.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param financialAccount Returns objects associated with this FinancialAccount.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return OutboundPayments that have the given status: `processing`, `failed`, `posted`,
   * `returned`, or `canceled`.
   * @param options Execution options.
   */
  public suspend fun getTreasuryOutboundPaymentsWithResponse(
    request: JsonObject? = null,
    created: InlineV1TreasuryOutboundPaymentsGetParameterX04cf9e2e? = null,
    customer: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    financialAccount: String,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryOutboundPaymentsResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryOutboundPaymentsResponse>(SdkExecutionRequest(getTreasuryOutboundPaymentsMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYOUTBOUNDPAYMENTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "financial_account", values = listOf(financialAccount.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryOutboundPaymentsRequestCodecRegistry, GetTreasuryOutboundPaymentsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing OutboundPayment by passing the unique OutboundPayment ID from either the
   * OutboundPayment creation request or OutboundPayment list.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryOutboundPaymentsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryOutboundPaymentsIdResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryOutboundPaymentsIdResponse>(SdkExecutionRequest(getTreasuryOutboundPaymentsIdMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYOUTBOUNDPAYMENTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryOutboundPaymentsIdRequestCodecRegistry, GetTreasuryOutboundPaymentsIdResponseDecoder, options)

  /**
   * <p>Returns a list of OutboundTransfers sent from the specified FinancialAccount.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param financialAccount Returns objects associated with this FinancialAccount.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return OutboundTransfers that have the given status: `processing`, `canceled`, `failed`,
   * `posted`, or `returned`.
   * @param options Execution options.
   */
  public suspend fun getTreasuryOutboundTransfersWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    financialAccount: String,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryOutboundTransfersResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryOutboundTransfersResponse>(SdkExecutionRequest(getTreasuryOutboundTransfersMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYOUTBOUNDTRANSFERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "financial_account", values = listOf(financialAccount.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryOutboundTransfersRequestCodecRegistry, GetTreasuryOutboundTransfersResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing OutboundTransfer by passing the unique OutboundTransfer ID from either the
   * OutboundTransfer creation request or OutboundTransfer list.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param outboundTransfer Wire parameter `outbound_transfer`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryOutboundTransfersOutboundTransferWithResponse(
    request: JsonObject? = null,
    outboundTransfer: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryOutboundTransfersOutboundTransferResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryOutboundTransfersOutboundTransferResponse>(SdkExecutionRequest(getTreasuryOutboundTransfersOutboundTransferMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "outbound_transfer", values = listOf(outboundTransfer.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryOutboundTransfersOutboundTransferRequestCodecRegistry, GetTreasuryOutboundTransfersOutboundTransferResponseDecoder, options)

  /**
   * <p>Returns a list of ReceivedCredits.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param financialAccount The FinancialAccount that received the funds.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param linkedFlows Only return ReceivedCredits described by the flow.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return ReceivedCredits that have the given status: `succeeded` or `failed`.
   * @param options Execution options.
   */
  public suspend fun getTreasuryReceivedCreditsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    financialAccount: String,
    limit: Int? = null,
    linkedFlows: InlineV1TreasuryReceivedCreditsGetParameterX658e403e? = null,
    startingAfter: String? = null,
    status: InlineV1TreasuryReceivedCreditsGetParameterX66380fdb? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryReceivedCreditsResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryReceivedCreditsResponse>(SdkExecutionRequest(getTreasuryReceivedCreditsMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYRECEIVEDCREDITS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "financial_account", values = listOf(financialAccount.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "linked_flows[source_flow_type]", values = linkedFlows?.sourceFlowType?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryReceivedCreditsRequestCodecRegistry, GetTreasuryReceivedCreditsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing ReceivedCredit by passing the unique ReceivedCredit ID from the
   * ReceivedCredit list.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryReceivedCreditsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryReceivedCreditsIdResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryReceivedCreditsIdResponse>(SdkExecutionRequest(getTreasuryReceivedCreditsIdMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYRECEIVEDCREDITSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryReceivedCreditsIdRequestCodecRegistry, GetTreasuryReceivedCreditsIdResponseDecoder, options)

  /**
   * <p>Returns a list of ReceivedDebits.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param financialAccount The FinancialAccount that funds were pulled from.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return ReceivedDebits that have the given status: `succeeded` or `failed`.
   * @param options Execution options.
   */
  public suspend fun getTreasuryReceivedDebitsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    financialAccount: String,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryReceivedDebitsResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryReceivedDebitsResponse>(SdkExecutionRequest(getTreasuryReceivedDebitsMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYRECEIVEDDEBITS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "financial_account", values = listOf(financialAccount.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryReceivedDebitsRequestCodecRegistry, GetTreasuryReceivedDebitsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing ReceivedDebit by passing the unique ReceivedDebit ID from the ReceivedDebit
   * list</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryReceivedDebitsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryReceivedDebitsIdResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryReceivedDebitsIdResponse>(SdkExecutionRequest(getTreasuryReceivedDebitsIdMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYRECEIVEDDEBITSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryReceivedDebitsIdRequestCodecRegistry, GetTreasuryReceivedDebitsIdResponseDecoder, options)

  /**
   * <p>Retrieves a list of TransactionEntry objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return TransactionEntries that were created during the given date interval.
   * @param effectiveAt Wire parameter `effective_at`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param financialAccount Returns objects associated with this FinancialAccount.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param orderBy The results are in reverse chronological order by `created` or `effective_at`. The default is
   * `created`.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param transaction Only return TransactionEntries associated with this Transaction.
   * @param options Execution options.
   */
  public suspend fun getTreasuryTransactionEntriesWithResponse(
    request: JsonObject? = null,
    created: InlineV1TreasuryTransactionEntriesGetParameterXf4475a7b? = null,
    effectiveAt: InlineV1TreasuryTransactionEntriesGetParameterXced22640? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    financialAccount: String,
    limit: Int? = null,
    orderBy: InlineV1TreasuryTransactionEntriesGetParameterXe212d009? = null,
    startingAfter: String? = null,
    transaction: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryTransactionEntriesResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryTransactionEntriesResponse>(SdkExecutionRequest(getTreasuryTransactionEntriesMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYTRANSACTIONENTRIES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "effective_at", values = effectiveAt?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "financial_account", values = listOf(financialAccount.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "order_by", values = orderBy?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "transaction", values = transaction?.let { listOf(it.toString()) }.orEmpty()))
  }), TreasuryCodecs.getTreasuryTransactionEntriesRequestCodecRegistry, GetTreasuryTransactionEntriesResponseDecoder, options)

  /**
   * <p>Retrieves a TransactionEntry object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryTransactionEntriesIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryTransactionEntriesIdResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryTransactionEntriesIdResponse>(SdkExecutionRequest(getTreasuryTransactionEntriesIdMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYTRANSACTIONENTRIESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryTransactionEntriesIdRequestCodecRegistry, GetTreasuryTransactionEntriesIdResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing Transaction.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTreasuryTransactionsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTreasuryTransactionsIdResponse> = executor.executeWithResponse<JsonObject?, GetTreasuryTransactionsIdResponse>(SdkExecutionRequest(getTreasuryTransactionsIdMetadata, baseUri, request, listOf(TreasuryCodecs.GETTREASURYTRANSACTIONSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TreasuryCodecs.getTreasuryTransactionsIdRequestCodecRegistry, GetTreasuryTransactionsIdResponseDecoder, options)

  /**
   * <p>Reverses a ReceivedCredit and creates a CreditReversal object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTreasuryCreditReversalsWithResponse(request: InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff, options: CallOptions = CallOptions()): SdkResponseResult<PostTreasuryCreditReversalsResponse> = executor.executeWithResponse<InlineV1TreasuryCreditReversalsPostRequestFormX88c5efff, PostTreasuryCreditReversalsResponse>(SdkExecutionRequest(postTreasuryCreditReversalsMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYCREDITREVERSALS_REQUEST_CODEC_ID), emptyList()), TreasuryCodecs.postTreasuryCreditReversalsRequestCodecRegistry, PostTreasuryCreditReversalsResponseDecoder, options)

  /**
   * <p>Reverses a ReceivedDebit and creates a DebitReversal object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTreasuryDebitReversalsWithResponse(request: InlineV1TreasuryDebitReversalsPostRequestFormX38af54e6, options: CallOptions = CallOptions()): SdkResponseResult<PostTreasuryDebitReversalsResponse> = executor.executeWithResponse<InlineV1TreasuryDebitReversalsPostRequestFormX38af54e6, PostTreasuryDebitReversalsResponse>(SdkExecutionRequest(postTreasuryDebitReversalsMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYDEBITREVERSALS_REQUEST_CODEC_ID), emptyList()), TreasuryCodecs.postTreasuryDebitReversalsRequestCodecRegistry, PostTreasuryDebitReversalsResponseDecoder, options)

  /**
   * <p>Closes a FinancialAccount. A FinancialAccount can only be closed if it has a zero balance, has no pending
   * InboundTransfers, and has canceled all attached Issuing cards.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param financialAccount Wire parameter `financial_account`.
   * @param options Execution options.
   */
  public suspend fun postTreasuryFinancialAccountsFinancialAccountCloseWithResponse(
    request: InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0? = null,
    financialAccount: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTreasuryFinancialAccountsFinancialAccountCloseResponse> = executor.executeWithResponse<InlineV1TreasuryFinancialAccountsClosePostRequestFormXd7b50cf0?, PostTreasuryFinancialAccountsFinancialAccountCloseResponse>(SdkExecutionRequest(postTreasuryFinancialAccountsFinancialAccountCloseMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYFINANCIALACCOUNTSFINANCIALACCOUNTCLOSE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "financial_account", values = listOf(financialAccount.toString())))
  }), TreasuryCodecs.postTreasuryFinancialAccountsFinancialAccountCloseRequestCodecRegistry, PostTreasuryFinancialAccountsFinancialAccountCloseResponseDecoder, options)

  /**
   * <p>Updates the Features associated with a FinancialAccount.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param financialAccount Wire parameter `financial_account`.
   * @param options Execution options.
   */
  public suspend fun postTreasuryFinancialAccountsFinancialAccountFeaturesWithResponse(
    request: InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2? = null,
    financialAccount: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse> = executor.executeWithResponse<InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2?, PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse>(SdkExecutionRequest(postTreasuryFinancialAccountsFinancialAccountFeaturesMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYFINANCIALACCOUNTSFINANCIALACCOUNTFEATURES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "financial_account", values = listOf(financialAccount.toString())))
  }), TreasuryCodecs.postTreasuryFinancialAccountsFinancialAccountFeaturesRequestCodecRegistry, PostTreasuryFinancialAccountsFinancialAccountFeaturesResponseDecoder, options)

  /**
   * <p>Creates an InboundTransfer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTreasuryInboundTransfersWithResponse(request: InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a, options: CallOptions = CallOptions()): SdkResponseResult<PostTreasuryInboundTransfersResponse> = executor.executeWithResponse<InlineV1TreasuryInboundTransfersPostRequestFormX19ee4a8a, PostTreasuryInboundTransfersResponse>(SdkExecutionRequest(postTreasuryInboundTransfersMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYINBOUNDTRANSFERS_REQUEST_CODEC_ID), emptyList()), TreasuryCodecs.postTreasuryInboundTransfersRequestCodecRegistry, PostTreasuryInboundTransfersResponseDecoder, options)

  /**
   * <p>Cancels an InboundTransfer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param inboundTransfer Wire parameter `inbound_transfer`.
   * @param options Execution options.
   */
  public suspend fun postTreasuryInboundTransfersInboundTransferCancelWithResponse(
    request: InlineV1TreasuryInboundTransfersCancelPostRequestFormX83200b6b? = null,
    inboundTransfer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTreasuryInboundTransfersInboundTransferCancelResponse> = executor.executeWithResponse<InlineV1TreasuryInboundTransfersCancelPostRequestFormX83200b6b?, PostTreasuryInboundTransfersInboundTransferCancelResponse>(SdkExecutionRequest(postTreasuryInboundTransfersInboundTransferCancelMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYINBOUNDTRANSFERSINBOUNDTRANSFERCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "inbound_transfer", values = listOf(inboundTransfer.toString())))
  }), TreasuryCodecs.postTreasuryInboundTransfersInboundTransferCancelRequestCodecRegistry, PostTreasuryInboundTransfersInboundTransferCancelResponseDecoder, options)

  /**
   * <p>Cancel an OutboundPayment.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postTreasuryOutboundPaymentsIdCancelWithResponse(
    request: InlineV1TreasuryOutboundPaymentsCancelPostRequestFormXdfc90153? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTreasuryOutboundPaymentsIdCancelResponse> = executor.executeWithResponse<InlineV1TreasuryOutboundPaymentsCancelPostRequestFormXdfc90153?, PostTreasuryOutboundPaymentsIdCancelResponse>(SdkExecutionRequest(postTreasuryOutboundPaymentsIdCancelMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYOUTBOUNDPAYMENTSIDCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TreasuryCodecs.postTreasuryOutboundPaymentsIdCancelRequestCodecRegistry, PostTreasuryOutboundPaymentsIdCancelResponseDecoder, options)

  /**
   * <p>Creates an OutboundTransfer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTreasuryOutboundTransfersWithResponse(request: InlineV1TreasuryOutboundTransfersPostRequestFormX91512707, options: CallOptions = CallOptions()): SdkResponseResult<PostTreasuryOutboundTransfersResponse> = executor.executeWithResponse<InlineV1TreasuryOutboundTransfersPostRequestFormX91512707, PostTreasuryOutboundTransfersResponse>(SdkExecutionRequest(postTreasuryOutboundTransfersMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYOUTBOUNDTRANSFERS_REQUEST_CODEC_ID), emptyList()), TreasuryCodecs.postTreasuryOutboundTransfersRequestCodecRegistry, PostTreasuryOutboundTransfersResponseDecoder, options)

  /**
   * <p>An OutboundTransfer can be canceled if the funds have not yet been paid out.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param outboundTransfer Wire parameter `outbound_transfer`.
   * @param options Execution options.
   */
  public suspend fun postTreasuryOutboundTransfersOutboundTransferCancelWithResponse(
    request: InlineV1TreasuryOutboundTransfersCancelPostRequestFormX6408d71e? = null,
    outboundTransfer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTreasuryOutboundTransfersOutboundTransferCancelResponse> = executor.executeWithResponse<InlineV1TreasuryOutboundTransfersCancelPostRequestFormX6408d71e?, PostTreasuryOutboundTransfersOutboundTransferCancelResponse>(SdkExecutionRequest(postTreasuryOutboundTransfersOutboundTransferCancelMetadata, baseUri, request, listOf(TreasuryCodecs.POSTTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFERCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "outbound_transfer", values = listOf(outboundTransfer.toString())))
  }), TreasuryCodecs.postTreasuryOutboundTransfersOutboundTransferCancelRequestCodecRegistry, PostTreasuryOutboundTransfersOutboundTransferCancelResponseDecoder, options)

  /**
   * Typed response alternatives for `GetTreasuryCreditReversals`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryCreditReversalsResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryCreditReversalsGetResponse200JsonX4cbf142d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryCreditReversalsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryCreditReversalsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryCreditReversalsResponse
  }

  private object GetTreasuryCreditReversalsResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryCreditReversalsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryCreditReversalsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryCreditReversalsResponse> = when {
      alternative.id == "GetTreasuryCreditReversals.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryCreditReversalsResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryCreditReversalsResponseCodecAlternative0Registry.select(listOf("GetTreasuryCreditReversals.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryCreditReversals.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryCreditReversalsResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryCreditReversalsResponseCodecAlternative1Registry.select(listOf("GetTreasuryCreditReversals.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryCreditReversalsResponse = GetTreasuryCreditReversalsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryCreditReversalsCreditReversal`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetTreasuryCreditReversalsCreditReversalResponse {
    public class SuccessJson(
      public val json: TreasuryCreditReversal,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryCreditReversalsCreditReversalResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryCreditReversalsCreditReversalResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryCreditReversalsCreditReversalResponse
  }

  private object GetTreasuryCreditReversalsCreditReversalResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryCreditReversalsCreditReversalResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryCreditReversalsCreditReversalResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryCreditReversalsCreditReversalResponse> = when {
      alternative.id == "GetTreasuryCreditReversalsCreditReversal.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryCreditReversalsCreditReversalResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryCreditReversalsCreditReversalResponseCodecAlternative0Registry.select(listOf("GetTreasuryCreditReversalsCreditReversal.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryCreditReversalsCreditReversal.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryCreditReversalsCreditReversalResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryCreditReversalsCreditReversalResponseCodecAlternative1Registry.select(listOf("GetTreasuryCreditReversalsCreditReversal.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryCreditReversalsCreditReversalResponse = GetTreasuryCreditReversalsCreditReversalResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryDebitReversals`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryDebitReversalsResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryDebitReversalsGetResponse200JsonXa5dd1c17,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryDebitReversalsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryDebitReversalsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryDebitReversalsResponse
  }

  private object GetTreasuryDebitReversalsResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryDebitReversalsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryDebitReversalsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryDebitReversalsResponse> = when {
      alternative.id == "GetTreasuryDebitReversals.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryDebitReversalsResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryDebitReversalsResponseCodecAlternative0Registry.select(listOf("GetTreasuryDebitReversals.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryDebitReversals.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryDebitReversalsResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryDebitReversalsResponseCodecAlternative1Registry.select(listOf("GetTreasuryDebitReversals.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryDebitReversalsResponse = GetTreasuryDebitReversalsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryDebitReversalsDebitReversal`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetTreasuryDebitReversalsDebitReversalResponse {
    public class SuccessJson(
      public val json: TreasuryDebitReversal,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryDebitReversalsDebitReversalResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryDebitReversalsDebitReversalResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryDebitReversalsDebitReversalResponse
  }

  private object GetTreasuryDebitReversalsDebitReversalResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryDebitReversalsDebitReversalResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryDebitReversalsDebitReversalResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryDebitReversalsDebitReversalResponse> = when {
      alternative.id == "GetTreasuryDebitReversalsDebitReversal.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryDebitReversalsDebitReversalResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryDebitReversalsDebitReversalResponseCodecAlternative0Registry.select(listOf("GetTreasuryDebitReversalsDebitReversal.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryDebitReversalsDebitReversal.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryDebitReversalsDebitReversalResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryDebitReversalsDebitReversalResponseCodecAlternative1Registry.select(listOf("GetTreasuryDebitReversalsDebitReversal.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryDebitReversalsDebitReversalResponse = GetTreasuryDebitReversalsDebitReversalResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryFinancialAccounts`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryFinancialAccountsResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryFinancialAccountsGetResponse200JsonXdd9dd9cc,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsResponse
  }

  private object GetTreasuryFinancialAccountsResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryFinancialAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryFinancialAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryFinancialAccountsResponse> = when {
      alternative.id == "GetTreasuryFinancialAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryFinancialAccountsResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryFinancialAccountsResponseCodecAlternative0Registry.select(listOf("GetTreasuryFinancialAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryFinancialAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryFinancialAccountsResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryFinancialAccountsResponseCodecAlternative1Registry.select(listOf("GetTreasuryFinancialAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryFinancialAccountsResponse = GetTreasuryFinancialAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryFinancialAccountsFinancialAccount`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetTreasuryFinancialAccountsFinancialAccountResponse {
    public class SuccessJson(
      public val json: TreasuryFinancialAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsFinancialAccountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsFinancialAccountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsFinancialAccountResponse
  }

  private object GetTreasuryFinancialAccountsFinancialAccountResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryFinancialAccountsFinancialAccountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryFinancialAccountsFinancialAccountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryFinancialAccountsFinancialAccountResponse> = when {
      alternative.id == "GetTreasuryFinancialAccountsFinancialAccount.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryFinancialAccountsFinancialAccountResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryFinancialAccountsFinancialAccountResponseCodecAlternative0Registry.select(listOf("GetTreasuryFinancialAccountsFinancialAccount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryFinancialAccountsFinancialAccount.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryFinancialAccountsFinancialAccountResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryFinancialAccountsFinancialAccountResponseCodecAlternative1Registry.select(listOf("GetTreasuryFinancialAccountsFinancialAccount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryFinancialAccountsFinancialAccountResponse = GetTreasuryFinancialAccountsFinancialAccountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryFinancialAccountsFinancialAccountFeatures`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse {
    public class SuccessJson(
      public val json: TreasuryFinancialAccountFeatures,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse
  }

  private object GetTreasuryFinancialAccountsFinancialAccountFeaturesResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse> = when {
      alternative.id == "GetTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative0Registry.select(listOf("GetTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative1Registry.select(listOf("GetTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse = GetTreasuryFinancialAccountsFinancialAccountFeaturesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryInboundTransfers`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryInboundTransfersResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryInboundTransfersGetResponse200JsonX15316233,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryInboundTransfersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryInboundTransfersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryInboundTransfersResponse
  }

  private object GetTreasuryInboundTransfersResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryInboundTransfersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryInboundTransfersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryInboundTransfersResponse> = when {
      alternative.id == "GetTreasuryInboundTransfers.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryInboundTransfersResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryInboundTransfersResponseCodecAlternative0Registry.select(listOf("GetTreasuryInboundTransfers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryInboundTransfers.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryInboundTransfersResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryInboundTransfersResponseCodecAlternative1Registry.select(listOf("GetTreasuryInboundTransfers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryInboundTransfersResponse = GetTreasuryInboundTransfersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryInboundTransfersId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryInboundTransfersIdResponse {
    public class SuccessJson(
      public val json: TreasuryInboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryInboundTransfersIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryInboundTransfersIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryInboundTransfersIdResponse
  }

  private object GetTreasuryInboundTransfersIdResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryInboundTransfersIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryInboundTransfersIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryInboundTransfersIdResponse> = when {
      alternative.id == "GetTreasuryInboundTransfersId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryInboundTransfersIdResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryInboundTransfersIdResponseCodecAlternative0Registry.select(listOf("GetTreasuryInboundTransfersId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryInboundTransfersId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryInboundTransfersIdResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryInboundTransfersIdResponseCodecAlternative1Registry.select(listOf("GetTreasuryInboundTransfersId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryInboundTransfersIdResponse = GetTreasuryInboundTransfersIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryOutboundPayments`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryOutboundPaymentsResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryOutboundPaymentsGetResponse200JsonXc65b19e1,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundPaymentsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundPaymentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundPaymentsResponse
  }

  private object GetTreasuryOutboundPaymentsResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryOutboundPaymentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryOutboundPaymentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryOutboundPaymentsResponse> = when {
      alternative.id == "GetTreasuryOutboundPayments.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryOutboundPaymentsResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryOutboundPaymentsResponseCodecAlternative0Registry.select(listOf("GetTreasuryOutboundPayments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryOutboundPayments.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryOutboundPaymentsResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryOutboundPaymentsResponseCodecAlternative1Registry.select(listOf("GetTreasuryOutboundPayments.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryOutboundPaymentsResponse = GetTreasuryOutboundPaymentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryOutboundPaymentsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryOutboundPaymentsIdResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundPayment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundPaymentsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundPaymentsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundPaymentsIdResponse
  }

  private object GetTreasuryOutboundPaymentsIdResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryOutboundPaymentsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryOutboundPaymentsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryOutboundPaymentsIdResponse> = when {
      alternative.id == "GetTreasuryOutboundPaymentsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryOutboundPaymentsIdResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryOutboundPaymentsIdResponseCodecAlternative0Registry.select(listOf("GetTreasuryOutboundPaymentsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryOutboundPaymentsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryOutboundPaymentsIdResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryOutboundPaymentsIdResponseCodecAlternative1Registry.select(listOf("GetTreasuryOutboundPaymentsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryOutboundPaymentsIdResponse = GetTreasuryOutboundPaymentsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryOutboundTransfers`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryOutboundTransfersResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryOutboundTransfersGetResponse200JsonXb5c8977f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundTransfersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundTransfersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundTransfersResponse
  }

  private object GetTreasuryOutboundTransfersResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryOutboundTransfersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryOutboundTransfersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryOutboundTransfersResponse> = when {
      alternative.id == "GetTreasuryOutboundTransfers.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryOutboundTransfersResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryOutboundTransfersResponseCodecAlternative0Registry.select(listOf("GetTreasuryOutboundTransfers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryOutboundTransfers.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryOutboundTransfersResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryOutboundTransfersResponseCodecAlternative1Registry.select(listOf("GetTreasuryOutboundTransfers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryOutboundTransfersResponse = GetTreasuryOutboundTransfersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryOutboundTransfersOutboundTransfer`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetTreasuryOutboundTransfersOutboundTransferResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundTransfersOutboundTransferResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundTransfersOutboundTransferResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryOutboundTransfersOutboundTransferResponse
  }

  private object GetTreasuryOutboundTransfersOutboundTransferResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryOutboundTransfersOutboundTransferResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryOutboundTransfersOutboundTransferResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryOutboundTransfersOutboundTransferResponse> = when {
      alternative.id == "GetTreasuryOutboundTransfersOutboundTransfer.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryOutboundTransfersOutboundTransferResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative0Registry.select(listOf("GetTreasuryOutboundTransfersOutboundTransfer.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryOutboundTransfersOutboundTransfer.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryOutboundTransfersOutboundTransferResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative1Registry.select(listOf("GetTreasuryOutboundTransfersOutboundTransfer.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryOutboundTransfersOutboundTransferResponse = GetTreasuryOutboundTransfersOutboundTransferResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryReceivedCredits`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryReceivedCreditsResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryReceivedCreditsGetResponse200JsonX654d8f88,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedCreditsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedCreditsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedCreditsResponse
  }

  private object GetTreasuryReceivedCreditsResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryReceivedCreditsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryReceivedCreditsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryReceivedCreditsResponse> = when {
      alternative.id == "GetTreasuryReceivedCredits.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryReceivedCreditsResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryReceivedCreditsResponseCodecAlternative0Registry.select(listOf("GetTreasuryReceivedCredits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryReceivedCredits.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryReceivedCreditsResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryReceivedCreditsResponseCodecAlternative1Registry.select(listOf("GetTreasuryReceivedCredits.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryReceivedCreditsResponse = GetTreasuryReceivedCreditsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryReceivedCreditsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryReceivedCreditsIdResponse {
    public class SuccessJson(
      public val json: TreasuryReceivedCredit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedCreditsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedCreditsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedCreditsIdResponse
  }

  private object GetTreasuryReceivedCreditsIdResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryReceivedCreditsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryReceivedCreditsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryReceivedCreditsIdResponse> = when {
      alternative.id == "GetTreasuryReceivedCreditsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryReceivedCreditsIdResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryReceivedCreditsIdResponseCodecAlternative0Registry.select(listOf("GetTreasuryReceivedCreditsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryReceivedCreditsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryReceivedCreditsIdResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryReceivedCreditsIdResponseCodecAlternative1Registry.select(listOf("GetTreasuryReceivedCreditsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryReceivedCreditsIdResponse = GetTreasuryReceivedCreditsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryReceivedDebits`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryReceivedDebitsResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryReceivedDebitsGetResponse200JsonX99ded6cc,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedDebitsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedDebitsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedDebitsResponse
  }

  private object GetTreasuryReceivedDebitsResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryReceivedDebitsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryReceivedDebitsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryReceivedDebitsResponse> = when {
      alternative.id == "GetTreasuryReceivedDebits.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryReceivedDebitsResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryReceivedDebitsResponseCodecAlternative0Registry.select(listOf("GetTreasuryReceivedDebits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryReceivedDebits.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryReceivedDebitsResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryReceivedDebitsResponseCodecAlternative1Registry.select(listOf("GetTreasuryReceivedDebits.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryReceivedDebitsResponse = GetTreasuryReceivedDebitsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryReceivedDebitsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryReceivedDebitsIdResponse {
    public class SuccessJson(
      public val json: TreasuryReceivedDebit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedDebitsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedDebitsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryReceivedDebitsIdResponse
  }

  private object GetTreasuryReceivedDebitsIdResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryReceivedDebitsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryReceivedDebitsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryReceivedDebitsIdResponse> = when {
      alternative.id == "GetTreasuryReceivedDebitsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryReceivedDebitsIdResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryReceivedDebitsIdResponseCodecAlternative0Registry.select(listOf("GetTreasuryReceivedDebitsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryReceivedDebitsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryReceivedDebitsIdResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryReceivedDebitsIdResponseCodecAlternative1Registry.select(listOf("GetTreasuryReceivedDebitsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryReceivedDebitsIdResponse = GetTreasuryReceivedDebitsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryTransactionEntries`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryTransactionEntriesResponse {
    public class SuccessJson(
      public val json: InlineV1TreasuryTransactionEntriesGetResponse200JsonXdc4dd827,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionEntriesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionEntriesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionEntriesResponse
  }

  private object GetTreasuryTransactionEntriesResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryTransactionEntriesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryTransactionEntriesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryTransactionEntriesResponse> = when {
      alternative.id == "GetTreasuryTransactionEntries.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryTransactionEntriesResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryTransactionEntriesResponseCodecAlternative0Registry.select(listOf("GetTreasuryTransactionEntries.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryTransactionEntries.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryTransactionEntriesResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryTransactionEntriesResponseCodecAlternative1Registry.select(listOf("GetTreasuryTransactionEntries.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryTransactionEntriesResponse = GetTreasuryTransactionEntriesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryTransactionEntriesId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryTransactionEntriesIdResponse {
    public class SuccessJson(
      public val json: TreasuryTransactionEntry,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionEntriesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionEntriesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionEntriesIdResponse
  }

  private object GetTreasuryTransactionEntriesIdResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryTransactionEntriesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryTransactionEntriesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryTransactionEntriesIdResponse> = when {
      alternative.id == "GetTreasuryTransactionEntriesId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryTransactionEntriesIdResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryTransactionEntriesIdResponseCodecAlternative0Registry.select(listOf("GetTreasuryTransactionEntriesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryTransactionEntriesId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryTransactionEntriesIdResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryTransactionEntriesIdResponseCodecAlternative1Registry.select(listOf("GetTreasuryTransactionEntriesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryTransactionEntriesIdResponse = GetTreasuryTransactionEntriesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTreasuryTransactionsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTreasuryTransactionsIdResponse {
    public class SuccessJson(
      public val json: TreasuryTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTreasuryTransactionsIdResponse
  }

  private object GetTreasuryTransactionsIdResponseDecoder : SdkResponseAlternativeDecoder<GetTreasuryTransactionsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTreasuryTransactionsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTreasuryTransactionsIdResponse> = when {
      alternative.id == "GetTreasuryTransactionsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTreasuryTransactionsIdResponse.SuccessJson(
          json = TreasuryCodecs.getTreasuryTransactionsIdResponseCodecAlternative0Registry.select(listOf("GetTreasuryTransactionsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTreasuryTransactionsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTreasuryTransactionsIdResponse.DefaultJson(
          json = TreasuryCodecs.getTreasuryTransactionsIdResponseCodecAlternative1Registry.select(listOf("GetTreasuryTransactionsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTreasuryTransactionsIdResponse = GetTreasuryTransactionsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryCreditReversals`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostTreasuryCreditReversalsResponse {
    public class SuccessJson(
      public val json: TreasuryCreditReversal,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryCreditReversalsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryCreditReversalsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryCreditReversalsResponse
  }

  private object PostTreasuryCreditReversalsResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryCreditReversalsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryCreditReversalsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryCreditReversalsResponse> = when {
      alternative.id == "PostTreasuryCreditReversals.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryCreditReversalsResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryCreditReversalsResponseCodecAlternative0Registry.select(listOf("PostTreasuryCreditReversals.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryCreditReversals.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryCreditReversalsResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryCreditReversalsResponseCodecAlternative1Registry.select(listOf("PostTreasuryCreditReversals.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryCreditReversalsResponse = PostTreasuryCreditReversalsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryDebitReversals`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostTreasuryDebitReversalsResponse {
    public class SuccessJson(
      public val json: TreasuryDebitReversal,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryDebitReversalsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryDebitReversalsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryDebitReversalsResponse
  }

  private object PostTreasuryDebitReversalsResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryDebitReversalsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryDebitReversalsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryDebitReversalsResponse> = when {
      alternative.id == "PostTreasuryDebitReversals.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryDebitReversalsResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryDebitReversalsResponseCodecAlternative0Registry.select(listOf("PostTreasuryDebitReversals.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryDebitReversals.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryDebitReversalsResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryDebitReversalsResponseCodecAlternative1Registry.select(listOf("PostTreasuryDebitReversals.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryDebitReversalsResponse = PostTreasuryDebitReversalsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryFinancialAccountsFinancialAccountClose`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostTreasuryFinancialAccountsFinancialAccountCloseResponse {
    public class SuccessJson(
      public val json: TreasuryFinancialAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryFinancialAccountsFinancialAccountCloseResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryFinancialAccountsFinancialAccountCloseResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryFinancialAccountsFinancialAccountCloseResponse
  }

  private object PostTreasuryFinancialAccountsFinancialAccountCloseResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryFinancialAccountsFinancialAccountCloseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryFinancialAccountsFinancialAccountCloseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryFinancialAccountsFinancialAccountCloseResponse> = when {
      alternative.id == "PostTreasuryFinancialAccountsFinancialAccountClose.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryFinancialAccountsFinancialAccountCloseResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryFinancialAccountsFinancialAccountCloseResponseCodecAlternative0Registry.select(listOf("PostTreasuryFinancialAccountsFinancialAccountClose.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryFinancialAccountsFinancialAccountClose.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryFinancialAccountsFinancialAccountCloseResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryFinancialAccountsFinancialAccountCloseResponseCodecAlternative1Registry.select(listOf("PostTreasuryFinancialAccountsFinancialAccountClose.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryFinancialAccountsFinancialAccountCloseResponse = PostTreasuryFinancialAccountsFinancialAccountCloseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryFinancialAccountsFinancialAccountFeatures`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse {
    public class SuccessJson(
      public val json: TreasuryFinancialAccountFeatures,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse
  }

  private object PostTreasuryFinancialAccountsFinancialAccountFeaturesResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse> = when {
      alternative.id == "PostTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative0Registry.select(listOf("PostTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryFinancialAccountsFinancialAccountFeaturesResponseCodecAlternative1Registry.select(listOf("PostTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse = PostTreasuryFinancialAccountsFinancialAccountFeaturesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryInboundTransfers`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostTreasuryInboundTransfersResponse {
    public class SuccessJson(
      public val json: TreasuryInboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryInboundTransfersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryInboundTransfersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryInboundTransfersResponse
  }

  private object PostTreasuryInboundTransfersResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryInboundTransfersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryInboundTransfersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryInboundTransfersResponse> = when {
      alternative.id == "PostTreasuryInboundTransfers.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryInboundTransfersResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryInboundTransfersResponseCodecAlternative0Registry.select(listOf("PostTreasuryInboundTransfers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryInboundTransfers.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryInboundTransfersResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryInboundTransfersResponseCodecAlternative1Registry.select(listOf("PostTreasuryInboundTransfers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryInboundTransfersResponse = PostTreasuryInboundTransfersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryInboundTransfersInboundTransferCancel`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostTreasuryInboundTransfersInboundTransferCancelResponse {
    public class SuccessJson(
      public val json: TreasuryInboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryInboundTransfersInboundTransferCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryInboundTransfersInboundTransferCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryInboundTransfersInboundTransferCancelResponse
  }

  private object PostTreasuryInboundTransfersInboundTransferCancelResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryInboundTransfersInboundTransferCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryInboundTransfersInboundTransferCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryInboundTransfersInboundTransferCancelResponse> = when {
      alternative.id == "PostTreasuryInboundTransfersInboundTransferCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryInboundTransfersInboundTransferCancelResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryInboundTransfersInboundTransferCancelResponseCodecAlternative0Registry.select(listOf("PostTreasuryInboundTransfersInboundTransferCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryInboundTransfersInboundTransferCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryInboundTransfersInboundTransferCancelResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryInboundTransfersInboundTransferCancelResponseCodecAlternative1Registry.select(listOf("PostTreasuryInboundTransfersInboundTransferCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryInboundTransfersInboundTransferCancelResponse = PostTreasuryInboundTransfersInboundTransferCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryOutboundPaymentsIdCancel`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostTreasuryOutboundPaymentsIdCancelResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundPayment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundPaymentsIdCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundPaymentsIdCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundPaymentsIdCancelResponse
  }

  private object PostTreasuryOutboundPaymentsIdCancelResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryOutboundPaymentsIdCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryOutboundPaymentsIdCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryOutboundPaymentsIdCancelResponse> = when {
      alternative.id == "PostTreasuryOutboundPaymentsIdCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryOutboundPaymentsIdCancelResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryOutboundPaymentsIdCancelResponseCodecAlternative0Registry.select(listOf("PostTreasuryOutboundPaymentsIdCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryOutboundPaymentsIdCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryOutboundPaymentsIdCancelResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryOutboundPaymentsIdCancelResponseCodecAlternative1Registry.select(listOf("PostTreasuryOutboundPaymentsIdCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryOutboundPaymentsIdCancelResponse = PostTreasuryOutboundPaymentsIdCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryOutboundTransfers`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostTreasuryOutboundTransfersResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundTransfersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundTransfersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundTransfersResponse
  }

  private object PostTreasuryOutboundTransfersResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryOutboundTransfersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryOutboundTransfersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryOutboundTransfersResponse> = when {
      alternative.id == "PostTreasuryOutboundTransfers.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryOutboundTransfersResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryOutboundTransfersResponseCodecAlternative0Registry.select(listOf("PostTreasuryOutboundTransfers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryOutboundTransfers.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryOutboundTransfersResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryOutboundTransfersResponseCodecAlternative1Registry.select(listOf("PostTreasuryOutboundTransfers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryOutboundTransfersResponse = PostTreasuryOutboundTransfersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTreasuryOutboundTransfersOutboundTransferCancel`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostTreasuryOutboundTransfersOutboundTransferCancelResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundTransfersOutboundTransferCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundTransfersOutboundTransferCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTreasuryOutboundTransfersOutboundTransferCancelResponse
  }

  private object PostTreasuryOutboundTransfersOutboundTransferCancelResponseDecoder : SdkResponseAlternativeDecoder<PostTreasuryOutboundTransfersOutboundTransferCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTreasuryOutboundTransfersOutboundTransferCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTreasuryOutboundTransfersOutboundTransferCancelResponse> = when {
      alternative.id == "PostTreasuryOutboundTransfersOutboundTransferCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTreasuryOutboundTransfersOutboundTransferCancelResponse.SuccessJson(
          json = TreasuryCodecs.postTreasuryOutboundTransfersOutboundTransferCancelResponseCodecAlternative0Registry.select(listOf("PostTreasuryOutboundTransfersOutboundTransferCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTreasuryOutboundTransfersOutboundTransferCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTreasuryOutboundTransfersOutboundTransferCancelResponse.DefaultJson(
          json = TreasuryCodecs.postTreasuryOutboundTransfersOutboundTransferCancelResponseCodecAlternative1Registry.select(listOf("PostTreasuryOutboundTransfersOutboundTransferCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTreasuryOutboundTransfersOutboundTransferCancelResponse = PostTreasuryOutboundTransfersOutboundTransferCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getTreasuryCreditReversalsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryCreditReversals",
          method = "GET",
          path = "/v1/treasury/credit_reversals",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryCreditReversalsGetResponse200JsonX4cbf142d",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryCreditReversals.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryCreditReversals.response.alternative1",
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

    internal val getTreasuryCreditReversalsCreditReversalMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryCreditReversalsCreditReversal",
          method = "GET",
          path = "/v1/treasury/credit_reversals/{credit_reversal}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryCreditReversal",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryCreditReversalsCreditReversal.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryCreditReversalsCreditReversal.response.alternative1",
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

    internal val getTreasuryDebitReversalsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryDebitReversals",
          method = "GET",
          path = "/v1/treasury/debit_reversals",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryDebitReversalsGetResponse200JsonXa5dd1c17",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryDebitReversals.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryDebitReversals.response.alternative1",
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

    internal val getTreasuryDebitReversalsDebitReversalMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryDebitReversalsDebitReversal",
          method = "GET",
          path = "/v1/treasury/debit_reversals/{debit_reversal}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryDebitReversal",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryDebitReversalsDebitReversal.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryDebitReversalsDebitReversal.response.alternative1",
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

    internal val getTreasuryFinancialAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryFinancialAccounts",
          method = "GET",
          path = "/v1/treasury/financial_accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryFinancialAccountsGetResponse200JsonXdd9dd9cc",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryFinancialAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryFinancialAccounts.response.alternative1",
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

    internal val getTreasuryFinancialAccountsFinancialAccountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryFinancialAccountsFinancialAccount",
          method = "GET",
          path = "/v1/treasury/financial_accounts/{financial_account}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryFinancialAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryFinancialAccountsFinancialAccount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryFinancialAccountsFinancialAccount.response.alternative1",
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

    internal val getTreasuryFinancialAccountsFinancialAccountFeaturesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryFinancialAccountsFinancialAccountFeatures",
          method = "GET",
          path = "/v1/treasury/financial_accounts/{financial_account}/features",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryFinancialAccountFeatures",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative1",
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

    internal val getTreasuryInboundTransfersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryInboundTransfers",
          method = "GET",
          path = "/v1/treasury/inbound_transfers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryInboundTransfersGetResponse200JsonX15316233",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryInboundTransfers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryInboundTransfers.response.alternative1",
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

    internal val getTreasuryInboundTransfersIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryInboundTransfersId",
          method = "GET",
          path = "/v1/treasury/inbound_transfers/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryInboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryInboundTransfersId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryInboundTransfersId.response.alternative1",
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

    internal val getTreasuryOutboundPaymentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryOutboundPayments",
          method = "GET",
          path = "/v1/treasury/outbound_payments",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryOutboundPaymentsGetResponse200JsonXc65b19e1",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryOutboundPayments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryOutboundPayments.response.alternative1",
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

    internal val getTreasuryOutboundPaymentsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryOutboundPaymentsId",
          method = "GET",
          path = "/v1/treasury/outbound_payments/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundPayment",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryOutboundPaymentsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryOutboundPaymentsId.response.alternative1",
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

    internal val getTreasuryOutboundTransfersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryOutboundTransfers",
          method = "GET",
          path = "/v1/treasury/outbound_transfers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryOutboundTransfersGetResponse200JsonXb5c8977f",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryOutboundTransfers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryOutboundTransfers.response.alternative1",
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

    internal val getTreasuryOutboundTransfersOutboundTransferMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryOutboundTransfersOutboundTransfer",
          method = "GET",
          path = "/v1/treasury/outbound_transfers/{outbound_transfer}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryOutboundTransfersOutboundTransfer.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryOutboundTransfersOutboundTransfer.response.alternative1",
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

    internal val getTreasuryReceivedCreditsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryReceivedCredits",
          method = "GET",
          path = "/v1/treasury/received_credits",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryReceivedCreditsGetResponse200JsonX654d8f88",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryReceivedCredits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryReceivedCredits.response.alternative1",
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

    internal val getTreasuryReceivedCreditsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryReceivedCreditsId",
          method = "GET",
          path = "/v1/treasury/received_credits/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryReceivedCredit",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryReceivedCreditsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryReceivedCreditsId.response.alternative1",
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

    internal val getTreasuryReceivedDebitsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryReceivedDebits",
          method = "GET",
          path = "/v1/treasury/received_debits",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryReceivedDebitsGetResponse200JsonX99ded6cc",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryReceivedDebits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryReceivedDebits.response.alternative1",
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

    internal val getTreasuryReceivedDebitsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryReceivedDebitsId",
          method = "GET",
          path = "/v1/treasury/received_debits/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryReceivedDebit",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryReceivedDebitsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryReceivedDebitsId.response.alternative1",
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

    internal val getTreasuryTransactionEntriesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryTransactionEntries",
          method = "GET",
          path = "/v1/treasury/transaction_entries",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TreasuryTransactionEntriesGetResponse200JsonXdc4dd827",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryTransactionEntries.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryTransactionEntries.response.alternative1",
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

    internal val getTreasuryTransactionEntriesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryTransactionEntriesId",
          method = "GET",
          path = "/v1/treasury/transaction_entries/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryTransactionEntry",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryTransactionEntriesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryTransactionEntriesId.response.alternative1",
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

    internal val getTreasuryTransactionsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTreasuryTransactionsId",
          method = "GET",
          path = "/v1/treasury/transactions/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryTransactionsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTreasuryTransactionsId.response.alternative1",
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

    internal val postTreasuryCreditReversalsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryCreditReversals",
          method = "POST",
          path = "/v1/treasury/credit_reversals",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryCreditReversal",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryCreditReversals.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryCreditReversals.response.alternative1",
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

    internal val postTreasuryDebitReversalsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryDebitReversals",
          method = "POST",
          path = "/v1/treasury/debit_reversals",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryDebitReversal",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryDebitReversals.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryDebitReversals.response.alternative1",
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

    internal val postTreasuryFinancialAccountsFinancialAccountCloseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryFinancialAccountsFinancialAccountClose",
          method = "POST",
          path = "/v1/treasury/financial_accounts/{financial_account}/close",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryFinancialAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryFinancialAccountsFinancialAccountClose.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryFinancialAccountsFinancialAccountClose.response.alternative1",
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

    internal val postTreasuryFinancialAccountsFinancialAccountFeaturesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryFinancialAccountsFinancialAccountFeatures",
          method = "POST",
          path = "/v1/treasury/financial_accounts/{financial_account}/features",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryFinancialAccountFeatures",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryFinancialAccountsFinancialAccountFeatures.response.alternative1",
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

    internal val postTreasuryInboundTransfersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryInboundTransfers",
          method = "POST",
          path = "/v1/treasury/inbound_transfers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryInboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryInboundTransfers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryInboundTransfers.response.alternative1",
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

    internal val postTreasuryInboundTransfersInboundTransferCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryInboundTransfersInboundTransferCancel",
          method = "POST",
          path = "/v1/treasury/inbound_transfers/{inbound_transfer}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryInboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryInboundTransfersInboundTransferCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryInboundTransfersInboundTransferCancel.response.alternative1",
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

    internal val postTreasuryOutboundPaymentsIdCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryOutboundPaymentsIdCancel",
          method = "POST",
          path = "/v1/treasury/outbound_payments/{id}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundPayment",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryOutboundPaymentsIdCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryOutboundPaymentsIdCancel.response.alternative1",
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

    internal val postTreasuryOutboundTransfersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryOutboundTransfers",
          method = "POST",
          path = "/v1/treasury/outbound_transfers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryOutboundTransfers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryOutboundTransfers.response.alternative1",
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

    internal val postTreasuryOutboundTransfersOutboundTransferCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTreasuryOutboundTransfersOutboundTransferCancel",
          method = "POST",
          path = "/v1/treasury/outbound_transfers/{outbound_transfer}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryOutboundTransfersOutboundTransferCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTreasuryOutboundTransfersOutboundTransferCancel.response.alternative1",
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
