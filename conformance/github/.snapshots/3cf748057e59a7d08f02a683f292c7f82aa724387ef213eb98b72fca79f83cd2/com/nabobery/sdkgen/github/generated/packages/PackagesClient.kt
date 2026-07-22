package com.nabobery.sdkgen.github.generated.packages

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineOrgsPackagesGetParameterX8c84fd39
import com.nabobery.sdkgen.github.generated.InlineOrgsPackagesVersionsGetParameterXd8d02a6e
import com.nabobery.sdkgen.github.generated.InlinePackageTypeParameterX5582ba81
import com.nabobery.sdkgen.github.generated.InlinePackageVisibilityParameterX31044377
import com.nabobery.sdkgen.github.generated.InlineUserPackagesGetParameterX6bfbea6f
import com.nabobery.sdkgen.github.generated.InlineUserPackagesVersionsGetParameterX0b6ef6af
import com.nabobery.sdkgen.github.generated.InlineUsersPackagesGetParameterX62329c45
import com.nabobery.sdkgen.github.generated.PackageValue
import com.nabobery.sdkgen.github.generated.PackageVersion
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

public object PackagesCodecs {
  private val packagesDeletePackageForAuthenticatedUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForAuthenticatedUserResponseCodecAlternative1Codec)

  private val packagesDeletePackageForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForAuthenticatedUserResponseCodecAlternative2Codec)

  private val packagesDeletePackageForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForAuthenticatedUserResponseCodecAlternative3Codec)

  public val packagesDeletePackageForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesDeletePackageForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val packagesDeletePackageForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/delete-package-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForOrgResponseCodecAlternative1Codec)

  private val packagesDeletePackageForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/delete-package-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForOrgResponseCodecAlternative2Codec)

  private val packagesDeletePackageForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/delete-package-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForOrgResponseCodecAlternative3Codec)

  public val packagesDeletePackageForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesDeletePackageForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val packagesDeletePackageForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/delete-package-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForUserResponseCodecAlternative1Codec)

  private val packagesDeletePackageForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/delete-package-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForUserResponseCodecAlternative2Codec)

  private val packagesDeletePackageForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/delete-package-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageForUserResponseCodecAlternative3Codec)

  public val packagesDeletePackageForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesDeletePackageForUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative1Codec)

  private val packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative2Codec)

  private val packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative3Codec)

  public val packagesDeletePackageVersionForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesDeletePackageVersionForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val packagesDeletePackageVersionForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForOrgResponseCodecAlternative1Codec)

  private val packagesDeletePackageVersionForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForOrgResponseCodecAlternative2Codec)

  private val packagesDeletePackageVersionForOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForOrgResponseCodecAlternative3Codec)

  public val packagesDeletePackageVersionForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesDeletePackageVersionForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val packagesDeletePackageVersionForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForUserResponseCodecAlternative1Codec)

  private val packagesDeletePackageVersionForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForUserResponseCodecAlternative2Codec)

  private val packagesDeletePackageVersionForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/delete-package-version-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesDeletePackageVersionForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesDeletePackageVersionForUserResponseCodecAlternative3Codec)

  public val packagesDeletePackageVersionForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesDeletePackageVersionForUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public const val PACKAGESGETALLPACKAGEVERSIONSFORPACKAGEOWNEDBYAUTHENTICATEDUSER_RESPONSE_CODEC_ID:
      String = "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response"

  private val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<PackageVersion>> =
      KotlinxSerializationCodec(PACKAGESGETALLPACKAGEVERSIONSFORPACKAGEOWNEDBYAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(PackageVersion.Serializer), SdkJson)

  private val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageVersion>> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative0", ListSerializer(PackageVersion.Serializer), SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageVersion>> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative0Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative1Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative2Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative3Codec)

  public val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageVersion>> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodec)

  public const val PACKAGESGETALLPACKAGEVERSIONSFORPACKAGEOWNEDBYORG_RESPONSE_CODEC_ID: String =
      "packages/get-all-package-versions-for-package-owned-by-org.response"

  private val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodec:
      MediaTypeCodec<List<PackageVersion>> =
      KotlinxSerializationCodec(PACKAGESGETALLPACKAGEVERSIONSFORPACKAGEOWNEDBYORG_RESPONSE_CODEC_ID, ListSerializer(PackageVersion.Serializer), SdkJson)

  private val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageVersion>> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-org.response.alternative0", ListSerializer(PackageVersion.Serializer), SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageVersion>> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative0Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative1Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-org.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative2Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-org.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative3Codec)

  public val packagesGetAllPackageVersionsForPackageOwnedByOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageVersion>> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodec)

  public const val PACKAGESGETALLPACKAGEVERSIONSFORPACKAGEOWNEDBYUSER_RESPONSE_CODEC_ID: String =
      "packages/get-all-package-versions-for-package-owned-by-user.response"

  private val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodec:
      MediaTypeCodec<List<PackageVersion>> =
      KotlinxSerializationCodec(PACKAGESGETALLPACKAGEVERSIONSFORPACKAGEOWNEDBYUSER_RESPONSE_CODEC_ID, ListSerializer(PackageVersion.Serializer), SdkJson)

  private val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageVersion>> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-user.response.alternative0", ListSerializer(PackageVersion.Serializer), SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageVersion>> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative0Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative1Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative2Codec)

  private val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/get-all-package-versions-for-package-owned-by-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative3Codec)

  public val packagesGetAllPackageVersionsForPackageOwnedByUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageVersion>> =
      MediaTypeCodecRegistry.of(packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodec)

  public const val PACKAGESGETPACKAGEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "packages/get-package-for-authenticated-user.response"

  private val packagesGetPackageForAuthenticatedUserResponseCodec: MediaTypeCodec<PackageValue> =
      KotlinxSerializationCodec(PACKAGESGETPACKAGEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, PackageValue.Serializer, SdkJson)

  private val packagesGetPackageForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<PackageValue> =
      KotlinxSerializationCodec("packages/get-package-for-authenticated-user.response.alternative0", PackageValue.Serializer, SdkJson)

  public val packagesGetPackageForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PackageValue> =
      MediaTypeCodecRegistry.of(packagesGetPackageForAuthenticatedUserResponseCodecAlternative0Codec)

  public val packagesGetPackageForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesGetPackageForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<PackageValue> =
      MediaTypeCodecRegistry.of(packagesGetPackageForAuthenticatedUserResponseCodec)

  public const val PACKAGESGETPACKAGEFORORGANIZATION_RESPONSE_CODEC_ID: String =
      "packages/get-package-for-organization.response"

  private val packagesGetPackageForOrganizationResponseCodec: MediaTypeCodec<PackageValue> =
      KotlinxSerializationCodec(PACKAGESGETPACKAGEFORORGANIZATION_RESPONSE_CODEC_ID, PackageValue.Serializer, SdkJson)

  private val packagesGetPackageForOrganizationResponseCodecAlternative0Codec:
      MediaTypeCodec<PackageValue> =
      KotlinxSerializationCodec("packages/get-package-for-organization.response.alternative0", PackageValue.Serializer, SdkJson)

  public val packagesGetPackageForOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PackageValue> =
      MediaTypeCodecRegistry.of(packagesGetPackageForOrganizationResponseCodecAlternative0Codec)

  public val packagesGetPackageForOrganizationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesGetPackageForOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<PackageValue> =
      MediaTypeCodecRegistry.of(packagesGetPackageForOrganizationResponseCodec)

  public const val PACKAGESGETPACKAGEFORUSER_RESPONSE_CODEC_ID: String =
      "packages/get-package-for-user.response"

  private val packagesGetPackageForUserResponseCodec: MediaTypeCodec<PackageValue> =
      KotlinxSerializationCodec(PACKAGESGETPACKAGEFORUSER_RESPONSE_CODEC_ID, PackageValue.Serializer, SdkJson)

  private val packagesGetPackageForUserResponseCodecAlternative0Codec: MediaTypeCodec<PackageValue>
      =
      KotlinxSerializationCodec("packages/get-package-for-user.response.alternative0", PackageValue.Serializer, SdkJson)

  public val packagesGetPackageForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PackageValue> =
      MediaTypeCodecRegistry.of(packagesGetPackageForUserResponseCodecAlternative0Codec)

  public val packagesGetPackageForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesGetPackageForUserResponseCodecRegistry: MediaTypeCodecRegistry<PackageValue> =
      MediaTypeCodecRegistry.of(packagesGetPackageForUserResponseCodec)

  public const val PACKAGESGETPACKAGEVERSIONFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "packages/get-package-version-for-authenticated-user.response"

  private val packagesGetPackageVersionForAuthenticatedUserResponseCodec:
      MediaTypeCodec<PackageVersion> =
      KotlinxSerializationCodec(PACKAGESGETPACKAGEVERSIONFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, PackageVersion.Serializer, SdkJson)

  private val packagesGetPackageVersionForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<PackageVersion> =
      KotlinxSerializationCodec("packages/get-package-version-for-authenticated-user.response.alternative0", PackageVersion.Serializer, SdkJson)

  public val packagesGetPackageVersionForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PackageVersion> =
      MediaTypeCodecRegistry.of(packagesGetPackageVersionForAuthenticatedUserResponseCodecAlternative0Codec)

  public val packagesGetPackageVersionForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesGetPackageVersionForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<PackageVersion> =
      MediaTypeCodecRegistry.of(packagesGetPackageVersionForAuthenticatedUserResponseCodec)

  public const val PACKAGESGETPACKAGEVERSIONFORORGANIZATION_RESPONSE_CODEC_ID: String =
      "packages/get-package-version-for-organization.response"

  private val packagesGetPackageVersionForOrganizationResponseCodec: MediaTypeCodec<PackageVersion>
      =
      KotlinxSerializationCodec(PACKAGESGETPACKAGEVERSIONFORORGANIZATION_RESPONSE_CODEC_ID, PackageVersion.Serializer, SdkJson)

  private val packagesGetPackageVersionForOrganizationResponseCodecAlternative0Codec:
      MediaTypeCodec<PackageVersion> =
      KotlinxSerializationCodec("packages/get-package-version-for-organization.response.alternative0", PackageVersion.Serializer, SdkJson)

  public val packagesGetPackageVersionForOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PackageVersion> =
      MediaTypeCodecRegistry.of(packagesGetPackageVersionForOrganizationResponseCodecAlternative0Codec)

  public val packagesGetPackageVersionForOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesGetPackageVersionForOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<PackageVersion> =
      MediaTypeCodecRegistry.of(packagesGetPackageVersionForOrganizationResponseCodec)

  public const val PACKAGESGETPACKAGEVERSIONFORUSER_RESPONSE_CODEC_ID: String =
      "packages/get-package-version-for-user.response"

  private val packagesGetPackageVersionForUserResponseCodec: MediaTypeCodec<PackageVersion> =
      KotlinxSerializationCodec(PACKAGESGETPACKAGEVERSIONFORUSER_RESPONSE_CODEC_ID, PackageVersion.Serializer, SdkJson)

  private val packagesGetPackageVersionForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<PackageVersion> =
      KotlinxSerializationCodec("packages/get-package-version-for-user.response.alternative0", PackageVersion.Serializer, SdkJson)

  public val packagesGetPackageVersionForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PackageVersion> =
      MediaTypeCodecRegistry.of(packagesGetPackageVersionForUserResponseCodecAlternative0Codec)

  public val packagesGetPackageVersionForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesGetPackageVersionForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<PackageVersion> =
      MediaTypeCodecRegistry.of(packagesGetPackageVersionForUserResponseCodec)

  public const val PACKAGESLISTDOCKERMIGRATIONCONFLICTINGPACKAGESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID:
      String = "packages/list-docker-migration-conflicting-packages-for-authenticated-user.response"

  private val packagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec(PACKAGESLISTDOCKERMIGRATIONCONFLICTINGPACKAGESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(PackageValue.Serializer), SdkJson)

  private val packagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec("packages/list-docker-migration-conflicting-packages-for-authenticated-user.response.alternative0", ListSerializer(PackageValue.Serializer), SdkJson)

  public val packagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseCodecAlternative0Codec)

  public val packagesListDockerMigrationConflictingPackagesForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseCodec)

  public const val PACKAGESLISTDOCKERMIGRATIONCONFLICTINGPACKAGESFORORGANIZATION_RESPONSE_CODEC_ID:
      String = "packages/list-docker-migration-conflicting-packages-for-organization.response"

  private val packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec(PACKAGESLISTDOCKERMIGRATIONCONFLICTINGPACKAGESFORORGANIZATION_RESPONSE_CODEC_ID, ListSerializer(PackageValue.Serializer), SdkJson)

  private val packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec("packages/list-docker-migration-conflicting-packages-for-organization.response.alternative0", ListSerializer(PackageValue.Serializer), SdkJson)

  public val packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative0Codec)

  private val packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/list-docker-migration-conflicting-packages-for-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative1Codec)

  private val packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/list-docker-migration-conflicting-packages-for-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative2Codec)

  public val packagesListDockerMigrationConflictingPackagesForOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodec)

  public const val PACKAGESLISTDOCKERMIGRATIONCONFLICTINGPACKAGESFORUSER_RESPONSE_CODEC_ID: String =
      "packages/list-docker-migration-conflicting-packages-for-user.response"

  private val packagesListDockerMigrationConflictingPackagesForUserResponseCodec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec(PACKAGESLISTDOCKERMIGRATIONCONFLICTINGPACKAGESFORUSER_RESPONSE_CODEC_ID, ListSerializer(PackageValue.Serializer), SdkJson)

  private val packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec("packages/list-docker-migration-conflicting-packages-for-user.response.alternative0", ListSerializer(PackageValue.Serializer), SdkJson)

  public val packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative0Codec)

  private val packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/list-docker-migration-conflicting-packages-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative1Codec)

  private val packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/list-docker-migration-conflicting-packages-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative2Codec)

  public val packagesListDockerMigrationConflictingPackagesForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesListDockerMigrationConflictingPackagesForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListDockerMigrationConflictingPackagesForUserResponseCodec)

  public const val PACKAGESLISTPACKAGESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "packages/list-packages-for-authenticated-user.response"

  private val packagesListPackagesForAuthenticatedUserResponseCodec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec(PACKAGESLISTPACKAGESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(PackageValue.Serializer), SdkJson)

  private val packagesListPackagesForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec("packages/list-packages-for-authenticated-user.response.alternative0", ListSerializer(PackageValue.Serializer), SdkJson)

  public val packagesListPackagesForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListPackagesForAuthenticatedUserResponseCodecAlternative0Codec)

  public val packagesListPackagesForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesListPackagesForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListPackagesForAuthenticatedUserResponseCodec)

  public const val PACKAGESLISTPACKAGESFORORGANIZATION_RESPONSE_CODEC_ID: String =
      "packages/list-packages-for-organization.response"

  private val packagesListPackagesForOrganizationResponseCodec: MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec(PACKAGESLISTPACKAGESFORORGANIZATION_RESPONSE_CODEC_ID, ListSerializer(PackageValue.Serializer), SdkJson)

  private val packagesListPackagesForOrganizationResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec("packages/list-packages-for-organization.response.alternative0", ListSerializer(PackageValue.Serializer), SdkJson)

  public val packagesListPackagesForOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListPackagesForOrganizationResponseCodecAlternative0Codec)

  private val packagesListPackagesForOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/list-packages-for-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesListPackagesForOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesListPackagesForOrganizationResponseCodecAlternative2Codec)

  private val packagesListPackagesForOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/list-packages-for-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesListPackagesForOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesListPackagesForOrganizationResponseCodecAlternative3Codec)

  public val packagesListPackagesForOrganizationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesListPackagesForOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListPackagesForOrganizationResponseCodec)

  public const val PACKAGESLISTPACKAGESFORUSER_RESPONSE_CODEC_ID: String =
      "packages/list-packages-for-user.response"

  private val packagesListPackagesForUserResponseCodec: MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec(PACKAGESLISTPACKAGESFORUSER_RESPONSE_CODEC_ID, ListSerializer(PackageValue.Serializer), SdkJson)

  private val packagesListPackagesForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<PackageValue>> =
      KotlinxSerializationCodec("packages/list-packages-for-user.response.alternative0", ListSerializer(PackageValue.Serializer), SdkJson)

  public val packagesListPackagesForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListPackagesForUserResponseCodecAlternative0Codec)

  private val packagesListPackagesForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/list-packages-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesListPackagesForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesListPackagesForUserResponseCodecAlternative2Codec)

  private val packagesListPackagesForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/list-packages-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesListPackagesForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesListPackagesForUserResponseCodecAlternative3Codec)

  public val packagesListPackagesForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesListPackagesForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<PackageValue>> =
      MediaTypeCodecRegistry.of(packagesListPackagesForUserResponseCodec)

  private val packagesRestorePackageForAuthenticatedUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForAuthenticatedUserResponseCodecAlternative1Codec)

  private val packagesRestorePackageForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForAuthenticatedUserResponseCodecAlternative2Codec)

  private val packagesRestorePackageForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForAuthenticatedUserResponseCodecAlternative3Codec)

  public val packagesRestorePackageForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesRestorePackageForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val packagesRestorePackageForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/restore-package-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForOrgResponseCodecAlternative1Codec)

  private val packagesRestorePackageForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/restore-package-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForOrgResponseCodecAlternative2Codec)

  private val packagesRestorePackageForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("packages/restore-package-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForOrgResponseCodecAlternative3Codec)

  public val packagesRestorePackageForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesRestorePackageForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val packagesRestorePackageForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForUserResponseCodecAlternative1Codec)

  private val packagesRestorePackageForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForUserResponseCodecAlternative2Codec)

  private val packagesRestorePackageForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageForUserResponseCodecAlternative3Codec)

  public val packagesRestorePackageForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesRestorePackageForUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-authenticated-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative1Codec)

  private val packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative2Codec)

  private val packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative3Codec)

  public val packagesRestorePackageVersionForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val packagesRestorePackageVersionForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val packagesRestorePackageVersionForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForOrgResponseCodecAlternative1Codec)

  private val packagesRestorePackageVersionForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForOrgResponseCodecAlternative2Codec)

  private val packagesRestorePackageVersionForOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForOrgResponseCodecAlternative3Codec)

  public val packagesRestorePackageVersionForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val packagesRestorePackageVersionForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  private val packagesRestorePackageVersionForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForUserResponseCodecAlternative1Codec)

  private val packagesRestorePackageVersionForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForUserResponseCodecAlternative2Codec)

  private val packagesRestorePackageVersionForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("packages/restore-package-version-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val packagesRestorePackageVersionForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(packagesRestorePackageVersionForUserResponseCodecAlternative3Codec)

  public val packagesRestorePackageVersionForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val packagesRestorePackageVersionForUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'packages' group of GitHub v3 REST API.
 */
public class PackagesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@PackagesClient.authentication)

  /**
   * Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package
   * has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesDeletePackageForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded PackagesDeletePackageForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesDeletePackageForAuthenticatedUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesDeletePackageForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(packagesDeletePackageForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesDeletePackageForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = PackagesDeletePackageForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesDeletePackageForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is PackagesDeletePackageForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesDeletePackageForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesDeletePackageForAuthenticatedUserResponse.Http401Json -> PackagesDeletePackageForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesDeletePackageForAuthenticatedUserResponse.Http403Json -> PackagesDeletePackageForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesDeletePackageForAuthenticatedUserResponse.Http404Json -> PackagesDeletePackageForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesDeletePackageForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package
   * has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesDeletePackageForAuthenticatedUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesDeletePackageForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesDeletePackageForAuthenticatedUserResponse>(SdkExecutionRequest(packagesDeletePackageForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
  }), PackagesCodecs.packagesDeletePackageForAuthenticatedUserRequestCodecRegistry, PackagesDeletePackageForAuthenticatedUserResponseDecoder, options)

  /**
   * Deletes an entire package in an organization. You cannot delete a public package if any version of the package has
   * more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint. If the `package_type`
   * belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have
   * admin permissions to the package. For the list of these registries, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesDeletePackageForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PackagesDeletePackageForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesDeletePackageForOrg(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesDeletePackageForOrgResponse, Unit>(
    request = SdkExecutionRequest(packagesDeletePackageForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesDeletePackageForOrgRequestCodecRegistry,
    responseDecoder = PackagesDeletePackageForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesDeletePackageForOrgResponse.SuccessNoContent -> response.unit
        is PackagesDeletePackageForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesDeletePackageForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesDeletePackageForOrgResponse.Http401Json -> PackagesDeletePackageForOrgApiException(response, statusCode, headers)
        is PackagesDeletePackageForOrgResponse.Http403Json -> PackagesDeletePackageForOrgApiException(response, statusCode, headers)
        is PackagesDeletePackageForOrgResponse.Http404Json -> PackagesDeletePackageForOrgApiException(response, statusCode, headers)
        is PackagesDeletePackageForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes an entire package in an organization. You cannot delete a public package if any version of the package has
   * more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint. If the `package_type`
   * belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have
   * admin permissions to the package. For the list of these registries, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesDeletePackageForOrgWithResponse(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesDeletePackageForOrgResponse> = executor.executeWithResponse<Unit, PackagesDeletePackageForOrgResponse>(SdkExecutionRequest(packagesDeletePackageForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
  }), PackagesCodecs.packagesDeletePackageForOrgRequestCodecRegistry, PackagesDeletePackageForOrgResponseDecoder, options)

  /**
   * Deletes an entire package for a user. You cannot delete a public package if any version of the package has more
   * than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
   *
   * If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, the authenticated
   * user must have admin permissions to the package. For the list of these registries, see "[About permissions for
   * GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesDeletePackageForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PackagesDeletePackageForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesDeletePackageForUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesDeletePackageForUserResponse, Unit>(
    request = SdkExecutionRequest(packagesDeletePackageForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesDeletePackageForUserRequestCodecRegistry,
    responseDecoder = PackagesDeletePackageForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesDeletePackageForUserResponse.SuccessNoContent -> response.unit
        is PackagesDeletePackageForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesDeletePackageForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesDeletePackageForUserResponse.Http401Json -> PackagesDeletePackageForUserApiException(response, statusCode, headers)
        is PackagesDeletePackageForUserResponse.Http403Json -> PackagesDeletePackageForUserApiException(response, statusCode, headers)
        is PackagesDeletePackageForUserResponse.Http404Json -> PackagesDeletePackageForUserApiException(response, statusCode, headers)
        is PackagesDeletePackageForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes an entire package for a user. You cannot delete a public package if any version of the package has more
   * than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
   *
   * If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, the authenticated
   * user must have admin permissions to the package. For the list of these registries, see "[About permissions for
   * GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesDeletePackageForUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesDeletePackageForUserResponse> = executor.executeWithResponse<Unit, PackagesDeletePackageForUserResponse>(SdkExecutionRequest(packagesDeletePackageForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), PackagesCodecs.packagesDeletePackageForUserRequestCodecRegistry, PackagesDeletePackageForUserResponseDecoder, options)

  /**
   * Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the
   * package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact
   * GitHub support for further assistance.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesDeletePackageVersionForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * PackagesDeletePackageVersionForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesDeletePackageVersionForAuthenticatedUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesDeletePackageVersionForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(packagesDeletePackageVersionForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesDeletePackageVersionForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = PackagesDeletePackageVersionForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.Http401Json -> PackagesDeletePackageVersionForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.Http403Json -> PackagesDeletePackageVersionForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.Http404Json -> PackagesDeletePackageVersionForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the
   * package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact
   * GitHub support for further assistance.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesDeletePackageVersionForAuthenticatedUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesDeletePackageVersionForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesDeletePackageVersionForAuthenticatedUserResponse>(SdkExecutionRequest(packagesDeletePackageVersionForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
  }), PackagesCodecs.packagesDeletePackageVersionForAuthenticatedUserRequestCodecRegistry, PackagesDeletePackageVersionForAuthenticatedUserResponseDecoder, options)

  /**
   * Deletes a specific package version in an organization. If the package is public and the package version has more
   * than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further
   * assistance.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint. If the `package_type`
   * belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have
   * admin permissions to the package. For the list of these registries, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesDeletePackageVersionForOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded PackagesDeletePackageVersionForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesDeletePackageVersionForOrg(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesDeletePackageVersionForOrgResponse, Unit>(
    request = SdkExecutionRequest(packagesDeletePackageVersionForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesDeletePackageVersionForOrgRequestCodecRegistry,
    responseDecoder = PackagesDeletePackageVersionForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesDeletePackageVersionForOrgResponse.SuccessNoContent -> response.unit
        is PackagesDeletePackageVersionForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesDeletePackageVersionForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesDeletePackageVersionForOrgResponse.Http401Json -> PackagesDeletePackageVersionForOrgApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForOrgResponse.Http403Json -> PackagesDeletePackageVersionForOrgApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForOrgResponse.Http404Json -> PackagesDeletePackageVersionForOrgApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a specific package version in an organization. If the package is public and the package version has more
   * than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further
   * assistance.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint. If the `package_type`
   * belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have
   * admin permissions to the package. For the list of these registries, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesDeletePackageVersionForOrgWithResponse(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesDeletePackageVersionForOrgResponse> = executor.executeWithResponse<Unit, PackagesDeletePackageVersionForOrgResponse>(SdkExecutionRequest(packagesDeletePackageVersionForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
  }), PackagesCodecs.packagesDeletePackageVersionForOrgRequestCodecRegistry, PackagesDeletePackageVersionForOrgResponseDecoder, options)

  /**
   * Deletes a specific package version for a user. If the package is public and the package version has more than 5,000
   * downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
   *
   * If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, the authenticated
   * user must have admin permissions to the package. For the list of these registries, see "[About permissions for
   * GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesDeletePackageVersionForUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded PackagesDeletePackageVersionForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesDeletePackageVersionForUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesDeletePackageVersionForUserResponse, Unit>(
    request = SdkExecutionRequest(packagesDeletePackageVersionForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesDeletePackageVersionForUserRequestCodecRegistry,
    responseDecoder = PackagesDeletePackageVersionForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesDeletePackageVersionForUserResponse.SuccessNoContent -> response.unit
        is PackagesDeletePackageVersionForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesDeletePackageVersionForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesDeletePackageVersionForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesDeletePackageVersionForUserResponse.Http401Json -> PackagesDeletePackageVersionForUserApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForUserResponse.Http403Json -> PackagesDeletePackageVersionForUserApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForUserResponse.Http404Json -> PackagesDeletePackageVersionForUserApiException(response, statusCode, headers)
        is PackagesDeletePackageVersionForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a specific package version for a user. If the package is public and the package version has more than 5,000
   * downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
   *
   * If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, the authenticated
   * user must have admin permissions to the package. For the list of these registries, see "[About permissions for
   * GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `delete:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesDeletePackageVersionForUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesDeletePackageVersionForUserResponse> = executor.executeWithResponse<Unit, PackagesDeletePackageVersionForUserResponse>(SdkExecutionRequest(packagesDeletePackageVersionForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), PackagesCodecs.packagesDeletePackageVersionForUserRequestCodecRegistry, PackagesDeletePackageVersionForUserResponseDecoder, options)

  /**
   * Lists package versions for a package owned by the authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserApiException When the service returns a
   * declared non-success response; its `error` property exposes the decoded
   * PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    page: Int? = null,
    perPage: Int? = null,
    state: InlineUserPackagesVersionsGetParameterX0b6ef6af? = null,
    options: CallOptions = CallOptions(),
  ): List<PackageVersion> = executor.executeWithTypedErrors<Unit, PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse, List<PackageVersion>>(
    request = SdkExecutionRequest(packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserRequestCodecRegistry,
    responseDecoder = PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.SuccessJson -> response.json
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http401Json -> PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http403Json -> PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http404Json -> PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists package versions for a package owned by the authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    page: Int? = null,
    perPage: Int? = null,
    state: InlineUserPackagesVersionsGetParameterX0b6ef6af? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse>(SdkExecutionRequest(packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserRequestCodecRegistry, PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseDecoder, options)

  /**
   * Lists package versions for a package owned by an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PackagesGetAllPackageVersionsForPackageOwnedByOrgApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * PackagesGetAllPackageVersionsForPackageOwnedByOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetAllPackageVersionsForPackageOwnedByOrg(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    page: Int? = null,
    perPage: Int? = null,
    state: InlineOrgsPackagesVersionsGetParameterXd8d02a6e? = null,
    options: CallOptions = CallOptions(),
  ): List<PackageVersion> = executor.executeWithTypedErrors<Unit, PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse, List<PackageVersion>>(
    request = SdkExecutionRequest(packagesGetAllPackageVersionsForPackageOwnedByOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByOrgRequestCodecRegistry,
    responseDecoder = PackagesGetAllPackageVersionsForPackageOwnedByOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.SuccessJson -> response.json
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http401Json -> PackagesGetAllPackageVersionsForPackageOwnedByOrgApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http403Json -> PackagesGetAllPackageVersionsForPackageOwnedByOrgApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http404Json -> PackagesGetAllPackageVersionsForPackageOwnedByOrgApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists package versions for a package owned by an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetAllPackageVersionsForPackageOwnedByOrgWithResponse(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    page: Int? = null,
    perPage: Int? = null,
    state: InlineOrgsPackagesVersionsGetParameterXd8d02a6e? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse> = executor.executeWithResponse<Unit, PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse>(SdkExecutionRequest(packagesGetAllPackageVersionsForPackageOwnedByOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByOrgRequestCodecRegistry, PackagesGetAllPackageVersionsForPackageOwnedByOrgResponseDecoder, options)

  /**
   * Lists package versions for a public package owned by a specified user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PackagesGetAllPackageVersionsForPackageOwnedByUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * PackagesGetAllPackageVersionsForPackageOwnedByUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetAllPackageVersionsForPackageOwnedByUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    username: String,
    options: CallOptions = CallOptions(),
  ): List<PackageVersion> = executor.executeWithTypedErrors<Unit, PackagesGetAllPackageVersionsForPackageOwnedByUserResponse, List<PackageVersion>>(
    request = SdkExecutionRequest(packagesGetAllPackageVersionsForPackageOwnedByUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByUserRequestCodecRegistry,
    responseDecoder = PackagesGetAllPackageVersionsForPackageOwnedByUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.SuccessJson -> response.json
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http401Json -> PackagesGetAllPackageVersionsForPackageOwnedByUserApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http403Json -> PackagesGetAllPackageVersionsForPackageOwnedByUserApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http404Json -> PackagesGetAllPackageVersionsForPackageOwnedByUserApiException(response, statusCode, headers)
        is PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists package versions for a public package owned by a specified user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetAllPackageVersionsForPackageOwnedByUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetAllPackageVersionsForPackageOwnedByUserResponse> = executor.executeWithResponse<Unit, PackagesGetAllPackageVersionsForPackageOwnedByUserResponse>(SdkExecutionRequest(packagesGetAllPackageVersionsForPackageOwnedByUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByUserRequestCodecRegistry, PackagesGetAllPackageVersionsForPackageOwnedByUserResponseDecoder, options)

  /**
   * Gets a specific package for a package owned by the authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetPackageForAuthenticatedUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    options: CallOptions = CallOptions(),
  ): PackageValue = executor.execute<Unit, PackageValue>(SdkExecutionRequest(packagesGetPackageForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
  }), listOf(PackagesCodecs.PACKAGESGETPACKAGEFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID), PackagesCodecs.packagesGetPackageForAuthenticatedUserRequestCodecRegistry, PackagesCodecs.packagesGetPackageForAuthenticatedUserResponseCodecRegistry, options)

  /**
   * Gets a specific package for a package owned by the authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetPackageForAuthenticatedUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetPackageForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesGetPackageForAuthenticatedUserResponse>(SdkExecutionRequest(packagesGetPackageForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
  }), PackagesCodecs.packagesGetPackageForAuthenticatedUserRequestCodecRegistry, PackagesGetPackageForAuthenticatedUserResponseDecoder, options)

  /**
   * Gets a specific package in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetPackageForOrganization(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    options: CallOptions = CallOptions(),
  ): PackageValue = executor.execute<Unit, PackageValue>(SdkExecutionRequest(packagesGetPackageForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
  }), listOf(PackagesCodecs.PACKAGESGETPACKAGEFORORGANIZATION_RESPONSE_CODEC_ID), PackagesCodecs.packagesGetPackageForOrganizationRequestCodecRegistry, PackagesCodecs.packagesGetPackageForOrganizationResponseCodecRegistry, options)

  /**
   * Gets a specific package in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetPackageForOrganizationWithResponse(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetPackageForOrganizationResponse> = executor.executeWithResponse<Unit, PackagesGetPackageForOrganizationResponse>(SdkExecutionRequest(packagesGetPackageForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
  }), PackagesCodecs.packagesGetPackageForOrganizationRequestCodecRegistry, PackagesGetPackageForOrganizationResponseDecoder, options)

  /**
   * Gets a specific package metadata for a public package owned by a user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetPackageForUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    username: String,
    options: CallOptions = CallOptions(),
  ): PackageValue = executor.execute<Unit, PackageValue>(SdkExecutionRequest(packagesGetPackageForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), listOf(PackagesCodecs.PACKAGESGETPACKAGEFORUSER_RESPONSE_CODEC_ID), PackagesCodecs.packagesGetPackageForUserRequestCodecRegistry, PackagesCodecs.packagesGetPackageForUserResponseCodecRegistry, options)

  /**
   * Gets a specific package metadata for a public package owned by a user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetPackageForUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetPackageForUserResponse> = executor.executeWithResponse<Unit, PackagesGetPackageForUserResponse>(SdkExecutionRequest(packagesGetPackageForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), PackagesCodecs.packagesGetPackageForUserRequestCodecRegistry, PackagesGetPackageForUserResponseDecoder, options)

  /**
   * Gets a specific package version for a package owned by the authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetPackageVersionForAuthenticatedUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): PackageVersion = executor.execute<Unit, PackageVersion>(SdkExecutionRequest(packagesGetPackageVersionForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
  }), listOf(PackagesCodecs.PACKAGESGETPACKAGEVERSIONFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID), PackagesCodecs.packagesGetPackageVersionForAuthenticatedUserRequestCodecRegistry, PackagesCodecs.packagesGetPackageVersionForAuthenticatedUserResponseCodecRegistry, options)

  /**
   * Gets a specific package version for a package owned by the authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetPackageVersionForAuthenticatedUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetPackageVersionForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesGetPackageVersionForAuthenticatedUserResponse>(SdkExecutionRequest(packagesGetPackageVersionForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
  }), PackagesCodecs.packagesGetPackageVersionForAuthenticatedUserRequestCodecRegistry, PackagesGetPackageVersionForAuthenticatedUserResponseDecoder, options)

  /**
   * Gets a specific package version in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetPackageVersionForOrganization(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): PackageVersion = executor.execute<Unit, PackageVersion>(SdkExecutionRequest(packagesGetPackageVersionForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
  }), listOf(PackagesCodecs.PACKAGESGETPACKAGEVERSIONFORORGANIZATION_RESPONSE_CODEC_ID), PackagesCodecs.packagesGetPackageVersionForOrganizationRequestCodecRegistry, PackagesCodecs.packagesGetPackageVersionForOrganizationResponseCodecRegistry, options)

  /**
   * Gets a specific package version in an organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetPackageVersionForOrganizationWithResponse(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetPackageVersionForOrganizationResponse> = executor.executeWithResponse<Unit, PackagesGetPackageVersionForOrganizationResponse>(SdkExecutionRequest(packagesGetPackageVersionForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
  }), PackagesCodecs.packagesGetPackageVersionForOrganizationRequestCodecRegistry, PackagesGetPackageVersionForOrganizationResponseDecoder, options)

  /**
   * Gets a specific package version for a public package owned by a specified user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesGetPackageVersionForUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): PackageVersion = executor.execute<Unit, PackageVersion>(SdkExecutionRequest(packagesGetPackageVersionForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), listOf(PackagesCodecs.PACKAGESGETPACKAGEVERSIONFORUSER_RESPONSE_CODEC_ID), PackagesCodecs.packagesGetPackageVersionForUserRequestCodecRegistry, PackagesCodecs.packagesGetPackageVersionForUserResponseCodecRegistry, options)

  /**
   * Gets a specific package version for a public package owned by a specified user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesGetPackageVersionForUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesGetPackageVersionForUserResponse> = executor.executeWithResponse<Unit, PackagesGetPackageVersionForUserResponse>(SdkExecutionRequest(packagesGetPackageVersionForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), PackagesCodecs.packagesGetPackageVersionForUserRequestCodecRegistry, PackagesGetPackageVersionForUserResponseDecoder, options)

  /**
   * Lists all packages that are owned by the authenticated user within the user's namespace, and that encountered a
   * conflict during a Docker migration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesListDockerMigrationConflictingPackagesForAuthenticatedUser(options: CallOptions = CallOptions()): List<PackageValue> = executor.execute<Unit, List<PackageValue>>(SdkExecutionRequest(packagesListDockerMigrationConflictingPackagesForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), emptyList()), listOf(PackagesCodecs.PACKAGESLISTDOCKERMIGRATIONCONFLICTINGPACKAGESFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID), PackagesCodecs.packagesListDockerMigrationConflictingPackagesForAuthenticatedUserRequestCodecRegistry, PackagesCodecs.packagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseCodecRegistry, options)

  /**
   * Lists all packages that are owned by the authenticated user within the user's namespace, and that encountered a
   * conflict during a Docker migration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesListDockerMigrationConflictingPackagesForAuthenticatedUserWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse>(SdkExecutionRequest(packagesListDockerMigrationConflictingPackagesForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), emptyList()), PackagesCodecs.packagesListDockerMigrationConflictingPackagesForAuthenticatedUserRequestCodecRegistry, PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists all packages that are in a specific organization, are readable by the requesting user, and that encountered a
   * conflict during a Docker migration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PackagesListDockerMigrationConflictingPackagesForOrganizationApiException When the service returns a
   * declared non-success response; its `error` property exposes the decoded
   * PackagesListDockerMigrationConflictingPackagesForOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesListDockerMigrationConflictingPackagesForOrganization(org: String, options: CallOptions = CallOptions()): List<PackageValue> = executor.executeWithTypedErrors<Unit, PackagesListDockerMigrationConflictingPackagesForOrganizationResponse, List<PackageValue>>(
    request = SdkExecutionRequest(packagesListDockerMigrationConflictingPackagesForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForOrganizationRequestCodecRegistry,
    responseDecoder = PackagesListDockerMigrationConflictingPackagesForOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.SuccessJson -> response.json
        is PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Http401Json -> PackagesListDockerMigrationConflictingPackagesForOrganizationApiException(response, statusCode, headers)
        is PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Http403Json -> PackagesListDockerMigrationConflictingPackagesForOrganizationApiException(response, statusCode, headers)
        is PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all packages that are in a specific organization, are readable by the requesting user, and that encountered a
   * conflict during a Docker migration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesListDockerMigrationConflictingPackagesForOrganizationWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<PackagesListDockerMigrationConflictingPackagesForOrganizationResponse> = executor.executeWithResponse<Unit, PackagesListDockerMigrationConflictingPackagesForOrganizationResponse>(SdkExecutionRequest(packagesListDockerMigrationConflictingPackagesForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), PackagesCodecs.packagesListDockerMigrationConflictingPackagesForOrganizationRequestCodecRegistry, PackagesListDockerMigrationConflictingPackagesForOrganizationResponseDecoder, options)

  /**
   * Lists all packages that are in a specific user's namespace, that the requesting user has access to, and that
   * encountered a conflict during Docker migration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PackagesListDockerMigrationConflictingPackagesForUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * PackagesListDockerMigrationConflictingPackagesForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesListDockerMigrationConflictingPackagesForUser(username: String, options: CallOptions = CallOptions()): List<PackageValue> = executor.executeWithTypedErrors<Unit, PackagesListDockerMigrationConflictingPackagesForUserResponse, List<PackageValue>>(
    request = SdkExecutionRequest(packagesListDockerMigrationConflictingPackagesForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForUserRequestCodecRegistry,
    responseDecoder = PackagesListDockerMigrationConflictingPackagesForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesListDockerMigrationConflictingPackagesForUserResponse.SuccessJson -> response.json
        is PackagesListDockerMigrationConflictingPackagesForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListDockerMigrationConflictingPackagesForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListDockerMigrationConflictingPackagesForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesListDockerMigrationConflictingPackagesForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PackagesListDockerMigrationConflictingPackagesForUserResponse.Http401Json -> PackagesListDockerMigrationConflictingPackagesForUserApiException(response, statusCode, headers)
        is PackagesListDockerMigrationConflictingPackagesForUserResponse.Http403Json -> PackagesListDockerMigrationConflictingPackagesForUserApiException(response, statusCode, headers)
        is PackagesListDockerMigrationConflictingPackagesForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all packages that are in a specific user's namespace, that the requesting user has access to, and that
   * encountered a conflict during Docker migration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesListDockerMigrationConflictingPackagesForUserWithResponse(username: String, options: CallOptions = CallOptions()): SdkResponseResult<PackagesListDockerMigrationConflictingPackagesForUserResponse> = executor.executeWithResponse<Unit, PackagesListDockerMigrationConflictingPackagesForUserResponse>(SdkExecutionRequest(packagesListDockerMigrationConflictingPackagesForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), PackagesCodecs.packagesListDockerMigrationConflictingPackagesForUserRequestCodecRegistry, PackagesListDockerMigrationConflictingPackagesForUserResponseDecoder, options)

  /**
   * Lists packages owned by the authenticated user within the user's namespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PackagesListPackagesForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded PackagesListPackagesForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesListPackagesForAuthenticatedUser(
    packageType: InlineUserPackagesGetParameterX6bfbea6f,
    page: Int? = null,
    perPage: Int? = null,
    visibility: InlinePackageVisibilityParameterX31044377? = null,
    options: CallOptions = CallOptions(),
  ): List<PackageValue> = executor.executeWithTypedErrors<Unit, PackagesListPackagesForAuthenticatedUserResponse, List<PackageValue>>(
    request = SdkExecutionRequest(packagesListPackagesForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "visibility", values = visibility?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PackagesCodecs.packagesListPackagesForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = PackagesListPackagesForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesListPackagesForAuthenticatedUserResponse.SuccessJson -> response.json
        is PackagesListPackagesForAuthenticatedUserResponse.Http400NoContent -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListPackagesForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesListPackagesForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PackagesListPackagesForAuthenticatedUserResponse.Http400NoContent -> PackagesListPackagesForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesListPackagesForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists packages owned by the authenticated user within the user's namespace.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesListPackagesForAuthenticatedUserWithResponse(
    packageType: InlineUserPackagesGetParameterX6bfbea6f,
    page: Int? = null,
    perPage: Int? = null,
    visibility: InlinePackageVisibilityParameterX31044377? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesListPackagesForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesListPackagesForAuthenticatedUserResponse>(SdkExecutionRequest(packagesListPackagesForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "visibility", values = visibility?.let { listOf(it.toString()) }.orEmpty()))
  }), PackagesCodecs.packagesListPackagesForAuthenticatedUserRequestCodecRegistry, PackagesListPackagesForAuthenticatedUserResponseDecoder, options)

  /**
   * Lists packages in an organization readable by the user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PackagesListPackagesForOrganizationApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded PackagesListPackagesForOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesListPackagesForOrganization(
    org: String,
    packageType: InlineOrgsPackagesGetParameterX8c84fd39,
    page: Int? = null,
    perPage: Int? = null,
    visibility: InlinePackageVisibilityParameterX31044377? = null,
    options: CallOptions = CallOptions(),
  ): List<PackageValue> = executor.executeWithTypedErrors<Unit, PackagesListPackagesForOrganizationResponse, List<PackageValue>>(
    request = SdkExecutionRequest(packagesListPackagesForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "visibility", values = visibility?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PackagesCodecs.packagesListPackagesForOrganizationRequestCodecRegistry,
    responseDecoder = PackagesListPackagesForOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesListPackagesForOrganizationResponse.SuccessJson -> response.json
        is PackagesListPackagesForOrganizationResponse.Http400NoContent -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListPackagesForOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListPackagesForOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListPackagesForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesListPackagesForOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PackagesListPackagesForOrganizationResponse.Http400NoContent -> PackagesListPackagesForOrganizationApiException(response, statusCode, headers)
        is PackagesListPackagesForOrganizationResponse.Http401Json -> PackagesListPackagesForOrganizationApiException(response, statusCode, headers)
        is PackagesListPackagesForOrganizationResponse.Http403Json -> PackagesListPackagesForOrganizationApiException(response, statusCode, headers)
        is PackagesListPackagesForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists packages in an organization readable by the user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesListPackagesForOrganizationWithResponse(
    org: String,
    packageType: InlineOrgsPackagesGetParameterX8c84fd39,
    page: Int? = null,
    perPage: Int? = null,
    visibility: InlinePackageVisibilityParameterX31044377? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesListPackagesForOrganizationResponse> = executor.executeWithResponse<Unit, PackagesListPackagesForOrganizationResponse>(SdkExecutionRequest(packagesListPackagesForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "visibility", values = visibility?.let { listOf(it.toString()) }.orEmpty()))
  }), PackagesCodecs.packagesListPackagesForOrganizationRequestCodecRegistry, PackagesListPackagesForOrganizationResponseDecoder, options)

  /**
   * Lists all packages in a user's namespace for which the requesting user has access.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws PackagesListPackagesForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PackagesListPackagesForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesListPackagesForUser(
    username: String,
    packageType: InlineUsersPackagesGetParameterX62329c45,
    page: Int? = null,
    perPage: Int? = null,
    visibility: InlinePackageVisibilityParameterX31044377? = null,
    options: CallOptions = CallOptions(),
  ): List<PackageValue> = executor.executeWithTypedErrors<Unit, PackagesListPackagesForUserResponse, List<PackageValue>>(
    request = SdkExecutionRequest(packagesListPackagesForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "visibility", values = visibility?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PackagesCodecs.packagesListPackagesForUserRequestCodecRegistry,
    responseDecoder = PackagesListPackagesForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesListPackagesForUserResponse.SuccessJson -> response.json
        is PackagesListPackagesForUserResponse.Http400NoContent -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListPackagesForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListPackagesForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesListPackagesForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesListPackagesForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is PackagesListPackagesForUserResponse.Http400NoContent -> PackagesListPackagesForUserApiException(response, statusCode, headers)
        is PackagesListPackagesForUserResponse.Http401Json -> PackagesListPackagesForUserApiException(response, statusCode, headers)
        is PackagesListPackagesForUserResponse.Http403Json -> PackagesListPackagesForUserApiException(response, statusCode, headers)
        is PackagesListPackagesForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all packages in a user's namespace for which the requesting user has access.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` scope to use this endpoint. For more
   * information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesListPackagesForUserWithResponse(
    username: String,
    packageType: InlineUsersPackagesGetParameterX62329c45,
    page: Int? = null,
    perPage: Int? = null,
    visibility: InlinePackageVisibilityParameterX31044377? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesListPackagesForUserResponse> = executor.executeWithResponse<Unit, PackagesListPackagesForUserResponse>(SdkExecutionRequest(packagesListPackagesForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "visibility", values = visibility?.let { listOf(it.toString()) }.orEmpty()))
  }), PackagesCodecs.packagesListPackagesForUserRequestCodecRegistry, PackagesListPackagesForUserResponseDecoder, options)

  /**
   * Restores a package owned by the authenticated user.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesRestorePackageForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded PackagesRestorePackageForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesRestorePackageForAuthenticatedUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    token: String? = null,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesRestorePackageForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(packagesRestorePackageForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "token", values = token?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PackagesCodecs.packagesRestorePackageForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = PackagesRestorePackageForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesRestorePackageForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is PackagesRestorePackageForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesRestorePackageForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesRestorePackageForAuthenticatedUserResponse.Http401Json -> PackagesRestorePackageForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesRestorePackageForAuthenticatedUserResponse.Http403Json -> PackagesRestorePackageForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesRestorePackageForAuthenticatedUserResponse.Http404Json -> PackagesRestorePackageForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesRestorePackageForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Restores a package owned by the authenticated user.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesRestorePackageForAuthenticatedUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    token: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesRestorePackageForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesRestorePackageForAuthenticatedUserResponse>(SdkExecutionRequest(packagesRestorePackageForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "token", values = token?.let { listOf(it.toString()) }.orEmpty()))
  }), PackagesCodecs.packagesRestorePackageForAuthenticatedUserRequestCodecRegistry, PackagesRestorePackageForAuthenticatedUserResponseDecoder, options)

  /**
   * Restores an entire package in an organization.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint. If the `package_type`
   * belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have
   * admin permissions to the package. For the list of these registries, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesRestorePackageForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PackagesRestorePackageForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesRestorePackageForOrg(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    token: String? = null,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesRestorePackageForOrgResponse, Unit>(
    request = SdkExecutionRequest(packagesRestorePackageForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "token", values = token?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PackagesCodecs.packagesRestorePackageForOrgRequestCodecRegistry,
    responseDecoder = PackagesRestorePackageForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesRestorePackageForOrgResponse.SuccessNoContent -> response.unit
        is PackagesRestorePackageForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesRestorePackageForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesRestorePackageForOrgResponse.Http401Json -> PackagesRestorePackageForOrgApiException(response, statusCode, headers)
        is PackagesRestorePackageForOrgResponse.Http403Json -> PackagesRestorePackageForOrgApiException(response, statusCode, headers)
        is PackagesRestorePackageForOrgResponse.Http404Json -> PackagesRestorePackageForOrgApiException(response, statusCode, headers)
        is PackagesRestorePackageForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Restores an entire package in an organization.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint. If the `package_type`
   * belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have
   * admin permissions to the package. For the list of these registries, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesRestorePackageForOrgWithResponse(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    token: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesRestorePackageForOrgResponse> = executor.executeWithResponse<Unit, PackagesRestorePackageForOrgResponse>(SdkExecutionRequest(packagesRestorePackageForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "token", values = token?.let { listOf(it.toString()) }.orEmpty()))
  }), PackagesCodecs.packagesRestorePackageForOrgRequestCodecRegistry, PackagesRestorePackageForOrgResponseDecoder, options)

  /**
   * Restores an entire package for a user.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, the authenticated
   * user must have admin permissions to the package. For the list of these registries, see "[About permissions for
   * GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesRestorePackageForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded PackagesRestorePackageForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesRestorePackageForUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    username: String,
    token: String? = null,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesRestorePackageForUserResponse, Unit>(
    request = SdkExecutionRequest(packagesRestorePackageForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "token", values = token?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PackagesCodecs.packagesRestorePackageForUserRequestCodecRegistry,
    responseDecoder = PackagesRestorePackageForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesRestorePackageForUserResponse.SuccessNoContent -> response.unit
        is PackagesRestorePackageForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesRestorePackageForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesRestorePackageForUserResponse.Http401Json -> PackagesRestorePackageForUserApiException(response, statusCode, headers)
        is PackagesRestorePackageForUserResponse.Http403Json -> PackagesRestorePackageForUserApiException(response, statusCode, headers)
        is PackagesRestorePackageForUserResponse.Http404Json -> PackagesRestorePackageForUserApiException(response, statusCode, headers)
        is PackagesRestorePackageForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Restores an entire package for a user.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, the authenticated
   * user must have admin permissions to the package. For the list of these registries, see "[About permissions for
   * GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesRestorePackageForUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    username: String,
    token: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesRestorePackageForUserResponse> = executor.executeWithResponse<Unit, PackagesRestorePackageForUserResponse>(SdkExecutionRequest(packagesRestorePackageForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "token", values = token?.let { listOf(it.toString()) }.orEmpty()))
  }), PackagesCodecs.packagesRestorePackageForUserRequestCodecRegistry, PackagesRestorePackageForUserResponseDecoder, options)

  /**
   * Restores a package version owned by the authenticated user.
   *
   * You can restore a deleted package version under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesRestorePackageVersionForAuthenticatedUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * PackagesRestorePackageVersionForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesRestorePackageVersionForAuthenticatedUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesRestorePackageVersionForAuthenticatedUserResponse, Unit>(
    request = SdkExecutionRequest(packagesRestorePackageVersionForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesRestorePackageVersionForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = PackagesRestorePackageVersionForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.SuccessNoContent -> response.unit
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.Http401Json -> PackagesRestorePackageVersionForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.Http403Json -> PackagesRestorePackageVersionForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.Http404Json -> PackagesRestorePackageVersionForAuthenticatedUserApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Restores a package version owned by the authenticated user.
   *
   * You can restore a deleted package version under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesRestorePackageVersionForAuthenticatedUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesRestorePackageVersionForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, PackagesRestorePackageVersionForAuthenticatedUserResponse>(SdkExecutionRequest(packagesRestorePackageVersionForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
  }), PackagesCodecs.packagesRestorePackageVersionForAuthenticatedUserRequestCodecRegistry, PackagesRestorePackageVersionForAuthenticatedUserResponseDecoder, options)

  /**
   * Restores a specific package version in an organization.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint. If the `package_type`
   * belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have
   * admin permissions to the package. For the list of these registries, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesRestorePackageVersionForOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded PackagesRestorePackageVersionForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesRestorePackageVersionForOrg(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesRestorePackageVersionForOrgResponse, Unit>(
    request = SdkExecutionRequest(packagesRestorePackageVersionForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesRestorePackageVersionForOrgRequestCodecRegistry,
    responseDecoder = PackagesRestorePackageVersionForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesRestorePackageVersionForOrgResponse.SuccessNoContent -> response.unit
        is PackagesRestorePackageVersionForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesRestorePackageVersionForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesRestorePackageVersionForOrgResponse.Http401Json -> PackagesRestorePackageVersionForOrgApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForOrgResponse.Http403Json -> PackagesRestorePackageVersionForOrgApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForOrgResponse.Http404Json -> PackagesRestorePackageVersionForOrgApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Restores a specific package version in an organization.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * The authenticated user must have admin permissions in the organization to use this endpoint. If the `package_type`
   * belongs to a GitHub Packages registry that supports granular permissions, the authenticated user must also have
   * admin permissions to the package. For the list of these registries, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesRestorePackageVersionForOrgWithResponse(
    org: String,
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesRestorePackageVersionForOrgResponse> = executor.executeWithResponse<Unit, PackagesRestorePackageVersionForOrgResponse>(SdkExecutionRequest(packagesRestorePackageVersionForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
  }), PackagesCodecs.packagesRestorePackageVersionForOrgRequestCodecRegistry, PackagesRestorePackageVersionForOrgResponseDecoder, options)

  /**
   * Restores a specific package version for a user.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, the authenticated
   * user must have admin permissions to the package. For the list of these registries, see "[About permissions for
   * GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * @param options Execution options.
   * @return No response body.
   * @throws PackagesRestorePackageVersionForUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded PackagesRestorePackageVersionForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun packagesRestorePackageVersionForUser(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, PackagesRestorePackageVersionForUserResponse, Unit>(
    request = SdkExecutionRequest(packagesRestorePackageVersionForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = PackagesCodecs.packagesRestorePackageVersionForUserRequestCodecRegistry,
    responseDecoder = PackagesRestorePackageVersionForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is PackagesRestorePackageVersionForUserResponse.SuccessNoContent -> response.unit
        is PackagesRestorePackageVersionForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is PackagesRestorePackageVersionForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is PackagesRestorePackageVersionForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is PackagesRestorePackageVersionForUserResponse.Http401Json -> PackagesRestorePackageVersionForUserApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForUserResponse.Http403Json -> PackagesRestorePackageVersionForUserApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForUserResponse.Http404Json -> PackagesRestorePackageVersionForUserApiException(response, statusCode, headers)
        is PackagesRestorePackageVersionForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Restores a specific package version for a user.
   *
   * You can restore a deleted package under the following conditions:
   * - The package was deleted within the last 30 days.
   * - The same package namespace and version is still available and not reused for a new package. If the same package
   * namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted
   * package, you must delete the new package that uses the deleted package's namespace first.
   *
   * If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, the authenticated
   * user must have admin permissions to the package. For the list of these registries, see "[About permissions for
   * GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-per
   * missions-for-userorganization-scoped-packages)."
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:packages` and `write:packages` scopes to use
   * this endpoint. For more information, see "[About permissions for GitHub
   * Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-
   * for-repository-scoped-packages)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun packagesRestorePackageVersionForUserWithResponse(
    packageName: String,
    packageType: InlinePackageTypeParameterX5582ba81,
    packageVersionId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PackagesRestorePackageVersionForUserResponse> = executor.executeWithResponse<Unit, PackagesRestorePackageVersionForUserResponse>(SdkExecutionRequest(packagesRestorePackageVersionForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_name", values = listOf(packageName.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_type", values = listOf(packageType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "package_version_id", values = listOf(packageVersionId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), PackagesCodecs.packagesRestorePackageVersionForUserRequestCodecRegistry, PackagesRestorePackageVersionForUserResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `packages/delete-package-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface PackagesDeletePackageForAuthenticatedUserError

  /**
   * Typed response alternatives for `packages/delete-package-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesDeletePackageForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForAuthenticatedUserResponse,
        PackagesDeletePackageForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForAuthenticatedUserResponse,
        PackagesDeletePackageForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForAuthenticatedUserResponse,
        PackagesDeletePackageForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForAuthenticatedUserResponse
  }

  /**
   * Raised by `packages/delete-package-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesDeletePackageForAuthenticatedUserApiException(
    public val error: PackagesDeletePackageForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/delete-package-for-authenticated-user")

  private object PackagesDeletePackageForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesDeletePackageForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesDeletePackageForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesDeletePackageForAuthenticatedUserResponse> = when {
      alternative.id == "packages/delete-package-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForAuthenticatedUserResponse.Http401Json(
          json = PackagesCodecs.packagesDeletePackageForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("packages/delete-package-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForAuthenticatedUserResponse.Http403Json(
          json = PackagesCodecs.packagesDeletePackageForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("packages/delete-package-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForAuthenticatedUserResponse.Http404Json(
          json = PackagesCodecs.packagesDeletePackageForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("packages/delete-package-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesDeletePackageForAuthenticatedUserResponse = PackagesDeletePackageForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/delete-package-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface PackagesDeletePackageForOrgError

  /**
   * Typed response alternatives for `packages/delete-package-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PackagesDeletePackageForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForOrgResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForOrgResponse,
        PackagesDeletePackageForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForOrgResponse,
        PackagesDeletePackageForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForOrgResponse,
        PackagesDeletePackageForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForOrgResponse
  }

  /**
   * Raised by `packages/delete-package-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class PackagesDeletePackageForOrgApiException(
    public val error: PackagesDeletePackageForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/delete-package-for-org")

  private object PackagesDeletePackageForOrgResponseDecoder : SdkResponseAlternativeDecoder<PackagesDeletePackageForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesDeletePackageForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesDeletePackageForOrgResponse> = when {
      alternative.id == "packages/delete-package-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForOrgResponse.Http401Json(
          json = PackagesCodecs.packagesDeletePackageForOrgResponseCodecAlternative1Registry.select(listOf("packages/delete-package-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForOrgResponse.Http403Json(
          json = PackagesCodecs.packagesDeletePackageForOrgResponseCodecAlternative2Registry.select(listOf("packages/delete-package-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForOrgResponse.Http404Json(
          json = PackagesCodecs.packagesDeletePackageForOrgResponseCodecAlternative3Registry.select(listOf("packages/delete-package-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesDeletePackageForOrgResponse = PackagesDeletePackageForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/delete-package-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface PackagesDeletePackageForUserError

  /**
   * Typed response alternatives for `packages/delete-package-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PackagesDeletePackageForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForUserResponse,
        PackagesDeletePackageForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForUserResponse,
        PackagesDeletePackageForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForUserResponse,
        PackagesDeletePackageForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageForUserResponse
  }

  /**
   * Raised by `packages/delete-package-for-user` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class PackagesDeletePackageForUserApiException(
    public val error: PackagesDeletePackageForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/delete-package-for-user")

  private object PackagesDeletePackageForUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesDeletePackageForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesDeletePackageForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesDeletePackageForUserResponse> = when {
      alternative.id == "packages/delete-package-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForUserResponse.Http401Json(
          json = PackagesCodecs.packagesDeletePackageForUserResponseCodecAlternative1Registry.select(listOf("packages/delete-package-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForUserResponse.Http403Json(
          json = PackagesCodecs.packagesDeletePackageForUserResponseCodecAlternative2Registry.select(listOf("packages/delete-package-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageForUserResponse.Http404Json(
          json = PackagesCodecs.packagesDeletePackageForUserResponseCodecAlternative3Registry.select(listOf("packages/delete-package-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesDeletePackageForUserResponse = PackagesDeletePackageForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/delete-package-version-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface PackagesDeletePackageVersionForAuthenticatedUserError

  /**
   * Typed response alternatives for `packages/delete-package-version-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface PackagesDeletePackageVersionForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForAuthenticatedUserResponse,
        PackagesDeletePackageVersionForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForAuthenticatedUserResponse,
        PackagesDeletePackageVersionForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForAuthenticatedUserResponse,
        PackagesDeletePackageVersionForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForAuthenticatedUserResponse
  }

  /**
   * Raised by `packages/delete-package-version-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesDeletePackageVersionForAuthenticatedUserApiException(
    public val error: PackagesDeletePackageVersionForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/delete-package-version-for-authenticated-user")

  private object PackagesDeletePackageVersionForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesDeletePackageVersionForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesDeletePackageVersionForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesDeletePackageVersionForAuthenticatedUserResponse> = when {
      alternative.id == "packages/delete-package-version-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForAuthenticatedUserResponse.Http401Json(
          json = PackagesCodecs.packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("packages/delete-package-version-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForAuthenticatedUserResponse.Http403Json(
          json = PackagesCodecs.packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("packages/delete-package-version-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForAuthenticatedUserResponse.Http404Json(
          json = PackagesCodecs.packagesDeletePackageVersionForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("packages/delete-package-version-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesDeletePackageVersionForAuthenticatedUserResponse = PackagesDeletePackageVersionForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/delete-package-version-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface PackagesDeletePackageVersionForOrgError

  /**
   * Typed response alternatives for `packages/delete-package-version-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesDeletePackageVersionForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForOrgResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForOrgResponse,
        PackagesDeletePackageVersionForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForOrgResponse,
        PackagesDeletePackageVersionForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForOrgResponse,
        PackagesDeletePackageVersionForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForOrgResponse
  }

  /**
   * Raised by `packages/delete-package-version-for-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesDeletePackageVersionForOrgApiException(
    public val error: PackagesDeletePackageVersionForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/delete-package-version-for-org")

  private object PackagesDeletePackageVersionForOrgResponseDecoder : SdkResponseAlternativeDecoder<PackagesDeletePackageVersionForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesDeletePackageVersionForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesDeletePackageVersionForOrgResponse> = when {
      alternative.id == "packages/delete-package-version-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForOrgResponse.Http401Json(
          json = PackagesCodecs.packagesDeletePackageVersionForOrgResponseCodecAlternative1Registry.select(listOf("packages/delete-package-version-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForOrgResponse.Http403Json(
          json = PackagesCodecs.packagesDeletePackageVersionForOrgResponseCodecAlternative2Registry.select(listOf("packages/delete-package-version-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForOrgResponse.Http404Json(
          json = PackagesCodecs.packagesDeletePackageVersionForOrgResponseCodecAlternative3Registry.select(listOf("packages/delete-package-version-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesDeletePackageVersionForOrgResponse = PackagesDeletePackageVersionForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/delete-package-version-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface PackagesDeletePackageVersionForUserError

  /**
   * Typed response alternatives for `packages/delete-package-version-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesDeletePackageVersionForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForUserResponse,
        PackagesDeletePackageVersionForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForUserResponse,
        PackagesDeletePackageVersionForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForUserResponse,
        PackagesDeletePackageVersionForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesDeletePackageVersionForUserResponse
  }

  /**
   * Raised by `packages/delete-package-version-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesDeletePackageVersionForUserApiException(
    public val error: PackagesDeletePackageVersionForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/delete-package-version-for-user")

  private object PackagesDeletePackageVersionForUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesDeletePackageVersionForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesDeletePackageVersionForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesDeletePackageVersionForUserResponse> = when {
      alternative.id == "packages/delete-package-version-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForUserResponse.Http401Json(
          json = PackagesCodecs.packagesDeletePackageVersionForUserResponseCodecAlternative1Registry.select(listOf("packages/delete-package-version-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForUserResponse.Http403Json(
          json = PackagesCodecs.packagesDeletePackageVersionForUserResponseCodecAlternative2Registry.select(listOf("packages/delete-package-version-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/delete-package-version-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesDeletePackageVersionForUserResponse.Http404Json(
          json = PackagesCodecs.packagesDeletePackageVersionForUserResponseCodecAlternative3Registry.select(listOf("packages/delete-package-version-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesDeletePackageVersionForUserResponse = PackagesDeletePackageVersionForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that
   * `packages/get-all-package-versions-for-package-owned-by-authenticated-user` may expose through its typed API
   * exception.
   */
  public sealed interface PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserError

  /**
   * Typed response alternatives for `packages/get-all-package-versions-for-package-owned-by-authenticated-user`.
   * Non-success alternatives are not converted into success values.
   */
  public sealed interface PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<PackageVersion>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse
  }

  /**
   * Raised by `packages/get-all-package-versions-for-package-owned-by-authenticated-user` after decoding a declared
   * non-success response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserApiException(
    public val error: PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/get-all-package-versions-for-package-owned-by-authenticated-user")

  private object PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse> = when {
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.SuccessJson(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http401Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http403Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Http404Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse = PackagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/get-all-package-versions-for-package-owned-by-org` may
   * expose through its typed API exception.
   */
  public sealed interface PackagesGetAllPackageVersionsForPackageOwnedByOrgError

  /**
   * Typed response alternatives for `packages/get-all-package-versions-for-package-owned-by-org`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse {
    public class SuccessJson(
      public val json: List<PackageVersion>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse
  }

  /**
   * Raised by `packages/get-all-package-versions-for-package-owned-by-org` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesGetAllPackageVersionsForPackageOwnedByOrgApiException(
    public val error: PackagesGetAllPackageVersionsForPackageOwnedByOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/get-all-package-versions-for-package-owned-by-org")

  private object PackagesGetAllPackageVersionsForPackageOwnedByOrgResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse> = when {
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-org.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.SuccessJson(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative0Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-org.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http401Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative1Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-org.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http403Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative2Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-org.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Http404Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByOrgResponseCodecAlternative3Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse = PackagesGetAllPackageVersionsForPackageOwnedByOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/get-all-package-versions-for-package-owned-by-user` may
   * expose through its typed API exception.
   */
  public sealed interface PackagesGetAllPackageVersionsForPackageOwnedByUserError

  /**
   * Typed response alternatives for `packages/get-all-package-versions-for-package-owned-by-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PackagesGetAllPackageVersionsForPackageOwnedByUserResponse {
    public class SuccessJson(
      public val json: List<PackageVersion>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByUserResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByUserResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByUserResponse,
        PackagesGetAllPackageVersionsForPackageOwnedByUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetAllPackageVersionsForPackageOwnedByUserResponse
  }

  /**
   * Raised by `packages/get-all-package-versions-for-package-owned-by-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesGetAllPackageVersionsForPackageOwnedByUserApiException(
    public val error: PackagesGetAllPackageVersionsForPackageOwnedByUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/get-all-package-versions-for-package-owned-by-user")

  private object PackagesGetAllPackageVersionsForPackageOwnedByUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetAllPackageVersionsForPackageOwnedByUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetAllPackageVersionsForPackageOwnedByUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetAllPackageVersionsForPackageOwnedByUserResponse> = when {
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.SuccessJson(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative0Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http401Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative1Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http403Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative2Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/get-all-package-versions-for-package-owned-by-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Http404Json(
          json = PackagesCodecs.packagesGetAllPackageVersionsForPackageOwnedByUserResponseCodecAlternative3Registry.select(listOf("packages/get-all-package-versions-for-package-owned-by-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetAllPackageVersionsForPackageOwnedByUserResponse = PackagesGetAllPackageVersionsForPackageOwnedByUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `packages/get-package-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesGetPackageForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: PackageValue,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageForAuthenticatedUserResponse
  }

  private object PackagesGetPackageForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetPackageForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetPackageForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetPackageForAuthenticatedUserResponse> = when {
      alternative.id == "packages/get-package-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetPackageForAuthenticatedUserResponse.SuccessJson(
          json = PackagesCodecs.packagesGetPackageForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("packages/get-package-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetPackageForAuthenticatedUserResponse = PackagesGetPackageForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `packages/get-package-for-organization`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PackagesGetPackageForOrganizationResponse {
    public class SuccessJson(
      public val json: PackageValue,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageForOrganizationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageForOrganizationResponse
  }

  private object PackagesGetPackageForOrganizationResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetPackageForOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetPackageForOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetPackageForOrganizationResponse> = when {
      alternative.id == "packages/get-package-for-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetPackageForOrganizationResponse.SuccessJson(
          json = PackagesCodecs.packagesGetPackageForOrganizationResponseCodecAlternative0Registry.select(listOf("packages/get-package-for-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetPackageForOrganizationResponse = PackagesGetPackageForOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `packages/get-package-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PackagesGetPackageForUserResponse {
    public class SuccessJson(
      public val json: PackageValue,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageForUserResponse
  }

  private object PackagesGetPackageForUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetPackageForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetPackageForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetPackageForUserResponse> = when {
      alternative.id == "packages/get-package-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetPackageForUserResponse.SuccessJson(
          json = PackagesCodecs.packagesGetPackageForUserResponseCodecAlternative0Registry.select(listOf("packages/get-package-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetPackageForUserResponse = PackagesGetPackageForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `packages/get-package-version-for-authenticated-user`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PackagesGetPackageVersionForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: PackageVersion,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageVersionForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageVersionForAuthenticatedUserResponse
  }

  private object PackagesGetPackageVersionForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetPackageVersionForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetPackageVersionForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetPackageVersionForAuthenticatedUserResponse> = when {
      alternative.id == "packages/get-package-version-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetPackageVersionForAuthenticatedUserResponse.SuccessJson(
          json = PackagesCodecs.packagesGetPackageVersionForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("packages/get-package-version-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetPackageVersionForAuthenticatedUserResponse = PackagesGetPackageVersionForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `packages/get-package-version-for-organization`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesGetPackageVersionForOrganizationResponse {
    public class SuccessJson(
      public val json: PackageVersion,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageVersionForOrganizationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageVersionForOrganizationResponse
  }

  private object PackagesGetPackageVersionForOrganizationResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetPackageVersionForOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetPackageVersionForOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetPackageVersionForOrganizationResponse> = when {
      alternative.id == "packages/get-package-version-for-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetPackageVersionForOrganizationResponse.SuccessJson(
          json = PackagesCodecs.packagesGetPackageVersionForOrganizationResponseCodecAlternative0Registry.select(listOf("packages/get-package-version-for-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetPackageVersionForOrganizationResponse = PackagesGetPackageVersionForOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `packages/get-package-version-for-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PackagesGetPackageVersionForUserResponse {
    public class SuccessJson(
      public val json: PackageVersion,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageVersionForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesGetPackageVersionForUserResponse
  }

  private object PackagesGetPackageVersionForUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesGetPackageVersionForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesGetPackageVersionForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesGetPackageVersionForUserResponse> = when {
      alternative.id == "packages/get-package-version-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesGetPackageVersionForUserResponse.SuccessJson(
          json = PackagesCodecs.packagesGetPackageVersionForUserResponseCodecAlternative0Registry.select(listOf("packages/get-package-version-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesGetPackageVersionForUserResponse = PackagesGetPackageVersionForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `packages/list-docker-migration-conflicting-packages-for-authenticated-user`.
   * Non-success alternatives are not converted into success values.
   */
  public sealed interface PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<PackageValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse
  }

  private object PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse> = when {
      alternative.id == "packages/list-docker-migration-conflicting-packages-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse.SuccessJson(
          json = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("packages/list-docker-migration-conflicting-packages-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse = PackagesListDockerMigrationConflictingPackagesForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that
   * `packages/list-docker-migration-conflicting-packages-for-organization` may expose through its typed API exception.
   */
  public sealed interface PackagesListDockerMigrationConflictingPackagesForOrganizationError

  /**
   * Typed response alternatives for `packages/list-docker-migration-conflicting-packages-for-organization`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PackagesListDockerMigrationConflictingPackagesForOrganizationResponse {
    public class SuccessJson(
      public val json: List<PackageValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForOrganizationResponse,
        PackagesListDockerMigrationConflictingPackagesForOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForOrganizationResponse,
        PackagesListDockerMigrationConflictingPackagesForOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForOrganizationResponse
  }

  /**
   * Raised by `packages/list-docker-migration-conflicting-packages-for-organization` after decoding a declared
   * non-success response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesListDockerMigrationConflictingPackagesForOrganizationApiException(
    public val error: PackagesListDockerMigrationConflictingPackagesForOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/list-docker-migration-conflicting-packages-for-organization")

  private object PackagesListDockerMigrationConflictingPackagesForOrganizationResponseDecoder : SdkResponseAlternativeDecoder<PackagesListDockerMigrationConflictingPackagesForOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesListDockerMigrationConflictingPackagesForOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesListDockerMigrationConflictingPackagesForOrganizationResponse> = when {
      alternative.id == "packages/list-docker-migration-conflicting-packages-for-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.SuccessJson(
          json = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative0Registry.select(listOf("packages/list-docker-migration-conflicting-packages-for-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-docker-migration-conflicting-packages-for-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Http401Json(
          json = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative1Registry.select(listOf("packages/list-docker-migration-conflicting-packages-for-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-docker-migration-conflicting-packages-for-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Http403Json(
          json = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForOrganizationResponseCodecAlternative2Registry.select(listOf("packages/list-docker-migration-conflicting-packages-for-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesListDockerMigrationConflictingPackagesForOrganizationResponse = PackagesListDockerMigrationConflictingPackagesForOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/list-docker-migration-conflicting-packages-for-user` may
   * expose through its typed API exception.
   */
  public sealed interface PackagesListDockerMigrationConflictingPackagesForUserError

  /**
   * Typed response alternatives for `packages/list-docker-migration-conflicting-packages-for-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PackagesListDockerMigrationConflictingPackagesForUserResponse {
    public class SuccessJson(
      public val json: List<PackageValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForUserResponse,
        PackagesListDockerMigrationConflictingPackagesForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForUserResponse,
        PackagesListDockerMigrationConflictingPackagesForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListDockerMigrationConflictingPackagesForUserResponse
  }

  /**
   * Raised by `packages/list-docker-migration-conflicting-packages-for-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesListDockerMigrationConflictingPackagesForUserApiException(
    public val error: PackagesListDockerMigrationConflictingPackagesForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/list-docker-migration-conflicting-packages-for-user")

  private object PackagesListDockerMigrationConflictingPackagesForUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesListDockerMigrationConflictingPackagesForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesListDockerMigrationConflictingPackagesForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesListDockerMigrationConflictingPackagesForUserResponse> = when {
      alternative.id == "packages/list-docker-migration-conflicting-packages-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesListDockerMigrationConflictingPackagesForUserResponse.SuccessJson(
          json = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative0Registry.select(listOf("packages/list-docker-migration-conflicting-packages-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-docker-migration-conflicting-packages-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesListDockerMigrationConflictingPackagesForUserResponse.Http401Json(
          json = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative1Registry.select(listOf("packages/list-docker-migration-conflicting-packages-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-docker-migration-conflicting-packages-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesListDockerMigrationConflictingPackagesForUserResponse.Http403Json(
          json = PackagesCodecs.packagesListDockerMigrationConflictingPackagesForUserResponseCodecAlternative2Registry.select(listOf("packages/list-docker-migration-conflicting-packages-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesListDockerMigrationConflictingPackagesForUserResponse = PackagesListDockerMigrationConflictingPackagesForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/list-packages-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface PackagesListPackagesForAuthenticatedUserError

  /**
   * Typed response alternatives for `packages/list-packages-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesListPackagesForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<PackageValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForAuthenticatedUserResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForAuthenticatedUserResponse,
        PackagesListPackagesForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForAuthenticatedUserResponse
  }

  /**
   * Raised by `packages/list-packages-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesListPackagesForAuthenticatedUserApiException(
    public val error: PackagesListPackagesForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/list-packages-for-authenticated-user")

  private object PackagesListPackagesForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesListPackagesForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesListPackagesForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesListPackagesForAuthenticatedUserResponse> = when {
      alternative.id == "packages/list-packages-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForAuthenticatedUserResponse.SuccessJson(
          json = PackagesCodecs.packagesListPackagesForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("packages/list-packages-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-packages-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForAuthenticatedUserResponse.Http400NoContent(
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
    ): PackagesListPackagesForAuthenticatedUserResponse = PackagesListPackagesForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/list-packages-for-organization` may expose through its
   * typed API exception.
   */
  public sealed interface PackagesListPackagesForOrganizationError

  /**
   * Typed response alternatives for `packages/list-packages-for-organization`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesListPackagesForOrganizationResponse {
    public class SuccessJson(
      public val json: List<PackageValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForOrganizationResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForOrganizationResponse,
        PackagesListPackagesForOrganizationError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForOrganizationResponse,
        PackagesListPackagesForOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForOrganizationResponse,
        PackagesListPackagesForOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForOrganizationResponse
  }

  /**
   * Raised by `packages/list-packages-for-organization` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesListPackagesForOrganizationApiException(
    public val error: PackagesListPackagesForOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/list-packages-for-organization")

  private object PackagesListPackagesForOrganizationResponseDecoder : SdkResponseAlternativeDecoder<PackagesListPackagesForOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesListPackagesForOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesListPackagesForOrganizationResponse> = when {
      alternative.id == "packages/list-packages-for-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForOrganizationResponse.SuccessJson(
          json = PackagesCodecs.packagesListPackagesForOrganizationResponseCodecAlternative0Registry.select(listOf("packages/list-packages-for-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-packages-for-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForOrganizationResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-packages-for-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForOrganizationResponse.Http401Json(
          json = PackagesCodecs.packagesListPackagesForOrganizationResponseCodecAlternative2Registry.select(listOf("packages/list-packages-for-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-packages-for-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForOrganizationResponse.Http403Json(
          json = PackagesCodecs.packagesListPackagesForOrganizationResponseCodecAlternative3Registry.select(listOf("packages/list-packages-for-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesListPackagesForOrganizationResponse = PackagesListPackagesForOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/list-packages-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface PackagesListPackagesForUserError

  /**
   * Typed response alternatives for `packages/list-packages-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PackagesListPackagesForUserResponse {
    public class SuccessJson(
      public val json: List<PackageValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForUserResponse

    public class Http400NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForUserResponse,
        PackagesListPackagesForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForUserResponse,
        PackagesListPackagesForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForUserResponse,
        PackagesListPackagesForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesListPackagesForUserResponse
  }

  /**
   * Raised by `packages/list-packages-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class PackagesListPackagesForUserApiException(
    public val error: PackagesListPackagesForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/list-packages-for-user")

  private object PackagesListPackagesForUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesListPackagesForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesListPackagesForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesListPackagesForUserResponse> = when {
      alternative.id == "packages/list-packages-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForUserResponse.SuccessJson(
          json = PackagesCodecs.packagesListPackagesForUserResponseCodecAlternative0Registry.select(listOf("packages/list-packages-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-packages-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForUserResponse.Http400NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-packages-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForUserResponse.Http401Json(
          json = PackagesCodecs.packagesListPackagesForUserResponseCodecAlternative2Registry.select(listOf("packages/list-packages-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/list-packages-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesListPackagesForUserResponse.Http403Json(
          json = PackagesCodecs.packagesListPackagesForUserResponseCodecAlternative3Registry.select(listOf("packages/list-packages-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesListPackagesForUserResponse = PackagesListPackagesForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/restore-package-for-authenticated-user` may expose through
   * its typed API exception.
   */
  public sealed interface PackagesRestorePackageForAuthenticatedUserError

  /**
   * Typed response alternatives for `packages/restore-package-for-authenticated-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesRestorePackageForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForAuthenticatedUserResponse,
        PackagesRestorePackageForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForAuthenticatedUserResponse,
        PackagesRestorePackageForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForAuthenticatedUserResponse,
        PackagesRestorePackageForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForAuthenticatedUserResponse
  }

  /**
   * Raised by `packages/restore-package-for-authenticated-user` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesRestorePackageForAuthenticatedUserApiException(
    public val error: PackagesRestorePackageForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/restore-package-for-authenticated-user")

  private object PackagesRestorePackageForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesRestorePackageForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesRestorePackageForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesRestorePackageForAuthenticatedUserResponse> = when {
      alternative.id == "packages/restore-package-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForAuthenticatedUserResponse.Http401Json(
          json = PackagesCodecs.packagesRestorePackageForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("packages/restore-package-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForAuthenticatedUserResponse.Http403Json(
          json = PackagesCodecs.packagesRestorePackageForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("packages/restore-package-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForAuthenticatedUserResponse.Http404Json(
          json = PackagesCodecs.packagesRestorePackageForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("packages/restore-package-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesRestorePackageForAuthenticatedUserResponse = PackagesRestorePackageForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/restore-package-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface PackagesRestorePackageForOrgError

  /**
   * Typed response alternatives for `packages/restore-package-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PackagesRestorePackageForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForOrgResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForOrgResponse,
        PackagesRestorePackageForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForOrgResponse,
        PackagesRestorePackageForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForOrgResponse,
        PackagesRestorePackageForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForOrgResponse
  }

  /**
   * Raised by `packages/restore-package-for-org` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class PackagesRestorePackageForOrgApiException(
    public val error: PackagesRestorePackageForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/restore-package-for-org")

  private object PackagesRestorePackageForOrgResponseDecoder : SdkResponseAlternativeDecoder<PackagesRestorePackageForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesRestorePackageForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesRestorePackageForOrgResponse> = when {
      alternative.id == "packages/restore-package-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForOrgResponse.Http401Json(
          json = PackagesCodecs.packagesRestorePackageForOrgResponseCodecAlternative1Registry.select(listOf("packages/restore-package-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForOrgResponse.Http403Json(
          json = PackagesCodecs.packagesRestorePackageForOrgResponseCodecAlternative2Registry.select(listOf("packages/restore-package-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForOrgResponse.Http404Json(
          json = PackagesCodecs.packagesRestorePackageForOrgResponseCodecAlternative3Registry.select(listOf("packages/restore-package-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesRestorePackageForOrgResponse = PackagesRestorePackageForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/restore-package-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface PackagesRestorePackageForUserError

  /**
   * Typed response alternatives for `packages/restore-package-for-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PackagesRestorePackageForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForUserResponse,
        PackagesRestorePackageForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForUserResponse,
        PackagesRestorePackageForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForUserResponse,
        PackagesRestorePackageForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageForUserResponse
  }

  /**
   * Raised by `packages/restore-package-for-user` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class PackagesRestorePackageForUserApiException(
    public val error: PackagesRestorePackageForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/restore-package-for-user")

  private object PackagesRestorePackageForUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesRestorePackageForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesRestorePackageForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesRestorePackageForUserResponse> = when {
      alternative.id == "packages/restore-package-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForUserResponse.Http401Json(
          json = PackagesCodecs.packagesRestorePackageForUserResponseCodecAlternative1Registry.select(listOf("packages/restore-package-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForUserResponse.Http403Json(
          json = PackagesCodecs.packagesRestorePackageForUserResponseCodecAlternative2Registry.select(listOf("packages/restore-package-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageForUserResponse.Http404Json(
          json = PackagesCodecs.packagesRestorePackageForUserResponseCodecAlternative3Registry.select(listOf("packages/restore-package-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesRestorePackageForUserResponse = PackagesRestorePackageForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/restore-package-version-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface PackagesRestorePackageVersionForAuthenticatedUserError

  /**
   * Typed response alternatives for `packages/restore-package-version-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface PackagesRestorePackageVersionForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForAuthenticatedUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForAuthenticatedUserResponse,
        PackagesRestorePackageVersionForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForAuthenticatedUserResponse,
        PackagesRestorePackageVersionForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForAuthenticatedUserResponse,
        PackagesRestorePackageVersionForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForAuthenticatedUserResponse
  }

  /**
   * Raised by `packages/restore-package-version-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesRestorePackageVersionForAuthenticatedUserApiException(
    public val error: PackagesRestorePackageVersionForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/restore-package-version-for-authenticated-user")

  private object PackagesRestorePackageVersionForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesRestorePackageVersionForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesRestorePackageVersionForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesRestorePackageVersionForAuthenticatedUserResponse> = when {
      alternative.id == "packages/restore-package-version-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForAuthenticatedUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForAuthenticatedUserResponse.Http401Json(
          json = PackagesCodecs.packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("packages/restore-package-version-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForAuthenticatedUserResponse.Http403Json(
          json = PackagesCodecs.packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("packages/restore-package-version-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForAuthenticatedUserResponse.Http404Json(
          json = PackagesCodecs.packagesRestorePackageVersionForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("packages/restore-package-version-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesRestorePackageVersionForAuthenticatedUserResponse = PackagesRestorePackageVersionForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/restore-package-version-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface PackagesRestorePackageVersionForOrgError

  /**
   * Typed response alternatives for `packages/restore-package-version-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesRestorePackageVersionForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForOrgResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForOrgResponse,
        PackagesRestorePackageVersionForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForOrgResponse,
        PackagesRestorePackageVersionForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForOrgResponse,
        PackagesRestorePackageVersionForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForOrgResponse
  }

  /**
   * Raised by `packages/restore-package-version-for-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesRestorePackageVersionForOrgApiException(
    public val error: PackagesRestorePackageVersionForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/restore-package-version-for-org")

  private object PackagesRestorePackageVersionForOrgResponseDecoder : SdkResponseAlternativeDecoder<PackagesRestorePackageVersionForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesRestorePackageVersionForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesRestorePackageVersionForOrgResponse> = when {
      alternative.id == "packages/restore-package-version-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForOrgResponse.Http401Json(
          json = PackagesCodecs.packagesRestorePackageVersionForOrgResponseCodecAlternative1Registry.select(listOf("packages/restore-package-version-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForOrgResponse.Http403Json(
          json = PackagesCodecs.packagesRestorePackageVersionForOrgResponseCodecAlternative2Registry.select(listOf("packages/restore-package-version-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForOrgResponse.Http404Json(
          json = PackagesCodecs.packagesRestorePackageVersionForOrgResponseCodecAlternative3Registry.select(listOf("packages/restore-package-version-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesRestorePackageVersionForOrgResponse = PackagesRestorePackageVersionForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `packages/restore-package-version-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface PackagesRestorePackageVersionForUserError

  /**
   * Typed response alternatives for `packages/restore-package-version-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PackagesRestorePackageVersionForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForUserResponse,
        PackagesRestorePackageVersionForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForUserResponse,
        PackagesRestorePackageVersionForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForUserResponse,
        PackagesRestorePackageVersionForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PackagesRestorePackageVersionForUserResponse
  }

  /**
   * Raised by `packages/restore-package-version-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class PackagesRestorePackageVersionForUserApiException(
    public val error: PackagesRestorePackageVersionForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "packages/restore-package-version-for-user")

  private object PackagesRestorePackageVersionForUserResponseDecoder : SdkResponseAlternativeDecoder<PackagesRestorePackageVersionForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PackagesRestorePackageVersionForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PackagesRestorePackageVersionForUserResponse> = when {
      alternative.id == "packages/restore-package-version-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForUserResponse.Http401Json(
          json = PackagesCodecs.packagesRestorePackageVersionForUserResponseCodecAlternative1Registry.select(listOf("packages/restore-package-version-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForUserResponse.Http403Json(
          json = PackagesCodecs.packagesRestorePackageVersionForUserResponseCodecAlternative2Registry.select(listOf("packages/restore-package-version-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "packages/restore-package-version-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = PackagesRestorePackageVersionForUserResponse.Http404Json(
          json = PackagesCodecs.packagesRestorePackageVersionForUserResponseCodecAlternative3Registry.select(listOf("packages/restore-package-version-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PackagesRestorePackageVersionForUserResponse = PackagesRestorePackageVersionForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val packagesDeletePackageForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/delete-package-for-authenticated-user",
          method = "DELETE",
          path = "/user/packages/{package_type}/{package_name}",
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
              id = "packages/delete-package-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-authenticated-user.response.alternative3",
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

    public val packagesDeletePackageForOrgMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/delete-package-for-org",
          method = "DELETE",
          path = "/orgs/{org}/packages/{package_type}/{package_name}",
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
              id = "packages/delete-package-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-org.response.alternative3",
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

    public val packagesDeletePackageForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/delete-package-for-user",
          method = "DELETE",
          path = "/users/{username}/packages/{package_type}/{package_name}",
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
              id = "packages/delete-package-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-for-user.response.alternative3",
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

    public val packagesDeletePackageVersionForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/delete-package-version-for-authenticated-user",
          method = "DELETE",
          path = "/user/packages/{package_type}/{package_name}/versions/{package_version_id}",
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
              id = "packages/delete-package-version-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-authenticated-user.response.alternative3",
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

    public val packagesDeletePackageVersionForOrgMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/delete-package-version-for-org",
          method = "DELETE",
          path = "/orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}",
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
              id = "packages/delete-package-version-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-org.response.alternative3",
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

    public val packagesDeletePackageVersionForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/delete-package-version-for-user",
          method = "DELETE",
          path = "/users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}",
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
              id = "packages/delete-package-version-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/delete-package-version-for-user.response.alternative3",
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

    public val packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserMetadata:
        OperationMetadata = OperationMetadata(
          operationId = "packages/get-all-package-versions-for-package-owned-by-authenticated-user",
          method = "GET",
          path = "/user/packages/{package_type}/{package_name}/versions",
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
              id = "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-authenticated-user.response.alternative3",
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

    public val packagesGetAllPackageVersionsForPackageOwnedByOrgMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/get-all-package-versions-for-package-owned-by-org",
          method = "GET",
          path = "/orgs/{org}/packages/{package_type}/{package_name}/versions",
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
              id = "packages/get-all-package-versions-for-package-owned-by-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-org.response.alternative3",
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

    public val packagesGetAllPackageVersionsForPackageOwnedByUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/get-all-package-versions-for-package-owned-by-user",
          method = "GET",
          path = "/users/{username}/packages/{package_type}/{package_name}/versions",
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
              id = "packages/get-all-package-versions-for-package-owned-by-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-all-package-versions-for-package-owned-by-user.response.alternative3",
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

    public val packagesGetPackageForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/get-package-for-authenticated-user",
          method = "GET",
          path = "/user/packages/{package_type}/{package_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PackageValue",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-package-for-authenticated-user.response.alternative0",
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

    public val packagesGetPackageForOrganizationMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/get-package-for-organization",
          method = "GET",
          path = "/orgs/{org}/packages/{package_type}/{package_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PackageValue",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-package-for-organization.response.alternative0",
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

    public val packagesGetPackageForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/get-package-for-user",
          method = "GET",
          path = "/users/{username}/packages/{package_type}/{package_name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PackageValue",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-package-for-user.response.alternative0",
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

    public val packagesGetPackageVersionForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/get-package-version-for-authenticated-user",
          method = "GET",
          path = "/user/packages/{package_type}/{package_name}/versions/{package_version_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PackageVersion",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-package-version-for-authenticated-user.response.alternative0",
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

    public val packagesGetPackageVersionForOrganizationMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/get-package-version-for-organization",
          method = "GET",
          path = "/orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PackageVersion",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-package-version-for-organization.response.alternative0",
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

    public val packagesGetPackageVersionForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/get-package-version-for-user",
          method = "GET",
          path = "/users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PackageVersion",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/get-package-version-for-user.response.alternative0",
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

    public val packagesListDockerMigrationConflictingPackagesForAuthenticatedUserMetadata:
        OperationMetadata = OperationMetadata(
          operationId = "packages/list-docker-migration-conflicting-packages-for-authenticated-user",
          method = "GET",
          path = "/user/docker/conflicts",
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
              id = "packages/list-docker-migration-conflicting-packages-for-authenticated-user.response.alternative0",
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

    public val packagesListDockerMigrationConflictingPackagesForOrganizationMetadata:
        OperationMetadata = OperationMetadata(
          operationId = "packages/list-docker-migration-conflicting-packages-for-organization",
          method = "GET",
          path = "/orgs/{org}/docker/conflicts",
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
              id = "packages/list-docker-migration-conflicting-packages-for-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-docker-migration-conflicting-packages-for-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-docker-migration-conflicting-packages-for-organization.response.alternative2",
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

    public val packagesListDockerMigrationConflictingPackagesForUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/list-docker-migration-conflicting-packages-for-user",
          method = "GET",
          path = "/users/{username}/docker/conflicts",
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
              id = "packages/list-docker-migration-conflicting-packages-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-docker-migration-conflicting-packages-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-docker-migration-conflicting-packages-for-user.response.alternative2",
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

    public val packagesListPackagesForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/list-packages-for-authenticated-user",
          method = "GET",
          path = "/user/packages",
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
              id = "packages/list-packages-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-packages-for-authenticated-user.response.alternative1",
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

    public val packagesListPackagesForOrganizationMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/list-packages-for-organization",
          method = "GET",
          path = "/orgs/{org}/packages",
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
              id = "packages/list-packages-for-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-packages-for-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-packages-for-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-packages-for-organization.response.alternative3",
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

    public val packagesListPackagesForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/list-packages-for-user",
          method = "GET",
          path = "/users/{username}/packages",
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
              id = "packages/list-packages-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-packages-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-packages-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/list-packages-for-user.response.alternative3",
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

    public val packagesRestorePackageForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/restore-package-for-authenticated-user",
          method = "POST",
          path = "/user/packages/{package_type}/{package_name}/restore",
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
              id = "packages/restore-package-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-authenticated-user.response.alternative3",
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

    public val packagesRestorePackageForOrgMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/restore-package-for-org",
          method = "POST",
          path = "/orgs/{org}/packages/{package_type}/{package_name}/restore",
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
              id = "packages/restore-package-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-org.response.alternative3",
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

    public val packagesRestorePackageForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/restore-package-for-user",
          method = "POST",
          path = "/users/{username}/packages/{package_type}/{package_name}/restore",
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
              id = "packages/restore-package-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-for-user.response.alternative3",
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

    public val packagesRestorePackageVersionForAuthenticatedUserMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "packages/restore-package-version-for-authenticated-user",
          method = "POST",
          path = "/user/packages/{package_type}/{package_name}/versions/{package_version_id}/restore",
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
              id = "packages/restore-package-version-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-authenticated-user.response.alternative3",
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

    public val packagesRestorePackageVersionForOrgMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/restore-package-version-for-org",
          method = "POST",
          path = "/orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore",
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
              id = "packages/restore-package-version-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-org.response.alternative3",
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

    public val packagesRestorePackageVersionForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "packages/restore-package-version-for-user",
          method = "POST",
          path = "/users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore",
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
              id = "packages/restore-package-version-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "packages/restore-package-version-for-user.response.alternative3",
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
