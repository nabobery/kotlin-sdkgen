package io.github.nabobery.sdkgen.github.generated.apps

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
import io.github.nabobery.sdkgen.github.generated.Authorization
import io.github.nabobery.sdkgen.github.generated.BasicError
import io.github.nabobery.sdkgen.github.generated.HookDelivery
import io.github.nabobery.sdkgen.github.generated.HookDeliveryItem
import io.github.nabobery.sdkgen.github.generated.InlineAppHookConfigPatchRequestJsonXac78b7f1
import io.github.nabobery.sdkgen.github.generated.InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c
import io.github.nabobery.sdkgen.github.generated.InlineAppManifestsConversionsPostResponse201JsonX50717f97
import io.github.nabobery.sdkgen.github.generated.InlineApplicationsGrantDeleteRequestJsonX60601b0d
import io.github.nabobery.sdkgen.github.generated.InlineApplicationsTokenDeleteRequestJsonXc90fd95f
import io.github.nabobery.sdkgen.github.generated.InlineApplicationsTokenPatchRequestJsonX56aa4ab6
import io.github.nabobery.sdkgen.github.generated.InlineApplicationsTokenPostRequestJsonX9c98b7a7
import io.github.nabobery.sdkgen.github.generated.InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8
import io.github.nabobery.sdkgen.github.generated.InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8
import io.github.nabobery.sdkgen.github.generated.InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c
import io.github.nabobery.sdkgen.github.generated.InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837
import io.github.nabobery.sdkgen.github.generated.InlineSortParameterX37db756f
import io.github.nabobery.sdkgen.github.generated.InlineUserInstallationsGetResponse200JsonXfc4c02bc
import io.github.nabobery.sdkgen.github.generated.InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc
import io.github.nabobery.sdkgen.github.generated.InlineWebhookDeliveryStatusParameterX02ba252e
import io.github.nabobery.sdkgen.github.generated.Installation
import io.github.nabobery.sdkgen.github.generated.InstallationToken
import io.github.nabobery.sdkgen.github.generated.Integration
import io.github.nabobery.sdkgen.github.generated.IntegrationInstallationRequest
import io.github.nabobery.sdkgen.github.generated.MarketplaceListingPlan
import io.github.nabobery.sdkgen.github.generated.MarketplacePurchase
import io.github.nabobery.sdkgen.github.generated.ScimError
import io.github.nabobery.sdkgen.github.generated.SdkJson
import io.github.nabobery.sdkgen.github.generated.UserMarketplacePurchase
import io.github.nabobery.sdkgen.github.generated.ValidationError
import io.github.nabobery.sdkgen.github.generated.ValidationErrorSimple
import io.github.nabobery.sdkgen.github.generated.WebhookConfig
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.json.JsonObject

