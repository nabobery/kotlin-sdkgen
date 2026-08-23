package com.nabobery.sdkgen.github.generated.checks

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.CheckAnnotation
import com.nabobery.sdkgen.github.generated.CheckRun
import com.nabobery.sdkgen.github.generated.CheckSuite
import com.nabobery.sdkgen.github.generated.CheckSuitePreference
import com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPatchRequestJsonX9fb4a358
import com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPostRequestJsonX2b96f697
import com.nabobery.sdkgen.github.generated.InlineReposCheckRunsPostRequestJsonX2b96f697Serializer
import com.nabobery.sdkgen.github.generated.InlineReposCheckSuitesCheckRunsGetParameterXe1020699
import com.nabobery.sdkgen.github.generated.InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe
import com.nabobery.sdkgen.github.generated.InlineReposCheckSuitesPostRequestJsonXa1e94bbb
import com.nabobery.sdkgen.github.generated.InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd
import com.nabobery.sdkgen.github.generated.InlineReposCommitsCheckRunsGetParameterXdccb6404
import com.nabobery.sdkgen.github.generated.InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f
import com.nabobery.sdkgen.github.generated.InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177
import com.nabobery.sdkgen.github.generated.InlineStatusParameterX8d584d89
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
import kotlinx.serialization.json.JsonObject

internal object ChecksCodecs {
  internal const val CHECKSCREATE_REQUEST_CODEC_ID: String = "checks/create.request"

  private val checksCreateRequestCodec: MediaTypeCodec<InlineReposCheckRunsPostRequestJsonX2b96f697>
      =
      KotlinxSerializationCodec(CHECKSCREATE_REQUEST_CODEC_ID, InlineReposCheckRunsPostRequestJsonX2b96f697Serializer, SdkJson)

  internal const val CHECKSCREATE_RESPONSE_CODEC_ID: String = "checks/create.response"

  private val checksCreateResponseCodec: MediaTypeCodec<CheckRun> =
      KotlinxSerializationCodec(CHECKSCREATE_RESPONSE_CODEC_ID, CheckRun.Serializer, SdkJson)

  private val checksCreateResponseCodecAlternative0Codec: MediaTypeCodec<CheckRun> =
      KotlinxSerializationCodec("checks/create.response.alternative0", CheckRun.Serializer, SdkJson)

  internal val checksCreateResponseCodecAlternative0Registry: MediaTypeCodecRegistry<CheckRun> =
      MediaTypeCodecRegistry.of(checksCreateResponseCodecAlternative0Codec)

  internal val checksCreateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCheckRunsPostRequestJsonX2b96f697> =
      MediaTypeCodecRegistry.of(checksCreateRequestCodec)

  internal val checksCreateResponseCodecRegistry: MediaTypeCodecRegistry<CheckRun> =
      MediaTypeCodecRegistry.of(checksCreateResponseCodec)

  internal const val CHECKSCREATESUITE_REQUEST_CODEC_ID: String = "checks/create-suite.request"

  private val checksCreateSuiteRequestCodec:
      MediaTypeCodec<InlineReposCheckSuitesPostRequestJsonXa1e94bbb> =
      KotlinxSerializationCodec(CHECKSCREATESUITE_REQUEST_CODEC_ID, InlineReposCheckSuitesPostRequestJsonXa1e94bbb.Serializer, SdkJson)

  internal const val CHECKSCREATESUITE_RESPONSE_CODEC_ID: String = "checks/create-suite.response"

  private val checksCreateSuiteResponseCodec: MediaTypeCodec<CheckSuite> =
      KotlinxSerializationCodec(CHECKSCREATESUITE_RESPONSE_CODEC_ID, CheckSuite.Serializer, SdkJson)

  private val checksCreateSuiteResponseCodecAlternative0Codec: MediaTypeCodec<CheckSuite> =
      KotlinxSerializationCodec("checks/create-suite.response.alternative0", CheckSuite.Serializer, SdkJson)

  internal val checksCreateSuiteResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CheckSuite> =
      MediaTypeCodecRegistry.of(checksCreateSuiteResponseCodecAlternative0Codec)

  private val checksCreateSuiteResponseCodecAlternative1Codec: MediaTypeCodec<CheckSuite> =
      KotlinxSerializationCodec("checks/create-suite.response.alternative1", CheckSuite.Serializer, SdkJson)

  internal val checksCreateSuiteResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<CheckSuite> =
      MediaTypeCodecRegistry.of(checksCreateSuiteResponseCodecAlternative1Codec)

  internal val checksCreateSuiteRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCheckSuitesPostRequestJsonXa1e94bbb> =
      MediaTypeCodecRegistry.of(checksCreateSuiteRequestCodec)

  internal val checksCreateSuiteResponseCodecRegistry: MediaTypeCodecRegistry<CheckSuite> =
      MediaTypeCodecRegistry.of(checksCreateSuiteResponseCodec)

  internal const val CHECKSGET_RESPONSE_CODEC_ID: String = "checks/get.response"

  private val checksGetResponseCodec: MediaTypeCodec<CheckRun> =
      KotlinxSerializationCodec(CHECKSGET_RESPONSE_CODEC_ID, CheckRun.Serializer, SdkJson)

  private val checksGetResponseCodecAlternative0Codec: MediaTypeCodec<CheckRun> =
      KotlinxSerializationCodec("checks/get.response.alternative0", CheckRun.Serializer, SdkJson)

  internal val checksGetResponseCodecAlternative0Registry: MediaTypeCodecRegistry<CheckRun> =
      MediaTypeCodecRegistry.of(checksGetResponseCodecAlternative0Codec)

  internal val checksGetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val checksGetResponseCodecRegistry: MediaTypeCodecRegistry<CheckRun> =
      MediaTypeCodecRegistry.of(checksGetResponseCodec)

  internal const val CHECKSGETSUITE_RESPONSE_CODEC_ID: String = "checks/get-suite.response"

  private val checksGetSuiteResponseCodec: MediaTypeCodec<CheckSuite> =
      KotlinxSerializationCodec(CHECKSGETSUITE_RESPONSE_CODEC_ID, CheckSuite.Serializer, SdkJson)

  private val checksGetSuiteResponseCodecAlternative0Codec: MediaTypeCodec<CheckSuite> =
      KotlinxSerializationCodec("checks/get-suite.response.alternative0", CheckSuite.Serializer, SdkJson)

