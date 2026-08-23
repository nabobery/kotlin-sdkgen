package com.nabobery.sdkgen.github.generated.meta

import com.nabobery.sdkgen.github.generated.ApiOverview
import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.Root
import com.nabobery.sdkgen.github.generated.SdkJson
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
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.serializer

internal object MetaCodecs {
  internal const val METAGET_RESPONSE_CODEC_ID: String = "meta/get.response"

  private val metaGetResponseCodec: MediaTypeCodec<ApiOverview> =
      KotlinxSerializationCodec(METAGET_RESPONSE_CODEC_ID, ApiOverview.Serializer, SdkJson)

  private val metaGetResponseCodecAlternative0Codec: MediaTypeCodec<ApiOverview> =
      KotlinxSerializationCodec("meta/get.response.alternative0", ApiOverview.Serializer, SdkJson)

  internal val metaGetResponseCodecAlternative0Registry: MediaTypeCodecRegistry<ApiOverview> =
      MediaTypeCodecRegistry.of(metaGetResponseCodecAlternative0Codec)

  internal val metaGetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val metaGetResponseCodecRegistry: MediaTypeCodecRegistry<ApiOverview> =
      MediaTypeCodecRegistry.of(metaGetResponseCodec)

  internal const val METAGETALLVERSIONS_RESPONSE_CODEC_ID: String = "meta/get-all-versions.response"

  private val metaGetAllVersionsResponseCodec: MediaTypeCodec<List<String>> =
      KotlinxSerializationCodec(METAGETALLVERSIONS_RESPONSE_CODEC_ID, ListSerializer(String.serializer()), SdkJson)

  private val metaGetAllVersionsResponseCodecAlternative0Codec: MediaTypeCodec<List<String>> =
      KotlinxSerializationCodec("meta/get-all-versions.response.alternative0", ListSerializer(String.serializer()), SdkJson)

  internal val metaGetAllVersionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<String>> =
      MediaTypeCodecRegistry.of(metaGetAllVersionsResponseCodecAlternative0Codec)

  private val metaGetAllVersionsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("meta/get-all-versions.response.alternative1", BasicError.Serializer, SdkJson)

  internal val metaGetAllVersionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(metaGetAllVersionsResponseCodecAlternative1Codec)

  internal val metaGetAllVersionsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val metaGetAllVersionsResponseCodecRegistry: MediaTypeCodecRegistry<List<String>> =
      MediaTypeCodecRegistry.of(metaGetAllVersionsResponseCodec)

  internal const val METAGETOCTOCAT_RESPONSE_CODEC_ID: String = "meta/get-octocat.response"

  private val metaGetOctocatResponseCodec: MediaTypeCodec<String> =
      KotlinxSerializationCodec(METAGETOCTOCAT_RESPONSE_CODEC_ID, String.serializer(), SdkJson)

  private val metaGetOctocatResponseCodecAlternative0Codec: MediaTypeCodec<String> =
      KotlinxSerializationCodec("meta/get-octocat.response.alternative0", String.serializer(), SdkJson)

  internal val metaGetOctocatResponseCodecAlternative0Registry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(metaGetOctocatResponseCodecAlternative0Codec)

  internal val metaGetOctocatRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val metaGetOctocatResponseCodecRegistry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(metaGetOctocatResponseCodec)

  internal const val METAGETZEN_RESPONSE_CODEC_ID: String = "meta/get-zen.response"

  private val metaGetZenResponseCodec: MediaTypeCodec<String> =
      KotlinxSerializationCodec(METAGETZEN_RESPONSE_CODEC_ID, String.serializer(), SdkJson)

  private val metaGetZenResponseCodecAlternative0Codec: MediaTypeCodec<String> =
      KotlinxSerializationCodec("meta/get-zen.response.alternative0", String.serializer(), SdkJson)

  internal val metaGetZenResponseCodecAlternative0Registry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(metaGetZenResponseCodecAlternative0Codec)

  internal val metaGetZenRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val metaGetZenResponseCodecRegistry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(metaGetZenResponseCodec)

  internal const val METAROOT_RESPONSE_CODEC_ID: String = "meta/root.response"

  private val metaRootResponseCodec: MediaTypeCodec<Root> =
      KotlinxSerializationCodec(METAROOT_RESPONSE_CODEC_ID, Root.Serializer, SdkJson)

