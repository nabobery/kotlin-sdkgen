package com.nabobery.sdkgen.github.generated.dependabot

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.DependabotAlert
import com.nabobery.sdkgen.github.generated.DependabotAlertWithRepository
import com.nabobery.sdkgen.github.generated.DependabotPublicKey
import com.nabobery.sdkgen.github.generated.DependabotRepositoryAccessDetails
import com.nabobery.sdkgen.github.generated.DependabotSecret
import com.nabobery.sdkgen.github.generated.InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0
import com.nabobery.sdkgen.github.generated.InlineDependabotAlertOrgScopeCommaSeparatedHasParameterX1d6a5933
import com.nabobery.sdkgen.github.generated.InlineDependabotAlertScopeParameterXf09886ca
import com.nabobery.sdkgen.github.generated.InlineDependabotAlertSortParameterX68d9890e
import com.nabobery.sdkgen.github.generated.InlineDirectionParameterX3053723f
import com.nabobery.sdkgen.github.generated.InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79
import com.nabobery.sdkgen.github.generated.InlineEnterprisesDependabotRepositoryAccessPatchRequestJsonX50899717
import com.nabobery.sdkgen.github.generated.InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319
import com.nabobery.sdkgen.github.generated.InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a
import com.nabobery.sdkgen.github.generated.InlineOrgsDependabotSecretsGetResponse200JsonX53aab923
import com.nabobery.sdkgen.github.generated.InlineOrgsDependabotSecretsPutRequestJsonXbdff5024
import com.nabobery.sdkgen.github.generated.InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee
import com.nabobery.sdkgen.github.generated.InlineOrgsDependabotSecretsRepositoriesPutRequestJsonX770db239
import com.nabobery.sdkgen.github.generated.InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b
import com.nabobery.sdkgen.github.generated.InlineReposDependabotSecretsGetResponse200JsonX6a1075a7
import com.nabobery.sdkgen.github.generated.InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c
import com.nabobery.sdkgen.github.generated.OrganizationDependabotSecret
import com.nabobery.sdkgen.github.generated.ScimError
import com.nabobery.sdkgen.github.generated.SdkJson
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.JsonObject

internal object DependabotCodecs {
  internal val dependabotAddSelectedRepoToOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val dependabotAddSelectedRepoToOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val DEPENDABOTCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID: String =
      "dependabot/create-or-update-org-secret.request"

  private val dependabotCreateOrUpdateOrgSecretRequestCodec:
      MediaTypeCodec<InlineOrgsDependabotSecretsPutRequestJsonXbdff5024> =
      KotlinxSerializationCodec(DEPENDABOTCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID, InlineOrgsDependabotSecretsPutRequestJsonXbdff5024.Serializer, SdkJson)

  private val dependabotCreateOrUpdateOrgSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("dependabot/create-or-update-org-secret.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val dependabotCreateOrUpdateOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(dependabotCreateOrUpdateOrgSecretResponseCodecAlternative0Codec)

  internal val dependabotCreateOrUpdateOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsDependabotSecretsPutRequestJsonXbdff5024> =
      MediaTypeCodecRegistry.of(dependabotCreateOrUpdateOrgSecretRequestCodec)

  internal const val DEPENDABOTCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID: String =
      "dependabot/create-or-update-repo-secret.request"

  private val dependabotCreateOrUpdateRepoSecretRequestCodec:
      MediaTypeCodec<InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c> =
      KotlinxSerializationCodec(DEPENDABOTCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID, InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c.Serializer, SdkJson)

  private val dependabotCreateOrUpdateRepoSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("dependabot/create-or-update-repo-secret.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val dependabotCreateOrUpdateRepoSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(dependabotCreateOrUpdateRepoSecretResponseCodecAlternative0Codec)

  internal val dependabotCreateOrUpdateRepoSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c> =
      MediaTypeCodecRegistry.of(dependabotCreateOrUpdateRepoSecretRequestCodec)

  internal val dependabotDeleteOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotDeleteOrgSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotDeleteRepoSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotDeleteRepoSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val DEPENDABOTGETALERT_RESPONSE_CODEC_ID: String = "dependabot/get-alert.response"

  private val dependabotGetAlertResponseCodec: MediaTypeCodec<DependabotAlert> =
      KotlinxSerializationCodec(DEPENDABOTGETALERT_RESPONSE_CODEC_ID, DependabotAlert.Serializer, SdkJson)

  private val dependabotGetAlertResponseCodecAlternative0Codec: MediaTypeCodec<DependabotAlert> =
      KotlinxSerializationCodec("dependabot/get-alert.response.alternative0", DependabotAlert.Serializer, SdkJson)

  internal val dependabotGetAlertResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DependabotAlert> =
      MediaTypeCodecRegistry.of(dependabotGetAlertResponseCodecAlternative0Codec)

  private val dependabotGetAlertResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/get-alert.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotGetAlertResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotGetAlertResponseCodecAlternative2Codec)

  private val dependabotGetAlertResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/get-alert.response.alternative3", BasicError.Serializer, SdkJson)

  internal val dependabotGetAlertResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotGetAlertResponseCodecAlternative3Codec)

  internal val dependabotGetAlertRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotGetAlertResponseCodecRegistry: MediaTypeCodecRegistry<DependabotAlert> =
      MediaTypeCodecRegistry.of(dependabotGetAlertResponseCodec)

  internal const val DEPENDABOTGETORGPUBLICKEY_RESPONSE_CODEC_ID: String =
      "dependabot/get-org-public-key.response"

  private val dependabotGetOrgPublicKeyResponseCodec: MediaTypeCodec<DependabotPublicKey> =
      KotlinxSerializationCodec(DEPENDABOTGETORGPUBLICKEY_RESPONSE_CODEC_ID, DependabotPublicKey.Serializer, SdkJson)

  private val dependabotGetOrgPublicKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<DependabotPublicKey> =
      KotlinxSerializationCodec("dependabot/get-org-public-key.response.alternative0", DependabotPublicKey.Serializer, SdkJson)

  internal val dependabotGetOrgPublicKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DependabotPublicKey> =
      MediaTypeCodecRegistry.of(dependabotGetOrgPublicKeyResponseCodecAlternative0Codec)

  internal val dependabotGetOrgPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotGetOrgPublicKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<DependabotPublicKey> =
      MediaTypeCodecRegistry.of(dependabotGetOrgPublicKeyResponseCodec)

  internal const val DEPENDABOTGETORGSECRET_RESPONSE_CODEC_ID: String =
      "dependabot/get-org-secret.response"

  private val dependabotGetOrgSecretResponseCodec: MediaTypeCodec<OrganizationDependabotSecret> =
      KotlinxSerializationCodec(DEPENDABOTGETORGSECRET_RESPONSE_CODEC_ID, OrganizationDependabotSecret.Serializer, SdkJson)

  private val dependabotGetOrgSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<OrganizationDependabotSecret> =
      KotlinxSerializationCodec("dependabot/get-org-secret.response.alternative0", OrganizationDependabotSecret.Serializer, SdkJson)

  internal val dependabotGetOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OrganizationDependabotSecret> =
      MediaTypeCodecRegistry.of(dependabotGetOrgSecretResponseCodecAlternative0Codec)

  internal val dependabotGetOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotGetOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<OrganizationDependabotSecret> =
      MediaTypeCodecRegistry.of(dependabotGetOrgSecretResponseCodec)

  internal const val DEPENDABOTGETREPOPUBLICKEY_RESPONSE_CODEC_ID: String =
      "dependabot/get-repo-public-key.response"

  private val dependabotGetRepoPublicKeyResponseCodec: MediaTypeCodec<DependabotPublicKey> =
      KotlinxSerializationCodec(DEPENDABOTGETREPOPUBLICKEY_RESPONSE_CODEC_ID, DependabotPublicKey.Serializer, SdkJson)

  private val dependabotGetRepoPublicKeyResponseCodecAlternative0Codec:
      MediaTypeCodec<DependabotPublicKey> =
      KotlinxSerializationCodec("dependabot/get-repo-public-key.response.alternative0", DependabotPublicKey.Serializer, SdkJson)

  internal val dependabotGetRepoPublicKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DependabotPublicKey> =
      MediaTypeCodecRegistry.of(dependabotGetRepoPublicKeyResponseCodecAlternative0Codec)

  internal val dependabotGetRepoPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotGetRepoPublicKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<DependabotPublicKey> =
      MediaTypeCodecRegistry.of(dependabotGetRepoPublicKeyResponseCodec)

  internal const val DEPENDABOTGETREPOSECRET_RESPONSE_CODEC_ID: String =
      "dependabot/get-repo-secret.response"

  private val dependabotGetRepoSecretResponseCodec: MediaTypeCodec<DependabotSecret> =
      KotlinxSerializationCodec(DEPENDABOTGETREPOSECRET_RESPONSE_CODEC_ID, DependabotSecret.Serializer, SdkJson)

  private val dependabotGetRepoSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<DependabotSecret> =
      KotlinxSerializationCodec("dependabot/get-repo-secret.response.alternative0", DependabotSecret.Serializer, SdkJson)

  internal val dependabotGetRepoSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DependabotSecret> =
      MediaTypeCodecRegistry.of(dependabotGetRepoSecretResponseCodecAlternative0Codec)

  internal val dependabotGetRepoSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotGetRepoSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<DependabotSecret> =
      MediaTypeCodecRegistry.of(dependabotGetRepoSecretResponseCodec)

  internal const val DEPENDABOTLISTALERTSFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "dependabot/list-alerts-for-enterprise.response"

  private val dependabotListAlertsForEnterpriseResponseCodec:
      MediaTypeCodec<List<DependabotAlertWithRepository>> =
      KotlinxSerializationCodec(DEPENDABOTLISTALERTSFORENTERPRISE_RESPONSE_CODEC_ID, ListSerializer(DependabotAlertWithRepository.Serializer), SdkJson)

  private val dependabotListAlertsForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<List<DependabotAlertWithRepository>> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-enterprise.response.alternative0", ListSerializer(DependabotAlertWithRepository.Serializer), SdkJson)

