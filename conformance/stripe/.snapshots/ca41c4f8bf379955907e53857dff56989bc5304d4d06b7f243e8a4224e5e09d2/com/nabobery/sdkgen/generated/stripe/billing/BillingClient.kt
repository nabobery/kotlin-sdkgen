package com.nabobery.sdkgen.generated.stripe.billing

import com.nabobery.sdkgen.generated.stripe.BillingAlert
import com.nabobery.sdkgen.generated.stripe.BillingCreditBalanceTransaction
import com.nabobery.sdkgen.generated.stripe.BillingCreditGrant
import com.nabobery.sdkgen.generated.stripe.BillingMeter
import com.nabobery.sdkgen.generated.stripe.BillingMeterEvent
import com.nabobery.sdkgen.generated.stripe.BillingMeterEventAdjustment
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsActivatePostRequestFormX225f3a0e
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsArchivePostRequestFormX4a2bef25
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsDeactivatePostRequestFormXa341320a
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsGetParameterX18b42878
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsGetResponse200JsonX685d5281
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsPostRequestFormX87b5449f
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditBalanceTransactionsGetResponse200JsonX94c918a1
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsExpirePostRequestFormX016df411
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsGetResponse200JsonX5bc23824
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsPostRequestFormX173ddf21
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsPostRequestFormX39da8216
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsVoidPostRequestFormX22043ea4
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMeterEventAdjustmentsPostRequestFormXc79d0113
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMeterEventsPostRequestFormXce007751
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersDeactivatePostRequestFormX5700b94c
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersEventSummariesGetParameterXc43685d8
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersEventSummariesGetResponse200JsonX209c3dc4
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersGetParameterX34cf0a7b
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersGetResponse200JsonXd521ab9e
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersPostRequestFormX3fb35b25
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersPostRequestFormXb01fece4
import com.nabobery.sdkgen.generated.stripe.InlineV1BillingMetersReactivatePostRequestFormX0662a155
import com.nabobery.sdkgen.generated.stripe.SdkJson
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

internal object BillingCodecs {
  internal const val GETBILLINGALERTS_REQUEST_CODEC_ID: String = "GetBillingAlerts.request"

  private val getBillingAlertsRequestCodec: MediaTypeCodec<JsonObject?> = GetBillingAlertsFormCodec

  private val getBillingAlertsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1BillingAlertsGetResponse200JsonX685d5281> =
      KotlinxSerializationCodec("GetBillingAlerts.response.alternative0", InlineV1BillingAlertsGetResponse200JsonX685d5281.Serializer, SdkJson)

  internal val getBillingAlertsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1BillingAlertsGetResponse200JsonX685d5281> =
      MediaTypeCodecRegistry.of(getBillingAlertsResponseCodecAlternative0Codec)

