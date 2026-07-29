package com.nabobery.sdkgen.github.generated.agents

import com.nabobery.sdkgen.github.generated.ActionsPublicKey
import com.nabobery.sdkgen.github.generated.ActionsSecret
import com.nabobery.sdkgen.github.generated.ActionsVariable
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsSecretsPutRequestJsonXf55493a1
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsVariablesPostRequestJsonX7df0b024
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795
import com.nabobery.sdkgen.github.generated.InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2
import com.nabobery.sdkgen.github.generated.InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94
import com.nabobery.sdkgen.github.generated.InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa
import com.nabobery.sdkgen.github.generated.InlineReposAgentsSecretsGetResponse200JsonXfad460e5
import com.nabobery.sdkgen.github.generated.InlineReposAgentsSecretsPutRequestJsonXf1e2779a
import com.nabobery.sdkgen.github.generated.InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b
import com.nabobery.sdkgen.github.generated.InlineReposAgentsVariablesPatchRequestJsonX5337d0f3
import com.nabobery.sdkgen.github.generated.InlineReposAgentsVariablesPostRequestJsonXcbb2b262
import com.nabobery.sdkgen.github.generated.OrganizationActionsSecret
import com.nabobery.sdkgen.github.generated.OrganizationActionsVariable
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
import kotlinx.serialization.json.JsonObject

public object AgentsCodecs {
  public val agentsAddSelectedRepoToOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsAddSelectedRepoToOrgSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsAddSelectedRepoToOrgVariableRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsAddSelectedRepoToOrgVariableResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val AGENTSCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID: String =
      "agents/create-or-update-org-secret.request"

  private val agentsCreateOrUpdateOrgSecretRequestCodec:
      MediaTypeCodec<InlineOrgsAgentsSecretsPutRequestJsonXf55493a1> =
      KotlinxSerializationCodec(AGENTSCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID, InlineOrgsAgentsSecretsPutRequestJsonXf55493a1.Serializer, SdkJson)

  private val agentsCreateOrUpdateOrgSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("agents/create-or-update-org-secret.response.alternative0", JsonObject.serializer(), SdkJson)

  public val agentsCreateOrUpdateOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(agentsCreateOrUpdateOrgSecretResponseCodecAlternative0Codec)

  public val agentsCreateOrUpdateOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsSecretsPutRequestJsonXf55493a1> =
      MediaTypeCodecRegistry.of(agentsCreateOrUpdateOrgSecretRequestCodec)

  public const val AGENTSCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID: String =
      "agents/create-or-update-repo-secret.request"

  private val agentsCreateOrUpdateRepoSecretRequestCodec:
      MediaTypeCodec<InlineReposAgentsSecretsPutRequestJsonXf1e2779a> =
      KotlinxSerializationCodec(AGENTSCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID, InlineReposAgentsSecretsPutRequestJsonXf1e2779a.Serializer, SdkJson)

  private val agentsCreateOrUpdateRepoSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("agents/create-or-update-repo-secret.response.alternative0", JsonObject.serializer(), SdkJson)

  public val agentsCreateOrUpdateRepoSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(agentsCreateOrUpdateRepoSecretResponseCodecAlternative0Codec)

  public val agentsCreateOrUpdateRepoSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposAgentsSecretsPutRequestJsonXf1e2779a> =
      MediaTypeCodecRegistry.of(agentsCreateOrUpdateRepoSecretRequestCodec)

  public const val AGENTSCREATEORGVARIABLE_REQUEST_CODEC_ID: String =
      "agents/create-org-variable.request"

  private val agentsCreateOrgVariableRequestCodec:
      MediaTypeCodec<InlineOrgsAgentsVariablesPostRequestJsonX7df0b024> =
      KotlinxSerializationCodec(AGENTSCREATEORGVARIABLE_REQUEST_CODEC_ID, InlineOrgsAgentsVariablesPostRequestJsonX7df0b024.Serializer, SdkJson)

  public const val AGENTSCREATEORGVARIABLE_RESPONSE_CODEC_ID: String =
      "agents/create-org-variable.response"

  private val agentsCreateOrgVariableResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(AGENTSCREATEORGVARIABLE_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val agentsCreateOrgVariableResponseCodecAlternative0Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("agents/create-org-variable.response.alternative0", JsonObject.serializer(), SdkJson)

  public val agentsCreateOrgVariableResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(agentsCreateOrgVariableResponseCodecAlternative0Codec)

  public val agentsCreateOrgVariableRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsVariablesPostRequestJsonX7df0b024> =
      MediaTypeCodecRegistry.of(agentsCreateOrgVariableRequestCodec)

  public val agentsCreateOrgVariableResponseCodecRegistry: MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(agentsCreateOrgVariableResponseCodec)

  public const val AGENTSCREATEREPOVARIABLE_REQUEST_CODEC_ID: String =
      "agents/create-repo-variable.request"

  private val agentsCreateRepoVariableRequestCodec:
      MediaTypeCodec<InlineReposAgentsVariablesPostRequestJsonXcbb2b262> =
      KotlinxSerializationCodec(AGENTSCREATEREPOVARIABLE_REQUEST_CODEC_ID, InlineReposAgentsVariablesPostRequestJsonXcbb2b262.Serializer, SdkJson)

  public const val AGENTSCREATEREPOVARIABLE_RESPONSE_CODEC_ID: String =
      "agents/create-repo-variable.response"

  private val agentsCreateRepoVariableResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(AGENTSCREATEREPOVARIABLE_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val agentsCreateRepoVariableResponseCodecAlternative0Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("agents/create-repo-variable.response.alternative0", JsonObject.serializer(), SdkJson)

  public val agentsCreateRepoVariableResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(agentsCreateRepoVariableResponseCodecAlternative0Codec)

  public val agentsCreateRepoVariableRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposAgentsVariablesPostRequestJsonXcbb2b262> =
      MediaTypeCodecRegistry.of(agentsCreateRepoVariableRequestCodec)

  public val agentsCreateRepoVariableResponseCodecRegistry: MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(agentsCreateRepoVariableResponseCodec)

  public val agentsDeleteOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsDeleteOrgSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsDeleteOrgVariableRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsDeleteOrgVariableResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsDeleteRepoSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsDeleteRepoSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsDeleteRepoVariableRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsDeleteRepoVariableResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val AGENTSGETORGPUBLICKEY_RESPONSE_CODEC_ID: String =
      "agents/get-org-public-key.response"

  private val agentsGetOrgPublicKeyResponseCodec: MediaTypeCodec<ActionsPublicKey> =
      KotlinxSerializationCodec(AGENTSGETORGPUBLICKEY_RESPONSE_CODEC_ID, ActionsPublicKey.Serializer, SdkJson)

  private val agentsGetOrgPublicKeyResponseCodecAlternative0Codec: MediaTypeCodec<ActionsPublicKey>
      =
      KotlinxSerializationCodec("agents/get-org-public-key.response.alternative0", ActionsPublicKey.Serializer, SdkJson)

  public val agentsGetOrgPublicKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ActionsPublicKey> =
      MediaTypeCodecRegistry.of(agentsGetOrgPublicKeyResponseCodecAlternative0Codec)

  public val agentsGetOrgPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsGetOrgPublicKeyResponseCodecRegistry: MediaTypeCodecRegistry<ActionsPublicKey> =
      MediaTypeCodecRegistry.of(agentsGetOrgPublicKeyResponseCodec)

  public const val AGENTSGETORGSECRET_RESPONSE_CODEC_ID: String = "agents/get-org-secret.response"

  private val agentsGetOrgSecretResponseCodec: MediaTypeCodec<OrganizationActionsSecret> =
      KotlinxSerializationCodec(AGENTSGETORGSECRET_RESPONSE_CODEC_ID, OrganizationActionsSecret.Serializer, SdkJson)

  private val agentsGetOrgSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<OrganizationActionsSecret> =
      KotlinxSerializationCodec("agents/get-org-secret.response.alternative0", OrganizationActionsSecret.Serializer, SdkJson)

  public val agentsGetOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OrganizationActionsSecret> =
      MediaTypeCodecRegistry.of(agentsGetOrgSecretResponseCodecAlternative0Codec)

  public val agentsGetOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsGetOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<OrganizationActionsSecret> =
      MediaTypeCodecRegistry.of(agentsGetOrgSecretResponseCodec)

  public const val AGENTSGETORGVARIABLE_RESPONSE_CODEC_ID: String =
      "agents/get-org-variable.response"

  private val agentsGetOrgVariableResponseCodec: MediaTypeCodec<OrganizationActionsVariable> =
      KotlinxSerializationCodec(AGENTSGETORGVARIABLE_RESPONSE_CODEC_ID, OrganizationActionsVariable.Serializer, SdkJson)

  private val agentsGetOrgVariableResponseCodecAlternative0Codec:
      MediaTypeCodec<OrganizationActionsVariable> =
      KotlinxSerializationCodec("agents/get-org-variable.response.alternative0", OrganizationActionsVariable.Serializer, SdkJson)

  public val agentsGetOrgVariableResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OrganizationActionsVariable> =
      MediaTypeCodecRegistry.of(agentsGetOrgVariableResponseCodecAlternative0Codec)

  public val agentsGetOrgVariableRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsGetOrgVariableResponseCodecRegistry:
      MediaTypeCodecRegistry<OrganizationActionsVariable> =
      MediaTypeCodecRegistry.of(agentsGetOrgVariableResponseCodec)

  public const val AGENTSGETREPOPUBLICKEY_RESPONSE_CODEC_ID: String =
      "agents/get-repo-public-key.response"

  private val agentsGetRepoPublicKeyResponseCodec: MediaTypeCodec<ActionsPublicKey> =
      KotlinxSerializationCodec(AGENTSGETREPOPUBLICKEY_RESPONSE_CODEC_ID, ActionsPublicKey.Serializer, SdkJson)

  private val agentsGetRepoPublicKeyResponseCodecAlternative0Codec: MediaTypeCodec<ActionsPublicKey>
      =
      KotlinxSerializationCodec("agents/get-repo-public-key.response.alternative0", ActionsPublicKey.Serializer, SdkJson)

  public val agentsGetRepoPublicKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ActionsPublicKey> =
      MediaTypeCodecRegistry.of(agentsGetRepoPublicKeyResponseCodecAlternative0Codec)

  public val agentsGetRepoPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsGetRepoPublicKeyResponseCodecRegistry: MediaTypeCodecRegistry<ActionsPublicKey> =
      MediaTypeCodecRegistry.of(agentsGetRepoPublicKeyResponseCodec)

  public const val AGENTSGETREPOSECRET_RESPONSE_CODEC_ID: String = "agents/get-repo-secret.response"

  private val agentsGetRepoSecretResponseCodec: MediaTypeCodec<ActionsSecret> =
      KotlinxSerializationCodec(AGENTSGETREPOSECRET_RESPONSE_CODEC_ID, ActionsSecret.Serializer, SdkJson)

  private val agentsGetRepoSecretResponseCodecAlternative0Codec: MediaTypeCodec<ActionsSecret> =
      KotlinxSerializationCodec("agents/get-repo-secret.response.alternative0", ActionsSecret.Serializer, SdkJson)

  public val agentsGetRepoSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ActionsSecret> =
      MediaTypeCodecRegistry.of(agentsGetRepoSecretResponseCodecAlternative0Codec)

  public val agentsGetRepoSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsGetRepoSecretResponseCodecRegistry: MediaTypeCodecRegistry<ActionsSecret> =
      MediaTypeCodecRegistry.of(agentsGetRepoSecretResponseCodec)

  public const val AGENTSGETREPOVARIABLE_RESPONSE_CODEC_ID: String =
      "agents/get-repo-variable.response"

  private val agentsGetRepoVariableResponseCodec: MediaTypeCodec<ActionsVariable> =
      KotlinxSerializationCodec(AGENTSGETREPOVARIABLE_RESPONSE_CODEC_ID, ActionsVariable.Serializer, SdkJson)

  private val agentsGetRepoVariableResponseCodecAlternative0Codec: MediaTypeCodec<ActionsVariable> =
      KotlinxSerializationCodec("agents/get-repo-variable.response.alternative0", ActionsVariable.Serializer, SdkJson)

  public val agentsGetRepoVariableResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ActionsVariable> =
      MediaTypeCodecRegistry.of(agentsGetRepoVariableResponseCodecAlternative0Codec)

  public val agentsGetRepoVariableRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsGetRepoVariableResponseCodecRegistry: MediaTypeCodecRegistry<ActionsVariable> =
      MediaTypeCodecRegistry.of(agentsGetRepoVariableResponseCodec)

  public const val AGENTSLISTORGSECRETS_RESPONSE_CODEC_ID: String =
      "agents/list-org-secrets.response"

  private val agentsListOrgSecretsResponseCodec:
      MediaTypeCodec<InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13> =
      KotlinxSerializationCodec(AGENTSLISTORGSECRETS_RESPONSE_CODEC_ID, InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13.Serializer, SdkJson)

  private val agentsListOrgSecretsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13> =
      KotlinxSerializationCodec("agents/list-org-secrets.response.alternative0", InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13.Serializer, SdkJson)

  public val agentsListOrgSecretsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13> =
      MediaTypeCodecRegistry.of(agentsListOrgSecretsResponseCodecAlternative0Codec)

  public val agentsListOrgSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsListOrgSecretsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13> =
      MediaTypeCodecRegistry.of(agentsListOrgSecretsResponseCodec)

  public const val AGENTSLISTORGVARIABLES_RESPONSE_CODEC_ID: String =
      "agents/list-org-variables.response"

  private val agentsListOrgVariablesResponseCodec:
      MediaTypeCodec<InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4> =
      KotlinxSerializationCodec(AGENTSLISTORGVARIABLES_RESPONSE_CODEC_ID, InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4.Serializer, SdkJson)

  private val agentsListOrgVariablesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4> =
      KotlinxSerializationCodec("agents/list-org-variables.response.alternative0", InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4.Serializer, SdkJson)

  public val agentsListOrgVariablesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4> =
      MediaTypeCodecRegistry.of(agentsListOrgVariablesResponseCodecAlternative0Codec)

  public val agentsListOrgVariablesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsListOrgVariablesResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4> =
      MediaTypeCodecRegistry.of(agentsListOrgVariablesResponseCodec)

  public const val AGENTSLISTREPOORGANIZATIONSECRETS_RESPONSE_CODEC_ID: String =
      "agents/list-repo-organization-secrets.response"

  private val agentsListRepoOrganizationSecretsResponseCodec:
      MediaTypeCodec<InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94> =
      KotlinxSerializationCodec(AGENTSLISTREPOORGANIZATIONSECRETS_RESPONSE_CODEC_ID, InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94.Serializer, SdkJson)

  private val agentsListRepoOrganizationSecretsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94> =
      KotlinxSerializationCodec("agents/list-repo-organization-secrets.response.alternative0", InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94.Serializer, SdkJson)

  public val agentsListRepoOrganizationSecretsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94> =
      MediaTypeCodecRegistry.of(agentsListRepoOrganizationSecretsResponseCodecAlternative0Codec)

  public val agentsListRepoOrganizationSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsListRepoOrganizationSecretsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94> =
      MediaTypeCodecRegistry.of(agentsListRepoOrganizationSecretsResponseCodec)

  public const val AGENTSLISTREPOORGANIZATIONVARIABLES_RESPONSE_CODEC_ID: String =
      "agents/list-repo-organization-variables.response"

  private val agentsListRepoOrganizationVariablesResponseCodec:
      MediaTypeCodec<InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa> =
      KotlinxSerializationCodec(AGENTSLISTREPOORGANIZATIONVARIABLES_RESPONSE_CODEC_ID, InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa.Serializer, SdkJson)

  private val agentsListRepoOrganizationVariablesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa> =
      KotlinxSerializationCodec("agents/list-repo-organization-variables.response.alternative0", InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa.Serializer, SdkJson)

  public val agentsListRepoOrganizationVariablesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa> =
      MediaTypeCodecRegistry.of(agentsListRepoOrganizationVariablesResponseCodecAlternative0Codec)

  public val agentsListRepoOrganizationVariablesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsListRepoOrganizationVariablesResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa> =
      MediaTypeCodecRegistry.of(agentsListRepoOrganizationVariablesResponseCodec)

  public const val AGENTSLISTREPOSECRETS_RESPONSE_CODEC_ID: String =
      "agents/list-repo-secrets.response"

  private val agentsListRepoSecretsResponseCodec:
      MediaTypeCodec<InlineReposAgentsSecretsGetResponse200JsonXfad460e5> =
      KotlinxSerializationCodec(AGENTSLISTREPOSECRETS_RESPONSE_CODEC_ID, InlineReposAgentsSecretsGetResponse200JsonXfad460e5.Serializer, SdkJson)

  private val agentsListRepoSecretsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposAgentsSecretsGetResponse200JsonXfad460e5> =
      KotlinxSerializationCodec("agents/list-repo-secrets.response.alternative0", InlineReposAgentsSecretsGetResponse200JsonXfad460e5.Serializer, SdkJson)

  public val agentsListRepoSecretsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposAgentsSecretsGetResponse200JsonXfad460e5> =
      MediaTypeCodecRegistry.of(agentsListRepoSecretsResponseCodecAlternative0Codec)

  public val agentsListRepoSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsListRepoSecretsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposAgentsSecretsGetResponse200JsonXfad460e5> =
      MediaTypeCodecRegistry.of(agentsListRepoSecretsResponseCodec)

  public const val AGENTSLISTREPOVARIABLES_RESPONSE_CODEC_ID: String =
      "agents/list-repo-variables.response"

  private val agentsListRepoVariablesResponseCodec:
      MediaTypeCodec<InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b> =
      KotlinxSerializationCodec(AGENTSLISTREPOVARIABLES_RESPONSE_CODEC_ID, InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b.Serializer, SdkJson)

  private val agentsListRepoVariablesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b> =
      KotlinxSerializationCodec("agents/list-repo-variables.response.alternative0", InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b.Serializer, SdkJson)

  public val agentsListRepoVariablesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b> =
      MediaTypeCodecRegistry.of(agentsListRepoVariablesResponseCodecAlternative0Codec)

  public val agentsListRepoVariablesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsListRepoVariablesResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b> =
      MediaTypeCodecRegistry.of(agentsListRepoVariablesResponseCodec)

  public const val AGENTSLISTSELECTEDREPOSFORORGSECRET_RESPONSE_CODEC_ID: String =
      "agents/list-selected-repos-for-org-secret.response"

  private val agentsListSelectedReposForOrgSecretResponseCodec:
      MediaTypeCodec<InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312> =
      KotlinxSerializationCodec(AGENTSLISTSELECTEDREPOSFORORGSECRET_RESPONSE_CODEC_ID, InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312.Serializer, SdkJson)

  private val agentsListSelectedReposForOrgSecretResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312> =
      KotlinxSerializationCodec("agents/list-selected-repos-for-org-secret.response.alternative0", InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312.Serializer, SdkJson)

  public val agentsListSelectedReposForOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312> =
      MediaTypeCodecRegistry.of(agentsListSelectedReposForOrgSecretResponseCodecAlternative0Codec)

  public val agentsListSelectedReposForOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val agentsListSelectedReposForOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312> =
      MediaTypeCodecRegistry.of(agentsListSelectedReposForOrgSecretResponseCodec)

  public const val AGENTSLISTSELECTEDREPOSFORORGVARIABLE_RESPONSE_CODEC_ID: String =
      "agents/list-selected-repos-for-org-variable.response"

  private val agentsListSelectedReposForOrgVariableResponseCodec:
      MediaTypeCodec<InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795> =
      KotlinxSerializationCodec(AGENTSLISTSELECTEDREPOSFORORGVARIABLE_RESPONSE_CODEC_ID, InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795.Serializer, SdkJson)

  private val agentsListSelectedReposForOrgVariableResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795> =
      KotlinxSerializationCodec("agents/list-selected-repos-for-org-variable.response.alternative0", InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795.Serializer, SdkJson)

  public val agentsListSelectedReposForOrgVariableResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795> =
      MediaTypeCodecRegistry.of(agentsListSelectedReposForOrgVariableResponseCodecAlternative0Codec)

  public val agentsListSelectedReposForOrgVariableRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val agentsListSelectedReposForOrgVariableResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795> =
      MediaTypeCodecRegistry.of(agentsListSelectedReposForOrgVariableResponseCodec)

  public val agentsRemoveSelectedRepoFromOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val agentsRemoveSelectedRepoFromOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val agentsRemoveSelectedRepoFromOrgVariableRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val agentsRemoveSelectedRepoFromOrgVariableResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val AGENTSSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID: String =
      "agents/set-selected-repos-for-org-secret.request"

  private val agentsSetSelectedReposForOrgSecretRequestCodec:
      MediaTypeCodec<InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912> =
      KotlinxSerializationCodec(AGENTSSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID, InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912.Serializer, SdkJson)

  public val agentsSetSelectedReposForOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912> =
      MediaTypeCodecRegistry.of(agentsSetSelectedReposForOrgSecretRequestCodec)

  public val agentsSetSelectedReposForOrgSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val AGENTSSETSELECTEDREPOSFORORGVARIABLE_REQUEST_CODEC_ID: String =
      "agents/set-selected-repos-for-org-variable.request"

  private val agentsSetSelectedReposForOrgVariableRequestCodec:
      MediaTypeCodec<InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2> =
      KotlinxSerializationCodec(AGENTSSETSELECTEDREPOSFORORGVARIABLE_REQUEST_CODEC_ID, InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2.Serializer, SdkJson)

  public val agentsSetSelectedReposForOrgVariableRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2> =
      MediaTypeCodecRegistry.of(agentsSetSelectedReposForOrgVariableRequestCodec)

  public val agentsSetSelectedReposForOrgVariableResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public const val AGENTSUPDATEORGVARIABLE_REQUEST_CODEC_ID: String =
      "agents/update-org-variable.request"

  private val agentsUpdateOrgVariableRequestCodec:
      MediaTypeCodec<InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8> =
      KotlinxSerializationCodec(AGENTSUPDATEORGVARIABLE_REQUEST_CODEC_ID, InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8.Serializer, SdkJson)

  public val agentsUpdateOrgVariableRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8> =
      MediaTypeCodecRegistry.of(agentsUpdateOrgVariableRequestCodec)

  public val agentsUpdateOrgVariableResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val AGENTSUPDATEREPOVARIABLE_REQUEST_CODEC_ID: String =
      "agents/update-repo-variable.request"

  private val agentsUpdateRepoVariableRequestCodec:
      MediaTypeCodec<InlineReposAgentsVariablesPatchRequestJsonX5337d0f3> =
      KotlinxSerializationCodec(AGENTSUPDATEREPOVARIABLE_REQUEST_CODEC_ID, InlineReposAgentsVariablesPatchRequestJsonX5337d0f3.Serializer, SdkJson)

  public val agentsUpdateRepoVariableRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposAgentsVariablesPatchRequestJsonX5337d0f3> =
      MediaTypeCodecRegistry.of(agentsUpdateRepoVariableRequestCodec)

  public val agentsUpdateRepoVariableResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'agents' group of GitHub v3 REST API.
 */
public class AgentsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@AgentsClient.authentication)

  /**
   * Adds a repository to an organization secret when the `visibility` for
   * repository access is set to `selected`. For more information about setting the visibility, see [Create or
   * update an organization
   * secret](https://docs.github.com/rest/agents/secrets#create-or-update-an-organization-secret).
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws AgentsAddSelectedRepoToOrgSecretApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded AgentsAddSelectedRepoToOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsAddSelectedRepoToOrgSecret(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, AgentsAddSelectedRepoToOrgSecretResponse, Unit>(
    request = SdkExecutionRequest(agentsAddSelectedRepoToOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = AgentsCodecs.agentsAddSelectedRepoToOrgSecretRequestCodecRegistry,
    responseDecoder = AgentsAddSelectedRepoToOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentsAddSelectedRepoToOrgSecretResponse.SuccessNoContent -> response.unit
        is AgentsAddSelectedRepoToOrgSecretResponse.Http409NoContent -> response.unit
        is AgentsAddSelectedRepoToOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentsAddSelectedRepoToOrgSecretResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AgentsAddSelectedRepoToOrgSecretResponse.Http409NoContent -> AgentsAddSelectedRepoToOrgSecretApiException(response, statusCode, headers)
        is AgentsAddSelectedRepoToOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a repository to an organization secret when the `visibility` for
   * repository access is set to `selected`. For more information about setting the visibility, see [Create or
   * update an organization
   * secret](https://docs.github.com/rest/agents/secrets#create-or-update-an-organization-secret).
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun agentsAddSelectedRepoToOrgSecretWithResponse(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsAddSelectedRepoToOrgSecretResponse> = executor.executeWithResponse<Unit, AgentsAddSelectedRepoToOrgSecretResponse>(SdkExecutionRequest(agentsAddSelectedRepoToOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsAddSelectedRepoToOrgSecretRequestCodecRegistry, AgentsAddSelectedRepoToOrgSecretResponseDecoder, options)

  /**
   * Adds a repository to an organization agent variable that is available to selected repositories.
   * Organization variables that are available to selected repositories have their `visibility` field set to `selected`.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param options Execution options.
   * @return No response body.
   * @throws AgentsAddSelectedRepoToOrgVariableApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded AgentsAddSelectedRepoToOrgVariableError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsAddSelectedRepoToOrgVariable(
    name: String,
    org: String,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, AgentsAddSelectedRepoToOrgVariableResponse, Unit>(
    request = SdkExecutionRequest(agentsAddSelectedRepoToOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    }),
    requestCodecs = AgentsCodecs.agentsAddSelectedRepoToOrgVariableRequestCodecRegistry,
    responseDecoder = AgentsAddSelectedRepoToOrgVariableResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentsAddSelectedRepoToOrgVariableResponse.SuccessNoContent -> response.unit
        is AgentsAddSelectedRepoToOrgVariableResponse.Http409NoContent -> response.unit
        is AgentsAddSelectedRepoToOrgVariableResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentsAddSelectedRepoToOrgVariableResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AgentsAddSelectedRepoToOrgVariableResponse.Http409NoContent -> AgentsAddSelectedRepoToOrgVariableApiException(response, statusCode, headers)
        is AgentsAddSelectedRepoToOrgVariableResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a repository to an organization agent variable that is available to selected repositories.
   * Organization variables that are available to selected repositories have their `visibility` field set to `selected`.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param options Execution options.
   */
  public suspend fun agentsAddSelectedRepoToOrgVariableWithResponse(
    name: String,
    org: String,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsAddSelectedRepoToOrgVariableResponse> = executor.executeWithResponse<Unit, AgentsAddSelectedRepoToOrgVariableResponse>(SdkExecutionRequest(agentsAddSelectedRepoToOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
  }), AgentsCodecs.agentsAddSelectedRepoToOrgVariableRequestCodecRegistry, AgentsAddSelectedRepoToOrgVariableResponseDecoder, options)

  /**
   * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
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
  public suspend fun agentsCreateOrUpdateOrgSecretWithResponse(
    request: InlineOrgsAgentsSecretsPutRequestJsonXf55493a1,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsCreateOrUpdateOrgSecretResponse> = executor.executeWithResponse<InlineOrgsAgentsSecretsPutRequestJsonXf55493a1, AgentsCreateOrUpdateOrgSecretResponse>(SdkExecutionRequest(agentsCreateOrUpdateOrgSecretMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsCreateOrUpdateOrgSecretRequestCodecRegistry, AgentsCreateOrUpdateOrgSecretResponseDecoder, options)

  /**
   * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
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
  public suspend fun agentsCreateOrUpdateRepoSecretWithResponse(
    request: InlineReposAgentsSecretsPutRequestJsonXf1e2779a,
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsCreateOrUpdateRepoSecretResponse> = executor.executeWithResponse<InlineReposAgentsSecretsPutRequestJsonXf1e2779a, AgentsCreateOrUpdateRepoSecretResponse>(SdkExecutionRequest(agentsCreateOrUpdateRepoSecretMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsCreateOrUpdateRepoSecretRequestCodecRegistry, AgentsCreateOrUpdateRepoSecretResponseDecoder, options)

  /**
   * Creates an organization agent variable that you can reference in a GitHub Actions workflow.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsCreateOrgVariable(
    request: InlineOrgsAgentsVariablesPostRequestJsonX7df0b024,
    org: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.execute<InlineOrgsAgentsVariablesPostRequestJsonX7df0b024, JsonObject>(SdkExecutionRequest(agentsCreateOrgVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSCREATEORGVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(AgentsCodecs.AGENTSCREATEORGVARIABLE_RESPONSE_CODEC_ID), AgentsCodecs.agentsCreateOrgVariableRequestCodecRegistry, AgentsCodecs.agentsCreateOrgVariableResponseCodecRegistry, options)

  /**
   * Creates an organization agent variable that you can reference in a GitHub Actions workflow.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsCreateOrgVariableWithResponse(
    request: InlineOrgsAgentsVariablesPostRequestJsonX7df0b024,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsCreateOrgVariableResponse> = executor.executeWithResponse<InlineOrgsAgentsVariablesPostRequestJsonX7df0b024, AgentsCreateOrgVariableResponse>(SdkExecutionRequest(agentsCreateOrgVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSCREATEORGVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AgentsCodecs.agentsCreateOrgVariableRequestCodecRegistry, AgentsCreateOrgVariableResponseDecoder, options)

  /**
   * Creates a repository variable that you can reference in a GitHub Actions workflow.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
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
  public suspend fun agentsCreateRepoVariable(
    request: InlineReposAgentsVariablesPostRequestJsonXcbb2b262,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.execute<InlineReposAgentsVariablesPostRequestJsonXcbb2b262, JsonObject>(SdkExecutionRequest(agentsCreateRepoVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSCREATEREPOVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(AgentsCodecs.AGENTSCREATEREPOVARIABLE_RESPONSE_CODEC_ID), AgentsCodecs.agentsCreateRepoVariableRequestCodecRegistry, AgentsCodecs.agentsCreateRepoVariableResponseCodecRegistry, options)

  /**
   * Creates a repository variable that you can reference in a GitHub Actions workflow.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsCreateRepoVariableWithResponse(
    request: InlineReposAgentsVariablesPostRequestJsonXcbb2b262,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsCreateRepoVariableResponse> = executor.executeWithResponse<InlineReposAgentsVariablesPostRequestJsonXcbb2b262, AgentsCreateRepoVariableResponse>(SdkExecutionRequest(agentsCreateRepoVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSCREATEREPOVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AgentsCodecs.agentsCreateRepoVariableRequestCodecRegistry, AgentsCreateRepoVariableResponseDecoder, options)

  /**
   * Deletes a secret in an organization using the secret name.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsDeleteOrgSecret(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(agentsDeleteOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsDeleteOrgSecretRequestCodecRegistry, options)

  /**
   * Deletes a secret in an organization using the secret name.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun agentsDeleteOrgSecretWithResponse(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsDeleteOrgSecretResponse> = executor.executeWithResponse<Unit, AgentsDeleteOrgSecretResponse>(SdkExecutionRequest(agentsDeleteOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsDeleteOrgSecretRequestCodecRegistry, AgentsDeleteOrgSecretResponseDecoder, options)

  /**
   * Deletes an organization agent variable using the variable name.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsDeleteOrgVariable(
    name: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(agentsDeleteOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AgentsCodecs.agentsDeleteOrgVariableRequestCodecRegistry, options)

  /**
   * Deletes an organization agent variable using the variable name.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsDeleteOrgVariableWithResponse(
    name: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsDeleteOrgVariableResponse> = executor.executeWithResponse<Unit, AgentsDeleteOrgVariableResponse>(SdkExecutionRequest(agentsDeleteOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AgentsCodecs.agentsDeleteOrgVariableRequestCodecRegistry, AgentsDeleteOrgVariableResponseDecoder, options)

  /**
   * Deletes a secret in a repository using the secret name.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
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
  public suspend fun agentsDeleteRepoSecret(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(agentsDeleteRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsDeleteRepoSecretRequestCodecRegistry, options)

  /**
   * Deletes a secret in a repository using the secret name.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun agentsDeleteRepoSecretWithResponse(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsDeleteRepoSecretResponse> = executor.executeWithResponse<Unit, AgentsDeleteRepoSecretResponse>(SdkExecutionRequest(agentsDeleteRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsDeleteRepoSecretRequestCodecRegistry, AgentsDeleteRepoSecretResponseDecoder, options)

  /**
   * Deletes a repository variable using the variable name.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param name The name of the variable.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsDeleteRepoVariable(
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(agentsDeleteRepoVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AgentsCodecs.agentsDeleteRepoVariableRequestCodecRegistry, options)

  /**
   * Deletes a repository variable using the variable name.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name The name of the variable.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsDeleteRepoVariableWithResponse(
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsDeleteRepoVariableResponse> = executor.executeWithResponse<Unit, AgentsDeleteRepoVariableResponse>(SdkExecutionRequest(agentsDeleteRepoVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AgentsCodecs.agentsDeleteRepoVariableRequestCodecRegistry, AgentsDeleteRepoVariableResponseDecoder, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsGetOrgPublicKey(org: String, options: CallOptions = CallOptions()): ActionsPublicKey = executor.execute<Unit, ActionsPublicKey>(SdkExecutionRequest(agentsGetOrgPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(AgentsCodecs.AGENTSGETORGPUBLICKEY_RESPONSE_CODEC_ID), AgentsCodecs.agentsGetOrgPublicKeyRequestCodecRegistry, AgentsCodecs.agentsGetOrgPublicKeyResponseCodecRegistry, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsGetOrgPublicKeyWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<AgentsGetOrgPublicKeyResponse> = executor.executeWithResponse<Unit, AgentsGetOrgPublicKeyResponse>(SdkExecutionRequest(agentsGetOrgPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AgentsCodecs.agentsGetOrgPublicKeyRequestCodecRegistry, AgentsGetOrgPublicKeyResponseDecoder, options)

  /**
   * Gets a single organization secret without revealing its encrypted value.
   *
   * The authenticated user must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsGetOrgSecret(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): OrganizationActionsSecret = executor.execute<Unit, OrganizationActionsSecret>(SdkExecutionRequest(agentsGetOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), listOf(AgentsCodecs.AGENTSGETORGSECRET_RESPONSE_CODEC_ID), AgentsCodecs.agentsGetOrgSecretRequestCodecRegistry, AgentsCodecs.agentsGetOrgSecretResponseCodecRegistry, options)

  /**
   * Gets a single organization secret without revealing its encrypted value.
   *
   * The authenticated user must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun agentsGetOrgSecretWithResponse(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsGetOrgSecretResponse> = executor.executeWithResponse<Unit, AgentsGetOrgSecretResponse>(SdkExecutionRequest(agentsGetOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsGetOrgSecretRequestCodecRegistry, AgentsGetOrgSecretResponseDecoder, options)

  /**
   * Gets a specific agent variable in an organization.
   *
   * The authenticated user must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsGetOrgVariable(
    name: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): OrganizationActionsVariable = executor.execute<Unit, OrganizationActionsVariable>(SdkExecutionRequest(agentsGetOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(AgentsCodecs.AGENTSGETORGVARIABLE_RESPONSE_CODEC_ID), AgentsCodecs.agentsGetOrgVariableRequestCodecRegistry, AgentsCodecs.agentsGetOrgVariableResponseCodecRegistry, options)

  /**
   * Gets a specific agent variable in an organization.
   *
   * The authenticated user must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsGetOrgVariableWithResponse(
    name: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsGetOrgVariableResponse> = executor.executeWithResponse<Unit, AgentsGetOrgVariableResponse>(SdkExecutionRequest(agentsGetOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AgentsCodecs.agentsGetOrgVariableRequestCodecRegistry, AgentsGetOrgVariableResponseDecoder, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets.
   *
   * Anyone with read access to the repository can use this endpoint.
   *
   * If the repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsGetRepoPublicKey(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): ActionsPublicKey = executor.execute<Unit, ActionsPublicKey>(SdkExecutionRequest(agentsGetRepoPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(AgentsCodecs.AGENTSGETREPOPUBLICKEY_RESPONSE_CODEC_ID), AgentsCodecs.agentsGetRepoPublicKeyRequestCodecRegistry, AgentsCodecs.agentsGetRepoPublicKeyResponseCodecRegistry, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets.
   *
   * Anyone with read access to the repository can use this endpoint.
   *
   * If the repository is private, OAuth tokens and personal access tokens (classic) need the `repo` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsGetRepoPublicKeyWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsGetRepoPublicKeyResponse> = executor.executeWithResponse<Unit, AgentsGetRepoPublicKeyResponse>(SdkExecutionRequest(agentsGetRepoPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AgentsCodecs.agentsGetRepoPublicKeyRequestCodecRegistry, AgentsGetRepoPublicKeyResponseDecoder, options)

  /**
   * Gets a single repository secret without revealing its encrypted value.
   *
   * The authenticated user must have collaborator access to the repository to use this endpoint.
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
  public suspend fun agentsGetRepoSecret(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): ActionsSecret = executor.execute<Unit, ActionsSecret>(SdkExecutionRequest(agentsGetRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), listOf(AgentsCodecs.AGENTSGETREPOSECRET_RESPONSE_CODEC_ID), AgentsCodecs.agentsGetRepoSecretRequestCodecRegistry, AgentsCodecs.agentsGetRepoSecretResponseCodecRegistry, options)

  /**
   * Gets a single repository secret without revealing its encrypted value.
   *
   * The authenticated user must have collaborator access to the repository to use this endpoint.
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
  public suspend fun agentsGetRepoSecretWithResponse(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsGetRepoSecretResponse> = executor.executeWithResponse<Unit, AgentsGetRepoSecretResponse>(SdkExecutionRequest(agentsGetRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsGetRepoSecretRequestCodecRegistry, AgentsGetRepoSecretResponseDecoder, options)

  /**
   * Gets a specific variable in a repository.
   *
   * The authenticated user must have collaborator access to the repository to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param name The name of the variable.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsGetRepoVariable(
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): ActionsVariable = executor.execute<Unit, ActionsVariable>(SdkExecutionRequest(agentsGetRepoVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(AgentsCodecs.AGENTSGETREPOVARIABLE_RESPONSE_CODEC_ID), AgentsCodecs.agentsGetRepoVariableRequestCodecRegistry, AgentsCodecs.agentsGetRepoVariableResponseCodecRegistry, options)

  /**
   * Gets a specific variable in a repository.
   *
   * The authenticated user must have collaborator access to the repository to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name The name of the variable.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsGetRepoVariableWithResponse(
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsGetRepoVariableResponse> = executor.executeWithResponse<Unit, AgentsGetRepoVariableResponse>(SdkExecutionRequest(agentsGetRepoVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AgentsCodecs.agentsGetRepoVariableRequestCodecRegistry, AgentsGetRepoVariableResponseDecoder, options)

  /**
   * Lists all secrets available in an organization without revealing their
   * encrypted values.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
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
  public suspend fun agentsListOrgSecrets(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13 = executor.execute<Unit, InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13>(SdkExecutionRequest(agentsListOrgSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(AgentsCodecs.AGENTSLISTORGSECRETS_RESPONSE_CODEC_ID), AgentsCodecs.agentsListOrgSecretsRequestCodecRegistry, AgentsCodecs.agentsListOrgSecretsResponseCodecRegistry, options)

  /**
   * Lists all secrets available in an organization without revealing their
   * encrypted values.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
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
  public suspend fun agentsListOrgSecretsWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsListOrgSecretsResponse> = executor.executeWithResponse<Unit, AgentsListOrgSecretsResponse>(SdkExecutionRequest(agentsListOrgSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentsCodecs.agentsListOrgSecretsRequestCodecRegistry, AgentsListOrgSecretsResponseDecoder, options)

  /**
   * Lists all agent variables available in an organization.
   * Returned variables include their values.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 30). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsListOrgVariables(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4 = executor.execute<Unit, InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4>(SdkExecutionRequest(agentsListOrgVariablesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(AgentsCodecs.AGENTSLISTORGVARIABLES_RESPONSE_CODEC_ID), AgentsCodecs.agentsListOrgVariablesRequestCodecRegistry, AgentsCodecs.agentsListOrgVariablesResponseCodecRegistry, options)

  /**
   * Lists all agent variables available in an organization.
   * Returned variables include their values.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 30). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun agentsListOrgVariablesWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsListOrgVariablesResponse> = executor.executeWithResponse<Unit, AgentsListOrgVariablesResponse>(SdkExecutionRequest(agentsListOrgVariablesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentsCodecs.agentsListOrgVariablesRequestCodecRegistry, AgentsListOrgVariablesResponseDecoder, options)

  /**
   * Lists all organization secrets shared with a repository without revealing their encrypted
   * values.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
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
  public suspend fun agentsListRepoOrganizationSecrets(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94 = executor.execute<Unit, InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94>(SdkExecutionRequest(agentsListRepoOrganizationSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(AgentsCodecs.AGENTSLISTREPOORGANIZATIONSECRETS_RESPONSE_CODEC_ID), AgentsCodecs.agentsListRepoOrganizationSecretsRequestCodecRegistry, AgentsCodecs.agentsListRepoOrganizationSecretsResponseCodecRegistry, options)

  /**
   * Lists all organization secrets shared with a repository without revealing their encrypted
   * values.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
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
  public suspend fun agentsListRepoOrganizationSecretsWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsListRepoOrganizationSecretsResponse> = executor.executeWithResponse<Unit, AgentsListRepoOrganizationSecretsResponse>(SdkExecutionRequest(agentsListRepoOrganizationSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentsCodecs.agentsListRepoOrganizationSecretsRequestCodecRegistry, AgentsListRepoOrganizationSecretsResponseDecoder, options)

  /**
   * Lists all organization variables shared with a repository.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 30). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsListRepoOrganizationVariables(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa = executor.execute<Unit, InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa>(SdkExecutionRequest(agentsListRepoOrganizationVariablesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(AgentsCodecs.AGENTSLISTREPOORGANIZATIONVARIABLES_RESPONSE_CODEC_ID), AgentsCodecs.agentsListRepoOrganizationVariablesRequestCodecRegistry, AgentsCodecs.agentsListRepoOrganizationVariablesResponseCodecRegistry, options)

  /**
   * Lists all organization variables shared with a repository.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 30). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun agentsListRepoOrganizationVariablesWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsListRepoOrganizationVariablesResponse> = executor.executeWithResponse<Unit, AgentsListRepoOrganizationVariablesResponse>(SdkExecutionRequest(agentsListRepoOrganizationVariablesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentsCodecs.agentsListRepoOrganizationVariablesRequestCodecRegistry, AgentsListRepoOrganizationVariablesResponseDecoder, options)

  /**
   * Lists all secrets available in a repository without revealing their encrypted
   * values.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
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
  public suspend fun agentsListRepoSecrets(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposAgentsSecretsGetResponse200JsonXfad460e5 = executor.execute<Unit, InlineReposAgentsSecretsGetResponse200JsonXfad460e5>(SdkExecutionRequest(agentsListRepoSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(AgentsCodecs.AGENTSLISTREPOSECRETS_RESPONSE_CODEC_ID), AgentsCodecs.agentsListRepoSecretsRequestCodecRegistry, AgentsCodecs.agentsListRepoSecretsResponseCodecRegistry, options)

  /**
   * Lists all secrets available in a repository without revealing their encrypted
   * values.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
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
  public suspend fun agentsListRepoSecretsWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsListRepoSecretsResponse> = executor.executeWithResponse<Unit, AgentsListRepoSecretsResponse>(SdkExecutionRequest(agentsListRepoSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentsCodecs.agentsListRepoSecretsRequestCodecRegistry, AgentsListRepoSecretsResponseDecoder, options)

  /**
   * Lists all repository variables.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 30). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsListRepoVariables(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b = executor.execute<Unit, InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b>(SdkExecutionRequest(agentsListRepoVariablesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(AgentsCodecs.AGENTSLISTREPOVARIABLES_RESPONSE_CODEC_ID), AgentsCodecs.agentsListRepoVariablesRequestCodecRegistry, AgentsCodecs.agentsListRepoVariablesResponseCodecRegistry, options)

  /**
   * Lists all repository variables.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 30). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun agentsListRepoVariablesWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsListRepoVariablesResponse> = executor.executeWithResponse<Unit, AgentsListRepoVariablesResponse>(SdkExecutionRequest(agentsListRepoVariablesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentsCodecs.agentsListRepoVariablesRequestCodecRegistry, AgentsListRepoVariablesResponseDecoder, options)

  /**
   * Lists all repositories that have been selected when the `visibility`
   * for repository access to a secret is set to `selected`.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
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
  public suspend fun agentsListSelectedReposForOrgSecret(
    org: String,
    secretName: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312 = executor.execute<Unit, InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312>(SdkExecutionRequest(agentsListSelectedReposForOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(AgentsCodecs.AGENTSLISTSELECTEDREPOSFORORGSECRET_RESPONSE_CODEC_ID), AgentsCodecs.agentsListSelectedReposForOrgSecretRequestCodecRegistry, AgentsCodecs.agentsListSelectedReposForOrgSecretResponseCodecRegistry, options)

  /**
   * Lists all repositories that have been selected when the `visibility`
   * for repository access to a secret is set to `selected`.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
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
  public suspend fun agentsListSelectedReposForOrgSecretWithResponse(
    org: String,
    secretName: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsListSelectedReposForOrgSecretResponse> = executor.executeWithResponse<Unit, AgentsListSelectedReposForOrgSecretResponse>(SdkExecutionRequest(agentsListSelectedReposForOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentsCodecs.agentsListSelectedReposForOrgSecretRequestCodecRegistry, AgentsListSelectedReposForOrgSecretResponseDecoder, options)

  /**
   * Lists all repositories that can access an organization agent variable
   * that is available to selected repositories.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AgentsListSelectedReposForOrgVariableApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded AgentsListSelectedReposForOrgVariableError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsListSelectedReposForOrgVariable(
    name: String,
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795 = executor.executeWithTypedErrors<Unit, AgentsListSelectedReposForOrgVariableResponse, InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795>(
    request = SdkExecutionRequest(agentsListSelectedReposForOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AgentsCodecs.agentsListSelectedReposForOrgVariableRequestCodecRegistry,
    responseDecoder = AgentsListSelectedReposForOrgVariableResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentsListSelectedReposForOrgVariableResponse.SuccessJson -> response.json
        is AgentsListSelectedReposForOrgVariableResponse.Http409NoContent -> error("Runtime selected a non-success response for success mapping.")
        is AgentsListSelectedReposForOrgVariableResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentsListSelectedReposForOrgVariableResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AgentsListSelectedReposForOrgVariableResponse.Http409NoContent -> AgentsListSelectedReposForOrgVariableApiException(response, statusCode, headers)
        is AgentsListSelectedReposForOrgVariableResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all repositories that can access an organization agent variable
   * that is available to selected repositories.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun agentsListSelectedReposForOrgVariableWithResponse(
    name: String,
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsListSelectedReposForOrgVariableResponse> = executor.executeWithResponse<Unit, AgentsListSelectedReposForOrgVariableResponse>(SdkExecutionRequest(agentsListSelectedReposForOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AgentsCodecs.agentsListSelectedReposForOrgVariableRequestCodecRegistry, AgentsListSelectedReposForOrgVariableResponseDecoder, options)

  /**
   * Removes a repository from an organization secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/agents/secrets#create-or-update-an-organization-secret).
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws AgentsRemoveSelectedRepoFromOrgSecretApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded AgentsRemoveSelectedRepoFromOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsRemoveSelectedRepoFromOrgSecret(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, AgentsRemoveSelectedRepoFromOrgSecretResponse, Unit>(
    request = SdkExecutionRequest(agentsRemoveSelectedRepoFromOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = AgentsCodecs.agentsRemoveSelectedRepoFromOrgSecretRequestCodecRegistry,
    responseDecoder = AgentsRemoveSelectedRepoFromOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentsRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent -> response.unit
        is AgentsRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent -> response.unit
        is AgentsRemoveSelectedRepoFromOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentsRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AgentsRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent -> AgentsRemoveSelectedRepoFromOrgSecretApiException(response, statusCode, headers)
        is AgentsRemoveSelectedRepoFromOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a repository from an organization secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/agents/secrets#create-or-update-an-organization-secret).
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun agentsRemoveSelectedRepoFromOrgSecretWithResponse(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsRemoveSelectedRepoFromOrgSecretResponse> = executor.executeWithResponse<Unit, AgentsRemoveSelectedRepoFromOrgSecretResponse>(SdkExecutionRequest(agentsRemoveSelectedRepoFromOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsRemoveSelectedRepoFromOrgSecretRequestCodecRegistry, AgentsRemoveSelectedRepoFromOrgSecretResponseDecoder, options)

  /**
   * Removes a repository from an organization agent variable that is
   * available to selected repositories. Organization variables that are available to
   * selected repositories have their `visibility` field set to `selected`.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param options Execution options.
   * @return No response body.
   * @throws AgentsRemoveSelectedRepoFromOrgVariableApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded AgentsRemoveSelectedRepoFromOrgVariableError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsRemoveSelectedRepoFromOrgVariable(
    name: String,
    org: String,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, AgentsRemoveSelectedRepoFromOrgVariableResponse, Unit>(
    request = SdkExecutionRequest(agentsRemoveSelectedRepoFromOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    }),
    requestCodecs = AgentsCodecs.agentsRemoveSelectedRepoFromOrgVariableRequestCodecRegistry,
    responseDecoder = AgentsRemoveSelectedRepoFromOrgVariableResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentsRemoveSelectedRepoFromOrgVariableResponse.SuccessNoContent -> response.unit
        is AgentsRemoveSelectedRepoFromOrgVariableResponse.Http409NoContent -> response.unit
        is AgentsRemoveSelectedRepoFromOrgVariableResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentsRemoveSelectedRepoFromOrgVariableResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AgentsRemoveSelectedRepoFromOrgVariableResponse.Http409NoContent -> AgentsRemoveSelectedRepoFromOrgVariableApiException(response, statusCode, headers)
        is AgentsRemoveSelectedRepoFromOrgVariableResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a repository from an organization agent variable that is
   * available to selected repositories. Organization variables that are available to
   * selected repositories have their `visibility` field set to `selected`.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param options Execution options.
   */
  public suspend fun agentsRemoveSelectedRepoFromOrgVariableWithResponse(
    name: String,
    org: String,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsRemoveSelectedRepoFromOrgVariableResponse> = executor.executeWithResponse<Unit, AgentsRemoveSelectedRepoFromOrgVariableResponse>(SdkExecutionRequest(agentsRemoveSelectedRepoFromOrgVariableMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
  }), AgentsCodecs.agentsRemoveSelectedRepoFromOrgVariableRequestCodecRegistry, AgentsRemoveSelectedRepoFromOrgVariableResponseDecoder, options)

  /**
   * Replaces all repositories for an organization secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/agents/secrets#create-or-update-an-organization-secret).
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
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
  public suspend fun agentsSetSelectedReposForOrgSecret(
    request: InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912>(SdkExecutionRequest(agentsSetSelectedReposForOrgSecretMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsSetSelectedReposForOrgSecretRequestCodecRegistry, options)

  /**
   * Replaces all repositories for an organization secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/agents/secrets#create-or-update-an-organization-secret).
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read secrets.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun agentsSetSelectedReposForOrgSecretWithResponse(
    request: InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsSetSelectedReposForOrgSecretResponse> = executor.executeWithResponse<InlineOrgsAgentsSecretsRepositoriesPutRequestJsonX524aa912, AgentsSetSelectedReposForOrgSecretResponse>(SdkExecutionRequest(agentsSetSelectedReposForOrgSecretMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), AgentsCodecs.agentsSetSelectedReposForOrgSecretRequestCodecRegistry, AgentsSetSelectedReposForOrgSecretResponseDecoder, options)

  /**
   * Replaces all repositories for an organization agent variable that is available
   * to selected repositories. Organization variables that are available to selected
   * repositories have their `visibility` field set to `selected`.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * @param request Request body sent to the operation.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws AgentsSetSelectedReposForOrgVariableApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded AgentsSetSelectedReposForOrgVariableError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsSetSelectedReposForOrgVariable(
    request: InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2,
    name: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2, AgentsSetSelectedReposForOrgVariableResponse, Unit>(
    request = SdkExecutionRequest(agentsSetSelectedReposForOrgVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSSETSELECTEDREPOSFORORGVARIABLE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = AgentsCodecs.agentsSetSelectedReposForOrgVariableRequestCodecRegistry,
    responseDecoder = AgentsSetSelectedReposForOrgVariableResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AgentsSetSelectedReposForOrgVariableResponse.SuccessNoContent -> response.unit
        is AgentsSetSelectedReposForOrgVariableResponse.Http409NoContent -> response.unit
        is AgentsSetSelectedReposForOrgVariableResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AgentsSetSelectedReposForOrgVariableResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AgentsSetSelectedReposForOrgVariableResponse.Http409NoContent -> AgentsSetSelectedReposForOrgVariableApiException(response, statusCode, headers)
        is AgentsSetSelectedReposForOrgVariableResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Replaces all repositories for an organization agent variable that is available
   * to selected repositories. Organization variables that are available to selected
   * repositories have their `visibility` field set to `selected`.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsSetSelectedReposForOrgVariableWithResponse(
    request: InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2,
    name: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsSetSelectedReposForOrgVariableResponse> = executor.executeWithResponse<InlineOrgsAgentsVariablesRepositoriesPutRequestJsonXc2005ca2, AgentsSetSelectedReposForOrgVariableResponse>(SdkExecutionRequest(agentsSetSelectedReposForOrgVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSSETSELECTEDREPOSFORORGVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AgentsCodecs.agentsSetSelectedReposForOrgVariableRequestCodecRegistry, AgentsSetSelectedReposForOrgVariableResponseDecoder, options)

  /**
   * Updates an organization agent variable that you can reference in a GitHub Actions workflow.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * @param request Request body sent to the operation.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsUpdateOrgVariable(
    request: InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8,
    name: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8>(SdkExecutionRequest(agentsUpdateOrgVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSUPDATEORGVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AgentsCodecs.agentsUpdateOrgVariableRequestCodecRegistry, options)

  /**
   * Updates an organization agent variable that you can reference in a GitHub Actions workflow.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint. If the
   * repository is private, the `repo` scope is also required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param name The name of the variable.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsUpdateOrgVariableWithResponse(
    request: InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8,
    name: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsUpdateOrgVariableResponse> = executor.executeWithResponse<InlineOrgsAgentsVariablesPatchRequestJsonX3bc94ba8, AgentsUpdateOrgVariableResponse>(SdkExecutionRequest(agentsUpdateOrgVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSUPDATEORGVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AgentsCodecs.agentsUpdateOrgVariableRequestCodecRegistry, AgentsUpdateOrgVariableResponseDecoder, options)

  /**
   * Updates a repository variable that you can reference in a GitHub Actions workflow.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param name The name of the variable.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun agentsUpdateRepoVariable(
    request: InlineReposAgentsVariablesPatchRequestJsonX5337d0f3,
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<InlineReposAgentsVariablesPatchRequestJsonX5337d0f3>(SdkExecutionRequest(agentsUpdateRepoVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSUPDATEREPOVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AgentsCodecs.agentsUpdateRepoVariableRequestCodecRegistry, options)

  /**
   * Updates a repository variable that you can reference in a GitHub Actions workflow.
   *
   * Authenticated users must have collaborator access to a repository to create, update, or read variables.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param name The name of the variable.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun agentsUpdateRepoVariableWithResponse(
    request: InlineReposAgentsVariablesPatchRequestJsonX5337d0f3,
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AgentsUpdateRepoVariableResponse> = executor.executeWithResponse<InlineReposAgentsVariablesPatchRequestJsonX5337d0f3, AgentsUpdateRepoVariableResponse>(SdkExecutionRequest(agentsUpdateRepoVariableMetadata, baseUri, request, listOf(AgentsCodecs.AGENTSUPDATEREPOVARIABLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AgentsCodecs.agentsUpdateRepoVariableRequestCodecRegistry, AgentsUpdateRepoVariableResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `agents/add-selected-repo-to-org-secret` may expose through its
   * typed API exception.
   */
  public sealed interface AgentsAddSelectedRepoToOrgSecretError

  /**
   * Typed response alternatives for `agents/add-selected-repo-to-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsAddSelectedRepoToOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsAddSelectedRepoToOrgSecretResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsAddSelectedRepoToOrgSecretResponse,
        AgentsAddSelectedRepoToOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsAddSelectedRepoToOrgSecretResponse
  }

  /**
   * Raised by `agents/add-selected-repo-to-org-secret` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class AgentsAddSelectedRepoToOrgSecretApiException(
    public val error: AgentsAddSelectedRepoToOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agents/add-selected-repo-to-org-secret")

  private object AgentsAddSelectedRepoToOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsAddSelectedRepoToOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsAddSelectedRepoToOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsAddSelectedRepoToOrgSecretResponse> = when {
      alternative.id == "agents/add-selected-repo-to-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsAddSelectedRepoToOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agents/add-selected-repo-to-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentsAddSelectedRepoToOrgSecretResponse.Http409NoContent(
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
    ): AgentsAddSelectedRepoToOrgSecretResponse = AgentsAddSelectedRepoToOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agents/add-selected-repo-to-org-variable` may expose through its
   * typed API exception.
   */
  public sealed interface AgentsAddSelectedRepoToOrgVariableError

  /**
   * Typed response alternatives for `agents/add-selected-repo-to-org-variable`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsAddSelectedRepoToOrgVariableResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsAddSelectedRepoToOrgVariableResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsAddSelectedRepoToOrgVariableResponse,
        AgentsAddSelectedRepoToOrgVariableError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsAddSelectedRepoToOrgVariableResponse
  }

  /**
   * Raised by `agents/add-selected-repo-to-org-variable` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class AgentsAddSelectedRepoToOrgVariableApiException(
    public val error: AgentsAddSelectedRepoToOrgVariableError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agents/add-selected-repo-to-org-variable")

  private object AgentsAddSelectedRepoToOrgVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsAddSelectedRepoToOrgVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsAddSelectedRepoToOrgVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsAddSelectedRepoToOrgVariableResponse> = when {
      alternative.id == "agents/add-selected-repo-to-org-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsAddSelectedRepoToOrgVariableResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agents/add-selected-repo-to-org-variable.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentsAddSelectedRepoToOrgVariableResponse.Http409NoContent(
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
    ): AgentsAddSelectedRepoToOrgVariableResponse = AgentsAddSelectedRepoToOrgVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/create-or-update-org-secret`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface AgentsCreateOrUpdateOrgSecretResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateOrUpdateOrgSecretResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateOrUpdateOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateOrUpdateOrgSecretResponse
  }

  private object AgentsCreateOrUpdateOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsCreateOrUpdateOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsCreateOrUpdateOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsCreateOrUpdateOrgSecretResponse> = when {
      alternative.id == "agents/create-or-update-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsCreateOrUpdateOrgSecretResponse.SuccessJson(
          json = AgentsCodecs.agentsCreateOrUpdateOrgSecretResponseCodecAlternative0Registry.select(listOf("agents/create-or-update-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agents/create-or-update-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentsCreateOrUpdateOrgSecretResponse.SuccessNoContent(
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
    ): AgentsCreateOrUpdateOrgSecretResponse = AgentsCreateOrUpdateOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/create-or-update-repo-secret`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface AgentsCreateOrUpdateRepoSecretResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateOrUpdateRepoSecretResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateOrUpdateRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateOrUpdateRepoSecretResponse
  }

  private object AgentsCreateOrUpdateRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsCreateOrUpdateRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsCreateOrUpdateRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsCreateOrUpdateRepoSecretResponse> = when {
      alternative.id == "agents/create-or-update-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsCreateOrUpdateRepoSecretResponse.SuccessJson(
          json = AgentsCodecs.agentsCreateOrUpdateRepoSecretResponseCodecAlternative0Registry.select(listOf("agents/create-or-update-repo-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agents/create-or-update-repo-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentsCreateOrUpdateRepoSecretResponse.SuccessNoContent(
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
    ): AgentsCreateOrUpdateRepoSecretResponse = AgentsCreateOrUpdateRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/create-org-variable`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsCreateOrgVariableResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateOrgVariableResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateOrgVariableResponse
  }

  private object AgentsCreateOrgVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsCreateOrgVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsCreateOrgVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsCreateOrgVariableResponse> = when {
      alternative.id == "agents/create-org-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsCreateOrgVariableResponse.SuccessJson(
          json = AgentsCodecs.agentsCreateOrgVariableResponseCodecAlternative0Registry.select(listOf("agents/create-org-variable.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsCreateOrgVariableResponse = AgentsCreateOrgVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/create-repo-variable`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsCreateRepoVariableResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateRepoVariableResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsCreateRepoVariableResponse
  }

  private object AgentsCreateRepoVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsCreateRepoVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsCreateRepoVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsCreateRepoVariableResponse> = when {
      alternative.id == "agents/create-repo-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsCreateRepoVariableResponse.SuccessJson(
          json = AgentsCodecs.agentsCreateRepoVariableResponseCodecAlternative0Registry.select(listOf("agents/create-repo-variable.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsCreateRepoVariableResponse = AgentsCreateRepoVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/delete-org-secret`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AgentsDeleteOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsDeleteOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsDeleteOrgSecretResponse
  }

  private object AgentsDeleteOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsDeleteOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsDeleteOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsDeleteOrgSecretResponse> = when {
      alternative.id == "agents/delete-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsDeleteOrgSecretResponse.SuccessNoContent(
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
    ): AgentsDeleteOrgSecretResponse = AgentsDeleteOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/delete-org-variable`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsDeleteOrgVariableResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsDeleteOrgVariableResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsDeleteOrgVariableResponse
  }

  private object AgentsDeleteOrgVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsDeleteOrgVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsDeleteOrgVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsDeleteOrgVariableResponse> = when {
      alternative.id == "agents/delete-org-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsDeleteOrgVariableResponse.SuccessNoContent(
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
    ): AgentsDeleteOrgVariableResponse = AgentsDeleteOrgVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/delete-repo-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsDeleteRepoSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsDeleteRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsDeleteRepoSecretResponse
  }

  private object AgentsDeleteRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsDeleteRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsDeleteRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsDeleteRepoSecretResponse> = when {
      alternative.id == "agents/delete-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsDeleteRepoSecretResponse.SuccessNoContent(
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
    ): AgentsDeleteRepoSecretResponse = AgentsDeleteRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/delete-repo-variable`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsDeleteRepoVariableResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsDeleteRepoVariableResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsDeleteRepoVariableResponse
  }

  private object AgentsDeleteRepoVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsDeleteRepoVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsDeleteRepoVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsDeleteRepoVariableResponse> = when {
      alternative.id == "agents/delete-repo-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsDeleteRepoVariableResponse.SuccessNoContent(
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
    ): AgentsDeleteRepoVariableResponse = AgentsDeleteRepoVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/get-org-public-key`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsGetOrgPublicKeyResponse {
    public class SuccessJson(
      public val json: ActionsPublicKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetOrgPublicKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetOrgPublicKeyResponse
  }

  private object AgentsGetOrgPublicKeyResponseDecoder : SdkResponseAlternativeDecoder<AgentsGetOrgPublicKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsGetOrgPublicKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsGetOrgPublicKeyResponse> = when {
      alternative.id == "agents/get-org-public-key.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsGetOrgPublicKeyResponse.SuccessJson(
          json = AgentsCodecs.agentsGetOrgPublicKeyResponseCodecAlternative0Registry.select(listOf("agents/get-org-public-key.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsGetOrgPublicKeyResponse = AgentsGetOrgPublicKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/get-org-secret`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AgentsGetOrgSecretResponse {
    public class SuccessJson(
      public val json: OrganizationActionsSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetOrgSecretResponse
  }

  private object AgentsGetOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsGetOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsGetOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsGetOrgSecretResponse> = when {
      alternative.id == "agents/get-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsGetOrgSecretResponse.SuccessJson(
          json = AgentsCodecs.agentsGetOrgSecretResponseCodecAlternative0Registry.select(listOf("agents/get-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsGetOrgSecretResponse = AgentsGetOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/get-org-variable`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AgentsGetOrgVariableResponse {
    public class SuccessJson(
      public val json: OrganizationActionsVariable,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetOrgVariableResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetOrgVariableResponse
  }

  private object AgentsGetOrgVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsGetOrgVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsGetOrgVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsGetOrgVariableResponse> = when {
      alternative.id == "agents/get-org-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsGetOrgVariableResponse.SuccessJson(
          json = AgentsCodecs.agentsGetOrgVariableResponseCodecAlternative0Registry.select(listOf("agents/get-org-variable.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsGetOrgVariableResponse = AgentsGetOrgVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/get-repo-public-key`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsGetRepoPublicKeyResponse {
    public class SuccessJson(
      public val json: ActionsPublicKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetRepoPublicKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetRepoPublicKeyResponse
  }

  private object AgentsGetRepoPublicKeyResponseDecoder : SdkResponseAlternativeDecoder<AgentsGetRepoPublicKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsGetRepoPublicKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsGetRepoPublicKeyResponse> = when {
      alternative.id == "agents/get-repo-public-key.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsGetRepoPublicKeyResponse.SuccessJson(
          json = AgentsCodecs.agentsGetRepoPublicKeyResponseCodecAlternative0Registry.select(listOf("agents/get-repo-public-key.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsGetRepoPublicKeyResponse = AgentsGetRepoPublicKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/get-repo-secret`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AgentsGetRepoSecretResponse {
    public class SuccessJson(
      public val json: ActionsSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetRepoSecretResponse
  }

  private object AgentsGetRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsGetRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsGetRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsGetRepoSecretResponse> = when {
      alternative.id == "agents/get-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsGetRepoSecretResponse.SuccessJson(
          json = AgentsCodecs.agentsGetRepoSecretResponseCodecAlternative0Registry.select(listOf("agents/get-repo-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsGetRepoSecretResponse = AgentsGetRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/get-repo-variable`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AgentsGetRepoVariableResponse {
    public class SuccessJson(
      public val json: ActionsVariable,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetRepoVariableResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsGetRepoVariableResponse
  }

  private object AgentsGetRepoVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsGetRepoVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsGetRepoVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsGetRepoVariableResponse> = when {
      alternative.id == "agents/get-repo-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsGetRepoVariableResponse.SuccessJson(
          json = AgentsCodecs.agentsGetRepoVariableResponseCodecAlternative0Registry.select(listOf("agents/get-repo-variable.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsGetRepoVariableResponse = AgentsGetRepoVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/list-org-secrets`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AgentsListOrgSecretsResponse {
    public class SuccessJson(
      public val json: InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListOrgSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListOrgSecretsResponse
  }

  private object AgentsListOrgSecretsResponseDecoder : SdkResponseAlternativeDecoder<AgentsListOrgSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsListOrgSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsListOrgSecretsResponse> = when {
      alternative.id == "agents/list-org-secrets.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsListOrgSecretsResponse.SuccessJson(
          json = AgentsCodecs.agentsListOrgSecretsResponseCodecAlternative0Registry.select(listOf("agents/list-org-secrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsListOrgSecretsResponse = AgentsListOrgSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/list-org-variables`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsListOrgVariablesResponse {
    public class SuccessJson(
      public val json: InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListOrgVariablesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListOrgVariablesResponse
  }

  private object AgentsListOrgVariablesResponseDecoder : SdkResponseAlternativeDecoder<AgentsListOrgVariablesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsListOrgVariablesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsListOrgVariablesResponse> = when {
      alternative.id == "agents/list-org-variables.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsListOrgVariablesResponse.SuccessJson(
          json = AgentsCodecs.agentsListOrgVariablesResponseCodecAlternative0Registry.select(listOf("agents/list-org-variables.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsListOrgVariablesResponse = AgentsListOrgVariablesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/list-repo-organization-secrets`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface AgentsListRepoOrganizationSecretsResponse {
    public class SuccessJson(
      public val json: InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListRepoOrganizationSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListRepoOrganizationSecretsResponse
  }

  private object AgentsListRepoOrganizationSecretsResponseDecoder : SdkResponseAlternativeDecoder<AgentsListRepoOrganizationSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsListRepoOrganizationSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsListRepoOrganizationSecretsResponse> = when {
      alternative.id == "agents/list-repo-organization-secrets.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsListRepoOrganizationSecretsResponse.SuccessJson(
          json = AgentsCodecs.agentsListRepoOrganizationSecretsResponseCodecAlternative0Registry.select(listOf("agents/list-repo-organization-secrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsListRepoOrganizationSecretsResponse = AgentsListRepoOrganizationSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/list-repo-organization-variables`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsListRepoOrganizationVariablesResponse {
    public class SuccessJson(
      public val json: InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListRepoOrganizationVariablesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListRepoOrganizationVariablesResponse
  }

  private object AgentsListRepoOrganizationVariablesResponseDecoder : SdkResponseAlternativeDecoder<AgentsListRepoOrganizationVariablesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsListRepoOrganizationVariablesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsListRepoOrganizationVariablesResponse> = when {
      alternative.id == "agents/list-repo-organization-variables.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsListRepoOrganizationVariablesResponse.SuccessJson(
          json = AgentsCodecs.agentsListRepoOrganizationVariablesResponseCodecAlternative0Registry.select(listOf("agents/list-repo-organization-variables.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsListRepoOrganizationVariablesResponse = AgentsListRepoOrganizationVariablesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/list-repo-secrets`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AgentsListRepoSecretsResponse {
    public class SuccessJson(
      public val json: InlineReposAgentsSecretsGetResponse200JsonXfad460e5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListRepoSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListRepoSecretsResponse
  }

  private object AgentsListRepoSecretsResponseDecoder : SdkResponseAlternativeDecoder<AgentsListRepoSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsListRepoSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsListRepoSecretsResponse> = when {
      alternative.id == "agents/list-repo-secrets.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsListRepoSecretsResponse.SuccessJson(
          json = AgentsCodecs.agentsListRepoSecretsResponseCodecAlternative0Registry.select(listOf("agents/list-repo-secrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsListRepoSecretsResponse = AgentsListRepoSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/list-repo-variables`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsListRepoVariablesResponse {
    public class SuccessJson(
      public val json: InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListRepoVariablesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListRepoVariablesResponse
  }

  private object AgentsListRepoVariablesResponseDecoder : SdkResponseAlternativeDecoder<AgentsListRepoVariablesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsListRepoVariablesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsListRepoVariablesResponse> = when {
      alternative.id == "agents/list-repo-variables.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsListRepoVariablesResponse.SuccessJson(
          json = AgentsCodecs.agentsListRepoVariablesResponseCodecAlternative0Registry.select(listOf("agents/list-repo-variables.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsListRepoVariablesResponse = AgentsListRepoVariablesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/list-selected-repos-for-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsListSelectedReposForOrgSecretResponse {
    public class SuccessJson(
      public val json: InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListSelectedReposForOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListSelectedReposForOrgSecretResponse
  }

  private object AgentsListSelectedReposForOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsListSelectedReposForOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsListSelectedReposForOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsListSelectedReposForOrgSecretResponse> = when {
      alternative.id == "agents/list-selected-repos-for-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsListSelectedReposForOrgSecretResponse.SuccessJson(
          json = AgentsCodecs.agentsListSelectedReposForOrgSecretResponseCodecAlternative0Registry.select(listOf("agents/list-selected-repos-for-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AgentsListSelectedReposForOrgSecretResponse = AgentsListSelectedReposForOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agents/list-selected-repos-for-org-variable` may expose through its
   * typed API exception.
   */
  public sealed interface AgentsListSelectedReposForOrgVariableError

  /**
   * Typed response alternatives for `agents/list-selected-repos-for-org-variable`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsListSelectedReposForOrgVariableResponse {
    public class SuccessJson(
      public val json: InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListSelectedReposForOrgVariableResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListSelectedReposForOrgVariableResponse,
        AgentsListSelectedReposForOrgVariableError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsListSelectedReposForOrgVariableResponse
  }

  /**
   * Raised by `agents/list-selected-repos-for-org-variable` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class AgentsListSelectedReposForOrgVariableApiException(
    public val error: AgentsListSelectedReposForOrgVariableError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agents/list-selected-repos-for-org-variable")

  private object AgentsListSelectedReposForOrgVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsListSelectedReposForOrgVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsListSelectedReposForOrgVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsListSelectedReposForOrgVariableResponse> = when {
      alternative.id == "agents/list-selected-repos-for-org-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsListSelectedReposForOrgVariableResponse.SuccessJson(
          json = AgentsCodecs.agentsListSelectedReposForOrgVariableResponseCodecAlternative0Registry.select(listOf("agents/list-selected-repos-for-org-variable.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agents/list-selected-repos-for-org-variable.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentsListSelectedReposForOrgVariableResponse.Http409NoContent(
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
    ): AgentsListSelectedReposForOrgVariableResponse = AgentsListSelectedReposForOrgVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agents/remove-selected-repo-from-org-secret` may expose through its
   * typed API exception.
   */
  public sealed interface AgentsRemoveSelectedRepoFromOrgSecretError

  /**
   * Typed response alternatives for `agents/remove-selected-repo-from-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsRemoveSelectedRepoFromOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsRemoveSelectedRepoFromOrgSecretResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsRemoveSelectedRepoFromOrgSecretResponse,
        AgentsRemoveSelectedRepoFromOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsRemoveSelectedRepoFromOrgSecretResponse
  }

  /**
   * Raised by `agents/remove-selected-repo-from-org-secret` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class AgentsRemoveSelectedRepoFromOrgSecretApiException(
    public val error: AgentsRemoveSelectedRepoFromOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agents/remove-selected-repo-from-org-secret")

  private object AgentsRemoveSelectedRepoFromOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsRemoveSelectedRepoFromOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsRemoveSelectedRepoFromOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsRemoveSelectedRepoFromOrgSecretResponse> = when {
      alternative.id == "agents/remove-selected-repo-from-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agents/remove-selected-repo-from-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentsRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent(
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
    ): AgentsRemoveSelectedRepoFromOrgSecretResponse = AgentsRemoveSelectedRepoFromOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agents/remove-selected-repo-from-org-variable` may expose through
   * its typed API exception.
   */
  public sealed interface AgentsRemoveSelectedRepoFromOrgVariableError

  /**
   * Typed response alternatives for `agents/remove-selected-repo-from-org-variable`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsRemoveSelectedRepoFromOrgVariableResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsRemoveSelectedRepoFromOrgVariableResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsRemoveSelectedRepoFromOrgVariableResponse,
        AgentsRemoveSelectedRepoFromOrgVariableError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsRemoveSelectedRepoFromOrgVariableResponse
  }

  /**
   * Raised by `agents/remove-selected-repo-from-org-variable` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AgentsRemoveSelectedRepoFromOrgVariableApiException(
    public val error: AgentsRemoveSelectedRepoFromOrgVariableError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agents/remove-selected-repo-from-org-variable")

  private object AgentsRemoveSelectedRepoFromOrgVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsRemoveSelectedRepoFromOrgVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsRemoveSelectedRepoFromOrgVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsRemoveSelectedRepoFromOrgVariableResponse> = when {
      alternative.id == "agents/remove-selected-repo-from-org-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsRemoveSelectedRepoFromOrgVariableResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agents/remove-selected-repo-from-org-variable.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentsRemoveSelectedRepoFromOrgVariableResponse.Http409NoContent(
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
    ): AgentsRemoveSelectedRepoFromOrgVariableResponse = AgentsRemoveSelectedRepoFromOrgVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/set-selected-repos-for-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsSetSelectedReposForOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsSetSelectedReposForOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsSetSelectedReposForOrgSecretResponse
  }

  private object AgentsSetSelectedReposForOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<AgentsSetSelectedReposForOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsSetSelectedReposForOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsSetSelectedReposForOrgSecretResponse> = when {
      alternative.id == "agents/set-selected-repos-for-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsSetSelectedReposForOrgSecretResponse.SuccessNoContent(
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
    ): AgentsSetSelectedReposForOrgSecretResponse = AgentsSetSelectedReposForOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `agents/set-selected-repos-for-org-variable` may expose through its
   * typed API exception.
   */
  public sealed interface AgentsSetSelectedReposForOrgVariableError

  /**
   * Typed response alternatives for `agents/set-selected-repos-for-org-variable`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AgentsSetSelectedReposForOrgVariableResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsSetSelectedReposForOrgVariableResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsSetSelectedReposForOrgVariableResponse,
        AgentsSetSelectedReposForOrgVariableError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsSetSelectedReposForOrgVariableResponse
  }

  /**
   * Raised by `agents/set-selected-repos-for-org-variable` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class AgentsSetSelectedReposForOrgVariableApiException(
    public val error: AgentsSetSelectedReposForOrgVariableError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "agents/set-selected-repos-for-org-variable")

  private object AgentsSetSelectedReposForOrgVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsSetSelectedReposForOrgVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsSetSelectedReposForOrgVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsSetSelectedReposForOrgVariableResponse> = when {
      alternative.id == "agents/set-selected-repos-for-org-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsSetSelectedReposForOrgVariableResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "agents/set-selected-repos-for-org-variable.response.alternative1" -> SdkResponseDecodeResult(
        value = AgentsSetSelectedReposForOrgVariableResponse.Http409NoContent(
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
    ): AgentsSetSelectedReposForOrgVariableResponse = AgentsSetSelectedReposForOrgVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/update-org-variable`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsUpdateOrgVariableResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsUpdateOrgVariableResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsUpdateOrgVariableResponse
  }

  private object AgentsUpdateOrgVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsUpdateOrgVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsUpdateOrgVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsUpdateOrgVariableResponse> = when {
      alternative.id == "agents/update-org-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsUpdateOrgVariableResponse.SuccessNoContent(
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
    ): AgentsUpdateOrgVariableResponse = AgentsUpdateOrgVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `agents/update-repo-variable`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AgentsUpdateRepoVariableResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsUpdateRepoVariableResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AgentsUpdateRepoVariableResponse
  }

  private object AgentsUpdateRepoVariableResponseDecoder : SdkResponseAlternativeDecoder<AgentsUpdateRepoVariableResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AgentsUpdateRepoVariableResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AgentsUpdateRepoVariableResponse> = when {
      alternative.id == "agents/update-repo-variable.response.alternative0" -> SdkResponseDecodeResult(
        value = AgentsUpdateRepoVariableResponse.SuccessNoContent(
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
    ): AgentsUpdateRepoVariableResponse = AgentsUpdateRepoVariableResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val agentsAddSelectedRepoToOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/add-selected-repo-to-org-secret",
          method = "PUT",
          path = "/orgs/{org}/agents/secrets/{secret_name}/repositories/{repository_id}",
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
              id = "agents/add-selected-repo-to-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/add-selected-repo-to-org-secret.response.alternative1",
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

    public val agentsAddSelectedRepoToOrgVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/add-selected-repo-to-org-variable",
          method = "PUT",
          path = "/orgs/{org}/agents/variables/{name}/repositories/{repository_id}",
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
              id = "agents/add-selected-repo-to-org-variable.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/add-selected-repo-to-org-variable.response.alternative1",
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

    public val agentsCreateOrUpdateOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/create-or-update-org-secret",
          method = "PUT",
          path = "/orgs/{org}/agents/secrets/{secret_name}",
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
              id = "agents/create-or-update-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/create-or-update-org-secret.response.alternative1",
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

    public val agentsCreateOrUpdateRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/create-or-update-repo-secret",
          method = "PUT",
          path = "/repos/{owner}/{repo}/agents/secrets/{secret_name}",
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
              id = "agents/create-or-update-repo-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/create-or-update-repo-secret.response.alternative1",
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

    public val agentsCreateOrgVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/create-org-variable",
          method = "POST",
          path = "/orgs/{org}/agents/variables",
          requestMediaTypes = listOf("application/json"),
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
              id = "agents/create-org-variable.response.alternative0",
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

    public val agentsCreateRepoVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/create-repo-variable",
          method = "POST",
          path = "/repos/{owner}/{repo}/agents/variables",
          requestMediaTypes = listOf("application/json"),
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
              id = "agents/create-repo-variable.response.alternative0",
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

    public val agentsDeleteOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/delete-org-secret",
          method = "DELETE",
          path = "/orgs/{org}/agents/secrets/{secret_name}",
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
              id = "agents/delete-org-secret.response.alternative0",
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

    public val agentsDeleteOrgVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/delete-org-variable",
          method = "DELETE",
          path = "/orgs/{org}/agents/variables/{name}",
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
              id = "agents/delete-org-variable.response.alternative0",
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

    public val agentsDeleteRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/delete-repo-secret",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/agents/secrets/{secret_name}",
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
              id = "agents/delete-repo-secret.response.alternative0",
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

    public val agentsDeleteRepoVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/delete-repo-variable",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/agents/variables/{name}",
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
              id = "agents/delete-repo-variable.response.alternative0",
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

    public val agentsGetOrgPublicKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/get-org-public-key",
          method = "GET",
          path = "/orgs/{org}/agents/secrets/public-key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ActionsPublicKey",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/get-org-public-key.response.alternative0",
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

    public val agentsGetOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/get-org-secret",
          method = "GET",
          path = "/orgs/{org}/agents/secrets/{secret_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "OrganizationActionsSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/get-org-secret.response.alternative0",
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

    public val agentsGetOrgVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/get-org-variable",
          method = "GET",
          path = "/orgs/{org}/agents/variables/{name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "OrganizationActionsVariable",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/get-org-variable.response.alternative0",
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

    public val agentsGetRepoPublicKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/get-repo-public-key",
          method = "GET",
          path = "/repos/{owner}/{repo}/agents/secrets/public-key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ActionsPublicKey",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/get-repo-public-key.response.alternative0",
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

    public val agentsGetRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/get-repo-secret",
          method = "GET",
          path = "/repos/{owner}/{repo}/agents/secrets/{secret_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ActionsSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/get-repo-secret.response.alternative0",
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

    public val agentsGetRepoVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/get-repo-variable",
          method = "GET",
          path = "/repos/{owner}/{repo}/agents/variables/{name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ActionsVariable",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/get-repo-variable.response.alternative0",
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

    public val agentsListOrgSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/list-org-secrets",
          method = "GET",
          path = "/orgs/{org}/agents/secrets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsAgentsSecretsGetResponse200JsonX7745ea13",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-org-secrets.response.alternative0",
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

    public val agentsListOrgVariablesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/list-org-variables",
          method = "GET",
          path = "/orgs/{org}/agents/variables",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsAgentsVariablesGetResponse200JsonXcce73df4",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-org-variables.response.alternative0",
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

    public val agentsListRepoOrganizationSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/list-repo-organization-secrets",
          method = "GET",
          path = "/repos/{owner}/{repo}/agents/organization-secrets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposAgentsOrganizationSecretsGetResponse200JsonX890e6f94",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-repo-organization-secrets.response.alternative0",
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

    public val agentsListRepoOrganizationVariablesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/list-repo-organization-variables",
          method = "GET",
          path = "/repos/{owner}/{repo}/agents/organization-variables",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposAgentsOrganizationVariablesGetResponse200JsonX4eedb9aa",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-repo-organization-variables.response.alternative0",
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

    public val agentsListRepoSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/list-repo-secrets",
          method = "GET",
          path = "/repos/{owner}/{repo}/agents/secrets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposAgentsSecretsGetResponse200JsonXfad460e5",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-repo-secrets.response.alternative0",
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

    public val agentsListRepoVariablesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/list-repo-variables",
          method = "GET",
          path = "/repos/{owner}/{repo}/agents/variables",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposAgentsVariablesGetResponse200JsonX5e8cd30b",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-repo-variables.response.alternative0",
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

    public val agentsListSelectedReposForOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/list-selected-repos-for-org-secret",
          method = "GET",
          path = "/orgs/{org}/agents/secrets/{secret_name}/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsAgentsSecretsRepositoriesGetResponse200JsonX7c1c5312",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-selected-repos-for-org-secret.response.alternative0",
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

    public val agentsListSelectedReposForOrgVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/list-selected-repos-for-org-variable",
          method = "GET",
          path = "/orgs/{org}/agents/variables/{name}/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsAgentsVariablesRepositoriesGetResponse200JsonXc0fd7795",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-selected-repos-for-org-variable.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/list-selected-repos-for-org-variable.response.alternative1",
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

    public val agentsRemoveSelectedRepoFromOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/remove-selected-repo-from-org-secret",
          method = "DELETE",
          path = "/orgs/{org}/agents/secrets/{secret_name}/repositories/{repository_id}",
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
              id = "agents/remove-selected-repo-from-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/remove-selected-repo-from-org-secret.response.alternative1",
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

    public val agentsRemoveSelectedRepoFromOrgVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/remove-selected-repo-from-org-variable",
          method = "DELETE",
          path = "/orgs/{org}/agents/variables/{name}/repositories/{repository_id}",
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
              id = "agents/remove-selected-repo-from-org-variable.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/remove-selected-repo-from-org-variable.response.alternative1",
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

    public val agentsSetSelectedReposForOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/set-selected-repos-for-org-secret",
          method = "PUT",
          path = "/orgs/{org}/agents/secrets/{secret_name}/repositories",
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
              id = "agents/set-selected-repos-for-org-secret.response.alternative0",
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

    public val agentsSetSelectedReposForOrgVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/set-selected-repos-for-org-variable",
          method = "PUT",
          path = "/orgs/{org}/agents/variables/{name}/repositories",
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
              id = "agents/set-selected-repos-for-org-variable.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "agents/set-selected-repos-for-org-variable.response.alternative1",
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

    public val agentsUpdateOrgVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/update-org-variable",
          method = "PATCH",
          path = "/orgs/{org}/agents/variables/{name}",
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
              id = "agents/update-org-variable.response.alternative0",
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

    public val agentsUpdateRepoVariableMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "agents/update-repo-variable",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/agents/variables/{name}",
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
              id = "agents/update-repo-variable.response.alternative0",
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