internal object AppsCodecs {
  private val appsAddRepoToInstallationForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/add-repo-to-installation-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsAddRepoToInstallationForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsAddRepoToInstallationForAuthenticatedUserResponseCodecAlternative2Codec)

  private val appsAddRepoToInstallationForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/add-repo-to-installation-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val appsAddRepoToInstallationForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsAddRepoToInstallationForAuthenticatedUserResponseCodecAlternative3Codec)

  internal val appsAddRepoToInstallationForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsAddRepoToInstallationForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val APPSCHECKTOKEN_REQUEST_CODEC_ID: String = "apps/check-token.request"

  private val appsCheckTokenRequestCodec:
      MediaTypeCodec<InlineApplicationsTokenPostRequestJsonX9c98b7a7> =
      KotlinxSerializationCodec(APPSCHECKTOKEN_REQUEST_CODEC_ID, InlineApplicationsTokenPostRequestJsonX9c98b7a7.Serializer, SdkJson)

  internal const val APPSCHECKTOKEN_RESPONSE_CODEC_ID: String = "apps/check-token.response"

  private val appsCheckTokenResponseCodec: MediaTypeCodec<Authorization> =
      KotlinxSerializationCodec(APPSCHECKTOKEN_RESPONSE_CODEC_ID, Authorization.Serializer, SdkJson)

  private val appsCheckTokenResponseCodecAlternative0Codec: MediaTypeCodec<Authorization> =
      KotlinxSerializationCodec("apps/check-token.response.alternative0", Authorization.Serializer, SdkJson)

  internal val appsCheckTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Authorization> =
      MediaTypeCodecRegistry.of(appsCheckTokenResponseCodecAlternative0Codec)

  private val appsCheckTokenResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/check-token.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsCheckTokenResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsCheckTokenResponseCodecAlternative1Codec)

  private val appsCheckTokenResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("apps/check-token.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val appsCheckTokenResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsCheckTokenResponseCodecAlternative2Codec)

  internal val appsCheckTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineApplicationsTokenPostRequestJsonX9c98b7a7> =
      MediaTypeCodecRegistry.of(appsCheckTokenRequestCodec)

  internal val appsCheckTokenResponseCodecRegistry: MediaTypeCodecRegistry<Authorization> =
      MediaTypeCodecRegistry.of(appsCheckTokenResponseCodec)

  internal const val APPSCREATEFROMMANIFEST_RESPONSE_CODEC_ID: String =
      "apps/create-from-manifest.response"

  private val appsCreateFromManifestResponseCodec:
      MediaTypeCodec<InlineAppManifestsConversionsPostResponse201JsonX50717f97> =
      KotlinxSerializationCodec(APPSCREATEFROMMANIFEST_RESPONSE_CODEC_ID, InlineAppManifestsConversionsPostResponse201JsonX50717f97.Serializer, SdkJson)

  private val appsCreateFromManifestResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAppManifestsConversionsPostResponse201JsonX50717f97> =
      KotlinxSerializationCodec("apps/create-from-manifest.response.alternative0", InlineAppManifestsConversionsPostResponse201JsonX50717f97.Serializer, SdkJson)

  internal val appsCreateFromManifestResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAppManifestsConversionsPostResponse201JsonX50717f97> =
      MediaTypeCodecRegistry.of(appsCreateFromManifestResponseCodecAlternative0Codec)

  private val appsCreateFromManifestResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/create-from-manifest.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsCreateFromManifestResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsCreateFromManifestResponseCodecAlternative1Codec)

  private val appsCreateFromManifestResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("apps/create-from-manifest.response.alternative2", ValidationErrorSimple.Serializer, SdkJson)

  internal val appsCreateFromManifestResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(appsCreateFromManifestResponseCodecAlternative2Codec)

  internal val appsCreateFromManifestRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsCreateFromManifestResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAppManifestsConversionsPostResponse201JsonX50717f97> =
      MediaTypeCodecRegistry.of(appsCreateFromManifestResponseCodec)

  internal const val APPSCREATEINSTALLATIONACCESSTOKEN_REQUEST_CODEC_ID: String =
      "apps/create-installation-access-token.request"

  private val appsCreateInstallationAccessTokenRequestCodec:
      MediaTypeCodec<InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c?> =
      KotlinxSerializationCodec(APPSCREATEINSTALLATIONACCESSTOKEN_REQUEST_CODEC_ID, InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c.Serializer.nullable, SdkJson)

  internal const val APPSCREATEINSTALLATIONACCESSTOKEN_RESPONSE_CODEC_ID: String =
      "apps/create-installation-access-token.response"

  private val appsCreateInstallationAccessTokenResponseCodec: MediaTypeCodec<InstallationToken> =
      KotlinxSerializationCodec(APPSCREATEINSTALLATIONACCESSTOKEN_RESPONSE_CODEC_ID, InstallationToken.Serializer, SdkJson)

  private val appsCreateInstallationAccessTokenResponseCodecAlternative0Codec:
      MediaTypeCodec<InstallationToken> =
      KotlinxSerializationCodec("apps/create-installation-access-token.response.alternative0", InstallationToken.Serializer, SdkJson)

  internal val appsCreateInstallationAccessTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InstallationToken> =
      MediaTypeCodecRegistry.of(appsCreateInstallationAccessTokenResponseCodecAlternative0Codec)

  private val appsCreateInstallationAccessTokenResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/create-installation-access-token.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsCreateInstallationAccessTokenResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsCreateInstallationAccessTokenResponseCodecAlternative1Codec)

  private val appsCreateInstallationAccessTokenResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/create-installation-access-token.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsCreateInstallationAccessTokenResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsCreateInstallationAccessTokenResponseCodecAlternative2Codec)

  private val appsCreateInstallationAccessTokenResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/create-installation-access-token.response.alternative3", BasicError.Serializer, SdkJson)

  internal val appsCreateInstallationAccessTokenResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsCreateInstallationAccessTokenResponseCodecAlternative3Codec)

  private val appsCreateInstallationAccessTokenResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("apps/create-installation-access-token.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val appsCreateInstallationAccessTokenResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsCreateInstallationAccessTokenResponseCodecAlternative4Codec)

  internal val appsCreateInstallationAccessTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c?> =
      MediaTypeCodecRegistry.of(appsCreateInstallationAccessTokenRequestCodec)

  internal val appsCreateInstallationAccessTokenResponseCodecRegistry:
      MediaTypeCodecRegistry<InstallationToken> =
      MediaTypeCodecRegistry.of(appsCreateInstallationAccessTokenResponseCodec)

  internal const val APPSDELETEAUTHORIZATION_REQUEST_CODEC_ID: String =
      "apps/delete-authorization.request"

  private val appsDeleteAuthorizationRequestCodec:
      MediaTypeCodec<InlineApplicationsGrantDeleteRequestJsonX60601b0d> =
      KotlinxSerializationCodec(APPSDELETEAUTHORIZATION_REQUEST_CODEC_ID, InlineApplicationsGrantDeleteRequestJsonX60601b0d.Serializer, SdkJson)

  private val appsDeleteAuthorizationResponseCodecAlternative1Codec: MediaTypeCodec<ValidationError>
      =
      KotlinxSerializationCodec("apps/delete-authorization.response.alternative1", ValidationError.Serializer, SdkJson)

  internal val appsDeleteAuthorizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsDeleteAuthorizationResponseCodecAlternative1Codec)

  internal val appsDeleteAuthorizationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineApplicationsGrantDeleteRequestJsonX60601b0d> =
      MediaTypeCodecRegistry.of(appsDeleteAuthorizationRequestCodec)

  internal val appsDeleteAuthorizationResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val appsDeleteInstallationResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/delete-installation.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsDeleteInstallationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsDeleteInstallationResponseCodecAlternative1Codec)

  internal val appsDeleteInstallationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsDeleteInstallationResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val APPSDELETETOKEN_REQUEST_CODEC_ID: String = "apps/delete-token.request"

  private val appsDeleteTokenRequestCodec:
      MediaTypeCodec<InlineApplicationsTokenDeleteRequestJsonXc90fd95f> =
      KotlinxSerializationCodec(APPSDELETETOKEN_REQUEST_CODEC_ID, InlineApplicationsTokenDeleteRequestJsonXc90fd95f.Serializer, SdkJson)

  private val appsDeleteTokenResponseCodecAlternative1Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("apps/delete-token.response.alternative1", ValidationError.Serializer, SdkJson)

  internal val appsDeleteTokenResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsDeleteTokenResponseCodecAlternative1Codec)

  internal val appsDeleteTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineApplicationsTokenDeleteRequestJsonXc90fd95f> =
      MediaTypeCodecRegistry.of(appsDeleteTokenRequestCodec)

  internal val appsDeleteTokenResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val APPSGETAUTHENTICATED_RESPONSE_CODEC_ID: String =
      "apps/get-authenticated.response"

  private val appsGetAuthenticatedResponseCodec: MediaTypeCodec<Integration?> =
      KotlinxSerializationCodec(APPSGETAUTHENTICATED_RESPONSE_CODEC_ID, Integration.Serializer.nullable, SdkJson)

  private val appsGetAuthenticatedResponseCodecAlternative0Codec: MediaTypeCodec<Integration?> =
      KotlinxSerializationCodec("apps/get-authenticated.response.alternative0", Integration.Serializer.nullable, SdkJson)

  internal val appsGetAuthenticatedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Integration?> =
      MediaTypeCodecRegistry.of(appsGetAuthenticatedResponseCodecAlternative0Codec)

  internal val appsGetAuthenticatedRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetAuthenticatedResponseCodecRegistry: MediaTypeCodecRegistry<Integration?> =
      MediaTypeCodecRegistry.of(appsGetAuthenticatedResponseCodec)

  internal const val APPSGETBYSLUG_RESPONSE_CODEC_ID: String = "apps/get-by-slug.response"

  private val appsGetBySlugResponseCodec: MediaTypeCodec<Integration?> =
      KotlinxSerializationCodec(APPSGETBYSLUG_RESPONSE_CODEC_ID, Integration.Serializer.nullable, SdkJson)

  private val appsGetBySlugResponseCodecAlternative0Codec: MediaTypeCodec<Integration?> =
      KotlinxSerializationCodec("apps/get-by-slug.response.alternative0", Integration.Serializer.nullable, SdkJson)

  internal val appsGetBySlugResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Integration?>
      = MediaTypeCodecRegistry.of(appsGetBySlugResponseCodecAlternative0Codec)

  private val appsGetBySlugResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-by-slug.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsGetBySlugResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetBySlugResponseCodecAlternative1Codec)

  private val appsGetBySlugResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-by-slug.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsGetBySlugResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetBySlugResponseCodecAlternative2Codec)

  internal val appsGetBySlugRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetBySlugResponseCodecRegistry: MediaTypeCodecRegistry<Integration?> =
      MediaTypeCodecRegistry.of(appsGetBySlugResponseCodec)

  internal const val APPSGETINSTALLATION_RESPONSE_CODEC_ID: String =
      "apps/get-installation.response"

  private val appsGetInstallationResponseCodec: MediaTypeCodec<Installation> =
      KotlinxSerializationCodec(APPSGETINSTALLATION_RESPONSE_CODEC_ID, Installation.Serializer, SdkJson)

  private val appsGetInstallationResponseCodecAlternative0Codec: MediaTypeCodec<Installation> =
      KotlinxSerializationCodec("apps/get-installation.response.alternative0", Installation.Serializer, SdkJson)

  internal val appsGetInstallationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Installation> =
      MediaTypeCodecRegistry.of(appsGetInstallationResponseCodecAlternative0Codec)

  private val appsGetInstallationResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-installation.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsGetInstallationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetInstallationResponseCodecAlternative1Codec)

  internal val appsGetInstallationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetInstallationResponseCodecRegistry: MediaTypeCodecRegistry<Installation> =
      MediaTypeCodecRegistry.of(appsGetInstallationResponseCodec)

  internal const val APPSGETORGINSTALLATION_RESPONSE_CODEC_ID: String =
      "apps/get-org-installation.response"

  private val appsGetOrgInstallationResponseCodec: MediaTypeCodec<Installation> =
      KotlinxSerializationCodec(APPSGETORGINSTALLATION_RESPONSE_CODEC_ID, Installation.Serializer, SdkJson)

  private val appsGetOrgInstallationResponseCodecAlternative0Codec: MediaTypeCodec<Installation> =
      KotlinxSerializationCodec("apps/get-org-installation.response.alternative0", Installation.Serializer, SdkJson)

  internal val appsGetOrgInstallationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Installation> =
      MediaTypeCodecRegistry.of(appsGetOrgInstallationResponseCodecAlternative0Codec)

  internal val appsGetOrgInstallationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetOrgInstallationResponseCodecRegistry: MediaTypeCodecRegistry<Installation> =
      MediaTypeCodecRegistry.of(appsGetOrgInstallationResponseCodec)

  internal const val APPSGETREPOINSTALLATION_RESPONSE_CODEC_ID: String =
      "apps/get-repo-installation.response"

  private val appsGetRepoInstallationResponseCodec: MediaTypeCodec<Installation> =
      KotlinxSerializationCodec(APPSGETREPOINSTALLATION_RESPONSE_CODEC_ID, Installation.Serializer, SdkJson)

  private val appsGetRepoInstallationResponseCodecAlternative0Codec: MediaTypeCodec<Installation> =
      KotlinxSerializationCodec("apps/get-repo-installation.response.alternative0", Installation.Serializer, SdkJson)

  internal val appsGetRepoInstallationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Installation> =
      MediaTypeCodecRegistry.of(appsGetRepoInstallationResponseCodecAlternative0Codec)

  private val appsGetRepoInstallationResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-repo-installation.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsGetRepoInstallationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetRepoInstallationResponseCodecAlternative1Codec)

  private val appsGetRepoInstallationResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-repo-installation.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsGetRepoInstallationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetRepoInstallationResponseCodecAlternative2Codec)

  internal val appsGetRepoInstallationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetRepoInstallationResponseCodecRegistry: MediaTypeCodecRegistry<Installation> =
      MediaTypeCodecRegistry.of(appsGetRepoInstallationResponseCodec)

  internal const val APPSGETSUBSCRIPTIONPLANFORACCOUNT_RESPONSE_CODEC_ID: String =
      "apps/get-subscription-plan-for-account.response"

  private val appsGetSubscriptionPlanForAccountResponseCodec: MediaTypeCodec<MarketplacePurchase> =
      KotlinxSerializationCodec(APPSGETSUBSCRIPTIONPLANFORACCOUNT_RESPONSE_CODEC_ID, MarketplacePurchase.Serializer, SdkJson)

  private val appsGetSubscriptionPlanForAccountResponseCodecAlternative0Codec:
      MediaTypeCodec<MarketplacePurchase> =
      KotlinxSerializationCodec("apps/get-subscription-plan-for-account.response.alternative0", MarketplacePurchase.Serializer, SdkJson)

  internal val appsGetSubscriptionPlanForAccountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<MarketplacePurchase> =
      MediaTypeCodecRegistry.of(appsGetSubscriptionPlanForAccountResponseCodecAlternative0Codec)

  private val appsGetSubscriptionPlanForAccountResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-subscription-plan-for-account.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsGetSubscriptionPlanForAccountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetSubscriptionPlanForAccountResponseCodecAlternative1Codec)

  private val appsGetSubscriptionPlanForAccountResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-subscription-plan-for-account.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsGetSubscriptionPlanForAccountResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetSubscriptionPlanForAccountResponseCodecAlternative2Codec)

  internal val appsGetSubscriptionPlanForAccountRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetSubscriptionPlanForAccountResponseCodecRegistry:
      MediaTypeCodecRegistry<MarketplacePurchase> =
      MediaTypeCodecRegistry.of(appsGetSubscriptionPlanForAccountResponseCodec)

  internal const val APPSGETSUBSCRIPTIONPLANFORACCOUNTSTUBBED_RESPONSE_CODEC_ID: String =
      "apps/get-subscription-plan-for-account-stubbed.response"

  private val appsGetSubscriptionPlanForAccountStubbedResponseCodec:
      MediaTypeCodec<MarketplacePurchase> =
      KotlinxSerializationCodec(APPSGETSUBSCRIPTIONPLANFORACCOUNTSTUBBED_RESPONSE_CODEC_ID, MarketplacePurchase.Serializer, SdkJson)

  private val appsGetSubscriptionPlanForAccountStubbedResponseCodecAlternative0Codec:
      MediaTypeCodec<MarketplacePurchase> =
      KotlinxSerializationCodec("apps/get-subscription-plan-for-account-stubbed.response.alternative0", MarketplacePurchase.Serializer, SdkJson)

  internal val appsGetSubscriptionPlanForAccountStubbedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<MarketplacePurchase> =
      MediaTypeCodecRegistry.of(appsGetSubscriptionPlanForAccountStubbedResponseCodecAlternative0Codec)

  private val appsGetSubscriptionPlanForAccountStubbedResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-subscription-plan-for-account-stubbed.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsGetSubscriptionPlanForAccountStubbedResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetSubscriptionPlanForAccountStubbedResponseCodecAlternative1Codec)

  internal val appsGetSubscriptionPlanForAccountStubbedRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsGetSubscriptionPlanForAccountStubbedResponseCodecRegistry:
      MediaTypeCodecRegistry<MarketplacePurchase> =
      MediaTypeCodecRegistry.of(appsGetSubscriptionPlanForAccountStubbedResponseCodec)

  internal const val APPSGETUSERINSTALLATION_RESPONSE_CODEC_ID: String =
      "apps/get-user-installation.response"

  private val appsGetUserInstallationResponseCodec: MediaTypeCodec<Installation> =
      KotlinxSerializationCodec(APPSGETUSERINSTALLATION_RESPONSE_CODEC_ID, Installation.Serializer, SdkJson)

  private val appsGetUserInstallationResponseCodecAlternative0Codec: MediaTypeCodec<Installation> =
      KotlinxSerializationCodec("apps/get-user-installation.response.alternative0", Installation.Serializer, SdkJson)

  internal val appsGetUserInstallationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Installation> =
      MediaTypeCodecRegistry.of(appsGetUserInstallationResponseCodecAlternative0Codec)

  internal val appsGetUserInstallationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetUserInstallationResponseCodecRegistry: MediaTypeCodecRegistry<Installation> =
      MediaTypeCodecRegistry.of(appsGetUserInstallationResponseCodec)

  internal const val APPSGETWEBHOOKCONFIGFORAPP_RESPONSE_CODEC_ID: String =
      "apps/get-webhook-config-for-app.response"

  private val appsGetWebhookConfigForAppResponseCodec: MediaTypeCodec<WebhookConfig> =
      KotlinxSerializationCodec(APPSGETWEBHOOKCONFIGFORAPP_RESPONSE_CODEC_ID, WebhookConfig.Serializer, SdkJson)

  private val appsGetWebhookConfigForAppResponseCodecAlternative0Codec:
      MediaTypeCodec<WebhookConfig> =
      KotlinxSerializationCodec("apps/get-webhook-config-for-app.response.alternative0", WebhookConfig.Serializer, SdkJson)

  internal val appsGetWebhookConfigForAppResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<WebhookConfig> =
      MediaTypeCodecRegistry.of(appsGetWebhookConfigForAppResponseCodecAlternative0Codec)

  internal val appsGetWebhookConfigForAppRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetWebhookConfigForAppResponseCodecRegistry:
      MediaTypeCodecRegistry<WebhookConfig> =
      MediaTypeCodecRegistry.of(appsGetWebhookConfigForAppResponseCodec)

  internal const val APPSGETWEBHOOKDELIVERY_RESPONSE_CODEC_ID: String =
      "apps/get-webhook-delivery.response"

  private val appsGetWebhookDeliveryResponseCodec: MediaTypeCodec<HookDelivery> =
      KotlinxSerializationCodec(APPSGETWEBHOOKDELIVERY_RESPONSE_CODEC_ID, HookDelivery.Serializer, SdkJson)

  private val appsGetWebhookDeliveryResponseCodecAlternative0Codec: MediaTypeCodec<HookDelivery> =
      KotlinxSerializationCodec("apps/get-webhook-delivery.response.alternative0", HookDelivery.Serializer, SdkJson)

  internal val appsGetWebhookDeliveryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<HookDelivery> =
      MediaTypeCodecRegistry.of(appsGetWebhookDeliveryResponseCodecAlternative0Codec)

  private val appsGetWebhookDeliveryResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/get-webhook-delivery.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsGetWebhookDeliveryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsGetWebhookDeliveryResponseCodecAlternative1Codec)

  private val appsGetWebhookDeliveryResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("apps/get-webhook-delivery.response.alternative2", ScimError.Serializer, SdkJson)

  internal val appsGetWebhookDeliveryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(appsGetWebhookDeliveryResponseCodecAlternative2Codec)

  private val appsGetWebhookDeliveryResponseCodecAlternative3Codec: MediaTypeCodec<ValidationError>
      =
      KotlinxSerializationCodec("apps/get-webhook-delivery.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val appsGetWebhookDeliveryResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsGetWebhookDeliveryResponseCodecAlternative3Codec)

  internal val appsGetWebhookDeliveryRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsGetWebhookDeliveryResponseCodecRegistry: MediaTypeCodecRegistry<HookDelivery> =
      MediaTypeCodecRegistry.of(appsGetWebhookDeliveryResponseCodec)

  internal const val APPSLISTACCOUNTSFORPLAN_RESPONSE_CODEC_ID: String =
      "apps/list-accounts-for-plan.response"

  private val appsListAccountsForPlanResponseCodec: MediaTypeCodec<List<MarketplacePurchase>> =
      KotlinxSerializationCodec(APPSLISTACCOUNTSFORPLAN_RESPONSE_CODEC_ID, ListSerializer(MarketplacePurchase.Serializer), SdkJson)

  private val appsListAccountsForPlanResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MarketplacePurchase>> =
      KotlinxSerializationCodec("apps/list-accounts-for-plan.response.alternative0", ListSerializer(MarketplacePurchase.Serializer), SdkJson)

  internal val appsListAccountsForPlanResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MarketplacePurchase>> =
      MediaTypeCodecRegistry.of(appsListAccountsForPlanResponseCodecAlternative0Codec)

  private val appsListAccountsForPlanResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-accounts-for-plan.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsListAccountsForPlanResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListAccountsForPlanResponseCodecAlternative1Codec)

  private val appsListAccountsForPlanResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-accounts-for-plan.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsListAccountsForPlanResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListAccountsForPlanResponseCodecAlternative2Codec)

  private val appsListAccountsForPlanResponseCodecAlternative3Codec: MediaTypeCodec<ValidationError>
      =
      KotlinxSerializationCodec("apps/list-accounts-for-plan.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val appsListAccountsForPlanResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsListAccountsForPlanResponseCodecAlternative3Codec)

  internal val appsListAccountsForPlanRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsListAccountsForPlanResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MarketplacePurchase>> =
      MediaTypeCodecRegistry.of(appsListAccountsForPlanResponseCodec)

  internal const val APPSLISTACCOUNTSFORPLANSTUBBED_RESPONSE_CODEC_ID: String =
      "apps/list-accounts-for-plan-stubbed.response"

  private val appsListAccountsForPlanStubbedResponseCodec: MediaTypeCodec<List<MarketplacePurchase>>
      =
      KotlinxSerializationCodec(APPSLISTACCOUNTSFORPLANSTUBBED_RESPONSE_CODEC_ID, ListSerializer(MarketplacePurchase.Serializer), SdkJson)

  private val appsListAccountsForPlanStubbedResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MarketplacePurchase>> =
      KotlinxSerializationCodec("apps/list-accounts-for-plan-stubbed.response.alternative0", ListSerializer(MarketplacePurchase.Serializer), SdkJson)

  internal val appsListAccountsForPlanStubbedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MarketplacePurchase>> =
      MediaTypeCodecRegistry.of(appsListAccountsForPlanStubbedResponseCodecAlternative0Codec)

  private val appsListAccountsForPlanStubbedResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-accounts-for-plan-stubbed.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsListAccountsForPlanStubbedResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListAccountsForPlanStubbedResponseCodecAlternative1Codec)

  internal val appsListAccountsForPlanStubbedRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsListAccountsForPlanStubbedResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MarketplacePurchase>> =
      MediaTypeCodecRegistry.of(appsListAccountsForPlanStubbedResponseCodec)

  internal const val APPSLISTINSTALLATIONREPOSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "apps/list-installation-repos-for-authenticated-user.response"

  private val appsListInstallationReposForAuthenticatedUserResponseCodec:
      MediaTypeCodec<InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc> =
      KotlinxSerializationCodec(APPSLISTINSTALLATIONREPOSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc.Serializer, SdkJson)

  private val appsListInstallationReposForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc> =
      KotlinxSerializationCodec("apps/list-installation-repos-for-authenticated-user.response.alternative0", InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc.Serializer, SdkJson)

  internal val appsListInstallationReposForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc> =
      MediaTypeCodecRegistry.of(appsListInstallationReposForAuthenticatedUserResponseCodecAlternative0Codec)

  private val appsListInstallationReposForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-installation-repos-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsListInstallationReposForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListInstallationReposForAuthenticatedUserResponseCodecAlternative2Codec)

  private val appsListInstallationReposForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-installation-repos-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val appsListInstallationReposForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListInstallationReposForAuthenticatedUserResponseCodecAlternative3Codec)

  internal val appsListInstallationReposForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsListInstallationReposForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc> =
      MediaTypeCodecRegistry.of(appsListInstallationReposForAuthenticatedUserResponseCodec)

  internal const val APPSLISTINSTALLATIONREQUESTSFORAUTHENTICATEDAPP_RESPONSE_CODEC_ID: String =
      "apps/list-installation-requests-for-authenticated-app.response"

  private val appsListInstallationRequestsForAuthenticatedAppResponseCodec:
      MediaTypeCodec<List<IntegrationInstallationRequest>> =
      KotlinxSerializationCodec(APPSLISTINSTALLATIONREQUESTSFORAUTHENTICATEDAPP_RESPONSE_CODEC_ID, ListSerializer(IntegrationInstallationRequest.Serializer), SdkJson)

  private val appsListInstallationRequestsForAuthenticatedAppResponseCodecAlternative0Codec:
      MediaTypeCodec<List<IntegrationInstallationRequest>> =
      KotlinxSerializationCodec("apps/list-installation-requests-for-authenticated-app.response.alternative0", ListSerializer(IntegrationInstallationRequest.Serializer), SdkJson)

  internal val appsListInstallationRequestsForAuthenticatedAppResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<IntegrationInstallationRequest>> =
      MediaTypeCodecRegistry.of(appsListInstallationRequestsForAuthenticatedAppResponseCodecAlternative0Codec)

  private val appsListInstallationRequestsForAuthenticatedAppResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-installation-requests-for-authenticated-app.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsListInstallationRequestsForAuthenticatedAppResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListInstallationRequestsForAuthenticatedAppResponseCodecAlternative2Codec)

  internal val appsListInstallationRequestsForAuthenticatedAppRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsListInstallationRequestsForAuthenticatedAppResponseCodecRegistry:
      MediaTypeCodecRegistry<List<IntegrationInstallationRequest>> =
      MediaTypeCodecRegistry.of(appsListInstallationRequestsForAuthenticatedAppResponseCodec)

  internal const val APPSLISTINSTALLATIONS_RESPONSE_CODEC_ID: String =
      "apps/list-installations.response"

  private val appsListInstallationsResponseCodec: MediaTypeCodec<List<Installation>> =
      KotlinxSerializationCodec(APPSLISTINSTALLATIONS_RESPONSE_CODEC_ID, ListSerializer(Installation.Serializer), SdkJson)

  private val appsListInstallationsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Installation>> =
      KotlinxSerializationCodec("apps/list-installations.response.alternative0", ListSerializer(Installation.Serializer), SdkJson)

  internal val appsListInstallationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Installation>> =
      MediaTypeCodecRegistry.of(appsListInstallationsResponseCodecAlternative0Codec)

  internal val appsListInstallationsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsListInstallationsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Installation>> =
      MediaTypeCodecRegistry.of(appsListInstallationsResponseCodec)

  internal const val APPSLISTINSTALLATIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "apps/list-installations-for-authenticated-user.response"

  private val appsListInstallationsForAuthenticatedUserResponseCodec:
      MediaTypeCodec<InlineUserInstallationsGetResponse200JsonXfc4c02bc> =
      KotlinxSerializationCodec(APPSLISTINSTALLATIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InlineUserInstallationsGetResponse200JsonXfc4c02bc.Serializer, SdkJson)

  private val appsListInstallationsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUserInstallationsGetResponse200JsonXfc4c02bc> =
      KotlinxSerializationCodec("apps/list-installations-for-authenticated-user.response.alternative0", InlineUserInstallationsGetResponse200JsonXfc4c02bc.Serializer, SdkJson)

  internal val appsListInstallationsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserInstallationsGetResponse200JsonXfc4c02bc> =
      MediaTypeCodecRegistry.of(appsListInstallationsForAuthenticatedUserResponseCodecAlternative0Codec)

  private val appsListInstallationsForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-installations-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsListInstallationsForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListInstallationsForAuthenticatedUserResponseCodecAlternative2Codec)

  private val appsListInstallationsForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-installations-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val appsListInstallationsForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListInstallationsForAuthenticatedUserResponseCodecAlternative3Codec)

  internal val appsListInstallationsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsListInstallationsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUserInstallationsGetResponse200JsonXfc4c02bc> =
      MediaTypeCodecRegistry.of(appsListInstallationsForAuthenticatedUserResponseCodec)

  internal const val APPSLISTPLANS_RESPONSE_CODEC_ID: String = "apps/list-plans.response"

  private val appsListPlansResponseCodec: MediaTypeCodec<List<MarketplaceListingPlan>> =
      KotlinxSerializationCodec(APPSLISTPLANS_RESPONSE_CODEC_ID, ListSerializer(MarketplaceListingPlan.Serializer), SdkJson)

  private val appsListPlansResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MarketplaceListingPlan>> =
      KotlinxSerializationCodec("apps/list-plans.response.alternative0", ListSerializer(MarketplaceListingPlan.Serializer), SdkJson)

  internal val appsListPlansResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MarketplaceListingPlan>> =
      MediaTypeCodecRegistry.of(appsListPlansResponseCodecAlternative0Codec)

  private val appsListPlansResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-plans.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsListPlansResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListPlansResponseCodecAlternative1Codec)

  private val appsListPlansResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-plans.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsListPlansResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListPlansResponseCodecAlternative2Codec)

  internal val appsListPlansRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsListPlansResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MarketplaceListingPlan>> =
      MediaTypeCodecRegistry.of(appsListPlansResponseCodec)

  internal const val APPSLISTPLANSSTUBBED_RESPONSE_CODEC_ID: String =
      "apps/list-plans-stubbed.response"

  private val appsListPlansStubbedResponseCodec: MediaTypeCodec<List<MarketplaceListingPlan>> =
      KotlinxSerializationCodec(APPSLISTPLANSSTUBBED_RESPONSE_CODEC_ID, ListSerializer(MarketplaceListingPlan.Serializer), SdkJson)

  private val appsListPlansStubbedResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MarketplaceListingPlan>> =
      KotlinxSerializationCodec("apps/list-plans-stubbed.response.alternative0", ListSerializer(MarketplaceListingPlan.Serializer), SdkJson)

  internal val appsListPlansStubbedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MarketplaceListingPlan>> =
      MediaTypeCodecRegistry.of(appsListPlansStubbedResponseCodecAlternative0Codec)

  private val appsListPlansStubbedResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-plans-stubbed.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsListPlansStubbedResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListPlansStubbedResponseCodecAlternative1Codec)

  internal val appsListPlansStubbedRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsListPlansStubbedResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MarketplaceListingPlan>> =
      MediaTypeCodecRegistry.of(appsListPlansStubbedResponseCodec)

  internal const val APPSLISTREPOSACCESSIBLETOINSTALLATION_RESPONSE_CODEC_ID: String =
      "apps/list-repos-accessible-to-installation.response"

  private val appsListReposAccessibleToInstallationResponseCodec:
      MediaTypeCodec<InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8> =
      KotlinxSerializationCodec(APPSLISTREPOSACCESSIBLETOINSTALLATION_RESPONSE_CODEC_ID, InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8.Serializer, SdkJson)

  private val appsListReposAccessibleToInstallationResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8> =
      KotlinxSerializationCodec("apps/list-repos-accessible-to-installation.response.alternative0", InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8.Serializer, SdkJson)

  internal val appsListReposAccessibleToInstallationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8> =
      MediaTypeCodecRegistry.of(appsListReposAccessibleToInstallationResponseCodecAlternative0Codec)

  private val appsListReposAccessibleToInstallationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-repos-accessible-to-installation.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsListReposAccessibleToInstallationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListReposAccessibleToInstallationResponseCodecAlternative2Codec)

  private val appsListReposAccessibleToInstallationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-repos-accessible-to-installation.response.alternative3", BasicError.Serializer, SdkJson)

  internal val appsListReposAccessibleToInstallationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListReposAccessibleToInstallationResponseCodecAlternative3Codec)

  internal val appsListReposAccessibleToInstallationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsListReposAccessibleToInstallationResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8> =
      MediaTypeCodecRegistry.of(appsListReposAccessibleToInstallationResponseCodec)

  internal const val APPSLISTSUBSCRIPTIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "apps/list-subscriptions-for-authenticated-user.response"

  private val appsListSubscriptionsForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<UserMarketplacePurchase>> =
      KotlinxSerializationCodec(APPSLISTSUBSCRIPTIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(UserMarketplacePurchase.Serializer), SdkJson)

  private val appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<UserMarketplacePurchase>> =
      KotlinxSerializationCodec("apps/list-subscriptions-for-authenticated-user.response.alternative0", ListSerializer(UserMarketplacePurchase.Serializer), SdkJson)

  internal val appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<UserMarketplacePurchase>> =
      MediaTypeCodecRegistry.of(appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative0Codec)

  private val appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-subscriptions-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative2Codec)

  private val appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-subscriptions-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative3Codec)

  internal val appsListSubscriptionsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsListSubscriptionsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<UserMarketplacePurchase>> =
      MediaTypeCodecRegistry.of(appsListSubscriptionsForAuthenticatedUserResponseCodec)

  internal const val APPSLISTSUBSCRIPTIONSFORAUTHENTICATEDUSERSTUBBED_RESPONSE_CODEC_ID: String =
      "apps/list-subscriptions-for-authenticated-user-stubbed.response"

  private val appsListSubscriptionsForAuthenticatedUserStubbedResponseCodec:
      MediaTypeCodec<List<UserMarketplacePurchase>> =
      KotlinxSerializationCodec(APPSLISTSUBSCRIPTIONSFORAUTHENTICATEDUSERSTUBBED_RESPONSE_CODEC_ID, ListSerializer(UserMarketplacePurchase.Serializer), SdkJson)

  private val appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecAlternative0Codec:
      MediaTypeCodec<List<UserMarketplacePurchase>> =
      KotlinxSerializationCodec("apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative0", ListSerializer(UserMarketplacePurchase.Serializer), SdkJson)

  internal val appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<UserMarketplacePurchase>> =
      MediaTypeCodecRegistry.of(appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecAlternative0Codec)

  private val appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecAlternative2Codec)

  internal val appsListSubscriptionsForAuthenticatedUserStubbedRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecRegistry:
      MediaTypeCodecRegistry<List<UserMarketplacePurchase>> =
      MediaTypeCodecRegistry.of(appsListSubscriptionsForAuthenticatedUserStubbedResponseCodec)

  internal const val APPSLISTWEBHOOKDELIVERIES_RESPONSE_CODEC_ID: String =
      "apps/list-webhook-deliveries.response"

  private val appsListWebhookDeliveriesResponseCodec: MediaTypeCodec<List<HookDeliveryItem>> =
      KotlinxSerializationCodec(APPSLISTWEBHOOKDELIVERIES_RESPONSE_CODEC_ID, ListSerializer(HookDeliveryItem.Serializer), SdkJson)

  private val appsListWebhookDeliveriesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<HookDeliveryItem>> =
      KotlinxSerializationCodec("apps/list-webhook-deliveries.response.alternative0", ListSerializer(HookDeliveryItem.Serializer), SdkJson)

  internal val appsListWebhookDeliveriesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<HookDeliveryItem>> =
      MediaTypeCodecRegistry.of(appsListWebhookDeliveriesResponseCodecAlternative0Codec)

  private val appsListWebhookDeliveriesResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/list-webhook-deliveries.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsListWebhookDeliveriesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsListWebhookDeliveriesResponseCodecAlternative1Codec)

  private val appsListWebhookDeliveriesResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("apps/list-webhook-deliveries.response.alternative2", ScimError.Serializer, SdkJson)

  internal val appsListWebhookDeliveriesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(appsListWebhookDeliveriesResponseCodecAlternative2Codec)

  private val appsListWebhookDeliveriesResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("apps/list-webhook-deliveries.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val appsListWebhookDeliveriesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsListWebhookDeliveriesResponseCodecAlternative3Codec)

  internal val appsListWebhookDeliveriesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsListWebhookDeliveriesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<HookDeliveryItem>> =
      MediaTypeCodecRegistry.of(appsListWebhookDeliveriesResponseCodec)

  internal const val APPSREDELIVERWEBHOOKDELIVERY_RESPONSE_CODEC_ID: String =
      "apps/redeliver-webhook-delivery.response"

  private val appsRedeliverWebhookDeliveryResponseCodec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec(APPSREDELIVERWEBHOOKDELIVERY_RESPONSE_CODEC_ID, JsonObject.serializer(), SdkJson)

  private val appsRedeliverWebhookDeliveryResponseCodecAlternative0Codec: MediaTypeCodec<JsonObject>
      =
      KotlinxSerializationCodec("apps/redeliver-webhook-delivery.response.alternative0", JsonObject.serializer(), SdkJson)

  internal val appsRedeliverWebhookDeliveryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(appsRedeliverWebhookDeliveryResponseCodecAlternative0Codec)

  private val appsRedeliverWebhookDeliveryResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("apps/redeliver-webhook-delivery.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsRedeliverWebhookDeliveryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsRedeliverWebhookDeliveryResponseCodecAlternative1Codec)

  private val appsRedeliverWebhookDeliveryResponseCodecAlternative2Codec: MediaTypeCodec<ScimError>
      =
      KotlinxSerializationCodec("apps/redeliver-webhook-delivery.response.alternative2", ScimError.Serializer, SdkJson)

  internal val appsRedeliverWebhookDeliveryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(appsRedeliverWebhookDeliveryResponseCodecAlternative2Codec)

  private val appsRedeliverWebhookDeliveryResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("apps/redeliver-webhook-delivery.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val appsRedeliverWebhookDeliveryResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsRedeliverWebhookDeliveryResponseCodecAlternative3Codec)

  internal val appsRedeliverWebhookDeliveryRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsRedeliverWebhookDeliveryResponseCodecRegistry: MediaTypeCodecRegistry<JsonObject>
      = MediaTypeCodecRegistry.of(appsRedeliverWebhookDeliveryResponseCodec)

  private val appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/remove-repo-from-installation-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecAlternative2Codec)

  private val appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/remove-repo-from-installation-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecAlternative3Codec)

  internal val appsRemoveRepoFromInstallationForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val APPSRESETTOKEN_REQUEST_CODEC_ID: String = "apps/reset-token.request"

  private val appsResetTokenRequestCodec:
      MediaTypeCodec<InlineApplicationsTokenPatchRequestJsonX56aa4ab6> =
      KotlinxSerializationCodec(APPSRESETTOKEN_REQUEST_CODEC_ID, InlineApplicationsTokenPatchRequestJsonX56aa4ab6.Serializer, SdkJson)

  internal const val APPSRESETTOKEN_RESPONSE_CODEC_ID: String = "apps/reset-token.response"

  private val appsResetTokenResponseCodec: MediaTypeCodec<Authorization> =
      KotlinxSerializationCodec(APPSRESETTOKEN_RESPONSE_CODEC_ID, Authorization.Serializer, SdkJson)

  private val appsResetTokenResponseCodecAlternative0Codec: MediaTypeCodec<Authorization> =
      KotlinxSerializationCodec("apps/reset-token.response.alternative0", Authorization.Serializer, SdkJson)

  internal val appsResetTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Authorization> =
      MediaTypeCodecRegistry.of(appsResetTokenResponseCodecAlternative0Codec)

  private val appsResetTokenResponseCodecAlternative1Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("apps/reset-token.response.alternative1", ValidationError.Serializer, SdkJson)

  internal val appsResetTokenResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsResetTokenResponseCodecAlternative1Codec)

  internal val appsResetTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineApplicationsTokenPatchRequestJsonX56aa4ab6> =
      MediaTypeCodecRegistry.of(appsResetTokenRequestCodec)

  internal val appsResetTokenResponseCodecRegistry: MediaTypeCodecRegistry<Authorization> =
      MediaTypeCodecRegistry.of(appsResetTokenResponseCodec)

  internal val appsRevokeInstallationAccessTokenRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsRevokeInstallationAccessTokenResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal const val APPSSCOPETOKEN_REQUEST_CODEC_ID: String = "apps/scope-token.request"

  private val appsScopeTokenRequestCodec:
      MediaTypeCodec<InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8> =
      KotlinxSerializationCodec(APPSSCOPETOKEN_REQUEST_CODEC_ID, InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8.Serializer, SdkJson)

  internal const val APPSSCOPETOKEN_RESPONSE_CODEC_ID: String = "apps/scope-token.response"

  private val appsScopeTokenResponseCodec: MediaTypeCodec<Authorization> =
      KotlinxSerializationCodec(APPSSCOPETOKEN_RESPONSE_CODEC_ID, Authorization.Serializer, SdkJson)

  private val appsScopeTokenResponseCodecAlternative0Codec: MediaTypeCodec<Authorization> =
      KotlinxSerializationCodec("apps/scope-token.response.alternative0", Authorization.Serializer, SdkJson)

  internal val appsScopeTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Authorization> =
      MediaTypeCodecRegistry.of(appsScopeTokenResponseCodecAlternative0Codec)

  private val appsScopeTokenResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/scope-token.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsScopeTokenResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsScopeTokenResponseCodecAlternative1Codec)

  private val appsScopeTokenResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/scope-token.response.alternative2", BasicError.Serializer, SdkJson)

  internal val appsScopeTokenResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsScopeTokenResponseCodecAlternative2Codec)

  private val appsScopeTokenResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/scope-token.response.alternative3", BasicError.Serializer, SdkJson)

  internal val appsScopeTokenResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsScopeTokenResponseCodecAlternative3Codec)

  private val appsScopeTokenResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("apps/scope-token.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val appsScopeTokenResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(appsScopeTokenResponseCodecAlternative4Codec)

  internal val appsScopeTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8> =
      MediaTypeCodecRegistry.of(appsScopeTokenRequestCodec)

  internal val appsScopeTokenResponseCodecRegistry: MediaTypeCodecRegistry<Authorization> =
      MediaTypeCodecRegistry.of(appsScopeTokenResponseCodec)

  private val appsSuspendInstallationResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/suspend-installation.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsSuspendInstallationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsSuspendInstallationResponseCodecAlternative1Codec)

  internal val appsSuspendInstallationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsSuspendInstallationResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val appsUnsuspendInstallationResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("apps/unsuspend-installation.response.alternative1", BasicError.Serializer, SdkJson)

  internal val appsUnsuspendInstallationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(appsUnsuspendInstallationResponseCodecAlternative1Codec)

  internal val appsUnsuspendInstallationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val appsUnsuspendInstallationResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val APPSUPDATEWEBHOOKCONFIGFORAPP_REQUEST_CODEC_ID: String =
      "apps/update-webhook-config-for-app.request"

  private val appsUpdateWebhookConfigForAppRequestCodec:
      MediaTypeCodec<InlineAppHookConfigPatchRequestJsonXac78b7f1> =
      KotlinxSerializationCodec(APPSUPDATEWEBHOOKCONFIGFORAPP_REQUEST_CODEC_ID, InlineAppHookConfigPatchRequestJsonXac78b7f1.Serializer, SdkJson)

  internal const val APPSUPDATEWEBHOOKCONFIGFORAPP_RESPONSE_CODEC_ID: String =
      "apps/update-webhook-config-for-app.response"

  private val appsUpdateWebhookConfigForAppResponseCodec: MediaTypeCodec<WebhookConfig> =
      KotlinxSerializationCodec(APPSUPDATEWEBHOOKCONFIGFORAPP_RESPONSE_CODEC_ID, WebhookConfig.Serializer, SdkJson)

  private val appsUpdateWebhookConfigForAppResponseCodecAlternative0Codec:
      MediaTypeCodec<WebhookConfig> =
      KotlinxSerializationCodec("apps/update-webhook-config-for-app.response.alternative0", WebhookConfig.Serializer, SdkJson)

  internal val appsUpdateWebhookConfigForAppResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<WebhookConfig> =
      MediaTypeCodecRegistry.of(appsUpdateWebhookConfigForAppResponseCodecAlternative0Codec)

  internal val appsUpdateWebhookConfigForAppRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineAppHookConfigPatchRequestJsonXac78b7f1> =
      MediaTypeCodecRegistry.of(appsUpdateWebhookConfigForAppRequestCodec)

  internal val appsUpdateWebhookConfigForAppResponseCodecRegistry:
      MediaTypeCodecRegistry<WebhookConfig> =
      MediaTypeCodecRegistry.of(appsUpdateWebhookConfigForAppResponseCodec)
}

