package io.github.nabobery.sdkgen.github.generated.codesecurity

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
import io.github.nabobery.sdkgen.github.generated.CodeSecurityConfiguration
import io.github.nabobery.sdkgen.github.generated.CodeSecurityConfigurationForRepository
import io.github.nabobery.sdkgen.github.generated.CodeSecurityConfigurationRepositories
import io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityDefaultConfigurationsItemXb1633561
import io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb
import io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6
import io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682
import io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29
import io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab
import io.github.nabobery.sdkgen.github.generated.ScimError
import io.github.nabobery.sdkgen.github.generated.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.JsonObject

internal object CodeSecurityCodecs {
  internal const val CODESECURITYATTACHCONFIGURATION_REQUEST_CODEC_ID: String =
      "code-security/attach-configuration.request"

  private val codeSecurityAttachConfigurationRequestCodec:
      MediaTypeCodec<InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f> =
      KotlinxSerializationCodec(CODESECURITYATTACHCONFIGURATION_REQUEST_CODEC_ID, InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f.Serializer, SdkJson)

  internal const val CODESECURITYATTACHCONFIGURATION_RESPONSE_CODEC_ID: String =
      "code-security/attach-configuration.response"

  private val codeSecurityAttachConfigurationResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(CODESECURITYATTACHCONFIGURATION_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val codeSecurityAttachConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("code-security/attach-configuration.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val codeSecurityAttachConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(codeSecurityAttachConfigurationResponseCodecAlternative0Codec)

  internal val codeSecurityAttachConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f> =
      MediaTypeCodecRegistry.of(codeSecurityAttachConfigurationRequestCodec)

  internal val codeSecurityAttachConfigurationResponseCodecRegistry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(codeSecurityAttachConfigurationResponseCodec)

  internal const val CODESECURITYATTACHENTERPRISECONFIGURATION_REQUEST_CODEC_ID: String =
      "code-security/attach-enterprise-configuration.request"

  private val codeSecurityAttachEnterpriseConfigurationRequestCodec:
      MediaTypeCodec<InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb> =
      KotlinxSerializationCodec(CODESECURITYATTACHENTERPRISECONFIGURATION_REQUEST_CODEC_ID, InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb.Serializer, SdkJson)

  internal const val CODESECURITYATTACHENTERPRISECONFIGURATION_RESPONSE_CODEC_ID: String =
      "code-security/attach-enterprise-configuration.response"

  private val codeSecurityAttachEnterpriseConfigurationResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(CODESECURITYATTACHENTERPRISECONFIGURATION_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("code-security/attach-enterprise-configuration.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative0Codec)

  private val codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/attach-enterprise-configuration.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative1Codec)

  private val codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/attach-enterprise-configuration.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative2Codec)

  private val codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/attach-enterprise-configuration.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative3Codec)

  internal val codeSecurityAttachEnterpriseConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb>
      = MediaTypeCodecRegistry.of(codeSecurityAttachEnterpriseConfigurationRequestCodec)

  internal val codeSecurityAttachEnterpriseConfigurationResponseCodecRegistry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(codeSecurityAttachEnterpriseConfigurationResponseCodec)

  internal const val CODESECURITYCREATECONFIGURATION_REQUEST_CODEC_ID: String =
      "code-security/create-configuration.request"

  private val codeSecurityCreateConfigurationRequestCodec:
      MediaTypeCodec<InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab> =
      KotlinxSerializationCodec(CODESECURITYCREATECONFIGURATION_REQUEST_CODEC_ID, InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab.Serializer, SdkJson)

  internal const val CODESECURITYCREATECONFIGURATION_RESPONSE_CODEC_ID: String =
      "code-security/create-configuration.response"

  private val codeSecurityCreateConfigurationResponseCodec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec(CODESECURITYCREATECONFIGURATION_RESPONSE_CODEC_ID, CodeSecurityConfiguration.Serializer, SdkJson)

  private val codeSecurityCreateConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec("code-security/create-configuration.response.alternative0", CodeSecurityConfiguration.Serializer, SdkJson)

  internal val codeSecurityCreateConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationResponseCodecAlternative0Codec)