  private val metaRootResponseCodecAlternative0Codec: MediaTypeCodec<Root> =
      KotlinxSerializationCodec("meta/root.response.alternative0", Root.Serializer, SdkJson)

  internal val metaRootResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Root> =
      MediaTypeCodecRegistry.of(metaRootResponseCodecAlternative0Codec)

  internal val metaRootRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val metaRootResponseCodecRegistry: MediaTypeCodecRegistry<Root> =
      MediaTypeCodecRegistry.of(metaRootResponseCodec)
}

/**
 * Client for the 'meta' group of GitHub v3 REST API.
 */
public class MetaClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@MetaClient.authentication)

  /**
   * Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About
   * GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."
   *
   * The API's response also includes a list of GitHub's domain names.
   *
   * The values shown in the documentation's response are example values. You must always query the API directly to get
   * the latest values.
   *
   * > [!NOTE]
   * > This endpoint returns both IPv4 and IPv6 addresses. However, not all features support IPv6. You should refer to
   * the specific documentation for each feature to determine if IPv6 is supported.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MetaGetApiException When the service returns a declared non-success response; its `error` property exposes
   * the decoded MetaGetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun metaGet(options: CallOptions = CallOptions()): ApiOverview = executor.executeWithTypedErrors<Unit, MetaGetResponse, ApiOverview>(
    request = SdkExecutionRequest(metaGetMetadata, baseUri, Unit, emptyList(), emptyList()),
    requestCodecs = MetaCodecs.metaGetRequestCodecRegistry,
    responseDecoder = MetaGetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MetaGetResponse.SuccessJson -> response.json
        is MetaGetResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is MetaGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MetaGetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MetaGetResponse.Http304NoContent -> MetaGetApiException(response, statusCode, headers)
        is MetaGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About
   * GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."
   *
   * The API's response also includes a list of GitHub's domain names.
   *
   * The values shown in the documentation's response are example values. You must always query the API directly to get
   * the latest values.
   *
   * > [!NOTE]
   * > This endpoint returns both IPv4 and IPv6 addresses. However, not all features support IPv6. You should refer to
   * the specific documentation for each feature to determine if IPv6 is supported.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun metaGetWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<MetaGetResponse> = executor.executeWithResponse<Unit, MetaGetResponse>(SdkExecutionRequest(metaGetMetadata, baseUri, Unit, emptyList(), emptyList()), MetaCodecs.metaGetRequestCodecRegistry, MetaGetResponseDecoder, options)

  /**
   * Get all supported GitHub API versions.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MetaGetAllVersionsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MetaGetAllVersionsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun metaGetAllVersions(options: CallOptions = CallOptions()): List<String> = executor.executeWithTypedErrors<Unit, MetaGetAllVersionsResponse, List<String>>(
    request = SdkExecutionRequest(metaGetAllVersionsMetadata, baseUri, Unit, emptyList(), emptyList()),
    requestCodecs = MetaCodecs.metaGetAllVersionsRequestCodecRegistry,
    responseDecoder = MetaGetAllVersionsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MetaGetAllVersionsResponse.SuccessJson -> response.json
        is MetaGetAllVersionsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is MetaGetAllVersionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MetaGetAllVersionsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is MetaGetAllVersionsResponse.Http404Json -> MetaGetAllVersionsApiException(response, statusCode, headers)
        is MetaGetAllVersionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get all supported GitHub API versions.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun metaGetAllVersionsWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<MetaGetAllVersionsResponse> = executor.executeWithResponse<Unit, MetaGetAllVersionsResponse>(SdkExecutionRequest(metaGetAllVersionsMetadata, baseUri, Unit, emptyList(), emptyList()), MetaCodecs.metaGetAllVersionsRequestCodecRegistry, MetaGetAllVersionsResponseDecoder, options)

  /**
   * Get the octocat as ASCII art
   *
   * @param s The words to show in Octocat's speech bubble
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun metaGetOctocat(s: String? = null, options: CallOptions = CallOptions()): String = executor.execute<Unit, String>(SdkExecutionRequest(metaGetOctocatMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "s", values = s?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(MetaCodecs.METAGETOCTOCAT_RESPONSE_CODEC_ID), MetaCodecs.metaGetOctocatRequestCodecRegistry, MetaCodecs.metaGetOctocatResponseCodecRegistry, options)

  /**
   * Get the octocat as ASCII art
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param s The words to show in Octocat's speech bubble
   * @param options Execution options.
   */
  public suspend fun metaGetOctocatWithResponse(s: String? = null, options: CallOptions = CallOptions()): SdkResponseResult<MetaGetOctocatResponse> = executor.executeWithResponse<Unit, MetaGetOctocatResponse>(SdkExecutionRequest(metaGetOctocatMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "s", values = s?.let { listOf(it.toString()) }.orEmpty()))
  }), MetaCodecs.metaGetOctocatRequestCodecRegistry, MetaGetOctocatResponseDecoder, options)

  /**
   * Get a random sentence from the Zen of GitHub
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun metaGetZen(options: CallOptions = CallOptions()): String = executor.execute<Unit, String>(SdkExecutionRequest(metaGetZenMetadata, baseUri, Unit, emptyList(), emptyList()), listOf(MetaCodecs.METAGETZEN_RESPONSE_CODEC_ID), MetaCodecs.metaGetZenRequestCodecRegistry, MetaCodecs.metaGetZenResponseCodecRegistry, options)

  /**
   * Get a random sentence from the Zen of GitHub
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun metaGetZenWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<MetaGetZenResponse> = executor.executeWithResponse<Unit, MetaGetZenResponse>(SdkExecutionRequest(metaGetZenMetadata, baseUri, Unit, emptyList(), emptyList()), MetaCodecs.metaGetZenRequestCodecRegistry, MetaGetZenResponseDecoder, options)

  /**
   * Get Hypermedia links to resources accessible in GitHub's REST API
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun metaRoot(options: CallOptions = CallOptions()): Root = executor.execute<Unit, Root>(SdkExecutionRequest(metaRootMetadata, baseUri, Unit, emptyList(), emptyList()), listOf(MetaCodecs.METAROOT_RESPONSE_CODEC_ID), MetaCodecs.metaRootRequestCodecRegistry, MetaCodecs.metaRootResponseCodecRegistry, options)

  /**
   * Get Hypermedia links to resources accessible in GitHub's REST API
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun metaRootWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<MetaRootResponse> = executor.executeWithResponse<Unit, MetaRootResponse>(SdkExecutionRequest(metaRootMetadata, baseUri, Unit, emptyList(), emptyList()), MetaCodecs.metaRootRequestCodecRegistry, MetaRootResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `meta/get` may expose through its typed API exception.
   */
  public sealed interface MetaGetError

  /**
   * Typed response alternatives for `meta/get`. Non-success alternatives are not converted into success values.
   */
  public sealed interface MetaGetResponse {
    public class SuccessJson(
      public val json: ApiOverview,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetResponse,
        MetaGetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetResponse
  }

  /**
   * Raised by `meta/get` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class MetaGetApiException(
    public val error: MetaGetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "meta/get")

  private object MetaGetResponseDecoder : SdkResponseAlternativeDecoder<MetaGetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MetaGetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MetaGetResponse> = when {
      alternative.id == "meta/get.response.alternative0" -> SdkResponseDecodeResult(
        value = MetaGetResponse.SuccessJson(
          json = MetaCodecs.metaGetResponseCodecAlternative0Registry.select(listOf("meta/get.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "meta/get.response.alternative1" -> SdkResponseDecodeResult(
        value = MetaGetResponse.Http304NoContent(
          unit = Unit,
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
    ): MetaGetResponse = MetaGetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `meta/get-all-versions` may expose through its typed API exception.
   */
  public sealed interface MetaGetAllVersionsError

  /**
   * Typed response alternatives for `meta/get-all-versions`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface MetaGetAllVersionsResponse {
    public class SuccessJson(
      public val json: List<String>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetAllVersionsResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetAllVersionsResponse,
        MetaGetAllVersionsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetAllVersionsResponse
  }

  /**
   * Raised by `meta/get-all-versions` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class MetaGetAllVersionsApiException(
    public val error: MetaGetAllVersionsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "meta/get-all-versions")

  private object MetaGetAllVersionsResponseDecoder : SdkResponseAlternativeDecoder<MetaGetAllVersionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MetaGetAllVersionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MetaGetAllVersionsResponse> = when {
      alternative.id == "meta/get-all-versions.response.alternative0" -> SdkResponseDecodeResult(
        value = MetaGetAllVersionsResponse.SuccessJson(
          json = MetaCodecs.metaGetAllVersionsResponseCodecAlternative0Registry.select(listOf("meta/get-all-versions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "meta/get-all-versions.response.alternative1" -> SdkResponseDecodeResult(
        value = MetaGetAllVersionsResponse.Http404Json(
          json = MetaCodecs.metaGetAllVersionsResponseCodecAlternative1Registry.select(listOf("meta/get-all-versions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MetaGetAllVersionsResponse = MetaGetAllVersionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `meta/get-octocat`. Non-success alternatives are not converted into success values.
   */
  public sealed interface MetaGetOctocatResponse {
    public class SuccessOctocatStream(
      public val octocatStream: String,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetOctocatResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetOctocatResponse
  }

  private object MetaGetOctocatResponseDecoder : SdkResponseAlternativeDecoder<MetaGetOctocatResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MetaGetOctocatResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MetaGetOctocatResponse> = when {
      alternative.id == "meta/get-octocat.response.alternative0" -> SdkResponseDecodeResult(
        value = MetaGetOctocatResponse.SuccessOctocatStream(
          octocatStream = MetaCodecs.metaGetOctocatResponseCodecAlternative0Registry.select(listOf("meta/get-octocat.response.alternative0"), mediaType ?: "application/octocat-stream").decode(body, mediaType ?: "application/octocat-stream"),
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
    ): MetaGetOctocatResponse = MetaGetOctocatResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `meta/get-zen`. Non-success alternatives are not converted into success values.
   */
  public sealed interface MetaGetZenResponse {
    public class SuccessPlain(
      public val text: String,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetZenResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaGetZenResponse
  }

  private object MetaGetZenResponseDecoder : SdkResponseAlternativeDecoder<MetaGetZenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MetaGetZenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MetaGetZenResponse> = when {
      alternative.id == "meta/get-zen.response.alternative0" -> SdkResponseDecodeResult(
        value = MetaGetZenResponse.SuccessPlain(
          text = MetaCodecs.metaGetZenResponseCodecAlternative0Registry.select(listOf("meta/get-zen.response.alternative0"), mediaType ?: "text/plain").decode(body, mediaType ?: "text/plain"),
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
    ): MetaGetZenResponse = MetaGetZenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `meta/root`. Non-success alternatives are not converted into success values.
   */
  public sealed interface MetaRootResponse {
    public class SuccessJson(
      public val json: Root,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaRootResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MetaRootResponse
  }

  private object MetaRootResponseDecoder : SdkResponseAlternativeDecoder<MetaRootResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MetaRootResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MetaRootResponse> = when {
      alternative.id == "meta/root.response.alternative0" -> SdkResponseDecodeResult(
        value = MetaRootResponse.SuccessJson(
          json = MetaCodecs.metaRootResponseCodecAlternative0Registry.select(listOf("meta/root.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): MetaRootResponse = MetaRootResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val metaGetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "meta/get",
          method = "GET",
          path = "/meta",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ApiOverview",
              mode = SdkResponseMode.BUFFERED,
              id = "meta/get.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "meta/get.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    internal val metaGetAllVersionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "meta/get-all-versions",
          method = "GET",
          path = "/versions",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "meta/get-all-versions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "meta/get-all-versions.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    internal val metaGetOctocatMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "meta/get-octocat",
          method = "GET",
          path = "/octocat",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/octocat-stream"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/octocat-stream"),
              typeTag = "String",
              mode = SdkResponseMode.BUFFERED,
              id = "meta/get-octocat.response.alternative0",
            ),
          ),
          security = emptyList(),
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

    internal val metaGetZenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "meta/get-zen",
          method = "GET",
          path = "/zen",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("text/plain"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("text/plain"),
              typeTag = "String",
              mode = SdkResponseMode.BUFFERED,
              id = "meta/get-zen.response.alternative0",
            ),
          ),
          security = emptyList(),
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

    internal val metaRootMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "meta/root",
          method = "GET",
          path = "/",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Root",
              mode = SdkResponseMode.BUFFERED,
              id = "meta/root.response.alternative0",
            ),
          ),
          security = emptyList(),
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
