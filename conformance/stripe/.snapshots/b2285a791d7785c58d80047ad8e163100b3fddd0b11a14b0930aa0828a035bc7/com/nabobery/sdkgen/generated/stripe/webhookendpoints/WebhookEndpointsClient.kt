package com.nabobery.sdkgen.generated.stripe.webhookendpoints

import com.nabobery.sdkgen.generated.stripe.DeletedWebhookEndpoint
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1WebhookEndpointsGetResponse200JsonXaefba60a
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.WebhookEndpoint
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

public object WebhookEndpointsCodecs {
  public const val DELETEWEBHOOKENDPOINTSWEBHOOKENDPOINT_REQUEST_CODEC_ID: String =
      "DeleteWebhookEndpointsWebhookEndpoint.request"

  private val deleteWebhookEndpointsWebhookEndpointRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteWebhookEndpointsWebhookEndpointFormCodec

  private val deleteWebhookEndpointsWebhookEndpointResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedWebhookEndpoint> =
      KotlinxSerializationCodec("DeleteWebhookEndpointsWebhookEndpoint.response.alternative0", DeletedWebhookEndpoint.Serializer, SdkJson)

  public val deleteWebhookEndpointsWebhookEndpointResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedWebhookEndpoint> =
      MediaTypeCodecRegistry.of(deleteWebhookEndpointsWebhookEndpointResponseCodecAlternative0Codec)

  private val deleteWebhookEndpointsWebhookEndpointResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteWebhookEndpointsWebhookEndpoint.response.alternative1", Error.Serializer, SdkJson)

  public val deleteWebhookEndpointsWebhookEndpointResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteWebhookEndpointsWebhookEndpointResponseCodecAlternative1Codec)

  public val deleteWebhookEndpointsWebhookEndpointRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteWebhookEndpointsWebhookEndpointRequestCodec)

  public const val GETWEBHOOKENDPOINTS_REQUEST_CODEC_ID: String = "GetWebhookEndpoints.request"

  private val getWebhookEndpointsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetWebhookEndpointsFormCodec

  private val getWebhookEndpointsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1WebhookEndpointsGetResponse200JsonXaefba60a> =
      KotlinxSerializationCodec("GetWebhookEndpoints.response.alternative0", InlineV1WebhookEndpointsGetResponse200JsonXaefba60a.Serializer, SdkJson)

  public val getWebhookEndpointsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1WebhookEndpointsGetResponse200JsonXaefba60a> =
      MediaTypeCodecRegistry.of(getWebhookEndpointsResponseCodecAlternative0Codec)

  private val getWebhookEndpointsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetWebhookEndpoints.response.alternative1", Error.Serializer, SdkJson)

  public val getWebhookEndpointsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getWebhookEndpointsResponseCodecAlternative1Codec)

  public val getWebhookEndpointsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getWebhookEndpointsRequestCodec)

  public const val GETWEBHOOKENDPOINTSWEBHOOKENDPOINT_REQUEST_CODEC_ID: String =
      "GetWebhookEndpointsWebhookEndpoint.request"

  private val getWebhookEndpointsWebhookEndpointRequestCodec: MediaTypeCodec<JsonObject?> =
      GetWebhookEndpointsWebhookEndpointFormCodec

  private val getWebhookEndpointsWebhookEndpointResponseCodecAlternative0Codec:
      MediaTypeCodec<WebhookEndpoint> =
      KotlinxSerializationCodec("GetWebhookEndpointsWebhookEndpoint.response.alternative0", WebhookEndpoint.Serializer, SdkJson)

  public val getWebhookEndpointsWebhookEndpointResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<WebhookEndpoint> =
      MediaTypeCodecRegistry.of(getWebhookEndpointsWebhookEndpointResponseCodecAlternative0Codec)

  private val getWebhookEndpointsWebhookEndpointResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetWebhookEndpointsWebhookEndpoint.response.alternative1", Error.Serializer, SdkJson)

  public val getWebhookEndpointsWebhookEndpointResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getWebhookEndpointsWebhookEndpointResponseCodecAlternative1Codec)

  public val getWebhookEndpointsWebhookEndpointRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getWebhookEndpointsWebhookEndpointRequestCodec)

  public object DeleteWebhookEndpointsWebhookEndpointFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteWebhookEndpointsWebhookEndpoint.request"

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

  public object GetWebhookEndpointsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetWebhookEndpoints.request"

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

  public object GetWebhookEndpointsWebhookEndpointFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetWebhookEndpointsWebhookEndpoint.request"

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
}

