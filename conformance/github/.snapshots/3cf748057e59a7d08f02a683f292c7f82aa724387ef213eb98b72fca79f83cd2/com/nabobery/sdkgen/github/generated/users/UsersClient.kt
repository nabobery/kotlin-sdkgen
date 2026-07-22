package com.nabobery.sdkgen.github.generated.users

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.Email
import com.nabobery.sdkgen.github.generated.GpgKey
import com.nabobery.sdkgen.github.generated.Hovercard
import com.nabobery.sdkgen.github.generated.InlineUserEmailVisibilityPatchRequestJsonX3514b5c9
import com.nabobery.sdkgen.github.generated.InlineUserEmailsDeleteRequestJsonX415520e8
import com.nabobery.sdkgen.github.generated.InlineUserEmailsPostRequestJsonX31221c91
import com.nabobery.sdkgen.github.generated.InlineUserGetResponse200JsonX3a7d2450
import com.nabobery.sdkgen.github.generated.InlineUserGetResponse200JsonX7ddb2065
import com.nabobery.sdkgen.github.generated.InlineUserGpgKeysPostRequestJsonX41d91d36
import com.nabobery.sdkgen.github.generated.InlineUserKeysPostRequestJsonXcffba277
import com.nabobery.sdkgen.github.generated.InlineUserPatchRequestJsonXcc70b87c
import com.nabobery.sdkgen.github.generated.InlineUserSocialAccountsDeleteRequestJsonX4ce9b605
import com.nabobery.sdkgen.github.generated.InlineUserSocialAccountsPostRequestJsonX141ac9f4
import com.nabobery.sdkgen.github.generated.InlineUserSshSigningKeysPostRequestJsonXe1811404
import com.nabobery.sdkgen.github.generated.InlineUsersAttestationsBulkListPostRequestJsonXd1686097
import com.nabobery.sdkgen.github.generated.InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67
import com.nabobery.sdkgen.github.generated.InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a
import com.nabobery.sdkgen.github.generated.InlineUsersAttestationsGetResponse200JsonX8bc4be52
import com.nabobery.sdkgen.github.generated.InlineUsersGetResponse200JsonX661510a1
import com.nabobery.sdkgen.github.generated.InlineUsersHovercardGetParameterXd4d36891
import com.nabobery.sdkgen.github.generated.Key
import com.nabobery.sdkgen.github.generated.KeySimple
import com.nabobery.sdkgen.github.generated.PrivateUser
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.SimpleUser
import com.nabobery.sdkgen.github.generated.SocialAccount
import com.nabobery.sdkgen.github.generated.SshSigningKey
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.json.JsonObject

public object UsersCodecs {
  public const val USERSADDEMAILFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "users/add-email-for-authenticated-user.request"

  private val usersAddEmailForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserEmailsPostRequestJsonX31221c91?> =
      KotlinxSerializationCodec(USERSADDEMAILFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserEmailsPostRequestJsonX31221c91.Serializer.nullable, SdkJson)

  public const val USERSADDEMAILFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/add-email-for-authenticated-user.response"

  private val usersAddEmailForAuthenticatedUserResponseCodec: MediaTypeCodec<List<Email>> =
      KotlinxSerializationCodec(USERSADDEMAILFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(Email.Serializer), SdkJson)

  private val usersAddEmailForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Email>> =
      KotlinxSerializationCodec("users/add-email-for-authenticated-user.response.alternative0", ListSerializer(Email.Serializer), SdkJson)

  public val usersAddEmailForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Email>> =
      MediaTypeCodecRegistry.of(usersAddEmailForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersAddEmailForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/add-email-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersAddEmailForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersAddEmailForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersAddEmailForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/add-email-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersAddEmailForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersAddEmailForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersAddEmailForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/add-email-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersAddEmailForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersAddEmailForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersAddEmailForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/add-email-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersAddEmailForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersAddEmailForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersAddEmailForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserEmailsPostRequestJsonX31221c91?> =
      MediaTypeCodecRegistry.of(usersAddEmailForAuthenticatedUserRequestCodec)

  public val usersAddEmailForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Email>> =
      MediaTypeCodecRegistry.of(usersAddEmailForAuthenticatedUserResponseCodec)

  public const val USERSADDSOCIALACCOUNTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "users/add-social-account-for-authenticated-user.request"

  private val usersAddSocialAccountForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserSocialAccountsPostRequestJsonX141ac9f4> =
      KotlinxSerializationCodec(USERSADDSOCIALACCOUNTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserSocialAccountsPostRequestJsonX141ac9f4.Serializer, SdkJson)

  public const val USERSADDSOCIALACCOUNTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/add-social-account-for-authenticated-user.response"

  private val usersAddSocialAccountForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<SocialAccount>> =
      KotlinxSerializationCodec(USERSADDSOCIALACCOUNTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(SocialAccount.Serializer), SdkJson)

  private val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SocialAccount>> =
      KotlinxSerializationCodec("users/add-social-account-for-authenticated-user.response.alternative0", ListSerializer(SocialAccount.Serializer), SdkJson)

  public val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SocialAccount>> =
      MediaTypeCodecRegistry.of(usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/add-social-account-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/add-social-account-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/add-social-account-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/add-social-account-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersAddSocialAccountForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserSocialAccountsPostRequestJsonX141ac9f4> =
      MediaTypeCodecRegistry.of(usersAddSocialAccountForAuthenticatedUserRequestCodec)

  public val usersAddSocialAccountForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SocialAccount>> =
      MediaTypeCodecRegistry.of(usersAddSocialAccountForAuthenticatedUserResponseCodec)

  private val usersBlockResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/block.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersBlockResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersBlockResponseCodecAlternative2Codec)

  private val usersBlockResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/block.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersBlockResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersBlockResponseCodecAlternative3Codec)

