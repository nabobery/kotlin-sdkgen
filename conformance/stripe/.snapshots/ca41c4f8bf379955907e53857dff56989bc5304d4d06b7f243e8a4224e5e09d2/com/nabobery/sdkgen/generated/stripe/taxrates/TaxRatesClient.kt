package com.nabobery.sdkgen.generated.stripe.taxrates

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1TaxRatesGetParameterXa4920ebf
import com.nabobery.sdkgen.generated.stripe.InlineV1TaxRatesGetResponse200JsonX875c3bec
import com.nabobery.sdkgen.generated.stripe.InlineV1TaxRatesPostRequestFormX4d52a369
import com.nabobery.sdkgen.generated.stripe.InlineV1TaxRatesPostRequestFormXdec5ed3b
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.TaxRate
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
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object TaxRatesCodecs {
  internal const val GETTAXRATES_REQUEST_CODEC_ID: String = "GetTaxRates.request"

  private val getTaxRatesRequestCodec: MediaTypeCodec<JsonObject?> = GetTaxRatesFormCodec

  private val getTaxRatesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TaxRatesGetResponse200JsonX875c3bec> =
      KotlinxSerializationCodec("GetTaxRates.response.alternative0", InlineV1TaxRatesGetResponse200JsonX875c3bec.Serializer, SdkJson)

  internal val getTaxRatesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TaxRatesGetResponse200JsonX875c3bec> =
      MediaTypeCodecRegistry.of(getTaxRatesResponseCodecAlternative0Codec)

  private val getTaxRatesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxRates.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxRatesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxRatesResponseCodecAlternative1Codec)

  internal val getTaxRatesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxRatesRequestCodec)

  internal const val GETTAXRATESTAXRATE_REQUEST_CODEC_ID: String = "GetTaxRatesTaxRate.request"

  private val getTaxRatesTaxRateRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTaxRatesTaxRateFormCodec

  private val getTaxRatesTaxRateResponseCodecAlternative0Codec: MediaTypeCodec<TaxRate> =
      KotlinxSerializationCodec("GetTaxRatesTaxRate.response.alternative0", TaxRate.Serializer, SdkJson)

  internal val getTaxRatesTaxRateResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TaxRate>
      = MediaTypeCodecRegistry.of(getTaxRatesTaxRateResponseCodecAlternative0Codec)

  private val getTaxRatesTaxRateResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxRatesTaxRate.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxRatesTaxRateResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxRatesTaxRateResponseCodecAlternative1Codec)

  internal val getTaxRatesTaxRateRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxRatesTaxRateRequestCodec)

  internal const val POSTTAXRATES_REQUEST_CODEC_ID: String = "PostTaxRates.request"

  private val postTaxRatesRequestCodec: MediaTypeCodec<InlineV1TaxRatesPostRequestFormXdec5ed3b> =
      PostTaxRatesFormCodec

  private val postTaxRatesResponseCodecAlternative0Codec: MediaTypeCodec<TaxRate> =
      KotlinxSerializationCodec("PostTaxRates.response.alternative0", TaxRate.Serializer, SdkJson)

  internal val postTaxRatesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TaxRate> =
      MediaTypeCodecRegistry.of(postTaxRatesResponseCodecAlternative0Codec)

  private val postTaxRatesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTaxRates.response.alternative1", Error.Serializer, SdkJson)

  internal val postTaxRatesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTaxRatesResponseCodecAlternative1Codec)

  internal val postTaxRatesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TaxRatesPostRequestFormXdec5ed3b> =
      MediaTypeCodecRegistry.of(postTaxRatesRequestCodec)

  internal const val POSTTAXRATESTAXRATE_REQUEST_CODEC_ID: String = "PostTaxRatesTaxRate.request"

  private val postTaxRatesTaxRateRequestCodec:
      MediaTypeCodec<InlineV1TaxRatesPostRequestFormX4d52a369?> = PostTaxRatesTaxRateFormCodec

  private val postTaxRatesTaxRateResponseCodecAlternative0Codec: MediaTypeCodec<TaxRate> =
      KotlinxSerializationCodec("PostTaxRatesTaxRate.response.alternative0", TaxRate.Serializer, SdkJson)

  internal val postTaxRatesTaxRateResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TaxRate>
      = MediaTypeCodecRegistry.of(postTaxRatesTaxRateResponseCodecAlternative0Codec)

  private val postTaxRatesTaxRateResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTaxRatesTaxRate.response.alternative1", Error.Serializer, SdkJson)

  internal val postTaxRatesTaxRateResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTaxRatesTaxRateResponseCodecAlternative1Codec)

  internal val postTaxRatesTaxRateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TaxRatesPostRequestFormX4d52a369?> =
      MediaTypeCodecRegistry.of(postTaxRatesTaxRateRequestCodec)

  internal object GetTaxRatesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxRates.request"

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

  internal object GetTaxRatesTaxRateFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxRatesTaxRate.request"

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

  internal object PostTaxRatesFormCodec : MediaTypeCodec<InlineV1TaxRatesPostRequestFormXdec5ed3b> {
    override val id: String = "PostTaxRates.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TaxRatesPostRequestFormXdec5ed3b, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.country?.let { formValue0 ->
        form.add("country", formValue0)
      }
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
      }
      form.add("display_name", request.displayName)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("inclusive", request.inclusive.toString())
      request.jurisdiction?.let { formValue0 ->
        form.add("jurisdiction", formValue0)
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("percentage", request.percentage)
      request.state?.let { formValue0 ->
        form.add("state", formValue0)
      }
      request.taxType?.let { formValue0 ->
        form.add("tax_type", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TaxRatesPostRequestFormXdec5ed3b {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTaxRatesTaxRateFormCodec : MediaTypeCodec<InlineV1TaxRatesPostRequestFormX4d52a369?> {
    override val id: String = "PostTaxRatesTaxRate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TaxRatesPostRequestFormX4d52a369?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.country?.let { formValue0 ->
        form.add("country", formValue0)
      }
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
      }
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
      request.jurisdiction?.let { formValue0 ->
        form.add("jurisdiction", formValue0)
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
          formValue0.inlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1TaxRatesPostRequestFormMetadataAnyOf2X2fc40658).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.state?.let { formValue0 ->
        form.add("state", formValue0)
      }
      request.taxType?.let { formValue0 ->
        form.add("tax_type", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TaxRatesPostRequestFormX4d52a369? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'tax_rates' group of Stripe API.
 */
public class TaxRatesClient(
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
      SdkExecutor(transport, authentication = this@TaxRatesClient.authentication)

  /**
   * <p>Returns a list of your tax rates. Tax rates are returned sorted by creation date, with the most recently created
   * tax rates appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Optional flag to filter by tax rates that are either active or inactive (archived).
   * @param created Optional range for filtering created date.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param inclusive Optional flag to filter by tax rates that are inclusive (or those that are not inclusive).
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getTaxRatesWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    created: InlineV1TaxRatesGetParameterXa4920ebf? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    inclusive: Boolean? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxRatesResponse> = executor.executeWithResponse<JsonObject?, GetTaxRatesResponse>(SdkExecutionRequest(getTaxRatesMetadata, baseUri, request, listOf(TaxRatesCodecs.GETTAXRATES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "active", values = active?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "inclusive", values = inclusive?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), TaxRatesCodecs.getTaxRatesRequestCodecRegistry, GetTaxRatesResponseDecoder, options)

  /**
   * <p>Retrieves a tax rate with the given ID</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param taxRate Wire parameter `tax_rate`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTaxRatesTaxRateWithResponse(
    request: JsonObject? = null,
    taxRate: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxRatesTaxRateResponse> = executor.executeWithResponse<JsonObject?, GetTaxRatesTaxRateResponse>(SdkExecutionRequest(getTaxRatesTaxRateMetadata, baseUri, request, listOf(TaxRatesCodecs.GETTAXRATESTAXRATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "tax_rate", values = listOf(taxRate.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TaxRatesCodecs.getTaxRatesTaxRateRequestCodecRegistry, GetTaxRatesTaxRateResponseDecoder, options)

  /**
   * <p>Creates a new tax rate.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTaxRatesWithResponse(request: InlineV1TaxRatesPostRequestFormXdec5ed3b, options: CallOptions = CallOptions()): SdkResponseResult<PostTaxRatesResponse> = executor.executeWithResponse<InlineV1TaxRatesPostRequestFormXdec5ed3b, PostTaxRatesResponse>(SdkExecutionRequest(postTaxRatesMetadata, baseUri, request, listOf(TaxRatesCodecs.POSTTAXRATES_REQUEST_CODEC_ID), emptyList()), TaxRatesCodecs.postTaxRatesRequestCodecRegistry, PostTaxRatesResponseDecoder, options)

  /**
   * <p>Updates an existing tax rate.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param taxRate Wire parameter `tax_rate`.
   * @param options Execution options.
   */
  public suspend fun postTaxRatesTaxRateWithResponse(
    request: InlineV1TaxRatesPostRequestFormX4d52a369? = null,
    taxRate: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTaxRatesTaxRateResponse> = executor.executeWithResponse<InlineV1TaxRatesPostRequestFormX4d52a369?, PostTaxRatesTaxRateResponse>(SdkExecutionRequest(postTaxRatesTaxRateMetadata, baseUri, request, listOf(TaxRatesCodecs.POSTTAXRATESTAXRATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "tax_rate", values = listOf(taxRate.toString())))
  }), TaxRatesCodecs.postTaxRatesTaxRateRequestCodecRegistry, PostTaxRatesTaxRateResponseDecoder, options)

  /**
   * Typed response alternatives for `GetTaxRates`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetTaxRatesResponse {
    public class SuccessJson(
      public val json: InlineV1TaxRatesGetResponse200JsonX875c3bec,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRatesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRatesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRatesResponse
  }

  private object GetTaxRatesResponseDecoder : SdkResponseAlternativeDecoder<GetTaxRatesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxRatesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxRatesResponse> = when {
      alternative.id == "GetTaxRates.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxRatesResponse.SuccessJson(
          json = TaxRatesCodecs.getTaxRatesResponseCodecAlternative0Registry.select(listOf("GetTaxRates.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxRates.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxRatesResponse.DefaultJson(
          json = TaxRatesCodecs.getTaxRatesResponseCodecAlternative1Registry.select(listOf("GetTaxRates.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxRatesResponse = GetTaxRatesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxRatesTaxRate`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTaxRatesTaxRateResponse {
    public class SuccessJson(
      public val json: TaxRate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRatesTaxRateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRatesTaxRateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRatesTaxRateResponse
  }

  private object GetTaxRatesTaxRateResponseDecoder : SdkResponseAlternativeDecoder<GetTaxRatesTaxRateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxRatesTaxRateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxRatesTaxRateResponse> = when {
      alternative.id == "GetTaxRatesTaxRate.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxRatesTaxRateResponse.SuccessJson(
          json = TaxRatesCodecs.getTaxRatesTaxRateResponseCodecAlternative0Registry.select(listOf("GetTaxRatesTaxRate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxRatesTaxRate.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxRatesTaxRateResponse.DefaultJson(
          json = TaxRatesCodecs.getTaxRatesTaxRateResponseCodecAlternative1Registry.select(listOf("GetTaxRatesTaxRate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxRatesTaxRateResponse = GetTaxRatesTaxRateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTaxRates`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTaxRatesResponse {
    public class SuccessJson(
      public val json: TaxRate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRatesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRatesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRatesResponse
  }

  private object PostTaxRatesResponseDecoder : SdkResponseAlternativeDecoder<PostTaxRatesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTaxRatesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTaxRatesResponse> = when {
      alternative.id == "PostTaxRates.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTaxRatesResponse.SuccessJson(
          json = TaxRatesCodecs.postTaxRatesResponseCodecAlternative0Registry.select(listOf("PostTaxRates.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTaxRates.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTaxRatesResponse.DefaultJson(
          json = TaxRatesCodecs.postTaxRatesResponseCodecAlternative1Registry.select(listOf("PostTaxRates.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTaxRatesResponse = PostTaxRatesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTaxRatesTaxRate`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostTaxRatesTaxRateResponse {
    public class SuccessJson(
      public val json: TaxRate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRatesTaxRateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRatesTaxRateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRatesTaxRateResponse
  }

  private object PostTaxRatesTaxRateResponseDecoder : SdkResponseAlternativeDecoder<PostTaxRatesTaxRateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTaxRatesTaxRateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTaxRatesTaxRateResponse> = when {
      alternative.id == "PostTaxRatesTaxRate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTaxRatesTaxRateResponse.SuccessJson(
          json = TaxRatesCodecs.postTaxRatesTaxRateResponseCodecAlternative0Registry.select(listOf("PostTaxRatesTaxRate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTaxRatesTaxRate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTaxRatesTaxRateResponse.DefaultJson(
          json = TaxRatesCodecs.postTaxRatesTaxRateResponseCodecAlternative1Registry.select(listOf("PostTaxRatesTaxRate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTaxRatesTaxRateResponse = PostTaxRatesTaxRateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getTaxRatesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxRates",
          method = "GET",
          path = "/v1/tax_rates",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TaxRatesGetResponse200JsonX875c3bec",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxRates.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxRates.response.alternative1",
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

    internal val getTaxRatesTaxRateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxRatesTaxRate",
          method = "GET",
          path = "/v1/tax_rates/{tax_rate}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxRate",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxRatesTaxRate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxRatesTaxRate.response.alternative1",
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

    internal val postTaxRatesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTaxRates",
          method = "POST",
          path = "/v1/tax_rates",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxRate",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxRates.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxRates.response.alternative1",
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

    internal val postTaxRatesTaxRateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTaxRatesTaxRate",
          method = "POST",
          path = "/v1/tax_rates/{tax_rate}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxRate",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxRatesTaxRate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxRatesTaxRate.response.alternative1",
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
