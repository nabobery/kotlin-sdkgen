package io.github.nabobery.sdkgen.generated.stripe.topups

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
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TopupsCancelPostRequestFormX8018f503
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TopupsGetParameterX36610912
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TopupsGetParameterXf8186291
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TopupsGetParameterXfde1522f
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TopupsGetResponse200JsonX20bd0d6b
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TopupsPostRequestFormX64883c32
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TopupsPostRequestFormX844b79d6
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import io.github.nabobery.sdkgen.generated.stripe.Topup
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object TopupsCodecs {
  internal const val GETTOPUPS_REQUEST_CODEC_ID: String = "GetTopups.request"

  private val getTopupsRequestCodec: MediaTypeCodec<JsonObject?> = GetTopupsFormCodec

  private val getTopupsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TopupsGetResponse200JsonX20bd0d6b> =
      KotlinxSerializationCodec("GetTopups.response.alternative0", InlineV1TopupsGetResponse200JsonX20bd0d6b.Serializer, SdkJson)

  internal val getTopupsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TopupsGetResponse200JsonX20bd0d6b> =
      MediaTypeCodecRegistry.of(getTopupsResponseCodecAlternative0Codec)

  private val getTopupsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTopups.response.alternative1", Error.Serializer, SdkJson)

  internal val getTopupsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTopupsResponseCodecAlternative1Codec)

  internal val getTopupsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTopupsRequestCodec)

  internal const val GETTOPUPSTOPUP_REQUEST_CODEC_ID: String = "GetTopupsTopup.request"

  private val getTopupsTopupRequestCodec: MediaTypeCodec<JsonObject?> = GetTopupsTopupFormCodec

  private val getTopupsTopupResponseCodecAlternative0Codec: MediaTypeCodec<Topup> =
      KotlinxSerializationCodec("GetTopupsTopup.response.alternative0", Topup.Serializer, SdkJson)

  internal val getTopupsTopupResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Topup> =
      MediaTypeCodecRegistry.of(getTopupsTopupResponseCodecAlternative0Codec)

  private val getTopupsTopupResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTopupsTopup.response.alternative1", Error.Serializer, SdkJson)

  internal val getTopupsTopupResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTopupsTopupResponseCodecAlternative1Codec)

  internal val getTopupsTopupRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTopupsTopupRequestCodec)

  internal const val POSTTOPUPS_REQUEST_CODEC_ID: String = "PostTopups.request"

  private val postTopupsRequestCodec: MediaTypeCodec<InlineV1TopupsPostRequestFormX844b79d6> =
      PostTopupsFormCodec

  private val postTopupsResponseCodecAlternative0Codec: MediaTypeCodec<Topup> =
      KotlinxSerializationCodec("PostTopups.response.alternative0", Topup.Serializer, SdkJson)

  internal val postTopupsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Topup> =
      MediaTypeCodecRegistry.of(postTopupsResponseCodecAlternative0Codec)

  private val postTopupsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTopups.response.alternative1", Error.Serializer, SdkJson)

  internal val postTopupsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTopupsResponseCodecAlternative1Codec)

  internal val postTopupsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TopupsPostRequestFormX844b79d6> =
      MediaTypeCodecRegistry.of(postTopupsRequestCodec)

  internal const val POSTTOPUPSTOPUP_REQUEST_CODEC_ID: String = "PostTopupsTopup.request"

  private val postTopupsTopupRequestCodec: MediaTypeCodec<InlineV1TopupsPostRequestFormX64883c32?> =
      PostTopupsTopupFormCodec

  private val postTopupsTopupResponseCodecAlternative0Codec: MediaTypeCodec<Topup> =
      KotlinxSerializationCodec("PostTopupsTopup.response.alternative0", Topup.Serializer, SdkJson)

  internal val postTopupsTopupResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Topup> =
      MediaTypeCodecRegistry.of(postTopupsTopupResponseCodecAlternative0Codec)

  private val postTopupsTopupResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTopupsTopup.response.alternative1", Error.Serializer, SdkJson)

  internal val postTopupsTopupResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTopupsTopupResponseCodecAlternative1Codec)

  internal val postTopupsTopupRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TopupsPostRequestFormX64883c32?> =
      MediaTypeCodecRegistry.of(postTopupsTopupRequestCodec)

  internal const val POSTTOPUPSTOPUPCANCEL_REQUEST_CODEC_ID: String =
      "PostTopupsTopupCancel.request"

  private val postTopupsTopupCancelRequestCodec:
      MediaTypeCodec<InlineV1TopupsCancelPostRequestFormX8018f503?> = PostTopupsTopupCancelFormCodec

  private val postTopupsTopupCancelResponseCodecAlternative0Codec: MediaTypeCodec<Topup> =
      KotlinxSerializationCodec("PostTopupsTopupCancel.response.alternative0", Topup.Serializer, SdkJson)

  internal val postTopupsTopupCancelResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Topup>
      = MediaTypeCodecRegistry.of(postTopupsTopupCancelResponseCodecAlternative0Codec)

  private val postTopupsTopupCancelResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTopupsTopupCancel.response.alternative1", Error.Serializer, SdkJson)

  internal val postTopupsTopupCancelResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postTopupsTopupCancelResponseCodecAlternative1Codec)

  internal val postTopupsTopupCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TopupsCancelPostRequestFormX8018f503?> =
      MediaTypeCodecRegistry.of(postTopupsTopupCancelRequestCodec)

  internal object GetTopupsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTopups.request"

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

  internal object GetTopupsTopupFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTopupsTopup.request"

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

  internal object PostTopupsFormCodec : MediaTypeCodec<InlineV1TopupsPostRequestFormX844b79d6> {
    override val id: String = "PostTopups.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TopupsPostRequestFormX844b79d6, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1TopupsPostRequestFormMetadataAnyOf2X21f5a0e5).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.paymentMethod?.let { formValue0 ->
        form.add("payment_method", formValue0)
      }
      request.paymentMethodOptions?.let { formValue0 ->
        formValue0.usBankAccount?.let { formValue2 ->
          form.add("payment_method_options" + "[us_bank_account]" + "[network]", formValue2.network.value)
        }
      }
      request.source?.let { formValue0 ->
        form.add("source", formValue0)
      }
      request.statementDescriptor?.let { formValue0 ->
        form.add("statement_descriptor", formValue0)
      }
      request.transferGroup?.let { formValue0 ->
        form.add("transfer_group", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TopupsPostRequestFormX844b79d6 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTopupsTopupFormCodec : MediaTypeCodec<InlineV1TopupsPostRequestFormX64883c32?> {
    override val id: String = "PostTopupsTopup.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TopupsPostRequestFormX64883c32?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TopupsPostRequestFormX64883c32? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTopupsTopupCancelFormCodec : MediaTypeCodec<InlineV1TopupsCancelPostRequestFormX8018f503?> {
    override val id: String = "PostTopupsTopupCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TopupsCancelPostRequestFormX8018f503?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TopupsCancelPostRequestFormX8018f503? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'topups' group of Stripe API.
 */
public class TopupsClient(
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
      SdkExecutor(transport, authentication = this@TopupsClient.authentication)

  /**
   * <p>Returns a list of top-ups.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param amount A positive integer representing how much to transfer.
   * @param created A filter on the list, based on the object `created` field. The value can be a string with an integer
   * Unix timestamp, or it can be a dictionary with a number of different query options.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return top-ups that have the given status. One of `canceled`, `failed`, `pending` or
   * `succeeded`.
   * @param options Execution options.
   */
  public suspend fun getTopupsWithResponse(
    request: JsonObject? = null,
    amount: InlineV1TopupsGetParameterXf8186291? = null,
    created: InlineV1TopupsGetParameterX36610912? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1TopupsGetParameterXfde1522f? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTopupsResponse> = executor.executeWithResponse<JsonObject?, GetTopupsResponse>(SdkExecutionRequest(getTopupsMetadata, baseUri, request, listOf(TopupsCodecs.GETTOPUPS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "amount", values = amount?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
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
  }), TopupsCodecs.getTopupsRequestCodecRegistry, GetTopupsResponseDecoder, options)

  /**
   * <p>Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID that was
   * returned from your previous request, and Stripe will return the corresponding top-up information.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param topup Wire parameter `topup`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTopupsTopupWithResponse(
    request: JsonObject? = null,
    topup: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTopupsTopupResponse> = executor.executeWithResponse<JsonObject?, GetTopupsTopupResponse>(SdkExecutionRequest(getTopupsTopupMetadata, baseUri, request, listOf(TopupsCodecs.GETTOPUPSTOPUP_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "topup", values = listOf(topup.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TopupsCodecs.getTopupsTopupRequestCodecRegistry, GetTopupsTopupResponseDecoder, options)

  /**
   * <p>Top up the balance of an account</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTopupsWithResponse(request: InlineV1TopupsPostRequestFormX844b79d6, options: CallOptions = CallOptions()): SdkResponseResult<PostTopupsResponse> = executor.executeWithResponse<InlineV1TopupsPostRequestFormX844b79d6, PostTopupsResponse>(SdkExecutionRequest(postTopupsMetadata, baseUri, request, listOf(TopupsCodecs.POSTTOPUPS_REQUEST_CODEC_ID), emptyList()), TopupsCodecs.postTopupsRequestCodecRegistry, PostTopupsResponseDecoder, options)

  /**
   * <p>Updates the metadata of a top-up. Other top-up details are not editable by design.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param topup Wire parameter `topup`.
   * @param options Execution options.
   */
  public suspend fun postTopupsTopupWithResponse(
    request: InlineV1TopupsPostRequestFormX64883c32? = null,
    topup: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTopupsTopupResponse> = executor.executeWithResponse<InlineV1TopupsPostRequestFormX64883c32?, PostTopupsTopupResponse>(SdkExecutionRequest(postTopupsTopupMetadata, baseUri, request, listOf(TopupsCodecs.POSTTOPUPSTOPUP_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "topup", values = listOf(topup.toString())))
  }), TopupsCodecs.postTopupsTopupRequestCodecRegistry, PostTopupsTopupResponseDecoder, options)

  /**
   * <p>Cancels a top-up. Only pending top-ups can be canceled.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param topup Wire parameter `topup`.
   * @param options Execution options.
   */
  public suspend fun postTopupsTopupCancelWithResponse(
    request: InlineV1TopupsCancelPostRequestFormX8018f503? = null,
    topup: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTopupsTopupCancelResponse> = executor.executeWithResponse<InlineV1TopupsCancelPostRequestFormX8018f503?, PostTopupsTopupCancelResponse>(SdkExecutionRequest(postTopupsTopupCancelMetadata, baseUri, request, listOf(TopupsCodecs.POSTTOPUPSTOPUPCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "topup", values = listOf(topup.toString())))
  }), TopupsCodecs.postTopupsTopupCancelRequestCodecRegistry, PostTopupsTopupCancelResponseDecoder, options)

  /**
   * Typed response alternatives for `GetTopups`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetTopupsResponse {
    public class SuccessJson(
      public val json: InlineV1TopupsGetResponse200JsonX20bd0d6b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTopupsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTopupsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTopupsResponse
  }

  private object GetTopupsResponseDecoder : SdkResponseAlternativeDecoder<GetTopupsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTopupsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTopupsResponse> = when {
      alternative.id == "GetTopups.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTopupsResponse.SuccessJson(
          json = TopupsCodecs.getTopupsResponseCodecAlternative0Registry.select(listOf("GetTopups.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTopups.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTopupsResponse.DefaultJson(
          json = TopupsCodecs.getTopupsResponseCodecAlternative1Registry.select(listOf("GetTopups.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTopupsResponse = GetTopupsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTopupsTopup`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetTopupsTopupResponse {
    public class SuccessJson(
      public val json: Topup,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTopupsTopupResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTopupsTopupResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTopupsTopupResponse
  }

  private object GetTopupsTopupResponseDecoder : SdkResponseAlternativeDecoder<GetTopupsTopupResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTopupsTopupResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTopupsTopupResponse> = when {
      alternative.id == "GetTopupsTopup.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTopupsTopupResponse.SuccessJson(
          json = TopupsCodecs.getTopupsTopupResponseCodecAlternative0Registry.select(listOf("GetTopupsTopup.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTopupsTopup.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTopupsTopupResponse.DefaultJson(
          json = TopupsCodecs.getTopupsTopupResponseCodecAlternative1Registry.select(listOf("GetTopupsTopup.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTopupsTopupResponse = GetTopupsTopupResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTopups`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTopupsResponse {
    public class SuccessJson(
      public val json: Topup,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsResponse
  }

  private object PostTopupsResponseDecoder : SdkResponseAlternativeDecoder<PostTopupsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTopupsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTopupsResponse> = when {
      alternative.id == "PostTopups.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTopupsResponse.SuccessJson(
          json = TopupsCodecs.postTopupsResponseCodecAlternative0Registry.select(listOf("PostTopups.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTopups.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTopupsResponse.DefaultJson(
          json = TopupsCodecs.postTopupsResponseCodecAlternative1Registry.select(listOf("PostTopups.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTopupsResponse = PostTopupsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTopupsTopup`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTopupsTopupResponse {
    public class SuccessJson(
      public val json: Topup,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsTopupResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsTopupResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsTopupResponse
  }

  private object PostTopupsTopupResponseDecoder : SdkResponseAlternativeDecoder<PostTopupsTopupResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTopupsTopupResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTopupsTopupResponse> = when {
      alternative.id == "PostTopupsTopup.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTopupsTopupResponse.SuccessJson(
          json = TopupsCodecs.postTopupsTopupResponseCodecAlternative0Registry.select(listOf("PostTopupsTopup.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTopupsTopup.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTopupsTopupResponse.DefaultJson(
          json = TopupsCodecs.postTopupsTopupResponseCodecAlternative1Registry.select(listOf("PostTopupsTopup.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTopupsTopupResponse = PostTopupsTopupResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTopupsTopupCancel`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostTopupsTopupCancelResponse {
    public class SuccessJson(
      public val json: Topup,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsTopupCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsTopupCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTopupsTopupCancelResponse
  }

  private object PostTopupsTopupCancelResponseDecoder : SdkResponseAlternativeDecoder<PostTopupsTopupCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTopupsTopupCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTopupsTopupCancelResponse> = when {
      alternative.id == "PostTopupsTopupCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTopupsTopupCancelResponse.SuccessJson(
          json = TopupsCodecs.postTopupsTopupCancelResponseCodecAlternative0Registry.select(listOf("PostTopupsTopupCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTopupsTopupCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTopupsTopupCancelResponse.DefaultJson(
          json = TopupsCodecs.postTopupsTopupCancelResponseCodecAlternative1Registry.select(listOf("PostTopupsTopupCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTopupsTopupCancelResponse = PostTopupsTopupCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getTopupsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTopups",
          method = "GET",
          path = "/v1/topups",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TopupsGetResponse200JsonX20bd0d6b",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTopups.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTopups.response.alternative1",
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

    internal val getTopupsTopupMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTopupsTopup",
          method = "GET",
          path = "/v1/topups/{topup}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Topup",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTopupsTopup.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTopupsTopup.response.alternative1",
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

    internal val postTopupsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTopups",
          method = "POST",
          path = "/v1/topups",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Topup",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTopups.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTopups.response.alternative1",
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

    internal val postTopupsTopupMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTopupsTopup",
          method = "POST",
          path = "/v1/topups/{topup}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Topup",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTopupsTopup.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTopupsTopup.response.alternative1",
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

    internal val postTopupsTopupCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTopupsTopupCancel",
          method = "POST",
          path = "/v1/topups/{topup}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Topup",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTopupsTopupCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTopupsTopupCancel.response.alternative1",
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