  private val getBillingAlertsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingAlerts.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingAlertsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingAlertsResponseCodecAlternative1Codec)

  internal val getBillingAlertsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingAlertsRequestCodec)

  internal const val GETBILLINGALERTSID_REQUEST_CODEC_ID: String = "GetBillingAlertsId.request"

  private val getBillingAlertsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingAlertsIdFormCodec

  private val getBillingAlertsIdResponseCodecAlternative0Codec: MediaTypeCodec<BillingAlert> =
      KotlinxSerializationCodec("GetBillingAlertsId.response.alternative0", BillingAlert.Serializer, SdkJson)

  internal val getBillingAlertsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingAlert> =
      MediaTypeCodecRegistry.of(getBillingAlertsIdResponseCodecAlternative0Codec)

  private val getBillingAlertsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingAlertsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingAlertsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingAlertsIdResponseCodecAlternative1Codec)

  internal val getBillingAlertsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingAlertsIdRequestCodec)

  internal const val GETBILLINGCREDITBALANCETRANSACTIONS_REQUEST_CODEC_ID: String =
      "GetBillingCreditBalanceTransactions.request"

  private val getBillingCreditBalanceTransactionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingCreditBalanceTransactionsFormCodec

  private val getBillingCreditBalanceTransactionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1BillingCreditBalanceTransactionsGetResponse200JsonX94c918a1> =
      KotlinxSerializationCodec("GetBillingCreditBalanceTransactions.response.alternative0", InlineV1BillingCreditBalanceTransactionsGetResponse200JsonX94c918a1.Serializer, SdkJson)

  internal val getBillingCreditBalanceTransactionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1BillingCreditBalanceTransactionsGetResponse200JsonX94c918a1> =
      MediaTypeCodecRegistry.of(getBillingCreditBalanceTransactionsResponseCodecAlternative0Codec)

  private val getBillingCreditBalanceTransactionsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingCreditBalanceTransactions.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingCreditBalanceTransactionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingCreditBalanceTransactionsResponseCodecAlternative1Codec)

  internal val getBillingCreditBalanceTransactionsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingCreditBalanceTransactionsRequestCodec)

  internal const val GETBILLINGCREDITBALANCETRANSACTIONSID_REQUEST_CODEC_ID: String =
      "GetBillingCreditBalanceTransactionsId.request"

  private val getBillingCreditBalanceTransactionsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingCreditBalanceTransactionsIdFormCodec

  private val getBillingCreditBalanceTransactionsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingCreditBalanceTransaction> =
      KotlinxSerializationCodec("GetBillingCreditBalanceTransactionsId.response.alternative0", BillingCreditBalanceTransaction.Serializer, SdkJson)

  internal val getBillingCreditBalanceTransactionsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingCreditBalanceTransaction> =
      MediaTypeCodecRegistry.of(getBillingCreditBalanceTransactionsIdResponseCodecAlternative0Codec)

  private val getBillingCreditBalanceTransactionsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingCreditBalanceTransactionsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingCreditBalanceTransactionsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingCreditBalanceTransactionsIdResponseCodecAlternative1Codec)

  internal val getBillingCreditBalanceTransactionsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingCreditBalanceTransactionsIdRequestCodec)

  internal const val GETBILLINGCREDITGRANTS_REQUEST_CODEC_ID: String =
      "GetBillingCreditGrants.request"

  private val getBillingCreditGrantsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingCreditGrantsFormCodec

  private val getBillingCreditGrantsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1BillingCreditGrantsGetResponse200JsonX5bc23824> =
      KotlinxSerializationCodec("GetBillingCreditGrants.response.alternative0", InlineV1BillingCreditGrantsGetResponse200JsonX5bc23824.Serializer, SdkJson)

  internal val getBillingCreditGrantsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1BillingCreditGrantsGetResponse200JsonX5bc23824> =
      MediaTypeCodecRegistry.of(getBillingCreditGrantsResponseCodecAlternative0Codec)

  private val getBillingCreditGrantsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingCreditGrants.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingCreditGrantsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingCreditGrantsResponseCodecAlternative1Codec)

  internal val getBillingCreditGrantsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingCreditGrantsRequestCodec)

  internal const val GETBILLINGCREDITGRANTSID_REQUEST_CODEC_ID: String =
      "GetBillingCreditGrantsId.request"

  private val getBillingCreditGrantsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingCreditGrantsIdFormCodec

  private val getBillingCreditGrantsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingCreditGrant> =
      KotlinxSerializationCodec("GetBillingCreditGrantsId.response.alternative0", BillingCreditGrant.Serializer, SdkJson)

  internal val getBillingCreditGrantsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingCreditGrant> =
      MediaTypeCodecRegistry.of(getBillingCreditGrantsIdResponseCodecAlternative0Codec)

  private val getBillingCreditGrantsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingCreditGrantsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingCreditGrantsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingCreditGrantsIdResponseCodecAlternative1Codec)

  internal val getBillingCreditGrantsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingCreditGrantsIdRequestCodec)

  internal const val GETBILLINGMETERS_REQUEST_CODEC_ID: String = "GetBillingMeters.request"

  private val getBillingMetersRequestCodec: MediaTypeCodec<JsonObject?> = GetBillingMetersFormCodec

  private val getBillingMetersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1BillingMetersGetResponse200JsonXd521ab9e> =
      KotlinxSerializationCodec("GetBillingMeters.response.alternative0", InlineV1BillingMetersGetResponse200JsonXd521ab9e.Serializer, SdkJson)

  internal val getBillingMetersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1BillingMetersGetResponse200JsonXd521ab9e> =
      MediaTypeCodecRegistry.of(getBillingMetersResponseCodecAlternative0Codec)

  private val getBillingMetersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingMeters.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingMetersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingMetersResponseCodecAlternative1Codec)

  internal val getBillingMetersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingMetersRequestCodec)

  internal const val GETBILLINGMETERSID_REQUEST_CODEC_ID: String = "GetBillingMetersId.request"

  private val getBillingMetersIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingMetersIdFormCodec

  private val getBillingMetersIdResponseCodecAlternative0Codec: MediaTypeCodec<BillingMeter> =
      KotlinxSerializationCodec("GetBillingMetersId.response.alternative0", BillingMeter.Serializer, SdkJson)

  internal val getBillingMetersIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingMeter> =
      MediaTypeCodecRegistry.of(getBillingMetersIdResponseCodecAlternative0Codec)

  private val getBillingMetersIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetBillingMetersId.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingMetersIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingMetersIdResponseCodecAlternative1Codec)

  internal val getBillingMetersIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingMetersIdRequestCodec)

  internal const val GETBILLINGMETERSIDEVENTSUMMARIES_REQUEST_CODEC_ID: String =
      "GetBillingMetersIdEventSummaries.request"

  private val getBillingMetersIdEventSummariesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetBillingMetersIdEventSummariesFormCodec

  private val getBillingMetersIdEventSummariesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1BillingMetersEventSummariesGetResponse200JsonX209c3dc4> =
      KotlinxSerializationCodec("GetBillingMetersIdEventSummaries.response.alternative0", InlineV1BillingMetersEventSummariesGetResponse200JsonX209c3dc4.Serializer, SdkJson)

  internal val getBillingMetersIdEventSummariesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1BillingMetersEventSummariesGetResponse200JsonX209c3dc4> =
      MediaTypeCodecRegistry.of(getBillingMetersIdEventSummariesResponseCodecAlternative0Codec)

  private val getBillingMetersIdEventSummariesResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetBillingMetersIdEventSummaries.response.alternative1", Error.Serializer, SdkJson)

  internal val getBillingMetersIdEventSummariesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getBillingMetersIdEventSummariesResponseCodecAlternative1Codec)

  internal val getBillingMetersIdEventSummariesRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getBillingMetersIdEventSummariesRequestCodec)

  internal const val POSTBILLINGALERTS_REQUEST_CODEC_ID: String = "PostBillingAlerts.request"

  private val postBillingAlertsRequestCodec:
      MediaTypeCodec<InlineV1BillingAlertsPostRequestFormX87b5449f> = PostBillingAlertsFormCodec

  private val postBillingAlertsResponseCodecAlternative0Codec: MediaTypeCodec<BillingAlert> =
      KotlinxSerializationCodec("PostBillingAlerts.response.alternative0", BillingAlert.Serializer, SdkJson)

  internal val postBillingAlertsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingAlert> =
      MediaTypeCodecRegistry.of(postBillingAlertsResponseCodecAlternative0Codec)

  private val postBillingAlertsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingAlerts.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingAlertsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingAlertsResponseCodecAlternative1Codec)

  internal val postBillingAlertsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingAlertsPostRequestFormX87b5449f> =
      MediaTypeCodecRegistry.of(postBillingAlertsRequestCodec)

  internal const val POSTBILLINGALERTSIDACTIVATE_REQUEST_CODEC_ID: String =
      "PostBillingAlertsIdActivate.request"

  private val postBillingAlertsIdActivateRequestCodec:
      MediaTypeCodec<InlineV1BillingAlertsActivatePostRequestFormX225f3a0e?> =
      PostBillingAlertsIdActivateFormCodec

  private val postBillingAlertsIdActivateResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingAlert> =
      KotlinxSerializationCodec("PostBillingAlertsIdActivate.response.alternative0", BillingAlert.Serializer, SdkJson)

  internal val postBillingAlertsIdActivateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingAlert> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdActivateResponseCodecAlternative0Codec)

  private val postBillingAlertsIdActivateResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingAlertsIdActivate.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingAlertsIdActivateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdActivateResponseCodecAlternative1Codec)

  internal val postBillingAlertsIdActivateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingAlertsActivatePostRequestFormX225f3a0e?> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdActivateRequestCodec)

  internal const val POSTBILLINGALERTSIDARCHIVE_REQUEST_CODEC_ID: String =
      "PostBillingAlertsIdArchive.request"

  private val postBillingAlertsIdArchiveRequestCodec:
      MediaTypeCodec<InlineV1BillingAlertsArchivePostRequestFormX4a2bef25?> =
      PostBillingAlertsIdArchiveFormCodec

  private val postBillingAlertsIdArchiveResponseCodecAlternative0Codec: MediaTypeCodec<BillingAlert>
      =
      KotlinxSerializationCodec("PostBillingAlertsIdArchive.response.alternative0", BillingAlert.Serializer, SdkJson)

  internal val postBillingAlertsIdArchiveResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingAlert> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdArchiveResponseCodecAlternative0Codec)

  private val postBillingAlertsIdArchiveResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingAlertsIdArchive.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingAlertsIdArchiveResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdArchiveResponseCodecAlternative1Codec)

  internal val postBillingAlertsIdArchiveRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingAlertsArchivePostRequestFormX4a2bef25?> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdArchiveRequestCodec)

  internal const val POSTBILLINGALERTSIDDEACTIVATE_REQUEST_CODEC_ID: String =
      "PostBillingAlertsIdDeactivate.request"

  private val postBillingAlertsIdDeactivateRequestCodec:
      MediaTypeCodec<InlineV1BillingAlertsDeactivatePostRequestFormXa341320a?> =
      PostBillingAlertsIdDeactivateFormCodec

  private val postBillingAlertsIdDeactivateResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingAlert> =
      KotlinxSerializationCodec("PostBillingAlertsIdDeactivate.response.alternative0", BillingAlert.Serializer, SdkJson)

  internal val postBillingAlertsIdDeactivateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingAlert> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdDeactivateResponseCodecAlternative0Codec)

  private val postBillingAlertsIdDeactivateResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingAlertsIdDeactivate.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingAlertsIdDeactivateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdDeactivateResponseCodecAlternative1Codec)

  internal val postBillingAlertsIdDeactivateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingAlertsDeactivatePostRequestFormXa341320a?> =
      MediaTypeCodecRegistry.of(postBillingAlertsIdDeactivateRequestCodec)

  internal const val POSTBILLINGCREDITGRANTS_REQUEST_CODEC_ID: String =
      "PostBillingCreditGrants.request"

  private val postBillingCreditGrantsRequestCodec:
      MediaTypeCodec<InlineV1BillingCreditGrantsPostRequestFormX173ddf21> =
      PostBillingCreditGrantsFormCodec

  private val postBillingCreditGrantsResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingCreditGrant> =
      KotlinxSerializationCodec("PostBillingCreditGrants.response.alternative0", BillingCreditGrant.Serializer, SdkJson)

  internal val postBillingCreditGrantsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingCreditGrant> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsResponseCodecAlternative0Codec)

  private val postBillingCreditGrantsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingCreditGrants.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingCreditGrantsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsResponseCodecAlternative1Codec)

  internal val postBillingCreditGrantsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingCreditGrantsPostRequestFormX173ddf21> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsRequestCodec)

  internal const val POSTBILLINGCREDITGRANTSID_REQUEST_CODEC_ID: String =
      "PostBillingCreditGrantsId.request"

  private val postBillingCreditGrantsIdRequestCodec:
      MediaTypeCodec<InlineV1BillingCreditGrantsPostRequestFormX39da8216?> =
      PostBillingCreditGrantsIdFormCodec

  private val postBillingCreditGrantsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingCreditGrant> =
      KotlinxSerializationCodec("PostBillingCreditGrantsId.response.alternative0", BillingCreditGrant.Serializer, SdkJson)

  internal val postBillingCreditGrantsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingCreditGrant> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdResponseCodecAlternative0Codec)

  private val postBillingCreditGrantsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingCreditGrantsId.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingCreditGrantsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdResponseCodecAlternative1Codec)

  internal val postBillingCreditGrantsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingCreditGrantsPostRequestFormX39da8216?> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdRequestCodec)

  internal const val POSTBILLINGCREDITGRANTSIDEXPIRE_REQUEST_CODEC_ID: String =
      "PostBillingCreditGrantsIdExpire.request"

  private val postBillingCreditGrantsIdExpireRequestCodec:
      MediaTypeCodec<InlineV1BillingCreditGrantsExpirePostRequestFormX016df411?> =
      PostBillingCreditGrantsIdExpireFormCodec

  private val postBillingCreditGrantsIdExpireResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingCreditGrant> =
      KotlinxSerializationCodec("PostBillingCreditGrantsIdExpire.response.alternative0", BillingCreditGrant.Serializer, SdkJson)

  internal val postBillingCreditGrantsIdExpireResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingCreditGrant> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdExpireResponseCodecAlternative0Codec)

  private val postBillingCreditGrantsIdExpireResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingCreditGrantsIdExpire.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingCreditGrantsIdExpireResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdExpireResponseCodecAlternative1Codec)

  internal val postBillingCreditGrantsIdExpireRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingCreditGrantsExpirePostRequestFormX016df411?> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdExpireRequestCodec)

  internal const val POSTBILLINGCREDITGRANTSIDVOID_REQUEST_CODEC_ID: String =
      "PostBillingCreditGrantsIdVoid.request"

  private val postBillingCreditGrantsIdVoidRequestCodec:
      MediaTypeCodec<InlineV1BillingCreditGrantsVoidPostRequestFormX22043ea4?> =
      PostBillingCreditGrantsIdVoidFormCodec

  private val postBillingCreditGrantsIdVoidResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingCreditGrant> =
      KotlinxSerializationCodec("PostBillingCreditGrantsIdVoid.response.alternative0", BillingCreditGrant.Serializer, SdkJson)

  internal val postBillingCreditGrantsIdVoidResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingCreditGrant> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdVoidResponseCodecAlternative0Codec)

  private val postBillingCreditGrantsIdVoidResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingCreditGrantsIdVoid.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingCreditGrantsIdVoidResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdVoidResponseCodecAlternative1Codec)

  internal val postBillingCreditGrantsIdVoidRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingCreditGrantsVoidPostRequestFormX22043ea4?> =
      MediaTypeCodecRegistry.of(postBillingCreditGrantsIdVoidRequestCodec)

  internal const val POSTBILLINGMETEREVENTADJUSTMENTS_REQUEST_CODEC_ID: String =
      "PostBillingMeterEventAdjustments.request"

  private val postBillingMeterEventAdjustmentsRequestCodec:
      MediaTypeCodec<InlineV1BillingMeterEventAdjustmentsPostRequestFormXc79d0113> =
      PostBillingMeterEventAdjustmentsFormCodec

  private val postBillingMeterEventAdjustmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingMeterEventAdjustment> =
      KotlinxSerializationCodec("PostBillingMeterEventAdjustments.response.alternative0", BillingMeterEventAdjustment.Serializer, SdkJson)

  internal val postBillingMeterEventAdjustmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingMeterEventAdjustment> =
      MediaTypeCodecRegistry.of(postBillingMeterEventAdjustmentsResponseCodecAlternative0Codec)

  private val postBillingMeterEventAdjustmentsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostBillingMeterEventAdjustments.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingMeterEventAdjustmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingMeterEventAdjustmentsResponseCodecAlternative1Codec)

  internal val postBillingMeterEventAdjustmentsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingMeterEventAdjustmentsPostRequestFormXc79d0113> =
      MediaTypeCodecRegistry.of(postBillingMeterEventAdjustmentsRequestCodec)

  internal const val POSTBILLINGMETEREVENTS_REQUEST_CODEC_ID: String =
      "PostBillingMeterEvents.request"

  private val postBillingMeterEventsRequestCodec:
      MediaTypeCodec<InlineV1BillingMeterEventsPostRequestFormXce007751> =
      PostBillingMeterEventsFormCodec

  private val postBillingMeterEventsResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingMeterEvent> =
      KotlinxSerializationCodec("PostBillingMeterEvents.response.alternative0", BillingMeterEvent.Serializer, SdkJson)

  internal val postBillingMeterEventsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingMeterEvent> =
      MediaTypeCodecRegistry.of(postBillingMeterEventsResponseCodecAlternative0Codec)

  private val postBillingMeterEventsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingMeterEvents.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingMeterEventsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingMeterEventsResponseCodecAlternative1Codec)

  internal val postBillingMeterEventsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingMeterEventsPostRequestFormXce007751> =
      MediaTypeCodecRegistry.of(postBillingMeterEventsRequestCodec)

  internal const val POSTBILLINGMETERS_REQUEST_CODEC_ID: String = "PostBillingMeters.request"

  private val postBillingMetersRequestCodec:
      MediaTypeCodec<InlineV1BillingMetersPostRequestFormXb01fece4> = PostBillingMetersFormCodec

  private val postBillingMetersResponseCodecAlternative0Codec: MediaTypeCodec<BillingMeter> =
      KotlinxSerializationCodec("PostBillingMeters.response.alternative0", BillingMeter.Serializer, SdkJson)

  internal val postBillingMetersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingMeter> =
      MediaTypeCodecRegistry.of(postBillingMetersResponseCodecAlternative0Codec)

  private val postBillingMetersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingMeters.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingMetersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingMetersResponseCodecAlternative1Codec)

  internal val postBillingMetersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingMetersPostRequestFormXb01fece4> =
      MediaTypeCodecRegistry.of(postBillingMetersRequestCodec)

  internal const val POSTBILLINGMETERSID_REQUEST_CODEC_ID: String = "PostBillingMetersId.request"

  private val postBillingMetersIdRequestCodec:
      MediaTypeCodec<InlineV1BillingMetersPostRequestFormX3fb35b25?> = PostBillingMetersIdFormCodec

  private val postBillingMetersIdResponseCodecAlternative0Codec: MediaTypeCodec<BillingMeter> =
      KotlinxSerializationCodec("PostBillingMetersId.response.alternative0", BillingMeter.Serializer, SdkJson)

  internal val postBillingMetersIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingMeter> =
      MediaTypeCodecRegistry.of(postBillingMetersIdResponseCodecAlternative0Codec)

  private val postBillingMetersIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingMetersId.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingMetersIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingMetersIdResponseCodecAlternative1Codec)

  internal val postBillingMetersIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingMetersPostRequestFormX3fb35b25?> =
      MediaTypeCodecRegistry.of(postBillingMetersIdRequestCodec)

  internal const val POSTBILLINGMETERSIDDEACTIVATE_REQUEST_CODEC_ID: String =
      "PostBillingMetersIdDeactivate.request"

  private val postBillingMetersIdDeactivateRequestCodec:
      MediaTypeCodec<InlineV1BillingMetersDeactivatePostRequestFormX5700b94c?> =
      PostBillingMetersIdDeactivateFormCodec

  private val postBillingMetersIdDeactivateResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingMeter> =
      KotlinxSerializationCodec("PostBillingMetersIdDeactivate.response.alternative0", BillingMeter.Serializer, SdkJson)

  internal val postBillingMetersIdDeactivateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingMeter> =
      MediaTypeCodecRegistry.of(postBillingMetersIdDeactivateResponseCodecAlternative0Codec)

  private val postBillingMetersIdDeactivateResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingMetersIdDeactivate.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingMetersIdDeactivateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingMetersIdDeactivateResponseCodecAlternative1Codec)

  internal val postBillingMetersIdDeactivateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingMetersDeactivatePostRequestFormX5700b94c?> =
      MediaTypeCodecRegistry.of(postBillingMetersIdDeactivateRequestCodec)

  internal const val POSTBILLINGMETERSIDREACTIVATE_REQUEST_CODEC_ID: String =
      "PostBillingMetersIdReactivate.request"

  private val postBillingMetersIdReactivateRequestCodec:
      MediaTypeCodec<InlineV1BillingMetersReactivatePostRequestFormX0662a155?> =
      PostBillingMetersIdReactivateFormCodec

  private val postBillingMetersIdReactivateResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingMeter> =
      KotlinxSerializationCodec("PostBillingMetersIdReactivate.response.alternative0", BillingMeter.Serializer, SdkJson)

  internal val postBillingMetersIdReactivateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingMeter> =
      MediaTypeCodecRegistry.of(postBillingMetersIdReactivateResponseCodecAlternative0Codec)

  private val postBillingMetersIdReactivateResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostBillingMetersIdReactivate.response.alternative1", Error.Serializer, SdkJson)

  internal val postBillingMetersIdReactivateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postBillingMetersIdReactivateResponseCodecAlternative1Codec)

  internal val postBillingMetersIdReactivateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1BillingMetersReactivatePostRequestFormX0662a155?> =
      MediaTypeCodecRegistry.of(postBillingMetersIdReactivateRequestCodec)

  internal object GetBillingAlertsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingAlerts.request"

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

  internal object GetBillingAlertsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingAlertsId.request"

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

  internal object GetBillingCreditBalanceTransactionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingCreditBalanceTransactions.request"

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

  internal object GetBillingCreditBalanceTransactionsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingCreditBalanceTransactionsId.request"

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

  internal object GetBillingCreditGrantsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingCreditGrants.request"

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

  internal object GetBillingCreditGrantsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingCreditGrantsId.request"

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

  internal object GetBillingMetersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingMeters.request"

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

  internal object GetBillingMetersIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingMetersId.request"

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

  internal object GetBillingMetersIdEventSummariesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetBillingMetersIdEventSummaries.request"

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

  internal object PostBillingAlertsFormCodec : MediaTypeCodec<InlineV1BillingAlertsPostRequestFormX87b5449f> {
    override val id: String = "PostBillingAlerts.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingAlertsPostRequestFormX87b5449f, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("alert_type", request.alertType.value)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("title", request.title)
      request.usageThreshold?.let { formValue0 ->
        formValue0.filters?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("usage_threshold" + "[filters]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              formElement3.customer?.let { formValue5 ->
                form.add("usage_threshold" + "[filters]" + "[" + formIndex3 + "]" + "[customer]", formValue5)
              }
              form.add("usage_threshold" + "[filters]" + "[" + formIndex3 + "]" + "[type]", formElement3.type.value)
            }
          }
        }
        form.add("usage_threshold" + "[gte]", formValue0.gte.toString())
        form.add("usage_threshold" + "[meter]", formValue0.meter)
        form.add("usage_threshold" + "[recurrence]", formValue0.recurrence.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingAlertsPostRequestFormX87b5449f {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingAlertsIdActivateFormCodec : MediaTypeCodec<InlineV1BillingAlertsActivatePostRequestFormX225f3a0e?> {
    override val id: String = "PostBillingAlertsIdActivate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingAlertsActivatePostRequestFormX225f3a0e?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingAlertsActivatePostRequestFormX225f3a0e? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingAlertsIdArchiveFormCodec : MediaTypeCodec<InlineV1BillingAlertsArchivePostRequestFormX4a2bef25?> {
    override val id: String = "PostBillingAlertsIdArchive.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingAlertsArchivePostRequestFormX4a2bef25?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingAlertsArchivePostRequestFormX4a2bef25? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingAlertsIdDeactivateFormCodec : MediaTypeCodec<InlineV1BillingAlertsDeactivatePostRequestFormXa341320a?> {
    override val id: String = "PostBillingAlertsIdDeactivate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingAlertsDeactivatePostRequestFormXa341320a?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingAlertsDeactivatePostRequestFormXa341320a? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingCreditGrantsFormCodec : MediaTypeCodec<InlineV1BillingCreditGrantsPostRequestFormX173ddf21> {
    override val id: String = "PostBillingCreditGrants.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingCreditGrantsPostRequestFormX173ddf21, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount.monetary?.let { formValue1 ->
        form.add("amount" + "[monetary]" + "[currency]", formValue1.currency)
        form.add("amount" + "[monetary]" + "[value]", formValue1.value.toString())
      }
      form.add("amount" + "[type]", request.amount.type.value)
      request.applicabilityConfig.scope.priceType?.let { formValue2 ->
        form.add("applicability_config" + "[scope]" + "[price_type]", formValue2.value)
      }
      request.applicabilityConfig.scope.prices?.let { formValue2 ->
        if (formValue2.isEmpty()) {
          form.add("applicability_config" + "[scope]" + "[prices]", "")
        } else {
          formValue2.forEachIndexed { formIndex3, formElement3 ->
            form.add("applicability_config" + "[scope]" + "[prices]" + "[" + formIndex3 + "]" + "[id]", formElement3.id)
          }
        }
      }
      request.category?.let { formValue0 ->
        form.add("category", formValue0.value)
      }
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
      }
      request.customerAccount?.let { formValue0 ->
        form.add("customer_account", formValue0)
      }
      request.effectiveAt?.let { formValue0 ->
        form.add("effective_at", formValue0.toString())
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
      request.expiresAt?.let { formValue0 ->
        form.add("expires_at", formValue0.toString())
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      request.priority?.let { formValue0 ->
        form.add("priority", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingCreditGrantsPostRequestFormX173ddf21 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingCreditGrantsIdFormCodec : MediaTypeCodec<InlineV1BillingCreditGrantsPostRequestFormX39da8216?> {
    override val id: String = "PostBillingCreditGrantsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingCreditGrantsPostRequestFormX39da8216?, mediaType: String): SdkRequestBody {
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
      request.expiresAt?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            form.add("expires_at", requireNotNull(formValue0.branch1).toString())
          }
          formValue0.inlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a != null -> {
            form.add("expires_at", requireNotNull(formValue0.inlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingCreditGrantsPostRequestFormX39da8216? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingCreditGrantsIdExpireFormCodec : MediaTypeCodec<InlineV1BillingCreditGrantsExpirePostRequestFormX016df411?> {
    override val id: String = "PostBillingCreditGrantsIdExpire.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingCreditGrantsExpirePostRequestFormX016df411?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingCreditGrantsExpirePostRequestFormX016df411? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingCreditGrantsIdVoidFormCodec : MediaTypeCodec<InlineV1BillingCreditGrantsVoidPostRequestFormX22043ea4?> {
    override val id: String = "PostBillingCreditGrantsIdVoid.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingCreditGrantsVoidPostRequestFormX22043ea4?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingCreditGrantsVoidPostRequestFormX22043ea4? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingMeterEventAdjustmentsFormCodec : MediaTypeCodec<InlineV1BillingMeterEventAdjustmentsPostRequestFormXc79d0113> {
    override val id: String = "PostBillingMeterEventAdjustments.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingMeterEventAdjustmentsPostRequestFormXc79d0113, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.cancel?.let { formValue0 ->
        formValue0.identifier?.let { formValue2 ->
          form.add("cancel" + "[identifier]", formValue2)
        }
      }
      form.add("event_name", request.eventName)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("type", request.type.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingMeterEventAdjustmentsPostRequestFormXc79d0113 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingMeterEventsFormCodec : MediaTypeCodec<InlineV1BillingMeterEventsPostRequestFormXce007751> {
    override val id: String = "PostBillingMeterEvents.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingMeterEventsPostRequestFormXce007751, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("event_name", request.eventName)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.identifier?.let { formValue0 ->
        form.add("identifier", formValue0)
      }
      request.payload.forEach { (formKey0, formMapValue0) ->
        form.add("payload" + "[" + formKey0 + "]", formMapValue0)
      }
      request.timestamp?.let { formValue0 ->
        form.add("timestamp", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingMeterEventsPostRequestFormXce007751 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingMetersFormCodec : MediaTypeCodec<InlineV1BillingMetersPostRequestFormXb01fece4> {
    override val id: String = "PostBillingMeters.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingMetersPostRequestFormXb01fece4, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.customerMapping?.let { formValue0 ->
        form.add("customer_mapping" + "[event_payload_key]", formValue0.eventPayloadKey)
        form.add("customer_mapping" + "[type]", formValue0.type.value)
      }
      form.add("default_aggregation" + "[formula]", request.defaultAggregation.formula.value)
      form.add("display_name", request.displayName)
      form.add("event_name", request.eventName)
      request.eventTimeWindow?.let { formValue0 ->
        form.add("event_time_window", formValue0.value)
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
      request.valueSettings?.let { formValue0 ->
        form.add("value_settings" + "[event_payload_key]", formValue0.eventPayloadKey)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingMetersPostRequestFormXb01fece4 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingMetersIdFormCodec : MediaTypeCodec<InlineV1BillingMetersPostRequestFormX3fb35b25?> {
    override val id: String = "PostBillingMetersId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingMetersPostRequestFormX3fb35b25?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.displayName?.let { formValue0 ->
        form.add("display_name", formValue0)
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingMetersPostRequestFormX3fb35b25? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingMetersIdDeactivateFormCodec : MediaTypeCodec<InlineV1BillingMetersDeactivatePostRequestFormX5700b94c?> {
    override val id: String = "PostBillingMetersIdDeactivate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingMetersDeactivatePostRequestFormX5700b94c?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingMetersDeactivatePostRequestFormX5700b94c? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostBillingMetersIdReactivateFormCodec : MediaTypeCodec<InlineV1BillingMetersReactivatePostRequestFormX0662a155?> {
    override val id: String = "PostBillingMetersIdReactivate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1BillingMetersReactivatePostRequestFormX0662a155?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1BillingMetersReactivatePostRequestFormX0662a155? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'billing' group of Stripe API.
 */
public class BillingClient(
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
      SdkExecutor(transport, authentication = this@BillingClient.authentication)

  /**
   * <p>Lists billing active and inactive alerts</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param alertType Filter results to only include this type of alert.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param meter Filter results to only include alerts with the given meter.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getBillingAlertsWithResponse(
    request: JsonObject? = null,
    alertType: InlineV1BillingAlertsGetParameterX18b42878? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    meter: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingAlertsResponse> = executor.executeWithResponse<JsonObject?, GetBillingAlertsResponse>(SdkExecutionRequest(getBillingAlertsMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGALERTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "alert_type", values = alertType?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "meter", values = meter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.getBillingAlertsRequestCodecRegistry, GetBillingAlertsResponseDecoder, options)

  /**
   * <p>Retrieves a billing alert given an ID</p>
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
  public suspend fun getBillingAlertsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingAlertsIdResponse> = executor.executeWithResponse<JsonObject?, GetBillingAlertsIdResponse>(SdkExecutionRequest(getBillingAlertsIdMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGALERTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BillingCodecs.getBillingAlertsIdRequestCodecRegistry, GetBillingAlertsIdResponseDecoder, options)

  /**
   * <p>Retrieve a list of credit balance transactions.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param creditGrant The credit grant for which to fetch credit balance transactions.
   * @param customer The customer whose credit balance transactions you're retrieving.
   * @param customerAccount The account representing the customer whose credit balance transactions you're retrieving.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getBillingCreditBalanceTransactionsWithResponse(
    request: JsonObject? = null,
    creditGrant: String? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingCreditBalanceTransactionsResponse> = executor.executeWithResponse<JsonObject?, GetBillingCreditBalanceTransactionsResponse>(SdkExecutionRequest(getBillingCreditBalanceTransactionsMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGCREDITBALANCETRANSACTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "credit_grant", values = creditGrant?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.getBillingCreditBalanceTransactionsRequestCodecRegistry, GetBillingCreditBalanceTransactionsResponseDecoder, options)

  /**
   * <p>Retrieves a credit balance transaction.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Unique identifier for the object.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getBillingCreditBalanceTransactionsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingCreditBalanceTransactionsIdResponse> = executor.executeWithResponse<JsonObject?, GetBillingCreditBalanceTransactionsIdResponse>(SdkExecutionRequest(getBillingCreditBalanceTransactionsIdMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGCREDITBALANCETRANSACTIONSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BillingCodecs.getBillingCreditBalanceTransactionsIdRequestCodecRegistry, GetBillingCreditBalanceTransactionsIdResponseDecoder, options)

  /**
   * <p>Retrieve a list of credit grants.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Only return credit grants for this customer.
   * @param customerAccount Only return credit grants for this account representing the customer.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getBillingCreditGrantsWithResponse(
    request: JsonObject? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingCreditGrantsResponse> = executor.executeWithResponse<JsonObject?, GetBillingCreditGrantsResponse>(SdkExecutionRequest(getBillingCreditGrantsMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGCREDITGRANTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.getBillingCreditGrantsRequestCodecRegistry, GetBillingCreditGrantsResponseDecoder, options)

  /**
   * <p>Retrieves a credit grant.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Unique identifier for the object.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getBillingCreditGrantsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingCreditGrantsIdResponse> = executor.executeWithResponse<JsonObject?, GetBillingCreditGrantsIdResponse>(SdkExecutionRequest(getBillingCreditGrantsIdMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGCREDITGRANTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BillingCodecs.getBillingCreditGrantsIdRequestCodecRegistry, GetBillingCreditGrantsIdResponseDecoder, options)

  /**
   * <p>Retrieve a list of billing meters.</p>
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
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Filter results to only include meters with the given status.
   * @param options Execution options.
   */
  public suspend fun getBillingMetersWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1BillingMetersGetParameterX34cf0a7b? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingMetersResponse> = executor.executeWithResponse<JsonObject?, GetBillingMetersResponse>(SdkExecutionRequest(getBillingMetersMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGMETERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.getBillingMetersRequestCodecRegistry, GetBillingMetersResponseDecoder, options)

  /**
   * <p>Retrieves a billing meter given an ID.</p>
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
  public suspend fun getBillingMetersIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingMetersIdResponse> = executor.executeWithResponse<JsonObject?, GetBillingMetersIdResponse>(SdkExecutionRequest(getBillingMetersIdMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGMETERSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), BillingCodecs.getBillingMetersIdRequestCodecRegistry, GetBillingMetersIdResponseDecoder, options)

  /**
   * <p>Retrieve a list of billing meter event summaries.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Unique identifier for the object.
   * @param customer The customer for which to fetch event summaries.
   * @param endTime The timestamp from when to stop aggregating meter events (exclusive). Must be aligned with minute
   * boundaries.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startTime The timestamp from when to start aggregating meter events (inclusive). Must be aligned with minute
   * boundaries.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param valueGroupingWindow Specifies what granularity to use when generating event summaries. If not specified, a
   * single event summary would be returned for the specified time range. For hourly granularity, start and end times
   * must align with hour boundaries (e.g., 00:00, 01:00, ..., 23:00). For daily granularity, start and end times must
   * align with UTC day boundaries (00:00 UTC).
   * @param options Execution options.
   */
  public suspend fun getBillingMetersIdEventSummariesWithResponse(
    request: JsonObject? = null,
    id: String,
    customer: String,
    endTime: Int,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startTime: Int,
    startingAfter: String? = null,
    valueGroupingWindow: InlineV1BillingMetersEventSummariesGetParameterXc43685d8? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBillingMetersIdEventSummariesResponse> = executor.executeWithResponse<JsonObject?, GetBillingMetersIdEventSummariesResponse>(SdkExecutionRequest(getBillingMetersIdEventSummariesMetadata, baseUri, request, listOf(BillingCodecs.GETBILLINGMETERSIDEVENTSUMMARIES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "end_time", values = listOf(endTime.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "start_time", values = listOf(startTime.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "value_grouping_window", values = valueGroupingWindow?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.getBillingMetersIdEventSummariesRequestCodecRegistry, GetBillingMetersIdEventSummariesResponseDecoder, options)

  /**
   * <p>Creates a billing alert</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postBillingAlertsWithResponse(request: InlineV1BillingAlertsPostRequestFormX87b5449f, options: CallOptions = CallOptions()): SdkResponseResult<PostBillingAlertsResponse> = executor.executeWithResponse<InlineV1BillingAlertsPostRequestFormX87b5449f, PostBillingAlertsResponse>(SdkExecutionRequest(postBillingAlertsMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGALERTS_REQUEST_CODEC_ID), emptyList()), BillingCodecs.postBillingAlertsRequestCodecRegistry, PostBillingAlertsResponseDecoder, options)

  /**
   * <p>Reactivates this alert, allowing it to trigger again.</p>
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
  public suspend fun postBillingAlertsIdActivateWithResponse(
    request: InlineV1BillingAlertsActivatePostRequestFormX225f3a0e? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingAlertsIdActivateResponse> = executor.executeWithResponse<InlineV1BillingAlertsActivatePostRequestFormX225f3a0e?, PostBillingAlertsIdActivateResponse>(SdkExecutionRequest(postBillingAlertsIdActivateMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGALERTSIDACTIVATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingAlertsIdActivateRequestCodecRegistry, PostBillingAlertsIdActivateResponseDecoder, options)

  /**
   * <p>Archives this alert, removing it from the list view and APIs. This is non-reversible.</p>
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
  public suspend fun postBillingAlertsIdArchiveWithResponse(
    request: InlineV1BillingAlertsArchivePostRequestFormX4a2bef25? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingAlertsIdArchiveResponse> = executor.executeWithResponse<InlineV1BillingAlertsArchivePostRequestFormX4a2bef25?, PostBillingAlertsIdArchiveResponse>(SdkExecutionRequest(postBillingAlertsIdArchiveMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGALERTSIDARCHIVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingAlertsIdArchiveRequestCodecRegistry, PostBillingAlertsIdArchiveResponseDecoder, options)

  /**
   * <p>Deactivates this alert, preventing it from triggering.</p>
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
  public suspend fun postBillingAlertsIdDeactivateWithResponse(
    request: InlineV1BillingAlertsDeactivatePostRequestFormXa341320a? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingAlertsIdDeactivateResponse> = executor.executeWithResponse<InlineV1BillingAlertsDeactivatePostRequestFormXa341320a?, PostBillingAlertsIdDeactivateResponse>(SdkExecutionRequest(postBillingAlertsIdDeactivateMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGALERTSIDDEACTIVATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingAlertsIdDeactivateRequestCodecRegistry, PostBillingAlertsIdDeactivateResponseDecoder, options)

  /**
   * <p>Creates a credit grant.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postBillingCreditGrantsWithResponse(request: InlineV1BillingCreditGrantsPostRequestFormX173ddf21, options: CallOptions = CallOptions()): SdkResponseResult<PostBillingCreditGrantsResponse> = executor.executeWithResponse<InlineV1BillingCreditGrantsPostRequestFormX173ddf21, PostBillingCreditGrantsResponse>(SdkExecutionRequest(postBillingCreditGrantsMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGCREDITGRANTS_REQUEST_CODEC_ID), emptyList()), BillingCodecs.postBillingCreditGrantsRequestCodecRegistry, PostBillingCreditGrantsResponseDecoder, options)

  /**
   * <p>Updates a credit grant.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Unique identifier for the object.
   * @param options Execution options.
   */
  public suspend fun postBillingCreditGrantsIdWithResponse(
    request: InlineV1BillingCreditGrantsPostRequestFormX39da8216? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingCreditGrantsIdResponse> = executor.executeWithResponse<InlineV1BillingCreditGrantsPostRequestFormX39da8216?, PostBillingCreditGrantsIdResponse>(SdkExecutionRequest(postBillingCreditGrantsIdMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGCREDITGRANTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingCreditGrantsIdRequestCodecRegistry, PostBillingCreditGrantsIdResponseDecoder, options)

  /**
   * <p>Expires a credit grant.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Unique identifier for the object.
   * @param options Execution options.
   */
  public suspend fun postBillingCreditGrantsIdExpireWithResponse(
    request: InlineV1BillingCreditGrantsExpirePostRequestFormX016df411? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingCreditGrantsIdExpireResponse> = executor.executeWithResponse<InlineV1BillingCreditGrantsExpirePostRequestFormX016df411?, PostBillingCreditGrantsIdExpireResponse>(SdkExecutionRequest(postBillingCreditGrantsIdExpireMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGCREDITGRANTSIDEXPIRE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingCreditGrantsIdExpireRequestCodecRegistry, PostBillingCreditGrantsIdExpireResponseDecoder, options)

  /**
   * <p>Voids a credit grant.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Unique identifier for the object.
   * @param options Execution options.
   */
  public suspend fun postBillingCreditGrantsIdVoidWithResponse(
    request: InlineV1BillingCreditGrantsVoidPostRequestFormX22043ea4? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingCreditGrantsIdVoidResponse> = executor.executeWithResponse<InlineV1BillingCreditGrantsVoidPostRequestFormX22043ea4?, PostBillingCreditGrantsIdVoidResponse>(SdkExecutionRequest(postBillingCreditGrantsIdVoidMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGCREDITGRANTSIDVOID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingCreditGrantsIdVoidRequestCodecRegistry, PostBillingCreditGrantsIdVoidResponseDecoder, options)

  /**
   * <p>Creates a billing meter event adjustment.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postBillingMeterEventAdjustmentsWithResponse(request: InlineV1BillingMeterEventAdjustmentsPostRequestFormXc79d0113, options: CallOptions = CallOptions()): SdkResponseResult<PostBillingMeterEventAdjustmentsResponse> = executor.executeWithResponse<InlineV1BillingMeterEventAdjustmentsPostRequestFormXc79d0113, PostBillingMeterEventAdjustmentsResponse>(SdkExecutionRequest(postBillingMeterEventAdjustmentsMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGMETEREVENTADJUSTMENTS_REQUEST_CODEC_ID), emptyList()), BillingCodecs.postBillingMeterEventAdjustmentsRequestCodecRegistry, PostBillingMeterEventAdjustmentsResponseDecoder, options)

  /**
   * <p>Creates a billing meter event.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postBillingMeterEventsWithResponse(request: InlineV1BillingMeterEventsPostRequestFormXce007751, options: CallOptions = CallOptions()): SdkResponseResult<PostBillingMeterEventsResponse> = executor.executeWithResponse<InlineV1BillingMeterEventsPostRequestFormXce007751, PostBillingMeterEventsResponse>(SdkExecutionRequest(postBillingMeterEventsMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGMETEREVENTS_REQUEST_CODEC_ID), emptyList()), BillingCodecs.postBillingMeterEventsRequestCodecRegistry, PostBillingMeterEventsResponseDecoder, options)

  /**
   * <p>Creates a billing meter.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postBillingMetersWithResponse(request: InlineV1BillingMetersPostRequestFormXb01fece4, options: CallOptions = CallOptions()): SdkResponseResult<PostBillingMetersResponse> = executor.executeWithResponse<InlineV1BillingMetersPostRequestFormXb01fece4, PostBillingMetersResponse>(SdkExecutionRequest(postBillingMetersMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGMETERS_REQUEST_CODEC_ID), emptyList()), BillingCodecs.postBillingMetersRequestCodecRegistry, PostBillingMetersResponseDecoder, options)

  /**
   * <p>Updates a billing meter.</p>
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
  public suspend fun postBillingMetersIdWithResponse(
    request: InlineV1BillingMetersPostRequestFormX3fb35b25? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingMetersIdResponse> = executor.executeWithResponse<InlineV1BillingMetersPostRequestFormX3fb35b25?, PostBillingMetersIdResponse>(SdkExecutionRequest(postBillingMetersIdMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGMETERSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingMetersIdRequestCodecRegistry, PostBillingMetersIdResponseDecoder, options)

  /**
   * <p>When a meter is deactivated, no more meter events will be accepted for this meter. You can’t attach a
   * deactivated meter to a price.</p>
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
  public suspend fun postBillingMetersIdDeactivateWithResponse(
    request: InlineV1BillingMetersDeactivatePostRequestFormX5700b94c? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingMetersIdDeactivateResponse> = executor.executeWithResponse<InlineV1BillingMetersDeactivatePostRequestFormX5700b94c?, PostBillingMetersIdDeactivateResponse>(SdkExecutionRequest(postBillingMetersIdDeactivateMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGMETERSIDDEACTIVATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingMetersIdDeactivateRequestCodecRegistry, PostBillingMetersIdDeactivateResponseDecoder, options)

  /**
   * <p>When a meter is reactivated, events for this meter can be accepted and you can attach the meter to a price.</p>
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
  public suspend fun postBillingMetersIdReactivateWithResponse(
    request: InlineV1BillingMetersReactivatePostRequestFormX0662a155? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostBillingMetersIdReactivateResponse> = executor.executeWithResponse<InlineV1BillingMetersReactivatePostRequestFormX0662a155?, PostBillingMetersIdReactivateResponse>(SdkExecutionRequest(postBillingMetersIdReactivateMetadata, baseUri, request, listOf(BillingCodecs.POSTBILLINGMETERSIDREACTIVATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), BillingCodecs.postBillingMetersIdReactivateRequestCodecRegistry, PostBillingMetersIdReactivateResponseDecoder, options)

  /**
   * Typed response alternatives for `GetBillingAlerts`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetBillingAlertsResponse {
    public class SuccessJson(
      public val json: InlineV1BillingAlertsGetResponse200JsonX685d5281,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingAlertsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingAlertsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingAlertsResponse
  }

  private object GetBillingAlertsResponseDecoder : SdkResponseAlternativeDecoder<GetBillingAlertsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingAlertsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingAlertsResponse> = when {
      alternative.id == "GetBillingAlerts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingAlertsResponse.SuccessJson(
          json = BillingCodecs.getBillingAlertsResponseCodecAlternative0Registry.select(listOf("GetBillingAlerts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingAlerts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingAlertsResponse.DefaultJson(
          json = BillingCodecs.getBillingAlertsResponseCodecAlternative1Registry.select(listOf("GetBillingAlerts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingAlertsResponse = GetBillingAlertsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingAlertsId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBillingAlertsIdResponse {
    public class SuccessJson(
      public val json: BillingAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingAlertsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingAlertsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingAlertsIdResponse
  }

  private object GetBillingAlertsIdResponseDecoder : SdkResponseAlternativeDecoder<GetBillingAlertsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingAlertsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingAlertsIdResponse> = when {
      alternative.id == "GetBillingAlertsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingAlertsIdResponse.SuccessJson(
          json = BillingCodecs.getBillingAlertsIdResponseCodecAlternative0Registry.select(listOf("GetBillingAlertsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingAlertsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingAlertsIdResponse.DefaultJson(
          json = BillingCodecs.getBillingAlertsIdResponseCodecAlternative1Registry.select(listOf("GetBillingAlertsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingAlertsIdResponse = GetBillingAlertsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingCreditBalanceTransactions`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetBillingCreditBalanceTransactionsResponse {
    public class SuccessJson(
      public val json: InlineV1BillingCreditBalanceTransactionsGetResponse200JsonX94c918a1,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditBalanceTransactionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditBalanceTransactionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditBalanceTransactionsResponse
  }

  private object GetBillingCreditBalanceTransactionsResponseDecoder : SdkResponseAlternativeDecoder<GetBillingCreditBalanceTransactionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingCreditBalanceTransactionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingCreditBalanceTransactionsResponse> = when {
      alternative.id == "GetBillingCreditBalanceTransactions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingCreditBalanceTransactionsResponse.SuccessJson(
          json = BillingCodecs.getBillingCreditBalanceTransactionsResponseCodecAlternative0Registry.select(listOf("GetBillingCreditBalanceTransactions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingCreditBalanceTransactions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingCreditBalanceTransactionsResponse.DefaultJson(
          json = BillingCodecs.getBillingCreditBalanceTransactionsResponseCodecAlternative1Registry.select(listOf("GetBillingCreditBalanceTransactions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingCreditBalanceTransactionsResponse = GetBillingCreditBalanceTransactionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingCreditBalanceTransactionsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetBillingCreditBalanceTransactionsIdResponse {
    public class SuccessJson(
      public val json: BillingCreditBalanceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditBalanceTransactionsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditBalanceTransactionsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditBalanceTransactionsIdResponse
  }

  private object GetBillingCreditBalanceTransactionsIdResponseDecoder : SdkResponseAlternativeDecoder<GetBillingCreditBalanceTransactionsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingCreditBalanceTransactionsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingCreditBalanceTransactionsIdResponse> = when {
      alternative.id == "GetBillingCreditBalanceTransactionsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingCreditBalanceTransactionsIdResponse.SuccessJson(
          json = BillingCodecs.getBillingCreditBalanceTransactionsIdResponseCodecAlternative0Registry.select(listOf("GetBillingCreditBalanceTransactionsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingCreditBalanceTransactionsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingCreditBalanceTransactionsIdResponse.DefaultJson(
          json = BillingCodecs.getBillingCreditBalanceTransactionsIdResponseCodecAlternative1Registry.select(listOf("GetBillingCreditBalanceTransactionsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingCreditBalanceTransactionsIdResponse = GetBillingCreditBalanceTransactionsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingCreditGrants`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBillingCreditGrantsResponse {
    public class SuccessJson(
      public val json: InlineV1BillingCreditGrantsGetResponse200JsonX5bc23824,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditGrantsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditGrantsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditGrantsResponse
  }

  private object GetBillingCreditGrantsResponseDecoder : SdkResponseAlternativeDecoder<GetBillingCreditGrantsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingCreditGrantsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingCreditGrantsResponse> = when {
      alternative.id == "GetBillingCreditGrants.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingCreditGrantsResponse.SuccessJson(
          json = BillingCodecs.getBillingCreditGrantsResponseCodecAlternative0Registry.select(listOf("GetBillingCreditGrants.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingCreditGrants.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingCreditGrantsResponse.DefaultJson(
          json = BillingCodecs.getBillingCreditGrantsResponseCodecAlternative1Registry.select(listOf("GetBillingCreditGrants.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingCreditGrantsResponse = GetBillingCreditGrantsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingCreditGrantsId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBillingCreditGrantsIdResponse {
    public class SuccessJson(
      public val json: BillingCreditGrant,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditGrantsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditGrantsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingCreditGrantsIdResponse
  }

  private object GetBillingCreditGrantsIdResponseDecoder : SdkResponseAlternativeDecoder<GetBillingCreditGrantsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingCreditGrantsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingCreditGrantsIdResponse> = when {
      alternative.id == "GetBillingCreditGrantsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingCreditGrantsIdResponse.SuccessJson(
          json = BillingCodecs.getBillingCreditGrantsIdResponseCodecAlternative0Registry.select(listOf("GetBillingCreditGrantsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingCreditGrantsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingCreditGrantsIdResponse.DefaultJson(
          json = BillingCodecs.getBillingCreditGrantsIdResponseCodecAlternative1Registry.select(listOf("GetBillingCreditGrantsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingCreditGrantsIdResponse = GetBillingCreditGrantsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingMeters`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetBillingMetersResponse {
    public class SuccessJson(
      public val json: InlineV1BillingMetersGetResponse200JsonXd521ab9e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersResponse
  }

  private object GetBillingMetersResponseDecoder : SdkResponseAlternativeDecoder<GetBillingMetersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingMetersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingMetersResponse> = when {
      alternative.id == "GetBillingMeters.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingMetersResponse.SuccessJson(
          json = BillingCodecs.getBillingMetersResponseCodecAlternative0Registry.select(listOf("GetBillingMeters.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingMeters.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingMetersResponse.DefaultJson(
          json = BillingCodecs.getBillingMetersResponseCodecAlternative1Registry.select(listOf("GetBillingMeters.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingMetersResponse = GetBillingMetersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingMetersId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetBillingMetersIdResponse {
    public class SuccessJson(
      public val json: BillingMeter,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersIdResponse
  }

  private object GetBillingMetersIdResponseDecoder : SdkResponseAlternativeDecoder<GetBillingMetersIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingMetersIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingMetersIdResponse> = when {
      alternative.id == "GetBillingMetersId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingMetersIdResponse.SuccessJson(
          json = BillingCodecs.getBillingMetersIdResponseCodecAlternative0Registry.select(listOf("GetBillingMetersId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingMetersId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingMetersIdResponse.DefaultJson(
          json = BillingCodecs.getBillingMetersIdResponseCodecAlternative1Registry.select(listOf("GetBillingMetersId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingMetersIdResponse = GetBillingMetersIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetBillingMetersIdEventSummaries`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetBillingMetersIdEventSummariesResponse {
    public class SuccessJson(
      public val json: InlineV1BillingMetersEventSummariesGetResponse200JsonX209c3dc4,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersIdEventSummariesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersIdEventSummariesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBillingMetersIdEventSummariesResponse
  }

  private object GetBillingMetersIdEventSummariesResponseDecoder : SdkResponseAlternativeDecoder<GetBillingMetersIdEventSummariesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBillingMetersIdEventSummariesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBillingMetersIdEventSummariesResponse> = when {
      alternative.id == "GetBillingMetersIdEventSummaries.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBillingMetersIdEventSummariesResponse.SuccessJson(
          json = BillingCodecs.getBillingMetersIdEventSummariesResponseCodecAlternative0Registry.select(listOf("GetBillingMetersIdEventSummaries.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetBillingMetersIdEventSummaries.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBillingMetersIdEventSummariesResponse.DefaultJson(
          json = BillingCodecs.getBillingMetersIdEventSummariesResponseCodecAlternative1Registry.select(listOf("GetBillingMetersIdEventSummaries.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetBillingMetersIdEventSummariesResponse = GetBillingMetersIdEventSummariesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingAlerts`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostBillingAlertsResponse {
    public class SuccessJson(
      public val json: BillingAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsResponse
  }

  private object PostBillingAlertsResponseDecoder : SdkResponseAlternativeDecoder<PostBillingAlertsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingAlertsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingAlertsResponse> = when {
      alternative.id == "PostBillingAlerts.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingAlertsResponse.SuccessJson(
          json = BillingCodecs.postBillingAlertsResponseCodecAlternative0Registry.select(listOf("PostBillingAlerts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingAlerts.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingAlertsResponse.DefaultJson(
          json = BillingCodecs.postBillingAlertsResponseCodecAlternative1Registry.select(listOf("PostBillingAlerts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingAlertsResponse = PostBillingAlertsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingAlertsIdActivate`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingAlertsIdActivateResponse {
    public class SuccessJson(
      public val json: BillingAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdActivateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdActivateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdActivateResponse
  }

  private object PostBillingAlertsIdActivateResponseDecoder : SdkResponseAlternativeDecoder<PostBillingAlertsIdActivateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingAlertsIdActivateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingAlertsIdActivateResponse> = when {
      alternative.id == "PostBillingAlertsIdActivate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingAlertsIdActivateResponse.SuccessJson(
          json = BillingCodecs.postBillingAlertsIdActivateResponseCodecAlternative0Registry.select(listOf("PostBillingAlertsIdActivate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingAlertsIdActivate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingAlertsIdActivateResponse.DefaultJson(
          json = BillingCodecs.postBillingAlertsIdActivateResponseCodecAlternative1Registry.select(listOf("PostBillingAlertsIdActivate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingAlertsIdActivateResponse = PostBillingAlertsIdActivateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingAlertsIdArchive`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingAlertsIdArchiveResponse {
    public class SuccessJson(
      public val json: BillingAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdArchiveResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdArchiveResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdArchiveResponse
  }

  private object PostBillingAlertsIdArchiveResponseDecoder : SdkResponseAlternativeDecoder<PostBillingAlertsIdArchiveResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingAlertsIdArchiveResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingAlertsIdArchiveResponse> = when {
      alternative.id == "PostBillingAlertsIdArchive.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingAlertsIdArchiveResponse.SuccessJson(
          json = BillingCodecs.postBillingAlertsIdArchiveResponseCodecAlternative0Registry.select(listOf("PostBillingAlertsIdArchive.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingAlertsIdArchive.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingAlertsIdArchiveResponse.DefaultJson(
          json = BillingCodecs.postBillingAlertsIdArchiveResponseCodecAlternative1Registry.select(listOf("PostBillingAlertsIdArchive.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingAlertsIdArchiveResponse = PostBillingAlertsIdArchiveResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingAlertsIdDeactivate`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingAlertsIdDeactivateResponse {
    public class SuccessJson(
      public val json: BillingAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdDeactivateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdDeactivateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingAlertsIdDeactivateResponse
  }

  private object PostBillingAlertsIdDeactivateResponseDecoder : SdkResponseAlternativeDecoder<PostBillingAlertsIdDeactivateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingAlertsIdDeactivateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingAlertsIdDeactivateResponse> = when {
      alternative.id == "PostBillingAlertsIdDeactivate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingAlertsIdDeactivateResponse.SuccessJson(
          json = BillingCodecs.postBillingAlertsIdDeactivateResponseCodecAlternative0Registry.select(listOf("PostBillingAlertsIdDeactivate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingAlertsIdDeactivate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingAlertsIdDeactivateResponse.DefaultJson(
          json = BillingCodecs.postBillingAlertsIdDeactivateResponseCodecAlternative1Registry.select(listOf("PostBillingAlertsIdDeactivate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingAlertsIdDeactivateResponse = PostBillingAlertsIdDeactivateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingCreditGrants`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostBillingCreditGrantsResponse {
    public class SuccessJson(
      public val json: BillingCreditGrant,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsResponse
  }

  private object PostBillingCreditGrantsResponseDecoder : SdkResponseAlternativeDecoder<PostBillingCreditGrantsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingCreditGrantsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingCreditGrantsResponse> = when {
      alternative.id == "PostBillingCreditGrants.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingCreditGrantsResponse.SuccessJson(
          json = BillingCodecs.postBillingCreditGrantsResponseCodecAlternative0Registry.select(listOf("PostBillingCreditGrants.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingCreditGrants.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingCreditGrantsResponse.DefaultJson(
          json = BillingCodecs.postBillingCreditGrantsResponseCodecAlternative1Registry.select(listOf("PostBillingCreditGrants.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingCreditGrantsResponse = PostBillingCreditGrantsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingCreditGrantsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingCreditGrantsIdResponse {
    public class SuccessJson(
      public val json: BillingCreditGrant,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdResponse
  }

  private object PostBillingCreditGrantsIdResponseDecoder : SdkResponseAlternativeDecoder<PostBillingCreditGrantsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingCreditGrantsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingCreditGrantsIdResponse> = when {
      alternative.id == "PostBillingCreditGrantsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingCreditGrantsIdResponse.SuccessJson(
          json = BillingCodecs.postBillingCreditGrantsIdResponseCodecAlternative0Registry.select(listOf("PostBillingCreditGrantsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingCreditGrantsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingCreditGrantsIdResponse.DefaultJson(
          json = BillingCodecs.postBillingCreditGrantsIdResponseCodecAlternative1Registry.select(listOf("PostBillingCreditGrantsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingCreditGrantsIdResponse = PostBillingCreditGrantsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingCreditGrantsIdExpire`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingCreditGrantsIdExpireResponse {
    public class SuccessJson(
      public val json: BillingCreditGrant,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdExpireResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdExpireResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdExpireResponse
  }

  private object PostBillingCreditGrantsIdExpireResponseDecoder : SdkResponseAlternativeDecoder<PostBillingCreditGrantsIdExpireResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingCreditGrantsIdExpireResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingCreditGrantsIdExpireResponse> = when {
      alternative.id == "PostBillingCreditGrantsIdExpire.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingCreditGrantsIdExpireResponse.SuccessJson(
          json = BillingCodecs.postBillingCreditGrantsIdExpireResponseCodecAlternative0Registry.select(listOf("PostBillingCreditGrantsIdExpire.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingCreditGrantsIdExpire.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingCreditGrantsIdExpireResponse.DefaultJson(
          json = BillingCodecs.postBillingCreditGrantsIdExpireResponseCodecAlternative1Registry.select(listOf("PostBillingCreditGrantsIdExpire.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingCreditGrantsIdExpireResponse = PostBillingCreditGrantsIdExpireResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingCreditGrantsIdVoid`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingCreditGrantsIdVoidResponse {
    public class SuccessJson(
      public val json: BillingCreditGrant,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdVoidResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdVoidResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingCreditGrantsIdVoidResponse
  }

  private object PostBillingCreditGrantsIdVoidResponseDecoder : SdkResponseAlternativeDecoder<PostBillingCreditGrantsIdVoidResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingCreditGrantsIdVoidResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingCreditGrantsIdVoidResponse> = when {
      alternative.id == "PostBillingCreditGrantsIdVoid.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingCreditGrantsIdVoidResponse.SuccessJson(
          json = BillingCodecs.postBillingCreditGrantsIdVoidResponseCodecAlternative0Registry.select(listOf("PostBillingCreditGrantsIdVoid.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingCreditGrantsIdVoid.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingCreditGrantsIdVoidResponse.DefaultJson(
          json = BillingCodecs.postBillingCreditGrantsIdVoidResponseCodecAlternative1Registry.select(listOf("PostBillingCreditGrantsIdVoid.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingCreditGrantsIdVoidResponse = PostBillingCreditGrantsIdVoidResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingMeterEventAdjustments`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingMeterEventAdjustmentsResponse {
    public class SuccessJson(
      public val json: BillingMeterEventAdjustment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMeterEventAdjustmentsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMeterEventAdjustmentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMeterEventAdjustmentsResponse
  }

  private object PostBillingMeterEventAdjustmentsResponseDecoder : SdkResponseAlternativeDecoder<PostBillingMeterEventAdjustmentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingMeterEventAdjustmentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingMeterEventAdjustmentsResponse> = when {
      alternative.id == "PostBillingMeterEventAdjustments.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingMeterEventAdjustmentsResponse.SuccessJson(
          json = BillingCodecs.postBillingMeterEventAdjustmentsResponseCodecAlternative0Registry.select(listOf("PostBillingMeterEventAdjustments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingMeterEventAdjustments.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingMeterEventAdjustmentsResponse.DefaultJson(
          json = BillingCodecs.postBillingMeterEventAdjustmentsResponseCodecAlternative1Registry.select(listOf("PostBillingMeterEventAdjustments.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingMeterEventAdjustmentsResponse = PostBillingMeterEventAdjustmentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingMeterEvents`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostBillingMeterEventsResponse {
    public class SuccessJson(
      public val json: BillingMeterEvent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMeterEventsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMeterEventsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMeterEventsResponse
  }

  private object PostBillingMeterEventsResponseDecoder : SdkResponseAlternativeDecoder<PostBillingMeterEventsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingMeterEventsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingMeterEventsResponse> = when {
      alternative.id == "PostBillingMeterEvents.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingMeterEventsResponse.SuccessJson(
          json = BillingCodecs.postBillingMeterEventsResponseCodecAlternative0Registry.select(listOf("PostBillingMeterEvents.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingMeterEvents.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingMeterEventsResponse.DefaultJson(
          json = BillingCodecs.postBillingMeterEventsResponseCodecAlternative1Registry.select(listOf("PostBillingMeterEvents.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingMeterEventsResponse = PostBillingMeterEventsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingMeters`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostBillingMetersResponse {
    public class SuccessJson(
      public val json: BillingMeter,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersResponse
  }

  private object PostBillingMetersResponseDecoder : SdkResponseAlternativeDecoder<PostBillingMetersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingMetersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingMetersResponse> = when {
      alternative.id == "PostBillingMeters.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingMetersResponse.SuccessJson(
          json = BillingCodecs.postBillingMetersResponseCodecAlternative0Registry.select(listOf("PostBillingMeters.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingMeters.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingMetersResponse.DefaultJson(
          json = BillingCodecs.postBillingMetersResponseCodecAlternative1Registry.select(listOf("PostBillingMeters.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingMetersResponse = PostBillingMetersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingMetersId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostBillingMetersIdResponse {
    public class SuccessJson(
      public val json: BillingMeter,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdResponse
  }

  private object PostBillingMetersIdResponseDecoder : SdkResponseAlternativeDecoder<PostBillingMetersIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingMetersIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingMetersIdResponse> = when {
      alternative.id == "PostBillingMetersId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingMetersIdResponse.SuccessJson(
          json = BillingCodecs.postBillingMetersIdResponseCodecAlternative0Registry.select(listOf("PostBillingMetersId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingMetersId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingMetersIdResponse.DefaultJson(
          json = BillingCodecs.postBillingMetersIdResponseCodecAlternative1Registry.select(listOf("PostBillingMetersId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingMetersIdResponse = PostBillingMetersIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingMetersIdDeactivate`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingMetersIdDeactivateResponse {
    public class SuccessJson(
      public val json: BillingMeter,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdDeactivateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdDeactivateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdDeactivateResponse
  }

  private object PostBillingMetersIdDeactivateResponseDecoder : SdkResponseAlternativeDecoder<PostBillingMetersIdDeactivateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingMetersIdDeactivateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingMetersIdDeactivateResponse> = when {
      alternative.id == "PostBillingMetersIdDeactivate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingMetersIdDeactivateResponse.SuccessJson(
          json = BillingCodecs.postBillingMetersIdDeactivateResponseCodecAlternative0Registry.select(listOf("PostBillingMetersIdDeactivate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingMetersIdDeactivate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingMetersIdDeactivateResponse.DefaultJson(
          json = BillingCodecs.postBillingMetersIdDeactivateResponseCodecAlternative1Registry.select(listOf("PostBillingMetersIdDeactivate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingMetersIdDeactivateResponse = PostBillingMetersIdDeactivateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostBillingMetersIdReactivate`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostBillingMetersIdReactivateResponse {
    public class SuccessJson(
      public val json: BillingMeter,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdReactivateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdReactivateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostBillingMetersIdReactivateResponse
  }

  private object PostBillingMetersIdReactivateResponseDecoder : SdkResponseAlternativeDecoder<PostBillingMetersIdReactivateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostBillingMetersIdReactivateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostBillingMetersIdReactivateResponse> = when {
      alternative.id == "PostBillingMetersIdReactivate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostBillingMetersIdReactivateResponse.SuccessJson(
          json = BillingCodecs.postBillingMetersIdReactivateResponseCodecAlternative0Registry.select(listOf("PostBillingMetersIdReactivate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostBillingMetersIdReactivate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostBillingMetersIdReactivateResponse.DefaultJson(
          json = BillingCodecs.postBillingMetersIdReactivateResponseCodecAlternative1Registry.select(listOf("PostBillingMetersIdReactivate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostBillingMetersIdReactivateResponse = PostBillingMetersIdReactivateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getBillingAlertsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingAlerts",
          method = "GET",
          path = "/v1/billing/alerts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1BillingAlertsGetResponse200JsonX685d5281",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingAlerts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingAlerts.response.alternative1",
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

    internal val getBillingAlertsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingAlertsId",
          method = "GET",
          path = "/v1/billing/alerts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingAlertsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingAlertsId.response.alternative1",
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

    internal val getBillingCreditBalanceTransactionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingCreditBalanceTransactions",
          method = "GET",
          path = "/v1/billing/credit_balance_transactions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1BillingCreditBalanceTransactionsGetResponse200JsonX94c918a1",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingCreditBalanceTransactions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingCreditBalanceTransactions.response.alternative1",
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

    internal val getBillingCreditBalanceTransactionsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingCreditBalanceTransactionsId",
          method = "GET",
          path = "/v1/billing/credit_balance_transactions/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingCreditBalanceTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingCreditBalanceTransactionsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingCreditBalanceTransactionsId.response.alternative1",
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

    internal val getBillingCreditGrantsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingCreditGrants",
          method = "GET",
          path = "/v1/billing/credit_grants",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1BillingCreditGrantsGetResponse200JsonX5bc23824",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingCreditGrants.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingCreditGrants.response.alternative1",
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

    internal val getBillingCreditGrantsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingCreditGrantsId",
          method = "GET",
          path = "/v1/billing/credit_grants/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingCreditGrant",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingCreditGrantsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingCreditGrantsId.response.alternative1",
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

    internal val getBillingMetersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingMeters",
          method = "GET",
          path = "/v1/billing/meters",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1BillingMetersGetResponse200JsonXd521ab9e",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingMeters.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingMeters.response.alternative1",
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

    internal val getBillingMetersIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingMetersId",
          method = "GET",
          path = "/v1/billing/meters/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingMeter",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingMetersId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingMetersId.response.alternative1",
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

    internal val getBillingMetersIdEventSummariesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetBillingMetersIdEventSummaries",
          method = "GET",
          path = "/v1/billing/meters/{id}/event_summaries",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1BillingMetersEventSummariesGetResponse200JsonX209c3dc4",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingMetersIdEventSummaries.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetBillingMetersIdEventSummaries.response.alternative1",
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

    internal val postBillingAlertsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingAlerts",
          method = "POST",
          path = "/v1/billing/alerts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingAlerts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingAlerts.response.alternative1",
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

    internal val postBillingAlertsIdActivateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingAlertsIdActivate",
          method = "POST",
          path = "/v1/billing/alerts/{id}/activate",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingAlertsIdActivate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingAlertsIdActivate.response.alternative1",
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

    internal val postBillingAlertsIdArchiveMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingAlertsIdArchive",
          method = "POST",
          path = "/v1/billing/alerts/{id}/archive",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingAlertsIdArchive.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingAlertsIdArchive.response.alternative1",
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

    internal val postBillingAlertsIdDeactivateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingAlertsIdDeactivate",
          method = "POST",
          path = "/v1/billing/alerts/{id}/deactivate",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingAlertsIdDeactivate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingAlertsIdDeactivate.response.alternative1",
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

    internal val postBillingCreditGrantsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingCreditGrants",
          method = "POST",
          path = "/v1/billing/credit_grants",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingCreditGrant",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingCreditGrants.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingCreditGrants.response.alternative1",
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

    internal val postBillingCreditGrantsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingCreditGrantsId",
          method = "POST",
          path = "/v1/billing/credit_grants/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingCreditGrant",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingCreditGrantsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingCreditGrantsId.response.alternative1",
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

    internal val postBillingCreditGrantsIdExpireMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingCreditGrantsIdExpire",
          method = "POST",
          path = "/v1/billing/credit_grants/{id}/expire",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingCreditGrant",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingCreditGrantsIdExpire.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingCreditGrantsIdExpire.response.alternative1",
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

    internal val postBillingCreditGrantsIdVoidMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingCreditGrantsIdVoid",
          method = "POST",
          path = "/v1/billing/credit_grants/{id}/void",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingCreditGrant",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingCreditGrantsIdVoid.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingCreditGrantsIdVoid.response.alternative1",
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

    internal val postBillingMeterEventAdjustmentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingMeterEventAdjustments",
          method = "POST",
          path = "/v1/billing/meter_event_adjustments",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingMeterEventAdjustment",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMeterEventAdjustments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMeterEventAdjustments.response.alternative1",
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

    internal val postBillingMeterEventsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingMeterEvents",
          method = "POST",
          path = "/v1/billing/meter_events",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingMeterEvent",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMeterEvents.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMeterEvents.response.alternative1",
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

    internal val postBillingMetersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingMeters",
          method = "POST",
          path = "/v1/billing/meters",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingMeter",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMeters.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMeters.response.alternative1",
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

    internal val postBillingMetersIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingMetersId",
          method = "POST",
          path = "/v1/billing/meters/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingMeter",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMetersId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMetersId.response.alternative1",
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

    internal val postBillingMetersIdDeactivateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingMetersIdDeactivate",
          method = "POST",
          path = "/v1/billing/meters/{id}/deactivate",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingMeter",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMetersIdDeactivate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMetersIdDeactivate.response.alternative1",
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

    internal val postBillingMetersIdReactivateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostBillingMetersIdReactivate",
          method = "POST",
          path = "/v1/billing/meters/{id}/reactivate",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingMeter",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMetersIdReactivate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostBillingMetersIdReactivate.response.alternative1",
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
