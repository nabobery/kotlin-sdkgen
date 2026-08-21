package com.nabobery.sdkgen.github.generated.securityadvisories

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.FullRepository
import com.nabobery.sdkgen.github.generated.GlobalAdvisory
import com.nabobery.sdkgen.github.generated.InlineAdvisoriesGetParameterX03370d32
import com.nabobery.sdkgen.github.generated.InlineAdvisoriesGetParameterX1b867e04
import com.nabobery.sdkgen.github.generated.InlineAdvisoriesGetParameterX30a5385f
import com.nabobery.sdkgen.github.generated.InlineAdvisoriesGetParameterXc0ca6916
import com.nabobery.sdkgen.github.generated.InlineAdvisoriesGetParameterXd99c6675
import com.nabobery.sdkgen.github.generated.InlineDirectionParameterX3053723f
import com.nabobery.sdkgen.github.generated.InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4
import com.nabobery.sdkgen.github.generated.InlineOrgsSecurityAdvisoriesGetParameterX501de1d8
import com.nabobery.sdkgen.github.generated.InlineReposSecurityAdvisoriesGetParameterX3cc08ffc
import com.nabobery.sdkgen.github.generated.InlineReposSecurityAdvisoriesGetParameterXbf4c0a91
import com.nabobery.sdkgen.github.generated.PrivateVulnerabilityReportCreate
import com.nabobery.sdkgen.github.generated.RepositoryAdvisory
import com.nabobery.sdkgen.github.generated.RepositoryAdvisoryCreate
import com.nabobery.sdkgen.github.generated.RepositoryAdvisoryUpdate
import com.nabobery.sdkgen.github.generated.ScimError
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.SecurityAdvisoryEcosystems
import com.nabobery.sdkgen.github.generated.ValidationError
import com.nabobery.sdkgen.github.generated.ValidationErrorSimple
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
import com.nabobery.sdkgen.runtime.sdkPrimitiveUnionParameterValues
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.JsonObject

internal object SecurityAdvisoriesCodecs {
  internal const val SECURITYADVISORIESCREATEFORK_RESPONSE_CODEC_ID: String =
      "security-advisories/create-fork.response"

  private val securityAdvisoriesCreateForkResponseCodec: MediaTypeCodec<FullRepository> =
      KotlinxSerializationCodec(SECURITYADVISORIESCREATEFORK_RESPONSE_CODEC_ID, FullRepository.Serializer, SdkJson)

  private val securityAdvisoriesCreateForkResponseCodecAlternative0Codec:
      MediaTypeCodec<FullRepository> =
      KotlinxSerializationCodec("security-advisories/create-fork.response.alternative0", FullRepository.Serializer, SdkJson)

  internal val securityAdvisoriesCreateForkResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FullRepository> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateForkResponseCodecAlternative0Codec)

  private val securityAdvisoriesCreateForkResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("security-advisories/create-fork.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateForkResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateForkResponseCodecAlternative1Codec)

  private val securityAdvisoriesCreateForkResponseCodecAlternative2Codec: MediaTypeCodec<ScimError>
      =
      KotlinxSerializationCodec("security-advisories/create-fork.response.alternative2", ScimError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateForkResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateForkResponseCodecAlternative2Codec)

  private val securityAdvisoriesCreateForkResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("security-advisories/create-fork.response.alternative3", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateForkResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateForkResponseCodecAlternative3Codec)

  private val securityAdvisoriesCreateForkResponseCodecAlternative4Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("security-advisories/create-fork.response.alternative4", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateForkResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateForkResponseCodecAlternative4Codec)

  private val securityAdvisoriesCreateForkResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("security-advisories/create-fork.response.alternative5", ValidationError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateForkResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateForkResponseCodecAlternative5Codec)

  internal val securityAdvisoriesCreateForkRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val securityAdvisoriesCreateForkResponseCodecRegistry:
      MediaTypeCodecRegistry<FullRepository> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateForkResponseCodec)

  internal const val SECURITYADVISORIESCREATEPRIVATEVULNERABILITYREPORT_REQUEST_CODEC_ID: String =
      "security-advisories/create-private-vulnerability-report.request"

  private val securityAdvisoriesCreatePrivateVulnerabilityReportRequestCodec:
      MediaTypeCodec<PrivateVulnerabilityReportCreate> =
      KotlinxSerializationCodec(SECURITYADVISORIESCREATEPRIVATEVULNERABILITYREPORT_REQUEST_CODEC_ID, PrivateVulnerabilityReportCreate.Serializer, SdkJson)

  internal const val SECURITYADVISORIESCREATEPRIVATEVULNERABILITYREPORT_RESPONSE_CODEC_ID: String =
      "security-advisories/create-private-vulnerability-report.response"

  private val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodec:
      MediaTypeCodec<RepositoryAdvisory> =
      KotlinxSerializationCodec(SECURITYADVISORIESCREATEPRIVATEVULNERABILITYREPORT_RESPONSE_CODEC_ID, RepositoryAdvisory.Serializer, SdkJson)

  private val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative0Codec:
      MediaTypeCodec<RepositoryAdvisory> =
      KotlinxSerializationCodec("security-advisories/create-private-vulnerability-report.response.alternative0", RepositoryAdvisory.Serializer, SdkJson)

  internal val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RepositoryAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative0Codec)

  private val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/create-private-vulnerability-report.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative1Codec)

  private val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/create-private-vulnerability-report.response.alternative2", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative2Codec)

  private val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("security-advisories/create-private-vulnerability-report.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative3Codec)

  internal val securityAdvisoriesCreatePrivateVulnerabilityReportRequestCodecRegistry:
      MediaTypeCodecRegistry<PrivateVulnerabilityReportCreate> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreatePrivateVulnerabilityReportRequestCodec)

  internal val securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecRegistry:
      MediaTypeCodecRegistry<RepositoryAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodec)

  internal const val SECURITYADVISORIESCREATEREPOSITORYADVISORY_REQUEST_CODEC_ID: String =
      "security-advisories/create-repository-advisory.request"

  private val securityAdvisoriesCreateRepositoryAdvisoryRequestCodec:
      MediaTypeCodec<RepositoryAdvisoryCreate> =
      KotlinxSerializationCodec(SECURITYADVISORIESCREATEREPOSITORYADVISORY_REQUEST_CODEC_ID, RepositoryAdvisoryCreate.Serializer, SdkJson)

  internal const val SECURITYADVISORIESCREATEREPOSITORYADVISORY_RESPONSE_CODEC_ID: String =
      "security-advisories/create-repository-advisory.response"

  private val securityAdvisoriesCreateRepositoryAdvisoryResponseCodec:
      MediaTypeCodec<RepositoryAdvisory> =
      KotlinxSerializationCodec(SECURITYADVISORIESCREATEREPOSITORYADVISORY_RESPONSE_CODEC_ID, RepositoryAdvisory.Serializer, SdkJson)

  private val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative0Codec:
      MediaTypeCodec<RepositoryAdvisory> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory.response.alternative0", RepositoryAdvisory.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RepositoryAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative0Codec)

  private val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative1Codec)

  private val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory.response.alternative2", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative2Codec)

  private val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative3Codec)

  internal val securityAdvisoriesCreateRepositoryAdvisoryRequestCodecRegistry:
      MediaTypeCodecRegistry<RepositoryAdvisoryCreate> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryRequestCodec)

  internal val securityAdvisoriesCreateRepositoryAdvisoryResponseCodecRegistry:
      MediaTypeCodecRegistry<RepositoryAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryResponseCodec)

  internal const val SECURITYADVISORIESCREATEREPOSITORYADVISORYCVEREQUEST_RESPONSE_CODEC_ID: String
      = "security-advisories/create-repository-advisory-cve-request.response"

  private val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(SECURITYADVISORIESCREATEREPOSITORYADVISORYCVEREQUEST_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory-cve-request.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative0Codec)

  private val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory-cve-request.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative1Codec)

  private val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory-cve-request.response.alternative2", ScimError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative2Codec)

  private val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory-cve-request.response.alternative3", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative3Codec)

  private val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory-cve-request.response.alternative4", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative4Codec)

  private val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("security-advisories/create-repository-advisory-cve-request.response.alternative5", ValidationError.Serializer, SdkJson)

  internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative5Codec)

  internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecRegistry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodec)

  internal const val SECURITYADVISORIESGETGLOBALADVISORY_RESPONSE_CODEC_ID: String =
      "security-advisories/get-global-advisory.response"

  private val securityAdvisoriesGetGlobalAdvisoryResponseCodec: MediaTypeCodec<GlobalAdvisory> =
      KotlinxSerializationCodec(SECURITYADVISORIESGETGLOBALADVISORY_RESPONSE_CODEC_ID, GlobalAdvisory.Serializer, SdkJson)

  private val securityAdvisoriesGetGlobalAdvisoryResponseCodecAlternative0Codec:
      MediaTypeCodec<GlobalAdvisory> =
      KotlinxSerializationCodec("security-advisories/get-global-advisory.response.alternative0", GlobalAdvisory.Serializer, SdkJson)

  internal val securityAdvisoriesGetGlobalAdvisoryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GlobalAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesGetGlobalAdvisoryResponseCodecAlternative0Codec)

  private val securityAdvisoriesGetGlobalAdvisoryResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/get-global-advisory.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesGetGlobalAdvisoryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesGetGlobalAdvisoryResponseCodecAlternative1Codec)

  internal val securityAdvisoriesGetGlobalAdvisoryRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val securityAdvisoriesGetGlobalAdvisoryResponseCodecRegistry:
      MediaTypeCodecRegistry<GlobalAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesGetGlobalAdvisoryResponseCodec)

  internal const val SECURITYADVISORIESGETREPOSITORYADVISORY_RESPONSE_CODEC_ID: String =
      "security-advisories/get-repository-advisory.response"

  private val securityAdvisoriesGetRepositoryAdvisoryResponseCodec:
      MediaTypeCodec<RepositoryAdvisory> =
      KotlinxSerializationCodec(SECURITYADVISORIESGETREPOSITORYADVISORY_RESPONSE_CODEC_ID, RepositoryAdvisory.Serializer, SdkJson)

  private val securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative0Codec:
      MediaTypeCodec<RepositoryAdvisory> =
      KotlinxSerializationCodec("security-advisories/get-repository-advisory.response.alternative0", RepositoryAdvisory.Serializer, SdkJson)

  internal val securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RepositoryAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative0Codec)

  private val securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/get-repository-advisory.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative1Codec)

  private val securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/get-repository-advisory.response.alternative2", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative2Codec)

  internal val securityAdvisoriesGetRepositoryAdvisoryRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val securityAdvisoriesGetRepositoryAdvisoryResponseCodecRegistry:
      MediaTypeCodecRegistry<RepositoryAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesGetRepositoryAdvisoryResponseCodec)

  internal const val SECURITYADVISORIESLISTGLOBALADVISORIES_RESPONSE_CODEC_ID: String =
      "security-advisories/list-global-advisories.response"

  private val securityAdvisoriesListGlobalAdvisoriesResponseCodec:
      MediaTypeCodec<List<GlobalAdvisory>> =
      KotlinxSerializationCodec(SECURITYADVISORIESLISTGLOBALADVISORIES_RESPONSE_CODEC_ID, ListSerializer(GlobalAdvisory.Serializer), SdkJson)

  private val securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<GlobalAdvisory>> =
      KotlinxSerializationCodec("security-advisories/list-global-advisories.response.alternative0", ListSerializer(GlobalAdvisory.Serializer), SdkJson)

  internal val securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<GlobalAdvisory>> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative0Codec)

  private val securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative1Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("security-advisories/list-global-advisories.response.alternative1", ValidationErrorSimple.Serializer, SdkJson)

  internal val securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative1Codec)

  private val securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/list-global-advisories.response.alternative2", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative2Codec)

  internal val securityAdvisoriesListGlobalAdvisoriesRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val securityAdvisoriesListGlobalAdvisoriesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<GlobalAdvisory>> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListGlobalAdvisoriesResponseCodec)

  internal const val SECURITYADVISORIESLISTORGREPOSITORYADVISORIES_RESPONSE_CODEC_ID: String =
      "security-advisories/list-org-repository-advisories.response"

  private val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodec:
      MediaTypeCodec<List<RepositoryAdvisory>> =
      KotlinxSerializationCodec(SECURITYADVISORIESLISTORGREPOSITORYADVISORIES_RESPONSE_CODEC_ID, ListSerializer(RepositoryAdvisory.Serializer), SdkJson)

  private val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<RepositoryAdvisory>> =
      KotlinxSerializationCodec("security-advisories/list-org-repository-advisories.response.alternative0", ListSerializer(RepositoryAdvisory.Serializer), SdkJson)

  internal val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<RepositoryAdvisory>> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative0Codec)

  private val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/list-org-repository-advisories.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative1Codec)

  private val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("security-advisories/list-org-repository-advisories.response.alternative2", ScimError.Serializer, SdkJson)

  internal val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative2Codec)

  private val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/list-org-repository-advisories.response.alternative3", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative3Codec)

  internal val securityAdvisoriesListOrgRepositoryAdvisoriesRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<RepositoryAdvisory>> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodec)

  internal const val SECURITYADVISORIESLISTREPOSITORYADVISORIES_RESPONSE_CODEC_ID: String =
      "security-advisories/list-repository-advisories.response"

  private val securityAdvisoriesListRepositoryAdvisoriesResponseCodec:
      MediaTypeCodec<List<RepositoryAdvisory>> =
      KotlinxSerializationCodec(SECURITYADVISORIESLISTREPOSITORYADVISORIES_RESPONSE_CODEC_ID, ListSerializer(RepositoryAdvisory.Serializer), SdkJson)

  private val securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<RepositoryAdvisory>> =
      KotlinxSerializationCodec("security-advisories/list-repository-advisories.response.alternative0", ListSerializer(RepositoryAdvisory.Serializer), SdkJson)

  internal val securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<RepositoryAdvisory>> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative0Codec)

  private val securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/list-repository-advisories.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative1Codec)

  private val securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("security-advisories/list-repository-advisories.response.alternative2", ScimError.Serializer, SdkJson)

  internal val securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative2Codec)

  private val securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/list-repository-advisories.response.alternative3", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative3Codec)

  internal val securityAdvisoriesListRepositoryAdvisoriesRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val securityAdvisoriesListRepositoryAdvisoriesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<RepositoryAdvisory>> =
      MediaTypeCodecRegistry.of(securityAdvisoriesListRepositoryAdvisoriesResponseCodec)

  internal const val SECURITYADVISORIESUPDATEREPOSITORYADVISORY_REQUEST_CODEC_ID: String =
      "security-advisories/update-repository-advisory.request"

  private val securityAdvisoriesUpdateRepositoryAdvisoryRequestCodec:
      MediaTypeCodec<RepositoryAdvisoryUpdate> =
      KotlinxSerializationCodec(SECURITYADVISORIESUPDATEREPOSITORYADVISORY_REQUEST_CODEC_ID, RepositoryAdvisoryUpdate.Serializer, SdkJson)

  internal const val SECURITYADVISORIESUPDATEREPOSITORYADVISORY_RESPONSE_CODEC_ID: String =
      "security-advisories/update-repository-advisory.response"

  private val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodec:
      MediaTypeCodec<RepositoryAdvisory> =
      KotlinxSerializationCodec(SECURITYADVISORIESUPDATEREPOSITORYADVISORY_RESPONSE_CODEC_ID, RepositoryAdvisory.Serializer, SdkJson)

  private val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative0Codec:
      MediaTypeCodec<RepositoryAdvisory> =
      KotlinxSerializationCodec("security-advisories/update-repository-advisory.response.alternative0", RepositoryAdvisory.Serializer, SdkJson)

  internal val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RepositoryAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative0Codec)

  private val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/update-repository-advisory.response.alternative1", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative1Codec)

  private val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("security-advisories/update-repository-advisory.response.alternative2", BasicError.Serializer, SdkJson)

  internal val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative2Codec)

  private val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("security-advisories/update-repository-advisory.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative3Codec)

  internal val securityAdvisoriesUpdateRepositoryAdvisoryRequestCodecRegistry:
      MediaTypeCodecRegistry<RepositoryAdvisoryUpdate> =
      MediaTypeCodecRegistry.of(securityAdvisoriesUpdateRepositoryAdvisoryRequestCodec)

  internal val securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecRegistry:
      MediaTypeCodecRegistry<RepositoryAdvisory> =
      MediaTypeCodecRegistry.of(securityAdvisoriesUpdateRepositoryAdvisoryResponseCodec)
}

