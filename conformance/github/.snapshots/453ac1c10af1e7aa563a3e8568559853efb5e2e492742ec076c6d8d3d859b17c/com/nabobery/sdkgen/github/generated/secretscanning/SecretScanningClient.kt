package com.nabobery.sdkgen.github.generated.secretscanning

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineDirectionParameterX3053723f
import com.nabobery.sdkgen.github.generated.InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad
import com.nabobery.sdkgen.github.generated.InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516
import com.nabobery.sdkgen.github.generated.InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f
import com.nabobery.sdkgen.github.generated.InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c
import com.nabobery.sdkgen.github.generated.InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5
import com.nabobery.sdkgen.github.generated.InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea
import com.nabobery.sdkgen.github.generated.InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f
import com.nabobery.sdkgen.github.generated.InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692
import com.nabobery.sdkgen.github.generated.InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14
import com.nabobery.sdkgen.github.generated.InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53
import com.nabobery.sdkgen.github.generated.InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534
import com.nabobery.sdkgen.github.generated.InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52
import com.nabobery.sdkgen.github.generated.InlineSecretScanningAlertSortParameterXabb1dc87
import com.nabobery.sdkgen.github.generated.InlineSecretScanningAlertStateParameterX609aff21
import com.nabobery.sdkgen.github.generated.InlineSecretScanningCustomPatternPushProtectionParameterXf4799756
import com.nabobery.sdkgen.github.generated.InlineSecretScanningCustomPatternSortParameterX63e666f9
import com.nabobery.sdkgen.github.generated.InlineSecretScanningCustomPatternStateParameterX0fd7eb62
import com.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import com.nabobery.sdkgen.github.generated.OrganizationSecretScanningAlert
import com.nabobery.sdkgen.github.generated.ScimError
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.SecretScanningAlert
import com.nabobery.sdkgen.github.generated.SecretScanningAlertWithMetadata
import com.nabobery.sdkgen.github.generated.SecretScanningCustomPattern
import com.nabobery.sdkgen.github.generated.SecretScanningCustomPatternToUpdate
import com.nabobery.sdkgen.github.generated.SecretScanningLocation
import com.nabobery.sdkgen.github.generated.SecretScanningPatternConfiguration
import com.nabobery.sdkgen.github.generated.SecretScanningPushProtectionBypass
import com.nabobery.sdkgen.github.generated.SecretScanningScanHistory
import com.nabobery.sdkgen.github.generated.ValidationError
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

public object SecretScanningCodecs {
  public const val SECRETSCANNINGBULKCREATEORGCUSTOMPATTERNS_REQUEST_CODEC_ID: String =
      "secret-scanning/bulk-create-org-custom-patterns.request"

  private val secretScanningBulkCreateOrgCustomPatternsRequestCodec:
      MediaTypeCodec<InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516> =
      KotlinxSerializationCodec(SECRETSCANNINGBULKCREATEORGCUSTOMPATTERNS_REQUEST_CODEC_ID, InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516.Serializer, SdkJson)

  public const val SECRETSCANNINGBULKCREATEORGCUSTOMPATTERNS_RESPONSE_CODEC_ID: String =
      "secret-scanning/bulk-create-org-custom-patterns.response"

  private val secretScanningBulkCreateOrgCustomPatternsResponseCodec:
      MediaTypeCodec<InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f> =
      KotlinxSerializationCodec(SECRETSCANNINGBULKCREATEORGCUSTOMPATTERNS_RESPONSE_CODEC_ID, InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f.Serializer, SdkJson)

  private val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-org-custom-patterns.response.alternative0", InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f.Serializer, SdkJson)

