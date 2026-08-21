package com.nabobery.sdkgen.generated.stripe.applicationfees

import com.nabobery.sdkgen.generated.stripe.ApplicationFee
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.FeeRefund
import com.nabobery.sdkgen.generated.stripe.InlineV1ApplicationFeesGetParameterX1dfcc0b0
import com.nabobery.sdkgen.generated.stripe.InlineV1ApplicationFeesGetResponse200JsonX5afc7f4e
import com.nabobery.sdkgen.generated.stripe.InlineV1ApplicationFeesRefundPostRequestFormX82199c17
import com.nabobery.sdkgen.generated.stripe.InlineV1ApplicationFeesRefundsGetResponse200JsonX8786f38a
import com.nabobery.sdkgen.generated.stripe.InlineV1ApplicationFeesRefundsPostRequestFormXf4ae8ae4
import com.nabobery.sdkgen.generated.stripe.InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a
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
import kotlinx.serialization.json.JsonPrimitive

internal object ApplicationFeesCodecs {
  internal const val GETAPPLICATIONFEES_REQUEST_CODEC_ID: String = "GetApplicationFees.request"

  private val getApplicationFeesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetApplicationFeesFormCodec

  private val getApplicationFeesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ApplicationFeesGetResponse200JsonX5afc7f4e> =
      KotlinxSerializationCodec("GetApplicationFees.response.alternative0", InlineV1ApplicationFeesGetResponse200JsonX5afc7f4e.Serializer, SdkJson)

  internal val getApplicationFeesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ApplicationFeesGetResponse200JsonX5afc7f4e> =
      MediaTypeCodecRegistry.of(getApplicationFeesResponseCodecAlternative0Codec)

  private val getApplicationFeesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetApplicationFees.response.alternative1", Error.Serializer, SdkJson)