/**
 * Client for the 'security-advisories' group of GitHub v3 REST API.
 */
public class SecurityAdvisoriesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@SecurityAdvisoriesClient.authentication)

  /**
   * Create a temporary private fork to collaborate on fixing a security vulnerability in your repository.
   *
   * > [!NOTE]
   * > Forking a repository happens asynchronously. You may have to wait up to 5 minutes before you can access the fork.
   *
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesCreateForkApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded SecurityAdvisoriesCreateForkError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesCreateFork(
    ghsaId: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): FullRepository = executor.executeWithTypedErrors<Unit, SecurityAdvisoriesCreateForkResponse, FullRepository>(
    request = SdkExecutionRequest(securityAdvisoriesCreateForkMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesCreateForkRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesCreateForkResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesCreateForkResponse.SuccessJson -> response.json
        is SecurityAdvisoriesCreateForkResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateForkResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateForkResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateForkResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateForkResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateForkResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesCreateForkResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesCreateForkResponse.Http400Json -> SecurityAdvisoriesCreateForkApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateForkResponse.Http400ScimJson -> SecurityAdvisoriesCreateForkApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateForkResponse.Http403Json -> SecurityAdvisoriesCreateForkApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateForkResponse.Http404Json -> SecurityAdvisoriesCreateForkApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateForkResponse.Http422Json -> SecurityAdvisoriesCreateForkApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateForkResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a temporary private fork to collaborate on fixing a security vulnerability in your repository.
   *
   * > [!NOTE]
   * > Forking a repository happens asynchronously. You may have to wait up to 5 minutes before you can access the fork.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesCreateForkWithResponse(
    ghsaId: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesCreateForkResponse> = executor.executeWithResponse<Unit, SecurityAdvisoriesCreateForkResponse>(SdkExecutionRequest(securityAdvisoriesCreateForkMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesCreateForkRequestCodecRegistry, SecurityAdvisoriesCreateForkResponseDecoder, options)

  /**
   * Report a security vulnerability to the maintainers of the repository.
   * See "[Privately reporting a security
   * vulnerability](https://docs.github.com/code-security/security-advisories/guidance-on-reporting-and-writing/privatel
   * y-reporting-a-security-vulnerability)" for more information about private vulnerability reporting.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesCreatePrivateVulnerabilityReportApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * SecurityAdvisoriesCreatePrivateVulnerabilityReportError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesCreatePrivateVulnerabilityReport(
    request: PrivateVulnerabilityReportCreate,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): RepositoryAdvisory = executor.executeWithTypedErrors<PrivateVulnerabilityReportCreate, SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse, RepositoryAdvisory>(
    request = SdkExecutionRequest(securityAdvisoriesCreatePrivateVulnerabilityReportMetadata, baseUri, request, listOf(SecurityAdvisoriesCodecs.SECURITYADVISORIESCREATEPRIVATEVULNERABILITYREPORT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesCreatePrivateVulnerabilityReportRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesCreatePrivateVulnerabilityReportResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.SuccessJson -> response.json
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http403Json -> SecurityAdvisoriesCreatePrivateVulnerabilityReportApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http404Json -> SecurityAdvisoriesCreatePrivateVulnerabilityReportApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http422Json -> SecurityAdvisoriesCreatePrivateVulnerabilityReportApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Report a security vulnerability to the maintainers of the repository.
   * See "[Privately reporting a security
   * vulnerability](https://docs.github.com/code-security/security-advisories/guidance-on-reporting-and-writing/privatel
   * y-reporting-a-security-vulnerability)" for more information about private vulnerability reporting.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesCreatePrivateVulnerabilityReportWithResponse(
    request: PrivateVulnerabilityReportCreate,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse> = executor.executeWithResponse<PrivateVulnerabilityReportCreate, SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse>(SdkExecutionRequest(securityAdvisoriesCreatePrivateVulnerabilityReportMetadata, baseUri, request, listOf(SecurityAdvisoriesCodecs.SECURITYADVISORIESCREATEPRIVATEVULNERABILITYREPORT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesCreatePrivateVulnerabilityReportRequestCodecRegistry, SecurityAdvisoriesCreatePrivateVulnerabilityReportResponseDecoder, options)

  /**
   * Creates a new repository security advisory.
   *
   * In order to create a draft repository security advisory, the authenticated user must be a security manager or
   * administrator of that repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:write` scope to use
   * this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesCreateRepositoryAdvisoryApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecurityAdvisoriesCreateRepositoryAdvisoryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesCreateRepositoryAdvisory(
    request: RepositoryAdvisoryCreate,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): RepositoryAdvisory = executor.executeWithTypedErrors<RepositoryAdvisoryCreate, SecurityAdvisoriesCreateRepositoryAdvisoryResponse, RepositoryAdvisory>(
    request = SdkExecutionRequest(securityAdvisoriesCreateRepositoryAdvisoryMetadata, baseUri, request, listOf(SecurityAdvisoriesCodecs.SECURITYADVISORIESCREATEREPOSITORYADVISORY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesCreateRepositoryAdvisoryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.SuccessJson -> response.json
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http403Json -> SecurityAdvisoriesCreateRepositoryAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http404Json -> SecurityAdvisoriesCreateRepositoryAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http422Json -> SecurityAdvisoriesCreateRepositoryAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new repository security advisory.
   *
   * In order to create a draft repository security advisory, the authenticated user must be a security manager or
   * administrator of that repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:write` scope to use
   * this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesCreateRepositoryAdvisoryWithResponse(
    request: RepositoryAdvisoryCreate,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesCreateRepositoryAdvisoryResponse> = executor.executeWithResponse<RepositoryAdvisoryCreate, SecurityAdvisoriesCreateRepositoryAdvisoryResponse>(SdkExecutionRequest(securityAdvisoriesCreateRepositoryAdvisoryMetadata, baseUri, request, listOf(SecurityAdvisoriesCodecs.SECURITYADVISORIESCREATEREPOSITORYADVISORY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryRequestCodecRegistry, SecurityAdvisoriesCreateRepositoryAdvisoryResponseDecoder, options)

  /**
   * If you want a CVE identification number for the security vulnerability in your project, and don't already have one,
   * you can request a CVE identification number from GitHub. For more information see "[Requesting a CVE identification
   * number](https://docs.github.com/code-security/security-advisories/repository-security-advisories/publishing-a-repos
   * itory-security-advisory#requesting-a-cve-identification-number-optional)."
   *
   * You may request a CVE for public repositories, but cannot do so for private repositories.
   *
   * In order to request a CVE for a repository security advisory, the authenticated user must be a security manager or
   * administrator of that repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:write` scope to use
   * this endpoint.
   *
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesCreateRepositoryAdvisoryCveRequest(
    ghsaId: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.executeWithTypedErrors<Unit, SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse, JsonObject>(
    request = SdkExecutionRequest(securityAdvisoriesCreateRepositoryAdvisoryCveRequestMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryCveRequestRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.SuccessJson -> response.json
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http400Json -> SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http400ScimJson -> SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http403Json -> SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http404Json -> SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http422Json -> SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestApiException(response, statusCode, headers)
        is SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * If you want a CVE identification number for the security vulnerability in your project, and don't already have one,
   * you can request a CVE identification number from GitHub. For more information see "[Requesting a CVE identification
   * number](https://docs.github.com/code-security/security-advisories/repository-security-advisories/publishing-a-repos
   * itory-security-advisory#requesting-a-cve-identification-number-optional)."
   *
   * You may request a CVE for public repositories, but cannot do so for private repositories.
   *
   * In order to request a CVE for a repository security advisory, the authenticated user must be a security manager or
   * administrator of that repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:write` scope to use
   * this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesCreateRepositoryAdvisoryCveRequestWithResponse(
    ghsaId: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse> = executor.executeWithResponse<Unit, SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse>(SdkExecutionRequest(securityAdvisoriesCreateRepositoryAdvisoryCveRequestMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryCveRequestRequestCodecRegistry, SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseDecoder, options)

  /**
   * Gets a global security advisory using its GitHub Security Advisory (GHSA) identifier.
   *
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesGetGlobalAdvisoryApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded SecurityAdvisoriesGetGlobalAdvisoryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesGetGlobalAdvisory(ghsaId: String, options: CallOptions = CallOptions()): GlobalAdvisory = executor.executeWithTypedErrors<Unit, SecurityAdvisoriesGetGlobalAdvisoryResponse, GlobalAdvisory>(
    request = SdkExecutionRequest(securityAdvisoriesGetGlobalAdvisoryMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesGetGlobalAdvisoryRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesGetGlobalAdvisoryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesGetGlobalAdvisoryResponse.SuccessJson -> response.json
        is SecurityAdvisoriesGetGlobalAdvisoryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesGetGlobalAdvisoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesGetGlobalAdvisoryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesGetGlobalAdvisoryResponse.Http404Json -> SecurityAdvisoriesGetGlobalAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesGetGlobalAdvisoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a global security advisory using its GitHub Security Advisory (GHSA) identifier.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesGetGlobalAdvisoryWithResponse(ghsaId: String, options: CallOptions = CallOptions()): SdkResponseResult<SecurityAdvisoriesGetGlobalAdvisoryResponse> = executor.executeWithResponse<Unit, SecurityAdvisoriesGetGlobalAdvisoryResponse>(SdkExecutionRequest(securityAdvisoriesGetGlobalAdvisoryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesGetGlobalAdvisoryRequestCodecRegistry, SecurityAdvisoriesGetGlobalAdvisoryResponseDecoder, options)

  /**
   * Get a repository security advisory using its GitHub Security Advisory (GHSA) identifier.
   *
   * Anyone can access any published security advisory on a public repository.
   *
   * The authenticated user can access an unpublished security advisory from a repository if they are a security manager
   * or administrator of that repository, or if they are a
   * collaborator on the security advisory.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:read` scope to to
   * get a published security advisory in a private repository, or any unpublished security advisory that the
   * authenticated user has access to.
   *
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesGetRepositoryAdvisoryApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecurityAdvisoriesGetRepositoryAdvisoryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesGetRepositoryAdvisory(
    ghsaId: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): RepositoryAdvisory = executor.executeWithTypedErrors<Unit, SecurityAdvisoriesGetRepositoryAdvisoryResponse, RepositoryAdvisory>(
    request = SdkExecutionRequest(securityAdvisoriesGetRepositoryAdvisoryMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesGetRepositoryAdvisoryRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesGetRepositoryAdvisoryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesGetRepositoryAdvisoryResponse.SuccessJson -> response.json
        is SecurityAdvisoriesGetRepositoryAdvisoryResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesGetRepositoryAdvisoryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesGetRepositoryAdvisoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesGetRepositoryAdvisoryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesGetRepositoryAdvisoryResponse.Http403Json -> SecurityAdvisoriesGetRepositoryAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesGetRepositoryAdvisoryResponse.Http404Json -> SecurityAdvisoriesGetRepositoryAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesGetRepositoryAdvisoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a repository security advisory using its GitHub Security Advisory (GHSA) identifier.
   *
   * Anyone can access any published security advisory on a public repository.
   *
   * The authenticated user can access an unpublished security advisory from a repository if they are a security manager
   * or administrator of that repository, or if they are a
   * collaborator on the security advisory.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:read` scope to to
   * get a published security advisory in a private repository, or any unpublished security advisory that the
   * authenticated user has access to.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesGetRepositoryAdvisoryWithResponse(
    ghsaId: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesGetRepositoryAdvisoryResponse> = executor.executeWithResponse<Unit, SecurityAdvisoriesGetRepositoryAdvisoryResponse>(SdkExecutionRequest(securityAdvisoriesGetRepositoryAdvisoryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesGetRepositoryAdvisoryRequestCodecRegistry, SecurityAdvisoriesGetRepositoryAdvisoryResponseDecoder, options)

  /**
   * Lists all global security advisories that match the specified parameters. If no other parameters are defined, the
   * request will return only GitHub-reviewed advisories that are not malware.
   *
   * By default, all responses will exclude advisories for malware, because malware are not standard vulnerabilities. To
   * list advisories for malware, you must include the `type` parameter in your request, with the value `malware`. For
   * more information about the different types of security advisories, see "[About the GitHub Advisory
   * database](https://docs.github.com/code-security/security-advisories/global-security-advisories/about-the-github-adv
   * isory-database#about-types-of-security-advisories)."
   *
   * @param affects If specified, only return advisories that affect any of `package` or `package@version`. A maximum of
   * 1000 packages can be specified.
   * If the query parameter causes the URL to exceed the maximum URL length supported by your client, you must specify
   * fewer packages.
   *
   * Example: `affects=package1,package2@1.0.0,package3@2.0.0` or `affects[]=package1&affects[]=package2@1.0.0`
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param cveId If specified, only advisories with this CVE (Common Vulnerabilities and Exposures) identifier will be
   * returned.
   * @param cwes If specified, only advisories with these Common Weakness Enumerations (CWEs) will be returned.
   *
   * Example: `cwes=79,284,22` or `cwes[]=79&cwes[]=284&cwes[]=22`
   * @param direction The direction to sort the results by.
   * @param ecosystem If specified, only advisories for these ecosystems will be returned.
   * @param epssPercentage If specified, only return advisories that have an EPSS percentage score that matches the
   * provided value.
   * The EPSS percentage represents the likelihood of a CVE being exploited.
   * @param epssPercentile If specified, only return advisories that have an EPSS percentile score that matches the
   * provided value.
   * The EPSS percentile represents the relative rank of the CVE's likelihood of being exploited compared to other CVEs.
   * @param ghsaId If specified, only advisories with this GHSA (GitHub Security Advisory) identifier will be returned.
   * @param isWithdrawn Whether to only return advisories that have been withdrawn.
   * @param modified If specified, only show advisories that were updated or published on a date or date range.
   *
   * For more information on the syntax of the date range, see "[Understanding the search
   * syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syn
   * tax#query-for-dates)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param published If specified, only return advisories that were published on a date or date range.
   *
   * For more information on the syntax of the date range, see "[Understanding the search
   * syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syn
   * tax#query-for-dates)."
   * @param severity If specified, only advisories with these severities will be returned.
   * @param sort The property to sort the results by.
   * @param type If specified, only advisories of this type will be returned. By default, a request with no other
   * parameters defined will only return reviewed advisories that are not malware.
   * @param updated If specified, only return advisories that were updated on a date or date range.
   *
   * For more information on the syntax of the date range, see "[Understanding the search
   * syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syn
   * tax#query-for-dates)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesListGlobalAdvisoriesApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecurityAdvisoriesListGlobalAdvisoriesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesListGlobalAdvisories(
    affects: InlineAdvisoriesGetParameterX1b867e04? = null,
    after: String? = null,
    before: String? = null,
    cveId: String? = null,
    cwes: InlineAdvisoriesGetParameterX30a5385f? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    ecosystem: SecurityAdvisoryEcosystems? = null,
    epssPercentage: String? = null,
    epssPercentile: String? = null,
    ghsaId: String? = null,
    isWithdrawn: Boolean? = null,
    modified: String? = null,
    perPage: Int? = null,
    published: String? = null,
    severity: InlineAdvisoriesGetParameterX03370d32? = null,
    sort: InlineAdvisoriesGetParameterXd99c6675? = null,
    type: InlineAdvisoriesGetParameterXc0ca6916? = null,
    updated: String? = null,
    options: CallOptions = CallOptions(),
  ): List<GlobalAdvisory> = executor.executeWithTypedErrors<Unit, SecurityAdvisoriesListGlobalAdvisoriesResponse, List<GlobalAdvisory>>(
    request = SdkExecutionRequest(securityAdvisoriesListGlobalAdvisoriesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "affects", values = affects?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cve_id", values = cveId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cwes", values = cwes?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ecosystem", values = ecosystem?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentage", values = epssPercentage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentile", values = epssPercentile?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ghsa_id", values = ghsaId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_withdrawn", values = isWithdrawn?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "modified", values = modified?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "published", values = published?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "updated", values = updated?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesListGlobalAdvisoriesRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesListGlobalAdvisoriesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesListGlobalAdvisoriesResponse.SuccessJson -> response.json
        is SecurityAdvisoriesListGlobalAdvisoriesResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesListGlobalAdvisoriesResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesListGlobalAdvisoriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesListGlobalAdvisoriesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesListGlobalAdvisoriesResponse.Http422Json -> SecurityAdvisoriesListGlobalAdvisoriesApiException(response, statusCode, headers)
        is SecurityAdvisoriesListGlobalAdvisoriesResponse.Http429Json -> SecurityAdvisoriesListGlobalAdvisoriesApiException(response, statusCode, headers)
        is SecurityAdvisoriesListGlobalAdvisoriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all global security advisories that match the specified parameters. If no other parameters are defined, the
   * request will return only GitHub-reviewed advisories that are not malware.
   *
   * By default, all responses will exclude advisories for malware, because malware are not standard vulnerabilities. To
   * list advisories for malware, you must include the `type` parameter in your request, with the value `malware`. For
   * more information about the different types of security advisories, see "[About the GitHub Advisory
   * database](https://docs.github.com/code-security/security-advisories/global-security-advisories/about-the-github-adv
   * isory-database#about-types-of-security-advisories)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param affects If specified, only return advisories that affect any of `package` or `package@version`. A maximum of
   * 1000 packages can be specified.
   * If the query parameter causes the URL to exceed the maximum URL length supported by your client, you must specify
   * fewer packages.
   *
   * Example: `affects=package1,package2@1.0.0,package3@2.0.0` or `affects[]=package1&affects[]=package2@1.0.0`
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param cveId If specified, only advisories with this CVE (Common Vulnerabilities and Exposures) identifier will be
   * returned.
   * @param cwes If specified, only advisories with these Common Weakness Enumerations (CWEs) will be returned.
   *
   * Example: `cwes=79,284,22` or `cwes[]=79&cwes[]=284&cwes[]=22`
   * @param direction The direction to sort the results by.
   * @param ecosystem If specified, only advisories for these ecosystems will be returned.
   * @param epssPercentage If specified, only return advisories that have an EPSS percentage score that matches the
   * provided value.
   * The EPSS percentage represents the likelihood of a CVE being exploited.
   * @param epssPercentile If specified, only return advisories that have an EPSS percentile score that matches the
   * provided value.
   * The EPSS percentile represents the relative rank of the CVE's likelihood of being exploited compared to other CVEs.
   * @param ghsaId If specified, only advisories with this GHSA (GitHub Security Advisory) identifier will be returned.
   * @param isWithdrawn Whether to only return advisories that have been withdrawn.
   * @param modified If specified, only show advisories that were updated or published on a date or date range.
   *
   * For more information on the syntax of the date range, see "[Understanding the search
   * syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syn
   * tax#query-for-dates)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param published If specified, only return advisories that were published on a date or date range.
   *
   * For more information on the syntax of the date range, see "[Understanding the search
   * syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syn
   * tax#query-for-dates)."
   * @param severity If specified, only advisories with these severities will be returned.
   * @param sort The property to sort the results by.
   * @param type If specified, only advisories of this type will be returned. By default, a request with no other
   * parameters defined will only return reviewed advisories that are not malware.
   * @param updated If specified, only return advisories that were updated on a date or date range.
   *
   * For more information on the syntax of the date range, see "[Understanding the search
   * syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syn
   * tax#query-for-dates)."
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesListGlobalAdvisoriesWithResponse(
    affects: InlineAdvisoriesGetParameterX1b867e04? = null,
    after: String? = null,
    before: String? = null,
    cveId: String? = null,
    cwes: InlineAdvisoriesGetParameterX30a5385f? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    ecosystem: SecurityAdvisoryEcosystems? = null,
    epssPercentage: String? = null,
    epssPercentile: String? = null,
    ghsaId: String? = null,
    isWithdrawn: Boolean? = null,
    modified: String? = null,
    perPage: Int? = null,
    published: String? = null,
    severity: InlineAdvisoriesGetParameterX03370d32? = null,
    sort: InlineAdvisoriesGetParameterXd99c6675? = null,
    type: InlineAdvisoriesGetParameterXc0ca6916? = null,
    updated: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesListGlobalAdvisoriesResponse> = executor.executeWithResponse<Unit, SecurityAdvisoriesListGlobalAdvisoriesResponse>(SdkExecutionRequest(securityAdvisoriesListGlobalAdvisoriesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "affects", values = affects?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cve_id", values = cveId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cwes", values = cwes?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ecosystem", values = ecosystem?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentage", values = epssPercentage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentile", values = epssPercentile?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ghsa_id", values = ghsaId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_withdrawn", values = isWithdrawn?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "modified", values = modified?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "published", values = published?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "updated", values = updated?.let { listOf(it.toString()) }.orEmpty()))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesListGlobalAdvisoriesRequestCodecRegistry, SecurityAdvisoriesListGlobalAdvisoriesResponseDecoder, options)

  /**
   * Lists repository security advisories for an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:write` scope to use
   * this endpoint.
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
   * @param direction The direction to sort the results by.
   * @param perPage The number of advisories to return per page. For more information, see "[Using pagination in the
   * REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by.
   * @param state Filter by the state of the repository advisories. Only advisories of this state will be returned.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesListOrgRepositoryAdvisoriesApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecurityAdvisoriesListOrgRepositoryAdvisoriesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesListOrgRepositoryAdvisories(
    org: String,
    after: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    perPage: Int? = null,
    sort: InlineOrgsSecurityAdvisoriesGetParameterX501de1d8? = null,
    state: InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4? = null,
    options: CallOptions = CallOptions(),
  ): List<RepositoryAdvisory> = executor.executeWithTypedErrors<Unit, SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse, List<RepositoryAdvisory>>(
    request = SdkExecutionRequest(securityAdvisoriesListOrgRepositoryAdvisoriesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesListOrgRepositoryAdvisoriesRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesListOrgRepositoryAdvisoriesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.SuccessJson -> response.json
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http400Json -> SecurityAdvisoriesListOrgRepositoryAdvisoriesApiException(response, statusCode, headers)
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http400ScimJson -> SecurityAdvisoriesListOrgRepositoryAdvisoriesApiException(response, statusCode, headers)
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http404Json -> SecurityAdvisoriesListOrgRepositoryAdvisoriesApiException(response, statusCode, headers)
        is SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists repository security advisories for an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:write` scope to use
   * this endpoint.
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
   * @param direction The direction to sort the results by.
   * @param perPage The number of advisories to return per page. For more information, see "[Using pagination in the
   * REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by.
   * @param state Filter by the state of the repository advisories. Only advisories of this state will be returned.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesListOrgRepositoryAdvisoriesWithResponse(
    org: String,
    after: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    perPage: Int? = null,
    sort: InlineOrgsSecurityAdvisoriesGetParameterX501de1d8? = null,
    state: InlineOrgsSecurityAdvisoriesGetParameterX36fabcf4? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse> = executor.executeWithResponse<Unit, SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse>(SdkExecutionRequest(securityAdvisoriesListOrgRepositoryAdvisoriesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesListOrgRepositoryAdvisoriesRequestCodecRegistry, SecurityAdvisoriesListOrgRepositoryAdvisoriesResponseDecoder, options)

  /**
   * Lists security advisories in a repository.
   *
   * The authenticated user can access unpublished security advisories from a repository if they are a security manager
   * or administrator of that repository, or if they are a collaborator on any security advisory.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:read` scope to to
   * get a published security advisory in a private repository, or any unpublished security advisory that the
   * authenticated user has access to.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param direction The direction to sort the results by.
   * @param perPage The number of advisories to return per page. For more information, see "[Using pagination in the
   * REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by.
   * @param state Filter by state of the repository advisories. Only advisories of this state will be returned.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesListRepositoryAdvisoriesApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecurityAdvisoriesListRepositoryAdvisoriesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesListRepositoryAdvisories(
    owner: String,
    repo: String,
    after: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    perPage: Int? = null,
    sort: InlineReposSecurityAdvisoriesGetParameterX3cc08ffc? = null,
    state: InlineReposSecurityAdvisoriesGetParameterXbf4c0a91? = null,
    options: CallOptions = CallOptions(),
  ): List<RepositoryAdvisory> = executor.executeWithTypedErrors<Unit, SecurityAdvisoriesListRepositoryAdvisoriesResponse, List<RepositoryAdvisory>>(
    request = SdkExecutionRequest(securityAdvisoriesListRepositoryAdvisoriesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesListRepositoryAdvisoriesRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesListRepositoryAdvisoriesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.SuccessJson -> response.json
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http400Json -> SecurityAdvisoriesListRepositoryAdvisoriesApiException(response, statusCode, headers)
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http400ScimJson -> SecurityAdvisoriesListRepositoryAdvisoriesApiException(response, statusCode, headers)
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http404Json -> SecurityAdvisoriesListRepositoryAdvisoriesApiException(response, statusCode, headers)
        is SecurityAdvisoriesListRepositoryAdvisoriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists security advisories in a repository.
   *
   * The authenticated user can access unpublished security advisories from a repository if they are a security manager
   * or administrator of that repository, or if they are a collaborator on any security advisory.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:read` scope to to
   * get a published security advisory in a private repository, or any unpublished security advisory that the
   * authenticated user has access to.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param direction The direction to sort the results by.
   * @param perPage The number of advisories to return per page. For more information, see "[Using pagination in the
   * REST API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by.
   * @param state Filter by state of the repository advisories. Only advisories of this state will be returned.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesListRepositoryAdvisoriesWithResponse(
    owner: String,
    repo: String,
    after: String? = null,
    before: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    perPage: Int? = null,
    sort: InlineReposSecurityAdvisoriesGetParameterX3cc08ffc? = null,
    state: InlineReposSecurityAdvisoriesGetParameterXbf4c0a91? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesListRepositoryAdvisoriesResponse> = executor.executeWithResponse<Unit, SecurityAdvisoriesListRepositoryAdvisoriesResponse>(SdkExecutionRequest(securityAdvisoriesListRepositoryAdvisoriesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesListRepositoryAdvisoriesRequestCodecRegistry, SecurityAdvisoriesListRepositoryAdvisoriesResponseDecoder, options)

  /**
   * Update a repository security advisory using its GitHub Security Advisory (GHSA) identifier.
   *
   * In order to update any security advisory, the authenticated user must be a security manager or administrator of
   * that repository,
   * or a collaborator on the repository security advisory.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:write` scope to use
   * this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SecurityAdvisoriesUpdateRepositoryAdvisoryApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded SecurityAdvisoriesUpdateRepositoryAdvisoryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun securityAdvisoriesUpdateRepositoryAdvisory(
    request: RepositoryAdvisoryUpdate,
    ghsaId: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): RepositoryAdvisory = executor.executeWithTypedErrors<RepositoryAdvisoryUpdate, SecurityAdvisoriesUpdateRepositoryAdvisoryResponse, RepositoryAdvisory>(
    request = SdkExecutionRequest(securityAdvisoriesUpdateRepositoryAdvisoryMetadata, baseUri, request, listOf(SecurityAdvisoriesCodecs.SECURITYADVISORIESUPDATEREPOSITORYADVISORY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = SecurityAdvisoriesCodecs.securityAdvisoriesUpdateRepositoryAdvisoryRequestCodecRegistry,
    responseDecoder = SecurityAdvisoriesUpdateRepositoryAdvisoryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.SuccessJson -> response.json
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http403Json -> SecurityAdvisoriesUpdateRepositoryAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http404Json -> SecurityAdvisoriesUpdateRepositoryAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http422Json -> SecurityAdvisoriesUpdateRepositoryAdvisoryApiException(response, statusCode, headers)
        is SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update a repository security advisory using its GitHub Security Advisory (GHSA) identifier.
   *
   * In order to update any security advisory, the authenticated user must be a security manager or administrator of
   * that repository,
   * or a collaborator on the repository security advisory.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `repository_advisories:write` scope to use
   * this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param ghsaId The GHSA (GitHub Security Advisory) identifier of the advisory.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun securityAdvisoriesUpdateRepositoryAdvisoryWithResponse(
    request: RepositoryAdvisoryUpdate,
    ghsaId: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SecurityAdvisoriesUpdateRepositoryAdvisoryResponse> = executor.executeWithResponse<RepositoryAdvisoryUpdate, SecurityAdvisoriesUpdateRepositoryAdvisoryResponse>(SdkExecutionRequest(securityAdvisoriesUpdateRepositoryAdvisoryMetadata, baseUri, request, listOf(SecurityAdvisoriesCodecs.SECURITYADVISORIESUPDATEREPOSITORYADVISORY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ghsa_id", values = listOf(ghsaId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), SecurityAdvisoriesCodecs.securityAdvisoriesUpdateRepositoryAdvisoryRequestCodecRegistry, SecurityAdvisoriesUpdateRepositoryAdvisoryResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `security-advisories/create-fork` may expose through its typed API
   * exception.
   */
  public sealed interface SecurityAdvisoriesCreateForkError

  /**
   * Typed response alternatives for `security-advisories/create-fork`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface SecurityAdvisoriesCreateForkResponse {
    public class SuccessJson(
      public val json: FullRepository,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateForkResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateForkResponse,
        SecurityAdvisoriesCreateForkError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateForkResponse,
        SecurityAdvisoriesCreateForkError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateForkResponse,
        SecurityAdvisoriesCreateForkError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateForkResponse,
        SecurityAdvisoriesCreateForkError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateForkResponse,
        SecurityAdvisoriesCreateForkError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateForkResponse
  }

  /**
   * Raised by `security-advisories/create-fork` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesCreateForkApiException(
    public val error: SecurityAdvisoriesCreateForkError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/create-fork")

  private object SecurityAdvisoriesCreateForkResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesCreateForkResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesCreateForkResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesCreateForkResponse> = when {
      alternative.id == "security-advisories/create-fork.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateForkResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateForkResponseCodecAlternative0Registry.select(listOf("security-advisories/create-fork.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-fork.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateForkResponse.Http400Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateForkResponseCodecAlternative1Registry.select(listOf("security-advisories/create-fork.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-fork.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateForkResponse.Http400ScimJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateForkResponseCodecAlternative2Registry.select(listOf("security-advisories/create-fork.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-fork.response.alternative3" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateForkResponse.Http403Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateForkResponseCodecAlternative3Registry.select(listOf("security-advisories/create-fork.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-fork.response.alternative4" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateForkResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateForkResponseCodecAlternative4Registry.select(listOf("security-advisories/create-fork.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-fork.response.alternative5" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateForkResponse.Http422Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateForkResponseCodecAlternative5Registry.select(listOf("security-advisories/create-fork.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesCreateForkResponse = SecurityAdvisoriesCreateForkResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/create-private-vulnerability-report` may expose
   * through its typed API exception.
   */
  public sealed interface SecurityAdvisoriesCreatePrivateVulnerabilityReportError

  /**
   * Typed response alternatives for `security-advisories/create-private-vulnerability-report`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse {
    public class SuccessJson(
      public val json: RepositoryAdvisory,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse,
        SecurityAdvisoriesCreatePrivateVulnerabilityReportError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse,
        SecurityAdvisoriesCreatePrivateVulnerabilityReportError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse,
        SecurityAdvisoriesCreatePrivateVulnerabilityReportError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse
  }

  /**
   * Raised by `security-advisories/create-private-vulnerability-report` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesCreatePrivateVulnerabilityReportApiException(
    public val error: SecurityAdvisoriesCreatePrivateVulnerabilityReportError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/create-private-vulnerability-report")

  private object SecurityAdvisoriesCreatePrivateVulnerabilityReportResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse> = when {
      alternative.id == "security-advisories/create-private-vulnerability-report.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative0Registry.select(listOf("security-advisories/create-private-vulnerability-report.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-private-vulnerability-report.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http403Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative1Registry.select(listOf("security-advisories/create-private-vulnerability-report.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-private-vulnerability-report.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative2Registry.select(listOf("security-advisories/create-private-vulnerability-report.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-private-vulnerability-report.response.alternative3" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Http422Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreatePrivateVulnerabilityReportResponseCodecAlternative3Registry.select(listOf("security-advisories/create-private-vulnerability-report.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse = SecurityAdvisoriesCreatePrivateVulnerabilityReportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/create-repository-advisory` may expose through
   * its typed API exception.
   */
  public sealed interface SecurityAdvisoriesCreateRepositoryAdvisoryError

  /**
   * Typed response alternatives for `security-advisories/create-repository-advisory`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecurityAdvisoriesCreateRepositoryAdvisoryResponse {
    public class SuccessJson(
      public val json: RepositoryAdvisory,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryResponse,
        SecurityAdvisoriesCreateRepositoryAdvisoryError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryResponse,
        SecurityAdvisoriesCreateRepositoryAdvisoryError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryResponse,
        SecurityAdvisoriesCreateRepositoryAdvisoryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryResponse
  }

  /**
   * Raised by `security-advisories/create-repository-advisory` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesCreateRepositoryAdvisoryApiException(
    public val error: SecurityAdvisoriesCreateRepositoryAdvisoryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/create-repository-advisory")

  private object SecurityAdvisoriesCreateRepositoryAdvisoryResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesCreateRepositoryAdvisoryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesCreateRepositoryAdvisoryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesCreateRepositoryAdvisoryResponse> = when {
      alternative.id == "security-advisories/create-repository-advisory.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative0Registry.select(listOf("security-advisories/create-repository-advisory.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-repository-advisory.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http403Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative1Registry.select(listOf("security-advisories/create-repository-advisory.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-repository-advisory.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative2Registry.select(listOf("security-advisories/create-repository-advisory.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-repository-advisory.response.alternative3" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Http422Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryResponseCodecAlternative3Registry.select(listOf("security-advisories/create-repository-advisory.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesCreateRepositoryAdvisoryResponse = SecurityAdvisoriesCreateRepositoryAdvisoryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/create-repository-advisory-cve-request` may
   * expose through its typed API exception.
   */
  public sealed interface SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestError

  /**
   * Typed response alternatives for `security-advisories/create-repository-advisory-cve-request`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse,
        SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse,
        SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse,
        SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse,
        SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse,
        SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse
  }

  /**
   * Raised by `security-advisories/create-repository-advisory-cve-request` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestApiException(
    public val error: SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/create-repository-advisory-cve-request")

  private object SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse> = when {
      alternative.id == "security-advisories/create-repository-advisory-cve-request.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative0Registry.select(listOf("security-advisories/create-repository-advisory-cve-request.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-repository-advisory-cve-request.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http400Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative1Registry.select(listOf("security-advisories/create-repository-advisory-cve-request.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-repository-advisory-cve-request.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http400ScimJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative2Registry.select(listOf("security-advisories/create-repository-advisory-cve-request.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-repository-advisory-cve-request.response.alternative3" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http403Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative3Registry.select(listOf("security-advisories/create-repository-advisory-cve-request.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-repository-advisory-cve-request.response.alternative4" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative4Registry.select(listOf("security-advisories/create-repository-advisory-cve-request.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/create-repository-advisory-cve-request.response.alternative5" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Http422Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesCreateRepositoryAdvisoryCveRequestResponseCodecAlternative5Registry.select(listOf("security-advisories/create-repository-advisory-cve-request.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse = SecurityAdvisoriesCreateRepositoryAdvisoryCveRequestResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/get-global-advisory` may expose through its
   * typed API exception.
   */
  public sealed interface SecurityAdvisoriesGetGlobalAdvisoryError

  /**
   * Typed response alternatives for `security-advisories/get-global-advisory`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecurityAdvisoriesGetGlobalAdvisoryResponse {
    public class SuccessJson(
      public val json: GlobalAdvisory,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesGetGlobalAdvisoryResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesGetGlobalAdvisoryResponse,
        SecurityAdvisoriesGetGlobalAdvisoryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesGetGlobalAdvisoryResponse
  }

  /**
   * Raised by `security-advisories/get-global-advisory` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesGetGlobalAdvisoryApiException(
    public val error: SecurityAdvisoriesGetGlobalAdvisoryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/get-global-advisory")

  private object SecurityAdvisoriesGetGlobalAdvisoryResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesGetGlobalAdvisoryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesGetGlobalAdvisoryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesGetGlobalAdvisoryResponse> = when {
      alternative.id == "security-advisories/get-global-advisory.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesGetGlobalAdvisoryResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesGetGlobalAdvisoryResponseCodecAlternative0Registry.select(listOf("security-advisories/get-global-advisory.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/get-global-advisory.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesGetGlobalAdvisoryResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesGetGlobalAdvisoryResponseCodecAlternative1Registry.select(listOf("security-advisories/get-global-advisory.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesGetGlobalAdvisoryResponse = SecurityAdvisoriesGetGlobalAdvisoryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/get-repository-advisory` may expose through its
   * typed API exception.
   */
  public sealed interface SecurityAdvisoriesGetRepositoryAdvisoryError

  /**
   * Typed response alternatives for `security-advisories/get-repository-advisory`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecurityAdvisoriesGetRepositoryAdvisoryResponse {
    public class SuccessJson(
      public val json: RepositoryAdvisory,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesGetRepositoryAdvisoryResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesGetRepositoryAdvisoryResponse,
        SecurityAdvisoriesGetRepositoryAdvisoryError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesGetRepositoryAdvisoryResponse,
        SecurityAdvisoriesGetRepositoryAdvisoryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesGetRepositoryAdvisoryResponse
  }

  /**
   * Raised by `security-advisories/get-repository-advisory` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesGetRepositoryAdvisoryApiException(
    public val error: SecurityAdvisoriesGetRepositoryAdvisoryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/get-repository-advisory")

  private object SecurityAdvisoriesGetRepositoryAdvisoryResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesGetRepositoryAdvisoryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesGetRepositoryAdvisoryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesGetRepositoryAdvisoryResponse> = when {
      alternative.id == "security-advisories/get-repository-advisory.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesGetRepositoryAdvisoryResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative0Registry.select(listOf("security-advisories/get-repository-advisory.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/get-repository-advisory.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesGetRepositoryAdvisoryResponse.Http403Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative1Registry.select(listOf("security-advisories/get-repository-advisory.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/get-repository-advisory.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesGetRepositoryAdvisoryResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesGetRepositoryAdvisoryResponseCodecAlternative2Registry.select(listOf("security-advisories/get-repository-advisory.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesGetRepositoryAdvisoryResponse = SecurityAdvisoriesGetRepositoryAdvisoryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/list-global-advisories` may expose through its
   * typed API exception.
   */
  public sealed interface SecurityAdvisoriesListGlobalAdvisoriesError

  /**
   * Typed response alternatives for `security-advisories/list-global-advisories`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecurityAdvisoriesListGlobalAdvisoriesResponse {
    public class SuccessJson(
      public val json: List<GlobalAdvisory>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListGlobalAdvisoriesResponse

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListGlobalAdvisoriesResponse,
        SecurityAdvisoriesListGlobalAdvisoriesError

    public class Http429Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListGlobalAdvisoriesResponse,
        SecurityAdvisoriesListGlobalAdvisoriesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListGlobalAdvisoriesResponse
  }

  /**
   * Raised by `security-advisories/list-global-advisories` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesListGlobalAdvisoriesApiException(
    public val error: SecurityAdvisoriesListGlobalAdvisoriesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/list-global-advisories")

  private object SecurityAdvisoriesListGlobalAdvisoriesResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesListGlobalAdvisoriesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesListGlobalAdvisoriesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesListGlobalAdvisoriesResponse> = when {
      alternative.id == "security-advisories/list-global-advisories.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListGlobalAdvisoriesResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative0Registry.select(listOf("security-advisories/list-global-advisories.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/list-global-advisories.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListGlobalAdvisoriesResponse.Http422Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative1Registry.select(listOf("security-advisories/list-global-advisories.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/list-global-advisories.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListGlobalAdvisoriesResponse.Http429Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListGlobalAdvisoriesResponseCodecAlternative2Registry.select(listOf("security-advisories/list-global-advisories.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesListGlobalAdvisoriesResponse = SecurityAdvisoriesListGlobalAdvisoriesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/list-org-repository-advisories` may expose
   * through its typed API exception.
   */
  public sealed interface SecurityAdvisoriesListOrgRepositoryAdvisoriesError

  /**
   * Typed response alternatives for `security-advisories/list-org-repository-advisories`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse {
    public class SuccessJson(
      public val json: List<RepositoryAdvisory>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse,
        SecurityAdvisoriesListOrgRepositoryAdvisoriesError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse,
        SecurityAdvisoriesListOrgRepositoryAdvisoriesError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse,
        SecurityAdvisoriesListOrgRepositoryAdvisoriesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse
  }

  /**
   * Raised by `security-advisories/list-org-repository-advisories` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesListOrgRepositoryAdvisoriesApiException(
    public val error: SecurityAdvisoriesListOrgRepositoryAdvisoriesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/list-org-repository-advisories")

  private object SecurityAdvisoriesListOrgRepositoryAdvisoriesResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse> = when {
      alternative.id == "security-advisories/list-org-repository-advisories.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative0Registry.select(listOf("security-advisories/list-org-repository-advisories.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/list-org-repository-advisories.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http400Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative1Registry.select(listOf("security-advisories/list-org-repository-advisories.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/list-org-repository-advisories.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http400ScimJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative2Registry.select(listOf("security-advisories/list-org-repository-advisories.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/list-org-repository-advisories.response.alternative3" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListOrgRepositoryAdvisoriesResponseCodecAlternative3Registry.select(listOf("security-advisories/list-org-repository-advisories.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse = SecurityAdvisoriesListOrgRepositoryAdvisoriesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/list-repository-advisories` may expose through
   * its typed API exception.
   */
  public sealed interface SecurityAdvisoriesListRepositoryAdvisoriesError

  /**
   * Typed response alternatives for `security-advisories/list-repository-advisories`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecurityAdvisoriesListRepositoryAdvisoriesResponse {
    public class SuccessJson(
      public val json: List<RepositoryAdvisory>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListRepositoryAdvisoriesResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListRepositoryAdvisoriesResponse,
        SecurityAdvisoriesListRepositoryAdvisoriesError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListRepositoryAdvisoriesResponse,
        SecurityAdvisoriesListRepositoryAdvisoriesError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListRepositoryAdvisoriesResponse,
        SecurityAdvisoriesListRepositoryAdvisoriesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesListRepositoryAdvisoriesResponse
  }

  /**
   * Raised by `security-advisories/list-repository-advisories` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesListRepositoryAdvisoriesApiException(
    public val error: SecurityAdvisoriesListRepositoryAdvisoriesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/list-repository-advisories")

  private object SecurityAdvisoriesListRepositoryAdvisoriesResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesListRepositoryAdvisoriesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesListRepositoryAdvisoriesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesListRepositoryAdvisoriesResponse> = when {
      alternative.id == "security-advisories/list-repository-advisories.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListRepositoryAdvisoriesResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative0Registry.select(listOf("security-advisories/list-repository-advisories.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/list-repository-advisories.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http400Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative1Registry.select(listOf("security-advisories/list-repository-advisories.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/list-repository-advisories.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http400ScimJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative2Registry.select(listOf("security-advisories/list-repository-advisories.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/list-repository-advisories.response.alternative3" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesListRepositoryAdvisoriesResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesListRepositoryAdvisoriesResponseCodecAlternative3Registry.select(listOf("security-advisories/list-repository-advisories.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesListRepositoryAdvisoriesResponse = SecurityAdvisoriesListRepositoryAdvisoriesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `security-advisories/update-repository-advisory` may expose through
   * its typed API exception.
   */
  public sealed interface SecurityAdvisoriesUpdateRepositoryAdvisoryError

  /**
   * Typed response alternatives for `security-advisories/update-repository-advisory`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface SecurityAdvisoriesUpdateRepositoryAdvisoryResponse {
    public class SuccessJson(
      public val json: RepositoryAdvisory,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesUpdateRepositoryAdvisoryResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesUpdateRepositoryAdvisoryResponse,
        SecurityAdvisoriesUpdateRepositoryAdvisoryError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesUpdateRepositoryAdvisoryResponse,
        SecurityAdvisoriesUpdateRepositoryAdvisoryError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesUpdateRepositoryAdvisoryResponse,
        SecurityAdvisoriesUpdateRepositoryAdvisoryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SecurityAdvisoriesUpdateRepositoryAdvisoryResponse
  }

  /**
   * Raised by `security-advisories/update-repository-advisory` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class SecurityAdvisoriesUpdateRepositoryAdvisoryApiException(
    public val error: SecurityAdvisoriesUpdateRepositoryAdvisoryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "security-advisories/update-repository-advisory")

  private object SecurityAdvisoriesUpdateRepositoryAdvisoryResponseDecoder : SdkResponseAlternativeDecoder<SecurityAdvisoriesUpdateRepositoryAdvisoryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SecurityAdvisoriesUpdateRepositoryAdvisoryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SecurityAdvisoriesUpdateRepositoryAdvisoryResponse> = when {
      alternative.id == "security-advisories/update-repository-advisory.response.alternative0" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.SuccessJson(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative0Registry.select(listOf("security-advisories/update-repository-advisory.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/update-repository-advisory.response.alternative1" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http403Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative1Registry.select(listOf("security-advisories/update-repository-advisory.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/update-repository-advisory.response.alternative2" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http404Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative2Registry.select(listOf("security-advisories/update-repository-advisory.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "security-advisories/update-repository-advisory.response.alternative3" -> SdkResponseDecodeResult(
        value = SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Http422Json(
          json = SecurityAdvisoriesCodecs.securityAdvisoriesUpdateRepositoryAdvisoryResponseCodecAlternative3Registry.select(listOf("security-advisories/update-repository-advisory.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SecurityAdvisoriesUpdateRepositoryAdvisoryResponse = SecurityAdvisoriesUpdateRepositoryAdvisoryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val securityAdvisoriesCreateForkMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/create-fork",
          method = "POST",
          path = "/repos/{owner}/{repo}/security-advisories/{ghsa_id}/forks",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "FullRepository",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-fork.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-fork.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-fork.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-fork.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-fork.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-fork.response.alternative5",
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

    internal val securityAdvisoriesCreatePrivateVulnerabilityReportMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/create-private-vulnerability-report",
          method = "POST",
          path = "/repos/{owner}/{repo}/security-advisories/reports",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "RepositoryAdvisory",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-private-vulnerability-report.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-private-vulnerability-report.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-private-vulnerability-report.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-private-vulnerability-report.response.alternative3",
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

    internal val securityAdvisoriesCreateRepositoryAdvisoryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/create-repository-advisory",
          method = "POST",
          path = "/repos/{owner}/{repo}/security-advisories",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "RepositoryAdvisory",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory.response.alternative3",
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

    internal val securityAdvisoriesCreateRepositoryAdvisoryCveRequestMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/create-repository-advisory-cve-request",
          method = "POST",
          path = "/repos/{owner}/{repo}/security-advisories/{ghsa_id}/cve",
          requestMediaTypes = emptyList(),
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
              id = "security-advisories/create-repository-advisory-cve-request.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory-cve-request.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory-cve-request.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory-cve-request.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory-cve-request.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/create-repository-advisory-cve-request.response.alternative5",
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

    internal val securityAdvisoriesGetGlobalAdvisoryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/get-global-advisory",
          method = "GET",
          path = "/advisories/{ghsa_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GlobalAdvisory",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/get-global-advisory.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/get-global-advisory.response.alternative1",
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

    internal val securityAdvisoriesGetRepositoryAdvisoryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/get-repository-advisory",
          method = "GET",
          path = "/repos/{owner}/{repo}/security-advisories/{ghsa_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RepositoryAdvisory",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/get-repository-advisory.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/get-repository-advisory.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/get-repository-advisory.response.alternative2",
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

    internal val securityAdvisoriesListGlobalAdvisoriesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/list-global-advisories",
          method = "GET",
          path = "/advisories",
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
              id = "security-advisories/list-global-advisories.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/list-global-advisories.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/list-global-advisories.response.alternative2",
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

    internal val securityAdvisoriesListOrgRepositoryAdvisoriesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/list-org-repository-advisories",
          method = "GET",
          path = "/orgs/{org}/security-advisories",
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
              id = "security-advisories/list-org-repository-advisories.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/list-org-repository-advisories.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/list-org-repository-advisories.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/list-org-repository-advisories.response.alternative3",
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

    internal val securityAdvisoriesListRepositoryAdvisoriesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/list-repository-advisories",
          method = "GET",
          path = "/repos/{owner}/{repo}/security-advisories",
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
              id = "security-advisories/list-repository-advisories.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/list-repository-advisories.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/list-repository-advisories.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/list-repository-advisories.response.alternative3",
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

    internal val securityAdvisoriesUpdateRepositoryAdvisoryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "security-advisories/update-repository-advisory",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/security-advisories/{ghsa_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RepositoryAdvisory",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/update-repository-advisory.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/update-repository-advisory.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/update-repository-advisory.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "security-advisories/update-repository-advisory.response.alternative3",
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
