package com.nabobery.sdkgen.github.generated.licenses

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.License
import com.nabobery.sdkgen.github.generated.LicenseContent
import com.nabobery.sdkgen.github.generated.LicenseSimple
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
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

public object LicensesCodecs {
  public const val LICENSESGET_RESPONSE_CODEC_ID: String = "licenses/get.response"

  private val licensesGetResponseCodec: MediaTypeCodec<License> =
      KotlinxSerializationCodec(LICENSESGET_RESPONSE_CODEC_ID, License.Serializer, SdkJson)

  private val licensesGetResponseCodecAlternative0Codec: MediaTypeCodec<License> =
      KotlinxSerializationCodec("licenses/get.response.alternative0", License.Serializer, SdkJson)

  public val licensesGetResponseCodecAlternative0Registry: MediaTypeCodecRegistry<License> =
      MediaTypeCodecRegistry.of(licensesGetResponseCodecAlternative0Codec)

  private val licensesGetResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("licenses/get.response.alternative2", BasicError.Serializer, SdkJson)

  public val licensesGetResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(licensesGetResponseCodecAlternative2Codec)

  private val licensesGetResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("licenses/get.response.alternative3", BasicError.Serializer, SdkJson)

  public val licensesGetResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(licensesGetResponseCodecAlternative3Codec)

  public val licensesGetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val licensesGetResponseCodecRegistry: MediaTypeCodecRegistry<License> =
      MediaTypeCodecRegistry.of(licensesGetResponseCodec)

  public const val LICENSESGETALLCOMMONLYUSED_RESPONSE_CODEC_ID: String =
      "licenses/get-all-commonly-used.response"

  private val licensesGetAllCommonlyUsedResponseCodec: MediaTypeCodec<List<LicenseSimple>> =
      KotlinxSerializationCodec(LICENSESGETALLCOMMONLYUSED_RESPONSE_CODEC_ID, ListSerializer(LicenseSimple.Serializer), SdkJson)

  private val licensesGetAllCommonlyUsedResponseCodecAlternative0Codec:
      MediaTypeCodec<List<LicenseSimple>> =
      KotlinxSerializationCodec("licenses/get-all-commonly-used.response.alternative0", ListSerializer(LicenseSimple.Serializer), SdkJson)

  public val licensesGetAllCommonlyUsedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<LicenseSimple>> =
      MediaTypeCodecRegistry.of(licensesGetAllCommonlyUsedResponseCodecAlternative0Codec)

  public val licensesGetAllCommonlyUsedRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val licensesGetAllCommonlyUsedResponseCodecRegistry:
      MediaTypeCodecRegistry<List<LicenseSimple>> =
      MediaTypeCodecRegistry.of(licensesGetAllCommonlyUsedResponseCodec)

  public const val LICENSESGETFORREPO_RESPONSE_CODEC_ID: String = "licenses/get-for-repo.response"

  private val licensesGetForRepoResponseCodec: MediaTypeCodec<LicenseContent> =
      KotlinxSerializationCodec(LICENSESGETFORREPO_RESPONSE_CODEC_ID, LicenseContent.Serializer, SdkJson)

  private val licensesGetForRepoResponseCodecAlternative0Codec: MediaTypeCodec<LicenseContent> =
      KotlinxSerializationCodec("licenses/get-for-repo.response.alternative0", LicenseContent.Serializer, SdkJson)

  public val licensesGetForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<LicenseContent> =
      MediaTypeCodecRegistry.of(licensesGetForRepoResponseCodecAlternative0Codec)

