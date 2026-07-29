package com.nabobery.sdkgen.github.generated.codespaces

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.Codespace
import com.nabobery.sdkgen.github.generated.CodespaceExportDetails
import com.nabobery.sdkgen.github.generated.CodespaceWithFullRepository
import com.nabobery.sdkgen.github.generated.CodespacesOrgSecret
import com.nabobery.sdkgen.github.generated.CodespacesPermissionsCheckForDevcontainer
import com.nabobery.sdkgen.github.generated.CodespacesPublicKey
import com.nabobery.sdkgen.github.generated.CodespacesSecret
import com.nabobery.sdkgen.github.generated.CodespacesUserPublicKey
import com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63
import com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402
import com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a
import com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesGetResponse200JsonX93e6311d
import com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae
import com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesSecretsPutRequestJsonXa2407939
import com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e
import com.nabobery.sdkgen.github.generated.InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6
import com.nabobery.sdkgen.github.generated.InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b
import com.nabobery.sdkgen.github.generated.InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6
import com.nabobery.sdkgen.github.generated.InlineReposCodespacesGetResponse200JsonX2f5d5815
import com.nabobery.sdkgen.github.generated.InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81
import com.nabobery.sdkgen.github.generated.InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7
import com.nabobery.sdkgen.github.generated.InlineReposCodespacesPostRequestJsonXe45a0eb1
import com.nabobery.sdkgen.github.generated.InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5
import com.nabobery.sdkgen.github.generated.InlineReposCodespacesSecretsPutRequestJsonX8d6bc2f8
import com.nabobery.sdkgen.github.generated.InlineReposPullsCodespacesPostRequestJsonX2fa703f3
import com.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesGetResponse200JsonX10571de7
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesMachinesGetResponse200JsonXd25f7924
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesPatchRequestJsonXe8797cb4
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesPostRequestJsonX99d5b743
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesPublishPostRequestJsonXd8022b6e
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesSecretsGetResponse200JsonXaa96d197
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesSecretsPutRequestJsonXab54ecef
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee
import com.nabobery.sdkgen.github.generated.InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8
import com.nabobery.sdkgen.github.generated.RepoCodespacesSecret
import com.nabobery.sdkgen.github.generated.ScimError
import com.nabobery.sdkgen.github.generated.SdkJson
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.json.JsonObject

public object CodespacesCodecs {
  public const val CODESPACESCHECKPERMISSIONSFORDEVCONTAINER_RESPONSE_CODEC_ID: String =
      "codespaces/check-permissions-for-devcontainer.response"

  public const val CODESPACESCODESPACEMACHINESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/codespace-machines-for-authenticated-user.response"

  public const val CODESPACESCREATEFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "codespaces/create-for-authenticated-user.request"

  public const val CODESPACESCREATEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/create-for-authenticated-user.response"

  public const val CODESPACESCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID: String =
      "codespaces/create-or-update-org-secret.request"

  public const val CODESPACESCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID: String =
      "codespaces/create-or-update-repo-secret.request"

  public const val CODESPACESCREATEORUPDATESECRETFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "codespaces/create-or-update-secret-for-authenticated-user.request"

  public const val CODESPACESCREATEWITHPRFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "codespaces/create-with-pr-for-authenticated-user.request"

  public const val CODESPACESCREATEWITHPRFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/create-with-pr-for-authenticated-user.response"

  public const val CODESPACESCREATEWITHREPOFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "codespaces/create-with-repo-for-authenticated-user.request"

  public const val CODESPACESCREATEWITHREPOFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/create-with-repo-for-authenticated-user.response"

  public const val CODESPACESDELETECODESPACESACCESSUSERS_REQUEST_CODEC_ID: String =
      "codespaces/delete-codespaces-access-users.request"

  public const val CODESPACESDELETEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/delete-for-authenticated-user.response"

  public const val CODESPACESDELETEFROMORGANIZATION_RESPONSE_CODEC_ID: String =
      "codespaces/delete-from-organization.response"

  public const val CODESPACESEXPORTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/export-for-authenticated-user.response"

  public const val CODESPACESGETCODESPACESFORUSERINORG_RESPONSE_CODEC_ID: String =
      "codespaces/get-codespaces-for-user-in-org.response"

  public const val CODESPACESGETEXPORTDETAILSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/get-export-details-for-authenticated-user.response"

  public const val CODESPACESGETFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/get-for-authenticated-user.response"

  public const val CODESPACESGETORGPUBLICKEY_RESPONSE_CODEC_ID: String =
      "codespaces/get-org-public-key.response"

  public const val CODESPACESGETORGSECRET_RESPONSE_CODEC_ID: String =
      "codespaces/get-org-secret.response"

  public const val CODESPACESGETPUBLICKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/get-public-key-for-authenticated-user.response"

  public const val CODESPACESGETREPOPUBLICKEY_RESPONSE_CODEC_ID: String =
      "codespaces/get-repo-public-key.response"

  public const val CODESPACESGETREPOSECRET_RESPONSE_CODEC_ID: String =
      "codespaces/get-repo-secret.response"

  public const val CODESPACESGETSECRETFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/get-secret-for-authenticated-user.response"

  public const val CODESPACESLISTDEVCONTAINERSINREPOSITORYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID:
      String = "codespaces/list-devcontainers-in-repository-for-authenticated-user.response"

  public const val CODESPACESLISTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/list-for-authenticated-user.response"

  public const val CODESPACESLISTINORGANIZATION_RESPONSE_CODEC_ID: String =
      "codespaces/list-in-organization.response"

  public const val CODESPACESLISTINREPOSITORYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/list-in-repository-for-authenticated-user.response"

  public const val CODESPACESLISTORGSECRETS_RESPONSE_CODEC_ID: String =
      "codespaces/list-org-secrets.response"

  public const val CODESPACESLISTREPOSECRETS_RESPONSE_CODEC_ID: String =
      "codespaces/list-repo-secrets.response"

  public const val CODESPACESLISTREPOSITORIESFORSECRETFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String
      = "codespaces/list-repositories-for-secret-for-authenticated-user.response"

  public const val CODESPACESLISTSECRETSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/list-secrets-for-authenticated-user.response"

  public const val CODESPACESLISTSELECTEDREPOSFORORGSECRET_RESPONSE_CODEC_ID: String =
      "codespaces/list-selected-repos-for-org-secret.response"

  public const val CODESPACESPREFLIGHTWITHREPOFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/pre-flight-with-repo-for-authenticated-user.response"

  public const val CODESPACESPUBLISHFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "codespaces/publish-for-authenticated-user.request"

  public const val CODESPACESPUBLISHFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/publish-for-authenticated-user.response"

  public const val CODESPACESREPOMACHINESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/repo-machines-for-authenticated-user.response"

  public const val CODESPACESSETCODESPACESACCESS_REQUEST_CODEC_ID: String =
      "codespaces/set-codespaces-access.request"

  public const val CODESPACESSETCODESPACESACCESSUSERS_REQUEST_CODEC_ID: String =
      "codespaces/set-codespaces-access-users.request"

  public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesAddRepositoryForSecretForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesAddRepositoryForSecretForAuthenticatedUserRequestCodecRegistry

  public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecRegistry

  public val codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative1Registry

  public val codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative3Registry

  public val codespacesAddSelectedRepoToOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesAddSelectedRepoToOrgSecretRequestCodecRegistry

  public val codespacesAddSelectedRepoToOrgSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesAddSelectedRepoToOrgSecretResponseCodecRegistry

  public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespacesPermissionsCheckForDevcontainer>
    get() = Partition0.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative0Registry

  public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative1Registry

  public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative2Registry

  public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative3Registry

  public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative4Registry

  public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5>
    get() = Partition0.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative5Registry

  public val codespacesCheckPermissionsForDevcontainerRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesCheckPermissionsForDevcontainerRequestCodecRegistry

  public val codespacesCheckPermissionsForDevcontainerResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespacesPermissionsCheckForDevcontainer>
    get() = Partition0.codespacesCheckPermissionsForDevcontainerResponseCodecRegistry

  public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserCodespacesMachinesGetResponse200JsonXd25f7924>
    get() = Partition0.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesCodespaceMachinesForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesCodespaceMachinesForAuthenticatedUserRequestCodecRegistry

  public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesMachinesGetResponse200JsonXd25f7924>
    get() = Partition0.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecRegistry

  public val codespacesCreateForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesCreateForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesCreateForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesCreateForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesCreateForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesCreateForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5>
    get() = Partition0.codespacesCreateForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesCreateForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesPostRequestJsonX99d5b743>
    get() = Partition0.codespacesCreateForAuthenticatedUserRequestCodecRegistry

  public val codespacesCreateForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateForAuthenticatedUserResponseCodecRegistry

  public val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject>
    get() = Partition0.codespacesCreateOrUpdateOrgSecretResponseCodecAlternative0Registry

  public val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateOrUpdateOrgSecretResponseCodecAlternative2Registry

  public val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesCreateOrUpdateOrgSecretResponseCodecAlternative3Registry

  public val codespacesCreateOrUpdateOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsPutRequestJsonXa2407939>
    get() = Partition0.codespacesCreateOrUpdateOrgSecretRequestCodecRegistry

  public val codespacesCreateOrUpdateRepoSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject>
    get() = Partition0.codespacesCreateOrUpdateRepoSecretResponseCodecAlternative0Registry

  public val codespacesCreateOrUpdateRepoSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodespacesSecretsPutRequestJsonX8d6bc2f8>
    get() = Partition0.codespacesCreateOrUpdateRepoSecretRequestCodecRegistry

  public val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject>
    get() = Partition0.codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesCreateOrUpdateSecretForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesSecretsPutRequestJsonXab54ecef>
    get() = Partition0.codespacesCreateOrUpdateSecretForAuthenticatedUserRequestCodecRegistry

  public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5>
    get() = Partition0.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesCreateWithPrForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposPullsCodespacesPostRequestJsonX2fa703f3?>
    get() = Partition0.codespacesCreateWithPrForAuthenticatedUserRequestCodecRegistry

  public val codespacesCreateWithPrForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateWithPrForAuthenticatedUserResponseCodecRegistry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ScimError>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative6Registry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative7Registry

  public val codespacesCreateWithRepoForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodespacesPostRequestJsonXe45a0eb1?>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserRequestCodecRegistry

  public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesCreateWithRepoForAuthenticatedUserResponseCodecRegistry

  public val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteCodespacesAccessUsersResponseCodecAlternative3Registry

  public val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesDeleteCodespacesAccessUsersResponseCodecAlternative4Registry

  public val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteCodespacesAccessUsersResponseCodecAlternative5Registry

  public val codespacesDeleteCodespacesAccessUsersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402>
    get() = Partition0.codespacesDeleteCodespacesAccessUsersRequestCodecRegistry

  public val codespacesDeleteCodespacesAccessUsersResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteCodespacesAccessUsersResponseCodecRegistry

  public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject>
    get() = Partition0.codespacesDeleteForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesDeleteForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteForAuthenticatedUserRequestCodecRegistry

  public val codespacesDeleteForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<JsonObject>
    get() = Partition0.codespacesDeleteForAuthenticatedUserResponseCodecRegistry

  public val codespacesDeleteFromOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject>
    get() = Partition0.codespacesDeleteFromOrganizationResponseCodecAlternative0Registry

  public val codespacesDeleteFromOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteFromOrganizationResponseCodecAlternative2Registry

  public val codespacesDeleteFromOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteFromOrganizationResponseCodecAlternative3Registry

  public val codespacesDeleteFromOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteFromOrganizationResponseCodecAlternative4Registry

  public val codespacesDeleteFromOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteFromOrganizationResponseCodecAlternative5Registry

  public val codespacesDeleteFromOrganizationRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteFromOrganizationRequestCodecRegistry

  public val codespacesDeleteFromOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<JsonObject>
    get() = Partition0.codespacesDeleteFromOrganizationResponseCodecRegistry

  public val codespacesDeleteOrgSecretResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesDeleteOrgSecretResponseCodecAlternative1Registry

  public val codespacesDeleteOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteOrgSecretRequestCodecRegistry

  public val codespacesDeleteOrgSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteOrgSecretResponseCodecRegistry

  public val codespacesDeleteRepoSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteRepoSecretRequestCodecRegistry

  public val codespacesDeleteRepoSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteRepoSecretResponseCodecRegistry

  public val codespacesDeleteSecretForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteSecretForAuthenticatedUserRequestCodecRegistry

  public val codespacesDeleteSecretForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesDeleteSecretForAuthenticatedUserResponseCodecRegistry

  public val codespacesExportForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespaceExportDetails>
    get() = Partition0.codespacesExportForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesExportForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesExportForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesExportForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesExportForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesExportForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesExportForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesExportForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesExportForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesExportForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesExportForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesExportForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesExportForAuthenticatedUserRequestCodecRegistry

  public val codespacesExportForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespaceExportDetails>
    get() = Partition0.codespacesExportForAuthenticatedUserResponseCodecRegistry

  public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b>
    get() = Partition0.codespacesGetCodespacesForUserInOrgResponseCodecAlternative0Registry

  public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetCodespacesForUserInOrgResponseCodecAlternative2Registry

  public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetCodespacesForUserInOrgResponseCodecAlternative3Registry

  public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetCodespacesForUserInOrgResponseCodecAlternative4Registry

  public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetCodespacesForUserInOrgResponseCodecAlternative5Registry

  public val codespacesGetCodespacesForUserInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetCodespacesForUserInOrgRequestCodecRegistry

  public val codespacesGetCodespacesForUserInOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b>
    get() = Partition0.codespacesGetCodespacesForUserInOrgResponseCodecRegistry

  public val codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespaceExportDetails>
    get() = Partition0.codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesGetExportDetailsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetExportDetailsForAuthenticatedUserRequestCodecRegistry

  public val codespacesGetExportDetailsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespaceExportDetails>
    get() = Partition0.codespacesGetExportDetailsForAuthenticatedUserResponseCodecRegistry

  public val codespacesGetForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesGetForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesGetForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesGetForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesGetForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesGetForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesGetForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesGetForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetForAuthenticatedUserRequestCodecRegistry

  public val codespacesGetForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition0.codespacesGetForAuthenticatedUserResponseCodecRegistry

  public val codespacesGetOrgPublicKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespacesPublicKey>
    get() = Partition0.codespacesGetOrgPublicKeyResponseCodecAlternative0Registry

  public val codespacesGetOrgPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetOrgPublicKeyRequestCodecRegistry

  public val codespacesGetOrgPublicKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespacesPublicKey>
    get() = Partition0.codespacesGetOrgPublicKeyResponseCodecRegistry

  public val codespacesGetOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespacesOrgSecret>
    get() = Partition0.codespacesGetOrgSecretResponseCodecAlternative0Registry

  public val codespacesGetOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetOrgSecretRequestCodecRegistry

  public val codespacesGetOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespacesOrgSecret>
    get() = Partition0.codespacesGetOrgSecretResponseCodecRegistry

  public val codespacesGetPublicKeyForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespacesUserPublicKey>
    get() = Partition0.codespacesGetPublicKeyForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesGetPublicKeyForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetPublicKeyForAuthenticatedUserRequestCodecRegistry

  public val codespacesGetPublicKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespacesUserPublicKey>
    get() = Partition0.codespacesGetPublicKeyForAuthenticatedUserResponseCodecRegistry

  public val codespacesGetRepoPublicKeyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespacesPublicKey>
    get() = Partition0.codespacesGetRepoPublicKeyResponseCodecAlternative0Registry

  public val codespacesGetRepoPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetRepoPublicKeyRequestCodecRegistry

  public val codespacesGetRepoPublicKeyResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespacesPublicKey>
    get() = Partition0.codespacesGetRepoPublicKeyResponseCodecRegistry

  public val codespacesGetRepoSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RepoCodespacesSecret>
    get() = Partition0.codespacesGetRepoSecretResponseCodecAlternative0Registry

  public val codespacesGetRepoSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetRepoSecretRequestCodecRegistry

  public val codespacesGetRepoSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<RepoCodespacesSecret>
    get() = Partition0.codespacesGetRepoSecretResponseCodecRegistry

  public val codespacesGetSecretForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespacesSecret>
    get() = Partition0.codespacesGetSecretForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesGetSecretForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesGetSecretForAuthenticatedUserRequestCodecRegistry

  public val codespacesGetSecretForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespacesSecret>
    get() = Partition0.codespacesGetSecretForAuthenticatedUserResponseCodecRegistry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative6Registry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserRequestCodecRegistry

  public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6>
    get() = Partition0.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecRegistry

  public val codespacesListForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserCodespacesGetResponse200JsonX10571de7>
    get() = Partition0.codespacesListForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesListForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesListForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesListForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesListForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesListForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListForAuthenticatedUserRequestCodecRegistry

  public val codespacesListForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesGetResponse200JsonX10571de7>
    get() = Partition0.codespacesListForAuthenticatedUserResponseCodecRegistry

  public val codespacesListInOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesGetResponse200JsonX93e6311d>
    get() = Partition0.codespacesListInOrganizationResponseCodecAlternative0Registry

  public val codespacesListInOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListInOrganizationResponseCodecAlternative2Registry

  public val codespacesListInOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListInOrganizationResponseCodecAlternative3Registry

  public val codespacesListInOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListInOrganizationResponseCodecAlternative4Registry

  public val codespacesListInOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListInOrganizationResponseCodecAlternative5Registry

  public val codespacesListInOrganizationRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListInOrganizationRequestCodecRegistry

  public val codespacesListInOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesGetResponse200JsonX93e6311d>
    get() = Partition0.codespacesListInOrganizationResponseCodecRegistry

  public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCodespacesGetResponse200JsonX2f5d5815>
    get() = Partition0.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesListInRepositoryForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListInRepositoryForAuthenticatedUserRequestCodecRegistry

  public val codespacesListInRepositoryForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodespacesGetResponse200JsonX2f5d5815>
    get() = Partition0.codespacesListInRepositoryForAuthenticatedUserResponseCodecRegistry

  public val codespacesListOrgSecretsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae>
    get() = Partition0.codespacesListOrgSecretsResponseCodecAlternative0Registry

  public val codespacesListOrgSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListOrgSecretsRequestCodecRegistry

  public val codespacesListOrgSecretsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae>
    get() = Partition0.codespacesListOrgSecretsResponseCodecRegistry

  public val codespacesListRepoSecretsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5>
    get() = Partition0.codespacesListRepoSecretsResponseCodecAlternative0Registry

  public val codespacesListRepoSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListRepoSecretsRequestCodecRegistry

  public val codespacesListRepoSecretsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5>
    get() = Partition0.codespacesListRepoSecretsResponseCodecRegistry

  public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee>
    get() = Partition0.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesListRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry

  public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee>
    get() = Partition0.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecRegistry

  public val codespacesListSecretsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserCodespacesSecretsGetResponse200JsonXaa96d197>
    get() = Partition0.codespacesListSecretsForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesListSecretsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListSecretsForAuthenticatedUserRequestCodecRegistry

  public val codespacesListSecretsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesSecretsGetResponse200JsonXaa96d197>
    get() = Partition0.codespacesListSecretsForAuthenticatedUserResponseCodecRegistry

  public val codespacesListSelectedReposForOrgSecretResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e>
    get() = Partition0.codespacesListSelectedReposForOrgSecretResponseCodecAlternative0Registry

  public val codespacesListSelectedReposForOrgSecretResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesListSelectedReposForOrgSecretResponseCodecAlternative1Registry

  public val codespacesListSelectedReposForOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesListSelectedReposForOrgSecretRequestCodecRegistry

  public val codespacesListSelectedReposForOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e>
    get() = Partition0.codespacesListSelectedReposForOrgSecretResponseCodecRegistry

  public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7>
    get() = Partition0.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesPreFlightWithRepoForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesPreFlightWithRepoForAuthenticatedUserRequestCodecRegistry

  public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7>
    get() = Partition0.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecRegistry

  public val codespacesPublishForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodespaceWithFullRepository>
    get() = Partition0.codespacesPublishForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesPublishForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesPublishForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesPublishForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesPublishForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesPublishForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesPublishForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesPublishForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesPublishForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesPublishForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesPublishPostRequestJsonXd8022b6e>
    get() = Partition0.codespacesPublishForAuthenticatedUserRequestCodecRegistry

  public val codespacesPublishForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CodespaceWithFullRepository>
    get() = Partition0.codespacesPublishForAuthenticatedUserResponseCodecRegistry

  public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesRemoveRepositoryForSecretForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesRemoveRepositoryForSecretForAuthenticatedUserRequestCodecRegistry

  public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecRegistry

  public val codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative1Registry

  public val codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative3Registry

  public val codespacesRemoveSelectedRepoFromOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesRemoveSelectedRepoFromOrgSecretRequestCodecRegistry

  public val codespacesRemoveSelectedRepoFromOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesRemoveSelectedRepoFromOrgSecretResponseCodecRegistry

  public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81>
    get() = Partition0.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesRepoMachinesForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesRepoMachinesForAuthenticatedUserRequestCodecRegistry

  public val codespacesRepoMachinesForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81>
    get() = Partition0.codespacesRepoMachinesForAuthenticatedUserResponseCodecRegistry

  public val codespacesSetCodespacesAccessResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesSetCodespacesAccessResponseCodecAlternative3Registry

  public val codespacesSetCodespacesAccessResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesSetCodespacesAccessResponseCodecAlternative4Registry

  public val codespacesSetCodespacesAccessResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesSetCodespacesAccessResponseCodecAlternative5Registry

  public val codespacesSetCodespacesAccessRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63>
    get() = Partition0.codespacesSetCodespacesAccessRequestCodecRegistry

  public val codespacesSetCodespacesAccessResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesSetCodespacesAccessResponseCodecRegistry

  public val codespacesSetCodespacesAccessUsersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesSetCodespacesAccessUsersResponseCodecAlternative3Registry

  public val codespacesSetCodespacesAccessUsersResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError>
    get() = Partition0.codespacesSetCodespacesAccessUsersResponseCodecAlternative4Registry

  public val codespacesSetCodespacesAccessUsersResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition0.codespacesSetCodespacesAccessUsersResponseCodecAlternative5Registry

  public val codespacesSetCodespacesAccessUsersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a>
    get() = Partition0.codespacesSetCodespacesAccessUsersRequestCodecRegistry

  public val codespacesSetCodespacesAccessUsersResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition0.codespacesSetCodespacesAccessUsersResponseCodecRegistry

  public const val CODESPACESSETREPOSITORIESFORSECRETFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "codespaces/set-repositories-for-secret-for-authenticated-user.request"

  public const val CODESPACESSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID: String =
      "codespaces/set-selected-repos-for-org-secret.request"

  public const val CODESPACESSTARTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/start-for-authenticated-user.response"

  public const val CODESPACESSTOPFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/stop-for-authenticated-user.response"

  public const val CODESPACESSTOPINORGANIZATION_RESPONSE_CODEC_ID: String =
      "codespaces/stop-in-organization.response"

  public const val CODESPACESUPDATEFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "codespaces/update-for-authenticated-user.request"

  public const val CODESPACESUPDATEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "codespaces/update-for-authenticated-user.response"

  public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesSetRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8>
    get() = Partition1.codespacesSetRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry

  public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition1.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecRegistry

  public val codespacesSetSelectedReposForOrgSecretResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesSetSelectedReposForOrgSecretResponseCodecAlternative1Registry

  public val codespacesSetSelectedReposForOrgSecretRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6>
    get() = Partition1.codespacesSetSelectedReposForOrgSecretRequestCodecRegistry

  public val codespacesSetSelectedReposForOrgSecretResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit>
    get() = Partition1.codespacesSetSelectedReposForOrgSecretResponseCodecRegistry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ScimError>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative5Registry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative6Registry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative7Registry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative8Registry

  public val codespacesStartForAuthenticatedUserResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecAlternative9Registry

  public val codespacesStartForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition1.codespacesStartForAuthenticatedUserRequestCodecRegistry

  public val codespacesStartForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition1.codespacesStartForAuthenticatedUserResponseCodecRegistry

  public val codespacesStopForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition1.codespacesStopForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesStopForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStopForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesStopForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStopForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesStopForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStopForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesStopForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStopForAuthenticatedUserResponseCodecAlternative4Registry

  public val codespacesStopForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition1.codespacesStopForAuthenticatedUserRequestCodecRegistry

  public val codespacesStopForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition1.codespacesStopForAuthenticatedUserResponseCodecRegistry

  public val codespacesStopInOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition1.codespacesStopInOrganizationResponseCodecAlternative0Registry

  public val codespacesStopInOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStopInOrganizationResponseCodecAlternative2Registry

  public val codespacesStopInOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStopInOrganizationResponseCodecAlternative3Registry

  public val codespacesStopInOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStopInOrganizationResponseCodecAlternative4Registry

  public val codespacesStopInOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesStopInOrganizationResponseCodecAlternative5Registry

  public val codespacesStopInOrganizationRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
    get() = Partition1.codespacesStopInOrganizationRequestCodecRegistry

  public val codespacesStopInOrganizationResponseCodecRegistry: MediaTypeCodecRegistry<Codespace>
    get() = Partition1.codespacesStopInOrganizationResponseCodecRegistry

  public val codespacesUpdateForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition1.codespacesUpdateForAuthenticatedUserResponseCodecAlternative0Registry

  public val codespacesUpdateForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesUpdateForAuthenticatedUserResponseCodecAlternative1Registry

  public val codespacesUpdateForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesUpdateForAuthenticatedUserResponseCodecAlternative2Registry

  public val codespacesUpdateForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError>
    get() = Partition1.codespacesUpdateForAuthenticatedUserResponseCodecAlternative3Registry

  public val codespacesUpdateForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserCodespacesPatchRequestJsonXe8797cb4?>
    get() = Partition1.codespacesUpdateForAuthenticatedUserRequestCodecRegistry