  internal val dependabotListAlertsForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<DependabotAlertWithRepository>> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForEnterpriseResponseCodecAlternative0Codec)

  private val dependabotListAlertsForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotListAlertsForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForEnterpriseResponseCodecAlternative2Codec)

  private val dependabotListAlertsForEnterpriseResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-enterprise.response.alternative3", BasicError.Serializer, SdkJson)

  internal val dependabotListAlertsForEnterpriseResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForEnterpriseResponseCodecAlternative3Codec)

  private val dependabotListAlertsForEnterpriseResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-enterprise.response.alternative4", ValidationErrorSimple.Serializer, SdkJson)

  internal val dependabotListAlertsForEnterpriseResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForEnterpriseResponseCodecAlternative4Codec)

  internal val dependabotListAlertsForEnterpriseRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotListAlertsForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<List<DependabotAlertWithRepository>> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForEnterpriseResponseCodec)

  internal const val DEPENDABOTLISTALERTSFORORG_RESPONSE_CODEC_ID: String =
      "dependabot/list-alerts-for-org.response"

  private val dependabotListAlertsForOrgResponseCodec:
      MediaTypeCodec<List<DependabotAlertWithRepository>> =
      KotlinxSerializationCodec(DEPENDABOTLISTALERTSFORORG_RESPONSE_CODEC_ID, ListSerializer(DependabotAlertWithRepository.Serializer), SdkJson)

  private val dependabotListAlertsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<DependabotAlertWithRepository>> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-org.response.alternative0", ListSerializer(DependabotAlertWithRepository.Serializer), SdkJson)

  internal val dependabotListAlertsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<DependabotAlertWithRepository>> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForOrgResponseCodecAlternative0Codec)

  private val dependabotListAlertsForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotListAlertsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForOrgResponseCodecAlternative2Codec)

  private val dependabotListAlertsForOrgResponseCodecAlternative3Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-org.response.alternative3", ScimError.Serializer, SdkJson)

  internal val dependabotListAlertsForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForOrgResponseCodecAlternative3Codec)

  private val dependabotListAlertsForOrgResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val dependabotListAlertsForOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForOrgResponseCodecAlternative4Codec)

  private val dependabotListAlertsForOrgResponseCodecAlternative5Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-org.response.alternative5", BasicError.Serializer, SdkJson)

  internal val dependabotListAlertsForOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForOrgResponseCodecAlternative5Codec)

  private val dependabotListAlertsForOrgResponseCodecAlternative6Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-org.response.alternative6", ValidationErrorSimple.Serializer, SdkJson)

  internal val dependabotListAlertsForOrgResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForOrgResponseCodecAlternative6Codec)

  internal val dependabotListAlertsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotListAlertsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<DependabotAlertWithRepository>> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForOrgResponseCodec)

  internal const val DEPENDABOTLISTALERTSFORREPO_RESPONSE_CODEC_ID: String =
      "dependabot/list-alerts-for-repo.response"

  private val dependabotListAlertsForRepoResponseCodec: MediaTypeCodec<List<DependabotAlert>> =
      KotlinxSerializationCodec(DEPENDABOTLISTALERTSFORREPO_RESPONSE_CODEC_ID, ListSerializer(DependabotAlert.Serializer), SdkJson)

  private val dependabotListAlertsForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<List<DependabotAlert>> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-repo.response.alternative0", ListSerializer(DependabotAlert.Serializer), SdkJson)

  internal val dependabotListAlertsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<DependabotAlert>> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForRepoResponseCodecAlternative0Codec)

  private val dependabotListAlertsForRepoResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("dependabot/list-alerts-for-repo.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotListAlertsForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForRepoResponseCodecAlternative2Codec)

  private val dependabotListAlertsForRepoResponseCodecAlternative3Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-repo.response.alternative3", ScimError.Serializer, SdkJson)

  internal val dependabotListAlertsForRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForRepoResponseCodecAlternative3Codec)

  private val dependabotListAlertsForRepoResponseCodecAlternative4Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("dependabot/list-alerts-for-repo.response.alternative4", BasicError.Serializer, SdkJson)

  internal val dependabotListAlertsForRepoResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForRepoResponseCodecAlternative4Codec)

  private val dependabotListAlertsForRepoResponseCodecAlternative5Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("dependabot/list-alerts-for-repo.response.alternative5", BasicError.Serializer, SdkJson)

  internal val dependabotListAlertsForRepoResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForRepoResponseCodecAlternative5Codec)

  private val dependabotListAlertsForRepoResponseCodecAlternative6Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("dependabot/list-alerts-for-repo.response.alternative6", ValidationErrorSimple.Serializer, SdkJson)

  internal val dependabotListAlertsForRepoResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForRepoResponseCodecAlternative6Codec)

  internal val dependabotListAlertsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotListAlertsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<List<DependabotAlert>> =
      MediaTypeCodecRegistry.of(dependabotListAlertsForRepoResponseCodec)

  internal const val DEPENDABOTLISTORGSECRETS_RESPONSE_CODEC_ID: String =
      "dependabot/list-org-secrets.response"

  private val dependabotListOrgSecretsResponseCodec:
      MediaTypeCodec<InlineOrgsDependabotSecretsGetResponse200JsonX53aab923> =
      KotlinxSerializationCodec(DEPENDABOTLISTORGSECRETS_RESPONSE_CODEC_ID, InlineOrgsDependabotSecretsGetResponse200JsonX53aab923.Serializer, SdkJson)

  private val dependabotListOrgSecretsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsDependabotSecretsGetResponse200JsonX53aab923> =
      KotlinxSerializationCodec("dependabot/list-org-secrets.response.alternative0", InlineOrgsDependabotSecretsGetResponse200JsonX53aab923.Serializer, SdkJson)

  internal val dependabotListOrgSecretsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsDependabotSecretsGetResponse200JsonX53aab923> =
      MediaTypeCodecRegistry.of(dependabotListOrgSecretsResponseCodecAlternative0Codec)

  internal val dependabotListOrgSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotListOrgSecretsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsDependabotSecretsGetResponse200JsonX53aab923> =
      MediaTypeCodecRegistry.of(dependabotListOrgSecretsResponseCodec)

  internal const val DEPENDABOTLISTREPOSECRETS_RESPONSE_CODEC_ID: String =
      "dependabot/list-repo-secrets.response"

  private val dependabotListRepoSecretsResponseCodec:
      MediaTypeCodec<InlineReposDependabotSecretsGetResponse200JsonX6a1075a7> =
      KotlinxSerializationCodec(DEPENDABOTLISTREPOSECRETS_RESPONSE_CODEC_ID, InlineReposDependabotSecretsGetResponse200JsonX6a1075a7.Serializer, SdkJson)

  private val dependabotListRepoSecretsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposDependabotSecretsGetResponse200JsonX6a1075a7> =
      KotlinxSerializationCodec("dependabot/list-repo-secrets.response.alternative0", InlineReposDependabotSecretsGetResponse200JsonX6a1075a7.Serializer, SdkJson)

  internal val dependabotListRepoSecretsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposDependabotSecretsGetResponse200JsonX6a1075a7> =
      MediaTypeCodecRegistry.of(dependabotListRepoSecretsResponseCodecAlternative0Codec)

  internal val dependabotListRepoSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotListRepoSecretsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposDependabotSecretsGetResponse200JsonX6a1075a7> =
      MediaTypeCodecRegistry.of(dependabotListRepoSecretsResponseCodec)

  internal const val DEPENDABOTLISTSELECTEDREPOSFORORGSECRET_RESPONSE_CODEC_ID: String =
      "dependabot/list-selected-repos-for-org-secret.response"

  private val dependabotListSelectedReposForOrgSecretResponseCodec:
      MediaTypeCodec<InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee> =
      KotlinxSerializationCodec(DEPENDABOTLISTSELECTEDREPOSFORORGSECRET_RESPONSE_CODEC_ID, InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee.Serializer, SdkJson)

  private val dependabotListSelectedReposForOrgSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee> =
      KotlinxSerializationCodec("dependabot/list-selected-repos-for-org-secret.response.alternative0", InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee.Serializer, SdkJson)

  internal val dependabotListSelectedReposForOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee> =
      MediaTypeCodecRegistry.of(dependabotListSelectedReposForOrgSecretResponseCodecAlternative0Codec)

  internal val dependabotListSelectedReposForOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val dependabotListSelectedReposForOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee> =
      MediaTypeCodecRegistry.of(dependabotListSelectedReposForOrgSecretResponseCodec)

  internal val dependabotRemoveSelectedRepoFromOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val dependabotRemoveSelectedRepoFromOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val DEPENDABOTREPOSITORYACCESSFORENTERPRISE_RESPONSE_CODEC_ID: String =
      "dependabot/repository-access-for-enterprise.response"

  private val dependabotRepositoryAccessForEnterpriseResponseCodec:
      MediaTypeCodec<DependabotRepositoryAccessDetails> =
      KotlinxSerializationCodec(DEPENDABOTREPOSITORYACCESSFORENTERPRISE_RESPONSE_CODEC_ID, DependabotRepositoryAccessDetails.Serializer, SdkJson)

  private val dependabotRepositoryAccessForEnterpriseResponseCodecAlternative0Codec:
      MediaTypeCodec<DependabotRepositoryAccessDetails> =
      KotlinxSerializationCodec("dependabot/repository-access-for-enterprise.response.alternative0", DependabotRepositoryAccessDetails.Serializer, SdkJson)

  internal val dependabotRepositoryAccessForEnterpriseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DependabotRepositoryAccessDetails> =
      MediaTypeCodecRegistry.of(dependabotRepositoryAccessForEnterpriseResponseCodecAlternative0Codec)

  private val dependabotRepositoryAccessForEnterpriseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/repository-access-for-enterprise.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependabotRepositoryAccessForEnterpriseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotRepositoryAccessForEnterpriseResponseCodecAlternative1Codec)

  private val dependabotRepositoryAccessForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/repository-access-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotRepositoryAccessForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotRepositoryAccessForEnterpriseResponseCodecAlternative2Codec)

  internal val dependabotRepositoryAccessForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val dependabotRepositoryAccessForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<DependabotRepositoryAccessDetails> =
      MediaTypeCodecRegistry.of(dependabotRepositoryAccessForEnterpriseResponseCodec)

  internal const val DEPENDABOTREPOSITORYACCESSFORORG_RESPONSE_CODEC_ID: String =
      "dependabot/repository-access-for-org.response"

  private val dependabotRepositoryAccessForOrgResponseCodec:
      MediaTypeCodec<DependabotRepositoryAccessDetails> =
      KotlinxSerializationCodec(DEPENDABOTREPOSITORYACCESSFORORG_RESPONSE_CODEC_ID, DependabotRepositoryAccessDetails.Serializer, SdkJson)

  private val dependabotRepositoryAccessForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<DependabotRepositoryAccessDetails> =
      KotlinxSerializationCodec("dependabot/repository-access-for-org.response.alternative0", DependabotRepositoryAccessDetails.Serializer, SdkJson)

  internal val dependabotRepositoryAccessForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DependabotRepositoryAccessDetails> =
      MediaTypeCodecRegistry.of(dependabotRepositoryAccessForOrgResponseCodecAlternative0Codec)

  private val dependabotRepositoryAccessForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/repository-access-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependabotRepositoryAccessForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotRepositoryAccessForOrgResponseCodecAlternative1Codec)

  private val dependabotRepositoryAccessForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/repository-access-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotRepositoryAccessForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotRepositoryAccessForOrgResponseCodecAlternative2Codec)

  internal val dependabotRepositoryAccessForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val dependabotRepositoryAccessForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<DependabotRepositoryAccessDetails> =
      MediaTypeCodecRegistry.of(dependabotRepositoryAccessForOrgResponseCodec)

  internal const val DEPENDABOTSETREPOSITORYACCESSDEFAULTLEVEL_REQUEST_CODEC_ID: String =
      "dependabot/set-repository-access-default-level.request"

  private val dependabotSetRepositoryAccessDefaultLevelRequestCodec:
      MediaTypeCodec<InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319> =
      KotlinxSerializationCodec(DEPENDABOTSETREPOSITORYACCESSDEFAULTLEVEL_REQUEST_CODEC_ID, InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319.Serializer, SdkJson)

  private val dependabotSetRepositoryAccessDefaultLevelResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/set-repository-access-default-level.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependabotSetRepositoryAccessDefaultLevelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotSetRepositoryAccessDefaultLevelResponseCodecAlternative1Codec)

  private val dependabotSetRepositoryAccessDefaultLevelResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/set-repository-access-default-level.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotSetRepositoryAccessDefaultLevelResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotSetRepositoryAccessDefaultLevelResponseCodecAlternative2Codec)

  internal val dependabotSetRepositoryAccessDefaultLevelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319>
      = MediaTypeCodecRegistry.of(dependabotSetRepositoryAccessDefaultLevelRequestCodec)

  internal val dependabotSetRepositoryAccessDefaultLevelResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val DEPENDABOTSETREPOSITORYACCESSDEFAULTLEVELFORENTERPRISE_REQUEST_CODEC_ID: String
      = "dependabot/set-repository-access-default-level-for-enterprise.request"

  private val dependabotSetRepositoryAccessDefaultLevelForEnterpriseRequestCodec:
      MediaTypeCodec<InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79>
      =
      KotlinxSerializationCodec(DEPENDABOTSETREPOSITORYACCESSDEFAULTLEVELFORENTERPRISE_REQUEST_CODEC_ID, InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79.Serializer, SdkJson)

  private val dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/set-repository-access-default-level-for-enterprise.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecAlternative1Codec)

  private val dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/set-repository-access-default-level-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecAlternative2Codec)

  internal val dependabotSetRepositoryAccessDefaultLevelForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79>
      =
      MediaTypeCodecRegistry.of(dependabotSetRepositoryAccessDefaultLevelForEnterpriseRequestCodec)

  internal val dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val DEPENDABOTSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID: String =
      "dependabot/set-selected-repos-for-org-secret.request"

  private val dependabotSetSelectedReposForOrgSecretRequestCodec:
      MediaTypeCodec<InlineOrgsDependabotSecretsRepositoriesPutRequestJsonX770db239> =
      KotlinxSerializationCodec(DEPENDABOTSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID, InlineOrgsDependabotSecretsRepositoriesPutRequestJsonX770db239.Serializer, SdkJson)

  internal val dependabotSetSelectedReposForOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsDependabotSecretsRepositoriesPutRequestJsonX770db239> =
      MediaTypeCodecRegistry.of(dependabotSetSelectedReposForOrgSecretRequestCodec)

  internal val dependabotSetSelectedReposForOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val DEPENDABOTUPDATEALERT_REQUEST_CODEC_ID: String =
      "dependabot/update-alert.request"

  private val dependabotUpdateAlertRequestCodec:
      MediaTypeCodec<InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b> =
      KotlinxSerializationCodec(DEPENDABOTUPDATEALERT_REQUEST_CODEC_ID, InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b.Serializer, SdkJson)

  internal const val DEPENDABOTUPDATEALERT_RESPONSE_CODEC_ID: String =
      "dependabot/update-alert.response"

  private val dependabotUpdateAlertResponseCodec: MediaTypeCodec<DependabotAlert> =
      KotlinxSerializationCodec(DEPENDABOTUPDATEALERT_RESPONSE_CODEC_ID, DependabotAlert.Serializer, SdkJson)

  private val dependabotUpdateAlertResponseCodecAlternative0Codec: MediaTypeCodec<DependabotAlert> =
      KotlinxSerializationCodec("dependabot/update-alert.response.alternative0", DependabotAlert.Serializer, SdkJson)

  internal val dependabotUpdateAlertResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DependabotAlert> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertResponseCodecAlternative0Codec)

  private val dependabotUpdateAlertResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/update-alert.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependabotUpdateAlertResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertResponseCodecAlternative1Codec)

  private val dependabotUpdateAlertResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("dependabot/update-alert.response.alternative2", ScimError.Serializer, SdkJson)

  internal val dependabotUpdateAlertResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertResponseCodecAlternative2Codec)

  private val dependabotUpdateAlertResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/update-alert.response.alternative3", BasicError.Serializer, SdkJson)

  internal val dependabotUpdateAlertResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertResponseCodecAlternative3Codec)

  private val dependabotUpdateAlertResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/update-alert.response.alternative4", BasicError.Serializer, SdkJson)

  internal val dependabotUpdateAlertResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertResponseCodecAlternative4Codec)

  private val dependabotUpdateAlertResponseCodecAlternative5Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/update-alert.response.alternative5", BasicError.Serializer, SdkJson)

  internal val dependabotUpdateAlertResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertResponseCodecAlternative5Codec)

  private val dependabotUpdateAlertResponseCodecAlternative6Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("dependabot/update-alert.response.alternative6", ValidationErrorSimple.Serializer, SdkJson)

  internal val dependabotUpdateAlertResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertResponseCodecAlternative6Codec)

  internal val dependabotUpdateAlertRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertRequestCodec)

  internal val dependabotUpdateAlertResponseCodecRegistry: MediaTypeCodecRegistry<DependabotAlert> =
      MediaTypeCodecRegistry.of(dependabotUpdateAlertResponseCodec)

  internal const val DEPENDABOTUPDATEREPOSITORYACCESSFORENTERPRISE_REQUEST_CODEC_ID: String =
      "dependabot/update-repository-access-for-enterprise.request"

  private val dependabotUpdateRepositoryAccessForEnterpriseRequestCodec:
      MediaTypeCodec<InlineEnterprisesDependabotRepositoryAccessPatchRequestJsonX50899717> =
      KotlinxSerializationCodec(DEPENDABOTUPDATEREPOSITORYACCESSFORENTERPRISE_REQUEST_CODEC_ID, InlineEnterprisesDependabotRepositoryAccessPatchRequestJsonX50899717.Serializer, SdkJson)

  private val dependabotUpdateRepositoryAccessForEnterpriseResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/update-repository-access-for-enterprise.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependabotUpdateRepositoryAccessForEnterpriseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotUpdateRepositoryAccessForEnterpriseResponseCodecAlternative1Codec)

  private val dependabotUpdateRepositoryAccessForEnterpriseResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/update-repository-access-for-enterprise.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotUpdateRepositoryAccessForEnterpriseResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotUpdateRepositoryAccessForEnterpriseResponseCodecAlternative2Codec)

  internal val dependabotUpdateRepositoryAccessForEnterpriseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesDependabotRepositoryAccessPatchRequestJsonX50899717> =
      MediaTypeCodecRegistry.of(dependabotUpdateRepositoryAccessForEnterpriseRequestCodec)

  internal val dependabotUpdateRepositoryAccessForEnterpriseResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val DEPENDABOTUPDATEREPOSITORYACCESSFORORG_REQUEST_CODEC_ID: String =
      "dependabot/update-repository-access-for-org.request"

  private val dependabotUpdateRepositoryAccessForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a> =
      KotlinxSerializationCodec(DEPENDABOTUPDATEREPOSITORYACCESSFORORG_REQUEST_CODEC_ID, InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a.Serializer, SdkJson)

  private val dependabotUpdateRepositoryAccessForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/update-repository-access-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val dependabotUpdateRepositoryAccessForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotUpdateRepositoryAccessForOrgResponseCodecAlternative1Codec)

  private val dependabotUpdateRepositoryAccessForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("dependabot/update-repository-access-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val dependabotUpdateRepositoryAccessForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(dependabotUpdateRepositoryAccessForOrgResponseCodecAlternative2Codec)

  internal val dependabotUpdateRepositoryAccessForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a> =
      MediaTypeCodecRegistry.of(dependabotUpdateRepositoryAccessForOrgRequestCodec)

  internal val dependabotUpdateRepositoryAccessForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'dependabot' group of GitHub v3 REST API.
 */
public class DependabotClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@DependabotClient.authentication)

  /**
   * Adds a repository to an organization secret when the `visibility` for
   * repository access is set to `selected`. The visibility is set when you [Create or
   * update an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws DependabotAddSelectedRepoToOrgSecretApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded DependabotAddSelectedRepoToOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotAddSelectedRepoToOrgSecret(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, DependabotAddSelectedRepoToOrgSecretResponse, Unit>(
    request = SdkExecutionRequest(dependabotAddSelectedRepoToOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = DependabotCodecs.dependabotAddSelectedRepoToOrgSecretRequestCodecRegistry,
    responseDecoder = DependabotAddSelectedRepoToOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotAddSelectedRepoToOrgSecretResponse.SuccessNoContent -> response.unit
        is DependabotAddSelectedRepoToOrgSecretResponse.Http409NoContent -> response.unit
        is DependabotAddSelectedRepoToOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotAddSelectedRepoToOrgSecretResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is DependabotAddSelectedRepoToOrgSecretResponse.Http409NoContent -> DependabotAddSelectedRepoToOrgSecretApiException(response, statusCode, headers)
        is DependabotAddSelectedRepoToOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a repository to an organization secret when the `visibility` for
   * repository access is set to `selected`. The visibility is set when you [Create or
   * update an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotAddSelectedRepoToOrgSecretWithResponse(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotAddSelectedRepoToOrgSecretResponse> = executor.executeWithResponse<Unit, DependabotAddSelectedRepoToOrgSecretResponse>(SdkExecutionRequest(dependabotAddSelectedRepoToOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotAddSelectedRepoToOrgSecretRequestCodecRegistry, DependabotAddSelectedRepoToOrgSecretResponseDecoder, options)

  /**
   * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotCreateOrUpdateOrgSecretWithResponse(
    request: InlineOrgsDependabotSecretsPutRequestJsonXbdff5024,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotCreateOrUpdateOrgSecretResponse> = executor.executeWithResponse<InlineOrgsDependabotSecretsPutRequestJsonXbdff5024, DependabotCreateOrUpdateOrgSecretResponse>(SdkExecutionRequest(dependabotCreateOrUpdateOrgSecretMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotCreateOrUpdateOrgSecretRequestCodecRegistry, DependabotCreateOrUpdateOrgSecretResponseDecoder, options)

  /**
   * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotCreateOrUpdateRepoSecretWithResponse(
    request: InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c,
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotCreateOrUpdateRepoSecretResponse> = executor.executeWithResponse<InlineReposDependabotSecretsPutRequestJsonXd5bb2a8c, DependabotCreateOrUpdateRepoSecretResponse>(SdkExecutionRequest(dependabotCreateOrUpdateRepoSecretMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotCreateOrUpdateRepoSecretRequestCodecRegistry, DependabotCreateOrUpdateRepoSecretResponseDecoder, options)

  /**
   * Deletes a secret in an organization using the secret name.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotDeleteOrgSecret(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(dependabotDeleteOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotDeleteOrgSecretRequestCodecRegistry, options)

  /**
   * Deletes a secret in an organization using the secret name.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotDeleteOrgSecretWithResponse(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotDeleteOrgSecretResponse> = executor.executeWithResponse<Unit, DependabotDeleteOrgSecretResponse>(SdkExecutionRequest(dependabotDeleteOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotDeleteOrgSecretRequestCodecRegistry, DependabotDeleteOrgSecretResponseDecoder, options)

  /**
   * Deletes a secret in a repository using the secret name.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotDeleteRepoSecret(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(dependabotDeleteRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotDeleteRepoSecretRequestCodecRegistry, options)

  /**
   * Deletes a secret in a repository using the secret name.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotDeleteRepoSecretWithResponse(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotDeleteRepoSecretResponse> = executor.executeWithResponse<Unit, DependabotDeleteRepoSecretResponse>(SdkExecutionRequest(dependabotDeleteRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotDeleteRepoSecretRequestCodecRegistry, DependabotDeleteRepoSecretResponseDecoder, options)

  /**
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint. If
   * this endpoint is only used with public repositories, the token can use the `public_repo` scope instead.
   *
   * @param alertNumber The number that identifies a Dependabot alert in its repository.
   * You can find this at the end of the URL for a Dependabot alert within GitHub,
   * or in `number` fields in the response from the
   * `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependabotGetAlertApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded DependabotGetAlertError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotGetAlert(
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): DependabotAlert = executor.executeWithTypedErrors<Unit, DependabotGetAlertResponse, DependabotAlert>(
    request = SdkExecutionRequest(dependabotGetAlertMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = DependabotCodecs.dependabotGetAlertRequestCodecRegistry,
    responseDecoder = DependabotGetAlertResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotGetAlertResponse.SuccessJson -> response.json
        is DependabotGetAlertResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is DependabotGetAlertResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotGetAlertResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotGetAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotGetAlertResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependabotGetAlertResponse.Http304NoContent -> DependabotGetAlertApiException(response, statusCode, headers)
        is DependabotGetAlertResponse.Http403Json -> DependabotGetAlertApiException(response, statusCode, headers)
        is DependabotGetAlertResponse.Http404Json -> DependabotGetAlertApiException(response, statusCode, headers)
        is DependabotGetAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint. If
   * this endpoint is only used with public repositories, the token can use the `public_repo` scope instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param alertNumber The number that identifies a Dependabot alert in its repository.
   * You can find this at the end of the URL for a Dependabot alert within GitHub,
   * or in `number` fields in the response from the
   * `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependabotGetAlertWithResponse(
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotGetAlertResponse> = executor.executeWithResponse<Unit, DependabotGetAlertResponse>(SdkExecutionRequest(dependabotGetAlertMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), DependabotCodecs.dependabotGetAlertRequestCodecRegistry, DependabotGetAlertResponseDecoder, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotGetOrgPublicKey(org: String, options: CallOptions = CallOptions()): DependabotPublicKey = executor.execute<Unit, DependabotPublicKey>(SdkExecutionRequest(dependabotGetOrgPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(DependabotCodecs.DEPENDABOTGETORGPUBLICKEY_RESPONSE_CODEC_ID), DependabotCodecs.dependabotGetOrgPublicKeyRequestCodecRegistry, DependabotCodecs.dependabotGetOrgPublicKeyResponseCodecRegistry, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependabotGetOrgPublicKeyWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<DependabotGetOrgPublicKeyResponse> = executor.executeWithResponse<Unit, DependabotGetOrgPublicKeyResponse>(SdkExecutionRequest(dependabotGetOrgPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), DependabotCodecs.dependabotGetOrgPublicKeyRequestCodecRegistry, DependabotGetOrgPublicKeyResponseDecoder, options)

  /**
   * Gets a single organization secret without revealing its encrypted value.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotGetOrgSecret(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): OrganizationDependabotSecret = executor.execute<Unit, OrganizationDependabotSecret>(SdkExecutionRequest(dependabotGetOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), listOf(DependabotCodecs.DEPENDABOTGETORGSECRET_RESPONSE_CODEC_ID), DependabotCodecs.dependabotGetOrgSecretRequestCodecRegistry, DependabotCodecs.dependabotGetOrgSecretResponseCodecRegistry, options)

  /**
   * Gets a single organization secret without revealing its encrypted value.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotGetOrgSecretWithResponse(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotGetOrgSecretResponse> = executor.executeWithResponse<Unit, DependabotGetOrgSecretResponse>(SdkExecutionRequest(dependabotGetOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotGetOrgSecretRequestCodecRegistry, DependabotGetOrgSecretResponseDecoder, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets. Anyone with read access
   * to the repository can use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint if the repository
   * is private.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotGetRepoPublicKey(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): DependabotPublicKey = executor.execute<Unit, DependabotPublicKey>(SdkExecutionRequest(dependabotGetRepoPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(DependabotCodecs.DEPENDABOTGETREPOPUBLICKEY_RESPONSE_CODEC_ID), DependabotCodecs.dependabotGetRepoPublicKeyRequestCodecRegistry, DependabotCodecs.dependabotGetRepoPublicKeyResponseCodecRegistry, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets. Anyone with read access
   * to the repository can use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint if the repository
   * is private.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependabotGetRepoPublicKeyWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotGetRepoPublicKeyResponse> = executor.executeWithResponse<Unit, DependabotGetRepoPublicKeyResponse>(SdkExecutionRequest(dependabotGetRepoPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), DependabotCodecs.dependabotGetRepoPublicKeyRequestCodecRegistry, DependabotGetRepoPublicKeyResponseDecoder, options)

  /**
   * Gets a single repository secret without revealing its encrypted value.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotGetRepoSecret(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): DependabotSecret = executor.execute<Unit, DependabotSecret>(SdkExecutionRequest(dependabotGetRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), listOf(DependabotCodecs.DEPENDABOTGETREPOSECRET_RESPONSE_CODEC_ID), DependabotCodecs.dependabotGetRepoSecretRequestCodecRegistry, DependabotCodecs.dependabotGetRepoSecretResponseCodecRegistry, options)

  /**
   * Gets a single repository secret without revealing its encrypted value.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotGetRepoSecretWithResponse(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotGetRepoSecretResponse> = executor.executeWithResponse<Unit, DependabotGetRepoSecretResponse>(SdkExecutionRequest(dependabotGetRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotGetRepoSecretRequestCodecRegistry, DependabotGetRepoSecretResponseDecoder, options)

  /**
   * Lists Dependabot alerts for repositories that are owned by the specified enterprise.
   *
   * The authenticated user must be a member of the enterprise to use this endpoint.
   *
   * Alerts are only returned for organizations in the enterprise for which you are an organization owner or a security
   * manager. For more information about security managers, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint.
   *
   * @param enterprise The slug version of the enterprise name.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param assignee Filter alerts by assignees.
   * Provide a comma-separated list of user handles (e.g., `octocat` or `octocat,hubot`) to return alerts assigned to
   * any of the specified users.
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param classification A comma-separated list of vulnerability classifications. If specified, only alerts for
   * vulnerabilities with these classifications will be returned.
   *
   * Can be: `malware`, `general`
   * @param direction The direction to sort the results by.
   * @param ecosystem A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be
   * returned.
   *
   * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
   * @param epssPercentage CVE Exploit Prediction Scoring System (EPSS) percentage. Can be specified as:
   * - An exact number (`n`)
   * - Comparators such as `>n`, `<n`, `>=n`, `<=n`
   * - A range like `n..n`, where `n` is a number from 0.0 to 1.0
   *
   * Filters the list of alerts based on EPSS percentages. If specified, only alerts with the provided EPSS percentages
   * will be returned.
   * @param has Filters the list of alerts based on whether the alert has the given value. If specified, only alerts
   * meeting this criterion will be returned.
   * Multiple `has` filters can be passed to filter for alerts that have all of the values. Currently, only `patch` is
   * supported.
   * @param packageValue A comma-separated list of package names. If specified, only alerts for these packages will be
   * returned.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param scope The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
   * @param severity A comma-separated list of severities. If specified, only alerts with these severities will be
   * returned.
   *
   * Can be: `low`, `medium`, `high`, `critical`
   * @param sort The property by which to sort the results.
   * `created` means when the alert was created.
   * `updated` means when the alert's state last changed.
   * `epss_percentage` sorts alerts by the Exploit Prediction Scoring System (EPSS) percentage.
   * @param state A comma-separated list of states. If specified, only alerts with these states will be returned.
   *
   * Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependabotListAlertsForEnterpriseApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded DependabotListAlertsForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotListAlertsForEnterprise(
    enterprise: String,
    after: String? = null,
    assignee: String? = null,
    before: String? = null,
    classification: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    ecosystem: String? = null,
    epssPercentage: String? = null,
    has: InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0? = null,
    packageValue: String? = null,
    perPage: Int? = null,
    scope: InlineDependabotAlertScopeParameterXf09886ca? = null,
    severity: String? = null,
    sort: InlineDependabotAlertSortParameterX68d9890e? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): List<DependabotAlertWithRepository> = executor.executeWithTypedErrors<Unit, DependabotListAlertsForEnterpriseResponse, List<DependabotAlertWithRepository>>(
    request = SdkExecutionRequest(dependabotListAlertsForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "classification", values = classification?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ecosystem", values = ecosystem?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentage", values = epssPercentage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "has", values = has?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package", values = packageValue?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope", values = scope?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = DependabotCodecs.dependabotListAlertsForEnterpriseRequestCodecRegistry,
    responseDecoder = DependabotListAlertsForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotListAlertsForEnterpriseResponse.SuccessJson -> response.json
        is DependabotListAlertsForEnterpriseResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForEnterpriseResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotListAlertsForEnterpriseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependabotListAlertsForEnterpriseResponse.Http304NoContent -> DependabotListAlertsForEnterpriseApiException(response, statusCode, headers)
        is DependabotListAlertsForEnterpriseResponse.Http403Json -> DependabotListAlertsForEnterpriseApiException(response, statusCode, headers)
        is DependabotListAlertsForEnterpriseResponse.Http404Json -> DependabotListAlertsForEnterpriseApiException(response, statusCode, headers)
        is DependabotListAlertsForEnterpriseResponse.Http422Json -> DependabotListAlertsForEnterpriseApiException(response, statusCode, headers)
        is DependabotListAlertsForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists Dependabot alerts for repositories that are owned by the specified enterprise.
   *
   * The authenticated user must be a member of the enterprise to use this endpoint.
   *
   * Alerts are only returned for organizations in the enterprise for which you are an organization owner or a security
   * manager. For more information about security managers, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` or `security_events` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param enterprise The slug version of the enterprise name.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param assignee Filter alerts by assignees.
   * Provide a comma-separated list of user handles (e.g., `octocat` or `octocat,hubot`) to return alerts assigned to
   * any of the specified users.
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param classification A comma-separated list of vulnerability classifications. If specified, only alerts for
   * vulnerabilities with these classifications will be returned.
   *
   * Can be: `malware`, `general`
   * @param direction The direction to sort the results by.
   * @param ecosystem A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be
   * returned.
   *
   * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
   * @param epssPercentage CVE Exploit Prediction Scoring System (EPSS) percentage. Can be specified as:
   * - An exact number (`n`)
   * - Comparators such as `>n`, `<n`, `>=n`, `<=n`
   * - A range like `n..n`, where `n` is a number from 0.0 to 1.0
   *
   * Filters the list of alerts based on EPSS percentages. If specified, only alerts with the provided EPSS percentages
   * will be returned.
   * @param has Filters the list of alerts based on whether the alert has the given value. If specified, only alerts
   * meeting this criterion will be returned.
   * Multiple `has` filters can be passed to filter for alerts that have all of the values. Currently, only `patch` is
   * supported.
   * @param packageValue A comma-separated list of package names. If specified, only alerts for these packages will be
   * returned.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param scope The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
   * @param severity A comma-separated list of severities. If specified, only alerts with these severities will be
   * returned.
   *
   * Can be: `low`, `medium`, `high`, `critical`
   * @param sort The property by which to sort the results.
   * `created` means when the alert was created.
   * `updated` means when the alert's state last changed.
   * `epss_percentage` sorts alerts by the Exploit Prediction Scoring System (EPSS) percentage.
   * @param state A comma-separated list of states. If specified, only alerts with these states will be returned.
   *
   * Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
   * @param options Execution options.
   */
  public suspend fun dependabotListAlertsForEnterpriseWithResponse(
    enterprise: String,
    after: String? = null,
    assignee: String? = null,
    before: String? = null,
    classification: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    ecosystem: String? = null,
    epssPercentage: String? = null,
    has: InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0? = null,
    packageValue: String? = null,
    perPage: Int? = null,
    scope: InlineDependabotAlertScopeParameterXf09886ca? = null,
    severity: String? = null,
    sort: InlineDependabotAlertSortParameterX68d9890e? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotListAlertsForEnterpriseResponse> = executor.executeWithResponse<Unit, DependabotListAlertsForEnterpriseResponse>(SdkExecutionRequest(dependabotListAlertsForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "classification", values = classification?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ecosystem", values = ecosystem?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentage", values = epssPercentage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "has", values = has?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package", values = packageValue?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope", values = scope?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), DependabotCodecs.dependabotListAlertsForEnterpriseRequestCodecRegistry, DependabotListAlertsForEnterpriseResponseDecoder, options)

  /**
   * Lists Dependabot alerts for an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint. If
   * this endpoint is only used with public repositories, the token can use the `public_repo` scope instead.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param artifactRegistry A comma-separated list of Artifact Registry name strings. If specified, only alerts for
   * repositories with storage records matching these registries will be returned.
   *
   * Can be: `jfrog-artifactory`
   * @param artifactRegistryUrl A comma-separated list of artifact registry URLs. If specified, only alerts for
   * repositories with storage records matching these URLs will be returned.
   * @param assignee Filter alerts by assignees.
   * Provide a comma-separated list of user handles (e.g., `octocat` or `octocat,hubot`) to return alerts assigned to
   * any of the specified users.
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param classification A comma-separated list of vulnerability classifications. If specified, only alerts for
   * vulnerabilities with these classifications will be returned.
   *
   * Can be: `malware`, `general`
   * @param direction The direction to sort the results by.
   * @param ecosystem A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be
   * returned.
   *
   * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
   * @param epssPercentage CVE Exploit Prediction Scoring System (EPSS) percentage. Can be specified as:
   * - An exact number (`n`)
   * - Comparators such as `>n`, `<n`, `>=n`, `<=n`
   * - A range like `n..n`, where `n` is a number from 0.0 to 1.0
   *
   * Filters the list of alerts based on EPSS percentages. If specified, only alerts with the provided EPSS percentages
   * will be returned.
   * @param has Filters the list of alerts based on whether the alert has the given value. If specified, only alerts
   * meeting this criterion will be returned.
   * Multiple `has` filters can be passed to filter for alerts that have all of the values.
   * @param packageValue A comma-separated list of package names. If specified, only alerts for these packages will be
   * returned.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param runtimeRisk A comma-separated list of runtime risk strings. If specified, only alerts for repositories with
   * deployment records matching these risks will be returned.
   *
   * Can be: `critical-resource`, `internet-exposed`, `sensitive-data`, `lateral-movement`
   * @param scope The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
   * @param severity A comma-separated list of severities. If specified, only alerts with these severities will be
   * returned.
   *
   * Can be: `low`, `medium`, `high`, `critical`
   * @param sort The property by which to sort the results.
   * `created` means when the alert was created.
   * `updated` means when the alert's state last changed.
   * `epss_percentage` sorts alerts by the Exploit Prediction Scoring System (EPSS) percentage.
   * @param state A comma-separated list of states. If specified, only alerts with these states will be returned.
   *
   * Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependabotListAlertsForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded DependabotListAlertsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotListAlertsForOrg(
    org: String,
    after: String? = null,
    artifactRegistry: String? = null,
    artifactRegistryUrl: String? = null,
    assignee: String? = null,
    before: String? = null,
    classification: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    ecosystem: String? = null,
    epssPercentage: String? = null,
    has: InlineDependabotAlertOrgScopeCommaSeparatedHasParameterX1d6a5933? = null,
    packageValue: String? = null,
    perPage: Int? = null,
    runtimeRisk: String? = null,
    scope: InlineDependabotAlertScopeParameterXf09886ca? = null,
    severity: String? = null,
    sort: InlineDependabotAlertSortParameterX68d9890e? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): List<DependabotAlertWithRepository> = executor.executeWithTypedErrors<Unit, DependabotListAlertsForOrgResponse, List<DependabotAlertWithRepository>>(
    request = SdkExecutionRequest(dependabotListAlertsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "artifact_registry", values = artifactRegistry?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "artifact_registry_url", values = artifactRegistryUrl?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "classification", values = classification?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ecosystem", values = ecosystem?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentage", values = epssPercentage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "has", values = has?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package", values = packageValue?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "runtime_risk", values = runtimeRisk?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope", values = scope?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = DependabotCodecs.dependabotListAlertsForOrgRequestCodecRegistry,
    responseDecoder = DependabotListAlertsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotListAlertsForOrgResponse.SuccessJson -> response.json
        is DependabotListAlertsForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForOrgResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForOrgResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotListAlertsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependabotListAlertsForOrgResponse.Http304NoContent -> DependabotListAlertsForOrgApiException(response, statusCode, headers)
        is DependabotListAlertsForOrgResponse.Http400Json -> DependabotListAlertsForOrgApiException(response, statusCode, headers)
        is DependabotListAlertsForOrgResponse.Http400ScimJson -> DependabotListAlertsForOrgApiException(response, statusCode, headers)
        is DependabotListAlertsForOrgResponse.Http403Json -> DependabotListAlertsForOrgApiException(response, statusCode, headers)
        is DependabotListAlertsForOrgResponse.Http404Json -> DependabotListAlertsForOrgApiException(response, statusCode, headers)
        is DependabotListAlertsForOrgResponse.Http422Json -> DependabotListAlertsForOrgApiException(response, statusCode, headers)
        is DependabotListAlertsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists Dependabot alerts for an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint. If
   * this endpoint is only used with public repositories, the token can use the `public_repo` scope instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param artifactRegistry A comma-separated list of Artifact Registry name strings. If specified, only alerts for
   * repositories with storage records matching these registries will be returned.
   *
   * Can be: `jfrog-artifactory`
   * @param artifactRegistryUrl A comma-separated list of artifact registry URLs. If specified, only alerts for
   * repositories with storage records matching these URLs will be returned.
   * @param assignee Filter alerts by assignees.
   * Provide a comma-separated list of user handles (e.g., `octocat` or `octocat,hubot`) to return alerts assigned to
   * any of the specified users.
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param classification A comma-separated list of vulnerability classifications. If specified, only alerts for
   * vulnerabilities with these classifications will be returned.
   *
   * Can be: `malware`, `general`
   * @param direction The direction to sort the results by.
   * @param ecosystem A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be
   * returned.
   *
   * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
   * @param epssPercentage CVE Exploit Prediction Scoring System (EPSS) percentage. Can be specified as:
   * - An exact number (`n`)
   * - Comparators such as `>n`, `<n`, `>=n`, `<=n`
   * - A range like `n..n`, where `n` is a number from 0.0 to 1.0
   *
   * Filters the list of alerts based on EPSS percentages. If specified, only alerts with the provided EPSS percentages
   * will be returned.
   * @param has Filters the list of alerts based on whether the alert has the given value. If specified, only alerts
   * meeting this criterion will be returned.
   * Multiple `has` filters can be passed to filter for alerts that have all of the values.
   * @param packageValue A comma-separated list of package names. If specified, only alerts for these packages will be
   * returned.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param runtimeRisk A comma-separated list of runtime risk strings. If specified, only alerts for repositories with
   * deployment records matching these risks will be returned.
   *
   * Can be: `critical-resource`, `internet-exposed`, `sensitive-data`, `lateral-movement`
   * @param scope The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
   * @param severity A comma-separated list of severities. If specified, only alerts with these severities will be
   * returned.
   *
   * Can be: `low`, `medium`, `high`, `critical`
   * @param sort The property by which to sort the results.
   * `created` means when the alert was created.
   * `updated` means when the alert's state last changed.
   * `epss_percentage` sorts alerts by the Exploit Prediction Scoring System (EPSS) percentage.
   * @param state A comma-separated list of states. If specified, only alerts with these states will be returned.
   *
   * Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
   * @param options Execution options.
   */
  public suspend fun dependabotListAlertsForOrgWithResponse(
    org: String,
    after: String? = null,
    artifactRegistry: String? = null,
    artifactRegistryUrl: String? = null,
    assignee: String? = null,
    before: String? = null,
    classification: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    ecosystem: String? = null,
    epssPercentage: String? = null,
    has: InlineDependabotAlertOrgScopeCommaSeparatedHasParameterX1d6a5933? = null,
    packageValue: String? = null,
    perPage: Int? = null,
    runtimeRisk: String? = null,
    scope: InlineDependabotAlertScopeParameterXf09886ca? = null,
    severity: String? = null,
    sort: InlineDependabotAlertSortParameterX68d9890e? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotListAlertsForOrgResponse> = executor.executeWithResponse<Unit, DependabotListAlertsForOrgResponse>(SdkExecutionRequest(dependabotListAlertsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "artifact_registry", values = artifactRegistry?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "artifact_registry_url", values = artifactRegistryUrl?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "classification", values = classification?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ecosystem", values = ecosystem?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentage", values = epssPercentage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "has", values = has?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package", values = packageValue?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "runtime_risk", values = runtimeRisk?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope", values = scope?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), DependabotCodecs.dependabotListAlertsForOrgRequestCodecRegistry, DependabotListAlertsForOrgResponseDecoder, options)

  /**
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint. If
   * this endpoint is only used with public repositories, the token can use the `public_repo` scope instead.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param assignee Filter alerts by assignees.
   * Provide a comma-separated list of user handles (e.g., `octocat` or `octocat,hubot`) to return alerts assigned to
   * any of the specified users.
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param classification A comma-separated list of vulnerability classifications. If specified, only alerts for
   * vulnerabilities with these classifications will be returned.
   *
   * Can be: `malware`, `general`
   * @param direction The direction to sort the results by.
   * @param ecosystem A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be
   * returned.
   *
   * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
   * @param epssPercentage CVE Exploit Prediction Scoring System (EPSS) percentage. Can be specified as:
   * - An exact number (`n`)
   * - Comparators such as `>n`, `<n`, `>=n`, `<=n`
   * - A range like `n..n`, where `n` is a number from 0.0 to 1.0
   *
   * Filters the list of alerts based on EPSS percentages. If specified, only alerts with the provided EPSS percentages
   * will be returned.
   * @param has Filters the list of alerts based on whether the alert has the given value. If specified, only alerts
   * meeting this criterion will be returned.
   * Multiple `has` filters can be passed to filter for alerts that have all of the values. Currently, only `patch` is
   * supported.
   * @param manifest A comma-separated list of full manifest paths. If specified, only alerts for these manifests will
   * be returned.
   * @param packageValue A comma-separated list of package names. If specified, only alerts for these packages will be
   * returned.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param scope The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
   * @param severity A comma-separated list of severities. If specified, only alerts with these severities will be
   * returned.
   *
   * Can be: `low`, `medium`, `high`, `critical`
   * @param sort The property by which to sort the results.
   * `created` means when the alert was created.
   * `updated` means when the alert's state last changed.
   * `epss_percentage` sorts alerts by the Exploit Prediction Scoring System (EPSS) percentage.
   * @param state A comma-separated list of states. If specified, only alerts with these states will be returned.
   *
   * Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependabotListAlertsForRepoApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded DependabotListAlertsForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotListAlertsForRepo(
    owner: String,
    repo: String,
    after: String? = null,
    assignee: String? = null,
    before: String? = null,
    classification: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    ecosystem: String? = null,
    epssPercentage: String? = null,
    has: InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0? = null,
    manifest: String? = null,
    packageValue: String? = null,
    perPage: Int? = null,
    scope: InlineDependabotAlertScopeParameterXf09886ca? = null,
    severity: String? = null,
    sort: InlineDependabotAlertSortParameterX68d9890e? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): List<DependabotAlert> = executor.executeWithTypedErrors<Unit, DependabotListAlertsForRepoResponse, List<DependabotAlert>>(
    request = SdkExecutionRequest(dependabotListAlertsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "classification", values = classification?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ecosystem", values = ecosystem?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentage", values = epssPercentage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "has", values = has?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "manifest", values = manifest?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package", values = packageValue?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope", values = scope?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = DependabotCodecs.dependabotListAlertsForRepoRequestCodecRegistry,
    responseDecoder = DependabotListAlertsForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotListAlertsForRepoResponse.SuccessJson -> response.json
        is DependabotListAlertsForRepoResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForRepoResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForRepoResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForRepoResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotListAlertsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotListAlertsForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependabotListAlertsForRepoResponse.Http304NoContent -> DependabotListAlertsForRepoApiException(response, statusCode, headers)
        is DependabotListAlertsForRepoResponse.Http400Json -> DependabotListAlertsForRepoApiException(response, statusCode, headers)
        is DependabotListAlertsForRepoResponse.Http400ScimJson -> DependabotListAlertsForRepoApiException(response, statusCode, headers)
        is DependabotListAlertsForRepoResponse.Http403Json -> DependabotListAlertsForRepoApiException(response, statusCode, headers)
        is DependabotListAlertsForRepoResponse.Http404Json -> DependabotListAlertsForRepoApiException(response, statusCode, headers)
        is DependabotListAlertsForRepoResponse.Http422Json -> DependabotListAlertsForRepoApiException(response, statusCode, headers)
        is DependabotListAlertsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint. If
   * this endpoint is only used with public repositories, the token can use the `public_repo` scope instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param assignee Filter alerts by assignees.
   * Provide a comma-separated list of user handles (e.g., `octocat` or `octocat,hubot`) to return alerts assigned to
   * any of the specified users.
   * Use `*` to list alerts with at least one assignee or `none` to list alerts with no assignees.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param classification A comma-separated list of vulnerability classifications. If specified, only alerts for
   * vulnerabilities with these classifications will be returned.
   *
   * Can be: `malware`, `general`
   * @param direction The direction to sort the results by.
   * @param ecosystem A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be
   * returned.
   *
   * Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust`
   * @param epssPercentage CVE Exploit Prediction Scoring System (EPSS) percentage. Can be specified as:
   * - An exact number (`n`)
   * - Comparators such as `>n`, `<n`, `>=n`, `<=n`
   * - A range like `n..n`, where `n` is a number from 0.0 to 1.0
   *
   * Filters the list of alerts based on EPSS percentages. If specified, only alerts with the provided EPSS percentages
   * will be returned.
   * @param has Filters the list of alerts based on whether the alert has the given value. If specified, only alerts
   * meeting this criterion will be returned.
   * Multiple `has` filters can be passed to filter for alerts that have all of the values. Currently, only `patch` is
   * supported.
   * @param manifest A comma-separated list of full manifest paths. If specified, only alerts for these manifests will
   * be returned.
   * @param packageValue A comma-separated list of package names. If specified, only alerts for these packages will be
   * returned.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param scope The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned.
   * @param severity A comma-separated list of severities. If specified, only alerts with these severities will be
   * returned.
   *
   * Can be: `low`, `medium`, `high`, `critical`
   * @param sort The property by which to sort the results.
   * `created` means when the alert was created.
   * `updated` means when the alert's state last changed.
   * `epss_percentage` sorts alerts by the Exploit Prediction Scoring System (EPSS) percentage.
   * @param state A comma-separated list of states. If specified, only alerts with these states will be returned.
   *
   * Can be: `auto_dismissed`, `dismissed`, `fixed`, `open`
   * @param options Execution options.
   */
  public suspend fun dependabotListAlertsForRepoWithResponse(
    owner: String,
    repo: String,
    after: String? = null,
    assignee: String? = null,
    before: String? = null,
    classification: String? = null,
    direction: InlineDirectionParameterX3053723f? = null,
    ecosystem: String? = null,
    epssPercentage: String? = null,
    has: InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0? = null,
    manifest: String? = null,
    packageValue: String? = null,
    perPage: Int? = null,
    scope: InlineDependabotAlertScopeParameterXf09886ca? = null,
    severity: String? = null,
    sort: InlineDependabotAlertSortParameterX68d9890e? = null,
    state: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotListAlertsForRepoResponse> = executor.executeWithResponse<Unit, DependabotListAlertsForRepoResponse>(SdkExecutionRequest(dependabotListAlertsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "assignee", values = assignee?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "classification", values = classification?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ecosystem", values = ecosystem?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "epss_percentage", values = epssPercentage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "has", values = has?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "manifest", values = manifest?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package", values = packageValue?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope", values = scope?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "severity", values = severity?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), DependabotCodecs.dependabotListAlertsForRepoRequestCodecRegistry, DependabotListAlertsForRepoResponseDecoder, options)

  /**
   * Lists all secrets available in an organization without revealing their
   * encrypted values.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
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
  public suspend fun dependabotListOrgSecrets(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsDependabotSecretsGetResponse200JsonX53aab923 = executor.execute<Unit, InlineOrgsDependabotSecretsGetResponse200JsonX53aab923>(SdkExecutionRequest(dependabotListOrgSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(DependabotCodecs.DEPENDABOTLISTORGSECRETS_RESPONSE_CODEC_ID), DependabotCodecs.dependabotListOrgSecretsRequestCodecRegistry, DependabotCodecs.dependabotListOrgSecretsResponseCodecRegistry, options)

  /**
   * Lists all secrets available in an organization without revealing their
   * encrypted values.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun dependabotListOrgSecretsWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotListOrgSecretsResponse> = executor.executeWithResponse<Unit, DependabotListOrgSecretsResponse>(SdkExecutionRequest(dependabotListOrgSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), DependabotCodecs.dependabotListOrgSecretsRequestCodecRegistry, DependabotListOrgSecretsResponseDecoder, options)

  /**
   * Lists all secrets available in a repository without revealing their encrypted
   * values.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
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
  public suspend fun dependabotListRepoSecrets(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposDependabotSecretsGetResponse200JsonX6a1075a7 = executor.execute<Unit, InlineReposDependabotSecretsGetResponse200JsonX6a1075a7>(SdkExecutionRequest(dependabotListRepoSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(DependabotCodecs.DEPENDABOTLISTREPOSECRETS_RESPONSE_CODEC_ID), DependabotCodecs.dependabotListRepoSecretsRequestCodecRegistry, DependabotCodecs.dependabotListRepoSecretsResponseCodecRegistry, options)

  /**
   * Lists all secrets available in a repository without revealing their encrypted
   * values.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun dependabotListRepoSecretsWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotListRepoSecretsResponse> = executor.executeWithResponse<Unit, DependabotListRepoSecretsResponse>(SdkExecutionRequest(dependabotListRepoSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), DependabotCodecs.dependabotListRepoSecretsRequestCodecRegistry, DependabotListRepoSecretsResponseDecoder, options)

  /**
   * Lists all repositories that have been selected when the `visibility`
   * for repository access to a secret is set to `selected`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
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
  public suspend fun dependabotListSelectedReposForOrgSecret(
    org: String,
    secretName: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee = executor.execute<Unit, InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee>(SdkExecutionRequest(dependabotListSelectedReposForOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(DependabotCodecs.DEPENDABOTLISTSELECTEDREPOSFORORGSECRET_RESPONSE_CODEC_ID), DependabotCodecs.dependabotListSelectedReposForOrgSecretRequestCodecRegistry, DependabotCodecs.dependabotListSelectedReposForOrgSecretResponseCodecRegistry, options)

  /**
   * Lists all repositories that have been selected when the `visibility`
   * for repository access to a secret is set to `selected`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun dependabotListSelectedReposForOrgSecretWithResponse(
    org: String,
    secretName: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotListSelectedReposForOrgSecretResponse> = executor.executeWithResponse<Unit, DependabotListSelectedReposForOrgSecretResponse>(SdkExecutionRequest(dependabotListSelectedReposForOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), DependabotCodecs.dependabotListSelectedReposForOrgSecretRequestCodecRegistry, DependabotListSelectedReposForOrgSecretResponseDecoder, options)

  /**
   * Removes a repository from an organization secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws DependabotRemoveSelectedRepoFromOrgSecretApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded DependabotRemoveSelectedRepoFromOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotRemoveSelectedRepoFromOrgSecret(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, DependabotRemoveSelectedRepoFromOrgSecretResponse, Unit>(
    request = SdkExecutionRequest(dependabotRemoveSelectedRepoFromOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = DependabotCodecs.dependabotRemoveSelectedRepoFromOrgSecretRequestCodecRegistry,
    responseDecoder = DependabotRemoveSelectedRepoFromOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent -> response.unit
        is DependabotRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent -> response.unit
        is DependabotRemoveSelectedRepoFromOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is DependabotRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent -> DependabotRemoveSelectedRepoFromOrgSecretApiException(response, statusCode, headers)
        is DependabotRemoveSelectedRepoFromOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a repository from an organization secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotRemoveSelectedRepoFromOrgSecretWithResponse(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotRemoveSelectedRepoFromOrgSecretResponse> = executor.executeWithResponse<Unit, DependabotRemoveSelectedRepoFromOrgSecretResponse>(SdkExecutionRequest(dependabotRemoveSelectedRepoFromOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotRemoveSelectedRepoFromOrgSecretRequestCodecRegistry, DependabotRemoveSelectedRepoFromOrgSecretResponseDecoder, options)

  /**
   * Lists repositories that enterprise admins have allowed Dependabot to access when updating dependencies across
   * organizations in the enterprise.
   *
   * The authenticated user must be an enterprise owner to use this endpoint.
   *
   * @param enterprise The slug version of the enterprise name.
   * @param page The page number of results to fetch.
   * @param perPage Number of results per page.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependabotRepositoryAccessForEnterpriseApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded DependabotRepositoryAccessForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotRepositoryAccessForEnterprise(
    enterprise: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): DependabotRepositoryAccessDetails = executor.executeWithTypedErrors<Unit, DependabotRepositoryAccessForEnterpriseResponse, DependabotRepositoryAccessDetails>(
    request = SdkExecutionRequest(dependabotRepositoryAccessForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = DependabotCodecs.dependabotRepositoryAccessForEnterpriseRequestCodecRegistry,
    responseDecoder = DependabotRepositoryAccessForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotRepositoryAccessForEnterpriseResponse.SuccessJson -> response.json
        is DependabotRepositoryAccessForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotRepositoryAccessForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotRepositoryAccessForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotRepositoryAccessForEnterpriseResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependabotRepositoryAccessForEnterpriseResponse.Http403Json -> DependabotRepositoryAccessForEnterpriseApiException(response, statusCode, headers)
        is DependabotRepositoryAccessForEnterpriseResponse.Http404Json -> DependabotRepositoryAccessForEnterpriseApiException(response, statusCode, headers)
        is DependabotRepositoryAccessForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists repositories that enterprise admins have allowed Dependabot to access when updating dependencies across
   * organizations in the enterprise.
   *
   * The authenticated user must be an enterprise owner to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param enterprise The slug version of the enterprise name.
   * @param page The page number of results to fetch.
   * @param perPage Number of results per page.
   * @param options Execution options.
   */
  public suspend fun dependabotRepositoryAccessForEnterpriseWithResponse(
    enterprise: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotRepositoryAccessForEnterpriseResponse> = executor.executeWithResponse<Unit, DependabotRepositoryAccessForEnterpriseResponse>(SdkExecutionRequest(dependabotRepositoryAccessForEnterpriseMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), DependabotCodecs.dependabotRepositoryAccessForEnterpriseRequestCodecRegistry, DependabotRepositoryAccessForEnterpriseResponseDecoder, options)

  /**
   * Lists repositories that organization admins have allowed Dependabot to access when updating dependencies.
   * > [!NOTE]
   * >    This operation supports both server-to-server and user-to-server access.
   * Unauthorized users will not see the existence of this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of results to fetch.
   * @param perPage Number of results per page.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependabotRepositoryAccessForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded DependabotRepositoryAccessForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotRepositoryAccessForOrg(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): DependabotRepositoryAccessDetails = executor.executeWithTypedErrors<Unit, DependabotRepositoryAccessForOrgResponse, DependabotRepositoryAccessDetails>(
    request = SdkExecutionRequest(dependabotRepositoryAccessForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = DependabotCodecs.dependabotRepositoryAccessForOrgRequestCodecRegistry,
    responseDecoder = DependabotRepositoryAccessForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotRepositoryAccessForOrgResponse.SuccessJson -> response.json
        is DependabotRepositoryAccessForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotRepositoryAccessForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotRepositoryAccessForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotRepositoryAccessForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependabotRepositoryAccessForOrgResponse.Http403Json -> DependabotRepositoryAccessForOrgApiException(response, statusCode, headers)
        is DependabotRepositoryAccessForOrgResponse.Http404Json -> DependabotRepositoryAccessForOrgApiException(response, statusCode, headers)
        is DependabotRepositoryAccessForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists repositories that organization admins have allowed Dependabot to access when updating dependencies.
   * > [!NOTE]
   * >    This operation supports both server-to-server and user-to-server access.
   * Unauthorized users will not see the existence of this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of results to fetch.
   * @param perPage Number of results per page.
   * @param options Execution options.
   */
  public suspend fun dependabotRepositoryAccessForOrgWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotRepositoryAccessForOrgResponse> = executor.executeWithResponse<Unit, DependabotRepositoryAccessForOrgResponse>(SdkExecutionRequest(dependabotRepositoryAccessForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), DependabotCodecs.dependabotRepositoryAccessForOrgRequestCodecRegistry, DependabotRepositoryAccessForOrgResponseDecoder, options)

  /**
   * Sets the default level of repository access Dependabot will have while performing an update.  Available values are:
   * - 'public' - Dependabot will only have access to public repositories, unless access is explicitly granted to
   * non-public repositories.
   * - 'internal' - Dependabot will only have access to public and internal repositories, unless access is explicitly
   * granted to private repositories.
   *
   * Unauthorized users will not see the existence of this endpoint.
   *
   * This operation supports both server-to-server and user-to-server access.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws DependabotSetRepositoryAccessDefaultLevelApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded DependabotSetRepositoryAccessDefaultLevelError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotSetRepositoryAccessDefaultLevel(
    request: InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319, DependabotSetRepositoryAccessDefaultLevelResponse, Unit>(
    request = SdkExecutionRequest(dependabotSetRepositoryAccessDefaultLevelMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTSETREPOSITORYACCESSDEFAULTLEVEL_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = DependabotCodecs.dependabotSetRepositoryAccessDefaultLevelRequestCodecRegistry,
    responseDecoder = DependabotSetRepositoryAccessDefaultLevelResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotSetRepositoryAccessDefaultLevelResponse.SuccessNoContent -> response.unit
        is DependabotSetRepositoryAccessDefaultLevelResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotSetRepositoryAccessDefaultLevelResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotSetRepositoryAccessDefaultLevelResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotSetRepositoryAccessDefaultLevelResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is DependabotSetRepositoryAccessDefaultLevelResponse.Http403Json -> DependabotSetRepositoryAccessDefaultLevelApiException(response, statusCode, headers)
        is DependabotSetRepositoryAccessDefaultLevelResponse.Http404Json -> DependabotSetRepositoryAccessDefaultLevelApiException(response, statusCode, headers)
        is DependabotSetRepositoryAccessDefaultLevelResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sets the default level of repository access Dependabot will have while performing an update.  Available values are:
   * - 'public' - Dependabot will only have access to public repositories, unless access is explicitly granted to
   * non-public repositories.
   * - 'internal' - Dependabot will only have access to public and internal repositories, unless access is explicitly
   * granted to private repositories.
   *
   * Unauthorized users will not see the existence of this endpoint.
   *
   * This operation supports both server-to-server and user-to-server access.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependabotSetRepositoryAccessDefaultLevelWithResponse(
    request: InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotSetRepositoryAccessDefaultLevelResponse> = executor.executeWithResponse<InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319, DependabotSetRepositoryAccessDefaultLevelResponse>(SdkExecutionRequest(dependabotSetRepositoryAccessDefaultLevelMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTSETREPOSITORYACCESSDEFAULTLEVEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), DependabotCodecs.dependabotSetRepositoryAccessDefaultLevelRequestCodecRegistry, DependabotSetRepositoryAccessDefaultLevelResponseDecoder, options)

  /**
   * Sets the default level of repository access Dependabot will have while performing an update across organizations in
   * the enterprise. Available values are:
   * - 'public' - Dependabot will only have access to public repositories, unless access is explicitly granted to
   * non-public repositories.
   * - 'internal' - Dependabot will only have access to public and internal repositories, unless access is explicitly
   * granted to private repositories.
   *
   * The authenticated user must be an enterprise owner to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return No response body.
   * @throws DependabotSetRepositoryAccessDefaultLevelForEnterpriseApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * DependabotSetRepositoryAccessDefaultLevelForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotSetRepositoryAccessDefaultLevelForEnterprise(
    request: InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79, DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse, Unit>(
    request = SdkExecutionRequest(dependabotSetRepositoryAccessDefaultLevelForEnterpriseMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTSETREPOSITORYACCESSDEFAULTLEVELFORENTERPRISE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = DependabotCodecs.dependabotSetRepositoryAccessDefaultLevelForEnterpriseRequestCodecRegistry,
    responseDecoder = DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.SuccessNoContent -> response.unit
        is DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Http403Json -> DependabotSetRepositoryAccessDefaultLevelForEnterpriseApiException(response, statusCode, headers)
        is DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Http404Json -> DependabotSetRepositoryAccessDefaultLevelForEnterpriseApiException(response, statusCode, headers)
        is DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sets the default level of repository access Dependabot will have while performing an update across organizations in
   * the enterprise. Available values are:
   * - 'public' - Dependabot will only have access to public repositories, unless access is explicitly granted to
   * non-public repositories.
   * - 'internal' - Dependabot will only have access to public and internal repositories, unless access is explicitly
   * granted to private repositories.
   *
   * The authenticated user must be an enterprise owner to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun dependabotSetRepositoryAccessDefaultLevelForEnterpriseWithResponse(
    request: InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse> = executor.executeWithResponse<InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79, DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse>(SdkExecutionRequest(dependabotSetRepositoryAccessDefaultLevelForEnterpriseMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTSETREPOSITORYACCESSDEFAULTLEVELFORENTERPRISE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), DependabotCodecs.dependabotSetRepositoryAccessDefaultLevelForEnterpriseRequestCodecRegistry, DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseDecoder, options)

  /**
   * Replaces all repositories for an organization secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotSetSelectedReposForOrgSecret(
    request: InlineOrgsDependabotSecretsRepositoriesPutRequestJsonX770db239,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<InlineOrgsDependabotSecretsRepositoriesPutRequestJsonX770db239>(SdkExecutionRequest(dependabotSetSelectedReposForOrgSecretMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotSetSelectedReposForOrgSecretRequestCodecRegistry, options)

  /**
   * Replaces all repositories for an organization secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/dependabot/secrets#create-or-update-an-organization-secret).
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun dependabotSetSelectedReposForOrgSecretWithResponse(
    request: InlineOrgsDependabotSecretsRepositoriesPutRequestJsonX770db239,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotSetSelectedReposForOrgSecretResponse> = executor.executeWithResponse<InlineOrgsDependabotSecretsRepositoriesPutRequestJsonX770db239, DependabotSetSelectedReposForOrgSecretResponse>(SdkExecutionRequest(dependabotSetSelectedReposForOrgSecretMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), DependabotCodecs.dependabotSetSelectedReposForOrgSecretRequestCodecRegistry, DependabotSetSelectedReposForOrgSecretResponseDecoder, options)

  /**
   * The authenticated user must have access to security alerts for the repository to use this endpoint. For more
   * information, see "[Granting access to security
   * alerts](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-
   * your-repository/managing-security-and-analysis-settings-for-your-repository#granting-access-to-security-alerts)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint. If
   * this endpoint is only used with public repositories, the token can use the `public_repo` scope instead.
   *
   * @param request Request body sent to the operation.
   * @param alertNumber The number that identifies a Dependabot alert in its repository.
   * You can find this at the end of the URL for a Dependabot alert within GitHub,
   * or in `number` fields in the response from the
   * `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DependabotUpdateAlertApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded DependabotUpdateAlertError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotUpdateAlert(
    request: InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b,
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): DependabotAlert = executor.executeWithTypedErrors<InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b, DependabotUpdateAlertResponse, DependabotAlert>(
    request = SdkExecutionRequest(dependabotUpdateAlertMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTUPDATEALERT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = DependabotCodecs.dependabotUpdateAlertRequestCodecRegistry,
    responseDecoder = DependabotUpdateAlertResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotUpdateAlertResponse.SuccessJson -> response.json
        is DependabotUpdateAlertResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateAlertResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateAlertResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateAlertResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateAlertResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateAlertResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotUpdateAlertResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DependabotUpdateAlertResponse.Http400Json -> DependabotUpdateAlertApiException(response, statusCode, headers)
        is DependabotUpdateAlertResponse.Http400ScimJson -> DependabotUpdateAlertApiException(response, statusCode, headers)
        is DependabotUpdateAlertResponse.Http403Json -> DependabotUpdateAlertApiException(response, statusCode, headers)
        is DependabotUpdateAlertResponse.Http404Json -> DependabotUpdateAlertApiException(response, statusCode, headers)
        is DependabotUpdateAlertResponse.Http409Json -> DependabotUpdateAlertApiException(response, statusCode, headers)
        is DependabotUpdateAlertResponse.Http422Json -> DependabotUpdateAlertApiException(response, statusCode, headers)
        is DependabotUpdateAlertResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * The authenticated user must have access to security alerts for the repository to use this endpoint. For more
   * information, see "[Granting access to security
   * alerts](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-
   * your-repository/managing-security-and-analysis-settings-for-your-repository#granting-access-to-security-alerts)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint. If
   * this endpoint is only used with public repositories, the token can use the `public_repo` scope instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param alertNumber The number that identifies a Dependabot alert in its repository.
   * You can find this at the end of the URL for a Dependabot alert within GitHub,
   * or in `number` fields in the response from the
   * `GET /repos/{owner}/{repo}/dependabot/alerts` operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependabotUpdateAlertWithResponse(
    request: InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b,
    alertNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotUpdateAlertResponse> = executor.executeWithResponse<InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b, DependabotUpdateAlertResponse>(SdkExecutionRequest(dependabotUpdateAlertMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTUPDATEALERT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "alert_number", values = listOf(alertNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), DependabotCodecs.dependabotUpdateAlertRequestCodecRegistry, DependabotUpdateAlertResponseDecoder, options)

  /**
   * Updates repositories according to the list of repositories that enterprise admins have given Dependabot access to
   * when they've updated dependencies across organizations in the enterprise.
   *
   * The authenticated user must be an enterprise owner to use this endpoint.
   *
   * **Example request body:**
   * ```json
   * {
   * "repository_ids_to_add": [123, 456],
   * "repository_ids_to_remove": [789]
   * }
   * ```
   *
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return No response body.
   * @throws DependabotUpdateRepositoryAccessForEnterpriseApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded DependabotUpdateRepositoryAccessForEnterpriseError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotUpdateRepositoryAccessForEnterprise(
    request: InlineEnterprisesDependabotRepositoryAccessPatchRequestJsonX50899717,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineEnterprisesDependabotRepositoryAccessPatchRequestJsonX50899717, DependabotUpdateRepositoryAccessForEnterpriseResponse, Unit>(
    request = SdkExecutionRequest(dependabotUpdateRepositoryAccessForEnterpriseMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTUPDATEREPOSITORYACCESSFORENTERPRISE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = DependabotCodecs.dependabotUpdateRepositoryAccessForEnterpriseRequestCodecRegistry,
    responseDecoder = DependabotUpdateRepositoryAccessForEnterpriseResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotUpdateRepositoryAccessForEnterpriseResponse.SuccessNoContent -> response.unit
        is DependabotUpdateRepositoryAccessForEnterpriseResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateRepositoryAccessForEnterpriseResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateRepositoryAccessForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotUpdateRepositoryAccessForEnterpriseResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is DependabotUpdateRepositoryAccessForEnterpriseResponse.Http403Json -> DependabotUpdateRepositoryAccessForEnterpriseApiException(response, statusCode, headers)
        is DependabotUpdateRepositoryAccessForEnterpriseResponse.Http404Json -> DependabotUpdateRepositoryAccessForEnterpriseApiException(response, statusCode, headers)
        is DependabotUpdateRepositoryAccessForEnterpriseResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates repositories according to the list of repositories that enterprise admins have given Dependabot access to
   * when they've updated dependencies across organizations in the enterprise.
   *
   * The authenticated user must be an enterprise owner to use this endpoint.
   *
   * **Example request body:**
   * ```json
   * {
   * "repository_ids_to_add": [123, 456],
   * "repository_ids_to_remove": [789]
   * }
   * ```
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun dependabotUpdateRepositoryAccessForEnterpriseWithResponse(
    request: InlineEnterprisesDependabotRepositoryAccessPatchRequestJsonX50899717,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotUpdateRepositoryAccessForEnterpriseResponse> = executor.executeWithResponse<InlineEnterprisesDependabotRepositoryAccessPatchRequestJsonX50899717, DependabotUpdateRepositoryAccessForEnterpriseResponse>(SdkExecutionRequest(dependabotUpdateRepositoryAccessForEnterpriseMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTUPDATEREPOSITORYACCESSFORENTERPRISE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), DependabotCodecs.dependabotUpdateRepositoryAccessForEnterpriseRequestCodecRegistry, DependabotUpdateRepositoryAccessForEnterpriseResponseDecoder, options)

  /**
   * Updates repositories according to the list of repositories that organization admins have given Dependabot access to
   * when they've updated dependencies.
   *
   * > [!NOTE]
   * >    This operation supports both server-to-server and user-to-server access.
   * Unauthorized users will not see the existence of this endpoint.
   *
   * **Example request body:**
   * ```json
   * {
   * "repository_ids_to_add": [123, 456],
   * "repository_ids_to_remove": [789]
   * }
   * ```
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws DependabotUpdateRepositoryAccessForOrgApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded DependabotUpdateRepositoryAccessForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun dependabotUpdateRepositoryAccessForOrg(
    request: InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a, DependabotUpdateRepositoryAccessForOrgResponse, Unit>(
    request = SdkExecutionRequest(dependabotUpdateRepositoryAccessForOrgMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTUPDATEREPOSITORYACCESSFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = DependabotCodecs.dependabotUpdateRepositoryAccessForOrgRequestCodecRegistry,
    responseDecoder = DependabotUpdateRepositoryAccessForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DependabotUpdateRepositoryAccessForOrgResponse.SuccessNoContent -> response.unit
        is DependabotUpdateRepositoryAccessForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateRepositoryAccessForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DependabotUpdateRepositoryAccessForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DependabotUpdateRepositoryAccessForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is DependabotUpdateRepositoryAccessForOrgResponse.Http403Json -> DependabotUpdateRepositoryAccessForOrgApiException(response, statusCode, headers)
        is DependabotUpdateRepositoryAccessForOrgResponse.Http404Json -> DependabotUpdateRepositoryAccessForOrgApiException(response, statusCode, headers)
        is DependabotUpdateRepositoryAccessForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates repositories according to the list of repositories that organization admins have given Dependabot access to
   * when they've updated dependencies.
   *
   * > [!NOTE]
   * >    This operation supports both server-to-server and user-to-server access.
   * Unauthorized users will not see the existence of this endpoint.
   *
   * **Example request body:**
   * ```json
   * {
   * "repository_ids_to_add": [123, 456],
   * "repository_ids_to_remove": [789]
   * }
   * ```
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun dependabotUpdateRepositoryAccessForOrgWithResponse(
    request: InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DependabotUpdateRepositoryAccessForOrgResponse> = executor.executeWithResponse<InlineOrgsDependabotRepositoryAccessPatchRequestJsonXd5f2ed5a, DependabotUpdateRepositoryAccessForOrgResponse>(SdkExecutionRequest(dependabotUpdateRepositoryAccessForOrgMetadata, baseUri, request, listOf(DependabotCodecs.DEPENDABOTUPDATEREPOSITORYACCESSFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), DependabotCodecs.dependabotUpdateRepositoryAccessForOrgRequestCodecRegistry, DependabotUpdateRepositoryAccessForOrgResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `dependabot/add-selected-repo-to-org-secret` may expose through its
   * typed API exception.
   */
  public sealed interface DependabotAddSelectedRepoToOrgSecretError

  /**
   * Typed response alternatives for `dependabot/add-selected-repo-to-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotAddSelectedRepoToOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotAddSelectedRepoToOrgSecretResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotAddSelectedRepoToOrgSecretResponse,
        DependabotAddSelectedRepoToOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotAddSelectedRepoToOrgSecretResponse
  }

  /**
   * Raised by `dependabot/add-selected-repo-to-org-secret` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotAddSelectedRepoToOrgSecretApiException(
    public val error: DependabotAddSelectedRepoToOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/add-selected-repo-to-org-secret")

  private object DependabotAddSelectedRepoToOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotAddSelectedRepoToOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotAddSelectedRepoToOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotAddSelectedRepoToOrgSecretResponse> = when {
      alternative.id == "dependabot/add-selected-repo-to-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotAddSelectedRepoToOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/add-selected-repo-to-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotAddSelectedRepoToOrgSecretResponse.Http409NoContent(
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
    ): DependabotAddSelectedRepoToOrgSecretResponse = DependabotAddSelectedRepoToOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/create-or-update-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotCreateOrUpdateOrgSecretResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotCreateOrUpdateOrgSecretResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotCreateOrUpdateOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotCreateOrUpdateOrgSecretResponse
  }

  private object DependabotCreateOrUpdateOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotCreateOrUpdateOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotCreateOrUpdateOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotCreateOrUpdateOrgSecretResponse> = when {
      alternative.id == "dependabot/create-or-update-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotCreateOrUpdateOrgSecretResponse.SuccessJson(
          json = DependabotCodecs.dependabotCreateOrUpdateOrgSecretResponseCodecAlternative0Registry.select(listOf("dependabot/create-or-update-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/create-or-update-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotCreateOrUpdateOrgSecretResponse.SuccessNoContent(
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
    ): DependabotCreateOrUpdateOrgSecretResponse = DependabotCreateOrUpdateOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/create-or-update-repo-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotCreateOrUpdateRepoSecretResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotCreateOrUpdateRepoSecretResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotCreateOrUpdateRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotCreateOrUpdateRepoSecretResponse
  }

  private object DependabotCreateOrUpdateRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotCreateOrUpdateRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotCreateOrUpdateRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotCreateOrUpdateRepoSecretResponse> = when {
      alternative.id == "dependabot/create-or-update-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotCreateOrUpdateRepoSecretResponse.SuccessJson(
          json = DependabotCodecs.dependabotCreateOrUpdateRepoSecretResponseCodecAlternative0Registry.select(listOf("dependabot/create-or-update-repo-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/create-or-update-repo-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotCreateOrUpdateRepoSecretResponse.SuccessNoContent(
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
    ): DependabotCreateOrUpdateRepoSecretResponse = DependabotCreateOrUpdateRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/delete-org-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotDeleteOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotDeleteOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotDeleteOrgSecretResponse
  }

  private object DependabotDeleteOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotDeleteOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotDeleteOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotDeleteOrgSecretResponse> = when {
      alternative.id == "dependabot/delete-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotDeleteOrgSecretResponse.SuccessNoContent(
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
    ): DependabotDeleteOrgSecretResponse = DependabotDeleteOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/delete-repo-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotDeleteRepoSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotDeleteRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotDeleteRepoSecretResponse
  }

  private object DependabotDeleteRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotDeleteRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotDeleteRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotDeleteRepoSecretResponse> = when {
      alternative.id == "dependabot/delete-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotDeleteRepoSecretResponse.SuccessNoContent(
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
    ): DependabotDeleteRepoSecretResponse = DependabotDeleteRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/get-alert` may expose through its typed API exception.
   */
  public sealed interface DependabotGetAlertError

  /**
   * Typed response alternatives for `dependabot/get-alert`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DependabotGetAlertResponse {
    public class SuccessJson(
      public val json: DependabotAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetAlertResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetAlertResponse,
        DependabotGetAlertError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetAlertResponse,
        DependabotGetAlertError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetAlertResponse,
        DependabotGetAlertError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetAlertResponse
  }

  /**
   * Raised by `dependabot/get-alert` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class DependabotGetAlertApiException(
    public val error: DependabotGetAlertError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/get-alert")

  private object DependabotGetAlertResponseDecoder : SdkResponseAlternativeDecoder<DependabotGetAlertResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotGetAlertResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotGetAlertResponse> = when {
      alternative.id == "dependabot/get-alert.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotGetAlertResponse.SuccessJson(
          json = DependabotCodecs.dependabotGetAlertResponseCodecAlternative0Registry.select(listOf("dependabot/get-alert.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/get-alert.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotGetAlertResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/get-alert.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotGetAlertResponse.Http403Json(
          json = DependabotCodecs.dependabotGetAlertResponseCodecAlternative2Registry.select(listOf("dependabot/get-alert.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/get-alert.response.alternative3" -> SdkResponseDecodeResult(
        value = DependabotGetAlertResponse.Http404Json(
          json = DependabotCodecs.dependabotGetAlertResponseCodecAlternative3Registry.select(listOf("dependabot/get-alert.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotGetAlertResponse = DependabotGetAlertResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/get-org-public-key`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotGetOrgPublicKeyResponse {
    public class SuccessJson(
      public val json: DependabotPublicKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetOrgPublicKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetOrgPublicKeyResponse
  }

  private object DependabotGetOrgPublicKeyResponseDecoder : SdkResponseAlternativeDecoder<DependabotGetOrgPublicKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotGetOrgPublicKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotGetOrgPublicKeyResponse> = when {
      alternative.id == "dependabot/get-org-public-key.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotGetOrgPublicKeyResponse.SuccessJson(
          json = DependabotCodecs.dependabotGetOrgPublicKeyResponseCodecAlternative0Registry.select(listOf("dependabot/get-org-public-key.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotGetOrgPublicKeyResponse = DependabotGetOrgPublicKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/get-org-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotGetOrgSecretResponse {
    public class SuccessJson(
      public val json: OrganizationDependabotSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetOrgSecretResponse
  }

  private object DependabotGetOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotGetOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotGetOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotGetOrgSecretResponse> = when {
      alternative.id == "dependabot/get-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotGetOrgSecretResponse.SuccessJson(
          json = DependabotCodecs.dependabotGetOrgSecretResponseCodecAlternative0Registry.select(listOf("dependabot/get-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotGetOrgSecretResponse = DependabotGetOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/get-repo-public-key`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotGetRepoPublicKeyResponse {
    public class SuccessJson(
      public val json: DependabotPublicKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetRepoPublicKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetRepoPublicKeyResponse
  }

  private object DependabotGetRepoPublicKeyResponseDecoder : SdkResponseAlternativeDecoder<DependabotGetRepoPublicKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotGetRepoPublicKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotGetRepoPublicKeyResponse> = when {
      alternative.id == "dependabot/get-repo-public-key.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotGetRepoPublicKeyResponse.SuccessJson(
          json = DependabotCodecs.dependabotGetRepoPublicKeyResponseCodecAlternative0Registry.select(listOf("dependabot/get-repo-public-key.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotGetRepoPublicKeyResponse = DependabotGetRepoPublicKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/get-repo-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotGetRepoSecretResponse {
    public class SuccessJson(
      public val json: DependabotSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotGetRepoSecretResponse
  }

  private object DependabotGetRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotGetRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotGetRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotGetRepoSecretResponse> = when {
      alternative.id == "dependabot/get-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotGetRepoSecretResponse.SuccessJson(
          json = DependabotCodecs.dependabotGetRepoSecretResponseCodecAlternative0Registry.select(listOf("dependabot/get-repo-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotGetRepoSecretResponse = DependabotGetRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/list-alerts-for-enterprise` may expose through its typed
   * API exception.
   */
  public sealed interface DependabotListAlertsForEnterpriseError

  /**
   * Typed response alternatives for `dependabot/list-alerts-for-enterprise`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DependabotListAlertsForEnterpriseResponse {
    public class SuccessJson(
      public val json: List<DependabotAlertWithRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForEnterpriseResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForEnterpriseResponse,
        DependabotListAlertsForEnterpriseError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForEnterpriseResponse,
        DependabotListAlertsForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForEnterpriseResponse,
        DependabotListAlertsForEnterpriseError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForEnterpriseResponse,
        DependabotListAlertsForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForEnterpriseResponse
  }

  /**
   * Raised by `dependabot/list-alerts-for-enterprise` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotListAlertsForEnterpriseApiException(
    public val error: DependabotListAlertsForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/list-alerts-for-enterprise")

  private object DependabotListAlertsForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<DependabotListAlertsForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotListAlertsForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotListAlertsForEnterpriseResponse> = when {
      alternative.id == "dependabot/list-alerts-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForEnterpriseResponse.SuccessJson(
          json = DependabotCodecs.dependabotListAlertsForEnterpriseResponseCodecAlternative0Registry.select(listOf("dependabot/list-alerts-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForEnterpriseResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForEnterpriseResponse.Http403Json(
          json = DependabotCodecs.dependabotListAlertsForEnterpriseResponseCodecAlternative2Registry.select(listOf("dependabot/list-alerts-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-enterprise.response.alternative3" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForEnterpriseResponse.Http404Json(
          json = DependabotCodecs.dependabotListAlertsForEnterpriseResponseCodecAlternative3Registry.select(listOf("dependabot/list-alerts-for-enterprise.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-enterprise.response.alternative4" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForEnterpriseResponse.Http422Json(
          json = DependabotCodecs.dependabotListAlertsForEnterpriseResponseCodecAlternative4Registry.select(listOf("dependabot/list-alerts-for-enterprise.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotListAlertsForEnterpriseResponse = DependabotListAlertsForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/list-alerts-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface DependabotListAlertsForOrgError

  /**
   * Typed response alternatives for `dependabot/list-alerts-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotListAlertsForOrgResponse {
    public class SuccessJson(
      public val json: List<DependabotAlertWithRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForOrgResponse,
        DependabotListAlertsForOrgError

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForOrgResponse,
        DependabotListAlertsForOrgError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForOrgResponse,
        DependabotListAlertsForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForOrgResponse,
        DependabotListAlertsForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForOrgResponse,
        DependabotListAlertsForOrgError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForOrgResponse,
        DependabotListAlertsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForOrgResponse
  }

  /**
   * Raised by `dependabot/list-alerts-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class DependabotListAlertsForOrgApiException(
    public val error: DependabotListAlertsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/list-alerts-for-org")

  private object DependabotListAlertsForOrgResponseDecoder : SdkResponseAlternativeDecoder<DependabotListAlertsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotListAlertsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotListAlertsForOrgResponse> = when {
      alternative.id == "dependabot/list-alerts-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForOrgResponse.SuccessJson(
          json = DependabotCodecs.dependabotListAlertsForOrgResponseCodecAlternative0Registry.select(listOf("dependabot/list-alerts-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForOrgResponse.Http400Json(
          json = DependabotCodecs.dependabotListAlertsForOrgResponseCodecAlternative2Registry.select(listOf("dependabot/list-alerts-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForOrgResponse.Http400ScimJson(
          json = DependabotCodecs.dependabotListAlertsForOrgResponseCodecAlternative3Registry.select(listOf("dependabot/list-alerts-for-org.response.alternative3"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-org.response.alternative4" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForOrgResponse.Http403Json(
          json = DependabotCodecs.dependabotListAlertsForOrgResponseCodecAlternative4Registry.select(listOf("dependabot/list-alerts-for-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-org.response.alternative5" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForOrgResponse.Http404Json(
          json = DependabotCodecs.dependabotListAlertsForOrgResponseCodecAlternative5Registry.select(listOf("dependabot/list-alerts-for-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-org.response.alternative6" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForOrgResponse.Http422Json(
          json = DependabotCodecs.dependabotListAlertsForOrgResponseCodecAlternative6Registry.select(listOf("dependabot/list-alerts-for-org.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotListAlertsForOrgResponse = DependabotListAlertsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/list-alerts-for-repo` may expose through its typed API
   * exception.
   */
  public sealed interface DependabotListAlertsForRepoError

  /**
   * Typed response alternatives for `dependabot/list-alerts-for-repo`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotListAlertsForRepoResponse {
    public class SuccessJson(
      public val json: List<DependabotAlert>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForRepoResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForRepoResponse,
        DependabotListAlertsForRepoError

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForRepoResponse,
        DependabotListAlertsForRepoError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForRepoResponse,
        DependabotListAlertsForRepoError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForRepoResponse,
        DependabotListAlertsForRepoError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForRepoResponse,
        DependabotListAlertsForRepoError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForRepoResponse,
        DependabotListAlertsForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListAlertsForRepoResponse
  }

  /**
   * Raised by `dependabot/list-alerts-for-repo` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class DependabotListAlertsForRepoApiException(
    public val error: DependabotListAlertsForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/list-alerts-for-repo")

  private object DependabotListAlertsForRepoResponseDecoder : SdkResponseAlternativeDecoder<DependabotListAlertsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotListAlertsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotListAlertsForRepoResponse> = when {
      alternative.id == "dependabot/list-alerts-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForRepoResponse.SuccessJson(
          json = DependabotCodecs.dependabotListAlertsForRepoResponseCodecAlternative0Registry.select(listOf("dependabot/list-alerts-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForRepoResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForRepoResponse.Http400Json(
          json = DependabotCodecs.dependabotListAlertsForRepoResponseCodecAlternative2Registry.select(listOf("dependabot/list-alerts-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForRepoResponse.Http400ScimJson(
          json = DependabotCodecs.dependabotListAlertsForRepoResponseCodecAlternative3Registry.select(listOf("dependabot/list-alerts-for-repo.response.alternative3"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-repo.response.alternative4" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForRepoResponse.Http403Json(
          json = DependabotCodecs.dependabotListAlertsForRepoResponseCodecAlternative4Registry.select(listOf("dependabot/list-alerts-for-repo.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-repo.response.alternative5" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForRepoResponse.Http404Json(
          json = DependabotCodecs.dependabotListAlertsForRepoResponseCodecAlternative5Registry.select(listOf("dependabot/list-alerts-for-repo.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/list-alerts-for-repo.response.alternative6" -> SdkResponseDecodeResult(
        value = DependabotListAlertsForRepoResponse.Http422Json(
          json = DependabotCodecs.dependabotListAlertsForRepoResponseCodecAlternative6Registry.select(listOf("dependabot/list-alerts-for-repo.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotListAlertsForRepoResponse = DependabotListAlertsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/list-org-secrets`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotListOrgSecretsResponse {
    public class SuccessJson(
      public val json: InlineOrgsDependabotSecretsGetResponse200JsonX53aab923,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListOrgSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListOrgSecretsResponse
  }

  private object DependabotListOrgSecretsResponseDecoder : SdkResponseAlternativeDecoder<DependabotListOrgSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotListOrgSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotListOrgSecretsResponse> = when {
      alternative.id == "dependabot/list-org-secrets.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotListOrgSecretsResponse.SuccessJson(
          json = DependabotCodecs.dependabotListOrgSecretsResponseCodecAlternative0Registry.select(listOf("dependabot/list-org-secrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotListOrgSecretsResponse = DependabotListOrgSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/list-repo-secrets`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DependabotListRepoSecretsResponse {
    public class SuccessJson(
      public val json: InlineReposDependabotSecretsGetResponse200JsonX6a1075a7,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListRepoSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListRepoSecretsResponse
  }

  private object DependabotListRepoSecretsResponseDecoder : SdkResponseAlternativeDecoder<DependabotListRepoSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotListRepoSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotListRepoSecretsResponse> = when {
      alternative.id == "dependabot/list-repo-secrets.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotListRepoSecretsResponse.SuccessJson(
          json = DependabotCodecs.dependabotListRepoSecretsResponseCodecAlternative0Registry.select(listOf("dependabot/list-repo-secrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotListRepoSecretsResponse = DependabotListRepoSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/list-selected-repos-for-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotListSelectedReposForOrgSecretResponse {
    public class SuccessJson(
      public val json: InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListSelectedReposForOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotListSelectedReposForOrgSecretResponse
  }

  private object DependabotListSelectedReposForOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotListSelectedReposForOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotListSelectedReposForOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotListSelectedReposForOrgSecretResponse> = when {
      alternative.id == "dependabot/list-selected-repos-for-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotListSelectedReposForOrgSecretResponse.SuccessJson(
          json = DependabotCodecs.dependabotListSelectedReposForOrgSecretResponseCodecAlternative0Registry.select(listOf("dependabot/list-selected-repos-for-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotListSelectedReposForOrgSecretResponse = DependabotListSelectedReposForOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/remove-selected-repo-from-org-secret` may expose through
   * its typed API exception.
   */
  public sealed interface DependabotRemoveSelectedRepoFromOrgSecretError

  /**
   * Typed response alternatives for `dependabot/remove-selected-repo-from-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotRemoveSelectedRepoFromOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRemoveSelectedRepoFromOrgSecretResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRemoveSelectedRepoFromOrgSecretResponse,
        DependabotRemoveSelectedRepoFromOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRemoveSelectedRepoFromOrgSecretResponse
  }

  /**
   * Raised by `dependabot/remove-selected-repo-from-org-secret` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotRemoveSelectedRepoFromOrgSecretApiException(
    public val error: DependabotRemoveSelectedRepoFromOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/remove-selected-repo-from-org-secret")

  private object DependabotRemoveSelectedRepoFromOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotRemoveSelectedRepoFromOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotRemoveSelectedRepoFromOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotRemoveSelectedRepoFromOrgSecretResponse> = when {
      alternative.id == "dependabot/remove-selected-repo-from-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/remove-selected-repo-from-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent(
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
    ): DependabotRemoveSelectedRepoFromOrgSecretResponse = DependabotRemoveSelectedRepoFromOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/repository-access-for-enterprise` may expose through its
   * typed API exception.
   */
  public sealed interface DependabotRepositoryAccessForEnterpriseError

  /**
   * Typed response alternatives for `dependabot/repository-access-for-enterprise`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotRepositoryAccessForEnterpriseResponse {
    public class SuccessJson(
      public val json: DependabotRepositoryAccessDetails,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRepositoryAccessForEnterpriseResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRepositoryAccessForEnterpriseResponse,
        DependabotRepositoryAccessForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRepositoryAccessForEnterpriseResponse,
        DependabotRepositoryAccessForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRepositoryAccessForEnterpriseResponse
  }

  /**
   * Raised by `dependabot/repository-access-for-enterprise` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotRepositoryAccessForEnterpriseApiException(
    public val error: DependabotRepositoryAccessForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/repository-access-for-enterprise")

  private object DependabotRepositoryAccessForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<DependabotRepositoryAccessForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotRepositoryAccessForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotRepositoryAccessForEnterpriseResponse> = when {
      alternative.id == "dependabot/repository-access-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotRepositoryAccessForEnterpriseResponse.SuccessJson(
          json = DependabotCodecs.dependabotRepositoryAccessForEnterpriseResponseCodecAlternative0Registry.select(listOf("dependabot/repository-access-for-enterprise.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/repository-access-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotRepositoryAccessForEnterpriseResponse.Http403Json(
          json = DependabotCodecs.dependabotRepositoryAccessForEnterpriseResponseCodecAlternative1Registry.select(listOf("dependabot/repository-access-for-enterprise.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/repository-access-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotRepositoryAccessForEnterpriseResponse.Http404Json(
          json = DependabotCodecs.dependabotRepositoryAccessForEnterpriseResponseCodecAlternative2Registry.select(listOf("dependabot/repository-access-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotRepositoryAccessForEnterpriseResponse = DependabotRepositoryAccessForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/repository-access-for-org` may expose through its typed
   * API exception.
   */
  public sealed interface DependabotRepositoryAccessForOrgError

  /**
   * Typed response alternatives for `dependabot/repository-access-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DependabotRepositoryAccessForOrgResponse {
    public class SuccessJson(
      public val json: DependabotRepositoryAccessDetails,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRepositoryAccessForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRepositoryAccessForOrgResponse,
        DependabotRepositoryAccessForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRepositoryAccessForOrgResponse,
        DependabotRepositoryAccessForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotRepositoryAccessForOrgResponse
  }

  /**
   * Raised by `dependabot/repository-access-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotRepositoryAccessForOrgApiException(
    public val error: DependabotRepositoryAccessForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/repository-access-for-org")

  private object DependabotRepositoryAccessForOrgResponseDecoder : SdkResponseAlternativeDecoder<DependabotRepositoryAccessForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotRepositoryAccessForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotRepositoryAccessForOrgResponse> = when {
      alternative.id == "dependabot/repository-access-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotRepositoryAccessForOrgResponse.SuccessJson(
          json = DependabotCodecs.dependabotRepositoryAccessForOrgResponseCodecAlternative0Registry.select(listOf("dependabot/repository-access-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/repository-access-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotRepositoryAccessForOrgResponse.Http403Json(
          json = DependabotCodecs.dependabotRepositoryAccessForOrgResponseCodecAlternative1Registry.select(listOf("dependabot/repository-access-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/repository-access-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotRepositoryAccessForOrgResponse.Http404Json(
          json = DependabotCodecs.dependabotRepositoryAccessForOrgResponseCodecAlternative2Registry.select(listOf("dependabot/repository-access-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotRepositoryAccessForOrgResponse = DependabotRepositoryAccessForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/set-repository-access-default-level` may expose through
   * its typed API exception.
   */
  public sealed interface DependabotSetRepositoryAccessDefaultLevelError

  /**
   * Typed response alternatives for `dependabot/set-repository-access-default-level`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotSetRepositoryAccessDefaultLevelResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetRepositoryAccessDefaultLevelResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetRepositoryAccessDefaultLevelResponse,
        DependabotSetRepositoryAccessDefaultLevelError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetRepositoryAccessDefaultLevelResponse,
        DependabotSetRepositoryAccessDefaultLevelError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetRepositoryAccessDefaultLevelResponse
  }

  /**
   * Raised by `dependabot/set-repository-access-default-level` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotSetRepositoryAccessDefaultLevelApiException(
    public val error: DependabotSetRepositoryAccessDefaultLevelError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/set-repository-access-default-level")

  private object DependabotSetRepositoryAccessDefaultLevelResponseDecoder : SdkResponseAlternativeDecoder<DependabotSetRepositoryAccessDefaultLevelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotSetRepositoryAccessDefaultLevelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotSetRepositoryAccessDefaultLevelResponse> = when {
      alternative.id == "dependabot/set-repository-access-default-level.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotSetRepositoryAccessDefaultLevelResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/set-repository-access-default-level.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotSetRepositoryAccessDefaultLevelResponse.Http403Json(
          json = DependabotCodecs.dependabotSetRepositoryAccessDefaultLevelResponseCodecAlternative1Registry.select(listOf("dependabot/set-repository-access-default-level.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/set-repository-access-default-level.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotSetRepositoryAccessDefaultLevelResponse.Http404Json(
          json = DependabotCodecs.dependabotSetRepositoryAccessDefaultLevelResponseCodecAlternative2Registry.select(listOf("dependabot/set-repository-access-default-level.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotSetRepositoryAccessDefaultLevelResponse = DependabotSetRepositoryAccessDefaultLevelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/set-repository-access-default-level-for-enterprise` may
   * expose through its typed API exception.
   */
  public sealed interface DependabotSetRepositoryAccessDefaultLevelForEnterpriseError

  /**
   * Typed response alternatives for `dependabot/set-repository-access-default-level-for-enterprise`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse,
        DependabotSetRepositoryAccessDefaultLevelForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse,
        DependabotSetRepositoryAccessDefaultLevelForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse
  }

  /**
   * Raised by `dependabot/set-repository-access-default-level-for-enterprise` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotSetRepositoryAccessDefaultLevelForEnterpriseApiException(
    public val error: DependabotSetRepositoryAccessDefaultLevelForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/set-repository-access-default-level-for-enterprise")

  private object DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse> = when {
      alternative.id == "dependabot/set-repository-access-default-level-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/set-repository-access-default-level-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Http403Json(
          json = DependabotCodecs.dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecAlternative1Registry.select(listOf("dependabot/set-repository-access-default-level-for-enterprise.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/set-repository-access-default-level-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Http404Json(
          json = DependabotCodecs.dependabotSetRepositoryAccessDefaultLevelForEnterpriseResponseCodecAlternative2Registry.select(listOf("dependabot/set-repository-access-default-level-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse = DependabotSetRepositoryAccessDefaultLevelForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `dependabot/set-selected-repos-for-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotSetSelectedReposForOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetSelectedReposForOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotSetSelectedReposForOrgSecretResponse
  }

  private object DependabotSetSelectedReposForOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<DependabotSetSelectedReposForOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotSetSelectedReposForOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotSetSelectedReposForOrgSecretResponse> = when {
      alternative.id == "dependabot/set-selected-repos-for-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotSetSelectedReposForOrgSecretResponse.SuccessNoContent(
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
    ): DependabotSetSelectedReposForOrgSecretResponse = DependabotSetSelectedReposForOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/update-alert` may expose through its typed API
   * exception.
   */
  public sealed interface DependabotUpdateAlertError

  /**
   * Typed response alternatives for `dependabot/update-alert`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DependabotUpdateAlertResponse {
    public class SuccessJson(
      public val json: DependabotAlert,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateAlertResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateAlertResponse,
        DependabotUpdateAlertError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateAlertResponse,
        DependabotUpdateAlertError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateAlertResponse,
        DependabotUpdateAlertError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateAlertResponse,
        DependabotUpdateAlertError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateAlertResponse,
        DependabotUpdateAlertError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateAlertResponse,
        DependabotUpdateAlertError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateAlertResponse
  }

  /**
   * Raised by `dependabot/update-alert` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class DependabotUpdateAlertApiException(
    public val error: DependabotUpdateAlertError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/update-alert")

  private object DependabotUpdateAlertResponseDecoder : SdkResponseAlternativeDecoder<DependabotUpdateAlertResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotUpdateAlertResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotUpdateAlertResponse> = when {
      alternative.id == "dependabot/update-alert.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotUpdateAlertResponse.SuccessJson(
          json = DependabotCodecs.dependabotUpdateAlertResponseCodecAlternative0Registry.select(listOf("dependabot/update-alert.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-alert.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotUpdateAlertResponse.Http400Json(
          json = DependabotCodecs.dependabotUpdateAlertResponseCodecAlternative1Registry.select(listOf("dependabot/update-alert.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-alert.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotUpdateAlertResponse.Http400ScimJson(
          json = DependabotCodecs.dependabotUpdateAlertResponseCodecAlternative2Registry.select(listOf("dependabot/update-alert.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-alert.response.alternative3" -> SdkResponseDecodeResult(
        value = DependabotUpdateAlertResponse.Http403Json(
          json = DependabotCodecs.dependabotUpdateAlertResponseCodecAlternative3Registry.select(listOf("dependabot/update-alert.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-alert.response.alternative4" -> SdkResponseDecodeResult(
        value = DependabotUpdateAlertResponse.Http404Json(
          json = DependabotCodecs.dependabotUpdateAlertResponseCodecAlternative4Registry.select(listOf("dependabot/update-alert.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-alert.response.alternative5" -> SdkResponseDecodeResult(
        value = DependabotUpdateAlertResponse.Http409Json(
          json = DependabotCodecs.dependabotUpdateAlertResponseCodecAlternative5Registry.select(listOf("dependabot/update-alert.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-alert.response.alternative6" -> SdkResponseDecodeResult(
        value = DependabotUpdateAlertResponse.Http422Json(
          json = DependabotCodecs.dependabotUpdateAlertResponseCodecAlternative6Registry.select(listOf("dependabot/update-alert.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotUpdateAlertResponse = DependabotUpdateAlertResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/update-repository-access-for-enterprise` may expose
   * through its typed API exception.
   */
  public sealed interface DependabotUpdateRepositoryAccessForEnterpriseError

  /**
   * Typed response alternatives for `dependabot/update-repository-access-for-enterprise`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface DependabotUpdateRepositoryAccessForEnterpriseResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateRepositoryAccessForEnterpriseResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateRepositoryAccessForEnterpriseResponse,
        DependabotUpdateRepositoryAccessForEnterpriseError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateRepositoryAccessForEnterpriseResponse,
        DependabotUpdateRepositoryAccessForEnterpriseError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateRepositoryAccessForEnterpriseResponse
  }

  /**
   * Raised by `dependabot/update-repository-access-for-enterprise` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotUpdateRepositoryAccessForEnterpriseApiException(
    public val error: DependabotUpdateRepositoryAccessForEnterpriseError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/update-repository-access-for-enterprise")

  private object DependabotUpdateRepositoryAccessForEnterpriseResponseDecoder : SdkResponseAlternativeDecoder<DependabotUpdateRepositoryAccessForEnterpriseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotUpdateRepositoryAccessForEnterpriseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotUpdateRepositoryAccessForEnterpriseResponse> = when {
      alternative.id == "dependabot/update-repository-access-for-enterprise.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotUpdateRepositoryAccessForEnterpriseResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-repository-access-for-enterprise.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotUpdateRepositoryAccessForEnterpriseResponse.Http403Json(
          json = DependabotCodecs.dependabotUpdateRepositoryAccessForEnterpriseResponseCodecAlternative1Registry.select(listOf("dependabot/update-repository-access-for-enterprise.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-repository-access-for-enterprise.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotUpdateRepositoryAccessForEnterpriseResponse.Http404Json(
          json = DependabotCodecs.dependabotUpdateRepositoryAccessForEnterpriseResponseCodecAlternative2Registry.select(listOf("dependabot/update-repository-access-for-enterprise.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotUpdateRepositoryAccessForEnterpriseResponse = DependabotUpdateRepositoryAccessForEnterpriseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `dependabot/update-repository-access-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface DependabotUpdateRepositoryAccessForOrgError

  /**
   * Typed response alternatives for `dependabot/update-repository-access-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DependabotUpdateRepositoryAccessForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateRepositoryAccessForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateRepositoryAccessForOrgResponse,
        DependabotUpdateRepositoryAccessForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateRepositoryAccessForOrgResponse,
        DependabotUpdateRepositoryAccessForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DependabotUpdateRepositoryAccessForOrgResponse
  }

  /**
   * Raised by `dependabot/update-repository-access-for-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class DependabotUpdateRepositoryAccessForOrgApiException(
    public val error: DependabotUpdateRepositoryAccessForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "dependabot/update-repository-access-for-org")

  private object DependabotUpdateRepositoryAccessForOrgResponseDecoder : SdkResponseAlternativeDecoder<DependabotUpdateRepositoryAccessForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DependabotUpdateRepositoryAccessForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DependabotUpdateRepositoryAccessForOrgResponse> = when {
      alternative.id == "dependabot/update-repository-access-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = DependabotUpdateRepositoryAccessForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-repository-access-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = DependabotUpdateRepositoryAccessForOrgResponse.Http403Json(
          json = DependabotCodecs.dependabotUpdateRepositoryAccessForOrgResponseCodecAlternative1Registry.select(listOf("dependabot/update-repository-access-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "dependabot/update-repository-access-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = DependabotUpdateRepositoryAccessForOrgResponse.Http404Json(
          json = DependabotCodecs.dependabotUpdateRepositoryAccessForOrgResponseCodecAlternative2Registry.select(listOf("dependabot/update-repository-access-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DependabotUpdateRepositoryAccessForOrgResponse = DependabotUpdateRepositoryAccessForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val dependabotAddSelectedRepoToOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/add-selected-repo-to-org-secret",
          method = "PUT",
          path = "/orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id}",
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
              id = "dependabot/add-selected-repo-to-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/add-selected-repo-to-org-secret.response.alternative1",
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

    internal val dependabotCreateOrUpdateOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/create-or-update-org-secret",
          method = "PUT",
          path = "/orgs/{org}/dependabot/secrets/{secret_name}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/create-or-update-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/create-or-update-org-secret.response.alternative1",
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

    internal val dependabotCreateOrUpdateRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/create-or-update-repo-secret",
          method = "PUT",
          path = "/repos/{owner}/{repo}/dependabot/secrets/{secret_name}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/create-or-update-repo-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/create-or-update-repo-secret.response.alternative1",
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

    internal val dependabotDeleteOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/delete-org-secret",
          method = "DELETE",
          path = "/orgs/{org}/dependabot/secrets/{secret_name}",
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
              id = "dependabot/delete-org-secret.response.alternative0",
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

    internal val dependabotDeleteRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/delete-repo-secret",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/dependabot/secrets/{secret_name}",
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
              id = "dependabot/delete-repo-secret.response.alternative0",
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

    internal val dependabotGetAlertMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/get-alert",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependabot/alerts/{alert_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DependabotAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/get-alert.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/get-alert.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/get-alert.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/get-alert.response.alternative3",
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

    internal val dependabotGetOrgPublicKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/get-org-public-key",
          method = "GET",
          path = "/orgs/{org}/dependabot/secrets/public-key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DependabotPublicKey",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/get-org-public-key.response.alternative0",
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

    internal val dependabotGetOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/get-org-secret",
          method = "GET",
          path = "/orgs/{org}/dependabot/secrets/{secret_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "OrganizationDependabotSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/get-org-secret.response.alternative0",
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

    internal val dependabotGetRepoPublicKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/get-repo-public-key",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependabot/secrets/public-key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DependabotPublicKey",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/get-repo-public-key.response.alternative0",
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

    internal val dependabotGetRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/get-repo-secret",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependabot/secrets/{secret_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DependabotSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/get-repo-secret.response.alternative0",
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

    internal val dependabotListAlertsForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/list-alerts-for-enterprise",
          method = "GET",
          path = "/enterprises/{enterprise}/dependabot/alerts",
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
              id = "dependabot/list-alerts-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-enterprise.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-enterprise.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-enterprise.response.alternative4",
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

    internal val dependabotListAlertsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/list-alerts-for-org",
          method = "GET",
          path = "/orgs/{org}/dependabot/alerts",
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
              id = "dependabot/list-alerts-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-org.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-org.response.alternative6",
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

    internal val dependabotListAlertsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/list-alerts-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependabot/alerts",
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
              id = "dependabot/list-alerts-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-repo.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-repo.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-repo.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-alerts-for-repo.response.alternative6",
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

    internal val dependabotListOrgSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/list-org-secrets",
          method = "GET",
          path = "/orgs/{org}/dependabot/secrets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsDependabotSecretsGetResponse200JsonX53aab923",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-org-secrets.response.alternative0",
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

    internal val dependabotListRepoSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/list-repo-secrets",
          method = "GET",
          path = "/repos/{owner}/{repo}/dependabot/secrets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposDependabotSecretsGetResponse200JsonX6a1075a7",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-repo-secrets.response.alternative0",
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

    internal val dependabotListSelectedReposForOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/list-selected-repos-for-org-secret",
          method = "GET",
          path = "/orgs/{org}/dependabot/secrets/{secret_name}/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsDependabotSecretsRepositoriesGetResponse200JsonX4c38e0ee",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/list-selected-repos-for-org-secret.response.alternative0",
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

    internal val dependabotRemoveSelectedRepoFromOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/remove-selected-repo-from-org-secret",
          method = "DELETE",
          path = "/orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id}",
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
              id = "dependabot/remove-selected-repo-from-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/remove-selected-repo-from-org-secret.response.alternative1",
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

    internal val dependabotRepositoryAccessForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/repository-access-for-enterprise",
          method = "GET",
          path = "/enterprises/{enterprise}/dependabot/repository-access",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DependabotRepositoryAccessDetails",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/repository-access-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/repository-access-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/repository-access-for-enterprise.response.alternative2",
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

    internal val dependabotRepositoryAccessForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/repository-access-for-org",
          method = "GET",
          path = "/orgs/{org}/dependabot/repository-access",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DependabotRepositoryAccessDetails",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/repository-access-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/repository-access-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/repository-access-for-org.response.alternative2",
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

    internal val dependabotSetRepositoryAccessDefaultLevelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/set-repository-access-default-level",
          method = "PUT",
          path = "/orgs/{org}/dependabot/repository-access/default-level",
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
              id = "dependabot/set-repository-access-default-level.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/set-repository-access-default-level.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/set-repository-access-default-level.response.alternative2",
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

    internal val dependabotSetRepositoryAccessDefaultLevelForEnterpriseMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/set-repository-access-default-level-for-enterprise",
          method = "PUT",
          path = "/enterprises/{enterprise}/dependabot/repository-access/default-level",
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
              id = "dependabot/set-repository-access-default-level-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/set-repository-access-default-level-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/set-repository-access-default-level-for-enterprise.response.alternative2",
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

    internal val dependabotSetSelectedReposForOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/set-selected-repos-for-org-secret",
          method = "PUT",
          path = "/orgs/{org}/dependabot/secrets/{secret_name}/repositories",
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
              id = "dependabot/set-selected-repos-for-org-secret.response.alternative0",
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

    internal val dependabotUpdateAlertMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/update-alert",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/dependabot/alerts/{alert_number}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DependabotAlert",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-alert.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-alert.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-alert.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-alert.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-alert.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-alert.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-alert.response.alternative6",
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

    internal val dependabotUpdateRepositoryAccessForEnterpriseMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/update-repository-access-for-enterprise",
          method = "PATCH",
          path = "/enterprises/{enterprise}/dependabot/repository-access",
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
              id = "dependabot/update-repository-access-for-enterprise.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-repository-access-for-enterprise.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-repository-access-for-enterprise.response.alternative2",
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

    internal val dependabotUpdateRepositoryAccessForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "dependabot/update-repository-access-for-org",
          method = "PATCH",
          path = "/orgs/{org}/dependabot/repository-access",
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
              id = "dependabot/update-repository-access-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-repository-access-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "dependabot/update-repository-access-for-org.response.alternative2",
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