  private val licensesGetForRepoResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("licenses/get-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  public val licensesGetForRepoResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(licensesGetForRepoResponseCodecAlternative1Codec)

  public val licensesGetForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val licensesGetForRepoResponseCodecRegistry: MediaTypeCodecRegistry<LicenseContent> =
      MediaTypeCodecRegistry.of(licensesGetForRepoResponseCodec)
}

/**
 * Client for the 'licenses' group of GitHub v3 REST API.
 */
public class LicensesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@LicensesClient.authentication)

  /**
   * Gets information about a specific license. For more information, see "[Licensing a repository
   * ](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/
   * licensing-a-repository)."
   *
   * @param license Wire parameter `license`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws LicensesGetApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded LicensesGetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun licensesGet(license: String, options: CallOptions = CallOptions()): License = executor.executeWithTypedErrors<Unit, LicensesGetResponse, License>(
    request = SdkExecutionRequest(licensesGetMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "license", values = listOf(license.toString())))
    }),
    requestCodecs = LicensesCodecs.licensesGetRequestCodecRegistry,
    responseDecoder = LicensesGetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is LicensesGetResponse.SuccessJson -> response.json
        is LicensesGetResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is LicensesGetResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is LicensesGetResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is LicensesGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is LicensesGetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is LicensesGetResponse.Http304NoContent -> LicensesGetApiException(response, statusCode, headers)
        is LicensesGetResponse.Http403Json -> LicensesGetApiException(response, statusCode, headers)
        is LicensesGetResponse.Http404Json -> LicensesGetApiException(response, statusCode, headers)
        is LicensesGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets information about a specific license. For more information, see "[Licensing a repository
   * ](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/
   * licensing-a-repository)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param license Wire parameter `license`.
   * @param options Execution options.
   */
  public suspend fun licensesGetWithResponse(license: String, options: CallOptions = CallOptions()): SdkResponseResult<LicensesGetResponse> = executor.executeWithResponse<Unit, LicensesGetResponse>(SdkExecutionRequest(licensesGetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "license", values = listOf(license.toString())))
  }), LicensesCodecs.licensesGetRequestCodecRegistry, LicensesGetResponseDecoder, options)

  /**
   * Lists the most commonly used licenses on GitHub. For more information, see "[Licensing a repository
   * ](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/
   * licensing-a-repository)."
   *
   * @param featured Wire parameter `featured`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws LicensesGetAllCommonlyUsedApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded LicensesGetAllCommonlyUsedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun licensesGetAllCommonlyUsed(
    featured: Boolean? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<LicenseSimple> = executor.executeWithTypedErrors<Unit, LicensesGetAllCommonlyUsedResponse, List<LicenseSimple>>(
    request = SdkExecutionRequest(licensesGetAllCommonlyUsedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "featured", values = featured?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = LicensesCodecs.licensesGetAllCommonlyUsedRequestCodecRegistry,
    responseDecoder = LicensesGetAllCommonlyUsedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is LicensesGetAllCommonlyUsedResponse.SuccessJson -> response.json
        is LicensesGetAllCommonlyUsedResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is LicensesGetAllCommonlyUsedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is LicensesGetAllCommonlyUsedResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is LicensesGetAllCommonlyUsedResponse.Http304NoContent -> LicensesGetAllCommonlyUsedApiException(response, statusCode, headers)
        is LicensesGetAllCommonlyUsedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the most commonly used licenses on GitHub. For more information, see "[Licensing a repository
   * ](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/customizing-your-repository/
   * licensing-a-repository)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param featured Wire parameter `featured`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun licensesGetAllCommonlyUsedWithResponse(
    featured: Boolean? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<LicensesGetAllCommonlyUsedResponse> = executor.executeWithResponse<Unit, LicensesGetAllCommonlyUsedResponse>(SdkExecutionRequest(licensesGetAllCommonlyUsedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "featured", values = featured?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), LicensesCodecs.licensesGetAllCommonlyUsedRequestCodecRegistry, LicensesGetAllCommonlyUsedResponseDecoder, options)

  /**
   * This method returns the contents of the repository's license file, if one is detected.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw contents of the license.
   * - **`application/vnd.github.html+json`**: Returns the license contents in HTML. Markup languages are rendered to
   * HTML using GitHub's open-source [Markup library](https://github.com/github/markup).
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param ref The Git reference for the results you want to list. The `ref` for a branch can be formatted either as
   * `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws LicensesGetForRepoApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded LicensesGetForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun licensesGetForRepo(
    owner: String,
    repo: String,
    ref: String? = null,
    options: CallOptions = CallOptions(),
  ): LicenseContent = executor.executeWithTypedErrors<Unit, LicensesGetForRepoResponse, LicenseContent>(
    request = SdkExecutionRequest(licensesGetForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = LicensesCodecs.licensesGetForRepoRequestCodecRegistry,
    responseDecoder = LicensesGetForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is LicensesGetForRepoResponse.SuccessJson -> response.json
        is LicensesGetForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is LicensesGetForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is LicensesGetForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is LicensesGetForRepoResponse.Http404Json -> LicensesGetForRepoApiException(response, statusCode, headers)
        is LicensesGetForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * This method returns the contents of the repository's license file, if one is detected.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw contents of the license.
   * - **`application/vnd.github.html+json`**: Returns the license contents in HTML. Markup languages are rendered to
   * HTML using GitHub's open-source [Markup library](https://github.com/github/markup).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param ref The Git reference for the results you want to list. The `ref` for a branch can be formatted either as
   * `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
   * @param options Execution options.
   */
  public suspend fun licensesGetForRepoWithResponse(
    owner: String,
    repo: String,
    ref: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<LicensesGetForRepoResponse> = executor.executeWithResponse<Unit, LicensesGetForRepoResponse>(SdkExecutionRequest(licensesGetForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
  }), LicensesCodecs.licensesGetForRepoRequestCodecRegistry, LicensesGetForRepoResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `licenses/get` may expose through its typed API exception.
   */
  public sealed interface LicensesGetError

  /**
   * Typed response alternatives for `licenses/get`. Non-success alternatives are not converted into success values.
   */
  public sealed interface LicensesGetResponse {
    public class SuccessJson(
      public val json: License,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetResponse,
        LicensesGetError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetResponse,
        LicensesGetError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetResponse,
        LicensesGetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetResponse
  }

  /**
   * Raised by `licenses/get` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class LicensesGetApiException(
    public val error: LicensesGetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "licenses/get")

  private object LicensesGetResponseDecoder : SdkResponseAlternativeDecoder<LicensesGetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): LicensesGetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<LicensesGetResponse> = when {
      alternative.id == "licenses/get.response.alternative0" -> SdkResponseDecodeResult(
        value = LicensesGetResponse.SuccessJson(
          json = LicensesCodecs.licensesGetResponseCodecAlternative0Registry.select(listOf("licenses/get.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "licenses/get.response.alternative1" -> SdkResponseDecodeResult(
        value = LicensesGetResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "licenses/get.response.alternative2" -> SdkResponseDecodeResult(
        value = LicensesGetResponse.Http403Json(
          json = LicensesCodecs.licensesGetResponseCodecAlternative2Registry.select(listOf("licenses/get.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "licenses/get.response.alternative3" -> SdkResponseDecodeResult(
        value = LicensesGetResponse.Http404Json(
          json = LicensesCodecs.licensesGetResponseCodecAlternative3Registry.select(listOf("licenses/get.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): LicensesGetResponse = LicensesGetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `licenses/get-all-commonly-used` may expose through its typed API
   * exception.
   */
  public sealed interface LicensesGetAllCommonlyUsedError

  /**
   * Typed response alternatives for `licenses/get-all-commonly-used`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface LicensesGetAllCommonlyUsedResponse {
    public class SuccessJson(
      public val json: List<LicenseSimple>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetAllCommonlyUsedResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetAllCommonlyUsedResponse,
        LicensesGetAllCommonlyUsedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetAllCommonlyUsedResponse
  }

  /**
   * Raised by `licenses/get-all-commonly-used` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class LicensesGetAllCommonlyUsedApiException(
    public val error: LicensesGetAllCommonlyUsedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "licenses/get-all-commonly-used")

  private object LicensesGetAllCommonlyUsedResponseDecoder : SdkResponseAlternativeDecoder<LicensesGetAllCommonlyUsedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): LicensesGetAllCommonlyUsedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<LicensesGetAllCommonlyUsedResponse> = when {
      alternative.id == "licenses/get-all-commonly-used.response.alternative0" -> SdkResponseDecodeResult(
        value = LicensesGetAllCommonlyUsedResponse.SuccessJson(
          json = LicensesCodecs.licensesGetAllCommonlyUsedResponseCodecAlternative0Registry.select(listOf("licenses/get-all-commonly-used.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "licenses/get-all-commonly-used.response.alternative1" -> SdkResponseDecodeResult(
        value = LicensesGetAllCommonlyUsedResponse.Http304NoContent(
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
    ): LicensesGetAllCommonlyUsedResponse = LicensesGetAllCommonlyUsedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `licenses/get-for-repo` may expose through its typed API exception.
   */
  public sealed interface LicensesGetForRepoError

  /**
   * Typed response alternatives for `licenses/get-for-repo`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface LicensesGetForRepoResponse {
    public class SuccessJson(
      public val json: LicenseContent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetForRepoResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetForRepoResponse,
        LicensesGetForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : LicensesGetForRepoResponse
  }

  /**
   * Raised by `licenses/get-for-repo` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class LicensesGetForRepoApiException(
    public val error: LicensesGetForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "licenses/get-for-repo")

  private object LicensesGetForRepoResponseDecoder : SdkResponseAlternativeDecoder<LicensesGetForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): LicensesGetForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<LicensesGetForRepoResponse> = when {
      alternative.id == "licenses/get-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = LicensesGetForRepoResponse.SuccessJson(
          json = LicensesCodecs.licensesGetForRepoResponseCodecAlternative0Registry.select(listOf("licenses/get-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "licenses/get-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = LicensesGetForRepoResponse.Http404Json(
          json = LicensesCodecs.licensesGetForRepoResponseCodecAlternative1Registry.select(listOf("licenses/get-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): LicensesGetForRepoResponse = LicensesGetForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val licensesGetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "licenses/get",
          method = "GET",
          path = "/licenses/{license}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "License",
              mode = SdkResponseMode.BUFFERED,
              id = "licenses/get.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "licenses/get.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "licenses/get.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "licenses/get.response.alternative3",
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

    public val licensesGetAllCommonlyUsedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "licenses/get-all-commonly-used",
          method = "GET",
          path = "/licenses",
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
              id = "licenses/get-all-commonly-used.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "licenses/get-all-commonly-used.response.alternative1",
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

    public val licensesGetForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "licenses/get-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/license",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "LicenseContent",
              mode = SdkResponseMode.BUFFERED,
              id = "licenses/get-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "licenses/get-for-repo.response.alternative1",
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