  private val usersBlockResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/block.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersBlockResponseCodecAlternative4Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersBlockResponseCodecAlternative4Codec)

  private val usersBlockResponseCodecAlternative5Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/block.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersBlockResponseCodecAlternative5Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersBlockResponseCodecAlternative5Codec)

  public val usersBlockRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersBlockResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val usersCheckBlockedResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/check-blocked.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersCheckBlockedResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(usersCheckBlockedResponseCodecAlternative2Codec)

  private val usersCheckBlockedResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/check-blocked.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersCheckBlockedResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(usersCheckBlockedResponseCodecAlternative3Codec)

  private val usersCheckBlockedResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/check-blocked.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersCheckBlockedResponseCodecAlternative4Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(usersCheckBlockedResponseCodecAlternative4Codec)

  public val usersCheckBlockedRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersCheckBlockedResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersCheckFollowingForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersCheckFollowingForUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/check-person-is-followed-by-authenticated.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative2Codec)

  private val usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/check-person-is-followed-by-authenticated.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative3Codec)

  private val usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/check-person-is-followed-by-authenticated.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative4Codec)

  public val usersCheckPersonIsFollowedByAuthenticatedRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersCheckPersonIsFollowedByAuthenticatedResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val USERSCREATEGPGKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "users/create-gpg-key-for-authenticated-user.request"

  private val usersCreateGpgKeyForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserGpgKeysPostRequestJsonX41d91d36> =
      KotlinxSerializationCodec(USERSCREATEGPGKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserGpgKeysPostRequestJsonX41d91d36.Serializer, SdkJson)

  public const val USERSCREATEGPGKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/create-gpg-key-for-authenticated-user.response"

  private val usersCreateGpgKeyForAuthenticatedUserResponseCodec: MediaTypeCodec<GpgKey> =
      KotlinxSerializationCodec(USERSCREATEGPGKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, GpgKey.Serializer, SdkJson)

  private val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<GpgKey> =
      KotlinxSerializationCodec("users/create-gpg-key-for-authenticated-user.response.alternative0", GpgKey.Serializer, SdkJson)

  public val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GpgKey> =
      MediaTypeCodecRegistry.of(usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-gpg-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-gpg-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-gpg-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/create-gpg-key-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersCreateGpgKeyForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserGpgKeysPostRequestJsonX41d91d36> =
      MediaTypeCodecRegistry.of(usersCreateGpgKeyForAuthenticatedUserRequestCodec)

  public val usersCreateGpgKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<GpgKey> =
      MediaTypeCodecRegistry.of(usersCreateGpgKeyForAuthenticatedUserResponseCodec)

  public const val USERSCREATEPUBLICSSHKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "users/create-public-ssh-key-for-authenticated-user.request"

  private val usersCreatePublicSshKeyForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserKeysPostRequestJsonXcffba277> =
      KotlinxSerializationCodec(USERSCREATEPUBLICSSHKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserKeysPostRequestJsonXcffba277.Serializer, SdkJson)

  public const val USERSCREATEPUBLICSSHKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/create-public-ssh-key-for-authenticated-user.response"

  private val usersCreatePublicSshKeyForAuthenticatedUserResponseCodec: MediaTypeCodec<Key> =
      KotlinxSerializationCodec(USERSCREATEPUBLICSSHKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Key.Serializer, SdkJson)

  private val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<Key> =
      KotlinxSerializationCodec("users/create-public-ssh-key-for-authenticated-user.response.alternative0", Key.Serializer, SdkJson)

  public val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Key> =
      MediaTypeCodecRegistry.of(usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-public-ssh-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-public-ssh-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-public-ssh-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/create-public-ssh-key-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersCreatePublicSshKeyForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserKeysPostRequestJsonXcffba277> =
      MediaTypeCodecRegistry.of(usersCreatePublicSshKeyForAuthenticatedUserRequestCodec)

  public val usersCreatePublicSshKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Key> =
      MediaTypeCodecRegistry.of(usersCreatePublicSshKeyForAuthenticatedUserResponseCodec)

  public const val USERSCREATESSHSIGNINGKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "users/create-ssh-signing-key-for-authenticated-user.request"

  private val usersCreateSshSigningKeyForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserSshSigningKeysPostRequestJsonXe1811404> =
      KotlinxSerializationCodec(USERSCREATESSHSIGNINGKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserSshSigningKeysPostRequestJsonXe1811404.Serializer, SdkJson)

  public const val USERSCREATESSHSIGNINGKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/create-ssh-signing-key-for-authenticated-user.response"

  private val usersCreateSshSigningKeyForAuthenticatedUserResponseCodec:
      MediaTypeCodec<SshSigningKey> =
      KotlinxSerializationCodec(USERSCREATESSHSIGNINGKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, SshSigningKey.Serializer, SdkJson)

  private val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<SshSigningKey> =
      KotlinxSerializationCodec("users/create-ssh-signing-key-for-authenticated-user.response.alternative0", SshSigningKey.Serializer, SdkJson)

  public val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SshSigningKey> =
      MediaTypeCodecRegistry.of(usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-ssh-signing-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-ssh-signing-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/create-ssh-signing-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/create-ssh-signing-key-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersCreateSshSigningKeyForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserSshSigningKeysPostRequestJsonXe1811404> =
      MediaTypeCodecRegistry.of(usersCreateSshSigningKeyForAuthenticatedUserRequestCodec)

  public val usersCreateSshSigningKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<SshSigningKey> =
      MediaTypeCodecRegistry.of(usersCreateSshSigningKeyForAuthenticatedUserResponseCodec)

  public const val USERSDELETEATTESTATIONSBULK_REQUEST_CODEC_ID: String =
      "users/delete-attestations-bulk.request"

  private val usersDeleteAttestationsBulkRequestCodec:
      MediaTypeCodec<InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a> =
      KotlinxSerializationCodec(USERSDELETEATTESTATIONSBULK_REQUEST_CODEC_ID, InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a.Serializer, SdkJson)

  private val usersDeleteAttestationsBulkResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("users/delete-attestations-bulk.response.alternative1", BasicError.Serializer, SdkJson)

  public val usersDeleteAttestationsBulkResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteAttestationsBulkResponseCodecAlternative1Codec)

  public val usersDeleteAttestationsBulkRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a> =
      MediaTypeCodecRegistry.of(usersDeleteAttestationsBulkRequestCodec)

  public val usersDeleteAttestationsBulkResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val usersDeleteAttestationsByIdResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("users/delete-attestations-by-id.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersDeleteAttestationsByIdResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteAttestationsByIdResponseCodecAlternative2Codec)

  private val usersDeleteAttestationsByIdResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("users/delete-attestations-by-id.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersDeleteAttestationsByIdResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteAttestationsByIdResponseCodecAlternative3Codec)

  public val usersDeleteAttestationsByIdRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersDeleteAttestationsByIdResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val usersDeleteAttestationsBySubjectDigestResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-attestations-by-subject-digest.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersDeleteAttestationsBySubjectDigestResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteAttestationsBySubjectDigestResponseCodecAlternative2Codec)

  public val usersDeleteAttestationsBySubjectDigestRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersDeleteAttestationsBySubjectDigestResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val USERSDELETEEMAILFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "users/delete-email-for-authenticated-user.request"

  private val usersDeleteEmailForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserEmailsDeleteRequestJsonX415520e8?> =
      KotlinxSerializationCodec(USERSDELETEEMAILFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserEmailsDeleteRequestJsonX415520e8.Serializer.nullable, SdkJson)

  private val usersDeleteEmailForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-email-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersDeleteEmailForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteEmailForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersDeleteEmailForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-email-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersDeleteEmailForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteEmailForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersDeleteEmailForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-email-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersDeleteEmailForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteEmailForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersDeleteEmailForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/delete-email-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersDeleteEmailForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersDeleteEmailForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersDeleteEmailForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserEmailsDeleteRequestJsonX415520e8?> =
      MediaTypeCodecRegistry.of(usersDeleteEmailForAuthenticatedUserRequestCodec)

  public val usersDeleteEmailForAuthenticatedUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  private val usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-gpg-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-gpg-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-gpg-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/delete-gpg-key-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersDeleteGpgKeyForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val usersDeleteGpgKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-public-ssh-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-public-ssh-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-public-ssh-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersDeletePublicSshKeyForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersDeletePublicSshKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val USERSDELETESOCIALACCOUNTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "users/delete-social-account-for-authenticated-user.request"

  private val usersDeleteSocialAccountForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserSocialAccountsDeleteRequestJsonX4ce9b605> =
      KotlinxSerializationCodec(USERSDELETESOCIALACCOUNTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserSocialAccountsDeleteRequestJsonX4ce9b605.Serializer, SdkJson)

  private val usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-social-account-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-social-account-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-social-account-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/delete-social-account-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersDeleteSocialAccountForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserSocialAccountsDeleteRequestJsonX4ce9b605> =
      MediaTypeCodecRegistry.of(usersDeleteSocialAccountForAuthenticatedUserRequestCodec)

  public val usersDeleteSocialAccountForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-ssh-signing-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-ssh-signing-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/delete-ssh-signing-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersDeleteSshSigningKeyForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val usersFollowResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/follow.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersFollowResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersFollowResponseCodecAlternative2Codec)

  private val usersFollowResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/follow.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersFollowResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersFollowResponseCodecAlternative3Codec)

  private val usersFollowResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/follow.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersFollowResponseCodecAlternative4Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersFollowResponseCodecAlternative4Codec)

  private val usersFollowResponseCodecAlternative5Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/follow.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersFollowResponseCodecAlternative5Registry: MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersFollowResponseCodecAlternative5Codec)

  public val usersFollowRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersFollowResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val USERSGETAUTHENTICATED_RESPONSE_CODEC_ID: String =
      "users/get-authenticated.response"

  private val usersGetAuthenticatedResponseCodec:
      MediaTypeCodec<InlineUserGetResponse200JsonX3a7d2450> =
      KotlinxSerializationCodec(USERSGETAUTHENTICATED_RESPONSE_CODEC_ID, InlineUserGetResponse200JsonX3a7d2450.Serializer, SdkJson)

  private val usersGetAuthenticatedResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUserGetResponse200JsonX3a7d2450> =
      KotlinxSerializationCodec("users/get-authenticated.response.alternative0", InlineUserGetResponse200JsonX3a7d2450.Serializer, SdkJson)

  public val usersGetAuthenticatedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserGetResponse200JsonX3a7d2450> =
      MediaTypeCodecRegistry.of(usersGetAuthenticatedResponseCodecAlternative0Codec)

  private val usersGetAuthenticatedResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-authenticated.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersGetAuthenticatedResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetAuthenticatedResponseCodecAlternative2Codec)

  private val usersGetAuthenticatedResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-authenticated.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersGetAuthenticatedResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetAuthenticatedResponseCodecAlternative3Codec)

  public val usersGetAuthenticatedRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersGetAuthenticatedResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUserGetResponse200JsonX3a7d2450> =
      MediaTypeCodecRegistry.of(usersGetAuthenticatedResponseCodec)

  public const val USERSGETBYID_RESPONSE_CODEC_ID: String = "users/get-by-id.response"

  private val usersGetByIdResponseCodec: MediaTypeCodec<InlineUserGetResponse200JsonX7ddb2065> =
      KotlinxSerializationCodec(USERSGETBYID_RESPONSE_CODEC_ID, InlineUserGetResponse200JsonX7ddb2065.Serializer, SdkJson)

  private val usersGetByIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUserGetResponse200JsonX7ddb2065> =
      KotlinxSerializationCodec("users/get-by-id.response.alternative0", InlineUserGetResponse200JsonX7ddb2065.Serializer, SdkJson)

  public val usersGetByIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserGetResponse200JsonX7ddb2065> =
      MediaTypeCodecRegistry.of(usersGetByIdResponseCodecAlternative0Codec)

  private val usersGetByIdResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-by-id.response.alternative1", BasicError.Serializer, SdkJson)

  public val usersGetByIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetByIdResponseCodecAlternative1Codec)

  public val usersGetByIdRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersGetByIdResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUserGetResponse200JsonX7ddb2065> =
      MediaTypeCodecRegistry.of(usersGetByIdResponseCodec)

  public const val USERSGETBYUSERNAME_RESPONSE_CODEC_ID: String = "users/get-by-username.response"

  private val usersGetByUsernameResponseCodec:
      MediaTypeCodec<InlineUsersGetResponse200JsonX661510a1> =
      KotlinxSerializationCodec(USERSGETBYUSERNAME_RESPONSE_CODEC_ID, InlineUsersGetResponse200JsonX661510a1.Serializer, SdkJson)

  private val usersGetByUsernameResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUsersGetResponse200JsonX661510a1> =
      KotlinxSerializationCodec("users/get-by-username.response.alternative0", InlineUsersGetResponse200JsonX661510a1.Serializer, SdkJson)

  public val usersGetByUsernameResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUsersGetResponse200JsonX661510a1> =
      MediaTypeCodecRegistry.of(usersGetByUsernameResponseCodecAlternative0Codec)

  private val usersGetByUsernameResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-by-username.response.alternative1", BasicError.Serializer, SdkJson)

  public val usersGetByUsernameResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(usersGetByUsernameResponseCodecAlternative1Codec)

  public val usersGetByUsernameRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersGetByUsernameResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersGetResponse200JsonX661510a1> =
      MediaTypeCodecRegistry.of(usersGetByUsernameResponseCodec)

  public const val USERSGETCONTEXTFORUSER_RESPONSE_CODEC_ID: String =
      "users/get-context-for-user.response"

  private val usersGetContextForUserResponseCodec: MediaTypeCodec<Hovercard> =
      KotlinxSerializationCodec(USERSGETCONTEXTFORUSER_RESPONSE_CODEC_ID, Hovercard.Serializer, SdkJson)

  private val usersGetContextForUserResponseCodecAlternative0Codec: MediaTypeCodec<Hovercard> =
      KotlinxSerializationCodec("users/get-context-for-user.response.alternative0", Hovercard.Serializer, SdkJson)

  public val usersGetContextForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Hovercard> =
      MediaTypeCodecRegistry.of(usersGetContextForUserResponseCodecAlternative0Codec)

  private val usersGetContextForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-context-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val usersGetContextForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetContextForUserResponseCodecAlternative1Codec)

  private val usersGetContextForUserResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError>
      =
      KotlinxSerializationCodec("users/get-context-for-user.response.alternative2", ValidationError.Serializer, SdkJson)

  public val usersGetContextForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersGetContextForUserResponseCodecAlternative2Codec)

  public val usersGetContextForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersGetContextForUserResponseCodecRegistry: MediaTypeCodecRegistry<Hovercard> =
      MediaTypeCodecRegistry.of(usersGetContextForUserResponseCodec)

  public const val USERSGETGPGKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/get-gpg-key-for-authenticated-user.response"

  private val usersGetGpgKeyForAuthenticatedUserResponseCodec: MediaTypeCodec<GpgKey> =
      KotlinxSerializationCodec(USERSGETGPGKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, GpgKey.Serializer, SdkJson)

  private val usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<GpgKey> =
      KotlinxSerializationCodec("users/get-gpg-key-for-authenticated-user.response.alternative0", GpgKey.Serializer, SdkJson)

  public val usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GpgKey> =
      MediaTypeCodecRegistry.of(usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-gpg-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-gpg-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-gpg-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersGetGpgKeyForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersGetGpgKeyForAuthenticatedUserResponseCodecRegistry: MediaTypeCodecRegistry<GpgKey>
      = MediaTypeCodecRegistry.of(usersGetGpgKeyForAuthenticatedUserResponseCodec)

  public const val USERSGETPUBLICSSHKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/get-public-ssh-key-for-authenticated-user.response"

  private val usersGetPublicSshKeyForAuthenticatedUserResponseCodec: MediaTypeCodec<Key> =
      KotlinxSerializationCodec(USERSGETPUBLICSSHKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, Key.Serializer, SdkJson)

  private val usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<Key> =
      KotlinxSerializationCodec("users/get-public-ssh-key-for-authenticated-user.response.alternative0", Key.Serializer, SdkJson)

  public val usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Key> =
      MediaTypeCodecRegistry.of(usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-public-ssh-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-public-ssh-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-public-ssh-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersGetPublicSshKeyForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersGetPublicSshKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Key> =
      MediaTypeCodecRegistry.of(usersGetPublicSshKeyForAuthenticatedUserResponseCodec)

  public const val USERSGETSSHSIGNINGKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/get-ssh-signing-key-for-authenticated-user.response"

  private val usersGetSshSigningKeyForAuthenticatedUserResponseCodec: MediaTypeCodec<SshSigningKey>
      =
      KotlinxSerializationCodec(USERSGETSSHSIGNINGKEYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, SshSigningKey.Serializer, SdkJson)

  private val usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<SshSigningKey> =
      KotlinxSerializationCodec("users/get-ssh-signing-key-for-authenticated-user.response.alternative0", SshSigningKey.Serializer, SdkJson)

  public val usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SshSigningKey> =
      MediaTypeCodecRegistry.of(usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-ssh-signing-key-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-ssh-signing-key-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/get-ssh-signing-key-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersGetSshSigningKeyForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersGetSshSigningKeyForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<SshSigningKey> =
      MediaTypeCodecRegistry.of(usersGetSshSigningKeyForAuthenticatedUserResponseCodec)

  public const val USERSLIST_RESPONSE_CODEC_ID: String = "users/list.response"

  private val usersListResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(USERSLIST_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val usersListResponseCodecAlternative0Codec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("users/list.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val usersListResponseCodecAlternative0Registry: MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListResponseCodecAlternative0Codec)

  public val usersListRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListResponseCodecRegistry: MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListResponseCodec)

  private val usersListAttestationsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUsersAttestationsGetResponse200JsonX8bc4be52> =
      KotlinxSerializationCodec("users/list-attestations.response.alternative0", InlineUsersAttestationsGetResponse200JsonX8bc4be52.Serializer, SdkJson)

  public val usersListAttestationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUsersAttestationsGetResponse200JsonX8bc4be52> =
      MediaTypeCodecRegistry.of(usersListAttestationsResponseCodecAlternative0Codec)

  private val usersListAttestationsResponseCodecAlternative1Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("users/list-attestations.response.alternative1", JsonObject.serializer(), SdkJson)

  public val usersListAttestationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(usersListAttestationsResponseCodecAlternative1Codec)

  private val usersListAttestationsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-attestations.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListAttestationsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListAttestationsResponseCodecAlternative3Codec)

  public val usersListAttestationsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val USERSLISTATTESTATIONSBULK_REQUEST_CODEC_ID: String =
      "users/list-attestations-bulk.request"

  private val usersListAttestationsBulkRequestCodec:
      MediaTypeCodec<InlineUsersAttestationsBulkListPostRequestJsonXd1686097> =
      KotlinxSerializationCodec(USERSLISTATTESTATIONSBULK_REQUEST_CODEC_ID, InlineUsersAttestationsBulkListPostRequestJsonXd1686097.Serializer, SdkJson)

  public const val USERSLISTATTESTATIONSBULK_RESPONSE_CODEC_ID: String =
      "users/list-attestations-bulk.response"

  private val usersListAttestationsBulkResponseCodec:
      MediaTypeCodec<InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67> =
      KotlinxSerializationCodec(USERSLISTATTESTATIONSBULK_RESPONSE_CODEC_ID, InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67.Serializer, SdkJson)

  private val usersListAttestationsBulkResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67> =
      KotlinxSerializationCodec("users/list-attestations-bulk.response.alternative0", InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67.Serializer, SdkJson)

  public val usersListAttestationsBulkResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67> =
      MediaTypeCodecRegistry.of(usersListAttestationsBulkResponseCodecAlternative0Codec)

  public val usersListAttestationsBulkRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersAttestationsBulkListPostRequestJsonXd1686097> =
      MediaTypeCodecRegistry.of(usersListAttestationsBulkRequestCodec)

  public val usersListAttestationsBulkResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67> =
      MediaTypeCodecRegistry.of(usersListAttestationsBulkResponseCodec)

  public const val USERSLISTBLOCKEDBYAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-blocked-by-authenticated-user.response"

  private val usersListBlockedByAuthenticatedUserResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(USERSLISTBLOCKEDBYAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val usersListBlockedByAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("users/list-blocked-by-authenticated-user.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val usersListBlockedByAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListBlockedByAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListBlockedByAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-blocked-by-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListBlockedByAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListBlockedByAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListBlockedByAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-blocked-by-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListBlockedByAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListBlockedByAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersListBlockedByAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-blocked-by-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersListBlockedByAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListBlockedByAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersListBlockedByAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListBlockedByAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListBlockedByAuthenticatedUserResponseCodec)

  public const val USERSLISTEMAILSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-emails-for-authenticated-user.response"

  private val usersListEmailsForAuthenticatedUserResponseCodec: MediaTypeCodec<List<Email>> =
      KotlinxSerializationCodec(USERSLISTEMAILSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(Email.Serializer), SdkJson)

  private val usersListEmailsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Email>> =
      KotlinxSerializationCodec("users/list-emails-for-authenticated-user.response.alternative0", ListSerializer(Email.Serializer), SdkJson)

  public val usersListEmailsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Email>> =
      MediaTypeCodecRegistry.of(usersListEmailsForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListEmailsForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-emails-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListEmailsForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListEmailsForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListEmailsForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-emails-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListEmailsForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListEmailsForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersListEmailsForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-emails-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersListEmailsForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListEmailsForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersListEmailsForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListEmailsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Email>> =
      MediaTypeCodecRegistry.of(usersListEmailsForAuthenticatedUserResponseCodec)

  public const val USERSLISTFOLLOWEDBYAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-followed-by-authenticated-user.response"

  private val usersListFollowedByAuthenticatedUserResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(USERSLISTFOLLOWEDBYAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val usersListFollowedByAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("users/list-followed-by-authenticated-user.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val usersListFollowedByAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListFollowedByAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListFollowedByAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-followed-by-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListFollowedByAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListFollowedByAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListFollowedByAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-followed-by-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListFollowedByAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListFollowedByAuthenticatedUserResponseCodecAlternative3Codec)

  public val usersListFollowedByAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val usersListFollowedByAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListFollowedByAuthenticatedUserResponseCodec)

  public const val USERSLISTFOLLOWERSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-followers-for-authenticated-user.response"

  private val usersListFollowersForAuthenticatedUserResponseCodec: MediaTypeCodec<List<SimpleUser>>
      =
      KotlinxSerializationCodec(USERSLISTFOLLOWERSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val usersListFollowersForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("users/list-followers-for-authenticated-user.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val usersListFollowersForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListFollowersForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListFollowersForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-followers-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListFollowersForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListFollowersForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListFollowersForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-followers-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListFollowersForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListFollowersForAuthenticatedUserResponseCodecAlternative3Codec)

  public val usersListFollowersForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersListFollowersForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListFollowersForAuthenticatedUserResponseCodec)

  public const val USERSLISTFOLLOWERSFORUSER_RESPONSE_CODEC_ID: String =
      "users/list-followers-for-user.response"

  private val usersListFollowersForUserResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(USERSLISTFOLLOWERSFORUSER_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val usersListFollowersForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("users/list-followers-for-user.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val usersListFollowersForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListFollowersForUserResponseCodecAlternative0Codec)

  public val usersListFollowersForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListFollowersForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListFollowersForUserResponseCodec)

  public const val USERSLISTFOLLOWINGFORUSER_RESPONSE_CODEC_ID: String =
      "users/list-following-for-user.response"

  private val usersListFollowingForUserResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(USERSLISTFOLLOWINGFORUSER_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val usersListFollowingForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("users/list-following-for-user.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val usersListFollowingForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListFollowingForUserResponseCodecAlternative0Codec)

  public val usersListFollowingForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListFollowingForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(usersListFollowingForUserResponseCodec)

  public const val USERSLISTGPGKEYSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-gpg-keys-for-authenticated-user.response"

  private val usersListGpgKeysForAuthenticatedUserResponseCodec: MediaTypeCodec<List<GpgKey>> =
      KotlinxSerializationCodec(USERSLISTGPGKEYSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(GpgKey.Serializer), SdkJson)

  private val usersListGpgKeysForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<GpgKey>> =
      KotlinxSerializationCodec("users/list-gpg-keys-for-authenticated-user.response.alternative0", ListSerializer(GpgKey.Serializer), SdkJson)

  public val usersListGpgKeysForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<GpgKey>> =
      MediaTypeCodecRegistry.of(usersListGpgKeysForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListGpgKeysForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-gpg-keys-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListGpgKeysForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListGpgKeysForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListGpgKeysForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-gpg-keys-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListGpgKeysForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListGpgKeysForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersListGpgKeysForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-gpg-keys-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersListGpgKeysForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListGpgKeysForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersListGpgKeysForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val usersListGpgKeysForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<GpgKey>> =
      MediaTypeCodecRegistry.of(usersListGpgKeysForAuthenticatedUserResponseCodec)

  public const val USERSLISTGPGKEYSFORUSER_RESPONSE_CODEC_ID: String =
      "users/list-gpg-keys-for-user.response"

  private val usersListGpgKeysForUserResponseCodec: MediaTypeCodec<List<GpgKey>> =
      KotlinxSerializationCodec(USERSLISTGPGKEYSFORUSER_RESPONSE_CODEC_ID, ListSerializer(GpgKey.Serializer), SdkJson)

  private val usersListGpgKeysForUserResponseCodecAlternative0Codec: MediaTypeCodec<List<GpgKey>> =
      KotlinxSerializationCodec("users/list-gpg-keys-for-user.response.alternative0", ListSerializer(GpgKey.Serializer), SdkJson)

  public val usersListGpgKeysForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<GpgKey>> =
      MediaTypeCodecRegistry.of(usersListGpgKeysForUserResponseCodecAlternative0Codec)

  public val usersListGpgKeysForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListGpgKeysForUserResponseCodecRegistry: MediaTypeCodecRegistry<List<GpgKey>> =
      MediaTypeCodecRegistry.of(usersListGpgKeysForUserResponseCodec)

  public const val USERSLISTPUBLICEMAILSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-public-emails-for-authenticated-user.response"

  private val usersListPublicEmailsForAuthenticatedUserResponseCodec: MediaTypeCodec<List<Email>> =
      KotlinxSerializationCodec(USERSLISTPUBLICEMAILSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(Email.Serializer), SdkJson)

  private val usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Email>> =
      KotlinxSerializationCodec("users/list-public-emails-for-authenticated-user.response.alternative0", ListSerializer(Email.Serializer), SdkJson)

  public val usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Email>> =
      MediaTypeCodecRegistry.of(usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-public-emails-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-public-emails-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-public-emails-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersListPublicEmailsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersListPublicEmailsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Email>> =
      MediaTypeCodecRegistry.of(usersListPublicEmailsForAuthenticatedUserResponseCodec)

  public const val USERSLISTPUBLICKEYSFORUSER_RESPONSE_CODEC_ID: String =
      "users/list-public-keys-for-user.response"

  private val usersListPublicKeysForUserResponseCodec: MediaTypeCodec<List<KeySimple>> =
      KotlinxSerializationCodec(USERSLISTPUBLICKEYSFORUSER_RESPONSE_CODEC_ID, ListSerializer(KeySimple.Serializer), SdkJson)

  private val usersListPublicKeysForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<KeySimple>> =
      KotlinxSerializationCodec("users/list-public-keys-for-user.response.alternative0", ListSerializer(KeySimple.Serializer), SdkJson)

  public val usersListPublicKeysForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<KeySimple>> =
      MediaTypeCodecRegistry.of(usersListPublicKeysForUserResponseCodecAlternative0Codec)

  public val usersListPublicKeysForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListPublicKeysForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<KeySimple>> =
      MediaTypeCodecRegistry.of(usersListPublicKeysForUserResponseCodec)

  public const val USERSLISTPUBLICSSHKEYSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-public-ssh-keys-for-authenticated-user.response"

  private val usersListPublicSshKeysForAuthenticatedUserResponseCodec: MediaTypeCodec<List<Key>> =
      KotlinxSerializationCodec(USERSLISTPUBLICSSHKEYSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(Key.Serializer), SdkJson)

  private val usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Key>> =
      KotlinxSerializationCodec("users/list-public-ssh-keys-for-authenticated-user.response.alternative0", ListSerializer(Key.Serializer), SdkJson)

  public val usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Key>> =
      MediaTypeCodecRegistry.of(usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-public-ssh-keys-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-public-ssh-keys-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-public-ssh-keys-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersListPublicSshKeysForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersListPublicSshKeysForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Key>> =
      MediaTypeCodecRegistry.of(usersListPublicSshKeysForAuthenticatedUserResponseCodec)

  public const val USERSLISTSOCIALACCOUNTSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-social-accounts-for-authenticated-user.response"

  private val usersListSocialAccountsForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<SocialAccount>> =
      KotlinxSerializationCodec(USERSLISTSOCIALACCOUNTSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(SocialAccount.Serializer), SdkJson)

  private val usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SocialAccount>> =
      KotlinxSerializationCodec("users/list-social-accounts-for-authenticated-user.response.alternative0", ListSerializer(SocialAccount.Serializer), SdkJson)

  public val usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SocialAccount>> =
      MediaTypeCodecRegistry.of(usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-social-accounts-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-social-accounts-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-social-accounts-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersListSocialAccountsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersListSocialAccountsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SocialAccount>> =
      MediaTypeCodecRegistry.of(usersListSocialAccountsForAuthenticatedUserResponseCodec)

  public const val USERSLISTSOCIALACCOUNTSFORUSER_RESPONSE_CODEC_ID: String =
      "users/list-social-accounts-for-user.response"

  private val usersListSocialAccountsForUserResponseCodec: MediaTypeCodec<List<SocialAccount>> =
      KotlinxSerializationCodec(USERSLISTSOCIALACCOUNTSFORUSER_RESPONSE_CODEC_ID, ListSerializer(SocialAccount.Serializer), SdkJson)

  private val usersListSocialAccountsForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SocialAccount>> =
      KotlinxSerializationCodec("users/list-social-accounts-for-user.response.alternative0", ListSerializer(SocialAccount.Serializer), SdkJson)

  public val usersListSocialAccountsForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SocialAccount>> =
      MediaTypeCodecRegistry.of(usersListSocialAccountsForUserResponseCodecAlternative0Codec)

  public val usersListSocialAccountsForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListSocialAccountsForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SocialAccount>> =
      MediaTypeCodecRegistry.of(usersListSocialAccountsForUserResponseCodec)

  public const val USERSLISTSSHSIGNINGKEYSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/list-ssh-signing-keys-for-authenticated-user.response"

  private val usersListSshSigningKeysForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<SshSigningKey>> =
      KotlinxSerializationCodec(USERSLISTSSHSIGNINGKEYSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(SshSigningKey.Serializer), SdkJson)

  private val usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SshSigningKey>> =
      KotlinxSerializationCodec("users/list-ssh-signing-keys-for-authenticated-user.response.alternative0", ListSerializer(SshSigningKey.Serializer), SdkJson)

  public val usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SshSigningKey>> =
      MediaTypeCodecRegistry.of(usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-ssh-signing-keys-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-ssh-signing-keys-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/list-ssh-signing-keys-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative4Codec)

  public val usersListSshSigningKeysForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val usersListSshSigningKeysForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SshSigningKey>> =
      MediaTypeCodecRegistry.of(usersListSshSigningKeysForAuthenticatedUserResponseCodec)

  public const val USERSLISTSSHSIGNINGKEYSFORUSER_RESPONSE_CODEC_ID: String =
      "users/list-ssh-signing-keys-for-user.response"

  private val usersListSshSigningKeysForUserResponseCodec: MediaTypeCodec<List<SshSigningKey>> =
      KotlinxSerializationCodec(USERSLISTSSHSIGNINGKEYSFORUSER_RESPONSE_CODEC_ID, ListSerializer(SshSigningKey.Serializer), SdkJson)

  private val usersListSshSigningKeysForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SshSigningKey>> =
      KotlinxSerializationCodec("users/list-ssh-signing-keys-for-user.response.alternative0", ListSerializer(SshSigningKey.Serializer), SdkJson)

  public val usersListSshSigningKeysForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SshSigningKey>> =
      MediaTypeCodecRegistry.of(usersListSshSigningKeysForUserResponseCodecAlternative0Codec)

  public val usersListSshSigningKeysForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersListSshSigningKeysForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SshSigningKey>> =
      MediaTypeCodecRegistry.of(usersListSshSigningKeysForUserResponseCodec)

  public const val USERSSETPRIMARYEMAILVISIBILITYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "users/set-primary-email-visibility-for-authenticated-user.request"

  private val usersSetPrimaryEmailVisibilityForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InlineUserEmailVisibilityPatchRequestJsonX3514b5c9> =
      KotlinxSerializationCodec(USERSSETPRIMARYEMAILVISIBILITYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InlineUserEmailVisibilityPatchRequestJsonX3514b5c9.Serializer, SdkJson)

  public const val USERSSETPRIMARYEMAILVISIBILITYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "users/set-primary-email-visibility-for-authenticated-user.response"

  private val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<Email>> =
      KotlinxSerializationCodec(USERSSETPRIMARYEMAILVISIBILITYFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(Email.Serializer), SdkJson)

  private val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Email>> =
      KotlinxSerializationCodec("users/set-primary-email-visibility-for-authenticated-user.response.alternative0", ListSerializer(Email.Serializer), SdkJson)

  public val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Email>> =
      MediaTypeCodecRegistry.of(usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative0Codec)

  private val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/set-primary-email-visibility-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative2Codec)

  private val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/set-primary-email-visibility-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative3Codec)

  private val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/set-primary-email-visibility-for-authenticated-user.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative4Codec)

  private val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/set-primary-email-visibility-for-authenticated-user.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative5Codec)

  public val usersSetPrimaryEmailVisibilityForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserEmailVisibilityPatchRequestJsonX3514b5c9> =
      MediaTypeCodecRegistry.of(usersSetPrimaryEmailVisibilityForAuthenticatedUserRequestCodec)

  public val usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Email>> =
      MediaTypeCodecRegistry.of(usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodec)

  private val usersUnblockResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/unblock.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersUnblockResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUnblockResponseCodecAlternative2Codec)

  private val usersUnblockResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/unblock.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersUnblockResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUnblockResponseCodecAlternative3Codec)

  private val usersUnblockResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/unblock.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersUnblockResponseCodecAlternative4Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUnblockResponseCodecAlternative4Codec)

  public val usersUnblockRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersUnblockResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val usersUnfollowResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/unfollow.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersUnfollowResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUnfollowResponseCodecAlternative2Codec)

  private val usersUnfollowResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/unfollow.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersUnfollowResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUnfollowResponseCodecAlternative3Codec)

  private val usersUnfollowResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/unfollow.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersUnfollowResponseCodecAlternative4Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUnfollowResponseCodecAlternative4Codec)

  public val usersUnfollowRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val usersUnfollowResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val USERSUPDATEAUTHENTICATED_REQUEST_CODEC_ID: String =
      "users/update-authenticated.request"

  private val usersUpdateAuthenticatedRequestCodec:
      MediaTypeCodec<InlineUserPatchRequestJsonXcc70b87c?> =
      KotlinxSerializationCodec(USERSUPDATEAUTHENTICATED_REQUEST_CODEC_ID, InlineUserPatchRequestJsonXcc70b87c.Serializer.nullable, SdkJson)

  public const val USERSUPDATEAUTHENTICATED_RESPONSE_CODEC_ID: String =
      "users/update-authenticated.response"

  private val usersUpdateAuthenticatedResponseCodec: MediaTypeCodec<PrivateUser> =
      KotlinxSerializationCodec(USERSUPDATEAUTHENTICATED_RESPONSE_CODEC_ID, PrivateUser.Serializer, SdkJson)

  private val usersUpdateAuthenticatedResponseCodecAlternative0Codec: MediaTypeCodec<PrivateUser> =
      KotlinxSerializationCodec("users/update-authenticated.response.alternative0", PrivateUser.Serializer, SdkJson)

  public val usersUpdateAuthenticatedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PrivateUser> =
      MediaTypeCodecRegistry.of(usersUpdateAuthenticatedResponseCodecAlternative0Codec)

  private val usersUpdateAuthenticatedResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/update-authenticated.response.alternative2", BasicError.Serializer, SdkJson)

  public val usersUpdateAuthenticatedResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUpdateAuthenticatedResponseCodecAlternative2Codec)

  private val usersUpdateAuthenticatedResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/update-authenticated.response.alternative3", BasicError.Serializer, SdkJson)

  public val usersUpdateAuthenticatedResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUpdateAuthenticatedResponseCodecAlternative3Codec)

  private val usersUpdateAuthenticatedResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("users/update-authenticated.response.alternative4", BasicError.Serializer, SdkJson)

  public val usersUpdateAuthenticatedResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(usersUpdateAuthenticatedResponseCodecAlternative4Codec)

  private val usersUpdateAuthenticatedResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("users/update-authenticated.response.alternative5", ValidationError.Serializer, SdkJson)

  public val usersUpdateAuthenticatedResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(usersUpdateAuthenticatedResponseCodecAlternative5Codec)

  public val usersUpdateAuthenticatedRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUserPatchRequestJsonXcc70b87c?> =
      MediaTypeCodecRegistry.of(usersUpdateAuthenticatedRequestCodec)

  public val usersUpdateAuthenticatedResponseCodecRegistry: MediaTypeCodecRegistry<PrivateUser> =
      MediaTypeCodecRegistry.of(usersUpdateAuthenticatedResponseCodec)
}

/**
 * Client for the 'users' group of GitHub v3 REST API.
 */
public class UsersClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@UsersClient.authentication)

  /**
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersAddEmailForAuthenticatedUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded UsersAddEmailForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersAddEmailForAuthenticatedUser(request: InlineUserEmailsPostRequestJsonX31221c91? = null, options: CallOptions = CallOptions()): List<Email> = executor.executeWithTypedErrors<InlineUserEmailsPostRequestJsonX31221c91?, UsersAddEmailForAuthenticatedUserResponse, List<Email>>(
    request = SdkExecutionRequest(usersAddEmailForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSADDEMAILFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersAddEmailForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersAddEmailForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersAddEmailForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersAddEmailForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddEmailForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddEmailForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddEmailForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddEmailForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddEmailForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersAddEmailForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersAddEmailForAuthenticatedUserResponse.Http304NoContent -> UsersAddEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddEmailForAuthenticatedUserResponse.Http401Json -> UsersAddEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddEmailForAuthenticatedUserResponse.Http403Json -> UsersAddEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddEmailForAuthenticatedUserResponse.Http404Json -> UsersAddEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddEmailForAuthenticatedUserResponse.Http422Json -> UsersAddEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddEmailForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersAddEmailForAuthenticatedUserWithResponse(request: InlineUserEmailsPostRequestJsonX31221c91? = null, options: CallOptions = CallOptions()): SdkResponseResult<UsersAddEmailForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserEmailsPostRequestJsonX31221c91?, UsersAddEmailForAuthenticatedUserResponse>(SdkExecutionRequest(usersAddEmailForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSADDEMAILFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersAddEmailForAuthenticatedUserRequestCodecRegistry, UsersAddEmailForAuthenticatedUserResponseDecoder, options)

  /**
   * Add one or more social accounts to the authenticated user's profile.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersAddSocialAccountForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersAddSocialAccountForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersAddSocialAccountForAuthenticatedUser(request: InlineUserSocialAccountsPostRequestJsonX141ac9f4, options: CallOptions = CallOptions()): List<SocialAccount> = executor.executeWithTypedErrors<InlineUserSocialAccountsPostRequestJsonX141ac9f4, UsersAddSocialAccountForAuthenticatedUserResponse, List<SocialAccount>>(
    request = SdkExecutionRequest(usersAddSocialAccountForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSADDSOCIALACCOUNTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersAddSocialAccountForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersAddSocialAccountForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersAddSocialAccountForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersAddSocialAccountForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersAddSocialAccountForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http304NoContent -> UsersAddSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http401Json -> UsersAddSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http403Json -> UsersAddSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http404Json -> UsersAddSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddSocialAccountForAuthenticatedUserResponse.Http422Json -> UsersAddSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersAddSocialAccountForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Add one or more social accounts to the authenticated user's profile.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersAddSocialAccountForAuthenticatedUserWithResponse(request: InlineUserSocialAccountsPostRequestJsonX141ac9f4, options: CallOptions = CallOptions()): SdkResponseResult<UsersAddSocialAccountForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserSocialAccountsPostRequestJsonX141ac9f4, UsersAddSocialAccountForAuthenticatedUserResponse>(SdkExecutionRequest(usersAddSocialAccountForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSADDSOCIALACCOUNTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersAddSocialAccountForAuthenticatedUserRequestCodecRegistry, UsersAddSocialAccountForAuthenticatedUserResponseDecoder, options)

  /**
   * Blocks the given user and returns a 204. If the authenticated user cannot block the given user a 422 is returned.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersBlockApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UsersBlockError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersBlock(username: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersBlockResponse, Unit>(
    request = SdkExecutionRequest(usersBlockMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersBlockRequestCodecRegistry,
    responseDecoder = UsersBlockResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersBlockResponse.SuccessNoContent -> response.unit
        is UsersBlockResponse.Http304NoContent -> response.unit
        is UsersBlockResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersBlockResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersBlockResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersBlockResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersBlockResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersBlockResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersBlockResponse.Http304NoContent -> UsersBlockApiException(response, statusCode, headers)
        is UsersBlockResponse.Http401Json -> UsersBlockApiException(response, statusCode, headers)
        is UsersBlockResponse.Http403Json -> UsersBlockApiException(response, statusCode, headers)
        is UsersBlockResponse.Http404Json -> UsersBlockApiException(response, statusCode, headers)
        is UsersBlockResponse.Http422Json -> UsersBlockApiException(response, statusCode, headers)
        is UsersBlockResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Blocks the given user and returns a 204. If the authenticated user cannot block the given user a 422 is returned.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersBlockWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<UsersBlockResponse> = executor.executeWithResponse<Unit, UsersBlockResponse>(SdkExecutionRequest(usersBlockMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersBlockRequestCodecRegistry, UsersBlockResponseDecoder, options)

  /**
   * Returns a 204 if the given user is blocked by the authenticated user. Returns a 404 if the given user is not
   * blocked by the authenticated user, or if the given user account has been identified as spam by GitHub.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersCheckBlockedApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded UsersCheckBlockedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersCheckBlocked(username: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersCheckBlockedResponse, Unit>(
    request = SdkExecutionRequest(usersCheckBlockedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersCheckBlockedRequestCodecRegistry,
    responseDecoder = UsersCheckBlockedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersCheckBlockedResponse.SuccessNoContent -> response.unit
        is UsersCheckBlockedResponse.Http304NoContent -> response.unit
        is UsersCheckBlockedResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCheckBlockedResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCheckBlockedResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCheckBlockedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersCheckBlockedResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersCheckBlockedResponse.Http304NoContent -> UsersCheckBlockedApiException(response, statusCode, headers)
        is UsersCheckBlockedResponse.Http401Json -> UsersCheckBlockedApiException(response, statusCode, headers)
        is UsersCheckBlockedResponse.Http403Json -> UsersCheckBlockedApiException(response, statusCode, headers)
        is UsersCheckBlockedResponse.Http404Json -> UsersCheckBlockedApiException(response, statusCode, headers)
        is UsersCheckBlockedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns a 204 if the given user is blocked by the authenticated user. Returns a 404 if the given user is not
   * blocked by the authenticated user, or if the given user account has been identified as spam by GitHub.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersCheckBlockedWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<UsersCheckBlockedResponse> = executor.executeWithResponse<Unit, UsersCheckBlockedResponse>(SdkExecutionRequest(usersCheckBlockedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersCheckBlockedRequestCodecRegistry, UsersCheckBlockedResponseDecoder, options)

  /**
   *
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersCheckFollowingForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded UsersCheckFollowingForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersCheckFollowingForUser(
    targetUser: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, UsersCheckFollowingForUserResponse, Unit>(
    request = SdkExecutionRequest(usersCheckFollowingForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "target_user", values = listOf(targetUser.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersCheckFollowingForUserRequestCodecRegistry,
    responseDecoder = UsersCheckFollowingForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersCheckFollowingForUserResponse.SuccessNoContent -> response.unit
        is UsersCheckFollowingForUserResponse.Http404NoContent -> response.unit
        is UsersCheckFollowingForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersCheckFollowingForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersCheckFollowingForUserResponse.Http404NoContent -> UsersCheckFollowingForUserApiException(response, statusCode, headers)
        is UsersCheckFollowingForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersCheckFollowingForUserWithResponse(
    targetUser: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersCheckFollowingForUserResponse> = executor.executeWithResponse<Unit, UsersCheckFollowingForUserResponse>(SdkExecutionRequest(usersCheckFollowingForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "target_user", values = listOf(targetUser.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersCheckFollowingForUserRequestCodecRegistry, UsersCheckFollowingForUserResponseDecoder, options)

  /**
   *
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersCheckPersonIsFollowedByAuthenticatedApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersCheckPersonIsFollowedByAuthenticatedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersCheckPersonIsFollowedByAuthenticated(username: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersCheckPersonIsFollowedByAuthenticatedResponse, Unit>(
    request = SdkExecutionRequest(usersCheckPersonIsFollowedByAuthenticatedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersCheckPersonIsFollowedByAuthenticatedRequestCodecRegistry,
    responseDecoder = UsersCheckPersonIsFollowedByAuthenticatedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.SuccessNoContent -> response.unit
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Http304NoContent -> response.unit
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Http304NoContent -> UsersCheckPersonIsFollowedByAuthenticatedApiException(response, statusCode, headers)
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Http401Json -> UsersCheckPersonIsFollowedByAuthenticatedApiException(response, statusCode, headers)
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Http403Json -> UsersCheckPersonIsFollowedByAuthenticatedApiException(response, statusCode, headers)
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Http404Json -> UsersCheckPersonIsFollowedByAuthenticatedApiException(response, statusCode, headers)
        is UsersCheckPersonIsFollowedByAuthenticatedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersCheckPersonIsFollowedByAuthenticatedWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<UsersCheckPersonIsFollowedByAuthenticatedResponse> = executor.executeWithResponse<Unit, UsersCheckPersonIsFollowedByAuthenticatedResponse>(SdkExecutionRequest(usersCheckPersonIsFollowedByAuthenticatedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersCheckPersonIsFollowedByAuthenticatedRequestCodecRegistry, UsersCheckPersonIsFollowedByAuthenticatedResponseDecoder, options)

  /**
   * Adds a GPG key to the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:gpg_key` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersCreateGpgKeyForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded UsersCreateGpgKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersCreateGpgKeyForAuthenticatedUser(request: InlineUserGpgKeysPostRequestJsonX41d91d36, options: CallOptions = CallOptions()): GpgKey = executor.executeWithTypedErrors<InlineUserGpgKeysPostRequestJsonX41d91d36, UsersCreateGpgKeyForAuthenticatedUserResponse, GpgKey>(
    request = SdkExecutionRequest(usersCreateGpgKeyForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSCREATEGPGKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersCreateGpgKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersCreateGpgKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersCreateGpgKeyForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersCreateGpgKeyForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http304NoContent -> UsersCreateGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http401Json -> UsersCreateGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http403Json -> UsersCreateGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http404Json -> UsersCreateGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Http422Json -> UsersCreateGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateGpgKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a GPG key to the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:gpg_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersCreateGpgKeyForAuthenticatedUserWithResponse(request: InlineUserGpgKeysPostRequestJsonX41d91d36, options: CallOptions = CallOptions()): SdkResponseResult<UsersCreateGpgKeyForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserGpgKeysPostRequestJsonX41d91d36, UsersCreateGpgKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersCreateGpgKeyForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSCREATEGPGKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersCreateGpgKeyForAuthenticatedUserRequestCodecRegistry, UsersCreateGpgKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Adds a public SSH key to the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:public_key` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersCreatePublicSshKeyForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersCreatePublicSshKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersCreatePublicSshKeyForAuthenticatedUser(request: InlineUserKeysPostRequestJsonXcffba277, options: CallOptions = CallOptions()): Key = executor.executeWithTypedErrors<InlineUserKeysPostRequestJsonXcffba277, UsersCreatePublicSshKeyForAuthenticatedUserResponse, Key>(
    request = SdkExecutionRequest(usersCreatePublicSshKeyForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSCREATEPUBLICSSHKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersCreatePublicSshKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersCreatePublicSshKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http304NoContent -> UsersCreatePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http401Json -> UsersCreatePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http403Json -> UsersCreatePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http404Json -> UsersCreatePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http422Json -> UsersCreatePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreatePublicSshKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a public SSH key to the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:public_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersCreatePublicSshKeyForAuthenticatedUserWithResponse(request: InlineUserKeysPostRequestJsonXcffba277, options: CallOptions = CallOptions()): SdkResponseResult<UsersCreatePublicSshKeyForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserKeysPostRequestJsonXcffba277, UsersCreatePublicSshKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersCreatePublicSshKeyForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSCREATEPUBLICSSHKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersCreatePublicSshKeyForAuthenticatedUserRequestCodecRegistry, UsersCreatePublicSshKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Creates an SSH signing key for the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:ssh_signing_key` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersCreateSshSigningKeyForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersCreateSshSigningKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersCreateSshSigningKeyForAuthenticatedUser(request: InlineUserSshSigningKeysPostRequestJsonXe1811404, options: CallOptions = CallOptions()): SshSigningKey = executor.executeWithTypedErrors<InlineUserSshSigningKeysPostRequestJsonXe1811404, UsersCreateSshSigningKeyForAuthenticatedUserResponse, SshSigningKey>(
    request = SdkExecutionRequest(usersCreateSshSigningKeyForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSCREATESSHSIGNINGKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersCreateSshSigningKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersCreateSshSigningKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http304NoContent -> UsersCreateSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http401Json -> UsersCreateSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http403Json -> UsersCreateSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http404Json -> UsersCreateSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http422Json -> UsersCreateSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersCreateSshSigningKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates an SSH signing key for the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:ssh_signing_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersCreateSshSigningKeyForAuthenticatedUserWithResponse(request: InlineUserSshSigningKeysPostRequestJsonXe1811404, options: CallOptions = CallOptions()): SdkResponseResult<UsersCreateSshSigningKeyForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserSshSigningKeysPostRequestJsonXe1811404, UsersCreateSshSigningKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersCreateSshSigningKeyForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSCREATESSHSIGNINGKEYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersCreateSshSigningKeyForAuthenticatedUserRequestCodecRegistry, UsersCreateSshSigningKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Delete artifact attestations in bulk by either subject digests or unique ID.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws UsersDeleteAttestationsBulkApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded UsersDeleteAttestationsBulkError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersDeleteAttestationsBulk(
    request: InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a, UsersDeleteAttestationsBulkResponse, Unit>(
    request = SdkExecutionRequest(usersDeleteAttestationsBulkMetadata, baseUri, request, listOf(UsersCodecs.USERSDELETEATTESTATIONSBULK_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersDeleteAttestationsBulkRequestCodecRegistry,
    responseDecoder = UsersDeleteAttestationsBulkResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersDeleteAttestationsBulkResponse.SuccessNoContent -> response.unit
        is UsersDeleteAttestationsBulkResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteAttestationsBulkResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersDeleteAttestationsBulkResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteAttestationsBulkResponse.Http404Json -> UsersDeleteAttestationsBulkApiException(response, statusCode, headers)
        is UsersDeleteAttestationsBulkResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete artifact attestations in bulk by either subject digests or unique ID.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersDeleteAttestationsBulkWithResponse(
    request: InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersDeleteAttestationsBulkResponse> = executor.executeWithResponse<InlineUsersAttestationsDeleteRequestPostRequestJsonX2b76e62a, UsersDeleteAttestationsBulkResponse>(SdkExecutionRequest(usersDeleteAttestationsBulkMetadata, baseUri, request, listOf(UsersCodecs.USERSDELETEATTESTATIONSBULK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersDeleteAttestationsBulkRequestCodecRegistry, UsersDeleteAttestationsBulkResponseDecoder, options)

  /**
   * Delete an artifact attestation by unique ID that is associated with a repository owned by a user.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersDeleteAttestationsByIdApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded UsersDeleteAttestationsByIdError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersDeleteAttestationsById(
    attestationId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, UsersDeleteAttestationsByIdResponse, Unit>(
    request = SdkExecutionRequest(usersDeleteAttestationsByIdMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "attestation_id", values = listOf(attestationId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersDeleteAttestationsByIdRequestCodecRegistry,
    responseDecoder = UsersDeleteAttestationsByIdResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersDeleteAttestationsByIdResponse.SuccessNoContent -> response.unit
        is UsersDeleteAttestationsByIdResponse.SuccessNoContent2 -> response.unit
        is UsersDeleteAttestationsByIdResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteAttestationsByIdResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteAttestationsByIdResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersDeleteAttestationsByIdResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteAttestationsByIdResponse.SuccessNoContent2 -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteAttestationsByIdResponse.Http403Json -> UsersDeleteAttestationsByIdApiException(response, statusCode, headers)
        is UsersDeleteAttestationsByIdResponse.Http404Json -> UsersDeleteAttestationsByIdApiException(response, statusCode, headers)
        is UsersDeleteAttestationsByIdResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete an artifact attestation by unique ID that is associated with a repository owned by a user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersDeleteAttestationsByIdWithResponse(
    attestationId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersDeleteAttestationsByIdResponse> = executor.executeWithResponse<Unit, UsersDeleteAttestationsByIdResponse>(SdkExecutionRequest(usersDeleteAttestationsByIdMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "attestation_id", values = listOf(attestationId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersDeleteAttestationsByIdRequestCodecRegistry, UsersDeleteAttestationsByIdResponseDecoder, options)

  /**
   * Delete an artifact attestation by subject digest.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersDeleteAttestationsBySubjectDigestApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersDeleteAttestationsBySubjectDigestError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersDeleteAttestationsBySubjectDigest(
    subjectDigest: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, UsersDeleteAttestationsBySubjectDigestResponse, Unit>(
    request = SdkExecutionRequest(usersDeleteAttestationsBySubjectDigestMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subject_digest", values = listOf(subjectDigest.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersDeleteAttestationsBySubjectDigestRequestCodecRegistry,
    responseDecoder = UsersDeleteAttestationsBySubjectDigestResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersDeleteAttestationsBySubjectDigestResponse.SuccessNoContent -> response.unit
        is UsersDeleteAttestationsBySubjectDigestResponse.SuccessNoContent2 -> response.unit
        is UsersDeleteAttestationsBySubjectDigestResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteAttestationsBySubjectDigestResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersDeleteAttestationsBySubjectDigestResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteAttestationsBySubjectDigestResponse.SuccessNoContent2 -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteAttestationsBySubjectDigestResponse.Http404Json -> UsersDeleteAttestationsBySubjectDigestApiException(response, statusCode, headers)
        is UsersDeleteAttestationsBySubjectDigestResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete an artifact attestation by subject digest.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersDeleteAttestationsBySubjectDigestWithResponse(
    subjectDigest: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersDeleteAttestationsBySubjectDigestResponse> = executor.executeWithResponse<Unit, UsersDeleteAttestationsBySubjectDigestResponse>(SdkExecutionRequest(usersDeleteAttestationsBySubjectDigestMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subject_digest", values = listOf(subjectDigest.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersDeleteAttestationsBySubjectDigestRequestCodecRegistry, UsersDeleteAttestationsBySubjectDigestResponseDecoder, options)

  /**
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws UsersDeleteEmailForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded UsersDeleteEmailForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersDeleteEmailForAuthenticatedUser(request: InlineUserEmailsDeleteRequestJsonX415520e8? = null, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<InlineUserEmailsDeleteRequestJsonX415520e8?, UsersDeleteEmailForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(usersDeleteEmailForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSDELETEEMAILFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersDeleteEmailForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersDeleteEmailForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersDeleteEmailForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is UsersDeleteEmailForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is UsersDeleteEmailForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteEmailForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteEmailForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteEmailForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteEmailForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersDeleteEmailForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteEmailForAuthenticatedUserResponse.Http304NoContent -> UsersDeleteEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteEmailForAuthenticatedUserResponse.Http401Json -> UsersDeleteEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteEmailForAuthenticatedUserResponse.Http403Json -> UsersDeleteEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteEmailForAuthenticatedUserResponse.Http404Json -> UsersDeleteEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteEmailForAuthenticatedUserResponse.Http422Json -> UsersDeleteEmailForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteEmailForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersDeleteEmailForAuthenticatedUserWithResponse(request: InlineUserEmailsDeleteRequestJsonX415520e8? = null, options: CallOptions = CallOptions()): SdkResponseResult<UsersDeleteEmailForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserEmailsDeleteRequestJsonX415520e8?, UsersDeleteEmailForAuthenticatedUserResponse>(SdkExecutionRequest(usersDeleteEmailForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSDELETEEMAILFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersDeleteEmailForAuthenticatedUserRequestCodecRegistry, UsersDeleteEmailForAuthenticatedUserResponseDecoder, options)

  /**
   * Removes a GPG key from the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:gpg_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersDeleteGpgKeyForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded UsersDeleteGpgKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersDeleteGpgKeyForAuthenticatedUser(gpgKeyId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersDeleteGpgKeyForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(usersDeleteGpgKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gpg_key_id", values = listOf(gpgKeyId.toString())))
    }),
    requestCodecs = UsersCodecs.usersDeleteGpgKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersDeleteGpgKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http304NoContent -> UsersDeleteGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http401Json -> UsersDeleteGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http403Json -> UsersDeleteGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http404Json -> UsersDeleteGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Http422Json -> UsersDeleteGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteGpgKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a GPG key from the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:gpg_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersDeleteGpgKeyForAuthenticatedUserWithResponse(gpgKeyId: Int, options: CallOptions = CallOptions()): SdkResponseResult<UsersDeleteGpgKeyForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersDeleteGpgKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersDeleteGpgKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gpg_key_id", values = listOf(gpgKeyId.toString())))
  }), UsersCodecs.usersDeleteGpgKeyForAuthenticatedUserRequestCodecRegistry, UsersDeleteGpgKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Removes a public SSH key from the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:public_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersDeletePublicSshKeyForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersDeletePublicSshKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersDeletePublicSshKeyForAuthenticatedUser(keyId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersDeletePublicSshKeyForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(usersDeletePublicSshKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "key_id", values = listOf(keyId.toString())))
    }),
    requestCodecs = UsersCodecs.usersDeletePublicSshKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersDeletePublicSshKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http304NoContent -> UsersDeletePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http401Json -> UsersDeletePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http403Json -> UsersDeletePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http404Json -> UsersDeletePublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeletePublicSshKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a public SSH key from the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:public_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersDeletePublicSshKeyForAuthenticatedUserWithResponse(keyId: Int, options: CallOptions = CallOptions()): SdkResponseResult<UsersDeletePublicSshKeyForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersDeletePublicSshKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersDeletePublicSshKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "key_id", values = listOf(keyId.toString())))
  }), UsersCodecs.usersDeletePublicSshKeyForAuthenticatedUserRequestCodecRegistry, UsersDeletePublicSshKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Deletes one or more social accounts from the authenticated user's profile.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws UsersDeleteSocialAccountForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersDeleteSocialAccountForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersDeleteSocialAccountForAuthenticatedUser(request: InlineUserSocialAccountsDeleteRequestJsonX4ce9b605, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<InlineUserSocialAccountsDeleteRequestJsonX4ce9b605, UsersDeleteSocialAccountForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(usersDeleteSocialAccountForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSDELETESOCIALACCOUNTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersDeleteSocialAccountForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersDeleteSocialAccountForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http304NoContent -> UsersDeleteSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http401Json -> UsersDeleteSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http403Json -> UsersDeleteSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http404Json -> UsersDeleteSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Http422Json -> UsersDeleteSocialAccountForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSocialAccountForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes one or more social accounts from the authenticated user's profile.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersDeleteSocialAccountForAuthenticatedUserWithResponse(request: InlineUserSocialAccountsDeleteRequestJsonX4ce9b605, options: CallOptions = CallOptions()): SdkResponseResult<UsersDeleteSocialAccountForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserSocialAccountsDeleteRequestJsonX4ce9b605, UsersDeleteSocialAccountForAuthenticatedUserResponse>(SdkExecutionRequest(usersDeleteSocialAccountForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSDELETESOCIALACCOUNTFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersDeleteSocialAccountForAuthenticatedUserRequestCodecRegistry, UsersDeleteSocialAccountForAuthenticatedUserResponseDecoder, options)

  /**
   * Deletes an SSH signing key from the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:ssh_signing_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersDeleteSshSigningKeyForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersDeleteSshSigningKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersDeleteSshSigningKeyForAuthenticatedUser(sshSigningKeyId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersDeleteSshSigningKeyForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(usersDeleteSshSigningKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ssh_signing_key_id", values = listOf(sshSigningKeyId.toString())))
    }),
    requestCodecs = UsersCodecs.usersDeleteSshSigningKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersDeleteSshSigningKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http304NoContent -> response.unit
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http304NoContent -> UsersDeleteSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http401Json -> UsersDeleteSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http403Json -> UsersDeleteSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http404Json -> UsersDeleteSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes an SSH signing key from the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:ssh_signing_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersDeleteSshSigningKeyForAuthenticatedUserWithResponse(sshSigningKeyId: Int, options: CallOptions = CallOptions()): SdkResponseResult<UsersDeleteSshSigningKeyForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersDeleteSshSigningKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersDeleteSshSigningKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ssh_signing_key_id", values = listOf(sshSigningKeyId.toString())))
  }), UsersCodecs.usersDeleteSshSigningKeyForAuthenticatedUserRequestCodecRegistry, UsersDeleteSshSigningKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see
   * "[HTTP verbs](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `user:follow` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersFollowApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UsersFollowError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersFollow(username: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersFollowResponse, Unit>(
    request = SdkExecutionRequest(usersFollowMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersFollowRequestCodecRegistry,
    responseDecoder = UsersFollowResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersFollowResponse.SuccessNoContent -> response.unit
        is UsersFollowResponse.Http304NoContent -> response.unit
        is UsersFollowResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersFollowResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersFollowResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersFollowResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersFollowResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersFollowResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersFollowResponse.Http304NoContent -> UsersFollowApiException(response, statusCode, headers)
        is UsersFollowResponse.Http401Json -> UsersFollowApiException(response, statusCode, headers)
        is UsersFollowResponse.Http403Json -> UsersFollowApiException(response, statusCode, headers)
        is UsersFollowResponse.Http404Json -> UsersFollowApiException(response, statusCode, headers)
        is UsersFollowResponse.Http422Json -> UsersFollowApiException(response, statusCode, headers)
        is UsersFollowResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see
   * "[HTTP verbs](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `user:follow` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersFollowWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<UsersFollowResponse> = executor.executeWithResponse<Unit, UsersFollowResponse>(SdkExecutionRequest(usersFollowMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersFollowRequestCodecRegistry, UsersFollowResponseDecoder, options)

  /**
   * OAuth app tokens and personal access tokens (classic) need the `user` scope in order for the response to include
   * private profile information.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersGetAuthenticatedApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded UsersGetAuthenticatedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersGetAuthenticated(options: CallOptions = CallOptions()): InlineUserGetResponse200JsonX3a7d2450 = executor.executeWithTypedErrors<Unit, UsersGetAuthenticatedResponse, InlineUserGetResponse200JsonX3a7d2450>(
    request = SdkExecutionRequest(usersGetAuthenticatedMetadata, baseUri, Unit, emptyList(), emptyList()),
    requestCodecs = UsersCodecs.usersGetAuthenticatedRequestCodecRegistry,
    responseDecoder = UsersGetAuthenticatedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersGetAuthenticatedResponse.SuccessJson -> response.json
        is UsersGetAuthenticatedResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetAuthenticatedResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetAuthenticatedResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetAuthenticatedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersGetAuthenticatedResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersGetAuthenticatedResponse.Http304NoContent -> UsersGetAuthenticatedApiException(response, statusCode, headers)
        is UsersGetAuthenticatedResponse.Http401Json -> UsersGetAuthenticatedApiException(response, statusCode, headers)
        is UsersGetAuthenticatedResponse.Http403Json -> UsersGetAuthenticatedApiException(response, statusCode, headers)
        is UsersGetAuthenticatedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth app tokens and personal access tokens (classic) need the `user` scope in order for the response to include
   * private profile information.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersGetAuthenticatedWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<UsersGetAuthenticatedResponse> = executor.executeWithResponse<Unit, UsersGetAuthenticatedResponse>(SdkExecutionRequest(usersGetAuthenticatedMetadata, baseUri, Unit, emptyList(), emptyList()), UsersCodecs.usersGetAuthenticatedRequestCodecRegistry, UsersGetAuthenticatedResponseDecoder, options)

  /**
   * Provides publicly available information about someone with a GitHub account. This method takes their durable user
   * `ID` instead of their `login`, which can change over time.
   *
   * If you are requesting information about an [Enterprise Managed
   * User](https://docs.github.com/enterprise-cloud@latest/admin/managing-iam/understanding-iam-for-enterprises/about-en
   * terprise-managed-users), or a GitHub App bot that is installed in an organization that uses Enterprise Managed
   * Users, your requests must be authenticated as a user or GitHub App that has access to the organization to view that
   * account's information. If you are not authorized, the request will return a `404 Not Found` status.
   *
   * The `email` key in the following response is the publicly visible email address from your GitHub [profile
   * page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to
   * be public which provides an email entry for this endpoint. If you do not set a public email address for `email`,
   * then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub.
   * For more information, see
   * [Authentication](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#authentication).
   *
   * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly.
   * For more information, see [Emails API](https://docs.github.com/rest/users/emails).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersGetByIdApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UsersGetByIdError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersGetById(accountId: Int, options: CallOptions = CallOptions()): InlineUserGetResponse200JsonX7ddb2065 = executor.executeWithTypedErrors<Unit, UsersGetByIdResponse, InlineUserGetResponse200JsonX7ddb2065>(
    request = SdkExecutionRequest(usersGetByIdMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account_id", values = listOf(accountId.toString())))
    }),
    requestCodecs = UsersCodecs.usersGetByIdRequestCodecRegistry,
    responseDecoder = UsersGetByIdResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersGetByIdResponse.SuccessJson -> response.json
        is UsersGetByIdResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetByIdResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersGetByIdResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersGetByIdResponse.Http404Json -> UsersGetByIdApiException(response, statusCode, headers)
        is UsersGetByIdResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Provides publicly available information about someone with a GitHub account. This method takes their durable user
   * `ID` instead of their `login`, which can change over time.
   *
   * If you are requesting information about an [Enterprise Managed
   * User](https://docs.github.com/enterprise-cloud@latest/admin/managing-iam/understanding-iam-for-enterprises/about-en
   * terprise-managed-users), or a GitHub App bot that is installed in an organization that uses Enterprise Managed
   * Users, your requests must be authenticated as a user or GitHub App that has access to the organization to view that
   * account's information. If you are not authorized, the request will return a `404 Not Found` status.
   *
   * The `email` key in the following response is the publicly visible email address from your GitHub [profile
   * page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to
   * be public which provides an email entry for this endpoint. If you do not set a public email address for `email`,
   * then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub.
   * For more information, see
   * [Authentication](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#authentication).
   *
   * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly.
   * For more information, see [Emails API](https://docs.github.com/rest/users/emails).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersGetByIdWithResponse(accountId: Int, options: CallOptions = CallOptions()): SdkResponseResult<UsersGetByIdResponse> = executor.executeWithResponse<Unit, UsersGetByIdResponse>(SdkExecutionRequest(usersGetByIdMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account_id", values = listOf(accountId.toString())))
  }), UsersCodecs.usersGetByIdRequestCodecRegistry, UsersGetByIdResponseDecoder, options)

  /**
   * Provides publicly available information about someone with a GitHub account.
   *
   * If you are requesting information about an [Enterprise Managed
   * User](https://docs.github.com/enterprise-cloud@latest/admin/managing-iam/understanding-iam-for-enterprises/about-en
   * terprise-managed-users), or a GitHub App bot that is installed in an organization that uses Enterprise Managed
   * Users, your requests must be authenticated as a user or GitHub App that has access to the organization to view that
   * account's information. If you are not authorized, the request will return a `404 Not Found` status.
   *
   * The `email` key in the following response is the publicly visible email address from your GitHub [profile
   * page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to
   * be public which provides an email entry for this endpoint. If you do not set a public email address for `email`,
   * then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub.
   * For more information, see
   * [Authentication](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#authentication).
   *
   * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly.
   * For more information, see [Emails API](https://docs.github.com/rest/users/emails).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersGetByUsernameApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded UsersGetByUsernameError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersGetByUsername(username: String, options: CallOptions = CallOptions()): InlineUsersGetResponse200JsonX661510a1 = executor.executeWithTypedErrors<Unit, UsersGetByUsernameResponse, InlineUsersGetResponse200JsonX661510a1>(
    request = SdkExecutionRequest(usersGetByUsernameMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersGetByUsernameRequestCodecRegistry,
    responseDecoder = UsersGetByUsernameResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersGetByUsernameResponse.SuccessJson -> response.json
        is UsersGetByUsernameResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetByUsernameResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersGetByUsernameResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersGetByUsernameResponse.Http404Json -> UsersGetByUsernameApiException(response, statusCode, headers)
        is UsersGetByUsernameResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Provides publicly available information about someone with a GitHub account.
   *
   * If you are requesting information about an [Enterprise Managed
   * User](https://docs.github.com/enterprise-cloud@latest/admin/managing-iam/understanding-iam-for-enterprises/about-en
   * terprise-managed-users), or a GitHub App bot that is installed in an organization that uses Enterprise Managed
   * Users, your requests must be authenticated as a user or GitHub App that has access to the organization to view that
   * account's information. If you are not authorized, the request will return a `404 Not Found` status.
   *
   * The `email` key in the following response is the publicly visible email address from your GitHub [profile
   * page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to
   * be public which provides an email entry for this endpoint. If you do not set a public email address for `email`,
   * then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub.
   * For more information, see
   * [Authentication](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#authentication).
   *
   * The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly.
   * For more information, see [Emails API](https://docs.github.com/rest/users/emails).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersGetByUsernameWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<UsersGetByUsernameResponse> = executor.executeWithResponse<Unit, UsersGetByUsernameResponse>(SdkExecutionRequest(usersGetByUsernameMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersGetByUsernameRequestCodecRegistry, UsersGetByUsernameResponseDecoder, options)

  /**
   * Provides hovercard information. You can find out more about someone in relation to their pull requests, issues,
   * repositories, and organizations.
   *
   * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more
   * information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the
   * `Spoon-Knife` repository, you would use a `subject_type` value of `repository` and a `subject_id` value of
   * `1300192` (the ID of the `Spoon-Knife` repository).
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersGetContextForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded UsersGetContextForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersGetContextForUser(
    username: String,
    subjectId: String? = null,
    subjectType: InlineUsersHovercardGetParameterXd4d36891? = null,
    options: CallOptions = CallOptions(),
  ): Hovercard = executor.executeWithTypedErrors<Unit, UsersGetContextForUserResponse, Hovercard>(
    request = SdkExecutionRequest(usersGetContextForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subject_id", values = subjectId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subject_type", values = subjectType?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersGetContextForUserRequestCodecRegistry,
    responseDecoder = UsersGetContextForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersGetContextForUserResponse.SuccessJson -> response.json
        is UsersGetContextForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetContextForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetContextForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersGetContextForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersGetContextForUserResponse.Http404Json -> UsersGetContextForUserApiException(response, statusCode, headers)
        is UsersGetContextForUserResponse.Http422Json -> UsersGetContextForUserApiException(response, statusCode, headers)
        is UsersGetContextForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Provides hovercard information. You can find out more about someone in relation to their pull requests, issues,
   * repositories, and organizations.
   *
   * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more
   * information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the
   * `Spoon-Knife` repository, you would use a `subject_type` value of `repository` and a `subject_id` value of
   * `1300192` (the ID of the `Spoon-Knife` repository).
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersGetContextForUserWithResponse(
    username: String,
    subjectId: String? = null,
    subjectType: InlineUsersHovercardGetParameterXd4d36891? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersGetContextForUserResponse> = executor.executeWithResponse<Unit, UsersGetContextForUserResponse>(SdkExecutionRequest(usersGetContextForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subject_id", values = subjectId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subject_type", values = subjectType?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersGetContextForUserRequestCodecRegistry, UsersGetContextForUserResponseDecoder, options)

  /**
   * View extended details for a single GPG key.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:gpg_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersGetGpgKeyForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded UsersGetGpgKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersGetGpgKeyForAuthenticatedUser(gpgKeyId: Int, options: CallOptions = CallOptions()): GpgKey = executor.executeWithTypedErrors<Unit, UsersGetGpgKeyForAuthenticatedUserResponse, GpgKey>(
    request = SdkExecutionRequest(usersGetGpgKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gpg_key_id", values = listOf(gpgKeyId.toString())))
    }),
    requestCodecs = UsersCodecs.usersGetGpgKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersGetGpgKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersGetGpgKeyForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersGetGpgKeyForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetGpgKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetGpgKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetGpgKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetGpgKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersGetGpgKeyForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersGetGpgKeyForAuthenticatedUserResponse.Http304NoContent -> UsersGetGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetGpgKeyForAuthenticatedUserResponse.Http401Json -> UsersGetGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetGpgKeyForAuthenticatedUserResponse.Http403Json -> UsersGetGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetGpgKeyForAuthenticatedUserResponse.Http404Json -> UsersGetGpgKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetGpgKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * View extended details for a single GPG key.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:gpg_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersGetGpgKeyForAuthenticatedUserWithResponse(gpgKeyId: Int, options: CallOptions = CallOptions()): SdkResponseResult<UsersGetGpgKeyForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersGetGpgKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersGetGpgKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "gpg_key_id", values = listOf(gpgKeyId.toString())))
  }), UsersCodecs.usersGetGpgKeyForAuthenticatedUserRequestCodecRegistry, UsersGetGpgKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * View extended details for a single public SSH key.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:public_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersGetPublicSshKeyForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersGetPublicSshKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersGetPublicSshKeyForAuthenticatedUser(keyId: Int, options: CallOptions = CallOptions()): Key = executor.executeWithTypedErrors<Unit, UsersGetPublicSshKeyForAuthenticatedUserResponse, Key>(
    request = SdkExecutionRequest(usersGetPublicSshKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "key_id", values = listOf(keyId.toString())))
    }),
    requestCodecs = UsersCodecs.usersGetPublicSshKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersGetPublicSshKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Http304NoContent -> UsersGetPublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Http401Json -> UsersGetPublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Http403Json -> UsersGetPublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Http404Json -> UsersGetPublicSshKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetPublicSshKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * View extended details for a single public SSH key.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:public_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersGetPublicSshKeyForAuthenticatedUserWithResponse(keyId: Int, options: CallOptions = CallOptions()): SdkResponseResult<UsersGetPublicSshKeyForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersGetPublicSshKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersGetPublicSshKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "key_id", values = listOf(keyId.toString())))
  }), UsersCodecs.usersGetPublicSshKeyForAuthenticatedUserRequestCodecRegistry, UsersGetPublicSshKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Gets extended details for an SSH signing key.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:ssh_signing_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersGetSshSigningKeyForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersGetSshSigningKeyForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersGetSshSigningKeyForAuthenticatedUser(sshSigningKeyId: Int, options: CallOptions = CallOptions()): SshSigningKey = executor.executeWithTypedErrors<Unit, UsersGetSshSigningKeyForAuthenticatedUserResponse, SshSigningKey>(
    request = SdkExecutionRequest(usersGetSshSigningKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ssh_signing_key_id", values = listOf(sshSigningKeyId.toString())))
    }),
    requestCodecs = UsersCodecs.usersGetSshSigningKeyForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersGetSshSigningKeyForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Http304NoContent -> UsersGetSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Http401Json -> UsersGetSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Http403Json -> UsersGetSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Http404Json -> UsersGetSshSigningKeyForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersGetSshSigningKeyForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets extended details for an SSH signing key.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:ssh_signing_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersGetSshSigningKeyForAuthenticatedUserWithResponse(sshSigningKeyId: Int, options: CallOptions = CallOptions()): SdkResponseResult<UsersGetSshSigningKeyForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersGetSshSigningKeyForAuthenticatedUserResponse>(SdkExecutionRequest(usersGetSshSigningKeyForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "ssh_signing_key_id", values = listOf(sshSigningKeyId.toString())))
  }), UsersCodecs.usersGetSshSigningKeyForAuthenticatedUserRequestCodecRegistry, UsersGetSshSigningKeyForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and
   * organization accounts.
   *
   * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for
   * the next page of users.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UsersListError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersList(
    perPage: Int? = null,
    since: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.executeWithTypedErrors<Unit, UsersListResponse, List<SimpleUser>>(
    request = SdkExecutionRequest(usersListMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListRequestCodecRegistry,
    responseDecoder = UsersListResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListResponse.SuccessJson -> response.json
        is UsersListResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListResponse.Http304NoContent -> UsersListApiException(response, statusCode, headers)
        is UsersListResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and
   * organization accounts.
   *
   * Note: Pagination is powered exclusively by the `since` parameter. Use the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers) to get the URL for
   * the next page of users.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListWithResponse(
    perPage: Int? = null,
    since: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListResponse> = executor.executeWithResponse<Unit, UsersListResponse>(SdkExecutionRequest(usersListMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListRequestCodecRegistry, UsersListResponseDecoder, options)

  /**
   * List a collection of artifact attestations with a given subject digest that are associated with repositories owned
   * by a user.
   *
   * The collection of attestations returned by this endpoint is filtered according to the authenticated user's
   * permissions; if the authenticated user cannot read a repository, the attestations associated with that repository
   * will not be included in the response. In addition, when using a fine-grained access token the `attestations:read`
   * permission is required.
   *
   * **Please note:** in order to offer meaningful security benefits, an attestation's signature and timestamps **must**
   * be cryptographically verified, and the identity of the attestation signer **must** be validated. Attestations can
   * be verified using the [GitHub CLI `attestation verify`
   * command](https://cli.github.com/manual/gh_attestation_verify). For more information, see [our guide on how to use
   * artifact attestations to establish a build's
   * provenance](https://docs.github.com/actions/security-guides/using-artifact-attestations-to-establish-provenance-for
   * -builds).
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListAttestationsWithResponse(
    subjectDigest: String,
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    predicateType: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListAttestationsResponse> = executor.executeWithResponse<Unit, UsersListAttestationsResponse>(SdkExecutionRequest(usersListAttestationsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subject_digest", values = listOf(subjectDigest.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "predicate_type", values = predicateType?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListAttestationsRequestCodecRegistry, UsersListAttestationsResponseDecoder, options)

  /**
   * List a collection of artifact attestations associated with any entry in a list of subject digests owned by a user.
   *
   * The collection of attestations returned by this endpoint is filtered according to the authenticated user's
   * permissions; if the authenticated user cannot read a repository, the attestations associated with that repository
   * will not be included in the response. In addition, when using a fine-grained access token the `attestations:read`
   * permission is required.
   *
   * **Please note:** in order to offer meaningful security benefits, an attestation's signature and timestamps **must**
   * be cryptographically verified, and the identity of the attestation signer **must** be validated. Attestations can
   * be verified using the [GitHub CLI `attestation verify`
   * command](https://cli.github.com/manual/gh_attestation_verify). For more information, see [our guide on how to use
   * artifact attestations to establish a build's
   * provenance](https://docs.github.com/actions/security-guides/using-artifact-attestations-to-establish-provenance-for
   * -builds).
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListAttestationsBulk(
    request: InlineUsersAttestationsBulkListPostRequestJsonXd1686097,
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67 = executor.execute<InlineUsersAttestationsBulkListPostRequestJsonXd1686097, InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67>(SdkExecutionRequest(usersListAttestationsBulkMetadata, baseUri, request, listOf(UsersCodecs.USERSLISTATTESTATIONSBULK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(UsersCodecs.USERSLISTATTESTATIONSBULK_RESPONSE_CODEC_ID), UsersCodecs.usersListAttestationsBulkRequestCodecRegistry, UsersCodecs.usersListAttestationsBulkResponseCodecRegistry, options)

  /**
   * List a collection of artifact attestations associated with any entry in a list of subject digests owned by a user.
   *
   * The collection of attestations returned by this endpoint is filtered according to the authenticated user's
   * permissions; if the authenticated user cannot read a repository, the attestations associated with that repository
   * will not be included in the response. In addition, when using a fine-grained access token the `attestations:read`
   * permission is required.
   *
   * **Please note:** in order to offer meaningful security benefits, an attestation's signature and timestamps **must**
   * be cryptographically verified, and the identity of the attestation signer **must** be validated. Attestations can
   * be verified using the [GitHub CLI `attestation verify`
   * command](https://cli.github.com/manual/gh_attestation_verify). For more information, see [our guide on how to use
   * artifact attestations to establish a build's
   * provenance](https://docs.github.com/actions/security-guides/using-artifact-attestations-to-establish-provenance-for
   * -builds).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListAttestationsBulkWithResponse(
    request: InlineUsersAttestationsBulkListPostRequestJsonXd1686097,
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListAttestationsBulkResponse> = executor.executeWithResponse<InlineUsersAttestationsBulkListPostRequestJsonXd1686097, UsersListAttestationsBulkResponse>(SdkExecutionRequest(usersListAttestationsBulkMetadata, baseUri, request, listOf(UsersCodecs.USERSLISTATTESTATIONSBULK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListAttestationsBulkRequestCodecRegistry, UsersListAttestationsBulkResponseDecoder, options)

  /**
   * List the users you've blocked on your personal account.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListBlockedByAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded UsersListBlockedByAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListBlockedByAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.executeWithTypedErrors<Unit, UsersListBlockedByAuthenticatedUserResponse, List<SimpleUser>>(
    request = SdkExecutionRequest(usersListBlockedByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListBlockedByAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListBlockedByAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListBlockedByAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListBlockedByAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListBlockedByAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListBlockedByAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListBlockedByAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListBlockedByAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListBlockedByAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListBlockedByAuthenticatedUserResponse.Http304NoContent -> UsersListBlockedByAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListBlockedByAuthenticatedUserResponse.Http401Json -> UsersListBlockedByAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListBlockedByAuthenticatedUserResponse.Http403Json -> UsersListBlockedByAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListBlockedByAuthenticatedUserResponse.Http404Json -> UsersListBlockedByAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListBlockedByAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the users you've blocked on your personal account.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListBlockedByAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListBlockedByAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListBlockedByAuthenticatedUserResponse>(SdkExecutionRequest(usersListBlockedByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListBlockedByAuthenticatedUserRequestCodecRegistry, UsersListBlockedByAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all of your email addresses, and specifies which one is visible
   * to the public.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user:email` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListEmailsForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded UsersListEmailsForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListEmailsForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Email> = executor.executeWithTypedErrors<Unit, UsersListEmailsForAuthenticatedUserResponse, List<Email>>(
    request = SdkExecutionRequest(usersListEmailsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListEmailsForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListEmailsForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListEmailsForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListEmailsForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListEmailsForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListEmailsForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListEmailsForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListEmailsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListEmailsForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListEmailsForAuthenticatedUserResponse.Http304NoContent -> UsersListEmailsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListEmailsForAuthenticatedUserResponse.Http401Json -> UsersListEmailsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListEmailsForAuthenticatedUserResponse.Http403Json -> UsersListEmailsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListEmailsForAuthenticatedUserResponse.Http404Json -> UsersListEmailsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListEmailsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all of your email addresses, and specifies which one is visible
   * to the public.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user:email` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListEmailsForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListEmailsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListEmailsForAuthenticatedUserResponse>(SdkExecutionRequest(usersListEmailsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListEmailsForAuthenticatedUserRequestCodecRegistry, UsersListEmailsForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the people who the authenticated user follows.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListFollowedByAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded UsersListFollowedByAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListFollowedByAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.executeWithTypedErrors<Unit, UsersListFollowedByAuthenticatedUserResponse, List<SimpleUser>>(
    request = SdkExecutionRequest(usersListFollowedByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListFollowedByAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListFollowedByAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListFollowedByAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListFollowedByAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListFollowedByAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListFollowedByAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListFollowedByAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListFollowedByAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListFollowedByAuthenticatedUserResponse.Http304NoContent -> UsersListFollowedByAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListFollowedByAuthenticatedUserResponse.Http401Json -> UsersListFollowedByAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListFollowedByAuthenticatedUserResponse.Http403Json -> UsersListFollowedByAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListFollowedByAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the people who the authenticated user follows.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListFollowedByAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListFollowedByAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListFollowedByAuthenticatedUserResponse>(SdkExecutionRequest(usersListFollowedByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListFollowedByAuthenticatedUserRequestCodecRegistry, UsersListFollowedByAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the people following the authenticated user.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListFollowersForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersListFollowersForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListFollowersForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.executeWithTypedErrors<Unit, UsersListFollowersForAuthenticatedUserResponse, List<SimpleUser>>(
    request = SdkExecutionRequest(usersListFollowersForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListFollowersForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListFollowersForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListFollowersForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListFollowersForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListFollowersForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListFollowersForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListFollowersForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListFollowersForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListFollowersForAuthenticatedUserResponse.Http304NoContent -> UsersListFollowersForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListFollowersForAuthenticatedUserResponse.Http401Json -> UsersListFollowersForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListFollowersForAuthenticatedUserResponse.Http403Json -> UsersListFollowersForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListFollowersForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the people following the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListFollowersForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListFollowersForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListFollowersForAuthenticatedUserResponse>(SdkExecutionRequest(usersListFollowersForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListFollowersForAuthenticatedUserRequestCodecRegistry, UsersListFollowersForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the people following the specified user.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListFollowersForUser(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.execute<Unit, List<SimpleUser>>(SdkExecutionRequest(usersListFollowersForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(UsersCodecs.USERSLISTFOLLOWERSFORUSER_RESPONSE_CODEC_ID), UsersCodecs.usersListFollowersForUserRequestCodecRegistry, UsersCodecs.usersListFollowersForUserResponseCodecRegistry, options)

  /**
   * Lists the people following the specified user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListFollowersForUserWithResponse(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListFollowersForUserResponse> = executor.executeWithResponse<Unit, UsersListFollowersForUserResponse>(SdkExecutionRequest(usersListFollowersForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListFollowersForUserRequestCodecRegistry, UsersListFollowersForUserResponseDecoder, options)

  /**
   * Lists the people who the specified user follows.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListFollowingForUser(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.execute<Unit, List<SimpleUser>>(SdkExecutionRequest(usersListFollowingForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(UsersCodecs.USERSLISTFOLLOWINGFORUSER_RESPONSE_CODEC_ID), UsersCodecs.usersListFollowingForUserRequestCodecRegistry, UsersCodecs.usersListFollowingForUserResponseCodecRegistry, options)

  /**
   * Lists the people who the specified user follows.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListFollowingForUserWithResponse(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListFollowingForUserResponse> = executor.executeWithResponse<Unit, UsersListFollowingForUserResponse>(SdkExecutionRequest(usersListFollowingForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListFollowingForUserRequestCodecRegistry, UsersListFollowingForUserResponseDecoder, options)

  /**
   * Lists the current user's GPG keys.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:gpg_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListGpgKeysForAuthenticatedUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded UsersListGpgKeysForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListGpgKeysForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<GpgKey> = executor.executeWithTypedErrors<Unit, UsersListGpgKeysForAuthenticatedUserResponse, List<GpgKey>>(
    request = SdkExecutionRequest(usersListGpgKeysForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListGpgKeysForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListGpgKeysForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListGpgKeysForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListGpgKeysForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListGpgKeysForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListGpgKeysForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListGpgKeysForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListGpgKeysForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListGpgKeysForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListGpgKeysForAuthenticatedUserResponse.Http304NoContent -> UsersListGpgKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListGpgKeysForAuthenticatedUserResponse.Http401Json -> UsersListGpgKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListGpgKeysForAuthenticatedUserResponse.Http403Json -> UsersListGpgKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListGpgKeysForAuthenticatedUserResponse.Http404Json -> UsersListGpgKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListGpgKeysForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the current user's GPG keys.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:gpg_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListGpgKeysForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListGpgKeysForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListGpgKeysForAuthenticatedUserResponse>(SdkExecutionRequest(usersListGpgKeysForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListGpgKeysForAuthenticatedUserRequestCodecRegistry, UsersListGpgKeysForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the GPG keys for a user. This information is accessible by anyone.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListGpgKeysForUser(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<GpgKey> = executor.execute<Unit, List<GpgKey>>(SdkExecutionRequest(usersListGpgKeysForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(UsersCodecs.USERSLISTGPGKEYSFORUSER_RESPONSE_CODEC_ID), UsersCodecs.usersListGpgKeysForUserRequestCodecRegistry, UsersCodecs.usersListGpgKeysForUserResponseCodecRegistry, options)

  /**
   * Lists the GPG keys for a user. This information is accessible by anyone.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListGpgKeysForUserWithResponse(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListGpgKeysForUserResponse> = executor.executeWithResponse<Unit, UsersListGpgKeysForUserResponse>(SdkExecutionRequest(usersListGpgKeysForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListGpgKeysForUserRequestCodecRegistry, UsersListGpgKeysForUserResponseDecoder, options)

  /**
   * Lists your publicly visible email address, which you can set with the
   * [Set primary email visibility for the authenticated
   * user](https://docs.github.com/rest/users/emails#set-primary-email-visibility-for-the-authenticated-user)
   * endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user:email` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListPublicEmailsForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersListPublicEmailsForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListPublicEmailsForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Email> = executor.executeWithTypedErrors<Unit, UsersListPublicEmailsForAuthenticatedUserResponse, List<Email>>(
    request = SdkExecutionRequest(usersListPublicEmailsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListPublicEmailsForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListPublicEmailsForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListPublicEmailsForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListPublicEmailsForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListPublicEmailsForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListPublicEmailsForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListPublicEmailsForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListPublicEmailsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListPublicEmailsForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListPublicEmailsForAuthenticatedUserResponse.Http304NoContent -> UsersListPublicEmailsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListPublicEmailsForAuthenticatedUserResponse.Http401Json -> UsersListPublicEmailsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListPublicEmailsForAuthenticatedUserResponse.Http403Json -> UsersListPublicEmailsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListPublicEmailsForAuthenticatedUserResponse.Http404Json -> UsersListPublicEmailsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListPublicEmailsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists your publicly visible email address, which you can set with the
   * [Set primary email visibility for the authenticated
   * user](https://docs.github.com/rest/users/emails#set-primary-email-visibility-for-the-authenticated-user)
   * endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user:email` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListPublicEmailsForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListPublicEmailsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListPublicEmailsForAuthenticatedUserResponse>(SdkExecutionRequest(usersListPublicEmailsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListPublicEmailsForAuthenticatedUserRequestCodecRegistry, UsersListPublicEmailsForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListPublicKeysForUser(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<KeySimple> = executor.execute<Unit, List<KeySimple>>(SdkExecutionRequest(usersListPublicKeysForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(UsersCodecs.USERSLISTPUBLICKEYSFORUSER_RESPONSE_CODEC_ID), UsersCodecs.usersListPublicKeysForUserRequestCodecRegistry, UsersCodecs.usersListPublicKeysForUserResponseCodecRegistry, options)

  /**
   * Lists the _verified_ public SSH keys for a user. This is accessible by anyone.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListPublicKeysForUserWithResponse(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListPublicKeysForUserResponse> = executor.executeWithResponse<Unit, UsersListPublicKeysForUserResponse>(SdkExecutionRequest(usersListPublicKeysForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListPublicKeysForUserRequestCodecRegistry, UsersListPublicKeysForUserResponseDecoder, options)

  /**
   * Lists the public SSH keys for the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:public_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListPublicSshKeysForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersListPublicSshKeysForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListPublicSshKeysForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Key> = executor.executeWithTypedErrors<Unit, UsersListPublicSshKeysForAuthenticatedUserResponse, List<Key>>(
    request = SdkExecutionRequest(usersListPublicSshKeysForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListPublicSshKeysForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListPublicSshKeysForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListPublicSshKeysForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListPublicSshKeysForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Http304NoContent -> UsersListPublicSshKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Http401Json -> UsersListPublicSshKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Http403Json -> UsersListPublicSshKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Http404Json -> UsersListPublicSshKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListPublicSshKeysForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the public SSH keys for the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:public_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListPublicSshKeysForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListPublicSshKeysForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListPublicSshKeysForAuthenticatedUserResponse>(SdkExecutionRequest(usersListPublicSshKeysForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListPublicSshKeysForAuthenticatedUserRequestCodecRegistry, UsersListPublicSshKeysForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all of your social accounts.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListSocialAccountsForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersListSocialAccountsForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListSocialAccountsForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SocialAccount> = executor.executeWithTypedErrors<Unit, UsersListSocialAccountsForAuthenticatedUserResponse, List<SocialAccount>>(
    request = SdkExecutionRequest(usersListSocialAccountsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListSocialAccountsForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListSocialAccountsForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListSocialAccountsForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListSocialAccountsForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListSocialAccountsForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListSocialAccountsForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListSocialAccountsForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListSocialAccountsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListSocialAccountsForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListSocialAccountsForAuthenticatedUserResponse.Http304NoContent -> UsersListSocialAccountsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListSocialAccountsForAuthenticatedUserResponse.Http401Json -> UsersListSocialAccountsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListSocialAccountsForAuthenticatedUserResponse.Http403Json -> UsersListSocialAccountsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListSocialAccountsForAuthenticatedUserResponse.Http404Json -> UsersListSocialAccountsForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListSocialAccountsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all of your social accounts.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListSocialAccountsForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListSocialAccountsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListSocialAccountsForAuthenticatedUserResponse>(SdkExecutionRequest(usersListSocialAccountsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListSocialAccountsForAuthenticatedUserRequestCodecRegistry, UsersListSocialAccountsForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists social media accounts for a user. This endpoint is accessible by anyone.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListSocialAccountsForUser(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SocialAccount> = executor.execute<Unit, List<SocialAccount>>(SdkExecutionRequest(usersListSocialAccountsForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(UsersCodecs.USERSLISTSOCIALACCOUNTSFORUSER_RESPONSE_CODEC_ID), UsersCodecs.usersListSocialAccountsForUserRequestCodecRegistry, UsersCodecs.usersListSocialAccountsForUserResponseCodecRegistry, options)

  /**
   * Lists social media accounts for a user. This endpoint is accessible by anyone.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListSocialAccountsForUserWithResponse(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListSocialAccountsForUserResponse> = executor.executeWithResponse<Unit, UsersListSocialAccountsForUserResponse>(SdkExecutionRequest(usersListSocialAccountsForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListSocialAccountsForUserRequestCodecRegistry, UsersListSocialAccountsForUserResponseDecoder, options)

  /**
   * Lists the SSH signing keys for the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:ssh_signing_key` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersListSshSigningKeysForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded UsersListSshSigningKeysForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListSshSigningKeysForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SshSigningKey> = executor.executeWithTypedErrors<Unit, UsersListSshSigningKeysForAuthenticatedUserResponse, List<SshSigningKey>>(
    request = SdkExecutionRequest(usersListSshSigningKeysForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = UsersCodecs.usersListSshSigningKeysForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersListSshSigningKeysForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersListSshSigningKeysForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersListSshSigningKeysForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Http304NoContent -> UsersListSshSigningKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Http401Json -> UsersListSshSigningKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Http403Json -> UsersListSshSigningKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Http404Json -> UsersListSshSigningKeysForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersListSshSigningKeysForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the SSH signing keys for the authenticated user's GitHub account.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:ssh_signing_key` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListSshSigningKeysForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListSshSigningKeysForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, UsersListSshSigningKeysForAuthenticatedUserResponse>(SdkExecutionRequest(usersListSshSigningKeysForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListSshSigningKeysForAuthenticatedUserRequestCodecRegistry, UsersListSshSigningKeysForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists the SSH signing keys for a user. This operation is accessible by anyone.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersListSshSigningKeysForUser(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SshSigningKey> = executor.execute<Unit, List<SshSigningKey>>(SdkExecutionRequest(usersListSshSigningKeysForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(UsersCodecs.USERSLISTSSHSIGNINGKEYSFORUSER_RESPONSE_CODEC_ID), UsersCodecs.usersListSshSigningKeysForUserRequestCodecRegistry, UsersCodecs.usersListSshSigningKeysForUserResponseCodecRegistry, options)

  /**
   * Lists the SSH signing keys for a user. This operation is accessible by anyone.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersListSshSigningKeysForUserWithResponse(
    username: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UsersListSshSigningKeysForUserResponse> = executor.executeWithResponse<Unit, UsersListSshSigningKeysForUserResponse>(SdkExecutionRequest(usersListSshSigningKeysForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), UsersCodecs.usersListSshSigningKeysForUserRequestCodecRegistry, UsersListSshSigningKeysForUserResponseDecoder, options)

  /**
   * Sets the visibility for your primary email addresses.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersSetPrimaryEmailVisibilityForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * UsersSetPrimaryEmailVisibilityForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersSetPrimaryEmailVisibilityForAuthenticatedUser(request: InlineUserEmailVisibilityPatchRequestJsonX3514b5c9, options: CallOptions = CallOptions()): List<Email> = executor.executeWithTypedErrors<InlineUserEmailVisibilityPatchRequestJsonX3514b5c9, UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse, List<Email>>(
    request = SdkExecutionRequest(usersSetPrimaryEmailVisibilityForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSSETPRIMARYEMAILVISIBILITYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersSetPrimaryEmailVisibilityForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.SuccessJson -> response.json
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http304NoContent -> UsersSetPrimaryEmailVisibilityForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http401Json -> UsersSetPrimaryEmailVisibilityForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http403Json -> UsersSetPrimaryEmailVisibilityForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http404Json -> UsersSetPrimaryEmailVisibilityForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http422Json -> UsersSetPrimaryEmailVisibilityForAuthenticatedUserApiException(response, statusCode, headers)
        is UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sets the visibility for your primary email addresses.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersSetPrimaryEmailVisibilityForAuthenticatedUserWithResponse(request: InlineUserEmailVisibilityPatchRequestJsonX3514b5c9, options: CallOptions = CallOptions()): SdkResponseResult<UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse> = executor.executeWithResponse<InlineUserEmailVisibilityPatchRequestJsonX3514b5c9, UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse>(SdkExecutionRequest(usersSetPrimaryEmailVisibilityForAuthenticatedUserMetadata, baseUri, request, listOf(UsersCodecs.USERSSETPRIMARYEMAILVISIBILITYFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersSetPrimaryEmailVisibilityForAuthenticatedUserRequestCodecRegistry, UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponseDecoder, options)

  /**
   * Unblocks the given user and returns a 204.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersUnblockApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UsersUnblockError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersUnblock(username: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersUnblockResponse, Unit>(
    request = SdkExecutionRequest(usersUnblockMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersUnblockRequestCodecRegistry,
    responseDecoder = UsersUnblockResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersUnblockResponse.SuccessNoContent -> response.unit
        is UsersUnblockResponse.Http304NoContent -> response.unit
        is UsersUnblockResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUnblockResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUnblockResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUnblockResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersUnblockResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersUnblockResponse.Http304NoContent -> UsersUnblockApiException(response, statusCode, headers)
        is UsersUnblockResponse.Http401Json -> UsersUnblockApiException(response, statusCode, headers)
        is UsersUnblockResponse.Http403Json -> UsersUnblockApiException(response, statusCode, headers)
        is UsersUnblockResponse.Http404Json -> UsersUnblockApiException(response, statusCode, headers)
        is UsersUnblockResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Unblocks the given user and returns a 204.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersUnblockWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<UsersUnblockResponse> = executor.executeWithResponse<Unit, UsersUnblockResponse>(SdkExecutionRequest(usersUnblockMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersUnblockRequestCodecRegistry, UsersUnblockResponseDecoder, options)

  /**
   * OAuth app tokens and personal access tokens (classic) need the `user:follow` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws UsersUnfollowApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UsersUnfollowError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersUnfollow(username: String, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, UsersUnfollowResponse, Unit>(
    request = SdkExecutionRequest(usersUnfollowMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = UsersCodecs.usersUnfollowRequestCodecRegistry,
    responseDecoder = UsersUnfollowResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersUnfollowResponse.SuccessNoContent -> response.unit
        is UsersUnfollowResponse.Http304NoContent -> response.unit
        is UsersUnfollowResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUnfollowResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUnfollowResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUnfollowResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersUnfollowResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is UsersUnfollowResponse.Http304NoContent -> UsersUnfollowApiException(response, statusCode, headers)
        is UsersUnfollowResponse.Http401Json -> UsersUnfollowApiException(response, statusCode, headers)
        is UsersUnfollowResponse.Http403Json -> UsersUnfollowApiException(response, statusCode, headers)
        is UsersUnfollowResponse.Http404Json -> UsersUnfollowApiException(response, statusCode, headers)
        is UsersUnfollowResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * OAuth app tokens and personal access tokens (classic) need the `user:follow` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersUnfollowWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<UsersUnfollowResponse> = executor.executeWithResponse<Unit, UsersUnfollowResponse>(SdkExecutionRequest(usersUnfollowMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), UsersCodecs.usersUnfollowRequestCodecRegistry, UsersUnfollowResponseDecoder, options)

  /**
   * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your
   * profile, your privacy settings are still enforced: the email address will not be displayed on your public profile
   * or via the API.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UsersUpdateAuthenticatedApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded UsersUpdateAuthenticatedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun usersUpdateAuthenticated(request: InlineUserPatchRequestJsonXcc70b87c? = null, options: CallOptions = CallOptions()): PrivateUser = executor.executeWithTypedErrors<InlineUserPatchRequestJsonXcc70b87c?, UsersUpdateAuthenticatedResponse, PrivateUser>(
    request = SdkExecutionRequest(usersUpdateAuthenticatedMetadata, baseUri, request, listOf(UsersCodecs.USERSUPDATEAUTHENTICATED_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = UsersCodecs.usersUpdateAuthenticatedRequestCodecRegistry,
    responseDecoder = UsersUpdateAuthenticatedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UsersUpdateAuthenticatedResponse.SuccessJson -> response.json
        is UsersUpdateAuthenticatedResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is UsersUpdateAuthenticatedResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUpdateAuthenticatedResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUpdateAuthenticatedResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUpdateAuthenticatedResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is UsersUpdateAuthenticatedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UsersUpdateAuthenticatedResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UsersUpdateAuthenticatedResponse.Http304NoContent -> UsersUpdateAuthenticatedApiException(response, statusCode, headers)
        is UsersUpdateAuthenticatedResponse.Http401Json -> UsersUpdateAuthenticatedApiException(response, statusCode, headers)
        is UsersUpdateAuthenticatedResponse.Http403Json -> UsersUpdateAuthenticatedApiException(response, statusCode, headers)
        is UsersUpdateAuthenticatedResponse.Http404Json -> UsersUpdateAuthenticatedApiException(response, statusCode, headers)
        is UsersUpdateAuthenticatedResponse.Http422Json -> UsersUpdateAuthenticatedApiException(response, statusCode, headers)
        is UsersUpdateAuthenticatedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your
   * profile, your privacy settings are still enforced: the email address will not be displayed on your public profile
   * or via the API.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun usersUpdateAuthenticatedWithResponse(request: InlineUserPatchRequestJsonXcc70b87c? = null, options: CallOptions = CallOptions()): SdkResponseResult<UsersUpdateAuthenticatedResponse> = executor.executeWithResponse<InlineUserPatchRequestJsonXcc70b87c?, UsersUpdateAuthenticatedResponse>(SdkExecutionRequest(usersUpdateAuthenticatedMetadata, baseUri, request, listOf(UsersCodecs.USERSUPDATEAUTHENTICATED_REQUEST_CODEC_ID), emptyList()), UsersCodecs.usersUpdateAuthenticatedRequestCodecRegistry, UsersUpdateAuthenticatedResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `users/add-email-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersAddEmailForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/add-email-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersAddEmailForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Email>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddEmailForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddEmailForAuthenticatedUserResponse,
        UsersAddEmailForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddEmailForAuthenticatedUserResponse,
        UsersAddEmailForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddEmailForAuthenticatedUserResponse,
        UsersAddEmailForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddEmailForAuthenticatedUserResponse,
        UsersAddEmailForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddEmailForAuthenticatedUserResponse,
        UsersAddEmailForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddEmailForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/add-email-for-authenticated-user` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class UsersAddEmailForAuthenticatedUserApiException(
    public val error: UsersAddEmailForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/add-email-for-authenticated-user")

  private object UsersAddEmailForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersAddEmailForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersAddEmailForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersAddEmailForAuthenticatedUserResponse> = when {
      alternative.id == "users/add-email-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersAddEmailForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersAddEmailForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/add-email-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-email-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersAddEmailForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-email-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersAddEmailForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersAddEmailForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/add-email-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-email-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersAddEmailForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersAddEmailForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/add-email-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-email-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersAddEmailForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersAddEmailForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/add-email-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-email-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersAddEmailForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersAddEmailForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/add-email-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersAddEmailForAuthenticatedUserResponse = UsersAddEmailForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/add-social-account-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface UsersAddSocialAccountForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/add-social-account-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersAddSocialAccountForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<SocialAccount>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddSocialAccountForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddSocialAccountForAuthenticatedUserResponse,
        UsersAddSocialAccountForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddSocialAccountForAuthenticatedUserResponse,
        UsersAddSocialAccountForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddSocialAccountForAuthenticatedUserResponse,
        UsersAddSocialAccountForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddSocialAccountForAuthenticatedUserResponse,
        UsersAddSocialAccountForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddSocialAccountForAuthenticatedUserResponse,
        UsersAddSocialAccountForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersAddSocialAccountForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/add-social-account-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersAddSocialAccountForAuthenticatedUserApiException(
    public val error: UsersAddSocialAccountForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/add-social-account-for-authenticated-user")

  private object UsersAddSocialAccountForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersAddSocialAccountForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersAddSocialAccountForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersAddSocialAccountForAuthenticatedUserResponse> = when {
      alternative.id == "users/add-social-account-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersAddSocialAccountForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/add-social-account-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-social-account-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersAddSocialAccountForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-social-account-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersAddSocialAccountForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/add-social-account-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-social-account-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersAddSocialAccountForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/add-social-account-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-social-account-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersAddSocialAccountForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/add-social-account-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/add-social-account-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersAddSocialAccountForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersAddSocialAccountForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/add-social-account-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersAddSocialAccountForAuthenticatedUserResponse = UsersAddSocialAccountForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/block` may expose through its typed API exception.
   */
  public sealed interface UsersBlockError

  /**
   * Typed response alternatives for `users/block`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UsersBlockResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersBlockResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersBlockResponse,
        UsersBlockError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersBlockResponse,
        UsersBlockError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersBlockResponse,
        UsersBlockError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersBlockResponse,
        UsersBlockError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersBlockResponse,
        UsersBlockError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersBlockResponse
  }

  /**
   * Raised by `users/block` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class UsersBlockApiException(
    public val error: UsersBlockError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/block")

  private object UsersBlockResponseDecoder : SdkResponseAlternativeDecoder<UsersBlockResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersBlockResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersBlockResponse> = when {
      alternative.id == "users/block.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersBlockResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/block.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersBlockResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/block.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersBlockResponse.Http401Json(
          json = UsersCodecs.usersBlockResponseCodecAlternative2Registry.select(listOf("users/block.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/block.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersBlockResponse.Http403Json(
          json = UsersCodecs.usersBlockResponseCodecAlternative3Registry.select(listOf("users/block.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/block.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersBlockResponse.Http404Json(
          json = UsersCodecs.usersBlockResponseCodecAlternative4Registry.select(listOf("users/block.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/block.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersBlockResponse.Http422Json(
          json = UsersCodecs.usersBlockResponseCodecAlternative5Registry.select(listOf("users/block.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersBlockResponse = UsersBlockResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/check-blocked` may expose through its typed API exception.
   */
  public sealed interface UsersCheckBlockedError

  /**
   * Typed response alternatives for `users/check-blocked`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface UsersCheckBlockedResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckBlockedResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckBlockedResponse,
        UsersCheckBlockedError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckBlockedResponse,
        UsersCheckBlockedError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckBlockedResponse,
        UsersCheckBlockedError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckBlockedResponse,
        UsersCheckBlockedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckBlockedResponse
  }

  /**
   * Raised by `users/check-blocked` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class UsersCheckBlockedApiException(
    public val error: UsersCheckBlockedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/check-blocked")

  private object UsersCheckBlockedResponseDecoder : SdkResponseAlternativeDecoder<UsersCheckBlockedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersCheckBlockedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersCheckBlockedResponse> = when {
      alternative.id == "users/check-blocked.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersCheckBlockedResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-blocked.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersCheckBlockedResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-blocked.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersCheckBlockedResponse.Http401Json(
          json = UsersCodecs.usersCheckBlockedResponseCodecAlternative2Registry.select(listOf("users/check-blocked.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-blocked.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersCheckBlockedResponse.Http403Json(
          json = UsersCodecs.usersCheckBlockedResponseCodecAlternative3Registry.select(listOf("users/check-blocked.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-blocked.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersCheckBlockedResponse.Http404Json(
          json = UsersCodecs.usersCheckBlockedResponseCodecAlternative4Registry.select(listOf("users/check-blocked.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersCheckBlockedResponse = UsersCheckBlockedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/check-following-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface UsersCheckFollowingForUserError

  /**
   * Typed response alternatives for `users/check-following-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersCheckFollowingForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckFollowingForUserResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckFollowingForUserResponse,
        UsersCheckFollowingForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckFollowingForUserResponse
  }

  /**
   * Raised by `users/check-following-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class UsersCheckFollowingForUserApiException(
    public val error: UsersCheckFollowingForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/check-following-for-user")

  private object UsersCheckFollowingForUserResponseDecoder : SdkResponseAlternativeDecoder<UsersCheckFollowingForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersCheckFollowingForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersCheckFollowingForUserResponse> = when {
      alternative.id == "users/check-following-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersCheckFollowingForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-following-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersCheckFollowingForUserResponse.Http404NoContent(
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
    ): UsersCheckFollowingForUserResponse = UsersCheckFollowingForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/check-person-is-followed-by-authenticated` may expose through
   * its typed API exception.
   */
  public sealed interface UsersCheckPersonIsFollowedByAuthenticatedError

  /**
   * Typed response alternatives for `users/check-person-is-followed-by-authenticated`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersCheckPersonIsFollowedByAuthenticatedResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckPersonIsFollowedByAuthenticatedResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckPersonIsFollowedByAuthenticatedResponse,
        UsersCheckPersonIsFollowedByAuthenticatedError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckPersonIsFollowedByAuthenticatedResponse,
        UsersCheckPersonIsFollowedByAuthenticatedError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckPersonIsFollowedByAuthenticatedResponse,
        UsersCheckPersonIsFollowedByAuthenticatedError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckPersonIsFollowedByAuthenticatedResponse,
        UsersCheckPersonIsFollowedByAuthenticatedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCheckPersonIsFollowedByAuthenticatedResponse
  }

  /**
   * Raised by `users/check-person-is-followed-by-authenticated` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersCheckPersonIsFollowedByAuthenticatedApiException(
    public val error: UsersCheckPersonIsFollowedByAuthenticatedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/check-person-is-followed-by-authenticated")

  private object UsersCheckPersonIsFollowedByAuthenticatedResponseDecoder : SdkResponseAlternativeDecoder<UsersCheckPersonIsFollowedByAuthenticatedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersCheckPersonIsFollowedByAuthenticatedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersCheckPersonIsFollowedByAuthenticatedResponse> = when {
      alternative.id == "users/check-person-is-followed-by-authenticated.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersCheckPersonIsFollowedByAuthenticatedResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-person-is-followed-by-authenticated.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersCheckPersonIsFollowedByAuthenticatedResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-person-is-followed-by-authenticated.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersCheckPersonIsFollowedByAuthenticatedResponse.Http401Json(
          json = UsersCodecs.usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative2Registry.select(listOf("users/check-person-is-followed-by-authenticated.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-person-is-followed-by-authenticated.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersCheckPersonIsFollowedByAuthenticatedResponse.Http403Json(
          json = UsersCodecs.usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative3Registry.select(listOf("users/check-person-is-followed-by-authenticated.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/check-person-is-followed-by-authenticated.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersCheckPersonIsFollowedByAuthenticatedResponse.Http404Json(
          json = UsersCodecs.usersCheckPersonIsFollowedByAuthenticatedResponseCodecAlternative4Registry.select(listOf("users/check-person-is-followed-by-authenticated.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersCheckPersonIsFollowedByAuthenticatedResponse = UsersCheckPersonIsFollowedByAuthenticatedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/create-gpg-key-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersCreateGpgKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/create-gpg-key-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersCreateGpgKeyForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: GpgKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateGpgKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateGpgKeyForAuthenticatedUserResponse,
        UsersCreateGpgKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateGpgKeyForAuthenticatedUserResponse,
        UsersCreateGpgKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateGpgKeyForAuthenticatedUserResponse,
        UsersCreateGpgKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateGpgKeyForAuthenticatedUserResponse,
        UsersCreateGpgKeyForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateGpgKeyForAuthenticatedUserResponse,
        UsersCreateGpgKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateGpgKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/create-gpg-key-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersCreateGpgKeyForAuthenticatedUserApiException(
    public val error: UsersCreateGpgKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/create-gpg-key-for-authenticated-user")

  private object UsersCreateGpgKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersCreateGpgKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersCreateGpgKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersCreateGpgKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/create-gpg-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersCreateGpgKeyForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/create-gpg-key-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-gpg-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersCreateGpgKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-gpg-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersCreateGpgKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/create-gpg-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-gpg-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersCreateGpgKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/create-gpg-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-gpg-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersCreateGpgKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/create-gpg-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-gpg-key-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersCreateGpgKeyForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersCreateGpgKeyForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/create-gpg-key-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersCreateGpgKeyForAuthenticatedUserResponse = UsersCreateGpgKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/create-public-ssh-key-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersCreatePublicSshKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/create-public-ssh-key-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersCreatePublicSshKeyForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Key,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreatePublicSshKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreatePublicSshKeyForAuthenticatedUserResponse,
        UsersCreatePublicSshKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreatePublicSshKeyForAuthenticatedUserResponse,
        UsersCreatePublicSshKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreatePublicSshKeyForAuthenticatedUserResponse,
        UsersCreatePublicSshKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreatePublicSshKeyForAuthenticatedUserResponse,
        UsersCreatePublicSshKeyForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreatePublicSshKeyForAuthenticatedUserResponse,
        UsersCreatePublicSshKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreatePublicSshKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/create-public-ssh-key-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersCreatePublicSshKeyForAuthenticatedUserApiException(
    public val error: UsersCreatePublicSshKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/create-public-ssh-key-for-authenticated-user")

  private object UsersCreatePublicSshKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersCreatePublicSshKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersCreatePublicSshKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersCreatePublicSshKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/create-public-ssh-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersCreatePublicSshKeyForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/create-public-ssh-key-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-public-ssh-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-public-ssh-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/create-public-ssh-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-public-ssh-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/create-public-ssh-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-public-ssh-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/create-public-ssh-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-public-ssh-key-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersCreatePublicSshKeyForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersCreatePublicSshKeyForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/create-public-ssh-key-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersCreatePublicSshKeyForAuthenticatedUserResponse = UsersCreatePublicSshKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/create-ssh-signing-key-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersCreateSshSigningKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/create-ssh-signing-key-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersCreateSshSigningKeyForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: SshSigningKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateSshSigningKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateSshSigningKeyForAuthenticatedUserResponse,
        UsersCreateSshSigningKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateSshSigningKeyForAuthenticatedUserResponse,
        UsersCreateSshSigningKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateSshSigningKeyForAuthenticatedUserResponse,
        UsersCreateSshSigningKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateSshSigningKeyForAuthenticatedUserResponse,
        UsersCreateSshSigningKeyForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateSshSigningKeyForAuthenticatedUserResponse,
        UsersCreateSshSigningKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersCreateSshSigningKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/create-ssh-signing-key-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersCreateSshSigningKeyForAuthenticatedUserApiException(
    public val error: UsersCreateSshSigningKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/create-ssh-signing-key-for-authenticated-user")

  private object UsersCreateSshSigningKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersCreateSshSigningKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersCreateSshSigningKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersCreateSshSigningKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/create-ssh-signing-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersCreateSshSigningKeyForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/create-ssh-signing-key-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-ssh-signing-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-ssh-signing-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/create-ssh-signing-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-ssh-signing-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/create-ssh-signing-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-ssh-signing-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/create-ssh-signing-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/create-ssh-signing-key-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersCreateSshSigningKeyForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersCreateSshSigningKeyForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/create-ssh-signing-key-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersCreateSshSigningKeyForAuthenticatedUserResponse = UsersCreateSshSigningKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/delete-attestations-bulk` may expose through its typed API
   * exception.
   */
  public sealed interface UsersDeleteAttestationsBulkError

  /**
   * Typed response alternatives for `users/delete-attestations-bulk`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersDeleteAttestationsBulkResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsBulkResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsBulkResponse,
        UsersDeleteAttestationsBulkError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsBulkResponse
  }

  /**
   * Raised by `users/delete-attestations-bulk` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class UsersDeleteAttestationsBulkApiException(
    public val error: UsersDeleteAttestationsBulkError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/delete-attestations-bulk")

  private object UsersDeleteAttestationsBulkResponseDecoder : SdkResponseAlternativeDecoder<UsersDeleteAttestationsBulkResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersDeleteAttestationsBulkResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersDeleteAttestationsBulkResponse> = when {
      alternative.id == "users/delete-attestations-bulk.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsBulkResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-attestations-bulk.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsBulkResponse.Http404Json(
          json = UsersCodecs.usersDeleteAttestationsBulkResponseCodecAlternative1Registry.select(listOf("users/delete-attestations-bulk.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersDeleteAttestationsBulkResponse = UsersDeleteAttestationsBulkResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/delete-attestations-by-id` may expose through its typed API
   * exception.
   */
  public sealed interface UsersDeleteAttestationsByIdError

  /**
   * Typed response alternatives for `users/delete-attestations-by-id`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersDeleteAttestationsByIdResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsByIdResponse

    public class SuccessNoContent2(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsByIdResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsByIdResponse,
        UsersDeleteAttestationsByIdError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsByIdResponse,
        UsersDeleteAttestationsByIdError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsByIdResponse
  }

  /**
   * Raised by `users/delete-attestations-by-id` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class UsersDeleteAttestationsByIdApiException(
    public val error: UsersDeleteAttestationsByIdError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/delete-attestations-by-id")

  private object UsersDeleteAttestationsByIdResponseDecoder : SdkResponseAlternativeDecoder<UsersDeleteAttestationsByIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersDeleteAttestationsByIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersDeleteAttestationsByIdResponse> = when {
      alternative.id == "users/delete-attestations-by-id.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsByIdResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-attestations-by-id.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsByIdResponse.SuccessNoContent2(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-attestations-by-id.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsByIdResponse.Http403Json(
          json = UsersCodecs.usersDeleteAttestationsByIdResponseCodecAlternative2Registry.select(listOf("users/delete-attestations-by-id.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-attestations-by-id.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsByIdResponse.Http404Json(
          json = UsersCodecs.usersDeleteAttestationsByIdResponseCodecAlternative3Registry.select(listOf("users/delete-attestations-by-id.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersDeleteAttestationsByIdResponse = UsersDeleteAttestationsByIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/delete-attestations-by-subject-digest` may expose through its
   * typed API exception.
   */
  public sealed interface UsersDeleteAttestationsBySubjectDigestError

  /**
   * Typed response alternatives for `users/delete-attestations-by-subject-digest`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersDeleteAttestationsBySubjectDigestResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsBySubjectDigestResponse

    public class SuccessNoContent2(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsBySubjectDigestResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsBySubjectDigestResponse,
        UsersDeleteAttestationsBySubjectDigestError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteAttestationsBySubjectDigestResponse
  }

  /**
   * Raised by `users/delete-attestations-by-subject-digest` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersDeleteAttestationsBySubjectDigestApiException(
    public val error: UsersDeleteAttestationsBySubjectDigestError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/delete-attestations-by-subject-digest")

  private object UsersDeleteAttestationsBySubjectDigestResponseDecoder : SdkResponseAlternativeDecoder<UsersDeleteAttestationsBySubjectDigestResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersDeleteAttestationsBySubjectDigestResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersDeleteAttestationsBySubjectDigestResponse> = when {
      alternative.id == "users/delete-attestations-by-subject-digest.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsBySubjectDigestResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-attestations-by-subject-digest.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsBySubjectDigestResponse.SuccessNoContent2(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-attestations-by-subject-digest.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersDeleteAttestationsBySubjectDigestResponse.Http404Json(
          json = UsersCodecs.usersDeleteAttestationsBySubjectDigestResponseCodecAlternative2Registry.select(listOf("users/delete-attestations-by-subject-digest.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersDeleteAttestationsBySubjectDigestResponse = UsersDeleteAttestationsBySubjectDigestResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/delete-email-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersDeleteEmailForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/delete-email-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersDeleteEmailForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteEmailForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteEmailForAuthenticatedUserResponse,
        UsersDeleteEmailForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteEmailForAuthenticatedUserResponse,
        UsersDeleteEmailForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteEmailForAuthenticatedUserResponse,
        UsersDeleteEmailForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteEmailForAuthenticatedUserResponse,
        UsersDeleteEmailForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteEmailForAuthenticatedUserResponse,
        UsersDeleteEmailForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteEmailForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/delete-email-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersDeleteEmailForAuthenticatedUserApiException(
    public val error: UsersDeleteEmailForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/delete-email-for-authenticated-user")

  private object UsersDeleteEmailForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersDeleteEmailForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersDeleteEmailForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersDeleteEmailForAuthenticatedUserResponse> = when {
      alternative.id == "users/delete-email-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersDeleteEmailForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-email-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersDeleteEmailForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-email-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersDeleteEmailForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersDeleteEmailForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/delete-email-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-email-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersDeleteEmailForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersDeleteEmailForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/delete-email-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-email-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersDeleteEmailForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersDeleteEmailForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/delete-email-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-email-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersDeleteEmailForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersDeleteEmailForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/delete-email-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersDeleteEmailForAuthenticatedUserResponse = UsersDeleteEmailForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/delete-gpg-key-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersDeleteGpgKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/delete-gpg-key-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersDeleteGpgKeyForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteGpgKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteGpgKeyForAuthenticatedUserResponse,
        UsersDeleteGpgKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteGpgKeyForAuthenticatedUserResponse,
        UsersDeleteGpgKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteGpgKeyForAuthenticatedUserResponse,
        UsersDeleteGpgKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteGpgKeyForAuthenticatedUserResponse,
        UsersDeleteGpgKeyForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteGpgKeyForAuthenticatedUserResponse,
        UsersDeleteGpgKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteGpgKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/delete-gpg-key-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersDeleteGpgKeyForAuthenticatedUserApiException(
    public val error: UsersDeleteGpgKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/delete-gpg-key-for-authenticated-user")

  private object UsersDeleteGpgKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersDeleteGpgKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersDeleteGpgKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersDeleteGpgKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/delete-gpg-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersDeleteGpgKeyForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-gpg-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersDeleteGpgKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-gpg-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersDeleteGpgKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/delete-gpg-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-gpg-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersDeleteGpgKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/delete-gpg-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-gpg-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersDeleteGpgKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/delete-gpg-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-gpg-key-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersDeleteGpgKeyForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersDeleteGpgKeyForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/delete-gpg-key-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersDeleteGpgKeyForAuthenticatedUserResponse = UsersDeleteGpgKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/delete-public-ssh-key-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersDeletePublicSshKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/delete-public-ssh-key-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersDeletePublicSshKeyForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeletePublicSshKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeletePublicSshKeyForAuthenticatedUserResponse,
        UsersDeletePublicSshKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeletePublicSshKeyForAuthenticatedUserResponse,
        UsersDeletePublicSshKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeletePublicSshKeyForAuthenticatedUserResponse,
        UsersDeletePublicSshKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeletePublicSshKeyForAuthenticatedUserResponse,
        UsersDeletePublicSshKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeletePublicSshKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/delete-public-ssh-key-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersDeletePublicSshKeyForAuthenticatedUserApiException(
    public val error: UsersDeletePublicSshKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/delete-public-ssh-key-for-authenticated-user")

  private object UsersDeletePublicSshKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersDeletePublicSshKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersDeletePublicSshKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersDeletePublicSshKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/delete-public-ssh-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersDeletePublicSshKeyForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-public-ssh-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-public-ssh-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/delete-public-ssh-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-public-ssh-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/delete-public-ssh-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-public-ssh-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersDeletePublicSshKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersDeletePublicSshKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/delete-public-ssh-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersDeletePublicSshKeyForAuthenticatedUserResponse = UsersDeletePublicSshKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/delete-social-account-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersDeleteSocialAccountForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/delete-social-account-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersDeleteSocialAccountForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSocialAccountForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSocialAccountForAuthenticatedUserResponse,
        UsersDeleteSocialAccountForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSocialAccountForAuthenticatedUserResponse,
        UsersDeleteSocialAccountForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSocialAccountForAuthenticatedUserResponse,
        UsersDeleteSocialAccountForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSocialAccountForAuthenticatedUserResponse,
        UsersDeleteSocialAccountForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSocialAccountForAuthenticatedUserResponse,
        UsersDeleteSocialAccountForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSocialAccountForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/delete-social-account-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersDeleteSocialAccountForAuthenticatedUserApiException(
    public val error: UsersDeleteSocialAccountForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/delete-social-account-for-authenticated-user")

  private object UsersDeleteSocialAccountForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersDeleteSocialAccountForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersDeleteSocialAccountForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersDeleteSocialAccountForAuthenticatedUserResponse> = when {
      alternative.id == "users/delete-social-account-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersDeleteSocialAccountForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-social-account-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersDeleteSocialAccountForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-social-account-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersDeleteSocialAccountForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/delete-social-account-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-social-account-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersDeleteSocialAccountForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/delete-social-account-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-social-account-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersDeleteSocialAccountForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/delete-social-account-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-social-account-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersDeleteSocialAccountForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersDeleteSocialAccountForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/delete-social-account-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersDeleteSocialAccountForAuthenticatedUserResponse = UsersDeleteSocialAccountForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/delete-ssh-signing-key-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersDeleteSshSigningKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/delete-ssh-signing-key-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersDeleteSshSigningKeyForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSshSigningKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSshSigningKeyForAuthenticatedUserResponse,
        UsersDeleteSshSigningKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSshSigningKeyForAuthenticatedUserResponse,
        UsersDeleteSshSigningKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSshSigningKeyForAuthenticatedUserResponse,
        UsersDeleteSshSigningKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSshSigningKeyForAuthenticatedUserResponse,
        UsersDeleteSshSigningKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersDeleteSshSigningKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/delete-ssh-signing-key-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersDeleteSshSigningKeyForAuthenticatedUserApiException(
    public val error: UsersDeleteSshSigningKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/delete-ssh-signing-key-for-authenticated-user")

  private object UsersDeleteSshSigningKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersDeleteSshSigningKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersDeleteSshSigningKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersDeleteSshSigningKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/delete-ssh-signing-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersDeleteSshSigningKeyForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-ssh-signing-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-ssh-signing-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/delete-ssh-signing-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-ssh-signing-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/delete-ssh-signing-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/delete-ssh-signing-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersDeleteSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/delete-ssh-signing-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersDeleteSshSigningKeyForAuthenticatedUserResponse = UsersDeleteSshSigningKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/follow` may expose through its typed API exception.
   */
  public sealed interface UsersFollowError

  /**
   * Typed response alternatives for `users/follow`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UsersFollowResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersFollowResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersFollowResponse,
        UsersFollowError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersFollowResponse,
        UsersFollowError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersFollowResponse,
        UsersFollowError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersFollowResponse,
        UsersFollowError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersFollowResponse,
        UsersFollowError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersFollowResponse
  }

  /**
   * Raised by `users/follow` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class UsersFollowApiException(
    public val error: UsersFollowError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/follow")

  private object UsersFollowResponseDecoder : SdkResponseAlternativeDecoder<UsersFollowResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersFollowResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersFollowResponse> = when {
      alternative.id == "users/follow.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersFollowResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/follow.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersFollowResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/follow.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersFollowResponse.Http401Json(
          json = UsersCodecs.usersFollowResponseCodecAlternative2Registry.select(listOf("users/follow.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/follow.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersFollowResponse.Http403Json(
          json = UsersCodecs.usersFollowResponseCodecAlternative3Registry.select(listOf("users/follow.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/follow.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersFollowResponse.Http404Json(
          json = UsersCodecs.usersFollowResponseCodecAlternative4Registry.select(listOf("users/follow.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/follow.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersFollowResponse.Http422Json(
          json = UsersCodecs.usersFollowResponseCodecAlternative5Registry.select(listOf("users/follow.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersFollowResponse = UsersFollowResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/get-authenticated` may expose through its typed API
   * exception.
   */
  public sealed interface UsersGetAuthenticatedError

  /**
   * Typed response alternatives for `users/get-authenticated`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface UsersGetAuthenticatedResponse {
    public class SuccessJson(
      public val json: InlineUserGetResponse200JsonX3a7d2450,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetAuthenticatedResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetAuthenticatedResponse,
        UsersGetAuthenticatedError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetAuthenticatedResponse,
        UsersGetAuthenticatedError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetAuthenticatedResponse,
        UsersGetAuthenticatedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetAuthenticatedResponse
  }

  /**
   * Raised by `users/get-authenticated` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class UsersGetAuthenticatedApiException(
    public val error: UsersGetAuthenticatedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/get-authenticated")

  private object UsersGetAuthenticatedResponseDecoder : SdkResponseAlternativeDecoder<UsersGetAuthenticatedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersGetAuthenticatedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersGetAuthenticatedResponse> = when {
      alternative.id == "users/get-authenticated.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersGetAuthenticatedResponse.SuccessJson(
          json = UsersCodecs.usersGetAuthenticatedResponseCodecAlternative0Registry.select(listOf("users/get-authenticated.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-authenticated.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersGetAuthenticatedResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-authenticated.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersGetAuthenticatedResponse.Http401Json(
          json = UsersCodecs.usersGetAuthenticatedResponseCodecAlternative2Registry.select(listOf("users/get-authenticated.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-authenticated.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersGetAuthenticatedResponse.Http403Json(
          json = UsersCodecs.usersGetAuthenticatedResponseCodecAlternative3Registry.select(listOf("users/get-authenticated.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersGetAuthenticatedResponse = UsersGetAuthenticatedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/get-by-id` may expose through its typed API exception.
   */
  public sealed interface UsersGetByIdError

  /**
   * Typed response alternatives for `users/get-by-id`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UsersGetByIdResponse {
    public class SuccessJson(
      public val json: InlineUserGetResponse200JsonX7ddb2065,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetByIdResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetByIdResponse,
        UsersGetByIdError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetByIdResponse
  }

  /**
   * Raised by `users/get-by-id` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class UsersGetByIdApiException(
    public val error: UsersGetByIdError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/get-by-id")

  private object UsersGetByIdResponseDecoder : SdkResponseAlternativeDecoder<UsersGetByIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersGetByIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersGetByIdResponse> = when {
      alternative.id == "users/get-by-id.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersGetByIdResponse.SuccessJson(
          json = UsersCodecs.usersGetByIdResponseCodecAlternative0Registry.select(listOf("users/get-by-id.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-by-id.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersGetByIdResponse.Http404Json(
          json = UsersCodecs.usersGetByIdResponseCodecAlternative1Registry.select(listOf("users/get-by-id.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersGetByIdResponse = UsersGetByIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/get-by-username` may expose through its typed API exception.
   */
  public sealed interface UsersGetByUsernameError

  /**
   * Typed response alternatives for `users/get-by-username`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface UsersGetByUsernameResponse {
    public class SuccessJson(
      public val json: InlineUsersGetResponse200JsonX661510a1,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetByUsernameResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetByUsernameResponse,
        UsersGetByUsernameError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetByUsernameResponse
  }

  /**
   * Raised by `users/get-by-username` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class UsersGetByUsernameApiException(
    public val error: UsersGetByUsernameError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/get-by-username")

  private object UsersGetByUsernameResponseDecoder : SdkResponseAlternativeDecoder<UsersGetByUsernameResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersGetByUsernameResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersGetByUsernameResponse> = when {
      alternative.id == "users/get-by-username.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersGetByUsernameResponse.SuccessJson(
          json = UsersCodecs.usersGetByUsernameResponseCodecAlternative0Registry.select(listOf("users/get-by-username.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-by-username.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersGetByUsernameResponse.Http404Json(
          json = UsersCodecs.usersGetByUsernameResponseCodecAlternative1Registry.select(listOf("users/get-by-username.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersGetByUsernameResponse = UsersGetByUsernameResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/get-context-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface UsersGetContextForUserError

  /**
   * Typed response alternatives for `users/get-context-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersGetContextForUserResponse {
    public class SuccessJson(
      public val json: Hovercard,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetContextForUserResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetContextForUserResponse,
        UsersGetContextForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetContextForUserResponse,
        UsersGetContextForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetContextForUserResponse
  }

  /**
   * Raised by `users/get-context-for-user` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class UsersGetContextForUserApiException(
    public val error: UsersGetContextForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/get-context-for-user")

  private object UsersGetContextForUserResponseDecoder : SdkResponseAlternativeDecoder<UsersGetContextForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersGetContextForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersGetContextForUserResponse> = when {
      alternative.id == "users/get-context-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersGetContextForUserResponse.SuccessJson(
          json = UsersCodecs.usersGetContextForUserResponseCodecAlternative0Registry.select(listOf("users/get-context-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-context-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersGetContextForUserResponse.Http404Json(
          json = UsersCodecs.usersGetContextForUserResponseCodecAlternative1Registry.select(listOf("users/get-context-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-context-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersGetContextForUserResponse.Http422Json(
          json = UsersCodecs.usersGetContextForUserResponseCodecAlternative2Registry.select(listOf("users/get-context-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersGetContextForUserResponse = UsersGetContextForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/get-gpg-key-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersGetGpgKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/get-gpg-key-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersGetGpgKeyForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: GpgKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetGpgKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetGpgKeyForAuthenticatedUserResponse,
        UsersGetGpgKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetGpgKeyForAuthenticatedUserResponse,
        UsersGetGpgKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetGpgKeyForAuthenticatedUserResponse,
        UsersGetGpgKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetGpgKeyForAuthenticatedUserResponse,
        UsersGetGpgKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetGpgKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/get-gpg-key-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersGetGpgKeyForAuthenticatedUserApiException(
    public val error: UsersGetGpgKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/get-gpg-key-for-authenticated-user")

  private object UsersGetGpgKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersGetGpgKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersGetGpgKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersGetGpgKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/get-gpg-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersGetGpgKeyForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/get-gpg-key-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-gpg-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersGetGpgKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-gpg-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersGetGpgKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/get-gpg-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-gpg-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersGetGpgKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/get-gpg-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-gpg-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersGetGpgKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersGetGpgKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/get-gpg-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersGetGpgKeyForAuthenticatedUserResponse = UsersGetGpgKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/get-public-ssh-key-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface UsersGetPublicSshKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/get-public-ssh-key-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersGetPublicSshKeyForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: Key,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetPublicSshKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetPublicSshKeyForAuthenticatedUserResponse,
        UsersGetPublicSshKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetPublicSshKeyForAuthenticatedUserResponse,
        UsersGetPublicSshKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetPublicSshKeyForAuthenticatedUserResponse,
        UsersGetPublicSshKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetPublicSshKeyForAuthenticatedUserResponse,
        UsersGetPublicSshKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetPublicSshKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/get-public-ssh-key-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersGetPublicSshKeyForAuthenticatedUserApiException(
    public val error: UsersGetPublicSshKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/get-public-ssh-key-for-authenticated-user")

  private object UsersGetPublicSshKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersGetPublicSshKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersGetPublicSshKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersGetPublicSshKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/get-public-ssh-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersGetPublicSshKeyForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/get-public-ssh-key-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-public-ssh-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersGetPublicSshKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-public-ssh-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersGetPublicSshKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/get-public-ssh-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-public-ssh-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersGetPublicSshKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/get-public-ssh-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-public-ssh-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersGetPublicSshKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersGetPublicSshKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/get-public-ssh-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersGetPublicSshKeyForAuthenticatedUserResponse = UsersGetPublicSshKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/get-ssh-signing-key-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersGetSshSigningKeyForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/get-ssh-signing-key-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersGetSshSigningKeyForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: SshSigningKey,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetSshSigningKeyForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetSshSigningKeyForAuthenticatedUserResponse,
        UsersGetSshSigningKeyForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetSshSigningKeyForAuthenticatedUserResponse,
        UsersGetSshSigningKeyForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetSshSigningKeyForAuthenticatedUserResponse,
        UsersGetSshSigningKeyForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetSshSigningKeyForAuthenticatedUserResponse,
        UsersGetSshSigningKeyForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersGetSshSigningKeyForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/get-ssh-signing-key-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersGetSshSigningKeyForAuthenticatedUserApiException(
    public val error: UsersGetSshSigningKeyForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/get-ssh-signing-key-for-authenticated-user")

  private object UsersGetSshSigningKeyForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersGetSshSigningKeyForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersGetSshSigningKeyForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersGetSshSigningKeyForAuthenticatedUserResponse> = when {
      alternative.id == "users/get-ssh-signing-key-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersGetSshSigningKeyForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/get-ssh-signing-key-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-ssh-signing-key-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersGetSshSigningKeyForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-ssh-signing-key-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersGetSshSigningKeyForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/get-ssh-signing-key-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-ssh-signing-key-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersGetSshSigningKeyForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/get-ssh-signing-key-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/get-ssh-signing-key-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersGetSshSigningKeyForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersGetSshSigningKeyForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/get-ssh-signing-key-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersGetSshSigningKeyForAuthenticatedUserResponse = UsersGetSshSigningKeyForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list` may expose through its typed API exception.
   */
  public sealed interface UsersListError

  /**
   * Typed response alternatives for `users/list`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UsersListResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListResponse,
        UsersListError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListResponse
  }

  /**
   * Raised by `users/list` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class UsersListApiException(
    public val error: UsersListError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list")

  private object UsersListResponseDecoder : SdkResponseAlternativeDecoder<UsersListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListResponse> = when {
      alternative.id == "users/list.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListResponse.SuccessJson(
          json = UsersCodecs.usersListResponseCodecAlternative0Registry.select(listOf("users/list.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListResponse.Http304NoContent(
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
    ): UsersListResponse = UsersListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `users/list-attestations`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface UsersListAttestationsResponse {
    public class SuccessJson(
      public val json: InlineUsersAttestationsGetResponse200JsonX8bc4be52,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListAttestationsResponse

    public class SuccessJson2(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListAttestationsResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListAttestationsResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListAttestationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListAttestationsResponse
  }

  private object UsersListAttestationsResponseDecoder : SdkResponseAlternativeDecoder<UsersListAttestationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListAttestationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListAttestationsResponse> = when {
      alternative.id == "users/list-attestations.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListAttestationsResponse.SuccessJson(
          json = UsersCodecs.usersListAttestationsResponseCodecAlternative0Registry.select(listOf("users/list-attestations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-attestations.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListAttestationsResponse.SuccessJson2(
          json = UsersCodecs.usersListAttestationsResponseCodecAlternative1Registry.select(listOf("users/list-attestations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-attestations.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListAttestationsResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-attestations.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListAttestationsResponse.Http404Json(
          json = UsersCodecs.usersListAttestationsResponseCodecAlternative3Registry.select(listOf("users/list-attestations.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListAttestationsResponse = UsersListAttestationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `users/list-attestations-bulk`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersListAttestationsBulkResponse {
    public class SuccessJson(
      public val json: InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListAttestationsBulkResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListAttestationsBulkResponse
  }

  private object UsersListAttestationsBulkResponseDecoder : SdkResponseAlternativeDecoder<UsersListAttestationsBulkResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListAttestationsBulkResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListAttestationsBulkResponse> = when {
      alternative.id == "users/list-attestations-bulk.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListAttestationsBulkResponse.SuccessJson(
          json = UsersCodecs.usersListAttestationsBulkResponseCodecAlternative0Registry.select(listOf("users/list-attestations-bulk.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListAttestationsBulkResponse = UsersListAttestationsBulkResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-blocked-by-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersListBlockedByAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-blocked-by-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersListBlockedByAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListBlockedByAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListBlockedByAuthenticatedUserResponse,
        UsersListBlockedByAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListBlockedByAuthenticatedUserResponse,
        UsersListBlockedByAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListBlockedByAuthenticatedUserResponse,
        UsersListBlockedByAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListBlockedByAuthenticatedUserResponse,
        UsersListBlockedByAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListBlockedByAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-blocked-by-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListBlockedByAuthenticatedUserApiException(
    public val error: UsersListBlockedByAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-blocked-by-authenticated-user")

  private object UsersListBlockedByAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListBlockedByAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListBlockedByAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListBlockedByAuthenticatedUserResponse> = when {
      alternative.id == "users/list-blocked-by-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListBlockedByAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListBlockedByAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-blocked-by-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-blocked-by-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListBlockedByAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-blocked-by-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListBlockedByAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListBlockedByAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-blocked-by-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-blocked-by-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListBlockedByAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListBlockedByAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-blocked-by-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-blocked-by-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersListBlockedByAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersListBlockedByAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/list-blocked-by-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListBlockedByAuthenticatedUserResponse = UsersListBlockedByAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-emails-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersListEmailsForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-emails-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersListEmailsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Email>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListEmailsForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListEmailsForAuthenticatedUserResponse,
        UsersListEmailsForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListEmailsForAuthenticatedUserResponse,
        UsersListEmailsForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListEmailsForAuthenticatedUserResponse,
        UsersListEmailsForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListEmailsForAuthenticatedUserResponse,
        UsersListEmailsForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListEmailsForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-emails-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListEmailsForAuthenticatedUserApiException(
    public val error: UsersListEmailsForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-emails-for-authenticated-user")

  private object UsersListEmailsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListEmailsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListEmailsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListEmailsForAuthenticatedUserResponse> = when {
      alternative.id == "users/list-emails-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListEmailsForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListEmailsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-emails-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-emails-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListEmailsForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-emails-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListEmailsForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListEmailsForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-emails-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-emails-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListEmailsForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListEmailsForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-emails-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-emails-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersListEmailsForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersListEmailsForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/list-emails-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListEmailsForAuthenticatedUserResponse = UsersListEmailsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-followed-by-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersListFollowedByAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-followed-by-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersListFollowedByAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowedByAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowedByAuthenticatedUserResponse,
        UsersListFollowedByAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowedByAuthenticatedUserResponse,
        UsersListFollowedByAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowedByAuthenticatedUserResponse,
        UsersListFollowedByAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowedByAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-followed-by-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListFollowedByAuthenticatedUserApiException(
    public val error: UsersListFollowedByAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-followed-by-authenticated-user")

  private object UsersListFollowedByAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListFollowedByAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListFollowedByAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListFollowedByAuthenticatedUserResponse> = when {
      alternative.id == "users/list-followed-by-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListFollowedByAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListFollowedByAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-followed-by-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-followed-by-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListFollowedByAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-followed-by-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListFollowedByAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListFollowedByAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-followed-by-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-followed-by-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListFollowedByAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListFollowedByAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-followed-by-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListFollowedByAuthenticatedUserResponse = UsersListFollowedByAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-followers-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersListFollowersForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-followers-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersListFollowersForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowersForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowersForAuthenticatedUserResponse,
        UsersListFollowersForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowersForAuthenticatedUserResponse,
        UsersListFollowersForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowersForAuthenticatedUserResponse,
        UsersListFollowersForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowersForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-followers-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListFollowersForAuthenticatedUserApiException(
    public val error: UsersListFollowersForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-followers-for-authenticated-user")

  private object UsersListFollowersForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListFollowersForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListFollowersForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListFollowersForAuthenticatedUserResponse> = when {
      alternative.id == "users/list-followers-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListFollowersForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListFollowersForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-followers-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-followers-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListFollowersForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-followers-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListFollowersForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListFollowersForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-followers-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-followers-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListFollowersForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListFollowersForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-followers-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListFollowersForAuthenticatedUserResponse = UsersListFollowersForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `users/list-followers-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersListFollowersForUserResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowersForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowersForUserResponse
  }

  private object UsersListFollowersForUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListFollowersForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListFollowersForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListFollowersForUserResponse> = when {
      alternative.id == "users/list-followers-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListFollowersForUserResponse.SuccessJson(
          json = UsersCodecs.usersListFollowersForUserResponseCodecAlternative0Registry.select(listOf("users/list-followers-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListFollowersForUserResponse = UsersListFollowersForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `users/list-following-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersListFollowingForUserResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowingForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListFollowingForUserResponse
  }

  private object UsersListFollowingForUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListFollowingForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListFollowingForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListFollowingForUserResponse> = when {
      alternative.id == "users/list-following-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListFollowingForUserResponse.SuccessJson(
          json = UsersCodecs.usersListFollowingForUserResponseCodecAlternative0Registry.select(listOf("users/list-following-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListFollowingForUserResponse = UsersListFollowingForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-gpg-keys-for-authenticated-user` may expose through its
   * typed API exception.
   */
  public sealed interface UsersListGpgKeysForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-gpg-keys-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersListGpgKeysForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<GpgKey>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListGpgKeysForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListGpgKeysForAuthenticatedUserResponse,
        UsersListGpgKeysForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListGpgKeysForAuthenticatedUserResponse,
        UsersListGpgKeysForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListGpgKeysForAuthenticatedUserResponse,
        UsersListGpgKeysForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListGpgKeysForAuthenticatedUserResponse,
        UsersListGpgKeysForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListGpgKeysForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-gpg-keys-for-authenticated-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListGpgKeysForAuthenticatedUserApiException(
    public val error: UsersListGpgKeysForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-gpg-keys-for-authenticated-user")

  private object UsersListGpgKeysForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListGpgKeysForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListGpgKeysForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListGpgKeysForAuthenticatedUserResponse> = when {
      alternative.id == "users/list-gpg-keys-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListGpgKeysForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListGpgKeysForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-gpg-keys-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-gpg-keys-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListGpgKeysForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-gpg-keys-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListGpgKeysForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListGpgKeysForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-gpg-keys-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-gpg-keys-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListGpgKeysForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListGpgKeysForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-gpg-keys-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-gpg-keys-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersListGpgKeysForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersListGpgKeysForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/list-gpg-keys-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListGpgKeysForAuthenticatedUserResponse = UsersListGpgKeysForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `users/list-gpg-keys-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersListGpgKeysForUserResponse {
    public class SuccessJson(
      public val json: List<GpgKey>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListGpgKeysForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListGpgKeysForUserResponse
  }

  private object UsersListGpgKeysForUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListGpgKeysForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListGpgKeysForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListGpgKeysForUserResponse> = when {
      alternative.id == "users/list-gpg-keys-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListGpgKeysForUserResponse.SuccessJson(
          json = UsersCodecs.usersListGpgKeysForUserResponseCodecAlternative0Registry.select(listOf("users/list-gpg-keys-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListGpgKeysForUserResponse = UsersListGpgKeysForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-public-emails-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface UsersListPublicEmailsForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-public-emails-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface UsersListPublicEmailsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Email>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicEmailsForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicEmailsForAuthenticatedUserResponse,
        UsersListPublicEmailsForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicEmailsForAuthenticatedUserResponse,
        UsersListPublicEmailsForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicEmailsForAuthenticatedUserResponse,
        UsersListPublicEmailsForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicEmailsForAuthenticatedUserResponse,
        UsersListPublicEmailsForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicEmailsForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-public-emails-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListPublicEmailsForAuthenticatedUserApiException(
    public val error: UsersListPublicEmailsForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-public-emails-for-authenticated-user")

  private object UsersListPublicEmailsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListPublicEmailsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListPublicEmailsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListPublicEmailsForAuthenticatedUserResponse> = when {
      alternative.id == "users/list-public-emails-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListPublicEmailsForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-public-emails-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-public-emails-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListPublicEmailsForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-public-emails-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListPublicEmailsForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-public-emails-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-public-emails-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListPublicEmailsForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-public-emails-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-public-emails-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersListPublicEmailsForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersListPublicEmailsForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/list-public-emails-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListPublicEmailsForAuthenticatedUserResponse = UsersListPublicEmailsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `users/list-public-keys-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersListPublicKeysForUserResponse {
    public class SuccessJson(
      public val json: List<KeySimple>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicKeysForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicKeysForUserResponse
  }

  private object UsersListPublicKeysForUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListPublicKeysForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListPublicKeysForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListPublicKeysForUserResponse> = when {
      alternative.id == "users/list-public-keys-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListPublicKeysForUserResponse.SuccessJson(
          json = UsersCodecs.usersListPublicKeysForUserResponseCodecAlternative0Registry.select(listOf("users/list-public-keys-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListPublicKeysForUserResponse = UsersListPublicKeysForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-public-ssh-keys-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersListPublicSshKeysForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-public-ssh-keys-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersListPublicSshKeysForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Key>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicSshKeysForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicSshKeysForAuthenticatedUserResponse,
        UsersListPublicSshKeysForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicSshKeysForAuthenticatedUserResponse,
        UsersListPublicSshKeysForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicSshKeysForAuthenticatedUserResponse,
        UsersListPublicSshKeysForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicSshKeysForAuthenticatedUserResponse,
        UsersListPublicSshKeysForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListPublicSshKeysForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-public-ssh-keys-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListPublicSshKeysForAuthenticatedUserApiException(
    public val error: UsersListPublicSshKeysForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-public-ssh-keys-for-authenticated-user")

  private object UsersListPublicSshKeysForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListPublicSshKeysForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListPublicSshKeysForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListPublicSshKeysForAuthenticatedUserResponse> = when {
      alternative.id == "users/list-public-ssh-keys-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListPublicSshKeysForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-public-ssh-keys-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-public-ssh-keys-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListPublicSshKeysForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-public-ssh-keys-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListPublicSshKeysForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-public-ssh-keys-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-public-ssh-keys-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListPublicSshKeysForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-public-ssh-keys-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-public-ssh-keys-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersListPublicSshKeysForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersListPublicSshKeysForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/list-public-ssh-keys-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListPublicSshKeysForAuthenticatedUserResponse = UsersListPublicSshKeysForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-social-accounts-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersListSocialAccountsForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-social-accounts-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersListSocialAccountsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<SocialAccount>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSocialAccountsForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSocialAccountsForAuthenticatedUserResponse,
        UsersListSocialAccountsForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSocialAccountsForAuthenticatedUserResponse,
        UsersListSocialAccountsForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSocialAccountsForAuthenticatedUserResponse,
        UsersListSocialAccountsForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSocialAccountsForAuthenticatedUserResponse,
        UsersListSocialAccountsForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSocialAccountsForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-social-accounts-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListSocialAccountsForAuthenticatedUserApiException(
    public val error: UsersListSocialAccountsForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-social-accounts-for-authenticated-user")

  private object UsersListSocialAccountsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListSocialAccountsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListSocialAccountsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListSocialAccountsForAuthenticatedUserResponse> = when {
      alternative.id == "users/list-social-accounts-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListSocialAccountsForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-social-accounts-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-social-accounts-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListSocialAccountsForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-social-accounts-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListSocialAccountsForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-social-accounts-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-social-accounts-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListSocialAccountsForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-social-accounts-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-social-accounts-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersListSocialAccountsForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersListSocialAccountsForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/list-social-accounts-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListSocialAccountsForAuthenticatedUserResponse = UsersListSocialAccountsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `users/list-social-accounts-for-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface UsersListSocialAccountsForUserResponse {
    public class SuccessJson(
      public val json: List<SocialAccount>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSocialAccountsForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSocialAccountsForUserResponse
  }

  private object UsersListSocialAccountsForUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListSocialAccountsForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListSocialAccountsForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListSocialAccountsForUserResponse> = when {
      alternative.id == "users/list-social-accounts-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListSocialAccountsForUserResponse.SuccessJson(
          json = UsersCodecs.usersListSocialAccountsForUserResponseCodecAlternative0Registry.select(listOf("users/list-social-accounts-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListSocialAccountsForUserResponse = UsersListSocialAccountsForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/list-ssh-signing-keys-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface UsersListSshSigningKeysForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/list-ssh-signing-keys-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface UsersListSshSigningKeysForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<SshSigningKey>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSshSigningKeysForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSshSigningKeysForAuthenticatedUserResponse,
        UsersListSshSigningKeysForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSshSigningKeysForAuthenticatedUserResponse,
        UsersListSshSigningKeysForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSshSigningKeysForAuthenticatedUserResponse,
        UsersListSshSigningKeysForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSshSigningKeysForAuthenticatedUserResponse,
        UsersListSshSigningKeysForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSshSigningKeysForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/list-ssh-signing-keys-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersListSshSigningKeysForAuthenticatedUserApiException(
    public val error: UsersListSshSigningKeysForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/list-ssh-signing-keys-for-authenticated-user")

  private object UsersListSshSigningKeysForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListSshSigningKeysForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListSshSigningKeysForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListSshSigningKeysForAuthenticatedUserResponse> = when {
      alternative.id == "users/list-ssh-signing-keys-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListSshSigningKeysForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/list-ssh-signing-keys-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-ssh-signing-keys-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersListSshSigningKeysForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-ssh-signing-keys-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersListSshSigningKeysForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/list-ssh-signing-keys-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-ssh-signing-keys-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersListSshSigningKeysForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/list-ssh-signing-keys-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/list-ssh-signing-keys-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersListSshSigningKeysForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersListSshSigningKeysForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/list-ssh-signing-keys-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListSshSigningKeysForAuthenticatedUserResponse = UsersListSshSigningKeysForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `users/list-ssh-signing-keys-for-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface UsersListSshSigningKeysForUserResponse {
    public class SuccessJson(
      public val json: List<SshSigningKey>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSshSigningKeysForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersListSshSigningKeysForUserResponse
  }

  private object UsersListSshSigningKeysForUserResponseDecoder : SdkResponseAlternativeDecoder<UsersListSshSigningKeysForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersListSshSigningKeysForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersListSshSigningKeysForUserResponse> = when {
      alternative.id == "users/list-ssh-signing-keys-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersListSshSigningKeysForUserResponse.SuccessJson(
          json = UsersCodecs.usersListSshSigningKeysForUserResponseCodecAlternative0Registry.select(listOf("users/list-ssh-signing-keys-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersListSshSigningKeysForUserResponse = UsersListSshSigningKeysForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/set-primary-email-visibility-for-authenticated-user` may
   * expose through its typed API exception.
   */
  public sealed interface UsersSetPrimaryEmailVisibilityForAuthenticatedUserError

  /**
   * Typed response alternatives for `users/set-primary-email-visibility-for-authenticated-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<Email>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse,
        UsersSetPrimaryEmailVisibilityForAuthenticatedUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse,
        UsersSetPrimaryEmailVisibilityForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse,
        UsersSetPrimaryEmailVisibilityForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse,
        UsersSetPrimaryEmailVisibilityForAuthenticatedUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse,
        UsersSetPrimaryEmailVisibilityForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse
  }

  /**
   * Raised by `users/set-primary-email-visibility-for-authenticated-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class UsersSetPrimaryEmailVisibilityForAuthenticatedUserApiException(
    public val error: UsersSetPrimaryEmailVisibilityForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/set-primary-email-visibility-for-authenticated-user")

  private object UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse> = when {
      alternative.id == "users/set-primary-email-visibility-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.SuccessJson(
          json = UsersCodecs.usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("users/set-primary-email-visibility-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/set-primary-email-visibility-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/set-primary-email-visibility-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http401Json(
          json = UsersCodecs.usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("users/set-primary-email-visibility-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/set-primary-email-visibility-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http403Json(
          json = UsersCodecs.usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("users/set-primary-email-visibility-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/set-primary-email-visibility-for-authenticated-user.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http404Json(
          json = UsersCodecs.usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative4Registry.select(listOf("users/set-primary-email-visibility-for-authenticated-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/set-primary-email-visibility-for-authenticated-user.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Http422Json(
          json = UsersCodecs.usersSetPrimaryEmailVisibilityForAuthenticatedUserResponseCodecAlternative5Registry.select(listOf("users/set-primary-email-visibility-for-authenticated-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse = UsersSetPrimaryEmailVisibilityForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/unblock` may expose through its typed API exception.
   */
  public sealed interface UsersUnblockError

  /**
   * Typed response alternatives for `users/unblock`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UsersUnblockResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnblockResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnblockResponse,
        UsersUnblockError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnblockResponse,
        UsersUnblockError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnblockResponse,
        UsersUnblockError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnblockResponse,
        UsersUnblockError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnblockResponse
  }

  /**
   * Raised by `users/unblock` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class UsersUnblockApiException(
    public val error: UsersUnblockError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/unblock")

  private object UsersUnblockResponseDecoder : SdkResponseAlternativeDecoder<UsersUnblockResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersUnblockResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersUnblockResponse> = when {
      alternative.id == "users/unblock.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersUnblockResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/unblock.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersUnblockResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/unblock.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersUnblockResponse.Http401Json(
          json = UsersCodecs.usersUnblockResponseCodecAlternative2Registry.select(listOf("users/unblock.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/unblock.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersUnblockResponse.Http403Json(
          json = UsersCodecs.usersUnblockResponseCodecAlternative3Registry.select(listOf("users/unblock.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/unblock.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersUnblockResponse.Http404Json(
          json = UsersCodecs.usersUnblockResponseCodecAlternative4Registry.select(listOf("users/unblock.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersUnblockResponse = UsersUnblockResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/unfollow` may expose through its typed API exception.
   */
  public sealed interface UsersUnfollowError

  /**
   * Typed response alternatives for `users/unfollow`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UsersUnfollowResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnfollowResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnfollowResponse,
        UsersUnfollowError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnfollowResponse,
        UsersUnfollowError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnfollowResponse,
        UsersUnfollowError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnfollowResponse,
        UsersUnfollowError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUnfollowResponse
  }

  /**
   * Raised by `users/unfollow` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class UsersUnfollowApiException(
    public val error: UsersUnfollowError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/unfollow")

  private object UsersUnfollowResponseDecoder : SdkResponseAlternativeDecoder<UsersUnfollowResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersUnfollowResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersUnfollowResponse> = when {
      alternative.id == "users/unfollow.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersUnfollowResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/unfollow.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersUnfollowResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/unfollow.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersUnfollowResponse.Http401Json(
          json = UsersCodecs.usersUnfollowResponseCodecAlternative2Registry.select(listOf("users/unfollow.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/unfollow.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersUnfollowResponse.Http403Json(
          json = UsersCodecs.usersUnfollowResponseCodecAlternative3Registry.select(listOf("users/unfollow.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/unfollow.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersUnfollowResponse.Http404Json(
          json = UsersCodecs.usersUnfollowResponseCodecAlternative4Registry.select(listOf("users/unfollow.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersUnfollowResponse = UsersUnfollowResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `users/update-authenticated` may expose through its typed API
   * exception.
   */
  public sealed interface UsersUpdateAuthenticatedError

  /**
   * Typed response alternatives for `users/update-authenticated`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UsersUpdateAuthenticatedResponse {
    public class SuccessJson(
      public val json: PrivateUser,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUpdateAuthenticatedResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUpdateAuthenticatedResponse,
        UsersUpdateAuthenticatedError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUpdateAuthenticatedResponse,
        UsersUpdateAuthenticatedError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUpdateAuthenticatedResponse,
        UsersUpdateAuthenticatedError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUpdateAuthenticatedResponse,
        UsersUpdateAuthenticatedError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUpdateAuthenticatedResponse,
        UsersUpdateAuthenticatedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UsersUpdateAuthenticatedResponse
  }

  /**
   * Raised by `users/update-authenticated` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class UsersUpdateAuthenticatedApiException(
    public val error: UsersUpdateAuthenticatedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "users/update-authenticated")

  private object UsersUpdateAuthenticatedResponseDecoder : SdkResponseAlternativeDecoder<UsersUpdateAuthenticatedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UsersUpdateAuthenticatedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UsersUpdateAuthenticatedResponse> = when {
      alternative.id == "users/update-authenticated.response.alternative0" -> SdkResponseDecodeResult(
        value = UsersUpdateAuthenticatedResponse.SuccessJson(
          json = UsersCodecs.usersUpdateAuthenticatedResponseCodecAlternative0Registry.select(listOf("users/update-authenticated.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/update-authenticated.response.alternative1" -> SdkResponseDecodeResult(
        value = UsersUpdateAuthenticatedResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/update-authenticated.response.alternative2" -> SdkResponseDecodeResult(
        value = UsersUpdateAuthenticatedResponse.Http401Json(
          json = UsersCodecs.usersUpdateAuthenticatedResponseCodecAlternative2Registry.select(listOf("users/update-authenticated.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/update-authenticated.response.alternative3" -> SdkResponseDecodeResult(
        value = UsersUpdateAuthenticatedResponse.Http403Json(
          json = UsersCodecs.usersUpdateAuthenticatedResponseCodecAlternative3Registry.select(listOf("users/update-authenticated.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/update-authenticated.response.alternative4" -> SdkResponseDecodeResult(
        value = UsersUpdateAuthenticatedResponse.Http404Json(
          json = UsersCodecs.usersUpdateAuthenticatedResponseCodecAlternative4Registry.select(listOf("users/update-authenticated.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "users/update-authenticated.response.alternative5" -> SdkResponseDecodeResult(
        value = UsersUpdateAuthenticatedResponse.Http422Json(
          json = UsersCodecs.usersUpdateAuthenticatedResponseCodecAlternative5Registry.select(listOf("users/update-authenticated.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UsersUpdateAuthenticatedResponse = UsersUpdateAuthenticatedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val usersAddEmailForAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/add-email-for-authenticated-user",
          method = "POST",
          path = "/user/emails",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-email-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-email-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-email-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-email-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-email-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-email-for-authenticated-user.response.alternative5",
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
        )

    public val usersAddSocialAccountForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/add-social-account-for-authenticated-user",
          method = "POST",
          path = "/user/social_accounts",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-social-account-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-social-account-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-social-account-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-social-account-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-social-account-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/add-social-account-for-authenticated-user.response.alternative5",
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
        )

    public val usersBlockMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/block",
          method = "PUT",
          path = "/user/blocks/{username}",
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
              id = "users/block.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/block.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/block.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/block.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/block.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/block.response.alternative5",
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
        )

    public val usersCheckBlockedMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/check-blocked",
          method = "GET",
          path = "/user/blocks/{username}",
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
              id = "users/check-blocked.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-blocked.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-blocked.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-blocked.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-blocked.response.alternative4",
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
        )

    public val usersCheckFollowingForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/check-following-for-user",
          method = "GET",
          path = "/users/{username}/following/{target_user}",
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
              id = "users/check-following-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-following-for-user.response.alternative1",
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
        )

    public val usersCheckPersonIsFollowedByAuthenticatedMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/check-person-is-followed-by-authenticated",
          method = "GET",
          path = "/user/following/{username}",
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
              id = "users/check-person-is-followed-by-authenticated.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-person-is-followed-by-authenticated.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-person-is-followed-by-authenticated.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-person-is-followed-by-authenticated.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/check-person-is-followed-by-authenticated.response.alternative4",
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
        )

    public val usersCreateGpgKeyForAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/create-gpg-key-for-authenticated-user",
          method = "POST",
          path = "/user/gpg_keys",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "GpgKey",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-gpg-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-gpg-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-gpg-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-gpg-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-gpg-key-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-gpg-key-for-authenticated-user.response.alternative5",
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
        )

    public val usersCreatePublicSshKeyForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/create-public-ssh-key-for-authenticated-user",
          method = "POST",
          path = "/user/keys",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Key",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-public-ssh-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-public-ssh-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-public-ssh-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-public-ssh-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-public-ssh-key-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-public-ssh-key-for-authenticated-user.response.alternative5",
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
        )

    public val usersCreateSshSigningKeyForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/create-ssh-signing-key-for-authenticated-user",
          method = "POST",
          path = "/user/ssh_signing_keys",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "SshSigningKey",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-ssh-signing-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-ssh-signing-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-ssh-signing-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-ssh-signing-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-ssh-signing-key-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/create-ssh-signing-key-for-authenticated-user.response.alternative5",
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
        )

    public val usersDeleteAttestationsBulkMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/delete-attestations-bulk",
          method = "POST",
          path = "/users/{username}/attestations/delete-request",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-bulk.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-bulk.response.alternative1",
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
        )

    public val usersDeleteAttestationsByIdMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/delete-attestations-by-id",
          method = "DELETE",
          path = "/users/{username}/attestations/{attestation_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-by-id.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-by-id.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-by-id.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-by-id.response.alternative3",
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
        )

    public val usersDeleteAttestationsBySubjectDigestMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/delete-attestations-by-subject-digest",
          method = "DELETE",
          path = "/users/{username}/attestations/digest/{subject_digest}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-by-subject-digest.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-by-subject-digest.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-attestations-by-subject-digest.response.alternative2",
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
        )

    public val usersDeleteEmailForAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/delete-email-for-authenticated-user",
          method = "DELETE",
          path = "/user/emails",
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
              id = "users/delete-email-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-email-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-email-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-email-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-email-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-email-for-authenticated-user.response.alternative5",
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
        )

    public val usersDeleteGpgKeyForAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/delete-gpg-key-for-authenticated-user",
          method = "DELETE",
          path = "/user/gpg_keys/{gpg_key_id}",
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
              id = "users/delete-gpg-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-gpg-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-gpg-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-gpg-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-gpg-key-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-gpg-key-for-authenticated-user.response.alternative5",
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
        )

    public val usersDeletePublicSshKeyForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/delete-public-ssh-key-for-authenticated-user",
          method = "DELETE",
          path = "/user/keys/{key_id}",
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
              id = "users/delete-public-ssh-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-public-ssh-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-public-ssh-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-public-ssh-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-public-ssh-key-for-authenticated-user.response.alternative4",
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
        )

    public val usersDeleteSocialAccountForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/delete-social-account-for-authenticated-user",
          method = "DELETE",
          path = "/user/social_accounts",
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
              id = "users/delete-social-account-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-social-account-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-social-account-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-social-account-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-social-account-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-social-account-for-authenticated-user.response.alternative5",
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
        )

    public val usersDeleteSshSigningKeyForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/delete-ssh-signing-key-for-authenticated-user",
          method = "DELETE",
          path = "/user/ssh_signing_keys/{ssh_signing_key_id}",
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
              id = "users/delete-ssh-signing-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-ssh-signing-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-ssh-signing-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-ssh-signing-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/delete-ssh-signing-key-for-authenticated-user.response.alternative4",
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
        )

    public val usersFollowMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/follow",
          method = "PUT",
          path = "/user/following/{username}",
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
              id = "users/follow.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/follow.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/follow.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/follow.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/follow.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/follow.response.alternative5",
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
        )

    public val usersGetAuthenticatedMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/get-authenticated",
          method = "GET",
          path = "/user",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserGetResponse200JsonX3a7d2450",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-authenticated.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-authenticated.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-authenticated.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-authenticated.response.alternative3",
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
        )

    public val usersGetByIdMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/get-by-id",
          method = "GET",
          path = "/user/{account_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserGetResponse200JsonX7ddb2065",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-by-id.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-by-id.response.alternative1",
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
        )

    public val usersGetByUsernameMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/get-by-username",
          method = "GET",
          path = "/users/{username}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUsersGetResponse200JsonX661510a1",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-by-username.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-by-username.response.alternative1",
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
        )

    public val usersGetContextForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/get-context-for-user",
          method = "GET",
          path = "/users/{username}/hovercard",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Hovercard",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-context-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-context-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-context-for-user.response.alternative2",
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
        )

    public val usersGetGpgKeyForAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/get-gpg-key-for-authenticated-user",
          method = "GET",
          path = "/user/gpg_keys/{gpg_key_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GpgKey",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-gpg-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-gpg-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-gpg-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-gpg-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-gpg-key-for-authenticated-user.response.alternative4",
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
        )

    public val usersGetPublicSshKeyForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/get-public-ssh-key-for-authenticated-user",
          method = "GET",
          path = "/user/keys/{key_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Key",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-public-ssh-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-public-ssh-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-public-ssh-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-public-ssh-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-public-ssh-key-for-authenticated-user.response.alternative4",
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
        )

    public val usersGetSshSigningKeyForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/get-ssh-signing-key-for-authenticated-user",
          method = "GET",
          path = "/user/ssh_signing_keys/{ssh_signing_key_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SshSigningKey",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-ssh-signing-key-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-ssh-signing-key-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-ssh-signing-key-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-ssh-signing-key-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/get-ssh-signing-key-for-authenticated-user.response.alternative4",
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
        )

    public val usersListMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list",
          method = "GET",
          path = "/users",
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
              id = "users/list.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list.response.alternative1",
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
        )

    public val usersListAttestationsMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-attestations",
          method = "GET",
          path = "/users/{username}/attestations/{subject_digest}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUsersAttestationsGetResponse200JsonX8bc4be52",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-attestations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-attestations.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-attestations.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-attestations.response.alternative3",
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
        )

    public val usersListAttestationsBulkMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-attestations-bulk",
          method = "POST",
          path = "/users/{username}/attestations/bulk-list",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUsersAttestationsBulkListPostResponse200JsonXd1deca67",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-attestations-bulk.response.alternative0",
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
        )

    public val usersListBlockedByAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-blocked-by-authenticated-user",
          method = "GET",
          path = "/user/blocks",
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
              id = "users/list-blocked-by-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-blocked-by-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-blocked-by-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-blocked-by-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-blocked-by-authenticated-user.response.alternative4",
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
        )

    public val usersListEmailsForAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-emails-for-authenticated-user",
          method = "GET",
          path = "/user/emails",
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
              id = "users/list-emails-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-emails-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-emails-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-emails-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-emails-for-authenticated-user.response.alternative4",
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
        )

    public val usersListFollowedByAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-followed-by-authenticated-user",
          method = "GET",
          path = "/user/following",
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
              id = "users/list-followed-by-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-followed-by-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-followed-by-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-followed-by-authenticated-user.response.alternative3",
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
        )

    public val usersListFollowersForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/list-followers-for-authenticated-user",
          method = "GET",
          path = "/user/followers",
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
              id = "users/list-followers-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-followers-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-followers-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-followers-for-authenticated-user.response.alternative3",
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
        )

    public val usersListFollowersForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-followers-for-user",
          method = "GET",
          path = "/users/{username}/followers",
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
              id = "users/list-followers-for-user.response.alternative0",
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
        )

    public val usersListFollowingForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-following-for-user",
          method = "GET",
          path = "/users/{username}/following",
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
              id = "users/list-following-for-user.response.alternative0",
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
        )

    public val usersListGpgKeysForAuthenticatedUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-gpg-keys-for-authenticated-user",
          method = "GET",
          path = "/user/gpg_keys",
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
              id = "users/list-gpg-keys-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-gpg-keys-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-gpg-keys-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-gpg-keys-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-gpg-keys-for-authenticated-user.response.alternative4",
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
        )

    public val usersListGpgKeysForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-gpg-keys-for-user",
          method = "GET",
          path = "/users/{username}/gpg_keys",
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
              id = "users/list-gpg-keys-for-user.response.alternative0",
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
        )

    public val usersListPublicEmailsForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/list-public-emails-for-authenticated-user",
          method = "GET",
          path = "/user/public_emails",
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
              id = "users/list-public-emails-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-public-emails-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-public-emails-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-public-emails-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-public-emails-for-authenticated-user.response.alternative4",
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
        )

    public val usersListPublicKeysForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-public-keys-for-user",
          method = "GET",
          path = "/users/{username}/keys",
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
              id = "users/list-public-keys-for-user.response.alternative0",
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
        )

    public val usersListPublicSshKeysForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/list-public-ssh-keys-for-authenticated-user",
          method = "GET",
          path = "/user/keys",
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
              id = "users/list-public-ssh-keys-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-public-ssh-keys-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-public-ssh-keys-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-public-ssh-keys-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-public-ssh-keys-for-authenticated-user.response.alternative4",
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
        )

    public val usersListSocialAccountsForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/list-social-accounts-for-authenticated-user",
          method = "GET",
          path = "/user/social_accounts",
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
              id = "users/list-social-accounts-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-social-accounts-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-social-accounts-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-social-accounts-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-social-accounts-for-authenticated-user.response.alternative4",
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
        )

    public val usersListSocialAccountsForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-social-accounts-for-user",
          method = "GET",
          path = "/users/{username}/social_accounts",
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
              id = "users/list-social-accounts-for-user.response.alternative0",
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
        )

    public val usersListSshSigningKeysForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/list-ssh-signing-keys-for-authenticated-user",
          method = "GET",
          path = "/user/ssh_signing_keys",
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
              id = "users/list-ssh-signing-keys-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-ssh-signing-keys-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-ssh-signing-keys-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-ssh-signing-keys-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/list-ssh-signing-keys-for-authenticated-user.response.alternative4",
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
        )

    public val usersListSshSigningKeysForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/list-ssh-signing-keys-for-user",
          method = "GET",
          path = "/users/{username}/ssh_signing_keys",
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
              id = "users/list-ssh-signing-keys-for-user.response.alternative0",
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
        )

    public val usersSetPrimaryEmailVisibilityForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "users/set-primary-email-visibility-for-authenticated-user",
          method = "PATCH",
          path = "/user/email/visibility",
          requestMediaTypes = listOf("application/json"),
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
              id = "users/set-primary-email-visibility-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/set-primary-email-visibility-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/set-primary-email-visibility-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/set-primary-email-visibility-for-authenticated-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/set-primary-email-visibility-for-authenticated-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/set-primary-email-visibility-for-authenticated-user.response.alternative5",
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
        )

    public val usersUnblockMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/unblock",
          method = "DELETE",
          path = "/user/blocks/{username}",
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
              id = "users/unblock.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/unblock.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/unblock.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/unblock.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/unblock.response.alternative4",
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
        )

    public val usersUnfollowMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/unfollow",
          method = "DELETE",
          path = "/user/following/{username}",
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
              id = "users/unfollow.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/unfollow.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/unfollow.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/unfollow.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/unfollow.response.alternative4",
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
        )

    public val usersUpdateAuthenticatedMetadata: OperationMetadata = OperationMetadata(
          operationId = "users/update-authenticated",
          method = "PATCH",
          path = "/user",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PrivateUser",
              mode = SdkResponseMode.BUFFERED,
              id = "users/update-authenticated.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "users/update-authenticated.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/update-authenticated.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/update-authenticated.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/update-authenticated.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "users/update-authenticated.response.alternative5",
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
        )
  }
}