  public val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative0Codec)

  private val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-org-custom-patterns.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative1Codec)

  private val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-org-custom-patterns.response.alternative2", ScimError.Serializer, SdkJson)

  public val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative2Codec)

  private val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-org-custom-patterns.response.alternative3", BasicError.Serializer, SdkJson)

  public val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative3Codec)

  private val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-org-custom-patterns.response.alternative4", BasicError.Serializer, SdkJson)

  public val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative4Codec)

  private val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-org-custom-patterns.response.alternative5", InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c.Serializer, SdkJson)

  public val secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative5Codec)

  public val secretScanningBulkCreateOrgCustomPatternsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateOrgCustomPatternsRequestCodec)

  public val secretScanningBulkCreateOrgCustomPatternsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateOrgCustomPatternsResponseCodec)

  public const val SECRETSCANNINGBULKCREATEREPOCUSTOMPATTERNS_REQUEST_CODEC_ID: String =
      "secret-scanning/bulk-create-repo-custom-patterns.request"

  private val secretScanningBulkCreateRepoCustomPatternsRequestCodec:
      MediaTypeCodec<InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14> =
      KotlinxSerializationCodec(SECRETSCANNINGBULKCREATEREPOCUSTOMPATTERNS_REQUEST_CODEC_ID, InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14.Serializer, SdkJson)

  public const val SECRETSCANNINGBULKCREATEREPOCUSTOMPATTERNS_RESPONSE_CODEC_ID: String =
      "secret-scanning/bulk-create-repo-custom-patterns.response"

  private val secretScanningBulkCreateRepoCustomPatternsResponseCodec:
      MediaTypeCodec<InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53> =
      KotlinxSerializationCodec(SECRETSCANNINGBULKCREATEREPOCUSTOMPATTERNS_RESPONSE_CODEC_ID, InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53.Serializer, SdkJson)

  private val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-repo-custom-patterns.response.alternative0", InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53.Serializer, SdkJson)

  public val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative0Codec)

  private val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-repo-custom-patterns.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative1Codec)

  private val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-repo-custom-patterns.response.alternative2", ScimError.Serializer, SdkJson)

  public val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative2Codec)

  private val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-repo-custom-patterns.response.alternative3", BasicError.Serializer, SdkJson)

  public val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative3Codec)

  private val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-repo-custom-patterns.response.alternative4", BasicError.Serializer, SdkJson)

  public val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative4Codec)

  private val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534> =
      KotlinxSerializationCodec("secret-scanning/bulk-create-repo-custom-patterns.response.alternative5", InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534.Serializer, SdkJson)

  public val secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative5Codec)

  public val secretScanningBulkCreateRepoCustomPatternsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateRepoCustomPatternsRequestCodec)

  public val secretScanningBulkCreateRepoCustomPatternsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53> =
      MediaTypeCodecRegistry.of(secretScanningBulkCreateRepoCustomPatternsResponseCodec)

  public const val SECRETSCANNINGBULKDELETEORGCUSTOMPATTERNS_REQUEST_CODEC_ID: String =
      "secret-scanning/bulk-delete-org-custom-patterns.request"

  private val secretScanningBulkDeleteOrgCustomPatternsRequestCodec:
      MediaTypeCodec<InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad> =
      KotlinxSerializationCodec(SECRETSCANNINGBULKDELETEORGCUSTOMPATTERNS_REQUEST_CODEC_ID, InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad.Serializer, SdkJson)

  private val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-org-custom-patterns.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative1Codec)

  private val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-org-custom-patterns.response.alternative2", ScimError.Serializer, SdkJson)

  public val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative2Codec)

  private val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-org-custom-patterns.response.alternative3", BasicError.Serializer, SdkJson)

  public val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative3Codec)

  private val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-org-custom-patterns.response.alternative4", BasicError.Serializer, SdkJson)

  public val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative4Codec)

  private val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-org-custom-patterns.response.alternative5", BasicError.Serializer, SdkJson)

  public val secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative5Codec)

  public val secretScanningBulkDeleteOrgCustomPatternsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteOrgCustomPatternsRequestCodec)

  public val secretScanningBulkDeleteOrgCustomPatternsResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val SECRETSCANNINGBULKDELETEREPOCUSTOMPATTERNS_REQUEST_CODEC_ID: String =
      "secret-scanning/bulk-delete-repo-custom-patterns.request"

  private val secretScanningBulkDeleteRepoCustomPatternsRequestCodec:
      MediaTypeCodec<InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692> =
      KotlinxSerializationCodec(SECRETSCANNINGBULKDELETEREPOCUSTOMPATTERNS_REQUEST_CODEC_ID, InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692.Serializer, SdkJson)

  private val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative1Codec)

  private val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative2", ScimError.Serializer, SdkJson)

  public val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative2Codec)

  private val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative3", BasicError.Serializer, SdkJson)

  public val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative3Codec)

  private val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative4", BasicError.Serializer, SdkJson)

  public val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative4Codec)

  private val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative5", BasicError.Serializer, SdkJson)

  public val secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative5Codec)

  public val secretScanningBulkDeleteRepoCustomPatternsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692> =
      MediaTypeCodecRegistry.of(secretScanningBulkDeleteRepoCustomPatternsRequestCodec)

  public val secretScanningBulkDeleteRepoCustomPatternsResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val SECRETSCANNINGCREATEPUSHPROTECTIONBYPASS_REQUEST_CODEC_ID: String =
      "secret-scanning/create-push-protection-bypass.request"

  private val secretScanningCreatePushProtectionBypassRequestCodec:
      MediaTypeCodec<InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52> =
      KotlinxSerializationCodec(SECRETSCANNINGCREATEPUSHPROTECTIONBYPASS_REQUEST_CODEC_ID, InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52.Serializer, SdkJson)

  public const val SECRETSCANNINGCREATEPUSHPROTECTIONBYPASS_RESPONSE_CODEC_ID: String =
      "secret-scanning/create-push-protection-bypass.response"

  private val secretScanningCreatePushProtectionBypassResponseCodec:
      MediaTypeCodec<SecretScanningPushProtectionBypass> =
      KotlinxSerializationCodec(SECRETSCANNINGCREATEPUSHPROTECTIONBYPASS_RESPONSE_CODEC_ID, SecretScanningPushProtectionBypass.Serializer, SdkJson)

  private val secretScanningCreatePushProtectionBypassResponseCodecAlternative0Codec:
      MediaTypeCodec<SecretScanningPushProtectionBypass> =
      KotlinxSerializationCodec("secret-scanning/create-push-protection-bypass.response.alternative0", SecretScanningPushProtectionBypass.Serializer, SdkJson)

  public val secretScanningCreatePushProtectionBypassResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SecretScanningPushProtectionBypass> =
      MediaTypeCodecRegistry.of(secretScanningCreatePushProtectionBypassResponseCodecAlternative0Codec)

  private val secretScanningCreatePushProtectionBypassResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("secret-scanning/create-push-protection-bypass.response.alternative4", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val secretScanningCreatePushProtectionBypassResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(secretScanningCreatePushProtectionBypassResponseCodecAlternative4Codec)

  public val secretScanningCreatePushProtectionBypassRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52>
      = MediaTypeCodecRegistry.of(secretScanningCreatePushProtectionBypassRequestCodec)

  public val secretScanningCreatePushProtectionBypassResponseCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningPushProtectionBypass> =
      MediaTypeCodecRegistry.of(secretScanningCreatePushProtectionBypassResponseCodec)

  public const val SECRETSCANNINGGETALERT_RESPONSE_CODEC_ID: String =
      "secret-scanning/get-alert.response"

  private val secretScanningGetAlertResponseCodec: MediaTypeCodec<SecretScanningAlertWithMetadata> =
      KotlinxSerializationCodec(SECRETSCANNINGGETALERT_RESPONSE_CODEC_ID, SecretScanningAlertWithMetadata.Serializer, SdkJson)

  private val secretScanningGetAlertResponseCodecAlternative0Codec:
      MediaTypeCodec<SecretScanningAlertWithMetadata> =
      KotlinxSerializationCodec("secret-scanning/get-alert.response.alternative0", SecretScanningAlertWithMetadata.Serializer, SdkJson)

  public val secretScanningGetAlertResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SecretScanningAlertWithMetadata> =
      MediaTypeCodecRegistry.of(secretScanningGetAlertResponseCodecAlternative0Codec)

  private val secretScanningGetAlertResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("secret-scanning/get-alert.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val secretScanningGetAlertResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(secretScanningGetAlertResponseCodecAlternative3Codec)

  public val secretScanningGetAlertRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val secretScanningGetAlertResponseCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningAlertWithMetadata> =
      MediaTypeCodecRegistry.of(secretScanningGetAlertResponseCodec)

  public const val SECRETSCANNINGGETSCANHISTORY_RESPONSE_CODEC_ID: String =
      "secret-scanning/get-scan-history.response"

  private val secretScanningGetScanHistoryResponseCodec: MediaTypeCodec<SecretScanningScanHistory> =
      KotlinxSerializationCodec(SECRETSCANNINGGETSCANHISTORY_RESPONSE_CODEC_ID, SecretScanningScanHistory.Serializer, SdkJson)

  private val secretScanningGetScanHistoryResponseCodecAlternative0Codec:
      MediaTypeCodec<SecretScanningScanHistory> =
      KotlinxSerializationCodec("secret-scanning/get-scan-history.response.alternative0", SecretScanningScanHistory.Serializer, SdkJson)

  public val secretScanningGetScanHistoryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SecretScanningScanHistory> =
      MediaTypeCodecRegistry.of(secretScanningGetScanHistoryResponseCodecAlternative0Codec)

  private val secretScanningGetScanHistoryResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("secret-scanning/get-scan-history.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val secretScanningGetScanHistoryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(secretScanningGetScanHistoryResponseCodecAlternative2Codec)

  public val secretScanningGetScanHistoryRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val secretScanningGetScanHistoryResponseCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningScanHistory> =
      MediaTypeCodecRegistry.of(secretScanningGetScanHistoryResponseCodec)

  public const val SECRETSCANNINGLISTALERTSFORORG_RESPONSE_CODEC_ID: String =
      "secret-scanning/list-alerts-for-org.response"

  private val secretScanningListAlertsForOrgResponseCodec:
      MediaTypeCodec<List<OrganizationSecretScanningAlert>> =
      KotlinxSerializationCodec(SECRETSCANNINGLISTALERTSFORORG_RESPONSE_CODEC_ID, ListSerializer(OrganizationSecretScanningAlert.Serializer), SdkJson)

  private val secretScanningListAlertsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<OrganizationSecretScanningAlert>> =
      KotlinxSerializationCodec("secret-scanning/list-alerts-for-org.response.alternative0", ListSerializer(OrganizationSecretScanningAlert.Serializer), SdkJson)

  public val secretScanningListAlertsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<OrganizationSecretScanningAlert>> =
      MediaTypeCodecRegistry.of(secretScanningListAlertsForOrgResponseCodecAlternative0Codec)

  private val secretScanningListAlertsForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/list-alerts-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningListAlertsForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningListAlertsForOrgResponseCodecAlternative1Codec)

  private val secretScanningListAlertsForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("secret-scanning/list-alerts-for-org.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val secretScanningListAlertsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(secretScanningListAlertsForOrgResponseCodecAlternative2Codec)

  public val secretScanningListAlertsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val secretScanningListAlertsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<OrganizationSecretScanningAlert>> =
      MediaTypeCodecRegistry.of(secretScanningListAlertsForOrgResponseCodec)

  public const val SECRETSCANNINGLISTALERTSFORREPO_RESPONSE_CODEC_ID: String =
      "secret-scanning/list-alerts-for-repo.response"

  private val secretScanningListAlertsForRepoResponseCodec:
      MediaTypeCodec<List<SecretScanningAlert>> =
      KotlinxSerializationCodec(SECRETSCANNINGLISTALERTSFORREPO_RESPONSE_CODEC_ID, ListSerializer(SecretScanningAlert.Serializer), SdkJson)

  private val secretScanningListAlertsForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SecretScanningAlert>> =
      KotlinxSerializationCodec("secret-scanning/list-alerts-for-repo.response.alternative0", ListSerializer(SecretScanningAlert.Serializer), SdkJson)

  public val secretScanningListAlertsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SecretScanningAlert>> =
      MediaTypeCodecRegistry.of(secretScanningListAlertsForRepoResponseCodecAlternative0Codec)

  private val secretScanningListAlertsForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("secret-scanning/list-alerts-for-repo.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val secretScanningListAlertsForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(secretScanningListAlertsForRepoResponseCodecAlternative2Codec)

  public val secretScanningListAlertsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val secretScanningListAlertsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SecretScanningAlert>> =
      MediaTypeCodecRegistry.of(secretScanningListAlertsForRepoResponseCodec)

  public const val SECRETSCANNINGLISTLOCATIONSFORALERT_RESPONSE_CODEC_ID: String =
      "secret-scanning/list-locations-for-alert.response"

  private val secretScanningListLocationsForAlertResponseCodec:
      MediaTypeCodec<List<SecretScanningLocation>> =
      KotlinxSerializationCodec(SECRETSCANNINGLISTLOCATIONSFORALERT_RESPONSE_CODEC_ID, ListSerializer(SecretScanningLocation.Serializer), SdkJson)

  private val secretScanningListLocationsForAlertResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SecretScanningLocation>> =
      KotlinxSerializationCodec("secret-scanning/list-locations-for-alert.response.alternative0", ListSerializer(SecretScanningLocation.Serializer), SdkJson)

  public val secretScanningListLocationsForAlertResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SecretScanningLocation>> =
      MediaTypeCodecRegistry.of(secretScanningListLocationsForAlertResponseCodecAlternative0Codec)

  private val secretScanningListLocationsForAlertResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("secret-scanning/list-locations-for-alert.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val secretScanningListLocationsForAlertResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(secretScanningListLocationsForAlertResponseCodecAlternative2Codec)

  public val secretScanningListLocationsForAlertRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val secretScanningListLocationsForAlertResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SecretScanningLocation>> =
      MediaTypeCodecRegistry.of(secretScanningListLocationsForAlertResponseCodec)

  public const val SECRETSCANNINGLISTORGCUSTOMPATTERNS_RESPONSE_CODEC_ID: String =
      "secret-scanning/list-org-custom-patterns.response"

  private val secretScanningListOrgCustomPatternsResponseCodec:
      MediaTypeCodec<List<SecretScanningCustomPattern>> =
      KotlinxSerializationCodec(SECRETSCANNINGLISTORGCUSTOMPATTERNS_RESPONSE_CODEC_ID, ListSerializer(SecretScanningCustomPattern.Serializer), SdkJson)

  private val secretScanningListOrgCustomPatternsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SecretScanningCustomPattern>> =
      KotlinxSerializationCodec("secret-scanning/list-org-custom-patterns.response.alternative0", ListSerializer(SecretScanningCustomPattern.Serializer), SdkJson)

  public val secretScanningListOrgCustomPatternsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SecretScanningCustomPattern>> =
      MediaTypeCodecRegistry.of(secretScanningListOrgCustomPatternsResponseCodecAlternative0Codec)

  private val secretScanningListOrgCustomPatternsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/list-org-custom-patterns.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningListOrgCustomPatternsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningListOrgCustomPatternsResponseCodecAlternative1Codec)

  private val secretScanningListOrgCustomPatternsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/list-org-custom-patterns.response.alternative2", BasicError.Serializer, SdkJson)

  public val secretScanningListOrgCustomPatternsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningListOrgCustomPatternsResponseCodecAlternative2Codec)

  public val secretScanningListOrgCustomPatternsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val secretScanningListOrgCustomPatternsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SecretScanningCustomPattern>> =
      MediaTypeCodecRegistry.of(secretScanningListOrgCustomPatternsResponseCodec)

  public const val SECRETSCANNINGLISTORGPATTERNCONFIGS_RESPONSE_CODEC_ID: String =
      "secret-scanning/list-org-pattern-configs.response"

  private val secretScanningListOrgPatternConfigsResponseCodec:
      MediaTypeCodec<SecretScanningPatternConfiguration> =
      KotlinxSerializationCodec(SECRETSCANNINGLISTORGPATTERNCONFIGS_RESPONSE_CODEC_ID, SecretScanningPatternConfiguration.Serializer, SdkJson)

  private val secretScanningListOrgPatternConfigsResponseCodecAlternative0Codec:
      MediaTypeCodec<SecretScanningPatternConfiguration> =
      KotlinxSerializationCodec("secret-scanning/list-org-pattern-configs.response.alternative0", SecretScanningPatternConfiguration.Serializer, SdkJson)

  public val secretScanningListOrgPatternConfigsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SecretScanningPatternConfiguration> =
      MediaTypeCodecRegistry.of(secretScanningListOrgPatternConfigsResponseCodecAlternative0Codec)

  private val secretScanningListOrgPatternConfigsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/list-org-pattern-configs.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningListOrgPatternConfigsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningListOrgPatternConfigsResponseCodecAlternative1Codec)

  private val secretScanningListOrgPatternConfigsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/list-org-pattern-configs.response.alternative2", BasicError.Serializer, SdkJson)

  public val secretScanningListOrgPatternConfigsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningListOrgPatternConfigsResponseCodecAlternative2Codec)

  public val secretScanningListOrgPatternConfigsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val secretScanningListOrgPatternConfigsResponseCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningPatternConfiguration> =
      MediaTypeCodecRegistry.of(secretScanningListOrgPatternConfigsResponseCodec)

  public const val SECRETSCANNINGLISTREPOCUSTOMPATTERNS_RESPONSE_CODEC_ID: String =
      "secret-scanning/list-repo-custom-patterns.response"

  private val secretScanningListRepoCustomPatternsResponseCodec:
      MediaTypeCodec<List<SecretScanningCustomPattern>> =
      KotlinxSerializationCodec(SECRETSCANNINGLISTREPOCUSTOMPATTERNS_RESPONSE_CODEC_ID, ListSerializer(SecretScanningCustomPattern.Serializer), SdkJson)

  private val secretScanningListRepoCustomPatternsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SecretScanningCustomPattern>> =
      KotlinxSerializationCodec("secret-scanning/list-repo-custom-patterns.response.alternative0", ListSerializer(SecretScanningCustomPattern.Serializer), SdkJson)

  public val secretScanningListRepoCustomPatternsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SecretScanningCustomPattern>> =
      MediaTypeCodecRegistry.of(secretScanningListRepoCustomPatternsResponseCodecAlternative0Codec)

  private val secretScanningListRepoCustomPatternsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/list-repo-custom-patterns.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningListRepoCustomPatternsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningListRepoCustomPatternsResponseCodecAlternative1Codec)

  private val secretScanningListRepoCustomPatternsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/list-repo-custom-patterns.response.alternative2", BasicError.Serializer, SdkJson)

  public val secretScanningListRepoCustomPatternsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningListRepoCustomPatternsResponseCodecAlternative2Codec)

  public val secretScanningListRepoCustomPatternsRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val secretScanningListRepoCustomPatternsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SecretScanningCustomPattern>> =
      MediaTypeCodecRegistry.of(secretScanningListRepoCustomPatternsResponseCodec)

  public const val SECRETSCANNINGUPDATEALERT_REQUEST_CODEC_ID: String =
      "secret-scanning/update-alert.request"

  private val secretScanningUpdateAlertRequestCodec:
      MediaTypeCodec<InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f> =
      KotlinxSerializationCodec(SECRETSCANNINGUPDATEALERT_REQUEST_CODEC_ID, InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f.Serializer, SdkJson)

  public const val SECRETSCANNINGUPDATEALERT_RESPONSE_CODEC_ID: String =
      "secret-scanning/update-alert.response"

  private val secretScanningUpdateAlertResponseCodec:
      MediaTypeCodec<SecretScanningAlertWithMetadata> =
      KotlinxSerializationCodec(SECRETSCANNINGUPDATEALERT_RESPONSE_CODEC_ID, SecretScanningAlertWithMetadata.Serializer, SdkJson)

  private val secretScanningUpdateAlertResponseCodecAlternative0Codec:
      MediaTypeCodec<SecretScanningAlertWithMetadata> =
      KotlinxSerializationCodec("secret-scanning/update-alert.response.alternative0", SecretScanningAlertWithMetadata.Serializer, SdkJson)

  public val secretScanningUpdateAlertResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SecretScanningAlertWithMetadata> =
      MediaTypeCodecRegistry.of(secretScanningUpdateAlertResponseCodecAlternative0Codec)

  private val secretScanningUpdateAlertResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("secret-scanning/update-alert.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val secretScanningUpdateAlertResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(secretScanningUpdateAlertResponseCodecAlternative5Codec)

  public val secretScanningUpdateAlertRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f> =
      MediaTypeCodecRegistry.of(secretScanningUpdateAlertRequestCodec)

  public val secretScanningUpdateAlertResponseCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningAlertWithMetadata> =
      MediaTypeCodecRegistry.of(secretScanningUpdateAlertResponseCodec)

  public const val SECRETSCANNINGUPDATEORGCUSTOMPATTERN_REQUEST_CODEC_ID: String =
      "secret-scanning/update-org-custom-pattern.request"

  private val secretScanningUpdateOrgCustomPatternRequestCodec:
      MediaTypeCodec<SecretScanningCustomPatternToUpdate> =
      KotlinxSerializationCodec(SECRETSCANNINGUPDATEORGCUSTOMPATTERN_REQUEST_CODEC_ID, SecretScanningCustomPatternToUpdate.Serializer, SdkJson)

  public const val SECRETSCANNINGUPDATEORGCUSTOMPATTERN_RESPONSE_CODEC_ID: String =
      "secret-scanning/update-org-custom-pattern.response"

  private val secretScanningUpdateOrgCustomPatternResponseCodec:
      MediaTypeCodec<SecretScanningCustomPattern> =
      KotlinxSerializationCodec(SECRETSCANNINGUPDATEORGCUSTOMPATTERN_RESPONSE_CODEC_ID, SecretScanningCustomPattern.Serializer, SdkJson)

  private val secretScanningUpdateOrgCustomPatternResponseCodecAlternative0Codec:
      MediaTypeCodec<SecretScanningCustomPattern> =
      KotlinxSerializationCodec("secret-scanning/update-org-custom-pattern.response.alternative0", SecretScanningCustomPattern.Serializer, SdkJson)

  public val secretScanningUpdateOrgCustomPatternResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SecretScanningCustomPattern> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternResponseCodecAlternative0Codec)

  private val secretScanningUpdateOrgCustomPatternResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-org-custom-pattern.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateOrgCustomPatternResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternResponseCodecAlternative1Codec)

  private val secretScanningUpdateOrgCustomPatternResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("secret-scanning/update-org-custom-pattern.response.alternative2", ScimError.Serializer, SdkJson)

  public val secretScanningUpdateOrgCustomPatternResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternResponseCodecAlternative2Codec)

  private val secretScanningUpdateOrgCustomPatternResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-org-custom-pattern.response.alternative3", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateOrgCustomPatternResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternResponseCodecAlternative3Codec)

  private val secretScanningUpdateOrgCustomPatternResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-org-custom-pattern.response.alternative4", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateOrgCustomPatternResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternResponseCodecAlternative4Codec)

  private val secretScanningUpdateOrgCustomPatternResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-org-custom-pattern.response.alternative5", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateOrgCustomPatternResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternResponseCodecAlternative5Codec)

  private val secretScanningUpdateOrgCustomPatternResponseCodecAlternative6Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("secret-scanning/update-org-custom-pattern.response.alternative6", ValidationError.Serializer, SdkJson)

  public val secretScanningUpdateOrgCustomPatternResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternResponseCodecAlternative6Codec)

  public val secretScanningUpdateOrgCustomPatternRequestCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningCustomPatternToUpdate> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternRequestCodec)

  public val secretScanningUpdateOrgCustomPatternResponseCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningCustomPattern> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgCustomPatternResponseCodec)

  public const val SECRETSCANNINGUPDATEORGPATTERNCONFIGS_REQUEST_CODEC_ID: String =
      "secret-scanning/update-org-pattern-configs.request"

  private val secretScanningUpdateOrgPatternConfigsRequestCodec:
      MediaTypeCodec<InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5> =
      KotlinxSerializationCodec(SECRETSCANNINGUPDATEORGPATTERNCONFIGS_REQUEST_CODEC_ID, InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5.Serializer, SdkJson)

  public const val SECRETSCANNINGUPDATEORGPATTERNCONFIGS_RESPONSE_CODEC_ID: String =
      "secret-scanning/update-org-pattern-configs.response"

  private val secretScanningUpdateOrgPatternConfigsResponseCodec:
      MediaTypeCodec<InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea> =
      KotlinxSerializationCodec(SECRETSCANNINGUPDATEORGPATTERNCONFIGS_RESPONSE_CODEC_ID, InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea.Serializer, SdkJson)

  private val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea> =
      KotlinxSerializationCodec("secret-scanning/update-org-pattern-configs.response.alternative0", InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea.Serializer, SdkJson)

  public val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea>
      =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsResponseCodecAlternative0Codec)

  private val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-org-pattern-configs.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsResponseCodecAlternative1Codec)

  private val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("secret-scanning/update-org-pattern-configs.response.alternative2", ScimError.Serializer, SdkJson)

  public val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsResponseCodecAlternative2Codec)

  private val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-org-pattern-configs.response.alternative3", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsResponseCodecAlternative3Codec)

  private val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-org-pattern-configs.response.alternative4", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsResponseCodecAlternative4Codec)

  private val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-org-pattern-configs.response.alternative5", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsResponseCodecAlternative5Codec)

  private val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative6Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("secret-scanning/update-org-pattern-configs.response.alternative6", ValidationError.Serializer, SdkJson)

  public val secretScanningUpdateOrgPatternConfigsResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsResponseCodecAlternative6Codec)

  public val secretScanningUpdateOrgPatternConfigsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5>
      = MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsRequestCodec)

  public val secretScanningUpdateOrgPatternConfigsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea>
      = MediaTypeCodecRegistry.of(secretScanningUpdateOrgPatternConfigsResponseCodec)

  public const val SECRETSCANNINGUPDATEREPOCUSTOMPATTERN_REQUEST_CODEC_ID: String =
      "secret-scanning/update-repo-custom-pattern.request"

  private val secretScanningUpdateRepoCustomPatternRequestCodec:
      MediaTypeCodec<SecretScanningCustomPatternToUpdate> =
      KotlinxSerializationCodec(SECRETSCANNINGUPDATEREPOCUSTOMPATTERN_REQUEST_CODEC_ID, SecretScanningCustomPatternToUpdate.Serializer, SdkJson)

  public const val SECRETSCANNINGUPDATEREPOCUSTOMPATTERN_RESPONSE_CODEC_ID: String =
      "secret-scanning/update-repo-custom-pattern.response"

  private val secretScanningUpdateRepoCustomPatternResponseCodec:
      MediaTypeCodec<SecretScanningCustomPattern> =
      KotlinxSerializationCodec(SECRETSCANNINGUPDATEREPOCUSTOMPATTERN_RESPONSE_CODEC_ID, SecretScanningCustomPattern.Serializer, SdkJson)

  private val secretScanningUpdateRepoCustomPatternResponseCodecAlternative0Codec:
      MediaTypeCodec<SecretScanningCustomPattern> =
      KotlinxSerializationCodec("secret-scanning/update-repo-custom-pattern.response.alternative0", SecretScanningCustomPattern.Serializer, SdkJson)

  public val secretScanningUpdateRepoCustomPatternResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SecretScanningCustomPattern> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternResponseCodecAlternative0Codec)

  private val secretScanningUpdateRepoCustomPatternResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-repo-custom-pattern.response.alternative1", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateRepoCustomPatternResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternResponseCodecAlternative1Codec)

  private val secretScanningUpdateRepoCustomPatternResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("secret-scanning/update-repo-custom-pattern.response.alternative2", ScimError.Serializer, SdkJson)

  public val secretScanningUpdateRepoCustomPatternResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternResponseCodecAlternative2Codec)

  private val secretScanningUpdateRepoCustomPatternResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-repo-custom-pattern.response.alternative3", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateRepoCustomPatternResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternResponseCodecAlternative3Codec)

  private val secretScanningUpdateRepoCustomPatternResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-repo-custom-pattern.response.alternative4", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateRepoCustomPatternResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternResponseCodecAlternative4Codec)

  private val secretScanningUpdateRepoCustomPatternResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("secret-scanning/update-repo-custom-pattern.response.alternative5", BasicError.Serializer, SdkJson)

  public val secretScanningUpdateRepoCustomPatternResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternResponseCodecAlternative5Codec)

  private val secretScanningUpdateRepoCustomPatternResponseCodecAlternative6Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("secret-scanning/update-repo-custom-pattern.response.alternative6", ValidationError.Serializer, SdkJson)

  public val secretScanningUpdateRepoCustomPatternResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternResponseCodecAlternative6Codec)

  public val secretScanningUpdateRepoCustomPatternRequestCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningCustomPatternToUpdate> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternRequestCodec)

  public val secretScanningUpdateRepoCustomPatternResponseCodecRegistry:
      MediaTypeCodecRegistry<SecretScanningCustomPattern> =
      MediaTypeCodecRegistry.of(secretScanningUpdateRepoCustomPatternResponseCodec)
}

