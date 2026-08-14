package io.github.nabobery.sdkgen.generated.stripe.radar

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
import io.github.nabobery.sdkgen.generated.stripe.DeletedRadarValueList
import io.github.nabobery.sdkgen.generated.stripe.DeletedRadarValueListItem
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarEarlyFraudWarningsGetParameterXd9042767
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarEarlyFraudWarningsGetResponse200JsonXc7f26d1f
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListItemsGetParameterXf7579e3a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListItemsGetResponse200JsonXbe6f1e3f
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListItemsPostRequestFormX78ba91d7
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListsGetParameterX26d080bd
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListsGetResponse200JsonX32e44b7e
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListsPostRequestFormX4499a880
import io.github.nabobery.sdkgen.generated.stripe.InlineV1RadarValueListsPostRequestFormXd6e26112
import io.github.nabobery.sdkgen.generated.stripe.RadarEarlyFraudWarning
import io.github.nabobery.sdkgen.generated.stripe.RadarPaymentEvaluation
import io.github.nabobery.sdkgen.generated.stripe.RadarValueList
import io.github.nabobery.sdkgen.generated.stripe.RadarValueListItem
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object RadarCodecs {
  internal const val DELETERADARVALUELISTITEMSITEM_REQUEST_CODEC_ID: String =
      "DeleteRadarValueListItemsItem.request"

  private val deleteRadarValueListItemsItemRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteRadarValueListItemsItemFormCodec

  private val deleteRadarValueListItemsItemResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedRadarValueListItem> =
      KotlinxSerializationCodec("DeleteRadarValueListItemsItem.response.alternative0", DeletedRadarValueListItem.Serializer, SdkJson)

  internal val deleteRadarValueListItemsItemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedRadarValueListItem> =
      MediaTypeCodecRegistry.of(deleteRadarValueListItemsItemResponseCodecAlternative0Codec)

  private val deleteRadarValueListItemsItemResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteRadarValueListItemsItem.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteRadarValueListItemsItemResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteRadarValueListItemsItemResponseCodecAlternative1Codec)

  internal val deleteRadarValueListItemsItemRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteRadarValueListItemsItemRequestCodec)

  internal const val DELETERADARVALUELISTSVALUELIST_REQUEST_CODEC_ID: String =
      "DeleteRadarValueListsValueList.request"

  private val deleteRadarValueListsValueListRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteRadarValueListsValueListFormCodec

  private val deleteRadarValueListsValueListResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedRadarValueList> =
      KotlinxSerializationCodec("DeleteRadarValueListsValueList.response.alternative0", DeletedRadarValueList.Serializer, SdkJson)

  internal val deleteRadarValueListsValueListResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedRadarValueList> =
      MediaTypeCodecRegistry.of(deleteRadarValueListsValueListResponseCodecAlternative0Codec)

  private val deleteRadarValueListsValueListResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteRadarValueListsValueList.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteRadarValueListsValueListResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteRadarValueListsValueListResponseCodecAlternative1Codec)

  internal val deleteRadarValueListsValueListRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteRadarValueListsValueListRequestCodec)

  internal const val GETRADAREARLYFRAUDWARNINGS_REQUEST_CODEC_ID: String =
      "GetRadarEarlyFraudWarnings.request"

  private val getRadarEarlyFraudWarningsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetRadarEarlyFraudWarningsFormCodec

  private val getRadarEarlyFraudWarningsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1RadarEarlyFraudWarningsGetResponse200JsonXc7f26d1f> =
      KotlinxSerializationCodec("GetRadarEarlyFraudWarnings.response.alternative0", InlineV1RadarEarlyFraudWarningsGetResponse200JsonXc7f26d1f.Serializer, SdkJson)

  internal val getRadarEarlyFraudWarningsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1RadarEarlyFraudWarningsGetResponse200JsonXc7f26d1f> =
      MediaTypeCodecRegistry.of(getRadarEarlyFraudWarningsResponseCodecAlternative0Codec)

  private val getRadarEarlyFraudWarningsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetRadarEarlyFraudWarnings.response.alternative1", Error.Serializer, SdkJson)

  internal val getRadarEarlyFraudWarningsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getRadarEarlyFraudWarningsResponseCodecAlternative1Codec)

  internal val getRadarEarlyFraudWarningsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getRadarEarlyFraudWarningsRequestCodec)

  internal const val GETRADAREARLYFRAUDWARNINGSEARLYFRAUDWARNING_REQUEST_CODEC_ID: String =
      "GetRadarEarlyFraudWarningsEarlyFraudWarning.request"

  private val getRadarEarlyFraudWarningsEarlyFraudWarningRequestCodec: MediaTypeCodec<JsonObject?> =
      GetRadarEarlyFraudWarningsEarlyFraudWarningFormCodec

  private val getRadarEarlyFraudWarningsEarlyFraudWarningResponseCodecAlternative0Codec:
      MediaTypeCodec<RadarEarlyFraudWarning> =
      KotlinxSerializationCodec("GetRadarEarlyFraudWarningsEarlyFraudWarning.response.alternative0", RadarEarlyFraudWarning.Serializer, SdkJson)

  internal val getRadarEarlyFraudWarningsEarlyFraudWarningResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RadarEarlyFraudWarning> =
      MediaTypeCodecRegistry.of(getRadarEarlyFraudWarningsEarlyFraudWarningResponseCodecAlternative0Codec)

  private val getRadarEarlyFraudWarningsEarlyFraudWarningResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetRadarEarlyFraudWarningsEarlyFraudWarning.response.alternative1", Error.Serializer, SdkJson)

  internal val getRadarEarlyFraudWarningsEarlyFraudWarningResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getRadarEarlyFraudWarningsEarlyFraudWarningResponseCodecAlternative1Codec)

  internal val getRadarEarlyFraudWarningsEarlyFraudWarningRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getRadarEarlyFraudWarningsEarlyFraudWarningRequestCodec)

  internal const val GETRADARVALUELISTITEMS_REQUEST_CODEC_ID: String =
      "GetRadarValueListItems.request"

  private val getRadarValueListItemsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetRadarValueListItemsFormCodec

  private val getRadarValueListItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1RadarValueListItemsGetResponse200JsonXbe6f1e3f> =
      KotlinxSerializationCodec("GetRadarValueListItems.response.alternative0", InlineV1RadarValueListItemsGetResponse200JsonXbe6f1e3f.Serializer, SdkJson)

  internal val getRadarValueListItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1RadarValueListItemsGetResponse200JsonXbe6f1e3f> =
      MediaTypeCodecRegistry.of(getRadarValueListItemsResponseCodecAlternative0Codec)

  private val getRadarValueListItemsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetRadarValueListItems.response.alternative1", Error.Serializer, SdkJson)

  internal val getRadarValueListItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getRadarValueListItemsResponseCodecAlternative1Codec)

  internal val getRadarValueListItemsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getRadarValueListItemsRequestCodec)

  internal const val GETRADARVALUELISTITEMSITEM_REQUEST_CODEC_ID: String =
      "GetRadarValueListItemsItem.request"

  private val getRadarValueListItemsItemRequestCodec: MediaTypeCodec<JsonObject?> =
      GetRadarValueListItemsItemFormCodec

  private val getRadarValueListItemsItemResponseCodecAlternative0Codec:
      MediaTypeCodec<RadarValueListItem> =
      KotlinxSerializationCodec("GetRadarValueListItemsItem.response.alternative0", RadarValueListItem.Serializer, SdkJson)

  internal val getRadarValueListItemsItemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RadarValueListItem> =
      MediaTypeCodecRegistry.of(getRadarValueListItemsItemResponseCodecAlternative0Codec)

  private val getRadarValueListItemsItemResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetRadarValueListItemsItem.response.alternative1", Error.Serializer, SdkJson)

  internal val getRadarValueListItemsItemResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getRadarValueListItemsItemResponseCodecAlternative1Codec)

  internal val getRadarValueListItemsItemRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getRadarValueListItemsItemRequestCodec)

  internal const val GETRADARVALUELISTS_REQUEST_CODEC_ID: String = "GetRadarValueLists.request"

  private val getRadarValueListsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetRadarValueListsFormCodec

  private val getRadarValueListsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1RadarValueListsGetResponse200JsonX32e44b7e> =
      KotlinxSerializationCodec("GetRadarValueLists.response.alternative0", InlineV1RadarValueListsGetResponse200JsonX32e44b7e.Serializer, SdkJson)

  internal val getRadarValueListsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1RadarValueListsGetResponse200JsonX32e44b7e> =
      MediaTypeCodecRegistry.of(getRadarValueListsResponseCodecAlternative0Codec)

  private val getRadarValueListsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetRadarValueLists.response.alternative1", Error.Serializer, SdkJson)

  internal val getRadarValueListsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getRadarValueListsResponseCodecAlternative1Codec)

  internal val getRadarValueListsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getRadarValueListsRequestCodec)

  internal const val GETRADARVALUELISTSVALUELIST_REQUEST_CODEC_ID: String =
      "GetRadarValueListsValueList.request"

  private val getRadarValueListsValueListRequestCodec: MediaTypeCodec<JsonObject?> =
      GetRadarValueListsValueListFormCodec

  private val getRadarValueListsValueListResponseCodecAlternative0Codec:
      MediaTypeCodec<RadarValueList> =
      KotlinxSerializationCodec("GetRadarValueListsValueList.response.alternative0", RadarValueList.Serializer, SdkJson)

  internal val getRadarValueListsValueListResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RadarValueList> =
      MediaTypeCodecRegistry.of(getRadarValueListsValueListResponseCodecAlternative0Codec)

  private val getRadarValueListsValueListResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetRadarValueListsValueList.response.alternative1", Error.Serializer, SdkJson)

  internal val getRadarValueListsValueListResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getRadarValueListsValueListResponseCodecAlternative1Codec)

  internal val getRadarValueListsValueListRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getRadarValueListsValueListRequestCodec)

  internal const val POSTRADARPAYMENTEVALUATIONS_REQUEST_CODEC_ID: String =
      "PostRadarPaymentEvaluations.request"

  private val postRadarPaymentEvaluationsRequestCodec:
      MediaTypeCodec<InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a> =
      PostRadarPaymentEvaluationsFormCodec

  private val postRadarPaymentEvaluationsResponseCodecAlternative0Codec:
      MediaTypeCodec<RadarPaymentEvaluation> =
      KotlinxSerializationCodec("PostRadarPaymentEvaluations.response.alternative0", RadarPaymentEvaluation.Serializer, SdkJson)

  internal val postRadarPaymentEvaluationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RadarPaymentEvaluation> =
      MediaTypeCodecRegistry.of(postRadarPaymentEvaluationsResponseCodecAlternative0Codec)

  private val postRadarPaymentEvaluationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostRadarPaymentEvaluations.response.alternative1", Error.Serializer, SdkJson)

  internal val postRadarPaymentEvaluationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postRadarPaymentEvaluationsResponseCodecAlternative1Codec)

  internal val postRadarPaymentEvaluationsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a> =
      MediaTypeCodecRegistry.of(postRadarPaymentEvaluationsRequestCodec)

  internal const val POSTRADARVALUELISTITEMS_REQUEST_CODEC_ID: String =
      "PostRadarValueListItems.request"

  private val postRadarValueListItemsRequestCodec:
      MediaTypeCodec<InlineV1RadarValueListItemsPostRequestFormX78ba91d7> =
      PostRadarValueListItemsFormCodec

  private val postRadarValueListItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<RadarValueListItem> =
      KotlinxSerializationCodec("PostRadarValueListItems.response.alternative0", RadarValueListItem.Serializer, SdkJson)

  internal val postRadarValueListItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RadarValueListItem> =
      MediaTypeCodecRegistry.of(postRadarValueListItemsResponseCodecAlternative0Codec)

  private val postRadarValueListItemsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostRadarValueListItems.response.alternative1", Error.Serializer, SdkJson)

  internal val postRadarValueListItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postRadarValueListItemsResponseCodecAlternative1Codec)

  internal val postRadarValueListItemsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1RadarValueListItemsPostRequestFormX78ba91d7> =
      MediaTypeCodecRegistry.of(postRadarValueListItemsRequestCodec)

  internal const val POSTRADARVALUELISTS_REQUEST_CODEC_ID: String = "PostRadarValueLists.request"

  private val postRadarValueListsRequestCodec:
      MediaTypeCodec<InlineV1RadarValueListsPostRequestFormXd6e26112> = PostRadarValueListsFormCodec

  private val postRadarValueListsResponseCodecAlternative0Codec: MediaTypeCodec<RadarValueList> =
      KotlinxSerializationCodec("PostRadarValueLists.response.alternative0", RadarValueList.Serializer, SdkJson)

  internal val postRadarValueListsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RadarValueList> =
      MediaTypeCodecRegistry.of(postRadarValueListsResponseCodecAlternative0Codec)

  private val postRadarValueListsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostRadarValueLists.response.alternative1", Error.Serializer, SdkJson)

  internal val postRadarValueListsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postRadarValueListsResponseCodecAlternative1Codec)

  internal val postRadarValueListsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1RadarValueListsPostRequestFormXd6e26112> =
      MediaTypeCodecRegistry.of(postRadarValueListsRequestCodec)

  internal const val POSTRADARVALUELISTSVALUELIST_REQUEST_CODEC_ID: String =
      "PostRadarValueListsValueList.request"

  private val postRadarValueListsValueListRequestCodec:
      MediaTypeCodec<InlineV1RadarValueListsPostRequestFormX4499a880?> =
      PostRadarValueListsValueListFormCodec

  private val postRadarValueListsValueListResponseCodecAlternative0Codec:
      MediaTypeCodec<RadarValueList> =
      KotlinxSerializationCodec("PostRadarValueListsValueList.response.alternative0", RadarValueList.Serializer, SdkJson)

  internal val postRadarValueListsValueListResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RadarValueList> =
      MediaTypeCodecRegistry.of(postRadarValueListsValueListResponseCodecAlternative0Codec)

  private val postRadarValueListsValueListResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostRadarValueListsValueList.response.alternative1", Error.Serializer, SdkJson)

  internal val postRadarValueListsValueListResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postRadarValueListsValueListResponseCodecAlternative1Codec)

  internal val postRadarValueListsValueListRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1RadarValueListsPostRequestFormX4499a880?> =
      MediaTypeCodecRegistry.of(postRadarValueListsValueListRequestCodec)

  internal object DeleteRadarValueListItemsItemFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteRadarValueListItemsItem.request"

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

  internal object DeleteRadarValueListsValueListFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteRadarValueListsValueList.request"

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

  internal object GetRadarEarlyFraudWarningsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetRadarEarlyFraudWarnings.request"

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

  internal object GetRadarEarlyFraudWarningsEarlyFraudWarningFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetRadarEarlyFraudWarningsEarlyFraudWarning.request"

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

  internal object GetRadarValueListItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetRadarValueListItems.request"

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

  internal object GetRadarValueListItemsItemFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetRadarValueListItemsItem.request"

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

  internal object GetRadarValueListsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetRadarValueLists.request"

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

  internal object GetRadarValueListsValueListFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetRadarValueListsValueList.request"

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

  internal object PostRadarPaymentEvaluationsFormCodec : MediaTypeCodec<InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a> {
    override val id: String = "PostRadarPaymentEvaluations.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.clientDeviceMetadataDetails?.let { formValue0 ->
        form.add("client_device_metadata_details" + "[radar_session]", formValue0.radarSession)
      }
      request.customerDetails.customer?.let { formValue1 ->
        form.add("customer_details" + "[customer]", formValue1)
      }
      request.customerDetails.customerAccount?.let { formValue1 ->
        form.add("customer_details" + "[customer_account]", formValue1)
      }
      request.customerDetails.email?.let { formValue1 ->
        form.add("customer_details" + "[email]", formValue1)
      }
      request.customerDetails.name?.let { formValue1 ->
        form.add("customer_details" + "[name]", formValue1)
      }
      request.customerDetails.phone?.let { formValue1 ->
        form.add("customer_details" + "[phone]", formValue1)
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("payment_details" + "[amount]", request.paymentDetails.amount.toString())
      form.add("payment_details" + "[currency]", request.paymentDetails.currency)
      request.paymentDetails.description?.let { formValue1 ->
        form.add("payment_details" + "[description]", formValue1)
      }
      request.paymentDetails.moneyMovementDetails?.let { formValue1 ->
        formValue1.card?.let { formValue3 ->
          formValue3.customerPresence?.let { formValue5 ->
            form.add("payment_details" + "[money_movement_details]" + "[card]" + "[customer_presence]", formValue5.value)
          }
          formValue3.paymentType?.let { formValue5 ->
            form.add("payment_details" + "[money_movement_details]" + "[card]" + "[payment_type]", formValue5.value)
          }
        }
        form.add("payment_details" + "[money_movement_details]" + "[money_movement_type]", formValue1.moneyMovementType.value)
      }
      request.paymentDetails.paymentMethodDetails.billingDetails?.let { formValue2 ->
        formValue2.address?.let { formValue4 ->
          formValue4.city?.let { formValue6 ->
            form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[address]" + "[city]", formValue6)
          }
          formValue4.country?.let { formValue6 ->
            form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[address]" + "[country]", formValue6)
          }
          formValue4.line1?.let { formValue6 ->
            form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[address]" + "[line1]", formValue6)
          }
          formValue4.line2?.let { formValue6 ->
            form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[address]" + "[line2]", formValue6)
          }
          formValue4.postalCode?.let { formValue6 ->
            form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[address]" + "[postal_code]", formValue6)
          }
          formValue4.state?.let { formValue6 ->
            form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[address]" + "[state]", formValue6)
          }
        }
        formValue2.email?.let { formValue4 ->
          form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[email]", formValue4)
        }
        formValue2.name?.let { formValue4 ->
          form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[name]", formValue4)
        }
        formValue2.phone?.let { formValue4 ->
          form.add("payment_details" + "[payment_method_details]" + "[billing_details]" + "[phone]", formValue4)
        }
      }
      form.add("payment_details" + "[payment_method_details]" + "[payment_method]", request.paymentDetails.paymentMethodDetails.paymentMethod)
      request.paymentDetails.shippingDetails?.let { formValue1 ->
        formValue1.address?.let { formValue3 ->
          formValue3.city?.let { formValue5 ->
            form.add("payment_details" + "[shipping_details]" + "[address]" + "[city]", formValue5)
          }
          formValue3.country?.let { formValue5 ->
            form.add("payment_details" + "[shipping_details]" + "[address]" + "[country]", formValue5)
          }
          formValue3.line1?.let { formValue5 ->
            form.add("payment_details" + "[shipping_details]" + "[address]" + "[line1]", formValue5)
          }
          formValue3.line2?.let { formValue5 ->
            form.add("payment_details" + "[shipping_details]" + "[address]" + "[line2]", formValue5)
          }
          formValue3.postalCode?.let { formValue5 ->
            form.add("payment_details" + "[shipping_details]" + "[address]" + "[postal_code]", formValue5)
          }
          formValue3.state?.let { formValue5 ->
            form.add("payment_details" + "[shipping_details]" + "[address]" + "[state]", formValue5)
          }
        }
        formValue1.name?.let { formValue3 ->
          form.add("payment_details" + "[shipping_details]" + "[name]", formValue3)
        }
        formValue1.phone?.let { formValue3 ->
          form.add("payment_details" + "[shipping_details]" + "[phone]", formValue3)
        }
      }
      request.paymentDetails.statementDescriptor?.let { formValue1 ->
        form.add("payment_details" + "[statement_descriptor]", formValue1)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostRadarValueListItemsFormCodec : MediaTypeCodec<InlineV1RadarValueListItemsPostRequestFormX78ba91d7> {
    override val id: String = "PostRadarValueListItems.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1RadarValueListItemsPostRequestFormX78ba91d7, mediaType: String): SdkRequestBody {
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
      form.add("value", request.value)
      form.add("value_list", request.valueList)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1RadarValueListItemsPostRequestFormX78ba91d7 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostRadarValueListsFormCodec : MediaTypeCodec<InlineV1RadarValueListsPostRequestFormXd6e26112> {
    override val id: String = "PostRadarValueLists.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1RadarValueListsPostRequestFormXd6e26112, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("alias", request.alias)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.itemType?.let { formValue0 ->
        form.add("item_type", formValue0.value)
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("name", request.name)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1RadarValueListsPostRequestFormXd6e26112 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostRadarValueListsValueListFormCodec : MediaTypeCodec<InlineV1RadarValueListsPostRequestFormX4499a880?> {
    override val id: String = "PostRadarValueListsValueList.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1RadarValueListsPostRequestFormX4499a880?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.alias?.let { formValue0 ->
        form.add("alias", formValue0)
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1RadarValueListsPostRequestFormX4499a880? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'radar' group of Stripe API.
 */
public class RadarClient(
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
      SdkExecutor(transport, authentication = this@RadarClient.authentication)

  /**
   * <p>Deletes a <code>ValueListItem</code> object, removing it from its parent value list.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param item Wire parameter `item`.
   * @param options Execution options.
   */
  public suspend fun deleteRadarValueListItemsItemWithResponse(
    request: JsonObject? = null,
    item: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteRadarValueListItemsItemResponse> = executor.executeWithResponse<JsonObject?, DeleteRadarValueListItemsItemResponse>(SdkExecutionRequest(deleteRadarValueListItemsItemMetadata, baseUri, request, listOf(RadarCodecs.DELETERADARVALUELISTITEMSITEM_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item", values = listOf(item.toString())))
  }), RadarCodecs.deleteRadarValueListItemsItemRequestCodecRegistry, DeleteRadarValueListItemsItemResponseDecoder, options)

  /**
   * <p>Deletes a <code>ValueList</code> object, also deleting any items contained within the value list. To be deleted,
   * a value list must not be referenced in any rules.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param valueList Wire parameter `value_list`.
   * @param options Execution options.
   */
  public suspend fun deleteRadarValueListsValueListWithResponse(
    request: JsonObject? = null,
    valueList: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteRadarValueListsValueListResponse> = executor.executeWithResponse<JsonObject?, DeleteRadarValueListsValueListResponse>(SdkExecutionRequest(deleteRadarValueListsValueListMetadata, baseUri, request, listOf(RadarCodecs.DELETERADARVALUELISTSVALUELIST_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "value_list", values = listOf(valueList.toString())))
  }), RadarCodecs.deleteRadarValueListsValueListRequestCodecRegistry, DeleteRadarValueListsValueListResponseDecoder, options)

  /**
   * <p>Returns a list of early fraud warnings.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Only return early fraud warnings for the charge specified by this charge ID.
   * @param created Only return early fraud warnings that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param paymentIntent Only return early fraud warnings for charges that were created by the PaymentIntent specified
   * by this PaymentIntent ID.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getRadarEarlyFraudWarningsWithResponse(
    request: JsonObject? = null,
    charge: String? = null,
    created: InlineV1RadarEarlyFraudWarningsGetParameterXd9042767? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    paymentIntent: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRadarEarlyFraudWarningsResponse> = executor.executeWithResponse<JsonObject?, GetRadarEarlyFraudWarningsResponse>(SdkExecutionRequest(getRadarEarlyFraudWarningsMetadata, baseUri, request, listOf(RadarCodecs.GETRADAREARLYFRAUDWARNINGS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "charge", values = charge?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment_intent", values = paymentIntent?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), RadarCodecs.getRadarEarlyFraudWarningsRequestCodecRegistry, GetRadarEarlyFraudWarningsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an early fraud warning that has previously been created. </p>
   *
   * <p>Please refer to the <a href="#early_fraud_warning_object">early fraud warning</a> object reference for more
   * details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param earlyFraudWarning Wire parameter `early_fraud_warning`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getRadarEarlyFraudWarningsEarlyFraudWarningWithResponse(
    request: JsonObject? = null,
    earlyFraudWarning: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRadarEarlyFraudWarningsEarlyFraudWarningResponse> = executor.executeWithResponse<JsonObject?, GetRadarEarlyFraudWarningsEarlyFraudWarningResponse>(SdkExecutionRequest(getRadarEarlyFraudWarningsEarlyFraudWarningMetadata, baseUri, request, listOf(RadarCodecs.GETRADAREARLYFRAUDWARNINGSEARLYFRAUDWARNING_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "early_fraud_warning", values = listOf(earlyFraudWarning.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), RadarCodecs.getRadarEarlyFraudWarningsEarlyFraudWarningRequestCodecRegistry, GetRadarEarlyFraudWarningsEarlyFraudWarningResponseDecoder, options)

  /**
   * <p>Returns a list of <code>ValueListItem</code> objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return items that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param value Return items belonging to the parent list whose value matches the specified value (using an "is like"
   * match).
   * @param valueList Identifier for the parent value list this item belongs to.
   * @param options Execution options.
   */
  public suspend fun getRadarValueListItemsWithResponse(
    request: JsonObject? = null,
    created: InlineV1RadarValueListItemsGetParameterXf7579e3a? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    `value`: String? = null,
    valueList: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRadarValueListItemsResponse> = executor.executeWithResponse<JsonObject?, GetRadarValueListItemsResponse>(SdkExecutionRequest(getRadarValueListItemsMetadata, baseUri, request, listOf(RadarCodecs.GETRADARVALUELISTITEMS_REQUEST_CODEC_ID), buildList {
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
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "value", values = value?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "value_list", values = listOf(valueList.toString())))
  }), RadarCodecs.getRadarValueListItemsRequestCodecRegistry, GetRadarValueListItemsResponseDecoder, options)

  /**
   * <p>Retrieves a <code>ValueListItem</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param item Wire parameter `item`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getRadarValueListItemsItemWithResponse(
    request: JsonObject? = null,
    item: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRadarValueListItemsItemResponse> = executor.executeWithResponse<JsonObject?, GetRadarValueListItemsItemResponse>(SdkExecutionRequest(getRadarValueListItemsItemMetadata, baseUri, request, listOf(RadarCodecs.GETRADARVALUELISTITEMSITEM_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item", values = listOf(item.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), RadarCodecs.getRadarValueListItemsItemRequestCodecRegistry, GetRadarValueListItemsItemResponseDecoder, options)

  /**
   * <p>Returns a list of <code>ValueList</code> objects. The objects are sorted in descending order by creation date,
   * with the most recently created object appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param alias The alias used to reference the value list when writing rules.
   * @param contains A value contained within a value list - returns all value lists containing this value.
   * @param created Only return value lists that were created during the given date interval.
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
  public suspend fun getRadarValueListsWithResponse(
    request: JsonObject? = null,
    alias: String? = null,
    contains: String? = null,
    created: InlineV1RadarValueListsGetParameterX26d080bd? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRadarValueListsResponse> = executor.executeWithResponse<JsonObject?, GetRadarValueListsResponse>(SdkExecutionRequest(getRadarValueListsMetadata, baseUri, request, listOf(RadarCodecs.GETRADARVALUELISTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "alias", values = alias?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "contains", values = contains?.let { listOf(it.toString()) }.orEmpty()))
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
  }), RadarCodecs.getRadarValueListsRequestCodecRegistry, GetRadarValueListsResponseDecoder, options)

  /**
   * <p>Retrieves a <code>ValueList</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param valueList Wire parameter `value_list`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getRadarValueListsValueListWithResponse(
    request: JsonObject? = null,
    valueList: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRadarValueListsValueListResponse> = executor.executeWithResponse<JsonObject?, GetRadarValueListsValueListResponse>(SdkExecutionRequest(getRadarValueListsValueListMetadata, baseUri, request, listOf(RadarCodecs.GETRADARVALUELISTSVALUELIST_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "value_list", values = listOf(valueList.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), RadarCodecs.getRadarValueListsValueListRequestCodecRegistry, GetRadarValueListsValueListResponseDecoder, options)

  /**
   * <p>Request a Radar API fraud risk score from Stripe for a payment before sending it for external processor
   * authorization.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postRadarPaymentEvaluationsWithResponse(request: InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a, options: CallOptions = CallOptions()): SdkResponseResult<PostRadarPaymentEvaluationsResponse> = executor.executeWithResponse<InlineV1RadarPaymentEvaluationsPostRequestFormXf81da26a, PostRadarPaymentEvaluationsResponse>(SdkExecutionRequest(postRadarPaymentEvaluationsMetadata, baseUri, request, listOf(RadarCodecs.POSTRADARPAYMENTEVALUATIONS_REQUEST_CODEC_ID), emptyList()), RadarCodecs.postRadarPaymentEvaluationsRequestCodecRegistry, PostRadarPaymentEvaluationsResponseDecoder, options)

  /**
   * <p>Creates a new <code>ValueListItem</code> object, which is added to the specified parent value list.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postRadarValueListItemsWithResponse(request: InlineV1RadarValueListItemsPostRequestFormX78ba91d7, options: CallOptions = CallOptions()): SdkResponseResult<PostRadarValueListItemsResponse> = executor.executeWithResponse<InlineV1RadarValueListItemsPostRequestFormX78ba91d7, PostRadarValueListItemsResponse>(SdkExecutionRequest(postRadarValueListItemsMetadata, baseUri, request, listOf(RadarCodecs.POSTRADARVALUELISTITEMS_REQUEST_CODEC_ID), emptyList()), RadarCodecs.postRadarValueListItemsRequestCodecRegistry, PostRadarValueListItemsResponseDecoder, options)

  /**
   * <p>Creates a new <code>ValueList</code> object, which can then be referenced in rules.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postRadarValueListsWithResponse(request: InlineV1RadarValueListsPostRequestFormXd6e26112, options: CallOptions = CallOptions()): SdkResponseResult<PostRadarValueListsResponse> = executor.executeWithResponse<InlineV1RadarValueListsPostRequestFormXd6e26112, PostRadarValueListsResponse>(SdkExecutionRequest(postRadarValueListsMetadata, baseUri, request, listOf(RadarCodecs.POSTRADARVALUELISTS_REQUEST_CODEC_ID), emptyList()), RadarCodecs.postRadarValueListsRequestCodecRegistry, PostRadarValueListsResponseDecoder, options)

  /**
   * <p>Updates a <code>ValueList</code> object by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged. Note that <code>item_type</code> is immutable.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param valueList Wire parameter `value_list`.
   * @param options Execution options.
   */
  public suspend fun postRadarValueListsValueListWithResponse(
    request: InlineV1RadarValueListsPostRequestFormX4499a880? = null,
    valueList: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostRadarValueListsValueListResponse> = executor.executeWithResponse<InlineV1RadarValueListsPostRequestFormX4499a880?, PostRadarValueListsValueListResponse>(SdkExecutionRequest(postRadarValueListsValueListMetadata, baseUri, request, listOf(RadarCodecs.POSTRADARVALUELISTSVALUELIST_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "value_list", values = listOf(valueList.toString())))
  }), RadarCodecs.postRadarValueListsValueListRequestCodecRegistry, PostRadarValueListsValueListResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteRadarValueListItemsItem`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteRadarValueListItemsItemResponse {
    public class SuccessJson(
      public val json: DeletedRadarValueListItem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteRadarValueListItemsItemResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteRadarValueListItemsItemResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteRadarValueListItemsItemResponse
  }

  private object DeleteRadarValueListItemsItemResponseDecoder : SdkResponseAlternativeDecoder<DeleteRadarValueListItemsItemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteRadarValueListItemsItemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteRadarValueListItemsItemResponse> = when {
      alternative.id == "DeleteRadarValueListItemsItem.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteRadarValueListItemsItemResponse.SuccessJson(
          json = RadarCodecs.deleteRadarValueListItemsItemResponseCodecAlternative0Registry.select(listOf("DeleteRadarValueListItemsItem.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteRadarValueListItemsItem.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteRadarValueListItemsItemResponse.DefaultJson(
          json = RadarCodecs.deleteRadarValueListItemsItemResponseCodecAlternative1Registry.select(listOf("DeleteRadarValueListItemsItem.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteRadarValueListItemsItemResponse = DeleteRadarValueListItemsItemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteRadarValueListsValueList`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteRadarValueListsValueListResponse {
    public class SuccessJson(
      public val json: DeletedRadarValueList,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteRadarValueListsValueListResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteRadarValueListsValueListResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteRadarValueListsValueListResponse
  }

  private object DeleteRadarValueListsValueListResponseDecoder : SdkResponseAlternativeDecoder<DeleteRadarValueListsValueListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteRadarValueListsValueListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteRadarValueListsValueListResponse> = when {
      alternative.id == "DeleteRadarValueListsValueList.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteRadarValueListsValueListResponse.SuccessJson(
          json = RadarCodecs.deleteRadarValueListsValueListResponseCodecAlternative0Registry.select(listOf("DeleteRadarValueListsValueList.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteRadarValueListsValueList.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteRadarValueListsValueListResponse.DefaultJson(
          json = RadarCodecs.deleteRadarValueListsValueListResponseCodecAlternative1Registry.select(listOf("DeleteRadarValueListsValueList.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteRadarValueListsValueListResponse = DeleteRadarValueListsValueListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetRadarEarlyFraudWarnings`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetRadarEarlyFraudWarningsResponse {
    public class SuccessJson(
      public val json: InlineV1RadarEarlyFraudWarningsGetResponse200JsonXc7f26d1f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarEarlyFraudWarningsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarEarlyFraudWarningsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarEarlyFraudWarningsResponse
  }

  private object GetRadarEarlyFraudWarningsResponseDecoder : SdkResponseAlternativeDecoder<GetRadarEarlyFraudWarningsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRadarEarlyFraudWarningsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRadarEarlyFraudWarningsResponse> = when {
      alternative.id == "GetRadarEarlyFraudWarnings.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRadarEarlyFraudWarningsResponse.SuccessJson(
          json = RadarCodecs.getRadarEarlyFraudWarningsResponseCodecAlternative0Registry.select(listOf("GetRadarEarlyFraudWarnings.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetRadarEarlyFraudWarnings.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRadarEarlyFraudWarningsResponse.DefaultJson(
          json = RadarCodecs.getRadarEarlyFraudWarningsResponseCodecAlternative1Registry.select(listOf("GetRadarEarlyFraudWarnings.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetRadarEarlyFraudWarningsResponse = GetRadarEarlyFraudWarningsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetRadarEarlyFraudWarningsEarlyFraudWarning`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetRadarEarlyFraudWarningsEarlyFraudWarningResponse {
    public class SuccessJson(
      public val json: RadarEarlyFraudWarning,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarEarlyFraudWarningsEarlyFraudWarningResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarEarlyFraudWarningsEarlyFraudWarningResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarEarlyFraudWarningsEarlyFraudWarningResponse
  }

  private object GetRadarEarlyFraudWarningsEarlyFraudWarningResponseDecoder : SdkResponseAlternativeDecoder<GetRadarEarlyFraudWarningsEarlyFraudWarningResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRadarEarlyFraudWarningsEarlyFraudWarningResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRadarEarlyFraudWarningsEarlyFraudWarningResponse> = when {
      alternative.id == "GetRadarEarlyFraudWarningsEarlyFraudWarning.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRadarEarlyFraudWarningsEarlyFraudWarningResponse.SuccessJson(
          json = RadarCodecs.getRadarEarlyFraudWarningsEarlyFraudWarningResponseCodecAlternative0Registry.select(listOf("GetRadarEarlyFraudWarningsEarlyFraudWarning.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetRadarEarlyFraudWarningsEarlyFraudWarning.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRadarEarlyFraudWarningsEarlyFraudWarningResponse.DefaultJson(
          json = RadarCodecs.getRadarEarlyFraudWarningsEarlyFraudWarningResponseCodecAlternative1Registry.select(listOf("GetRadarEarlyFraudWarningsEarlyFraudWarning.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetRadarEarlyFraudWarningsEarlyFraudWarningResponse = GetRadarEarlyFraudWarningsEarlyFraudWarningResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetRadarValueListItems`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetRadarValueListItemsResponse {
    public class SuccessJson(
      public val json: InlineV1RadarValueListItemsGetResponse200JsonXbe6f1e3f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListItemsResponse
  }

  private object GetRadarValueListItemsResponseDecoder : SdkResponseAlternativeDecoder<GetRadarValueListItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRadarValueListItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRadarValueListItemsResponse> = when {
      alternative.id == "GetRadarValueListItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRadarValueListItemsResponse.SuccessJson(
          json = RadarCodecs.getRadarValueListItemsResponseCodecAlternative0Registry.select(listOf("GetRadarValueListItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetRadarValueListItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRadarValueListItemsResponse.DefaultJson(
          json = RadarCodecs.getRadarValueListItemsResponseCodecAlternative1Registry.select(listOf("GetRadarValueListItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetRadarValueListItemsResponse = GetRadarValueListItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetRadarValueListItemsItem`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetRadarValueListItemsItemResponse {
    public class SuccessJson(
      public val json: RadarValueListItem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListItemsItemResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListItemsItemResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListItemsItemResponse
  }

  private object GetRadarValueListItemsItemResponseDecoder : SdkResponseAlternativeDecoder<GetRadarValueListItemsItemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRadarValueListItemsItemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRadarValueListItemsItemResponse> = when {
      alternative.id == "GetRadarValueListItemsItem.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRadarValueListItemsItemResponse.SuccessJson(
          json = RadarCodecs.getRadarValueListItemsItemResponseCodecAlternative0Registry.select(listOf("GetRadarValueListItemsItem.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetRadarValueListItemsItem.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRadarValueListItemsItemResponse.DefaultJson(
          json = RadarCodecs.getRadarValueListItemsItemResponseCodecAlternative1Registry.select(listOf("GetRadarValueListItemsItem.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetRadarValueListItemsItemResponse = GetRadarValueListItemsItemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetRadarValueLists`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetRadarValueListsResponse {
    public class SuccessJson(
      public val json: InlineV1RadarValueListsGetResponse200JsonX32e44b7e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListsResponse
  }

  private object GetRadarValueListsResponseDecoder : SdkResponseAlternativeDecoder<GetRadarValueListsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRadarValueListsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRadarValueListsResponse> = when {
      alternative.id == "GetRadarValueLists.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRadarValueListsResponse.SuccessJson(
          json = RadarCodecs.getRadarValueListsResponseCodecAlternative0Registry.select(listOf("GetRadarValueLists.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetRadarValueLists.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRadarValueListsResponse.DefaultJson(
          json = RadarCodecs.getRadarValueListsResponseCodecAlternative1Registry.select(listOf("GetRadarValueLists.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetRadarValueListsResponse = GetRadarValueListsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetRadarValueListsValueList`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetRadarValueListsValueListResponse {
    public class SuccessJson(
      public val json: RadarValueList,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListsValueListResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListsValueListResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRadarValueListsValueListResponse
  }

  private object GetRadarValueListsValueListResponseDecoder : SdkResponseAlternativeDecoder<GetRadarValueListsValueListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRadarValueListsValueListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRadarValueListsValueListResponse> = when {
      alternative.id == "GetRadarValueListsValueList.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRadarValueListsValueListResponse.SuccessJson(
          json = RadarCodecs.getRadarValueListsValueListResponseCodecAlternative0Registry.select(listOf("GetRadarValueListsValueList.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetRadarValueListsValueList.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRadarValueListsValueListResponse.DefaultJson(
          json = RadarCodecs.getRadarValueListsValueListResponseCodecAlternative1Registry.select(listOf("GetRadarValueListsValueList.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetRadarValueListsValueListResponse = GetRadarValueListsValueListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostRadarPaymentEvaluations`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostRadarPaymentEvaluationsResponse {
    public class SuccessJson(
      public val json: RadarPaymentEvaluation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarPaymentEvaluationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarPaymentEvaluationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarPaymentEvaluationsResponse
  }

  private object PostRadarPaymentEvaluationsResponseDecoder : SdkResponseAlternativeDecoder<PostRadarPaymentEvaluationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostRadarPaymentEvaluationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostRadarPaymentEvaluationsResponse> = when {
      alternative.id == "PostRadarPaymentEvaluations.response.alternative0" -> SdkResponseDecodeResult(
        value = PostRadarPaymentEvaluationsResponse.SuccessJson(
          json = RadarCodecs.postRadarPaymentEvaluationsResponseCodecAlternative0Registry.select(listOf("PostRadarPaymentEvaluations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostRadarPaymentEvaluations.response.alternative1" -> SdkResponseDecodeResult(
        value = PostRadarPaymentEvaluationsResponse.DefaultJson(
          json = RadarCodecs.postRadarPaymentEvaluationsResponseCodecAlternative1Registry.select(listOf("PostRadarPaymentEvaluations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostRadarPaymentEvaluationsResponse = PostRadarPaymentEvaluationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostRadarValueListItems`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostRadarValueListItemsResponse {
    public class SuccessJson(
      public val json: RadarValueListItem,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListItemsResponse
  }

  private object PostRadarValueListItemsResponseDecoder : SdkResponseAlternativeDecoder<PostRadarValueListItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostRadarValueListItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostRadarValueListItemsResponse> = when {
      alternative.id == "PostRadarValueListItems.response.alternative0" -> SdkResponseDecodeResult(
        value = PostRadarValueListItemsResponse.SuccessJson(
          json = RadarCodecs.postRadarValueListItemsResponseCodecAlternative0Registry.select(listOf("PostRadarValueListItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostRadarValueListItems.response.alternative1" -> SdkResponseDecodeResult(
        value = PostRadarValueListItemsResponse.DefaultJson(
          json = RadarCodecs.postRadarValueListItemsResponseCodecAlternative1Registry.select(listOf("PostRadarValueListItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostRadarValueListItemsResponse = PostRadarValueListItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostRadarValueLists`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostRadarValueListsResponse {
    public class SuccessJson(
      public val json: RadarValueList,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListsResponse
  }

  private object PostRadarValueListsResponseDecoder : SdkResponseAlternativeDecoder<PostRadarValueListsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostRadarValueListsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostRadarValueListsResponse> = when {
      alternative.id == "PostRadarValueLists.response.alternative0" -> SdkResponseDecodeResult(
        value = PostRadarValueListsResponse.SuccessJson(
          json = RadarCodecs.postRadarValueListsResponseCodecAlternative0Registry.select(listOf("PostRadarValueLists.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostRadarValueLists.response.alternative1" -> SdkResponseDecodeResult(
        value = PostRadarValueListsResponse.DefaultJson(
          json = RadarCodecs.postRadarValueListsResponseCodecAlternative1Registry.select(listOf("PostRadarValueLists.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostRadarValueListsResponse = PostRadarValueListsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostRadarValueListsValueList`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostRadarValueListsValueListResponse {
    public class SuccessJson(
      public val json: RadarValueList,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListsValueListResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListsValueListResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostRadarValueListsValueListResponse
  }

  private object PostRadarValueListsValueListResponseDecoder : SdkResponseAlternativeDecoder<PostRadarValueListsValueListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostRadarValueListsValueListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostRadarValueListsValueListResponse> = when {
      alternative.id == "PostRadarValueListsValueList.response.alternative0" -> SdkResponseDecodeResult(
        value = PostRadarValueListsValueListResponse.SuccessJson(
          json = RadarCodecs.postRadarValueListsValueListResponseCodecAlternative0Registry.select(listOf("PostRadarValueListsValueList.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostRadarValueListsValueList.response.alternative1" -> SdkResponseDecodeResult(
        value = PostRadarValueListsValueListResponse.DefaultJson(
          json = RadarCodecs.postRadarValueListsValueListResponseCodecAlternative1Registry.select(listOf("PostRadarValueListsValueList.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostRadarValueListsValueListResponse = PostRadarValueListsValueListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deleteRadarValueListItemsItemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteRadarValueListItemsItem",
          method = "DELETE",
          path = "/v1/radar/value_list_items/{item}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedRadarValueListItem",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteRadarValueListItemsItem.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteRadarValueListItemsItem.response.alternative1",
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

    internal val deleteRadarValueListsValueListMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteRadarValueListsValueList",
          method = "DELETE",
          path = "/v1/radar/value_lists/{value_list}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedRadarValueList",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteRadarValueListsValueList.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteRadarValueListsValueList.response.alternative1",
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

    internal val getRadarEarlyFraudWarningsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetRadarEarlyFraudWarnings",
          method = "GET",
          path = "/v1/radar/early_fraud_warnings",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1RadarEarlyFraudWarningsGetResponse200JsonXc7f26d1f",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarEarlyFraudWarnings.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarEarlyFraudWarnings.response.alternative1",
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

    internal val getRadarEarlyFraudWarningsEarlyFraudWarningMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetRadarEarlyFraudWarningsEarlyFraudWarning",
          method = "GET",
          path = "/v1/radar/early_fraud_warnings/{early_fraud_warning}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RadarEarlyFraudWarning",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarEarlyFraudWarningsEarlyFraudWarning.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarEarlyFraudWarningsEarlyFraudWarning.response.alternative1",
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

    internal val getRadarValueListItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetRadarValueListItems",
          method = "GET",
          path = "/v1/radar/value_list_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1RadarValueListItemsGetResponse200JsonXbe6f1e3f",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarValueListItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarValueListItems.response.alternative1",
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

    internal val getRadarValueListItemsItemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetRadarValueListItemsItem",
          method = "GET",
          path = "/v1/radar/value_list_items/{item}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RadarValueListItem",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarValueListItemsItem.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarValueListItemsItem.response.alternative1",
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

    internal val getRadarValueListsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetRadarValueLists",
          method = "GET",
          path = "/v1/radar/value_lists",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1RadarValueListsGetResponse200JsonX32e44b7e",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarValueLists.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarValueLists.response.alternative1",
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

    internal val getRadarValueListsValueListMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetRadarValueListsValueList",
          method = "GET",
          path = "/v1/radar/value_lists/{value_list}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RadarValueList",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarValueListsValueList.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetRadarValueListsValueList.response.alternative1",
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

    internal val postRadarPaymentEvaluationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostRadarPaymentEvaluations",
          method = "POST",
          path = "/v1/radar/payment_evaluations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RadarPaymentEvaluation",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRadarPaymentEvaluations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRadarPaymentEvaluations.response.alternative1",
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

    internal val postRadarValueListItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostRadarValueListItems",
          method = "POST",
          path = "/v1/radar/value_list_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RadarValueListItem",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRadarValueListItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRadarValueListItems.response.alternative1",
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

    internal val postRadarValueListsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostRadarValueLists",
          method = "POST",
          path = "/v1/radar/value_lists",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RadarValueList",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRadarValueLists.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRadarValueLists.response.alternative1",
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

    internal val postRadarValueListsValueListMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostRadarValueListsValueList",
          method = "POST",
          path = "/v1/radar/value_lists/{value_list}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RadarValueList",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRadarValueListsValueList.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostRadarValueListsValueList.response.alternative1",
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