  internal val checksGetSuiteResponseCodecAlternative0Registry: MediaTypeCodecRegistry<CheckSuite> =
      MediaTypeCodecRegistry.of(checksGetSuiteResponseCodecAlternative0Codec)

  internal val checksGetSuiteRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val checksGetSuiteResponseCodecRegistry: MediaTypeCodecRegistry<CheckSuite> =
      MediaTypeCodecRegistry.of(checksGetSuiteResponseCodec)

  internal const val CHECKSLISTANNOTATIONS_RESPONSE_CODEC_ID: String =
      "checks/list-annotations.response"

  private val checksListAnnotationsResponseCodec: MediaTypeCodec<List<CheckAnnotation>> =
      KotlinxSerializationCodec(CHECKSLISTANNOTATIONS_RESPONSE_CODEC_ID, ListSerializer(CheckAnnotation.Serializer), SdkJson)

  private val checksListAnnotationsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CheckAnnotation>> =
      KotlinxSerializationCodec("checks/list-annotations.response.alternative0", ListSerializer(CheckAnnotation.Serializer), SdkJson)

  internal val checksListAnnotationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CheckAnnotation>> =
      MediaTypeCodecRegistry.of(checksListAnnotationsResponseCodecAlternative0Codec)

  internal val checksListAnnotationsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val checksListAnnotationsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CheckAnnotation>> =
      MediaTypeCodecRegistry.of(checksListAnnotationsResponseCodec)

  internal const val CHECKSLISTFORREF_RESPONSE_CODEC_ID: String = "checks/list-for-ref.response"

  private val checksListForRefResponseCodec:
      MediaTypeCodec<InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f> =
      KotlinxSerializationCodec(CHECKSLISTFORREF_RESPONSE_CODEC_ID, InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f.Serializer, SdkJson)

  private val checksListForRefResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f> =
      KotlinxSerializationCodec("checks/list-for-ref.response.alternative0", InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f.Serializer, SdkJson)

  internal val checksListForRefResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f> =
      MediaTypeCodecRegistry.of(checksListForRefResponseCodecAlternative0Codec)

  internal val checksListForRefRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val checksListForRefResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f> =
      MediaTypeCodecRegistry.of(checksListForRefResponseCodec)

  internal const val CHECKSLISTFORSUITE_RESPONSE_CODEC_ID: String = "checks/list-for-suite.response"

  private val checksListForSuiteResponseCodec:
      MediaTypeCodec<InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe> =
      KotlinxSerializationCodec(CHECKSLISTFORSUITE_RESPONSE_CODEC_ID, InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe.Serializer, SdkJson)

  private val checksListForSuiteResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe> =
      KotlinxSerializationCodec("checks/list-for-suite.response.alternative0", InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe.Serializer, SdkJson)

  internal val checksListForSuiteResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe> =
      MediaTypeCodecRegistry.of(checksListForSuiteResponseCodecAlternative0Codec)

  internal val checksListForSuiteRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val checksListForSuiteResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe> =
      MediaTypeCodecRegistry.of(checksListForSuiteResponseCodec)

  internal const val CHECKSLISTSUITESFORREF_RESPONSE_CODEC_ID: String =
      "checks/list-suites-for-ref.response"

  private val checksListSuitesForRefResponseCodec:
      MediaTypeCodec<InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177> =
      KotlinxSerializationCodec(CHECKSLISTSUITESFORREF_RESPONSE_CODEC_ID, InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177.Serializer, SdkJson)

  private val checksListSuitesForRefResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177> =
      KotlinxSerializationCodec("checks/list-suites-for-ref.response.alternative0", InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177.Serializer, SdkJson)

  internal val checksListSuitesForRefResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177> =
      MediaTypeCodecRegistry.of(checksListSuitesForRefResponseCodecAlternative0Codec)

  internal val checksListSuitesForRefRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val checksListSuitesForRefResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177> =
      MediaTypeCodecRegistry.of(checksListSuitesForRefResponseCodec)

  internal const val CHECKSREREQUESTRUN_RESPONSE_CODEC_ID: String = "checks/rerequest-run.response"