  internal val getApplicationFeesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getApplicationFeesResponseCodecAlternative1Codec)

  internal val getApplicationFeesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getApplicationFeesRequestCodec)

  internal const val GETAPPLICATIONFEESFEEREFUNDSID_REQUEST_CODEC_ID: String =
      "GetApplicationFeesFeeRefundsId.request"

  private val getApplicationFeesFeeRefundsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetApplicationFeesFeeRefundsIdFormCodec

  private val getApplicationFeesFeeRefundsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<FeeRefund> =
      KotlinxSerializationCodec("GetApplicationFeesFeeRefundsId.response.alternative0", FeeRefund.Serializer, SdkJson)

  internal val getApplicationFeesFeeRefundsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FeeRefund> =
      MediaTypeCodecRegistry.of(getApplicationFeesFeeRefundsIdResponseCodecAlternative0Codec)

  private val getApplicationFeesFeeRefundsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetApplicationFeesFeeRefundsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getApplicationFeesFeeRefundsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getApplicationFeesFeeRefundsIdResponseCodecAlternative1Codec)

  internal val getApplicationFeesFeeRefundsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getApplicationFeesFeeRefundsIdRequestCodec)

  internal const val GETAPPLICATIONFEESID_REQUEST_CODEC_ID: String = "GetApplicationFeesId.request"

  private val getApplicationFeesIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetApplicationFeesIdFormCodec

  private val getApplicationFeesIdResponseCodecAlternative0Codec: MediaTypeCodec<ApplicationFee> =
      KotlinxSerializationCodec("GetApplicationFeesId.response.alternative0", ApplicationFee.Serializer, SdkJson)

  internal val getApplicationFeesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ApplicationFee> =
      MediaTypeCodecRegistry.of(getApplicationFeesIdResponseCodecAlternative0Codec)

  private val getApplicationFeesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetApplicationFeesId.response.alternative1", Error.Serializer, SdkJson)

  internal val getApplicationFeesIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getApplicationFeesIdResponseCodecAlternative1Codec)

  internal val getApplicationFeesIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getApplicationFeesIdRequestCodec)

  internal const val GETAPPLICATIONFEESIDREFUNDS_REQUEST_CODEC_ID: String =
      "GetApplicationFeesIdRefunds.request"

  private val getApplicationFeesIdRefundsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetApplicationFeesIdRefundsFormCodec

  private val getApplicationFeesIdRefundsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1ApplicationFeesRefundsGetResponse200JsonX8786f38a> =
      KotlinxSerializationCodec("GetApplicationFeesIdRefunds.response.alternative0", InlineV1ApplicationFeesRefundsGetResponse200JsonX8786f38a.Serializer, SdkJson)

  internal val getApplicationFeesIdRefundsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1ApplicationFeesRefundsGetResponse200JsonX8786f38a> =
      MediaTypeCodecRegistry.of(getApplicationFeesIdRefundsResponseCodecAlternative0Codec)

  private val getApplicationFeesIdRefundsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetApplicationFeesIdRefunds.response.alternative1", Error.Serializer, SdkJson)

  internal val getApplicationFeesIdRefundsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getApplicationFeesIdRefundsResponseCodecAlternative1Codec)

  internal val getApplicationFeesIdRefundsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getApplicationFeesIdRefundsRequestCodec)

  internal const val POSTAPPLICATIONFEESFEEREFUNDSID_REQUEST_CODEC_ID: String =
      "PostApplicationFeesFeeRefundsId.request"

  private val postApplicationFeesFeeRefundsIdRequestCodec:
      MediaTypeCodec<InlineV1ApplicationFeesRefundsPostRequestFormXf4ae8ae4?> =
      PostApplicationFeesFeeRefundsIdFormCodec

  private val postApplicationFeesFeeRefundsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<FeeRefund> =
      KotlinxSerializationCodec("PostApplicationFeesFeeRefundsId.response.alternative0", FeeRefund.Serializer, SdkJson)

  internal val postApplicationFeesFeeRefundsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FeeRefund> =
      MediaTypeCodecRegistry.of(postApplicationFeesFeeRefundsIdResponseCodecAlternative0Codec)

  private val postApplicationFeesFeeRefundsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostApplicationFeesFeeRefundsId.response.alternative1", Error.Serializer, SdkJson)

  internal val postApplicationFeesFeeRefundsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postApplicationFeesFeeRefundsIdResponseCodecAlternative1Codec)

  internal val postApplicationFeesFeeRefundsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ApplicationFeesRefundsPostRequestFormXf4ae8ae4?> =
      MediaTypeCodecRegistry.of(postApplicationFeesFeeRefundsIdRequestCodec)

  internal const val POSTAPPLICATIONFEESIDREFUND_REQUEST_CODEC_ID: String =
      "PostApplicationFeesIdRefund.request"

  private val postApplicationFeesIdRefundRequestCodec:
      MediaTypeCodec<InlineV1ApplicationFeesRefundPostRequestFormX82199c17?> =
      PostApplicationFeesIdRefundFormCodec

  private val postApplicationFeesIdRefundResponseCodecAlternative0Codec:
      MediaTypeCodec<ApplicationFee> =
      KotlinxSerializationCodec("PostApplicationFeesIdRefund.response.alternative0", ApplicationFee.Serializer, SdkJson)

  internal val postApplicationFeesIdRefundResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ApplicationFee> =
      MediaTypeCodecRegistry.of(postApplicationFeesIdRefundResponseCodecAlternative0Codec)

  private val postApplicationFeesIdRefundResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostApplicationFeesIdRefund.response.alternative1", Error.Serializer, SdkJson)

  internal val postApplicationFeesIdRefundResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postApplicationFeesIdRefundResponseCodecAlternative1Codec)

  internal val postApplicationFeesIdRefundRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ApplicationFeesRefundPostRequestFormX82199c17?> =
      MediaTypeCodecRegistry.of(postApplicationFeesIdRefundRequestCodec)

  internal const val POSTAPPLICATIONFEESIDREFUNDS_REQUEST_CODEC_ID: String =
      "PostApplicationFeesIdRefunds.request"

  private val postApplicationFeesIdRefundsRequestCodec:
      MediaTypeCodec<InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a?> =
      PostApplicationFeesIdRefundsFormCodec

  private val postApplicationFeesIdRefundsResponseCodecAlternative0Codec: MediaTypeCodec<FeeRefund>
      =
      KotlinxSerializationCodec("PostApplicationFeesIdRefunds.response.alternative0", FeeRefund.Serializer, SdkJson)

  internal val postApplicationFeesIdRefundsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FeeRefund> =
      MediaTypeCodecRegistry.of(postApplicationFeesIdRefundsResponseCodecAlternative0Codec)

  private val postApplicationFeesIdRefundsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostApplicationFeesIdRefunds.response.alternative1", Error.Serializer, SdkJson)

  internal val postApplicationFeesIdRefundsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postApplicationFeesIdRefundsResponseCodecAlternative1Codec)

  internal val postApplicationFeesIdRefundsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a?> =
      MediaTypeCodecRegistry.of(postApplicationFeesIdRefundsRequestCodec)

  internal object GetApplicationFeesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetApplicationFees.request"

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

  internal object GetApplicationFeesFeeRefundsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetApplicationFeesFeeRefundsId.request"

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

  internal object GetApplicationFeesIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetApplicationFeesId.request"

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

  internal object GetApplicationFeesIdRefundsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetApplicationFeesIdRefunds.request"

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

  internal object PostApplicationFeesFeeRefundsIdFormCodec : MediaTypeCodec<InlineV1ApplicationFeesRefundsPostRequestFormXf4ae8ae4?> {
    override val id: String = "PostApplicationFeesFeeRefundsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ApplicationFeesRefundsPostRequestFormXf4ae8ae4?, mediaType: String): SdkRequestBody {
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
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1ApplicationFeesRefundsPostRequestFormMetadataAnyOf2Xe97b3b66).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ApplicationFeesRefundsPostRequestFormXf4ae8ae4? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostApplicationFeesIdRefundFormCodec : MediaTypeCodec<InlineV1ApplicationFeesRefundPostRequestFormX82199c17?> {
    override val id: String = "PostApplicationFeesIdRefund.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ApplicationFeesRefundPostRequestFormX82199c17?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.directive?.let { formValue0 ->
        form.add("directive", formValue0)
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ApplicationFeesRefundPostRequestFormX82199c17? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostApplicationFeesIdRefundsFormCodec : MediaTypeCodec<InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a?> {
    override val id: String = "PostApplicationFeesIdRefunds.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'application_fees' group of Stripe API.
 */
public class ApplicationFeesClient(
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
      SdkExecutor(transport, authentication = this@ApplicationFeesClient.authentication)

  /**
   * <p>Returns a list of application fees you’ve previously collected. The application fees are returned in sorted
   * order, with the most recent fees appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param charge Only return application fees for the charge specified by this charge ID.
   * @param created Only return applications fees that were created during the given date interval.
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
  public suspend fun getApplicationFeesWithResponse(
    request: JsonObject? = null,
    charge: String? = null,
    created: InlineV1ApplicationFeesGetParameterX1dfcc0b0? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetApplicationFeesResponse> = executor.executeWithResponse<JsonObject?, GetApplicationFeesResponse>(SdkExecutionRequest(getApplicationFeesMetadata, baseUri, request, listOf(ApplicationFeesCodecs.GETAPPLICATIONFEES_REQUEST_CODEC_ID), buildList {
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
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ApplicationFeesCodecs.getApplicationFeesRequestCodecRegistry, GetApplicationFeesResponseDecoder, options)

  /**
   * <p>By default, you can see the 10 most recent refunds stored directly on the application fee object, but you can
   * also retrieve details about a specific refund stored on the application fee.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param fee Wire parameter `fee`.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getApplicationFeesFeeRefundsIdWithResponse(
    request: JsonObject? = null,
    fee: String,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetApplicationFeesFeeRefundsIdResponse> = executor.executeWithResponse<JsonObject?, GetApplicationFeesFeeRefundsIdResponse>(SdkExecutionRequest(getApplicationFeesFeeRefundsIdMetadata, baseUri, request, listOf(ApplicationFeesCodecs.GETAPPLICATIONFEESFEEREFUNDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "fee", values = listOf(fee.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ApplicationFeesCodecs.getApplicationFeesFeeRefundsIdRequestCodecRegistry, GetApplicationFeesFeeRefundsIdResponseDecoder, options)

  /**
   * <p>Retrieves the details of an application fee that your account has collected. The same information is returned
   * when refunding the application fee.</p>
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
  public suspend fun getApplicationFeesIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetApplicationFeesIdResponse> = executor.executeWithResponse<JsonObject?, GetApplicationFeesIdResponse>(SdkExecutionRequest(getApplicationFeesIdMetadata, baseUri, request, listOf(ApplicationFeesCodecs.GETAPPLICATIONFEESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), ApplicationFeesCodecs.getApplicationFeesIdRequestCodecRegistry, GetApplicationFeesIdResponseDecoder, options)

  /**
   * <p>You can see a list of the refunds belonging to a specific application fee. Note that the 10 most recent refunds
   * are always available by default on the application fee object. If you need more than those 10, you can use this API
   * method and the <code>limit</code> and <code>starting_after</code> parameters to page through additional
   * refunds.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
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
  public suspend fun getApplicationFeesIdRefundsWithResponse(
    request: JsonObject? = null,
    id: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetApplicationFeesIdRefundsResponse> = executor.executeWithResponse<JsonObject?, GetApplicationFeesIdRefundsResponse>(SdkExecutionRequest(getApplicationFeesIdRefundsMetadata, baseUri, request, listOf(ApplicationFeesCodecs.GETAPPLICATIONFEESIDREFUNDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), ApplicationFeesCodecs.getApplicationFeesIdRefundsRequestCodecRegistry, GetApplicationFeesIdRefundsResponseDecoder, options)

  /**
   * <p>Updates the specified application fee refund by setting the values of the parameters passed. Any parameters not
   * provided will be left unchanged.</p>
   *
   * <p>This request only accepts metadata as an argument.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param fee Wire parameter `fee`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postApplicationFeesFeeRefundsIdWithResponse(
    request: InlineV1ApplicationFeesRefundsPostRequestFormXf4ae8ae4? = null,
    fee: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostApplicationFeesFeeRefundsIdResponse> = executor.executeWithResponse<InlineV1ApplicationFeesRefundsPostRequestFormXf4ae8ae4?, PostApplicationFeesFeeRefundsIdResponse>(SdkExecutionRequest(postApplicationFeesFeeRefundsIdMetadata, baseUri, request, listOf(ApplicationFeesCodecs.POSTAPPLICATIONFEESFEEREFUNDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "fee", values = listOf(fee.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), ApplicationFeesCodecs.postApplicationFeesFeeRefundsIdRequestCodecRegistry, PostApplicationFeesFeeRefundsIdResponseDecoder, options)

  /**
   *
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
  public suspend fun postApplicationFeesIdRefundWithResponse(
    request: InlineV1ApplicationFeesRefundPostRequestFormX82199c17? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostApplicationFeesIdRefundResponse> = executor.executeWithResponse<InlineV1ApplicationFeesRefundPostRequestFormX82199c17?, PostApplicationFeesIdRefundResponse>(SdkExecutionRequest(postApplicationFeesIdRefundMetadata, baseUri, request, listOf(ApplicationFeesCodecs.POSTAPPLICATIONFEESIDREFUND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), ApplicationFeesCodecs.postApplicationFeesIdRefundRequestCodecRegistry, PostApplicationFeesIdRefundResponseDecoder, options)

  /**
   * <p>Refunds an application fee that has previously been collected but not yet refunded.
   * Funds will be refunded to the Stripe account from which the fee was originally collected.</p>
   *
   * <p>You can optionally refund only part of an application fee.
   * You can do so multiple times, until the entire fee has been refunded.</p>
   *
   * <p>Once entirely refunded, an application fee can’t be refunded again.
   * This method will raise an error when called on an already-refunded application fee,
   * or when trying to refund more money than is left on an application fee.</p>
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
  public suspend fun postApplicationFeesIdRefundsWithResponse(
    request: InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostApplicationFeesIdRefundsResponse> = executor.executeWithResponse<InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a?, PostApplicationFeesIdRefundsResponse>(SdkExecutionRequest(postApplicationFeesIdRefundsMetadata, baseUri, request, listOf(ApplicationFeesCodecs.POSTAPPLICATIONFEESIDREFUNDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), ApplicationFeesCodecs.postApplicationFeesIdRefundsRequestCodecRegistry, PostApplicationFeesIdRefundsResponseDecoder, options)

  /**
   * Typed response alternatives for `GetApplicationFees`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetApplicationFeesResponse {
    public class SuccessJson(
      public val json: InlineV1ApplicationFeesGetResponse200JsonX5afc7f4e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesResponse
  }

  private object GetApplicationFeesResponseDecoder : SdkResponseAlternativeDecoder<GetApplicationFeesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetApplicationFeesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetApplicationFeesResponse> = when {
      alternative.id == "GetApplicationFees.response.alternative0" -> SdkResponseDecodeResult(
        value = GetApplicationFeesResponse.SuccessJson(
          json = ApplicationFeesCodecs.getApplicationFeesResponseCodecAlternative0Registry.select(listOf("GetApplicationFees.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetApplicationFees.response.alternative1" -> SdkResponseDecodeResult(
        value = GetApplicationFeesResponse.DefaultJson(
          json = ApplicationFeesCodecs.getApplicationFeesResponseCodecAlternative1Registry.select(listOf("GetApplicationFees.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetApplicationFeesResponse = GetApplicationFeesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetApplicationFeesFeeRefundsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetApplicationFeesFeeRefundsIdResponse {
    public class SuccessJson(
      public val json: FeeRefund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesFeeRefundsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesFeeRefundsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesFeeRefundsIdResponse
  }

  private object GetApplicationFeesFeeRefundsIdResponseDecoder : SdkResponseAlternativeDecoder<GetApplicationFeesFeeRefundsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetApplicationFeesFeeRefundsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetApplicationFeesFeeRefundsIdResponse> = when {
      alternative.id == "GetApplicationFeesFeeRefundsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetApplicationFeesFeeRefundsIdResponse.SuccessJson(
          json = ApplicationFeesCodecs.getApplicationFeesFeeRefundsIdResponseCodecAlternative0Registry.select(listOf("GetApplicationFeesFeeRefundsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetApplicationFeesFeeRefundsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetApplicationFeesFeeRefundsIdResponse.DefaultJson(
          json = ApplicationFeesCodecs.getApplicationFeesFeeRefundsIdResponseCodecAlternative1Registry.select(listOf("GetApplicationFeesFeeRefundsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetApplicationFeesFeeRefundsIdResponse = GetApplicationFeesFeeRefundsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetApplicationFeesId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetApplicationFeesIdResponse {
    public class SuccessJson(
      public val json: ApplicationFee,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesIdResponse
  }

  private object GetApplicationFeesIdResponseDecoder : SdkResponseAlternativeDecoder<GetApplicationFeesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetApplicationFeesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetApplicationFeesIdResponse> = when {
      alternative.id == "GetApplicationFeesId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetApplicationFeesIdResponse.SuccessJson(
          json = ApplicationFeesCodecs.getApplicationFeesIdResponseCodecAlternative0Registry.select(listOf("GetApplicationFeesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetApplicationFeesId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetApplicationFeesIdResponse.DefaultJson(
          json = ApplicationFeesCodecs.getApplicationFeesIdResponseCodecAlternative1Registry.select(listOf("GetApplicationFeesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetApplicationFeesIdResponse = GetApplicationFeesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetApplicationFeesIdRefunds`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetApplicationFeesIdRefundsResponse {
    public class SuccessJson(
      public val json: InlineV1ApplicationFeesRefundsGetResponse200JsonX8786f38a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesIdRefundsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesIdRefundsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetApplicationFeesIdRefundsResponse
  }

  private object GetApplicationFeesIdRefundsResponseDecoder : SdkResponseAlternativeDecoder<GetApplicationFeesIdRefundsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetApplicationFeesIdRefundsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetApplicationFeesIdRefundsResponse> = when {
      alternative.id == "GetApplicationFeesIdRefunds.response.alternative0" -> SdkResponseDecodeResult(
        value = GetApplicationFeesIdRefundsResponse.SuccessJson(
          json = ApplicationFeesCodecs.getApplicationFeesIdRefundsResponseCodecAlternative0Registry.select(listOf("GetApplicationFeesIdRefunds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetApplicationFeesIdRefunds.response.alternative1" -> SdkResponseDecodeResult(
        value = GetApplicationFeesIdRefundsResponse.DefaultJson(
          json = ApplicationFeesCodecs.getApplicationFeesIdRefundsResponseCodecAlternative1Registry.select(listOf("GetApplicationFeesIdRefunds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetApplicationFeesIdRefundsResponse = GetApplicationFeesIdRefundsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostApplicationFeesFeeRefundsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostApplicationFeesFeeRefundsIdResponse {
    public class SuccessJson(
      public val json: FeeRefund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesFeeRefundsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesFeeRefundsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesFeeRefundsIdResponse
  }

  private object PostApplicationFeesFeeRefundsIdResponseDecoder : SdkResponseAlternativeDecoder<PostApplicationFeesFeeRefundsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostApplicationFeesFeeRefundsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostApplicationFeesFeeRefundsIdResponse> = when {
      alternative.id == "PostApplicationFeesFeeRefundsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostApplicationFeesFeeRefundsIdResponse.SuccessJson(
          json = ApplicationFeesCodecs.postApplicationFeesFeeRefundsIdResponseCodecAlternative0Registry.select(listOf("PostApplicationFeesFeeRefundsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostApplicationFeesFeeRefundsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostApplicationFeesFeeRefundsIdResponse.DefaultJson(
          json = ApplicationFeesCodecs.postApplicationFeesFeeRefundsIdResponseCodecAlternative1Registry.select(listOf("PostApplicationFeesFeeRefundsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostApplicationFeesFeeRefundsIdResponse = PostApplicationFeesFeeRefundsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostApplicationFeesIdRefund`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostApplicationFeesIdRefundResponse {
    public class SuccessJson(
      public val json: ApplicationFee,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesIdRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesIdRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesIdRefundResponse
  }

  private object PostApplicationFeesIdRefundResponseDecoder : SdkResponseAlternativeDecoder<PostApplicationFeesIdRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostApplicationFeesIdRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostApplicationFeesIdRefundResponse> = when {
      alternative.id == "PostApplicationFeesIdRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = PostApplicationFeesIdRefundResponse.SuccessJson(
          json = ApplicationFeesCodecs.postApplicationFeesIdRefundResponseCodecAlternative0Registry.select(listOf("PostApplicationFeesIdRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostApplicationFeesIdRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = PostApplicationFeesIdRefundResponse.DefaultJson(
          json = ApplicationFeesCodecs.postApplicationFeesIdRefundResponseCodecAlternative1Registry.select(listOf("PostApplicationFeesIdRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostApplicationFeesIdRefundResponse = PostApplicationFeesIdRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostApplicationFeesIdRefunds`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostApplicationFeesIdRefundsResponse {
    public class SuccessJson(
      public val json: FeeRefund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesIdRefundsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesIdRefundsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostApplicationFeesIdRefundsResponse
  }

  private object PostApplicationFeesIdRefundsResponseDecoder : SdkResponseAlternativeDecoder<PostApplicationFeesIdRefundsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostApplicationFeesIdRefundsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostApplicationFeesIdRefundsResponse> = when {
      alternative.id == "PostApplicationFeesIdRefunds.response.alternative0" -> SdkResponseDecodeResult(
        value = PostApplicationFeesIdRefundsResponse.SuccessJson(
          json = ApplicationFeesCodecs.postApplicationFeesIdRefundsResponseCodecAlternative0Registry.select(listOf("PostApplicationFeesIdRefunds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostApplicationFeesIdRefunds.response.alternative1" -> SdkResponseDecodeResult(
        value = PostApplicationFeesIdRefundsResponse.DefaultJson(
          json = ApplicationFeesCodecs.postApplicationFeesIdRefundsResponseCodecAlternative1Registry.select(listOf("PostApplicationFeesIdRefunds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostApplicationFeesIdRefundsResponse = PostApplicationFeesIdRefundsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getApplicationFeesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetApplicationFees",
          method = "GET",
          path = "/v1/application_fees",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ApplicationFeesGetResponse200JsonX5afc7f4e",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplicationFees.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplicationFees.response.alternative1",
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

    internal val getApplicationFeesFeeRefundsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetApplicationFeesFeeRefundsId",
          method = "GET",
          path = "/v1/application_fees/{fee}/refunds/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FeeRefund",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplicationFeesFeeRefundsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplicationFeesFeeRefundsId.response.alternative1",
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

    internal val getApplicationFeesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetApplicationFeesId",
          method = "GET",
          path = "/v1/application_fees/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ApplicationFee",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplicationFeesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplicationFeesId.response.alternative1",
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

    internal val getApplicationFeesIdRefundsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetApplicationFeesIdRefunds",
          method = "GET",
          path = "/v1/application_fees/{id}/refunds",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1ApplicationFeesRefundsGetResponse200JsonX8786f38a",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplicationFeesIdRefunds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetApplicationFeesIdRefunds.response.alternative1",
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

    internal val postApplicationFeesFeeRefundsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostApplicationFeesFeeRefundsId",
          method = "POST",
          path = "/v1/application_fees/{fee}/refunds/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FeeRefund",
              mode = SdkResponseMode.BUFFERED,
              id = "PostApplicationFeesFeeRefundsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostApplicationFeesFeeRefundsId.response.alternative1",
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

    internal val postApplicationFeesIdRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostApplicationFeesIdRefund",
          method = "POST",
          path = "/v1/application_fees/{id}/refund",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ApplicationFee",
              mode = SdkResponseMode.BUFFERED,
              id = "PostApplicationFeesIdRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostApplicationFeesIdRefund.response.alternative1",
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

    internal val postApplicationFeesIdRefundsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostApplicationFeesIdRefunds",
          method = "POST",
          path = "/v1/application_fees/{id}/refunds",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FeeRefund",
              mode = SdkResponseMode.BUFFERED,
              id = "PostApplicationFeesIdRefunds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostApplicationFeesIdRefunds.response.alternative1",
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
