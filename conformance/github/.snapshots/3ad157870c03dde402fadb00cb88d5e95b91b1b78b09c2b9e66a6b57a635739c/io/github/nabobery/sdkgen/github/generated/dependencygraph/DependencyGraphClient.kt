package io.github.nabobery.sdkgen.github.generated.dependencygraph

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
import io.github.nabobery.sdkgen.github.generated.BasicError
import io.github.nabobery.sdkgen.github.generated.DependencyGraphSpdxSbom
import io.github.nabobery.sdkgen.github.generated.InlineDependencyGraphDiffItemX3d23719e
import io.github.nabobery.sdkgen.github.generated.InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24
import io.github.nabobery.sdkgen.github.generated.InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226
import io.github.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import io.github.nabobery.sdkgen.github.generated.ScimError
import io.github.nabobery.sdkgen.github.generated.SdkJson
import io.github.nabobery.sdkgen.github.generated.Snapshot
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

internal object DependencyGraphCodecs {
  internal const val DEPENDENCYGRAPHCREATEREPOSITORYSNAPSHOT_REQUEST_CODEC_ID: String =
      "dependency-graph/create-repository-snapshot.request"

  private val dependencyGraphCreateRepositorySnapshotRequestCodec: MediaTypeCodec<Snapshot> =
      KotlinxSerializationCodec(DEPENDENCYGRAPHCREATEREPOSITORYSNAPSHOT_REQUEST_CODEC_ID, Snapshot.Serializer, SdkJson)

  internal const val DEPENDENCYGRAPHCREATEREPOSITORYSNAPSHOT_RESPONSE_CODEC_ID: String =
      "dependency-graph/create-repository-snapshot.response"

  private val dependencyGraphCreateRepositorySnapshotResponseCodec:
      MediaTypeCodec<InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226> =
      KotlinxSerializationCodec(DEPENDENCYGRAPHCREATEREPOSITORYSNAPSHOT_RESPONSE_CODEC_ID, InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226.Serializer, SdkJson)

  private val dependencyGraphCreateRepositorySnapshotResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226> =
      KotlinxSerializationCodec("dependency-graph/create-repository-snapshot.response.alternative0", InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226.Serializer, SdkJson)

  internal val dependencyGraphCreateRepositorySnapshotResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226> =
      MediaTypeCodecRegistry.of(dependencyGraphCreateRepositorySnapshotResponseCodecAlternative0Codec)

  internal val dependencyGraphCreateRepositorySnapshotRequestCodecRegistry:
      MediaTypeCodecRegistry<Snapshot> =
      MediaTypeCodecRegistry.of(dependencyGraphCreateRepositorySnapshotRequestCodec)

  internal val dependencyGraphCreateRepositorySnapshotResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226> =
      MediaTypeCodecRegistry.of(dependencyGraphCreateRepositorySnapshotResponseCodec)

  internal const val DEPENDENCYGRAPHDIFFRANGE_RESPONSE_CODEC_ID: String =
      "dependency-graph/diff-range.response"

  private val dependencyGraphDiffRangeResponseCodec:
      MediaTypeCodec<List<InlineDependencyGraphDiffItemX3d23719e>> =
      KotlinxSerializationCodec(DEPENDENCYGRAPHDIFFRANGE_RESPONSE_CODEC_ID, ListSerializer(InlineDependencyGraphDiffItemX3d23719e.Serializer), SdkJson)

  private val dependencyGraphDiffRangeResponseCodecAlternative0Codec:
      MediaTypeCodec<List<InlineDependencyGraphDiffItemX3d23719e>> =
      KotlinxSerializationCodec("dependency-graph/diff-range.response.alternative0", ListSerializer(InlineDependencyGraphDiffItemX3d23719e.Serializer), SdkJson)

  internal val dependencyGraphDiffRangeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<InlineDependencyGraphDiffItemX3d23719e>> =
      MediaTypeCodecRegistry.of(dependencyGraphDiffRangeResponseCodecAlternative0Codec)

  private val dependencyGraphDiffRangeResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/diff-range.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependencyGraphDiffRangeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphDiffRangeResponseCodecAlternative1Codec)

  private val dependencyGraphDiffRangeResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("dependency-graph/diff-range.response.alternative2", ScimError.Serializer, SdkJson)

  internal val dependencyGraphDiffRangeResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(dependencyGraphDiffRangeResponseCodecAlternative2Codec)

  private val dependencyGraphDiffRangeResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/diff-range.response.alternative3", BasicError.Serializer, SdkJson)

  internal val dependencyGraphDiffRangeResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphDiffRangeResponseCodecAlternative3Codec)

  private val dependencyGraphDiffRangeResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/diff-range.response.alternative4", BasicError.Serializer, SdkJson)

  internal val dependencyGraphDiffRangeResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphDiffRangeResponseCodecAlternative4Codec)

  private val dependencyGraphDiffRangeResponseCodecAlternative5Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/diff-range.response.alternative5", BasicError.Serializer, SdkJson)

  internal val dependencyGraphDiffRangeResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphDiffRangeResponseCodecAlternative5Codec)

  private val dependencyGraphDiffRangeResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("dependency-graph/diff-range.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val dependencyGraphDiffRangeResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(dependencyGraphDiffRangeResponseCodecAlternative6Codec)

  internal val dependencyGraphDiffRangeRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependencyGraphDiffRangeResponseCodecRegistry:
      MediaTypeCodecRegistry<List<InlineDependencyGraphDiffItemX3d23719e>> =
      MediaTypeCodecRegistry.of(dependencyGraphDiffRangeResponseCodec)

  internal const val DEPENDENCYGRAPHEXPORTSBOM_RESPONSE_CODEC_ID: String =
      "dependency-graph/export-sbom.response"

  private val dependencyGraphExportSbomResponseCodec: MediaTypeCodec<DependencyGraphSpdxSbom> =
      KotlinxSerializationCodec(DEPENDENCYGRAPHEXPORTSBOM_RESPONSE_CODEC_ID, DependencyGraphSpdxSbom.Serializer, SdkJson)

  private val dependencyGraphExportSbomResponseCodecAlternative0Codec:
      MediaTypeCodec<DependencyGraphSpdxSbom> =
      KotlinxSerializationCodec("dependency-graph/export-sbom.response.alternative0", DependencyGraphSpdxSbom.Serializer, SdkJson)

  internal val dependencyGraphExportSbomResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DependencyGraphSpdxSbom> =
      MediaTypeCodecRegistry.of(dependencyGraphExportSbomResponseCodecAlternative0Codec)

  private val dependencyGraphExportSbomResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/export-sbom.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependencyGraphExportSbomResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphExportSbomResponseCodecAlternative1Codec)

  private val dependencyGraphExportSbomResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/export-sbom.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependencyGraphExportSbomResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphExportSbomResponseCodecAlternative2Codec)

  internal val dependencyGraphExportSbomRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependencyGraphExportSbomResponseCodecRegistry:
      MediaTypeCodecRegistry<DependencyGraphSpdxSbom> =
      MediaTypeCodecRegistry.of(dependencyGraphExportSbomResponseCodec)

  private val dependencyGraphFetchSbomReportResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/fetch-sbom-report.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependencyGraphFetchSbomReportResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphFetchSbomReportResponseCodecAlternative2Codec)

  private val dependencyGraphFetchSbomReportResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/fetch-sbom-report.response.alternative3", BasicError.Serializer, SdkJson)

  internal val dependencyGraphFetchSbomReportResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphFetchSbomReportResponseCodecAlternative3Codec)

  internal val dependencyGraphFetchSbomReportRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependencyGraphFetchSbomReportResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val DEPENDENCYGRAPHGENERATESBOMREPORT_RESPONSE_CODEC_ID: String =
      "dependency-graph/generate-sbom-report.response"

  private val dependencyGraphGenerateSbomReportResponseCodec:
      MediaTypeCodec<InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24> =
      KotlinxSerializationCodec(DEPENDENCYGRAPHGENERATESBOMREPORT_RESPONSE_CODEC_ID, InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24.Serializer, SdkJson)

  private val dependencyGraphGenerateSbomReportResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24> =
      KotlinxSerializationCodec("dependency-graph/generate-sbom-report.response.alternative0", InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24.Serializer, SdkJson)

  internal val dependencyGraphGenerateSbomReportResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24>
      = MediaTypeCodecRegistry.of(dependencyGraphGenerateSbomReportResponseCodecAlternative0Codec)

  private val dependencyGraphGenerateSbomReportResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/generate-sbom-report.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependencyGraphGenerateSbomReportResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphGenerateSbomReportResponseCodecAlternative1Codec)

  private val dependencyGraphGenerateSbomReportResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependency-graph/generate-sbom-report.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependencyGraphGenerateSbomReportResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependencyGraphGenerateSbomReportResponseCodecAlternative2Codec)

  internal val dependencyGraphGenerateSbomReportRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependencyGraphGenerateSbomReportResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24>
      = MediaTypeCodecRegistry.of(dependencyGraphGenerateSbomReportResponseCodec)
}

