package com.nabobery.sdkgen.generated.stripe.taxids

import com.nabobery.sdkgen.generated.stripe.DeletedTaxId
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1TaxIdsGetParameterXee5909c8
import com.nabobery.sdkgen.generated.stripe.InlineV1TaxIdsGetResponse200JsonX7f7ca85a
import com.nabobery.sdkgen.generated.stripe.InlineV1TaxIdsPostRequestFormX1022e8c3
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.TaxId
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

internal object TaxIdsCodecs {
  internal const val DELETETAXIDSID_REQUEST_CODEC_ID: String = "DeleteTaxIdsId.request"

  private val deleteTaxIdsIdRequestCodec: MediaTypeCodec<JsonObject?> = DeleteTaxIdsIdFormCodec

  private val deleteTaxIdsIdResponseCodecAlternative0Codec: MediaTypeCodec<DeletedTaxId> =
      KotlinxSerializationCodec("DeleteTaxIdsId.response.alternative0", DeletedTaxId.Serializer, SdkJson)

  internal val deleteTaxIdsIdResponseCodecAlternative0Registry: MediaTypeCodecRegistry<DeletedTaxId>
      = MediaTypeCodecRegistry.of(deleteTaxIdsIdResponseCodecAlternative0Codec)

  private val deleteTaxIdsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteTaxIdsId.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteTaxIdsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteTaxIdsIdResponseCodecAlternative1Codec)

  internal val deleteTaxIdsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteTaxIdsIdRequestCodec)

  internal const val GETTAXIDS_REQUEST_CODEC_ID: String = "GetTaxIds.request"

  private val getTaxIdsRequestCodec: MediaTypeCodec<JsonObject?> = GetTaxIdsFormCodec

  private val getTaxIdsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TaxIdsGetResponse200JsonX7f7ca85a> =
      KotlinxSerializationCodec("GetTaxIds.response.alternative0", InlineV1TaxIdsGetResponse200JsonX7f7ca85a.Serializer, SdkJson)

  internal val getTaxIdsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TaxIdsGetResponse200JsonX7f7ca85a> =
      MediaTypeCodecRegistry.of(getTaxIdsResponseCodecAlternative0Codec)

  private val getTaxIdsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxIds.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxIdsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxIdsResponseCodecAlternative1Codec)

  internal val getTaxIdsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxIdsRequestCodec)

  internal const val GETTAXIDSID_REQUEST_CODEC_ID: String = "GetTaxIdsId.request"

  private val getTaxIdsIdRequestCodec: MediaTypeCodec<JsonObject?> = GetTaxIdsIdFormCodec

  private val getTaxIdsIdResponseCodecAlternative0Codec: MediaTypeCodec<TaxId> =
      KotlinxSerializationCodec("GetTaxIdsId.response.alternative0", TaxId.Serializer, SdkJson)

  internal val getTaxIdsIdResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TaxId> =
      MediaTypeCodecRegistry.of(getTaxIdsIdResponseCodecAlternative0Codec)

  private val getTaxIdsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxIdsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxIdsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxIdsIdResponseCodecAlternative1Codec)

  internal val getTaxIdsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxIdsIdRequestCodec)

  internal const val POSTTAXIDS_REQUEST_CODEC_ID: String = "PostTaxIds.request"

  private val postTaxIdsRequestCodec: MediaTypeCodec<InlineV1TaxIdsPostRequestFormX1022e8c3> =
      PostTaxIdsFormCodec

  private val postTaxIdsResponseCodecAlternative0Codec: MediaTypeCodec<TaxId> =
      KotlinxSerializationCodec("PostTaxIds.response.alternative0", TaxId.Serializer, SdkJson)

  internal val postTaxIdsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TaxId> =
      MediaTypeCodecRegistry.of(postTaxIdsResponseCodecAlternative0Codec)

  private val postTaxIdsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTaxIds.response.alternative1", Error.Serializer, SdkJson)

  internal val postTaxIdsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTaxIdsResponseCodecAlternative1Codec)

  internal val postTaxIdsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TaxIdsPostRequestFormX1022e8c3> =
      MediaTypeCodecRegistry.of(postTaxIdsRequestCodec)

  internal object DeleteTaxIdsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteTaxIdsId.request"

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

  internal object GetTaxIdsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxIds.request"

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

  internal object GetTaxIdsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxIdsId.request"

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

  internal object PostTaxIdsFormCodec : MediaTypeCodec<InlineV1TaxIdsPostRequestFormX1022e8c3> {
    override val id: String = "PostTaxIds.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TaxIdsPostRequestFormX1022e8c3, mediaType: String): SdkRequestBody {
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
      request.owner?.let { formValue0 ->
        formValue0.account?.let { formValue2 ->
          form.add("owner" + "[account]", formValue2)
        }
        formValue0.customer?.let { formValue2 ->
          form.add("owner" + "[customer]", formValue2)
        }
        formValue0.customerAccount?.let { formValue2 ->
          form.add("owner" + "[customer_account]", formValue2)
        }
        form.add("owner" + "[type]", formValue0.type.value)
      }
      form.add("type", request.type.value)
      form.add("value", request.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TaxIdsPostRequestFormX1022e8c3 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'tax_ids' group of Stripe API.
 */
public class TaxIdsClient(
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
      SdkExecutor(transport, authentication = this@TaxIdsClient.authentication)

  /**
   * <p>Deletes an existing account or customer <code>tax_id</code> object.</p>
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
  public suspend fun deleteTaxIdsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteTaxIdsIdResponse> = executor.executeWithResponse<JsonObject?, DeleteTaxIdsIdResponse>(SdkExecutionRequest(deleteTaxIdsIdMetadata, baseUri, request, listOf(TaxIdsCodecs.DELETETAXIDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TaxIdsCodecs.deleteTaxIdsIdRequestCodecRegistry, DeleteTaxIdsIdResponseDecoder, options)

  /**
   * <p>Returns a list of tax IDs.</p>
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
   * @param owner The account or customer the tax ID belongs to. Defaults to `owner[type]=self`.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getTaxIdsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    owner: InlineV1TaxIdsGetParameterXee5909c8? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxIdsResponse> = executor.executeWithResponse<JsonObject?, GetTaxIdsResponse>(SdkExecutionRequest(getTaxIdsMetadata, baseUri, request, listOf(TaxIdsCodecs.GETTAXIDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "owner[account]", values = owner?.account?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "owner[customer]", values = owner?.customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "owner[customer_account]", values = owner?.customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "owner[type]", values = owner?.type?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), TaxIdsCodecs.getTaxIdsRequestCodecRegistry, GetTaxIdsResponseDecoder, options)

  /**
   * <p>Retrieves an account or customer <code>tax_id</code> object.</p>
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
  public suspend fun getTaxIdsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxIdsIdResponse> = executor.executeWithResponse<JsonObject?, GetTaxIdsIdResponse>(SdkExecutionRequest(getTaxIdsIdMetadata, baseUri, request, listOf(TaxIdsCodecs.GETTAXIDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TaxIdsCodecs.getTaxIdsIdRequestCodecRegistry, GetTaxIdsIdResponseDecoder, options)

  /**
   * <p>Creates a new account or customer <code>tax_id</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTaxIdsWithResponse(request: InlineV1TaxIdsPostRequestFormX1022e8c3, options: CallOptions = CallOptions()): SdkResponseResult<PostTaxIdsResponse> = executor.executeWithResponse<InlineV1TaxIdsPostRequestFormX1022e8c3, PostTaxIdsResponse>(SdkExecutionRequest(postTaxIdsMetadata, baseUri, request, listOf(TaxIdsCodecs.POSTTAXIDS_REQUEST_CODEC_ID), emptyList()), TaxIdsCodecs.postTaxIdsRequestCodecRegistry, PostTaxIdsResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteTaxIdsId`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeleteTaxIdsIdResponse {
    public class SuccessJson(
      public val json: DeletedTaxId,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTaxIdsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTaxIdsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTaxIdsIdResponse
  }

  private object DeleteTaxIdsIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteTaxIdsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteTaxIdsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteTaxIdsIdResponse> = when {
      alternative.id == "DeleteTaxIdsId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteTaxIdsIdResponse.SuccessJson(
          json = TaxIdsCodecs.deleteTaxIdsIdResponseCodecAlternative0Registry.select(listOf("DeleteTaxIdsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteTaxIdsId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteTaxIdsIdResponse.DefaultJson(
          json = TaxIdsCodecs.deleteTaxIdsIdResponseCodecAlternative1Registry.select(listOf("DeleteTaxIdsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteTaxIdsIdResponse = DeleteTaxIdsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxIds`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetTaxIdsResponse {
    public class SuccessJson(
      public val json: InlineV1TaxIdsGetResponse200JsonX7f7ca85a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxIdsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxIdsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxIdsResponse
  }

  private object GetTaxIdsResponseDecoder : SdkResponseAlternativeDecoder<GetTaxIdsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxIdsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxIdsResponse> = when {
      alternative.id == "GetTaxIds.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxIdsResponse.SuccessJson(
          json = TaxIdsCodecs.getTaxIdsResponseCodecAlternative0Registry.select(listOf("GetTaxIds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxIds.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxIdsResponse.DefaultJson(
          json = TaxIdsCodecs.getTaxIdsResponseCodecAlternative1Registry.select(listOf("GetTaxIds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxIdsResponse = GetTaxIdsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxIdsId`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetTaxIdsIdResponse {
    public class SuccessJson(
      public val json: TaxId,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxIdsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxIdsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxIdsIdResponse
  }

  private object GetTaxIdsIdResponseDecoder : SdkResponseAlternativeDecoder<GetTaxIdsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxIdsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxIdsIdResponse> = when {
      alternative.id == "GetTaxIdsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxIdsIdResponse.SuccessJson(
          json = TaxIdsCodecs.getTaxIdsIdResponseCodecAlternative0Registry.select(listOf("GetTaxIdsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxIdsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxIdsIdResponse.DefaultJson(
          json = TaxIdsCodecs.getTaxIdsIdResponseCodecAlternative1Registry.select(listOf("GetTaxIdsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxIdsIdResponse = GetTaxIdsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTaxIds`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTaxIdsResponse {
    public class SuccessJson(
      public val json: TaxId,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxIdsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxIdsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxIdsResponse
  }

  private object PostTaxIdsResponseDecoder : SdkResponseAlternativeDecoder<PostTaxIdsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTaxIdsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTaxIdsResponse> = when {
      alternative.id == "PostTaxIds.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTaxIdsResponse.SuccessJson(
          json = TaxIdsCodecs.postTaxIdsResponseCodecAlternative0Registry.select(listOf("PostTaxIds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTaxIds.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTaxIdsResponse.DefaultJson(
          json = TaxIdsCodecs.postTaxIdsResponseCodecAlternative1Registry.select(listOf("PostTaxIds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTaxIdsResponse = PostTaxIdsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deleteTaxIdsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteTaxIdsId",
          method = "DELETE",
          path = "/v1/tax_ids/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedTaxId",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTaxIdsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTaxIdsId.response.alternative1",
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

    internal val getTaxIdsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxIds",
          method = "GET",
          path = "/v1/tax_ids",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TaxIdsGetResponse200JsonX7f7ca85a",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxIds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxIds.response.alternative1",
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

    internal val getTaxIdsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxIdsId",
          method = "GET",
          path = "/v1/tax_ids/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxId",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxIdsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxIdsId.response.alternative1",
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

    internal val postTaxIdsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTaxIds",
          method = "POST",
          path = "/v1/tax_ids",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxId",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxIds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxIds.response.alternative1",
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
