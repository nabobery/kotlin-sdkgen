package io.github.nabobery.sdkgen.github.generated.codescanning

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
import io.github.nabobery.sdkgen.github.generated.CodeScanningAlert
import io.github.nabobery.sdkgen.github.generated.CodeScanningAlertInstanceList
import io.github.nabobery.sdkgen.github.generated.CodeScanningAlertItems
import io.github.nabobery.sdkgen.github.generated.CodeScanningAlertSeverity
import io.github.nabobery.sdkgen.github.generated.CodeScanningAlertStateQuery
import io.github.nabobery.sdkgen.github.generated.CodeScanningAnalysis
import io.github.nabobery.sdkgen.github.generated.CodeScanningAnalysisDeletion
import io.github.nabobery.sdkgen.github.generated.CodeScanningAutofix
import io.github.nabobery.sdkgen.github.generated.CodeScanningAutofixCommits
import io.github.nabobery.sdkgen.github.generated.CodeScanningAutofixCommitsResponse
import io.github.nabobery.sdkgen.github.generated.CodeScanningCodeqlDatabase
import io.github.nabobery.sdkgen.github.generated.CodeScanningDefaultSetup
import io.github.nabobery.sdkgen.github.generated.CodeScanningDefaultSetupUpdate
import io.github.nabobery.sdkgen.github.generated.CodeScanningDefaultSetupUpdateResponse
import io.github.nabobery.sdkgen.github.generated.CodeScanningOrganizationAlertItems
import io.github.nabobery.sdkgen.github.generated.CodeScanningSarifsReceipt
import io.github.nabobery.sdkgen.github.generated.CodeScanningSarifsStatus
import io.github.nabobery.sdkgen.github.generated.CodeScanningVariantAnalysis
import io.github.nabobery.sdkgen.github.generated.CodeScanningVariantAnalysisRepoTask
import io.github.nabobery.sdkgen.github.generated.InlineDirectionParameterX3053723f
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeScanningAlertsGetParameterX915a7987
import io.github.nabobery.sdkgen.github.generated.InlineReposCodeScanningAlertsGetParameterXccb2c4bc
import io.github.nabobery.sdkgen.github.generated.InlineReposCodeScanningAlertsPatchRequestJsonX81128345
import io.github.nabobery.sdkgen.github.generated.InlineReposCodeScanningAnalysesGetParameterX2203addf
import io.github.nabobery.sdkgen.github.generated.InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab
import io.github.nabobery.sdkgen.github.generated.InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abSerializer
import io.github.nabobery.sdkgen.github.generated.InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b
import io.github.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import io.github.nabobery.sdkgen.github.generated.ScimError
import io.github.nabobery.sdkgen.github.generated.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.json.JsonObject

internal object CodeScanningCodecs {
  internal const val CODESCANNINGCOMMITAUTOFIX_REQUEST_CODEC_ID: String =
      "code-scanning/commit-autofix.request"

  private val codeScanningCommitAutofixRequestCodec: MediaTypeCodec<CodeScanningAutofixCommits?> =
      KotlinxSerializationCodec(CODESCANNINGCOMMITAUTOFIX_REQUEST_CODEC_ID, CodeScanningAutofixCommits.Serializer.nullable, SdkJson)

  internal const val CODESCANNINGCOMMITAUTOFIX_RESPONSE_CODEC_ID: String =
      "code-scanning/commit-autofix.response"

  private val codeScanningCommitAutofixResponseCodec:
      MediaTypeCodec<CodeScanningAutofixCommitsResponse> =
      KotlinxSerializationCodec(CODESCANNINGCOMMITAUTOFIX_RESPONSE_CODEC_ID, CodeScanningAutofixCommitsResponse.Serializer, SdkJson)

  private val codeScanningCommitAutofixResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningAutofixCommitsResponse> =
      KotlinxSerializationCodec("code-scanning/commit-autofix.response.alternative0", CodeScanningAutofixCommitsResponse.Serializer, SdkJson)

  internal val codeScanningCommitAutofixResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningAutofixCommitsResponse> =
      MediaTypeCodecRegistry.of(codeScanningCommitAutofixResponseCodecAlternative0Codec)

  private val codeScanningCommitAutofixResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/commit-autofix.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningCommitAutofixResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCommitAutofixResponseCodecAlternative1Codec)

  private val codeScanningCommitAutofixResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/commit-autofix.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningCommitAutofixResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCommitAutofixResponseCodecAlternative2Codec)

  private val codeScanningCommitAutofixResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/commit-autofix.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningCommitAutofixResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCommitAutofixResponseCodecAlternative3Codec)

  private val codeScanningCommitAutofixResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/commit-autofix.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningCommitAutofixResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningCommitAutofixResponseCodecAlternative5Codec)

  internal val codeScanningCommitAutofixRequestCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningAutofixCommits?> =
      MediaTypeCodecRegistry.of(codeScanningCommitAutofixRequestCodec)

  internal val codeScanningCommitAutofixResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningAutofixCommitsResponse> =
      MediaTypeCodecRegistry.of(codeScanningCommitAutofixResponseCodec)

  internal const val CODESCANNINGCREATEAUTOFIX_RESPONSE_CODEC_ID: String =
      "code-scanning/create-autofix.response"

  private val codeScanningCreateAutofixResponseCodec: MediaTypeCodec<CodeScanningAutofix> =
      KotlinxSerializationCodec(CODESCANNINGCREATEAUTOFIX_RESPONSE_CODEC_ID, CodeScanningAutofix.Serializer, SdkJson)

  private val codeScanningCreateAutofixResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningAutofix> =
      KotlinxSerializationCodec("code-scanning/create-autofix.response.alternative0", CodeScanningAutofix.Serializer, SdkJson)

  internal val codeScanningCreateAutofixResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningAutofix> =
      MediaTypeCodecRegistry.of(codeScanningCreateAutofixResponseCodecAlternative0Codec)

  private val codeScanningCreateAutofixResponseCodecAlternative1Codec:
      MediaTypeCodec<CodeScanningAutofix> =
      KotlinxSerializationCodec("code-scanning/create-autofix.response.alternative1", CodeScanningAutofix.Serializer, SdkJson)

  internal val codeScanningCreateAutofixResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<CodeScanningAutofix> =
      MediaTypeCodecRegistry.of(codeScanningCreateAutofixResponseCodecAlternative1Codec)

  private val codeScanningCreateAutofixResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/create-autofix.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningCreateAutofixResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCreateAutofixResponseCodecAlternative2Codec)

  private val codeScanningCreateAutofixResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/create-autofix.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningCreateAutofixResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCreateAutofixResponseCodecAlternative3Codec)

  private val codeScanningCreateAutofixResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/create-autofix.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeScanningCreateAutofixResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCreateAutofixResponseCodecAlternative4Codec)

  private val codeScanningCreateAutofixResponseCodecAlternative6Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/create-autofix.response.alternative6", BasicError.Serializer, SdkJson)

  internal val codeScanningCreateAutofixResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCreateAutofixResponseCodecAlternative6Codec)

  internal val codeScanningCreateAutofixRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningCreateAutofixResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningAutofix> =
      MediaTypeCodecRegistry.of(codeScanningCreateAutofixResponseCodec)

  internal const val CODESCANNINGCREATEVARIANTANALYSIS_REQUEST_CODEC_ID: String =
      "code-scanning/create-variant-analysis.request"

  private val codeScanningCreateVariantAnalysisRequestCodec:
      MediaTypeCodec<InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab> =
      KotlinxSerializationCodec(CODESCANNINGCREATEVARIANTANALYSIS_REQUEST_CODEC_ID, InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abSerializer, SdkJson)

  internal const val CODESCANNINGCREATEVARIANTANALYSIS_RESPONSE_CODEC_ID: String =
      "code-scanning/create-variant-analysis.response"

  private val codeScanningCreateVariantAnalysisResponseCodec:
      MediaTypeCodec<CodeScanningVariantAnalysis> =
      KotlinxSerializationCodec(CODESCANNINGCREATEVARIANTANALYSIS_RESPONSE_CODEC_ID, CodeScanningVariantAnalysis.Serializer, SdkJson)

  private val codeScanningCreateVariantAnalysisResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningVariantAnalysis> =
      KotlinxSerializationCodec("code-scanning/create-variant-analysis.response.alternative0", CodeScanningVariantAnalysis.Serializer, SdkJson)

  internal val codeScanningCreateVariantAnalysisResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningVariantAnalysis> =
      MediaTypeCodecRegistry.of(codeScanningCreateVariantAnalysisResponseCodecAlternative0Codec)

  private val codeScanningCreateVariantAnalysisResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/create-variant-analysis.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningCreateVariantAnalysisResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCreateVariantAnalysisResponseCodecAlternative1Codec)

  private val codeScanningCreateVariantAnalysisResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/create-variant-analysis.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningCreateVariantAnalysisResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningCreateVariantAnalysisResponseCodecAlternative2Codec)

  private val codeScanningCreateVariantAnalysisResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/create-variant-analysis.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningCreateVariantAnalysisResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningCreateVariantAnalysisResponseCodecAlternative3Codec)

  internal val codeScanningCreateVariantAnalysisRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab> =
      MediaTypeCodecRegistry.of(codeScanningCreateVariantAnalysisRequestCodec)

  internal val codeScanningCreateVariantAnalysisResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningVariantAnalysis> =
      MediaTypeCodecRegistry.of(codeScanningCreateVariantAnalysisResponseCodec)

  internal const val CODESCANNINGDELETEANALYSIS_RESPONSE_CODEC_ID: String =
      "code-scanning/delete-analysis.response"

  private val codeScanningDeleteAnalysisResponseCodec: MediaTypeCodec<CodeScanningAnalysisDeletion>
      =
      KotlinxSerializationCodec(CODESCANNINGDELETEANALYSIS_RESPONSE_CODEC_ID, CodeScanningAnalysisDeletion.Serializer, SdkJson)

  private val codeScanningDeleteAnalysisResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningAnalysisDeletion> =
      KotlinxSerializationCodec("code-scanning/delete-analysis.response.alternative0", CodeScanningAnalysisDeletion.Serializer, SdkJson)

  internal val codeScanningDeleteAnalysisResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningAnalysisDeletion> =
      MediaTypeCodecRegistry.of(codeScanningDeleteAnalysisResponseCodecAlternative0Codec)

  private val codeScanningDeleteAnalysisResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/delete-analysis.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningDeleteAnalysisResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningDeleteAnalysisResponseCodecAlternative1Codec)

  private val codeScanningDeleteAnalysisResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("code-scanning/delete-analysis.response.alternative2", ScimError.Serializer, SdkJson)

  internal val codeScanningDeleteAnalysisResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(codeScanningDeleteAnalysisResponseCodecAlternative2Codec)

  private val codeScanningDeleteAnalysisResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/delete-analysis.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningDeleteAnalysisResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningDeleteAnalysisResponseCodecAlternative3Codec)

  private val codeScanningDeleteAnalysisResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/delete-analysis.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeScanningDeleteAnalysisResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningDeleteAnalysisResponseCodecAlternative4Codec)

  private val codeScanningDeleteAnalysisResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/delete-analysis.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningDeleteAnalysisResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningDeleteAnalysisResponseCodecAlternative5Codec)

  internal val codeScanningDeleteAnalysisRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningDeleteAnalysisResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningAnalysisDeletion> =
      MediaTypeCodecRegistry.of(codeScanningDeleteAnalysisResponseCodec)

  private val codeScanningDeleteCodeqlDatabaseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/delete-codeql-database.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningDeleteCodeqlDatabaseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningDeleteCodeqlDatabaseResponseCodecAlternative1Codec)

  private val codeScanningDeleteCodeqlDatabaseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/delete-codeql-database.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningDeleteCodeqlDatabaseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningDeleteCodeqlDatabaseResponseCodecAlternative2Codec)

  private val codeScanningDeleteCodeqlDatabaseResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/delete-codeql-database.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningDeleteCodeqlDatabaseResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningDeleteCodeqlDatabaseResponseCodecAlternative3Codec)

  internal val codeScanningDeleteCodeqlDatabaseRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningDeleteCodeqlDatabaseResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val CODESCANNINGGETALERT_RESPONSE_CODEC_ID: String =
      "code-scanning/get-alert.response"

  private val codeScanningGetAlertResponseCodec: MediaTypeCodec<CodeScanningAlert> =
      KotlinxSerializationCodec(CODESCANNINGGETALERT_RESPONSE_CODEC_ID, CodeScanningAlert.Serializer, SdkJson)

  private val codeScanningGetAlertResponseCodecAlternative0Codec: MediaTypeCodec<CodeScanningAlert>
      =
      KotlinxSerializationCodec("code-scanning/get-alert.response.alternative0", CodeScanningAlert.Serializer, SdkJson)

  internal val codeScanningGetAlertResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningAlert> =
      MediaTypeCodecRegistry.of(codeScanningGetAlertResponseCodecAlternative0Codec)

  private val codeScanningGetAlertResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-alert.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAlertResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAlertResponseCodecAlternative2Codec)

  private val codeScanningGetAlertResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-alert.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAlertResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAlertResponseCodecAlternative3Codec)

  private val codeScanningGetAlertResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/get-alert.response.alternative4", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningGetAlertResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningGetAlertResponseCodecAlternative4Codec)

  internal val codeScanningGetAlertRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningGetAlertResponseCodecRegistry: MediaTypeCodecRegistry<CodeScanningAlert>
      = MediaTypeCodecRegistry.of(codeScanningGetAlertResponseCodec)

  private val codeScanningGetAnalysisResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningAnalysis> =
      KotlinxSerializationCodec("code-scanning/get-analysis.response.alternative0", CodeScanningAnalysis.Serializer, SdkJson)

  internal val codeScanningGetAnalysisResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningAnalysis> =
      MediaTypeCodecRegistry.of(codeScanningGetAnalysisResponseCodecAlternative0Codec)

  private val codeScanningGetAnalysisResponseCodecAlternative1Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("code-scanning/get-analysis.response.alternative1", JsonObject.serializer(), SdkJson)

  internal val codeScanningGetAnalysisResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(codeScanningGetAnalysisResponseCodecAlternative1Codec)

  private val codeScanningGetAnalysisResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-analysis.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAnalysisResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAnalysisResponseCodecAlternative2Codec)

  private val codeScanningGetAnalysisResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-analysis.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAnalysisResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAnalysisResponseCodecAlternative3Codec)

  private val codeScanningGetAnalysisResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-analysis.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAnalysisResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAnalysisResponseCodecAlternative4Codec)

  private val codeScanningGetAnalysisResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/get-analysis.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningGetAnalysisResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningGetAnalysisResponseCodecAlternative5Codec)

  internal val codeScanningGetAnalysisRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val CODESCANNINGGETAUTOFIX_RESPONSE_CODEC_ID: String =
      "code-scanning/get-autofix.response"

  private val codeScanningGetAutofixResponseCodec: MediaTypeCodec<CodeScanningAutofix> =
      KotlinxSerializationCodec(CODESCANNINGGETAUTOFIX_RESPONSE_CODEC_ID, CodeScanningAutofix.Serializer, SdkJson)

  private val codeScanningGetAutofixResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningAutofix> =
      KotlinxSerializationCodec("code-scanning/get-autofix.response.alternative0", CodeScanningAutofix.Serializer, SdkJson)

  internal val codeScanningGetAutofixResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningAutofix> =
      MediaTypeCodecRegistry.of(codeScanningGetAutofixResponseCodecAlternative0Codec)

  private val codeScanningGetAutofixResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-autofix.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAutofixResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAutofixResponseCodecAlternative1Codec)

  private val codeScanningGetAutofixResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-autofix.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAutofixResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAutofixResponseCodecAlternative2Codec)

  private val codeScanningGetAutofixResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-autofix.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAutofixResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAutofixResponseCodecAlternative3Codec)

  private val codeScanningGetAutofixResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-autofix.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeScanningGetAutofixResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetAutofixResponseCodecAlternative4Codec)

  internal val codeScanningGetAutofixRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningGetAutofixResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningAutofix> =
      MediaTypeCodecRegistry.of(codeScanningGetAutofixResponseCodec)

  internal const val CODESCANNINGGETCODEQLDATABASE_RESPONSE_CODEC_ID: String =
      "code-scanning/get-codeql-database.response"

  private val codeScanningGetCodeqlDatabaseResponseCodec: MediaTypeCodec<CodeScanningCodeqlDatabase>
      =
      KotlinxSerializationCodec(CODESCANNINGGETCODEQLDATABASE_RESPONSE_CODEC_ID, CodeScanningCodeqlDatabase.Serializer, SdkJson)

  private val codeScanningGetCodeqlDatabaseResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningCodeqlDatabase> =
      KotlinxSerializationCodec("code-scanning/get-codeql-database.response.alternative0", CodeScanningCodeqlDatabase.Serializer, SdkJson)

  internal val codeScanningGetCodeqlDatabaseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningCodeqlDatabase> =
      MediaTypeCodecRegistry.of(codeScanningGetCodeqlDatabaseResponseCodecAlternative0Codec)

  private val codeScanningGetCodeqlDatabaseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-codeql-database.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningGetCodeqlDatabaseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetCodeqlDatabaseResponseCodecAlternative2Codec)

  private val codeScanningGetCodeqlDatabaseResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-codeql-database.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningGetCodeqlDatabaseResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetCodeqlDatabaseResponseCodecAlternative3Codec)

  private val codeScanningGetCodeqlDatabaseResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/get-codeql-database.response.alternative4", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningGetCodeqlDatabaseResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningGetCodeqlDatabaseResponseCodecAlternative4Codec)

  internal val codeScanningGetCodeqlDatabaseRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningGetCodeqlDatabaseResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningCodeqlDatabase> =
      MediaTypeCodecRegistry.of(codeScanningGetCodeqlDatabaseResponseCodec)

  internal const val CODESCANNINGGETDEFAULTSETUP_RESPONSE_CODEC_ID: String =
      "code-scanning/get-default-setup.response"

  private val codeScanningGetDefaultSetupResponseCodec: MediaTypeCodec<CodeScanningDefaultSetup> =
      KotlinxSerializationCodec(CODESCANNINGGETDEFAULTSETUP_RESPONSE_CODEC_ID, CodeScanningDefaultSetup.Serializer, SdkJson)

  private val codeScanningGetDefaultSetupResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningDefaultSetup> =
      KotlinxSerializationCodec("code-scanning/get-default-setup.response.alternative0", CodeScanningDefaultSetup.Serializer, SdkJson)

  internal val codeScanningGetDefaultSetupResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningDefaultSetup> =
      MediaTypeCodecRegistry.of(codeScanningGetDefaultSetupResponseCodecAlternative0Codec)

  private val codeScanningGetDefaultSetupResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("code-scanning/get-default-setup.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningGetDefaultSetupResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetDefaultSetupResponseCodecAlternative1Codec)

  private val codeScanningGetDefaultSetupResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("code-scanning/get-default-setup.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningGetDefaultSetupResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetDefaultSetupResponseCodecAlternative2Codec)

  private val codeScanningGetDefaultSetupResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/get-default-setup.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningGetDefaultSetupResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningGetDefaultSetupResponseCodecAlternative3Codec)

  internal val codeScanningGetDefaultSetupRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningGetDefaultSetupResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningDefaultSetup> =
      MediaTypeCodecRegistry.of(codeScanningGetDefaultSetupResponseCodec)

  internal const val CODESCANNINGGETSARIF_RESPONSE_CODEC_ID: String =
      "code-scanning/get-sarif.response"

  private val codeScanningGetSarifResponseCodec: MediaTypeCodec<CodeScanningSarifsStatus> =
      KotlinxSerializationCodec(CODESCANNINGGETSARIF_RESPONSE_CODEC_ID, CodeScanningSarifsStatus.Serializer, SdkJson)

  private val codeScanningGetSarifResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningSarifsStatus> =
      KotlinxSerializationCodec("code-scanning/get-sarif.response.alternative0", CodeScanningSarifsStatus.Serializer, SdkJson)

  internal val codeScanningGetSarifResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningSarifsStatus> =
      MediaTypeCodecRegistry.of(codeScanningGetSarifResponseCodecAlternative0Codec)

  private val codeScanningGetSarifResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-sarif.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningGetSarifResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetSarifResponseCodecAlternative1Codec)

  private val codeScanningGetSarifResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/get-sarif.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningGetSarifResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningGetSarifResponseCodecAlternative3Codec)

  internal val codeScanningGetSarifRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningGetSarifResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningSarifsStatus> =
      MediaTypeCodecRegistry.of(codeScanningGetSarifResponseCodec)

  internal const val CODESCANNINGGETVARIANTANALYSIS_RESPONSE_CODEC_ID: String =
      "code-scanning/get-variant-analysis.response"

  private val codeScanningGetVariantAnalysisResponseCodec:
      MediaTypeCodec<CodeScanningVariantAnalysis> =
      KotlinxSerializationCodec(CODESCANNINGGETVARIANTANALYSIS_RESPONSE_CODEC_ID, CodeScanningVariantAnalysis.Serializer, SdkJson)

  private val codeScanningGetVariantAnalysisResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningVariantAnalysis> =
      KotlinxSerializationCodec("code-scanning/get-variant-analysis.response.alternative0", CodeScanningVariantAnalysis.Serializer, SdkJson)

  internal val codeScanningGetVariantAnalysisResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningVariantAnalysis> =
      MediaTypeCodecRegistry.of(codeScanningGetVariantAnalysisResponseCodecAlternative0Codec)

  private val codeScanningGetVariantAnalysisResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-variant-analysis.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningGetVariantAnalysisResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetVariantAnalysisResponseCodecAlternative1Codec)

  private val codeScanningGetVariantAnalysisResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/get-variant-analysis.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningGetVariantAnalysisResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningGetVariantAnalysisResponseCodecAlternative2Codec)

  internal val codeScanningGetVariantAnalysisRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningGetVariantAnalysisResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningVariantAnalysis> =
      MediaTypeCodecRegistry.of(codeScanningGetVariantAnalysisResponseCodec)

  internal const val CODESCANNINGGETVARIANTANALYSISREPOTASK_RESPONSE_CODEC_ID: String =
      "code-scanning/get-variant-analysis-repo-task.response"

  private val codeScanningGetVariantAnalysisRepoTaskResponseCodec:
      MediaTypeCodec<CodeScanningVariantAnalysisRepoTask> =
      KotlinxSerializationCodec(CODESCANNINGGETVARIANTANALYSISREPOTASK_RESPONSE_CODEC_ID, CodeScanningVariantAnalysisRepoTask.Serializer, SdkJson)

  private val codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningVariantAnalysisRepoTask> =
      KotlinxSerializationCodec("code-scanning/get-variant-analysis-repo-task.response.alternative0", CodeScanningVariantAnalysisRepoTask.Serializer, SdkJson)

  internal val codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningVariantAnalysisRepoTask> =
      MediaTypeCodecRegistry.of(codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative0Codec)

  private val codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/get-variant-analysis-repo-task.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative1Codec)

  private val codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/get-variant-analysis-repo-task.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative2Codec)

  internal val codeScanningGetVariantAnalysisRepoTaskRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val codeScanningGetVariantAnalysisRepoTaskResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningVariantAnalysisRepoTask> =
      MediaTypeCodecRegistry.of(codeScanningGetVariantAnalysisRepoTaskResponseCodec)

  internal const val CODESCANNINGLISTALERTINSTANCES_RESPONSE_CODEC_ID: String =
      "code-scanning/list-alert-instances.response"

  private val codeScanningListAlertInstancesResponseCodec:
      MediaTypeCodec<List<CodeScanningAlertInstanceList>> =
      KotlinxSerializationCodec(CODESCANNINGLISTALERTINSTANCES_RESPONSE_CODEC_ID, ListSerializer(CodeScanningAlertInstanceList.Serializer), SdkJson)

  private val codeScanningListAlertInstancesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeScanningAlertInstanceList>> =
      KotlinxSerializationCodec("code-scanning/list-alert-instances.response.alternative0", ListSerializer(CodeScanningAlertInstanceList.Serializer), SdkJson)

  internal val codeScanningListAlertInstancesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeScanningAlertInstanceList>> =
      MediaTypeCodecRegistry.of(codeScanningListAlertInstancesResponseCodecAlternative0Codec)

  private val codeScanningListAlertInstancesResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/list-alert-instances.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningListAlertInstancesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListAlertInstancesResponseCodecAlternative1Codec)

  private val codeScanningListAlertInstancesResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/list-alert-instances.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningListAlertInstancesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListAlertInstancesResponseCodecAlternative2Codec)

  private val codeScanningListAlertInstancesResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/list-alert-instances.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningListAlertInstancesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningListAlertInstancesResponseCodecAlternative3Codec)

  internal val codeScanningListAlertInstancesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningListAlertInstancesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeScanningAlertInstanceList>> =
      MediaTypeCodecRegistry.of(codeScanningListAlertInstancesResponseCodec)

  internal const val CODESCANNINGLISTALERTSFORORG_RESPONSE_CODEC_ID: String =
      "code-scanning/list-alerts-for-org.response"

  private val codeScanningListAlertsForOrgResponseCodec:
      MediaTypeCodec<List<CodeScanningOrganizationAlertItems>> =
      KotlinxSerializationCodec(CODESCANNINGLISTALERTSFORORG_RESPONSE_CODEC_ID, ListSerializer(CodeScanningOrganizationAlertItems.Serializer), SdkJson)

  private val codeScanningListAlertsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeScanningOrganizationAlertItems>> =
      KotlinxSerializationCodec("code-scanning/list-alerts-for-org.response.alternative0", ListSerializer(CodeScanningOrganizationAlertItems.Serializer), SdkJson)

  internal val codeScanningListAlertsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeScanningOrganizationAlertItems>> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForOrgResponseCodecAlternative0Codec)

  private val codeScanningListAlertsForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("code-scanning/list-alerts-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningListAlertsForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForOrgResponseCodecAlternative1Codec)

  private val codeScanningListAlertsForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/list-alerts-for-org.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningListAlertsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForOrgResponseCodecAlternative2Codec)

  internal val codeScanningListAlertsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningListAlertsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeScanningOrganizationAlertItems>> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForOrgResponseCodec)

  internal const val CODESCANNINGLISTALERTSFORREPO_RESPONSE_CODEC_ID: String =
      "code-scanning/list-alerts-for-repo.response"

  private val codeScanningListAlertsForRepoResponseCodec:
      MediaTypeCodec<List<CodeScanningAlertItems>> =
      KotlinxSerializationCodec(CODESCANNINGLISTALERTSFORREPO_RESPONSE_CODEC_ID, ListSerializer(CodeScanningAlertItems.Serializer), SdkJson)

  private val codeScanningListAlertsForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeScanningAlertItems>> =
      KotlinxSerializationCodec("code-scanning/list-alerts-for-repo.response.alternative0", ListSerializer(CodeScanningAlertItems.Serializer), SdkJson)

  internal val codeScanningListAlertsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeScanningAlertItems>> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForRepoResponseCodecAlternative0Codec)

  private val codeScanningListAlertsForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/list-alerts-for-repo.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningListAlertsForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForRepoResponseCodecAlternative2Codec)

  private val codeScanningListAlertsForRepoResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/list-alerts-for-repo.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningListAlertsForRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForRepoResponseCodecAlternative3Codec)

  private val codeScanningListAlertsForRepoResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/list-alerts-for-repo.response.alternative4", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningListAlertsForRepoResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForRepoResponseCodecAlternative4Codec)

  internal val codeScanningListAlertsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningListAlertsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeScanningAlertItems>> =
      MediaTypeCodecRegistry.of(codeScanningListAlertsForRepoResponseCodec)

  internal const val CODESCANNINGLISTCODEQLDATABASES_RESPONSE_CODEC_ID: String =
      "code-scanning/list-codeql-databases.response"

  private val codeScanningListCodeqlDatabasesResponseCodec:
      MediaTypeCodec<List<CodeScanningCodeqlDatabase>> =
      KotlinxSerializationCodec(CODESCANNINGLISTCODEQLDATABASES_RESPONSE_CODEC_ID, ListSerializer(CodeScanningCodeqlDatabase.Serializer), SdkJson)

  private val codeScanningListCodeqlDatabasesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeScanningCodeqlDatabase>> =
      KotlinxSerializationCodec("code-scanning/list-codeql-databases.response.alternative0", ListSerializer(CodeScanningCodeqlDatabase.Serializer), SdkJson)

  internal val codeScanningListCodeqlDatabasesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeScanningCodeqlDatabase>> =
      MediaTypeCodecRegistry.of(codeScanningListCodeqlDatabasesResponseCodecAlternative0Codec)

  private val codeScanningListCodeqlDatabasesResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/list-codeql-databases.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningListCodeqlDatabasesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListCodeqlDatabasesResponseCodecAlternative1Codec)

  private val codeScanningListCodeqlDatabasesResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/list-codeql-databases.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningListCodeqlDatabasesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListCodeqlDatabasesResponseCodecAlternative2Codec)

  private val codeScanningListCodeqlDatabasesResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/list-codeql-databases.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningListCodeqlDatabasesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningListCodeqlDatabasesResponseCodecAlternative3Codec)

  internal val codeScanningListCodeqlDatabasesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningListCodeqlDatabasesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeScanningCodeqlDatabase>> =
      MediaTypeCodecRegistry.of(codeScanningListCodeqlDatabasesResponseCodec)

  internal const val CODESCANNINGLISTRECENTANALYSES_RESPONSE_CODEC_ID: String =
      "code-scanning/list-recent-analyses.response"

  private val codeScanningListRecentAnalysesResponseCodec:
      MediaTypeCodec<List<CodeScanningAnalysis>> =
      KotlinxSerializationCodec(CODESCANNINGLISTRECENTANALYSES_RESPONSE_CODEC_ID, ListSerializer(CodeScanningAnalysis.Serializer), SdkJson)

  private val codeScanningListRecentAnalysesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeScanningAnalysis>> =
      KotlinxSerializationCodec("code-scanning/list-recent-analyses.response.alternative0", ListSerializer(CodeScanningAnalysis.Serializer), SdkJson)

  internal val codeScanningListRecentAnalysesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeScanningAnalysis>> =
      MediaTypeCodecRegistry.of(codeScanningListRecentAnalysesResponseCodecAlternative0Codec)

  private val codeScanningListRecentAnalysesResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/list-recent-analyses.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningListRecentAnalysesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListRecentAnalysesResponseCodecAlternative1Codec)

  private val codeScanningListRecentAnalysesResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/list-recent-analyses.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningListRecentAnalysesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningListRecentAnalysesResponseCodecAlternative2Codec)

  private val codeScanningListRecentAnalysesResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/list-recent-analyses.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningListRecentAnalysesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningListRecentAnalysesResponseCodecAlternative3Codec)

  internal val codeScanningListRecentAnalysesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeScanningListRecentAnalysesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeScanningAnalysis>> =
      MediaTypeCodecRegistry.of(codeScanningListRecentAnalysesResponseCodec)

  internal const val CODESCANNINGUPDATEALERT_REQUEST_CODEC_ID: String =
      "code-scanning/update-alert.request"

  private val codeScanningUpdateAlertRequestCodec:
      MediaTypeCodec<InlineReposCodeScanningAlertsPatchRequestJsonX81128345> =
      KotlinxSerializationCodec(CODESCANNINGUPDATEALERT_REQUEST_CODEC_ID, InlineReposCodeScanningAlertsPatchRequestJsonX81128345.Serializer, SdkJson)

  internal const val CODESCANNINGUPDATEALERT_RESPONSE_CODEC_ID: String =
      "code-scanning/update-alert.response"

  private val codeScanningUpdateAlertResponseCodec: MediaTypeCodec<CodeScanningAlert> =
      KotlinxSerializationCodec(CODESCANNINGUPDATEALERT_RESPONSE_CODEC_ID, CodeScanningAlert.Serializer, SdkJson)

  private val codeScanningUpdateAlertResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningAlert> =
      KotlinxSerializationCodec("code-scanning/update-alert.response.alternative0", CodeScanningAlert.Serializer, SdkJson)

  internal val codeScanningUpdateAlertResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningAlert> =
      MediaTypeCodecRegistry.of(codeScanningUpdateAlertResponseCodecAlternative0Codec)

  private val codeScanningUpdateAlertResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/update-alert.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeScanningUpdateAlertResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUpdateAlertResponseCodecAlternative1Codec)

  private val codeScanningUpdateAlertResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("code-scanning/update-alert.response.alternative2", ScimError.Serializer, SdkJson)

  internal val codeScanningUpdateAlertResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(codeScanningUpdateAlertResponseCodecAlternative2Codec)

  private val codeScanningUpdateAlertResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/update-alert.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningUpdateAlertResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUpdateAlertResponseCodecAlternative3Codec)

  private val codeScanningUpdateAlertResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/update-alert.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeScanningUpdateAlertResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUpdateAlertResponseCodecAlternative4Codec)

  private val codeScanningUpdateAlertResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/update-alert.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningUpdateAlertResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningUpdateAlertResponseCodecAlternative5Codec)

  internal val codeScanningUpdateAlertRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodeScanningAlertsPatchRequestJsonX81128345> =
      MediaTypeCodecRegistry.of(codeScanningUpdateAlertRequestCodec)

  internal val codeScanningUpdateAlertResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningAlert> =
      MediaTypeCodecRegistry.of(codeScanningUpdateAlertResponseCodec)

  internal const val CODESCANNINGUPDATEDEFAULTSETUP_REQUEST_CODEC_ID: String =
      "code-scanning/update-default-setup.request"

  private val codeScanningUpdateDefaultSetupRequestCodec:
      MediaTypeCodec<CodeScanningDefaultSetupUpdate> =
      KotlinxSerializationCodec(CODESCANNINGUPDATEDEFAULTSETUP_REQUEST_CODEC_ID, CodeScanningDefaultSetupUpdate.Serializer, SdkJson)

  private val codeScanningUpdateDefaultSetupResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("code-scanning/update-default-setup.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val codeScanningUpdateDefaultSetupResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(codeScanningUpdateDefaultSetupResponseCodecAlternative0Codec)

  private val codeScanningUpdateDefaultSetupResponseCodecAlternative1Codec:
      MediaTypeCodec<CodeScanningDefaultSetupUpdateResponse> =
      KotlinxSerializationCodec("code-scanning/update-default-setup.response.alternative1", CodeScanningDefaultSetupUpdateResponse.Serializer, SdkJson)

  internal val codeScanningUpdateDefaultSetupResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<CodeScanningDefaultSetupUpdateResponse> =
      MediaTypeCodecRegistry.of(codeScanningUpdateDefaultSetupResponseCodecAlternative1Codec)

  private val codeScanningUpdateDefaultSetupResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/update-default-setup.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningUpdateDefaultSetupResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUpdateDefaultSetupResponseCodecAlternative2Codec)

  private val codeScanningUpdateDefaultSetupResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/update-default-setup.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningUpdateDefaultSetupResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUpdateDefaultSetupResponseCodecAlternative3Codec)

  private val codeScanningUpdateDefaultSetupResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/update-default-setup.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeScanningUpdateDefaultSetupResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUpdateDefaultSetupResponseCodecAlternative4Codec)

  private val codeScanningUpdateDefaultSetupResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/update-default-setup.response.alternative5", BasicError.Serializer, SdkJson)

  internal val codeScanningUpdateDefaultSetupResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUpdateDefaultSetupResponseCodecAlternative5Codec)

  private val codeScanningUpdateDefaultSetupResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/update-default-setup.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningUpdateDefaultSetupResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningUpdateDefaultSetupResponseCodecAlternative6Codec)

  internal val codeScanningUpdateDefaultSetupRequestCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningDefaultSetupUpdate> =
      MediaTypeCodecRegistry.of(codeScanningUpdateDefaultSetupRequestCodec)

  internal const val CODESCANNINGUPLOADSARIF_REQUEST_CODEC_ID: String =
      "code-scanning/upload-sarif.request"

  private val codeScanningUploadSarifRequestCodec:
      MediaTypeCodec<InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b> =
      KotlinxSerializationCodec(CODESCANNINGUPLOADSARIF_REQUEST_CODEC_ID, InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b.Serializer, SdkJson)

  internal const val CODESCANNINGUPLOADSARIF_RESPONSE_CODEC_ID: String =
      "code-scanning/upload-sarif.response"

  private val codeScanningUploadSarifResponseCodec: MediaTypeCodec<CodeScanningSarifsReceipt> =
      KotlinxSerializationCodec(CODESCANNINGUPLOADSARIF_RESPONSE_CODEC_ID, CodeScanningSarifsReceipt.Serializer, SdkJson)

  private val codeScanningUploadSarifResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeScanningSarifsReceipt> =
      KotlinxSerializationCodec("code-scanning/upload-sarif.response.alternative0", CodeScanningSarifsReceipt.Serializer, SdkJson)

  internal val codeScanningUploadSarifResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeScanningSarifsReceipt> =
      MediaTypeCodecRegistry.of(codeScanningUploadSarifResponseCodecAlternative0Codec)

  private val codeScanningUploadSarifResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/upload-sarif.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeScanningUploadSarifResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUploadSarifResponseCodecAlternative2Codec)

  private val codeScanningUploadSarifResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-scanning/upload-sarif.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeScanningUploadSarifResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeScanningUploadSarifResponseCodecAlternative3Codec)

  private val codeScanningUploadSarifResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("code-scanning/upload-sarif.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val codeScanningUploadSarifResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(codeScanningUploadSarifResponseCodecAlternative5Codec)

  internal val codeScanningUploadSarifRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b> =
      MediaTypeCodecRegistry.of(codeScanningUploadSarifRequestCodec)

  internal val codeScanningUploadSarifResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeScanningSarifsReceipt> =
      MediaTypeCodecRegistry.of(codeScanningUploadSarifResponseCodec)
}