/**
 * Client for the 'secret-scanning' group of GitHub v3 REST API.
 */
public class SecretScanningClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@SecretScanningClient.authentication)

  /**
   * Bulk creates secret scanning custom patterns for an organization.
   *
   * Personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningBulkCreateOrgCustomPatternsApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecretScanningBulkCreateOrgCustomPatternsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningBulkCreateOrgCustomPatterns(
    request: InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516,
    org: String,
    options: CallOptions = CallOptions(),
  ): InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f = executor.executeWithTypedErrors<InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516, SecretScanningBulkCreateOrgCustomPatternsResponse, InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f>(
    request = SdkExecutionRequest(secretScanningBulkCreateOrgCustomPatternsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGBULKCREATEORGCUSTOMPATTERNS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningBulkCreateOrgCustomPatternsRequestCodecRegistry,
    responseDecoder = SecretScanningBulkCreateOrgCustomPatternsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningBulkCreateOrgCustomPatternsResponse.SuccessJson -> response.json
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningBulkCreateOrgCustomPatternsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http400Json -> SecretScanningBulkCreateOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http400ScimJson -> SecretScanningBulkCreateOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http403Json -> SecretScanningBulkCreateOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http404Json -> SecretScanningBulkCreateOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Http422Json -> SecretScanningBulkCreateOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateOrgCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Bulk creates secret scanning custom patterns for an organization.
   *
   * Personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun secretScanningBulkCreateOrgCustomPatternsWithResponse(
    request: InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningBulkCreateOrgCustomPatternsResponse> = executor.executeWithResponse<InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516, SecretScanningBulkCreateOrgCustomPatternsResponse>(SdkExecutionRequest(secretScanningBulkCreateOrgCustomPatternsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGBULKCREATEORGCUSTOMPATTERNS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), SecretScanningCodecs.secretScanningBulkCreateOrgCustomPatternsRequestCodecRegistry, SecretScanningBulkCreateOrgCustomPatternsResponseDecoder, options)

  /**
   * Bulk creates secret scanning custom patterns for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningBulkCreateRepoCustomPatternsApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecretScanningBulkCreateRepoCustomPatternsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningBulkCreateRepoCustomPatterns(
    request: InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53 = executor.executeWithTypedErrors<InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14, SecretScanningBulkCreateRepoCustomPatternsResponse, InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53>(
    request = SdkExecutionRequest(secretScanningBulkCreateRepoCustomPatternsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGBULKCREATEREPOCUSTOMPATTERNS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningBulkCreateRepoCustomPatternsRequestCodecRegistry,
    responseDecoder = SecretScanningBulkCreateRepoCustomPatternsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningBulkCreateRepoCustomPatternsResponse.SuccessJson -> response.json
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningBulkCreateRepoCustomPatternsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http400Json -> SecretScanningBulkCreateRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http400ScimJson -> SecretScanningBulkCreateRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http403Json -> SecretScanningBulkCreateRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http404Json -> SecretScanningBulkCreateRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Http422Json -> SecretScanningBulkCreateRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkCreateRepoCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Bulk creates secret scanning custom patterns for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun secretScanningBulkCreateRepoCustomPatternsWithResponse(
    request: InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningBulkCreateRepoCustomPatternsResponse> = executor.executeWithResponse<InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14, SecretScanningBulkCreateRepoCustomPatternsResponse>(SdkExecutionRequest(secretScanningBulkCreateRepoCustomPatternsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGBULKCREATEREPOCUSTOMPATTERNS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecretScanningCodecs.secretScanningBulkCreateRepoCustomPatternsRequestCodecRegistry, SecretScanningBulkCreateRepoCustomPatternsResponseDecoder, options)

  /**
   * Bulk deletes secret scanning custom patterns for an organization.
   *
   * Personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SecretScanningBulkDeleteOrgCustomPatternsApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecretScanningBulkDeleteOrgCustomPatternsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningBulkDeleteOrgCustomPatterns(
    request: InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad, SecretScanningBulkDeleteOrgCustomPatternsResponse, Unit>(
    request = SdkExecutionRequest(secretScanningBulkDeleteOrgCustomPatternsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGBULKDELETEORGCUSTOMPATTERNS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningBulkDeleteOrgCustomPatternsRequestCodecRegistry,
    responseDecoder = SecretScanningBulkDeleteOrgCustomPatternsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.SuccessNoContent -> response.unit
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http412Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http400Json -> SecretScanningBulkDeleteOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http400ScimJson -> SecretScanningBulkDeleteOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http403Json -> SecretScanningBulkDeleteOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http404Json -> SecretScanningBulkDeleteOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Http412Json -> SecretScanningBulkDeleteOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteOrgCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Bulk deletes secret scanning custom patterns for an organization.
   *
   * Personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun secretScanningBulkDeleteOrgCustomPatternsWithResponse(
    request: InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningBulkDeleteOrgCustomPatternsResponse> = executor.executeWithResponse<InlineOrgsSecretScanningCustomPatternsDeleteRequestJsonX05fd64ad, SecretScanningBulkDeleteOrgCustomPatternsResponse>(SdkExecutionRequest(secretScanningBulkDeleteOrgCustomPatternsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGBULKDELETEORGCUSTOMPATTERNS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), SecretScanningCodecs.secretScanningBulkDeleteOrgCustomPatternsRequestCodecRegistry, SecretScanningBulkDeleteOrgCustomPatternsResponseDecoder, options)

  /**
   * Bulk deletes secret scanning custom patterns for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SecretScanningBulkDeleteRepoCustomPatternsApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecretScanningBulkDeleteRepoCustomPatternsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningBulkDeleteRepoCustomPatterns(
    request: InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692, SecretScanningBulkDeleteRepoCustomPatternsResponse, Unit>(
    request = SdkExecutionRequest(secretScanningBulkDeleteRepoCustomPatternsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGBULKDELETEREPOCUSTOMPATTERNS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningBulkDeleteRepoCustomPatternsRequestCodecRegistry,
    responseDecoder = SecretScanningBulkDeleteRepoCustomPatternsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.SuccessNoContent -> response.unit
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http412Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http400Json -> SecretScanningBulkDeleteRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http400ScimJson -> SecretScanningBulkDeleteRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http403Json -> SecretScanningBulkDeleteRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http404Json -> SecretScanningBulkDeleteRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Http412Json -> SecretScanningBulkDeleteRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningBulkDeleteRepoCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Bulk deletes secret scanning custom patterns for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun secretScanningBulkDeleteRepoCustomPatternsWithResponse(
    request: InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningBulkDeleteRepoCustomPatternsResponse> = executor.executeWithResponse<InlineReposSecretScanningCustomPatternsDeleteRequestJsonX47902692, SecretScanningBulkDeleteRepoCustomPatternsResponse>(SdkExecutionRequest(secretScanningBulkDeleteRepoCustomPatternsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGBULKDELETEREPOCUSTOMPATTERNS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecretScanningCodecs.secretScanningBulkDeleteRepoCustomPatternsRequestCodecRegistry, SecretScanningBulkDeleteRepoCustomPatternsResponseDecoder, options)

  /**
   * Creates a bypass for a previously push protected secret.
   *
   * The authenticated user must be the original author of the committed secret.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningCreatePushProtectionBypassApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecretScanningCreatePushProtectionBypassError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningCreatePushProtectionBypass(
    request: InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SecretScanningPushProtectionBypass = executor.executeWithTypedErrors<InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52, SecretScanningCreatePushProtectionBypassResponse, SecretScanningPushProtectionBypass>(
    request = SdkExecutionRequest(secretScanningCreatePushProtectionBypassMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGCREATEPUSHPROTECTIONBYPASS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningCreatePushProtectionBypassRequestCodecRegistry,
    responseDecoder = SecretScanningCreatePushProtectionBypassResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningCreatePushProtectionBypassResponse.SuccessJson -> response.json
        is SecretScanningCreatePushProtectionBypassResponse.Http403NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningCreatePushProtectionBypassResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningCreatePushProtectionBypassResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningCreatePushProtectionBypassResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningCreatePushProtectionBypassResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningCreatePushProtectionBypassResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningCreatePushProtectionBypassResponse.Http403NoContent -> SecretScanningCreatePushProtectionBypassApiException(response, statusCode, headers)
        is SecretScanningCreatePushProtectionBypassResponse.Http404NoContent -> SecretScanningCreatePushProtectionBypassApiException(response, statusCode, headers)
        is SecretScanningCreatePushProtectionBypassResponse.Http422NoContent -> SecretScanningCreatePushProtectionBypassApiException(response, statusCode, headers)
        is SecretScanningCreatePushProtectionBypassResponse.Http503Json -> SecretScanningCreatePushProtectionBypassApiException(response, statusCode, headers)
        is SecretScanningCreatePushProtectionBypassResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a bypass for a previously push protected secret.
   *
   * The authenticated user must be the original author of the committed secret.
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
  public suspend fun secretScanningCreatePushProtectionBypassWithResponse(
    request: InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningCreatePushProtectionBypassResponse> = executor.executeWithResponse<InlineReposSecretScanningPushProtectionBypassesPostRequestJsonXd992bf52, SecretScanningCreatePushProtectionBypassResponse>(SdkExecutionRequest(secretScanningCreatePushProtectionBypassMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGCREATEPUSHPROTECTIONBYPASS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecretScanningCodecs.secretScanningCreatePushProtectionBypassRequestCodecRegistry, SecretScanningCreatePushProtectionBypassResponseDecoder, options)

  /**
   * Gets a single secret scanning alert detected in an eligible repository.
   *
   * The authenticated user must be an administrator for the repository or for the organization that owns the repository
   * to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param hideSecret A boolean value representing whether or not to hide literal secrets in the results.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningGetAlertApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded SecretScanningGetAlertError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningGetAlert(
    alertNumber: Int,
    owner: String,
    repo: String,
    hideSecret: Boolean? = null,
    options: CallOptions = CallOptions(),
  ): SecretScanningAlertWithMetadata = executor.executeWithTypedErrors<Unit, SecretScanningGetAlertResponse, SecretScanningAlertWithMetadata>(
    request = SdkExecutionRequest(secretScanningGetAlertMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "hide_secret", values = hideSecret?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningGetAlertRequestCodecRegistry,
    responseDecoder = SecretScanningGetAlertResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningGetAlertResponse.SuccessJson -> response.json
        is SecretScanningGetAlertResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningGetAlertResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningGetAlertResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningGetAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningGetAlertResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningGetAlertResponse.Http304NoContent -> SecretScanningGetAlertApiException(response, statusCode, headers)
        is SecretScanningGetAlertResponse.Http404NoContent -> SecretScanningGetAlertApiException(response, statusCode, headers)
        is SecretScanningGetAlertResponse.Http503Json -> SecretScanningGetAlertApiException(response, statusCode, headers)
        is SecretScanningGetAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a single secret scanning alert detected in an eligible repository.
   *
   * The authenticated user must be an administrator for the repository or for the organization that owns the repository
   * to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param hideSecret A boolean value representing whether or not to hide literal secrets in the results.
   * @param options Execution options.
   */
  public suspend fun secretScanningGetAlertWithResponse(
    alertNumber: Int,
    owner: String,
    repo: String,
    hideSecret: Boolean? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningGetAlertResponse> = executor.executeWithResponse<Unit, SecretScanningGetAlertResponse>(SdkExecutionRequest(secretScanningGetAlertMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "hide_secret", values = hideSecret?.let { listOf(it.toString()) }.orEmpty()))
  }), SecretScanningCodecs.secretScanningGetAlertRequestCodecRegistry, SecretScanningGetAlertResponseDecoder, options)

  /**
   * Lists the latest default incremental and backfill scans by type for a repository.
   *
   * > [!NOTE]
   * > This endpoint requires [GitHub Advanced
   * Security](https://docs.github.com/get-started/learning-about-github/about-github-advanced-security).
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningGetScanHistoryApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded SecretScanningGetScanHistoryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningGetScanHistory(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SecretScanningScanHistory = executor.executeWithTypedErrors<Unit, SecretScanningGetScanHistoryResponse, SecretScanningScanHistory>(
    request = SdkExecutionRequest(secretScanningGetScanHistoryMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningGetScanHistoryRequestCodecRegistry,
    responseDecoder = SecretScanningGetScanHistoryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningGetScanHistoryResponse.SuccessJson -> response.json
        is SecretScanningGetScanHistoryResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningGetScanHistoryResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningGetScanHistoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningGetScanHistoryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningGetScanHistoryResponse.Http404NoContent -> SecretScanningGetScanHistoryApiException(response, statusCode, headers)
        is SecretScanningGetScanHistoryResponse.Http503Json -> SecretScanningGetScanHistoryApiException(response, statusCode, headers)
        is SecretScanningGetScanHistoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the latest default incremental and backfill scans by type for a repository.
   *
   * > [!NOTE]
   * > This endpoint requires [GitHub Advanced
   * Security](https://docs.github.com/get-started/learning-about-github/about-github-advanced-security).
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun secretScanningGetScanHistoryWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningGetScanHistoryResponse> = executor.executeWithResponse<Unit, SecretScanningGetScanHistoryResponse>(SdkExecutionRequest(secretScanningGetScanHistoryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecretScanningCodecs.secretScanningGetScanHistoryRequestCodecRegistry, SecretScanningGetScanHistoryResponseDecoder, options)

  /**
   * Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for events after this cursor.  To receive an initial cursor on your first request, include an
   * empty "after" query string.
   * @param assignee Filters alerts by assignee. Use `*` to get all assigned alerts, `none` to get all unassigned
   * alerts, or a GitHub username to get alerts assigned to a specific user.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for events before this cursor. To receive an initial cursor on your first request, include an
   * empty "before" query string.
   * @param direction The direction to sort the results by.
   * @param excludeProviders A comma-separated list of provider slugs to exclude from the results.
   * Provider slugs use lowercase with underscores (e.g., `github_secret_scanning`, `clojars`).
   * You can find the provider slug in the `provider_slug` field of each alert.
   * Cannot be combined with the `providers` parameter.
   * @param excludeSecretTypes A comma-separated list of secret types to exclude from the results. All default secret
   * patterns are returned except those matching the specified types. Cannot be combined with the `secret_type`
   * parameter. See "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)" for a complete list of secret types.
   * @param hideSecret A boolean value representing whether or not to hide literal secrets in the results.
   * @param includedMetadata A comma-separated list of metadata fields to filter alerts by. Only alerts that have all of
   * the
   * specified metadata fields attached will be returned. Possible values are: `owner-email`, `owner-id`,
   * `owner-name`, `secret-id`, `secret-name`, `secret-issued-date`, `secret-expiration-date`, `organization-name`,
   * `organization-id`, `last-used-date`, and `has-organization-access`.
   * @param isBypassed A boolean value (`true` or `false`) indicating whether to filter alerts by their push protection
   * bypass status. When set to `true`, only alerts that were created because a push protection rule was bypassed will
   * be returned. When set to `false`, only alerts that were not caused by a push protection bypass will be returned.
   * @param isMultiRepo A boolean value representing whether or not to filter alerts by the multi-repo tag being
   * present.
   * @param isPubliclyLeaked A boolean value representing whether or not to filter alerts by the publicly-leaked tag
   * being present.
   * @param ownerEmailHash Filters alerts to only those whose attached `owner_email` metadata field matches the
   * provided value. The value must be the lowercase hex-encoded SHA-256 hash of the email
   * address to match (for example, the SHA-256 of `user@example.com`). Only alerts that
   * have an `owner_email` metadata value whose SHA-256 hash equals this parameter are
   * returned.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param providers A comma-separated list of provider slugs to filter by.
   * Provider slugs use lowercase with underscores (e.g., `github_secret_scanning`, `clojars`).
   * You can find the provider slug in the `provider_slug` field of each alert.
   * Cannot be combined with the `exclude_providers` parameter.
   * @param resolution A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions
   * are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or
   * `used_in_tests`.
   * @param secretType A comma-separated list of secret types to return. All default secret patterns are returned. To
   * return generic patterns, pass the token name(s) in the parameter. See "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)" for a complete list of secret types.
   * @param sort The property to sort the results by. `created` means when the alert was created. `updated` means when
   * the alert was updated or resolved.
   * @param state Set to `open` or `resolved` to only list secret scanning alerts in a specific state.
   * @param validity A comma-separated list of validities that, when present, will return alerts that match the
   * validities in this list. Valid options are `active`, `inactive`, and `unknown`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningListAlertsForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded SecretScanningListAlertsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningListAlertsForOrg(
    org: String,
    after: String? = null,
    assignee: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    excludeProviders: String? = null,
    excludeSecretTypes: String? = null,
    hideSecret: Boolean? = null,
    includedMetadata: String? = null,
    isBypassed: Boolean? = null,
    isMultiRepo: Boolean? = null,
    isPubliclyLeaked: Boolean? = null,
    ownerEmailHash: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    providers: String? = null,
    resolution: String? = null,
    secretType: String? = null,
    sort: InlineSecretScanningAlertSortParameterXabb1dc87? = null,
    state: InlineSecretScanningAlertStateParameterX609aff21? = null,
    validity: String? = null,
    options: CallOptions = CallOptions(),
  ): List<OrganizationSecretScanningAlert> = executor.executeWithTypedErrors<Unit, SecretScanningListAlertsForOrgResponse, List<OrganizationSecretScanningAlert>>(
    request = SdkExecutionRequest(secretScanningListAlertsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude_providers", values = excludeProviders?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude_secret_types", values = excludeSecretTypes?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "hide_secret", values = hideSecret?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "included_metadata", values = includedMetadata?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_bypassed", values = isBypassed?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_multi_repo", values = isMultiRepo?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_publicly_leaked", values = isPubliclyLeaked?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "owner_email_hash", values = ownerEmailHash?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "providers", values = providers?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "resolution", values = resolution?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "secret_type", values = secretType?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "validity", values = validity?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningListAlertsForOrgRequestCodecRegistry,
    responseDecoder = SecretScanningListAlertsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningListAlertsForOrgResponse.SuccessJson -> response.json
        is SecretScanningListAlertsForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListAlertsForOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListAlertsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningListAlertsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningListAlertsForOrgResponse.Http404Json -> SecretScanningListAlertsForOrgApiException(response, statusCode, headers)
        is SecretScanningListAlertsForOrgResponse.Http503Json -> SecretScanningListAlertsForOrgApiException(response, statusCode, headers)
        is SecretScanningListAlertsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for events after this cursor.  To receive an initial cursor on your first request, include an
   * empty "after" query string.
   * @param assignee Filters alerts by assignee. Use `*` to get all assigned alerts, `none` to get all unassigned
   * alerts, or a GitHub username to get alerts assigned to a specific user.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for events before this cursor. To receive an initial cursor on your first request, include an
   * empty "before" query string.
   * @param direction The direction to sort the results by.
   * @param excludeProviders A comma-separated list of provider slugs to exclude from the results.
   * Provider slugs use lowercase with underscores (e.g., `github_secret_scanning`, `clojars`).
   * You can find the provider slug in the `provider_slug` field of each alert.
   * Cannot be combined with the `providers` parameter.
   * @param excludeSecretTypes A comma-separated list of secret types to exclude from the results. All default secret
   * patterns are returned except those matching the specified types. Cannot be combined with the `secret_type`
   * parameter. See "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)" for a complete list of secret types.
   * @param hideSecret A boolean value representing whether or not to hide literal secrets in the results.
   * @param includedMetadata A comma-separated list of metadata fields to filter alerts by. Only alerts that have all of
   * the
   * specified metadata fields attached will be returned. Possible values are: `owner-email`, `owner-id`,
   * `owner-name`, `secret-id`, `secret-name`, `secret-issued-date`, `secret-expiration-date`, `organization-name`,
   * `organization-id`, `last-used-date`, and `has-organization-access`.
   * @param isBypassed A boolean value (`true` or `false`) indicating whether to filter alerts by their push protection
   * bypass status. When set to `true`, only alerts that were created because a push protection rule was bypassed will
   * be returned. When set to `false`, only alerts that were not caused by a push protection bypass will be returned.
   * @param isMultiRepo A boolean value representing whether or not to filter alerts by the multi-repo tag being
   * present.
   * @param isPubliclyLeaked A boolean value representing whether or not to filter alerts by the publicly-leaked tag
   * being present.
   * @param ownerEmailHash Filters alerts to only those whose attached `owner_email` metadata field matches the
   * provided value. The value must be the lowercase hex-encoded SHA-256 hash of the email
   * address to match (for example, the SHA-256 of `user@example.com`). Only alerts that
   * have an `owner_email` metadata value whose SHA-256 hash equals this parameter are
   * returned.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param providers A comma-separated list of provider slugs to filter by.
   * Provider slugs use lowercase with underscores (e.g., `github_secret_scanning`, `clojars`).
   * You can find the provider slug in the `provider_slug` field of each alert.
   * Cannot be combined with the `exclude_providers` parameter.
   * @param resolution A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions
   * are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or
   * `used_in_tests`.
   * @param secretType A comma-separated list of secret types to return. All default secret patterns are returned. To
   * return generic patterns, pass the token name(s) in the parameter. See "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)" for a complete list of secret types.
   * @param sort The property to sort the results by. `created` means when the alert was created. `updated` means when
   * the alert was updated or resolved.
   * @param state Set to `open` or `resolved` to only list secret scanning alerts in a specific state.
   * @param validity A comma-separated list of validities that, when present, will return alerts that match the
   * validities in this list. Valid options are `active`, `inactive`, and `unknown`.
   * @param options Execution options.
   */
  public suspend fun secretScanningListAlertsForOrgWithResponse(
    org: String,
    after: String? = null,
    assignee: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    excludeProviders: String? = null,
    excludeSecretTypes: String? = null,
    hideSecret: Boolean? = null,
    includedMetadata: String? = null,
    isBypassed: Boolean? = null,
    isMultiRepo: Boolean? = null,
    isPubliclyLeaked: Boolean? = null,
    ownerEmailHash: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    providers: String? = null,
    resolution: String? = null,
    secretType: String? = null,
    sort: InlineSecretScanningAlertSortParameterXabb1dc87? = null,
    state: InlineSecretScanningAlertStateParameterX609aff21? = null,
    validity: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningListAlertsForOrgResponse> = executor.executeWithResponse<Unit, SecretScanningListAlertsForOrgResponse>(SdkExecutionRequest(secretScanningListAlertsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude_providers", values = excludeProviders?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude_secret_types", values = excludeSecretTypes?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "hide_secret", values = hideSecret?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "included_metadata", values = includedMetadata?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_bypassed", values = isBypassed?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_multi_repo", values = isMultiRepo?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_publicly_leaked", values = isPubliclyLeaked?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "owner_email_hash", values = ownerEmailHash?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "providers", values = providers?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "resolution", values = resolution?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "secret_type", values = secretType?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "validity", values = validity?.let { listOf(it.toString()) }.orEmpty()))
  }), SecretScanningCodecs.secretScanningListAlertsForOrgRequestCodecRegistry, SecretScanningListAlertsForOrgResponseDecoder, options)

  /**
   * Lists secret scanning alerts for an eligible repository, from newest to oldest.
   *
   * The authenticated user must be an administrator for the repository or for the organization that owns the repository
   * to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for events after this cursor.  To receive an initial cursor on your first request, include an
   * empty "after" query string.
   * @param assignee Filters alerts by assignee. Use `*` to get all assigned alerts, `none` to get all unassigned
   * alerts, or a GitHub username to get alerts assigned to a specific user.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for events before this cursor. To receive an initial cursor on your first request, include an
   * empty "before" query string.
   * @param direction The direction to sort the results by.
   * @param excludeProviders A comma-separated list of provider slugs to exclude from the results.
   * Provider slugs use lowercase with underscores (e.g., `github_secret_scanning`, `clojars`).
   * You can find the provider slug in the `provider_slug` field of each alert.
   * Cannot be combined with the `providers` parameter.
   * @param excludeSecretTypes A comma-separated list of secret types to exclude from the results. All default secret
   * patterns are returned except those matching the specified types. Cannot be combined with the `secret_type`
   * parameter. See "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)" for a complete list of secret types.
   * @param hideSecret A boolean value representing whether or not to hide literal secrets in the results.
   * @param includedMetadata A comma-separated list of metadata fields to filter alerts by. Only alerts that have all of
   * the
   * specified metadata fields attached will be returned. Possible values are: `owner-email`, `owner-id`,
   * `owner-name`, `secret-id`, `secret-name`, `secret-issued-date`, `secret-expiration-date`, `organization-name`,
   * `organization-id`, `last-used-date`, and `has-organization-access`.
   * @param isBypassed A boolean value (`true` or `false`) indicating whether to filter alerts by their push protection
   * bypass status. When set to `true`, only alerts that were created because a push protection rule was bypassed will
   * be returned. When set to `false`, only alerts that were not caused by a push protection bypass will be returned.
   * @param isMultiRepo A boolean value representing whether or not to filter alerts by the multi-repo tag being
   * present.
   * @param isPubliclyLeaked A boolean value representing whether or not to filter alerts by the publicly-leaked tag
   * being present.
   * @param ownerEmailHash Filters alerts to only those whose attached `owner_email` metadata field matches the
   * provided value. The value must be the lowercase hex-encoded SHA-256 hash of the email
   * address to match (for example, the SHA-256 of `user@example.com`). Only alerts that
   * have an `owner_email` metadata value whose SHA-256 hash equals this parameter are
   * returned.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param providers A comma-separated list of provider slugs to filter by.
   * Provider slugs use lowercase with underscores (e.g., `github_secret_scanning`, `clojars`).
   * You can find the provider slug in the `provider_slug` field of each alert.
   * Cannot be combined with the `exclude_providers` parameter.
   * @param resolution A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions
   * are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or
   * `used_in_tests`.
   * @param secretType A comma-separated list of secret types to return. All default secret patterns are returned. To
   * return generic patterns, pass the token name(s) in the parameter. See "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)" for a complete list of secret types.
   * @param sort The property to sort the results by. `created` means when the alert was created. `updated` means when
   * the alert was updated or resolved.
   * @param state Set to `open` or `resolved` to only list secret scanning alerts in a specific state.
   * @param validity A comma-separated list of validities that, when present, will return alerts that match the
   * validities in this list. Valid options are `active`, `inactive`, and `unknown`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningListAlertsForRepoApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded SecretScanningListAlertsForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningListAlertsForRepo(
    owner: String,
    repo: String,
    after: String? = null,
    assignee: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    excludeProviders: String? = null,
    excludeSecretTypes: String? = null,
    hideSecret: Boolean? = null,
    includedMetadata: String? = null,
    isBypassed: Boolean? = null,
    isMultiRepo: Boolean? = null,
    isPubliclyLeaked: Boolean? = null,
    ownerEmailHash: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    providers: String? = null,
    resolution: String? = null,
    secretType: String? = null,
    sort: InlineSecretScanningAlertSortParameterXabb1dc87? = null,
    state: InlineSecretScanningAlertStateParameterX609aff21? = null,
    validity: String? = null,
    options: CallOptions = CallOptions(),
  ): List<SecretScanningAlert> = executor.executeWithTypedErrors<Unit, SecretScanningListAlertsForRepoResponse, List<SecretScanningAlert>>(
    request = SdkExecutionRequest(secretScanningListAlertsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude_providers", values = excludeProviders?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude_secret_types", values = excludeSecretTypes?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "hide_secret", values = hideSecret?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "included_metadata", values = includedMetadata?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_bypassed", values = isBypassed?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_multi_repo", values = isMultiRepo?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_publicly_leaked", values = isPubliclyLeaked?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "owner_email_hash", values = ownerEmailHash?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "providers", values = providers?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "resolution", values = resolution?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "secret_type", values = secretType?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "validity", values = validity?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningListAlertsForRepoRequestCodecRegistry,
    responseDecoder = SecretScanningListAlertsForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningListAlertsForRepoResponse.SuccessJson -> response.json
        is SecretScanningListAlertsForRepoResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListAlertsForRepoResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListAlertsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningListAlertsForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningListAlertsForRepoResponse.Http404NoContent -> SecretScanningListAlertsForRepoApiException(response, statusCode, headers)
        is SecretScanningListAlertsForRepoResponse.Http503Json -> SecretScanningListAlertsForRepoApiException(response, statusCode, headers)
        is SecretScanningListAlertsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists secret scanning alerts for an eligible repository, from newest to oldest.
   *
   * The authenticated user must be an administrator for the repository or for the organization that owns the repository
   * to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for events after this cursor.  To receive an initial cursor on your first request, include an
   * empty "after" query string.
   * @param assignee Filters alerts by assignee. Use `*` to get all assigned alerts, `none` to get all unassigned
   * alerts, or a GitHub username to get alerts assigned to a specific user.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for events before this cursor. To receive an initial cursor on your first request, include an
   * empty "before" query string.
   * @param direction The direction to sort the results by.
   * @param excludeProviders A comma-separated list of provider slugs to exclude from the results.
   * Provider slugs use lowercase with underscores (e.g., `github_secret_scanning`, `clojars`).
   * You can find the provider slug in the `provider_slug` field of each alert.
   * Cannot be combined with the `providers` parameter.
   * @param excludeSecretTypes A comma-separated list of secret types to exclude from the results. All default secret
   * patterns are returned except those matching the specified types. Cannot be combined with the `secret_type`
   * parameter. See "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)" for a complete list of secret types.
   * @param hideSecret A boolean value representing whether or not to hide literal secrets in the results.
   * @param includedMetadata A comma-separated list of metadata fields to filter alerts by. Only alerts that have all of
   * the
   * specified metadata fields attached will be returned. Possible values are: `owner-email`, `owner-id`,
   * `owner-name`, `secret-id`, `secret-name`, `secret-issued-date`, `secret-expiration-date`, `organization-name`,
   * `organization-id`, `last-used-date`, and `has-organization-access`.
   * @param isBypassed A boolean value (`true` or `false`) indicating whether to filter alerts by their push protection
   * bypass status. When set to `true`, only alerts that were created because a push protection rule was bypassed will
   * be returned. When set to `false`, only alerts that were not caused by a push protection bypass will be returned.
   * @param isMultiRepo A boolean value representing whether or not to filter alerts by the multi-repo tag being
   * present.
   * @param isPubliclyLeaked A boolean value representing whether or not to filter alerts by the publicly-leaked tag
   * being present.
   * @param ownerEmailHash Filters alerts to only those whose attached `owner_email` metadata field matches the
   * provided value. The value must be the lowercase hex-encoded SHA-256 hash of the email
   * address to match (for example, the SHA-256 of `user@example.com`). Only alerts that
   * have an `owner_email` metadata value whose SHA-256 hash equals this parameter are
   * returned.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param providers A comma-separated list of provider slugs to filter by.
   * Provider slugs use lowercase with underscores (e.g., `github_secret_scanning`, `clojars`).
   * You can find the provider slug in the `provider_slug` field of each alert.
   * Cannot be combined with the `exclude_providers` parameter.
   * @param resolution A comma-separated list of resolutions. Only secret scanning alerts with one of these resolutions
   * are listed. Valid resolutions are `false_positive`, `wont_fix`, `revoked`, `pattern_edited`, `pattern_deleted` or
   * `used_in_tests`.
   * @param secretType A comma-separated list of secret types to return. All default secret patterns are returned. To
   * return generic patterns, pass the token name(s) in the parameter. See "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)" for a complete list of secret types.
   * @param sort The property to sort the results by. `created` means when the alert was created. `updated` means when
   * the alert was updated or resolved.
   * @param state Set to `open` or `resolved` to only list secret scanning alerts in a specific state.
   * @param validity A comma-separated list of validities that, when present, will return alerts that match the
   * validities in this list. Valid options are `active`, `inactive`, and `unknown`.
   * @param options Execution options.
   */
  public suspend fun secretScanningListAlertsForRepoWithResponse(
    owner: String,
    repo: String,
    after: String? = null,
    assignee: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    excludeProviders: String? = null,
    excludeSecretTypes: String? = null,
    hideSecret: Boolean? = null,
    includedMetadata: String? = null,
    isBypassed: Boolean? = null,
    isMultiRepo: Boolean? = null,
    isPubliclyLeaked: Boolean? = null,
    ownerEmailHash: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    providers: String? = null,
    resolution: String? = null,
    secretType: String? = null,
    sort: InlineSecretScanningAlertSortParameterXabb1dc87? = null,
    state: InlineSecretScanningAlertStateParameterX609aff21? = null,
    validity: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningListAlertsForRepoResponse> = executor.executeWithResponse<Unit, SecretScanningListAlertsForRepoResponse>(SdkExecutionRequest(secretScanningListAlertsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude_providers", values = excludeProviders?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exclude_secret_types", values = excludeSecretTypes?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "hide_secret", values = hideSecret?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "included_metadata", values = includedMetadata?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_bypassed", values = isBypassed?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_multi_repo", values = isMultiRepo?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_publicly_leaked", values = isPubliclyLeaked?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "owner_email_hash", values = ownerEmailHash?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "providers", values = providers?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "resolution", values = resolution?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "secret_type", values = secretType?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "validity", values = validity?.let { listOf(it.toString()) }.orEmpty()))
  }), SecretScanningCodecs.secretScanningListAlertsForRepoRequestCodecRegistry, SecretScanningListAlertsForRepoResponseDecoder, options)

  /**
   * Lists all locations for a given secret scanning alert for an eligible repository.
   *
   * The authenticated user must be an administrator for the repository or for the organization that owns the repository
   * to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
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
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningListLocationsForAlertApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded SecretScanningListLocationsForAlertError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningListLocationsForAlert(
    alertNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SecretScanningLocation> = executor.executeWithTypedErrors<Unit, SecretScanningListLocationsForAlertResponse, List<SecretScanningLocation>>(
    request = SdkExecutionRequest(secretScanningListLocationsForAlertMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningListLocationsForAlertRequestCodecRegistry,
    responseDecoder = SecretScanningListLocationsForAlertResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningListLocationsForAlertResponse.SuccessJson -> response.json
        is SecretScanningListLocationsForAlertResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListLocationsForAlertResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListLocationsForAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningListLocationsForAlertResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningListLocationsForAlertResponse.Http404NoContent -> SecretScanningListLocationsForAlertApiException(response, statusCode, headers)
        is SecretScanningListLocationsForAlertResponse.Http503Json -> SecretScanningListLocationsForAlertApiException(response, statusCode, headers)
        is SecretScanningListLocationsForAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all locations for a given secret scanning alert for an eligible repository.
   *
   * The authenticated user must be an administrator for the repository or for the organization that owns the repository
   * to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
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
   * @param options Execution options.
   */
  public suspend fun secretScanningListLocationsForAlertWithResponse(
    alertNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningListLocationsForAlertResponse> = executor.executeWithResponse<Unit, SecretScanningListLocationsForAlertResponse>(SdkExecutionRequest(secretScanningListLocationsForAlertMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), SecretScanningCodecs.secretScanningListLocationsForAlertRequestCodecRegistry, SecretScanningListLocationsForAlertResponseDecoder, options)

  /**
   * Lists secret scanning custom patterns for an organization.
   *
   * Personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pushProtection Filter custom patterns by whether push protection is enabled. When absent, returns patterns
   * regardless of push protection status.
   * @param sort The property to sort the results by.
   * @param state Filter custom patterns by state. When absent, returns patterns in all states.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningListOrgCustomPatternsApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded SecretScanningListOrgCustomPatternsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningListOrgCustomPatterns(
    org: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    pushProtection: InlineSecretScanningCustomPatternPushProtectionParameterXf4799756? = null,
    sort: InlineSecretScanningCustomPatternSortParameterX63e666f9? = null,
    state: InlineSecretScanningCustomPatternStateParameterX0fd7eb62? = null,
    options: CallOptions = CallOptions(),
  ): List<SecretScanningCustomPattern> = executor.executeWithTypedErrors<Unit, SecretScanningListOrgCustomPatternsResponse, List<SecretScanningCustomPattern>>(
    request = SdkExecutionRequest(secretScanningListOrgCustomPatternsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "push_protection", values = pushProtection?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningListOrgCustomPatternsRequestCodecRegistry,
    responseDecoder = SecretScanningListOrgCustomPatternsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningListOrgCustomPatternsResponse.SuccessJson -> response.json
        is SecretScanningListOrgCustomPatternsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListOrgCustomPatternsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListOrgCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningListOrgCustomPatternsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningListOrgCustomPatternsResponse.Http403Json -> SecretScanningListOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningListOrgCustomPatternsResponse.Http404Json -> SecretScanningListOrgCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningListOrgCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists secret scanning custom patterns for an organization.
   *
   * Personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pushProtection Filter custom patterns by whether push protection is enabled. When absent, returns patterns
   * regardless of push protection status.
   * @param sort The property to sort the results by.
   * @param state Filter custom patterns by state. When absent, returns patterns in all states.
   * @param options Execution options.
   */
  public suspend fun secretScanningListOrgCustomPatternsWithResponse(
    org: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    pushProtection: InlineSecretScanningCustomPatternPushProtectionParameterXf4799756? = null,
    sort: InlineSecretScanningCustomPatternSortParameterX63e666f9? = null,
    state: InlineSecretScanningCustomPatternStateParameterX0fd7eb62? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningListOrgCustomPatternsResponse> = executor.executeWithResponse<Unit, SecretScanningListOrgCustomPatternsResponse>(SdkExecutionRequest(secretScanningListOrgCustomPatternsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "push_protection", values = pushProtection?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), SecretScanningCodecs.secretScanningListOrgCustomPatternsRequestCodecRegistry, SecretScanningListOrgCustomPatternsResponseDecoder, options)

  /**
   * Lists the secret scanning pattern configurations for an organization.
   *
   * Personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningListOrgPatternConfigsApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded SecretScanningListOrgPatternConfigsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningListOrgPatternConfigs(org: String, options: CallOptions = CallOptions()): SecretScanningPatternConfiguration = executor.executeWithTypedErrors<Unit, SecretScanningListOrgPatternConfigsResponse, SecretScanningPatternConfiguration>(
    request = SdkExecutionRequest(secretScanningListOrgPatternConfigsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningListOrgPatternConfigsRequestCodecRegistry,
    responseDecoder = SecretScanningListOrgPatternConfigsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningListOrgPatternConfigsResponse.SuccessJson -> response.json
        is SecretScanningListOrgPatternConfigsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListOrgPatternConfigsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListOrgPatternConfigsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningListOrgPatternConfigsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningListOrgPatternConfigsResponse.Http403Json -> SecretScanningListOrgPatternConfigsApiException(response, statusCode, headers)
        is SecretScanningListOrgPatternConfigsResponse.Http404Json -> SecretScanningListOrgPatternConfigsApiException(response, statusCode, headers)
        is SecretScanningListOrgPatternConfigsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the secret scanning pattern configurations for an organization.
   *
   * Personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun secretScanningListOrgPatternConfigsWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<SecretScanningListOrgPatternConfigsResponse> = executor.executeWithResponse<Unit, SecretScanningListOrgPatternConfigsResponse>(SdkExecutionRequest(secretScanningListOrgPatternConfigsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), SecretScanningCodecs.secretScanningListOrgPatternConfigsRequestCodecRegistry, SecretScanningListOrgPatternConfigsResponseDecoder, options)

  /**
   * Lists secret scanning custom patterns for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction to sort the results by.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param pushProtection Filter custom patterns by whether push protection is enabled. When absent, returns patterns
   * regardless of push protection status.
   * @param sort The property to sort the results by.
   * @param state Filter custom patterns by state. When absent, returns patterns in all states.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningListRepoCustomPatternsApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded SecretScanningListRepoCustomPatternsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningListRepoCustomPatterns(
    owner: String,
    repo: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    pushProtection: InlineSecretScanningCustomPatternPushProtectionParameterXf4799756? = null,
    sort: InlineSecretScanningCustomPatternSortParameterX63e666f9? = null,
    state: InlineSecretScanningCustomPatternStateParameterX0fd7eb62? = null,
    options: CallOptions = CallOptions(),
  ): List<SecretScanningCustomPattern> = executor.executeWithTypedErrors<Unit, SecretScanningListRepoCustomPatternsResponse, List<SecretScanningCustomPattern>>(
    request = SdkExecutionRequest(secretScanningListRepoCustomPatternsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "push_protection", values = pushProtection?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningListRepoCustomPatternsRequestCodecRegistry,
    responseDecoder = SecretScanningListRepoCustomPatternsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningListRepoCustomPatternsResponse.SuccessJson -> response.json
        is SecretScanningListRepoCustomPatternsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListRepoCustomPatternsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningListRepoCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningListRepoCustomPatternsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningListRepoCustomPatternsResponse.Http403Json -> SecretScanningListRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningListRepoCustomPatternsResponse.Http404Json -> SecretScanningListRepoCustomPatternsApiException(response, statusCode, headers)
        is SecretScanningListRepoCustomPatternsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists secret scanning custom patterns for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
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
   * @param pushProtection Filter custom patterns by whether push protection is enabled. When absent, returns patterns
   * regardless of push protection status.
   * @param sort The property to sort the results by.
   * @param state Filter custom patterns by state. When absent, returns patterns in all states.
   * @param options Execution options.
   */
  public suspend fun secretScanningListRepoCustomPatternsWithResponse(
    owner: String,
    repo: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    pushProtection: InlineSecretScanningCustomPatternPushProtectionParameterXf4799756? = null,
    sort: InlineSecretScanningCustomPatternSortParameterX63e666f9? = null,
    state: InlineSecretScanningCustomPatternStateParameterX0fd7eb62? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningListRepoCustomPatternsResponse> = executor.executeWithResponse<Unit, SecretScanningListRepoCustomPatternsResponse>(SdkExecutionRequest(secretScanningListRepoCustomPatternsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "push_protection", values = pushProtection?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), SecretScanningCodecs.secretScanningListRepoCustomPatternsRequestCodecRegistry, SecretScanningListRepoCustomPatternsResponseDecoder, options)

  /**
   * Updates the status of a secret scanning alert in an eligible repository.
   *
   * You can also use this endpoint to assign or unassign an alert to a user who has write access to the repository.
   *
   * The authenticated user must be an administrator for the repository or for the organization that owns the repository
   * to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param request Request body sent to the operation.
   * @param alertNumber The number that identifies an alert. You can find this at the end of the URL for a code scanning
   * alert within GitHub, and in the `number` field in the response from the `GET
   * /repos/{owner}/{repo}/code-scanning/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningUpdateAlertApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded SecretScanningUpdateAlertError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningUpdateAlert(
    request: InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f,
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SecretScanningAlertWithMetadata = executor.executeWithTypedErrors<InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f, SecretScanningUpdateAlertResponse, SecretScanningAlertWithMetadata>(
    request = SdkExecutionRequest(secretScanningUpdateAlertMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGUPDATEALERT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningUpdateAlertRequestCodecRegistry,
    responseDecoder = SecretScanningUpdateAlertResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningUpdateAlertResponse.SuccessJson -> response.json
        is SecretScanningUpdateAlertResponse.Http400NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateAlertResponse.Http403NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateAlertResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateAlertResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateAlertResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningUpdateAlertResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningUpdateAlertResponse.Http400NoContent -> SecretScanningUpdateAlertApiException(response, statusCode, headers)
        is SecretScanningUpdateAlertResponse.Http403NoContent -> SecretScanningUpdateAlertApiException(response, statusCode, headers)
        is SecretScanningUpdateAlertResponse.Http404NoContent -> SecretScanningUpdateAlertApiException(response, statusCode, headers)
        is SecretScanningUpdateAlertResponse.Http422NoContent -> SecretScanningUpdateAlertApiException(response, statusCode, headers)
        is SecretScanningUpdateAlertResponse.Http503Json -> SecretScanningUpdateAlertApiException(response, statusCode, headers)
        is SecretScanningUpdateAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the status of a secret scanning alert in an eligible repository.
   *
   * You can also use this endpoint to assign or unassign an alert to a user who has write access to the repository.
   *
   * The authenticated user must be an administrator for the repository or for the organization that owns the repository
   * to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
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
  public suspend fun secretScanningUpdateAlertWithResponse(
    request: InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f,
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningUpdateAlertResponse> = executor.executeWithResponse<InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f, SecretScanningUpdateAlertResponse>(SdkExecutionRequest(secretScanningUpdateAlertMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGUPDATEALERT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecretScanningCodecs.secretScanningUpdateAlertRequestCodecRegistry, SecretScanningUpdateAlertResponseDecoder, options)

  /**
   * Updates a secret scanning custom pattern for an organization.
   *
   * Personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param patternId The ID of the custom pattern.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningUpdateOrgCustomPatternApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded SecretScanningUpdateOrgCustomPatternError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningUpdateOrgCustomPattern(
    request: SecretScanningCustomPatternToUpdate,
    org: String,
    patternId: Int,
    options: CallOptions = CallOptions(),
  ): SecretScanningCustomPattern = executor.executeWithTypedErrors<SecretScanningCustomPatternToUpdate, SecretScanningUpdateOrgCustomPatternResponse, SecretScanningCustomPattern>(
    request = SdkExecutionRequest(secretScanningUpdateOrgCustomPatternMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGUPDATEORGCUSTOMPATTERN_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pattern_id", values = listOf(patternId.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningUpdateOrgCustomPatternRequestCodecRegistry,
    responseDecoder = SecretScanningUpdateOrgCustomPatternResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningUpdateOrgCustomPatternResponse.SuccessJson -> response.json
        is SecretScanningUpdateOrgCustomPatternResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgCustomPatternResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgCustomPatternResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgCustomPatternResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgCustomPatternResponse.Http412Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgCustomPatternResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgCustomPatternResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningUpdateOrgCustomPatternResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningUpdateOrgCustomPatternResponse.Http400Json -> SecretScanningUpdateOrgCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgCustomPatternResponse.Http400ScimJson -> SecretScanningUpdateOrgCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgCustomPatternResponse.Http403Json -> SecretScanningUpdateOrgCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgCustomPatternResponse.Http404Json -> SecretScanningUpdateOrgCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgCustomPatternResponse.Http412Json -> SecretScanningUpdateOrgCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgCustomPatternResponse.Http422Json -> SecretScanningUpdateOrgCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgCustomPatternResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates a secret scanning custom pattern for an organization.
   *
   * Personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param patternId The ID of the custom pattern.
   * @param options Execution options.
   */
  public suspend fun secretScanningUpdateOrgCustomPatternWithResponse(
    request: SecretScanningCustomPatternToUpdate,
    org: String,
    patternId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningUpdateOrgCustomPatternResponse> = executor.executeWithResponse<SecretScanningCustomPatternToUpdate, SecretScanningUpdateOrgCustomPatternResponse>(SdkExecutionRequest(secretScanningUpdateOrgCustomPatternMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGUPDATEORGCUSTOMPATTERN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pattern_id", values = listOf(patternId.toString())))
  }), SecretScanningCodecs.secretScanningUpdateOrgCustomPatternRequestCodecRegistry, SecretScanningUpdateOrgCustomPatternResponseDecoder, options)

  /**
   * Updates the secret scanning pattern configurations for an organization.
   *
   * Personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningUpdateOrgPatternConfigsApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded SecretScanningUpdateOrgPatternConfigsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningUpdateOrgPatternConfigs(
    request: InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5,
    org: String,
    options: CallOptions = CallOptions(),
  ): InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea = executor.executeWithTypedErrors<InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5, SecretScanningUpdateOrgPatternConfigsResponse, InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea>(
    request = SdkExecutionRequest(secretScanningUpdateOrgPatternConfigsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGUPDATEORGPATTERNCONFIGS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsRequestCodecRegistry,
    responseDecoder = SecretScanningUpdateOrgPatternConfigsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningUpdateOrgPatternConfigsResponse.SuccessJson -> response.json
        is SecretScanningUpdateOrgPatternConfigsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgPatternConfigsResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgPatternConfigsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgPatternConfigsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgPatternConfigsResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgPatternConfigsResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateOrgPatternConfigsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningUpdateOrgPatternConfigsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningUpdateOrgPatternConfigsResponse.Http400Json -> SecretScanningUpdateOrgPatternConfigsApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgPatternConfigsResponse.Http400ScimJson -> SecretScanningUpdateOrgPatternConfigsApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgPatternConfigsResponse.Http403Json -> SecretScanningUpdateOrgPatternConfigsApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgPatternConfigsResponse.Http404Json -> SecretScanningUpdateOrgPatternConfigsApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgPatternConfigsResponse.Http409Json -> SecretScanningUpdateOrgPatternConfigsApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgPatternConfigsResponse.Http422Json -> SecretScanningUpdateOrgPatternConfigsApiException(response, statusCode, headers)
        is SecretScanningUpdateOrgPatternConfigsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the secret scanning pattern configurations for an organization.
   *
   * Personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun secretScanningUpdateOrgPatternConfigsWithResponse(
    request: InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningUpdateOrgPatternConfigsResponse> = executor.executeWithResponse<InlineOrgsSecretScanningPatternConfigurationsPatchRequestJsonXed19f7d5, SecretScanningUpdateOrgPatternConfigsResponse>(SdkExecutionRequest(secretScanningUpdateOrgPatternConfigsMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGUPDATEORGPATTERNCONFIGS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsRequestCodecRegistry, SecretScanningUpdateOrgPatternConfigsResponseDecoder, options)

  /**
   * Updates a secret scanning custom pattern for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param patternId The ID of the custom pattern.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecretScanningUpdateRepoCustomPatternApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded SecretScanningUpdateRepoCustomPatternError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun secretScanningUpdateRepoCustomPattern(
    request: SecretScanningCustomPatternToUpdate,
    owner: String,
    patternId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SecretScanningCustomPattern = executor.executeWithTypedErrors<SecretScanningCustomPatternToUpdate, SecretScanningUpdateRepoCustomPatternResponse, SecretScanningCustomPattern>(
    request = SdkExecutionRequest(secretScanningUpdateRepoCustomPatternMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGUPDATEREPOCUSTOMPATTERN_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pattern_id", values = listOf(patternId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecretScanningCodecs.secretScanningUpdateRepoCustomPatternRequestCodecRegistry,
    responseDecoder = SecretScanningUpdateRepoCustomPatternResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecretScanningUpdateRepoCustomPatternResponse.SuccessJson -> response.json
        is SecretScanningUpdateRepoCustomPatternResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateRepoCustomPatternResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateRepoCustomPatternResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateRepoCustomPatternResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateRepoCustomPatternResponse.Http412Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateRepoCustomPatternResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecretScanningUpdateRepoCustomPatternResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecretScanningUpdateRepoCustomPatternResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecretScanningUpdateRepoCustomPatternResponse.Http400Json -> SecretScanningUpdateRepoCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateRepoCustomPatternResponse.Http400ScimJson -> SecretScanningUpdateRepoCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateRepoCustomPatternResponse.Http403Json -> SecretScanningUpdateRepoCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateRepoCustomPatternResponse.Http404Json -> SecretScanningUpdateRepoCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateRepoCustomPatternResponse.Http412Json -> SecretScanningUpdateRepoCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateRepoCustomPatternResponse.Http422Json -> SecretScanningUpdateRepoCustomPatternApiException(response, statusCode, headers)
        is SecretScanningUpdateRepoCustomPatternResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates a secret scanning custom pattern for a repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint. If this endpoint is only used with public repositories, the token can use the `public_repo` scope
   * instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param patternId The ID of the custom pattern.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun secretScanningUpdateRepoCustomPatternWithResponse(
    request: SecretScanningCustomPatternToUpdate,
    owner: String,
    patternId: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecretScanningUpdateRepoCustomPatternResponse> = executor.executeWithResponse<SecretScanningCustomPatternToUpdate, SecretScanningUpdateRepoCustomPatternResponse>(SdkExecutionRequest(secretScanningUpdateRepoCustomPatternMetadata, baseUri, request, listOf(SecretScanningCodecs.SECRETSCANNINGUPDATEREPOCUSTOMPATTERN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pattern_id", values = listOf(patternId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecretScanningCodecs.secretScanningUpdateRepoCustomPatternRequestCodecRegistry, SecretScanningUpdateRepoCustomPatternResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `secret-scanning/bulk-create-org-custom-patterns` may expose through
   * its typed API exception.
   */
  public sealed interface SecretScanningBulkCreateOrgCustomPatternsError

  /**
   * Typed response alternatives for `secret-scanning/bulk-create-org-custom-patterns`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningBulkCreateOrgCustomPatternsResponse {
    public class SuccessJson(
      public val json: InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateOrgCustomPatternsResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateOrgCustomPatternsResponse,
        SecretScanningBulkCreateOrgCustomPatternsError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateOrgCustomPatternsResponse,
        SecretScanningBulkCreateOrgCustomPatternsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateOrgCustomPatternsResponse,
        SecretScanningBulkCreateOrgCustomPatternsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateOrgCustomPatternsResponse,
        SecretScanningBulkCreateOrgCustomPatternsError

    public class Http422Json(
      public val json: InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateOrgCustomPatternsResponse,
        SecretScanningBulkCreateOrgCustomPatternsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateOrgCustomPatternsResponse
  }

  /**
   * Raised by `secret-scanning/bulk-create-org-custom-patterns` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningBulkCreateOrgCustomPatternsApiException(
    public val error: SecretScanningBulkCreateOrgCustomPatternsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/bulk-create-org-custom-patterns")

  private object SecretScanningBulkCreateOrgCustomPatternsResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningBulkCreateOrgCustomPatternsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningBulkCreateOrgCustomPatternsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningBulkCreateOrgCustomPatternsResponse> = when {
      alternative.id == "secret-scanning/bulk-create-org-custom-patterns.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateOrgCustomPatternsResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative0Registry.select(listOf("secret-scanning/bulk-create-org-custom-patterns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-org-custom-patterns.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateOrgCustomPatternsResponse.Http400Json(
          json = SecretScanningCodecs.secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative1Registry.select(listOf("secret-scanning/bulk-create-org-custom-patterns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-org-custom-patterns.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateOrgCustomPatternsResponse.Http400ScimJson(
          json = SecretScanningCodecs.secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative2Registry.select(listOf("secret-scanning/bulk-create-org-custom-patterns.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-org-custom-patterns.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateOrgCustomPatternsResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative3Registry.select(listOf("secret-scanning/bulk-create-org-custom-patterns.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-org-custom-patterns.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateOrgCustomPatternsResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative4Registry.select(listOf("secret-scanning/bulk-create-org-custom-patterns.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-org-custom-patterns.response.alternative5" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateOrgCustomPatternsResponse.Http422Json(
          json = SecretScanningCodecs.secretScanningBulkCreateOrgCustomPatternsResponseCodecAlternative5Registry.select(listOf("secret-scanning/bulk-create-org-custom-patterns.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningBulkCreateOrgCustomPatternsResponse = SecretScanningBulkCreateOrgCustomPatternsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/bulk-create-repo-custom-patterns` may expose
   * through its typed API exception.
   */
  public sealed interface SecretScanningBulkCreateRepoCustomPatternsError

  /**
   * Typed response alternatives for `secret-scanning/bulk-create-repo-custom-patterns`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface SecretScanningBulkCreateRepoCustomPatternsResponse {
    public class SuccessJson(
      public val json: InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateRepoCustomPatternsResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateRepoCustomPatternsResponse,
        SecretScanningBulkCreateRepoCustomPatternsError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateRepoCustomPatternsResponse,
        SecretScanningBulkCreateRepoCustomPatternsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateRepoCustomPatternsResponse,
        SecretScanningBulkCreateRepoCustomPatternsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateRepoCustomPatternsResponse,
        SecretScanningBulkCreateRepoCustomPatternsError

    public class Http422Json(
      public val json: InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateRepoCustomPatternsResponse,
        SecretScanningBulkCreateRepoCustomPatternsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkCreateRepoCustomPatternsResponse
  }

  /**
   * Raised by `secret-scanning/bulk-create-repo-custom-patterns` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningBulkCreateRepoCustomPatternsApiException(
    public val error: SecretScanningBulkCreateRepoCustomPatternsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/bulk-create-repo-custom-patterns")

  private object SecretScanningBulkCreateRepoCustomPatternsResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningBulkCreateRepoCustomPatternsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningBulkCreateRepoCustomPatternsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningBulkCreateRepoCustomPatternsResponse> = when {
      alternative.id == "secret-scanning/bulk-create-repo-custom-patterns.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateRepoCustomPatternsResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative0Registry.select(listOf("secret-scanning/bulk-create-repo-custom-patterns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-repo-custom-patterns.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateRepoCustomPatternsResponse.Http400Json(
          json = SecretScanningCodecs.secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative1Registry.select(listOf("secret-scanning/bulk-create-repo-custom-patterns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-repo-custom-patterns.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateRepoCustomPatternsResponse.Http400ScimJson(
          json = SecretScanningCodecs.secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative2Registry.select(listOf("secret-scanning/bulk-create-repo-custom-patterns.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-repo-custom-patterns.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateRepoCustomPatternsResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative3Registry.select(listOf("secret-scanning/bulk-create-repo-custom-patterns.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-repo-custom-patterns.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateRepoCustomPatternsResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative4Registry.select(listOf("secret-scanning/bulk-create-repo-custom-patterns.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-create-repo-custom-patterns.response.alternative5" -> SdkResponseDecodeResult(
        value = SecretScanningBulkCreateRepoCustomPatternsResponse.Http422Json(
          json = SecretScanningCodecs.secretScanningBulkCreateRepoCustomPatternsResponseCodecAlternative5Registry.select(listOf("secret-scanning/bulk-create-repo-custom-patterns.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningBulkCreateRepoCustomPatternsResponse = SecretScanningBulkCreateRepoCustomPatternsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/bulk-delete-org-custom-patterns` may expose through
   * its typed API exception.
   */
  public sealed interface SecretScanningBulkDeleteOrgCustomPatternsError

  /**
   * Typed response alternatives for `secret-scanning/bulk-delete-org-custom-patterns`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningBulkDeleteOrgCustomPatternsResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteOrgCustomPatternsResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteOrgCustomPatternsResponse,
        SecretScanningBulkDeleteOrgCustomPatternsError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteOrgCustomPatternsResponse,
        SecretScanningBulkDeleteOrgCustomPatternsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteOrgCustomPatternsResponse,
        SecretScanningBulkDeleteOrgCustomPatternsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteOrgCustomPatternsResponse,
        SecretScanningBulkDeleteOrgCustomPatternsError

    public class Http412Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteOrgCustomPatternsResponse,
        SecretScanningBulkDeleteOrgCustomPatternsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteOrgCustomPatternsResponse
  }

  /**
   * Raised by `secret-scanning/bulk-delete-org-custom-patterns` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningBulkDeleteOrgCustomPatternsApiException(
    public val error: SecretScanningBulkDeleteOrgCustomPatternsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/bulk-delete-org-custom-patterns")

  private object SecretScanningBulkDeleteOrgCustomPatternsResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningBulkDeleteOrgCustomPatternsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningBulkDeleteOrgCustomPatternsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningBulkDeleteOrgCustomPatternsResponse> = when {
      alternative.id == "secret-scanning/bulk-delete-org-custom-patterns.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteOrgCustomPatternsResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-org-custom-patterns.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteOrgCustomPatternsResponse.Http400Json(
          json = SecretScanningCodecs.secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative1Registry.select(listOf("secret-scanning/bulk-delete-org-custom-patterns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-org-custom-patterns.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteOrgCustomPatternsResponse.Http400ScimJson(
          json = SecretScanningCodecs.secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative2Registry.select(listOf("secret-scanning/bulk-delete-org-custom-patterns.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-org-custom-patterns.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteOrgCustomPatternsResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative3Registry.select(listOf("secret-scanning/bulk-delete-org-custom-patterns.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-org-custom-patterns.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteOrgCustomPatternsResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative4Registry.select(listOf("secret-scanning/bulk-delete-org-custom-patterns.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-org-custom-patterns.response.alternative5" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteOrgCustomPatternsResponse.Http412Json(
          json = SecretScanningCodecs.secretScanningBulkDeleteOrgCustomPatternsResponseCodecAlternative5Registry.select(listOf("secret-scanning/bulk-delete-org-custom-patterns.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningBulkDeleteOrgCustomPatternsResponse = SecretScanningBulkDeleteOrgCustomPatternsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/bulk-delete-repo-custom-patterns` may expose
   * through its typed API exception.
   */
  public sealed interface SecretScanningBulkDeleteRepoCustomPatternsError

  /**
   * Typed response alternatives for `secret-scanning/bulk-delete-repo-custom-patterns`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface SecretScanningBulkDeleteRepoCustomPatternsResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteRepoCustomPatternsResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteRepoCustomPatternsResponse,
        SecretScanningBulkDeleteRepoCustomPatternsError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteRepoCustomPatternsResponse,
        SecretScanningBulkDeleteRepoCustomPatternsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteRepoCustomPatternsResponse,
        SecretScanningBulkDeleteRepoCustomPatternsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteRepoCustomPatternsResponse,
        SecretScanningBulkDeleteRepoCustomPatternsError

    public class Http412Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteRepoCustomPatternsResponse,
        SecretScanningBulkDeleteRepoCustomPatternsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningBulkDeleteRepoCustomPatternsResponse
  }

  /**
   * Raised by `secret-scanning/bulk-delete-repo-custom-patterns` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningBulkDeleteRepoCustomPatternsApiException(
    public val error: SecretScanningBulkDeleteRepoCustomPatternsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/bulk-delete-repo-custom-patterns")

  private object SecretScanningBulkDeleteRepoCustomPatternsResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningBulkDeleteRepoCustomPatternsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningBulkDeleteRepoCustomPatternsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningBulkDeleteRepoCustomPatternsResponse> = when {
      alternative.id == "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteRepoCustomPatternsResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteRepoCustomPatternsResponse.Http400Json(
          json = SecretScanningCodecs.secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative1Registry.select(listOf("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteRepoCustomPatternsResponse.Http400ScimJson(
          json = SecretScanningCodecs.secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative2Registry.select(listOf("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteRepoCustomPatternsResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative3Registry.select(listOf("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteRepoCustomPatternsResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative4Registry.select(listOf("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative5" -> SdkResponseDecodeResult(
        value = SecretScanningBulkDeleteRepoCustomPatternsResponse.Http412Json(
          json = SecretScanningCodecs.secretScanningBulkDeleteRepoCustomPatternsResponseCodecAlternative5Registry.select(listOf("secret-scanning/bulk-delete-repo-custom-patterns.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningBulkDeleteRepoCustomPatternsResponse = SecretScanningBulkDeleteRepoCustomPatternsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/create-push-protection-bypass` may expose through
   * its typed API exception.
   */
  public sealed interface SecretScanningCreatePushProtectionBypassError

  /**
   * Typed response alternatives for `secret-scanning/create-push-protection-bypass`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningCreatePushProtectionBypassResponse {
    public class SuccessJson(
      public val json: SecretScanningPushProtectionBypass,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningCreatePushProtectionBypassResponse

    public class Http403NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningCreatePushProtectionBypassResponse,
        SecretScanningCreatePushProtectionBypassError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningCreatePushProtectionBypassResponse,
        SecretScanningCreatePushProtectionBypassError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningCreatePushProtectionBypassResponse,
        SecretScanningCreatePushProtectionBypassError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningCreatePushProtectionBypassResponse,
        SecretScanningCreatePushProtectionBypassError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningCreatePushProtectionBypassResponse
  }

  /**
   * Raised by `secret-scanning/create-push-protection-bypass` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningCreatePushProtectionBypassApiException(
    public val error: SecretScanningCreatePushProtectionBypassError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/create-push-protection-bypass")

  private object SecretScanningCreatePushProtectionBypassResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningCreatePushProtectionBypassResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningCreatePushProtectionBypassResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningCreatePushProtectionBypassResponse> = when {
      alternative.id == "secret-scanning/create-push-protection-bypass.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningCreatePushProtectionBypassResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningCreatePushProtectionBypassResponseCodecAlternative0Registry.select(listOf("secret-scanning/create-push-protection-bypass.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/create-push-protection-bypass.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningCreatePushProtectionBypassResponse.Http403NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/create-push-protection-bypass.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningCreatePushProtectionBypassResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/create-push-protection-bypass.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningCreatePushProtectionBypassResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/create-push-protection-bypass.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningCreatePushProtectionBypassResponse.Http503Json(
          json = SecretScanningCodecs.secretScanningCreatePushProtectionBypassResponseCodecAlternative4Registry.select(listOf("secret-scanning/create-push-protection-bypass.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningCreatePushProtectionBypassResponse = SecretScanningCreatePushProtectionBypassResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/get-alert` may expose through its typed API
   * exception.
   */
  public sealed interface SecretScanningGetAlertError

  /**
   * Typed response alternatives for `secret-scanning/get-alert`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface SecretScanningGetAlertResponse {
    public class SuccessJson(
      public val json: SecretScanningAlertWithMetadata,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetAlertResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetAlertResponse,
        SecretScanningGetAlertError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetAlertResponse,
        SecretScanningGetAlertError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetAlertResponse,
        SecretScanningGetAlertError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetAlertResponse
  }

  /**
   * Raised by `secret-scanning/get-alert` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class SecretScanningGetAlertApiException(
    public val error: SecretScanningGetAlertError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/get-alert")

  private object SecretScanningGetAlertResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningGetAlertResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningGetAlertResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningGetAlertResponse> = when {
      alternative.id == "secret-scanning/get-alert.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningGetAlertResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningGetAlertResponseCodecAlternative0Registry.select(listOf("secret-scanning/get-alert.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/get-alert.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningGetAlertResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/get-alert.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningGetAlertResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/get-alert.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningGetAlertResponse.Http503Json(
          json = SecretScanningCodecs.secretScanningGetAlertResponseCodecAlternative3Registry.select(listOf("secret-scanning/get-alert.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningGetAlertResponse = SecretScanningGetAlertResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/get-scan-history` may expose through its typed API
   * exception.
   */
  public sealed interface SecretScanningGetScanHistoryError

  /**
   * Typed response alternatives for `secret-scanning/get-scan-history`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface SecretScanningGetScanHistoryResponse {
    public class SuccessJson(
      public val json: SecretScanningScanHistory,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetScanHistoryResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetScanHistoryResponse,
        SecretScanningGetScanHistoryError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetScanHistoryResponse,
        SecretScanningGetScanHistoryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningGetScanHistoryResponse
  }

  /**
   * Raised by `secret-scanning/get-scan-history` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningGetScanHistoryApiException(
    public val error: SecretScanningGetScanHistoryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/get-scan-history")

  private object SecretScanningGetScanHistoryResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningGetScanHistoryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningGetScanHistoryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningGetScanHistoryResponse> = when {
      alternative.id == "secret-scanning/get-scan-history.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningGetScanHistoryResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningGetScanHistoryResponseCodecAlternative0Registry.select(listOf("secret-scanning/get-scan-history.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/get-scan-history.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningGetScanHistoryResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/get-scan-history.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningGetScanHistoryResponse.Http503Json(
          json = SecretScanningCodecs.secretScanningGetScanHistoryResponseCodecAlternative2Registry.select(listOf("secret-scanning/get-scan-history.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningGetScanHistoryResponse = SecretScanningGetScanHistoryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/list-alerts-for-org` may expose through its typed
   * API exception.
   */
  public sealed interface SecretScanningListAlertsForOrgError

  /**
   * Typed response alternatives for `secret-scanning/list-alerts-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface SecretScanningListAlertsForOrgResponse {
    public class SuccessJson(
      public val json: List<OrganizationSecretScanningAlert>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListAlertsForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListAlertsForOrgResponse,
        SecretScanningListAlertsForOrgError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListAlertsForOrgResponse,
        SecretScanningListAlertsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListAlertsForOrgResponse
  }

  /**
   * Raised by `secret-scanning/list-alerts-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningListAlertsForOrgApiException(
    public val error: SecretScanningListAlertsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/list-alerts-for-org")

  private object SecretScanningListAlertsForOrgResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningListAlertsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningListAlertsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningListAlertsForOrgResponse> = when {
      alternative.id == "secret-scanning/list-alerts-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningListAlertsForOrgResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningListAlertsForOrgResponseCodecAlternative0Registry.select(listOf("secret-scanning/list-alerts-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-alerts-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningListAlertsForOrgResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningListAlertsForOrgResponseCodecAlternative1Registry.select(listOf("secret-scanning/list-alerts-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-alerts-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningListAlertsForOrgResponse.Http503Json(
          json = SecretScanningCodecs.secretScanningListAlertsForOrgResponseCodecAlternative2Registry.select(listOf("secret-scanning/list-alerts-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningListAlertsForOrgResponse = SecretScanningListAlertsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/list-alerts-for-repo` may expose through its typed
   * API exception.
   */
  public sealed interface SecretScanningListAlertsForRepoError

  /**
   * Typed response alternatives for `secret-scanning/list-alerts-for-repo`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface SecretScanningListAlertsForRepoResponse {
    public class SuccessJson(
      public val json: List<SecretScanningAlert>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListAlertsForRepoResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListAlertsForRepoResponse,
        SecretScanningListAlertsForRepoError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListAlertsForRepoResponse,
        SecretScanningListAlertsForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListAlertsForRepoResponse
  }

  /**
   * Raised by `secret-scanning/list-alerts-for-repo` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningListAlertsForRepoApiException(
    public val error: SecretScanningListAlertsForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/list-alerts-for-repo")

  private object SecretScanningListAlertsForRepoResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningListAlertsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningListAlertsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningListAlertsForRepoResponse> = when {
      alternative.id == "secret-scanning/list-alerts-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningListAlertsForRepoResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningListAlertsForRepoResponseCodecAlternative0Registry.select(listOf("secret-scanning/list-alerts-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-alerts-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningListAlertsForRepoResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-alerts-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningListAlertsForRepoResponse.Http503Json(
          json = SecretScanningCodecs.secretScanningListAlertsForRepoResponseCodecAlternative2Registry.select(listOf("secret-scanning/list-alerts-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningListAlertsForRepoResponse = SecretScanningListAlertsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/list-locations-for-alert` may expose through its
   * typed API exception.
   */
  public sealed interface SecretScanningListLocationsForAlertError

  /**
   * Typed response alternatives for `secret-scanning/list-locations-for-alert`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningListLocationsForAlertResponse {
    public class SuccessJson(
      public val json: List<SecretScanningLocation>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListLocationsForAlertResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListLocationsForAlertResponse,
        SecretScanningListLocationsForAlertError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListLocationsForAlertResponse,
        SecretScanningListLocationsForAlertError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListLocationsForAlertResponse
  }

  /**
   * Raised by `secret-scanning/list-locations-for-alert` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningListLocationsForAlertApiException(
    public val error: SecretScanningListLocationsForAlertError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/list-locations-for-alert")

  private object SecretScanningListLocationsForAlertResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningListLocationsForAlertResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningListLocationsForAlertResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningListLocationsForAlertResponse> = when {
      alternative.id == "secret-scanning/list-locations-for-alert.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningListLocationsForAlertResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningListLocationsForAlertResponseCodecAlternative0Registry.select(listOf("secret-scanning/list-locations-for-alert.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-locations-for-alert.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningListLocationsForAlertResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-locations-for-alert.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningListLocationsForAlertResponse.Http503Json(
          json = SecretScanningCodecs.secretScanningListLocationsForAlertResponseCodecAlternative2Registry.select(listOf("secret-scanning/list-locations-for-alert.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningListLocationsForAlertResponse = SecretScanningListLocationsForAlertResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/list-org-custom-patterns` may expose through its
   * typed API exception.
   */
  public sealed interface SecretScanningListOrgCustomPatternsError

  /**
   * Typed response alternatives for `secret-scanning/list-org-custom-patterns`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningListOrgCustomPatternsResponse {
    public class SuccessJson(
      public val json: List<SecretScanningCustomPattern>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListOrgCustomPatternsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListOrgCustomPatternsResponse,
        SecretScanningListOrgCustomPatternsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListOrgCustomPatternsResponse,
        SecretScanningListOrgCustomPatternsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListOrgCustomPatternsResponse
  }

  /**
   * Raised by `secret-scanning/list-org-custom-patterns` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningListOrgCustomPatternsApiException(
    public val error: SecretScanningListOrgCustomPatternsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/list-org-custom-patterns")

  private object SecretScanningListOrgCustomPatternsResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningListOrgCustomPatternsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningListOrgCustomPatternsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningListOrgCustomPatternsResponse> = when {
      alternative.id == "secret-scanning/list-org-custom-patterns.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningListOrgCustomPatternsResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningListOrgCustomPatternsResponseCodecAlternative0Registry.select(listOf("secret-scanning/list-org-custom-patterns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-org-custom-patterns.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningListOrgCustomPatternsResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningListOrgCustomPatternsResponseCodecAlternative1Registry.select(listOf("secret-scanning/list-org-custom-patterns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-org-custom-patterns.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningListOrgCustomPatternsResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningListOrgCustomPatternsResponseCodecAlternative2Registry.select(listOf("secret-scanning/list-org-custom-patterns.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningListOrgCustomPatternsResponse = SecretScanningListOrgCustomPatternsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/list-org-pattern-configs` may expose through its
   * typed API exception.
   */
  public sealed interface SecretScanningListOrgPatternConfigsError

  /**
   * Typed response alternatives for `secret-scanning/list-org-pattern-configs`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningListOrgPatternConfigsResponse {
    public class SuccessJson(
      public val json: SecretScanningPatternConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListOrgPatternConfigsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListOrgPatternConfigsResponse,
        SecretScanningListOrgPatternConfigsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListOrgPatternConfigsResponse,
        SecretScanningListOrgPatternConfigsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListOrgPatternConfigsResponse
  }

  /**
   * Raised by `secret-scanning/list-org-pattern-configs` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningListOrgPatternConfigsApiException(
    public val error: SecretScanningListOrgPatternConfigsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/list-org-pattern-configs")

  private object SecretScanningListOrgPatternConfigsResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningListOrgPatternConfigsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningListOrgPatternConfigsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningListOrgPatternConfigsResponse> = when {
      alternative.id == "secret-scanning/list-org-pattern-configs.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningListOrgPatternConfigsResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningListOrgPatternConfigsResponseCodecAlternative0Registry.select(listOf("secret-scanning/list-org-pattern-configs.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-org-pattern-configs.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningListOrgPatternConfigsResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningListOrgPatternConfigsResponseCodecAlternative1Registry.select(listOf("secret-scanning/list-org-pattern-configs.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-org-pattern-configs.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningListOrgPatternConfigsResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningListOrgPatternConfigsResponseCodecAlternative2Registry.select(listOf("secret-scanning/list-org-pattern-configs.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningListOrgPatternConfigsResponse = SecretScanningListOrgPatternConfigsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/list-repo-custom-patterns` may expose through its
   * typed API exception.
   */
  public sealed interface SecretScanningListRepoCustomPatternsError

  /**
   * Typed response alternatives for `secret-scanning/list-repo-custom-patterns`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningListRepoCustomPatternsResponse {
    public class SuccessJson(
      public val json: List<SecretScanningCustomPattern>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListRepoCustomPatternsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListRepoCustomPatternsResponse,
        SecretScanningListRepoCustomPatternsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListRepoCustomPatternsResponse,
        SecretScanningListRepoCustomPatternsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningListRepoCustomPatternsResponse
  }

  /**
   * Raised by `secret-scanning/list-repo-custom-patterns` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningListRepoCustomPatternsApiException(
    public val error: SecretScanningListRepoCustomPatternsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/list-repo-custom-patterns")

  private object SecretScanningListRepoCustomPatternsResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningListRepoCustomPatternsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningListRepoCustomPatternsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningListRepoCustomPatternsResponse> = when {
      alternative.id == "secret-scanning/list-repo-custom-patterns.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningListRepoCustomPatternsResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningListRepoCustomPatternsResponseCodecAlternative0Registry.select(listOf("secret-scanning/list-repo-custom-patterns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-repo-custom-patterns.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningListRepoCustomPatternsResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningListRepoCustomPatternsResponseCodecAlternative1Registry.select(listOf("secret-scanning/list-repo-custom-patterns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/list-repo-custom-patterns.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningListRepoCustomPatternsResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningListRepoCustomPatternsResponseCodecAlternative2Registry.select(listOf("secret-scanning/list-repo-custom-patterns.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningListRepoCustomPatternsResponse = SecretScanningListRepoCustomPatternsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/update-alert` may expose through its typed API
   * exception.
   */
  public sealed interface SecretScanningUpdateAlertError

  /**
   * Typed response alternatives for `secret-scanning/update-alert`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface SecretScanningUpdateAlertResponse {
    public class SuccessJson(
      public val json: SecretScanningAlertWithMetadata,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateAlertResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateAlertResponse,
        SecretScanningUpdateAlertError

    public class Http403NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateAlertResponse,
        SecretScanningUpdateAlertError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateAlertResponse,
        SecretScanningUpdateAlertError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateAlertResponse,
        SecretScanningUpdateAlertError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateAlertResponse,
        SecretScanningUpdateAlertError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateAlertResponse
  }

  /**
   * Raised by `secret-scanning/update-alert` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningUpdateAlertApiException(
    public val error: SecretScanningUpdateAlertError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/update-alert")

  private object SecretScanningUpdateAlertResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningUpdateAlertResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningUpdateAlertResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningUpdateAlertResponse> = when {
      alternative.id == "secret-scanning/update-alert.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateAlertResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningUpdateAlertResponseCodecAlternative0Registry.select(listOf("secret-scanning/update-alert.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-alert.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateAlertResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-alert.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateAlertResponse.Http403NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-alert.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateAlertResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-alert.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateAlertResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-alert.response.alternative5" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateAlertResponse.Http503Json(
          json = SecretScanningCodecs.secretScanningUpdateAlertResponseCodecAlternative5Registry.select(listOf("secret-scanning/update-alert.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningUpdateAlertResponse = SecretScanningUpdateAlertResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/update-org-custom-pattern` may expose through its
   * typed API exception.
   */
  public sealed interface SecretScanningUpdateOrgCustomPatternError

  /**
   * Typed response alternatives for `secret-scanning/update-org-custom-pattern`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningUpdateOrgCustomPatternResponse {
    public class SuccessJson(
      public val json: SecretScanningCustomPattern,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgCustomPatternResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgCustomPatternResponse,
        SecretScanningUpdateOrgCustomPatternError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgCustomPatternResponse,
        SecretScanningUpdateOrgCustomPatternError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgCustomPatternResponse,
        SecretScanningUpdateOrgCustomPatternError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgCustomPatternResponse,
        SecretScanningUpdateOrgCustomPatternError

    public class Http412Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgCustomPatternResponse,
        SecretScanningUpdateOrgCustomPatternError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgCustomPatternResponse,
        SecretScanningUpdateOrgCustomPatternError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgCustomPatternResponse
  }

  /**
   * Raised by `secret-scanning/update-org-custom-pattern` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningUpdateOrgCustomPatternApiException(
    public val error: SecretScanningUpdateOrgCustomPatternError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/update-org-custom-pattern")

  private object SecretScanningUpdateOrgCustomPatternResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningUpdateOrgCustomPatternResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningUpdateOrgCustomPatternResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningUpdateOrgCustomPatternResponse> = when {
      alternative.id == "secret-scanning/update-org-custom-pattern.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgCustomPatternResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningUpdateOrgCustomPatternResponseCodecAlternative0Registry.select(listOf("secret-scanning/update-org-custom-pattern.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-custom-pattern.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgCustomPatternResponse.Http400Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgCustomPatternResponseCodecAlternative1Registry.select(listOf("secret-scanning/update-org-custom-pattern.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-custom-pattern.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgCustomPatternResponse.Http400ScimJson(
          json = SecretScanningCodecs.secretScanningUpdateOrgCustomPatternResponseCodecAlternative2Registry.select(listOf("secret-scanning/update-org-custom-pattern.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-custom-pattern.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgCustomPatternResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgCustomPatternResponseCodecAlternative3Registry.select(listOf("secret-scanning/update-org-custom-pattern.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-custom-pattern.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgCustomPatternResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgCustomPatternResponseCodecAlternative4Registry.select(listOf("secret-scanning/update-org-custom-pattern.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-custom-pattern.response.alternative5" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgCustomPatternResponse.Http412Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgCustomPatternResponseCodecAlternative5Registry.select(listOf("secret-scanning/update-org-custom-pattern.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-custom-pattern.response.alternative6" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgCustomPatternResponse.Http422Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgCustomPatternResponseCodecAlternative6Registry.select(listOf("secret-scanning/update-org-custom-pattern.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningUpdateOrgCustomPatternResponse = SecretScanningUpdateOrgCustomPatternResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/update-org-pattern-configs` may expose through its
   * typed API exception.
   */
  public sealed interface SecretScanningUpdateOrgPatternConfigsError

  /**
   * Typed response alternatives for `secret-scanning/update-org-pattern-configs`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningUpdateOrgPatternConfigsResponse {
    public class SuccessJson(
      public val json: InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgPatternConfigsResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgPatternConfigsResponse,
        SecretScanningUpdateOrgPatternConfigsError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgPatternConfigsResponse,
        SecretScanningUpdateOrgPatternConfigsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgPatternConfigsResponse,
        SecretScanningUpdateOrgPatternConfigsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgPatternConfigsResponse,
        SecretScanningUpdateOrgPatternConfigsError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgPatternConfigsResponse,
        SecretScanningUpdateOrgPatternConfigsError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgPatternConfigsResponse,
        SecretScanningUpdateOrgPatternConfigsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateOrgPatternConfigsResponse
  }

  /**
   * Raised by `secret-scanning/update-org-pattern-configs` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningUpdateOrgPatternConfigsApiException(
    public val error: SecretScanningUpdateOrgPatternConfigsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/update-org-pattern-configs")

  private object SecretScanningUpdateOrgPatternConfigsResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningUpdateOrgPatternConfigsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningUpdateOrgPatternConfigsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningUpdateOrgPatternConfigsResponse> = when {
      alternative.id == "secret-scanning/update-org-pattern-configs.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgPatternConfigsResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsResponseCodecAlternative0Registry.select(listOf("secret-scanning/update-org-pattern-configs.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-pattern-configs.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgPatternConfigsResponse.Http400Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsResponseCodecAlternative1Registry.select(listOf("secret-scanning/update-org-pattern-configs.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-pattern-configs.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgPatternConfigsResponse.Http400ScimJson(
          json = SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsResponseCodecAlternative2Registry.select(listOf("secret-scanning/update-org-pattern-configs.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-pattern-configs.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgPatternConfigsResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsResponseCodecAlternative3Registry.select(listOf("secret-scanning/update-org-pattern-configs.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-pattern-configs.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgPatternConfigsResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsResponseCodecAlternative4Registry.select(listOf("secret-scanning/update-org-pattern-configs.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-pattern-configs.response.alternative5" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgPatternConfigsResponse.Http409Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsResponseCodecAlternative5Registry.select(listOf("secret-scanning/update-org-pattern-configs.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-org-pattern-configs.response.alternative6" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateOrgPatternConfigsResponse.Http422Json(
          json = SecretScanningCodecs.secretScanningUpdateOrgPatternConfigsResponseCodecAlternative6Registry.select(listOf("secret-scanning/update-org-pattern-configs.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningUpdateOrgPatternConfigsResponse = SecretScanningUpdateOrgPatternConfigsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `secret-scanning/update-repo-custom-pattern` may expose through its
   * typed API exception.
   */
  public sealed interface SecretScanningUpdateRepoCustomPatternError

  /**
   * Typed response alternatives for `secret-scanning/update-repo-custom-pattern`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecretScanningUpdateRepoCustomPatternResponse {
    public class SuccessJson(
      public val json: SecretScanningCustomPattern,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateRepoCustomPatternResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateRepoCustomPatternResponse,
        SecretScanningUpdateRepoCustomPatternError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateRepoCustomPatternResponse,
        SecretScanningUpdateRepoCustomPatternError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateRepoCustomPatternResponse,
        SecretScanningUpdateRepoCustomPatternError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateRepoCustomPatternResponse,
        SecretScanningUpdateRepoCustomPatternError

    public class Http412Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateRepoCustomPatternResponse,
        SecretScanningUpdateRepoCustomPatternError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateRepoCustomPatternResponse,
        SecretScanningUpdateRepoCustomPatternError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecretScanningUpdateRepoCustomPatternResponse
  }

  /**
   * Raised by `secret-scanning/update-repo-custom-pattern` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecretScanningUpdateRepoCustomPatternApiException(
    public val error: SecretScanningUpdateRepoCustomPatternError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "secret-scanning/update-repo-custom-pattern")

  private object SecretScanningUpdateRepoCustomPatternResponseDecoder : SdkResponseAlternativeDecoder<SecretScanningUpdateRepoCustomPatternResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecretScanningUpdateRepoCustomPatternResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecretScanningUpdateRepoCustomPatternResponse> = when {
      alternative.id == "secret-scanning/update-repo-custom-pattern.response.alternative0" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateRepoCustomPatternResponse.SuccessJson(
          json = SecretScanningCodecs.secretScanningUpdateRepoCustomPatternResponseCodecAlternative0Registry.select(listOf("secret-scanning/update-repo-custom-pattern.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-repo-custom-pattern.response.alternative1" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateRepoCustomPatternResponse.Http400Json(
          json = SecretScanningCodecs.secretScanningUpdateRepoCustomPatternResponseCodecAlternative1Registry.select(listOf("secret-scanning/update-repo-custom-pattern.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-repo-custom-pattern.response.alternative2" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateRepoCustomPatternResponse.Http400ScimJson(
          json = SecretScanningCodecs.secretScanningUpdateRepoCustomPatternResponseCodecAlternative2Registry.select(listOf("secret-scanning/update-repo-custom-pattern.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-repo-custom-pattern.response.alternative3" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateRepoCustomPatternResponse.Http403Json(
          json = SecretScanningCodecs.secretScanningUpdateRepoCustomPatternResponseCodecAlternative3Registry.select(listOf("secret-scanning/update-repo-custom-pattern.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-repo-custom-pattern.response.alternative4" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateRepoCustomPatternResponse.Http404Json(
          json = SecretScanningCodecs.secretScanningUpdateRepoCustomPatternResponseCodecAlternative4Registry.select(listOf("secret-scanning/update-repo-custom-pattern.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-repo-custom-pattern.response.alternative5" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateRepoCustomPatternResponse.Http412Json(
          json = SecretScanningCodecs.secretScanningUpdateRepoCustomPatternResponseCodecAlternative5Registry.select(listOf("secret-scanning/update-repo-custom-pattern.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "secret-scanning/update-repo-custom-pattern.response.alternative6" -> SdkResponseDecodeResult(
        value = SecretScanningUpdateRepoCustomPatternResponse.Http422Json(
          json = SecretScanningCodecs.secretScanningUpdateRepoCustomPatternResponseCodecAlternative6Registry.select(listOf("secret-scanning/update-repo-custom-pattern.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecretScanningUpdateRepoCustomPatternResponse = SecretScanningUpdateRepoCustomPatternResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val secretScanningBulkCreateOrgCustomPatternsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/bulk-create-org-custom-patterns",
          method = "POST",
          path = "/orgs/{org}/secret-scanning/custom-patterns",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-org-custom-patterns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-org-custom-patterns.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-org-custom-patterns.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-org-custom-patterns.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-org-custom-patterns.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsSecretScanningCustomPatternsPostResponse422JsonXe6ca0e4c",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-org-custom-patterns.response.alternative5",
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

    public val secretScanningBulkCreateRepoCustomPatternsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/bulk-create-repo-custom-patterns",
          method = "POST",
          path = "/repos/{owner}/{repo}/secret-scanning/custom-patterns",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-repo-custom-patterns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-repo-custom-patterns.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-repo-custom-patterns.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-repo-custom-patterns.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-repo-custom-patterns.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposSecretScanningCustomPatternsPostResponse422JsonX7bc7a534",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-create-repo-custom-patterns.response.alternative5",
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

    public val secretScanningBulkDeleteOrgCustomPatternsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/bulk-delete-org-custom-patterns",
          method = "DELETE",
          path = "/orgs/{org}/secret-scanning/custom-patterns",
          requestMediaTypes = listOf("application/json"),
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
              id = "secret-scanning/bulk-delete-org-custom-patterns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-org-custom-patterns.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-org-custom-patterns.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-org-custom-patterns.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-org-custom-patterns.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 412),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-org-custom-patterns.response.alternative5",
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

    public val secretScanningBulkDeleteRepoCustomPatternsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/bulk-delete-repo-custom-patterns",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/secret-scanning/custom-patterns",
          requestMediaTypes = listOf("application/json"),
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
              id = "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 412),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/bulk-delete-repo-custom-patterns.response.alternative5",
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

    public val secretScanningCreatePushProtectionBypassMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/create-push-protection-bypass",
          method = "POST",
          path = "/repos/{owner}/{repo}/secret-scanning/push-protection-bypasses",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SecretScanningPushProtectionBypass",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/create-push-protection-bypass.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/create-push-protection-bypass.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/create-push-protection-bypass.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/create-push-protection-bypass.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/create-push-protection-bypass.response.alternative4",
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

    public val secretScanningGetAlertMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/get-alert",
          method = "GET",
          path = "/repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SecretScanningAlertWithMetadata",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/get-alert.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/get-alert.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/get-alert.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/get-alert.response.alternative3",
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

    public val secretScanningGetScanHistoryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/get-scan-history",
          method = "GET",
          path = "/repos/{owner}/{repo}/secret-scanning/scan-history",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SecretScanningScanHistory",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/get-scan-history.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/get-scan-history.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/get-scan-history.response.alternative2",
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

    public val secretScanningListAlertsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/list-alerts-for-org",
          method = "GET",
          path = "/orgs/{org}/secret-scanning/alerts",
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
              id = "secret-scanning/list-alerts-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-alerts-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-alerts-for-org.response.alternative2",
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

    public val secretScanningListAlertsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/list-alerts-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/secret-scanning/alerts",
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
              id = "secret-scanning/list-alerts-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-alerts-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-alerts-for-repo.response.alternative2",
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

    public val secretScanningListLocationsForAlertMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/list-locations-for-alert",
          method = "GET",
          path = "/repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}/locations",
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
              id = "secret-scanning/list-locations-for-alert.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-locations-for-alert.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-locations-for-alert.response.alternative2",
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

    public val secretScanningListOrgCustomPatternsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/list-org-custom-patterns",
          method = "GET",
          path = "/orgs/{org}/secret-scanning/custom-patterns",
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
              id = "secret-scanning/list-org-custom-patterns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-org-custom-patterns.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-org-custom-patterns.response.alternative2",
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

    public val secretScanningListOrgPatternConfigsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/list-org-pattern-configs",
          method = "GET",
          path = "/orgs/{org}/secret-scanning/pattern-configurations",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SecretScanningPatternConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-org-pattern-configs.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-org-pattern-configs.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-org-pattern-configs.response.alternative2",
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

    public val secretScanningListRepoCustomPatternsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/list-repo-custom-patterns",
          method = "GET",
          path = "/repos/{owner}/{repo}/secret-scanning/custom-patterns",
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
              id = "secret-scanning/list-repo-custom-patterns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-repo-custom-patterns.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/list-repo-custom-patterns.response.alternative2",
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

    public val secretScanningUpdateAlertMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/update-alert",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/secret-scanning/alerts/{alert_number}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SecretScanningAlertWithMetadata",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-alert.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-alert.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-alert.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-alert.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-alert.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-alert.response.alternative5",
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

    public val secretScanningUpdateOrgCustomPatternMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/update-org-custom-pattern",
          method = "PATCH",
          path = "/orgs/{org}/secret-scanning/custom-patterns/{pattern_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SecretScanningCustomPattern",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-custom-pattern.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-custom-pattern.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-custom-pattern.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-custom-pattern.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-custom-pattern.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 412),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-custom-pattern.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-custom-pattern.response.alternative6",
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

    public val secretScanningUpdateOrgPatternConfigsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/update-org-pattern-configs",
          method = "PATCH",
          path = "/orgs/{org}/secret-scanning/pattern-configurations",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsSecretScanningPatternConfigurationsPatchResponse200JsonX231035ea",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-pattern-configs.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-pattern-configs.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-pattern-configs.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-pattern-configs.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-pattern-configs.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-pattern-configs.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-org-pattern-configs.response.alternative6",
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

    public val secretScanningUpdateRepoCustomPatternMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "secret-scanning/update-repo-custom-pattern",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/secret-scanning/custom-patterns/{pattern_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SecretScanningCustomPattern",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-repo-custom-pattern.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-repo-custom-pattern.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-repo-custom-pattern.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-repo-custom-pattern.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-repo-custom-pattern.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 412),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-repo-custom-pattern.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "secret-scanning/update-repo-custom-pattern.response.alternative6",
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