  internal val codeSecurityCreateConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationRequestCodec)

  internal val codeSecurityCreateConfigurationResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationResponseCodec)

  internal const val CODESECURITYCREATECONFIGURATIONFORENTERPRISE_REQUEST_CODEC_ID: String =
      "code-security/create-configuration-for-enterprise.request"

  private val codeSecurityCreateConfigurationForEnterpriseRequestCodec:
      MediaTypeCodec<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23> =
      KotlinxSerializationCodec(CODESECURITYCREATECONFIGURATIONFORENTERPRISE_REQUEST_CODEC_ID, InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23.Serializer, SdkJson)

  internal const val CODESECURITYCREATECONFIGURATIONFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "code-security/create-configuration-for-enterprise.response"

  private val codeSecurityCreateConfigurationForEnterpriseResponseCodec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec(CODESECURITYCREATECONFIGURATIONFORENTERPRISE_RESPONSE_CODEC_ID, CodeSecurityConfiguration.Serializer, SdkJson)

  private val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec("code-security/create-configuration-for-enterprise.response.alternative0", CodeSecurityConfiguration.Serializer, SdkJson)

  internal val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative0Codec)

  private val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/create-configuration-for-enterprise.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative1Codec)

  private val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("code-security/create-configuration-for-enterprise.response.alternative2", ScimError.Serializer, SdkJson)

  internal val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative2Codec)

  private val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/create-configuration-for-enterprise.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative3Codec)

  private val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/create-configuration-for-enterprise.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative4Codec)

  internal val codeSecurityCreateConfigurationForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationForEnterpriseRequestCodec)

  internal val codeSecurityCreateConfigurationForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityCreateConfigurationForEnterpriseResponseCodec)

  private val codeSecurityDeleteConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/delete-configuration.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationResponseCodecAlternative1Codec)

  private val codeSecurityDeleteConfigurationResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("code-security/delete-configuration.response.alternative2", ScimError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationResponseCodecAlternative2Codec)

  private val codeSecurityDeleteConfigurationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/delete-configuration.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationResponseCodecAlternative3Codec)

  private val codeSecurityDeleteConfigurationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/delete-configuration.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationResponseCodecAlternative4Codec)

  private val codeSecurityDeleteConfigurationResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/delete-configuration.response.alternative5", BasicError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationResponseCodecAlternative5Codec)

  internal val codeSecurityDeleteConfigurationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeSecurityDeleteConfigurationResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/delete-configuration-for-enterprise.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative1Codec)

  private val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("code-security/delete-configuration-for-enterprise.response.alternative2", ScimError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative2Codec)

  private val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/delete-configuration-for-enterprise.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative3Codec)

  private val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/delete-configuration-for-enterprise.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative4Codec)

  private val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/delete-configuration-for-enterprise.response.alternative5", BasicError.Serializer, SdkJson)

  internal val codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative5Codec)

  internal val codeSecurityDeleteConfigurationForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val codeSecurityDeleteConfigurationForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val CODESECURITYDETACHCONFIGURATION_REQUEST_CODEC_ID: String =
      "code-security/detach-configuration.request"

  private val codeSecurityDetachConfigurationRequestCodec:
      MediaTypeCodec<InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b> =
      KotlinxSerializationCodec(CODESECURITYDETACHCONFIGURATION_REQUEST_CODEC_ID, InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b.Serializer, SdkJson)

  private val codeSecurityDetachConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/detach-configuration.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityDetachConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDetachConfigurationResponseCodecAlternative1Codec)

  private val codeSecurityDetachConfigurationResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("code-security/detach-configuration.response.alternative2", ScimError.Serializer, SdkJson)

  internal val codeSecurityDetachConfigurationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(codeSecurityDetachConfigurationResponseCodecAlternative2Codec)

  private val codeSecurityDetachConfigurationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/detach-configuration.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityDetachConfigurationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDetachConfigurationResponseCodecAlternative3Codec)

  private val codeSecurityDetachConfigurationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/detach-configuration.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeSecurityDetachConfigurationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDetachConfigurationResponseCodecAlternative4Codec)

  private val codeSecurityDetachConfigurationResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/detach-configuration.response.alternative5", BasicError.Serializer, SdkJson)

  internal val codeSecurityDetachConfigurationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityDetachConfigurationResponseCodecAlternative5Codec)

  internal val codeSecurityDetachConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b> =
      MediaTypeCodecRegistry.of(codeSecurityDetachConfigurationRequestCodec)

  internal val codeSecurityDetachConfigurationResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val CODESECURITYGETCONFIGURATION_RESPONSE_CODEC_ID: String =
      "code-security/get-configuration.response"

  private val codeSecurityGetConfigurationResponseCodec: MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec(CODESECURITYGETCONFIGURATION_RESPONSE_CODEC_ID, CodeSecurityConfiguration.Serializer, SdkJson)

  private val codeSecurityGetConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec("code-security/get-configuration.response.alternative0", CodeSecurityConfiguration.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationResponseCodecAlternative0Codec)

  private val codeSecurityGetConfigurationResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("code-security/get-configuration.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationResponseCodecAlternative2Codec)

  private val codeSecurityGetConfigurationResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("code-security/get-configuration.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationResponseCodecAlternative3Codec)

  internal val codeSecurityGetConfigurationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codeSecurityGetConfigurationResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationResponseCodec)

  private val codeSecurityGetConfigurationForRepositoryResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeSecurityConfigurationForRepository> =
      KotlinxSerializationCodec("code-security/get-configuration-for-repository.response.alternative0", CodeSecurityConfigurationForRepository.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationForRepositoryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeSecurityConfigurationForRepository> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationForRepositoryResponseCodecAlternative0Codec)

  private val codeSecurityGetConfigurationForRepositoryResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-configuration-for-repository.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationForRepositoryResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationForRepositoryResponseCodecAlternative3Codec)

  private val codeSecurityGetConfigurationForRepositoryResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-configuration-for-repository.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationForRepositoryResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationForRepositoryResponseCodecAlternative4Codec)

  internal val codeSecurityGetConfigurationForRepositoryRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val CODESECURITYGETCONFIGURATIONSFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "code-security/get-configurations-for-enterprise.response"

  private val codeSecurityGetConfigurationsForEnterpriseResponseCodec:
      MediaTypeCodec<List<CodeSecurityConfiguration>> =
      KotlinxSerializationCodec(CODESECURITYGETCONFIGURATIONSFORENTERPRISE_RESPONSE_CODEC_ID, ListSerializer(CodeSecurityConfiguration.Serializer), SdkJson)

  private val codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeSecurityConfiguration>> =
      KotlinxSerializationCodec("code-security/get-configurations-for-enterprise.response.alternative0", ListSerializer(CodeSecurityConfiguration.Serializer), SdkJson)

  internal val codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeSecurityConfiguration>> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative0Codec)

  private val codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-configurations-for-enterprise.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative1Codec)

  private val codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-configurations-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative2Codec)

  internal val codeSecurityGetConfigurationsForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val codeSecurityGetConfigurationsForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeSecurityConfiguration>> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationsForEnterpriseResponseCodec)

  internal const val CODESECURITYGETCONFIGURATIONSFORORG_RESPONSE_CODEC_ID: String =
      "code-security/get-configurations-for-org.response"

  private val codeSecurityGetConfigurationsForOrgResponseCodec:
      MediaTypeCodec<List<CodeSecurityConfiguration>> =
      KotlinxSerializationCodec(CODESECURITYGETCONFIGURATIONSFORORG_RESPONSE_CODEC_ID, ListSerializer(CodeSecurityConfiguration.Serializer), SdkJson)

  private val codeSecurityGetConfigurationsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeSecurityConfiguration>> =
      KotlinxSerializationCodec("code-security/get-configurations-for-org.response.alternative0", ListSerializer(CodeSecurityConfiguration.Serializer), SdkJson)

  internal val codeSecurityGetConfigurationsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeSecurityConfiguration>> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationsForOrgResponseCodecAlternative0Codec)

  private val codeSecurityGetConfigurationsForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-configurations-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationsForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationsForOrgResponseCodecAlternative1Codec)

  private val codeSecurityGetConfigurationsForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-configurations-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetConfigurationsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationsForOrgResponseCodecAlternative2Codec)

  internal val codeSecurityGetConfigurationsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val codeSecurityGetConfigurationsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeSecurityConfiguration>> =
      MediaTypeCodecRegistry.of(codeSecurityGetConfigurationsForOrgResponseCodec)

  internal const val CODESECURITYGETDEFAULTCONFIGURATIONS_RESPONSE_CODEC_ID: String =
      "code-security/get-default-configurations.response"

  private val codeSecurityGetDefaultConfigurationsResponseCodec:
      MediaTypeCodec<List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>> =
      KotlinxSerializationCodec(CODESECURITYGETDEFAULTCONFIGURATIONS_RESPONSE_CODEC_ID, ListSerializer(InlineCodeSecurityDefaultConfigurationsItemXb1633561.Serializer), SdkJson)

  private val codeSecurityGetDefaultConfigurationsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>> =
      KotlinxSerializationCodec("code-security/get-default-configurations.response.alternative0", ListSerializer(InlineCodeSecurityDefaultConfigurationsItemXb1633561.Serializer), SdkJson)

  internal val codeSecurityGetDefaultConfigurationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>> =
      MediaTypeCodecRegistry.of(codeSecurityGetDefaultConfigurationsResponseCodecAlternative0Codec)

  private val codeSecurityGetDefaultConfigurationsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-default-configurations.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetDefaultConfigurationsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetDefaultConfigurationsResponseCodecAlternative2Codec)

  private val codeSecurityGetDefaultConfigurationsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-default-configurations.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetDefaultConfigurationsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetDefaultConfigurationsResponseCodecAlternative3Codec)

  internal val codeSecurityGetDefaultConfigurationsRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val codeSecurityGetDefaultConfigurationsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>> =
      MediaTypeCodecRegistry.of(codeSecurityGetDefaultConfigurationsResponseCodec)

  internal const val CODESECURITYGETDEFAULTCONFIGURATIONSFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "code-security/get-default-configurations-for-enterprise.response"

  private val codeSecurityGetDefaultConfigurationsForEnterpriseResponseCodec:
      MediaTypeCodec<List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>> =
      KotlinxSerializationCodec(CODESECURITYGETDEFAULTCONFIGURATIONSFORENTERPRISE_RESPONSE_CODEC_ID, ListSerializer(InlineCodeSecurityDefaultConfigurationsItemXb1633561.Serializer), SdkJson)

  private val codeSecurityGetDefaultConfigurationsForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>> =
      KotlinxSerializationCodec("code-security/get-default-configurations-for-enterprise.response.alternative0", ListSerializer(InlineCodeSecurityDefaultConfigurationsItemXb1633561.Serializer), SdkJson)

  internal val codeSecurityGetDefaultConfigurationsForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>> =
      MediaTypeCodecRegistry.of(codeSecurityGetDefaultConfigurationsForEnterpriseResponseCodecAlternative0Codec)

  internal val codeSecurityGetDefaultConfigurationsForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val codeSecurityGetDefaultConfigurationsForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>> =
      MediaTypeCodecRegistry.of(codeSecurityGetDefaultConfigurationsForEnterpriseResponseCodec)

  internal const val CODESECURITYGETREPOSITORIESFORCONFIGURATION_RESPONSE_CODEC_ID: String =
      "code-security/get-repositories-for-configuration.response"

  private val codeSecurityGetRepositoriesForConfigurationResponseCodec:
      MediaTypeCodec<List<CodeSecurityConfigurationRepositories>> =
      KotlinxSerializationCodec(CODESECURITYGETREPOSITORIESFORCONFIGURATION_RESPONSE_CODEC_ID, ListSerializer(CodeSecurityConfigurationRepositories.Serializer), SdkJson)

  private val codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeSecurityConfigurationRepositories>> =
      KotlinxSerializationCodec("code-security/get-repositories-for-configuration.response.alternative0", ListSerializer(CodeSecurityConfigurationRepositories.Serializer), SdkJson)

  internal val codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeSecurityConfigurationRepositories>> =
      MediaTypeCodecRegistry.of(codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative0Codec)

  private val codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-repositories-for-configuration.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative1Codec)

  private val codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-repositories-for-configuration.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative2Codec)

  internal val codeSecurityGetRepositoriesForConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val codeSecurityGetRepositoriesForConfigurationResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeSecurityConfigurationRepositories>> =
      MediaTypeCodecRegistry.of(codeSecurityGetRepositoriesForConfigurationResponseCodec)

  internal const val CODESECURITYGETREPOSITORIESFORENTERPRISECONFIGURATION_RESPONSE_CODEC_ID: String
      = "code-security/get-repositories-for-enterprise-configuration.response"

  private val codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodec:
      MediaTypeCodec<List<CodeSecurityConfigurationRepositories>> =
      KotlinxSerializationCodec(CODESECURITYGETREPOSITORIESFORENTERPRISECONFIGURATION_RESPONSE_CODEC_ID, ListSerializer(CodeSecurityConfigurationRepositories.Serializer), SdkJson)

  private val codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeSecurityConfigurationRepositories>> =
      KotlinxSerializationCodec("code-security/get-repositories-for-enterprise-configuration.response.alternative0", ListSerializer(CodeSecurityConfigurationRepositories.Serializer), SdkJson)

  internal val codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeSecurityConfigurationRepositories>> =
      MediaTypeCodecRegistry.of(codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative0Codec)

  private val codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-repositories-for-enterprise-configuration.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative1Codec)

  private val codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-repositories-for-enterprise-configuration.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative2Codec)

  internal val codeSecurityGetRepositoriesForEnterpriseConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeSecurityConfigurationRepositories>> =
      MediaTypeCodecRegistry.of(codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodec)

  internal const val CODESECURITYGETSINGLECONFIGURATIONFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "code-security/get-single-configuration-for-enterprise.response"

  private val codeSecurityGetSingleConfigurationForEnterpriseResponseCodec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec(CODESECURITYGETSINGLECONFIGURATIONFORENTERPRISE_RESPONSE_CODEC_ID, CodeSecurityConfiguration.Serializer, SdkJson)

  private val codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec("code-security/get-single-configuration-for-enterprise.response.alternative0", CodeSecurityConfiguration.Serializer, SdkJson)

  internal val codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative0Codec)

  private val codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-single-configuration-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative2Codec)

  private val codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/get-single-configuration-for-enterprise.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative3Codec)

  internal val codeSecurityGetSingleConfigurationForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val codeSecurityGetSingleConfigurationForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityGetSingleConfigurationForEnterpriseResponseCodec)

  internal const val CODESECURITYSETCONFIGURATIONASDEFAULT_REQUEST_CODEC_ID: String =
      "code-security/set-configuration-as-default.request"

  private val codeSecuritySetConfigurationAsDefaultRequestCodec:
      MediaTypeCodec<InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704> =
      KotlinxSerializationCodec(CODESECURITYSETCONFIGURATIONASDEFAULT_REQUEST_CODEC_ID, InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704.Serializer, SdkJson)

  internal const val CODESECURITYSETCONFIGURATIONASDEFAULT_RESPONSE_CODEC_ID: String =
      "code-security/set-configuration-as-default.response"

  private val codeSecuritySetConfigurationAsDefaultResponseCodec:
      MediaTypeCodec<InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac> =
      KotlinxSerializationCodec(CODESECURITYSETCONFIGURATIONASDEFAULT_RESPONSE_CODEC_ID, InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac.Serializer, SdkJson)

  private val codeSecuritySetConfigurationAsDefaultResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac> =
      KotlinxSerializationCodec("code-security/set-configuration-as-default.response.alternative0", InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac.Serializer, SdkJson)

  internal val codeSecuritySetConfigurationAsDefaultResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac>
      =
      MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultResponseCodecAlternative0Codec)

  private val codeSecuritySetConfigurationAsDefaultResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/set-configuration-as-default.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecuritySetConfigurationAsDefaultResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultResponseCodecAlternative1Codec)

  private val codeSecuritySetConfigurationAsDefaultResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/set-configuration-as-default.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecuritySetConfigurationAsDefaultResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultResponseCodecAlternative2Codec)

  internal val codeSecuritySetConfigurationAsDefaultRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704> =
      MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultRequestCodec)

  internal val codeSecuritySetConfigurationAsDefaultResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac>
      = MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultResponseCodec)

  internal const val CODESECURITYSETCONFIGURATIONASDEFAULTFORENTERPRISE_REQUEST_CODEC_ID: String =
      "code-security/set-configuration-as-default-for-enterprise.request"

  private val codeSecuritySetConfigurationAsDefaultForEnterpriseRequestCodec:
      MediaTypeCodec<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6> =
      KotlinxSerializationCodec(CODESECURITYSETCONFIGURATIONASDEFAULTFORENTERPRISE_REQUEST_CODEC_ID, InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6.Serializer, SdkJson)

  internal const val CODESECURITYSETCONFIGURATIONASDEFAULTFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "code-security/set-configuration-as-default-for-enterprise.response"

  private val codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodec:
      MediaTypeCodec<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682>
      =
      KotlinxSerializationCodec(CODESECURITYSETCONFIGURATIONASDEFAULTFORENTERPRISE_RESPONSE_CODEC_ID, InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682.Serializer, SdkJson)

  private val codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682>
      =
      KotlinxSerializationCodec("code-security/set-configuration-as-default-for-enterprise.response.alternative0", InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682.Serializer, SdkJson)

  internal val codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682>
      =
      MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative0Codec)

  private val codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/set-configuration-as-default-for-enterprise.response.alternative1", BasicError.Serializer, SdkJson)

  internal val codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative1Codec)

  private val codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/set-configuration-as-default-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative2Codec)

  internal val codeSecuritySetConfigurationAsDefaultForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6>
      = MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultForEnterpriseRequestCodec)

  internal val codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682>
      = MediaTypeCodecRegistry.of(codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodec)

  internal const val CODESECURITYUPDATECONFIGURATION_REQUEST_CODEC_ID: String =
      "code-security/update-configuration.request"

  private val codeSecurityUpdateConfigurationRequestCodec:
      MediaTypeCodec<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e> =
      KotlinxSerializationCodec(CODESECURITYUPDATECONFIGURATION_REQUEST_CODEC_ID, InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e.Serializer, SdkJson)

  private val codeSecurityUpdateConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec("code-security/update-configuration.response.alternative0", CodeSecurityConfiguration.Serializer, SdkJson)

  internal val codeSecurityUpdateConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityUpdateConfigurationResponseCodecAlternative0Codec)

  internal val codeSecurityUpdateConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e> =
      MediaTypeCodecRegistry.of(codeSecurityUpdateConfigurationRequestCodec)

  internal const val CODESECURITYUPDATEENTERPRISECONFIGURATION_REQUEST_CODEC_ID: String =
      "code-security/update-enterprise-configuration.request"

  private val codeSecurityUpdateEnterpriseConfigurationRequestCodec:
      MediaTypeCodec<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29> =
      KotlinxSerializationCodec(CODESECURITYUPDATEENTERPRISECONFIGURATION_REQUEST_CODEC_ID, InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29.Serializer, SdkJson)

  internal const val CODESECURITYUPDATEENTERPRISECONFIGURATION_RESPONSE_CODEC_ID: String =
      "code-security/update-enterprise-configuration.response"

  private val codeSecurityUpdateEnterpriseConfigurationResponseCodec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec(CODESECURITYUPDATEENTERPRISECONFIGURATION_RESPONSE_CODEC_ID, CodeSecurityConfiguration.Serializer, SdkJson)

  private val codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeSecurityConfiguration> =
      KotlinxSerializationCodec("code-security/update-enterprise-configuration.response.alternative0", CodeSecurityConfiguration.Serializer, SdkJson)

  internal val codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative0Codec)

  private val codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/update-enterprise-configuration.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative2Codec)

  private val codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/update-enterprise-configuration.response.alternative3", BasicError.Serializer, SdkJson)

  internal val codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative3Codec)

  private val codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("code-security/update-enterprise-configuration.response.alternative4", BasicError.Serializer, SdkJson)

  internal val codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative4Codec)

  internal val codeSecurityUpdateEnterpriseConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29> =
      MediaTypeCodecRegistry.of(codeSecurityUpdateEnterpriseConfigurationRequestCodec)

  internal val codeSecurityUpdateEnterpriseConfigurationResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeSecurityConfiguration> =
      MediaTypeCodecRegistry.of(codeSecurityUpdateEnterpriseConfigurationResponseCodec)
}