  public val codespacesUpdateForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Codespace>
    get() = Partition1.codespacesUpdateForAuthenticatedUserResponseCodecRegistry

  private object Partition0 {
    private val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/add-repository-for-secret-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/add-repository-for-secret-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/add-repository-for-secret-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/add-repository-for-secret-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Codec)

    public val codespacesAddRepositoryForSecretForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    private val codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/add-selected-repo-to-org-secret.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative1Codec)

    private val codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative3Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/add-selected-repo-to-org-secret.response.alternative3", ValidationError.Serializer, SdkJson)

    public val codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative3Codec)

    public val codespacesAddSelectedRepoToOrgSecretRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesAddSelectedRepoToOrgSecretResponseCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    private val codespacesCheckPermissionsForDevcontainerResponseCodec:
        MediaTypeCodec<CodespacesPermissionsCheckForDevcontainer> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCHECKPERMISSIONSFORDEVCONTAINER_RESPONSE_CODEC_ID, CodespacesPermissionsCheckForDevcontainer.Serializer, SdkJson)

    private val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespacesPermissionsCheckForDevcontainer> =
        KotlinxSerializationCodec("codespaces/check-permissions-for-devcontainer.response.alternative0", CodespacesPermissionsCheckForDevcontainer.Serializer, SdkJson)

    public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespacesPermissionsCheckForDevcontainer> =
        MediaTypeCodecRegistry.of(codespacesCheckPermissionsForDevcontainerResponseCodecAlternative0Codec)

    private val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/check-permissions-for-devcontainer.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCheckPermissionsForDevcontainerResponseCodecAlternative1Codec)

    private val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/check-permissions-for-devcontainer.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCheckPermissionsForDevcontainerResponseCodecAlternative2Codec)

    private val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/check-permissions-for-devcontainer.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCheckPermissionsForDevcontainerResponseCodecAlternative3Codec)

    private val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative4Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/check-permissions-for-devcontainer.response.alternative4", ValidationError.Serializer, SdkJson)

    public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesCheckPermissionsForDevcontainerResponseCodecAlternative4Codec)

    private val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative5Codec:
        MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
        KotlinxSerializationCodec("codespaces/check-permissions-for-devcontainer.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

    public val codespacesCheckPermissionsForDevcontainerResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
        MediaTypeCodecRegistry.of(codespacesCheckPermissionsForDevcontainerResponseCodecAlternative5Codec)

    public val codespacesCheckPermissionsForDevcontainerRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesCheckPermissionsForDevcontainerResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespacesPermissionsCheckForDevcontainer> =
        MediaTypeCodecRegistry.of(codespacesCheckPermissionsForDevcontainerResponseCodec)

    private val codespacesCodespaceMachinesForAuthenticatedUserResponseCodec:
        MediaTypeCodec<InlineUserCodespacesMachinesGetResponse200JsonXd25f7924> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCODESPACEMACHINESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineUserCodespacesMachinesGetResponse200JsonXd25f7924.Serializer, SdkJson)

    private val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineUserCodespacesMachinesGetResponse200JsonXd25f7924> =
        KotlinxSerializationCodec("codespaces/codespace-machines-for-authenticated-user.response.alternative0", InlineUserCodespacesMachinesGetResponse200JsonXd25f7924.Serializer, SdkJson)

    public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineUserCodespacesMachinesGetResponse200JsonXd25f7924> =
        MediaTypeCodecRegistry.of(codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/codespace-machines-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/codespace-machines-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/codespace-machines-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/codespace-machines-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative5Codec)

    public val codespacesCodespaceMachinesForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesCodespaceMachinesForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesMachinesGetResponse200JsonXd25f7924> =
        MediaTypeCodecRegistry.of(codespacesCodespaceMachinesForAuthenticatedUserResponseCodec)

    private val codespacesCreateForAuthenticatedUserRequestCodec:
        MediaTypeCodec<InlineUserCodespacesPostRequestJsonX99d5b743> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserCodespacesPostRequestJsonX99d5b743.Serializer, SdkJson)

    private val codespacesCreateForAuthenticatedUserResponseCodec: MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Codespace.Serializer, SdkJson)

    private val codespacesCreateForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/create-for-authenticated-user.response.alternative0", Codespace.Serializer, SdkJson)

    public val codespacesCreateForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesCreateForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/create-for-authenticated-user.response.alternative1", Codespace.Serializer, SdkJson)

    public val codespacesCreateForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesCreateForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesCreateForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesCreateForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesCreateForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesCreateForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesCreateForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesCreateForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
        KotlinxSerializationCodec("codespaces/create-for-authenticated-user.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

    public val codespacesCreateForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
        MediaTypeCodecRegistry.of(codespacesCreateForAuthenticatedUserResponseCodecAlternative5Codec)

    public val codespacesCreateForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesPostRequestJsonX99d5b743> =
        MediaTypeCodecRegistry.of(codespacesCreateForAuthenticatedUserRequestCodec)

    public val codespacesCreateForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateForAuthenticatedUserResponseCodec)

    private val codespacesCreateOrUpdateOrgSecretRequestCodec:
        MediaTypeCodec<InlineOrgsCodespacesSecretsPutRequestJsonXa2407939> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID, InlineOrgsCodespacesSecretsPutRequestJsonXa2407939.Serializer, SdkJson)

    private val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative0Codec:
        MediaTypeCodec<JsonObject> =
        KotlinxSerializationCodec("codespaces/create-or-update-org-secret.response.alternative0", JsonObject.serializer(), SdkJson)

    public val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<JsonObject> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateOrgSecretResponseCodecAlternative0Codec)

    private val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-or-update-org-secret.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateOrgSecretResponseCodecAlternative2Codec)

    private val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative3Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/create-or-update-org-secret.response.alternative3", ValidationError.Serializer, SdkJson)

    public val codespacesCreateOrUpdateOrgSecretResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateOrgSecretResponseCodecAlternative3Codec)

    public val codespacesCreateOrUpdateOrgSecretRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsPutRequestJsonXa2407939> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateOrgSecretRequestCodec)

    private val codespacesCreateOrUpdateRepoSecretRequestCodec:
        MediaTypeCodec<InlineReposCodespacesSecretsPutRequestJsonX8d6bc2f8> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID, InlineReposCodespacesSecretsPutRequestJsonX8d6bc2f8.Serializer, SdkJson)

    private val codespacesCreateOrUpdateRepoSecretResponseCodecAlternative0Codec:
        MediaTypeCodec<JsonObject> =
        KotlinxSerializationCodec("codespaces/create-or-update-repo-secret.response.alternative0", JsonObject.serializer(), SdkJson)

    public val codespacesCreateOrUpdateRepoSecretResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<JsonObject> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateRepoSecretResponseCodecAlternative0Codec)

    public val codespacesCreateOrUpdateRepoSecretRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineReposCodespacesSecretsPutRequestJsonX8d6bc2f8> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateRepoSecretRequestCodec)

    private val codespacesCreateOrUpdateSecretForAuthenticatedUserRequestCodec:
        MediaTypeCodec<InlineUserCodespacesSecretsPutRequestJsonXab54ecef> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEORUPDATESECRETFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserCodespacesSecretsPutRequestJsonXab54ecef.Serializer, SdkJson)

    private val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<JsonObject> =
        KotlinxSerializationCodec("codespaces/create-or-update-secret-for-authenticated-user.response.alternative0", JsonObject.serializer(), SdkJson)

    public val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<JsonObject> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-or-update-secret-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/create-or-update-secret-for-authenticated-user.response.alternative3", ValidationError.Serializer, SdkJson)

    public val codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative3Codec)

    public val codespacesCreateOrUpdateSecretForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesSecretsPutRequestJsonXab54ecef> =
        MediaTypeCodecRegistry.of(codespacesCreateOrUpdateSecretForAuthenticatedUserRequestCodec)

    private val codespacesCreateWithPrForAuthenticatedUserRequestCodec:
        MediaTypeCodec<InlineReposPullsCodespacesPostRequestJsonX2fa703f3?> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEWITHPRFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineReposPullsCodespacesPostRequestJsonX2fa703f3.Serializer.nullable, SdkJson)

    private val codespacesCreateWithPrForAuthenticatedUserResponseCodec: MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEWITHPRFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Codespace.Serializer, SdkJson)

    private val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/create-with-pr-for-authenticated-user.response.alternative0", Codespace.Serializer, SdkJson)

    public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/create-with-pr-for-authenticated-user.response.alternative1", Codespace.Serializer, SdkJson)

    public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-with-pr-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-with-pr-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-with-pr-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
        KotlinxSerializationCodec("codespaces/create-with-pr-for-authenticated-user.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

    public val codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
        MediaTypeCodecRegistry.of(codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative5Codec)

    public val codespacesCreateWithPrForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineReposPullsCodespacesPostRequestJsonX2fa703f3?> =
        MediaTypeCodecRegistry.of(codespacesCreateWithPrForAuthenticatedUserRequestCodec)

    public val codespacesCreateWithPrForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateWithPrForAuthenticatedUserResponseCodec)

    private val codespacesCreateWithRepoForAuthenticatedUserRequestCodec:
        MediaTypeCodec<InlineReposCodespacesPostRequestJsonXe45a0eb1?> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEWITHREPOFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineReposCodespacesPostRequestJsonXe45a0eb1.Serializer.nullable, SdkJson)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodec: MediaTypeCodec<Codespace>
        =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESCREATEWITHREPOFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Codespace.Serializer, SdkJson)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/create-with-repo-for-authenticated-user.response.alternative0", Codespace.Serializer, SdkJson)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/create-with-repo-for-authenticated-user.response.alternative1", Codespace.Serializer, SdkJson)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-with-repo-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<ScimError> =
        KotlinxSerializationCodec("codespaces/create-with-repo-for-authenticated-user.response.alternative3", ScimError.Serializer, SdkJson)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<ScimError> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-with-repo-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-with-repo-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative5Codec)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative6Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/create-with-repo-for-authenticated-user.response.alternative6", BasicError.Serializer, SdkJson)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative6Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative6Codec)

    private val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative7Codec:
        MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
        KotlinxSerializationCodec("codespaces/create-with-repo-for-authenticated-user.response.alternative7", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative7Registry:
        MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative7Codec)

    public val codespacesCreateWithRepoForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineReposCodespacesPostRequestJsonXe45a0eb1?> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserRequestCodec)

    public val codespacesCreateWithRepoForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesCreateWithRepoForAuthenticatedUserResponseCodec)

    private val codespacesDeleteCodespacesAccessUsersRequestCodec:
        MediaTypeCodec<InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESDELETECODESPACESACCESSUSERS_REQUEST_CODEC_ID, InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402.Serializer, SdkJson)

    private val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-codespaces-access-users.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteCodespacesAccessUsersResponseCodecAlternative3Codec)

    private val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative4Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/delete-codespaces-access-users.response.alternative4", ValidationError.Serializer, SdkJson)

    public val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesDeleteCodespacesAccessUsersResponseCodecAlternative4Codec)

    private val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-codespaces-access-users.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesDeleteCodespacesAccessUsersResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteCodespacesAccessUsersResponseCodecAlternative5Codec)

    public val codespacesDeleteCodespacesAccessUsersRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402> =
        MediaTypeCodecRegistry.of(codespacesDeleteCodespacesAccessUsersRequestCodec)

    public val codespacesDeleteCodespacesAccessUsersResponseCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    private val codespacesDeleteForAuthenticatedUserResponseCodec: MediaTypeCodec<JsonObject> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESDELETEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

    private val codespacesDeleteForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<JsonObject> =
        KotlinxSerializationCodec("codespaces/delete-for-authenticated-user.response.alternative0", JsonObject.serializer(), SdkJson)

    public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<JsonObject> =
        MediaTypeCodecRegistry.of(codespacesDeleteForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesDeleteForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesDeleteForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesDeleteForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesDeleteForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesDeleteForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteForAuthenticatedUserResponseCodecAlternative5Codec)

    public val codespacesDeleteForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesDeleteForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<JsonObject> =
        MediaTypeCodecRegistry.of(codespacesDeleteForAuthenticatedUserResponseCodec)

    private val codespacesDeleteFromOrganizationResponseCodec: MediaTypeCodec<JsonObject> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESDELETEFROMORGANIZATION_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

    private val codespacesDeleteFromOrganizationResponseCodecAlternative0Codec:
        MediaTypeCodec<JsonObject> =
        KotlinxSerializationCodec("codespaces/delete-from-organization.response.alternative0", JsonObject.serializer(), SdkJson)

    public val codespacesDeleteFromOrganizationResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<JsonObject> =
        MediaTypeCodecRegistry.of(codespacesDeleteFromOrganizationResponseCodecAlternative0Codec)

    private val codespacesDeleteFromOrganizationResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-from-organization.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesDeleteFromOrganizationResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteFromOrganizationResponseCodecAlternative2Codec)

    private val codespacesDeleteFromOrganizationResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-from-organization.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesDeleteFromOrganizationResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteFromOrganizationResponseCodecAlternative3Codec)

    private val codespacesDeleteFromOrganizationResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-from-organization.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesDeleteFromOrganizationResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteFromOrganizationResponseCodecAlternative4Codec)

    private val codespacesDeleteFromOrganizationResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/delete-from-organization.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesDeleteFromOrganizationResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteFromOrganizationResponseCodecAlternative5Codec)

    public val codespacesDeleteFromOrganizationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesDeleteFromOrganizationResponseCodecRegistry:
        MediaTypeCodecRegistry<JsonObject> =
        MediaTypeCodecRegistry.of(codespacesDeleteFromOrganizationResponseCodec)

    private val codespacesDeleteOrgSecretResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
        =
        KotlinxSerializationCodec("codespaces/delete-org-secret.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesDeleteOrgSecretResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesDeleteOrgSecretResponseCodecAlternative1Codec)

    public val codespacesDeleteOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesDeleteOrgSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesDeleteRepoSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesDeleteRepoSecretResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesDeleteSecretForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesDeleteSecretForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    private val codespacesExportForAuthenticatedUserResponseCodec:
        MediaTypeCodec<CodespaceExportDetails> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESEXPORTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, CodespaceExportDetails.Serializer, SdkJson)

    private val codespacesExportForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespaceExportDetails> =
        KotlinxSerializationCodec("codespaces/export-for-authenticated-user.response.alternative0", CodespaceExportDetails.Serializer, SdkJson)

    public val codespacesExportForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespaceExportDetails> =
        MediaTypeCodecRegistry.of(codespacesExportForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesExportForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/export-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesExportForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesExportForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesExportForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/export-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesExportForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesExportForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesExportForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/export-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesExportForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesExportForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesExportForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/export-for-authenticated-user.response.alternative4", ValidationError.Serializer, SdkJson)

    public val codespacesExportForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesExportForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesExportForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/export-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesExportForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesExportForAuthenticatedUserResponseCodecAlternative5Codec)

    public val codespacesExportForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesExportForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespaceExportDetails> =
        MediaTypeCodecRegistry.of(codespacesExportForAuthenticatedUserResponseCodec)

    private val codespacesGetCodespacesForUserInOrgResponseCodec:
        MediaTypeCodec<InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETCODESPACESFORUSERINORG_RESPONSE_CODEC_ID, InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b.Serializer, SdkJson)

    private val codespacesGetCodespacesForUserInOrgResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b> =
        KotlinxSerializationCodec("codespaces/get-codespaces-for-user-in-org.response.alternative0", InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b.Serializer, SdkJson)

    public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b> =
        MediaTypeCodecRegistry.of(codespacesGetCodespacesForUserInOrgResponseCodecAlternative0Codec)

    private val codespacesGetCodespacesForUserInOrgResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-codespaces-for-user-in-org.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetCodespacesForUserInOrgResponseCodecAlternative2Codec)

    private val codespacesGetCodespacesForUserInOrgResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-codespaces-for-user-in-org.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetCodespacesForUserInOrgResponseCodecAlternative3Codec)

    private val codespacesGetCodespacesForUserInOrgResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-codespaces-for-user-in-org.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetCodespacesForUserInOrgResponseCodecAlternative4Codec)

    private val codespacesGetCodespacesForUserInOrgResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-codespaces-for-user-in-org.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesGetCodespacesForUserInOrgResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetCodespacesForUserInOrgResponseCodecAlternative5Codec)

    public val codespacesGetCodespacesForUserInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
        = MediaTypeCodecRegistry.of()

    public val codespacesGetCodespacesForUserInOrgResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b> =
        MediaTypeCodecRegistry.of(codespacesGetCodespacesForUserInOrgResponseCodec)

    private val codespacesGetExportDetailsForAuthenticatedUserResponseCodec:
        MediaTypeCodec<CodespaceExportDetails> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETEXPORTDETAILSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, CodespaceExportDetails.Serializer, SdkJson)

    private val codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespaceExportDetails> =
        KotlinxSerializationCodec("codespaces/get-export-details-for-authenticated-user.response.alternative0", CodespaceExportDetails.Serializer, SdkJson)

    public val codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespaceExportDetails> =
        MediaTypeCodecRegistry.of(codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-export-details-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative1Codec)

    public val codespacesGetExportDetailsForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesGetExportDetailsForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespaceExportDetails> =
        MediaTypeCodecRegistry.of(codespacesGetExportDetailsForAuthenticatedUserResponseCodec)

    private val codespacesGetForAuthenticatedUserResponseCodec: MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Codespace.Serializer, SdkJson)

    private val codespacesGetForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/get-for-authenticated-user.response.alternative0", Codespace.Serializer, SdkJson)

    public val codespacesGetForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesGetForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesGetForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesGetForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesGetForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesGetForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesGetForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesGetForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesGetForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/get-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesGetForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesGetForAuthenticatedUserResponseCodecAlternative5Codec)

    public val codespacesGetForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesGetForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesGetForAuthenticatedUserResponseCodec)

    private val codespacesGetOrgPublicKeyResponseCodec: MediaTypeCodec<CodespacesPublicKey> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETORGPUBLICKEY_RESPONSE_CODEC_ID, CodespacesPublicKey.Serializer, SdkJson)

    private val codespacesGetOrgPublicKeyResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespacesPublicKey> =
        KotlinxSerializationCodec("codespaces/get-org-public-key.response.alternative0", CodespacesPublicKey.Serializer, SdkJson)

    public val codespacesGetOrgPublicKeyResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespacesPublicKey> =
        MediaTypeCodecRegistry.of(codespacesGetOrgPublicKeyResponseCodecAlternative0Codec)

    public val codespacesGetOrgPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesGetOrgPublicKeyResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespacesPublicKey> =
        MediaTypeCodecRegistry.of(codespacesGetOrgPublicKeyResponseCodec)

    private val codespacesGetOrgSecretResponseCodec: MediaTypeCodec<CodespacesOrgSecret> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETORGSECRET_RESPONSE_CODEC_ID, CodespacesOrgSecret.Serializer, SdkJson)

    private val codespacesGetOrgSecretResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespacesOrgSecret> =
        KotlinxSerializationCodec("codespaces/get-org-secret.response.alternative0", CodespacesOrgSecret.Serializer, SdkJson)

    public val codespacesGetOrgSecretResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespacesOrgSecret> =
        MediaTypeCodecRegistry.of(codespacesGetOrgSecretResponseCodecAlternative0Codec)

    public val codespacesGetOrgSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesGetOrgSecretResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespacesOrgSecret> =
        MediaTypeCodecRegistry.of(codespacesGetOrgSecretResponseCodec)

    private val codespacesGetPublicKeyForAuthenticatedUserResponseCodec:
        MediaTypeCodec<CodespacesUserPublicKey> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETPUBLICKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, CodespacesUserPublicKey.Serializer, SdkJson)

    private val codespacesGetPublicKeyForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespacesUserPublicKey> =
        KotlinxSerializationCodec("codespaces/get-public-key-for-authenticated-user.response.alternative0", CodespacesUserPublicKey.Serializer, SdkJson)

    public val codespacesGetPublicKeyForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespacesUserPublicKey> =
        MediaTypeCodecRegistry.of(codespacesGetPublicKeyForAuthenticatedUserResponseCodecAlternative0Codec)

    public val codespacesGetPublicKeyForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesGetPublicKeyForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespacesUserPublicKey> =
        MediaTypeCodecRegistry.of(codespacesGetPublicKeyForAuthenticatedUserResponseCodec)

    private val codespacesGetRepoPublicKeyResponseCodec: MediaTypeCodec<CodespacesPublicKey> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETREPOPUBLICKEY_RESPONSE_CODEC_ID, CodespacesPublicKey.Serializer, SdkJson)

    private val codespacesGetRepoPublicKeyResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespacesPublicKey> =
        KotlinxSerializationCodec("codespaces/get-repo-public-key.response.alternative0", CodespacesPublicKey.Serializer, SdkJson)

    public val codespacesGetRepoPublicKeyResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespacesPublicKey> =
        MediaTypeCodecRegistry.of(codespacesGetRepoPublicKeyResponseCodecAlternative0Codec)

    public val codespacesGetRepoPublicKeyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesGetRepoPublicKeyResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespacesPublicKey> =
        MediaTypeCodecRegistry.of(codespacesGetRepoPublicKeyResponseCodec)

    private val codespacesGetRepoSecretResponseCodec: MediaTypeCodec<RepoCodespacesSecret> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETREPOSECRET_RESPONSE_CODEC_ID, RepoCodespacesSecret.Serializer, SdkJson)

    private val codespacesGetRepoSecretResponseCodecAlternative0Codec:
        MediaTypeCodec<RepoCodespacesSecret> =
        KotlinxSerializationCodec("codespaces/get-repo-secret.response.alternative0", RepoCodespacesSecret.Serializer, SdkJson)

    public val codespacesGetRepoSecretResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<RepoCodespacesSecret> =
        MediaTypeCodecRegistry.of(codespacesGetRepoSecretResponseCodecAlternative0Codec)

    public val codespacesGetRepoSecretRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesGetRepoSecretResponseCodecRegistry:
        MediaTypeCodecRegistry<RepoCodespacesSecret> =
        MediaTypeCodecRegistry.of(codespacesGetRepoSecretResponseCodec)

    private val codespacesGetSecretForAuthenticatedUserResponseCodec:
        MediaTypeCodec<CodespacesSecret> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESGETSECRETFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, CodespacesSecret.Serializer, SdkJson)

    private val codespacesGetSecretForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespacesSecret> =
        KotlinxSerializationCodec("codespaces/get-secret-for-authenticated-user.response.alternative0", CodespacesSecret.Serializer, SdkJson)

    public val codespacesGetSecretForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespacesSecret> =
        MediaTypeCodecRegistry.of(codespacesGetSecretForAuthenticatedUserResponseCodecAlternative0Codec)

    public val codespacesGetSecretForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesGetSecretForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespacesSecret> =
        MediaTypeCodecRegistry.of(codespacesGetSecretForAuthenticatedUserResponseCodec)

    private val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodec:
        MediaTypeCodec<InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTDEVCONTAINERSINREPOSITORYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6.Serializer, SdkJson)

    private val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6> =
        KotlinxSerializationCodec("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative0", InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6.Serializer, SdkJson)

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6> =
        MediaTypeCodecRegistry.of(codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<ScimError> =
        KotlinxSerializationCodec("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative2", ScimError.Serializer, SdkJson)

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<ScimError> =
        MediaTypeCodecRegistry.of(codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative5Codec)

    private val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative6Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative6", BasicError.Serializer, SdkJson)

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative6Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative6Codec)

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6> =
        MediaTypeCodecRegistry.of(codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodec)

    private val codespacesListForAuthenticatedUserResponseCodec:
        MediaTypeCodec<InlineUserCodespacesGetResponse200JsonX10571de7> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineUserCodespacesGetResponse200JsonX10571de7.Serializer, SdkJson)

    private val codespacesListForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineUserCodespacesGetResponse200JsonX10571de7> =
        KotlinxSerializationCodec("codespaces/list-for-authenticated-user.response.alternative0", InlineUserCodespacesGetResponse200JsonX10571de7.Serializer, SdkJson)

    public val codespacesListForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineUserCodespacesGetResponse200JsonX10571de7> =
        MediaTypeCodecRegistry.of(codespacesListForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesListForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesListForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesListForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesListForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesListForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesListForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesListForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesListForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListForAuthenticatedUserResponseCodecAlternative5Codec)

    public val codespacesListForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
        = MediaTypeCodecRegistry.of()

    public val codespacesListForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesGetResponse200JsonX10571de7> =
        MediaTypeCodecRegistry.of(codespacesListForAuthenticatedUserResponseCodec)

    private val codespacesListInOrganizationResponseCodec:
        MediaTypeCodec<InlineOrgsCodespacesGetResponse200JsonX93e6311d> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTINORGANIZATION_RESPONSE_CODEC_ID, InlineOrgsCodespacesGetResponse200JsonX93e6311d.Serializer, SdkJson)

    private val codespacesListInOrganizationResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineOrgsCodespacesGetResponse200JsonX93e6311d> =
        KotlinxSerializationCodec("codespaces/list-in-organization.response.alternative0", InlineOrgsCodespacesGetResponse200JsonX93e6311d.Serializer, SdkJson)

    public val codespacesListInOrganizationResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesGetResponse200JsonX93e6311d> =
        MediaTypeCodecRegistry.of(codespacesListInOrganizationResponseCodecAlternative0Codec)

    private val codespacesListInOrganizationResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-in-organization.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesListInOrganizationResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListInOrganizationResponseCodecAlternative2Codec)

    private val codespacesListInOrganizationResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-in-organization.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesListInOrganizationResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListInOrganizationResponseCodecAlternative3Codec)

    private val codespacesListInOrganizationResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-in-organization.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesListInOrganizationResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListInOrganizationResponseCodecAlternative4Codec)

    private val codespacesListInOrganizationResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-in-organization.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesListInOrganizationResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListInOrganizationResponseCodecAlternative5Codec)

    public val codespacesListInOrganizationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesListInOrganizationResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesGetResponse200JsonX93e6311d> =
        MediaTypeCodecRegistry.of(codespacesListInOrganizationResponseCodec)

    private val codespacesListInRepositoryForAuthenticatedUserResponseCodec:
        MediaTypeCodec<InlineReposCodespacesGetResponse200JsonX2f5d5815> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTINREPOSITORYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineReposCodespacesGetResponse200JsonX2f5d5815.Serializer, SdkJson)

    private val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineReposCodespacesGetResponse200JsonX2f5d5815> =
        KotlinxSerializationCodec("codespaces/list-in-repository-for-authenticated-user.response.alternative0", InlineReposCodespacesGetResponse200JsonX2f5d5815.Serializer, SdkJson)

    public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineReposCodespacesGetResponse200JsonX2f5d5815> =
        MediaTypeCodecRegistry.of(codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-in-repository-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-in-repository-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-in-repository-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-in-repository-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative4Codec)

    public val codespacesListInRepositoryForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesListInRepositoryForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineReposCodespacesGetResponse200JsonX2f5d5815> =
        MediaTypeCodecRegistry.of(codespacesListInRepositoryForAuthenticatedUserResponseCodec)

    private val codespacesListOrgSecretsResponseCodec:
        MediaTypeCodec<InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTORGSECRETS_RESPONSE_CODEC_ID, InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae.Serializer, SdkJson)

    private val codespacesListOrgSecretsResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae> =
        KotlinxSerializationCodec("codespaces/list-org-secrets.response.alternative0", InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae.Serializer, SdkJson)

    public val codespacesListOrgSecretsResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae> =
        MediaTypeCodecRegistry.of(codespacesListOrgSecretsResponseCodecAlternative0Codec)

    public val codespacesListOrgSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesListOrgSecretsResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae> =
        MediaTypeCodecRegistry.of(codespacesListOrgSecretsResponseCodec)

    private val codespacesListRepoSecretsResponseCodec:
        MediaTypeCodec<InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTREPOSECRETS_RESPONSE_CODEC_ID, InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5.Serializer, SdkJson)

    private val codespacesListRepoSecretsResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5> =
        KotlinxSerializationCodec("codespaces/list-repo-secrets.response.alternative0", InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5.Serializer, SdkJson)

    public val codespacesListRepoSecretsResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5> =
        MediaTypeCodecRegistry.of(codespacesListRepoSecretsResponseCodecAlternative0Codec)

    public val codespacesListRepoSecretsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesListRepoSecretsResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5> =
        MediaTypeCodecRegistry.of(codespacesListRepoSecretsResponseCodec)

    private val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodec:
        MediaTypeCodec<InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTREPOSITORIESFORSECRETFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee.Serializer, SdkJson)

    private val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee> =
        KotlinxSerializationCodec("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative0", InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee.Serializer, SdkJson)

    public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee> =
        MediaTypeCodecRegistry.of(codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Codec)

    public val codespacesListRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee> =
        MediaTypeCodecRegistry.of(codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodec)

    private val codespacesListSecretsForAuthenticatedUserResponseCodec:
        MediaTypeCodec<InlineUserCodespacesSecretsGetResponse200JsonXaa96d197> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTSECRETSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineUserCodespacesSecretsGetResponse200JsonXaa96d197.Serializer, SdkJson)

    private val codespacesListSecretsForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineUserCodespacesSecretsGetResponse200JsonXaa96d197> =
        KotlinxSerializationCodec("codespaces/list-secrets-for-authenticated-user.response.alternative0", InlineUserCodespacesSecretsGetResponse200JsonXaa96d197.Serializer, SdkJson)

    public val codespacesListSecretsForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineUserCodespacesSecretsGetResponse200JsonXaa96d197> =
        MediaTypeCodecRegistry.of(codespacesListSecretsForAuthenticatedUserResponseCodecAlternative0Codec)

    public val codespacesListSecretsForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesListSecretsForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesSecretsGetResponse200JsonXaa96d197> =
        MediaTypeCodecRegistry.of(codespacesListSecretsForAuthenticatedUserResponseCodec)

    private val codespacesListSelectedReposForOrgSecretResponseCodec:
        MediaTypeCodec<InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESLISTSELECTEDREPOSFORORGSECRET_RESPONSE_CODEC_ID, InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e.Serializer, SdkJson)

    private val codespacesListSelectedReposForOrgSecretResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e> =
        KotlinxSerializationCodec("codespaces/list-selected-repos-for-org-secret.response.alternative0", InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e.Serializer, SdkJson)

    public val codespacesListSelectedReposForOrgSecretResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e> =
        MediaTypeCodecRegistry.of(codespacesListSelectedReposForOrgSecretResponseCodecAlternative0Codec)

    private val codespacesListSelectedReposForOrgSecretResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/list-selected-repos-for-org-secret.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesListSelectedReposForOrgSecretResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesListSelectedReposForOrgSecretResponseCodecAlternative1Codec)

    public val codespacesListSelectedReposForOrgSecretRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesListSelectedReposForOrgSecretResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e> =
        MediaTypeCodecRegistry.of(codespacesListSelectedReposForOrgSecretResponseCodec)

    private val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodec:
        MediaTypeCodec<InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESPREFLIGHTWITHREPOFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7.Serializer, SdkJson)

    private val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7> =
        KotlinxSerializationCodec("codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative0", InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7.Serializer, SdkJson)

    public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7> =
        MediaTypeCodecRegistry.of(codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative3Codec)

    public val codespacesPreFlightWithRepoForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7> =
        MediaTypeCodecRegistry.of(codespacesPreFlightWithRepoForAuthenticatedUserResponseCodec)

    private val codespacesPublishForAuthenticatedUserRequestCodec:
        MediaTypeCodec<InlineUserCodespacesPublishPostRequestJsonXd8022b6e> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESPUBLISHFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserCodespacesPublishPostRequestJsonXd8022b6e.Serializer, SdkJson)

    private val codespacesPublishForAuthenticatedUserResponseCodec:
        MediaTypeCodec<CodespaceWithFullRepository> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESPUBLISHFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, CodespaceWithFullRepository.Serializer, SdkJson)

    private val codespacesPublishForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<CodespaceWithFullRepository> =
        KotlinxSerializationCodec("codespaces/publish-for-authenticated-user.response.alternative0", CodespaceWithFullRepository.Serializer, SdkJson)

    public val codespacesPublishForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<CodespaceWithFullRepository> =
        MediaTypeCodecRegistry.of(codespacesPublishForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesPublishForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/publish-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesPublishForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesPublishForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesPublishForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/publish-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesPublishForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesPublishForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesPublishForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/publish-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesPublishForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesPublishForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesPublishForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/publish-for-authenticated-user.response.alternative4", ValidationError.Serializer, SdkJson)

    public val codespacesPublishForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesPublishForAuthenticatedUserResponseCodecAlternative4Codec)

    public val codespacesPublishForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesPublishPostRequestJsonXd8022b6e> =
        MediaTypeCodecRegistry.of(codespacesPublishForAuthenticatedUserRequestCodec)

    public val codespacesPublishForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<CodespaceWithFullRepository> =
        MediaTypeCodecRegistry.of(codespacesPublishForAuthenticatedUserResponseCodec)

    private val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Codec)

    public val codespacesRemoveRepositoryForSecretForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    private val codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/remove-selected-repo-from-org-secret.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative1Codec)

    private val codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative3Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/remove-selected-repo-from-org-secret.response.alternative3", ValidationError.Serializer, SdkJson)

    public val codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative3Codec)

    public val codespacesRemoveSelectedRepoFromOrgSecretRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesRemoveSelectedRepoFromOrgSecretResponseCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    private val codespacesRepoMachinesForAuthenticatedUserResponseCodec:
        MediaTypeCodec<InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESREPOMACHINESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81.Serializer, SdkJson)

    private val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81> =
        KotlinxSerializationCodec("codespaces/repo-machines-for-authenticated-user.response.alternative0", InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81.Serializer, SdkJson)

    public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81> =
        MediaTypeCodecRegistry.of(codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/repo-machines-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/repo-machines-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/repo-machines-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/repo-machines-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative5Codec)

    public val codespacesRepoMachinesForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    public val codespacesRepoMachinesForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81> =
        MediaTypeCodecRegistry.of(codespacesRepoMachinesForAuthenticatedUserResponseCodec)

    private val codespacesSetCodespacesAccessRequestCodec:
        MediaTypeCodec<InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESSETCODESPACESACCESS_REQUEST_CODEC_ID, InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63.Serializer, SdkJson)

    private val codespacesSetCodespacesAccessResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-codespaces-access.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesSetCodespacesAccessResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetCodespacesAccessResponseCodecAlternative3Codec)

    private val codespacesSetCodespacesAccessResponseCodecAlternative4Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/set-codespaces-access.response.alternative4", ValidationError.Serializer, SdkJson)

    public val codespacesSetCodespacesAccessResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesSetCodespacesAccessResponseCodecAlternative4Codec)

    private val codespacesSetCodespacesAccessResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-codespaces-access.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesSetCodespacesAccessResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetCodespacesAccessResponseCodecAlternative5Codec)

    public val codespacesSetCodespacesAccessRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63> =
        MediaTypeCodecRegistry.of(codespacesSetCodespacesAccessRequestCodec)

    public val codespacesSetCodespacesAccessResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    private val codespacesSetCodespacesAccessUsersRequestCodec:
        MediaTypeCodec<InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESSETCODESPACESACCESSUSERS_REQUEST_CODEC_ID, InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a.Serializer, SdkJson)

    private val codespacesSetCodespacesAccessUsersResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-codespaces-access-users.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesSetCodespacesAccessUsersResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetCodespacesAccessUsersResponseCodecAlternative3Codec)

    private val codespacesSetCodespacesAccessUsersResponseCodecAlternative4Codec:
        MediaTypeCodec<ValidationError> =
        KotlinxSerializationCodec("codespaces/set-codespaces-access-users.response.alternative4", ValidationError.Serializer, SdkJson)

    public val codespacesSetCodespacesAccessUsersResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<ValidationError> =
        MediaTypeCodecRegistry.of(codespacesSetCodespacesAccessUsersResponseCodecAlternative4Codec)

    private val codespacesSetCodespacesAccessUsersResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-codespaces-access-users.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesSetCodespacesAccessUsersResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetCodespacesAccessUsersResponseCodecAlternative5Codec)

    public val codespacesSetCodespacesAccessUsersRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a> =
        MediaTypeCodecRegistry.of(codespacesSetCodespacesAccessUsersRequestCodec)

    public val codespacesSetCodespacesAccessUsersResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
        = MediaTypeCodecRegistry.of()
  }

  private object Partition1 {
    private val codespacesSetRepositoriesForSecretForAuthenticatedUserRequestCodec:
        MediaTypeCodec<InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESSETREPOSITORIESFORSECRETFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8.Serializer, SdkJson)

    private val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Codec)

    public val codespacesSetRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8> =
        MediaTypeCodecRegistry.of(codespacesSetRepositoriesForSecretForAuthenticatedUserRequestCodec)

    public val codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    private val codespacesSetSelectedReposForOrgSecretRequestCodec:
        MediaTypeCodec<InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID, InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6.Serializer, SdkJson)

    private val codespacesSetSelectedReposForOrgSecretResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/set-selected-repos-for-org-secret.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesSetSelectedReposForOrgSecretResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesSetSelectedReposForOrgSecretResponseCodecAlternative1Codec)

    public val codespacesSetSelectedReposForOrgSecretRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6> =
        MediaTypeCodecRegistry.of(codespacesSetSelectedReposForOrgSecretRequestCodec)

    public val codespacesSetSelectedReposForOrgSecretResponseCodecRegistry:
        MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

    private val codespacesStartForAuthenticatedUserResponseCodec: MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESSTARTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Codespace.Serializer, SdkJson)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative0", Codespace.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<ScimError> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative3", ScimError.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<ScimError> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative4Codec)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative5Codec)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative6Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative6", BasicError.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative6Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative6Codec)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative7Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative7", BasicError.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative7Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative7Codec)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative8Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative8", BasicError.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative8Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative8Codec)

    private val codespacesStartForAuthenticatedUserResponseCodecAlternative9Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/start-for-authenticated-user.response.alternative9", BasicError.Serializer, SdkJson)

    public val codespacesStartForAuthenticatedUserResponseCodecAlternative9Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodecAlternative9Codec)

    public val codespacesStartForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
        = MediaTypeCodecRegistry.of()

    public val codespacesStartForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesStartForAuthenticatedUserResponseCodec)

    private val codespacesStopForAuthenticatedUserResponseCodec: MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESSTOPFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Codespace.Serializer, SdkJson)

    private val codespacesStopForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/stop-for-authenticated-user.response.alternative0", Codespace.Serializer, SdkJson)

    public val codespacesStopForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesStopForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesStopForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/stop-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesStopForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStopForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesStopForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/stop-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesStopForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStopForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesStopForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/stop-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesStopForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStopForAuthenticatedUserResponseCodecAlternative3Codec)

    private val codespacesStopForAuthenticatedUserResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/stop-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesStopForAuthenticatedUserResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStopForAuthenticatedUserResponseCodecAlternative4Codec)

    public val codespacesStopForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
        = MediaTypeCodecRegistry.of()

    public val codespacesStopForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesStopForAuthenticatedUserResponseCodec)

    private val codespacesStopInOrganizationResponseCodec: MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESSTOPINORGANIZATION_RESPONSE_CODEC_ID, Codespace.Serializer, SdkJson)

    private val codespacesStopInOrganizationResponseCodecAlternative0Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/stop-in-organization.response.alternative0", Codespace.Serializer, SdkJson)

    public val codespacesStopInOrganizationResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesStopInOrganizationResponseCodecAlternative0Codec)

    private val codespacesStopInOrganizationResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/stop-in-organization.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesStopInOrganizationResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStopInOrganizationResponseCodecAlternative2Codec)

    private val codespacesStopInOrganizationResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/stop-in-organization.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesStopInOrganizationResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStopInOrganizationResponseCodecAlternative3Codec)

    private val codespacesStopInOrganizationResponseCodecAlternative4Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/stop-in-organization.response.alternative4", BasicError.Serializer, SdkJson)

    public val codespacesStopInOrganizationResponseCodecAlternative4Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStopInOrganizationResponseCodecAlternative4Codec)

    private val codespacesStopInOrganizationResponseCodecAlternative5Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/stop-in-organization.response.alternative5", BasicError.Serializer, SdkJson)

    public val codespacesStopInOrganizationResponseCodecAlternative5Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesStopInOrganizationResponseCodecAlternative5Codec)

    public val codespacesStopInOrganizationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
        MediaTypeCodecRegistry.of()

    public val codespacesStopInOrganizationResponseCodecRegistry: MediaTypeCodecRegistry<Codespace>
        = MediaTypeCodecRegistry.of(codespacesStopInOrganizationResponseCodec)

    private val codespacesUpdateForAuthenticatedUserRequestCodec:
        MediaTypeCodec<InlineUserCodespacesPatchRequestJsonXe8797cb4?> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESUPDATEFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserCodespacesPatchRequestJsonXe8797cb4.Serializer.nullable, SdkJson)

    private val codespacesUpdateForAuthenticatedUserResponseCodec: MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec(CodespacesCodecs.CODESPACESUPDATEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Codespace.Serializer, SdkJson)

    private val codespacesUpdateForAuthenticatedUserResponseCodecAlternative0Codec:
        MediaTypeCodec<Codespace> =
        KotlinxSerializationCodec("codespaces/update-for-authenticated-user.response.alternative0", Codespace.Serializer, SdkJson)

    public val codespacesUpdateForAuthenticatedUserResponseCodecAlternative0Registry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesUpdateForAuthenticatedUserResponseCodecAlternative0Codec)

    private val codespacesUpdateForAuthenticatedUserResponseCodecAlternative1Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/update-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

    public val codespacesUpdateForAuthenticatedUserResponseCodecAlternative1Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesUpdateForAuthenticatedUserResponseCodecAlternative1Codec)

    private val codespacesUpdateForAuthenticatedUserResponseCodecAlternative2Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/update-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

    public val codespacesUpdateForAuthenticatedUserResponseCodecAlternative2Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesUpdateForAuthenticatedUserResponseCodecAlternative2Codec)

    private val codespacesUpdateForAuthenticatedUserResponseCodecAlternative3Codec:
        MediaTypeCodec<BasicError> =
        KotlinxSerializationCodec("codespaces/update-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

    public val codespacesUpdateForAuthenticatedUserResponseCodecAlternative3Registry:
        MediaTypeCodecRegistry<BasicError> =
        MediaTypeCodecRegistry.of(codespacesUpdateForAuthenticatedUserResponseCodecAlternative3Codec)

    public val codespacesUpdateForAuthenticatedUserRequestCodecRegistry:
        MediaTypeCodecRegistry<InlineUserCodespacesPatchRequestJsonXe8797cb4?> =
        MediaTypeCodecRegistry.of(codespacesUpdateForAuthenticatedUserRequestCodec)

    public val codespacesUpdateForAuthenticatedUserResponseCodecRegistry:
        MediaTypeCodecRegistry<Codespace> =
        MediaTypeCodecRegistry.of(codespacesUpdateForAuthenticatedUserResponseCodec)
  }
}