/**
 * Client for the 'dependency-graph' group of GitHub v3 REST API.
 */
public class DependencyGraphClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@DependencyGraphClient.authentication)

  /**
   * Create a new snapshot of a repository's dependencies.
   *
   * The authenticated user must have access to the repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependencyGraphCreateRepositorySnapshot(
    request: Snapshot,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226 = executor.execute<Snapshot, InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226>(SdkExecutionRequest(dependencyGraphCreateRepositorySnapshotMetadata, baseUri, request, listOf(DependencyGraphCodecs.DEPENDENCYGRAPHCREATEREPOSITORYSNAPSHOT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(DependencyGraphCodecs.DEPENDENCYGRAPHCREATEREPOSITORYSNAPSHOT_RESPONSE_CODEC_ID), DependencyGraphCodecs.dependencyGraphCreateRepositorySnapshotRequestCodecRegistry, DependencyGraphCodecs.dependencyGraphCreateRepositorySnapshotResponseCodecRegistry, options)

  /**
   * Create a new snapshot of a repository's dependencies.
   *
   * The authenticated user must have access to the repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependencyGraphCreateRepositorySnapshotWithResponse(
    request: Snapshot,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependencyGraphCreateRepositorySnapshotResponse> = executor.executeWithResponse<Snapshot, DependencyGraphCreateRepositorySnapshotResponse>(SdkExecutionRequest(dependencyGraphCreateRepositorySnapshotMetadata, baseUri, request, listOf(DependencyGraphCodecs.DEPENDENCYGRAPHCREATEREPOSITORYSNAPSHOT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), DependencyGraphCodecs.dependencyGraphCreateRepositorySnapshotRequestCodecRegistry, DependencyGraphCreateRepositorySnapshotResponseDecoder, options)

  /**
   * Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency
   * manifests made in those commits.
   *
   * @param basehead The base and head Git revisions to compare. The Git revisions will be resolved to commit SHAs.
   * Named revisions will be resolved to their corresponding HEAD commits, and an appropriate merge base will be
   * determined. This parameter expects the format `{base}...{head}`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param name The full path, relative to the repository root, of the dependency manifest file.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependencyGraphDiffRangeApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded DependencyGraphDiffRangeError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependencyGraphDiffRange(
    basehead: String,
    owner: String,
    repo: String,
    name: String? = null,
    options: CallOptions = CallOptions(),
  ): List<InlineDependencyGraphDiffItemX3d23719e> = executor.executeWithTypedErrors<Unit, DependencyGraphDiffRangeResponse, List<InlineDependencyGraphDiffItemX3d23719e>>(
    request = SdkExecutionRequest(dependencyGraphDiffRangeMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "basehead", values = listOf(basehead.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "name", values = name?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = DependencyGraphCodecs.dependencyGraphDiffRangeRequestCodecRegistry,
    responseDecoder = DependencyGraphDiffRangeResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependencyGraphDiffRangeResponse.SuccessJson -> response.json
        is DependencyGraphDiffRangeResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphDiffRangeResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphDiffRangeResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphDiffRangeResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphDiffRangeResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphDiffRangeResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphDiffRangeResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependencyGraphDiffRangeResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependencyGraphDiffRangeResponse.Http400Json -> DependencyGraphDiffRangeApiException(response, statusCode, headers)
        is DependencyGraphDiffRangeResponse.Http400ScimJson -> DependencyGraphDiffRangeApiException(response, statusCode, headers)
        is DependencyGraphDiffRangeResponse.Http403Json -> DependencyGraphDiffRangeApiException(response, statusCode, headers)
        is DependencyGraphDiffRangeResponse.Http404Json -> DependencyGraphDiffRangeApiException(response, statusCode, headers)
        is DependencyGraphDiffRangeResponse.Http500Json -> DependencyGraphDiffRangeApiException(response, statusCode, headers)
        is DependencyGraphDiffRangeResponse.Http503Json -> DependencyGraphDiffRangeApiException(response, statusCode, headers)
        is DependencyGraphDiffRangeResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency
   * manifests made in those commits.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param basehead The base and head Git revisions to compare. The Git revisions will be resolved to commit SHAs.
   * Named revisions will be resolved to their corresponding HEAD commits, and an appropriate merge base will be
   * determined. This parameter expects the format `{base}...{head}`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param name The full path, relative to the repository root, of the dependency manifest file.
   * @param options Execution options.
   */
  public suspend fun dependencyGraphDiffRangeWithResponse(
    basehead: String,
    owner: String,
    repo: String,
    name: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependencyGraphDiffRangeResponse> = executor.executeWithResponse<Unit, DependencyGraphDiffRangeResponse>(SdkExecutionRequest(dependencyGraphDiffRangeMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "basehead", values = listOf(basehead.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "name", values = name?.let { listOf(it.toString()) }.orEmpty()))
  }), DependencyGraphCodecs.dependencyGraphDiffRangeRequestCodecRegistry, DependencyGraphDiffRangeResponseDecoder, options)

  /**
   * Exports the software bill of materials (SBOM) for a repository in SPDX JSON format.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependencyGraphExportSbomApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded DependencyGraphExportSbomError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependencyGraphExportSbom(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): DependencyGraphSpdxSbom = executor.executeWithTypedErrors<Unit, DependencyGraphExportSbomResponse, DependencyGraphSpdxSbom>(
    request = SdkExecutionRequest(dependencyGraphExportSbomMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = DependencyGraphCodecs.dependencyGraphExportSbomRequestCodecRegistry,
    responseDecoder = DependencyGraphExportSbomResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependencyGraphExportSbomResponse.SuccessJson -> response.json
        is DependencyGraphExportSbomResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphExportSbomResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphExportSbomResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependencyGraphExportSbomResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependencyGraphExportSbomResponse.Http403Json -> DependencyGraphExportSbomApiException(response, statusCode, headers)
        is DependencyGraphExportSbomResponse.Http404Json -> DependencyGraphExportSbomApiException(response, statusCode, headers)
        is DependencyGraphExportSbomResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Exports the software bill of materials (SBOM) for a repository in SPDX JSON format.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependencyGraphExportSbomWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependencyGraphExportSbomResponse> = executor.executeWithResponse<Unit, DependencyGraphExportSbomResponse>(SdkExecutionRequest(dependencyGraphExportSbomMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), DependencyGraphCodecs.dependencyGraphExportSbomRequestCodecRegistry, DependencyGraphExportSbomResponseDecoder, options)

  /**
   * Fetches a previously generated software bill of materials (SBOM) for a repository.
   * When the SBOM is ready, the response is a 302 redirect to a temporary download URL for the SBOM in SPDX JSON
   * format.
   * The generated SBOM report may be retained for up to one week from the original request.
   * The temporary download URL returned by this endpoint expires separately, and its expiry is set when the fetch
   * request is made.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param sbomUuid The unique identifier of the SBOM export.
   * @param options Execution options.
   * @return No response body.
   * @throws DependencyGraphFetchSbomReportApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded DependencyGraphFetchSbomReportError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependencyGraphFetchSbomReport(
    owner: String,
    repo: String,
    sbomUuid: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, DependencyGraphFetchSbomReportResponse, Unit>(
    request = SdkExecutionRequest(dependencyGraphFetchSbomReportMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "sbom_uuid", values = listOf(sbomUuid.toString())))
    }),
    requestCodecs = DependencyGraphCodecs.dependencyGraphFetchSbomReportRequestCodecRegistry,
    responseDecoder = DependencyGraphFetchSbomReportResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependencyGraphFetchSbomReportResponse.SuccessNoContent -> response.unit
        is DependencyGraphFetchSbomReportResponse.Http302NoContent -> response.unit
        is DependencyGraphFetchSbomReportResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphFetchSbomReportResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphFetchSbomReportResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependencyGraphFetchSbomReportResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is DependencyGraphFetchSbomReportResponse.Http302NoContent -> DependencyGraphFetchSbomReportApiException(response, statusCode, headers)
        is DependencyGraphFetchSbomReportResponse.Http403Json -> DependencyGraphFetchSbomReportApiException(response, statusCode, headers)
        is DependencyGraphFetchSbomReportResponse.Http404Json -> DependencyGraphFetchSbomReportApiException(response, statusCode, headers)
        is DependencyGraphFetchSbomReportResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Fetches a previously generated software bill of materials (SBOM) for a repository.
   * When the SBOM is ready, the response is a 302 redirect to a temporary download URL for the SBOM in SPDX JSON
   * format.
   * The generated SBOM report may be retained for up to one week from the original request.
   * The temporary download URL returned by this endpoint expires separately, and its expiry is set when the fetch
   * request is made.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param sbomUuid The unique identifier of the SBOM export.
   * @param options Execution options.
   */
  public suspend fun dependencyGraphFetchSbomReportWithResponse(
    owner: String,
    repo: String,
    sbomUuid: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependencyGraphFetchSbomReportResponse> = executor.executeWithResponse<Unit, DependencyGraphFetchSbomReportResponse>(SdkExecutionRequest(dependencyGraphFetchSbomReportMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "sbom_uuid", values = listOf(sbomUuid.toString())))
  }), DependencyGraphCodecs.dependencyGraphFetchSbomReportRequestCodecRegistry, DependencyGraphFetchSbomReportResponseDecoder, options)

  /**
   * Triggers a job to generate a software bill of materials (SBOM) for a repository in SPDX JSON format.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependencyGraphGenerateSbomReportApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded DependencyGraphGenerateSbomReportError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependencyGraphGenerateSbomReport(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24 = executor.executeWithTypedErrors<Unit, DependencyGraphGenerateSbomReportResponse, InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24>(
    request = SdkExecutionRequest(dependencyGraphGenerateSbomReportMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = DependencyGraphCodecs.dependencyGraphGenerateSbomReportRequestCodecRegistry,
    responseDecoder = DependencyGraphGenerateSbomReportResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependencyGraphGenerateSbomReportResponse.SuccessJson -> response.json
        is DependencyGraphGenerateSbomReportResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphGenerateSbomReportResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependencyGraphGenerateSbomReportResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependencyGraphGenerateSbomReportResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependencyGraphGenerateSbomReportResponse.Http403Json -> DependencyGraphGenerateSbomReportApiException(response, statusCode, headers)
        is DependencyGraphGenerateSbomReportResponse.Http404Json -> DependencyGraphGenerateSbomReportApiException(response, statusCode, headers)
        is DependencyGraphGenerateSbomReportResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Triggers a job to generate a software bill of materials (SBOM) for a repository in SPDX JSON format.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependencyGraphGenerateSbomReportWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependencyGraphGenerateSbomReportResponse> = executor.executeWithResponse<Unit, DependencyGraphGenerateSbomReportResponse>(SdkExecutionRequest(dependencyGraphGenerateSbomReportMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), DependencyGraphCodecs.dependencyGraphGenerateSbomReportRequestCodecRegistry, DependencyGraphGenerateSbomReportResponseDecoder, options)

  /**
   * Typed response alternatives for `dependency-graph/create-repository-snapshot`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependencyGraphCreateRepositorySnapshotResponse {
    public class SuccessJson(
      public val json: InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphCreateRepositorySnapshotResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphCreateRepositorySnapshotResponse
  }

  private object DependencyGraphCreateRepositorySnapshotResponseDecoder : SdkResponseAlternativeDecoder<DependencyGraphCreateRepositorySnapshotResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependencyGraphCreateRepositorySnapshotResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependencyGraphCreateRepositorySnapshotResponse> = when {
      alternative.id == "dependency-graph/create-repository-snapshot.response.alternative0" -> SdkResponseDecodeResult(
        value = DependencyGraphCreateRepositorySnapshotResponse.SuccessJson(
          json = DependencyGraphCodecs.dependencyGraphCreateRepositorySnapshotResponseCodecAlternative0Registry.select(listOf("dependency-graph/create-repository-snapshot.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependencyGraphCreateRepositorySnapshotResponse = DependencyGraphCreateRepositorySnapshotResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependency-graph/diff-range` may expose through its typed API
   * exception.
   */
  public sealed interface DependencyGraphDiffRangeError

  /**
   * Typed response alternatives for `dependency-graph/diff-range`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependencyGraphDiffRangeResponse {
    public class SuccessJson(
      public val json: List<InlineDependencyGraphDiffItemX3d23719e>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphDiffRangeResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphDiffRangeResponse,
        DependencyGraphDiffRangeError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphDiffRangeResponse,
        DependencyGraphDiffRangeError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphDiffRangeResponse,
        DependencyGraphDiffRangeError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphDiffRangeResponse,
        DependencyGraphDiffRangeError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphDiffRangeResponse,
        DependencyGraphDiffRangeError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphDiffRangeResponse,
        DependencyGraphDiffRangeError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphDiffRangeResponse
  }

  /**
   * Raised by `dependency-graph/diff-range` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class DependencyGraphDiffRangeApiException(
    public val error: DependencyGraphDiffRangeError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependency-graph/diff-range")

  private object DependencyGraphDiffRangeResponseDecoder : SdkResponseAlternativeDecoder<DependencyGraphDiffRangeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependencyGraphDiffRangeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependencyGraphDiffRangeResponse> = when {
      alternative.id == "dependency-graph/diff-range.response.alternative0" -> SdkResponseDecodeResult(
        value = DependencyGraphDiffRangeResponse.SuccessJson(
          json = DependencyGraphCodecs.dependencyGraphDiffRangeResponseCodecAlternative0Registry.select(listOf("dependency-graph/diff-range.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/diff-range.response.alternative1" -> SdkResponseDecodeResult(
        value = DependencyGraphDiffRangeResponse.Http400Json(
          json = DependencyGraphCodecs.dependencyGraphDiffRangeResponseCodecAlternative1Registry.select(listOf("dependency-graph/diff-range.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/diff-range.response.alternative2" -> SdkResponseDecodeResult(
        value = DependencyGraphDiffRangeResponse.Http400ScimJson(
          json = DependencyGraphCodecs.dependencyGraphDiffRangeResponseCodecAlternative2Registry.select(listOf("dependency-graph/diff-range.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/diff-range.response.alternative3" -> SdkResponseDecodeResult(
        value = DependencyGraphDiffRangeResponse.Http403Json(
          json = DependencyGraphCodecs.dependencyGraphDiffRangeResponseCodecAlternative3Registry.select(listOf("dependency-graph/diff-range.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/diff-range.response.alternative4" -> SdkResponseDecodeResult(
        value = DependencyGraphDiffRangeResponse.Http404Json(
          json = DependencyGraphCodecs.dependencyGraphDiffRangeResponseCodecAlternative4Registry.select(listOf("dependency-graph/diff-range.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/diff-range.response.alternative5" -> SdkResponseDecodeResult(
        value = DependencyGraphDiffRangeResponse.Http500Json(
          json = DependencyGraphCodecs.dependencyGraphDiffRangeResponseCodecAlternative5Registry.select(listOf("dependency-graph/diff-range.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/diff-range.response.alternative6" -> SdkResponseDecodeResult(
        value = DependencyGraphDiffRangeResponse.Http503Json(
          json = DependencyGraphCodecs.dependencyGraphDiffRangeResponseCodecAlternative6Registry.select(listOf("dependency-graph/diff-range.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependencyGraphDiffRangeResponse = DependencyGraphDiffRangeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependency-graph/export-sbom` may expose through its typed API
   * exception.
   */
  public sealed interface DependencyGraphExportSbomError

  /**
   * Typed response alternatives for `dependency-graph/export-sbom`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependencyGraphExportSbomResponse {
    public class SuccessJson(
      public val json: DependencyGraphSpdxSbom,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphExportSbomResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphExportSbomResponse,
        DependencyGraphExportSbomError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphExportSbomResponse,
        DependencyGraphExportSbomError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphExportSbomResponse
  }

  /**
   * Raised by `dependency-graph/export-sbom` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class DependencyGraphExportSbomApiException(
    public val error: DependencyGraphExportSbomError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependency-graph/export-sbom")

  private object DependencyGraphExportSbomResponseDecoder : SdkResponseAlternativeDecoder<DependencyGraphExportSbomResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependencyGraphExportSbomResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependencyGraphExportSbomResponse> = when {
      alternative.id == "dependency-graph/export-sbom.response.alternative0" -> SdkResponseDecodeResult(
        value = DependencyGraphExportSbomResponse.SuccessJson(
          json = DependencyGraphCodecs.dependencyGraphExportSbomResponseCodecAlternative0Registry.select(listOf("dependency-graph/export-sbom.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/export-sbom.response.alternative1" -> SdkResponseDecodeResult(
        value = DependencyGraphExportSbomResponse.Http403Json(
          json = DependencyGraphCodecs.dependencyGraphExportSbomResponseCodecAlternative1Registry.select(listOf("dependency-graph/export-sbom.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/export-sbom.response.alternative2" -> SdkResponseDecodeResult(
        value = DependencyGraphExportSbomResponse.Http404Json(
          json = DependencyGraphCodecs.dependencyGraphExportSbomResponseCodecAlternative2Registry.select(listOf("dependency-graph/export-sbom.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependencyGraphExportSbomResponse = DependencyGraphExportSbomResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependency-graph/fetch-sbom-report` may expose through its typed
   * API exception.
   */
  public sealed interface DependencyGraphFetchSbomReportError

  /**
   * Typed response alternatives for `dependency-graph/fetch-sbom-report`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DependencyGraphFetchSbomReportResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphFetchSbomReportResponse

    public class Http302NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphFetchSbomReportResponse,
        DependencyGraphFetchSbomReportError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphFetchSbomReportResponse,
        DependencyGraphFetchSbomReportError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphFetchSbomReportResponse,
        DependencyGraphFetchSbomReportError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphFetchSbomReportResponse
  }

  /**
   * Raised by `dependency-graph/fetch-sbom-report` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class DependencyGraphFetchSbomReportApiException(
    public val error: DependencyGraphFetchSbomReportError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependency-graph/fetch-sbom-report")

  private object DependencyGraphFetchSbomReportResponseDecoder : SdkResponseAlternativeDecoder<DependencyGraphFetchSbomReportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependencyGraphFetchSbomReportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependencyGraphFetchSbomReportResponse> = when {
      alternative.id == "dependency-graph/fetch-sbom-report.response.alternative0" -> SdkResponseDecodeResult(
        value = DependencyGraphFetchSbomReportResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/fetch-sbom-report.response.alternative1" -> SdkResponseDecodeResult(
        value = DependencyGraphFetchSbomReportResponse.Http302NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/fetch-sbom-report.response.alternative2" -> SdkResponseDecodeResult(
        value = DependencyGraphFetchSbomReportResponse.Http403Json(
          json = DependencyGraphCodecs.dependencyGraphFetchSbomReportResponseCodecAlternative2Registry.select(listOf("dependency-graph/fetch-sbom-report.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/fetch-sbom-report.response.alternative3" -> SdkResponseDecodeResult(
        value = DependencyGraphFetchSbomReportResponse.Http404Json(
          json = DependencyGraphCodecs.dependencyGraphFetchSbomReportResponseCodecAlternative3Registry.select(listOf("dependency-graph/fetch-sbom-report.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependencyGraphFetchSbomReportResponse = DependencyGraphFetchSbomReportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependency-graph/generate-sbom-report` may expose through its typed
   * API exception.
   */
  public sealed interface DependencyGraphGenerateSbomReportError

  /**
   * Typed response alternatives for `dependency-graph/generate-sbom-report`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DependencyGraphGenerateSbomReportResponse {
    public class SuccessJson(
      public val json: InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphGenerateSbomReportResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphGenerateSbomReportResponse,
        DependencyGraphGenerateSbomReportError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphGenerateSbomReportResponse,
        DependencyGraphGenerateSbomReportError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependencyGraphGenerateSbomReportResponse
  }

  /**
   * Raised by `dependency-graph/generate-sbom-report` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class DependencyGraphGenerateSbomReportApiException(
    public val error: DependencyGraphGenerateSbomReportError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependency-graph/generate-sbom-report")

  private object DependencyGraphGenerateSbomReportResponseDecoder : SdkResponseAlternativeDecoder<DependencyGraphGenerateSbomReportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependencyGraphGenerateSbomReportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependencyGraphGenerateSbomReportResponse> = when {
      alternative.id == "dependency-graph/generate-sbom-report.response.alternative0" -> SdkResponseDecodeResult(
        value = DependencyGraphGenerateSbomReportResponse.SuccessJson(
          json = DependencyGraphCodecs.dependencyGraphGenerateSbomReportResponseCodecAlternative0Registry.select(listOf("dependency-graph/generate-sbom-report.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/generate-sbom-report.response.alternative1" -> SdkResponseDecodeResult(
        value = DependencyGraphGenerateSbomReportResponse.Http403Json(
          json = DependencyGraphCodecs.dependencyGraphGenerateSbomReportResponseCodecAlternative1Registry.select(listOf("dependency-graph/generate-sbom-report.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependency-graph/generate-sbom-report.response.alternative2" -> SdkResponseDecodeResult(
        value = DependencyGraphGenerateSbomReportResponse.Http404Json(
          json = DependencyGraphCodecs.dependencyGraphGenerateSbomReportResponseCodecAlternative2Registry.select(listOf("dependency-graph/generate-sbom-report.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependencyGraphGenerateSbomReportResponse = DependencyGraphGenerateSbomReportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val dependencyGraphCreateRepositorySnapshotMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependency-graph/create-repository-snapshot",
          method = "POST",
          path = "/repos/{owner}/{repo}/dependency-graph/snapshots",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposDependencyGraphSnapshotsPostResponse201JsonXee997226",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/create-repository-snapshot.response.alternative0",
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
        ) }

    internal val dependencyGraphDiffRangeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependency-graph/diff-range",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependency-graph/compare/{basehead}",
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
              id = "dependency-graph/diff-range.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/diff-range.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/diff-range.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/diff-range.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/diff-range.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/diff-range.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/diff-range.response.alternative6",
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

    internal val dependencyGraphExportSbomMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependency-graph/export-sbom",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependency-graph/sbom",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DependencyGraphSpdxSbom",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/export-sbom.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/export-sbom.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/export-sbom.response.alternative2",
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

    internal val dependencyGraphFetchSbomReportMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependency-graph/fetch-sbom-report",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependency-graph/sbom/fetch-report/{sbom_uuid}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/fetch-sbom-report.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 302),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/fetch-sbom-report.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/fetch-sbom-report.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/fetch-sbom-report.response.alternative3",
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

    internal val dependencyGraphGenerateSbomReportMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependency-graph/generate-sbom-report",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependency-graph/sbom/generate-report",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposDependencyGraphSbomGenerateReportGetResponse201JsonXb9362c24",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/generate-sbom-report.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/generate-sbom-report.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependency-graph/generate-sbom-report.response.alternative2",
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
