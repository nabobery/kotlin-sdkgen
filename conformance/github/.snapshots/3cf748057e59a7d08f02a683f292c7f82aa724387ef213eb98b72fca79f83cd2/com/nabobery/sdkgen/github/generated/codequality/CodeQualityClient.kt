package com.nabobery.sdkgen.github.generated.codequality

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.CodeQualityFinding
import com.nabobery.sdkgen.github.generated.CodeQualitySetup
import com.nabobery.sdkgen.github.generated.CodeQualitySetupUpdate
import com.nabobery.sdkgen.github.generated.CodeQualitySetupUpdateResponse
import com.nabobery.sdkgen.github.generated.InlineDirectionParameterX3053723f
import com.nabobery.sdkgen.github.generated.InlineReposCodeQualityFindingsGetParameterXcc6159d8
import com.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.JsonObject

public object CodeQualityCodecs {
  public const val CODEQUALITYGETFINDING_RESPONSE_CODEC_ID: String =
      "code-quality/get-finding.response"

  private val codeQualityGetFindingResponseCodec: MediaTypeCodec<CodeQualityFinding> =
      KotlinxSerializationCodec(CODEQUALITYGETFINDING_RESPONSE_CODEC_ID, CodeQualityFinding.Serializer, SdkJson)

  private val codeQualityGetFindingResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeQualityFinding> =
      KotlinxSerializationCodec("code-quality/get-finding.response.alternative0", CodeQualityFinding.Serializer, SdkJson)

  public val codeQualityGetFindingResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeQualityFinding> =
      MediaTypeCodecRegistry.of(codeQualityGetFindingResponseCodecAlternative0Codec)

  private val codeQualityGetFindingResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/get-finding.response.alternative1", BasicError.Serializer, SdkJson)