/**
 * Client for the 'webhook_endpoints' group of Stripe API.
 */
public class WebhookEndpointsClient(
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
      SdkExecutor(transport, authentication = this@WebhookEndpointsClient.authentication)

  /**
   * <p>You can also delete webhook endpoints via the <a href="https://dashboard.stripe.com/account/webhooks">webhook
   * endpoint management</a> page of the Stripe dashboard.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param webhookEndpoint Wire parameter `webhook_endpoint`.
   * @param options Execution options.
   */
  public suspend fun deleteWebhookEndpointsWebhookEndpointWithResponse(
    request: JsonObject? = null,
    webhookEndpoint: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteWebhookEndpointsWebhookEndpointResponse> = executor.executeWithResponse<JsonObject?, DeleteWebhookEndpointsWebhookEndpointResponse>(SdkExecutionRequest(deleteWebhookEndpointsWebhookEndpointMetadata, baseUri, request, listOf(WebhookEndpointsCodecs.DELETEWEBHOOKENDPOINTSWEBHOOKENDPOINT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "webhook_endpoint", values = listOf(webhookEndpoint.toString())))
  }), WebhookEndpointsCodecs.deleteWebhookEndpointsWebhookEndpointRequestCodecRegistry, DeleteWebhookEndpointsWebhookEndpointResponseDecoder, options)

  /**
   * <p>Returns a list of your webhook endpoints.</p>
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
   * @param options Execution options.
   */
  public suspend fun getWebhookEndpointsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetWebhookEndpointsResponse> = executor.executeWithResponse<JsonObject?, GetWebhookEndpointsResponse>(SdkExecutionRequest(getWebhookEndpointsMetadata, baseUri, request, listOf(WebhookEndpointsCodecs.GETWEBHOOKENDPOINTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), WebhookEndpointsCodecs.getWebhookEndpointsRequestCodecRegistry, GetWebhookEndpointsResponseDecoder, options)

  /**
   * <p>Retrieves the webhook endpoint with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param webhookEndpoint Wire parameter `webhook_endpoint`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getWebhookEndpointsWebhookEndpointWithResponse(
    request: JsonObject? = null,
    webhookEndpoint: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetWebhookEndpointsWebhookEndpointResponse> = executor.executeWithResponse<JsonObject?, GetWebhookEndpointsWebhookEndpointResponse>(SdkExecutionRequest(getWebhookEndpointsWebhookEndpointMetadata, baseUri, request, listOf(WebhookEndpointsCodecs.GETWEBHOOKENDPOINTSWEBHOOKENDPOINT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "webhook_endpoint", values = listOf(webhookEndpoint.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), WebhookEndpointsCodecs.getWebhookEndpointsWebhookEndpointRequestCodecRegistry, GetWebhookEndpointsWebhookEndpointResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteWebhookEndpointsWebhookEndpoint`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DeleteWebhookEndpointsWebhookEndpointResponse {
    public class SuccessJson(
      public val json: DeletedWebhookEndpoint,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWebhookEndpointsWebhookEndpointResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWebhookEndpointsWebhookEndpointResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWebhookEndpointsWebhookEndpointResponse
  }

  private object DeleteWebhookEndpointsWebhookEndpointResponseDecoder : SdkResponseAlternativeDecoder<DeleteWebhookEndpointsWebhookEndpointResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteWebhookEndpointsWebhookEndpointResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteWebhookEndpointsWebhookEndpointResponse> = when {
      alternative.id == "DeleteWebhookEndpointsWebhookEndpoint.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteWebhookEndpointsWebhookEndpointResponse.SuccessJson(
          json = WebhookEndpointsCodecs.deleteWebhookEndpointsWebhookEndpointResponseCodecAlternative0Registry.select(listOf("DeleteWebhookEndpointsWebhookEndpoint.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteWebhookEndpointsWebhookEndpoint.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteWebhookEndpointsWebhookEndpointResponse.DefaultJson(
          json = WebhookEndpointsCodecs.deleteWebhookEndpointsWebhookEndpointResponseCodecAlternative1Registry.select(listOf("DeleteWebhookEndpointsWebhookEndpoint.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteWebhookEndpointsWebhookEndpointResponse = DeleteWebhookEndpointsWebhookEndpointResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetWebhookEndpoints`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetWebhookEndpointsResponse {
    public class SuccessJson(
      public val json: InlineV1WebhookEndpointsGetResponse200JsonXaefba60a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWebhookEndpointsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWebhookEndpointsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWebhookEndpointsResponse
  }

  private object GetWebhookEndpointsResponseDecoder : SdkResponseAlternativeDecoder<GetWebhookEndpointsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetWebhookEndpointsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetWebhookEndpointsResponse> = when {
      alternative.id == "GetWebhookEndpoints.response.alternative0" -> SdkResponseDecodeResult(
        value = GetWebhookEndpointsResponse.SuccessJson(
          json = WebhookEndpointsCodecs.getWebhookEndpointsResponseCodecAlternative0Registry.select(listOf("GetWebhookEndpoints.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetWebhookEndpoints.response.alternative1" -> SdkResponseDecodeResult(
        value = GetWebhookEndpointsResponse.DefaultJson(
          json = WebhookEndpointsCodecs.getWebhookEndpointsResponseCodecAlternative1Registry.select(listOf("GetWebhookEndpoints.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetWebhookEndpointsResponse = GetWebhookEndpointsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetWebhookEndpointsWebhookEndpoint`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetWebhookEndpointsWebhookEndpointResponse {
    public class SuccessJson(
      public val json: WebhookEndpoint,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWebhookEndpointsWebhookEndpointResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWebhookEndpointsWebhookEndpointResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWebhookEndpointsWebhookEndpointResponse
  }

  private object GetWebhookEndpointsWebhookEndpointResponseDecoder : SdkResponseAlternativeDecoder<GetWebhookEndpointsWebhookEndpointResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetWebhookEndpointsWebhookEndpointResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetWebhookEndpointsWebhookEndpointResponse> = when {
      alternative.id == "GetWebhookEndpointsWebhookEndpoint.response.alternative0" -> SdkResponseDecodeResult(
        value = GetWebhookEndpointsWebhookEndpointResponse.SuccessJson(
          json = WebhookEndpointsCodecs.getWebhookEndpointsWebhookEndpointResponseCodecAlternative0Registry.select(listOf("GetWebhookEndpointsWebhookEndpoint.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetWebhookEndpointsWebhookEndpoint.response.alternative1" -> SdkResponseDecodeResult(
        value = GetWebhookEndpointsWebhookEndpointResponse.DefaultJson(
          json = WebhookEndpointsCodecs.getWebhookEndpointsWebhookEndpointResponseCodecAlternative1Registry.select(listOf("GetWebhookEndpointsWebhookEndpoint.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetWebhookEndpointsWebhookEndpointResponse = GetWebhookEndpointsWebhookEndpointResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val deleteWebhookEndpointsWebhookEndpointMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteWebhookEndpointsWebhookEndpoint",
          method = "DELETE",
          path = "/v1/webhook_endpoints/{webhook_endpoint}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedWebhookEndpoint",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteWebhookEndpointsWebhookEndpoint.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteWebhookEndpointsWebhookEndpoint.response.alternative1",
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

    public val getWebhookEndpointsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetWebhookEndpoints",
          method = "GET",
          path = "/v1/webhook_endpoints",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1WebhookEndpointsGetResponse200JsonXaefba60a",
              mode = SdkResponseMode.BUFFERED,
              id = "GetWebhookEndpoints.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetWebhookEndpoints.response.alternative1",
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

    public val getWebhookEndpointsWebhookEndpointMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetWebhookEndpointsWebhookEndpoint",
          method = "GET",
          path = "/v1/webhook_endpoints/{webhook_endpoint}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "WebhookEndpoint",
              mode = SdkResponseMode.BUFFERED,
              id = "GetWebhookEndpointsWebhookEndpoint.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetWebhookEndpointsWebhookEndpoint.response.alternative1",
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
  }
}
