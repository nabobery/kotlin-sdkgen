package com.nabobery.sdkgen.generated.stripe.invoicerenderingtemplates

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1InvoiceRenderingTemplatesArchivePostRequestFormXcaf9bc6b
import com.nabobery.sdkgen.generated.stripe.InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d
import com.nabobery.sdkgen.generated.stripe.InlineV1InvoiceRenderingTemplatesGetResponse200JsonX6f23f981
import com.nabobery.sdkgen.generated.stripe.InlineV1InvoiceRenderingTemplatesUnarchivePostRequestFormX6431072c
import com.nabobery.sdkgen.generated.stripe.InvoiceRenderingTemplate
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

internal object InvoiceRenderingTemplatesCodecs {
  internal const val GETINVOICERENDERINGTEMPLATES_REQUEST_CODEC_ID: String =
      "GetInvoiceRenderingTemplates.request"

  private val getInvoiceRenderingTemplatesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetInvoiceRenderingTemplatesFormCodec

  private val getInvoiceRenderingTemplatesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1InvoiceRenderingTemplatesGetResponse200JsonX6f23f981> =
      KotlinxSerializationCodec("GetInvoiceRenderingTemplates.response.alternative0", InlineV1InvoiceRenderingTemplatesGetResponse200JsonX6f23f981.Serializer, SdkJson)

  internal val getInvoiceRenderingTemplatesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1InvoiceRenderingTemplatesGetResponse200JsonX6f23f981> =
      MediaTypeCodecRegistry.of(getInvoiceRenderingTemplatesResponseCodecAlternative0Codec)

  private val getInvoiceRenderingTemplatesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoiceRenderingTemplates.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoiceRenderingTemplatesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoiceRenderingTemplatesResponseCodecAlternative1Codec)

  internal val getInvoiceRenderingTemplatesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getInvoiceRenderingTemplatesRequestCodec)

  internal const val GETINVOICERENDERINGTEMPLATESTEMPLATE_REQUEST_CODEC_ID: String =
      "GetInvoiceRenderingTemplatesTemplate.request"

  private val getInvoiceRenderingTemplatesTemplateRequestCodec: MediaTypeCodec<JsonObject?> =
      GetInvoiceRenderingTemplatesTemplateFormCodec

  private val getInvoiceRenderingTemplatesTemplateResponseCodecAlternative0Codec:
      MediaTypeCodec<InvoiceRenderingTemplate> =
      KotlinxSerializationCodec("GetInvoiceRenderingTemplatesTemplate.response.alternative0", InvoiceRenderingTemplate.Serializer, SdkJson)

  internal val getInvoiceRenderingTemplatesTemplateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InvoiceRenderingTemplate> =
      MediaTypeCodecRegistry.of(getInvoiceRenderingTemplatesTemplateResponseCodecAlternative0Codec)

  private val getInvoiceRenderingTemplatesTemplateResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetInvoiceRenderingTemplatesTemplate.response.alternative1", Error.Serializer, SdkJson)

  internal val getInvoiceRenderingTemplatesTemplateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getInvoiceRenderingTemplatesTemplateResponseCodecAlternative1Codec)

  internal val getInvoiceRenderingTemplatesTemplateRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getInvoiceRenderingTemplatesTemplateRequestCodec)

  internal const val POSTINVOICERENDERINGTEMPLATESTEMPLATEARCHIVE_REQUEST_CODEC_ID: String =
      "PostInvoiceRenderingTemplatesTemplateArchive.request"

  private val postInvoiceRenderingTemplatesTemplateArchiveRequestCodec:
      MediaTypeCodec<InlineV1InvoiceRenderingTemplatesArchivePostRequestFormXcaf9bc6b?> =
      PostInvoiceRenderingTemplatesTemplateArchiveFormCodec

  private val postInvoiceRenderingTemplatesTemplateArchiveResponseCodecAlternative0Codec:
      MediaTypeCodec<InvoiceRenderingTemplate> =
      KotlinxSerializationCodec("PostInvoiceRenderingTemplatesTemplateArchive.response.alternative0", InvoiceRenderingTemplate.Serializer, SdkJson)

  internal val postInvoiceRenderingTemplatesTemplateArchiveResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InvoiceRenderingTemplate> =
      MediaTypeCodecRegistry.of(postInvoiceRenderingTemplatesTemplateArchiveResponseCodecAlternative0Codec)

  private val postInvoiceRenderingTemplatesTemplateArchiveResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoiceRenderingTemplatesTemplateArchive.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoiceRenderingTemplatesTemplateArchiveResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoiceRenderingTemplatesTemplateArchiveResponseCodecAlternative1Codec)

  internal val postInvoiceRenderingTemplatesTemplateArchiveRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoiceRenderingTemplatesArchivePostRequestFormXcaf9bc6b?> =
      MediaTypeCodecRegistry.of(postInvoiceRenderingTemplatesTemplateArchiveRequestCodec)

  internal const val POSTINVOICERENDERINGTEMPLATESTEMPLATEUNARCHIVE_REQUEST_CODEC_ID: String =
      "PostInvoiceRenderingTemplatesTemplateUnarchive.request"

  private val postInvoiceRenderingTemplatesTemplateUnarchiveRequestCodec:
      MediaTypeCodec<InlineV1InvoiceRenderingTemplatesUnarchivePostRequestFormX6431072c?> =
      PostInvoiceRenderingTemplatesTemplateUnarchiveFormCodec

  private val postInvoiceRenderingTemplatesTemplateUnarchiveResponseCodecAlternative0Codec:
      MediaTypeCodec<InvoiceRenderingTemplate> =
      KotlinxSerializationCodec("PostInvoiceRenderingTemplatesTemplateUnarchive.response.alternative0", InvoiceRenderingTemplate.Serializer, SdkJson)

  internal val postInvoiceRenderingTemplatesTemplateUnarchiveResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InvoiceRenderingTemplate> =
      MediaTypeCodecRegistry.of(postInvoiceRenderingTemplatesTemplateUnarchiveResponseCodecAlternative0Codec)

  private val postInvoiceRenderingTemplatesTemplateUnarchiveResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostInvoiceRenderingTemplatesTemplateUnarchive.response.alternative1", Error.Serializer, SdkJson)

  internal val postInvoiceRenderingTemplatesTemplateUnarchiveResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postInvoiceRenderingTemplatesTemplateUnarchiveResponseCodecAlternative1Codec)

  internal val postInvoiceRenderingTemplatesTemplateUnarchiveRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1InvoiceRenderingTemplatesUnarchivePostRequestFormX6431072c?> =
      MediaTypeCodecRegistry.of(postInvoiceRenderingTemplatesTemplateUnarchiveRequestCodec)

  internal object GetInvoiceRenderingTemplatesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoiceRenderingTemplates.request"

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

  internal object GetInvoiceRenderingTemplatesTemplateFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetInvoiceRenderingTemplatesTemplate.request"

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

  internal object PostInvoiceRenderingTemplatesTemplateArchiveFormCodec : MediaTypeCodec<InlineV1InvoiceRenderingTemplatesArchivePostRequestFormXcaf9bc6b?> {
    override val id: String = "PostInvoiceRenderingTemplatesTemplateArchive.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoiceRenderingTemplatesArchivePostRequestFormXcaf9bc6b?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoiceRenderingTemplatesArchivePostRequestFormXcaf9bc6b? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostInvoiceRenderingTemplatesTemplateUnarchiveFormCodec : MediaTypeCodec<InlineV1InvoiceRenderingTemplatesUnarchivePostRequestFormX6431072c?> {
    override val id: String = "PostInvoiceRenderingTemplatesTemplateUnarchive.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1InvoiceRenderingTemplatesUnarchivePostRequestFormX6431072c?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1InvoiceRenderingTemplatesUnarchivePostRequestFormX6431072c? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'invoice_rendering_templates' group of Stripe API.
 */
public class InvoiceRenderingTemplatesClient(
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
      SdkExecutor(transport, authentication = this@InvoiceRenderingTemplatesClient.authentication)

  /**
   * <p>List all templates, ordered by creation date, with the most recently created template appearing first.</p>
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
   * @param status Wire parameter `status`.
   * @param options Execution options.
   */
  public suspend fun getInvoiceRenderingTemplatesWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1InvoiceRenderingTemplatesGetParameterX41f5d66d? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoiceRenderingTemplatesResponse> = executor.executeWithResponse<JsonObject?, GetInvoiceRenderingTemplatesResponse>(SdkExecutionRequest(getInvoiceRenderingTemplatesMetadata, baseUri, request, listOf(InvoiceRenderingTemplatesCodecs.GETINVOICERENDERINGTEMPLATES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), InvoiceRenderingTemplatesCodecs.getInvoiceRenderingTemplatesRequestCodecRegistry, GetInvoiceRenderingTemplatesResponseDecoder, options)

  /**
   * <p>Retrieves an invoice rendering template with the given ID. It by default returns the latest version of the
   * template. Optionally, specify a version to see previous versions.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param template Wire parameter `template`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param version Wire parameter `version`.
   * @param options Execution options.
   */
  public suspend fun getInvoiceRenderingTemplatesTemplateWithResponse(
    request: JsonObject? = null,
    template: String,
    expand: List<String>? = null,
    version: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetInvoiceRenderingTemplatesTemplateResponse> = executor.executeWithResponse<JsonObject?, GetInvoiceRenderingTemplatesTemplateResponse>(SdkExecutionRequest(getInvoiceRenderingTemplatesTemplateMetadata, baseUri, request, listOf(InvoiceRenderingTemplatesCodecs.GETINVOICERENDERINGTEMPLATESTEMPLATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "template", values = listOf(template.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "version", values = version?.let { listOf(it.toString()) }.orEmpty()))
  }), InvoiceRenderingTemplatesCodecs.getInvoiceRenderingTemplatesTemplateRequestCodecRegistry, GetInvoiceRenderingTemplatesTemplateResponseDecoder, options)

  /**
   * <p>Updates the status of an invoice rendering template to ‘archived’ so no new Stripe objects (customers, invoices,
   * etc.) can reference it. The template can also no longer be updated. However, if the template is already set on a
   * Stripe object, it will continue to be applied on invoices generated by it.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param template Wire parameter `template`.
   * @param options Execution options.
   */
  public suspend fun postInvoiceRenderingTemplatesTemplateArchiveWithResponse(
    request: InlineV1InvoiceRenderingTemplatesArchivePostRequestFormXcaf9bc6b? = null,
    template: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoiceRenderingTemplatesTemplateArchiveResponse> = executor.executeWithResponse<InlineV1InvoiceRenderingTemplatesArchivePostRequestFormXcaf9bc6b?, PostInvoiceRenderingTemplatesTemplateArchiveResponse>(SdkExecutionRequest(postInvoiceRenderingTemplatesTemplateArchiveMetadata, baseUri, request, listOf(InvoiceRenderingTemplatesCodecs.POSTINVOICERENDERINGTEMPLATESTEMPLATEARCHIVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "template", values = listOf(template.toString())))
  }), InvoiceRenderingTemplatesCodecs.postInvoiceRenderingTemplatesTemplateArchiveRequestCodecRegistry, PostInvoiceRenderingTemplatesTemplateArchiveResponseDecoder, options)

  /**
   * <p>Unarchive an invoice rendering template so it can be used on new Stripe objects again.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param template Wire parameter `template`.
   * @param options Execution options.
   */
  public suspend fun postInvoiceRenderingTemplatesTemplateUnarchiveWithResponse(
    request: InlineV1InvoiceRenderingTemplatesUnarchivePostRequestFormX6431072c? = null,
    template: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostInvoiceRenderingTemplatesTemplateUnarchiveResponse> = executor.executeWithResponse<InlineV1InvoiceRenderingTemplatesUnarchivePostRequestFormX6431072c?, PostInvoiceRenderingTemplatesTemplateUnarchiveResponse>(SdkExecutionRequest(postInvoiceRenderingTemplatesTemplateUnarchiveMetadata, baseUri, request, listOf(InvoiceRenderingTemplatesCodecs.POSTINVOICERENDERINGTEMPLATESTEMPLATEUNARCHIVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "template", values = listOf(template.toString())))
  }), InvoiceRenderingTemplatesCodecs.postInvoiceRenderingTemplatesTemplateUnarchiveRequestCodecRegistry, PostInvoiceRenderingTemplatesTemplateUnarchiveResponseDecoder, options)

  /**
   * Typed response alternatives for `GetInvoiceRenderingTemplates`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetInvoiceRenderingTemplatesResponse {
    public class SuccessJson(
      public val json: InlineV1InvoiceRenderingTemplatesGetResponse200JsonX6f23f981,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceRenderingTemplatesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceRenderingTemplatesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceRenderingTemplatesResponse
  }

  private object GetInvoiceRenderingTemplatesResponseDecoder : SdkResponseAlternativeDecoder<GetInvoiceRenderingTemplatesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoiceRenderingTemplatesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoiceRenderingTemplatesResponse> = when {
      alternative.id == "GetInvoiceRenderingTemplates.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoiceRenderingTemplatesResponse.SuccessJson(
          json = InvoiceRenderingTemplatesCodecs.getInvoiceRenderingTemplatesResponseCodecAlternative0Registry.select(listOf("GetInvoiceRenderingTemplates.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoiceRenderingTemplates.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoiceRenderingTemplatesResponse.DefaultJson(
          json = InvoiceRenderingTemplatesCodecs.getInvoiceRenderingTemplatesResponseCodecAlternative1Registry.select(listOf("GetInvoiceRenderingTemplates.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetInvoiceRenderingTemplatesResponse = GetInvoiceRenderingTemplatesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetInvoiceRenderingTemplatesTemplate`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetInvoiceRenderingTemplatesTemplateResponse {
    public class SuccessJson(
      public val json: InvoiceRenderingTemplate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceRenderingTemplatesTemplateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceRenderingTemplatesTemplateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetInvoiceRenderingTemplatesTemplateResponse
  }

  private object GetInvoiceRenderingTemplatesTemplateResponseDecoder : SdkResponseAlternativeDecoder<GetInvoiceRenderingTemplatesTemplateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetInvoiceRenderingTemplatesTemplateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetInvoiceRenderingTemplatesTemplateResponse> = when {
      alternative.id == "GetInvoiceRenderingTemplatesTemplate.response.alternative0" -> SdkResponseDecodeResult(
        value = GetInvoiceRenderingTemplatesTemplateResponse.SuccessJson(
          json = InvoiceRenderingTemplatesCodecs.getInvoiceRenderingTemplatesTemplateResponseCodecAlternative0Registry.select(listOf("GetInvoiceRenderingTemplatesTemplate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetInvoiceRenderingTemplatesTemplate.response.alternative1" -> SdkResponseDecodeResult(
        value = GetInvoiceRenderingTemplatesTemplateResponse.DefaultJson(
          json = InvoiceRenderingTemplatesCodecs.getInvoiceRenderingTemplatesTemplateResponseCodecAlternative1Registry.select(listOf("GetInvoiceRenderingTemplatesTemplate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetInvoiceRenderingTemplatesTemplateResponse = GetInvoiceRenderingTemplatesTemplateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoiceRenderingTemplatesTemplateArchive`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostInvoiceRenderingTemplatesTemplateArchiveResponse {
    public class SuccessJson(
      public val json: InvoiceRenderingTemplate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoiceRenderingTemplatesTemplateArchiveResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoiceRenderingTemplatesTemplateArchiveResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoiceRenderingTemplatesTemplateArchiveResponse
  }

  private object PostInvoiceRenderingTemplatesTemplateArchiveResponseDecoder : SdkResponseAlternativeDecoder<PostInvoiceRenderingTemplatesTemplateArchiveResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoiceRenderingTemplatesTemplateArchiveResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoiceRenderingTemplatesTemplateArchiveResponse> = when {
      alternative.id == "PostInvoiceRenderingTemplatesTemplateArchive.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoiceRenderingTemplatesTemplateArchiveResponse.SuccessJson(
          json = InvoiceRenderingTemplatesCodecs.postInvoiceRenderingTemplatesTemplateArchiveResponseCodecAlternative0Registry.select(listOf("PostInvoiceRenderingTemplatesTemplateArchive.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoiceRenderingTemplatesTemplateArchive.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoiceRenderingTemplatesTemplateArchiveResponse.DefaultJson(
          json = InvoiceRenderingTemplatesCodecs.postInvoiceRenderingTemplatesTemplateArchiveResponseCodecAlternative1Registry.select(listOf("PostInvoiceRenderingTemplatesTemplateArchive.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostInvoiceRenderingTemplatesTemplateArchiveResponse = PostInvoiceRenderingTemplatesTemplateArchiveResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostInvoiceRenderingTemplatesTemplateUnarchive`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostInvoiceRenderingTemplatesTemplateUnarchiveResponse {
    public class SuccessJson(
      public val json: InvoiceRenderingTemplate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoiceRenderingTemplatesTemplateUnarchiveResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoiceRenderingTemplatesTemplateUnarchiveResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostInvoiceRenderingTemplatesTemplateUnarchiveResponse
  }

  private object PostInvoiceRenderingTemplatesTemplateUnarchiveResponseDecoder : SdkResponseAlternativeDecoder<PostInvoiceRenderingTemplatesTemplateUnarchiveResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostInvoiceRenderingTemplatesTemplateUnarchiveResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostInvoiceRenderingTemplatesTemplateUnarchiveResponse> = when {
      alternative.id == "PostInvoiceRenderingTemplatesTemplateUnarchive.response.alternative0" -> SdkResponseDecodeResult(
        value = PostInvoiceRenderingTemplatesTemplateUnarchiveResponse.SuccessJson(
          json = InvoiceRenderingTemplatesCodecs.postInvoiceRenderingTemplatesTemplateUnarchiveResponseCodecAlternative0Registry.select(listOf("PostInvoiceRenderingTemplatesTemplateUnarchive.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostInvoiceRenderingTemplatesTemplateUnarchive.response.alternative1" -> SdkResponseDecodeResult(
        value = PostInvoiceRenderingTemplatesTemplateUnarchiveResponse.DefaultJson(
          json = InvoiceRenderingTemplatesCodecs.postInvoiceRenderingTemplatesTemplateUnarchiveResponseCodecAlternative1Registry.select(listOf("PostInvoiceRenderingTemplatesTemplateUnarchive.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostInvoiceRenderingTemplatesTemplateUnarchiveResponse = PostInvoiceRenderingTemplatesTemplateUnarchiveResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getInvoiceRenderingTemplatesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoiceRenderingTemplates",
          method = "GET",
          path = "/v1/invoice_rendering_templates",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1InvoiceRenderingTemplatesGetResponse200JsonX6f23f981",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoiceRenderingTemplates.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoiceRenderingTemplates.response.alternative1",
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

    internal val getInvoiceRenderingTemplatesTemplateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetInvoiceRenderingTemplatesTemplate",
          method = "GET",
          path = "/v1/invoice_rendering_templates/{template}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InvoiceRenderingTemplate",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoiceRenderingTemplatesTemplate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetInvoiceRenderingTemplatesTemplate.response.alternative1",
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

    internal val postInvoiceRenderingTemplatesTemplateArchiveMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoiceRenderingTemplatesTemplateArchive",
          method = "POST",
          path = "/v1/invoice_rendering_templates/{template}/archive",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InvoiceRenderingTemplate",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoiceRenderingTemplatesTemplateArchive.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoiceRenderingTemplatesTemplateArchive.response.alternative1",
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

    internal val postInvoiceRenderingTemplatesTemplateUnarchiveMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostInvoiceRenderingTemplatesTemplateUnarchive",
          method = "POST",
          path = "/v1/invoice_rendering_templates/{template}/unarchive",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InvoiceRenderingTemplate",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoiceRenderingTemplatesTemplateUnarchive.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostInvoiceRenderingTemplatesTemplateUnarchive.response.alternative1",
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