/**
 * Client for the 'apps' group of GitHub v3 REST API.
 */
public class AppsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@AppsClient.authentication)

  /**
   * Add a single repository to an installation. The authenticated user must have admin access to the repository.
   *
   * This endpoint only works for PATs (classic) with the `repo` scope.
   *
   * @param installationId The unique identifier of the installation.
   * @param repositoryId The unique identifier of the repository.
   * @param options Execution options.
   * @return No response body.
   * @throws AppsAddRepoToInstallationForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded AppsAddRepoToInstallationForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsAddRepoToInstallationForAuthenticatedUser(
    installationId: Int,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, AppsAddRepoToInstallationForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(appsAddRepoToInstallationForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    }),
    requestCodecs = AppsCodecs.appsAddRepoToInstallationForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = AppsAddRepoToInstallationForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.Http304NoContent -> AppsAddRepoToInstallationForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.Http403Json -> AppsAddRepoToInstallationForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.Http404Json -> AppsAddRepoToInstallationForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsAddRepoToInstallationForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Add a single repository to an installation. The authenticated user must have admin access to the repository.
   *
   * This endpoint only works for PATs (classic) with the `repo` scope.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param installationId The unique identifier of the installation.
   * @param repositoryId The unique identifier of the repository.
   * @param options Execution options.
   */
  public suspend fun appsAddRepoToInstallationForAuthenticatedUserWithResponse(
    installationId: Int,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsAddRepoToInstallationForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, AppsAddRepoToInstallationForAuthenticatedUserResponse>(SdkExecutionRequest(appsAddRepoToInstallationForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
  }), AppsCodecs.appsAddRepoToInstallationForAuthenticatedUserRequestCodecRegistry, AppsAddRepoToInstallationForAuthenticatedUserResponseDecoder, options)

  /**
   * OAuth applications and GitHub applications with OAuth authorizations can use this API method for checking OAuth
   * token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently
   * with this particular endpoint. Invalid tokens will return `404 NOT FOUND`.
   *
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsCheckTokenApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded AppsCheckTokenError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsCheckToken(
    request: InlineApplicationsTokenPostRequestJsonX9c98b7a7,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): Authorization = executor.executeWithTypedErrors<InlineApplicationsTokenPostRequestJsonX9c98b7a7, AppsCheckTokenResponse, Authorization>(
    request = SdkExecutionRequest(appsCheckTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSCHECKTOKEN_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
    }),
    requestCodecs = AppsCodecs.appsCheckTokenRequestCodecRegistry,
    responseDecoder = AppsCheckTokenResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsCheckTokenResponse.SuccessJson -> response.json
        is AppsCheckTokenResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsCheckTokenResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsCheckTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsCheckTokenResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsCheckTokenResponse.Http404Json -> AppsCheckTokenApiException(response, statusCode, headers)
        is AppsCheckTokenResponse.Http422Json -> AppsCheckTokenApiException(response, statusCode, headers)
        is AppsCheckTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth applications and GitHub applications with OAuth authorizations can use this API method for checking OAuth
   * token validity without exceeding the normal rate limits for failed login attempts. Authentication works differently
   * with this particular endpoint. Invalid tokens will return `404 NOT FOUND`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   */
  public suspend fun appsCheckTokenWithResponse(
    request: InlineApplicationsTokenPostRequestJsonX9c98b7a7,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsCheckTokenResponse> = executor.executeWithResponse<InlineApplicationsTokenPostRequestJsonX9c98b7a7, AppsCheckTokenResponse>(SdkExecutionRequest(appsCheckTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSCHECKTOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
  }), AppsCodecs.appsCheckTokenRequestCodecRegistry, AppsCheckTokenResponseDecoder, options)

  /**
   * Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest
   * flow](https://docs.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a
   * GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem`
   * (private key), and `webhook_secret`.
   *
   * @param code Wire parameter `code`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsCreateFromManifestApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsCreateFromManifestError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsCreateFromManifest(code: String, options: CallOptions = CallOptions()): InlineAppManifestsConversionsPostResponse201JsonX50717f97 = executor.executeWithTypedErrors<Unit, AppsCreateFromManifestResponse, InlineAppManifestsConversionsPostResponse201JsonX50717f97>(
    request = SdkExecutionRequest(appsCreateFromManifestMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "code", values = listOf(code.toString())))
    }),
    requestCodecs = AppsCodecs.appsCreateFromManifestRequestCodecRegistry,
    responseDecoder = AppsCreateFromManifestResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsCreateFromManifestResponse.SuccessJson -> response.json
        is AppsCreateFromManifestResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsCreateFromManifestResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsCreateFromManifestResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsCreateFromManifestResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsCreateFromManifestResponse.Http404Json -> AppsCreateFromManifestApiException(response, statusCode, headers)
        is AppsCreateFromManifestResponse.Http422Json -> AppsCreateFromManifestApiException(response, statusCode, headers)
        is AppsCreateFromManifestResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use this endpoint to complete the handshake necessary when implementing the [GitHub App Manifest
   * flow](https://docs.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/). When you create a
   * GitHub App with the manifest flow, you receive a temporary `code` used to retrieve the GitHub App's `id`, `pem`
   * (private key), and `webhook_secret`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param code Wire parameter `code`.
   * @param options Execution options.
   */
  public suspend fun appsCreateFromManifestWithResponse(code: String, options: CallOptions = CallOptions()): SdkResponseResult<AppsCreateFromManifestResponse> = executor.executeWithResponse<Unit, AppsCreateFromManifestResponse>(SdkExecutionRequest(appsCreateFromManifestMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "code", values = listOf(code.toString())))
  }), AppsCodecs.appsCreateFromManifestRequestCodecRegistry, AppsCreateFromManifestResponseDecoder, options)

  /**
   * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's
   * installation on an organization or individual account. Installation tokens expire one hour from the time you create
   * them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new
   * installation token. By default the installation token has access to all repositories that the installation can
   * access.
   *
   * > [!NOTE]
   * > Starting April 27, 2026, GitHub began a staged rollout of a stateless format (`ghs_APPID_JWT`) to all newly
   * minted GitHub App installation tokens, making them more performant and improving the reliability of our API
   * surface. If your application expects or relies on installation tokens being exactly 40 characters long, it may not
   * handle this new token format correctly. You can now validate your apps and workflows using a temporary request
   * header that lets you enable the token format on demand. For more information about the temporary header, see [the
   * GitHub blog](https://github.blog/changelog/2026-05-15-github-app-installation-tokens-per-request-override-header).
   *
   * Optionally, you can use the `repositories` or `repository_ids` body parameters to specify individual repositories
   * that the installation access token can access. If you don't use `repositories` or `repository_ids` to grant access
   * to specific repositories, the installation access token will have access to all repositories that the installation
   * was granted access to. The installation access token cannot be granted access to repositories that the installation
   * was not granted access to. Up to 500 repositories can be listed in this manner.
   *
   * Optionally, use the `permissions` body parameter to specify the permissions that the installation access token
   * should have. If `permissions` is not specified, the installation access token will have all of the permissions that
   * were granted to the app. The installation access token cannot be granted permissions that the app was not granted.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsCreateInstallationAccessTokenApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded AppsCreateInstallationAccessTokenError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsCreateInstallationAccessToken(
    request: InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c? = null,
    installationId: Int,
    options: CallOptions = CallOptions(),
  ): InstallationToken = executor.executeWithTypedErrors<InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c?, AppsCreateInstallationAccessTokenResponse, InstallationToken>(
    request = SdkExecutionRequest(appsCreateInstallationAccessTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSCREATEINSTALLATIONACCESSTOKEN_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
    }),
    requestCodecs = AppsCodecs.appsCreateInstallationAccessTokenRequestCodecRegistry,
    responseDecoder = AppsCreateInstallationAccessTokenResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsCreateInstallationAccessTokenResponse.SuccessJson -> response.json
        is AppsCreateInstallationAccessTokenResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsCreateInstallationAccessTokenResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsCreateInstallationAccessTokenResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsCreateInstallationAccessTokenResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsCreateInstallationAccessTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsCreateInstallationAccessTokenResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsCreateInstallationAccessTokenResponse.Http401Json -> AppsCreateInstallationAccessTokenApiException(response, statusCode, headers)
        is AppsCreateInstallationAccessTokenResponse.Http403Json -> AppsCreateInstallationAccessTokenApiException(response, statusCode, headers)
        is AppsCreateInstallationAccessTokenResponse.Http404Json -> AppsCreateInstallationAccessTokenApiException(response, statusCode, headers)
        is AppsCreateInstallationAccessTokenResponse.Http422Json -> AppsCreateInstallationAccessTokenApiException(response, statusCode, headers)
        is AppsCreateInstallationAccessTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates an installation access token that enables a GitHub App to make authenticated API requests for the app's
   * installation on an organization or individual account. Installation tokens expire one hour from the time you create
   * them. Using an expired token produces a status code of `401 - Unauthorized`, and requires creating a new
   * installation token. By default the installation token has access to all repositories that the installation can
   * access.
   *
   * > [!NOTE]
   * > Starting April 27, 2026, GitHub began a staged rollout of a stateless format (`ghs_APPID_JWT`) to all newly
   * minted GitHub App installation tokens, making them more performant and improving the reliability of our API
   * surface. If your application expects or relies on installation tokens being exactly 40 characters long, it may not
   * handle this new token format correctly. You can now validate your apps and workflows using a temporary request
   * header that lets you enable the token format on demand. For more information about the temporary header, see [the
   * GitHub blog](https://github.blog/changelog/2026-05-15-github-app-installation-tokens-per-request-override-header).
   *
   * Optionally, you can use the `repositories` or `repository_ids` body parameters to specify individual repositories
   * that the installation access token can access. If you don't use `repositories` or `repository_ids` to grant access
   * to specific repositories, the installation access token will have access to all repositories that the installation
   * was granted access to. The installation access token cannot be granted access to repositories that the installation
   * was not granted access to. Up to 500 repositories can be listed in this manner.
   *
   * Optionally, use the `permissions` body parameter to specify the permissions that the installation access token
   * should have. If `permissions` is not specified, the installation access token will have all of the permissions that
   * were granted to the app. The installation access token cannot be granted permissions that the app was not granted.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   */
  public suspend fun appsCreateInstallationAccessTokenWithResponse(
    request: InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c? = null,
    installationId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsCreateInstallationAccessTokenResponse> = executor.executeWithResponse<InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c?, AppsCreateInstallationAccessTokenResponse>(SdkExecutionRequest(appsCreateInstallationAccessTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSCREATEINSTALLATIONACCESSTOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
  }), AppsCodecs.appsCreateInstallationAccessTokenRequestCodecRegistry, AppsCreateInstallationAccessTokenResponseDecoder, options)

  /**
   * OAuth and GitHub application owners can revoke a grant for their application and a specific user. You must provide
   * a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted.
   * Deleting an application's grant will also delete all OAuth tokens associated with the application for the user.
   * Once deleted, the application will have no access to the user's account and will no longer be listed on [the
   * application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
   *
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   * @return No response body.
   * @throws AppsDeleteAuthorizationApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsDeleteAuthorizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsDeleteAuthorization(
    request: InlineApplicationsGrantDeleteRequestJsonX60601b0d,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineApplicationsGrantDeleteRequestJsonX60601b0d, AppsDeleteAuthorizationResponse, Unit>(
    request = SdkExecutionRequest(appsDeleteAuthorizationMetadata, baseUri, request, listOf(AppsCodecs.APPSDELETEAUTHORIZATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
    }),
    requestCodecs = AppsCodecs.appsDeleteAuthorizationRequestCodecRegistry,
    responseDecoder = AppsDeleteAuthorizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsDeleteAuthorizationResponse.SuccessNoContent -> response.unit
        is AppsDeleteAuthorizationResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsDeleteAuthorizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsDeleteAuthorizationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AppsDeleteAuthorizationResponse.Http422Json -> AppsDeleteAuthorizationApiException(response, statusCode, headers)
        is AppsDeleteAuthorizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth and GitHub application owners can revoke a grant for their application and a specific user. You must provide
   * a valid OAuth `access_token` as an input parameter and the grant for the token's owner will be deleted.
   * Deleting an application's grant will also delete all OAuth tokens associated with the application for the user.
   * Once deleted, the application will have no access to the user's account and will no longer be listed on [the
   * application authorizations settings screen within GitHub](https://github.com/settings/applications#authorized).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   */
  public suspend fun appsDeleteAuthorizationWithResponse(
    request: InlineApplicationsGrantDeleteRequestJsonX60601b0d,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsDeleteAuthorizationResponse> = executor.executeWithResponse<InlineApplicationsGrantDeleteRequestJsonX60601b0d, AppsDeleteAuthorizationResponse>(SdkExecutionRequest(appsDeleteAuthorizationMetadata, baseUri, request, listOf(AppsCodecs.APPSDELETEAUTHORIZATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
  }), AppsCodecs.appsDeleteAuthorizationRequestCodecRegistry, AppsDeleteAuthorizationResponseDecoder, options)

  /**
   * Uninstalls a GitHub App on a user, organization, or enterprise account. If you prefer to temporarily suspend an
   * app's access to your account's resources, then we recommend the "[Suspend an app
   * installation](https://docs.github.com/rest/apps/apps#suspend-an-app-installation)" endpoint.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   * @return No response body.
   * @throws AppsDeleteInstallationApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsDeleteInstallationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsDeleteInstallation(installationId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, AppsDeleteInstallationResponse, Unit>(
    request = SdkExecutionRequest(appsDeleteInstallationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
    }),
    requestCodecs = AppsCodecs.appsDeleteInstallationRequestCodecRegistry,
    responseDecoder = AppsDeleteInstallationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsDeleteInstallationResponse.SuccessNoContent -> response.unit
        is AppsDeleteInstallationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsDeleteInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsDeleteInstallationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AppsDeleteInstallationResponse.Http404Json -> AppsDeleteInstallationApiException(response, statusCode, headers)
        is AppsDeleteInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Uninstalls a GitHub App on a user, organization, or enterprise account. If you prefer to temporarily suspend an
   * app's access to your account's resources, then we recommend the "[Suspend an app
   * installation](https://docs.github.com/rest/apps/apps#suspend-an-app-installation)" endpoint.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   */
  public suspend fun appsDeleteInstallationWithResponse(installationId: Int, options: CallOptions = CallOptions()): SdkResponseResult<AppsDeleteInstallationResponse> = executor.executeWithResponse<Unit, AppsDeleteInstallationResponse>(SdkExecutionRequest(appsDeleteInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
  }), AppsCodecs.appsDeleteInstallationRequestCodecRegistry, AppsDeleteInstallationResponseDecoder, options)

  /**
   * OAuth  or GitHub application owners can revoke a single token for an OAuth application or a GitHub application with
   * an OAuth authorization.
   *
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   * @return No response body.
   * @throws AppsDeleteTokenApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded AppsDeleteTokenError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsDeleteToken(
    request: InlineApplicationsTokenDeleteRequestJsonXc90fd95f,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineApplicationsTokenDeleteRequestJsonXc90fd95f, AppsDeleteTokenResponse, Unit>(
    request = SdkExecutionRequest(appsDeleteTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSDELETETOKEN_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
    }),
    requestCodecs = AppsCodecs.appsDeleteTokenRequestCodecRegistry,
    responseDecoder = AppsDeleteTokenResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsDeleteTokenResponse.SuccessNoContent -> response.unit
        is AppsDeleteTokenResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsDeleteTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsDeleteTokenResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AppsDeleteTokenResponse.Http422Json -> AppsDeleteTokenApiException(response, statusCode, headers)
        is AppsDeleteTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth  or GitHub application owners can revoke a single token for an OAuth application or a GitHub application with
   * an OAuth authorization.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   */
  public suspend fun appsDeleteTokenWithResponse(
    request: InlineApplicationsTokenDeleteRequestJsonXc90fd95f,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsDeleteTokenResponse> = executor.executeWithResponse<InlineApplicationsTokenDeleteRequestJsonXc90fd95f, AppsDeleteTokenResponse>(SdkExecutionRequest(appsDeleteTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSDELETETOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
  }), AppsCodecs.appsDeleteTokenRequestCodecRegistry, AppsDeleteTokenResponseDecoder, options)

  /**
   * Returns the GitHub App associated with the authentication credentials used. To see how many app installations are
   * associated with this GitHub App, see the `installations_count` in the response. For more details about your app's
   * installations, see the "[List installations for the authenticated
   * app](https://docs.github.com/rest/apps/apps#list-installations-for-the-authenticated-app)" endpoint.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetAuthenticated(options: CallOptions = CallOptions()): Integration? = executor.execute<Unit, Integration?>(SdkExecutionRequest(appsGetAuthenticatedMetadata, baseUri, Unit, emptyList(), emptyList()), listOf(AppsCodecs.APPSGETAUTHENTICATED_RESPONSE_CODEC_ID), AppsCodecs.appsGetAuthenticatedRequestCodecRegistry, AppsCodecs.appsGetAuthenticatedResponseCodecRegistry, options)

  /**
   * Returns the GitHub App associated with the authentication credentials used. To see how many app installations are
   * associated with this GitHub App, see the `installations_count` in the response. For more details about your app's
   * installations, see the "[List installations for the authenticated
   * app](https://docs.github.com/rest/apps/apps#list-installations-for-the-authenticated-app)" endpoint.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun appsGetAuthenticatedWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<AppsGetAuthenticatedResponse> = executor.executeWithResponse<Unit, AppsGetAuthenticatedResponse>(SdkExecutionRequest(appsGetAuthenticatedMetadata, baseUri, Unit, emptyList(), emptyList()), AppsCodecs.appsGetAuthenticatedRequestCodecRegistry, AppsGetAuthenticatedResponseDecoder, options)

  /**
   * > [!NOTE]
   * > The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your
   * GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).
   *
   * @param appSlug Wire parameter `app_slug`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsGetBySlugApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded AppsGetBySlugError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetBySlug(appSlug: String, options: CallOptions = CallOptions()): Integration? = executor.executeWithTypedErrors<Unit, AppsGetBySlugResponse, Integration?>(
    request = SdkExecutionRequest(appsGetBySlugMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "app_slug", values = listOf(appSlug.toString())))
    }),
    requestCodecs = AppsCodecs.appsGetBySlugRequestCodecRegistry,
    responseDecoder = AppsGetBySlugResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsGetBySlugResponse.SuccessJson -> response.json
        is AppsGetBySlugResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetBySlugResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetBySlugResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsGetBySlugResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsGetBySlugResponse.Http403Json -> AppsGetBySlugApiException(response, statusCode, headers)
        is AppsGetBySlugResponse.Http404Json -> AppsGetBySlugApiException(response, statusCode, headers)
        is AppsGetBySlugResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > The `:app_slug` is just the URL-friendly name of your GitHub App. You can find this on the settings page for your
   * GitHub App (e.g., `https://github.com/settings/apps/:app_slug`).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param appSlug Wire parameter `app_slug`.
   * @param options Execution options.
   */
  public suspend fun appsGetBySlugWithResponse(appSlug: String, options: CallOptions = CallOptions()): SdkResponseResult<AppsGetBySlugResponse> = executor.executeWithResponse<Unit, AppsGetBySlugResponse>(SdkExecutionRequest(appsGetBySlugMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "app_slug", values = listOf(appSlug.toString())))
  }), AppsCodecs.appsGetBySlugRequestCodecRegistry, AppsGetBySlugResponseDecoder, options)

  /**
   * Enables an authenticated GitHub App to find an installation's information using the installation id.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsGetInstallationApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsGetInstallationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetInstallation(installationId: Int, options: CallOptions = CallOptions()): Installation = executor.executeWithTypedErrors<Unit, AppsGetInstallationResponse, Installation>(
    request = SdkExecutionRequest(appsGetInstallationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
    }),
    requestCodecs = AppsCodecs.appsGetInstallationRequestCodecRegistry,
    responseDecoder = AppsGetInstallationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsGetInstallationResponse.SuccessJson -> response.json
        is AppsGetInstallationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsGetInstallationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsGetInstallationResponse.Http404Json -> AppsGetInstallationApiException(response, statusCode, headers)
        is AppsGetInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Enables an authenticated GitHub App to find an installation's information using the installation id.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   */
  public suspend fun appsGetInstallationWithResponse(installationId: Int, options: CallOptions = CallOptions()): SdkResponseResult<AppsGetInstallationResponse> = executor.executeWithResponse<Unit, AppsGetInstallationResponse>(SdkExecutionRequest(appsGetInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
  }), AppsCodecs.appsGetInstallationRequestCodecRegistry, AppsGetInstallationResponseDecoder, options)

  /**
   * Enables an authenticated GitHub App to find the organization's installation information.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetOrgInstallation(org: String, options: CallOptions = CallOptions()): Installation = executor.execute<Unit, Installation>(SdkExecutionRequest(appsGetOrgInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(AppsCodecs.APPSGETORGINSTALLATION_RESPONSE_CODEC_ID), AppsCodecs.appsGetOrgInstallationRequestCodecRegistry, AppsCodecs.appsGetOrgInstallationResponseCodecRegistry, options)

  /**
   * Enables an authenticated GitHub App to find the organization's installation information.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun appsGetOrgInstallationWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<AppsGetOrgInstallationResponse> = executor.executeWithResponse<Unit, AppsGetOrgInstallationResponse>(SdkExecutionRequest(appsGetOrgInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), AppsCodecs.appsGetOrgInstallationRequestCodecRegistry, AppsGetOrgInstallationResponseDecoder, options)

  /**
   * Enables an authenticated GitHub App to find the repository's installation information. The installation's account
   * type will be either an organization or a user account, depending which account the repository belongs to.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsGetRepoInstallationApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsGetRepoInstallationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetRepoInstallation(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Installation = executor.executeWithTypedErrors<Unit, AppsGetRepoInstallationResponse, Installation>(
    request = SdkExecutionRequest(appsGetRepoInstallationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = AppsCodecs.appsGetRepoInstallationRequestCodecRegistry,
    responseDecoder = AppsGetRepoInstallationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsGetRepoInstallationResponse.SuccessJson -> response.json
        is AppsGetRepoInstallationResponse.Http301Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetRepoInstallationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetRepoInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsGetRepoInstallationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsGetRepoInstallationResponse.Http301Json -> AppsGetRepoInstallationApiException(response, statusCode, headers)
        is AppsGetRepoInstallationResponse.Http404Json -> AppsGetRepoInstallationApiException(response, statusCode, headers)
        is AppsGetRepoInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Enables an authenticated GitHub App to find the repository's installation information. The installation's account
   * type will be either an organization or a user account, depending which account the repository belongs to.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun appsGetRepoInstallationWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsGetRepoInstallationResponse> = executor.executeWithResponse<Unit, AppsGetRepoInstallationResponse>(SdkExecutionRequest(appsGetRepoInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), AppsCodecs.appsGetRepoInstallationRequestCodecRegistry, AppsGetRepoInstallationResponseDecoder, options)

  /**
   * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub
   * App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also
   * see the upcoming pending change.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * @param accountId account_id parameter
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsGetSubscriptionPlanForAccountApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded AppsGetSubscriptionPlanForAccountError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetSubscriptionPlanForAccount(accountId: Int, options: CallOptions = CallOptions()): MarketplacePurchase = executor.executeWithTypedErrors<Unit, AppsGetSubscriptionPlanForAccountResponse, MarketplacePurchase>(
    request = SdkExecutionRequest(appsGetSubscriptionPlanForAccountMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account_id", values = listOf(accountId.toString())))
    }),
    requestCodecs = AppsCodecs.appsGetSubscriptionPlanForAccountRequestCodecRegistry,
    responseDecoder = AppsGetSubscriptionPlanForAccountResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsGetSubscriptionPlanForAccountResponse.SuccessJson -> response.json
        is AppsGetSubscriptionPlanForAccountResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetSubscriptionPlanForAccountResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetSubscriptionPlanForAccountResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsGetSubscriptionPlanForAccountResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsGetSubscriptionPlanForAccountResponse.Http401Json -> AppsGetSubscriptionPlanForAccountApiException(response, statusCode, headers)
        is AppsGetSubscriptionPlanForAccountResponse.Http404Json -> AppsGetSubscriptionPlanForAccountApiException(response, statusCode, headers)
        is AppsGetSubscriptionPlanForAccountResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub
   * App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also
   * see the upcoming pending change.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param accountId account_id parameter
   * @param options Execution options.
   */
  public suspend fun appsGetSubscriptionPlanForAccountWithResponse(accountId: Int, options: CallOptions = CallOptions()): SdkResponseResult<AppsGetSubscriptionPlanForAccountResponse> = executor.executeWithResponse<Unit, AppsGetSubscriptionPlanForAccountResponse>(SdkExecutionRequest(appsGetSubscriptionPlanForAccountMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account_id", values = listOf(accountId.toString())))
  }), AppsCodecs.appsGetSubscriptionPlanForAccountRequestCodecRegistry, AppsGetSubscriptionPlanForAccountResponseDecoder, options)

  /**
   * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub
   * App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also
   * see the upcoming pending change.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * @param accountId account_id parameter
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsGetSubscriptionPlanForAccountStubbedApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded AppsGetSubscriptionPlanForAccountStubbedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetSubscriptionPlanForAccountStubbed(accountId: Int, options: CallOptions = CallOptions()): MarketplacePurchase = executor.executeWithTypedErrors<Unit, AppsGetSubscriptionPlanForAccountStubbedResponse, MarketplacePurchase>(
    request = SdkExecutionRequest(appsGetSubscriptionPlanForAccountStubbedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account_id", values = listOf(accountId.toString())))
    }),
    requestCodecs = AppsCodecs.appsGetSubscriptionPlanForAccountStubbedRequestCodecRegistry,
    responseDecoder = AppsGetSubscriptionPlanForAccountStubbedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsGetSubscriptionPlanForAccountStubbedResponse.SuccessJson -> response.json
        is AppsGetSubscriptionPlanForAccountStubbedResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetSubscriptionPlanForAccountStubbedResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetSubscriptionPlanForAccountStubbedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsGetSubscriptionPlanForAccountStubbedResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsGetSubscriptionPlanForAccountStubbedResponse.Http401Json -> AppsGetSubscriptionPlanForAccountStubbedApiException(response, statusCode, headers)
        is AppsGetSubscriptionPlanForAccountStubbedResponse.Http404NoContent -> AppsGetSubscriptionPlanForAccountStubbedApiException(response, statusCode, headers)
        is AppsGetSubscriptionPlanForAccountStubbedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub
   * App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also
   * see the upcoming pending change.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param accountId account_id parameter
   * @param options Execution options.
   */
  public suspend fun appsGetSubscriptionPlanForAccountStubbedWithResponse(accountId: Int, options: CallOptions = CallOptions()): SdkResponseResult<AppsGetSubscriptionPlanForAccountStubbedResponse> = executor.executeWithResponse<Unit, AppsGetSubscriptionPlanForAccountStubbedResponse>(SdkExecutionRequest(appsGetSubscriptionPlanForAccountStubbedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account_id", values = listOf(accountId.toString())))
  }), AppsCodecs.appsGetSubscriptionPlanForAccountStubbedRequestCodecRegistry, AppsGetSubscriptionPlanForAccountStubbedResponseDecoder, options)

  /**
   * Enables an authenticated GitHub App to find the user’s installation information.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetUserInstallation(username: String, options: CallOptions = CallOptions()): Installation = executor.execute<Unit, Installation>(SdkExecutionRequest(appsGetUserInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), listOf(AppsCodecs.APPSGETUSERINSTALLATION_RESPONSE_CODEC_ID), AppsCodecs.appsGetUserInstallationRequestCodecRegistry, AppsCodecs.appsGetUserInstallationResponseCodecRegistry, options)

  /**
   * Enables an authenticated GitHub App to find the user’s installation information.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun appsGetUserInstallationWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<AppsGetUserInstallationResponse> = executor.executeWithResponse<Unit, AppsGetUserInstallationResponse>(SdkExecutionRequest(appsGetUserInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), AppsCodecs.appsGetUserInstallationRequestCodecRegistry, AppsGetUserInstallationResponseDecoder, options)

  /**
   * Returns the webhook configuration for a GitHub App. For more information about configuring a webhook for your app,
   * see "[Creating a GitHub App](/developers/apps/creating-a-github-app)."
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetWebhookConfigForApp(options: CallOptions = CallOptions()): WebhookConfig = executor.execute<Unit, WebhookConfig>(SdkExecutionRequest(appsGetWebhookConfigForAppMetadata, baseUri, Unit, emptyList(), emptyList()), listOf(AppsCodecs.APPSGETWEBHOOKCONFIGFORAPP_RESPONSE_CODEC_ID), AppsCodecs.appsGetWebhookConfigForAppRequestCodecRegistry, AppsCodecs.appsGetWebhookConfigForAppResponseCodecRegistry, options)

  /**
   * Returns the webhook configuration for a GitHub App. For more information about configuring a webhook for your app,
   * see "[Creating a GitHub App](/developers/apps/creating-a-github-app)."
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun appsGetWebhookConfigForAppWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<AppsGetWebhookConfigForAppResponse> = executor.executeWithResponse<Unit, AppsGetWebhookConfigForAppResponse>(SdkExecutionRequest(appsGetWebhookConfigForAppMetadata, baseUri, Unit, emptyList(), emptyList()), AppsCodecs.appsGetWebhookConfigForAppRequestCodecRegistry, AppsGetWebhookConfigForAppResponseDecoder, options)

  /**
   * Returns a delivery for the webhook configured for a GitHub App.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param deliveryId Wire parameter `delivery_id`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsGetWebhookDeliveryApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsGetWebhookDeliveryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsGetWebhookDelivery(deliveryId: Int, options: CallOptions = CallOptions()): HookDelivery = executor.executeWithTypedErrors<Unit, AppsGetWebhookDeliveryResponse, HookDelivery>(
    request = SdkExecutionRequest(appsGetWebhookDeliveryMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "delivery_id", values = listOf(deliveryId.toString())))
    }),
    requestCodecs = AppsCodecs.appsGetWebhookDeliveryRequestCodecRegistry,
    responseDecoder = AppsGetWebhookDeliveryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsGetWebhookDeliveryResponse.SuccessJson -> response.json
        is AppsGetWebhookDeliveryResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetWebhookDeliveryResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetWebhookDeliveryResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsGetWebhookDeliveryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsGetWebhookDeliveryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsGetWebhookDeliveryResponse.Http400Json -> AppsGetWebhookDeliveryApiException(response, statusCode, headers)
        is AppsGetWebhookDeliveryResponse.Http400ScimJson -> AppsGetWebhookDeliveryApiException(response, statusCode, headers)
        is AppsGetWebhookDeliveryResponse.Http422Json -> AppsGetWebhookDeliveryApiException(response, statusCode, headers)
        is AppsGetWebhookDeliveryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns a delivery for the webhook configured for a GitHub App.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param deliveryId Wire parameter `delivery_id`.
   * @param options Execution options.
   */
  public suspend fun appsGetWebhookDeliveryWithResponse(deliveryId: Int, options: CallOptions = CallOptions()): SdkResponseResult<AppsGetWebhookDeliveryResponse> = executor.executeWithResponse<Unit, AppsGetWebhookDeliveryResponse>(SdkExecutionRequest(appsGetWebhookDeliveryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "delivery_id", values = listOf(deliveryId.toString())))
  }), AppsCodecs.appsGetWebhookDeliveryRequestCodecRegistry, AppsGetWebhookDeliveryResponseDecoder, options)

  /**
   * Returns user and organization accounts associated with the specified plan, including free plans. For per-seat
   * pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When
   * someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the
   * upcoming pending change.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * @param planId The unique identifier of the plan.
   * @param direction To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListAccountsForPlanApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsListAccountsForPlanError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListAccountsForPlan(
    planId: Int,
    direction: InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineSortParameterX37db756f? = null,
    options: CallOptions = CallOptions(),
  ): List<MarketplacePurchase> = executor.executeWithTypedErrors<Unit, AppsListAccountsForPlanResponse, List<MarketplacePurchase>>(
    request = SdkExecutionRequest(appsListAccountsForPlanMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "plan_id", values = listOf(planId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListAccountsForPlanRequestCodecRegistry,
    responseDecoder = AppsListAccountsForPlanResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListAccountsForPlanResponse.SuccessJson -> response.json
        is AppsListAccountsForPlanResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListAccountsForPlanResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListAccountsForPlanResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListAccountsForPlanResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListAccountsForPlanResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListAccountsForPlanResponse.Http401Json -> AppsListAccountsForPlanApiException(response, statusCode, headers)
        is AppsListAccountsForPlanResponse.Http404Json -> AppsListAccountsForPlanApiException(response, statusCode, headers)
        is AppsListAccountsForPlanResponse.Http422Json -> AppsListAccountsForPlanApiException(response, statusCode, headers)
        is AppsListAccountsForPlanResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns user and organization accounts associated with the specified plan, including free plans. For per-seat
   * pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When
   * someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the
   * upcoming pending change.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param planId The unique identifier of the plan.
   * @param direction To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by.
   * @param options Execution options.
   */
  public suspend fun appsListAccountsForPlanWithResponse(
    planId: Int,
    direction: InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineSortParameterX37db756f? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListAccountsForPlanResponse> = executor.executeWithResponse<Unit, AppsListAccountsForPlanResponse>(SdkExecutionRequest(appsListAccountsForPlanMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "plan_id", values = listOf(planId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListAccountsForPlanRequestCodecRegistry, AppsListAccountsForPlanResponseDecoder, options)

  /**
   * Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat
   * pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When
   * someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the
   * upcoming pending change.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * @param planId The unique identifier of the plan.
   * @param direction To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListAccountsForPlanStubbedApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded AppsListAccountsForPlanStubbedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListAccountsForPlanStubbed(
    planId: Int,
    direction: InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineSortParameterX37db756f? = null,
    options: CallOptions = CallOptions(),
  ): List<MarketplacePurchase> = executor.executeWithTypedErrors<Unit, AppsListAccountsForPlanStubbedResponse, List<MarketplacePurchase>>(
    request = SdkExecutionRequest(appsListAccountsForPlanStubbedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "plan_id", values = listOf(planId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListAccountsForPlanStubbedRequestCodecRegistry,
    responseDecoder = AppsListAccountsForPlanStubbedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListAccountsForPlanStubbedResponse.SuccessJson -> response.json
        is AppsListAccountsForPlanStubbedResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListAccountsForPlanStubbedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListAccountsForPlanStubbedResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListAccountsForPlanStubbedResponse.Http401Json -> AppsListAccountsForPlanStubbedApiException(response, statusCode, headers)
        is AppsListAccountsForPlanStubbedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat
   * pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When
   * someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the
   * upcoming pending change.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param planId The unique identifier of the plan.
   * @param direction To return the oldest accounts first, set to `asc`. Ignored without the `sort` parameter.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort The property to sort the results by.
   * @param options Execution options.
   */
  public suspend fun appsListAccountsForPlanStubbedWithResponse(
    planId: Int,
    direction: InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineSortParameterX37db756f? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListAccountsForPlanStubbedResponse> = executor.executeWithResponse<Unit, AppsListAccountsForPlanStubbedResponse>(SdkExecutionRequest(appsListAccountsForPlanStubbedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "plan_id", values = listOf(planId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListAccountsForPlanStubbedRequestCodecRegistry, AppsListAccountsForPlanStubbedResponseDecoder, options)

  /**
   * List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access
   * for an installation.
   *
   * The authenticated user has explicit permission to access repositories they own, repositories where they are a
   * collaborator, and repositories that they can access through an organization membership.
   *
   * The access the user has to each repository is included in the hash under the `permissions` key.
   *
   * @param installationId The unique identifier of the installation.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListInstallationReposForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded AppsListInstallationReposForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListInstallationReposForAuthenticatedUser(
    installationId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc = executor.executeWithTypedErrors<Unit, AppsListInstallationReposForAuthenticatedUserResponse, InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc>(
    request = SdkExecutionRequest(appsListInstallationReposForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListInstallationReposForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = AppsListInstallationReposForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListInstallationReposForAuthenticatedUserResponse.SuccessJson -> response.json
        is AppsListInstallationReposForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is AppsListInstallationReposForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListInstallationReposForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListInstallationReposForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListInstallationReposForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListInstallationReposForAuthenticatedUserResponse.Http304NoContent -> AppsListInstallationReposForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListInstallationReposForAuthenticatedUserResponse.Http403Json -> AppsListInstallationReposForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListInstallationReposForAuthenticatedUserResponse.Http404Json -> AppsListInstallationReposForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListInstallationReposForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List repositories that the authenticated user has explicit permission (`:read`, `:write`, or `:admin`) to access
   * for an installation.
   *
   * The authenticated user has explicit permission to access repositories they own, repositories where they are a
   * collaborator, and repositories that they can access through an organization membership.
   *
   * The access the user has to each repository is included in the hash under the `permissions` key.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param installationId The unique identifier of the installation.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun appsListInstallationReposForAuthenticatedUserWithResponse(
    installationId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListInstallationReposForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, AppsListInstallationReposForAuthenticatedUserResponse>(SdkExecutionRequest(appsListInstallationReposForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListInstallationReposForAuthenticatedUserRequestCodecRegistry, AppsListInstallationReposForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all the pending installation requests for the authenticated GitHub App.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListInstallationRequestsForAuthenticatedAppApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded AppsListInstallationRequestsForAuthenticatedAppError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListInstallationRequestsForAuthenticatedApp(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<IntegrationInstallationRequest> = executor.executeWithTypedErrors<Unit, AppsListInstallationRequestsForAuthenticatedAppResponse, List<IntegrationInstallationRequest>>(
    request = SdkExecutionRequest(appsListInstallationRequestsForAuthenticatedAppMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListInstallationRequestsForAuthenticatedAppRequestCodecRegistry,
    responseDecoder = AppsListInstallationRequestsForAuthenticatedAppResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListInstallationRequestsForAuthenticatedAppResponse.SuccessJson -> response.json
        is AppsListInstallationRequestsForAuthenticatedAppResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is AppsListInstallationRequestsForAuthenticatedAppResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListInstallationRequestsForAuthenticatedAppResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListInstallationRequestsForAuthenticatedAppResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListInstallationRequestsForAuthenticatedAppResponse.Http304NoContent -> AppsListInstallationRequestsForAuthenticatedAppApiException(response, statusCode, headers)
        is AppsListInstallationRequestsForAuthenticatedAppResponse.Http401Json -> AppsListInstallationRequestsForAuthenticatedAppApiException(response, statusCode, headers)
        is AppsListInstallationRequestsForAuthenticatedAppResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all the pending installation requests for the authenticated GitHub App.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun appsListInstallationRequestsForAuthenticatedAppWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListInstallationRequestsForAuthenticatedAppResponse> = executor.executeWithResponse<Unit, AppsListInstallationRequestsForAuthenticatedAppResponse>(SdkExecutionRequest(appsListInstallationRequestsForAuthenticatedAppMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListInstallationRequestsForAuthenticatedAppRequestCodecRegistry, AppsListInstallationRequestsForAuthenticatedAppResponseDecoder, options)

  /**
   * The permissions the installation has are included under the `permissions` key.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param outdated Wire parameter `outdated`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListInstallations(
    outdated: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): List<Installation> = executor.execute<Unit, List<Installation>>(SdkExecutionRequest(appsListInstallationsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "outdated", values = outdated?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(AppsCodecs.APPSLISTINSTALLATIONS_RESPONSE_CODEC_ID), AppsCodecs.appsListInstallationsRequestCodecRegistry, AppsCodecs.appsListInstallationsResponseCodecRegistry, options)

  /**
   * The permissions the installation has are included under the `permissions` key.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param outdated Wire parameter `outdated`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   */
  public suspend fun appsListInstallationsWithResponse(
    outdated: String? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListInstallationsResponse> = executor.executeWithResponse<Unit, AppsListInstallationsResponse>(SdkExecutionRequest(appsListInstallationsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "outdated", values = outdated?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListInstallationsRequestCodecRegistry, AppsListInstallationsResponseDecoder, options)

  /**
   * Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or
   * `:admin`) to access.
   *
   * The authenticated user has explicit permission to access repositories they own, repositories where they are a
   * collaborator, and repositories that they can access through an organization membership.
   *
   * You can find the permissions for the installation under the `permissions` key.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListInstallationsForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded AppsListInstallationsForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListInstallationsForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineUserInstallationsGetResponse200JsonXfc4c02bc = executor.executeWithTypedErrors<Unit, AppsListInstallationsForAuthenticatedUserResponse, InlineUserInstallationsGetResponse200JsonXfc4c02bc>(
    request = SdkExecutionRequest(appsListInstallationsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListInstallationsForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = AppsListInstallationsForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListInstallationsForAuthenticatedUserResponse.SuccessJson -> response.json
        is AppsListInstallationsForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is AppsListInstallationsForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListInstallationsForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListInstallationsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListInstallationsForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListInstallationsForAuthenticatedUserResponse.Http304NoContent -> AppsListInstallationsForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListInstallationsForAuthenticatedUserResponse.Http401Json -> AppsListInstallationsForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListInstallationsForAuthenticatedUserResponse.Http403Json -> AppsListInstallationsForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListInstallationsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists installations of your GitHub App that the authenticated user has explicit permission (`:read`, `:write`, or
   * `:admin`) to access.
   *
   * The authenticated user has explicit permission to access repositories they own, repositories where they are a
   * collaborator, and repositories that they can access through an organization membership.
   *
   * You can find the permissions for the installation under the `permissions` key.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun appsListInstallationsForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListInstallationsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, AppsListInstallationsForAuthenticatedUserResponse>(SdkExecutionRequest(appsListInstallationsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListInstallationsForAuthenticatedUserRequestCodecRegistry, AppsListInstallationsForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all plans that are part of your GitHub Marketplace listing.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListPlansApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded AppsListPlansError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListPlans(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<MarketplaceListingPlan> = executor.executeWithTypedErrors<Unit, AppsListPlansResponse, List<MarketplaceListingPlan>>(
    request = SdkExecutionRequest(appsListPlansMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListPlansRequestCodecRegistry,
    responseDecoder = AppsListPlansResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListPlansResponse.SuccessJson -> response.json
        is AppsListPlansResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListPlansResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListPlansResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListPlansResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListPlansResponse.Http401Json -> AppsListPlansApiException(response, statusCode, headers)
        is AppsListPlansResponse.Http404Json -> AppsListPlansApiException(response, statusCode, headers)
        is AppsListPlansResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all plans that are part of your GitHub Marketplace listing.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun appsListPlansWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListPlansResponse> = executor.executeWithResponse<Unit, AppsListPlansResponse>(SdkExecutionRequest(appsListPlansMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListPlansRequestCodecRegistry, AppsListPlansResponseDecoder, options)

  /**
   * Lists all plans that are part of your GitHub Marketplace listing.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListPlansStubbedApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsListPlansStubbedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListPlansStubbed(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<MarketplaceListingPlan> = executor.executeWithTypedErrors<Unit, AppsListPlansStubbedResponse, List<MarketplaceListingPlan>>(
    request = SdkExecutionRequest(appsListPlansStubbedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListPlansStubbedRequestCodecRegistry,
    responseDecoder = AppsListPlansStubbedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListPlansStubbedResponse.SuccessJson -> response.json
        is AppsListPlansStubbedResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListPlansStubbedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListPlansStubbedResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListPlansStubbedResponse.Http401Json -> AppsListPlansStubbedApiException(response, statusCode, headers)
        is AppsListPlansStubbedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all plans that are part of your GitHub Marketplace listing.
   *
   * GitHub Apps must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint. OAuth apps must use [basic
   * authentication](https://docs.github.com/rest/authentication/authenticating-to-the-rest-api#using-basic-authenticati
   * on) with their client ID and client secret to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun appsListPlansStubbedWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListPlansStubbedResponse> = executor.executeWithResponse<Unit, AppsListPlansStubbedResponse>(SdkExecutionRequest(appsListPlansStubbedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListPlansStubbedRequestCodecRegistry, AppsListPlansStubbedResponseDecoder, options)

  /**
   * List repositories that an app installation can access.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListReposAccessibleToInstallationApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded AppsListReposAccessibleToInstallationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListReposAccessibleToInstallation(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8 = executor.executeWithTypedErrors<Unit, AppsListReposAccessibleToInstallationResponse, InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8>(
    request = SdkExecutionRequest(appsListReposAccessibleToInstallationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListReposAccessibleToInstallationRequestCodecRegistry,
    responseDecoder = AppsListReposAccessibleToInstallationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListReposAccessibleToInstallationResponse.SuccessJson -> response.json
        is AppsListReposAccessibleToInstallationResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is AppsListReposAccessibleToInstallationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListReposAccessibleToInstallationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListReposAccessibleToInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListReposAccessibleToInstallationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListReposAccessibleToInstallationResponse.Http304NoContent -> AppsListReposAccessibleToInstallationApiException(response, statusCode, headers)
        is AppsListReposAccessibleToInstallationResponse.Http401Json -> AppsListReposAccessibleToInstallationApiException(response, statusCode, headers)
        is AppsListReposAccessibleToInstallationResponse.Http403Json -> AppsListReposAccessibleToInstallationApiException(response, statusCode, headers)
        is AppsListReposAccessibleToInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List repositories that an app installation can access.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun appsListReposAccessibleToInstallationWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListReposAccessibleToInstallationResponse> = executor.executeWithResponse<Unit, AppsListReposAccessibleToInstallationResponse>(SdkExecutionRequest(appsListReposAccessibleToInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListReposAccessibleToInstallationRequestCodecRegistry, AppsListReposAccessibleToInstallationResponseDecoder, options)

  /**
   * Lists the active subscriptions for the authenticated user.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListSubscriptionsForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded AppsListSubscriptionsForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListSubscriptionsForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<UserMarketplacePurchase> = executor.executeWithTypedErrors<Unit, AppsListSubscriptionsForAuthenticatedUserResponse, List<UserMarketplacePurchase>>(
    request = SdkExecutionRequest(appsListSubscriptionsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListSubscriptionsForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = AppsListSubscriptionsForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListSubscriptionsForAuthenticatedUserResponse.SuccessJson -> response.json
        is AppsListSubscriptionsForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is AppsListSubscriptionsForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListSubscriptionsForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListSubscriptionsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListSubscriptionsForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListSubscriptionsForAuthenticatedUserResponse.Http304NoContent -> AppsListSubscriptionsForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListSubscriptionsForAuthenticatedUserResponse.Http401Json -> AppsListSubscriptionsForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListSubscriptionsForAuthenticatedUserResponse.Http404Json -> AppsListSubscriptionsForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsListSubscriptionsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the active subscriptions for the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun appsListSubscriptionsForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListSubscriptionsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, AppsListSubscriptionsForAuthenticatedUserResponse>(SdkExecutionRequest(appsListSubscriptionsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListSubscriptionsForAuthenticatedUserRequestCodecRegistry, AppsListSubscriptionsForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the active subscriptions for the authenticated user.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListSubscriptionsForAuthenticatedUserStubbedApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * AppsListSubscriptionsForAuthenticatedUserStubbedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListSubscriptionsForAuthenticatedUserStubbed(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<UserMarketplacePurchase> = executor.executeWithTypedErrors<Unit, AppsListSubscriptionsForAuthenticatedUserStubbedResponse, List<UserMarketplacePurchase>>(
    request = SdkExecutionRequest(appsListSubscriptionsForAuthenticatedUserStubbedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListSubscriptionsForAuthenticatedUserStubbedRequestCodecRegistry,
    responseDecoder = AppsListSubscriptionsForAuthenticatedUserStubbedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListSubscriptionsForAuthenticatedUserStubbedResponse.SuccessJson -> response.json
        is AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListSubscriptionsForAuthenticatedUserStubbedResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Http304NoContent -> AppsListSubscriptionsForAuthenticatedUserStubbedApiException(response, statusCode, headers)
        is AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Http401Json -> AppsListSubscriptionsForAuthenticatedUserStubbedApiException(response, statusCode, headers)
        is AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the active subscriptions for the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun appsListSubscriptionsForAuthenticatedUserStubbedWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListSubscriptionsForAuthenticatedUserStubbedResponse> = executor.executeWithResponse<Unit, AppsListSubscriptionsForAuthenticatedUserStubbedResponse>(SdkExecutionRequest(appsListSubscriptionsForAuthenticatedUserStubbedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListSubscriptionsForAuthenticatedUserStubbedRequestCodecRegistry, AppsListSubscriptionsForAuthenticatedUserStubbedResponseDecoder, options)

  /**
   * Returns a list of webhook deliveries for the webhook configured for a GitHub App.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param cursor Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the
   * `link` header for the next and previous page cursors.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status Returns webhook deliveries filtered by delivery outcome classification based on `status_code` range.
   * A `status` of `success` returns deliveries with a `status_code` in the 200-399 range (inclusive). A `status` of
   * `failure` returns deliveries with a `status_code` in the 400-599 range (inclusive).
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsListWebhookDeliveriesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsListWebhookDeliveriesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsListWebhookDeliveries(
    cursor: String? = null,
    perPage: Int? = null,
    status: InlineWebhookDeliveryStatusParameterX02ba252e? = null,
    options: CallOptions = CallOptions(),
  ): List<HookDeliveryItem> = executor.executeWithTypedErrors<Unit, AppsListWebhookDeliveriesResponse, List<HookDeliveryItem>>(
    request = SdkExecutionRequest(appsListWebhookDeliveriesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cursor", values = cursor?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AppsCodecs.appsListWebhookDeliveriesRequestCodecRegistry,
    responseDecoder = AppsListWebhookDeliveriesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsListWebhookDeliveriesResponse.SuccessJson -> response.json
        is AppsListWebhookDeliveriesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListWebhookDeliveriesResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is AppsListWebhookDeliveriesResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsListWebhookDeliveriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsListWebhookDeliveriesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsListWebhookDeliveriesResponse.Http400Json -> AppsListWebhookDeliveriesApiException(response, statusCode, headers)
        is AppsListWebhookDeliveriesResponse.Http400ScimJson -> AppsListWebhookDeliveriesApiException(response, statusCode, headers)
        is AppsListWebhookDeliveriesResponse.Http422Json -> AppsListWebhookDeliveriesApiException(response, statusCode, headers)
        is AppsListWebhookDeliveriesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns a list of webhook deliveries for the webhook configured for a GitHub App.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param cursor Used for pagination: the starting delivery from which the page of deliveries is fetched. Refer to the
   * `link` header for the next and previous page cursors.
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param status Returns webhook deliveries filtered by delivery outcome classification based on `status_code` range.
   * A `status` of `success` returns deliveries with a `status_code` in the 200-399 range (inclusive). A `status` of
   * `failure` returns deliveries with a `status_code` in the 400-599 range (inclusive).
   * @param options Execution options.
   */
  public suspend fun appsListWebhookDeliveriesWithResponse(
    cursor: String? = null,
    perPage: Int? = null,
    status: InlineWebhookDeliveryStatusParameterX02ba252e? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsListWebhookDeliveriesResponse> = executor.executeWithResponse<Unit, AppsListWebhookDeliveriesResponse>(SdkExecutionRequest(appsListWebhookDeliveriesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cursor", values = cursor?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), AppsCodecs.appsListWebhookDeliveriesRequestCodecRegistry, AppsListWebhookDeliveriesResponseDecoder, options)

  /**
   * Redeliver a delivery for the webhook configured for a GitHub App.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param deliveryId Wire parameter `delivery_id`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsRedeliverWebhookDeliveryApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded AppsRedeliverWebhookDeliveryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsRedeliverWebhookDelivery(deliveryId: Int, options: CallOptions = CallOptions()): JsonObject = executor.executeWithTypedErrors<Unit, AppsRedeliverWebhookDeliveryResponse, JsonObject>(
    request = SdkExecutionRequest(appsRedeliverWebhookDeliveryMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "delivery_id", values = listOf(deliveryId.toString())))
    }),
    requestCodecs = AppsCodecs.appsRedeliverWebhookDeliveryRequestCodecRegistry,
    responseDecoder = AppsRedeliverWebhookDeliveryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsRedeliverWebhookDeliveryResponse.SuccessJson -> response.json
        is AppsRedeliverWebhookDeliveryResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsRedeliverWebhookDeliveryResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is AppsRedeliverWebhookDeliveryResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsRedeliverWebhookDeliveryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsRedeliverWebhookDeliveryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsRedeliverWebhookDeliveryResponse.Http400Json -> AppsRedeliverWebhookDeliveryApiException(response, statusCode, headers)
        is AppsRedeliverWebhookDeliveryResponse.Http400ScimJson -> AppsRedeliverWebhookDeliveryApiException(response, statusCode, headers)
        is AppsRedeliverWebhookDeliveryResponse.Http422Json -> AppsRedeliverWebhookDeliveryApiException(response, statusCode, headers)
        is AppsRedeliverWebhookDeliveryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Redeliver a delivery for the webhook configured for a GitHub App.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param deliveryId Wire parameter `delivery_id`.
   * @param options Execution options.
   */
  public suspend fun appsRedeliverWebhookDeliveryWithResponse(deliveryId: Int, options: CallOptions = CallOptions()): SdkResponseResult<AppsRedeliverWebhookDeliveryResponse> = executor.executeWithResponse<Unit, AppsRedeliverWebhookDeliveryResponse>(SdkExecutionRequest(appsRedeliverWebhookDeliveryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "delivery_id", values = listOf(deliveryId.toString())))
  }), AppsCodecs.appsRedeliverWebhookDeliveryRequestCodecRegistry, AppsRedeliverWebhookDeliveryResponseDecoder, options)

  /**
   * Remove a single repository from an installation. The authenticated user must have admin access to the repository.
   * The installation must have the `repository_selection` of `selected`.
   *
   * This endpoint only works for PATs (classic) with the `repo` scope.
   *
   * @param installationId The unique identifier of the installation.
   * @param repositoryId The unique identifier of the repository.
   * @param options Execution options.
   * @return No response body.
   * @throws AppsRemoveRepoFromInstallationForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * AppsRemoveRepoFromInstallationForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsRemoveRepoFromInstallationForAuthenticatedUser(
    installationId: Int,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, AppsRemoveRepoFromInstallationForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(appsRemoveRepoFromInstallationForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    }),
    requestCodecs = AppsCodecs.appsRemoveRepoFromInstallationForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = AppsRemoveRepoFromInstallationForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http422NoContent -> response.unit
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http304NoContent -> AppsRemoveRepoFromInstallationForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http403Json -> AppsRemoveRepoFromInstallationForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http404Json -> AppsRemoveRepoFromInstallationForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http422NoContent -> AppsRemoveRepoFromInstallationForAuthenticatedUserApiException(response, statusCode, headers)
        is AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Remove a single repository from an installation. The authenticated user must have admin access to the repository.
   * The installation must have the `repository_selection` of `selected`.
   *
   * This endpoint only works for PATs (classic) with the `repo` scope.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param installationId The unique identifier of the installation.
   * @param repositoryId The unique identifier of the repository.
   * @param options Execution options.
   */
  public suspend fun appsRemoveRepoFromInstallationForAuthenticatedUserWithResponse(
    installationId: Int,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsRemoveRepoFromInstallationForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, AppsRemoveRepoFromInstallationForAuthenticatedUserResponse>(SdkExecutionRequest(appsRemoveRepoFromInstallationForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
  }), AppsCodecs.appsRemoveRepoFromInstallationForAuthenticatedUserRequestCodecRegistry, AppsRemoveRepoFromInstallationForAuthenticatedUserResponseDecoder, options)

  /**
   * OAuth applications and GitHub applications with OAuth authorizations can use this API method to reset a valid OAuth
   * token without end-user involvement. Applications must save the "token" property in the response because changes
   * take effect immediately. Invalid tokens will return `404 NOT FOUND`.
   *
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsResetTokenApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded AppsResetTokenError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsResetToken(
    request: InlineApplicationsTokenPatchRequestJsonX56aa4ab6,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): Authorization = executor.executeWithTypedErrors<InlineApplicationsTokenPatchRequestJsonX56aa4ab6, AppsResetTokenResponse, Authorization>(
    request = SdkExecutionRequest(appsResetTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSRESETTOKEN_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
    }),
    requestCodecs = AppsCodecs.appsResetTokenRequestCodecRegistry,
    responseDecoder = AppsResetTokenResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsResetTokenResponse.SuccessJson -> response.json
        is AppsResetTokenResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsResetTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsResetTokenResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsResetTokenResponse.Http422Json -> AppsResetTokenApiException(response, statusCode, headers)
        is AppsResetTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth applications and GitHub applications with OAuth authorizations can use this API method to reset a valid OAuth
   * token without end-user involvement. Applications must save the "token" property in the response because changes
   * take effect immediately. Invalid tokens will return `404 NOT FOUND`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   */
  public suspend fun appsResetTokenWithResponse(
    request: InlineApplicationsTokenPatchRequestJsonX56aa4ab6,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsResetTokenResponse> = executor.executeWithResponse<InlineApplicationsTokenPatchRequestJsonX56aa4ab6, AppsResetTokenResponse>(SdkExecutionRequest(appsResetTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSRESETTOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
  }), AppsCodecs.appsResetTokenRequestCodecRegistry, AppsResetTokenResponseDecoder, options)

  /**
   * Revokes the installation token you're using to authenticate as an installation and access this endpoint.
   *
   * Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require
   * the revoked installation token must have a new installation token to work. You can create a new token using the
   * "[Create an installation access token for an
   * app](https://docs.github.com/rest/apps/apps#create-an-installation-access-token-for-an-app)" endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsRevokeInstallationAccessToken(options: CallOptions = CallOptions()): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(appsRevokeInstallationAccessTokenMetadata, baseUri, Unit, emptyList(), emptyList()), AppsCodecs.appsRevokeInstallationAccessTokenRequestCodecRegistry, options)

  /**
   * Revokes the installation token you're using to authenticate as an installation and access this endpoint.
   *
   * Once an installation token is revoked, the token is invalidated and cannot be used. Other endpoints that require
   * the revoked installation token must have a new installation token to work. You can create a new token using the
   * "[Create an installation access token for an
   * app](https://docs.github.com/rest/apps/apps#create-an-installation-access-token-for-an-app)" endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun appsRevokeInstallationAccessTokenWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<AppsRevokeInstallationAccessTokenResponse> = executor.executeWithResponse<Unit, AppsRevokeInstallationAccessTokenResponse>(SdkExecutionRequest(appsRevokeInstallationAccessTokenMetadata, baseUri, Unit, emptyList(), emptyList()), AppsCodecs.appsRevokeInstallationAccessTokenRequestCodecRegistry, AppsRevokeInstallationAccessTokenResponseDecoder, options)

  /**
   * Use a non-scoped user access token to create a repository-scoped and/or permission-scoped user access token. You
   * can specify
   * which repositories the token can access and which permissions are granted to the
   * token.
   *
   * Invalid tokens will return `404 NOT FOUND`.
   *
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws AppsScopeTokenApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded AppsScopeTokenError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsScopeToken(
    request: InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): Authorization = executor.executeWithTypedErrors<InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8, AppsScopeTokenResponse, Authorization>(
    request = SdkExecutionRequest(appsScopeTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSSCOPETOKEN_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
    }),
    requestCodecs = AppsCodecs.appsScopeTokenRequestCodecRegistry,
    responseDecoder = AppsScopeTokenResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsScopeTokenResponse.SuccessJson -> response.json
        is AppsScopeTokenResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsScopeTokenResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsScopeTokenResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsScopeTokenResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsScopeTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsScopeTokenResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is AppsScopeTokenResponse.Http401Json -> AppsScopeTokenApiException(response, statusCode, headers)
        is AppsScopeTokenResponse.Http403Json -> AppsScopeTokenApiException(response, statusCode, headers)
        is AppsScopeTokenResponse.Http404Json -> AppsScopeTokenApiException(response, statusCode, headers)
        is AppsScopeTokenResponse.Http422Json -> AppsScopeTokenApiException(response, statusCode, headers)
        is AppsScopeTokenResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use a non-scoped user access token to create a repository-scoped and/or permission-scoped user access token. You
   * can specify
   * which repositories the token can access and which permissions are granted to the
   * token.
   *
   * Invalid tokens will return `404 NOT FOUND`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param clientId The client ID of the GitHub app.
   * @param options Execution options.
   */
  public suspend fun appsScopeTokenWithResponse(
    request: InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8,
    clientId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<AppsScopeTokenResponse> = executor.executeWithResponse<InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8, AppsScopeTokenResponse>(SdkExecutionRequest(appsScopeTokenMetadata, baseUri, request, listOf(AppsCodecs.APPSSCOPETOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "client_id", values = listOf(clientId.toString())))
  }), AppsCodecs.appsScopeTokenRequestCodecRegistry, AppsScopeTokenResponseDecoder, options)

  /**
   * Suspends a GitHub App on a user, organization, or enterprise account, which blocks the app from accessing the
   * account's resources. When a GitHub App is suspended, the app's access to the GitHub API or webhook events is
   * blocked for that account.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   * @return No response body.
   * @throws AppsSuspendInstallationApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsSuspendInstallationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsSuspendInstallation(installationId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, AppsSuspendInstallationResponse, Unit>(
    request = SdkExecutionRequest(appsSuspendInstallationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
    }),
    requestCodecs = AppsCodecs.appsSuspendInstallationRequestCodecRegistry,
    responseDecoder = AppsSuspendInstallationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsSuspendInstallationResponse.SuccessNoContent -> response.unit
        is AppsSuspendInstallationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsSuspendInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsSuspendInstallationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AppsSuspendInstallationResponse.Http404Json -> AppsSuspendInstallationApiException(response, statusCode, headers)
        is AppsSuspendInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Suspends a GitHub App on a user, organization, or enterprise account, which blocks the app from accessing the
   * account's resources. When a GitHub App is suspended, the app's access to the GitHub API or webhook events is
   * blocked for that account.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   */
  public suspend fun appsSuspendInstallationWithResponse(installationId: Int, options: CallOptions = CallOptions()): SdkResponseResult<AppsSuspendInstallationResponse> = executor.executeWithResponse<Unit, AppsSuspendInstallationResponse>(SdkExecutionRequest(appsSuspendInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
  }), AppsCodecs.appsSuspendInstallationRequestCodecRegistry, AppsSuspendInstallationResponseDecoder, options)

  /**
   * Removes a GitHub App installation suspension.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   * @return No response body.
   * @throws AppsUnsuspendInstallationApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded AppsUnsuspendInstallationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsUnsuspendInstallation(installationId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, AppsUnsuspendInstallationResponse, Unit>(
    request = SdkExecutionRequest(appsUnsuspendInstallationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
    }),
    requestCodecs = AppsCodecs.appsUnsuspendInstallationRequestCodecRegistry,
    responseDecoder = AppsUnsuspendInstallationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is AppsUnsuspendInstallationResponse.SuccessNoContent -> response.unit
        is AppsUnsuspendInstallationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is AppsUnsuspendInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is AppsUnsuspendInstallationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is AppsUnsuspendInstallationResponse.Http404Json -> AppsUnsuspendInstallationApiException(response, statusCode, headers)
        is AppsUnsuspendInstallationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a GitHub App installation suspension.
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param installationId The unique identifier of the installation.
   * @param options Execution options.
   */
  public suspend fun appsUnsuspendInstallationWithResponse(installationId: Int, options: CallOptions = CallOptions()): SdkResponseResult<AppsUnsuspendInstallationResponse> = executor.executeWithResponse<Unit, AppsUnsuspendInstallationResponse>(SdkExecutionRequest(appsUnsuspendInstallationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "installation_id", values = listOf(installationId.toString())))
  }), AppsCodecs.appsUnsuspendInstallationRequestCodecRegistry, AppsUnsuspendInstallationResponseDecoder, options)

  /**
   * Updates the webhook configuration for a GitHub App. For more information about configuring a webhook for your app,
   * see "[Creating a GitHub App](/developers/apps/creating-a-github-app)."
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun appsUpdateWebhookConfigForApp(request: InlineAppHookConfigPatchRequestJsonXac78b7f1, options: CallOptions = CallOptions()): WebhookConfig = executor.execute<InlineAppHookConfigPatchRequestJsonXac78b7f1, WebhookConfig>(SdkExecutionRequest(appsUpdateWebhookConfigForAppMetadata, baseUri, request, listOf(AppsCodecs.APPSUPDATEWEBHOOKCONFIGFORAPP_REQUEST_CODEC_ID), emptyList()), listOf(AppsCodecs.APPSUPDATEWEBHOOKCONFIGFORAPP_RESPONSE_CODEC_ID), AppsCodecs.appsUpdateWebhookConfigForAppRequestCodecRegistry, AppsCodecs.appsUpdateWebhookConfigForAppResponseCodecRegistry, options)

  /**
   * Updates the webhook configuration for a GitHub App. For more information about configuring a webhook for your app,
   * see "[Creating a GitHub App](/developers/apps/creating-a-github-app)."
   *
   * You must use a
   * [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github
   * -app) to access this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun appsUpdateWebhookConfigForAppWithResponse(request: InlineAppHookConfigPatchRequestJsonXac78b7f1, options: CallOptions = CallOptions()): SdkResponseResult<AppsUpdateWebhookConfigForAppResponse> = executor.executeWithResponse<InlineAppHookConfigPatchRequestJsonXac78b7f1, AppsUpdateWebhookConfigForAppResponse>(SdkExecutionRequest(appsUpdateWebhookConfigForAppMetadata, baseUri, request, listOf(AppsCodecs.APPSUPDATEWEBHOOKCONFIGFORAPP_REQUEST_CODEC_ID), emptyList()), AppsCodecs.appsUpdateWebhookConfigForAppRequestCodecRegistry, AppsUpdateWebhookConfigForAppResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `apps/add-repo-to-installation-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface AppsAddRepoToInstallationForAuthenticatedUserError

  /**
   * Typed response alternatives for `apps/add-repo-to-installation-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface AppsAddRepoToInstallationForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsAddRepoToInstallationForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsAddRepoToInstallationForAuthenticatedUserResponse,
        AppsAddRepoToInstallationForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsAddRepoToInstallationForAuthenticatedUserResponse,
        AppsAddRepoToInstallationForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsAddRepoToInstallationForAuthenticatedUserResponse,
        AppsAddRepoToInstallationForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsAddRepoToInstallationForAuthenticatedUserResponse
  }

  /**
   * Raised by `apps/add-repo-to-installation-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsAddRepoToInstallationForAuthenticatedUserApiException(
    public val error: AppsAddRepoToInstallationForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/add-repo-to-installation-for-authenticated-user")

  private object AppsAddRepoToInstallationForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<AppsAddRepoToInstallationForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsAddRepoToInstallationForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsAddRepoToInstallationForAuthenticatedUserResponse> = when {
      alternative.id == "apps/add-repo-to-installation-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsAddRepoToInstallationForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/add-repo-to-installation-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsAddRepoToInstallationForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/add-repo-to-installation-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsAddRepoToInstallationForAuthenticatedUserResponse.Http403Json(
          json = AppsCodecs.appsAddRepoToInstallationForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("apps/add-repo-to-installation-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/add-repo-to-installation-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsAddRepoToInstallationForAuthenticatedUserResponse.Http404Json(
          json = AppsCodecs.appsAddRepoToInstallationForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("apps/add-repo-to-installation-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsAddRepoToInstallationForAuthenticatedUserResponse = AppsAddRepoToInstallationForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/check-token` may expose through its typed API exception.
   */
  public sealed interface AppsCheckTokenError

  /**
   * Typed response alternatives for `apps/check-token`. Non-success alternatives are not converted into success values.
   */
  public sealed interface AppsCheckTokenResponse {
    public class SuccessJson(
      public val json: Authorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCheckTokenResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCheckTokenResponse,
        AppsCheckTokenError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCheckTokenResponse,
        AppsCheckTokenError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCheckTokenResponse
  }

  /**
   * Raised by `apps/check-token` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class AppsCheckTokenApiException(
    public val error: AppsCheckTokenError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/check-token")

  private object AppsCheckTokenResponseDecoder : SdkResponseAlternativeDecoder<AppsCheckTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsCheckTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsCheckTokenResponse> = when {
      alternative.id == "apps/check-token.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsCheckTokenResponse.SuccessJson(
          json = AppsCodecs.appsCheckTokenResponseCodecAlternative0Registry.select(listOf("apps/check-token.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/check-token.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsCheckTokenResponse.Http404Json(
          json = AppsCodecs.appsCheckTokenResponseCodecAlternative1Registry.select(listOf("apps/check-token.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/check-token.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsCheckTokenResponse.Http422Json(
          json = AppsCodecs.appsCheckTokenResponseCodecAlternative2Registry.select(listOf("apps/check-token.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsCheckTokenResponse = AppsCheckTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/create-from-manifest` may expose through its typed API
   * exception.
   */
  public sealed interface AppsCreateFromManifestError

  /**
   * Typed response alternatives for `apps/create-from-manifest`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsCreateFromManifestResponse {
    public class SuccessJson(
      public val json: InlineAppManifestsConversionsPostResponse201JsonX50717f97,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateFromManifestResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateFromManifestResponse,
        AppsCreateFromManifestError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateFromManifestResponse,
        AppsCreateFromManifestError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateFromManifestResponse
  }

  /**
   * Raised by `apps/create-from-manifest` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsCreateFromManifestApiException(
    public val error: AppsCreateFromManifestError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/create-from-manifest")

  private object AppsCreateFromManifestResponseDecoder : SdkResponseAlternativeDecoder<AppsCreateFromManifestResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsCreateFromManifestResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsCreateFromManifestResponse> = when {
      alternative.id == "apps/create-from-manifest.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsCreateFromManifestResponse.SuccessJson(
          json = AppsCodecs.appsCreateFromManifestResponseCodecAlternative0Registry.select(listOf("apps/create-from-manifest.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/create-from-manifest.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsCreateFromManifestResponse.Http404Json(
          json = AppsCodecs.appsCreateFromManifestResponseCodecAlternative1Registry.select(listOf("apps/create-from-manifest.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/create-from-manifest.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsCreateFromManifestResponse.Http422Json(
          json = AppsCodecs.appsCreateFromManifestResponseCodecAlternative2Registry.select(listOf("apps/create-from-manifest.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsCreateFromManifestResponse = AppsCreateFromManifestResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/create-installation-access-token` may expose through its typed
   * API exception.
   */
  public sealed interface AppsCreateInstallationAccessTokenError

  /**
   * Typed response alternatives for `apps/create-installation-access-token`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface AppsCreateInstallationAccessTokenResponse {
    public class SuccessJson(
      public val json: InstallationToken,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateInstallationAccessTokenResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateInstallationAccessTokenResponse,
        AppsCreateInstallationAccessTokenError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateInstallationAccessTokenResponse,
        AppsCreateInstallationAccessTokenError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateInstallationAccessTokenResponse,
        AppsCreateInstallationAccessTokenError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateInstallationAccessTokenResponse,
        AppsCreateInstallationAccessTokenError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsCreateInstallationAccessTokenResponse
  }

  /**
   * Raised by `apps/create-installation-access-token` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class AppsCreateInstallationAccessTokenApiException(
    public val error: AppsCreateInstallationAccessTokenError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/create-installation-access-token")

  private object AppsCreateInstallationAccessTokenResponseDecoder : SdkResponseAlternativeDecoder<AppsCreateInstallationAccessTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsCreateInstallationAccessTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsCreateInstallationAccessTokenResponse> = when {
      alternative.id == "apps/create-installation-access-token.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsCreateInstallationAccessTokenResponse.SuccessJson(
          json = AppsCodecs.appsCreateInstallationAccessTokenResponseCodecAlternative0Registry.select(listOf("apps/create-installation-access-token.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/create-installation-access-token.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsCreateInstallationAccessTokenResponse.Http401Json(
          json = AppsCodecs.appsCreateInstallationAccessTokenResponseCodecAlternative1Registry.select(listOf("apps/create-installation-access-token.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/create-installation-access-token.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsCreateInstallationAccessTokenResponse.Http403Json(
          json = AppsCodecs.appsCreateInstallationAccessTokenResponseCodecAlternative2Registry.select(listOf("apps/create-installation-access-token.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/create-installation-access-token.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsCreateInstallationAccessTokenResponse.Http404Json(
          json = AppsCodecs.appsCreateInstallationAccessTokenResponseCodecAlternative3Registry.select(listOf("apps/create-installation-access-token.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/create-installation-access-token.response.alternative4" -> SdkResponseDecodeResult(
        value = AppsCreateInstallationAccessTokenResponse.Http422Json(
          json = AppsCodecs.appsCreateInstallationAccessTokenResponseCodecAlternative4Registry.select(listOf("apps/create-installation-access-token.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsCreateInstallationAccessTokenResponse = AppsCreateInstallationAccessTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/delete-authorization` may expose through its typed API
   * exception.
   */
  public sealed interface AppsDeleteAuthorizationError

  /**
   * Typed response alternatives for `apps/delete-authorization`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsDeleteAuthorizationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteAuthorizationResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteAuthorizationResponse,
        AppsDeleteAuthorizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteAuthorizationResponse
  }

  /**
   * Raised by `apps/delete-authorization` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsDeleteAuthorizationApiException(
    public val error: AppsDeleteAuthorizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/delete-authorization")

  private object AppsDeleteAuthorizationResponseDecoder : SdkResponseAlternativeDecoder<AppsDeleteAuthorizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsDeleteAuthorizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsDeleteAuthorizationResponse> = when {
      alternative.id == "apps/delete-authorization.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsDeleteAuthorizationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/delete-authorization.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsDeleteAuthorizationResponse.Http422Json(
          json = AppsCodecs.appsDeleteAuthorizationResponseCodecAlternative1Registry.select(listOf("apps/delete-authorization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsDeleteAuthorizationResponse = AppsDeleteAuthorizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/delete-installation` may expose through its typed API
   * exception.
   */
  public sealed interface AppsDeleteInstallationError

  /**
   * Typed response alternatives for `apps/delete-installation`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AppsDeleteInstallationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteInstallationResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteInstallationResponse,
        AppsDeleteInstallationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteInstallationResponse
  }

  /**
   * Raised by `apps/delete-installation` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsDeleteInstallationApiException(
    public val error: AppsDeleteInstallationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/delete-installation")

  private object AppsDeleteInstallationResponseDecoder : SdkResponseAlternativeDecoder<AppsDeleteInstallationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsDeleteInstallationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsDeleteInstallationResponse> = when {
      alternative.id == "apps/delete-installation.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsDeleteInstallationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/delete-installation.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsDeleteInstallationResponse.Http404Json(
          json = AppsCodecs.appsDeleteInstallationResponseCodecAlternative1Registry.select(listOf("apps/delete-installation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsDeleteInstallationResponse = AppsDeleteInstallationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/delete-token` may expose through its typed API exception.
   */
  public sealed interface AppsDeleteTokenError

  /**
   * Typed response alternatives for `apps/delete-token`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AppsDeleteTokenResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteTokenResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteTokenResponse,
        AppsDeleteTokenError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsDeleteTokenResponse
  }

  /**
   * Raised by `apps/delete-token` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class AppsDeleteTokenApiException(
    public val error: AppsDeleteTokenError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/delete-token")

  private object AppsDeleteTokenResponseDecoder : SdkResponseAlternativeDecoder<AppsDeleteTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsDeleteTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsDeleteTokenResponse> = when {
      alternative.id == "apps/delete-token.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsDeleteTokenResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/delete-token.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsDeleteTokenResponse.Http422Json(
          json = AppsCodecs.appsDeleteTokenResponseCodecAlternative1Registry.select(listOf("apps/delete-token.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsDeleteTokenResponse = AppsDeleteTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `apps/get-authenticated`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AppsGetAuthenticatedResponse {
    public class SuccessJson(
      public val json: Integration?,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetAuthenticatedResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetAuthenticatedResponse
  }

  private object AppsGetAuthenticatedResponseDecoder : SdkResponseAlternativeDecoder<AppsGetAuthenticatedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetAuthenticatedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetAuthenticatedResponse> = when {
      alternative.id == "apps/get-authenticated.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetAuthenticatedResponse.SuccessJson(
          json = AppsCodecs.appsGetAuthenticatedResponseCodecAlternative0Registry.select(listOf("apps/get-authenticated.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetAuthenticatedResponse = AppsGetAuthenticatedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/get-by-slug` may expose through its typed API exception.
   */
  public sealed interface AppsGetBySlugError

  /**
   * Typed response alternatives for `apps/get-by-slug`. Non-success alternatives are not converted into success values.
   */
  public sealed interface AppsGetBySlugResponse {
    public class SuccessJson(
      public val json: Integration?,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetBySlugResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetBySlugResponse,
        AppsGetBySlugError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetBySlugResponse,
        AppsGetBySlugError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetBySlugResponse
  }

  /**
   * Raised by `apps/get-by-slug` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class AppsGetBySlugApiException(
    public val error: AppsGetBySlugError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/get-by-slug")

  private object AppsGetBySlugResponseDecoder : SdkResponseAlternativeDecoder<AppsGetBySlugResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetBySlugResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetBySlugResponse> = when {
      alternative.id == "apps/get-by-slug.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetBySlugResponse.SuccessJson(
          json = AppsCodecs.appsGetBySlugResponseCodecAlternative0Registry.select(listOf("apps/get-by-slug.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-by-slug.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsGetBySlugResponse.Http403Json(
          json = AppsCodecs.appsGetBySlugResponseCodecAlternative1Registry.select(listOf("apps/get-by-slug.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-by-slug.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsGetBySlugResponse.Http404Json(
          json = AppsCodecs.appsGetBySlugResponseCodecAlternative2Registry.select(listOf("apps/get-by-slug.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetBySlugResponse = AppsGetBySlugResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/get-installation` may expose through its typed API exception.
   */
  public sealed interface AppsGetInstallationError

  /**
   * Typed response alternatives for `apps/get-installation`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AppsGetInstallationResponse {
    public class SuccessJson(
      public val json: Installation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetInstallationResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetInstallationResponse,
        AppsGetInstallationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetInstallationResponse
  }

  /**
   * Raised by `apps/get-installation` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsGetInstallationApiException(
    public val error: AppsGetInstallationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/get-installation")

  private object AppsGetInstallationResponseDecoder : SdkResponseAlternativeDecoder<AppsGetInstallationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetInstallationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetInstallationResponse> = when {
      alternative.id == "apps/get-installation.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetInstallationResponse.SuccessJson(
          json = AppsCodecs.appsGetInstallationResponseCodecAlternative0Registry.select(listOf("apps/get-installation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-installation.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsGetInstallationResponse.Http404Json(
          json = AppsCodecs.appsGetInstallationResponseCodecAlternative1Registry.select(listOf("apps/get-installation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetInstallationResponse = AppsGetInstallationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `apps/get-org-installation`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsGetOrgInstallationResponse {
    public class SuccessJson(
      public val json: Installation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetOrgInstallationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetOrgInstallationResponse
  }

  private object AppsGetOrgInstallationResponseDecoder : SdkResponseAlternativeDecoder<AppsGetOrgInstallationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetOrgInstallationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetOrgInstallationResponse> = when {
      alternative.id == "apps/get-org-installation.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetOrgInstallationResponse.SuccessJson(
          json = AppsCodecs.appsGetOrgInstallationResponseCodecAlternative0Registry.select(listOf("apps/get-org-installation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetOrgInstallationResponse = AppsGetOrgInstallationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/get-repo-installation` may expose through its typed API
   * exception.
   */
  public sealed interface AppsGetRepoInstallationError

  /**
   * Typed response alternatives for `apps/get-repo-installation`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsGetRepoInstallationResponse {
    public class SuccessJson(
      public val json: Installation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetRepoInstallationResponse

    public class Http301Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetRepoInstallationResponse,
        AppsGetRepoInstallationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetRepoInstallationResponse,
        AppsGetRepoInstallationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetRepoInstallationResponse
  }

  /**
   * Raised by `apps/get-repo-installation` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsGetRepoInstallationApiException(
    public val error: AppsGetRepoInstallationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/get-repo-installation")

  private object AppsGetRepoInstallationResponseDecoder : SdkResponseAlternativeDecoder<AppsGetRepoInstallationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetRepoInstallationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetRepoInstallationResponse> = when {
      alternative.id == "apps/get-repo-installation.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetRepoInstallationResponse.SuccessJson(
          json = AppsCodecs.appsGetRepoInstallationResponseCodecAlternative0Registry.select(listOf("apps/get-repo-installation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-repo-installation.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsGetRepoInstallationResponse.Http301Json(
          json = AppsCodecs.appsGetRepoInstallationResponseCodecAlternative1Registry.select(listOf("apps/get-repo-installation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-repo-installation.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsGetRepoInstallationResponse.Http404Json(
          json = AppsCodecs.appsGetRepoInstallationResponseCodecAlternative2Registry.select(listOf("apps/get-repo-installation.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetRepoInstallationResponse = AppsGetRepoInstallationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/get-subscription-plan-for-account` may expose through its
   * typed API exception.
   */
  public sealed interface AppsGetSubscriptionPlanForAccountError

  /**
   * Typed response alternatives for `apps/get-subscription-plan-for-account`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AppsGetSubscriptionPlanForAccountResponse {
    public class SuccessJson(
      public val json: MarketplacePurchase,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetSubscriptionPlanForAccountResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetSubscriptionPlanForAccountResponse,
        AppsGetSubscriptionPlanForAccountError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetSubscriptionPlanForAccountResponse,
        AppsGetSubscriptionPlanForAccountError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetSubscriptionPlanForAccountResponse
  }

  /**
   * Raised by `apps/get-subscription-plan-for-account` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class AppsGetSubscriptionPlanForAccountApiException(
    public val error: AppsGetSubscriptionPlanForAccountError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/get-subscription-plan-for-account")

  private object AppsGetSubscriptionPlanForAccountResponseDecoder : SdkResponseAlternativeDecoder<AppsGetSubscriptionPlanForAccountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetSubscriptionPlanForAccountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetSubscriptionPlanForAccountResponse> = when {
      alternative.id == "apps/get-subscription-plan-for-account.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetSubscriptionPlanForAccountResponse.SuccessJson(
          json = AppsCodecs.appsGetSubscriptionPlanForAccountResponseCodecAlternative0Registry.select(listOf("apps/get-subscription-plan-for-account.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-subscription-plan-for-account.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsGetSubscriptionPlanForAccountResponse.Http401Json(
          json = AppsCodecs.appsGetSubscriptionPlanForAccountResponseCodecAlternative1Registry.select(listOf("apps/get-subscription-plan-for-account.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-subscription-plan-for-account.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsGetSubscriptionPlanForAccountResponse.Http404Json(
          json = AppsCodecs.appsGetSubscriptionPlanForAccountResponseCodecAlternative2Registry.select(listOf("apps/get-subscription-plan-for-account.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetSubscriptionPlanForAccountResponse = AppsGetSubscriptionPlanForAccountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/get-subscription-plan-for-account-stubbed` may expose through
   * its typed API exception.
   */
  public sealed interface AppsGetSubscriptionPlanForAccountStubbedError

  /**
   * Typed response alternatives for `apps/get-subscription-plan-for-account-stubbed`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AppsGetSubscriptionPlanForAccountStubbedResponse {
    public class SuccessJson(
      public val json: MarketplacePurchase,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetSubscriptionPlanForAccountStubbedResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetSubscriptionPlanForAccountStubbedResponse,
        AppsGetSubscriptionPlanForAccountStubbedError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetSubscriptionPlanForAccountStubbedResponse,
        AppsGetSubscriptionPlanForAccountStubbedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetSubscriptionPlanForAccountStubbedResponse
  }

  /**
   * Raised by `apps/get-subscription-plan-for-account-stubbed` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsGetSubscriptionPlanForAccountStubbedApiException(
    public val error: AppsGetSubscriptionPlanForAccountStubbedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/get-subscription-plan-for-account-stubbed")

  private object AppsGetSubscriptionPlanForAccountStubbedResponseDecoder : SdkResponseAlternativeDecoder<AppsGetSubscriptionPlanForAccountStubbedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetSubscriptionPlanForAccountStubbedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetSubscriptionPlanForAccountStubbedResponse> = when {
      alternative.id == "apps/get-subscription-plan-for-account-stubbed.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetSubscriptionPlanForAccountStubbedResponse.SuccessJson(
          json = AppsCodecs.appsGetSubscriptionPlanForAccountStubbedResponseCodecAlternative0Registry.select(listOf("apps/get-subscription-plan-for-account-stubbed.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-subscription-plan-for-account-stubbed.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsGetSubscriptionPlanForAccountStubbedResponse.Http401Json(
          json = AppsCodecs.appsGetSubscriptionPlanForAccountStubbedResponseCodecAlternative1Registry.select(listOf("apps/get-subscription-plan-for-account-stubbed.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-subscription-plan-for-account-stubbed.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsGetSubscriptionPlanForAccountStubbedResponse.Http404NoContent(
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
    ): AppsGetSubscriptionPlanForAccountStubbedResponse = AppsGetSubscriptionPlanForAccountStubbedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `apps/get-user-installation`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsGetUserInstallationResponse {
    public class SuccessJson(
      public val json: Installation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetUserInstallationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetUserInstallationResponse
  }

  private object AppsGetUserInstallationResponseDecoder : SdkResponseAlternativeDecoder<AppsGetUserInstallationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetUserInstallationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetUserInstallationResponse> = when {
      alternative.id == "apps/get-user-installation.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetUserInstallationResponse.SuccessJson(
          json = AppsCodecs.appsGetUserInstallationResponseCodecAlternative0Registry.select(listOf("apps/get-user-installation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetUserInstallationResponse = AppsGetUserInstallationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `apps/get-webhook-config-for-app`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsGetWebhookConfigForAppResponse {
    public class SuccessJson(
      public val json: WebhookConfig,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetWebhookConfigForAppResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetWebhookConfigForAppResponse
  }

  private object AppsGetWebhookConfigForAppResponseDecoder : SdkResponseAlternativeDecoder<AppsGetWebhookConfigForAppResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetWebhookConfigForAppResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetWebhookConfigForAppResponse> = when {
      alternative.id == "apps/get-webhook-config-for-app.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetWebhookConfigForAppResponse.SuccessJson(
          json = AppsCodecs.appsGetWebhookConfigForAppResponseCodecAlternative0Registry.select(listOf("apps/get-webhook-config-for-app.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetWebhookConfigForAppResponse = AppsGetWebhookConfigForAppResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/get-webhook-delivery` may expose through its typed API
   * exception.
   */
  public sealed interface AppsGetWebhookDeliveryError

  /**
   * Typed response alternatives for `apps/get-webhook-delivery`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsGetWebhookDeliveryResponse {
    public class SuccessJson(
      public val json: HookDelivery,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetWebhookDeliveryResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetWebhookDeliveryResponse,
        AppsGetWebhookDeliveryError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetWebhookDeliveryResponse,
        AppsGetWebhookDeliveryError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetWebhookDeliveryResponse,
        AppsGetWebhookDeliveryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsGetWebhookDeliveryResponse
  }

  /**
   * Raised by `apps/get-webhook-delivery` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsGetWebhookDeliveryApiException(
    public val error: AppsGetWebhookDeliveryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/get-webhook-delivery")

  private object AppsGetWebhookDeliveryResponseDecoder : SdkResponseAlternativeDecoder<AppsGetWebhookDeliveryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsGetWebhookDeliveryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsGetWebhookDeliveryResponse> = when {
      alternative.id == "apps/get-webhook-delivery.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsGetWebhookDeliveryResponse.SuccessJson(
          json = AppsCodecs.appsGetWebhookDeliveryResponseCodecAlternative0Registry.select(listOf("apps/get-webhook-delivery.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-webhook-delivery.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsGetWebhookDeliveryResponse.Http400Json(
          json = AppsCodecs.appsGetWebhookDeliveryResponseCodecAlternative1Registry.select(listOf("apps/get-webhook-delivery.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-webhook-delivery.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsGetWebhookDeliveryResponse.Http400ScimJson(
          json = AppsCodecs.appsGetWebhookDeliveryResponseCodecAlternative2Registry.select(listOf("apps/get-webhook-delivery.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/get-webhook-delivery.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsGetWebhookDeliveryResponse.Http422Json(
          json = AppsCodecs.appsGetWebhookDeliveryResponseCodecAlternative3Registry.select(listOf("apps/get-webhook-delivery.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsGetWebhookDeliveryResponse = AppsGetWebhookDeliveryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-accounts-for-plan` may expose through its typed API
   * exception.
   */
  public sealed interface AppsListAccountsForPlanError

  /**
   * Typed response alternatives for `apps/list-accounts-for-plan`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsListAccountsForPlanResponse {
    public class SuccessJson(
      public val json: List<MarketplacePurchase>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListAccountsForPlanResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListAccountsForPlanResponse,
        AppsListAccountsForPlanError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListAccountsForPlanResponse,
        AppsListAccountsForPlanError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListAccountsForPlanResponse,
        AppsListAccountsForPlanError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListAccountsForPlanResponse
  }

  /**
   * Raised by `apps/list-accounts-for-plan` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsListAccountsForPlanApiException(
    public val error: AppsListAccountsForPlanError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-accounts-for-plan")

  private object AppsListAccountsForPlanResponseDecoder : SdkResponseAlternativeDecoder<AppsListAccountsForPlanResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListAccountsForPlanResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListAccountsForPlanResponse> = when {
      alternative.id == "apps/list-accounts-for-plan.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListAccountsForPlanResponse.SuccessJson(
          json = AppsCodecs.appsListAccountsForPlanResponseCodecAlternative0Registry.select(listOf("apps/list-accounts-for-plan.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-accounts-for-plan.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListAccountsForPlanResponse.Http401Json(
          json = AppsCodecs.appsListAccountsForPlanResponseCodecAlternative1Registry.select(listOf("apps/list-accounts-for-plan.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-accounts-for-plan.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListAccountsForPlanResponse.Http404Json(
          json = AppsCodecs.appsListAccountsForPlanResponseCodecAlternative2Registry.select(listOf("apps/list-accounts-for-plan.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-accounts-for-plan.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsListAccountsForPlanResponse.Http422Json(
          json = AppsCodecs.appsListAccountsForPlanResponseCodecAlternative3Registry.select(listOf("apps/list-accounts-for-plan.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListAccountsForPlanResponse = AppsListAccountsForPlanResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-accounts-for-plan-stubbed` may expose through its typed
   * API exception.
   */
  public sealed interface AppsListAccountsForPlanStubbedError

  /**
   * Typed response alternatives for `apps/list-accounts-for-plan-stubbed`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface AppsListAccountsForPlanStubbedResponse {
    public class SuccessJson(
      public val json: List<MarketplacePurchase>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListAccountsForPlanStubbedResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListAccountsForPlanStubbedResponse,
        AppsListAccountsForPlanStubbedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListAccountsForPlanStubbedResponse
  }

  /**
   * Raised by `apps/list-accounts-for-plan-stubbed` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class AppsListAccountsForPlanStubbedApiException(
    public val error: AppsListAccountsForPlanStubbedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-accounts-for-plan-stubbed")

  private object AppsListAccountsForPlanStubbedResponseDecoder : SdkResponseAlternativeDecoder<AppsListAccountsForPlanStubbedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListAccountsForPlanStubbedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListAccountsForPlanStubbedResponse> = when {
      alternative.id == "apps/list-accounts-for-plan-stubbed.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListAccountsForPlanStubbedResponse.SuccessJson(
          json = AppsCodecs.appsListAccountsForPlanStubbedResponseCodecAlternative0Registry.select(listOf("apps/list-accounts-for-plan-stubbed.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-accounts-for-plan-stubbed.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListAccountsForPlanStubbedResponse.Http401Json(
          json = AppsCodecs.appsListAccountsForPlanStubbedResponseCodecAlternative1Registry.select(listOf("apps/list-accounts-for-plan-stubbed.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListAccountsForPlanStubbedResponse = AppsListAccountsForPlanStubbedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-installation-repos-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface AppsListInstallationReposForAuthenticatedUserError

  /**
   * Typed response alternatives for `apps/list-installation-repos-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface AppsListInstallationReposForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationReposForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationReposForAuthenticatedUserResponse,
        AppsListInstallationReposForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationReposForAuthenticatedUserResponse,
        AppsListInstallationReposForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationReposForAuthenticatedUserResponse,
        AppsListInstallationReposForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationReposForAuthenticatedUserResponse
  }

  /**
   * Raised by `apps/list-installation-repos-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsListInstallationReposForAuthenticatedUserApiException(
    public val error: AppsListInstallationReposForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-installation-repos-for-authenticated-user")

  private object AppsListInstallationReposForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<AppsListInstallationReposForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListInstallationReposForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListInstallationReposForAuthenticatedUserResponse> = when {
      alternative.id == "apps/list-installation-repos-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListInstallationReposForAuthenticatedUserResponse.SuccessJson(
          json = AppsCodecs.appsListInstallationReposForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("apps/list-installation-repos-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-installation-repos-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListInstallationReposForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-installation-repos-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListInstallationReposForAuthenticatedUserResponse.Http403Json(
          json = AppsCodecs.appsListInstallationReposForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("apps/list-installation-repos-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-installation-repos-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsListInstallationReposForAuthenticatedUserResponse.Http404Json(
          json = AppsCodecs.appsListInstallationReposForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("apps/list-installation-repos-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListInstallationReposForAuthenticatedUserResponse = AppsListInstallationReposForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-installation-requests-for-authenticated-app` may expose
   * through its typed API exception.
   */
  public sealed interface AppsListInstallationRequestsForAuthenticatedAppError

  /**
   * Typed response alternatives for `apps/list-installation-requests-for-authenticated-app`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface AppsListInstallationRequestsForAuthenticatedAppResponse {
    public class SuccessJson(
      public val json: List<IntegrationInstallationRequest>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationRequestsForAuthenticatedAppResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationRequestsForAuthenticatedAppResponse,
        AppsListInstallationRequestsForAuthenticatedAppError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationRequestsForAuthenticatedAppResponse,
        AppsListInstallationRequestsForAuthenticatedAppError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationRequestsForAuthenticatedAppResponse
  }

  /**
   * Raised by `apps/list-installation-requests-for-authenticated-app` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsListInstallationRequestsForAuthenticatedAppApiException(
    public val error: AppsListInstallationRequestsForAuthenticatedAppError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-installation-requests-for-authenticated-app")

  private object AppsListInstallationRequestsForAuthenticatedAppResponseDecoder : SdkResponseAlternativeDecoder<AppsListInstallationRequestsForAuthenticatedAppResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListInstallationRequestsForAuthenticatedAppResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListInstallationRequestsForAuthenticatedAppResponse> = when {
      alternative.id == "apps/list-installation-requests-for-authenticated-app.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListInstallationRequestsForAuthenticatedAppResponse.SuccessJson(
          json = AppsCodecs.appsListInstallationRequestsForAuthenticatedAppResponseCodecAlternative0Registry.select(listOf("apps/list-installation-requests-for-authenticated-app.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-installation-requests-for-authenticated-app.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListInstallationRequestsForAuthenticatedAppResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-installation-requests-for-authenticated-app.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListInstallationRequestsForAuthenticatedAppResponse.Http401Json(
          json = AppsCodecs.appsListInstallationRequestsForAuthenticatedAppResponseCodecAlternative2Registry.select(listOf("apps/list-installation-requests-for-authenticated-app.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListInstallationRequestsForAuthenticatedAppResponse = AppsListInstallationRequestsForAuthenticatedAppResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `apps/list-installations`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AppsListInstallationsResponse {
    public class SuccessJson(
      public val json: List<Installation>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationsResponse
  }

  private object AppsListInstallationsResponseDecoder : SdkResponseAlternativeDecoder<AppsListInstallationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListInstallationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListInstallationsResponse> = when {
      alternative.id == "apps/list-installations.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListInstallationsResponse.SuccessJson(
          json = AppsCodecs.appsListInstallationsResponseCodecAlternative0Registry.select(listOf("apps/list-installations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListInstallationsResponse = AppsListInstallationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-installations-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface AppsListInstallationsForAuthenticatedUserError

  /**
   * Typed response alternatives for `apps/list-installations-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AppsListInstallationsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineUserInstallationsGetResponse200JsonXfc4c02bc,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationsForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationsForAuthenticatedUserResponse,
        AppsListInstallationsForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationsForAuthenticatedUserResponse,
        AppsListInstallationsForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationsForAuthenticatedUserResponse,
        AppsListInstallationsForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListInstallationsForAuthenticatedUserResponse
  }

  /**
   * Raised by `apps/list-installations-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsListInstallationsForAuthenticatedUserApiException(
    public val error: AppsListInstallationsForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-installations-for-authenticated-user")

  private object AppsListInstallationsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<AppsListInstallationsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListInstallationsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListInstallationsForAuthenticatedUserResponse> = when {
      alternative.id == "apps/list-installations-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListInstallationsForAuthenticatedUserResponse.SuccessJson(
          json = AppsCodecs.appsListInstallationsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("apps/list-installations-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-installations-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListInstallationsForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-installations-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListInstallationsForAuthenticatedUserResponse.Http401Json(
          json = AppsCodecs.appsListInstallationsForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("apps/list-installations-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-installations-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsListInstallationsForAuthenticatedUserResponse.Http403Json(
          json = AppsCodecs.appsListInstallationsForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("apps/list-installations-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListInstallationsForAuthenticatedUserResponse = AppsListInstallationsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-plans` may expose through its typed API exception.
   */
  public sealed interface AppsListPlansError

  /**
   * Typed response alternatives for `apps/list-plans`. Non-success alternatives are not converted into success values.
   */
  public sealed interface AppsListPlansResponse {
    public class SuccessJson(
      public val json: List<MarketplaceListingPlan>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListPlansResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListPlansResponse,
        AppsListPlansError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListPlansResponse,
        AppsListPlansError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListPlansResponse
  }

  /**
   * Raised by `apps/list-plans` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class AppsListPlansApiException(
    public val error: AppsListPlansError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-plans")

  private object AppsListPlansResponseDecoder : SdkResponseAlternativeDecoder<AppsListPlansResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListPlansResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListPlansResponse> = when {
      alternative.id == "apps/list-plans.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListPlansResponse.SuccessJson(
          json = AppsCodecs.appsListPlansResponseCodecAlternative0Registry.select(listOf("apps/list-plans.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-plans.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListPlansResponse.Http401Json(
          json = AppsCodecs.appsListPlansResponseCodecAlternative1Registry.select(listOf("apps/list-plans.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-plans.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListPlansResponse.Http404Json(
          json = AppsCodecs.appsListPlansResponseCodecAlternative2Registry.select(listOf("apps/list-plans.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListPlansResponse = AppsListPlansResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-plans-stubbed` may expose through its typed API
   * exception.
   */
  public sealed interface AppsListPlansStubbedError

  /**
   * Typed response alternatives for `apps/list-plans-stubbed`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface AppsListPlansStubbedResponse {
    public class SuccessJson(
      public val json: List<MarketplaceListingPlan>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListPlansStubbedResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListPlansStubbedResponse,
        AppsListPlansStubbedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListPlansStubbedResponse
  }

  /**
   * Raised by `apps/list-plans-stubbed` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsListPlansStubbedApiException(
    public val error: AppsListPlansStubbedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-plans-stubbed")

  private object AppsListPlansStubbedResponseDecoder : SdkResponseAlternativeDecoder<AppsListPlansStubbedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListPlansStubbedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListPlansStubbedResponse> = when {
      alternative.id == "apps/list-plans-stubbed.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListPlansStubbedResponse.SuccessJson(
          json = AppsCodecs.appsListPlansStubbedResponseCodecAlternative0Registry.select(listOf("apps/list-plans-stubbed.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-plans-stubbed.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListPlansStubbedResponse.Http401Json(
          json = AppsCodecs.appsListPlansStubbedResponseCodecAlternative1Registry.select(listOf("apps/list-plans-stubbed.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListPlansStubbedResponse = AppsListPlansStubbedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-repos-accessible-to-installation` may expose through its
   * typed API exception.
   */
  public sealed interface AppsListReposAccessibleToInstallationError

  /**
   * Typed response alternatives for `apps/list-repos-accessible-to-installation`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AppsListReposAccessibleToInstallationResponse {
    public class SuccessJson(
      public val json: InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListReposAccessibleToInstallationResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListReposAccessibleToInstallationResponse,
        AppsListReposAccessibleToInstallationError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListReposAccessibleToInstallationResponse,
        AppsListReposAccessibleToInstallationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListReposAccessibleToInstallationResponse,
        AppsListReposAccessibleToInstallationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListReposAccessibleToInstallationResponse
  }

  /**
   * Raised by `apps/list-repos-accessible-to-installation` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsListReposAccessibleToInstallationApiException(
    public val error: AppsListReposAccessibleToInstallationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-repos-accessible-to-installation")

  private object AppsListReposAccessibleToInstallationResponseDecoder : SdkResponseAlternativeDecoder<AppsListReposAccessibleToInstallationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListReposAccessibleToInstallationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListReposAccessibleToInstallationResponse> = when {
      alternative.id == "apps/list-repos-accessible-to-installation.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListReposAccessibleToInstallationResponse.SuccessJson(
          json = AppsCodecs.appsListReposAccessibleToInstallationResponseCodecAlternative0Registry.select(listOf("apps/list-repos-accessible-to-installation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-repos-accessible-to-installation.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListReposAccessibleToInstallationResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-repos-accessible-to-installation.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListReposAccessibleToInstallationResponse.Http401Json(
          json = AppsCodecs.appsListReposAccessibleToInstallationResponseCodecAlternative2Registry.select(listOf("apps/list-repos-accessible-to-installation.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-repos-accessible-to-installation.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsListReposAccessibleToInstallationResponse.Http403Json(
          json = AppsCodecs.appsListReposAccessibleToInstallationResponseCodecAlternative3Registry.select(listOf("apps/list-repos-accessible-to-installation.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListReposAccessibleToInstallationResponse = AppsListReposAccessibleToInstallationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-subscriptions-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface AppsListSubscriptionsForAuthenticatedUserError

  /**
   * Typed response alternatives for `apps/list-subscriptions-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface AppsListSubscriptionsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<UserMarketplacePurchase>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserResponse,
        AppsListSubscriptionsForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserResponse,
        AppsListSubscriptionsForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserResponse,
        AppsListSubscriptionsForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserResponse
  }

  /**
   * Raised by `apps/list-subscriptions-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsListSubscriptionsForAuthenticatedUserApiException(
    public val error: AppsListSubscriptionsForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-subscriptions-for-authenticated-user")

  private object AppsListSubscriptionsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<AppsListSubscriptionsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListSubscriptionsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListSubscriptionsForAuthenticatedUserResponse> = when {
      alternative.id == "apps/list-subscriptions-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListSubscriptionsForAuthenticatedUserResponse.SuccessJson(
          json = AppsCodecs.appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("apps/list-subscriptions-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-subscriptions-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListSubscriptionsForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-subscriptions-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListSubscriptionsForAuthenticatedUserResponse.Http401Json(
          json = AppsCodecs.appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("apps/list-subscriptions-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-subscriptions-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsListSubscriptionsForAuthenticatedUserResponse.Http404Json(
          json = AppsCodecs.appsListSubscriptionsForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("apps/list-subscriptions-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListSubscriptionsForAuthenticatedUserResponse = AppsListSubscriptionsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-subscriptions-for-authenticated-user-stubbed` may expose
   * through its typed API exception.
   */
  public sealed interface AppsListSubscriptionsForAuthenticatedUserStubbedError

  /**
   * Typed response alternatives for `apps/list-subscriptions-for-authenticated-user-stubbed`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface AppsListSubscriptionsForAuthenticatedUserStubbedResponse {
    public class SuccessJson(
      public val json: List<UserMarketplacePurchase>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserStubbedResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserStubbedResponse,
        AppsListSubscriptionsForAuthenticatedUserStubbedError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserStubbedResponse,
        AppsListSubscriptionsForAuthenticatedUserStubbedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListSubscriptionsForAuthenticatedUserStubbedResponse
  }

  /**
   * Raised by `apps/list-subscriptions-for-authenticated-user-stubbed` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsListSubscriptionsForAuthenticatedUserStubbedApiException(
    public val error: AppsListSubscriptionsForAuthenticatedUserStubbedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-subscriptions-for-authenticated-user-stubbed")

  private object AppsListSubscriptionsForAuthenticatedUserStubbedResponseDecoder : SdkResponseAlternativeDecoder<AppsListSubscriptionsForAuthenticatedUserStubbedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListSubscriptionsForAuthenticatedUserStubbedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListSubscriptionsForAuthenticatedUserStubbedResponse> = when {
      alternative.id == "apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListSubscriptionsForAuthenticatedUserStubbedResponse.SuccessJson(
          json = AppsCodecs.appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecAlternative0Registry.select(listOf("apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Http401Json(
          json = AppsCodecs.appsListSubscriptionsForAuthenticatedUserStubbedResponseCodecAlternative2Registry.select(listOf("apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListSubscriptionsForAuthenticatedUserStubbedResponse = AppsListSubscriptionsForAuthenticatedUserStubbedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/list-webhook-deliveries` may expose through its typed API
   * exception.
   */
  public sealed interface AppsListWebhookDeliveriesError

  /**
   * Typed response alternatives for `apps/list-webhook-deliveries`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsListWebhookDeliveriesResponse {
    public class SuccessJson(
      public val json: List<HookDeliveryItem>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListWebhookDeliveriesResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListWebhookDeliveriesResponse,
        AppsListWebhookDeliveriesError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListWebhookDeliveriesResponse,
        AppsListWebhookDeliveriesError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListWebhookDeliveriesResponse,
        AppsListWebhookDeliveriesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsListWebhookDeliveriesResponse
  }

  /**
   * Raised by `apps/list-webhook-deliveries` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class AppsListWebhookDeliveriesApiException(
    public val error: AppsListWebhookDeliveriesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/list-webhook-deliveries")

  private object AppsListWebhookDeliveriesResponseDecoder : SdkResponseAlternativeDecoder<AppsListWebhookDeliveriesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsListWebhookDeliveriesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsListWebhookDeliveriesResponse> = when {
      alternative.id == "apps/list-webhook-deliveries.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsListWebhookDeliveriesResponse.SuccessJson(
          json = AppsCodecs.appsListWebhookDeliveriesResponseCodecAlternative0Registry.select(listOf("apps/list-webhook-deliveries.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-webhook-deliveries.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsListWebhookDeliveriesResponse.Http400Json(
          json = AppsCodecs.appsListWebhookDeliveriesResponseCodecAlternative1Registry.select(listOf("apps/list-webhook-deliveries.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-webhook-deliveries.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsListWebhookDeliveriesResponse.Http400ScimJson(
          json = AppsCodecs.appsListWebhookDeliveriesResponseCodecAlternative2Registry.select(listOf("apps/list-webhook-deliveries.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/list-webhook-deliveries.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsListWebhookDeliveriesResponse.Http422Json(
          json = AppsCodecs.appsListWebhookDeliveriesResponseCodecAlternative3Registry.select(listOf("apps/list-webhook-deliveries.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsListWebhookDeliveriesResponse = AppsListWebhookDeliveriesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/redeliver-webhook-delivery` may expose through its typed API
   * exception.
   */
  public sealed interface AppsRedeliverWebhookDeliveryError

  /**
   * Typed response alternatives for `apps/redeliver-webhook-delivery`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsRedeliverWebhookDeliveryResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRedeliverWebhookDeliveryResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRedeliverWebhookDeliveryResponse,
        AppsRedeliverWebhookDeliveryError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRedeliverWebhookDeliveryResponse,
        AppsRedeliverWebhookDeliveryError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRedeliverWebhookDeliveryResponse,
        AppsRedeliverWebhookDeliveryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRedeliverWebhookDeliveryResponse
  }

  /**
   * Raised by `apps/redeliver-webhook-delivery` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class AppsRedeliverWebhookDeliveryApiException(
    public val error: AppsRedeliverWebhookDeliveryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/redeliver-webhook-delivery")

  private object AppsRedeliverWebhookDeliveryResponseDecoder : SdkResponseAlternativeDecoder<AppsRedeliverWebhookDeliveryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsRedeliverWebhookDeliveryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsRedeliverWebhookDeliveryResponse> = when {
      alternative.id == "apps/redeliver-webhook-delivery.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsRedeliverWebhookDeliveryResponse.SuccessJson(
          json = AppsCodecs.appsRedeliverWebhookDeliveryResponseCodecAlternative0Registry.select(listOf("apps/redeliver-webhook-delivery.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/redeliver-webhook-delivery.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsRedeliverWebhookDeliveryResponse.Http400Json(
          json = AppsCodecs.appsRedeliverWebhookDeliveryResponseCodecAlternative1Registry.select(listOf("apps/redeliver-webhook-delivery.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/redeliver-webhook-delivery.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsRedeliverWebhookDeliveryResponse.Http400ScimJson(
          json = AppsCodecs.appsRedeliverWebhookDeliveryResponseCodecAlternative2Registry.select(listOf("apps/redeliver-webhook-delivery.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/redeliver-webhook-delivery.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsRedeliverWebhookDeliveryResponse.Http422Json(
          json = AppsCodecs.appsRedeliverWebhookDeliveryResponseCodecAlternative3Registry.select(listOf("apps/redeliver-webhook-delivery.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsRedeliverWebhookDeliveryResponse = AppsRedeliverWebhookDeliveryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/remove-repo-from-installation-for-authenticated-user` may
   * expose through its typed API exception.
   */
  public sealed interface AppsRemoveRepoFromInstallationForAuthenticatedUserError

  /**
   * Typed response alternatives for `apps/remove-repo-from-installation-for-authenticated-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface AppsRemoveRepoFromInstallationForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRemoveRepoFromInstallationForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRemoveRepoFromInstallationForAuthenticatedUserResponse,
        AppsRemoveRepoFromInstallationForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRemoveRepoFromInstallationForAuthenticatedUserResponse,
        AppsRemoveRepoFromInstallationForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRemoveRepoFromInstallationForAuthenticatedUserResponse,
        AppsRemoveRepoFromInstallationForAuthenticatedUserError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRemoveRepoFromInstallationForAuthenticatedUserResponse,
        AppsRemoveRepoFromInstallationForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRemoveRepoFromInstallationForAuthenticatedUserResponse
  }

  /**
   * Raised by `apps/remove-repo-from-installation-for-authenticated-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class AppsRemoveRepoFromInstallationForAuthenticatedUserApiException(
    public val error: AppsRemoveRepoFromInstallationForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/remove-repo-from-installation-for-authenticated-user")

  private object AppsRemoveRepoFromInstallationForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<AppsRemoveRepoFromInstallationForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsRemoveRepoFromInstallationForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsRemoveRepoFromInstallationForAuthenticatedUserResponse> = when {
      alternative.id == "apps/remove-repo-from-installation-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/remove-repo-from-installation-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/remove-repo-from-installation-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http403Json(
          json = AppsCodecs.appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("apps/remove-repo-from-installation-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/remove-repo-from-installation-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http404Json(
          json = AppsCodecs.appsRemoveRepoFromInstallationForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("apps/remove-repo-from-installation-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/remove-repo-from-installation-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Http422NoContent(
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
    ): AppsRemoveRepoFromInstallationForAuthenticatedUserResponse = AppsRemoveRepoFromInstallationForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/reset-token` may expose through its typed API exception.
   */
  public sealed interface AppsResetTokenError

  /**
   * Typed response alternatives for `apps/reset-token`. Non-success alternatives are not converted into success values.
   */
  public sealed interface AppsResetTokenResponse {
    public class SuccessJson(
      public val json: Authorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsResetTokenResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsResetTokenResponse,
        AppsResetTokenError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsResetTokenResponse
  }

  /**
   * Raised by `apps/reset-token` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class AppsResetTokenApiException(
    public val error: AppsResetTokenError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/reset-token")

  private object AppsResetTokenResponseDecoder : SdkResponseAlternativeDecoder<AppsResetTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsResetTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsResetTokenResponse> = when {
      alternative.id == "apps/reset-token.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsResetTokenResponse.SuccessJson(
          json = AppsCodecs.appsResetTokenResponseCodecAlternative0Registry.select(listOf("apps/reset-token.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/reset-token.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsResetTokenResponse.Http422Json(
          json = AppsCodecs.appsResetTokenResponseCodecAlternative1Registry.select(listOf("apps/reset-token.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsResetTokenResponse = AppsResetTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `apps/revoke-installation-access-token`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface AppsRevokeInstallationAccessTokenResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRevokeInstallationAccessTokenResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsRevokeInstallationAccessTokenResponse
  }

  private object AppsRevokeInstallationAccessTokenResponseDecoder : SdkResponseAlternativeDecoder<AppsRevokeInstallationAccessTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsRevokeInstallationAccessTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsRevokeInstallationAccessTokenResponse> = when {
      alternative.id == "apps/revoke-installation-access-token.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsRevokeInstallationAccessTokenResponse.SuccessNoContent(
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
    ): AppsRevokeInstallationAccessTokenResponse = AppsRevokeInstallationAccessTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/scope-token` may expose through its typed API exception.
   */
  public sealed interface AppsScopeTokenError

  /**
   * Typed response alternatives for `apps/scope-token`. Non-success alternatives are not converted into success values.
   */
  public sealed interface AppsScopeTokenResponse {
    public class SuccessJson(
      public val json: Authorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsScopeTokenResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsScopeTokenResponse,
        AppsScopeTokenError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsScopeTokenResponse,
        AppsScopeTokenError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsScopeTokenResponse,
        AppsScopeTokenError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsScopeTokenResponse,
        AppsScopeTokenError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsScopeTokenResponse
  }

  /**
   * Raised by `apps/scope-token` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class AppsScopeTokenApiException(
    public val error: AppsScopeTokenError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/scope-token")

  private object AppsScopeTokenResponseDecoder : SdkResponseAlternativeDecoder<AppsScopeTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsScopeTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsScopeTokenResponse> = when {
      alternative.id == "apps/scope-token.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsScopeTokenResponse.SuccessJson(
          json = AppsCodecs.appsScopeTokenResponseCodecAlternative0Registry.select(listOf("apps/scope-token.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/scope-token.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsScopeTokenResponse.Http401Json(
          json = AppsCodecs.appsScopeTokenResponseCodecAlternative1Registry.select(listOf("apps/scope-token.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/scope-token.response.alternative2" -> SdkResponseDecodeResult(
        value = AppsScopeTokenResponse.Http403Json(
          json = AppsCodecs.appsScopeTokenResponseCodecAlternative2Registry.select(listOf("apps/scope-token.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/scope-token.response.alternative3" -> SdkResponseDecodeResult(
        value = AppsScopeTokenResponse.Http404Json(
          json = AppsCodecs.appsScopeTokenResponseCodecAlternative3Registry.select(listOf("apps/scope-token.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/scope-token.response.alternative4" -> SdkResponseDecodeResult(
        value = AppsScopeTokenResponse.Http422Json(
          json = AppsCodecs.appsScopeTokenResponseCodecAlternative4Registry.select(listOf("apps/scope-token.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsScopeTokenResponse = AppsScopeTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/suspend-installation` may expose through its typed API
   * exception.
   */
  public sealed interface AppsSuspendInstallationError

  /**
   * Typed response alternatives for `apps/suspend-installation`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsSuspendInstallationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsSuspendInstallationResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsSuspendInstallationResponse,
        AppsSuspendInstallationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsSuspendInstallationResponse
  }

  /**
   * Raised by `apps/suspend-installation` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsSuspendInstallationApiException(
    public val error: AppsSuspendInstallationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/suspend-installation")

  private object AppsSuspendInstallationResponseDecoder : SdkResponseAlternativeDecoder<AppsSuspendInstallationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsSuspendInstallationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsSuspendInstallationResponse> = when {
      alternative.id == "apps/suspend-installation.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsSuspendInstallationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/suspend-installation.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsSuspendInstallationResponse.Http404Json(
          json = AppsCodecs.appsSuspendInstallationResponseCodecAlternative1Registry.select(listOf("apps/suspend-installation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsSuspendInstallationResponse = AppsSuspendInstallationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `apps/unsuspend-installation` may expose through its typed API
   * exception.
   */
  public sealed interface AppsUnsuspendInstallationError

  /**
   * Typed response alternatives for `apps/unsuspend-installation`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface AppsUnsuspendInstallationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsUnsuspendInstallationResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsUnsuspendInstallationResponse,
        AppsUnsuspendInstallationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsUnsuspendInstallationResponse
  }

  /**
   * Raised by `apps/unsuspend-installation` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class AppsUnsuspendInstallationApiException(
    public val error: AppsUnsuspendInstallationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "apps/unsuspend-installation")

  private object AppsUnsuspendInstallationResponseDecoder : SdkResponseAlternativeDecoder<AppsUnsuspendInstallationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsUnsuspendInstallationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsUnsuspendInstallationResponse> = when {
      alternative.id == "apps/unsuspend-installation.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsUnsuspendInstallationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "apps/unsuspend-installation.response.alternative1" -> SdkResponseDecodeResult(
        value = AppsUnsuspendInstallationResponse.Http404Json(
          json = AppsCodecs.appsUnsuspendInstallationResponseCodecAlternative1Registry.select(listOf("apps/unsuspend-installation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsUnsuspendInstallationResponse = AppsUnsuspendInstallationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `apps/update-webhook-config-for-app`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface AppsUpdateWebhookConfigForAppResponse {
    public class SuccessJson(
      public val json: WebhookConfig,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsUpdateWebhookConfigForAppResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : AppsUpdateWebhookConfigForAppResponse
  }

  private object AppsUpdateWebhookConfigForAppResponseDecoder : SdkResponseAlternativeDecoder<AppsUpdateWebhookConfigForAppResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): AppsUpdateWebhookConfigForAppResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<AppsUpdateWebhookConfigForAppResponse> = when {
      alternative.id == "apps/update-webhook-config-for-app.response.alternative0" -> SdkResponseDecodeResult(
        value = AppsUpdateWebhookConfigForAppResponse.SuccessJson(
          json = AppsCodecs.appsUpdateWebhookConfigForAppResponseCodecAlternative0Registry.select(listOf("apps/update-webhook-config-for-app.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): AppsUpdateWebhookConfigForAppResponse = AppsUpdateWebhookConfigForAppResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val appsAddRepoToInstallationForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/add-repo-to-installation-for-authenticated-user",
          method = "PUT",
          path = "/user/installations/{installation_id}/repositories/{repository_id}",
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
              id = "apps/add-repo-to-installation-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/add-repo-to-installation-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/add-repo-to-installation-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/add-repo-to-installation-for-authenticated-user.response.alternative3",
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

    internal val appsCheckTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/check-token",
          method = "POST",
          path = "/applications/{client_id}/token",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Authorization",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/check-token.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/check-token.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/check-token.response.alternative2",
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

    internal val appsCreateFromManifestMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/create-from-manifest",
          method = "POST",
          path = "/app-manifests/{code}/conversions",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAppManifestsConversionsPostResponse201JsonX50717f97",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/create-from-manifest.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/create-from-manifest.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/create-from-manifest.response.alternative2",
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

    internal val appsCreateInstallationAccessTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/create-installation-access-token",
          method = "POST",
          path = "/app/installations/{installation_id}/access_tokens",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InstallationToken",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/create-installation-access-token.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/create-installation-access-token.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/create-installation-access-token.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/create-installation-access-token.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/create-installation-access-token.response.alternative4",
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

    internal val appsDeleteAuthorizationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/delete-authorization",
          method = "DELETE",
          path = "/applications/{client_id}/grant",
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
              id = "apps/delete-authorization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/delete-authorization.response.alternative1",
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

    internal val appsDeleteInstallationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/delete-installation",
          method = "DELETE",
          path = "/app/installations/{installation_id}",
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
              id = "apps/delete-installation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/delete-installation.response.alternative1",
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

    internal val appsDeleteTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/delete-token",
          method = "DELETE",
          path = "/applications/{client_id}/token",
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
              id = "apps/delete-token.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/delete-token.response.alternative1",
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

    internal val appsGetAuthenticatedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-authenticated",
          method = "GET",
          path = "/app",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Integration",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-authenticated.response.alternative0",
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

    internal val appsGetBySlugMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-by-slug",
          method = "GET",
          path = "/apps/{app_slug}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Integration",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-by-slug.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-by-slug.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-by-slug.response.alternative2",
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

    internal val appsGetInstallationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-installation",
          method = "GET",
          path = "/app/installations/{installation_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Installation",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-installation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-installation.response.alternative1",
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

    internal val appsGetOrgInstallationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-org-installation",
          method = "GET",
          path = "/orgs/{org}/installation",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Installation",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-org-installation.response.alternative0",
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

    internal val appsGetRepoInstallationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-repo-installation",
          method = "GET",
          path = "/repos/{owner}/{repo}/installation",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Installation",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-repo-installation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 301),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-repo-installation.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-repo-installation.response.alternative2",
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

    internal val appsGetSubscriptionPlanForAccountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-subscription-plan-for-account",
          method = "GET",
          path = "/marketplace_listing/accounts/{account_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "MarketplacePurchase",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-subscription-plan-for-account.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-subscription-plan-for-account.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-subscription-plan-for-account.response.alternative2",
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

    internal val appsGetSubscriptionPlanForAccountStubbedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-subscription-plan-for-account-stubbed",
          method = "GET",
          path = "/marketplace_listing/stubbed/accounts/{account_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "MarketplacePurchase",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-subscription-plan-for-account-stubbed.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-subscription-plan-for-account-stubbed.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-subscription-plan-for-account-stubbed.response.alternative2",
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

    internal val appsGetUserInstallationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-user-installation",
          method = "GET",
          path = "/users/{username}/installation",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Installation",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-user-installation.response.alternative0",
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

    internal val appsGetWebhookConfigForAppMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-webhook-config-for-app",
          method = "GET",
          path = "/app/hook/config",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "WebhookConfig",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-webhook-config-for-app.response.alternative0",
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

    internal val appsGetWebhookDeliveryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/get-webhook-delivery",
          method = "GET",
          path = "/app/hook/deliveries/{delivery_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "HookDelivery",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-webhook-delivery.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-webhook-delivery.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-webhook-delivery.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/get-webhook-delivery.response.alternative3",
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

    internal val appsListAccountsForPlanMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-accounts-for-plan",
          method = "GET",
          path = "/marketplace_listing/plans/{plan_id}/accounts",
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
              id = "apps/list-accounts-for-plan.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-accounts-for-plan.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-accounts-for-plan.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-accounts-for-plan.response.alternative3",
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

    internal val appsListAccountsForPlanStubbedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-accounts-for-plan-stubbed",
          method = "GET",
          path = "/marketplace_listing/stubbed/plans/{plan_id}/accounts",
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
              id = "apps/list-accounts-for-plan-stubbed.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-accounts-for-plan-stubbed.response.alternative1",
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

    internal val appsListInstallationReposForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-installation-repos-for-authenticated-user",
          method = "GET",
          path = "/user/installations/{installation_id}/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserInstallationsRepositoriesGetResponse200JsonXe06cb8fc",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installation-repos-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installation-repos-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installation-repos-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installation-repos-for-authenticated-user.response.alternative3",
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

    internal val appsListInstallationRequestsForAuthenticatedAppMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-installation-requests-for-authenticated-app",
          method = "GET",
          path = "/app/installation-requests",
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
              id = "apps/list-installation-requests-for-authenticated-app.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installation-requests-for-authenticated-app.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installation-requests-for-authenticated-app.response.alternative2",
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

    internal val appsListInstallationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-installations",
          method = "GET",
          path = "/app/installations",
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
              id = "apps/list-installations.response.alternative0",
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

    internal val appsListInstallationsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-installations-for-authenticated-user",
          method = "GET",
          path = "/user/installations",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserInstallationsGetResponse200JsonXfc4c02bc",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installations-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installations-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installations-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-installations-for-authenticated-user.response.alternative3",
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

    internal val appsListPlansMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-plans",
          method = "GET",
          path = "/marketplace_listing/plans",
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
              id = "apps/list-plans.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-plans.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-plans.response.alternative2",
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

    internal val appsListPlansStubbedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-plans-stubbed",
          method = "GET",
          path = "/marketplace_listing/stubbed/plans",
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
              id = "apps/list-plans-stubbed.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-plans-stubbed.response.alternative1",
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

    internal val appsListReposAccessibleToInstallationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-repos-accessible-to-installation",
          method = "GET",
          path = "/installation/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineInstallationRepositoriesGetResponse200JsonXb35a3ae8",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-repos-accessible-to-installation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-repos-accessible-to-installation.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-repos-accessible-to-installation.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-repos-accessible-to-installation.response.alternative3",
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

    internal val appsListSubscriptionsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-subscriptions-for-authenticated-user",
          method = "GET",
          path = "/user/marketplace_purchases",
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
              id = "apps/list-subscriptions-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-subscriptions-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-subscriptions-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-subscriptions-for-authenticated-user.response.alternative3",
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

    internal val appsListSubscriptionsForAuthenticatedUserStubbedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-subscriptions-for-authenticated-user-stubbed",
          method = "GET",
          path = "/user/marketplace_purchases/stubbed",
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
              id = "apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-subscriptions-for-authenticated-user-stubbed.response.alternative2",
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

    internal val appsListWebhookDeliveriesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/list-webhook-deliveries",
          method = "GET",
          path = "/app/hook/deliveries",
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
              id = "apps/list-webhook-deliveries.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-webhook-deliveries.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-webhook-deliveries.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/list-webhook-deliveries.response.alternative3",
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

    internal val appsRedeliverWebhookDeliveryMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/redeliver-webhook-delivery",
          method = "POST",
          path = "/app/hook/deliveries/{delivery_id}/attempts",
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
              id = "apps/redeliver-webhook-delivery.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/redeliver-webhook-delivery.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/redeliver-webhook-delivery.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/redeliver-webhook-delivery.response.alternative3",
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

    internal val appsRemoveRepoFromInstallationForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/remove-repo-from-installation-for-authenticated-user",
          method = "DELETE",
          path = "/user/installations/{installation_id}/repositories/{repository_id}",
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
              id = "apps/remove-repo-from-installation-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/remove-repo-from-installation-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/remove-repo-from-installation-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/remove-repo-from-installation-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/remove-repo-from-installation-for-authenticated-user.response.alternative4",
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

    internal val appsResetTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/reset-token",
          method = "PATCH",
          path = "/applications/{client_id}/token",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Authorization",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/reset-token.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/reset-token.response.alternative1",
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

    internal val appsRevokeInstallationAccessTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/revoke-installation-access-token",
          method = "DELETE",
          path = "/installation/token",
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
              id = "apps/revoke-installation-access-token.response.alternative0",
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

    internal val appsScopeTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/scope-token",
          method = "POST",
          path = "/applications/{client_id}/token/scoped",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Authorization",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/scope-token.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/scope-token.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/scope-token.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/scope-token.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/scope-token.response.alternative4",
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

    internal val appsSuspendInstallationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/suspend-installation",
          method = "PUT",
          path = "/app/installations/{installation_id}/suspended",
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
              id = "apps/suspend-installation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/suspend-installation.response.alternative1",
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

    internal val appsUnsuspendInstallationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/unsuspend-installation",
          method = "DELETE",
          path = "/app/installations/{installation_id}/suspended",
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
              id = "apps/unsuspend-installation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/unsuspend-installation.response.alternative1",
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

    internal val appsUpdateWebhookConfigForAppMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "apps/update-webhook-config-for-app",
          method = "PATCH",
          path = "/app/hook/config",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "WebhookConfig",
              mode = SdkResponseMode.BUFFERED,
              id = "apps/update-webhook-config-for-app.response.alternative0",
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