/**
 * Client for the 'codespaces' group of GitHub v3 REST API.
 */
public class CodespacesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CodespacesClient.authentication)

  /**
   * Adds a repository to the selected repositories for a user's development environment secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesAddRepositoryForSecretForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CodespacesAddRepositoryForSecretForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesAddRepositoryForSecretForAuthenticatedUser(
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CodespacesAddRepositoryForSecretForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(codespacesAddRepositoryForSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesAddRepositoryForSecretForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesAddRepositoryForSecretForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http401Json -> CodespacesAddRepositoryForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http403Json -> CodespacesAddRepositoryForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http404Json -> CodespacesAddRepositoryForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http500Json -> CodespacesAddRepositoryForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a repository to the selected repositories for a user's development environment secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesAddRepositoryForSecretForAuthenticatedUserWithResponse(
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesAddRepositoryForSecretForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesAddRepositoryForSecretForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesAddRepositoryForSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesAddRepositoryForSecretForAuthenticatedUserRequestCodecRegistry, CodespacesAddRepositoryForSecretForAuthenticatedUserResponseDecoder, options)

  /**
   * Adds a repository to an organization development environment secret when the `visibility` for repository access is
   * set to `selected`. The visibility is set when you [Create or update an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret).
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesAddSelectedRepoToOrgSecretApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesAddSelectedRepoToOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesAddSelectedRepoToOrgSecret(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CodespacesAddSelectedRepoToOrgSecretResponse, Unit>(
    request = SdkExecutionRequest(codespacesAddSelectedRepoToOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesAddSelectedRepoToOrgSecretRequestCodecRegistry,
    responseDecoder = CodespacesAddSelectedRepoToOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesAddSelectedRepoToOrgSecretResponse.SuccessNoContent -> response.unit
        is CodespacesAddSelectedRepoToOrgSecretResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesAddSelectedRepoToOrgSecretResponse.Http409NoContent -> response.unit
        is CodespacesAddSelectedRepoToOrgSecretResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesAddSelectedRepoToOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesAddSelectedRepoToOrgSecretResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesAddSelectedRepoToOrgSecretResponse.Http404Json -> CodespacesAddSelectedRepoToOrgSecretApiException(response, statusCode, headers)
        is CodespacesAddSelectedRepoToOrgSecretResponse.Http409NoContent -> CodespacesAddSelectedRepoToOrgSecretApiException(response, statusCode, headers)
        is CodespacesAddSelectedRepoToOrgSecretResponse.Http422Json -> CodespacesAddSelectedRepoToOrgSecretApiException(response, statusCode, headers)
        is CodespacesAddSelectedRepoToOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a repository to an organization development environment secret when the `visibility` for repository access is
   * set to `selected`. The visibility is set when you [Create or update an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret).
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesAddSelectedRepoToOrgSecretWithResponse(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesAddSelectedRepoToOrgSecretResponse> = executor.executeWithResponse<Unit, CodespacesAddSelectedRepoToOrgSecretResponse>(SdkExecutionRequest(codespacesAddSelectedRepoToOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesAddSelectedRepoToOrgSecretRequestCodecRegistry, CodespacesAddSelectedRepoToOrgSecretResponseDecoder, options)

  /**
   * Checks whether the permissions defined by a given devcontainer configuration have been accepted by the
   * authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param devcontainerPath Path to the devcontainer.json configuration to use for the permission check.
   * @param ref The git reference that points to the location of the devcontainer configuration to use for the
   * permission check. The value of `ref` will typically be a branch name (`heads/BRANCH_NAME`). For more information,
   * see "[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesCheckPermissionsForDevcontainerApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesCheckPermissionsForDevcontainerError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesCheckPermissionsForDevcontainer(
    owner: String,
    repo: String,
    devcontainerPath: String,
    ref: String,
    options: CallOptions = CallOptions(),
  ): CodespacesPermissionsCheckForDevcontainer = executor.executeWithTypedErrors<Unit, CodespacesCheckPermissionsForDevcontainerResponse, CodespacesPermissionsCheckForDevcontainer>(
    request = SdkExecutionRequest(codespacesCheckPermissionsForDevcontainerMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "devcontainer_path", values = listOf(devcontainerPath.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = listOf(ref.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesCheckPermissionsForDevcontainerRequestCodecRegistry,
    responseDecoder = CodespacesCheckPermissionsForDevcontainerResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesCheckPermissionsForDevcontainerResponse.SuccessJson -> response.json
        is CodespacesCheckPermissionsForDevcontainerResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCheckPermissionsForDevcontainerResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCheckPermissionsForDevcontainerResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCheckPermissionsForDevcontainerResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCheckPermissionsForDevcontainerResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCheckPermissionsForDevcontainerResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesCheckPermissionsForDevcontainerResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesCheckPermissionsForDevcontainerResponse.Http401Json -> CodespacesCheckPermissionsForDevcontainerApiException(response, statusCode, headers)
        is CodespacesCheckPermissionsForDevcontainerResponse.Http403Json -> CodespacesCheckPermissionsForDevcontainerApiException(response, statusCode, headers)
        is CodespacesCheckPermissionsForDevcontainerResponse.Http404Json -> CodespacesCheckPermissionsForDevcontainerApiException(response, statusCode, headers)
        is CodespacesCheckPermissionsForDevcontainerResponse.Http422Json -> CodespacesCheckPermissionsForDevcontainerApiException(response, statusCode, headers)
        is CodespacesCheckPermissionsForDevcontainerResponse.Http503Json -> CodespacesCheckPermissionsForDevcontainerApiException(response, statusCode, headers)
        is CodespacesCheckPermissionsForDevcontainerResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Checks whether the permissions defined by a given devcontainer configuration have been accepted by the
   * authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param devcontainerPath Path to the devcontainer.json configuration to use for the permission check.
   * @param ref The git reference that points to the location of the devcontainer configuration to use for the
   * permission check. The value of `ref` will typically be a branch name (`heads/BRANCH_NAME`). For more information,
   * see "[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   * @param options Execution options.
   */
  public suspend fun codespacesCheckPermissionsForDevcontainerWithResponse(
    owner: String,
    repo: String,
    devcontainerPath: String,
    ref: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesCheckPermissionsForDevcontainerResponse> = executor.executeWithResponse<Unit, CodespacesCheckPermissionsForDevcontainerResponse>(SdkExecutionRequest(codespacesCheckPermissionsForDevcontainerMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "devcontainer_path", values = listOf(devcontainerPath.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = listOf(ref.toString())))
  }), CodespacesCodecs.codespacesCheckPermissionsForDevcontainerRequestCodecRegistry, CodespacesCheckPermissionsForDevcontainerResponseDecoder, options)

  /**
   * List the machine types a codespace can transition to use.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesCodespaceMachinesForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesCodespaceMachinesForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesCodespaceMachinesForAuthenticatedUser(codespaceName: String, options: CallOptions = CallOptions()): InlineUserCodespacesMachinesGetResponse200JsonXd25f7924 = executor.executeWithTypedErrors<Unit, CodespacesCodespaceMachinesForAuthenticatedUserResponse, InlineUserCodespacesMachinesGetResponse200JsonXd25f7924>(
    request = SdkExecutionRequest(codespacesCodespaceMachinesForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesCodespaceMachinesForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesCodespaceMachinesForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http304NoContent -> CodespacesCodespaceMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http401Json -> CodespacesCodespaceMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http403Json -> CodespacesCodespaceMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http404Json -> CodespacesCodespaceMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http500Json -> CodespacesCodespaceMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCodespaceMachinesForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the machine types a codespace can transition to use.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   */
  public suspend fun codespacesCodespaceMachinesForAuthenticatedUserWithResponse(codespaceName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesCodespaceMachinesForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesCodespaceMachinesForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesCodespaceMachinesForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
  }), CodespacesCodecs.codespacesCodespaceMachinesForAuthenticatedUserRequestCodecRegistry, CodespacesCodespaceMachinesForAuthenticatedUserResponseDecoder, options)

  /**
   * Creates a new codespace, owned by the authenticated user.
   *
   * This endpoint requires either a `repository_id` OR a `pull_request` but not both.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesCreateForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesCreateForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesCreateForAuthenticatedUser(request: InlineUserCodespacesPostRequestJsonX99d5b743, options: CallOptions = CallOptions()): Codespace = executor.executeWithTypedErrors<InlineUserCodespacesPostRequestJsonX99d5b743, CodespacesCreateForAuthenticatedUserResponse, Codespace>(
    request = SdkExecutionRequest(codespacesCreateForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = CodespacesCodecs.codespacesCreateForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesCreateForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesCreateForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesCreateForAuthenticatedUserResponse.SuccessJson2 -> response.json
        is CodespacesCreateForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateForAuthenticatedUserResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesCreateForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesCreateForAuthenticatedUserResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is CodespacesCreateForAuthenticatedUserResponse.Http401Json -> CodespacesCreateForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateForAuthenticatedUserResponse.Http403Json -> CodespacesCreateForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateForAuthenticatedUserResponse.Http404Json -> CodespacesCreateForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateForAuthenticatedUserResponse.Http503Json -> CodespacesCreateForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new codespace, owned by the authenticated user.
   *
   * This endpoint requires either a `repository_id` OR a `pull_request` but not both.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun codespacesCreateForAuthenticatedUserWithResponse(request: InlineUserCodespacesPostRequestJsonX99d5b743, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesCreateForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserCodespacesPostRequestJsonX99d5b743, CodespacesCreateForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesCreateForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), CodespacesCodecs.codespacesCreateForAuthenticatedUserRequestCodecRegistry, CodespacesCreateForAuthenticatedUserResponseDecoder, options)

  /**
   * Creates or updates an organization development environment secret with an encrypted value. Encrypt your secret
   * using
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
  public suspend fun codespacesCreateOrUpdateOrgSecretWithResponse(
    request: InlineOrgsCodespacesSecretsPutRequestJsonXa2407939,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesCreateOrUpdateOrgSecretResponse> = executor.executeWithResponse<InlineOrgsCodespacesSecretsPutRequestJsonXa2407939, CodespacesCreateOrUpdateOrgSecretResponse>(SdkExecutionRequest(codespacesCreateOrUpdateOrgSecretMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEORUPDATEORGSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesCreateOrUpdateOrgSecretRequestCodecRegistry, CodespacesCreateOrUpdateOrgSecretResponseDecoder, options)

  /**
   * Creates or updates a repository development environment secret with an encrypted value. Encrypt your secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint. The associated
   * user must be a repository admin.
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
  public suspend fun codespacesCreateOrUpdateRepoSecretWithResponse(
    request: InlineReposCodespacesSecretsPutRequestJsonX8d6bc2f8,
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesCreateOrUpdateRepoSecretResponse> = executor.executeWithResponse<InlineReposCodespacesSecretsPutRequestJsonX8d6bc2f8, CodespacesCreateOrUpdateRepoSecretResponse>(SdkExecutionRequest(codespacesCreateOrUpdateRepoSecretMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEORUPDATEREPOSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesCreateOrUpdateRepoSecretRequestCodecRegistry, CodespacesCreateOrUpdateRepoSecretResponseDecoder, options)

  /**
   * Creates or updates a development environment secret for a user's codespace with an encrypted value. Encrypt your
   * secret using
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). For more information, see "[Encrypting
   * secrets for the REST API](https://docs.github.com/rest/guides/encrypting-secrets-for-the-rest-api)."
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesCreateOrUpdateSecretForAuthenticatedUserWithResponse(
    request: InlineUserCodespacesSecretsPutRequestJsonXab54ecef,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserCodespacesSecretsPutRequestJsonXab54ecef, CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesCreateOrUpdateSecretForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEORUPDATESECRETFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesCreateOrUpdateSecretForAuthenticatedUserRequestCodecRegistry, CodespacesCreateOrUpdateSecretForAuthenticatedUserResponseDecoder, options)

  /**
   * Creates a codespace owned by the authenticated user for the specified pull request.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesCreateWithPrForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesCreateWithPrForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesCreateWithPrForAuthenticatedUser(
    request: InlineReposPullsCodespacesPostRequestJsonX2fa703f3?,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Codespace = executor.executeWithTypedErrors<InlineReposPullsCodespacesPostRequestJsonX2fa703f3?, CodespacesCreateWithPrForAuthenticatedUserResponse, Codespace>(
    request = SdkExecutionRequest(codespacesCreateWithPrForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEWITHPRFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesCreateWithPrForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesCreateWithPrForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesCreateWithPrForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesCreateWithPrForAuthenticatedUserResponse.SuccessJson2 -> response.json
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesCreateWithPrForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesCreateWithPrForAuthenticatedUserResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Http401Json -> CodespacesCreateWithPrForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Http403Json -> CodespacesCreateWithPrForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Http404Json -> CodespacesCreateWithPrForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Http503Json -> CodespacesCreateWithPrForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithPrForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a codespace owned by the authenticated user for the specified pull request.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param pullNumber The number that identifies the pull request.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codespacesCreateWithPrForAuthenticatedUserWithResponse(
    request: InlineReposPullsCodespacesPostRequestJsonX2fa703f3?,
    owner: String,
    pullNumber: Int,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesCreateWithPrForAuthenticatedUserResponse> = executor.executeWithResponse<InlineReposPullsCodespacesPostRequestJsonX2fa703f3?, CodespacesCreateWithPrForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesCreateWithPrForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEWITHPRFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "pull_number", values = listOf(pullNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodespacesCodecs.codespacesCreateWithPrForAuthenticatedUserRequestCodecRegistry, CodespacesCreateWithPrForAuthenticatedUserResponseDecoder, options)

  /**
   * Creates a codespace owned by the authenticated user in the specified repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesCreateWithRepoForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesCreateWithRepoForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesCreateWithRepoForAuthenticatedUser(
    request: InlineReposCodespacesPostRequestJsonXe45a0eb1?,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Codespace = executor.executeWithTypedErrors<InlineReposCodespacesPostRequestJsonXe45a0eb1?, CodespacesCreateWithRepoForAuthenticatedUserResponse, Codespace>(
    request = SdkExecutionRequest(codespacesCreateWithRepoForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEWITHREPOFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesCreateWithRepoForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.SuccessJson2 -> response.json
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http400Json -> CodespacesCreateWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http400ScimJson -> CodespacesCreateWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http401Json -> CodespacesCreateWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http403Json -> CodespacesCreateWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http404Json -> CodespacesCreateWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Http503Json -> CodespacesCreateWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesCreateWithRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a codespace owned by the authenticated user in the specified repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codespacesCreateWithRepoForAuthenticatedUserWithResponse(
    request: InlineReposCodespacesPostRequestJsonXe45a0eb1?,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesCreateWithRepoForAuthenticatedUserResponse> = executor.executeWithResponse<InlineReposCodespacesPostRequestJsonXe45a0eb1?, CodespacesCreateWithRepoForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesCreateWithRepoForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESCREATEWITHREPOFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserRequestCodecRegistry, CodespacesCreateWithRepoForAuthenticatedUserResponseDecoder, options)

  /**
   * Codespaces for the specified users will no longer be billed to the organization.
   *
   * To use this endpoint, the access settings for the organization must be set to `selected_members`.
   * For information on how to change this setting, see "[Manage access control for organization
   * codespaces](https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces
   * )."
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesDeleteCodespacesAccessUsersApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesDeleteCodespacesAccessUsersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesDeleteCodespacesAccessUsers(
    request: InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402, CodespacesDeleteCodespacesAccessUsersResponse, Unit>(
    request = SdkExecutionRequest(codespacesDeleteCodespacesAccessUsersMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESDELETECODESPACESACCESSUSERS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesDeleteCodespacesAccessUsersRequestCodecRegistry,
    responseDecoder = CodespacesDeleteCodespacesAccessUsersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesDeleteCodespacesAccessUsersResponse.SuccessNoContent -> response.unit
        is CodespacesDeleteCodespacesAccessUsersResponse.Http304NoContent -> response.unit
        is CodespacesDeleteCodespacesAccessUsersResponse.Http400NoContent -> response.unit
        is CodespacesDeleteCodespacesAccessUsersResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteCodespacesAccessUsersResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteCodespacesAccessUsersResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteCodespacesAccessUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesDeleteCodespacesAccessUsersResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesDeleteCodespacesAccessUsersResponse.Http304NoContent -> CodespacesDeleteCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesDeleteCodespacesAccessUsersResponse.Http400NoContent -> CodespacesDeleteCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesDeleteCodespacesAccessUsersResponse.Http404Json -> CodespacesDeleteCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesDeleteCodespacesAccessUsersResponse.Http422Json -> CodespacesDeleteCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesDeleteCodespacesAccessUsersResponse.Http500Json -> CodespacesDeleteCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesDeleteCodespacesAccessUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Codespaces for the specified users will no longer be billed to the organization.
   *
   * To use this endpoint, the access settings for the organization must be set to `selected_members`.
   * For information on how to change this setting, see "[Manage access control for organization
   * codespaces](https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces
   * )."
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codespacesDeleteCodespacesAccessUsersWithResponse(
    request: InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesDeleteCodespacesAccessUsersResponse> = executor.executeWithResponse<InlineOrgsCodespacesAccessSelectedUsersDeleteRequestJsonXd93d7402, CodespacesDeleteCodespacesAccessUsersResponse>(SdkExecutionRequest(codespacesDeleteCodespacesAccessUsersMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESDELETECODESPACESACCESSUSERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodespacesCodecs.codespacesDeleteCodespacesAccessUsersRequestCodecRegistry, CodespacesDeleteCodespacesAccessUsersResponseDecoder, options)

  /**
   * Deletes a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesDeleteForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesDeleteForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesDeleteForAuthenticatedUser(codespaceName: String, options: CallOptions = CallOptions()): JsonObject = executor.executeWithTypedErrors<Unit, CodespacesDeleteForAuthenticatedUserResponse, JsonObject>(
    request = SdkExecutionRequest(codespacesDeleteForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesDeleteForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesDeleteForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesDeleteForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesDeleteForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesDeleteForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesDeleteForAuthenticatedUserResponse.Http304NoContent -> CodespacesDeleteForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesDeleteForAuthenticatedUserResponse.Http401Json -> CodespacesDeleteForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesDeleteForAuthenticatedUserResponse.Http403Json -> CodespacesDeleteForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesDeleteForAuthenticatedUserResponse.Http404Json -> CodespacesDeleteForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesDeleteForAuthenticatedUserResponse.Http500Json -> CodespacesDeleteForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesDeleteForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   */
  public suspend fun codespacesDeleteForAuthenticatedUserWithResponse(codespaceName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesDeleteForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesDeleteForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesDeleteForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
  }), CodespacesCodecs.codespacesDeleteForAuthenticatedUserRequestCodecRegistry, CodespacesDeleteForAuthenticatedUserResponseDecoder, options)

  /**
   * Deletes a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param org The organization name. The name is not case sensitive.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesDeleteFromOrganizationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodespacesDeleteFromOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesDeleteFromOrganization(
    codespaceName: String,
    org: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): JsonObject = executor.executeWithTypedErrors<Unit, CodespacesDeleteFromOrganizationResponse, JsonObject>(
    request = SdkExecutionRequest(codespacesDeleteFromOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesDeleteFromOrganizationRequestCodecRegistry,
    responseDecoder = CodespacesDeleteFromOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesDeleteFromOrganizationResponse.SuccessJson -> response.json
        is CodespacesDeleteFromOrganizationResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteFromOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteFromOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteFromOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteFromOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteFromOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesDeleteFromOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesDeleteFromOrganizationResponse.Http304NoContent -> CodespacesDeleteFromOrganizationApiException(response, statusCode, headers)
        is CodespacesDeleteFromOrganizationResponse.Http401Json -> CodespacesDeleteFromOrganizationApiException(response, statusCode, headers)
        is CodespacesDeleteFromOrganizationResponse.Http403Json -> CodespacesDeleteFromOrganizationApiException(response, statusCode, headers)
        is CodespacesDeleteFromOrganizationResponse.Http404Json -> CodespacesDeleteFromOrganizationApiException(response, statusCode, headers)
        is CodespacesDeleteFromOrganizationResponse.Http500Json -> CodespacesDeleteFromOrganizationApiException(response, statusCode, headers)
        is CodespacesDeleteFromOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param org The organization name. The name is not case sensitive.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun codespacesDeleteFromOrganizationWithResponse(
    codespaceName: String,
    org: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesDeleteFromOrganizationResponse> = executor.executeWithResponse<Unit, CodespacesDeleteFromOrganizationResponse>(SdkExecutionRequest(codespacesDeleteFromOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CodespacesCodecs.codespacesDeleteFromOrganizationRequestCodecRegistry, CodespacesDeleteFromOrganizationResponseDecoder, options)

  /**
   * Deletes an organization development environment secret using the secret name.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesDeleteOrgSecretApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CodespacesDeleteOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesDeleteOrgSecret(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CodespacesDeleteOrgSecretResponse, Unit>(
    request = SdkExecutionRequest(codespacesDeleteOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesDeleteOrgSecretRequestCodecRegistry,
    responseDecoder = CodespacesDeleteOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesDeleteOrgSecretResponse.SuccessNoContent -> response.unit
        is CodespacesDeleteOrgSecretResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesDeleteOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesDeleteOrgSecretResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesDeleteOrgSecretResponse.Http404Json -> CodespacesDeleteOrgSecretApiException(response, statusCode, headers)
        is CodespacesDeleteOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes an organization development environment secret using the secret name.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesDeleteOrgSecretWithResponse(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesDeleteOrgSecretResponse> = executor.executeWithResponse<Unit, CodespacesDeleteOrgSecretResponse>(SdkExecutionRequest(codespacesDeleteOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesDeleteOrgSecretRequestCodecRegistry, CodespacesDeleteOrgSecretResponseDecoder, options)

  /**
   * Deletes a development environment secret in a repository using the secret name.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint. The associated
   * user must be a repository admin.
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
  public suspend fun codespacesDeleteRepoSecret(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(codespacesDeleteRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesDeleteRepoSecretRequestCodecRegistry, options)

  /**
   * Deletes a development environment secret in a repository using the secret name.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint. The associated
   * user must be a repository admin.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesDeleteRepoSecretWithResponse(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesDeleteRepoSecretResponse> = executor.executeWithResponse<Unit, CodespacesDeleteRepoSecretResponse>(SdkExecutionRequest(codespacesDeleteRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesDeleteRepoSecretRequestCodecRegistry, CodespacesDeleteRepoSecretResponseDecoder, options)

  /**
   * Deletes a development environment secret from a user's codespaces using the secret name. Deleting the secret will
   * remove access from all codespaces that were allowed to access the secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesDeleteSecretForAuthenticatedUser(secretName: String, options: CallOptions = CallOptions()): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(codespacesDeleteSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesDeleteSecretForAuthenticatedUserRequestCodecRegistry, options)

  /**
   * Deletes a development environment secret from a user's codespaces using the secret name. Deleting the secret will
   * remove access from all codespaces that were allowed to access the secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesDeleteSecretForAuthenticatedUserWithResponse(secretName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesDeleteSecretForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesDeleteSecretForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesDeleteSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesDeleteSecretForAuthenticatedUserRequestCodecRegistry, CodespacesDeleteSecretForAuthenticatedUserResponseDecoder, options)

  /**
   * Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be
   * monitored.
   *
   * If changes cannot be pushed to the codespace's repository, they will be pushed to a new or previously-existing fork
   * instead.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesExportForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesExportForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesExportForAuthenticatedUser(codespaceName: String, options: CallOptions = CallOptions()): CodespaceExportDetails = executor.executeWithTypedErrors<Unit, CodespacesExportForAuthenticatedUserResponse, CodespaceExportDetails>(
    request = SdkExecutionRequest(codespacesExportForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesExportForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesExportForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesExportForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesExportForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesExportForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesExportForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesExportForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesExportForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesExportForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesExportForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesExportForAuthenticatedUserResponse.Http401Json -> CodespacesExportForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesExportForAuthenticatedUserResponse.Http403Json -> CodespacesExportForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesExportForAuthenticatedUserResponse.Http404Json -> CodespacesExportForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesExportForAuthenticatedUserResponse.Http422Json -> CodespacesExportForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesExportForAuthenticatedUserResponse.Http500Json -> CodespacesExportForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesExportForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be
   * monitored.
   *
   * If changes cannot be pushed to the codespace's repository, they will be pushed to a new or previously-existing fork
   * instead.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   */
  public suspend fun codespacesExportForAuthenticatedUserWithResponse(codespaceName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesExportForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesExportForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesExportForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
  }), CodespacesCodecs.codespacesExportForAuthenticatedUserRequestCodecRegistry, CodespacesExportForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the codespaces that a member of an organization has for repositories in that organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param username The handle for the GitHub user account.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesGetCodespacesForUserInOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesGetCodespacesForUserInOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesGetCodespacesForUserInOrg(
    org: String,
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b = executor.executeWithTypedErrors<Unit, CodespacesGetCodespacesForUserInOrgResponse, InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b>(
    request = SdkExecutionRequest(codespacesGetCodespacesForUserInOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodespacesCodecs.codespacesGetCodespacesForUserInOrgRequestCodecRegistry,
    responseDecoder = CodespacesGetCodespacesForUserInOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesGetCodespacesForUserInOrgResponse.SuccessJson -> response.json
        is CodespacesGetCodespacesForUserInOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetCodespacesForUserInOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetCodespacesForUserInOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetCodespacesForUserInOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetCodespacesForUserInOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetCodespacesForUserInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesGetCodespacesForUserInOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesGetCodespacesForUserInOrgResponse.Http304NoContent -> CodespacesGetCodespacesForUserInOrgApiException(response, statusCode, headers)
        is CodespacesGetCodespacesForUserInOrgResponse.Http401Json -> CodespacesGetCodespacesForUserInOrgApiException(response, statusCode, headers)
        is CodespacesGetCodespacesForUserInOrgResponse.Http403Json -> CodespacesGetCodespacesForUserInOrgApiException(response, statusCode, headers)
        is CodespacesGetCodespacesForUserInOrgResponse.Http404Json -> CodespacesGetCodespacesForUserInOrgApiException(response, statusCode, headers)
        is CodespacesGetCodespacesForUserInOrgResponse.Http500Json -> CodespacesGetCodespacesForUserInOrgApiException(response, statusCode, headers)
        is CodespacesGetCodespacesForUserInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the codespaces that a member of an organization has for repositories in that organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param username The handle for the GitHub user account.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun codespacesGetCodespacesForUserInOrgWithResponse(
    org: String,
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesGetCodespacesForUserInOrgResponse> = executor.executeWithResponse<Unit, CodespacesGetCodespacesForUserInOrgResponse>(SdkExecutionRequest(codespacesGetCodespacesForUserInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesGetCodespacesForUserInOrgRequestCodecRegistry, CodespacesGetCodespacesForUserInOrgResponseDecoder, options)

  /**
   * Gets information about an export of a codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param exportId The ID of the export operation, or `latest`. Currently only `latest` is currently supported.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesGetExportDetailsForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesGetExportDetailsForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesGetExportDetailsForAuthenticatedUser(
    codespaceName: String,
    exportId: String,
    options: CallOptions = CallOptions(),
  ): CodespaceExportDetails = executor.executeWithTypedErrors<Unit, CodespacesGetExportDetailsForAuthenticatedUserResponse, CodespaceExportDetails>(
    request = SdkExecutionRequest(codespacesGetExportDetailsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "export_id", values = listOf(exportId.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesGetExportDetailsForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesGetExportDetailsForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesGetExportDetailsForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesGetExportDetailsForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetExportDetailsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesGetExportDetailsForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesGetExportDetailsForAuthenticatedUserResponse.Http404Json -> CodespacesGetExportDetailsForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesGetExportDetailsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets information about an export of a codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param exportId The ID of the export operation, or `latest`. Currently only `latest` is currently supported.
   * @param options Execution options.
   */
  public suspend fun codespacesGetExportDetailsForAuthenticatedUserWithResponse(
    codespaceName: String,
    exportId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesGetExportDetailsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesGetExportDetailsForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesGetExportDetailsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "export_id", values = listOf(exportId.toString())))
  }), CodespacesCodecs.codespacesGetExportDetailsForAuthenticatedUserRequestCodecRegistry, CodespacesGetExportDetailsForAuthenticatedUserResponseDecoder, options)

  /**
   * Gets information about a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesGetForAuthenticatedUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodespacesGetForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesGetForAuthenticatedUser(codespaceName: String, options: CallOptions = CallOptions()): Codespace = executor.executeWithTypedErrors<Unit, CodespacesGetForAuthenticatedUserResponse, Codespace>(
    request = SdkExecutionRequest(codespacesGetForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesGetForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesGetForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesGetForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesGetForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesGetForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesGetForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesGetForAuthenticatedUserResponse.Http304NoContent -> CodespacesGetForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesGetForAuthenticatedUserResponse.Http401Json -> CodespacesGetForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesGetForAuthenticatedUserResponse.Http403Json -> CodespacesGetForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesGetForAuthenticatedUserResponse.Http404Json -> CodespacesGetForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesGetForAuthenticatedUserResponse.Http500Json -> CodespacesGetForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesGetForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets information about a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   */
  public suspend fun codespacesGetForAuthenticatedUserWithResponse(codespaceName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesGetForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesGetForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesGetForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
  }), CodespacesCodecs.codespacesGetForAuthenticatedUserRequestCodecRegistry, CodespacesGetForAuthenticatedUserResponseDecoder, options)

  /**
   * Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value
   * of a secret before you can create or update secrets.
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesGetOrgPublicKey(org: String, options: CallOptions = CallOptions()): CodespacesPublicKey = executor.execute<Unit, CodespacesPublicKey>(SdkExecutionRequest(codespacesGetOrgPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(CodespacesCodecs.CODESPACESGETORGPUBLICKEY_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesGetOrgPublicKeyRequestCodecRegistry, CodespacesCodecs.codespacesGetOrgPublicKeyResponseCodecRegistry, options)

  /**
   * Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value
   * of a secret before you can create or update secrets.
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codespacesGetOrgPublicKeyWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesGetOrgPublicKeyResponse> = executor.executeWithResponse<Unit, CodespacesGetOrgPublicKeyResponse>(SdkExecutionRequest(codespacesGetOrgPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodespacesCodecs.codespacesGetOrgPublicKeyRequestCodecRegistry, CodespacesGetOrgPublicKeyResponseDecoder, options)

  /**
   * Gets an organization development environment secret without revealing its encrypted value.
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
  public suspend fun codespacesGetOrgSecret(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): CodespacesOrgSecret = executor.execute<Unit, CodespacesOrgSecret>(SdkExecutionRequest(codespacesGetOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), listOf(CodespacesCodecs.CODESPACESGETORGSECRET_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesGetOrgSecretRequestCodecRegistry, CodespacesCodecs.codespacesGetOrgSecretResponseCodecRegistry, options)

  /**
   * Gets an organization development environment secret without revealing its encrypted value.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesGetOrgSecretWithResponse(
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesGetOrgSecretResponse> = executor.executeWithResponse<Unit, CodespacesGetOrgSecretResponse>(SdkExecutionRequest(codespacesGetOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesGetOrgSecretRequestCodecRegistry, CodespacesGetOrgSecretResponseDecoder, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or
   * update secrets.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesGetPublicKeyForAuthenticatedUser(options: CallOptions = CallOptions()): CodespacesUserPublicKey = executor.execute<Unit, CodespacesUserPublicKey>(SdkExecutionRequest(codespacesGetPublicKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), emptyList()), listOf(CodespacesCodecs.CODESPACESGETPUBLICKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesGetPublicKeyForAuthenticatedUserRequestCodecRegistry, CodespacesCodecs.codespacesGetPublicKeyForAuthenticatedUserResponseCodecRegistry, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or
   * update secrets.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun codespacesGetPublicKeyForAuthenticatedUserWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<CodespacesGetPublicKeyForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesGetPublicKeyForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesGetPublicKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), emptyList()), CodespacesCodecs.codespacesGetPublicKeyForAuthenticatedUserRequestCodecRegistry, CodespacesGetPublicKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets.
   *
   * If the repository is private, OAuth app tokens and personal access tokens (classic) need the `repo` scope to use
   * this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesGetRepoPublicKey(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): CodespacesPublicKey = executor.execute<Unit, CodespacesPublicKey>(SdkExecutionRequest(codespacesGetRepoPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(CodespacesCodecs.CODESPACESGETREPOPUBLICKEY_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesGetRepoPublicKeyRequestCodecRegistry, CodespacesCodecs.codespacesGetRepoPublicKeyResponseCodecRegistry, options)

  /**
   * Gets your public key, which you need to encrypt secrets. You need to
   * encrypt a secret before you can create or update secrets.
   *
   * If the repository is private, OAuth app tokens and personal access tokens (classic) need the `repo` scope to use
   * this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codespacesGetRepoPublicKeyWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesGetRepoPublicKeyResponse> = executor.executeWithResponse<Unit, CodespacesGetRepoPublicKeyResponse>(SdkExecutionRequest(codespacesGetRepoPublicKeyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CodespacesCodecs.codespacesGetRepoPublicKeyRequestCodecRegistry, CodespacesGetRepoPublicKeyResponseDecoder, options)

  /**
   * Gets a single repository development environment secret without revealing its encrypted value.
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
  public suspend fun codespacesGetRepoSecret(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): RepoCodespacesSecret = executor.execute<Unit, RepoCodespacesSecret>(SdkExecutionRequest(codespacesGetRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), listOf(CodespacesCodecs.CODESPACESGETREPOSECRET_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesGetRepoSecretRequestCodecRegistry, CodespacesCodecs.codespacesGetRepoSecretResponseCodecRegistry, options)

  /**
   * Gets a single repository development environment secret without revealing its encrypted value.
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
  public suspend fun codespacesGetRepoSecretWithResponse(
    owner: String,
    repo: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesGetRepoSecretResponse> = executor.executeWithResponse<Unit, CodespacesGetRepoSecretResponse>(SdkExecutionRequest(codespacesGetRepoSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesGetRepoSecretRequestCodecRegistry, CodespacesGetRepoSecretResponseDecoder, options)

  /**
   * Gets a development environment secret available to a user's codespaces without revealing its encrypted value.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesGetSecretForAuthenticatedUser(secretName: String, options: CallOptions = CallOptions()): CodespacesSecret = executor.execute<Unit, CodespacesSecret>(SdkExecutionRequest(codespacesGetSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), listOf(CodespacesCodecs.CODESPACESGETSECRETFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesGetSecretForAuthenticatedUserRequestCodecRegistry, CodespacesCodecs.codespacesGetSecretForAuthenticatedUserResponseCodecRegistry, options)

  /**
   * Gets a development environment secret available to a user's codespaces without revealing its encrypted value.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesGetSecretForAuthenticatedUserWithResponse(secretName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesGetSecretForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesGetSecretForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesGetSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesGetSecretForAuthenticatedUserRequestCodecRegistry, CodespacesGetSecretForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the devcontainer.json files associated with a specified repository and the authenticated user. These files
   * specify launchpoint configurations for codespaces created within the repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesListDevcontainersInRepositoryForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CodespacesListDevcontainersInRepositoryForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesListDevcontainersInRepositoryForAuthenticatedUser(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6 = executor.executeWithTypedErrors<Unit, CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse, InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6>(
    request = SdkExecutionRequest(codespacesListDevcontainersInRepositoryForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http400Json -> CodespacesListDevcontainersInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http400ScimJson -> CodespacesListDevcontainersInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http401Json -> CodespacesListDevcontainersInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http403Json -> CodespacesListDevcontainersInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http404Json -> CodespacesListDevcontainersInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http500Json -> CodespacesListDevcontainersInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the devcontainer.json files associated with a specified repository and the authenticated user. These files
   * specify launchpoint configurations for codespaces created within the repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
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
  public suspend fun codespacesListDevcontainersInRepositoryForAuthenticatedUserWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesListDevcontainersInRepositoryForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserRequestCodecRegistry, CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the authenticated user's codespaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param repositoryId ID of the Repository to filter on
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesListForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesListForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesListForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    repositoryId: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineUserCodespacesGetResponse200JsonX10571de7 = executor.executeWithTypedErrors<Unit, CodespacesListForAuthenticatedUserResponse, InlineUserCodespacesGetResponse200JsonX10571de7>(
    request = SdkExecutionRequest(codespacesListForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "repository_id", values = repositoryId?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodespacesCodecs.codespacesListForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesListForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesListForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesListForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesListForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesListForAuthenticatedUserResponse.Http304NoContent -> CodespacesListForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListForAuthenticatedUserResponse.Http401Json -> CodespacesListForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListForAuthenticatedUserResponse.Http403Json -> CodespacesListForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListForAuthenticatedUserResponse.Http404Json -> CodespacesListForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListForAuthenticatedUserResponse.Http500Json -> CodespacesListForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the authenticated user's codespaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param repositoryId ID of the Repository to filter on
   * @param options Execution options.
   */
  public suspend fun codespacesListForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    repositoryId: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesListForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesListForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesListForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "repository_id", values = repositoryId?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesListForAuthenticatedUserRequestCodecRegistry, CodespacesListForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the codespaces associated to a specified organization.
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
   * @throws CodespacesListInOrganizationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodespacesListInOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesListInOrganization(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCodespacesGetResponse200JsonX93e6311d = executor.executeWithTypedErrors<Unit, CodespacesListInOrganizationResponse, InlineOrgsCodespacesGetResponse200JsonX93e6311d>(
    request = SdkExecutionRequest(codespacesListInOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodespacesCodecs.codespacesListInOrganizationRequestCodecRegistry,
    responseDecoder = CodespacesListInOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesListInOrganizationResponse.SuccessJson -> response.json
        is CodespacesListInOrganizationResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesListInOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesListInOrganizationResponse.Http304NoContent -> CodespacesListInOrganizationApiException(response, statusCode, headers)
        is CodespacesListInOrganizationResponse.Http401Json -> CodespacesListInOrganizationApiException(response, statusCode, headers)
        is CodespacesListInOrganizationResponse.Http403Json -> CodespacesListInOrganizationApiException(response, statusCode, headers)
        is CodespacesListInOrganizationResponse.Http404Json -> CodespacesListInOrganizationApiException(response, statusCode, headers)
        is CodespacesListInOrganizationResponse.Http500Json -> CodespacesListInOrganizationApiException(response, statusCode, headers)
        is CodespacesListInOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the codespaces associated to a specified organization.
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
  public suspend fun codespacesListInOrganizationWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesListInOrganizationResponse> = executor.executeWithResponse<Unit, CodespacesListInOrganizationResponse>(SdkExecutionRequest(codespacesListInOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesListInOrganizationRequestCodecRegistry, CodespacesListInOrganizationResponseDecoder, options)

  /**
   * Lists the codespaces associated to a specified repository and the authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesListInRepositoryForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesListInRepositoryForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesListInRepositoryForAuthenticatedUser(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposCodespacesGetResponse200JsonX2f5d5815 = executor.executeWithTypedErrors<Unit, CodespacesListInRepositoryForAuthenticatedUserResponse, InlineReposCodespacesGetResponse200JsonX2f5d5815>(
    request = SdkExecutionRequest(codespacesListInRepositoryForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodespacesCodecs.codespacesListInRepositoryForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesListInRepositoryForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesListInRepositoryForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesListInRepositoryForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Http401Json -> CodespacesListInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Http403Json -> CodespacesListInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Http404Json -> CodespacesListInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Http500Json -> CodespacesListInRepositoryForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListInRepositoryForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the codespaces associated to a specified repository and the authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
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
  public suspend fun codespacesListInRepositoryForAuthenticatedUserWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesListInRepositoryForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesListInRepositoryForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesListInRepositoryForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesListInRepositoryForAuthenticatedUserRequestCodecRegistry, CodespacesListInRepositoryForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all Codespaces development environment secrets available at the organization-level without revealing their
   * encrypted
   * values.
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
  public suspend fun codespacesListOrgSecrets(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae = executor.execute<Unit, InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae>(SdkExecutionRequest(codespacesListOrgSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(CodespacesCodecs.CODESPACESLISTORGSECRETS_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesListOrgSecretsRequestCodecRegistry, CodespacesCodecs.codespacesListOrgSecretsResponseCodecRegistry, options)

  /**
   * Lists all Codespaces development environment secrets available at the organization-level without revealing their
   * encrypted
   * values.
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
  public suspend fun codespacesListOrgSecretsWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesListOrgSecretsResponse> = executor.executeWithResponse<Unit, CodespacesListOrgSecretsResponse>(SdkExecutionRequest(codespacesListOrgSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesListOrgSecretsRequestCodecRegistry, CodespacesListOrgSecretsResponseDecoder, options)

  /**
   * Lists all development environment secrets available in a repository without revealing their encrypted
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
  public suspend fun codespacesListRepoSecrets(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5 = executor.execute<Unit, InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5>(SdkExecutionRequest(codespacesListRepoSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(CodespacesCodecs.CODESPACESLISTREPOSECRETS_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesListRepoSecretsRequestCodecRegistry, CodespacesCodecs.codespacesListRepoSecretsResponseCodecRegistry, options)

  /**
   * Lists all development environment secrets available in a repository without revealing their encrypted
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
  public suspend fun codespacesListRepoSecretsWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesListRepoSecretsResponse> = executor.executeWithResponse<Unit, CodespacesListRepoSecretsResponse>(SdkExecutionRequest(codespacesListRepoSecretsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesListRepoSecretsRequestCodecRegistry, CodespacesListRepoSecretsResponseDecoder, options)

  /**
   * List the repositories that have been granted the ability to use a user's development environment secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesListRepositoriesForSecretForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CodespacesListRepositoriesForSecretForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesListRepositoriesForSecretForAuthenticatedUser(secretName: String, options: CallOptions = CallOptions()): InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee = executor.executeWithTypedErrors<Unit, CodespacesListRepositoriesForSecretForAuthenticatedUserResponse, InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee>(
    request = SdkExecutionRequest(codespacesListRepositoriesForSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesListRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesListRepositoriesForSecretForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http401Json -> CodespacesListRepositoriesForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http403Json -> CodespacesListRepositoriesForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http404Json -> CodespacesListRepositoriesForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http500Json -> CodespacesListRepositoriesForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the repositories that have been granted the ability to use a user's development environment secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesListRepositoriesForSecretForAuthenticatedUserWithResponse(secretName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesListRepositoriesForSecretForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesListRepositoriesForSecretForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesListRepositoriesForSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesListRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry, CodespacesListRepositoriesForSecretForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all development environment secrets available for a user's codespaces without revealing their
   * encrypted values.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
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
  public suspend fun codespacesListSecretsForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineUserCodespacesSecretsGetResponse200JsonXaa96d197 = executor.execute<Unit, InlineUserCodespacesSecretsGetResponse200JsonXaa96d197>(SdkExecutionRequest(codespacesListSecretsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(CodespacesCodecs.CODESPACESLISTSECRETSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID), CodespacesCodecs.codespacesListSecretsForAuthenticatedUserRequestCodecRegistry, CodespacesCodecs.codespacesListSecretsForAuthenticatedUserResponseCodecRegistry, options)

  /**
   * Lists all development environment secrets available for a user's codespaces without revealing their
   * encrypted values.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun codespacesListSecretsForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesListSecretsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesListSecretsForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesListSecretsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesListSecretsForAuthenticatedUserRequestCodecRegistry, CodespacesListSecretsForAuthenticatedUserResponseDecoder, options)

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
   * @throws CodespacesListSelectedReposForOrgSecretApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesListSelectedReposForOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesListSelectedReposForOrgSecret(
    org: String,
    secretName: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e = executor.executeWithTypedErrors<Unit, CodespacesListSelectedReposForOrgSecretResponse, InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e>(
    request = SdkExecutionRequest(codespacesListSelectedReposForOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodespacesCodecs.codespacesListSelectedReposForOrgSecretRequestCodecRegistry,
    responseDecoder = CodespacesListSelectedReposForOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesListSelectedReposForOrgSecretResponse.SuccessJson -> response.json
        is CodespacesListSelectedReposForOrgSecretResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesListSelectedReposForOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesListSelectedReposForOrgSecretResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesListSelectedReposForOrgSecretResponse.Http404Json -> CodespacesListSelectedReposForOrgSecretApiException(response, statusCode, headers)
        is CodespacesListSelectedReposForOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

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
  public suspend fun codespacesListSelectedReposForOrgSecretWithResponse(
    org: String,
    secretName: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesListSelectedReposForOrgSecretResponse> = executor.executeWithResponse<Unit, CodespacesListSelectedReposForOrgSecretResponse>(SdkExecutionRequest(codespacesListSelectedReposForOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesListSelectedReposForOrgSecretRequestCodecRegistry, CodespacesListSelectedReposForOrgSecretResponseDecoder, options)

  /**
   * Gets the default attributes for codespaces created by the user with the repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param clientIp An alternative IP for default location auto-detection, such as when proxying a request.
   * @param ref The branch or commit to check for a default devcontainer path. If not specified, the default branch will
   * be checked.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesPreFlightWithRepoForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesPreFlightWithRepoForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesPreFlightWithRepoForAuthenticatedUser(
    owner: String,
    repo: String,
    clientIp: String? = null,
    ref: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7 = executor.executeWithTypedErrors<Unit, CodespacesPreFlightWithRepoForAuthenticatedUserResponse, InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7>(
    request = SdkExecutionRequest(codespacesPreFlightWithRepoForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_ip", values = clientIp?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodespacesCodecs.codespacesPreFlightWithRepoForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesPreFlightWithRepoForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http401Json -> CodespacesPreFlightWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http403Json -> CodespacesPreFlightWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http404Json -> CodespacesPreFlightWithRepoForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets the default attributes for codespaces created by the user with the repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param clientIp An alternative IP for default location auto-detection, such as when proxying a request.
   * @param ref The branch or commit to check for a default devcontainer path. If not specified, the default branch will
   * be checked.
   * @param options Execution options.
   */
  public suspend fun codespacesPreFlightWithRepoForAuthenticatedUserWithResponse(
    owner: String,
    repo: String,
    clientIp: String? = null,
    ref: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesPreFlightWithRepoForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesPreFlightWithRepoForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesPreFlightWithRepoForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_ip", values = clientIp?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesPreFlightWithRepoForAuthenticatedUserRequestCodecRegistry, CodespacesPreFlightWithRepoForAuthenticatedUserResponseDecoder, options)

  /**
   * Publishes an unpublished codespace, creating a new repository and assigning it to the codespace.
   *
   * The codespace's token is granted write permissions to the repository, allowing the user to push their changes.
   *
   * This will fail for a codespace that is already published, meaning it has an associated repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesPublishForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesPublishForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesPublishForAuthenticatedUser(
    request: InlineUserCodespacesPublishPostRequestJsonXd8022b6e,
    codespaceName: String,
    options: CallOptions = CallOptions(),
  ): CodespaceWithFullRepository = executor.executeWithTypedErrors<InlineUserCodespacesPublishPostRequestJsonXd8022b6e, CodespacesPublishForAuthenticatedUserResponse, CodespaceWithFullRepository>(
    request = SdkExecutionRequest(codespacesPublishForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESPUBLISHFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesPublishForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesPublishForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesPublishForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesPublishForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesPublishForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesPublishForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesPublishForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesPublishForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesPublishForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesPublishForAuthenticatedUserResponse.Http401Json -> CodespacesPublishForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesPublishForAuthenticatedUserResponse.Http403Json -> CodespacesPublishForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesPublishForAuthenticatedUserResponse.Http404Json -> CodespacesPublishForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesPublishForAuthenticatedUserResponse.Http422Json -> CodespacesPublishForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesPublishForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Publishes an unpublished codespace, creating a new repository and assigning it to the codespace.
   *
   * The codespace's token is granted write permissions to the repository, allowing the user to push their changes.
   *
   * This will fail for a codespace that is already published, meaning it has an associated repository.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   */
  public suspend fun codespacesPublishForAuthenticatedUserWithResponse(
    request: InlineUserCodespacesPublishPostRequestJsonXd8022b6e,
    codespaceName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesPublishForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserCodespacesPublishPostRequestJsonXd8022b6e, CodespacesPublishForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesPublishForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESPUBLISHFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
  }), CodespacesCodecs.codespacesPublishForAuthenticatedUserRequestCodecRegistry, CodespacesPublishForAuthenticatedUserResponseDecoder, options)

  /**
   * Removes a repository from the selected repositories for a user's development environment secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesRemoveRepositoryForSecretForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CodespacesRemoveRepositoryForSecretForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesRemoveRepositoryForSecretForAuthenticatedUser(
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(codespacesRemoveRepositoryForSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesRemoveRepositoryForSecretForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http401Json -> CodespacesRemoveRepositoryForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http403Json -> CodespacesRemoveRepositoryForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http404Json -> CodespacesRemoveRepositoryForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http500Json -> CodespacesRemoveRepositoryForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a repository from the selected repositories for a user's development environment secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesRemoveRepositoryForSecretForAuthenticatedUserWithResponse(
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesRemoveRepositoryForSecretForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesRemoveRepositoryForSecretForAuthenticatedUserRequestCodecRegistry, CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponseDecoder, options)

  /**
   * Removes a repository from an organization development environment secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret).
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param repositoryId Wire parameter `repository_id`.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesRemoveSelectedRepoFromOrgSecretApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesRemoveSelectedRepoFromOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesRemoveSelectedRepoFromOrgSecret(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CodespacesRemoveSelectedRepoFromOrgSecretResponse, Unit>(
    request = SdkExecutionRequest(codespacesRemoveSelectedRepoFromOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesRemoveSelectedRepoFromOrgSecretRequestCodecRegistry,
    responseDecoder = CodespacesRemoveSelectedRepoFromOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent -> response.unit
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent -> response.unit
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http404Json -> CodespacesRemoveSelectedRepoFromOrgSecretApiException(response, statusCode, headers)
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent -> CodespacesRemoveSelectedRepoFromOrgSecretApiException(response, statusCode, headers)
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http422Json -> CodespacesRemoveSelectedRepoFromOrgSecretApiException(response, statusCode, headers)
        is CodespacesRemoveSelectedRepoFromOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a repository from an organization development environment secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret).
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
  public suspend fun codespacesRemoveSelectedRepoFromOrgSecretWithResponse(
    org: String,
    repositoryId: Int,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesRemoveSelectedRepoFromOrgSecretResponse> = executor.executeWithResponse<Unit, CodespacesRemoveSelectedRepoFromOrgSecretResponse>(SdkExecutionRequest(codespacesRemoveSelectedRepoFromOrgSecretMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesRemoveSelectedRepoFromOrgSecretRequestCodecRegistry, CodespacesRemoveSelectedRepoFromOrgSecretResponseDecoder, options)

  /**
   * List the machine types available for a given repository based on its configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param clientIp IP for location auto-detection when proxying a request
   * @param location The location to check for available machines. Assigned by IP if not provided.
   * @param ref The branch or commit to check for prebuild availability and devcontainer restrictions.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesRepoMachinesForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesRepoMachinesForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesRepoMachinesForAuthenticatedUser(
    owner: String,
    repo: String,
    clientIp: String? = null,
    location: String? = null,
    ref: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81 = executor.executeWithTypedErrors<Unit, CodespacesRepoMachinesForAuthenticatedUserResponse, InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81>(
    request = SdkExecutionRequest(codespacesRepoMachinesForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_ip", values = clientIp?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "location", values = location?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CodespacesCodecs.codespacesRepoMachinesForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesRepoMachinesForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesRepoMachinesForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesRepoMachinesForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http304NoContent -> CodespacesRepoMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http401Json -> CodespacesRepoMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http403Json -> CodespacesRepoMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http404Json -> CodespacesRepoMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Http500Json -> CodespacesRepoMachinesForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesRepoMachinesForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the machine types available for a given repository based on its configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param clientIp IP for location auto-detection when proxying a request
   * @param location The location to check for available machines. Assigned by IP if not provided.
   * @param ref The branch or commit to check for prebuild availability and devcontainer restrictions.
   * @param options Execution options.
   */
  public suspend fun codespacesRepoMachinesForAuthenticatedUserWithResponse(
    owner: String,
    repo: String,
    clientIp: String? = null,
    location: String? = null,
    ref: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesRepoMachinesForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesRepoMachinesForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesRepoMachinesForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_ip", values = clientIp?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "location", values = location?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ref", values = ref?.let { listOf(it.toString()) }.orEmpty()))
  }), CodespacesCodecs.codespacesRepoMachinesForAuthenticatedUserRequestCodecRegistry, CodespacesRepoMachinesForAuthenticatedUserResponseDecoder, options)

  /**
   * Sets which users can access codespaces in an organization. This is synonymous with granting or revoking codespaces
   * access permissions for users according to the visibility.
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesSetCodespacesAccessApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodespacesSetCodespacesAccessError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesSetCodespacesAccess(
    request: InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63, CodespacesSetCodespacesAccessResponse, Unit>(
    request = SdkExecutionRequest(codespacesSetCodespacesAccessMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESSETCODESPACESACCESS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesSetCodespacesAccessRequestCodecRegistry,
    responseDecoder = CodespacesSetCodespacesAccessResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesSetCodespacesAccessResponse.SuccessNoContent -> response.unit
        is CodespacesSetCodespacesAccessResponse.Http304NoContent -> response.unit
        is CodespacesSetCodespacesAccessResponse.Http400NoContent -> response.unit
        is CodespacesSetCodespacesAccessResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetCodespacesAccessResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetCodespacesAccessResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetCodespacesAccessResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesSetCodespacesAccessResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesSetCodespacesAccessResponse.Http304NoContent -> CodespacesSetCodespacesAccessApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessResponse.Http400NoContent -> CodespacesSetCodespacesAccessApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessResponse.Http404Json -> CodespacesSetCodespacesAccessApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessResponse.Http422Json -> CodespacesSetCodespacesAccessApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessResponse.Http500Json -> CodespacesSetCodespacesAccessApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sets which users can access codespaces in an organization. This is synonymous with granting or revoking codespaces
   * access permissions for users according to the visibility.
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codespacesSetCodespacesAccessWithResponse(
    request: InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesSetCodespacesAccessResponse> = executor.executeWithResponse<InlineOrgsCodespacesAccessPutRequestJsonX9d2c0d63, CodespacesSetCodespacesAccessResponse>(SdkExecutionRequest(codespacesSetCodespacesAccessMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESSETCODESPACESACCESS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodespacesCodecs.codespacesSetCodespacesAccessRequestCodecRegistry, CodespacesSetCodespacesAccessResponseDecoder, options)

  /**
   * Codespaces for the specified users will be billed to the organization.
   *
   * To use this endpoint, the access settings for the organization must be set to `selected_members`.
   * For information on how to change this setting, see "[Manage access control for organization
   * codespaces](https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces
   * )."
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesSetCodespacesAccessUsersApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesSetCodespacesAccessUsersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesSetCodespacesAccessUsers(
    request: InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a, CodespacesSetCodespacesAccessUsersResponse, Unit>(
    request = SdkExecutionRequest(codespacesSetCodespacesAccessUsersMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESSETCODESPACESACCESSUSERS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesSetCodespacesAccessUsersRequestCodecRegistry,
    responseDecoder = CodespacesSetCodespacesAccessUsersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesSetCodespacesAccessUsersResponse.SuccessNoContent -> response.unit
        is CodespacesSetCodespacesAccessUsersResponse.Http304NoContent -> response.unit
        is CodespacesSetCodespacesAccessUsersResponse.Http400NoContent -> response.unit
        is CodespacesSetCodespacesAccessUsersResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetCodespacesAccessUsersResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetCodespacesAccessUsersResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetCodespacesAccessUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesSetCodespacesAccessUsersResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesSetCodespacesAccessUsersResponse.Http304NoContent -> CodespacesSetCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessUsersResponse.Http400NoContent -> CodespacesSetCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessUsersResponse.Http404Json -> CodespacesSetCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessUsersResponse.Http422Json -> CodespacesSetCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessUsersResponse.Http500Json -> CodespacesSetCodespacesAccessUsersApiException(response, statusCode, headers)
        is CodespacesSetCodespacesAccessUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Codespaces for the specified users will be billed to the organization.
   *
   * To use this endpoint, the access settings for the organization must be set to `selected_members`.
   * For information on how to change this setting, see "[Manage access control for organization
   * codespaces](https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces
   * )."
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun codespacesSetCodespacesAccessUsersWithResponse(
    request: InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesSetCodespacesAccessUsersResponse> = executor.executeWithResponse<InlineOrgsCodespacesAccessSelectedUsersPostRequestJsonX0cf4ca9a, CodespacesSetCodespacesAccessUsersResponse>(SdkExecutionRequest(codespacesSetCodespacesAccessUsersMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESSETCODESPACESACCESSUSERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CodespacesCodecs.codespacesSetCodespacesAccessUsersRequestCodecRegistry, CodespacesSetCodespacesAccessUsersResponseDecoder, options)

  /**
   * Select the repositories that will use a user's development environment secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * @param request Request body sent to the operation.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesSetRepositoriesForSecretForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CodespacesSetRepositoriesForSecretForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesSetRepositoriesForSecretForAuthenticatedUser(
    request: InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8, CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(codespacesSetRepositoriesForSecretForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESSETREPOSITORIESFORSECRETFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesSetRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesSetRepositoriesForSecretForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http401Json -> CodespacesSetRepositoriesForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http403Json -> CodespacesSetRepositoriesForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http404Json -> CodespacesSetRepositoriesForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http500Json -> CodespacesSetRepositoriesForSecretForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Select the repositories that will use a user's development environment secret.
   *
   * The authenticated user must have Codespaces access to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` or `codespace:secrets` scope to use this
   * endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param secretName The name of the secret.
   * @param options Execution options.
   */
  public suspend fun codespacesSetRepositoriesForSecretForAuthenticatedUserWithResponse(
    request: InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserCodespacesSecretsRepositoriesPutRequestJsonXe4f24ba8, CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesSetRepositoriesForSecretForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESSETREPOSITORIESFORSECRETFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesSetRepositoriesForSecretForAuthenticatedUserRequestCodecRegistry, CodespacesSetRepositoriesForSecretForAuthenticatedUserResponseDecoder, options)

  /**
   * Replaces all repositories for an organization development environment secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret).
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param secretName The name of the secret.
   * @param options Execution options.
   * @return No response body.
   * @throws CodespacesSetSelectedReposForOrgSecretApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CodespacesSetSelectedReposForOrgSecretError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesSetSelectedReposForOrgSecret(
    request: InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6, CodespacesSetSelectedReposForOrgSecretResponse, Unit>(
    request = SdkExecutionRequest(codespacesSetSelectedReposForOrgSecretMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesSetSelectedReposForOrgSecretRequestCodecRegistry,
    responseDecoder = CodespacesSetSelectedReposForOrgSecretResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesSetSelectedReposForOrgSecretResponse.SuccessNoContent -> response.unit
        is CodespacesSetSelectedReposForOrgSecretResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesSetSelectedReposForOrgSecretResponse.Http409NoContent -> response.unit
        is CodespacesSetSelectedReposForOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesSetSelectedReposForOrgSecretResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CodespacesSetSelectedReposForOrgSecretResponse.Http404Json -> CodespacesSetSelectedReposForOrgSecretApiException(response, statusCode, headers)
        is CodespacesSetSelectedReposForOrgSecretResponse.Http409NoContent -> CodespacesSetSelectedReposForOrgSecretApiException(response, statusCode, headers)
        is CodespacesSetSelectedReposForOrgSecretResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Replaces all repositories for an organization development environment secret when the `visibility`
   * for repository access is set to `selected`. The visibility is set when you [Create
   * or update an organization
   * secret](https://docs.github.com/rest/codespaces/organization-secrets#create-or-update-an-organization-secret).
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
  public suspend fun codespacesSetSelectedReposForOrgSecretWithResponse(
    request: InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6,
    org: String,
    secretName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesSetSelectedReposForOrgSecretResponse> = executor.executeWithResponse<InlineOrgsCodespacesSecretsRepositoriesPutRequestJsonX79ceacb6, CodespacesSetSelectedReposForOrgSecretResponse>(SdkExecutionRequest(codespacesSetSelectedReposForOrgSecretMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESSETSELECTEDREPOSFORORGSECRET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "secret_name", values = listOf(secretName.toString())))
  }), CodespacesCodecs.codespacesSetSelectedReposForOrgSecretRequestCodecRegistry, CodespacesSetSelectedReposForOrgSecretResponseDecoder, options)

  /**
   * Starts a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesStartForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesStartForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesStartForAuthenticatedUser(codespaceName: String, options: CallOptions = CallOptions()): Codespace = executor.executeWithTypedErrors<Unit, CodespacesStartForAuthenticatedUserResponse, Codespace>(
    request = SdkExecutionRequest(codespacesStartForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesStartForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesStartForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesStartForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesStartForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http402Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesStartForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesStartForAuthenticatedUserResponse.Http304NoContent -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Http400Json -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Http400ScimJson -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Http401Json -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Http402Json -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Http403Json -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Http404Json -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Http409Json -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Http500Json -> CodespacesStartForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStartForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Starts a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   */
  public suspend fun codespacesStartForAuthenticatedUserWithResponse(codespaceName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesStartForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesStartForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesStartForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
  }), CodespacesCodecs.codespacesStartForAuthenticatedUserRequestCodecRegistry, CodespacesStartForAuthenticatedUserResponseDecoder, options)

  /**
   * Stops a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesStopForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesStopForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesStopForAuthenticatedUser(codespaceName: String, options: CallOptions = CallOptions()): Codespace = executor.executeWithTypedErrors<Unit, CodespacesStopForAuthenticatedUserResponse, Codespace>(
    request = SdkExecutionRequest(codespacesStopForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesStopForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesStopForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesStopForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesStopForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopForAuthenticatedUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesStopForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesStopForAuthenticatedUserResponse.Http401Json -> CodespacesStopForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStopForAuthenticatedUserResponse.Http403Json -> CodespacesStopForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStopForAuthenticatedUserResponse.Http404Json -> CodespacesStopForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStopForAuthenticatedUserResponse.Http500Json -> CodespacesStopForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesStopForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Stops a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   */
  public suspend fun codespacesStopForAuthenticatedUserWithResponse(codespaceName: String, options: CallOptions = CallOptions()): SdkResponseResult<CodespacesStopForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, CodespacesStopForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesStopForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
  }), CodespacesCodecs.codespacesStopForAuthenticatedUserRequestCodecRegistry, CodespacesStopForAuthenticatedUserResponseDecoder, options)

  /**
   * Stops a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param codespaceName The name of the codespace.
   * @param org The organization name. The name is not case sensitive.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesStopInOrganizationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodespacesStopInOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesStopInOrganization(
    codespaceName: String,
    org: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): Codespace = executor.executeWithTypedErrors<Unit, CodespacesStopInOrganizationResponse, Codespace>(
    request = SdkExecutionRequest(codespacesStopInOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesStopInOrganizationRequestCodecRegistry,
    responseDecoder = CodespacesStopInOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesStopInOrganizationResponse.SuccessJson -> response.json
        is CodespacesStopInOrganizationResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopInOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopInOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopInOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopInOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesStopInOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesStopInOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesStopInOrganizationResponse.Http304NoContent -> CodespacesStopInOrganizationApiException(response, statusCode, headers)
        is CodespacesStopInOrganizationResponse.Http401Json -> CodespacesStopInOrganizationApiException(response, statusCode, headers)
        is CodespacesStopInOrganizationResponse.Http403Json -> CodespacesStopInOrganizationApiException(response, statusCode, headers)
        is CodespacesStopInOrganizationResponse.Http404Json -> CodespacesStopInOrganizationApiException(response, statusCode, headers)
        is CodespacesStopInOrganizationResponse.Http500Json -> CodespacesStopInOrganizationApiException(response, statusCode, headers)
        is CodespacesStopInOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Stops a user's codespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param codespaceName The name of the codespace.
   * @param org The organization name. The name is not case sensitive.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun codespacesStopInOrganizationWithResponse(
    codespaceName: String,
    org: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesStopInOrganizationResponse> = executor.executeWithResponse<Unit, CodespacesStopInOrganizationResponse>(SdkExecutionRequest(codespacesStopInOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CodespacesCodecs.codespacesStopInOrganizationRequestCodecRegistry, CodespacesStopInOrganizationResponseDecoder, options)

  /**
   * Updates a codespace owned by the authenticated user. Currently only the codespace's machine type and recent folders
   * can be modified using this endpoint.
   *
   * If you specify a new machine type it will be applied the next time your codespace is started.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodespacesUpdateForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodespacesUpdateForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codespacesUpdateForAuthenticatedUser(
    request: InlineUserCodespacesPatchRequestJsonXe8797cb4? = null,
    codespaceName: String,
    options: CallOptions = CallOptions(),
  ): Codespace = executor.executeWithTypedErrors<InlineUserCodespacesPatchRequestJsonXe8797cb4?, CodespacesUpdateForAuthenticatedUserResponse, Codespace>(
    request = SdkExecutionRequest(codespacesUpdateForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESUPDATEFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
    }),
    requestCodecs = CodespacesCodecs.codespacesUpdateForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = CodespacesUpdateForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodespacesUpdateForAuthenticatedUserResponse.SuccessJson -> response.json
        is CodespacesUpdateForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesUpdateForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesUpdateForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodespacesUpdateForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodespacesUpdateForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodespacesUpdateForAuthenticatedUserResponse.Http401Json -> CodespacesUpdateForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesUpdateForAuthenticatedUserResponse.Http403Json -> CodespacesUpdateForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesUpdateForAuthenticatedUserResponse.Http404Json -> CodespacesUpdateForAuthenticatedUserApiException(response, statusCode, headers)
        is CodespacesUpdateForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates a codespace owned by the authenticated user. Currently only the codespace's machine type and recent folders
   * can be modified using this endpoint.
   *
   * If you specify a new machine type it will be applied the next time your codespace is started.
   *
   * OAuth app tokens and personal access tokens (classic) need the `codespace` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param codespaceName The name of the codespace.
   * @param options Execution options.
   */
  public suspend fun codespacesUpdateForAuthenticatedUserWithResponse(
    request: InlineUserCodespacesPatchRequestJsonXe8797cb4? = null,
    codespaceName: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CodespacesUpdateForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserCodespacesPatchRequestJsonXe8797cb4?, CodespacesUpdateForAuthenticatedUserResponse>(SdkExecutionRequest(codespacesUpdateForAuthenticatedUserMetadata, baseUri, request, listOf(CodespacesCodecs.CODESPACESUPDATEFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "codespace_name", values = listOf(codespaceName.toString())))
  }), CodespacesCodecs.codespacesUpdateForAuthenticatedUserRequestCodecRegistry, CodespacesUpdateForAuthenticatedUserResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `codespaces/add-repository-for-secret-for-authenticated-user` may
   * expose through its typed API exception.
   */
  public sealed interface CodespacesAddRepositoryForSecretForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/add-repository-for-secret-for-authenticated-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CodespacesAddRepositoryForSecretForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddRepositoryForSecretForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddRepositoryForSecretForAuthenticatedUserResponse,
        CodespacesAddRepositoryForSecretForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddRepositoryForSecretForAuthenticatedUserResponse,
        CodespacesAddRepositoryForSecretForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddRepositoryForSecretForAuthenticatedUserResponse,
        CodespacesAddRepositoryForSecretForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddRepositoryForSecretForAuthenticatedUserResponse,
        CodespacesAddRepositoryForSecretForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddRepositoryForSecretForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/add-repository-for-secret-for-authenticated-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesAddRepositoryForSecretForAuthenticatedUserApiException(
    public val error: CodespacesAddRepositoryForSecretForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/add-repository-for-secret-for-authenticated-user")

  private object CodespacesAddRepositoryForSecretForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesAddRepositoryForSecretForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesAddRepositoryForSecretForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesAddRepositoryForSecretForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/add-repository-for-secret-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/add-repository-for-secret-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/add-repository-for-secret-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesAddRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/add-repository-for-secret-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesAddRepositoryForSecretForAuthenticatedUserResponse = CodespacesAddRepositoryForSecretForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/add-selected-repo-to-org-secret` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesAddSelectedRepoToOrgSecretError

  /**
   * Typed response alternatives for `codespaces/add-selected-repo-to-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesAddSelectedRepoToOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddSelectedRepoToOrgSecretResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddSelectedRepoToOrgSecretResponse,
        CodespacesAddSelectedRepoToOrgSecretError

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddSelectedRepoToOrgSecretResponse,
        CodespacesAddSelectedRepoToOrgSecretError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddSelectedRepoToOrgSecretResponse,
        CodespacesAddSelectedRepoToOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesAddSelectedRepoToOrgSecretResponse
  }

  /**
   * Raised by `codespaces/add-selected-repo-to-org-secret` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesAddSelectedRepoToOrgSecretApiException(
    public val error: CodespacesAddSelectedRepoToOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/add-selected-repo-to-org-secret")

  private object CodespacesAddSelectedRepoToOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesAddSelectedRepoToOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesAddSelectedRepoToOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesAddSelectedRepoToOrgSecretResponse> = when {
      alternative.id == "codespaces/add-selected-repo-to-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesAddSelectedRepoToOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/add-selected-repo-to-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesAddSelectedRepoToOrgSecretResponse.Http404Json(
          json = CodespacesCodecs.codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative1Registry.select(listOf("codespaces/add-selected-repo-to-org-secret.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/add-selected-repo-to-org-secret.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesAddSelectedRepoToOrgSecretResponse.Http409NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/add-selected-repo-to-org-secret.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesAddSelectedRepoToOrgSecretResponse.Http422Json(
          json = CodespacesCodecs.codespacesAddSelectedRepoToOrgSecretResponseCodecAlternative3Registry.select(listOf("codespaces/add-selected-repo-to-org-secret.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesAddSelectedRepoToOrgSecretResponse = CodespacesAddSelectedRepoToOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/check-permissions-for-devcontainer` may expose through
   * its typed API exception.
   */
  public sealed interface CodespacesCheckPermissionsForDevcontainerError

  /**
   * Typed response alternatives for `codespaces/check-permissions-for-devcontainer`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesCheckPermissionsForDevcontainerResponse {
    public class SuccessJson(
      public val json: CodespacesPermissionsCheckForDevcontainer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCheckPermissionsForDevcontainerResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCheckPermissionsForDevcontainerResponse,
        CodespacesCheckPermissionsForDevcontainerError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCheckPermissionsForDevcontainerResponse,
        CodespacesCheckPermissionsForDevcontainerError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCheckPermissionsForDevcontainerResponse,
        CodespacesCheckPermissionsForDevcontainerError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCheckPermissionsForDevcontainerResponse,
        CodespacesCheckPermissionsForDevcontainerError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCheckPermissionsForDevcontainerResponse,
        CodespacesCheckPermissionsForDevcontainerError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCheckPermissionsForDevcontainerResponse
  }

  /**
   * Raised by `codespaces/check-permissions-for-devcontainer` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesCheckPermissionsForDevcontainerApiException(
    public val error: CodespacesCheckPermissionsForDevcontainerError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/check-permissions-for-devcontainer")

  private object CodespacesCheckPermissionsForDevcontainerResponseDecoder : SdkResponseAlternativeDecoder<CodespacesCheckPermissionsForDevcontainerResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesCheckPermissionsForDevcontainerResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesCheckPermissionsForDevcontainerResponse> = when {
      alternative.id == "codespaces/check-permissions-for-devcontainer.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesCheckPermissionsForDevcontainerResponse.SuccessJson(
          json = CodespacesCodecs.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative0Registry.select(listOf("codespaces/check-permissions-for-devcontainer.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/check-permissions-for-devcontainer.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesCheckPermissionsForDevcontainerResponse.Http401Json(
          json = CodespacesCodecs.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative1Registry.select(listOf("codespaces/check-permissions-for-devcontainer.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/check-permissions-for-devcontainer.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesCheckPermissionsForDevcontainerResponse.Http403Json(
          json = CodespacesCodecs.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative2Registry.select(listOf("codespaces/check-permissions-for-devcontainer.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/check-permissions-for-devcontainer.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesCheckPermissionsForDevcontainerResponse.Http404Json(
          json = CodespacesCodecs.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative3Registry.select(listOf("codespaces/check-permissions-for-devcontainer.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/check-permissions-for-devcontainer.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesCheckPermissionsForDevcontainerResponse.Http422Json(
          json = CodespacesCodecs.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative4Registry.select(listOf("codespaces/check-permissions-for-devcontainer.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/check-permissions-for-devcontainer.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesCheckPermissionsForDevcontainerResponse.Http503Json(
          json = CodespacesCodecs.codespacesCheckPermissionsForDevcontainerResponseCodecAlternative5Registry.select(listOf("codespaces/check-permissions-for-devcontainer.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesCheckPermissionsForDevcontainerResponse = CodespacesCheckPermissionsForDevcontainerResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/codespace-machines-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface CodespacesCodespaceMachinesForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/codespace-machines-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CodespacesCodespaceMachinesForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineUserCodespacesMachinesGetResponse200JsonXd25f7924,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCodespaceMachinesForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCodespaceMachinesForAuthenticatedUserResponse,
        CodespacesCodespaceMachinesForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCodespaceMachinesForAuthenticatedUserResponse,
        CodespacesCodespaceMachinesForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCodespaceMachinesForAuthenticatedUserResponse,
        CodespacesCodespaceMachinesForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCodespaceMachinesForAuthenticatedUserResponse,
        CodespacesCodespaceMachinesForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCodespaceMachinesForAuthenticatedUserResponse,
        CodespacesCodespaceMachinesForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCodespaceMachinesForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/codespace-machines-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesCodespaceMachinesForAuthenticatedUserApiException(
    public val error: CodespacesCodespaceMachinesForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/codespace-machines-for-authenticated-user")

  private object CodespacesCodespaceMachinesForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesCodespaceMachinesForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesCodespaceMachinesForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesCodespaceMachinesForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/codespace-machines-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesCodespaceMachinesForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/codespace-machines-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/codespace-machines-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/codespace-machines-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/codespace-machines-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/codespace-machines-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/codespace-machines-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/codespace-machines-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/codespace-machines-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/codespace-machines-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesCodespaceMachinesForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesCodespaceMachinesForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/codespace-machines-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesCodespaceMachinesForAuthenticatedUserResponse = CodespacesCodespaceMachinesForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/create-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesCreateForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/create-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesCreateForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateForAuthenticatedUserResponse

    public class SuccessJson2(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateForAuthenticatedUserResponse,
        CodespacesCreateForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateForAuthenticatedUserResponse,
        CodespacesCreateForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateForAuthenticatedUserResponse,
        CodespacesCreateForAuthenticatedUserError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateForAuthenticatedUserResponse,
        CodespacesCreateForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/create-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesCreateForAuthenticatedUserApiException(
    public val error: CodespacesCreateForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/create-for-authenticated-user")

  private object CodespacesCreateForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesCreateForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesCreateForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesCreateForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/create-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesCreateForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesCreateForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/create-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesCreateForAuthenticatedUserResponse.SuccessJson2(
          json = CodespacesCodecs.codespacesCreateForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/create-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesCreateForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesCreateForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/create-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesCreateForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesCreateForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/create-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesCreateForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesCreateForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/create-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesCreateForAuthenticatedUserResponse.Http503Json(
          json = CodespacesCodecs.codespacesCreateForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/create-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesCreateForAuthenticatedUserResponse = CodespacesCreateForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/create-or-update-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesCreateOrUpdateOrgSecretResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateOrgSecretResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateOrgSecretResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateOrgSecretResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateOrgSecretResponse
  }

  private object CodespacesCreateOrUpdateOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesCreateOrUpdateOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesCreateOrUpdateOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesCreateOrUpdateOrgSecretResponse> = when {
      alternative.id == "codespaces/create-or-update-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateOrgSecretResponse.SuccessJson(
          json = CodespacesCodecs.codespacesCreateOrUpdateOrgSecretResponseCodecAlternative0Registry.select(listOf("codespaces/create-or-update-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-or-update-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-or-update-org-secret.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateOrgSecretResponse.Http404Json(
          json = CodespacesCodecs.codespacesCreateOrUpdateOrgSecretResponseCodecAlternative2Registry.select(listOf("codespaces/create-or-update-org-secret.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-or-update-org-secret.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateOrgSecretResponse.Http422Json(
          json = CodespacesCodecs.codespacesCreateOrUpdateOrgSecretResponseCodecAlternative3Registry.select(listOf("codespaces/create-or-update-org-secret.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesCreateOrUpdateOrgSecretResponse = CodespacesCreateOrUpdateOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/create-or-update-repo-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesCreateOrUpdateRepoSecretResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateRepoSecretResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateRepoSecretResponse
  }

  private object CodespacesCreateOrUpdateRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesCreateOrUpdateRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesCreateOrUpdateRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesCreateOrUpdateRepoSecretResponse> = when {
      alternative.id == "codespaces/create-or-update-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateRepoSecretResponse.SuccessJson(
          json = CodespacesCodecs.codespacesCreateOrUpdateRepoSecretResponseCodecAlternative0Registry.select(listOf("codespaces/create-or-update-repo-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-or-update-repo-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateRepoSecretResponse.SuccessNoContent(
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
    ): CodespacesCreateOrUpdateRepoSecretResponse = CodespacesCreateOrUpdateRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/create-or-update-secret-for-authenticated-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse
  }

  private object CodespacesCreateOrUpdateSecretForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/create-or-update-secret-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/create-or-update-secret-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-or-update-secret-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-or-update-secret-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/create-or-update-secret-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-or-update-secret-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse.Http422Json(
          json = CodespacesCodecs.codespacesCreateOrUpdateSecretForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/create-or-update-secret-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse = CodespacesCreateOrUpdateSecretForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/create-with-pr-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface CodespacesCreateWithPrForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/create-with-pr-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CodespacesCreateWithPrForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithPrForAuthenticatedUserResponse

    public class SuccessJson2(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithPrForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithPrForAuthenticatedUserResponse,
        CodespacesCreateWithPrForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithPrForAuthenticatedUserResponse,
        CodespacesCreateWithPrForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithPrForAuthenticatedUserResponse,
        CodespacesCreateWithPrForAuthenticatedUserError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithPrForAuthenticatedUserResponse,
        CodespacesCreateWithPrForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithPrForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/create-with-pr-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesCreateWithPrForAuthenticatedUserApiException(
    public val error: CodespacesCreateWithPrForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/create-with-pr-for-authenticated-user")

  private object CodespacesCreateWithPrForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesCreateWithPrForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesCreateWithPrForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesCreateWithPrForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/create-with-pr-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithPrForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/create-with-pr-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-pr-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithPrForAuthenticatedUserResponse.SuccessJson2(
          json = CodespacesCodecs.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/create-with-pr-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-pr-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithPrForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/create-with-pr-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-pr-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithPrForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/create-with-pr-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-pr-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithPrForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/create-with-pr-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-pr-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithPrForAuthenticatedUserResponse.Http503Json(
          json = CodespacesCodecs.codespacesCreateWithPrForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/create-with-pr-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesCreateWithPrForAuthenticatedUserResponse = CodespacesCreateWithPrForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/create-with-repo-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface CodespacesCreateWithRepoForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/create-with-repo-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CodespacesCreateWithRepoForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse

    public class SuccessJson2(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse,
        CodespacesCreateWithRepoForAuthenticatedUserError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse,
        CodespacesCreateWithRepoForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse,
        CodespacesCreateWithRepoForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse,
        CodespacesCreateWithRepoForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse,
        CodespacesCreateWithRepoForAuthenticatedUserError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse,
        CodespacesCreateWithRepoForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesCreateWithRepoForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/create-with-repo-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesCreateWithRepoForAuthenticatedUserApiException(
    public val error: CodespacesCreateWithRepoForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/create-with-repo-for-authenticated-user")

  private object CodespacesCreateWithRepoForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesCreateWithRepoForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesCreateWithRepoForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesCreateWithRepoForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/create-with-repo-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithRepoForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/create-with-repo-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-repo-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithRepoForAuthenticatedUserResponse.SuccessJson2(
          json = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/create-with-repo-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-repo-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithRepoForAuthenticatedUserResponse.Http400Json(
          json = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/create-with-repo-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-repo-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithRepoForAuthenticatedUserResponse.Http400ScimJson(
          json = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/create-with-repo-for-authenticated-user.response.alternative3"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-repo-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithRepoForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/create-with-repo-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-repo-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithRepoForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/create-with-repo-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-repo-for-authenticated-user.response.alternative6" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithRepoForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative6Registry.select(listOf("codespaces/create-with-repo-for-authenticated-user.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/create-with-repo-for-authenticated-user.response.alternative7" -> SdkResponseDecodeResult(
        value = CodespacesCreateWithRepoForAuthenticatedUserResponse.Http503Json(
          json = CodespacesCodecs.codespacesCreateWithRepoForAuthenticatedUserResponseCodecAlternative7Registry.select(listOf("codespaces/create-with-repo-for-authenticated-user.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesCreateWithRepoForAuthenticatedUserResponse = CodespacesCreateWithRepoForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/delete-codespaces-access-users` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesDeleteCodespacesAccessUsersError

  /**
   * Typed response alternatives for `codespaces/delete-codespaces-access-users`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesDeleteCodespacesAccessUsersResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteCodespacesAccessUsersResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteCodespacesAccessUsersResponse,
        CodespacesDeleteCodespacesAccessUsersError

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteCodespacesAccessUsersResponse,
        CodespacesDeleteCodespacesAccessUsersError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteCodespacesAccessUsersResponse,
        CodespacesDeleteCodespacesAccessUsersError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteCodespacesAccessUsersResponse,
        CodespacesDeleteCodespacesAccessUsersError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteCodespacesAccessUsersResponse,
        CodespacesDeleteCodespacesAccessUsersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteCodespacesAccessUsersResponse
  }

  /**
   * Raised by `codespaces/delete-codespaces-access-users` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesDeleteCodespacesAccessUsersApiException(
    public val error: CodespacesDeleteCodespacesAccessUsersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/delete-codespaces-access-users")

  private object CodespacesDeleteCodespacesAccessUsersResponseDecoder : SdkResponseAlternativeDecoder<CodespacesDeleteCodespacesAccessUsersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesDeleteCodespacesAccessUsersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesDeleteCodespacesAccessUsersResponse> = when {
      alternative.id == "codespaces/delete-codespaces-access-users.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesDeleteCodespacesAccessUsersResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-codespaces-access-users.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesDeleteCodespacesAccessUsersResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-codespaces-access-users.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesDeleteCodespacesAccessUsersResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-codespaces-access-users.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesDeleteCodespacesAccessUsersResponse.Http404Json(
          json = CodespacesCodecs.codespacesDeleteCodespacesAccessUsersResponseCodecAlternative3Registry.select(listOf("codespaces/delete-codespaces-access-users.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-codespaces-access-users.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesDeleteCodespacesAccessUsersResponse.Http422Json(
          json = CodespacesCodecs.codespacesDeleteCodespacesAccessUsersResponseCodecAlternative4Registry.select(listOf("codespaces/delete-codespaces-access-users.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-codespaces-access-users.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesDeleteCodespacesAccessUsersResponse.Http500Json(
          json = CodespacesCodecs.codespacesDeleteCodespacesAccessUsersResponseCodecAlternative5Registry.select(listOf("codespaces/delete-codespaces-access-users.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesDeleteCodespacesAccessUsersResponse = CodespacesDeleteCodespacesAccessUsersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/delete-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesDeleteForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/delete-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesDeleteForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteForAuthenticatedUserResponse,
        CodespacesDeleteForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteForAuthenticatedUserResponse,
        CodespacesDeleteForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteForAuthenticatedUserResponse,
        CodespacesDeleteForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteForAuthenticatedUserResponse,
        CodespacesDeleteForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteForAuthenticatedUserResponse,
        CodespacesDeleteForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/delete-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesDeleteForAuthenticatedUserApiException(
    public val error: CodespacesDeleteForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/delete-for-authenticated-user")

  private object CodespacesDeleteForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesDeleteForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesDeleteForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesDeleteForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/delete-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesDeleteForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesDeleteForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/delete-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesDeleteForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesDeleteForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesDeleteForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/delete-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesDeleteForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesDeleteForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/delete-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesDeleteForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesDeleteForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/delete-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesDeleteForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesDeleteForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/delete-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesDeleteForAuthenticatedUserResponse = CodespacesDeleteForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/delete-from-organization` may expose through its typed
   * API exception.
   */
  public sealed interface CodespacesDeleteFromOrganizationError

  /**
   * Typed response alternatives for `codespaces/delete-from-organization`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodespacesDeleteFromOrganizationResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteFromOrganizationResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteFromOrganizationResponse,
        CodespacesDeleteFromOrganizationError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteFromOrganizationResponse,
        CodespacesDeleteFromOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteFromOrganizationResponse,
        CodespacesDeleteFromOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteFromOrganizationResponse,
        CodespacesDeleteFromOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteFromOrganizationResponse,
        CodespacesDeleteFromOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteFromOrganizationResponse
  }

  /**
   * Raised by `codespaces/delete-from-organization` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesDeleteFromOrganizationApiException(
    public val error: CodespacesDeleteFromOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/delete-from-organization")

  private object CodespacesDeleteFromOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CodespacesDeleteFromOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesDeleteFromOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesDeleteFromOrganizationResponse> = when {
      alternative.id == "codespaces/delete-from-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesDeleteFromOrganizationResponse.SuccessJson(
          json = CodespacesCodecs.codespacesDeleteFromOrganizationResponseCodecAlternative0Registry.select(listOf("codespaces/delete-from-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-from-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesDeleteFromOrganizationResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-from-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesDeleteFromOrganizationResponse.Http401Json(
          json = CodespacesCodecs.codespacesDeleteFromOrganizationResponseCodecAlternative2Registry.select(listOf("codespaces/delete-from-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-from-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesDeleteFromOrganizationResponse.Http403Json(
          json = CodespacesCodecs.codespacesDeleteFromOrganizationResponseCodecAlternative3Registry.select(listOf("codespaces/delete-from-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-from-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesDeleteFromOrganizationResponse.Http404Json(
          json = CodespacesCodecs.codespacesDeleteFromOrganizationResponseCodecAlternative4Registry.select(listOf("codespaces/delete-from-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-from-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesDeleteFromOrganizationResponse.Http500Json(
          json = CodespacesCodecs.codespacesDeleteFromOrganizationResponseCodecAlternative5Registry.select(listOf("codespaces/delete-from-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesDeleteFromOrganizationResponse = CodespacesDeleteFromOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/delete-org-secret` may expose through its typed API
   * exception.
   */
  public sealed interface CodespacesDeleteOrgSecretError

  /**
   * Typed response alternatives for `codespaces/delete-org-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesDeleteOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteOrgSecretResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteOrgSecretResponse,
        CodespacesDeleteOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteOrgSecretResponse
  }

  /**
   * Raised by `codespaces/delete-org-secret` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CodespacesDeleteOrgSecretApiException(
    public val error: CodespacesDeleteOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/delete-org-secret")

  private object CodespacesDeleteOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesDeleteOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesDeleteOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesDeleteOrgSecretResponse> = when {
      alternative.id == "codespaces/delete-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesDeleteOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/delete-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesDeleteOrgSecretResponse.Http404Json(
          json = CodespacesCodecs.codespacesDeleteOrgSecretResponseCodecAlternative1Registry.select(listOf("codespaces/delete-org-secret.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesDeleteOrgSecretResponse = CodespacesDeleteOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/delete-repo-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesDeleteRepoSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteRepoSecretResponse
  }

  private object CodespacesDeleteRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesDeleteRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesDeleteRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesDeleteRepoSecretResponse> = when {
      alternative.id == "codespaces/delete-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesDeleteRepoSecretResponse.SuccessNoContent(
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
    ): CodespacesDeleteRepoSecretResponse = CodespacesDeleteRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/delete-secret-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesDeleteSecretForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteSecretForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesDeleteSecretForAuthenticatedUserResponse
  }

  private object CodespacesDeleteSecretForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesDeleteSecretForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesDeleteSecretForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesDeleteSecretForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/delete-secret-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesDeleteSecretForAuthenticatedUserResponse.SuccessNoContent(
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
    ): CodespacesDeleteSecretForAuthenticatedUserResponse = CodespacesDeleteSecretForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/export-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesExportForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/export-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesExportForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: CodespaceExportDetails,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesExportForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesExportForAuthenticatedUserResponse,
        CodespacesExportForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesExportForAuthenticatedUserResponse,
        CodespacesExportForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesExportForAuthenticatedUserResponse,
        CodespacesExportForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesExportForAuthenticatedUserResponse,
        CodespacesExportForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesExportForAuthenticatedUserResponse,
        CodespacesExportForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesExportForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/export-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesExportForAuthenticatedUserApiException(
    public val error: CodespacesExportForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/export-for-authenticated-user")

  private object CodespacesExportForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesExportForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesExportForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesExportForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/export-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesExportForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesExportForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/export-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/export-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesExportForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesExportForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/export-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/export-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesExportForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesExportForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/export-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/export-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesExportForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesExportForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/export-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/export-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesExportForAuthenticatedUserResponse.Http422Json(
          json = CodespacesCodecs.codespacesExportForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/export-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/export-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesExportForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesExportForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/export-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesExportForAuthenticatedUserResponse = CodespacesExportForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/get-codespaces-for-user-in-org` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesGetCodespacesForUserInOrgError

  /**
   * Typed response alternatives for `codespaces/get-codespaces-for-user-in-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesGetCodespacesForUserInOrgResponse {
    public class SuccessJson(
      public val json: InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetCodespacesForUserInOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetCodespacesForUserInOrgResponse,
        CodespacesGetCodespacesForUserInOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetCodespacesForUserInOrgResponse,
        CodespacesGetCodespacesForUserInOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetCodespacesForUserInOrgResponse,
        CodespacesGetCodespacesForUserInOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetCodespacesForUserInOrgResponse,
        CodespacesGetCodespacesForUserInOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetCodespacesForUserInOrgResponse,
        CodespacesGetCodespacesForUserInOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetCodespacesForUserInOrgResponse
  }

  /**
   * Raised by `codespaces/get-codespaces-for-user-in-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesGetCodespacesForUserInOrgApiException(
    public val error: CodespacesGetCodespacesForUserInOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/get-codespaces-for-user-in-org")

  private object CodespacesGetCodespacesForUserInOrgResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetCodespacesForUserInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetCodespacesForUserInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetCodespacesForUserInOrgResponse> = when {
      alternative.id == "codespaces/get-codespaces-for-user-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetCodespacesForUserInOrgResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetCodespacesForUserInOrgResponseCodecAlternative0Registry.select(listOf("codespaces/get-codespaces-for-user-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-codespaces-for-user-in-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesGetCodespacesForUserInOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-codespaces-for-user-in-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesGetCodespacesForUserInOrgResponse.Http401Json(
          json = CodespacesCodecs.codespacesGetCodespacesForUserInOrgResponseCodecAlternative2Registry.select(listOf("codespaces/get-codespaces-for-user-in-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-codespaces-for-user-in-org.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesGetCodespacesForUserInOrgResponse.Http403Json(
          json = CodespacesCodecs.codespacesGetCodespacesForUserInOrgResponseCodecAlternative3Registry.select(listOf("codespaces/get-codespaces-for-user-in-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-codespaces-for-user-in-org.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesGetCodespacesForUserInOrgResponse.Http404Json(
          json = CodespacesCodecs.codespacesGetCodespacesForUserInOrgResponseCodecAlternative4Registry.select(listOf("codespaces/get-codespaces-for-user-in-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-codespaces-for-user-in-org.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesGetCodespacesForUserInOrgResponse.Http500Json(
          json = CodespacesCodecs.codespacesGetCodespacesForUserInOrgResponseCodecAlternative5Registry.select(listOf("codespaces/get-codespaces-for-user-in-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetCodespacesForUserInOrgResponse = CodespacesGetCodespacesForUserInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/get-export-details-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface CodespacesGetExportDetailsForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/get-export-details-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CodespacesGetExportDetailsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: CodespaceExportDetails,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetExportDetailsForAuthenticatedUserResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetExportDetailsForAuthenticatedUserResponse,
        CodespacesGetExportDetailsForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetExportDetailsForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/get-export-details-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesGetExportDetailsForAuthenticatedUserApiException(
    public val error: CodespacesGetExportDetailsForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/get-export-details-for-authenticated-user")

  private object CodespacesGetExportDetailsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetExportDetailsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetExportDetailsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetExportDetailsForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/get-export-details-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetExportDetailsForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/get-export-details-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-export-details-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesGetExportDetailsForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesGetExportDetailsForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/get-export-details-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetExportDetailsForAuthenticatedUserResponse = CodespacesGetExportDetailsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/get-for-authenticated-user` may expose through its typed
   * API exception.
   */
  public sealed interface CodespacesGetForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/get-for-authenticated-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodespacesGetForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetForAuthenticatedUserResponse,
        CodespacesGetForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetForAuthenticatedUserResponse,
        CodespacesGetForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetForAuthenticatedUserResponse,
        CodespacesGetForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetForAuthenticatedUserResponse,
        CodespacesGetForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetForAuthenticatedUserResponse,
        CodespacesGetForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/get-for-authenticated-user` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesGetForAuthenticatedUserApiException(
    public val error: CodespacesGetForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/get-for-authenticated-user")

  private object CodespacesGetForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/get-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/get-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesGetForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesGetForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesGetForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/get-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesGetForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesGetForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/get-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesGetForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesGetForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/get-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/get-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesGetForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesGetForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/get-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetForAuthenticatedUserResponse = CodespacesGetForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/get-org-public-key`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesGetOrgPublicKeyResponse {
    public class SuccessJson(
      public val json: CodespacesPublicKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetOrgPublicKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetOrgPublicKeyResponse
  }

  private object CodespacesGetOrgPublicKeyResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetOrgPublicKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetOrgPublicKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetOrgPublicKeyResponse> = when {
      alternative.id == "codespaces/get-org-public-key.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetOrgPublicKeyResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetOrgPublicKeyResponseCodecAlternative0Registry.select(listOf("codespaces/get-org-public-key.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetOrgPublicKeyResponse = CodespacesGetOrgPublicKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/get-org-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesGetOrgSecretResponse {
    public class SuccessJson(
      public val json: CodespacesOrgSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetOrgSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetOrgSecretResponse
  }

  private object CodespacesGetOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetOrgSecretResponse> = when {
      alternative.id == "codespaces/get-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetOrgSecretResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetOrgSecretResponseCodecAlternative0Registry.select(listOf("codespaces/get-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetOrgSecretResponse = CodespacesGetOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/get-public-key-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CodespacesGetPublicKeyForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: CodespacesUserPublicKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetPublicKeyForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetPublicKeyForAuthenticatedUserResponse
  }

  private object CodespacesGetPublicKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetPublicKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetPublicKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetPublicKeyForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/get-public-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetPublicKeyForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetPublicKeyForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/get-public-key-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetPublicKeyForAuthenticatedUserResponse = CodespacesGetPublicKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/get-repo-public-key`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesGetRepoPublicKeyResponse {
    public class SuccessJson(
      public val json: CodespacesPublicKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetRepoPublicKeyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetRepoPublicKeyResponse
  }

  private object CodespacesGetRepoPublicKeyResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetRepoPublicKeyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetRepoPublicKeyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetRepoPublicKeyResponse> = when {
      alternative.id == "codespaces/get-repo-public-key.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetRepoPublicKeyResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetRepoPublicKeyResponseCodecAlternative0Registry.select(listOf("codespaces/get-repo-public-key.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetRepoPublicKeyResponse = CodespacesGetRepoPublicKeyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/get-repo-secret`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesGetRepoSecretResponse {
    public class SuccessJson(
      public val json: RepoCodespacesSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetRepoSecretResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetRepoSecretResponse
  }

  private object CodespacesGetRepoSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetRepoSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetRepoSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetRepoSecretResponse> = when {
      alternative.id == "codespaces/get-repo-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetRepoSecretResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetRepoSecretResponseCodecAlternative0Registry.select(listOf("codespaces/get-repo-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetRepoSecretResponse = CodespacesGetRepoSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/get-secret-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesGetSecretForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: CodespacesSecret,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetSecretForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesGetSecretForAuthenticatedUserResponse
  }

  private object CodespacesGetSecretForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesGetSecretForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesGetSecretForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesGetSecretForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/get-secret-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesGetSecretForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesGetSecretForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/get-secret-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesGetSecretForAuthenticatedUserResponse = CodespacesGetSecretForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/list-devcontainers-in-repository-for-authenticated-user`
   * may expose through its typed API exception.
   */
  public sealed interface CodespacesListDevcontainersInRepositoryForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/list-devcontainers-in-repository-for-authenticated-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse,
        CodespacesListDevcontainersInRepositoryForAuthenticatedUserError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse,
        CodespacesListDevcontainersInRepositoryForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse,
        CodespacesListDevcontainersInRepositoryForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse,
        CodespacesListDevcontainersInRepositoryForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse,
        CodespacesListDevcontainersInRepositoryForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse,
        CodespacesListDevcontainersInRepositoryForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/list-devcontainers-in-repository-for-authenticated-user` after decoding a declared
   * non-success response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesListDevcontainersInRepositoryForAuthenticatedUserApiException(
    public val error: CodespacesListDevcontainersInRepositoryForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/list-devcontainers-in-repository-for-authenticated-user")

  private object CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http400Json(
          json = CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http400ScimJson(
          json = CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative6" -> SdkResponseDecodeResult(
        value = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesListDevcontainersInRepositoryForAuthenticatedUserResponseCodecAlternative6Registry.select(listOf("codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse = CodespacesListDevcontainersInRepositoryForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/list-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesListForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/list-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesListForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineUserCodespacesGetResponse200JsonX10571de7,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListForAuthenticatedUserResponse,
        CodespacesListForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListForAuthenticatedUserResponse,
        CodespacesListForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListForAuthenticatedUserResponse,
        CodespacesListForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListForAuthenticatedUserResponse,
        CodespacesListForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListForAuthenticatedUserResponse,
        CodespacesListForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/list-for-authenticated-user` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesListForAuthenticatedUserApiException(
    public val error: CodespacesListForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/list-for-authenticated-user")

  private object CodespacesListForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/list-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/list-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesListForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesListForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesListForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/list-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesListForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesListForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/list-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesListForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesListForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/list-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesListForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesListForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/list-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListForAuthenticatedUserResponse = CodespacesListForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/list-in-organization` may expose through its typed API
   * exception.
   */
  public sealed interface CodespacesListInOrganizationError

  /**
   * Typed response alternatives for `codespaces/list-in-organization`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesListInOrganizationResponse {
    public class SuccessJson(
      public val json: InlineOrgsCodespacesGetResponse200JsonX93e6311d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInOrganizationResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInOrganizationResponse,
        CodespacesListInOrganizationError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInOrganizationResponse,
        CodespacesListInOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInOrganizationResponse,
        CodespacesListInOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInOrganizationResponse,
        CodespacesListInOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInOrganizationResponse,
        CodespacesListInOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInOrganizationResponse
  }

  /**
   * Raised by `codespaces/list-in-organization` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CodespacesListInOrganizationApiException(
    public val error: CodespacesListInOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/list-in-organization")

  private object CodespacesListInOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListInOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListInOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListInOrganizationResponse> = when {
      alternative.id == "codespaces/list-in-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListInOrganizationResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListInOrganizationResponseCodecAlternative0Registry.select(listOf("codespaces/list-in-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesListInOrganizationResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesListInOrganizationResponse.Http401Json(
          json = CodespacesCodecs.codespacesListInOrganizationResponseCodecAlternative2Registry.select(listOf("codespaces/list-in-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesListInOrganizationResponse.Http403Json(
          json = CodespacesCodecs.codespacesListInOrganizationResponseCodecAlternative3Registry.select(listOf("codespaces/list-in-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesListInOrganizationResponse.Http404Json(
          json = CodespacesCodecs.codespacesListInOrganizationResponseCodecAlternative4Registry.select(listOf("codespaces/list-in-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesListInOrganizationResponse.Http500Json(
          json = CodespacesCodecs.codespacesListInOrganizationResponseCodecAlternative5Registry.select(listOf("codespaces/list-in-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListInOrganizationResponse = CodespacesListInOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/list-in-repository-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface CodespacesListInRepositoryForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/list-in-repository-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CodespacesListInRepositoryForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineReposCodespacesGetResponse200JsonX2f5d5815,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInRepositoryForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInRepositoryForAuthenticatedUserResponse,
        CodespacesListInRepositoryForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInRepositoryForAuthenticatedUserResponse,
        CodespacesListInRepositoryForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInRepositoryForAuthenticatedUserResponse,
        CodespacesListInRepositoryForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInRepositoryForAuthenticatedUserResponse,
        CodespacesListInRepositoryForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListInRepositoryForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/list-in-repository-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesListInRepositoryForAuthenticatedUserApiException(
    public val error: CodespacesListInRepositoryForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/list-in-repository-for-authenticated-user")

  private object CodespacesListInRepositoryForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListInRepositoryForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListInRepositoryForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListInRepositoryForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/list-in-repository-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListInRepositoryForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/list-in-repository-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-repository-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesListInRepositoryForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/list-in-repository-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-repository-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesListInRepositoryForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/list-in-repository-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-repository-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesListInRepositoryForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/list-in-repository-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-in-repository-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesListInRepositoryForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesListInRepositoryForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/list-in-repository-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListInRepositoryForAuthenticatedUserResponse = CodespacesListInRepositoryForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/list-org-secrets`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesListOrgSecretsResponse {
    public class SuccessJson(
      public val json: InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListOrgSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListOrgSecretsResponse
  }

  private object CodespacesListOrgSecretsResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListOrgSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListOrgSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListOrgSecretsResponse> = when {
      alternative.id == "codespaces/list-org-secrets.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListOrgSecretsResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListOrgSecretsResponseCodecAlternative0Registry.select(listOf("codespaces/list-org-secrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListOrgSecretsResponse = CodespacesListOrgSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/list-repo-secrets`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesListRepoSecretsResponse {
    public class SuccessJson(
      public val json: InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListRepoSecretsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListRepoSecretsResponse
  }

  private object CodespacesListRepoSecretsResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListRepoSecretsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListRepoSecretsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListRepoSecretsResponse> = when {
      alternative.id == "codespaces/list-repo-secrets.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListRepoSecretsResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListRepoSecretsResponseCodecAlternative0Registry.select(listOf("codespaces/list-repo-secrets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListRepoSecretsResponse = CodespacesListRepoSecretsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/list-repositories-for-secret-for-authenticated-user` may
   * expose through its typed API exception.
   */
  public sealed interface CodespacesListRepositoriesForSecretForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/list-repositories-for-secret-for-authenticated-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CodespacesListRepositoriesForSecretForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListRepositoriesForSecretForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListRepositoriesForSecretForAuthenticatedUserResponse,
        CodespacesListRepositoriesForSecretForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListRepositoriesForSecretForAuthenticatedUserResponse,
        CodespacesListRepositoriesForSecretForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListRepositoriesForSecretForAuthenticatedUserResponse,
        CodespacesListRepositoriesForSecretForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListRepositoriesForSecretForAuthenticatedUserResponse,
        CodespacesListRepositoriesForSecretForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListRepositoriesForSecretForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/list-repositories-for-secret-for-authenticated-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesListRepositoriesForSecretForAuthenticatedUserApiException(
    public val error: CodespacesListRepositoriesForSecretForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/list-repositories-for-secret-for-authenticated-user")

  private object CodespacesListRepositoriesForSecretForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListRepositoriesForSecretForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListRepositoriesForSecretForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListRepositoriesForSecretForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesListRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListRepositoriesForSecretForAuthenticatedUserResponse = CodespacesListRepositoriesForSecretForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `codespaces/list-secrets-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesListSecretsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineUserCodespacesSecretsGetResponse200JsonXaa96d197,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListSecretsForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListSecretsForAuthenticatedUserResponse
  }

  private object CodespacesListSecretsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListSecretsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListSecretsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListSecretsForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/list-secrets-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListSecretsForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListSecretsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/list-secrets-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListSecretsForAuthenticatedUserResponse = CodespacesListSecretsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/list-selected-repos-for-org-secret` may expose through
   * its typed API exception.
   */
  public sealed interface CodespacesListSelectedReposForOrgSecretError

  /**
   * Typed response alternatives for `codespaces/list-selected-repos-for-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesListSelectedReposForOrgSecretResponse {
    public class SuccessJson(
      public val json: InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListSelectedReposForOrgSecretResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListSelectedReposForOrgSecretResponse,
        CodespacesListSelectedReposForOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesListSelectedReposForOrgSecretResponse
  }

  /**
   * Raised by `codespaces/list-selected-repos-for-org-secret` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesListSelectedReposForOrgSecretApiException(
    public val error: CodespacesListSelectedReposForOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/list-selected-repos-for-org-secret")

  private object CodespacesListSelectedReposForOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesListSelectedReposForOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesListSelectedReposForOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesListSelectedReposForOrgSecretResponse> = when {
      alternative.id == "codespaces/list-selected-repos-for-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesListSelectedReposForOrgSecretResponse.SuccessJson(
          json = CodespacesCodecs.codespacesListSelectedReposForOrgSecretResponseCodecAlternative0Registry.select(listOf("codespaces/list-selected-repos-for-org-secret.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/list-selected-repos-for-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesListSelectedReposForOrgSecretResponse.Http404Json(
          json = CodespacesCodecs.codespacesListSelectedReposForOrgSecretResponseCodecAlternative1Registry.select(listOf("codespaces/list-selected-repos-for-org-secret.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesListSelectedReposForOrgSecretResponse = CodespacesListSelectedReposForOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/pre-flight-with-repo-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface CodespacesPreFlightWithRepoForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/pre-flight-with-repo-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CodespacesPreFlightWithRepoForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPreFlightWithRepoForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPreFlightWithRepoForAuthenticatedUserResponse,
        CodespacesPreFlightWithRepoForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPreFlightWithRepoForAuthenticatedUserResponse,
        CodespacesPreFlightWithRepoForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPreFlightWithRepoForAuthenticatedUserResponse,
        CodespacesPreFlightWithRepoForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPreFlightWithRepoForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/pre-flight-with-repo-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesPreFlightWithRepoForAuthenticatedUserApiException(
    public val error: CodespacesPreFlightWithRepoForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/pre-flight-with-repo-for-authenticated-user")

  private object CodespacesPreFlightWithRepoForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesPreFlightWithRepoForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesPreFlightWithRepoForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesPreFlightWithRepoForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesPreFlightWithRepoForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesPreFlightWithRepoForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesPreFlightWithRepoForAuthenticatedUserResponse = CodespacesPreFlightWithRepoForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/publish-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesPublishForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/publish-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesPublishForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: CodespaceWithFullRepository,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPublishForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPublishForAuthenticatedUserResponse,
        CodespacesPublishForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPublishForAuthenticatedUserResponse,
        CodespacesPublishForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPublishForAuthenticatedUserResponse,
        CodespacesPublishForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPublishForAuthenticatedUserResponse,
        CodespacesPublishForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesPublishForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/publish-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesPublishForAuthenticatedUserApiException(
    public val error: CodespacesPublishForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/publish-for-authenticated-user")

  private object CodespacesPublishForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesPublishForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesPublishForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesPublishForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/publish-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesPublishForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesPublishForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/publish-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/publish-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesPublishForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesPublishForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/publish-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/publish-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesPublishForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesPublishForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/publish-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/publish-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesPublishForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesPublishForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/publish-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/publish-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesPublishForAuthenticatedUserResponse.Http422Json(
          json = CodespacesCodecs.codespacesPublishForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/publish-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesPublishForAuthenticatedUserResponse = CodespacesPublishForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/remove-repository-for-secret-for-authenticated-user` may
   * expose through its typed API exception.
   */
  public sealed interface CodespacesRemoveRepositoryForSecretForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/remove-repository-for-secret-for-authenticated-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse,
        CodespacesRemoveRepositoryForSecretForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse,
        CodespacesRemoveRepositoryForSecretForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse,
        CodespacesRemoveRepositoryForSecretForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse,
        CodespacesRemoveRepositoryForSecretForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/remove-repository-for-secret-for-authenticated-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesRemoveRepositoryForSecretForAuthenticatedUserApiException(
    public val error: CodespacesRemoveRepositoryForSecretForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/remove-repository-for-secret-for-authenticated-user")

  private object CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesRemoveRepositoryForSecretForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse = CodespacesRemoveRepositoryForSecretForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/remove-selected-repo-from-org-secret` may expose through
   * its typed API exception.
   */
  public sealed interface CodespacesRemoveSelectedRepoFromOrgSecretError

  /**
   * Typed response alternatives for `codespaces/remove-selected-repo-from-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesRemoveSelectedRepoFromOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveSelectedRepoFromOrgSecretResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveSelectedRepoFromOrgSecretResponse,
        CodespacesRemoveSelectedRepoFromOrgSecretError

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveSelectedRepoFromOrgSecretResponse,
        CodespacesRemoveSelectedRepoFromOrgSecretError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveSelectedRepoFromOrgSecretResponse,
        CodespacesRemoveSelectedRepoFromOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRemoveSelectedRepoFromOrgSecretResponse
  }

  /**
   * Raised by `codespaces/remove-selected-repo-from-org-secret` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesRemoveSelectedRepoFromOrgSecretApiException(
    public val error: CodespacesRemoveSelectedRepoFromOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/remove-selected-repo-from-org-secret")

  private object CodespacesRemoveSelectedRepoFromOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesRemoveSelectedRepoFromOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesRemoveSelectedRepoFromOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesRemoveSelectedRepoFromOrgSecretResponse> = when {
      alternative.id == "codespaces/remove-selected-repo-from-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesRemoveSelectedRepoFromOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/remove-selected-repo-from-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http404Json(
          json = CodespacesCodecs.codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative1Registry.select(listOf("codespaces/remove-selected-repo-from-org-secret.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/remove-selected-repo-from-org-secret.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http409NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/remove-selected-repo-from-org-secret.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesRemoveSelectedRepoFromOrgSecretResponse.Http422Json(
          json = CodespacesCodecs.codespacesRemoveSelectedRepoFromOrgSecretResponseCodecAlternative3Registry.select(listOf("codespaces/remove-selected-repo-from-org-secret.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesRemoveSelectedRepoFromOrgSecretResponse = CodespacesRemoveSelectedRepoFromOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/repo-machines-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface CodespacesRepoMachinesForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/repo-machines-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesRepoMachinesForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRepoMachinesForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRepoMachinesForAuthenticatedUserResponse,
        CodespacesRepoMachinesForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRepoMachinesForAuthenticatedUserResponse,
        CodespacesRepoMachinesForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRepoMachinesForAuthenticatedUserResponse,
        CodespacesRepoMachinesForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRepoMachinesForAuthenticatedUserResponse,
        CodespacesRepoMachinesForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRepoMachinesForAuthenticatedUserResponse,
        CodespacesRepoMachinesForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesRepoMachinesForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/repo-machines-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesRepoMachinesForAuthenticatedUserApiException(
    public val error: CodespacesRepoMachinesForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/repo-machines-for-authenticated-user")

  private object CodespacesRepoMachinesForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesRepoMachinesForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesRepoMachinesForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesRepoMachinesForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/repo-machines-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesRepoMachinesForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/repo-machines-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/repo-machines-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesRepoMachinesForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/repo-machines-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesRepoMachinesForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/repo-machines-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/repo-machines-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesRepoMachinesForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/repo-machines-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/repo-machines-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesRepoMachinesForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/repo-machines-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/repo-machines-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesRepoMachinesForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesRepoMachinesForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/repo-machines-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesRepoMachinesForAuthenticatedUserResponse = CodespacesRepoMachinesForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/set-codespaces-access` may expose through its typed API
   * exception.
   */
  public sealed interface CodespacesSetCodespacesAccessError

  /**
   * Typed response alternatives for `codespaces/set-codespaces-access`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesSetCodespacesAccessResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessResponse,
        CodespacesSetCodespacesAccessError

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessResponse,
        CodespacesSetCodespacesAccessError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessResponse,
        CodespacesSetCodespacesAccessError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessResponse,
        CodespacesSetCodespacesAccessError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessResponse,
        CodespacesSetCodespacesAccessError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessResponse
  }

  /**
   * Raised by `codespaces/set-codespaces-access` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesSetCodespacesAccessApiException(
    public val error: CodespacesSetCodespacesAccessError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/set-codespaces-access")

  private object CodespacesSetCodespacesAccessResponseDecoder : SdkResponseAlternativeDecoder<CodespacesSetCodespacesAccessResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesSetCodespacesAccessResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesSetCodespacesAccessResponse> = when {
      alternative.id == "codespaces/set-codespaces-access.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessResponse.Http404Json(
          json = CodespacesCodecs.codespacesSetCodespacesAccessResponseCodecAlternative3Registry.select(listOf("codespaces/set-codespaces-access.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessResponse.Http422Json(
          json = CodespacesCodecs.codespacesSetCodespacesAccessResponseCodecAlternative4Registry.select(listOf("codespaces/set-codespaces-access.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessResponse.Http500Json(
          json = CodespacesCodecs.codespacesSetCodespacesAccessResponseCodecAlternative5Registry.select(listOf("codespaces/set-codespaces-access.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesSetCodespacesAccessResponse = CodespacesSetCodespacesAccessResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/set-codespaces-access-users` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesSetCodespacesAccessUsersError

  /**
   * Typed response alternatives for `codespaces/set-codespaces-access-users`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesSetCodespacesAccessUsersResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessUsersResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessUsersResponse,
        CodespacesSetCodespacesAccessUsersError

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessUsersResponse,
        CodespacesSetCodespacesAccessUsersError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessUsersResponse,
        CodespacesSetCodespacesAccessUsersError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessUsersResponse,
        CodespacesSetCodespacesAccessUsersError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessUsersResponse,
        CodespacesSetCodespacesAccessUsersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetCodespacesAccessUsersResponse
  }

  /**
   * Raised by `codespaces/set-codespaces-access-users` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesSetCodespacesAccessUsersApiException(
    public val error: CodespacesSetCodespacesAccessUsersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/set-codespaces-access-users")

  private object CodespacesSetCodespacesAccessUsersResponseDecoder : SdkResponseAlternativeDecoder<CodespacesSetCodespacesAccessUsersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesSetCodespacesAccessUsersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesSetCodespacesAccessUsersResponse> = when {
      alternative.id == "codespaces/set-codespaces-access-users.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessUsersResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access-users.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessUsersResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access-users.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessUsersResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access-users.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessUsersResponse.Http404Json(
          json = CodespacesCodecs.codespacesSetCodespacesAccessUsersResponseCodecAlternative3Registry.select(listOf("codespaces/set-codespaces-access-users.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access-users.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessUsersResponse.Http422Json(
          json = CodespacesCodecs.codespacesSetCodespacesAccessUsersResponseCodecAlternative4Registry.select(listOf("codespaces/set-codespaces-access-users.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-codespaces-access-users.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesSetCodespacesAccessUsersResponse.Http500Json(
          json = CodespacesCodecs.codespacesSetCodespacesAccessUsersResponseCodecAlternative5Registry.select(listOf("codespaces/set-codespaces-access-users.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesSetCodespacesAccessUsersResponse = CodespacesSetCodespacesAccessUsersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/set-repositories-for-secret-for-authenticated-user` may
   * expose through its typed API exception.
   */
  public sealed interface CodespacesSetRepositoriesForSecretForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/set-repositories-for-secret-for-authenticated-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse,
        CodespacesSetRepositoriesForSecretForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse,
        CodespacesSetRepositoriesForSecretForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse,
        CodespacesSetRepositoriesForSecretForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse,
        CodespacesSetRepositoriesForSecretForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/set-repositories-for-secret-for-authenticated-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesSetRepositoriesForSecretForAuthenticatedUserApiException(
    public val error: CodespacesSetRepositoriesForSecretForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/set-repositories-for-secret-for-authenticated-user")

  private object CodespacesSetRepositoriesForSecretForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesSetRepositoriesForSecretForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse = CodespacesSetRepositoriesForSecretForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/set-selected-repos-for-org-secret` may expose through
   * its typed API exception.
   */
  public sealed interface CodespacesSetSelectedReposForOrgSecretError

  /**
   * Typed response alternatives for `codespaces/set-selected-repos-for-org-secret`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesSetSelectedReposForOrgSecretResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetSelectedReposForOrgSecretResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetSelectedReposForOrgSecretResponse,
        CodespacesSetSelectedReposForOrgSecretError

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetSelectedReposForOrgSecretResponse,
        CodespacesSetSelectedReposForOrgSecretError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesSetSelectedReposForOrgSecretResponse
  }

  /**
   * Raised by `codespaces/set-selected-repos-for-org-secret` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesSetSelectedReposForOrgSecretApiException(
    public val error: CodespacesSetSelectedReposForOrgSecretError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/set-selected-repos-for-org-secret")

  private object CodespacesSetSelectedReposForOrgSecretResponseDecoder : SdkResponseAlternativeDecoder<CodespacesSetSelectedReposForOrgSecretResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesSetSelectedReposForOrgSecretResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesSetSelectedReposForOrgSecretResponse> = when {
      alternative.id == "codespaces/set-selected-repos-for-org-secret.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesSetSelectedReposForOrgSecretResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-selected-repos-for-org-secret.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesSetSelectedReposForOrgSecretResponse.Http404Json(
          json = CodespacesCodecs.codespacesSetSelectedReposForOrgSecretResponseCodecAlternative1Registry.select(listOf("codespaces/set-selected-repos-for-org-secret.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/set-selected-repos-for-org-secret.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesSetSelectedReposForOrgSecretResponse.Http409NoContent(
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
    ): CodespacesSetSelectedReposForOrgSecretResponse = CodespacesSetSelectedReposForOrgSecretResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/start-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesStartForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/start-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesStartForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Http402Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse,
        CodespacesStartForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStartForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/start-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesStartForAuthenticatedUserApiException(
    public val error: CodespacesStartForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/start-for-authenticated-user")

  private object CodespacesStartForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesStartForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesStartForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesStartForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http400Json(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http400ScimJson(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative3"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http402Json(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative6" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative6Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative7" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative7Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative8" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http409Json(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative8Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/start-for-authenticated-user.response.alternative9" -> SdkResponseDecodeResult(
        value = CodespacesStartForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesStartForAuthenticatedUserResponseCodecAlternative9Registry.select(listOf("codespaces/start-for-authenticated-user.response.alternative9"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesStartForAuthenticatedUserResponse = CodespacesStartForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/stop-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesStopForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/stop-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesStopForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopForAuthenticatedUserResponse,
        CodespacesStopForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopForAuthenticatedUserResponse,
        CodespacesStopForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopForAuthenticatedUserResponse,
        CodespacesStopForAuthenticatedUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopForAuthenticatedUserResponse,
        CodespacesStopForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/stop-for-authenticated-user` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesStopForAuthenticatedUserApiException(
    public val error: CodespacesStopForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/stop-for-authenticated-user")

  private object CodespacesStopForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesStopForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesStopForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesStopForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/stop-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesStopForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesStopForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/stop-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesStopForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesStopForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/stop-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesStopForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesStopForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/stop-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesStopForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesStopForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/stop-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesStopForAuthenticatedUserResponse.Http500Json(
          json = CodespacesCodecs.codespacesStopForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("codespaces/stop-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesStopForAuthenticatedUserResponse = CodespacesStopForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/stop-in-organization` may expose through its typed API
   * exception.
   */
  public sealed interface CodespacesStopInOrganizationError

  /**
   * Typed response alternatives for `codespaces/stop-in-organization`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CodespacesStopInOrganizationResponse {
    public class SuccessJson(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopInOrganizationResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopInOrganizationResponse,
        CodespacesStopInOrganizationError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopInOrganizationResponse,
        CodespacesStopInOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopInOrganizationResponse,
        CodespacesStopInOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopInOrganizationResponse,
        CodespacesStopInOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopInOrganizationResponse,
        CodespacesStopInOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesStopInOrganizationResponse
  }

  /**
   * Raised by `codespaces/stop-in-organization` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CodespacesStopInOrganizationApiException(
    public val error: CodespacesStopInOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/stop-in-organization")

  private object CodespacesStopInOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CodespacesStopInOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesStopInOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesStopInOrganizationResponse> = when {
      alternative.id == "codespaces/stop-in-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesStopInOrganizationResponse.SuccessJson(
          json = CodespacesCodecs.codespacesStopInOrganizationResponseCodecAlternative0Registry.select(listOf("codespaces/stop-in-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-in-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesStopInOrganizationResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-in-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesStopInOrganizationResponse.Http401Json(
          json = CodespacesCodecs.codespacesStopInOrganizationResponseCodecAlternative2Registry.select(listOf("codespaces/stop-in-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-in-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesStopInOrganizationResponse.Http403Json(
          json = CodespacesCodecs.codespacesStopInOrganizationResponseCodecAlternative3Registry.select(listOf("codespaces/stop-in-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-in-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CodespacesStopInOrganizationResponse.Http404Json(
          json = CodespacesCodecs.codespacesStopInOrganizationResponseCodecAlternative4Registry.select(listOf("codespaces/stop-in-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/stop-in-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CodespacesStopInOrganizationResponse.Http500Json(
          json = CodespacesCodecs.codespacesStopInOrganizationResponseCodecAlternative5Registry.select(listOf("codespaces/stop-in-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesStopInOrganizationResponse = CodespacesStopInOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codespaces/update-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface CodespacesUpdateForAuthenticatedUserError

  /**
   * Typed response alternatives for `codespaces/update-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodespacesUpdateForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Codespace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesUpdateForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesUpdateForAuthenticatedUserResponse,
        CodespacesUpdateForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesUpdateForAuthenticatedUserResponse,
        CodespacesUpdateForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesUpdateForAuthenticatedUserResponse,
        CodespacesUpdateForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodespacesUpdateForAuthenticatedUserResponse
  }

  /**
   * Raised by `codespaces/update-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodespacesUpdateForAuthenticatedUserApiException(
    public val error: CodespacesUpdateForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codespaces/update-for-authenticated-user")

  private object CodespacesUpdateForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<CodespacesUpdateForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodespacesUpdateForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodespacesUpdateForAuthenticatedUserResponse> = when {
      alternative.id == "codespaces/update-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CodespacesUpdateForAuthenticatedUserResponse.SuccessJson(
          json = CodespacesCodecs.codespacesUpdateForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("codespaces/update-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/update-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CodespacesUpdateForAuthenticatedUserResponse.Http401Json(
          json = CodespacesCodecs.codespacesUpdateForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("codespaces/update-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/update-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CodespacesUpdateForAuthenticatedUserResponse.Http403Json(
          json = CodespacesCodecs.codespacesUpdateForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("codespaces/update-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codespaces/update-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CodespacesUpdateForAuthenticatedUserResponse.Http404Json(
          json = CodespacesCodecs.codespacesUpdateForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("codespaces/update-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodespacesUpdateForAuthenticatedUserResponse = CodespacesUpdateForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val codespacesAddRepositoryForSecretForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/add-repository-for-secret-for-authenticated-user",
          method = "PUT",
          path = "/user/codespaces/secrets/{secret_name}/repositories/{repository_id}",
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
              id = "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/add-repository-for-secret-for-authenticated-user.response.alternative4",
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

    public val codespacesAddSelectedRepoToOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/add-selected-repo-to-org-secret",
          method = "PUT",
          path = "/orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id}",
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
              id = "codespaces/add-selected-repo-to-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/add-selected-repo-to-org-secret.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/add-selected-repo-to-org-secret.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/add-selected-repo-to-org-secret.response.alternative3",
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

    public val codespacesCheckPermissionsForDevcontainerMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/check-permissions-for-devcontainer",
          method = "GET",
          path = "/repos/{owner}/{repo}/codespaces/permissions_check",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespacesPermissionsCheckForDevcontainer",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/check-permissions-for-devcontainer.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/check-permissions-for-devcontainer.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/check-permissions-for-devcontainer.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/check-permissions-for-devcontainer.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/check-permissions-for-devcontainer.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/check-permissions-for-devcontainer.response.alternative5",
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

    public val codespacesCodespaceMachinesForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/codespace-machines-for-authenticated-user",
          method = "GET",
          path = "/user/codespaces/{codespace_name}/machines",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserCodespacesMachinesGetResponse200JsonXd25f7924",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/codespace-machines-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/codespace-machines-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/codespace-machines-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/codespace-machines-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/codespace-machines-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/codespace-machines-for-authenticated-user.response.alternative5",
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

    public val codespacesCreateForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/create-for-authenticated-user",
          method = "POST",
          path = "/user/codespaces",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201, 202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-for-authenticated-user.response.alternative5",
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

    public val codespacesCreateOrUpdateOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/create-or-update-org-secret",
          method = "PUT",
          path = "/orgs/{org}/codespaces/secrets/{secret_name}",
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
              id = "codespaces/create-or-update-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-or-update-org-secret.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-or-update-org-secret.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-or-update-org-secret.response.alternative3",
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

    public val codespacesCreateOrUpdateRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/create-or-update-repo-secret",
          method = "PUT",
          path = "/repos/{owner}/{repo}/codespaces/secrets/{secret_name}",
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
              id = "codespaces/create-or-update-repo-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-or-update-repo-secret.response.alternative1",
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

    public val codespacesCreateOrUpdateSecretForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/create-or-update-secret-for-authenticated-user",
          method = "PUT",
          path = "/user/codespaces/secrets/{secret_name}",
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
              id = "codespaces/create-or-update-secret-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-or-update-secret-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-or-update-secret-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-or-update-secret-for-authenticated-user.response.alternative3",
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

    public val codespacesCreateWithPrForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/create-with-pr-for-authenticated-user",
          method = "POST",
          path = "/repos/{owner}/{repo}/pulls/{pull_number}/codespaces",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201, 202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-pr-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-pr-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-pr-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-pr-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-pr-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-pr-for-authenticated-user.response.alternative5",
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

    public val codespacesCreateWithRepoForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/create-with-repo-for-authenticated-user",
          method = "POST",
          path = "/repos/{owner}/{repo}/codespaces",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201, 202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-repo-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-repo-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-repo-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-repo-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-repo-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-repo-for-authenticated-user.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-repo-for-authenticated-user.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/create-with-repo-for-authenticated-user.response.alternative7",
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

    public val codespacesDeleteCodespacesAccessUsersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/delete-codespaces-access-users",
          method = "DELETE",
          path = "/orgs/{org}/codespaces/access/selected_users",
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
              id = "codespaces/delete-codespaces-access-users.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-codespaces-access-users.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-codespaces-access-users.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-codespaces-access-users.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-codespaces-access-users.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-codespaces-access-users.response.alternative5",
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

    public val codespacesDeleteForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/delete-for-authenticated-user",
          method = "DELETE",
          path = "/user/codespaces/{codespace_name}",
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
              id = "codespaces/delete-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-for-authenticated-user.response.alternative5",
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

    public val codespacesDeleteFromOrganizationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/delete-from-organization",
          method = "DELETE",
          path = "/orgs/{org}/members/{username}/codespaces/{codespace_name}",
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
              id = "codespaces/delete-from-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-from-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-from-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-from-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-from-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-from-organization.response.alternative5",
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

    public val codespacesDeleteOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/delete-org-secret",
          method = "DELETE",
          path = "/orgs/{org}/codespaces/secrets/{secret_name}",
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
              id = "codespaces/delete-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/delete-org-secret.response.alternative1",
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

    public val codespacesDeleteRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/delete-repo-secret",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/codespaces/secrets/{secret_name}",
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
              id = "codespaces/delete-repo-secret.response.alternative0",
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

    public val codespacesDeleteSecretForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/delete-secret-for-authenticated-user",
          method = "DELETE",
          path = "/user/codespaces/secrets/{secret_name}",
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
              id = "codespaces/delete-secret-for-authenticated-user.response.alternative0",
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

    public val codespacesExportForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/export-for-authenticated-user",
          method = "POST",
          path = "/user/codespaces/{codespace_name}/exports",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(202),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 202),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespaceExportDetails",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/export-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/export-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/export-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/export-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/export-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/export-for-authenticated-user.response.alternative5",
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

    public val codespacesGetCodespacesForUserInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-codespaces-for-user-in-org",
          method = "GET",
          path = "/orgs/{org}/members/{username}/codespaces",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsMembersCodespacesGetResponse200JsonX144ba75b",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-codespaces-for-user-in-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-codespaces-for-user-in-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-codespaces-for-user-in-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-codespaces-for-user-in-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-codespaces-for-user-in-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-codespaces-for-user-in-org.response.alternative5",
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

    public val codespacesGetExportDetailsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-export-details-for-authenticated-user",
          method = "GET",
          path = "/user/codespaces/{codespace_name}/exports/{export_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespaceExportDetails",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-export-details-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-export-details-for-authenticated-user.response.alternative1",
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

    public val codespacesGetForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-for-authenticated-user",
          method = "GET",
          path = "/user/codespaces/{codespace_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-for-authenticated-user.response.alternative5",
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

    public val codespacesGetOrgPublicKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-org-public-key",
          method = "GET",
          path = "/orgs/{org}/codespaces/secrets/public-key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespacesPublicKey",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-org-public-key.response.alternative0",
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

    public val codespacesGetOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-org-secret",
          method = "GET",
          path = "/orgs/{org}/codespaces/secrets/{secret_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespacesOrgSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-org-secret.response.alternative0",
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

    public val codespacesGetPublicKeyForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-public-key-for-authenticated-user",
          method = "GET",
          path = "/user/codespaces/secrets/public-key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespacesUserPublicKey",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-public-key-for-authenticated-user.response.alternative0",
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

    public val codespacesGetRepoPublicKeyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-repo-public-key",
          method = "GET",
          path = "/repos/{owner}/{repo}/codespaces/secrets/public-key",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespacesPublicKey",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-repo-public-key.response.alternative0",
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

    public val codespacesGetRepoSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-repo-secret",
          method = "GET",
          path = "/repos/{owner}/{repo}/codespaces/secrets/{secret_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RepoCodespacesSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-repo-secret.response.alternative0",
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

    public val codespacesGetSecretForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/get-secret-for-authenticated-user",
          method = "GET",
          path = "/user/codespaces/secrets/{secret_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespacesSecret",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/get-secret-for-authenticated-user.response.alternative0",
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

    public val codespacesListDevcontainersInRepositoryForAuthenticatedUserMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-devcontainers-in-repository-for-authenticated-user",
          method = "GET",
          path = "/repos/{owner}/{repo}/codespaces/devcontainers",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCodespacesDevcontainersGetResponse200JsonXe46565c6",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-devcontainers-in-repository-for-authenticated-user.response.alternative6",
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

    public val codespacesListForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-for-authenticated-user",
          method = "GET",
          path = "/user/codespaces",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserCodespacesGetResponse200JsonX10571de7",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-for-authenticated-user.response.alternative5",
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

    public val codespacesListInOrganizationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-in-organization",
          method = "GET",
          path = "/orgs/{org}/codespaces",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCodespacesGetResponse200JsonX93e6311d",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-organization.response.alternative5",
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

    public val codespacesListInRepositoryForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-in-repository-for-authenticated-user",
          method = "GET",
          path = "/repos/{owner}/{repo}/codespaces",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCodespacesGetResponse200JsonX2f5d5815",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-repository-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-repository-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-repository-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-repository-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-in-repository-for-authenticated-user.response.alternative4",
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

    public val codespacesListOrgSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-org-secrets",
          method = "GET",
          path = "/orgs/{org}/codespaces/secrets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCodespacesSecretsGetResponse200JsonX276108ae",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-org-secrets.response.alternative0",
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

    public val codespacesListRepoSecretsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-repo-secrets",
          method = "GET",
          path = "/repos/{owner}/{repo}/codespaces/secrets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCodespacesSecretsGetResponse200JsonXf20f85d5",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-repo-secrets.response.alternative0",
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

    public val codespacesListRepositoriesForSecretForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-repositories-for-secret-for-authenticated-user",
          method = "GET",
          path = "/user/codespaces/secrets/{secret_name}/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserCodespacesSecretsRepositoriesGetResponse200JsonXc78ab5ee",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-repositories-for-secret-for-authenticated-user.response.alternative4",
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

    public val codespacesListSecretsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-secrets-for-authenticated-user",
          method = "GET",
          path = "/user/codespaces/secrets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserCodespacesSecretsGetResponse200JsonXaa96d197",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-secrets-for-authenticated-user.response.alternative0",
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

    public val codespacesListSelectedReposForOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/list-selected-repos-for-org-secret",
          method = "GET",
          path = "/orgs/{org}/codespaces/secrets/{secret_name}/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCodespacesSecretsRepositoriesGetResponse200JsonX97832d3e",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-selected-repos-for-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/list-selected-repos-for-org-secret.response.alternative1",
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

    public val codespacesPreFlightWithRepoForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/pre-flight-with-repo-for-authenticated-user",
          method = "GET",
          path = "/repos/{owner}/{repo}/codespaces/new",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/pre-flight-with-repo-for-authenticated-user.response.alternative3",
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

    public val codespacesPublishForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/publish-for-authenticated-user",
          method = "POST",
          path = "/user/codespaces/{codespace_name}/publish",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CodespaceWithFullRepository",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/publish-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/publish-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/publish-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/publish-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/publish-for-authenticated-user.response.alternative4",
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

    public val codespacesRemoveRepositoryForSecretForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/remove-repository-for-secret-for-authenticated-user",
          method = "DELETE",
          path = "/user/codespaces/secrets/{secret_name}/repositories/{repository_id}",
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
              id = "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/remove-repository-for-secret-for-authenticated-user.response.alternative4",
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

    public val codespacesRemoveSelectedRepoFromOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/remove-selected-repo-from-org-secret",
          method = "DELETE",
          path = "/orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id}",
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
              id = "codespaces/remove-selected-repo-from-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/remove-selected-repo-from-org-secret.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/remove-selected-repo-from-org-secret.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/remove-selected-repo-from-org-secret.response.alternative3",
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

    public val codespacesRepoMachinesForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/repo-machines-for-authenticated-user",
          method = "GET",
          path = "/repos/{owner}/{repo}/codespaces/machines",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCodespacesMachinesGetResponse200JsonXaaa45b81",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/repo-machines-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/repo-machines-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/repo-machines-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/repo-machines-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/repo-machines-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/repo-machines-for-authenticated-user.response.alternative5",
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

    public val codespacesSetCodespacesAccessMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/set-codespaces-access",
          method = "PUT",
          path = "/orgs/{org}/codespaces/access",
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
              id = "codespaces/set-codespaces-access.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access.response.alternative5",
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

    public val codespacesSetCodespacesAccessUsersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/set-codespaces-access-users",
          method = "POST",
          path = "/orgs/{org}/codespaces/access/selected_users",
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
              id = "codespaces/set-codespaces-access-users.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access-users.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access-users.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access-users.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access-users.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-codespaces-access-users.response.alternative5",
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

    public val codespacesSetRepositoriesForSecretForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/set-repositories-for-secret-for-authenticated-user",
          method = "PUT",
          path = "/user/codespaces/secrets/{secret_name}/repositories",
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
              id = "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-repositories-for-secret-for-authenticated-user.response.alternative4",
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

    public val codespacesSetSelectedReposForOrgSecretMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/set-selected-repos-for-org-secret",
          method = "PUT",
          path = "/orgs/{org}/codespaces/secrets/{secret_name}/repositories",
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
              id = "codespaces/set-selected-repos-for-org-secret.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-selected-repos-for-org-secret.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/set-selected-repos-for-org-secret.response.alternative2",
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

    public val codespacesStartForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/start-for-authenticated-user",
          method = "POST",
          path = "/user/codespaces/{codespace_name}/start",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/start-for-authenticated-user.response.alternative9",
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

    public val codespacesStopForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/stop-for-authenticated-user",
          method = "POST",
          path = "/user/codespaces/{codespace_name}/stop",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-for-authenticated-user.response.alternative4",
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

    public val codespacesStopInOrganizationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/stop-in-organization",
          method = "POST",
          path = "/orgs/{org}/members/{username}/codespaces/{codespace_name}/stop",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-in-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-in-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-in-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-in-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-in-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/stop-in-organization.response.alternative5",
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

    public val codespacesUpdateForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codespaces/update-for-authenticated-user",
          method = "PATCH",
          path = "/user/codespaces/{codespace_name}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Codespace",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/update-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/update-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/update-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codespaces/update-for-authenticated-user.response.alternative3",
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