  private val checksRerequestRunResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(CHECKSREREQUESTRUN_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val checksRerequestRunResponseCodecAlternative0Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("checks/rerequest-run.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val checksRerequestRunResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(checksRerequestRunResponseCodecAlternative0Codec)

  private val checksRerequestRunResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("checks/rerequest-run.response.alternative1", BasicError.Serializer, SdkJson)

  internal val checksRerequestRunResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(checksRerequestRunResponseCodecAlternative1Codec)

  private val checksRerequestRunResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("checks/rerequest-run.response.alternative2", BasicError.Serializer, SdkJson)

  internal val checksRerequestRunResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(checksRerequestRunResponseCodecAlternative2Codec)

  private val checksRerequestRunResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("checks/rerequest-run.response.alternative3", BasicError.Serializer, SdkJson)

  internal val checksRerequestRunResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(checksRerequestRunResponseCodecAlternative3Codec)

  internal val checksRerequestRunRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val checksRerequestRunResponseCodecRegistry: MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(checksRerequestRunResponseCodec)

  internal const val CHECKSREREQUESTSUITE_RESPONSE_CODEC_ID: String =
      "checks/rerequest-suite.response"

  private val checksRerequestSuiteResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(CHECKSREREQUESTSUITE_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val checksRerequestSuiteResponseCodecAlternative0Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("checks/rerequest-suite.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val checksRerequestSuiteResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(checksRerequestSuiteResponseCodecAlternative0Codec)

  internal val checksRerequestSuiteRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val checksRerequestSuiteResponseCodecRegistry: MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(checksRerequestSuiteResponseCodec)

  internal const val CHECKSSETSUITESPREFERENCES_REQUEST_CODEC_ID: String =
      "checks/set-suites-preferences.request"

  private val checksSetSuitesPreferencesRequestCodec:
      MediaTypeCodec<InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd> =
      KotlinxSerializationCodec(CHECKSSETSUITESPREFERENCES_REQUEST_CODEC_ID, InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd.Serializer, SdkJson)

  internal const val CHECKSSETSUITESPREFERENCES_RESPONSE_CODEC_ID: String =
      "checks/set-suites-preferences.response"

  private val checksSetSuitesPreferencesResponseCodec: MediaTypeCodec<CheckSuitePreference> =
      KotlinxSerializationCodec(CHECKSSETSUITESPREFERENCES_RESPONSE_CODEC_ID, CheckSuitePreference.Serializer, SdkJson)

  private val checksSetSuitesPreferencesResponseCodecAlternative0Codec:
      MediaTypeCodec<CheckSuitePreference> =
      KotlinxSerializationCodec("checks/set-suites-preferences.response.alternative0", CheckSuitePreference.Serializer, SdkJson)

  internal val checksSetSuitesPreferencesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CheckSuitePreference> =
      MediaTypeCodecRegistry.of(checksSetSuitesPreferencesResponseCodecAlternative0Codec)

  internal val checksSetSuitesPreferencesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd> =
      MediaTypeCodecRegistry.of(checksSetSuitesPreferencesRequestCodec)

  internal val checksSetSuitesPreferencesResponseCodecRegistry:
      MediaTypeCodecRegistry<CheckSuitePreference> =
      MediaTypeCodecRegistry.of(checksSetSuitesPreferencesResponseCodec)

  internal const val CHECKSUPDATE_REQUEST_CODEC_ID: String = "checks/update.request"

  private val checksUpdateRequestCodec:
      MediaTypeCodec<InlineReposCheckRunsPatchRequestJsonX9fb4a358> =
      KotlinxSerializationCodec(CHECKSUPDATE_REQUEST_CODEC_ID, InlineReposCheckRunsPatchRequestJsonX9fb4a358.Serializer, SdkJson)

  internal const val CHECKSUPDATE_RESPONSE_CODEC_ID: String = "checks/update.response"

  private val checksUpdateResponseCodec: MediaTypeCodec<CheckRun> =
      KotlinxSerializationCodec(CHECKSUPDATE_RESPONSE_CODEC_ID, CheckRun.Serializer, SdkJson)

  private val checksUpdateResponseCodecAlternative0Codec: MediaTypeCodec<CheckRun> =
      KotlinxSerializationCodec("checks/update.response.alternative0", CheckRun.Serializer, SdkJson)

  internal val checksUpdateResponseCodecAlternative0Registry: MediaTypeCodecRegistry<CheckRun> =
      MediaTypeCodecRegistry.of(checksUpdateResponseCodecAlternative0Codec)

  internal val checksUpdateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCheckRunsPatchRequestJsonX9fb4a358> =
      MediaTypeCodecRegistry.of(checksUpdateRequestCodec)

  internal val checksUpdateResponseCodecRegistry: MediaTypeCodecRegistry<CheckRun> =
      MediaTypeCodecRegistry.of(checksUpdateResponseCodec)
}

/**
 * Client for the 'checks' group of GitHub v3 REST API.
 */
public class ChecksClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ChecksClient.authentication)

  /**
   * Creates a new check run for a specific commit in a repository.
   *
   * To create a check run, you must use a GitHub App. OAuth apps and authenticated users are not able to create a check
   * suite.
   *
   * In a check suite, GitHub limits the number of check runs with the same name to 1000. Once these check runs exceed
   * 1000, GitHub will start to automatically delete older check runs.
   *
   * > [!NOTE]
   * > The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to
   * a branch in a forked repository are not detected and return an empty `pull_requests` array.
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
  public suspend fun checksCreate(
    request: InlineReposCheckRunsPostRequestJsonX2b96f697,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CheckRun = executor.execute<InlineReposCheckRunsPostRequestJsonX2b96f697, CheckRun>(SdkExecutionRequest(checksCreateMetadata, baseUri, request, listOf(ChecksCodecs.CHECKSCREATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(ChecksCodecs.CHECKSCREATE_RESPONSE_CODEC_ID), ChecksCodecs.checksCreateRequestCodecRegistry, ChecksCodecs.checksCreateResponseCodecRegistry, options)

  /**
   * Creates a new check run for a specific commit in a repository.
   *
   * To create a check run, you must use a GitHub App. OAuth apps and authenticated users are not able to create a check
   * suite.
   *
   * In a check suite, GitHub limits the number of check runs with the same name to 1000. Once these check runs exceed
   * 1000, GitHub will start to automatically delete older check runs.
   *
   * > [!NOTE]
   * > The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to
   * a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun checksCreateWithResponse(
    request: InlineReposCheckRunsPostRequestJsonX2b96f697,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksCreateResponse> = executor.executeWithResponse<InlineReposCheckRunsPostRequestJsonX2b96f697, ChecksCreateResponse>(SdkExecutionRequest(checksCreateMetadata, baseUri, request, listOf(ChecksCodecs.CHECKSCREATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ChecksCodecs.checksCreateRequestCodecRegistry, ChecksCreateResponseDecoder, options)

  /**
   * Creates a check suite manually. By default, check suites are automatically created when you create a [check
   * run](https://docs.github.com/rest/checks/runs). You only need to use this endpoint for manually creating check
   * suites when you've disabled automatic creation using "[Update repository preferences for check
   * suites](https://docs.github.com/rest/checks/suites#update-repository-preferences-for-check-suites)".
   *
   * > [!NOTE]
   * > The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to
   * a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for
   * `head_branch`.
   *
   * OAuth apps and personal access tokens (classic) cannot use this endpoint.
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
  public suspend fun checksCreateSuite(
    request: InlineReposCheckSuitesPostRequestJsonXa1e94bbb,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CheckSuite = executor.execute<InlineReposCheckSuitesPostRequestJsonXa1e94bbb, CheckSuite>(SdkExecutionRequest(checksCreateSuiteMetadata, baseUri, request, listOf(ChecksCodecs.CHECKSCREATESUITE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(ChecksCodecs.CHECKSCREATESUITE_RESPONSE_CODEC_ID), ChecksCodecs.checksCreateSuiteRequestCodecRegistry, ChecksCodecs.checksCreateSuiteResponseCodecRegistry, options)

  /**
   * Creates a check suite manually. By default, check suites are automatically created when you create a [check
   * run](https://docs.github.com/rest/checks/runs). You only need to use this endpoint for manually creating check
   * suites when you've disabled automatic creation using "[Update repository preferences for check
   * suites](https://docs.github.com/rest/checks/suites#update-repository-preferences-for-check-suites)".
   *
   * > [!NOTE]
   * > The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to
   * a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for
   * `head_branch`.
   *
   * OAuth apps and personal access tokens (classic) cannot use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun checksCreateSuiteWithResponse(
    request: InlineReposCheckSuitesPostRequestJsonXa1e94bbb,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksCreateSuiteResponse> = executor.executeWithResponse<InlineReposCheckSuitesPostRequestJsonXa1e94bbb, ChecksCreateSuiteResponse>(SdkExecutionRequest(checksCreateSuiteMetadata, baseUri, request, listOf(ChecksCodecs.CHECKSCREATESUITE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ChecksCodecs.checksCreateSuiteRequestCodecRegistry, ChecksCreateSuiteResponseDecoder, options)

  /**
   * Gets a single check run using its `id`.
   *
   * > [!NOTE]
   * > The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to
   * a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * @param checkRunId The unique identifier of the check run.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksGet(
    checkRunId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CheckRun = executor.execute<Unit, CheckRun>(SdkExecutionRequest(checksGetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_run_id", values = listOf(checkRunId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(ChecksCodecs.CHECKSGET_RESPONSE_CODEC_ID), ChecksCodecs.checksGetRequestCodecRegistry, ChecksCodecs.checksGetResponseCodecRegistry, options)

  /**
   * Gets a single check run using its `id`.
   *
   * > [!NOTE]
   * > The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to
   * a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param checkRunId The unique identifier of the check run.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun checksGetWithResponse(
    checkRunId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksGetResponse> = executor.executeWithResponse<Unit, ChecksGetResponse>(SdkExecutionRequest(checksGetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_run_id", values = listOf(checkRunId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ChecksCodecs.checksGetRequestCodecRegistry, ChecksGetResponseDecoder, options)

  /**
   * Gets a single check suite using its `id`.
   *
   * > [!NOTE]
   * > The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to
   * a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for
   * `head_branch`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * @param checkSuiteId The unique identifier of the check suite.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksGetSuite(
    checkSuiteId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CheckSuite = executor.execute<Unit, CheckSuite>(SdkExecutionRequest(checksGetSuiteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_suite_id", values = listOf(checkSuiteId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(ChecksCodecs.CHECKSGETSUITE_RESPONSE_CODEC_ID), ChecksCodecs.checksGetSuiteRequestCodecRegistry, ChecksCodecs.checksGetSuiteResponseCodecRegistry, options)

  /**
   * Gets a single check suite using its `id`.
   *
   * > [!NOTE]
   * > The Checks API only looks for pushes in the repository where the check suite or check run were created. Pushes to
   * a branch in a forked repository are not detected and return an empty `pull_requests` array and a `null` value for
   * `head_branch`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param checkSuiteId The unique identifier of the check suite.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun checksGetSuiteWithResponse(
    checkSuiteId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksGetSuiteResponse> = executor.executeWithResponse<Unit, ChecksGetSuiteResponse>(SdkExecutionRequest(checksGetSuiteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_suite_id", values = listOf(checkSuiteId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ChecksCodecs.checksGetSuiteRequestCodecRegistry, ChecksGetSuiteResponseDecoder, options)

  /**
   * Lists annotations for a check run using the annotation `id`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * @param checkRunId The unique identifier of the check run.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksListAnnotations(
    checkRunId: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<CheckAnnotation> = executor.execute<Unit, List<CheckAnnotation>>(SdkExecutionRequest(checksListAnnotationsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_run_id", values = listOf(checkRunId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ChecksCodecs.CHECKSLISTANNOTATIONS_RESPONSE_CODEC_ID), ChecksCodecs.checksListAnnotationsRequestCodecRegistry, ChecksCodecs.checksListAnnotationsResponseCodecRegistry, options)

  /**
   * Lists annotations for a check run using the annotation `id`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param checkRunId The unique identifier of the check run.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun checksListAnnotationsWithResponse(
    checkRunId: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksListAnnotationsResponse> = executor.executeWithResponse<Unit, ChecksListAnnotationsResponse>(SdkExecutionRequest(checksListAnnotationsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_run_id", values = listOf(checkRunId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ChecksCodecs.checksListAnnotationsRequestCodecRegistry, ChecksListAnnotationsResponseDecoder, options)

  /**
   * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name.
   *
   * > [!NOTE]
   * > The endpoints to manage checks only look for pushes in the repository where the check suite or check run were
   * created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * If there are more than 1000 check suites on a single git reference, this endpoint will limit check runs to the 1000
   * most recent check suites. To iterate over all possible check runs, use the [List check suites for a Git
   * reference](https://docs.github.com/rest/reference/checks#list-check-suites-for-a-git-reference) endpoint and
   * provide the `check_suite_id` parameter to the [List check runs in a check
   * suite](https://docs.github.com/rest/reference/checks#list-check-runs-in-a-check-suite) endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name
   * (`tags/TAG_NAME`). For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param appId Wire parameter `app_id`.
   * @param checkName Returns check runs with the specified `name`.
   * @param filter Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status Returns check runs with the specified `status`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksListForRef(
    owner: String,
    ref: String,
    repo: String,
    appId: Int? = null,
    checkName: String? = null,
    filter: InlineReposCommitsCheckRunsGetParameterXdccb6404? = null,
    page: Int? = null,
    perPage: Int? = null,
    status: InlineStatusParameterX8d584d89? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f = executor.execute<Unit, InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f>(SdkExecutionRequest(checksListForRefMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "app_id", values = appId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "check_name", values = checkName?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "filter", values = filter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ChecksCodecs.CHECKSLISTFORREF_RESPONSE_CODEC_ID), ChecksCodecs.checksListForRefRequestCodecRegistry, ChecksCodecs.checksListForRefResponseCodecRegistry, options)

  /**
   * Lists check runs for a commit ref. The `ref` can be a SHA, branch name, or a tag name.
   *
   * > [!NOTE]
   * > The endpoints to manage checks only look for pushes in the repository where the check suite or check run were
   * created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * If there are more than 1000 check suites on a single git reference, this endpoint will limit check runs to the 1000
   * most recent check suites. To iterate over all possible check runs, use the [List check suites for a Git
   * reference](https://docs.github.com/rest/reference/checks#list-check-suites-for-a-git-reference) endpoint and
   * provide the `check_suite_id` parameter to the [List check runs in a check
   * suite](https://docs.github.com/rest/reference/checks#list-check-runs-in-a-check-suite) endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name
   * (`tags/TAG_NAME`). For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param appId Wire parameter `app_id`.
   * @param checkName Returns check runs with the specified `name`.
   * @param filter Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status Returns check runs with the specified `status`.
   * @param options Execution options.
   */
  public suspend fun checksListForRefWithResponse(
    owner: String,
    ref: String,
    repo: String,
    appId: Int? = null,
    checkName: String? = null,
    filter: InlineReposCommitsCheckRunsGetParameterXdccb6404? = null,
    page: Int? = null,
    perPage: Int? = null,
    status: InlineStatusParameterX8d584d89? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksListForRefResponse> = executor.executeWithResponse<Unit, ChecksListForRefResponse>(SdkExecutionRequest(checksListForRefMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "app_id", values = appId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "check_name", values = checkName?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "filter", values = filter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), ChecksCodecs.checksListForRefRequestCodecRegistry, ChecksListForRefResponseDecoder, options)

  /**
   * Lists check runs for a check suite using its `id`.
   *
   * > [!NOTE]
   * > The endpoints to manage checks only look for pushes in the repository where the check suite or check run were
   * created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * @param checkSuiteId The unique identifier of the check suite.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param checkName Returns check runs with the specified `name`.
   * @param filter Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status Returns check runs with the specified `status`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksListForSuite(
    checkSuiteId: Int,
    owner: String,
    repo: String,
    checkName: String? = null,
    filter: InlineReposCheckSuitesCheckRunsGetParameterXe1020699? = null,
    page: Int? = null,
    perPage: Int? = null,
    status: InlineStatusParameterX8d584d89? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe = executor.execute<Unit, InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe>(SdkExecutionRequest(checksListForSuiteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_suite_id", values = listOf(checkSuiteId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "check_name", values = checkName?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "filter", values = filter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ChecksCodecs.CHECKSLISTFORSUITE_RESPONSE_CODEC_ID), ChecksCodecs.checksListForSuiteRequestCodecRegistry, ChecksCodecs.checksListForSuiteResponseCodecRegistry, options)

  /**
   * Lists check runs for a check suite using its `id`.
   *
   * > [!NOTE]
   * > The endpoints to manage checks only look for pushes in the repository where the check suite or check run were
   * created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param checkSuiteId The unique identifier of the check suite.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param checkName Returns check runs with the specified `name`.
   * @param filter Filters check runs by their `completed_at` timestamp. `latest` returns the most recent check runs.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status Returns check runs with the specified `status`.
   * @param options Execution options.
   */
  public suspend fun checksListForSuiteWithResponse(
    checkSuiteId: Int,
    owner: String,
    repo: String,
    checkName: String? = null,
    filter: InlineReposCheckSuitesCheckRunsGetParameterXe1020699? = null,
    page: Int? = null,
    perPage: Int? = null,
    status: InlineStatusParameterX8d584d89? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksListForSuiteResponse> = executor.executeWithResponse<Unit, ChecksListForSuiteResponse>(SdkExecutionRequest(checksListForSuiteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_suite_id", values = listOf(checkSuiteId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "check_name", values = checkName?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "filter", values = filter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), ChecksCodecs.checksListForSuiteRequestCodecRegistry, ChecksListForSuiteResponseDecoder, options)

  /**
   * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name.
   *
   * > [!NOTE]
   * > The endpoints to manage checks only look for pushes in the repository where the check suite or check run were
   * created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a
   * `null` value for `head_branch`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name
   * (`tags/TAG_NAME`). For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param appId Filters check suites by GitHub App `id`.
   * @param checkName Returns check runs with the specified `name`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksListSuitesForRef(
    owner: String,
    ref: String,
    repo: String,
    appId: Int? = null,
    checkName: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177 = executor.execute<Unit, InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177>(SdkExecutionRequest(checksListSuitesForRefMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "app_id", values = appId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "check_name", values = checkName?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ChecksCodecs.CHECKSLISTSUITESFORREF_RESPONSE_CODEC_ID), ChecksCodecs.checksListSuitesForRefRequestCodecRegistry, ChecksCodecs.checksListSuitesForRefResponseCodecRegistry, options)

  /**
   * Lists check suites for a commit `ref`. The `ref` can be a SHA, branch name, or a tag name.
   *
   * > [!NOTE]
   * > The endpoints to manage checks only look for pushes in the repository where the check suite or check run were
   * created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array and a
   * `null` value for `head_branch`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint on a private
   * repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param ref The commit reference. Can be a commit SHA, branch name (`heads/BRANCH_NAME`), or tag name
   * (`tags/TAG_NAME`). For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param appId Filters check suites by GitHub App `id`.
   * @param checkName Returns check runs with the specified `name`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun checksListSuitesForRefWithResponse(
    owner: String,
    ref: String,
    repo: String,
    appId: Int? = null,
    checkName: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksListSuitesForRefResponse> = executor.executeWithResponse<Unit, ChecksListSuitesForRefResponse>(SdkExecutionRequest(checksListSuitesForRefMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ref", values = listOf(ref.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "app_id", values = appId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "check_name", values = checkName?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ChecksCodecs.checksListSuitesForRefRequestCodecRegistry, ChecksListSuitesForRefResponseDecoder, options)

  /**
   * Triggers GitHub to rerequest an existing check run, without pushing new code to a repository. This endpoint will
   * trigger the [`check_run` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) event with the action
   * `rerequested`. When a check run is `rerequested`, the `status` of the check suite it belongs to is reset to
   * `queued` and the `conclusion` is cleared. The check run itself is not updated. GitHub apps recieving the
   * [`check_run` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) with the `rerequested` action
   * should then decide if the check run should be reset or updated and call the [update `check_run`
   * endpoint](https://docs.github.com/rest/checks/runs#update-a-check-run) to update the check_run if desired.
   *
   * For more information about how to re-run GitHub Actions jobs, see "[Re-run a job from a workflow
   * run](https://docs.github.com/rest/actions/workflow-runs#re-run-a-job-from-a-workflow-run)".
   *
   * @param checkRunId The unique identifier of the check run.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ChecksRerequestRunApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ChecksRerequestRunError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksRerequestRun(
    checkRunId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.executeWithTypedErrors<Unit, ChecksRerequestRunResponse, JsonObject>(
    request = SdkExecutionRequest(checksRerequestRunMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_run_id", values = listOf(checkRunId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = ChecksCodecs.checksRerequestRunRequestCodecRegistry,
    responseDecoder = ChecksRerequestRunResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ChecksRerequestRunResponse.SuccessJson -> response.json
        is ChecksRerequestRunResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ChecksRerequestRunResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ChecksRerequestRunResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ChecksRerequestRunResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ChecksRerequestRunResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ChecksRerequestRunResponse.Http403Json -> ChecksRerequestRunApiException(response, statusCode, headers)
        is ChecksRerequestRunResponse.Http404Json -> ChecksRerequestRunApiException(response, statusCode, headers)
        is ChecksRerequestRunResponse.Http422Json -> ChecksRerequestRunApiException(response, statusCode, headers)
        is ChecksRerequestRunResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Triggers GitHub to rerequest an existing check run, without pushing new code to a repository. This endpoint will
   * trigger the [`check_run` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) event with the action
   * `rerequested`. When a check run is `rerequested`, the `status` of the check suite it belongs to is reset to
   * `queued` and the `conclusion` is cleared. The check run itself is not updated. GitHub apps recieving the
   * [`check_run` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) with the `rerequested` action
   * should then decide if the check run should be reset or updated and call the [update `check_run`
   * endpoint](https://docs.github.com/rest/checks/runs#update-a-check-run) to update the check_run if desired.
   *
   * For more information about how to re-run GitHub Actions jobs, see "[Re-run a job from a workflow
   * run](https://docs.github.com/rest/actions/workflow-runs#re-run-a-job-from-a-workflow-run)".
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param checkRunId The unique identifier of the check run.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun checksRerequestRunWithResponse(
    checkRunId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksRerequestRunResponse> = executor.executeWithResponse<Unit, ChecksRerequestRunResponse>(SdkExecutionRequest(checksRerequestRunMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_run_id", values = listOf(checkRunId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ChecksCodecs.checksRerequestRunRequestCodecRegistry, ChecksRerequestRunResponseDecoder, options)

  /**
   * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will
   * trigger the [`check_suite` webhook](https://docs.github.com/webhooks/event-payloads/#check_suite) event with the
   * action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion`
   * is cleared.
   *
   * @param checkSuiteId The unique identifier of the check suite.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksRerequestSuite(
    checkSuiteId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.execute<Unit, JsonObject>(SdkExecutionRequest(checksRerequestSuiteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_suite_id", values = listOf(checkSuiteId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(ChecksCodecs.CHECKSREREQUESTSUITE_RESPONSE_CODEC_ID), ChecksCodecs.checksRerequestSuiteRequestCodecRegistry, ChecksCodecs.checksRerequestSuiteResponseCodecRegistry, options)

  /**
   * Triggers GitHub to rerequest an existing check suite, without pushing new code to a repository. This endpoint will
   * trigger the [`check_suite` webhook](https://docs.github.com/webhooks/event-payloads/#check_suite) event with the
   * action `rerequested`. When a check suite is `rerequested`, its `status` is reset to `queued` and the `conclusion`
   * is cleared.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param checkSuiteId The unique identifier of the check suite.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun checksRerequestSuiteWithResponse(
    checkSuiteId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksRerequestSuiteResponse> = executor.executeWithResponse<Unit, ChecksRerequestSuiteResponse>(SdkExecutionRequest(checksRerequestSuiteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_suite_id", values = listOf(checkSuiteId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ChecksCodecs.checksRerequestSuiteRequestCodecRegistry, ChecksRerequestSuiteResponseDecoder, options)

  /**
   * Changes the default automatic flow when creating check suites. By default, a check suite is automatically created
   * each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually
   * [Create a check suite](https://docs.github.com/rest/checks/suites#create-a-check-suite).
   * You must have admin permissions in the repository to set preferences for check suites.
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
  public suspend fun checksSetSuitesPreferences(
    request: InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CheckSuitePreference = executor.execute<InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd, CheckSuitePreference>(SdkExecutionRequest(checksSetSuitesPreferencesMetadata, baseUri, request, listOf(ChecksCodecs.CHECKSSETSUITESPREFERENCES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(ChecksCodecs.CHECKSSETSUITESPREFERENCES_RESPONSE_CODEC_ID), ChecksCodecs.checksSetSuitesPreferencesRequestCodecRegistry, ChecksCodecs.checksSetSuitesPreferencesResponseCodecRegistry, options)

  /**
   * Changes the default automatic flow when creating check suites. By default, a check suite is automatically created
   * each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually
   * [Create a check suite](https://docs.github.com/rest/checks/suites#create-a-check-suite).
   * You must have admin permissions in the repository to set preferences for check suites.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun checksSetSuitesPreferencesWithResponse(
    request: InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksSetSuitesPreferencesResponse> = executor.executeWithResponse<InlineReposCheckSuitesPreferencesPatchRequestJsonXabce1dbd, ChecksSetSuitesPreferencesResponse>(SdkExecutionRequest(checksSetSuitesPreferencesMetadata, baseUri, request, listOf(ChecksCodecs.CHECKSSETSUITESPREFERENCES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ChecksCodecs.checksSetSuitesPreferencesRequestCodecRegistry, ChecksSetSuitesPreferencesResponseDecoder, options)

  /**
   * Updates a check run for a specific commit in a repository.
   *
   * > [!NOTE]
   * > The endpoints to manage checks only look for pushes in the repository where the check suite or check run were
   * created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * OAuth apps and personal access tokens (classic) cannot use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param checkRunId The unique identifier of the check run.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun checksUpdate(
    request: InlineReposCheckRunsPatchRequestJsonX9fb4a358,
    checkRunId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CheckRun = executor.execute<InlineReposCheckRunsPatchRequestJsonX9fb4a358, CheckRun>(SdkExecutionRequest(checksUpdateMetadata, baseUri, request, listOf(ChecksCodecs.CHECKSUPDATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_run_id", values = listOf(checkRunId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(ChecksCodecs.CHECKSUPDATE_RESPONSE_CODEC_ID), ChecksCodecs.checksUpdateRequestCodecRegistry, ChecksCodecs.checksUpdateResponseCodecRegistry, options)

  /**
   * Updates a check run for a specific commit in a repository.
   *
   * > [!NOTE]
   * > The endpoints to manage checks only look for pushes in the repository where the check suite or check run were
   * created. Pushes to a branch in a forked repository are not detected and return an empty `pull_requests` array.
   *
   * OAuth apps and personal access tokens (classic) cannot use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param checkRunId The unique identifier of the check run.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun checksUpdateWithResponse(
    request: InlineReposCheckRunsPatchRequestJsonX9fb4a358,
    checkRunId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ChecksUpdateResponse> = executor.executeWithResponse<InlineReposCheckRunsPatchRequestJsonX9fb4a358, ChecksUpdateResponse>(SdkExecutionRequest(checksUpdateMetadata, baseUri, request, listOf(ChecksCodecs.CHECKSUPDATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "check_run_id", values = listOf(checkRunId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), ChecksCodecs.checksUpdateRequestCodecRegistry, ChecksUpdateResponseDecoder, options)

  /**
   * Typed response alternatives for `checks/create`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ChecksCreateResponse {
    public class SuccessJson(
      public val json: CheckRun,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksCreateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksCreateResponse
  }

  private object ChecksCreateResponseDecoder : SdkResponseAlternativeDecoder<ChecksCreateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksCreateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksCreateResponse> = when {
      alternative.id == "checks/create.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksCreateResponse.SuccessJson(
          json = ChecksCodecs.checksCreateResponseCodecAlternative0Registry.select(listOf("checks/create.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksCreateResponse = ChecksCreateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/create-suite`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ChecksCreateSuiteResponse {
    public class SuccessJson(
      public val json: CheckSuite,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksCreateSuiteResponse

    public class SuccessJson2(
      public val json: CheckSuite,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksCreateSuiteResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksCreateSuiteResponse
  }

  private object ChecksCreateSuiteResponseDecoder : SdkResponseAlternativeDecoder<ChecksCreateSuiteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksCreateSuiteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksCreateSuiteResponse> = when {
      alternative.id == "checks/create-suite.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksCreateSuiteResponse.SuccessJson(
          json = ChecksCodecs.checksCreateSuiteResponseCodecAlternative0Registry.select(listOf("checks/create-suite.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "checks/create-suite.response.alternative1" -> SdkResponseDecodeResult(
        value = ChecksCreateSuiteResponse.SuccessJson2(
          json = ChecksCodecs.checksCreateSuiteResponseCodecAlternative1Registry.select(listOf("checks/create-suite.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksCreateSuiteResponse = ChecksCreateSuiteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/get`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ChecksGetResponse {
    public class SuccessJson(
      public val json: CheckRun,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksGetResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksGetResponse
  }

  private object ChecksGetResponseDecoder : SdkResponseAlternativeDecoder<ChecksGetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksGetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksGetResponse> = when {
      alternative.id == "checks/get.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksGetResponse.SuccessJson(
          json = ChecksCodecs.checksGetResponseCodecAlternative0Registry.select(listOf("checks/get.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksGetResponse = ChecksGetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/get-suite`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ChecksGetSuiteResponse {
    public class SuccessJson(
      public val json: CheckSuite,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksGetSuiteResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksGetSuiteResponse
  }

  private object ChecksGetSuiteResponseDecoder : SdkResponseAlternativeDecoder<ChecksGetSuiteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksGetSuiteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksGetSuiteResponse> = when {
      alternative.id == "checks/get-suite.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksGetSuiteResponse.SuccessJson(
          json = ChecksCodecs.checksGetSuiteResponseCodecAlternative0Registry.select(listOf("checks/get-suite.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksGetSuiteResponse = ChecksGetSuiteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/list-annotations`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ChecksListAnnotationsResponse {
    public class SuccessJson(
      public val json: List<CheckAnnotation>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksListAnnotationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksListAnnotationsResponse
  }

  private object ChecksListAnnotationsResponseDecoder : SdkResponseAlternativeDecoder<ChecksListAnnotationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksListAnnotationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksListAnnotationsResponse> = when {
      alternative.id == "checks/list-annotations.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksListAnnotationsResponse.SuccessJson(
          json = ChecksCodecs.checksListAnnotationsResponseCodecAlternative0Registry.select(listOf("checks/list-annotations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksListAnnotationsResponse = ChecksListAnnotationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/list-for-ref`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ChecksListForRefResponse {
    public class SuccessJson(
      public val json: InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksListForRefResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksListForRefResponse
  }

  private object ChecksListForRefResponseDecoder : SdkResponseAlternativeDecoder<ChecksListForRefResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksListForRefResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksListForRefResponse> = when {
      alternative.id == "checks/list-for-ref.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksListForRefResponse.SuccessJson(
          json = ChecksCodecs.checksListForRefResponseCodecAlternative0Registry.select(listOf("checks/list-for-ref.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksListForRefResponse = ChecksListForRefResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/list-for-suite`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ChecksListForSuiteResponse {
    public class SuccessJson(
      public val json: InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksListForSuiteResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksListForSuiteResponse
  }

  private object ChecksListForSuiteResponseDecoder : SdkResponseAlternativeDecoder<ChecksListForSuiteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksListForSuiteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksListForSuiteResponse> = when {
      alternative.id == "checks/list-for-suite.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksListForSuiteResponse.SuccessJson(
          json = ChecksCodecs.checksListForSuiteResponseCodecAlternative0Registry.select(listOf("checks/list-for-suite.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksListForSuiteResponse = ChecksListForSuiteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/list-suites-for-ref`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ChecksListSuitesForRefResponse {
    public class SuccessJson(
      public val json: InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksListSuitesForRefResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksListSuitesForRefResponse
  }

  private object ChecksListSuitesForRefResponseDecoder : SdkResponseAlternativeDecoder<ChecksListSuitesForRefResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksListSuitesForRefResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksListSuitesForRefResponse> = when {
      alternative.id == "checks/list-suites-for-ref.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksListSuitesForRefResponse.SuccessJson(
          json = ChecksCodecs.checksListSuitesForRefResponseCodecAlternative0Registry.select(listOf("checks/list-suites-for-ref.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksListSuitesForRefResponse = ChecksListSuitesForRefResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `checks/rerequest-run` may expose through its typed API exception.
   */
  public sealed interface ChecksRerequestRunError

  /**
   * Typed response alternatives for `checks/rerequest-run`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ChecksRerequestRunResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksRerequestRunResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksRerequestRunResponse,
        ChecksRerequestRunError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksRerequestRunResponse,
        ChecksRerequestRunError

    public class Http422Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksRerequestRunResponse,
        ChecksRerequestRunError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksRerequestRunResponse
  }

  /**
   * Raised by `checks/rerequest-run` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ChecksRerequestRunApiException(
    public val error: ChecksRerequestRunError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "checks/rerequest-run")

  private object ChecksRerequestRunResponseDecoder : SdkResponseAlternativeDecoder<ChecksRerequestRunResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksRerequestRunResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksRerequestRunResponse> = when {
      alternative.id == "checks/rerequest-run.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksRerequestRunResponse.SuccessJson(
          json = ChecksCodecs.checksRerequestRunResponseCodecAlternative0Registry.select(listOf("checks/rerequest-run.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "checks/rerequest-run.response.alternative1" -> SdkResponseDecodeResult(
        value = ChecksRerequestRunResponse.Http403Json(
          json = ChecksCodecs.checksRerequestRunResponseCodecAlternative1Registry.select(listOf("checks/rerequest-run.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "checks/rerequest-run.response.alternative2" -> SdkResponseDecodeResult(
        value = ChecksRerequestRunResponse.Http404Json(
          json = ChecksCodecs.checksRerequestRunResponseCodecAlternative2Registry.select(listOf("checks/rerequest-run.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "checks/rerequest-run.response.alternative3" -> SdkResponseDecodeResult(
        value = ChecksRerequestRunResponse.Http422Json(
          json = ChecksCodecs.checksRerequestRunResponseCodecAlternative3Registry.select(listOf("checks/rerequest-run.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksRerequestRunResponse = ChecksRerequestRunResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/rerequest-suite`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ChecksRerequestSuiteResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksRerequestSuiteResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksRerequestSuiteResponse
  }

  private object ChecksRerequestSuiteResponseDecoder : SdkResponseAlternativeDecoder<ChecksRerequestSuiteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksRerequestSuiteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksRerequestSuiteResponse> = when {
      alternative.id == "checks/rerequest-suite.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksRerequestSuiteResponse.SuccessJson(
          json = ChecksCodecs.checksRerequestSuiteResponseCodecAlternative0Registry.select(listOf("checks/rerequest-suite.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksRerequestSuiteResponse = ChecksRerequestSuiteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/set-suites-preferences`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ChecksSetSuitesPreferencesResponse {
    public class SuccessJson(
      public val json: CheckSuitePreference,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksSetSuitesPreferencesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksSetSuitesPreferencesResponse
  }

  private object ChecksSetSuitesPreferencesResponseDecoder : SdkResponseAlternativeDecoder<ChecksSetSuitesPreferencesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksSetSuitesPreferencesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksSetSuitesPreferencesResponse> = when {
      alternative.id == "checks/set-suites-preferences.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksSetSuitesPreferencesResponse.SuccessJson(
          json = ChecksCodecs.checksSetSuitesPreferencesResponseCodecAlternative0Registry.select(listOf("checks/set-suites-preferences.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksSetSuitesPreferencesResponse = ChecksSetSuitesPreferencesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `checks/update`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ChecksUpdateResponse {
    public class SuccessJson(
      public val json: CheckRun,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksUpdateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ChecksUpdateResponse
  }

  private object ChecksUpdateResponseDecoder : SdkResponseAlternativeDecoder<ChecksUpdateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ChecksUpdateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ChecksUpdateResponse> = when {
      alternative.id == "checks/update.response.alternative0" -> SdkResponseDecodeResult(
        value = ChecksUpdateResponse.SuccessJson(
          json = ChecksCodecs.checksUpdateResponseCodecAlternative0Registry.select(listOf("checks/update.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ChecksUpdateResponse = ChecksUpdateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val checksCreateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/create",
          method = "POST",
          path = "/repos/{owner}/{repo}/check-runs",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckRun",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/create.response.alternative0",
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

    internal val checksCreateSuiteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/create-suite",
          method = "POST",
          path = "/repos/{owner}/{repo}/check-suites",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckSuite",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/create-suite.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckSuite",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/create-suite.response.alternative1",
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

    internal val checksGetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/get",
          method = "GET",
          path = "/repos/{owner}/{repo}/check-runs/{check_run_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckRun",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/get.response.alternative0",
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

    internal val checksGetSuiteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/get-suite",
          method = "GET",
          path = "/repos/{owner}/{repo}/check-suites/{check_suite_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckSuite",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/get-suite.response.alternative0",
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

    internal val checksListAnnotationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/list-annotations",
          method = "GET",
          path = "/repos/{owner}/{repo}/check-runs/{check_run_id}/annotations",
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
              id = "checks/list-annotations.response.alternative0",
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

    internal val checksListForRefMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/list-for-ref",
          method = "GET",
          path = "/repos/{owner}/{repo}/commits/{ref}/check-runs",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCommitsCheckRunsGetResponse200JsonXd1ec007f",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/list-for-ref.response.alternative0",
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

    internal val checksListForSuiteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/list-for-suite",
          method = "GET",
          path = "/repos/{owner}/{repo}/check-suites/{check_suite_id}/check-runs",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCheckSuitesCheckRunsGetResponse200JsonX86903cfe",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/list-for-suite.response.alternative0",
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

    internal val checksListSuitesForRefMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/list-suites-for-ref",
          method = "GET",
          path = "/repos/{owner}/{repo}/commits/{ref}/check-suites",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCommitsCheckSuitesGetResponse200JsonX48ed4177",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/list-suites-for-ref.response.alternative0",
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

    internal val checksRerequestRunMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/rerequest-run",
          method = "POST",
          path = "/repos/{owner}/{repo}/check-runs/{check_run_id}/rerequest",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/rerequest-run.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/rerequest-run.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/rerequest-run.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/rerequest-run.response.alternative3",
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

    internal val checksRerequestSuiteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/rerequest-suite",
          method = "POST",
          path = "/repos/{owner}/{repo}/check-suites/{check_suite_id}/rerequest",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/rerequest-suite.response.alternative0",
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

    internal val checksSetSuitesPreferencesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/set-suites-preferences",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/check-suites/preferences",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckSuitePreference",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/set-suites-preferences.response.alternative0",
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

    internal val checksUpdateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "checks/update",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/check-runs/{check_run_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CheckRun",
              mode = SdkResponseMode.BUFFERED,
              id = "checks/update.response.alternative0",
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
  }
}