  public val codeQualityGetFindingResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityGetFindingResponseCodecAlternative1Codec)

  private val codeQualityGetFindingResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/get-finding.response.alternative2", BasicError.Serializer, SdkJson)

  public val codeQualityGetFindingResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityGetFindingResponseCodecAlternative2Codec)

  private val codeQualityGetFindingResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-quality/get-finding.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val codeQualityGetFindingResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeQualityGetFindingResponseCodecAlternative3Codec)

  public val codeQualityGetFindingRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val codeQualityGetFindingResponseCodecRegistry: MediaTypeCodecRegistry<CodeQualityFinding>
      = MediaTypeCodecRegistry.of(codeQualityGetFindingResponseCodec)

  public const val CODEQUALITYGETSETUP_RESPONSE_CODEC_ID: String = "code-quality/get-setup.response"

  private val codeQualityGetSetupResponseCodec: MediaTypeCodec<CodeQualitySetup> =
      KotlinxSerializationCodec(CODEQUALITYGETSETUP_RESPONSE_CODEC_ID, CodeQualitySetup.Serializer, SdkJson)

  private val codeQualityGetSetupResponseCodecAlternative0Codec: MediaTypeCodec<CodeQualitySetup> =
      KotlinxSerializationCodec("code-quality/get-setup.response.alternative0", CodeQualitySetup.Serializer, SdkJson)

  public val codeQualityGetSetupResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeQualitySetup> =
      MediaTypeCodecRegistry.of(codeQualityGetSetupResponseCodecAlternative0Codec)

  private val codeQualityGetSetupResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/get-setup.response.alternative1", BasicError.Serializer, SdkJson)

  public val codeQualityGetSetupResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityGetSetupResponseCodecAlternative1Codec)

  private val codeQualityGetSetupResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/get-setup.response.alternative2", BasicError.Serializer, SdkJson)

  public val codeQualityGetSetupResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityGetSetupResponseCodecAlternative2Codec)

  private val codeQualityGetSetupResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-quality/get-setup.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val codeQualityGetSetupResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeQualityGetSetupResponseCodecAlternative3Codec)

  public val codeQualityGetSetupRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val codeQualityGetSetupResponseCodecRegistry: MediaTypeCodecRegistry<CodeQualitySetup> =
      MediaTypeCodecRegistry.of(codeQualityGetSetupResponseCodec)

  public const val CODEQUALITYLISTFINDINGSFORREPO_RESPONSE_CODEC_ID: String =
      "code-quality/list-findings-for-repo.response"

  private val codeQualityListFindingsForRepoResponseCodec: MediaTypeCodec<List<CodeQualityFinding>>
      =
      KotlinxSerializationCodec(CODEQUALITYLISTFINDINGSFORREPO_RESPONSE_CODEC_ID, ListSerializer(CodeQualityFinding.Serializer), SdkJson)

  private val codeQualityListFindingsForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeQualityFinding>> =
      KotlinxSerializationCodec("code-quality/list-findings-for-repo.response.alternative0", ListSerializer(CodeQualityFinding.Serializer), SdkJson)

  public val codeQualityListFindingsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeQualityFinding>> =
      MediaTypeCodecRegistry.of(codeQualityListFindingsForRepoResponseCodecAlternative0Codec)

  private val codeQualityListFindingsForRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/list-findings-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  public val codeQualityListFindingsForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityListFindingsForRepoResponseCodecAlternative1Codec)

  private val codeQualityListFindingsForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/list-findings-for-repo.response.alternative2", BasicError.Serializer, SdkJson)

  public val codeQualityListFindingsForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityListFindingsForRepoResponseCodecAlternative2Codec)

  private val codeQualityListFindingsForRepoResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-quality/list-findings-for-repo.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val codeQualityListFindingsForRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeQualityListFindingsForRepoResponseCodecAlternative3Codec)

  public val codeQualityListFindingsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val codeQualityListFindingsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeQualityFinding>> =
      MediaTypeCodecRegistry.of(codeQualityListFindingsForRepoResponseCodec)

  public const val CODEQUALITYUPDATESETUP_REQUEST_CODEC_ID: String =
      "code-quality/update-setup.request"

  private val codeQualityUpdateSetupRequestCodec: MediaTypeCodec<CodeQualitySetupUpdate> =
      KotlinxSerializationCodec(CODEQUALITYUPDATESETUP_REQUEST_CODEC_ID, CodeQualitySetupUpdate.Serializer, SdkJson)

  private val codeQualityUpdateSetupResponseCodecAlternative0Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("code-quality/update-setup.response.alternative0", JsonObject.serializer(), SdkJson)

  public val codeQualityUpdateSetupResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(codeQualityUpdateSetupResponseCodecAlternative0Codec)

  private val codeQualityUpdateSetupResponseCodecAlternative1Codec:
      MediaTypeCodec<CodeQualitySetupUpdateResponse> =
      KotlinxSerializationCodec("code-quality/update-setup.response.alternative1", CodeQualitySetupUpdateResponse.Serializer, SdkJson)

  public val codeQualityUpdateSetupResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<CodeQualitySetupUpdateResponse> =
      MediaTypeCodecRegistry.of(codeQualityUpdateSetupResponseCodecAlternative1Codec)

  private val codeQualityUpdateSetupResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/update-setup.response.alternative2", BasicError.Serializer, SdkJson)

  public val codeQualityUpdateSetupResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityUpdateSetupResponseCodecAlternative2Codec)

  private val codeQualityUpdateSetupResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/update-setup.response.alternative3", BasicError.Serializer, SdkJson)

  public val codeQualityUpdateSetupResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityUpdateSetupResponseCodecAlternative3Codec)

  private val codeQualityUpdateSetupResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/update-setup.response.alternative4", BasicError.Serializer, SdkJson)

  public val codeQualityUpdateSetupResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityUpdateSetupResponseCodecAlternative4Codec)

  private val codeQualityUpdateSetupResponseCodecAlternative5Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-quality/update-setup.response.alternative5", BasicError.Serializer, SdkJson)

  public val codeQualityUpdateSetupResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeQualityUpdateSetupResponseCodecAlternative5Codec)

  private val codeQualityUpdateSetupResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-quality/update-setup.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val codeQualityUpdateSetupResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeQualityUpdateSetupResponseCodecAlternative6Codec)

  public val codeQualityUpdateSetupRequestCodecRegistry:
      MediaTypeCodecRegistry<CodeQualitySetupUpdate> =
      MediaTypeCodecRegistry.of(codeQualityUpdateSetupRequestCodec)
}