/**
 * Client for the 'code-scanning' group of GitHub v3 REST API.
 */
public class CodeScanningClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CodeScanningClient.authentication)

  /**
   * Commits an autofix for a code scanning alert from the repository's default branch.
   *
   * If an autofix is committed as a result of this request, then this endpoint will return a 201 Created response.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param request Request body sent to the operation.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningCommitAutofixApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeScanningCommitAutofixError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningCommitAutofix(
    request: CodeScanningAutofixCommits? = null,
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningAutofixCommitsResponse = executor.executeWithTypedErrors<CodeScanningAutofixCommits?, CodeScanningCommitAutofixResponse, CodeScanningAutofixCommitsResponse>(
    request = SdkExecutionRequest(codeScanningCommitAutofixMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGCOMMITAUTOFIX_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningCommitAutofixRequestCodecRegistry,
    responseDecoder = CodeScanningCommitAutofixResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningCommitAutofixResponse.SuccessJson -> response.json
        is CodeScanningCommitAutofixResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCommitAutofixResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCommitAutofixResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCommitAutofixResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCommitAutofixResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCommitAutofixResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningCommitAutofixResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningCommitAutofixResponse.Http400Json -> CodeScanningCommitAutofixApiException(response, statusCode, headers)
        is CodeScanningCommitAutofixResponse.Http403Json -> CodeScanningCommitAutofixApiException(response, statusCode, headers)
        is CodeScanningCommitAutofixResponse.Http404Json -> CodeScanningCommitAutofixApiException(response, statusCode, headers)
        is CodeScanningCommitAutofixResponse.Http422NoContent -> CodeScanningCommitAutofixApiException(response, statusCode, headers)
        is CodeScanningCommitAutofixResponse.Http503Json -> CodeScanningCommitAutofixApiException(response, statusCode, headers)
        is CodeScanningCommitAutofixResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Commits an autofix for a code scanning alert from the repository's default branch.
   *
   * If an autofix is committed as a result of this request, then this endpoint will return a 201 Created response.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningCommitAutofixWithResponse(
    request: CodeScanningAutofixCommits? = null,
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningCommitAutofixResponse> = executor.executeWithResponse<CodeScanningAutofixCommits?, CodeScanningCommitAutofixResponse>(SdkExecutionRequest(codeScanningCommitAutofixMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGCOMMITAUTOFIX_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningCommitAutofixRequestCodecRegistry, CodeScanningCommitAutofixResponseDecoder, options)

  /**
   * Creates an autofix for a code scanning alert from the repository's default branch.
   *
   * If a new autofix is to be created as a result of this request or is currently being generated, then this endpoint
   * will return a 202 Accepted response.
   *
   * If an autofix already exists for a given alert, then this endpoint will return a 200 OK response.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningCreateAutofixApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeScanningCreateAutofixError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningCreateAutofix(
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningAutofix = executor.executeWithTypedErrors<Unit, CodeScanningCreateAutofixResponse, CodeScanningAutofix>(
    request = SdkExecutionRequest(codeScanningCreateAutofixMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningCreateAutofixRequestCodecRegistry,
    responseDecoder = CodeScanningCreateAutofixResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningCreateAutofixResponse.SuccessJson -> response.json
        is CodeScanningCreateAutofixResponse.SuccessJson2 -> response.json
        is CodeScanningCreateAutofixResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCreateAutofixResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCreateAutofixResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCreateAutofixResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCreateAutofixResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCreateAutofixResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningCreateAutofixResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningCreateAutofixResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is CodeScanningCreateAutofixResponse.Http400Json -> CodeScanningCreateAutofixApiException(response, statusCode, headers)
        is CodeScanningCreateAutofixResponse.Http403Json -> CodeScanningCreateAutofixApiException(response, statusCode, headers)
        is CodeScanningCreateAutofixResponse.Http404Json -> CodeScanningCreateAutofixApiException(response, statusCode, headers)
        is CodeScanningCreateAutofixResponse.Http422NoContent -> CodeScanningCreateAutofixApiException(response, statusCode, headers)
        is CodeScanningCreateAutofixResponse.Http500Json -> CodeScanningCreateAutofixApiException(response, statusCode, headers)
        is CodeScanningCreateAutofixResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates an autofix for a code scanning alert from the repository's default branch.
   *
   * If a new autofix is to be created as a result of this request or is currently being generated, then this endpoint
   * will return a 202 Accepted response.
   *
   * If an autofix already exists for a given alert, then this endpoint will return a 200 OK response.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningCreateAutofixWithResponse(
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningCreateAutofixResponse> = executor.executeWithResponse<Unit, CodeScanningCreateAutofixResponse>(SdkExecutionRequest(codeScanningCreateAutofixMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningCreateAutofixRequestCodecRegistry, CodeScanningCreateAutofixResponseDecoder, options)

  /**
   * Creates a new CodeQL variant analysis, which will run a CodeQL query against one or more repositories.
   *
   * Get started by learning more about [running CodeQL queries at scale with Multi-Repository Variant
   * Analysis](https://docs.github.com/code-security/codeql-for-vs-code/getting-started-with-codeql-for-vs-code/running-
   * codeql-queries-at-scale-with-multi-repository-variant-analysis).
   *
   * Use the `owner` and `repo` parameters in the URL to specify the controller repository that
   * will be used for running GitHub Actions workflows and storing the results of the CodeQL variant analysis.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningCreateVariantAnalysisApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningCreateVariantAnalysisError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningCreateVariantAnalysis(
    request: InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningVariantAnalysis = executor.executeWithTypedErrors<InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab, CodeScanningCreateVariantAnalysisResponse, CodeScanningVariantAnalysis>(
    request = SdkExecutionRequest(codeScanningCreateVariantAnalysisMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGCREATEVARIANTANALYSIS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningCreateVariantAnalysisRequestCodecRegistry,
    responseDecoder = CodeScanningCreateVariantAnalysisResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningCreateVariantAnalysisResponse.SuccessJson -> response.json
        is CodeScanningCreateVariantAnalysisResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCreateVariantAnalysisResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCreateVariantAnalysisResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningCreateVariantAnalysisResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningCreateVariantAnalysisResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningCreateVariantAnalysisResponse.Http404Json -> CodeScanningCreateVariantAnalysisApiException(response, statusCode, headers)
        is CodeScanningCreateVariantAnalysisResponse.Http422Json -> CodeScanningCreateVariantAnalysisApiException(response, statusCode, headers)
        is CodeScanningCreateVariantAnalysisResponse.Http503Json -> CodeScanningCreateVariantAnalysisApiException(response, statusCode, headers)
        is CodeScanningCreateVariantAnalysisResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new CodeQL variant analysis, which will run a CodeQL query against one or more repositories.
   *
   * Get started by learning more about [running CodeQL queries at scale with Multi-Repository Variant
   * Analysis](https://docs.github.com/code-security/codeql-for-vs-code/getting-started-with-codeql-for-vs-code/running-
   * codeql-queries-at-scale-with-multi-repository-variant-analysis).
   *
   * Use the `owner` and `repo` parameters in the URL to specify the controller repository that
   * will be used for running GitHub Actions workflows and storing the results of the CodeQL variant analysis.
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
  public suspend fun codeScanningCreateVariantAnalysisWithResponse(
    request: InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningCreateVariantAnalysisResponse> = executor.executeWithResponse<InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab, CodeScanningCreateVariantAnalysisResponse>(SdkExecutionRequest(codeScanningCreateVariantAnalysisMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGCREATEVARIANTANALYSIS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningCreateVariantAnalysisRequestCodecRegistry, CodeScanningCreateVariantAnalysisResponseDecoder, options)

  /**
   * Deletes a specified code scanning analysis from a repository.
   *
   * You can delete one analysis at a time.
   * To delete a series of analyses, start with the most recent analysis and work backwards.
   * Conceptually, the process is similar to the undo function in a text editor.
   *
   * When you list the analyses for a repository,
   * one or more will be identified as deletable in the response:
   *
   * ```
   * "deletable": true
   * ```
   *
   * An analysis is deletable when it's the most recent in a set of analyses.
   * Typically, a repository will have multiple sets of analyses
   * for each enabled code scanning tool,
   * where a set is determined by a unique combination of analysis values:
   *
   * * `ref`
   * * `tool`
   * * `category`
   *
   * If you attempt to delete an analysis that is not the most recent in a set,
   * you'll get a 400 response with the message:
   *
   * ```
   * Analysis specified is not deletable.
   * ```
   *
   * The response from a successful `DELETE` operation provides you with
   * two alternative URLs for deleting the next analysis in the set:
   * `next_analysis_url` and `confirm_delete_url`.
   * Use the `next_analysis_url` URL if you want to avoid accidentally deleting the final analysis
   * in a set. This is a useful option if you want to preserve at least one analysis
   * for the specified tool in your repository.
   * Use the `confirm_delete_url` URL if you are content to remove all analyses for a tool.
   * When you delete the last analysis in a set, the value of `next_analysis_url` and `confirm_delete_url`
   * in the 200 response is `null`.
   *
   * As an example of the deletion process,
   * let's imagine that you added a workflow that configured a particular code scanning tool
   * to analyze the code in a repository. This tool has added 15 analyses:
   * 10 on the default branch, and another 5 on a topic branch.
   * You therefore have two separate sets of analyses for this tool.
   * You've now decided that you want to remove all of the analyses for the tool.
   * To do this you must make 15 separate deletion requests.
   * To start, you must find an analysis that's identified as deletable.
   * Each set of analyses always has one that's identified as deletable.
   * Having found the deletable analysis for one of the two sets,
   * delete this analysis and then continue deleting the next analysis in the set until they're all deleted.
   * Then repeat the process for the second set.
   * The procedure therefore consists of a nested loop:
   *
   * **Outer loop**:
   * * List the analyses for the repository, filtered by tool.
   * * Parse this list to find a deletable analysis. If found:
   *
   * **Inner loop**:
   * * Delete the identified analysis.
   * * Parse the response for the value of `confirm_delete_url` and, if found, use this in the next iteration.
   *
   * The above process assumes that you want to remove all trace of the tool's analyses from the GitHub user interface,
   * for the specified repository, and it therefore uses the `confirm_delete_url` value. Alternatively, you could use
   * the `next_analysis_url` value, which would leave the last analysis in each set undeleted to avoid removing a tool's
   * analysis entirely.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param analysisId The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses`
   * operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param confirmDelete Allow deletion if the specified analysis is the last in a set. If you attempt to delete the
   * final analysis in a set without setting this parameter to `true`, you'll get a 400 response with the message:
   * `Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify
   * confirm_delete.`
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningDeleteAnalysisApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningDeleteAnalysisError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningDeleteAnalysis(
    analysisId: Int,
    owner: String,
    repo: String,
    confirmDelete: String? = null,
    options: CallOptions = CallOptions(),
  ): CodeScanningAnalysisDeletion = executor.executeWithTypedErrors<Unit, CodeScanningDeleteAnalysisResponse, CodeScanningAnalysisDeletion>(
    request = SdkExecutionRequest(codeScanningDeleteAnalysisMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "analysis_id", values = listOf(analysisId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "confirm_delete", values = confirmDelete?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningDeleteAnalysisRequestCodecRegistry,
    responseDecoder = CodeScanningDeleteAnalysisResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningDeleteAnalysisResponse.SuccessJson -> response.json
        is CodeScanningDeleteAnalysisResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningDeleteAnalysisResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningDeleteAnalysisResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningDeleteAnalysisResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningDeleteAnalysisResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningDeleteAnalysisResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningDeleteAnalysisResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningDeleteAnalysisResponse.Http400Json -> CodeScanningDeleteAnalysisApiException(response, statusCode, headers)
        is CodeScanningDeleteAnalysisResponse.Http400ScimJson -> CodeScanningDeleteAnalysisApiException(response, statusCode, headers)
        is CodeScanningDeleteAnalysisResponse.Http403Json -> CodeScanningDeleteAnalysisApiException(response, statusCode, headers)
        is CodeScanningDeleteAnalysisResponse.Http404Json -> CodeScanningDeleteAnalysisApiException(response, statusCode, headers)
        is CodeScanningDeleteAnalysisResponse.Http503Json -> CodeScanningDeleteAnalysisApiException(response, statusCode, headers)
        is CodeScanningDeleteAnalysisResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a specified code scanning analysis from a repository.
   *
   * You can delete one analysis at a time.
   * To delete a series of analyses, start with the most recent analysis and work backwards.
   * Conceptually, the process is similar to the undo function in a text editor.
   *
   * When you list the analyses for a repository,
   * one or more will be identified as deletable in the response:
   *
   * ```
   * "deletable": true
   * ```
   *
   * An analysis is deletable when it's the most recent in a set of analyses.
   * Typically, a repository will have multiple sets of analyses
   * for each enabled code scanning tool,
   * where a set is determined by a unique combination of analysis values:
   *
   * * `ref`
   * * `tool`
   * * `category`
   *
   * If you attempt to delete an analysis that is not the most recent in a set,
   * you'll get a 400 response with the message:
   *
   * ```
   * Analysis specified is not deletable.
   * ```
   *
   * The response from a successful `DELETE` operation provides you with
   * two alternative URLs for deleting the next analysis in the set:
   * `next_analysis_url` and `confirm_delete_url`.
   * Use the `next_analysis_url` URL if you want to avoid accidentally deleting the final analysis
   * in a set. This is a useful option if you want to preserve at least one analysis
   * for the specified tool in your repository.
   * Use the `confirm_delete_url` URL if you are content to remove all analyses for a tool.
   * When you delete the last analysis in a set, the value of `next_analysis_url` and `confirm_delete_url`
   * in the 200 response is `null`.
   *
   * As an example of the deletion process,
   * let's imagine that you added a workflow that configured a particular code scanning tool
   * to analyze the code in a repository. This tool has added 15 analyses:
   * 10 on the default branch, and another 5 on a topic branch.
   * You therefore have two separate sets of analyses for this tool.
   * You've now decided that you want to remove all of the analyses for the tool.
   * To do this you must make 15 separate deletion requests.
   * To start, you must find an analysis that's identified as deletable.
   * Each set of analyses always has one that's identified as deletable.
   * Having found the deletable analysis for one of the two sets,
   * delete this analysis and then continue deleting the next analysis in the set until they're all deleted.
   * Then repeat the process for the second set.
   * The procedure therefore consists of a nested loop:
   *
   * **Outer loop**:
   * * List the analyses for the repository, filtered by tool.
   * * Parse this list to find a deletable analysis. If found:
   *
   * **Inner loop**:
   * * Delete the identified analysis.
   * * Parse the response for the value of `confirm_delete_url` and, if found, use this in the next iteration.
   *
   * The above process assumes that you want to remove all trace of the tool's analyses from the GitHub user interface,
   * for the specified repository, and it therefore uses the `confirm_delete_url` value. Alternatively, you could use
   * the `next_analysis_url` value, which would leave the last analysis in each set undeleted to avoid removing a tool's
   * analysis entirely.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param analysisId The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses`
   * operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param confirmDelete Allow deletion if the specified analysis is the last in a set. If you attempt to delete the
   * final analysis in a set without setting this parameter to `true`, you'll get a 400 response with the message:
   * `Analysis is last of its type and deletion may result in the loss of historical alert data. Please specify
   * confirm_delete.`
   * @param options Execution options.
   */
  public suspend fun codeScanningDeleteAnalysisWithResponse(
    analysisId: Int,
    owner: String,
    repo: String,
    confirmDelete: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningDeleteAnalysisResponse> = executor.executeWithResponse<Unit, CodeScanningDeleteAnalysisResponse>(SdkExecutionRequest(codeScanningDeleteAnalysisMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "analysis_id", values = listOf(analysisId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "confirm_delete", values = confirmDelete?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeScanningCodecs.codeScanningDeleteAnalysisRequestCodecRegistry, CodeScanningDeleteAnalysisResponseDecoder, options)

  /**
   * Deletes a CodeQL database for a language in a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param language The language of the CodeQL database.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws CodeScanningDeleteCodeqlDatabaseApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningDeleteCodeqlDatabaseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningDeleteCodeqlDatabase(
    language: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CodeScanningDeleteCodeqlDatabaseResponse, Unit>(
    request = SdkExecutionRequest(codeScanningDeleteCodeqlDatabaseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "language", values = listOf(language.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningDeleteCodeqlDatabaseRequestCodecRegistry,
    responseDecoder = CodeScanningDeleteCodeqlDatabaseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningDeleteCodeqlDatabaseResponse.SuccessNoContent -> response.unit
        is CodeScanningDeleteCodeqlDatabaseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningDeleteCodeqlDatabaseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningDeleteCodeqlDatabaseResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningDeleteCodeqlDatabaseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningDeleteCodeqlDatabaseResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodeScanningDeleteCodeqlDatabaseResponse.Http403Json -> CodeScanningDeleteCodeqlDatabaseApiException(response, statusCode, headers)
        is CodeScanningDeleteCodeqlDatabaseResponse.Http404Json -> CodeScanningDeleteCodeqlDatabaseApiException(response, statusCode, headers)
        is CodeScanningDeleteCodeqlDatabaseResponse.Http503Json -> CodeScanningDeleteCodeqlDatabaseApiException(response, statusCode, headers)
        is CodeScanningDeleteCodeqlDatabaseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a CodeQL database for a language in a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param language The language of the CodeQL database.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningDeleteCodeqlDatabaseWithResponse(
    language: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningDeleteCodeqlDatabaseResponse> = executor.executeWithResponse<Unit, CodeScanningDeleteCodeqlDatabaseResponse>(SdkExecutionRequest(codeScanningDeleteCodeqlDatabaseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "language", values = listOf(language.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningDeleteCodeqlDatabaseRequestCodecRegistry, CodeScanningDeleteCodeqlDatabaseResponseDecoder, options)

  /**
   * Gets a single code scanning alert.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningGetAlertApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeScanningGetAlertError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningGetAlert(
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningAlert = executor.executeWithTypedErrors<Unit, CodeScanningGetAlertResponse, CodeScanningAlert>(
    request = SdkExecutionRequest(codeScanningGetAlertMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningGetAlertRequestCodecRegistry,
    responseDecoder = CodeScanningGetAlertResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningGetAlertResponse.SuccessJson -> response.json
        is CodeScanningGetAlertResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetAlertResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetAlertResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetAlertResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningGetAlertResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningGetAlertResponse.Http304NoContent -> CodeScanningGetAlertApiException(response, statusCode, headers)
        is CodeScanningGetAlertResponse.Http403Json -> CodeScanningGetAlertApiException(response, statusCode, headers)
        is CodeScanningGetAlertResponse.Http404Json -> CodeScanningGetAlertApiException(response, statusCode, headers)
        is CodeScanningGetAlertResponse.Http503Json -> CodeScanningGetAlertApiException(response, statusCode, headers)
        is CodeScanningGetAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a single code scanning alert.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningGetAlertWithResponse(
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningGetAlertResponse> = executor.executeWithResponse<Unit, CodeScanningGetAlertResponse>(SdkExecutionRequest(codeScanningGetAlertMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningGetAlertRequestCodecRegistry, CodeScanningGetAlertResponseDecoder, options)

  /**
   * Gets a specified code scanning analysis for a repository.
   *
   * The default JSON response contains fields that describe the analysis.
   * This includes the Git reference and commit SHA to which the analysis relates,
   * the datetime of the analysis, the name of the code scanning tool,
   * and the number of alerts.
   *
   * The `rules_count` field in the default response give the number of rules
   * that were run in the analysis.
   * For very old analyses this data is not available,
   * and `0` is returned in this field.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/sarif+json`**: Instead of returning a summary of the analysis, this endpoint returns a subset of
   * the analysis data that was uploaded. The data is formatted as [SARIF version
   * 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/cs01/sarif-v2.1.0-cs01.html). It also returns additional data
   * such as the `github/alertNumber` and `github/alertUrl` properties.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param analysisId The ID of the analysis, as returned from the `GET /repos/{owner}/{repo}/code-scanning/analyses`
   * operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningGetAnalysisWithResponse(
    analysisId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningGetAnalysisResponse> = executor.executeWithResponse<Unit, CodeScanningGetAnalysisResponse>(SdkExecutionRequest(codeScanningGetAnalysisMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "analysis_id", values = listOf(analysisId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningGetAnalysisRequestCodecRegistry, CodeScanningGetAnalysisResponseDecoder, options)

  /**
   * Gets the status and description of an autofix for a code scanning alert on the repository's default branch.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningGetAutofixApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeScanningGetAutofixError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningGetAutofix(
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningAutofix = executor.executeWithTypedErrors<Unit, CodeScanningGetAutofixResponse, CodeScanningAutofix>(
    request = SdkExecutionRequest(codeScanningGetAutofixMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningGetAutofixRequestCodecRegistry,
    responseDecoder = CodeScanningGetAutofixResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningGetAutofixResponse.SuccessJson -> response.json
        is CodeScanningGetAutofixResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetAutofixResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetAutofixResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetAutofixResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetAutofixResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningGetAutofixResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningGetAutofixResponse.Http400Json -> CodeScanningGetAutofixApiException(response, statusCode, headers)
        is CodeScanningGetAutofixResponse.Http403Json -> CodeScanningGetAutofixApiException(response, statusCode, headers)
        is CodeScanningGetAutofixResponse.Http404Json -> CodeScanningGetAutofixApiException(response, statusCode, headers)
        is CodeScanningGetAutofixResponse.Http500Json -> CodeScanningGetAutofixApiException(response, statusCode, headers)
        is CodeScanningGetAutofixResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets the status and description of an autofix for a code scanning alert on the repository's default branch.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningGetAutofixWithResponse(
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningGetAutofixResponse> = executor.executeWithResponse<Unit, CodeScanningGetAutofixResponse>(SdkExecutionRequest(codeScanningGetAutofixMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningGetAutofixRequestCodecRegistry, CodeScanningGetAutofixResponseDecoder, options)

  /**
   * Gets a CodeQL database for a language in a repository.
   *
   * By default this endpoint returns JSON metadata about the CodeQL database. To
   * download the CodeQL database binary content, set the `Accept` header of the request
   * to
   * [`application/zip`](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types),
   * and make sure
   * your HTTP client is configured to follow redirects or use the `Location` header
   * to make a second request to get the redirect URL.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param language The language of the CodeQL database.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningGetCodeqlDatabaseApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningGetCodeqlDatabaseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningGetCodeqlDatabase(
    language: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningCodeqlDatabase = executor.executeWithTypedErrors<Unit, CodeScanningGetCodeqlDatabaseResponse, CodeScanningCodeqlDatabase>(
    request = SdkExecutionRequest(codeScanningGetCodeqlDatabaseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "language", values = listOf(language.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningGetCodeqlDatabaseRequestCodecRegistry,
    responseDecoder = CodeScanningGetCodeqlDatabaseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningGetCodeqlDatabaseResponse.SuccessJson -> response.json
        is CodeScanningGetCodeqlDatabaseResponse.Http302NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetCodeqlDatabaseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetCodeqlDatabaseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetCodeqlDatabaseResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetCodeqlDatabaseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningGetCodeqlDatabaseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningGetCodeqlDatabaseResponse.Http302NoContent -> CodeScanningGetCodeqlDatabaseApiException(response, statusCode, headers)
        is CodeScanningGetCodeqlDatabaseResponse.Http403Json -> CodeScanningGetCodeqlDatabaseApiException(response, statusCode, headers)
        is CodeScanningGetCodeqlDatabaseResponse.Http404Json -> CodeScanningGetCodeqlDatabaseApiException(response, statusCode, headers)
        is CodeScanningGetCodeqlDatabaseResponse.Http503Json -> CodeScanningGetCodeqlDatabaseApiException(response, statusCode, headers)
        is CodeScanningGetCodeqlDatabaseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a CodeQL database for a language in a repository.
   *
   * By default this endpoint returns JSON metadata about the CodeQL database. To
   * download the CodeQL database binary content, set the `Accept` header of the request
   * to
   * [`application/zip`](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types),
   * and make sure
   * your HTTP client is configured to follow redirects or use the `Location` header
   * to make a second request to get the redirect URL.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param language The language of the CodeQL database.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningGetCodeqlDatabaseWithResponse(
    language: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningGetCodeqlDatabaseResponse> = executor.executeWithResponse<Unit, CodeScanningGetCodeqlDatabaseResponse>(SdkExecutionRequest(codeScanningGetCodeqlDatabaseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "language", values = listOf(language.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningGetCodeqlDatabaseRequestCodecRegistry, CodeScanningGetCodeqlDatabaseResponseDecoder, options)

  /**
   * Gets a code scanning default setup configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningGetDefaultSetupApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningGetDefaultSetupError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningGetDefaultSetup(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningDefaultSetup = executor.executeWithTypedErrors<Unit, CodeScanningGetDefaultSetupResponse, CodeScanningDefaultSetup>(
    request = SdkExecutionRequest(codeScanningGetDefaultSetupMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningGetDefaultSetupRequestCodecRegistry,
    responseDecoder = CodeScanningGetDefaultSetupResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningGetDefaultSetupResponse.SuccessJson -> response.json
        is CodeScanningGetDefaultSetupResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetDefaultSetupResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetDefaultSetupResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetDefaultSetupResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningGetDefaultSetupResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningGetDefaultSetupResponse.Http403Json -> CodeScanningGetDefaultSetupApiException(response, statusCode, headers)
        is CodeScanningGetDefaultSetupResponse.Http404Json -> CodeScanningGetDefaultSetupApiException(response, statusCode, headers)
        is CodeScanningGetDefaultSetupResponse.Http503Json -> CodeScanningGetDefaultSetupApiException(response, statusCode, headers)
        is CodeScanningGetDefaultSetupResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a code scanning default setup configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningGetDefaultSetupWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningGetDefaultSetupResponse> = executor.executeWithResponse<Unit, CodeScanningGetDefaultSetupResponse>(SdkExecutionRequest(codeScanningGetDefaultSetupMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningGetDefaultSetupRequestCodecRegistry, CodeScanningGetDefaultSetupResponseDecoder, options)

  /**
   * Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that
   * you can retrieve details of the analysis. For more information, see "[Get a code scanning analysis for a
   * repository](/rest/code-scanning/code-scanning#get-a-code-scanning-analysis-for-a-repository)."
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param sarifId The SARIF ID obtained after uploading.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningGetSarifApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeScanningGetSarifError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningGetSarif(
    owner: String,
    repo: String,
    sarifId: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningSarifsStatus = executor.executeWithTypedErrors<Unit, CodeScanningGetSarifResponse, CodeScanningSarifsStatus>(
    request = SdkExecutionRequest(codeScanningGetSarifMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "sarif_id", values = listOf(sarifId.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningGetSarifRequestCodecRegistry,
    responseDecoder = CodeScanningGetSarifResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningGetSarifResponse.SuccessJson -> response.json
        is CodeScanningGetSarifResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetSarifResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetSarifResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetSarifResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningGetSarifResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningGetSarifResponse.Http403Json -> CodeScanningGetSarifApiException(response, statusCode, headers)
        is CodeScanningGetSarifResponse.Http404NoContent -> CodeScanningGetSarifApiException(response, statusCode, headers)
        is CodeScanningGetSarifResponse.Http503Json -> CodeScanningGetSarifApiException(response, statusCode, headers)
        is CodeScanningGetSarifResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets information about a SARIF upload, including the status and the URL of the analysis that was uploaded so that
   * you can retrieve details of the analysis. For more information, see "[Get a code scanning analysis for a
   * repository](/rest/code-scanning/code-scanning#get-a-code-scanning-analysis-for-a-repository)."
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param sarifId The SARIF ID obtained after uploading.
   * @param options Execution options.
   */
  public suspend fun codeScanningGetSarifWithResponse(
    owner: String,
    repo: String,
    sarifId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningGetSarifResponse> = executor.executeWithResponse<Unit, CodeScanningGetSarifResponse>(SdkExecutionRequest(codeScanningGetSarifMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "sarif_id", values = listOf(sarifId.toString())))
  }), CodeScanningCodecs.codeScanningGetSarifRequestCodecRegistry, CodeScanningGetSarifResponseDecoder, options)

  /**
   * Gets the summary of a CodeQL variant analysis.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param codeqlVariantAnalysisId The unique identifier of the variant analysis.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningGetVariantAnalysisApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningGetVariantAnalysisError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningGetVariantAnalysis(
    codeqlVariantAnalysisId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningVariantAnalysis = executor.executeWithTypedErrors<Unit, CodeScanningGetVariantAnalysisResponse, CodeScanningVariantAnalysis>(
    request = SdkExecutionRequest(codeScanningGetVariantAnalysisMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codeql_variant_analysis_id", values = listOf(codeqlVariantAnalysisId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningGetVariantAnalysisRequestCodecRegistry,
    responseDecoder = CodeScanningGetVariantAnalysisResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningGetVariantAnalysisResponse.SuccessJson -> response.json
        is CodeScanningGetVariantAnalysisResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetVariantAnalysisResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetVariantAnalysisResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningGetVariantAnalysisResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningGetVariantAnalysisResponse.Http404Json -> CodeScanningGetVariantAnalysisApiException(response, statusCode, headers)
        is CodeScanningGetVariantAnalysisResponse.Http503Json -> CodeScanningGetVariantAnalysisApiException(response, statusCode, headers)
        is CodeScanningGetVariantAnalysisResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets the summary of a CodeQL variant analysis.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codeqlVariantAnalysisId The unique identifier of the variant analysis.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningGetVariantAnalysisWithResponse(
    codeqlVariantAnalysisId: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningGetVariantAnalysisResponse> = executor.executeWithResponse<Unit, CodeScanningGetVariantAnalysisResponse>(SdkExecutionRequest(codeScanningGetVariantAnalysisMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codeql_variant_analysis_id", values = listOf(codeqlVariantAnalysisId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningGetVariantAnalysisRequestCodecRegistry, CodeScanningGetVariantAnalysisResponseDecoder, options)

  /**
   * Gets the analysis status of a repository in a CodeQL variant analysis.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param codeqlVariantAnalysisId The ID of the variant analysis.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the controller repository.
   * @param repoName The name of the variant analysis repository.
   * @param repoOwner The account owner of the variant analysis repository. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningGetVariantAnalysisRepoTaskApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodeScanningGetVariantAnalysisRepoTaskError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningGetVariantAnalysisRepoTask(
    codeqlVariantAnalysisId: Int,
    owner: String,
    repo: String,
    repoName: String,
    repoOwner: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningVariantAnalysisRepoTask = executor.executeWithTypedErrors<Unit, CodeScanningGetVariantAnalysisRepoTaskResponse, CodeScanningVariantAnalysisRepoTask>(
    request = SdkExecutionRequest(codeScanningGetVariantAnalysisRepoTaskMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codeql_variant_analysis_id", values = listOf(codeqlVariantAnalysisId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo_name", values = listOf(repoName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo_owner", values = listOf(repoOwner.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningGetVariantAnalysisRepoTaskRequestCodecRegistry,
    responseDecoder = CodeScanningGetVariantAnalysisRepoTaskResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningGetVariantAnalysisRepoTaskResponse.SuccessJson -> response.json
        is CodeScanningGetVariantAnalysisRepoTaskResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetVariantAnalysisRepoTaskResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningGetVariantAnalysisRepoTaskResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningGetVariantAnalysisRepoTaskResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningGetVariantAnalysisRepoTaskResponse.Http404Json -> CodeScanningGetVariantAnalysisRepoTaskApiException(response, statusCode, headers)
        is CodeScanningGetVariantAnalysisRepoTaskResponse.Http503Json -> CodeScanningGetVariantAnalysisRepoTaskApiException(response, statusCode, headers)
        is CodeScanningGetVariantAnalysisRepoTaskResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets the analysis status of a repository in a CodeQL variant analysis.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codeqlVariantAnalysisId The ID of the variant analysis.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the controller repository.
   * @param repoName The name of the variant analysis repository.
   * @param repoOwner The account owner of the variant analysis repository. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningGetVariantAnalysisRepoTaskWithResponse(
    codeqlVariantAnalysisId: Int,
    owner: String,
    repo: String,
    repoName: String,
    repoOwner: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningGetVariantAnalysisRepoTaskResponse> = executor.executeWithResponse<Unit, CodeScanningGetVariantAnalysisRepoTaskResponse>(SdkExecutionRequest(codeScanningGetVariantAnalysisRepoTaskMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codeql_variant_analysis_id", values = listOf(codeqlVariantAnalysisId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo_name", values = listOf(repoName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo_owner", values = listOf(repoOwner.toString())))
  }), CodeScanningCodecs.codeScanningGetVariantAnalysisRepoTaskRequestCodecRegistry, CodeScanningGetVariantAnalysisRepoTaskResponseDecoder, options)

  /**
   * Lists all instances of the specified code scanning alert.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pr The number of the pull request for the results you want to list.
   * @param ref The Git reference for the results you want to list. The `ref` for a branch can be formatted either as
   * `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningListAlertInstancesApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningListAlertInstancesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningListAlertInstances(
    alertNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    pr: Int? = null,
    ref: String? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeScanningAlertInstanceList> = executor.executeWithTypedErrors<Unit, CodeScanningListAlertInstancesResponse, List<CodeScanningAlertInstanceList>>(
    request = SdkExecutionRequest(codeScanningListAlertInstancesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "pr", values = pr?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningListAlertInstancesRequestCodecRegistry,
    responseDecoder = CodeScanningListAlertInstancesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningListAlertInstancesResponse.SuccessJson -> response.json
        is CodeScanningListAlertInstancesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertInstancesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertInstancesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertInstancesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningListAlertInstancesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningListAlertInstancesResponse.Http403Json -> CodeScanningListAlertInstancesApiException(response, statusCode, headers)
        is CodeScanningListAlertInstancesResponse.Http404Json -> CodeScanningListAlertInstancesApiException(response, statusCode, headers)
        is CodeScanningListAlertInstancesResponse.Http503Json -> CodeScanningListAlertInstancesApiException(response, statusCode, headers)
        is CodeScanningListAlertInstancesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all instances of the specified code scanning alert.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pr The number of the pull request for the results you want to list.
   * @param ref The Git reference for the results you want to list. The `ref` for a branch can be formatted either as
   * `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
   * @param options Execution options.
   */
  public suspend fun codeScanningListAlertInstancesWithResponse(
    alertNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    pr: Int? = null,
    ref: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningListAlertInstancesResponse> = executor.executeWithResponse<Unit, CodeScanningListAlertInstancesResponse>(SdkExecutionRequest(codeScanningListAlertInstancesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "pr", values = pr?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeScanningCodecs.codeScanningListAlertInstancesRequestCodecRegistry, CodeScanningListAlertInstancesResponseDecoder, options)

  /**
   * Lists code scanning alerts for the default branch for all eligible repositories in an organization. Eligible
   * repositories are repositories that are owned by organizations that you own or for which you are a security manager.
   * For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` or `repo`s cope to use this
   * endpoint with private or public repositories, or the `public_repo` scope to use this endpoint with only public
   * repositories.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param assignees Filter alerts by assignees. Provide a comma-separated list of user handles (e.g., `octocat` or
   * `octocat,hubot`).
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   *
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param severity If specified, only code scanning alerts with this severity will be returned.
   * @param sort The property by which to sort the results.
   * @param state If specified, only code scanning alerts with this state will be returned.
   * @param toolGuid The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code
   * scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid`
   * or `tool_name`, but not both.
   * @param toolName The name of a code scanning tool. Only results by this tool will be listed. You can specify the
   * tool by using either `tool_name` or `tool_guid`, but not both.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningListAlertsForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningListAlertsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningListAlertsForOrg(
    org: String,
    after: String? = null,
    assignees: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    severity: CodeScanningAlertSeverity? = null,
    sort: InlineOrgsCodeScanningAlertsGetParameterX915a7987? = null,
    state: CodeScanningAlertStateQuery? = null,
    toolGuid: String? = null,
    toolName: String? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeScanningOrganizationAlertItems> = executor.executeWithTypedErrors<Unit, CodeScanningListAlertsForOrgResponse, List<CodeScanningOrganizationAlertItems>>(
    request = SdkExecutionRequest(codeScanningListAlertsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignees", values = assignees?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_guid", values = toolGuid?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_name", values = toolName?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningListAlertsForOrgRequestCodecRegistry,
    responseDecoder = CodeScanningListAlertsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningListAlertsForOrgResponse.SuccessJson -> response.json
        is CodeScanningListAlertsForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertsForOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningListAlertsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningListAlertsForOrgResponse.Http404Json -> CodeScanningListAlertsForOrgApiException(response, statusCode, headers)
        is CodeScanningListAlertsForOrgResponse.Http503Json -> CodeScanningListAlertsForOrgApiException(response, statusCode, headers)
        is CodeScanningListAlertsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists code scanning alerts for the default branch for all eligible repositories in an organization. Eligible
   * repositories are repositories that are owned by organizations that you own or for which you are a security manager.
   * For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` or `repo`s cope to use this
   * endpoint with private or public repositories, or the `public_repo` scope to use this endpoint with only public
   * repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param assignees Filter alerts by assignees. Provide a comma-separated list of user handles (e.g., `octocat` or
   * `octocat,hubot`).
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   *
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param severity If specified, only code scanning alerts with this severity will be returned.
   * @param sort The property by which to sort the results.
   * @param state If specified, only code scanning alerts with this state will be returned.
   * @param toolGuid The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code
   * scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid`
   * or `tool_name`, but not both.
   * @param toolName The name of a code scanning tool. Only results by this tool will be listed. You can specify the
   * tool by using either `tool_name` or `tool_guid`, but not both.
   * @param options Execution options.
   */
  public suspend fun codeScanningListAlertsForOrgWithResponse(
    org: String,
    after: String? = null,
    assignees: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    severity: CodeScanningAlertSeverity? = null,
    sort: InlineOrgsCodeScanningAlertsGetParameterX915a7987? = null,
    state: CodeScanningAlertStateQuery? = null,
    toolGuid: String? = null,
    toolName: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningListAlertsForOrgResponse> = executor.executeWithResponse<Unit, CodeScanningListAlertsForOrgResponse>(SdkExecutionRequest(codeScanningListAlertsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignees", values = assignees?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_guid", values = toolGuid?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_name", values = toolName?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeScanningCodecs.codeScanningListAlertsForOrgRequestCodecRegistry, CodeScanningListAlertsForOrgResponseDecoder, options)

  /**
   * Lists code scanning alerts.
   *
   * The response includes a `most_recent_instance` object.
   * This provides details of the most recent instance of this alert
   * for the default branch (or for the specified Git reference if you used `ref` in the request).
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param assignees Filter alerts by assignees. Provide a comma-separated list of user handles (e.g., `octocat` or
   * `octocat,hubot`).
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   *
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pr The number of the pull request for the results you want to list.
   * @param ref The Git reference for the results you want to list. The `ref` for a branch can be formatted either as
   * `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
   * @param severity If specified, only code scanning alerts with this severity will be returned.
   * @param sort The property by which to sort the results.
   * @param state If specified, only code scanning alerts with this state will be returned.
   * @param toolGuid The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code
   * scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid`
   * or `tool_name`, but not both.
   * @param toolName The name of a code scanning tool. Only results by this tool will be listed. You can specify the
   * tool by using either `tool_name` or `tool_guid`, but not both.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningListAlertsForRepoApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningListAlertsForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningListAlertsForRepo(
    owner: String,
    repo: String,
    after: String? = null,
    assignees: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    pr: Int? = null,
    ref: String? = null,
    severity: CodeScanningAlertSeverity? = null,
    sort: InlineReposCodeScanningAlertsGetParameterXccb2c4bc? = null,
    state: CodeScanningAlertStateQuery? = null,
    toolGuid: String? = null,
    toolName: String? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeScanningAlertItems> = executor.executeWithTypedErrors<Unit, CodeScanningListAlertsForRepoResponse, List<CodeScanningAlertItems>>(
    request = SdkExecutionRequest(codeScanningListAlertsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignees", values = assignees?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "pr", values = pr?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_guid", values = toolGuid?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_name", values = toolName?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningListAlertsForRepoRequestCodecRegistry,
    responseDecoder = CodeScanningListAlertsForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningListAlertsForRepoResponse.SuccessJson -> response.json
        is CodeScanningListAlertsForRepoResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertsForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertsForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertsForRepoResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListAlertsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningListAlertsForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningListAlertsForRepoResponse.Http304NoContent -> CodeScanningListAlertsForRepoApiException(response, statusCode, headers)
        is CodeScanningListAlertsForRepoResponse.Http403Json -> CodeScanningListAlertsForRepoApiException(response, statusCode, headers)
        is CodeScanningListAlertsForRepoResponse.Http404Json -> CodeScanningListAlertsForRepoApiException(response, statusCode, headers)
        is CodeScanningListAlertsForRepoResponse.Http503Json -> CodeScanningListAlertsForRepoApiException(response, statusCode, headers)
        is CodeScanningListAlertsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists code scanning alerts.
   *
   * The response includes a `most_recent_instance` object.
   * This provides details of the most recent instance of this alert
   * for the default branch (or for the specified Git reference if you used `ref` in the request).
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param assignees Filter alerts by assignees. Provide a comma-separated list of user handles (e.g., `octocat` or
   * `octocat,hubot`).
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   *
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pr The number of the pull request for the results you want to list.
   * @param ref The Git reference for the results you want to list. The `ref` for a branch can be formatted either as
   * `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
   * @param severity If specified, only code scanning alerts with this severity will be returned.
   * @param sort The property by which to sort the results.
   * @param state If specified, only code scanning alerts with this state will be returned.
   * @param toolGuid The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code
   * scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid`
   * or `tool_name`, but not both.
   * @param toolName The name of a code scanning tool. Only results by this tool will be listed. You can specify the
   * tool by using either `tool_name` or `tool_guid`, but not both.
   * @param options Execution options.
   */
  public suspend fun codeScanningListAlertsForRepoWithResponse(
    owner: String,
    repo: String,
    after: String? = null,
    assignees: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    pr: Int? = null,
    ref: String? = null,
    severity: CodeScanningAlertSeverity? = null,
    sort: InlineReposCodeScanningAlertsGetParameterXccb2c4bc? = null,
    state: CodeScanningAlertStateQuery? = null,
    toolGuid: String? = null,
    toolName: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningListAlertsForRepoResponse> = executor.executeWithResponse<Unit, CodeScanningListAlertsForRepoResponse>(SdkExecutionRequest(codeScanningListAlertsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignees", values = assignees?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "pr", values = pr?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_guid", values = toolGuid?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_name", values = toolName?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeScanningCodecs.codeScanningListAlertsForRepoRequestCodecRegistry, CodeScanningListAlertsForRepoResponseDecoder, options)

  /**
   * Lists the CodeQL databases that are available in a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningListCodeqlDatabasesApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningListCodeqlDatabasesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningListCodeqlDatabases(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<CodeScanningCodeqlDatabase> = executor.executeWithTypedErrors<Unit, CodeScanningListCodeqlDatabasesResponse, List<CodeScanningCodeqlDatabase>>(
    request = SdkExecutionRequest(codeScanningListCodeqlDatabasesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningListCodeqlDatabasesRequestCodecRegistry,
    responseDecoder = CodeScanningListCodeqlDatabasesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningListCodeqlDatabasesResponse.SuccessJson -> response.json
        is CodeScanningListCodeqlDatabasesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListCodeqlDatabasesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListCodeqlDatabasesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListCodeqlDatabasesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningListCodeqlDatabasesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningListCodeqlDatabasesResponse.Http403Json -> CodeScanningListCodeqlDatabasesApiException(response, statusCode, headers)
        is CodeScanningListCodeqlDatabasesResponse.Http404Json -> CodeScanningListCodeqlDatabasesApiException(response, statusCode, headers)
        is CodeScanningListCodeqlDatabasesResponse.Http503Json -> CodeScanningListCodeqlDatabasesApiException(response, statusCode, headers)
        is CodeScanningListCodeqlDatabasesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the CodeQL databases that are available in a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningListCodeqlDatabasesWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningListCodeqlDatabasesResponse> = executor.executeWithResponse<Unit, CodeScanningListCodeqlDatabasesResponse>(SdkExecutionRequest(codeScanningListCodeqlDatabasesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningListCodeqlDatabasesRequestCodecRegistry, CodeScanningListCodeqlDatabasesResponseDecoder, options)

  /**
   * Lists the details of all code scanning analyses for a repository,
   * starting with the most recent.
   * The response is paginated and you can use the `page` and `per_page` parameters
   * to list the analyses you're interested in.
   * By default 30 analyses are listed per page.
   *
   * The `rules_count` field in the response give the number of rules
   * that were run in the analysis.
   * For very old analyses this data is not available,
   * and `0` is returned in this field.
   *
   * > [!WARNING]
   * > **Closing down notice:** The `tool_name` field is closing down and will, in future, not be included in the
   * response for this endpoint. The example response reflects this change. The tool name can now be found inside the
   * `tool` field.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pr The number of the pull request for the results you want to list.
   * @param ref The Git reference for the analyses you want to list. The `ref` for a branch can be formatted either as
   * `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
   * @param sarifId Filter analyses belonging to the same SARIF upload.
   * @param sort The property by which to sort the results.
   * @param toolGuid The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code
   * scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid`
   * or `tool_name`, but not both.
   * @param toolName The name of a code scanning tool. Only results by this tool will be listed. You can specify the
   * tool by using either `tool_name` or `tool_guid`, but not both.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningListRecentAnalysesApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeScanningListRecentAnalysesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningListRecentAnalyses(
    owner: String,
    repo: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    pr: Int? = null,
    ref: String? = null,
    sarifId: String? = null,
    sort: InlineReposCodeScanningAnalysesGetParameterX2203addf? = null,
    toolGuid: String? = null,
    toolName: String? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeScanningAnalysis> = executor.executeWithTypedErrors<Unit, CodeScanningListRecentAnalysesResponse, List<CodeScanningAnalysis>>(
    request = SdkExecutionRequest(codeScanningListRecentAnalysesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "pr", values = pr?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sarif_id", values = sarifId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_guid", values = toolGuid?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_name", values = toolName?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningListRecentAnalysesRequestCodecRegistry,
    responseDecoder = CodeScanningListRecentAnalysesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningListRecentAnalysesResponse.SuccessJson -> response.json
        is CodeScanningListRecentAnalysesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListRecentAnalysesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListRecentAnalysesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningListRecentAnalysesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningListRecentAnalysesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningListRecentAnalysesResponse.Http403Json -> CodeScanningListRecentAnalysesApiException(response, statusCode, headers)
        is CodeScanningListRecentAnalysesResponse.Http404Json -> CodeScanningListRecentAnalysesApiException(response, statusCode, headers)
        is CodeScanningListRecentAnalysesResponse.Http503Json -> CodeScanningListRecentAnalysesApiException(response, statusCode, headers)
        is CodeScanningListRecentAnalysesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the details of all code scanning analyses for a repository,
   * starting with the most recent.
   * The response is paginated and you can use the `page` and `per_page` parameters
   * to list the analyses you're interested in.
   * By default 30 analyses are listed per page.
   *
   * The `rules_count` field in the response give the number of rules
   * that were run in the analysis.
   * For very old analyses this data is not available,
   * and `0` is returned in this field.
   *
   * > [!WARNING]
   * > **Closing down notice:** The `tool_name` field is closing down and will, in future, not be included in the
   * response for this endpoint. The example response reflects this change. The tool name can now be found inside the
   * `tool` field.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pr The number of the pull request for the results you want to list.
   * @param ref The Git reference for the analyses you want to list. The `ref` for a branch can be formatted either as
   * `refs/heads/<branch name>` or simply `<branch name>`. To reference a pull request use `refs/pull/<number>/merge`.
   * @param sarifId Filter analyses belonging to the same SARIF upload.
   * @param sort The property by which to sort the results.
   * @param toolGuid The GUID of a code scanning tool. Only results by this tool will be listed. Note that some code
   * scanning tools may not include a GUID in their analysis data. You can specify the tool by using either `tool_guid`
   * or `tool_name`, but not both.
   * @param toolName The name of a code scanning tool. Only results by this tool will be listed. You can specify the
   * tool by using either `tool_name` or `tool_guid`, but not both.
   * @param options Execution options.
   */
  public suspend fun codeScanningListRecentAnalysesWithResponse(
    owner: String,
    repo: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    pr: Int? = null,
    ref: String? = null,
    sarifId: String? = null,
    sort: InlineReposCodeScanningAnalysesGetParameterX2203addf? = null,
    toolGuid: String? = null,
    toolName: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningListRecentAnalysesResponse> = executor.executeWithResponse<Unit, CodeScanningListRecentAnalysesResponse>(SdkExecutionRequest(codeScanningListRecentAnalysesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "pr", values = pr?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sarif_id", values = sarifId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_guid", values = toolGuid?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "tool_name", values = toolName?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeScanningCodecs.codeScanningListRecentAnalysesRequestCodecRegistry, CodeScanningListRecentAnalysesResponseDecoder, options)

  /**
   * Updates the status of a single code scanning alert.
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * @param request Request body sent to the operation.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningUpdateAlertApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeScanningUpdateAlertError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningUpdateAlert(
    request: InlineReposCodeScanningAlertsPatchRequestJsonX81128345,
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningAlert = executor.executeWithTypedErrors<InlineReposCodeScanningAlertsPatchRequestJsonX81128345, CodeScanningUpdateAlertResponse, CodeScanningAlert>(
    request = SdkExecutionRequest(codeScanningUpdateAlertMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGUPDATEALERT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningUpdateAlertRequestCodecRegistry,
    responseDecoder = CodeScanningUpdateAlertResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningUpdateAlertResponse.SuccessJson -> response.json
        is CodeScanningUpdateAlertResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUpdateAlertResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUpdateAlertResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUpdateAlertResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUpdateAlertResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUpdateAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningUpdateAlertResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningUpdateAlertResponse.Http400Json -> CodeScanningUpdateAlertApiException(response, statusCode, headers)
        is CodeScanningUpdateAlertResponse.Http400ScimJson -> CodeScanningUpdateAlertApiException(response, statusCode, headers)
        is CodeScanningUpdateAlertResponse.Http403Json -> CodeScanningUpdateAlertApiException(response, statusCode, headers)
        is CodeScanningUpdateAlertResponse.Http404Json -> CodeScanningUpdateAlertApiException(response, statusCode, headers)
        is CodeScanningUpdateAlertResponse.Http503Json -> CodeScanningUpdateAlertApiException(response, statusCode, headers)
        is CodeScanningUpdateAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the status of a single code scanning alert.
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningUpdateAlertWithResponse(
    request: InlineReposCodeScanningAlertsPatchRequestJsonX81128345,
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningUpdateAlertResponse> = executor.executeWithResponse<InlineReposCodeScanningAlertsPatchRequestJsonX81128345, CodeScanningUpdateAlertResponse>(SdkExecutionRequest(codeScanningUpdateAlertMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGUPDATEALERT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningUpdateAlertRequestCodecRegistry, CodeScanningUpdateAlertResponseDecoder, options)

  /**
   * Updates a code scanning default setup configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint with private or
   * public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningUpdateDefaultSetupWithResponse(
    request: CodeScanningDefaultSetupUpdate,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningUpdateDefaultSetupResponse> = executor.executeWithResponse<CodeScanningDefaultSetupUpdate, CodeScanningUpdateDefaultSetupResponse>(SdkExecutionRequest(codeScanningUpdateDefaultSetupMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGUPDATEDEFAULTSETUP_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningUpdateDefaultSetupRequestCodecRegistry, CodeScanningUpdateDefaultSetupResponseDecoder, options)

  /**
   * Uploads SARIF data containing the results of a code scanning analysis to make the results available in a
   * repository. For troubleshooting information, see "[Troubleshooting SARIF
   * uploads](https://docs.github.com/code-security/code-scanning/troubleshooting-sarif)."
   *
   * There are two places where you can upload code scanning results.
   * - If you upload to a pull request, for example `--ref refs/pull/42/merge` or `--ref refs/pull/42/head`, then the
   * results appear as alerts in a pull request check. For more information, see "[Triaging code scanning alerts in pull
   * requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests)."
   * - If you upload to a branch, for example `--ref refs/heads/my-branch`, then the results appear in the **Security**
   * tab for your repository. For more information, see "[Managing code scanning alerts for your
   * repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a
   * -repository)."
   *
   * You must compress the SARIF-formatted analysis data that you want to upload, using `gzip`, and then encode it as a
   * Base64 format string. For example:
   *
   * ```
   * gzip -c analysis-data.sarif | base64 -w0
   * ```
   *
   * SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected
   * if any of these objects is above its maximum value. For some objects, there are additional values over which the
   * entries will be ignored while keeping the most important entries whenever applicable.
   * To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis
   * configuration. For example, for the CodeQL tool, identify and remove the most noisy queries. For more information,
   * see "[SARIF results exceed one or more
   * limits](https://docs.github.com/code-security/code-scanning/troubleshooting-sarif/results-exceed-limit)."
   *
   *
   * | **SARIF data**                   | **Maximum values** | **Additional limits**
   * |
   * |----------------------------------|:------------------:|----------------------------------------------------------
   * ------------------------|
   * | Runs per file                    |         20         |
   * |
   * | Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized
   * by severity.            |
   * | Rules per run                    |       25,000       |
   * |
   * | Tool extensions per run          |        100         |
   * |
   * | Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be
   * included, using prioritization. |
   * | Location per result	             |       1,000        | Only 100 locations will be included.
   * |
   * | Tags per rule	                   |         20         | Only 10 tags will be included.
   * |
   *
   *
   * The `202 Accepted` response includes an `id` value.
   * You can use this ID to check the status of the upload by using it in the `/sarifs/{sarif_id}` endpoint.
   * For more information, see "[Get information about a SARIF
   * upload](/rest/code-scanning/code-scanning#get-information-about-a-sarif-upload)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * This endpoint is limited to 1,000 requests per hour for each user or app installation calling it.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeScanningUploadSarifApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodeScanningUploadSarifError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeScanningUploadSarif(
    request: InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodeScanningSarifsReceipt = executor.executeWithTypedErrors<InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b, CodeScanningUploadSarifResponse, CodeScanningSarifsReceipt>(
    request = SdkExecutionRequest(codeScanningUploadSarifMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGUPLOADSARIF_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodeScanningCodecs.codeScanningUploadSarifRequestCodecRegistry,
    responseDecoder = CodeScanningUploadSarifResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeScanningUploadSarifResponse.SuccessJson -> response.json
        is CodeScanningUploadSarifResponse.Http400NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUploadSarifResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUploadSarifResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUploadSarifResponse.Http413NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUploadSarifResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeScanningUploadSarifResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeScanningUploadSarifResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeScanningUploadSarifResponse.Http400NoContent -> CodeScanningUploadSarifApiException(response, statusCode, headers)
        is CodeScanningUploadSarifResponse.Http403Json -> CodeScanningUploadSarifApiException(response, statusCode, headers)
        is CodeScanningUploadSarifResponse.Http404Json -> CodeScanningUploadSarifApiException(response, statusCode, headers)
        is CodeScanningUploadSarifResponse.Http413NoContent -> CodeScanningUploadSarifApiException(response, statusCode, headers)
        is CodeScanningUploadSarifResponse.Http503Json -> CodeScanningUploadSarifApiException(response, statusCode, headers)
        is CodeScanningUploadSarifResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Uploads SARIF data containing the results of a code scanning analysis to make the results available in a
   * repository. For troubleshooting information, see "[Troubleshooting SARIF
   * uploads](https://docs.github.com/code-security/code-scanning/troubleshooting-sarif)."
   *
   * There are two places where you can upload code scanning results.
   * - If you upload to a pull request, for example `--ref refs/pull/42/merge` or `--ref refs/pull/42/head`, then the
   * results appear as alerts in a pull request check. For more information, see "[Triaging code scanning alerts in pull
   * requests](/code-security/secure-coding/triaging-code-scanning-alerts-in-pull-requests)."
   * - If you upload to a branch, for example `--ref refs/heads/my-branch`, then the results appear in the **Security**
   * tab for your repository. For more information, see "[Managing code scanning alerts for your
   * repository](/code-security/secure-coding/managing-code-scanning-alerts-for-your-repository#viewing-the-alerts-for-a
   * -repository)."
   *
   * You must compress the SARIF-formatted analysis data that you want to upload, using `gzip`, and then encode it as a
   * Base64 format string. For example:
   *
   * ```
   * gzip -c analysis-data.sarif | base64 -w0
   * ```
   *
   * SARIF upload supports a maximum number of entries per the following data objects, and an analysis will be rejected
   * if any of these objects is above its maximum value. For some objects, there are additional values over which the
   * entries will be ignored while keeping the most important entries whenever applicable.
   * To get the most out of your analysis when it includes data above the supported limits, try to optimize the analysis
   * configuration. For example, for the CodeQL tool, identify and remove the most noisy queries. For more information,
   * see "[SARIF results exceed one or more
   * limits](https://docs.github.com/code-security/code-scanning/troubleshooting-sarif/results-exceed-limit)."
   *
   *
   * | **SARIF data**                   | **Maximum values** | **Additional limits**
   * |
   * |----------------------------------|:------------------:|----------------------------------------------------------
   * ------------------------|
   * | Runs per file                    |         20         |
   * |
   * | Results per run                  |       25,000       | Only the top 5,000 results will be included, prioritized
   * by severity.            |
   * | Rules per run                    |       25,000       |
   * |
   * | Tool extensions per run          |        100         |
   * |
   * | Thread Flow Locations per result |       10,000       | Only the top 1,000 Thread Flow Locations will be
   * included, using prioritization. |
   * | Location per result	             |       1,000        | Only 100 locations will be included.
   * |
   * | Tags per rule	                   |         20         | Only 10 tags will be included.
   * |
   *
   *
   * The `202 Accepted` response includes an `id` value.
   * You can use this ID to check the status of the upload by using it in the `/sarifs/{sarif_id}` endpoint.
   * For more information, see "[Get information about a SARIF
   * upload](/rest/code-scanning/code-scanning#get-information-about-a-sarif-upload)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint with
   * private or public repositories, or the `public_repo` scope to use this endpoint with only public repositories.
   *
   * This endpoint is limited to 1,000 requests per hour for each user or app installation calling it.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeScanningUploadSarifWithResponse(
    request: InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeScanningUploadSarifResponse> = executor.executeWithResponse<InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b, CodeScanningUploadSarifResponse>(SdkExecutionRequest(codeScanningUploadSarifMetadata, baseUri, request, listOf(CodeScanningCodecs.CODESCANNINGUPLOADSARIF_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeScanningCodecs.codeScanningUploadSarifRequestCodecRegistry, CodeScanningUploadSarifResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `code-scanning/commit-autofix` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningCommitAutofixError

  /**
   * Typed response alternatives for `code-scanning/commit-autofix`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeScanningCommitAutofixResponse {
    public class SuccessJson(
      public val json: CodeScanningAutofixCommitsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCommitAutofixResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCommitAutofixResponse,
        CodeScanningCommitAutofixError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCommitAutofixResponse,
        CodeScanningCommitAutofixError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCommitAutofixResponse,
        CodeScanningCommitAutofixError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCommitAutofixResponse,
        CodeScanningCommitAutofixError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCommitAutofixResponse,
        CodeScanningCommitAutofixError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCommitAutofixResponse
  }

  /**
   * Raised by `code-scanning/commit-autofix` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningCommitAutofixApiException(
    public val error: CodeScanningCommitAutofixError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/commit-autofix")

  private object CodeScanningCommitAutofixResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningCommitAutofixResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningCommitAutofixResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningCommitAutofixResponse> = when {
      alternative.id == "code-scanning/commit-autofix.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningCommitAutofixResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningCommitAutofixResponseCodecAlternative0Registry.select(listOf("code-scanning/commit-autofix.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/commit-autofix.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningCommitAutofixResponse.Http400Json(
          json = CodeScanningCodecs.codeScanningCommitAutofixResponseCodecAlternative1Registry.select(listOf("code-scanning/commit-autofix.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/commit-autofix.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningCommitAutofixResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningCommitAutofixResponseCodecAlternative2Registry.select(listOf("code-scanning/commit-autofix.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/commit-autofix.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningCommitAutofixResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningCommitAutofixResponseCodecAlternative3Registry.select(listOf("code-scanning/commit-autofix.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/commit-autofix.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningCommitAutofixResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/commit-autofix.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeScanningCommitAutofixResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningCommitAutofixResponseCodecAlternative5Registry.select(listOf("code-scanning/commit-autofix.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningCommitAutofixResponse = CodeScanningCommitAutofixResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/create-autofix` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningCreateAutofixError

  /**
   * Typed response alternatives for `code-scanning/create-autofix`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeScanningCreateAutofixResponse {
    public class SuccessJson(
      public val json: CodeScanningAutofix,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateAutofixResponse

    public class SuccessJson2(
      public val json: CodeScanningAutofix,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateAutofixResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateAutofixResponse,
        CodeScanningCreateAutofixError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateAutofixResponse,
        CodeScanningCreateAutofixError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateAutofixResponse,
        CodeScanningCreateAutofixError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateAutofixResponse,
        CodeScanningCreateAutofixError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateAutofixResponse,
        CodeScanningCreateAutofixError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateAutofixResponse
  }

  /**
   * Raised by `code-scanning/create-autofix` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningCreateAutofixApiException(
    public val error: CodeScanningCreateAutofixError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/create-autofix")

  private object CodeScanningCreateAutofixResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningCreateAutofixResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningCreateAutofixResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningCreateAutofixResponse> = when {
      alternative.id == "code-scanning/create-autofix.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningCreateAutofixResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningCreateAutofixResponseCodecAlternative0Registry.select(listOf("code-scanning/create-autofix.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-autofix.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningCreateAutofixResponse.SuccessJson2(
          json = CodeScanningCodecs.codeScanningCreateAutofixResponseCodecAlternative1Registry.select(listOf("code-scanning/create-autofix.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-autofix.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningCreateAutofixResponse.Http400Json(
          json = CodeScanningCodecs.codeScanningCreateAutofixResponseCodecAlternative2Registry.select(listOf("code-scanning/create-autofix.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-autofix.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningCreateAutofixResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningCreateAutofixResponseCodecAlternative3Registry.select(listOf("code-scanning/create-autofix.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-autofix.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningCreateAutofixResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningCreateAutofixResponseCodecAlternative4Registry.select(listOf("code-scanning/create-autofix.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-autofix.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeScanningCreateAutofixResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-autofix.response.alternative6" -> SdkResponseDecodeResult(
        value = CodeScanningCreateAutofixResponse.Http500Json(
          json = CodeScanningCodecs.codeScanningCreateAutofixResponseCodecAlternative6Registry.select(listOf("code-scanning/create-autofix.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningCreateAutofixResponse = CodeScanningCreateAutofixResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/create-variant-analysis` may expose through its typed
   * API exception.
   */
  public sealed interface CodeScanningCreateVariantAnalysisError

  /**
   * Typed response alternatives for `code-scanning/create-variant-analysis`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningCreateVariantAnalysisResponse {
    public class SuccessJson(
      public val json: CodeScanningVariantAnalysis,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateVariantAnalysisResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateVariantAnalysisResponse,
        CodeScanningCreateVariantAnalysisError

    public class Http422Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateVariantAnalysisResponse,
        CodeScanningCreateVariantAnalysisError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateVariantAnalysisResponse,
        CodeScanningCreateVariantAnalysisError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningCreateVariantAnalysisResponse
  }

  /**
   * Raised by `code-scanning/create-variant-analysis` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningCreateVariantAnalysisApiException(
    public val error: CodeScanningCreateVariantAnalysisError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/create-variant-analysis")

  private object CodeScanningCreateVariantAnalysisResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningCreateVariantAnalysisResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningCreateVariantAnalysisResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningCreateVariantAnalysisResponse> = when {
      alternative.id == "code-scanning/create-variant-analysis.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningCreateVariantAnalysisResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningCreateVariantAnalysisResponseCodecAlternative0Registry.select(listOf("code-scanning/create-variant-analysis.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-variant-analysis.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningCreateVariantAnalysisResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningCreateVariantAnalysisResponseCodecAlternative1Registry.select(listOf("code-scanning/create-variant-analysis.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-variant-analysis.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningCreateVariantAnalysisResponse.Http422Json(
          json = CodeScanningCodecs.codeScanningCreateVariantAnalysisResponseCodecAlternative2Registry.select(listOf("code-scanning/create-variant-analysis.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/create-variant-analysis.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningCreateVariantAnalysisResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningCreateVariantAnalysisResponseCodecAlternative3Registry.select(listOf("code-scanning/create-variant-analysis.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningCreateVariantAnalysisResponse = CodeScanningCreateVariantAnalysisResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/delete-analysis` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningDeleteAnalysisError

  /**
   * Typed response alternatives for `code-scanning/delete-analysis`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeScanningDeleteAnalysisResponse {
    public class SuccessJson(
      public val json: CodeScanningAnalysisDeletion,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteAnalysisResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteAnalysisResponse,
        CodeScanningDeleteAnalysisError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteAnalysisResponse,
        CodeScanningDeleteAnalysisError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteAnalysisResponse,
        CodeScanningDeleteAnalysisError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteAnalysisResponse,
        CodeScanningDeleteAnalysisError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteAnalysisResponse,
        CodeScanningDeleteAnalysisError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteAnalysisResponse
  }

  /**
   * Raised by `code-scanning/delete-analysis` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningDeleteAnalysisApiException(
    public val error: CodeScanningDeleteAnalysisError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/delete-analysis")

  private object CodeScanningDeleteAnalysisResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningDeleteAnalysisResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningDeleteAnalysisResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningDeleteAnalysisResponse> = when {
      alternative.id == "code-scanning/delete-analysis.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteAnalysisResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningDeleteAnalysisResponseCodecAlternative0Registry.select(listOf("code-scanning/delete-analysis.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/delete-analysis.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteAnalysisResponse.Http400Json(
          json = CodeScanningCodecs.codeScanningDeleteAnalysisResponseCodecAlternative1Registry.select(listOf("code-scanning/delete-analysis.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/delete-analysis.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteAnalysisResponse.Http400ScimJson(
          json = CodeScanningCodecs.codeScanningDeleteAnalysisResponseCodecAlternative2Registry.select(listOf("code-scanning/delete-analysis.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/delete-analysis.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteAnalysisResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningDeleteAnalysisResponseCodecAlternative3Registry.select(listOf("code-scanning/delete-analysis.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/delete-analysis.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteAnalysisResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningDeleteAnalysisResponseCodecAlternative4Registry.select(listOf("code-scanning/delete-analysis.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/delete-analysis.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteAnalysisResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningDeleteAnalysisResponseCodecAlternative5Registry.select(listOf("code-scanning/delete-analysis.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningDeleteAnalysisResponse = CodeScanningDeleteAnalysisResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/delete-codeql-database` may expose through its typed
   * API exception.
   */
  public sealed interface CodeScanningDeleteCodeqlDatabaseError

  /**
   * Typed response alternatives for `code-scanning/delete-codeql-database`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningDeleteCodeqlDatabaseResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteCodeqlDatabaseResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteCodeqlDatabaseResponse,
        CodeScanningDeleteCodeqlDatabaseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteCodeqlDatabaseResponse,
        CodeScanningDeleteCodeqlDatabaseError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteCodeqlDatabaseResponse,
        CodeScanningDeleteCodeqlDatabaseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningDeleteCodeqlDatabaseResponse
  }

  /**
   * Raised by `code-scanning/delete-codeql-database` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningDeleteCodeqlDatabaseApiException(
    public val error: CodeScanningDeleteCodeqlDatabaseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/delete-codeql-database")

  private object CodeScanningDeleteCodeqlDatabaseResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningDeleteCodeqlDatabaseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningDeleteCodeqlDatabaseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningDeleteCodeqlDatabaseResponse> = when {
      alternative.id == "code-scanning/delete-codeql-database.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteCodeqlDatabaseResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/delete-codeql-database.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteCodeqlDatabaseResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningDeleteCodeqlDatabaseResponseCodecAlternative1Registry.select(listOf("code-scanning/delete-codeql-database.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/delete-codeql-database.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteCodeqlDatabaseResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningDeleteCodeqlDatabaseResponseCodecAlternative2Registry.select(listOf("code-scanning/delete-codeql-database.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/delete-codeql-database.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningDeleteCodeqlDatabaseResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningDeleteCodeqlDatabaseResponseCodecAlternative3Registry.select(listOf("code-scanning/delete-codeql-database.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningDeleteCodeqlDatabaseResponse = CodeScanningDeleteCodeqlDatabaseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/get-alert` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningGetAlertError

  /**
   * Typed response alternatives for `code-scanning/get-alert`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CodeScanningGetAlertResponse {
    public class SuccessJson(
      public val json: CodeScanningAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAlertResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAlertResponse,
        CodeScanningGetAlertError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAlertResponse,
        CodeScanningGetAlertError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAlertResponse,
        CodeScanningGetAlertError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAlertResponse,
        CodeScanningGetAlertError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAlertResponse
  }

  /**
   * Raised by `code-scanning/get-alert` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CodeScanningGetAlertApiException(
    public val error: CodeScanningGetAlertError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/get-alert")

  private object CodeScanningGetAlertResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningGetAlertResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningGetAlertResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningGetAlertResponse> = when {
      alternative.id == "code-scanning/get-alert.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningGetAlertResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningGetAlertResponseCodecAlternative0Registry.select(listOf("code-scanning/get-alert.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-alert.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningGetAlertResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-alert.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningGetAlertResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningGetAlertResponseCodecAlternative2Registry.select(listOf("code-scanning/get-alert.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-alert.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningGetAlertResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningGetAlertResponseCodecAlternative3Registry.select(listOf("code-scanning/get-alert.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-alert.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningGetAlertResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningGetAlertResponseCodecAlternative4Registry.select(listOf("code-scanning/get-alert.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningGetAlertResponse = CodeScanningGetAlertResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `code-scanning/get-analysis`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeScanningGetAnalysisResponse {
    public class SuccessJson(
      public val json: CodeScanningAnalysis,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAnalysisResponse

    public class SuccessSarifJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAnalysisResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAnalysisResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAnalysisResponse

    public class Http422Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAnalysisResponse

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAnalysisResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAnalysisResponse
  }

  private object CodeScanningGetAnalysisResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningGetAnalysisResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningGetAnalysisResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningGetAnalysisResponse> = when {
      alternative.id == "code-scanning/get-analysis.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningGetAnalysisResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningGetAnalysisResponseCodecAlternative0Registry.select(listOf("code-scanning/get-analysis.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-analysis.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningGetAnalysisResponse.SuccessSarifJson(
          json = CodeScanningCodecs.codeScanningGetAnalysisResponseCodecAlternative1Registry.select(listOf("code-scanning/get-analysis.response.alternative1"), mediaType ?: "application/sarif+json").decode(body, mediaType ?: "application/sarif+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-analysis.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningGetAnalysisResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningGetAnalysisResponseCodecAlternative2Registry.select(listOf("code-scanning/get-analysis.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-analysis.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningGetAnalysisResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningGetAnalysisResponseCodecAlternative3Registry.select(listOf("code-scanning/get-analysis.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-analysis.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningGetAnalysisResponse.Http422Json(
          json = CodeScanningCodecs.codeScanningGetAnalysisResponseCodecAlternative4Registry.select(listOf("code-scanning/get-analysis.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-analysis.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeScanningGetAnalysisResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningGetAnalysisResponseCodecAlternative5Registry.select(listOf("code-scanning/get-analysis.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningGetAnalysisResponse = CodeScanningGetAnalysisResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/get-autofix` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningGetAutofixError

  /**
   * Typed response alternatives for `code-scanning/get-autofix`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeScanningGetAutofixResponse {
    public class SuccessJson(
      public val json: CodeScanningAutofix,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAutofixResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAutofixResponse,
        CodeScanningGetAutofixError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAutofixResponse,
        CodeScanningGetAutofixError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAutofixResponse,
        CodeScanningGetAutofixError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAutofixResponse,
        CodeScanningGetAutofixError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetAutofixResponse
  }

  /**
   * Raised by `code-scanning/get-autofix` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CodeScanningGetAutofixApiException(
    public val error: CodeScanningGetAutofixError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/get-autofix")

  private object CodeScanningGetAutofixResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningGetAutofixResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningGetAutofixResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningGetAutofixResponse> = when {
      alternative.id == "code-scanning/get-autofix.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningGetAutofixResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningGetAutofixResponseCodecAlternative0Registry.select(listOf("code-scanning/get-autofix.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-autofix.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningGetAutofixResponse.Http400Json(
          json = CodeScanningCodecs.codeScanningGetAutofixResponseCodecAlternative1Registry.select(listOf("code-scanning/get-autofix.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-autofix.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningGetAutofixResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningGetAutofixResponseCodecAlternative2Registry.select(listOf("code-scanning/get-autofix.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-autofix.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningGetAutofixResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningGetAutofixResponseCodecAlternative3Registry.select(listOf("code-scanning/get-autofix.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-autofix.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningGetAutofixResponse.Http500Json(
          json = CodeScanningCodecs.codeScanningGetAutofixResponseCodecAlternative4Registry.select(listOf("code-scanning/get-autofix.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningGetAutofixResponse = CodeScanningGetAutofixResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/get-codeql-database` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningGetCodeqlDatabaseError

  /**
   * Typed response alternatives for `code-scanning/get-codeql-database`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningGetCodeqlDatabaseResponse {
    public class SuccessJson(
      public val json: CodeScanningCodeqlDatabase,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetCodeqlDatabaseResponse

    public class Http302NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetCodeqlDatabaseResponse,
        CodeScanningGetCodeqlDatabaseError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetCodeqlDatabaseResponse,
        CodeScanningGetCodeqlDatabaseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetCodeqlDatabaseResponse,
        CodeScanningGetCodeqlDatabaseError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetCodeqlDatabaseResponse,
        CodeScanningGetCodeqlDatabaseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetCodeqlDatabaseResponse
  }

  /**
   * Raised by `code-scanning/get-codeql-database` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningGetCodeqlDatabaseApiException(
    public val error: CodeScanningGetCodeqlDatabaseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/get-codeql-database")

  private object CodeScanningGetCodeqlDatabaseResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningGetCodeqlDatabaseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningGetCodeqlDatabaseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningGetCodeqlDatabaseResponse> = when {
      alternative.id == "code-scanning/get-codeql-database.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningGetCodeqlDatabaseResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningGetCodeqlDatabaseResponseCodecAlternative0Registry.select(listOf("code-scanning/get-codeql-database.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-codeql-database.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningGetCodeqlDatabaseResponse.Http302NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-codeql-database.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningGetCodeqlDatabaseResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningGetCodeqlDatabaseResponseCodecAlternative2Registry.select(listOf("code-scanning/get-codeql-database.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-codeql-database.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningGetCodeqlDatabaseResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningGetCodeqlDatabaseResponseCodecAlternative3Registry.select(listOf("code-scanning/get-codeql-database.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-codeql-database.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningGetCodeqlDatabaseResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningGetCodeqlDatabaseResponseCodecAlternative4Registry.select(listOf("code-scanning/get-codeql-database.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningGetCodeqlDatabaseResponse = CodeScanningGetCodeqlDatabaseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/get-default-setup` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningGetDefaultSetupError

  /**
   * Typed response alternatives for `code-scanning/get-default-setup`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeScanningGetDefaultSetupResponse {
    public class SuccessJson(
      public val json: CodeScanningDefaultSetup,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetDefaultSetupResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetDefaultSetupResponse,
        CodeScanningGetDefaultSetupError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetDefaultSetupResponse,
        CodeScanningGetDefaultSetupError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetDefaultSetupResponse,
        CodeScanningGetDefaultSetupError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetDefaultSetupResponse
  }

  /**
   * Raised by `code-scanning/get-default-setup` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningGetDefaultSetupApiException(
    public val error: CodeScanningGetDefaultSetupError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/get-default-setup")

  private object CodeScanningGetDefaultSetupResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningGetDefaultSetupResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningGetDefaultSetupResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningGetDefaultSetupResponse> = when {
      alternative.id == "code-scanning/get-default-setup.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningGetDefaultSetupResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningGetDefaultSetupResponseCodecAlternative0Registry.select(listOf("code-scanning/get-default-setup.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-default-setup.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningGetDefaultSetupResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningGetDefaultSetupResponseCodecAlternative1Registry.select(listOf("code-scanning/get-default-setup.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-default-setup.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningGetDefaultSetupResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningGetDefaultSetupResponseCodecAlternative2Registry.select(listOf("code-scanning/get-default-setup.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-default-setup.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningGetDefaultSetupResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningGetDefaultSetupResponseCodecAlternative3Registry.select(listOf("code-scanning/get-default-setup.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningGetDefaultSetupResponse = CodeScanningGetDefaultSetupResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/get-sarif` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningGetSarifError

  /**
   * Typed response alternatives for `code-scanning/get-sarif`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CodeScanningGetSarifResponse {
    public class SuccessJson(
      public val json: CodeScanningSarifsStatus,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetSarifResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetSarifResponse,
        CodeScanningGetSarifError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetSarifResponse,
        CodeScanningGetSarifError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetSarifResponse,
        CodeScanningGetSarifError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetSarifResponse
  }

  /**
   * Raised by `code-scanning/get-sarif` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CodeScanningGetSarifApiException(
    public val error: CodeScanningGetSarifError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/get-sarif")

  private object CodeScanningGetSarifResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningGetSarifResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningGetSarifResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningGetSarifResponse> = when {
      alternative.id == "code-scanning/get-sarif.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningGetSarifResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningGetSarifResponseCodecAlternative0Registry.select(listOf("code-scanning/get-sarif.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-sarif.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningGetSarifResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningGetSarifResponseCodecAlternative1Registry.select(listOf("code-scanning/get-sarif.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-sarif.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningGetSarifResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-sarif.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningGetSarifResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningGetSarifResponseCodecAlternative3Registry.select(listOf("code-scanning/get-sarif.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningGetSarifResponse = CodeScanningGetSarifResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/get-variant-analysis` may expose through its typed
   * API exception.
   */
  public sealed interface CodeScanningGetVariantAnalysisError

  /**
   * Typed response alternatives for `code-scanning/get-variant-analysis`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningGetVariantAnalysisResponse {
    public class SuccessJson(
      public val json: CodeScanningVariantAnalysis,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetVariantAnalysisResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetVariantAnalysisResponse,
        CodeScanningGetVariantAnalysisError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetVariantAnalysisResponse,
        CodeScanningGetVariantAnalysisError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetVariantAnalysisResponse
  }

  /**
   * Raised by `code-scanning/get-variant-analysis` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningGetVariantAnalysisApiException(
    public val error: CodeScanningGetVariantAnalysisError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/get-variant-analysis")

  private object CodeScanningGetVariantAnalysisResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningGetVariantAnalysisResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningGetVariantAnalysisResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningGetVariantAnalysisResponse> = when {
      alternative.id == "code-scanning/get-variant-analysis.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningGetVariantAnalysisResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningGetVariantAnalysisResponseCodecAlternative0Registry.select(listOf("code-scanning/get-variant-analysis.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-variant-analysis.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningGetVariantAnalysisResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningGetVariantAnalysisResponseCodecAlternative1Registry.select(listOf("code-scanning/get-variant-analysis.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-variant-analysis.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningGetVariantAnalysisResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningGetVariantAnalysisResponseCodecAlternative2Registry.select(listOf("code-scanning/get-variant-analysis.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningGetVariantAnalysisResponse = CodeScanningGetVariantAnalysisResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/get-variant-analysis-repo-task` may expose through
   * its typed API exception.
   */
  public sealed interface CodeScanningGetVariantAnalysisRepoTaskError

  /**
   * Typed response alternatives for `code-scanning/get-variant-analysis-repo-task`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodeScanningGetVariantAnalysisRepoTaskResponse {
    public class SuccessJson(
      public val json: CodeScanningVariantAnalysisRepoTask,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetVariantAnalysisRepoTaskResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetVariantAnalysisRepoTaskResponse,
        CodeScanningGetVariantAnalysisRepoTaskError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetVariantAnalysisRepoTaskResponse,
        CodeScanningGetVariantAnalysisRepoTaskError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningGetVariantAnalysisRepoTaskResponse
  }

  /**
   * Raised by `code-scanning/get-variant-analysis-repo-task` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningGetVariantAnalysisRepoTaskApiException(
    public val error: CodeScanningGetVariantAnalysisRepoTaskError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/get-variant-analysis-repo-task")

  private object CodeScanningGetVariantAnalysisRepoTaskResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningGetVariantAnalysisRepoTaskResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningGetVariantAnalysisRepoTaskResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningGetVariantAnalysisRepoTaskResponse> = when {
      alternative.id == "code-scanning/get-variant-analysis-repo-task.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningGetVariantAnalysisRepoTaskResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative0Registry.select(listOf("code-scanning/get-variant-analysis-repo-task.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-variant-analysis-repo-task.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningGetVariantAnalysisRepoTaskResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative1Registry.select(listOf("code-scanning/get-variant-analysis-repo-task.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/get-variant-analysis-repo-task.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningGetVariantAnalysisRepoTaskResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningGetVariantAnalysisRepoTaskResponseCodecAlternative2Registry.select(listOf("code-scanning/get-variant-analysis-repo-task.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningGetVariantAnalysisRepoTaskResponse = CodeScanningGetVariantAnalysisRepoTaskResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/list-alert-instances` may expose through its typed
   * API exception.
   */
  public sealed interface CodeScanningListAlertInstancesError

  /**
   * Typed response alternatives for `code-scanning/list-alert-instances`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningListAlertInstancesResponse {
    public class SuccessJson(
      public val json: List<CodeScanningAlertInstanceList>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertInstancesResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertInstancesResponse,
        CodeScanningListAlertInstancesError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertInstancesResponse,
        CodeScanningListAlertInstancesError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertInstancesResponse,
        CodeScanningListAlertInstancesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertInstancesResponse
  }

  /**
   * Raised by `code-scanning/list-alert-instances` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningListAlertInstancesApiException(
    public val error: CodeScanningListAlertInstancesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/list-alert-instances")

  private object CodeScanningListAlertInstancesResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningListAlertInstancesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningListAlertInstancesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningListAlertInstancesResponse> = when {
      alternative.id == "code-scanning/list-alert-instances.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertInstancesResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningListAlertInstancesResponseCodecAlternative0Registry.select(listOf("code-scanning/list-alert-instances.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alert-instances.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertInstancesResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningListAlertInstancesResponseCodecAlternative1Registry.select(listOf("code-scanning/list-alert-instances.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alert-instances.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertInstancesResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningListAlertInstancesResponseCodecAlternative2Registry.select(listOf("code-scanning/list-alert-instances.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alert-instances.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertInstancesResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningListAlertInstancesResponseCodecAlternative3Registry.select(listOf("code-scanning/list-alert-instances.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningListAlertInstancesResponse = CodeScanningListAlertInstancesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/list-alerts-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningListAlertsForOrgError

  /**
   * Typed response alternatives for `code-scanning/list-alerts-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningListAlertsForOrgResponse {
    public class SuccessJson(
      public val json: List<CodeScanningOrganizationAlertItems>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForOrgResponse,
        CodeScanningListAlertsForOrgError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForOrgResponse,
        CodeScanningListAlertsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForOrgResponse
  }

  /**
   * Raised by `code-scanning/list-alerts-for-org` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningListAlertsForOrgApiException(
    public val error: CodeScanningListAlertsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/list-alerts-for-org")

  private object CodeScanningListAlertsForOrgResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningListAlertsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningListAlertsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningListAlertsForOrgResponse> = when {
      alternative.id == "code-scanning/list-alerts-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertsForOrgResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningListAlertsForOrgResponseCodecAlternative0Registry.select(listOf("code-scanning/list-alerts-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alerts-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertsForOrgResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningListAlertsForOrgResponseCodecAlternative1Registry.select(listOf("code-scanning/list-alerts-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alerts-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertsForOrgResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningListAlertsForOrgResponseCodecAlternative2Registry.select(listOf("code-scanning/list-alerts-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningListAlertsForOrgResponse = CodeScanningListAlertsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/list-alerts-for-repo` may expose through its typed
   * API exception.
   */
  public sealed interface CodeScanningListAlertsForRepoError

  /**
   * Typed response alternatives for `code-scanning/list-alerts-for-repo`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningListAlertsForRepoResponse {
    public class SuccessJson(
      public val json: List<CodeScanningAlertItems>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForRepoResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForRepoResponse,
        CodeScanningListAlertsForRepoError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForRepoResponse,
        CodeScanningListAlertsForRepoError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForRepoResponse,
        CodeScanningListAlertsForRepoError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForRepoResponse,
        CodeScanningListAlertsForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListAlertsForRepoResponse
  }

  /**
   * Raised by `code-scanning/list-alerts-for-repo` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningListAlertsForRepoApiException(
    public val error: CodeScanningListAlertsForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/list-alerts-for-repo")

  private object CodeScanningListAlertsForRepoResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningListAlertsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningListAlertsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningListAlertsForRepoResponse> = when {
      alternative.id == "code-scanning/list-alerts-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertsForRepoResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningListAlertsForRepoResponseCodecAlternative0Registry.select(listOf("code-scanning/list-alerts-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alerts-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertsForRepoResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alerts-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertsForRepoResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningListAlertsForRepoResponseCodecAlternative2Registry.select(listOf("code-scanning/list-alerts-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alerts-for-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertsForRepoResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningListAlertsForRepoResponseCodecAlternative3Registry.select(listOf("code-scanning/list-alerts-for-repo.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-alerts-for-repo.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningListAlertsForRepoResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningListAlertsForRepoResponseCodecAlternative4Registry.select(listOf("code-scanning/list-alerts-for-repo.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningListAlertsForRepoResponse = CodeScanningListAlertsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/list-codeql-databases` may expose through its typed
   * API exception.
   */
  public sealed interface CodeScanningListCodeqlDatabasesError

  /**
   * Typed response alternatives for `code-scanning/list-codeql-databases`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningListCodeqlDatabasesResponse {
    public class SuccessJson(
      public val json: List<CodeScanningCodeqlDatabase>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListCodeqlDatabasesResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListCodeqlDatabasesResponse,
        CodeScanningListCodeqlDatabasesError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListCodeqlDatabasesResponse,
        CodeScanningListCodeqlDatabasesError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListCodeqlDatabasesResponse,
        CodeScanningListCodeqlDatabasesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListCodeqlDatabasesResponse
  }

  /**
   * Raised by `code-scanning/list-codeql-databases` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningListCodeqlDatabasesApiException(
    public val error: CodeScanningListCodeqlDatabasesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/list-codeql-databases")

  private object CodeScanningListCodeqlDatabasesResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningListCodeqlDatabasesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningListCodeqlDatabasesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningListCodeqlDatabasesResponse> = when {
      alternative.id == "code-scanning/list-codeql-databases.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningListCodeqlDatabasesResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningListCodeqlDatabasesResponseCodecAlternative0Registry.select(listOf("code-scanning/list-codeql-databases.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-codeql-databases.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningListCodeqlDatabasesResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningListCodeqlDatabasesResponseCodecAlternative1Registry.select(listOf("code-scanning/list-codeql-databases.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-codeql-databases.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningListCodeqlDatabasesResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningListCodeqlDatabasesResponseCodecAlternative2Registry.select(listOf("code-scanning/list-codeql-databases.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-codeql-databases.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningListCodeqlDatabasesResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningListCodeqlDatabasesResponseCodecAlternative3Registry.select(listOf("code-scanning/list-codeql-databases.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningListCodeqlDatabasesResponse = CodeScanningListCodeqlDatabasesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/list-recent-analyses` may expose through its typed
   * API exception.
   */
  public sealed interface CodeScanningListRecentAnalysesError

  /**
   * Typed response alternatives for `code-scanning/list-recent-analyses`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningListRecentAnalysesResponse {
    public class SuccessJson(
      public val json: List<CodeScanningAnalysis>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListRecentAnalysesResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListRecentAnalysesResponse,
        CodeScanningListRecentAnalysesError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListRecentAnalysesResponse,
        CodeScanningListRecentAnalysesError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListRecentAnalysesResponse,
        CodeScanningListRecentAnalysesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningListRecentAnalysesResponse
  }

  /**
   * Raised by `code-scanning/list-recent-analyses` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodeScanningListRecentAnalysesApiException(
    public val error: CodeScanningListRecentAnalysesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/list-recent-analyses")

  private object CodeScanningListRecentAnalysesResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningListRecentAnalysesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningListRecentAnalysesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningListRecentAnalysesResponse> = when {
      alternative.id == "code-scanning/list-recent-analyses.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningListRecentAnalysesResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningListRecentAnalysesResponseCodecAlternative0Registry.select(listOf("code-scanning/list-recent-analyses.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-recent-analyses.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningListRecentAnalysesResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningListRecentAnalysesResponseCodecAlternative1Registry.select(listOf("code-scanning/list-recent-analyses.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-recent-analyses.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningListRecentAnalysesResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningListRecentAnalysesResponseCodecAlternative2Registry.select(listOf("code-scanning/list-recent-analyses.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/list-recent-analyses.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningListRecentAnalysesResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningListRecentAnalysesResponseCodecAlternative3Registry.select(listOf("code-scanning/list-recent-analyses.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningListRecentAnalysesResponse = CodeScanningListRecentAnalysesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/update-alert` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningUpdateAlertError

  /**
   * Typed response alternatives for `code-scanning/update-alert`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeScanningUpdateAlertResponse {
    public class SuccessJson(
      public val json: CodeScanningAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateAlertResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateAlertResponse,
        CodeScanningUpdateAlertError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateAlertResponse,
        CodeScanningUpdateAlertError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateAlertResponse,
        CodeScanningUpdateAlertError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateAlertResponse,
        CodeScanningUpdateAlertError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateAlertResponse,
        CodeScanningUpdateAlertError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateAlertResponse
  }

  /**
   * Raised by `code-scanning/update-alert` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CodeScanningUpdateAlertApiException(
    public val error: CodeScanningUpdateAlertError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/update-alert")

  private object CodeScanningUpdateAlertResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningUpdateAlertResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningUpdateAlertResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningUpdateAlertResponse> = when {
      alternative.id == "code-scanning/update-alert.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateAlertResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningUpdateAlertResponseCodecAlternative0Registry.select(listOf("code-scanning/update-alert.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-alert.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateAlertResponse.Http400Json(
          json = CodeScanningCodecs.codeScanningUpdateAlertResponseCodecAlternative1Registry.select(listOf("code-scanning/update-alert.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-alert.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateAlertResponse.Http400ScimJson(
          json = CodeScanningCodecs.codeScanningUpdateAlertResponseCodecAlternative2Registry.select(listOf("code-scanning/update-alert.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-alert.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateAlertResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningUpdateAlertResponseCodecAlternative3Registry.select(listOf("code-scanning/update-alert.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-alert.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateAlertResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningUpdateAlertResponseCodecAlternative4Registry.select(listOf("code-scanning/update-alert.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-alert.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateAlertResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningUpdateAlertResponseCodecAlternative5Registry.select(listOf("code-scanning/update-alert.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningUpdateAlertResponse = CodeScanningUpdateAlertResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `code-scanning/update-default-setup`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeScanningUpdateDefaultSetupResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateDefaultSetupResponse

    public class SuccessJson2(
      public val json: CodeScanningDefaultSetupUpdateResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateDefaultSetupResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateDefaultSetupResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateDefaultSetupResponse

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateDefaultSetupResponse

    public class Http422Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateDefaultSetupResponse

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateDefaultSetupResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUpdateDefaultSetupResponse
  }

  private object CodeScanningUpdateDefaultSetupResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningUpdateDefaultSetupResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningUpdateDefaultSetupResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningUpdateDefaultSetupResponse> = when {
      alternative.id == "code-scanning/update-default-setup.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateDefaultSetupResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningUpdateDefaultSetupResponseCodecAlternative0Registry.select(listOf("code-scanning/update-default-setup.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-default-setup.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateDefaultSetupResponse.SuccessJson2(
          json = CodeScanningCodecs.codeScanningUpdateDefaultSetupResponseCodecAlternative1Registry.select(listOf("code-scanning/update-default-setup.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-default-setup.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateDefaultSetupResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningUpdateDefaultSetupResponseCodecAlternative2Registry.select(listOf("code-scanning/update-default-setup.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-default-setup.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateDefaultSetupResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningUpdateDefaultSetupResponseCodecAlternative3Registry.select(listOf("code-scanning/update-default-setup.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-default-setup.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateDefaultSetupResponse.Http409Json(
          json = CodeScanningCodecs.codeScanningUpdateDefaultSetupResponseCodecAlternative4Registry.select(listOf("code-scanning/update-default-setup.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-default-setup.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateDefaultSetupResponse.Http422Json(
          json = CodeScanningCodecs.codeScanningUpdateDefaultSetupResponseCodecAlternative5Registry.select(listOf("code-scanning/update-default-setup.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/update-default-setup.response.alternative6" -> SdkResponseDecodeResult(
        value = CodeScanningUpdateDefaultSetupResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningUpdateDefaultSetupResponseCodecAlternative6Registry.select(listOf("code-scanning/update-default-setup.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningUpdateDefaultSetupResponse = CodeScanningUpdateDefaultSetupResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-scanning/upload-sarif` may expose through its typed API
   * exception.
   */
  public sealed interface CodeScanningUploadSarifError

  /**
   * Typed response alternatives for `code-scanning/upload-sarif`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeScanningUploadSarifResponse {
    public class SuccessJson(
      public val json: CodeScanningSarifsReceipt,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUploadSarifResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUploadSarifResponse,
        CodeScanningUploadSarifError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUploadSarifResponse,
        CodeScanningUploadSarifError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUploadSarifResponse,
        CodeScanningUploadSarifError

    public class Http413NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUploadSarifResponse,
        CodeScanningUploadSarifError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUploadSarifResponse,
        CodeScanningUploadSarifError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeScanningUploadSarifResponse
  }

  /**
   * Raised by `code-scanning/upload-sarif` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CodeScanningUploadSarifApiException(
    public val error: CodeScanningUploadSarifError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-scanning/upload-sarif")

  private object CodeScanningUploadSarifResponseDecoder : SdkResponseAlternativeDecoder<CodeScanningUploadSarifResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeScanningUploadSarifResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeScanningUploadSarifResponse> = when {
      alternative.id == "code-scanning/upload-sarif.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeScanningUploadSarifResponse.SuccessJson(
          json = CodeScanningCodecs.codeScanningUploadSarifResponseCodecAlternative0Registry.select(listOf("code-scanning/upload-sarif.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/upload-sarif.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeScanningUploadSarifResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/upload-sarif.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeScanningUploadSarifResponse.Http403Json(
          json = CodeScanningCodecs.codeScanningUploadSarifResponseCodecAlternative2Registry.select(listOf("code-scanning/upload-sarif.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/upload-sarif.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeScanningUploadSarifResponse.Http404Json(
          json = CodeScanningCodecs.codeScanningUploadSarifResponseCodecAlternative3Registry.select(listOf("code-scanning/upload-sarif.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/upload-sarif.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeScanningUploadSarifResponse.Http413NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-scanning/upload-sarif.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeScanningUploadSarifResponse.Http503Json(
          json = CodeScanningCodecs.codeScanningUploadSarifResponseCodecAlternative5Registry.select(listOf("code-scanning/upload-sarif.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeScanningUploadSarifResponse = CodeScanningUploadSarifResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val codeScanningCommitAutofixMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/commit-autofix",
          method = "POST",
          path = "/repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/autofix/commits",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningAutofixCommitsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/commit-autofix.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/commit-autofix.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/commit-autofix.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/commit-autofix.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/commit-autofix.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/commit-autofix.response.alternative5",
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

    internal val codeScanningCreateAutofixMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/create-autofix",
          method = "POST",
          path = "/repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/autofix",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningAutofix",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-autofix.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningAutofix",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-autofix.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-autofix.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-autofix.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-autofix.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-autofix.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-autofix.response.alternative6",
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

    internal val codeScanningCreateVariantAnalysisMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/create-variant-analysis",
          method = "POST",
          path = "/repos/{owner}/{repo}/code-scanning/codeql/variant-analyses",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningVariantAnalysis",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-variant-analysis.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-variant-analysis.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-variant-analysis.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/create-variant-analysis.response.alternative3",
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

    internal val codeScanningDeleteAnalysisMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/delete-analysis",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/code-scanning/analyses/{analysis_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningAnalysisDeletion",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-analysis.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-analysis.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-analysis.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-analysis.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-analysis.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-analysis.response.alternative5",
            ),
          ),
          security = emptyList(),
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

    internal val codeScanningDeleteCodeqlDatabaseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/delete-codeql-database",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/code-scanning/codeql/databases/{language}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-codeql-database.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-codeql-database.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-codeql-database.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/delete-codeql-database.response.alternative3",
            ),
          ),
          security = emptyList(),
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

    internal val codeScanningGetAlertMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/get-alert",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/alerts/{alert_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-alert.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-alert.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-alert.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-alert.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-alert.response.alternative4",
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

    internal val codeScanningGetAnalysisMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/get-analysis",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/analyses/{analysis_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json", "application/sarif+json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningAnalysis",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-analysis.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/sarif+json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-analysis.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-analysis.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-analysis.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-analysis.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-analysis.response.alternative5",
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

    internal val codeScanningGetAutofixMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/get-autofix",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/autofix",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningAutofix",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-autofix.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-autofix.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-autofix.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-autofix.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-autofix.response.alternative4",
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

    internal val codeScanningGetCodeqlDatabaseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/get-codeql-database",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/codeql/databases/{language}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningCodeqlDatabase",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-codeql-database.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 302),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-codeql-database.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-codeql-database.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-codeql-database.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-codeql-database.response.alternative4",
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

    internal val codeScanningGetDefaultSetupMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/get-default-setup",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/default-setup",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningDefaultSetup",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-default-setup.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-default-setup.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-default-setup.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-default-setup.response.alternative3",
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

    internal val codeScanningGetSarifMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/get-sarif",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/sarifs/{sarif_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningSarifsStatus",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-sarif.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-sarif.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-sarif.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-sarif.response.alternative3",
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

    internal val codeScanningGetVariantAnalysisMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/get-variant-analysis",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/codeql/variant-analyses/{codeql_variant_analysis_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningVariantAnalysis",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-variant-analysis.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-variant-analysis.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-variant-analysis.response.alternative2",
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

    internal val codeScanningGetVariantAnalysisRepoTaskMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/get-variant-analysis-repo-task",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/codeql/variant-analyses/{codeql_variant_analysis_id}/repos/{repo_owner}/{repo_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningVariantAnalysisRepoTask",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-variant-analysis-repo-task.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-variant-analysis-repo-task.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/get-variant-analysis-repo-task.response.alternative2",
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

    internal val codeScanningListAlertInstancesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/list-alert-instances",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/alerts/{alert_number}/instances",
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
              id = "code-scanning/list-alert-instances.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alert-instances.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alert-instances.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alert-instances.response.alternative3",
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

    internal val codeScanningListAlertsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/list-alerts-for-org",
          method = "GET",
          path = "/orgs/{org}/code-scanning/alerts",
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
              id = "code-scanning/list-alerts-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alerts-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alerts-for-org.response.alternative2",
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

    internal val codeScanningListAlertsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/list-alerts-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/alerts",
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
              id = "code-scanning/list-alerts-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alerts-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alerts-for-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alerts-for-repo.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-alerts-for-repo.response.alternative4",
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

    internal val codeScanningListCodeqlDatabasesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/list-codeql-databases",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/codeql/databases",
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
              id = "code-scanning/list-codeql-databases.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-codeql-databases.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-codeql-databases.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-codeql-databases.response.alternative3",
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

    internal val codeScanningListRecentAnalysesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/list-recent-analyses",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-scanning/analyses",
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
              id = "code-scanning/list-recent-analyses.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-recent-analyses.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-recent-analyses.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/list-recent-analyses.response.alternative3",
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

    internal val codeScanningUpdateAlertMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/update-alert",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/code-scanning/alerts/{alert_number}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-alert.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-alert.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-alert.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-alert.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-alert.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-alert.response.alternative5",
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

    internal val codeScanningUpdateDefaultSetupMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/update-default-setup",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/code-scanning/default-setup",
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
              id = "code-scanning/update-default-setup.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningDefaultSetupUpdateResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-default-setup.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-default-setup.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-default-setup.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-default-setup.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-default-setup.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/update-default-setup.response.alternative6",
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

    internal val codeScanningUploadSarifMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-scanning/upload-sarif",
          method = "POST",
          path = "/repos/{owner}/{repo}/code-scanning/sarifs",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeScanningSarifsReceipt",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/upload-sarif.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/upload-sarif.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/upload-sarif.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/upload-sarif.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 413),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/upload-sarif.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "code-scanning/upload-sarif.response.alternative5",
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