/**
 * Client for the 'code-security' group of GitHub v3 REST API.
 */
public class CodeSecurityClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CodeSecurityClient.authentication)

  /**
   * Attach a code security configuration to a set of repositories. If the repositories specified are already attached
   * to a configuration, they will be re-attached to the provided configuration.
   *
   * If insufficient GHAS licenses are available to attach the configuration to a repository, only free features will be
   * enabled.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityAttachConfiguration(
    request: InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f,
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.execute<InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f, JsonObject>(SdkExecutionRequest(codeSecurityAttachConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYATTACHCONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(CodeSecurityCodecs.CODESECURITYATTACHCONFIGURATION_RESPONSE_CODEC_ID), CodeSecurityCodecs.codeSecurityAttachConfigurationRequestCodecRegistry, CodeSecurityCodecs.codeSecurityAttachConfigurationResponseCodecRegistry, options)

  /**
   * Attach a code security configuration to a set of repositories. If the repositories specified are already attached
   * to a configuration, they will be re-attached to the provided configuration.
   *
   * If insufficient GHAS licenses are available to attach the configuration to a repository, only free features will be
   * enabled.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecurityAttachConfigurationWithResponse(
    request: InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f,
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityAttachConfigurationResponse> = executor.executeWithResponse<InlineOrgsCodeSecurityConfigurationsAttachPostRequestJsonXe87dfb9f, CodeSecurityAttachConfigurationResponse>(SdkExecutionRequest(codeSecurityAttachConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYATTACHCONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodeSecurityCodecs.codeSecurityAttachConfigurationRequestCodecRegistry, CodeSecurityAttachConfigurationResponseDecoder, options)

  /**
   * Attaches an enterprise code security configuration to repositories. If the repositories specified are already
   * attached to a configuration, they will be re-attached to the provided configuration.
   *
   * If insufficient GHAS licenses are available to attach the configuration to a repository, only free features will be
   * enabled.
   *
   * The authenticated user must be an administrator for the enterprise to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityAttachEnterpriseConfigurationApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodeSecurityAttachEnterpriseConfigurationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityAttachEnterpriseConfiguration(
    request: InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb,
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.executeWithTypedErrors<InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb, CodeSecurityAttachEnterpriseConfigurationResponse, JsonObject>(
    request = SdkExecutionRequest(codeSecurityAttachEnterpriseConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYATTACHENTERPRISECONFIGURATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityAttachEnterpriseConfigurationRequestCodecRegistry,
    responseDecoder = CodeSecurityAttachEnterpriseConfigurationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityAttachEnterpriseConfigurationResponse.SuccessJson -> response.json
        is CodeSecurityAttachEnterpriseConfigurationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityAttachEnterpriseConfigurationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityAttachEnterpriseConfigurationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityAttachEnterpriseConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityAttachEnterpriseConfigurationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityAttachEnterpriseConfigurationResponse.Http403Json -> CodeSecurityAttachEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityAttachEnterpriseConfigurationResponse.Http404Json -> CodeSecurityAttachEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityAttachEnterpriseConfigurationResponse.Http409Json -> CodeSecurityAttachEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityAttachEnterpriseConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Attaches an enterprise code security configuration to repositories. If the repositories specified are already
   * attached to a configuration, they will be re-attached to the provided configuration.
   *
   * If insufficient GHAS licenses are available to attach the configuration to a repository, only free features will be
   * enabled.
   *
   * The authenticated user must be an administrator for the enterprise to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun codeSecurityAttachEnterpriseConfigurationWithResponse(
    request: InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb,
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityAttachEnterpriseConfigurationResponse> = executor.executeWithResponse<InlineEnterprisesCodeSecurityConfigurationsAttachPostRequestJsonXd6352beb, CodeSecurityAttachEnterpriseConfigurationResponse>(SdkExecutionRequest(codeSecurityAttachEnterpriseConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYATTACHENTERPRISECONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CodeSecurityCodecs.codeSecurityAttachEnterpriseConfigurationRequestCodecRegistry, CodeSecurityAttachEnterpriseConfigurationResponseDecoder, options)

  /**
   * Creates a code security configuration in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityCreateConfiguration(
    request: InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab,
    org: String,
    options: CallOptions = CallOptions(),
  ): CodeSecurityConfiguration = executor.execute<InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab, CodeSecurityConfiguration>(SdkExecutionRequest(codeSecurityCreateConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYCREATECONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(CodeSecurityCodecs.CODESECURITYCREATECONFIGURATION_RESPONSE_CODEC_ID), CodeSecurityCodecs.codeSecurityCreateConfigurationRequestCodecRegistry, CodeSecurityCodecs.codeSecurityCreateConfigurationResponseCodecRegistry, options)

  /**
   * Creates a code security configuration in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecurityCreateConfigurationWithResponse(
    request: InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityCreateConfigurationResponse> = executor.executeWithResponse<InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab, CodeSecurityCreateConfigurationResponse>(SdkExecutionRequest(codeSecurityCreateConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYCREATECONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodeSecurityCodecs.codeSecurityCreateConfigurationRequestCodecRegistry, CodeSecurityCreateConfigurationResponseDecoder, options)

  /**
   * Creates a code security configuration in an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityCreateConfigurationForEnterpriseApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodeSecurityCreateConfigurationForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityCreateConfigurationForEnterprise(
    request: InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): CodeSecurityConfiguration = executor.executeWithTypedErrors<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23, CodeSecurityCreateConfigurationForEnterpriseResponse, CodeSecurityConfiguration>(
    request = SdkExecutionRequest(codeSecurityCreateConfigurationForEnterpriseMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYCREATECONFIGURATIONFORENTERPRISE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityCreateConfigurationForEnterpriseRequestCodecRegistry,
    responseDecoder = CodeSecurityCreateConfigurationForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityCreateConfigurationForEnterpriseResponse.SuccessJson -> response.json
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityCreateConfigurationForEnterpriseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Http400Json -> CodeSecurityCreateConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Http400ScimJson -> CodeSecurityCreateConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Http403Json -> CodeSecurityCreateConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Http404Json -> CodeSecurityCreateConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityCreateConfigurationForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a code security configuration in an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun codeSecurityCreateConfigurationForEnterpriseWithResponse(
    request: InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityCreateConfigurationForEnterpriseResponse> = executor.executeWithResponse<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23, CodeSecurityCreateConfigurationForEnterpriseResponse>(SdkExecutionRequest(codeSecurityCreateConfigurationForEnterpriseMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYCREATECONFIGURATIONFORENTERPRISE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CodeSecurityCodecs.codeSecurityCreateConfigurationForEnterpriseRequestCodecRegistry, CodeSecurityCreateConfigurationForEnterpriseResponseDecoder, options)

  /**
   * Deletes the desired code security configuration from an organization.
   * Repositories attached to the configuration will retain their settings but will no longer be associated with
   * the configuration.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws CodeSecurityDeleteConfigurationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeSecurityDeleteConfigurationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityDeleteConfiguration(
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CodeSecurityDeleteConfigurationResponse, Unit>(
    request = SdkExecutionRequest(codeSecurityDeleteConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityDeleteConfigurationRequestCodecRegistry,
    responseDecoder = CodeSecurityDeleteConfigurationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityDeleteConfigurationResponse.SuccessNoContent -> response.unit
        is CodeSecurityDeleteConfigurationResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityDeleteConfigurationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityDeleteConfigurationResponse.Http400Json -> CodeSecurityDeleteConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationResponse.Http400ScimJson -> CodeSecurityDeleteConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationResponse.Http403Json -> CodeSecurityDeleteConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationResponse.Http404Json -> CodeSecurityDeleteConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationResponse.Http409Json -> CodeSecurityDeleteConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes the desired code security configuration from an organization.
   * Repositories attached to the configuration will retain their settings but will no longer be associated with
   * the configuration.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecurityDeleteConfigurationWithResponse(
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityDeleteConfigurationResponse> = executor.executeWithResponse<Unit, CodeSecurityDeleteConfigurationResponse>(SdkExecutionRequest(codeSecurityDeleteConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodeSecurityCodecs.codeSecurityDeleteConfigurationRequestCodecRegistry, CodeSecurityDeleteConfigurationResponseDecoder, options)

  /**
   * Deletes a code security configuration from an enterprise.
   * Repositories attached to the configuration will retain their settings but will no longer be associated with
   * the configuration.
   *
   * The authenticated user must be an administrator for the enterprise to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return No response body.
   * @throws CodeSecurityDeleteConfigurationForEnterpriseApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodeSecurityDeleteConfigurationForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityDeleteConfigurationForEnterprise(
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CodeSecurityDeleteConfigurationForEnterpriseResponse, Unit>(
    request = SdkExecutionRequest(codeSecurityDeleteConfigurationForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityDeleteConfigurationForEnterpriseRequestCodecRegistry,
    responseDecoder = CodeSecurityDeleteConfigurationForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.SuccessNoContent -> response.unit
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http400Json -> CodeSecurityDeleteConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http400ScimJson -> CodeSecurityDeleteConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http403Json -> CodeSecurityDeleteConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http404Json -> CodeSecurityDeleteConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Http409Json -> CodeSecurityDeleteConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityDeleteConfigurationForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a code security configuration from an enterprise.
   * Repositories attached to the configuration will retain their settings but will no longer be associated with
   * the configuration.
   *
   * The authenticated user must be an administrator for the enterprise to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun codeSecurityDeleteConfigurationForEnterpriseWithResponse(
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityDeleteConfigurationForEnterpriseResponse> = executor.executeWithResponse<Unit, CodeSecurityDeleteConfigurationForEnterpriseResponse>(SdkExecutionRequest(codeSecurityDeleteConfigurationForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CodeSecurityCodecs.codeSecurityDeleteConfigurationForEnterpriseRequestCodecRegistry, CodeSecurityDeleteConfigurationForEnterpriseResponseDecoder, options)

  /**
   * Detach code security configuration(s) from a set of repositories.
   * Repositories will retain their settings but will no longer be associated with the configuration.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws CodeSecurityDetachConfigurationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeSecurityDetachConfigurationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityDetachConfiguration(
    request: InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b, CodeSecurityDetachConfigurationResponse, Unit>(
    request = SdkExecutionRequest(codeSecurityDetachConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYDETACHCONFIGURATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityDetachConfigurationRequestCodecRegistry,
    responseDecoder = CodeSecurityDetachConfigurationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityDetachConfigurationResponse.SuccessNoContent -> response.unit
        is CodeSecurityDetachConfigurationResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDetachConfigurationResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDetachConfigurationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDetachConfigurationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDetachConfigurationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityDetachConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityDetachConfigurationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityDetachConfigurationResponse.Http400Json -> CodeSecurityDetachConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDetachConfigurationResponse.Http400ScimJson -> CodeSecurityDetachConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDetachConfigurationResponse.Http403Json -> CodeSecurityDetachConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDetachConfigurationResponse.Http404Json -> CodeSecurityDetachConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDetachConfigurationResponse.Http409Json -> CodeSecurityDetachConfigurationApiException(response, statusCode, headers)
        is CodeSecurityDetachConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Detach code security configuration(s) from a set of repositories.
   * Repositories will retain their settings but will no longer be associated with the configuration.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecurityDetachConfigurationWithResponse(
    request: InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityDetachConfigurationResponse> = executor.executeWithResponse<InlineOrgsCodeSecurityConfigurationsDetachDeleteRequestJsonXf6ee6f7b, CodeSecurityDetachConfigurationResponse>(SdkExecutionRequest(codeSecurityDetachConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYDETACHCONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodeSecurityCodecs.codeSecurityDetachConfigurationRequestCodecRegistry, CodeSecurityDetachConfigurationResponseDecoder, options)

  /**
   * Gets a code security configuration available in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityGetConfigurationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodeSecurityGetConfigurationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityGetConfiguration(
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): CodeSecurityConfiguration = executor.executeWithTypedErrors<Unit, CodeSecurityGetConfigurationResponse, CodeSecurityConfiguration>(
    request = SdkExecutionRequest(codeSecurityGetConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityGetConfigurationRequestCodecRegistry,
    responseDecoder = CodeSecurityGetConfigurationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityGetConfigurationResponse.SuccessJson -> response.json
        is CodeSecurityGetConfigurationResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetConfigurationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetConfigurationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityGetConfigurationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityGetConfigurationResponse.Http304NoContent -> CodeSecurityGetConfigurationApiException(response, statusCode, headers)
        is CodeSecurityGetConfigurationResponse.Http403Json -> CodeSecurityGetConfigurationApiException(response, statusCode, headers)
        is CodeSecurityGetConfigurationResponse.Http404Json -> CodeSecurityGetConfigurationApiException(response, statusCode, headers)
        is CodeSecurityGetConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a code security configuration available in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetConfigurationWithResponse(
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityGetConfigurationResponse> = executor.executeWithResponse<Unit, CodeSecurityGetConfigurationResponse>(SdkExecutionRequest(codeSecurityGetConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodeSecurityCodecs.codeSecurityGetConfigurationRequestCodecRegistry, CodeSecurityGetConfigurationResponseDecoder, options)

  /**
   * Get the code security configuration that manages a repository's code security settings.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetConfigurationForRepositoryWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityGetConfigurationForRepositoryResponse> = executor.executeWithResponse<Unit, CodeSecurityGetConfigurationForRepositoryResponse>(SdkExecutionRequest(codeSecurityGetConfigurationForRepositoryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodeSecurityCodecs.codeSecurityGetConfigurationForRepositoryRequestCodecRegistry, CodeSecurityGetConfigurationForRepositoryResponseDecoder, options)

  /**
   * Lists all code security configurations available in an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:enterprise` scope to use this endpoint.
   *
   * @param enterprise The slug version of the enterprise name.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityGetConfigurationsForEnterpriseApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodeSecurityGetConfigurationsForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityGetConfigurationsForEnterprise(
    enterprise: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeSecurityConfiguration> = executor.executeWithTypedErrors<Unit, CodeSecurityGetConfigurationsForEnterpriseResponse, List<CodeSecurityConfiguration>>(
    request = SdkExecutionRequest(codeSecurityGetConfigurationsForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityGetConfigurationsForEnterpriseRequestCodecRegistry,
    responseDecoder = CodeSecurityGetConfigurationsForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityGetConfigurationsForEnterpriseResponse.SuccessJson -> response.json
        is CodeSecurityGetConfigurationsForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetConfigurationsForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetConfigurationsForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityGetConfigurationsForEnterpriseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityGetConfigurationsForEnterpriseResponse.Http403Json -> CodeSecurityGetConfigurationsForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityGetConfigurationsForEnterpriseResponse.Http404Json -> CodeSecurityGetConfigurationsForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityGetConfigurationsForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all code security configurations available in an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param enterprise The slug version of the enterprise name.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetConfigurationsForEnterpriseWithResponse(
    enterprise: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityGetConfigurationsForEnterpriseResponse> = executor.executeWithResponse<Unit, CodeSecurityGetConfigurationsForEnterpriseResponse>(SdkExecutionRequest(codeSecurityGetConfigurationsForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeSecurityCodecs.codeSecurityGetConfigurationsForEnterpriseRequestCodecRegistry, CodeSecurityGetConfigurationsForEnterpriseResponseDecoder, options)

  /**
   * Lists all code security configurations available in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param targetType The target type of the code security configuration
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityGetConfigurationsForOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodeSecurityGetConfigurationsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityGetConfigurationsForOrg(
    org: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    targetType: InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeSecurityConfiguration> = executor.executeWithTypedErrors<Unit, CodeSecurityGetConfigurationsForOrgResponse, List<CodeSecurityConfiguration>>(
    request = SdkExecutionRequest(codeSecurityGetConfigurationsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "target_type", values = targetType?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityGetConfigurationsForOrgRequestCodecRegistry,
    responseDecoder = CodeSecurityGetConfigurationsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityGetConfigurationsForOrgResponse.SuccessJson -> response.json
        is CodeSecurityGetConfigurationsForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetConfigurationsForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetConfigurationsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityGetConfigurationsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityGetConfigurationsForOrgResponse.Http403Json -> CodeSecurityGetConfigurationsForOrgApiException(response, statusCode, headers)
        is CodeSecurityGetConfigurationsForOrgResponse.Http404Json -> CodeSecurityGetConfigurationsForOrgApiException(response, statusCode, headers)
        is CodeSecurityGetConfigurationsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all code security configurations available in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param targetType The target type of the code security configuration
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetConfigurationsForOrgWithResponse(
    org: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    targetType: InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityGetConfigurationsForOrgResponse> = executor.executeWithResponse<Unit, CodeSecurityGetConfigurationsForOrgResponse>(SdkExecutionRequest(codeSecurityGetConfigurationsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "target_type", values = targetType?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeSecurityCodecs.codeSecurityGetConfigurationsForOrgRequestCodecRegistry, CodeSecurityGetConfigurationsForOrgResponseDecoder, options)

  /**
   * Lists the default code security configurations for an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityGetDefaultConfigurationsApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodeSecurityGetDefaultConfigurationsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityGetDefaultConfigurations(org: String, options: CallOptions = CallOptions()): List<InlineCodeSecurityDefaultConfigurationsItemXb1633561> = executor.executeWithTypedErrors<Unit, CodeSecurityGetDefaultConfigurationsResponse, List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>>(
    request = SdkExecutionRequest(codeSecurityGetDefaultConfigurationsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsRequestCodecRegistry,
    responseDecoder = CodeSecurityGetDefaultConfigurationsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityGetDefaultConfigurationsResponse.SuccessJson -> response.json
        is CodeSecurityGetDefaultConfigurationsResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetDefaultConfigurationsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetDefaultConfigurationsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetDefaultConfigurationsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityGetDefaultConfigurationsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityGetDefaultConfigurationsResponse.Http304NoContent -> CodeSecurityGetDefaultConfigurationsApiException(response, statusCode, headers)
        is CodeSecurityGetDefaultConfigurationsResponse.Http403Json -> CodeSecurityGetDefaultConfigurationsApiException(response, statusCode, headers)
        is CodeSecurityGetDefaultConfigurationsResponse.Http404Json -> CodeSecurityGetDefaultConfigurationsApiException(response, statusCode, headers)
        is CodeSecurityGetDefaultConfigurationsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the default code security configurations for an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetDefaultConfigurationsWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<CodeSecurityGetDefaultConfigurationsResponse> = executor.executeWithResponse<Unit, CodeSecurityGetDefaultConfigurationsResponse>(SdkExecutionRequest(codeSecurityGetDefaultConfigurationsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsRequestCodecRegistry, CodeSecurityGetDefaultConfigurationsResponseDecoder, options)

  /**
   * Lists the default code security configurations for an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:enterprise` scope to use this endpoint.
   *
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityGetDefaultConfigurationsForEnterprise(enterprise: String, options: CallOptions = CallOptions()): List<InlineCodeSecurityDefaultConfigurationsItemXb1633561> = executor.execute<Unit, List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>>(SdkExecutionRequest(codeSecurityGetDefaultConfigurationsForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), listOf(CodeSecurityCodecs.CODESECURITYGETDEFAULTCONFIGURATIONSFORENTERPRISE_RESPONSE_CODEC_ID), CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsForEnterpriseRequestCodecRegistry, CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsForEnterpriseResponseCodecRegistry, options)

  /**
   * Lists the default code security configurations for an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetDefaultConfigurationsForEnterpriseWithResponse(enterprise: String, options: CallOptions = CallOptions()): SdkResponseResult<CodeSecurityGetDefaultConfigurationsForEnterpriseResponse> = executor.executeWithResponse<Unit, CodeSecurityGetDefaultConfigurationsForEnterpriseResponse>(SdkExecutionRequest(codeSecurityGetDefaultConfigurationsForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsForEnterpriseRequestCodecRegistry, CodeSecurityGetDefaultConfigurationsForEnterpriseResponseDecoder, options)

  /**
   * Lists the repositories associated with a code security configuration in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status A comma-separated list of statuses. If specified, only repositories with these attachment statuses
   * will be returned.
   *
   * Can be: `all`, `attached`, `attaching`, `detached`, `removed`, `enforced`, `failed`, `updating`,
   * `removed_by_enterprise`
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityGetRepositoriesForConfigurationApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodeSecurityGetRepositoriesForConfigurationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityGetRepositoriesForConfiguration(
    configurationId: Int,
    org: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    status: String? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeSecurityConfigurationRepositories> = executor.executeWithTypedErrors<Unit, CodeSecurityGetRepositoriesForConfigurationResponse, List<CodeSecurityConfigurationRepositories>>(
    request = SdkExecutionRequest(codeSecurityGetRepositoriesForConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityGetRepositoriesForConfigurationRequestCodecRegistry,
    responseDecoder = CodeSecurityGetRepositoriesForConfigurationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityGetRepositoriesForConfigurationResponse.SuccessJson -> response.json
        is CodeSecurityGetRepositoriesForConfigurationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetRepositoriesForConfigurationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetRepositoriesForConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityGetRepositoriesForConfigurationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityGetRepositoriesForConfigurationResponse.Http403Json -> CodeSecurityGetRepositoriesForConfigurationApiException(response, statusCode, headers)
        is CodeSecurityGetRepositoriesForConfigurationResponse.Http404Json -> CodeSecurityGetRepositoriesForConfigurationApiException(response, statusCode, headers)
        is CodeSecurityGetRepositoriesForConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the repositories associated with a code security configuration in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status A comma-separated list of statuses. If specified, only repositories with these attachment statuses
   * will be returned.
   *
   * Can be: `all`, `attached`, `attaching`, `detached`, `removed`, `enforced`, `failed`, `updating`,
   * `removed_by_enterprise`
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetRepositoriesForConfigurationWithResponse(
    configurationId: Int,
    org: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    status: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityGetRepositoriesForConfigurationResponse> = executor.executeWithResponse<Unit, CodeSecurityGetRepositoriesForConfigurationResponse>(SdkExecutionRequest(codeSecurityGetRepositoriesForConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeSecurityCodecs.codeSecurityGetRepositoriesForConfigurationRequestCodecRegistry, CodeSecurityGetRepositoriesForConfigurationResponseDecoder, options)

  /**
   * Lists the repositories associated with an enterprise code security configuration in an organization.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:enterprise` scope to use this endpoint.
   *
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status A comma-separated list of statuses. If specified, only repositories with these attachment statuses
   * will be returned.
   *
   * Can be: `all`, `attached`, `attaching`, `removed`, `enforced`, `failed`, `updating`, `removed_by_enterprise`
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityGetRepositoriesForEnterpriseConfigurationApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CodeSecurityGetRepositoriesForEnterpriseConfigurationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityGetRepositoriesForEnterpriseConfiguration(
    configurationId: Int,
    enterprise: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    status: String? = null,
    options: CallOptions = CallOptions(),
  ): List<CodeSecurityConfigurationRepositories> = executor.executeWithTypedErrors<Unit, CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse, List<CodeSecurityConfigurationRepositories>>(
    request = SdkExecutionRequest(codeSecurityGetRepositoriesForEnterpriseConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityGetRepositoriesForEnterpriseConfigurationRequestCodecRegistry,
    responseDecoder = CodeSecurityGetRepositoriesForEnterpriseConfigurationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.SuccessJson -> response.json
        is CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Http403Json -> CodeSecurityGetRepositoriesForEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Http404Json -> CodeSecurityGetRepositoriesForEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the repositories associated with an enterprise code security configuration in an organization.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status A comma-separated list of statuses. If specified, only repositories with these attachment statuses
   * will be returned.
   *
   * Can be: `all`, `attached`, `attaching`, `removed`, `enforced`, `failed`, `updating`, `removed_by_enterprise`
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetRepositoriesForEnterpriseConfigurationWithResponse(
    configurationId: Int,
    enterprise: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    status: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse> = executor.executeWithResponse<Unit, CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse>(SdkExecutionRequest(codeSecurityGetRepositoriesForEnterpriseConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), CodeSecurityCodecs.codeSecurityGetRepositoriesForEnterpriseConfigurationRequestCodecRegistry, CodeSecurityGetRepositoriesForEnterpriseConfigurationResponseDecoder, options)

  /**
   * Gets a code security configuration available in an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:enterprise` scope to use this endpoint.
   *
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityGetSingleConfigurationForEnterpriseApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodeSecurityGetSingleConfigurationForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityGetSingleConfigurationForEnterprise(
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): CodeSecurityConfiguration = executor.executeWithTypedErrors<Unit, CodeSecurityGetSingleConfigurationForEnterpriseResponse, CodeSecurityConfiguration>(
    request = SdkExecutionRequest(codeSecurityGetSingleConfigurationForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityGetSingleConfigurationForEnterpriseRequestCodecRegistry,
    responseDecoder = CodeSecurityGetSingleConfigurationForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.SuccessJson -> response.json
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http304NoContent -> CodeSecurityGetSingleConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http403Json -> CodeSecurityGetSingleConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http404Json -> CodeSecurityGetSingleConfigurationForEnterpriseApiException(response, statusCode, headers)
        is CodeSecurityGetSingleConfigurationForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a code security configuration available in an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun codeSecurityGetSingleConfigurationForEnterpriseWithResponse(
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityGetSingleConfigurationForEnterpriseResponse> = executor.executeWithResponse<Unit, CodeSecurityGetSingleConfigurationForEnterpriseResponse>(SdkExecutionRequest(codeSecurityGetSingleConfigurationForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CodeSecurityCodecs.codeSecurityGetSingleConfigurationForEnterpriseRequestCodecRegistry, CodeSecurityGetSingleConfigurationForEnterpriseResponseDecoder, options)

  /**
   * Sets a code security configuration as a default to be applied to new repositories in your organization.
   *
   * This configuration will be applied to the matching repository type (all, none, public, private and internal) by
   * default when they are created.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecuritySetConfigurationAsDefaultApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodeSecuritySetConfigurationAsDefaultError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecuritySetConfigurationAsDefault(
    request: InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704,
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac = executor.executeWithTypedErrors<InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704, CodeSecuritySetConfigurationAsDefaultResponse, InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac>(
    request = SdkExecutionRequest(codeSecuritySetConfigurationAsDefaultMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYSETCONFIGURATIONASDEFAULT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultRequestCodecRegistry,
    responseDecoder = CodeSecuritySetConfigurationAsDefaultResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecuritySetConfigurationAsDefaultResponse.SuccessJson -> response.json
        is CodeSecuritySetConfigurationAsDefaultResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecuritySetConfigurationAsDefaultResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecuritySetConfigurationAsDefaultResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecuritySetConfigurationAsDefaultResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecuritySetConfigurationAsDefaultResponse.Http403Json -> CodeSecuritySetConfigurationAsDefaultApiException(response, statusCode, headers)
        is CodeSecuritySetConfigurationAsDefaultResponse.Http404Json -> CodeSecuritySetConfigurationAsDefaultApiException(response, statusCode, headers)
        is CodeSecuritySetConfigurationAsDefaultResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sets a code security configuration as a default to be applied to new repositories in your organization.
   *
   * This configuration will be applied to the matching repository type (all, none, public, private and internal) by
   * default when they are created.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecuritySetConfigurationAsDefaultWithResponse(
    request: InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704,
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecuritySetConfigurationAsDefaultResponse> = executor.executeWithResponse<InlineOrgsCodeSecurityConfigurationsDefaultsPutRequestJsonXb4c09704, CodeSecuritySetConfigurationAsDefaultResponse>(SdkExecutionRequest(codeSecuritySetConfigurationAsDefaultMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYSETCONFIGURATIONASDEFAULT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultRequestCodecRegistry, CodeSecuritySetConfigurationAsDefaultResponseDecoder, options)

  /**
   * Sets a code security configuration as a default to be applied to new repositories in your enterprise.
   *
   * This configuration will be applied by default to the matching repository type when created, but only for
   * organizations within the enterprise that do not already have a default code security configuration set.
   *
   * The authenticated user must be an administrator for the enterprise to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecuritySetConfigurationAsDefaultForEnterpriseApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CodeSecuritySetConfigurationAsDefaultForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecuritySetConfigurationAsDefaultForEnterprise(
    request: InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6,
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682 = executor.executeWithTypedErrors<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6, CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse, InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682>(
    request = SdkExecutionRequest(codeSecuritySetConfigurationAsDefaultForEnterpriseMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYSETCONFIGURATIONASDEFAULTFORENTERPRISE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultForEnterpriseRequestCodecRegistry,
    responseDecoder = CodeSecuritySetConfigurationAsDefaultForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.SuccessJson -> response.json
        is CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Http403Json -> CodeSecuritySetConfigurationAsDefaultForEnterpriseApiException(response, statusCode, headers)
        is CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Http404Json -> CodeSecuritySetConfigurationAsDefaultForEnterpriseApiException(response, statusCode, headers)
        is CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sets a code security configuration as a default to be applied to new repositories in your enterprise.
   *
   * This configuration will be applied by default to the matching repository type when created, but only for
   * organizations within the enterprise that do not already have a default code security configuration set.
   *
   * The authenticated user must be an administrator for the enterprise to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun codeSecuritySetConfigurationAsDefaultForEnterpriseWithResponse(
    request: InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6,
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse> = executor.executeWithResponse<InlineEnterprisesCodeSecurityConfigurationsDefaultsPutRequestJsonXf04664c6, CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse>(SdkExecutionRequest(codeSecuritySetConfigurationAsDefaultForEnterpriseMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYSETCONFIGURATIONASDEFAULTFORENTERPRISE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultForEnterpriseRequestCodecRegistry, CodeSecuritySetConfigurationAsDefaultForEnterpriseResponseDecoder, options)

  /**
   * Updates a code security configuration in an organization.
   *
   * The authenticated user must be an administrator or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codeSecurityUpdateConfigurationWithResponse(
    request: InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e,
    configurationId: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityUpdateConfigurationResponse> = executor.executeWithResponse<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e, CodeSecurityUpdateConfigurationResponse>(SdkExecutionRequest(codeSecurityUpdateConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYUPDATECONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodeSecurityCodecs.codeSecurityUpdateConfigurationRequestCodecRegistry, CodeSecurityUpdateConfigurationResponseDecoder, options)

  /**
   * Updates a code security configuration in an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodeSecurityUpdateEnterpriseConfigurationApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodeSecurityUpdateEnterpriseConfigurationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codeSecurityUpdateEnterpriseConfiguration(
    request: InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29,
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): CodeSecurityConfiguration = executor.executeWithTypedErrors<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29, CodeSecurityUpdateEnterpriseConfigurationResponse, CodeSecurityConfiguration>(
    request = SdkExecutionRequest(codeSecurityUpdateEnterpriseConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYUPDATEENTERPRISECONFIGURATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CodeSecurityCodecs.codeSecurityUpdateEnterpriseConfigurationRequestCodecRegistry,
    responseDecoder = CodeSecurityUpdateEnterpriseConfigurationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodeSecurityUpdateEnterpriseConfigurationResponse.SuccessJson -> response.json
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodeSecurityUpdateEnterpriseConfigurationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Http304NoContent -> CodeSecurityUpdateEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Http403Json -> CodeSecurityUpdateEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Http404Json -> CodeSecurityUpdateEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Http409Json -> CodeSecurityUpdateEnterpriseConfigurationApiException(response, statusCode, headers)
        is CodeSecurityUpdateEnterpriseConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates a code security configuration in an enterprise.
   *
   * The authenticated user must be an administrator of the enterprise in order to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:enterprise` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configurationId The unique identifier of the code security configuration.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun codeSecurityUpdateEnterpriseConfigurationWithResponse(
    request: InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29,
    configurationId: Int,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodeSecurityUpdateEnterpriseConfigurationResponse> = executor.executeWithResponse<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29, CodeSecurityUpdateEnterpriseConfigurationResponse>(SdkExecutionRequest(codeSecurityUpdateEnterpriseConfigurationMetadata, baseUri, request, listOf(CodeSecurityCodecs.CODESECURITYUPDATEENTERPRISECONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration_id", values = listOf(configurationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CodeSecurityCodecs.codeSecurityUpdateEnterpriseConfigurationRequestCodecRegistry, CodeSecurityUpdateEnterpriseConfigurationResponseDecoder, options)

  /**
   * Typed response alternatives for `code-security/attach-configuration`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeSecurityAttachConfigurationResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityAttachConfigurationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityAttachConfigurationResponse
  }

  private object CodeSecurityAttachConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityAttachConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityAttachConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityAttachConfigurationResponse> = when {
      alternative.id == "code-security/attach-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityAttachConfigurationResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityAttachConfigurationResponseCodecAlternative0Registry.select(listOf("code-security/attach-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityAttachConfigurationResponse = CodeSecurityAttachConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/attach-enterprise-configuration` may expose through
   * its typed API exception.
   */
  public sealed interface CodeSecurityAttachEnterpriseConfigurationError

  /**
   * Typed response alternatives for `code-security/attach-enterprise-configuration`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodeSecurityAttachEnterpriseConfigurationResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityAttachEnterpriseConfigurationResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityAttachEnterpriseConfigurationResponse,
        CodeSecurityAttachEnterpriseConfigurationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityAttachEnterpriseConfigurationResponse,
        CodeSecurityAttachEnterpriseConfigurationError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityAttachEnterpriseConfigurationResponse,
        CodeSecurityAttachEnterpriseConfigurationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityAttachEnterpriseConfigurationResponse
  }

  /**
   * Raised by `code-security/attach-enterprise-configuration` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityAttachEnterpriseConfigurationApiException(
    public val error: CodeSecurityAttachEnterpriseConfigurationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/attach-enterprise-configuration")

  private object CodeSecurityAttachEnterpriseConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityAttachEnterpriseConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityAttachEnterpriseConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityAttachEnterpriseConfigurationResponse> = when {
      alternative.id == "code-security/attach-enterprise-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityAttachEnterpriseConfigurationResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative0Registry.select(listOf("code-security/attach-enterprise-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/attach-enterprise-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityAttachEnterpriseConfigurationResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative1Registry.select(listOf("code-security/attach-enterprise-configuration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/attach-enterprise-configuration.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityAttachEnterpriseConfigurationResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative2Registry.select(listOf("code-security/attach-enterprise-configuration.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/attach-enterprise-configuration.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityAttachEnterpriseConfigurationResponse.Http409Json(
          json = CodeSecurityCodecs.codeSecurityAttachEnterpriseConfigurationResponseCodecAlternative3Registry.select(listOf("code-security/attach-enterprise-configuration.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityAttachEnterpriseConfigurationResponse = CodeSecurityAttachEnterpriseConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `code-security/create-configuration`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeSecurityCreateConfigurationResponse {
    public class SuccessJson(
      public val json: CodeSecurityConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityCreateConfigurationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityCreateConfigurationResponse
  }

  private object CodeSecurityCreateConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityCreateConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityCreateConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityCreateConfigurationResponse> = when {
      alternative.id == "code-security/create-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityCreateConfigurationResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityCreateConfigurationResponseCodecAlternative0Registry.select(listOf("code-security/create-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityCreateConfigurationResponse = CodeSecurityCreateConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/create-configuration-for-enterprise` may expose
   * through its typed API exception.
   */
  public sealed interface CodeSecurityCreateConfigurationForEnterpriseError

  /**
   * Typed response alternatives for `code-security/create-configuration-for-enterprise`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CodeSecurityCreateConfigurationForEnterpriseResponse {
    public class SuccessJson(
      public val json: CodeSecurityConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityCreateConfigurationForEnterpriseResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityCreateConfigurationForEnterpriseResponse,
        CodeSecurityCreateConfigurationForEnterpriseError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityCreateConfigurationForEnterpriseResponse,
        CodeSecurityCreateConfigurationForEnterpriseError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityCreateConfigurationForEnterpriseResponse,
        CodeSecurityCreateConfigurationForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityCreateConfigurationForEnterpriseResponse,
        CodeSecurityCreateConfigurationForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityCreateConfigurationForEnterpriseResponse
  }

  /**
   * Raised by `code-security/create-configuration-for-enterprise` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityCreateConfigurationForEnterpriseApiException(
    public val error: CodeSecurityCreateConfigurationForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/create-configuration-for-enterprise")

  private object CodeSecurityCreateConfigurationForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityCreateConfigurationForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityCreateConfigurationForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityCreateConfigurationForEnterpriseResponse> = when {
      alternative.id == "code-security/create-configuration-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityCreateConfigurationForEnterpriseResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative0Registry.select(listOf("code-security/create-configuration-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/create-configuration-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityCreateConfigurationForEnterpriseResponse.Http400Json(
          json = CodeSecurityCodecs.codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative1Registry.select(listOf("code-security/create-configuration-for-enterprise.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/create-configuration-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityCreateConfigurationForEnterpriseResponse.Http400ScimJson(
          json = CodeSecurityCodecs.codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative2Registry.select(listOf("code-security/create-configuration-for-enterprise.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/create-configuration-for-enterprise.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityCreateConfigurationForEnterpriseResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative3Registry.select(listOf("code-security/create-configuration-for-enterprise.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/create-configuration-for-enterprise.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeSecurityCreateConfigurationForEnterpriseResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityCreateConfigurationForEnterpriseResponseCodecAlternative4Registry.select(listOf("code-security/create-configuration-for-enterprise.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityCreateConfigurationForEnterpriseResponse = CodeSecurityCreateConfigurationForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/delete-configuration` may expose through its typed
   * API exception.
   */
  public sealed interface CodeSecurityDeleteConfigurationError

  /**
   * Typed response alternatives for `code-security/delete-configuration`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeSecurityDeleteConfigurationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationResponse,
        CodeSecurityDeleteConfigurationError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationResponse,
        CodeSecurityDeleteConfigurationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationResponse,
        CodeSecurityDeleteConfigurationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationResponse,
        CodeSecurityDeleteConfigurationError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationResponse,
        CodeSecurityDeleteConfigurationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationResponse
  }

  /**
   * Raised by `code-security/delete-configuration` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityDeleteConfigurationApiException(
    public val error: CodeSecurityDeleteConfigurationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/delete-configuration")

  private object CodeSecurityDeleteConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityDeleteConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityDeleteConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityDeleteConfigurationResponse> = when {
      alternative.id == "code-security/delete-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationResponse.Http400Json(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationResponseCodecAlternative1Registry.select(listOf("code-security/delete-configuration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationResponse.Http400ScimJson(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationResponseCodecAlternative2Registry.select(listOf("code-security/delete-configuration.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationResponseCodecAlternative3Registry.select(listOf("code-security/delete-configuration.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationResponseCodecAlternative4Registry.select(listOf("code-security/delete-configuration.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationResponse.Http409Json(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationResponseCodecAlternative5Registry.select(listOf("code-security/delete-configuration.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityDeleteConfigurationResponse = CodeSecurityDeleteConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/delete-configuration-for-enterprise` may expose
   * through its typed API exception.
   */
  public sealed interface CodeSecurityDeleteConfigurationForEnterpriseError

  /**
   * Typed response alternatives for `code-security/delete-configuration-for-enterprise`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CodeSecurityDeleteConfigurationForEnterpriseResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationForEnterpriseResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationForEnterpriseResponse,
        CodeSecurityDeleteConfigurationForEnterpriseError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationForEnterpriseResponse,
        CodeSecurityDeleteConfigurationForEnterpriseError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationForEnterpriseResponse,
        CodeSecurityDeleteConfigurationForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationForEnterpriseResponse,
        CodeSecurityDeleteConfigurationForEnterpriseError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationForEnterpriseResponse,
        CodeSecurityDeleteConfigurationForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDeleteConfigurationForEnterpriseResponse
  }

  /**
   * Raised by `code-security/delete-configuration-for-enterprise` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityDeleteConfigurationForEnterpriseApiException(
    public val error: CodeSecurityDeleteConfigurationForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/delete-configuration-for-enterprise")

  private object CodeSecurityDeleteConfigurationForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityDeleteConfigurationForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityDeleteConfigurationForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityDeleteConfigurationForEnterpriseResponse> = when {
      alternative.id == "code-security/delete-configuration-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationForEnterpriseResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationForEnterpriseResponse.Http400Json(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative1Registry.select(listOf("code-security/delete-configuration-for-enterprise.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationForEnterpriseResponse.Http400ScimJson(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative2Registry.select(listOf("code-security/delete-configuration-for-enterprise.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration-for-enterprise.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationForEnterpriseResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative3Registry.select(listOf("code-security/delete-configuration-for-enterprise.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration-for-enterprise.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationForEnterpriseResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative4Registry.select(listOf("code-security/delete-configuration-for-enterprise.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/delete-configuration-for-enterprise.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeSecurityDeleteConfigurationForEnterpriseResponse.Http409Json(
          json = CodeSecurityCodecs.codeSecurityDeleteConfigurationForEnterpriseResponseCodecAlternative5Registry.select(listOf("code-security/delete-configuration-for-enterprise.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityDeleteConfigurationForEnterpriseResponse = CodeSecurityDeleteConfigurationForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/detach-configuration` may expose through its typed
   * API exception.
   */
  public sealed interface CodeSecurityDetachConfigurationError

  /**
   * Typed response alternatives for `code-security/detach-configuration`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeSecurityDetachConfigurationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDetachConfigurationResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDetachConfigurationResponse,
        CodeSecurityDetachConfigurationError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDetachConfigurationResponse,
        CodeSecurityDetachConfigurationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDetachConfigurationResponse,
        CodeSecurityDetachConfigurationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDetachConfigurationResponse,
        CodeSecurityDetachConfigurationError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDetachConfigurationResponse,
        CodeSecurityDetachConfigurationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityDetachConfigurationResponse
  }

  /**
   * Raised by `code-security/detach-configuration` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityDetachConfigurationApiException(
    public val error: CodeSecurityDetachConfigurationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/detach-configuration")

  private object CodeSecurityDetachConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityDetachConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityDetachConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityDetachConfigurationResponse> = when {
      alternative.id == "code-security/detach-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityDetachConfigurationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/detach-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityDetachConfigurationResponse.Http400Json(
          json = CodeSecurityCodecs.codeSecurityDetachConfigurationResponseCodecAlternative1Registry.select(listOf("code-security/detach-configuration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/detach-configuration.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityDetachConfigurationResponse.Http400ScimJson(
          json = CodeSecurityCodecs.codeSecurityDetachConfigurationResponseCodecAlternative2Registry.select(listOf("code-security/detach-configuration.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/detach-configuration.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityDetachConfigurationResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityDetachConfigurationResponseCodecAlternative3Registry.select(listOf("code-security/detach-configuration.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/detach-configuration.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeSecurityDetachConfigurationResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityDetachConfigurationResponseCodecAlternative4Registry.select(listOf("code-security/detach-configuration.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/detach-configuration.response.alternative5" -> SdkResponseDecodeResult(
        value = CodeSecurityDetachConfigurationResponse.Http409Json(
          json = CodeSecurityCodecs.codeSecurityDetachConfigurationResponseCodecAlternative5Registry.select(listOf("code-security/detach-configuration.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityDetachConfigurationResponse = CodeSecurityDetachConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/get-configuration` may expose through its typed API
   * exception.
   */
  public sealed interface CodeSecurityGetConfigurationError

  /**
   * Typed response alternatives for `code-security/get-configuration`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodeSecurityGetConfigurationResponse {
    public class SuccessJson(
      public val json: CodeSecurityConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationResponse,
        CodeSecurityGetConfigurationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationResponse,
        CodeSecurityGetConfigurationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationResponse,
        CodeSecurityGetConfigurationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationResponse
  }

  /**
   * Raised by `code-security/get-configuration` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityGetConfigurationApiException(
    public val error: CodeSecurityGetConfigurationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/get-configuration")

  private object CodeSecurityGetConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetConfigurationResponse> = when {
      alternative.id == "code-security/get-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationResponseCodecAlternative0Registry.select(listOf("code-security/get-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configuration.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationResponseCodecAlternative2Registry.select(listOf("code-security/get-configuration.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configuration.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationResponseCodecAlternative3Registry.select(listOf("code-security/get-configuration.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetConfigurationResponse = CodeSecurityGetConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `code-security/get-configuration-for-repository`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodeSecurityGetConfigurationForRepositoryResponse {
    public class SuccessJson(
      public val json: CodeSecurityConfigurationForRepository,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationForRepositoryResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationForRepositoryResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationForRepositoryResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationForRepositoryResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationForRepositoryResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationForRepositoryResponse
  }

  private object CodeSecurityGetConfigurationForRepositoryResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetConfigurationForRepositoryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetConfigurationForRepositoryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetConfigurationForRepositoryResponse> = when {
      alternative.id == "code-security/get-configuration-for-repository.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationForRepositoryResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationForRepositoryResponseCodecAlternative0Registry.select(listOf("code-security/get-configuration-for-repository.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configuration-for-repository.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationForRepositoryResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configuration-for-repository.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationForRepositoryResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configuration-for-repository.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationForRepositoryResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationForRepositoryResponseCodecAlternative3Registry.select(listOf("code-security/get-configuration-for-repository.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configuration-for-repository.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationForRepositoryResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationForRepositoryResponseCodecAlternative4Registry.select(listOf("code-security/get-configuration-for-repository.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetConfigurationForRepositoryResponse = CodeSecurityGetConfigurationForRepositoryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/get-configurations-for-enterprise` may expose through
   * its typed API exception.
   */
  public sealed interface CodeSecurityGetConfigurationsForEnterpriseError

  /**
   * Typed response alternatives for `code-security/get-configurations-for-enterprise`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodeSecurityGetConfigurationsForEnterpriseResponse {
    public class SuccessJson(
      public val json: List<CodeSecurityConfiguration>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationsForEnterpriseResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationsForEnterpriseResponse,
        CodeSecurityGetConfigurationsForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationsForEnterpriseResponse,
        CodeSecurityGetConfigurationsForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationsForEnterpriseResponse
  }

  /**
   * Raised by `code-security/get-configurations-for-enterprise` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityGetConfigurationsForEnterpriseApiException(
    public val error: CodeSecurityGetConfigurationsForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/get-configurations-for-enterprise")

  private object CodeSecurityGetConfigurationsForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetConfigurationsForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetConfigurationsForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetConfigurationsForEnterpriseResponse> = when {
      alternative.id == "code-security/get-configurations-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationsForEnterpriseResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative0Registry.select(listOf("code-security/get-configurations-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configurations-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationsForEnterpriseResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative1Registry.select(listOf("code-security/get-configurations-for-enterprise.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configurations-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationsForEnterpriseResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationsForEnterpriseResponseCodecAlternative2Registry.select(listOf("code-security/get-configurations-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetConfigurationsForEnterpriseResponse = CodeSecurityGetConfigurationsForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/get-configurations-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface CodeSecurityGetConfigurationsForOrgError

  /**
   * Typed response alternatives for `code-security/get-configurations-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodeSecurityGetConfigurationsForOrgResponse {
    public class SuccessJson(
      public val json: List<CodeSecurityConfiguration>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationsForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationsForOrgResponse,
        CodeSecurityGetConfigurationsForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationsForOrgResponse,
        CodeSecurityGetConfigurationsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetConfigurationsForOrgResponse
  }

  /**
   * Raised by `code-security/get-configurations-for-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityGetConfigurationsForOrgApiException(
    public val error: CodeSecurityGetConfigurationsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/get-configurations-for-org")

  private object CodeSecurityGetConfigurationsForOrgResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetConfigurationsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetConfigurationsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetConfigurationsForOrgResponse> = when {
      alternative.id == "code-security/get-configurations-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationsForOrgResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationsForOrgResponseCodecAlternative0Registry.select(listOf("code-security/get-configurations-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configurations-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationsForOrgResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationsForOrgResponseCodecAlternative1Registry.select(listOf("code-security/get-configurations-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-configurations-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityGetConfigurationsForOrgResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityGetConfigurationsForOrgResponseCodecAlternative2Registry.select(listOf("code-security/get-configurations-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetConfigurationsForOrgResponse = CodeSecurityGetConfigurationsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/get-default-configurations` may expose through its
   * typed API exception.
   */
  public sealed interface CodeSecurityGetDefaultConfigurationsError

  /**
   * Typed response alternatives for `code-security/get-default-configurations`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodeSecurityGetDefaultConfigurationsResponse {
    public class SuccessJson(
      public val json: List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetDefaultConfigurationsResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetDefaultConfigurationsResponse,
        CodeSecurityGetDefaultConfigurationsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetDefaultConfigurationsResponse,
        CodeSecurityGetDefaultConfigurationsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetDefaultConfigurationsResponse,
        CodeSecurityGetDefaultConfigurationsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetDefaultConfigurationsResponse
  }

  /**
   * Raised by `code-security/get-default-configurations` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityGetDefaultConfigurationsApiException(
    public val error: CodeSecurityGetDefaultConfigurationsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/get-default-configurations")

  private object CodeSecurityGetDefaultConfigurationsResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetDefaultConfigurationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetDefaultConfigurationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetDefaultConfigurationsResponse> = when {
      alternative.id == "code-security/get-default-configurations.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetDefaultConfigurationsResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsResponseCodecAlternative0Registry.select(listOf("code-security/get-default-configurations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-default-configurations.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityGetDefaultConfigurationsResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-default-configurations.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityGetDefaultConfigurationsResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsResponseCodecAlternative2Registry.select(listOf("code-security/get-default-configurations.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-default-configurations.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityGetDefaultConfigurationsResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsResponseCodecAlternative3Registry.select(listOf("code-security/get-default-configurations.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetDefaultConfigurationsResponse = CodeSecurityGetDefaultConfigurationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `code-security/get-default-configurations-for-enterprise`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CodeSecurityGetDefaultConfigurationsForEnterpriseResponse {
    public class SuccessJson(
      public val json: List<InlineCodeSecurityDefaultConfigurationsItemXb1633561>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetDefaultConfigurationsForEnterpriseResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetDefaultConfigurationsForEnterpriseResponse
  }

  private object CodeSecurityGetDefaultConfigurationsForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetDefaultConfigurationsForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetDefaultConfigurationsForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetDefaultConfigurationsForEnterpriseResponse> = when {
      alternative.id == "code-security/get-default-configurations-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetDefaultConfigurationsForEnterpriseResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetDefaultConfigurationsForEnterpriseResponseCodecAlternative0Registry.select(listOf("code-security/get-default-configurations-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetDefaultConfigurationsForEnterpriseResponse = CodeSecurityGetDefaultConfigurationsForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/get-repositories-for-configuration` may expose
   * through its typed API exception.
   */
  public sealed interface CodeSecurityGetRepositoriesForConfigurationError

  /**
   * Typed response alternatives for `code-security/get-repositories-for-configuration`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CodeSecurityGetRepositoriesForConfigurationResponse {
    public class SuccessJson(
      public val json: List<CodeSecurityConfigurationRepositories>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetRepositoriesForConfigurationResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetRepositoriesForConfigurationResponse,
        CodeSecurityGetRepositoriesForConfigurationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetRepositoriesForConfigurationResponse,
        CodeSecurityGetRepositoriesForConfigurationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetRepositoriesForConfigurationResponse
  }

  /**
   * Raised by `code-security/get-repositories-for-configuration` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityGetRepositoriesForConfigurationApiException(
    public val error: CodeSecurityGetRepositoriesForConfigurationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/get-repositories-for-configuration")

  private object CodeSecurityGetRepositoriesForConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetRepositoriesForConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetRepositoriesForConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetRepositoriesForConfigurationResponse> = when {
      alternative.id == "code-security/get-repositories-for-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetRepositoriesForConfigurationResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative0Registry.select(listOf("code-security/get-repositories-for-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-repositories-for-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityGetRepositoriesForConfigurationResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative1Registry.select(listOf("code-security/get-repositories-for-configuration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-repositories-for-configuration.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityGetRepositoriesForConfigurationResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityGetRepositoriesForConfigurationResponseCodecAlternative2Registry.select(listOf("code-security/get-repositories-for-configuration.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetRepositoriesForConfigurationResponse = CodeSecurityGetRepositoriesForConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/get-repositories-for-enterprise-configuration` may
   * expose through its typed API exception.
   */
  public sealed interface CodeSecurityGetRepositoriesForEnterpriseConfigurationError

  /**
   * Typed response alternatives for `code-security/get-repositories-for-enterprise-configuration`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse {
    public class SuccessJson(
      public val json: List<CodeSecurityConfigurationRepositories>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse,
        CodeSecurityGetRepositoriesForEnterpriseConfigurationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse,
        CodeSecurityGetRepositoriesForEnterpriseConfigurationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse
  }

  /**
   * Raised by `code-security/get-repositories-for-enterprise-configuration` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityGetRepositoriesForEnterpriseConfigurationApiException(
    public val error: CodeSecurityGetRepositoriesForEnterpriseConfigurationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/get-repositories-for-enterprise-configuration")

  private object CodeSecurityGetRepositoriesForEnterpriseConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse> = when {
      alternative.id == "code-security/get-repositories-for-enterprise-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative0Registry.select(listOf("code-security/get-repositories-for-enterprise-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-repositories-for-enterprise-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative1Registry.select(listOf("code-security/get-repositories-for-enterprise-configuration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-repositories-for-enterprise-configuration.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityGetRepositoriesForEnterpriseConfigurationResponseCodecAlternative2Registry.select(listOf("code-security/get-repositories-for-enterprise-configuration.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse = CodeSecurityGetRepositoriesForEnterpriseConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/get-single-configuration-for-enterprise` may expose
   * through its typed API exception.
   */
  public sealed interface CodeSecurityGetSingleConfigurationForEnterpriseError

  /**
   * Typed response alternatives for `code-security/get-single-configuration-for-enterprise`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CodeSecurityGetSingleConfigurationForEnterpriseResponse {
    public class SuccessJson(
      public val json: CodeSecurityConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetSingleConfigurationForEnterpriseResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetSingleConfigurationForEnterpriseResponse,
        CodeSecurityGetSingleConfigurationForEnterpriseError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetSingleConfigurationForEnterpriseResponse,
        CodeSecurityGetSingleConfigurationForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetSingleConfigurationForEnterpriseResponse,
        CodeSecurityGetSingleConfigurationForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityGetSingleConfigurationForEnterpriseResponse
  }

  /**
   * Raised by `code-security/get-single-configuration-for-enterprise` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityGetSingleConfigurationForEnterpriseApiException(
    public val error: CodeSecurityGetSingleConfigurationForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/get-single-configuration-for-enterprise")

  private object CodeSecurityGetSingleConfigurationForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityGetSingleConfigurationForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityGetSingleConfigurationForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityGetSingleConfigurationForEnterpriseResponse> = when {
      alternative.id == "code-security/get-single-configuration-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityGetSingleConfigurationForEnterpriseResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative0Registry.select(listOf("code-security/get-single-configuration-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-single-configuration-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-single-configuration-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative2Registry.select(listOf("code-security/get-single-configuration-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/get-single-configuration-for-enterprise.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityGetSingleConfigurationForEnterpriseResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityGetSingleConfigurationForEnterpriseResponseCodecAlternative3Registry.select(listOf("code-security/get-single-configuration-for-enterprise.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityGetSingleConfigurationForEnterpriseResponse = CodeSecurityGetSingleConfigurationForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/set-configuration-as-default` may expose through its
   * typed API exception.
   */
  public sealed interface CodeSecuritySetConfigurationAsDefaultError

  /**
   * Typed response alternatives for `code-security/set-configuration-as-default`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodeSecuritySetConfigurationAsDefaultResponse {
    public class SuccessJson(
      public val json: InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecuritySetConfigurationAsDefaultResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecuritySetConfigurationAsDefaultResponse,
        CodeSecuritySetConfigurationAsDefaultError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecuritySetConfigurationAsDefaultResponse,
        CodeSecuritySetConfigurationAsDefaultError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecuritySetConfigurationAsDefaultResponse
  }

  /**
   * Raised by `code-security/set-configuration-as-default` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecuritySetConfigurationAsDefaultApiException(
    public val error: CodeSecuritySetConfigurationAsDefaultError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/set-configuration-as-default")

  private object CodeSecuritySetConfigurationAsDefaultResponseDecoder : SdkResponseAlternativeDecoder<CodeSecuritySetConfigurationAsDefaultResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecuritySetConfigurationAsDefaultResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecuritySetConfigurationAsDefaultResponse> = when {
      alternative.id == "code-security/set-configuration-as-default.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecuritySetConfigurationAsDefaultResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultResponseCodecAlternative0Registry.select(listOf("code-security/set-configuration-as-default.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/set-configuration-as-default.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecuritySetConfigurationAsDefaultResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultResponseCodecAlternative1Registry.select(listOf("code-security/set-configuration-as-default.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/set-configuration-as-default.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecuritySetConfigurationAsDefaultResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultResponseCodecAlternative2Registry.select(listOf("code-security/set-configuration-as-default.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecuritySetConfigurationAsDefaultResponse = CodeSecuritySetConfigurationAsDefaultResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/set-configuration-as-default-for-enterprise` may
   * expose through its typed API exception.
   */
  public sealed interface CodeSecuritySetConfigurationAsDefaultForEnterpriseError

  /**
   * Typed response alternatives for `code-security/set-configuration-as-default-for-enterprise`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse {
    public class SuccessJson(
      public val json:
          InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse,
        CodeSecuritySetConfigurationAsDefaultForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse,
        CodeSecuritySetConfigurationAsDefaultForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse
  }

  /**
   * Raised by `code-security/set-configuration-as-default-for-enterprise` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecuritySetConfigurationAsDefaultForEnterpriseApiException(
    public val error: CodeSecuritySetConfigurationAsDefaultForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/set-configuration-as-default-for-enterprise")

  private object CodeSecuritySetConfigurationAsDefaultForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse> = when {
      alternative.id == "code-security/set-configuration-as-default-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative0Registry.select(listOf("code-security/set-configuration-as-default-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/set-configuration-as-default-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative1Registry.select(listOf("code-security/set-configuration-as-default-for-enterprise.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/set-configuration-as-default-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecuritySetConfigurationAsDefaultForEnterpriseResponseCodecAlternative2Registry.select(listOf("code-security/set-configuration-as-default-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse = CodeSecuritySetConfigurationAsDefaultForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `code-security/update-configuration`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodeSecurityUpdateConfigurationResponse {
    public class SuccessJson(
      public val json: CodeSecurityConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateConfigurationResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateConfigurationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateConfigurationResponse
  }

  private object CodeSecurityUpdateConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityUpdateConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityUpdateConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityUpdateConfigurationResponse> = when {
      alternative.id == "code-security/update-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityUpdateConfigurationResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityUpdateConfigurationResponseCodecAlternative0Registry.select(listOf("code-security/update-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/update-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityUpdateConfigurationResponse.SuccessNoContent(
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
    ): CodeSecurityUpdateConfigurationResponse = CodeSecurityUpdateConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `code-security/update-enterprise-configuration` may expose through
   * its typed API exception.
   */
  public sealed interface CodeSecurityUpdateEnterpriseConfigurationError

  /**
   * Typed response alternatives for `code-security/update-enterprise-configuration`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodeSecurityUpdateEnterpriseConfigurationResponse {
    public class SuccessJson(
      public val json: CodeSecurityConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateEnterpriseConfigurationResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateEnterpriseConfigurationResponse,
        CodeSecurityUpdateEnterpriseConfigurationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateEnterpriseConfigurationResponse,
        CodeSecurityUpdateEnterpriseConfigurationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateEnterpriseConfigurationResponse,
        CodeSecurityUpdateEnterpriseConfigurationError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateEnterpriseConfigurationResponse,
        CodeSecurityUpdateEnterpriseConfigurationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodeSecurityUpdateEnterpriseConfigurationResponse
  }

  /**
   * Raised by `code-security/update-enterprise-configuration` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodeSecurityUpdateEnterpriseConfigurationApiException(
    public val error: CodeSecurityUpdateEnterpriseConfigurationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "code-security/update-enterprise-configuration")

  private object CodeSecurityUpdateEnterpriseConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CodeSecurityUpdateEnterpriseConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodeSecurityUpdateEnterpriseConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodeSecurityUpdateEnterpriseConfigurationResponse> = when {
      alternative.id == "code-security/update-enterprise-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CodeSecurityUpdateEnterpriseConfigurationResponse.SuccessJson(
          json = CodeSecurityCodecs.codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative0Registry.select(listOf("code-security/update-enterprise-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/update-enterprise-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CodeSecurityUpdateEnterpriseConfigurationResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/update-enterprise-configuration.response.alternative2" -> SdkResponseDecodeResult(
        value = CodeSecurityUpdateEnterpriseConfigurationResponse.Http403Json(
          json = CodeSecurityCodecs.codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative2Registry.select(listOf("code-security/update-enterprise-configuration.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/update-enterprise-configuration.response.alternative3" -> SdkResponseDecodeResult(
        value = CodeSecurityUpdateEnterpriseConfigurationResponse.Http404Json(
          json = CodeSecurityCodecs.codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative3Registry.select(listOf("code-security/update-enterprise-configuration.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "code-security/update-enterprise-configuration.response.alternative4" -> SdkResponseDecodeResult(
        value = CodeSecurityUpdateEnterpriseConfigurationResponse.Http409Json(
          json = CodeSecurityCodecs.codeSecurityUpdateEnterpriseConfigurationResponseCodecAlternative4Registry.select(listOf("code-security/update-enterprise-configuration.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodeSecurityUpdateEnterpriseConfigurationResponse = CodeSecurityUpdateEnterpriseConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val codeSecurityAttachConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/attach-configuration",
          method = "POST",
          path = "/orgs/{org}/code-security/configurations/{configuration_id}/attach",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/attach-configuration.response.alternative0",
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

    internal val codeSecurityAttachEnterpriseConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/attach-enterprise-configuration",
          method = "POST",
          path = "/enterprises/{enterprise}/code-security/configurations/{configuration_id}/attach",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/attach-enterprise-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/attach-enterprise-configuration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/attach-enterprise-configuration.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/attach-enterprise-configuration.response.alternative3",
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

    internal val codeSecurityCreateConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/create-configuration",
          method = "POST",
          path = "/orgs/{org}/code-security/configurations",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeSecurityConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/create-configuration.response.alternative0",
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

    internal val codeSecurityCreateConfigurationForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/create-configuration-for-enterprise",
          method = "POST",
          path = "/enterprises/{enterprise}/code-security/configurations",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeSecurityConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/create-configuration-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/create-configuration-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/create-configuration-for-enterprise.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/create-configuration-for-enterprise.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/create-configuration-for-enterprise.response.alternative4",
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

    internal val codeSecurityDeleteConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/delete-configuration",
          method = "DELETE",
          path = "/orgs/{org}/code-security/configurations/{configuration_id}",
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
              id = "code-security/delete-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration.response.alternative5",
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

    internal val codeSecurityDeleteConfigurationForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/delete-configuration-for-enterprise",
          method = "DELETE",
          path = "/enterprises/{enterprise}/code-security/configurations/{configuration_id}",
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
              id = "code-security/delete-configuration-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration-for-enterprise.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration-for-enterprise.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration-for-enterprise.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/delete-configuration-for-enterprise.response.alternative5",
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

    internal val codeSecurityDetachConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/detach-configuration",
          method = "DELETE",
          path = "/orgs/{org}/code-security/configurations/detach",
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
              id = "code-security/detach-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/detach-configuration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/detach-configuration.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/detach-configuration.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/detach-configuration.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/detach-configuration.response.alternative5",
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

    internal val codeSecurityGetConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-configuration",
          method = "GET",
          path = "/orgs/{org}/code-security/configurations/{configuration_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeSecurityConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration.response.alternative3",
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

    internal val codeSecurityGetConfigurationForRepositoryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-configuration-for-repository",
          method = "GET",
          path = "/repos/{owner}/{repo}/code-security-configuration",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeSecurityConfigurationForRepository",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration-for-repository.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration-for-repository.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration-for-repository.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration-for-repository.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configuration-for-repository.response.alternative4",
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

    internal val codeSecurityGetConfigurationsForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-configurations-for-enterprise",
          method = "GET",
          path = "/enterprises/{enterprise}/code-security/configurations",
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
              id = "code-security/get-configurations-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configurations-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configurations-for-enterprise.response.alternative2",
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

    internal val codeSecurityGetConfigurationsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-configurations-for-org",
          method = "GET",
          path = "/orgs/{org}/code-security/configurations",
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
              id = "code-security/get-configurations-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configurations-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-configurations-for-org.response.alternative2",
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

    internal val codeSecurityGetDefaultConfigurationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-default-configurations",
          method = "GET",
          path = "/orgs/{org}/code-security/configurations/defaults",
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
              id = "code-security/get-default-configurations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-default-configurations.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-default-configurations.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-default-configurations.response.alternative3",
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

    internal val codeSecurityGetDefaultConfigurationsForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-default-configurations-for-enterprise",
          method = "GET",
          path = "/enterprises/{enterprise}/code-security/configurations/defaults",
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
              id = "code-security/get-default-configurations-for-enterprise.response.alternative0",
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

    internal val codeSecurityGetRepositoriesForConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-repositories-for-configuration",
          method = "GET",
          path = "/orgs/{org}/code-security/configurations/{configuration_id}/repositories",
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
              id = "code-security/get-repositories-for-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-repositories-for-configuration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-repositories-for-configuration.response.alternative2",
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

    internal val codeSecurityGetRepositoriesForEnterpriseConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-repositories-for-enterprise-configuration",
          method = "GET",
          path = "/enterprises/{enterprise}/code-security/configurations/{configuration_id}/repositories",
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
              id = "code-security/get-repositories-for-enterprise-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-repositories-for-enterprise-configuration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-repositories-for-enterprise-configuration.response.alternative2",
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

    internal val codeSecurityGetSingleConfigurationForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/get-single-configuration-for-enterprise",
          method = "GET",
          path = "/enterprises/{enterprise}/code-security/configurations/{configuration_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeSecurityConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-single-configuration-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-single-configuration-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-single-configuration-for-enterprise.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/get-single-configuration-for-enterprise.response.alternative3",
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

    internal val codeSecuritySetConfigurationAsDefaultMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/set-configuration-as-default",
          method = "PUT",
          path = "/orgs/{org}/code-security/configurations/{configuration_id}/defaults",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCodeSecurityConfigurationsDefaultsPutResponse200JsonXcb1b5eac",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/set-configuration-as-default.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/set-configuration-as-default.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/set-configuration-as-default.response.alternative2",
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

    internal val codeSecuritySetConfigurationAsDefaultForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/set-configuration-as-default-for-enterprise",
          method = "PUT",
          path = "/enterprises/{enterprise}/code-security/configurations/{configuration_id}/defaults",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineEnterprisesCodeSecurityConfigurationsDefaultsPutResponse200JsonX6cfcd682",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/set-configuration-as-default-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/set-configuration-as-default-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/set-configuration-as-default-for-enterprise.response.alternative2",
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

    internal val codeSecurityUpdateConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/update-configuration",
          method = "PATCH",
          path = "/orgs/{org}/code-security/configurations/{configuration_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeSecurityConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/update-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/update-configuration.response.alternative1",
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

    internal val codeSecurityUpdateEnterpriseConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "code-security/update-enterprise-configuration",
          method = "PATCH",
          path = "/enterprises/{enterprise}/code-security/configurations/{configuration_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeSecurityConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/update-enterprise-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/update-enterprise-configuration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/update-enterprise-configuration.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/update-enterprise-configuration.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "code-security/update-enterprise-configuration.response.alternative4",
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