/**
 * Client for the 'code-quality' group of GitHub v3 REST API.
 */
public class CodeQualityClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CodeQualityClient.authentication)

  /**
   * Gets a single code quality finding.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeQualityGetFindingApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeQualityGetFindingError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeQualityGetFinding(
    findingNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeQualityFinding = executor.executeWithTypedErrors<Unit, CodeQualityGetFindingResponse, CodeQualityFinding>(
    request = SdkExecutionRequest(codeQualityGetFindingMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "finding_number", values = listOf(findingNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeQualityCodecs.codeQualityGetFindingRequestCodecRegistry,
    responseDecoder = CodeQualityGetFindingResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeQualityGetFindingResponse.SuccessJson -> response.json
        is CodeQualityGetFindingResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityGetFindingResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityGetFindingResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityGetFindingResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeQualityGetFindingResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeQualityGetFindingResponse.Http403Json -> CodeQualityGetFindingApiException(response, statusCode, headers)
        is CodeQualityGetFindingResponse.Http404Json -> CodeQualityGetFindingApiException(response, statusCode, headers)
        is CodeQualityGetFindingResponse.Http503Json -> CodeQualityGetFindingApiException(response, statusCode, headers)
        is CodeQualityGetFindingResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a single code quality finding.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun codeQualityGetFindingWithResponse(
    findingNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeQualityGetFindingResponse> = executor.executeWithResponse<Unit, CodeQualityGetFindingResponse>(SdkExecutionRequest(codeQualityGetFindingMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "finding_number", values = listOf(findingNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeQualityCodecs.codeQualityGetFindingRequestCodecRegistry, CodeQualityGetFindingResponseDecoder, options)

  /**
   * Gets a code quality setup configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeQualityGetSetupApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeQualityGetSetupError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeQualityGetSetup(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeQualitySetup = executor.executeWithTypedErrors<Unit, CodeQualityGetSetupResponse, CodeQualitySetup>(
    request = SdkExecutionRequest(codeQualityGetSetupMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeQualityCodecs.codeQualityGetSetupRequestCodecRegistry,
    responseDecoder = CodeQualityGetSetupResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeQualityGetSetupResponse.SuccessJson -> response.json
        is CodeQualityGetSetupResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityGetSetupResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityGetSetupResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityGetSetupResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeQualityGetSetupResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeQualityGetSetupResponse.Http403Json -> CodeQualityGetSetupApiException(response, statusCode, headers)
        is CodeQualityGetSetupResponse.Http404Json -> CodeQualityGetSetupApiException(response, statusCode, headers)
        is CodeQualityGetSetupResponse.Http503Json -> CodeQualityGetSetupApiException(response, statusCode, headers)
        is CodeQualityGetSetupResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a code quality setup configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun codeQualityGetSetupWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeQualityGetSetupResponse> = executor.executeWithResponse<Unit, CodeQualityGetSetupResponse>(SdkExecutionRequest(codeQualityGetSetupMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeQualityCodecs.codeQualityGetSetupRequestCodecRegistry, CodeQualityGetSetupResponseDecoder, options)

  /**
   * Lists code quality findings for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeQualityListFindingsForRepoApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeQualityListFindingsForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeQualityListFindingsForRepo(
    owner: String,
    repo: String,
    after: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    perPage: Int? = null,
    state: InlineReposCodeQualityFindingsGetParameterXcc6159d8? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeQualityFinding> = executor.executeWithTypedErrors<Unit, CodeQualityListFindingsForRepoResponse, List<CodeQualityFinding>>(
    request = SdkExecutionRequest(codeQualityListFindingsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeQualityCodecs.codeQualityListFindingsForRepoRequestCodecRegistry,
    responseDecoder = CodeQualityListFindingsForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeQualityListFindingsForRepoResponse.SuccessJson -> response.json
        is CodeQualityListFindingsForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityListFindingsForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityListFindingsForRepoResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeQualityListFindingsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeQualityListFindingsForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeQualityListFindingsForRepoResponse.Http403Json -> CodeQualityListFindingsForRepoApiException(response, statusCode, headers)
        is CodeQualityListFindingsForRepoResponse.Http404Json -> CodeQualityListFindingsForRepoApiException(response, statusCode, headers)
        is CodeQualityListFindingsForRepoResponse.Http503Json -> CodeQualityListFindingsForRepoApiException(response, statusCode, headers)
        is CodeQualityListFindingsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists code quality findings for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun codeQualityListFindingsForRepoWithResponse(
    owner: String,
    repo: String,
    after: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    perPage: Int? = null,
    state: InlineReposCodeQualityFindingsGetParameterXcc6159d8? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeQualityListFindingsForRepoResponse> = executor.executeWithResponse<Unit, CodeQualityListFindingsForRepoResponse>(SdkExecutionRequest(codeQualityListFindingsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeQualityCodecs.codeQualityListFindingsForRepoRequestCodecRegistry, CodeQualityListFindingsForRepoResponseDecoder, options)

  /**
   * Updates a code quality setup configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun codeQualityUpdateSetupWithResponse(
    request: CodeQualitySetupUpdate,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeQualityUpdateSetupResponse> = executor.executeWithResponse<CodeQualitySetupUpdate, CodeQualityUpdateSetupResponse>(SdkExecutionRequest(codeQualityUpdateSetupMetadata, baseUri, request, listOf(CodeQualityCodecs.CODEQUALITYUPDATESETUP_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeQualityCodecs.codeQualityUpdateSetupRequestCodecRegistry, CodeQualityUpdateSetupResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `code-quality/get-finding` may expose through its typed API
   * exception.
   */
  public sealed interface CodeQualityGetFindingError

  /**
   * Typed response alternatives for `code-quality/get-finding`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CodeQualityGetFindingResponse {
    public class SuccessJson(
      public val json: CodeQualityFinding,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetFindingResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetFindingResponse,
        CodeQualityGetFindingError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetFindingResponse,
        CodeQualityGetFindingError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetFindingResponse,
        CodeQualityGetFindingError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetFindingResponse
  }

  /**
   * Raised by `code-quality/get-finding` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CodeQualityGetFindingApiException(
    public val error: CodeQualityGetFindingError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-quality/get-finding")

  private object CodeQualityGetFindingResponseDecoder : SdkResponseAlternativeDecoder<CodeQualityGetFindingResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeQualityGetFindingResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeQualityGetFindingResponse> = when {
      alternative.id == "code-quality/get-finding.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeQualityGetFindingResponse.SuccessJson(
          json = CodeQualityCodecs.codeQualityGetFindingResponseCodecAlternative0Registry.select(listOf("code-quality/get-finding.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/get-finding.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeQualityGetFindingResponse.Http403Json(
          json = CodeQualityCodecs.codeQualityGetFindingResponseCodecAlternative1Registry.select(listOf("code-quality/get-finding.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/get-finding.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeQualityGetFindingResponse.Http404Json(
          json = CodeQualityCodecs.codeQualityGetFindingResponseCodecAlternative2Registry.select(listOf("code-quality/get-finding.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/get-finding.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeQualityGetFindingResponse.Http503Json(
          json = CodeQualityCodecs.codeQualityGetFindingResponseCodecAlternative3Registry.select(listOf("code-quality/get-finding.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeQualityGetFindingResponse = CodeQualityGetFindingResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-quality/get-setup` may expose through its typed API exception.
   */
  public sealed interface CodeQualityGetSetupError

  /**
   * Typed response alternatives for `code-quality/get-setup`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CodeQualityGetSetupResponse {
    public class SuccessJson(
      public val json: CodeQualitySetup,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetSetupResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetSetupResponse,
        CodeQualityGetSetupError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetSetupResponse,
        CodeQualityGetSetupError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetSetupResponse,
        CodeQualityGetSetupError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityGetSetupResponse
  }

  /**
   * Raised by `code-quality/get-setup` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CodeQualityGetSetupApiException(
    public val error: CodeQualityGetSetupError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-quality/get-setup")

  private object CodeQualityGetSetupResponseDecoder : SdkResponseAlternativeDecoder<CodeQualityGetSetupResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeQualityGetSetupResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeQualityGetSetupResponse> = when {
      alternative.id == "code-quality/get-setup.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeQualityGetSetupResponse.SuccessJson(
          json = CodeQualityCodecs.codeQualityGetSetupResponseCodecAlternative0Registry.select(listOf("code-quality/get-setup.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/get-setup.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeQualityGetSetupResponse.Http403Json(
          json = CodeQualityCodecs.codeQualityGetSetupResponseCodecAlternative1Registry.select(listOf("code-quality/get-setup.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/get-setup.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeQualityGetSetupResponse.Http404Json(
          json = CodeQualityCodecs.codeQualityGetSetupResponseCodecAlternative2Registry.select(listOf("code-quality/get-setup.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/get-setup.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeQualityGetSetupResponse.Http503Json(
          json = CodeQualityCodecs.codeQualityGetSetupResponseCodecAlternative3Registry.select(listOf("code-quality/get-setup.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeQualityGetSetupResponse = CodeQualityGetSetupResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-quality/list-findings-for-repo` may expose through its typed
   * API exception.
   */
  public sealed interface CodeQualityListFindingsForRepoError

  /**
   * Typed response alternatives for `code-quality/list-findings-for-repo`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeQualityListFindingsForRepoResponse {
    public class SuccessJson(
      public val json: List<CodeQualityFinding>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityListFindingsForRepoResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityListFindingsForRepoResponse,
        CodeQualityListFindingsForRepoError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityListFindingsForRepoResponse,
        CodeQualityListFindingsForRepoError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityListFindingsForRepoResponse,
        CodeQualityListFindingsForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityListFindingsForRepoResponse
  }

  /**
   * Raised by `code-quality/list-findings-for-repo` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodeQualityListFindingsForRepoApiException(
    public val error: CodeQualityListFindingsForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-quality/list-findings-for-repo")

  private object CodeQualityListFindingsForRepoResponseDecoder : SdkResponseAlternativeDecoder<CodeQualityListFindingsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeQualityListFindingsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeQualityListFindingsForRepoResponse> = when {
      alternative.id == "code-quality/list-findings-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeQualityListFindingsForRepoResponse.SuccessJson(
          json = CodeQualityCodecs.codeQualityListFindingsForRepoResponseCodecAlternative0Registry.select(listOf("code-quality/list-findings-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/list-findings-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeQualityListFindingsForRepoResponse.Http403Json(
          json = CodeQualityCodecs.codeQualityListFindingsForRepoResponseCodecAlternative1Registry.select(listOf("code-quality/list-findings-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/list-findings-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeQualityListFindingsForRepoResponse.Http404Json(
          json = CodeQualityCodecs.codeQualityListFindingsForRepoResponseCodecAlternative2Registry.select(listOf("code-quality/list-findings-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/list-findings-for-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeQualityListFindingsForRepoResponse.Http503Json(
          json = CodeQualityCodecs.codeQualityListFindingsForRepoResponseCodecAlternative3Registry.select(listOf("code-quality/list-findings-for-repo.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeQualityListFindingsForRepoResponse = CodeQualityListFindingsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `code-quality/update-setup`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeQualityUpdateSetupResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityUpdateSetupResponse

    public class SuccessJson2(
      public val json: CodeQualitySetupUpdateResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityUpdateSetupResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityUpdateSetupResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityUpdateSetupResponse

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityUpdateSetupResponse

    public class Http422Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityUpdateSetupResponse

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityUpdateSetupResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeQualityUpdateSetupResponse
  }

  private object CodeQualityUpdateSetupResponseDecoder : SdkResponseAlternativeDecoder<CodeQualityUpdateSetupResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeQualityUpdateSetupResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeQualityUpdateSetupResponse> = when {
      alternative.id == "code-quality/update-setup.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeQualityUpdateSetupResponse.SuccessJson(
          json = CodeQualityCodecs.codeQualityUpdateSetupResponseCodecAlternative0Registry.select(listOf("code-quality/update-setup.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/update-setup.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeQualityUpdateSetupResponse.SuccessJson2(
          json = CodeQualityCodecs.codeQualityUpdateSetupResponseCodecAlternative1Registry.select(listOf("code-quality/update-setup.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/update-setup.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeQualityUpdateSetupResponse.Http403Json(
          json = CodeQualityCodecs.codeQualityUpdateSetupResponseCodecAlternative2Registry.select(listOf("code-quality/update-setup.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/update-setup.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeQualityUpdateSetupResponse.Http404Json(
          json = CodeQualityCodecs.codeQualityUpdateSetupResponseCodecAlternative3Registry.select(listOf("code-quality/update-setup.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/update-setup.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeQualityUpdateSetupResponse.Http409Json(
          json = CodeQualityCodecs.codeQualityUpdateSetupResponseCodecAlternative4Registry.select(listOf("code-quality/update-setup.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/update-setup.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeQualityUpdateSetupResponse.Http422Json(
          json = CodeQualityCodecs.codeQualityUpdateSetupResponseCodecAlternative5Registry.select(listOf("code-quality/update-setup.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-quality/update-setup.response.alternative6" -> SdkResponseDecodeResult(
        value = CodeQualityUpdateSetupResponse.Http503Json(
          json = CodeQualityCodecs.codeQualityUpdateSetupResponseCodecAlternative6Registry.select(listOf("code-quality/update-setup.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeQualityUpdateSetupResponse = CodeQualityUpdateSetupResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val codeQualityGetFindingMetadata: OperationMetadata = OperationMetadata(
          operationId = "code-quality/get-finding",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-quality/findings/{finding_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeQualityFinding",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/get-finding.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/get-finding.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/get-finding.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/get-finding.response.alternative3",
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
        )

    public val codeQualityGetSetupMetadata: OperationMetadata = OperationMetadata(
          operationId = "code-quality/get-setup",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-quality/setup",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeQualitySetup",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/get-setup.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/get-setup.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/get-setup.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/get-setup.response.alternative3",
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
        )

    public val codeQualityListFindingsForRepoMetadata: OperationMetadata = OperationMetadata(
          operationId = "code-quality/list-findings-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-quality/findings",
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
              id = "code-quality/list-findings-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/list-findings-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/list-findings-for-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/list-findings-for-repo.response.alternative3",
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
        )

    public val codeQualityUpdateSetupMetadata: OperationMetadata = OperationMetadata(
          operationId = "code-quality/update-setup",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/code-quality/setup",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/update-setup.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeQualitySetupUpdateResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/update-setup.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/update-setup.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/update-setup.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/update-setup.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/update-setup.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-quality/update-setup.response.alternative6",
            ),
          ),
          security = emptyList(),
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
        )
  }
}
